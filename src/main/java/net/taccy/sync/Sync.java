package net.taccy.sync;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Sync extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().log(Level.INFO, "Sync plugin enabled.");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
