package com.construction.constructionfirm.controller;

import com.construction.constructionfirm.entity.*;
import com.construction.constructionfirm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private DrzaveService drzaveService;

    @Autowired
    private HQService hqService;

    @Autowired
    private JobZahtjeviService jobZahtjeviService;

    @Autowired
    private KlijentService klijentService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UslugeService uslugeService;

    @Autowired
    private ZahtjevService zahtjevService;

    @Autowired
    private ZaposlenService zaposlenService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/register")
    public String getRegister(Model model) {
        KlijentEntity klijent = new KlijentEntity();
        model.addAttribute("noviUser", klijent);
        return "register";
    }

    @GetMapping("/termin1")
    public String getTerminSite() {
        return "termin1";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("noviUser")KlijentEntity klijent) {
        String plainPass = klijent.getPassword();
        String hashPass = bCryptPasswordEncoder.encode(plainPass);
        klijent.setPassword(hashPass);
        klijent.setRole("USER");
        klijentService.saveKlijent(klijent);
        return "index";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "admin";
    }

    @GetMapping("/viewDrzave")
    public String getDrzave(Model model) {
        List<DrzaveEntity> drzaveList = drzaveService.getAllDrzave();
        model.addAttribute("listaDrzava", drzaveList);
        return "showDrzave";
    }

    @GetMapping("/addDrzava")
    public String addDrzave(Model model) {
        DrzaveEntity drzava = new DrzaveEntity();
        model.addAttribute("novaDrzava", drzava);
        return "addDrzava";
    }

    @PostMapping("/saveDrzava")
    public String saveDrzava(@ModelAttribute("novaDrzava")DrzaveEntity drzava) {
        drzaveService.saveDrzave(drzava);
        return "redirect:/";
    }

    @GetMapping("/viewHQ")
    public String getHQ(Model model) {
        List<HQEntity> hqList = hqService.getAllHQ();
        model.addAttribute("listaHQ", hqList);
        return "showHeadquarters";
    }

    @GetMapping("/addHQ")
    public String addHQ(Model model) {
        HQEntity hq = new HQEntity();
        model.addAttribute("noviHQ", hq);
        return "addHQ";
    }

    @PostMapping("/saveHQ")
    public String saveHQ(@ModelAttribute("noviHQ")HQEntity hq) {
        hqService.saveHQ(hq);
        return "redirect:/";
    }

    @GetMapping("/viewKlijenti")
    public String getKlijenti(Model model) {
        List<KlijentEntity> klijentList = klijentService.getAllKlijenti();
        model.addAttribute("listaKlijenata", klijentList);
        return "showKlijenti";
    }

    @GetMapping("/viewRole")
    public String getRoles(Model model) {
        List<RoleEntity> roleList = roleService.getAllRoles();
        model.addAttribute("listaRole", roleList);
        return "showRoles";
    }

    @GetMapping("/addRole")
    public String addRole(Model model) {
        RoleEntity zanimanje = new RoleEntity();
        model.addAttribute("novoZanimanje", zanimanje);
        return "addRole";
    }

    @PostMapping("/saveRole")
    public String saveRole(@ModelAttribute("novoZanimanje")RoleEntity zanimanje) {
        roleService.saveRoles(zanimanje);
        return "redirect:/";
    }

    @GetMapping("/viewUsluge")
    public String getUsluge(Model model) {
        List<UslugeEntity> uslugeList = uslugeService.getAllUsluge();
        model.addAttribute("listaUsluga", uslugeList);
        return "showUsluge";
    }

    @GetMapping("/viewZaposleni")
    public String getZaposleni(Model model) {
        List<ZaposlenEntity> zaposlenList = zaposlenService.getAllZaposleni();
        model.addAttribute("listaZaposlenih", zaposlenList);
        return "showZaposleni";
    }

    @GetMapping("/addZaposleni")
    public String addZaposleni(Model model) {
        ZaposlenEntity zaposleni = new ZaposlenEntity();
        model.addAttribute("noviZaposleni", zaposleni);
        return "addZaposleni";
    }

    @PostMapping("/saveZaposleni")
    public String saveZaposleni(@ModelAttribute("noviZaposleni")ZaposlenEntity zaposleni) {
        zaposlenService.saveZaposlen(zaposleni);
        return "redirect:/";
    }

    @GetMapping("/addZahtjev")
    public String addJobZahtjev(Model model) {
        JobZahtjeviEntity job = new JobZahtjeviEntity();
        model.addAttribute("noviJobZahtjev", job);
        return "jobapplication";
    }

    @PostMapping("/saveJobZahtjev")
    public String saveJobZahtjev(@ModelAttribute("noviJobZahtjev")JobZahtjeviEntity job) {
        jobZahtjeviService.saveJobZahtjev(job);
        return "index";
    }

    @GetMapping("/viewJobApplications")
    public String getJobApp(Model model) {
        List<JobZahtjeviEntity> jobs = jobZahtjeviService.getAllJobZahtjevi();
        model.addAttribute("listaJobZahtjeva", jobs);
        return "showJobZahtjevi";
    }

    @GetMapping("/viewZahtjevi")
    public String getZahtjevi(Model model) {
        List<ZahtjevEntity> zahtjevi = zahtjevService.getAllZahtjev();
        model.addAttribute("listaZahtjeva", zahtjevi);
        return "showZahtjevi";
    }

    @GetMapping("/zahtjeviForm")
    public String getZahtjeviForm(Model model) {
        ZahtjevEntity novizahtjev = new ZahtjevEntity();
        model.addAttribute("listaZahtjevFormi", novizahtjev);
        return "zahtjevform";
    }

    @PostMapping("/saveZahtjevForm")
    public String saveZahtjevForm(@ModelAttribute("listaZahtjevFormi")ZahtjevEntity zahtjev) {
        zahtjevService.saveZahtjev(zahtjev);
        return "index";
    }
}