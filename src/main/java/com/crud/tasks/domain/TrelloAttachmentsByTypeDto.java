<<<<<<< HEAD
package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloAttachmentsByTypeDto {

    @JsonProperty("trello")
    private TrelloDto trelloDto;
}
=======
package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloAttachmentsByTypeDto {

    @JsonProperty("trello")
    private TrelloDto trelloDto;
}
>>>>>>> 216094a192ea885a50c973d1ed220133437e8870
