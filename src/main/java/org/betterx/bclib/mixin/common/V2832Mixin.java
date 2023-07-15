package org.betterx.bclib.mixin.common;

import org.betterx.bclib.api.v2.generator.BCLChunkGenerator;

import com.mojang.datafixers.types.templates.TypeTemplate;
import net.minecraft.util.datafix.schemas.V2832;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.Map;
import java.util.function.Supplier;

@Mixin(V2832.class)
public class V2832Mixin {
    @ModifyArg(method = "method_38837", at = @At(value = "INVOKE", target = "Lcom/mojang/datafixers/DSL;taggedChoiceLazy(Ljava/lang/String;Lcom/mojang/datafixers/types/Type;Ljava/util/Map;)Lcom/mojang/datafixers/types/templates/TaggedChoice;"))
    private static Map<String, Supplier<TypeTemplate>> bcl_addGenerator(Map<String, Supplier<TypeTemplate>> map) {
        return BCLChunkGenerator.addGeneratorDSL(map);
    }
}
