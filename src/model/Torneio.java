package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Torneio {

    private String nome;

    private Map<String, List<Lutador>> categoriaDepeso;


    public Torneio(String nome) {
        this.nome = nome;
        this.categoriaDepeso = new HashMap<>();
    }


    public void inscreverParaLuta(String categoria, Lutador lutador){
        if (lutador == null || categoria == null || categoria.isBlank()) {
            return;
        }
        if(!this.categoriaDepeso.containsKey(categoria)){
            this.categoriaDepeso.put(categoria, new ArrayList<>());

        }
        this.categoriaDepeso.get(categoria).add(lutador);
        System.out.println("Lutador inscrito no torneio na categoria " + categoria);

    }











}
