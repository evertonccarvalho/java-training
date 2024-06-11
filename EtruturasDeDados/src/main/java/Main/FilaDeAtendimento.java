package Main;

import dataStructure.Queue;

import java.util.Random;

public class FilaDeAtendimento {

    public static void main(String[] args) {
        System.out.println("Usando lista:");
        lista();
        System.out.println("\nUsando vetor:");
        vetor();
    }

    public static void lista() {
        int n = 5;
        var random = new Random();
        int cliente = random.nextInt(101);

        Queue queue = new Queue(cliente);
        System.out.println("Chegou o cliente " + cliente);

        // Simula a chegada dos clientes
        for (int i = 2; i <= n; i++) {
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente " + cliente);
            queue.enqueue(cliente);
        }

        // Simula o atendimento
        var node = queue.dequeue();
        while (node != null) {
            System.out.println("Atendimento ao cliente: " + node.getValue());
            node = queue.dequeue();
        }
    }

    public static void vetor() {
        int n = 5;
        Random random = new Random();
        int[] queue = new int[n];
        int front = 0;  // Índice do primeiro elemento da fila
        int rear = 0;   // Índice do próximo espaço vazio na fila

        int cliente = random.nextInt(101);
        queue[rear++] = cliente;
        System.out.println("Chegou o cliente " + cliente);

        // Simula a chegada dos clientes
        for (int i = 1; i < n; i++) {
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente " + cliente);
            queue[rear++] = cliente;
        }

        // Simula o atendimento
        while (front < rear) {
            System.out.println("Atendimento ao cliente: " + queue[front++]);
        }
    }
}
