package pl.chomiciak;

import java.util.logging.Level;

import javax.net.ssl.HandshakeCompletedEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerPreLoginEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("deprecation")
public class ChomiciakLoginLog extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onPreLogin(PlayerPreLoginEvent event){
		getServer().getLogger().log(Level.INFO, "PlayerPreLoginEvent: "+event);
	}
	
	@EventHandler
	public void onLogin(PlayerLoginEvent event){
		getServer().getLogger().log(Level.INFO, "PlayerLoginEvent: "+event);
	}
	
	@EventHandler
	public void onHandshakeCompleted(HandshakeCompletedEvent event){
		getServer().getLogger().log(Level.INFO, "HandshakeCompletedEvent: "+event);
	}
	
	@EventHandler
	public void onServerListPing(ServerListPingEvent event){
		getServer().getLogger().log(Level.INFO, "ServerListPingEvent: "+event);
	}
	
}
