package com.github.harboat.clients.game;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
@Builder
@SuppressFBWarnings(value = {"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
public class ShipDto {
    private ShipType type;
    private Masts masts;
    private OccupiedCells cells;
}
