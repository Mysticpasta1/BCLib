package org.betterx.worlds.together.worldPreset;

import net.minecraft.core.Holder;

import java.util.Optional;

public interface WorldGenSettingsComponentAccessor {
    Optional<Holder<WorldPreset>> bcl_getPreset();
    void bcl_setPreset(Optional<Holder<WorldPreset>> preset);
}
