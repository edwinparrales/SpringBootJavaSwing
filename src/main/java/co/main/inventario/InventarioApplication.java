package co.main.inventario;

import co.main.inventario.vistas.ProductoFrm;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class InventarioApplication implements CommandLineRunner {

    public static void main(String[] args) {
         new SpringApplicationBuilder(InventarioApplication.class)
                .web(WebApplicationType.NONE)
                .headless(false)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

    }

    @Override
    public void run(String... args) throws Exception {
        ProductoFrm.startFrm(args);
       
    }

}
