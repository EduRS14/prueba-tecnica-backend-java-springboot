package com.proyecto.civa.config;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        // En esta sección se debe implementar la lógica para cargar el usuario desde la base de datos
        /*
            Para el caso presente, al no contar con un sistema de login, se deja solamente
            la estructura de la función para una implementación futura.
         */

        System.out.println("Intentando cargar usuario con email: " + email);

        return null;

    }

}
