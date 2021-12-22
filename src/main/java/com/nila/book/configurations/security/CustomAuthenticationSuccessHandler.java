package com.nila.book.configurations.security;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler
{
    private String redirectLink;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException
    {

        Collection<? extends GrantedAuthority> authorityCollection = authentication.getAuthorities();
        authorityCollection.forEach(authority -> {
            String role = authority.getAuthority();
            System.out.println("Role:::" + role);

            if (role.equals("ROLE_USER"))
            {
                this.setRedirectLink(redirectLink = "/user/home");
            }
            else if (role.equals("ROLE_ADMIN"))
            {
                this.setRedirectLink("/admin/");
            }
            else
            {
                this.setRedirectLink("/test");
            }
        });

        response.sendRedirect(this.getRedirectLink());

    }

    public String getRedirectLink()
    {
        return redirectLink;
    }

    public void setRedirectLink(String redirectLink)
    {
        this.redirectLink = redirectLink;
    }

}
