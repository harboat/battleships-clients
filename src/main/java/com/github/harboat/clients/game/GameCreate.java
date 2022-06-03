package com.github.harboat.clients.game;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.Collection;
import java.util.Map;

@SuppressFBWarnings(value = {"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
public record GameCreate(Size size, Map<String, Collection<ShipDto>> fleet) {
}
