package lt.teambit.jira.plugins.tbc.controller;

import com.atlassian.connect.spring.AtlassianHostUser;
import com.atlassian.connect.spring.IgnoreJwt;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    private static final String VIEW_NAME = "main-page";

    @GetMapping(value = "/tempo-bulk-change")
    @IgnoreJwt
    public String getMainPage(@AuthenticationPrincipal AtlassianHostUser hostUser, Model model) {
        //model.addAttribute("currentUser", hostUser.getUserAccountId());
        model.addAttribute("currentUser", "123");
        model.addAttribute("timestamp", System.currentTimeMillis());
        return VIEW_NAME;
    }
}
