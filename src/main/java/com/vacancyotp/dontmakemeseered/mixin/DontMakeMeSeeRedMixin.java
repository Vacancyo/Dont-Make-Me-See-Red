package com.vacancyotp.dontmakemeseered.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import mekanism.client.IncompleteRecipeScanner;
import net.minecraft.server.level.ServerPlayer;

@Mixin(IncompleteRecipeScanner.class)
public class DontMakeMeSeeRedMixin {
    @Inject(
            method = "sendMessageToPlayer",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    private static void blockWarningMessage(ServerPlayer player, CallbackInfo ci) {
        ci.cancel();
    }
}