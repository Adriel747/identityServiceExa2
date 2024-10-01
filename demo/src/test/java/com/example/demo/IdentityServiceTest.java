package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentityServiceTest {
    @Test
    public void testVerificarCI() {
        // Arrange: configurar las dependencias y el entorno
        IdentityService identityService = new IdentityService();
        IdentityController controller = new IdentityController(identityService);

        // Act & Assert: realizar la acción y verificar el resultado para un CI existente
        String resultado = controller.verificarCI("12345678");
        assertEquals("El CI existe.", resultado);

        // Act & Assert: realizar la acción y verificar el resultado para un CI inexistente
        resultado = controller.verificarCI("87654321");
        assertEquals("El CI no existe.", resultado);
    }
}