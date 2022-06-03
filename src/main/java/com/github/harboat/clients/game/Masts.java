package com.github.harboat.clients.game;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.*;

import java.util.Collection;


@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
@SuppressFBWarnings(value = {"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
public class Masts {
    private Collection<Integer> positions;
}
