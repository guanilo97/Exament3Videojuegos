package com.e.examen_t3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView  mRecyclerView =findViewById(R.id.rv_lista);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new MylistaAdapter(dataSet()));

    }
    private List<listanime> dataSet(){
        List<listanime> data = new ArrayList<>();
        data.add(new listanime("ANIME NARUTO"," Naruto Uzumaki aspira a convertirse en hokage de la aldea de la hoja"
                ,"https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQE_90vMrVs6u6lZPGNXxPJXvErK-vdTjhOjOdPFmvezODy-M_3&usqp=CAU",true));
        data.add(new listanime(" ANIME PLUNDERER"," 7 aces lengendarios con distintos poderes que luchan por el bien","https://i.pinimg.com/236x/7e/03/c5/7e03c5ef373a79b1de38de64be1d97f5.jpg",true));
        data.add(new listanime("ANIME DRAGON BALL Z ", "Gokū es un personaje ficticio,protagonista del anime.","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQiA6a1l0D38arCQU56IPOnR1B6T-3VMNj8Mn7biF_dQGU1zN3l&usqp=CAU",true));
        data.add(new listanime("Los 7 pecados capitales","Son 7 personajes con distintos poderes magicos que son dirigicos por meliodas quien es su capitan y tsmbien es un rey demonio","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT9825CePoHyjb_cEcnyGA1ptv-mpWdtN7vte8yK7E4WD0NMXYu&usqp=CAU",true));
        data.add(new listanime("BORUTO","Secuela de la serie naruto pero esta ves es su hijo quien es el protagonista y que tiene un poder oculto","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTSRTRV5yB_JS_wB3L0QT8S7UFVV5LkGE-mtmVaO-Fu4M6kFwJh&usqp=CAU",true));
        data.add(new listanime("One piece","lufy y su tripulacion van en busca del tesoro one piece para convertirse en el rey pirata","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTb8pi7T9BtXONCMPWNwSv1XshUrKZxJNqeLHKHFwgO2ztJ2Cxa&usqp=CAU",true));
        data.add(new listanime("super campeones","oliver atom es un jugador con grandes sueños y aspirasiones que desea ganar la copa del mundo con su seleccion","https://cdn62.paninicloud.com/store/media/catalog/product/cache/52/small_image/200x/9df78eab33525d08d6e5fb8d27136e95/H/M/HMXSUP032_0.jpg",true));
        data.add(new listanime(" Death Note",  " cuaderno donde se escriben los nombres de personas que quieres matar","https://images-na.ssl-images-amazon.com/images/I/61wIGJz2oxL._AC_SX342_.jpg",true));
        data.add(new listanime("Berserk","anime medieval, que sigue la historia de un mercenario.","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcR33DJDPM5q3w8u7oiwnmDe_lOENh8wCOzowhBTR8l4IDBMoubb&usqp=CAU",true));
        data.add(new listanime("Samurai X", "anime de gerreros samurais que luchan por su honor","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTYfX4NrgUFgVqOWDFqnnK2pkjeNkgNZL1Bl2UWvhcHz--Zo95U&usqp=CAU",true));
        return  data;
    }
}