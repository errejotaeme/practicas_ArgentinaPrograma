package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;


public class Cliente extends ConexionSockets {
    
    public Cliente() throws IOException{
        super("cliente");
    }
    
    public void startCliente(){
        
        try{
            salidaServidor = new DataOutputStream(socketCliente.getOutputStream());
            
            //Envio de mensajes para probrar si funciona
            for(int i=0; i<3; i++){
                salidaServidor.writeUTF("Este es el mensaje número " + (i+1) + "\n");            
            }
            
            //cierro la conexion
            socketCliente.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
