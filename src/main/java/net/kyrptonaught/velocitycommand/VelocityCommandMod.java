package net.kyrptonaught.velocitycommand;


import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.minecraft.server.command.ServerCommandSource;


public class VelocityCommandMod implements ModInitializer {
    public static final String MOD_ID = "velocitycommand";

    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register(VelocityCommandMod::register);
    }

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean b) {
        FallFlyingCommand.register(dispatcher);
        VelocityCommand.register(dispatcher);
    }
}