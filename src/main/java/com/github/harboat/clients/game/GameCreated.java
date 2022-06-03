package com.github.harboat.clients.game;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.Collection;

@SuppressFBWarnings(value = {"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
public record GameCreated(String gameId, Collection<String> players, String playerTurn) {
}
