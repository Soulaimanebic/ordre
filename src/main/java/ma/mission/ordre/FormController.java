package ma.mission.ordre;

import lombok.Data;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@Data
public class FormController {
    @GetMapping ("/register")
    public String showForm(Model model) {
        Form form = new Form();
        model.addAttribute("form", form);

        List<String> fonctionList = Arrays.asList("--Fonction--","Manoeuvre","Maçon","Menuisier","Aide Menuisier","Carreleur","Autre");
        model.addAttribute("fonctionList", fonctionList);

        List<String> typeList = Arrays.asList("--Type--","Bus","Tram","Train","Taxi","VTC","Autre");
        model.addAttribute("typeList", typeList);

        List<String> boolList = Arrays.asList("--oui / non--","Oui","Non");
        model.addAttribute("boolList", boolList);

        return "remplir_formulaire";

    }
    @PostMapping("/register")
    public String sumitForm(@ModelAttribute("form") Form form){
        System.out.println(form);
        return "success_formulaire";
    }

}
