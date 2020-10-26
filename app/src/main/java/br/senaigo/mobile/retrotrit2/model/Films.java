package br.senaigo.mobile.retrotrit2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Films {
    private Integer id;
    private String title;
    private Integer episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private String release_date;
    private String characters;
    private String planets;
    private String starships;
    private String vehicles;
    private String species;
    private String created;
    private String edited;
    private String url;
}
