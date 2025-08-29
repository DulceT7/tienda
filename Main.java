import control.tiendaFecher;
import views.Dashboard;

public class Main {
    public static void main(String[] args) {

        
        
        try{
        
            String urlApi = "https://jsonplaceholder.typicode.com/posts/99";
            String respuesta  = tiendaFecher.objeterProductos(urlApi);
            System.out.println("Respuesta de la API: ");

            Dashboard dashboard = new Dashboard(respuesta);

            for (int i = 0; i < respuesta.length(); i++) {
                System.out.print(respuesta.charAt(i));
        }
        }catch (Exception e){
            // TODO: hadle exception
        }
    }
}
