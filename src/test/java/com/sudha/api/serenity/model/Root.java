package com.sudha.api.serenity.model;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Root {
    private String query;

    private String sort;

    private String responseGroup;

    private int totalResults;

    private int start;

    private int numItems;

    private List<Items> items;

    private List<String> facets;

}
