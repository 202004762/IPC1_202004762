import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class ReporteHTML {
    
    Ventana vt;
    Caminante vl;
    Serpiente cnt;
    
    public void HTML(){
        
        String cadenaHTML="<!DOCTYPE html>\n"
                +"<html lang=\"en\">\n"
                +"<head>\n"
                +"    <meta charset=\"utf-8\">\n"
                +"    <title>Reporte</title>\n"
                +"</head>\n"
                +"<table>\n"
                +"    <thead>\n"
                +"            <tr>\n"
                +"                    <th>Angel Arreaga</th>\n"
                +"                    <th>202004762</th>\n"
                +"            </tr>\n"
                +"    </thead>\n"
                +"    <tbody>\n"
                +"            <tr>\n"
                +"                    <td>Dificultad</td>\n"
                +"                    <td>"+ vt.dificultad2 +"</td>\n"
                +"            </tr>\n"
                +"            <tr>\n"
                +"                    <td>Tiempo transcurrido</td>\n"
                +"                    <td>"+ vt.m +" : "+ vt.s + "</td>\n"
                +"            </tr>\n"
                +"            <tr>\n"
                +"                    <td>Intervalo</td>\n"
                +"                    <td>"+ vl.velocidad +"</td>\n"
                +"            </tr>\n"
                +"            <tr>\n"
                +"                    <td>Tamaño de Serpiente</td>\n"
                +"                    <td>"+ cnt.count +"</td>\n"
                +"            </tr>\n"
                +"            <tr>\n"
                +"                    <td>Historial de movimiento</td>\n"
                +"                    <td>" + vt.historial + "</td>\n"
                +"            </tr>\n"
                ;
        
        cadenaHTML+="</tbody>\n"
                +"</table>\n"
                +"</html>\n";
        
        File archivo = new File("Reporte.html");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(cadenaHTML);
            bw.close();
        }catch(Exception e){
            
        }
        
    }
    
    
}