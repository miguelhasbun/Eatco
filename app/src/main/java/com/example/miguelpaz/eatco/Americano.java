package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Americano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americano);
    }

    public void callFridays(View view) {
        Menu.restauranteActual="Friday's";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Baco Cheese Burger","Hamburguesa de Carne con Bacon y papas con refresco mediano",180,R.drawable.comida2));
        Adaptador.addList(new Comida("Baby Back Rips","Papas con carne y con refresco mediano",150,R.drawable.menu1));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void callMcDonald(View view) {
        Menu.restauranteActual="Mc Donald";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Big Mac","Perfecta y exquisita la Big Mac comienza con dos patties de 100% pura carne de res, sellados para conservar su jugosidad y salsa especial, dentro de un pan con semillas de ajonjolí. Además, queso americano, lechuga crujiente, cebolla y pepinillos.",140,R.drawable.mc));
        Adaptador.addList(new Comida("Papitas Mundialmente Famosas","Nuestras papitas provienen de papas de calidad superior, cultivadas localmente, como las Russet Burbank y las Shepody. Con cero gramo de grasa trans, estas papitas épicas son doraditas y crujientes por fuera y suavecitas por dentro. ",120,R.drawable.mc));
        Adaptador.addList(new Comida("HAPPY MEAL","Nuestra comida desea complacer a grandes y a chicos. Disfruta las distintas opciones, como una hamburguesa hecha con 100% carne de res sin rellenos, aditivos ni conservantes, o disfruta los jugosos Chicken McNuggets, que también puedes encontrar en los Mighty Kids Meal",100,R.drawable.mc));
        Adaptador.addList(new Comida("nuestras deliciosas y saludables ensaladas","una mezcla de crujiente lechuga acompañada de tu variedad de pollo preferida,con los mejores quesos y tocino",160,R.drawable.mc));
        Adaptador.addList(new Comida("Mc flurry","Una deliciosa combinación de galleta oreo con cremoso helado, acompañado de deliciosa salsa de chocolate o caramelo.",100,R.drawable.mc));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void callLittleCesars(View view) {
        Menu.restauranteActual="Little Cesars";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("HOT-N-READY PIZZA DE QUESO","Pizza Hot and Ready recién salida del horno con una mezcla de queso muenster y 100% mozarella.",150,R.drawable.pizza1));
        Adaptador.addList(new Comida("PIZZA ULTIMATE SUPRIME","Pizza redonda con Pepperoni, chorizo italiano, chile verde, hongos y cebolla",120,R.drawable.pizza2));
        Adaptador.addList(new Comida("PIZZA TRIPLE CARNE","Pizza redonda con pepperoni, chorizo italiano y tocino.",140,R.drawable.pizza3));
        Adaptador.addList(new Comida("Hula Hawaian"," ",180,R.drawable.pizza4));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }
}
