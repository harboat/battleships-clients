package com.github.harboat.clients.configuration;

import com.github.harboat.clients.game.ShipDto;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.Collection;

@SuppressFBWarnings(value = {"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
public record SetShipsPosition(String roomId, String playerId, Collection<ShipDto> ships) {
}
