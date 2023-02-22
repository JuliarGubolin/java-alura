package javaejavaio.serializacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Cliente cliente = new Cliente();
        cliente.setNome("Julia");
        cliente.setProfissao("Dev");
        cliente.setCpf("12312312312");

        //Preciso implementar a interface Serializable na classe Cliente
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\cliente.bin"));
        Cliente cliente2 = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente2.getNome());

        //String nome = "Julia Gubolin";
        //Serializar
        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\objeto.bin"));
        //oos.writeObject(nome);
        //oos.close();

        //Desserializar
        //ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\objeto.bin"));
        //Object nome = (String) ois.readObject();
        //ois.close();
    }
}
