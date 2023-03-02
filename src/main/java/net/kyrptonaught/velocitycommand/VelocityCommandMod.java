package net.kyrptonaught.velocitycommand;

import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;


public class VelocityCommandMod implements ModInitializer {
    public static final String MOD_ID = "velocitycommand";

    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register(VelocityCommandMod::register);
    }

    private static void register(CommandDispatcher<ServerCommandSource> serverCommandSourceCommandDispatcher, CommandRegistryAccess commandRegistryAccess, CommandManager.RegistrationEnvironment registrationEnvironment) {
        FallFlyingCommand.register(serverCommandSourceCommandDispatcher);
        VelocityCommand.register(serverCommandSourceCommandDispatcher);
    }
}