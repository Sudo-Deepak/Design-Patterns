package com.deepak.behavioral.chain_or_responsibility;

import com.deepak.behavioral.chain_or_responsibility.middleware.Middleware;
import com.deepak.behavioral.chain_or_responsibility.middleware.RoleCheckMiddleware;
import com.deepak.behavioral.chain_or_responsibility.middleware.ThrottlingMiddleware;
import com.deepak.behavioral.chain_or_responsibility.middleware.UserExistsMiddleware;
import com.deepak.behavioral.chain_or_responsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = Middleware.link(new ThrottlingMiddleware(2), new UserExistsMiddleware(server), new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
