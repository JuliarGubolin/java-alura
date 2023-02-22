package javaejavaio.serializacaocomheranca.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javaejavaio.serializacao.Cliente;
import javaejavaio.serializacaocomheranca.modelo.ContaCorrente;

public class TesteSerializacao {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Julia");
        cliente.setProfissao("Dev");
        cliente.setCpf("12312312312");

        ContaCorrente cc = new ContaCorrente(22, 55);
        cc.deposita(222.3);
        //cc.setTitular(cliente);

        //Preciso implementar a interface Serializable na classe Cliente
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\cc.bin"));
        oos.writeObject(cliente);
        oos.close();
    }
}
