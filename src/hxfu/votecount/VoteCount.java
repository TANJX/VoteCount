package hxfu.votecount;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VoteCount extends JavaPlugin {

    String date;
    String format;
    public static final String votes = "§a感谢您的投票";
    public static final String author = "§a投票统计插件由§6服主TANJX§9开发";
    public static final String prefix = "§e[§b投票统计§e]";
    public static final String error = "§a你已经投过票了！";

    private boolean configContainsDefaults() {
        if (getConfig().getDefaults() == null) {
            return true;
        } else {
            return getConfig().getKeys(true).containsAll(getConfig().getDefaults().getKeys(true));
        }
    }

    public void onEnable() {
        getLogger().info("=====加载配置文件中=====");
        File file = new File(getDataFolder(), "config.yml");
        if (!file.exists() || !configContainsDefaults()) {
            getConfig().options().copyDefaults(true);
            try {
                getConfig().save(file);
            } catch (IOException ex) {
                getLogger().severe("配置文件保存出错");
                getServer().getPluginManager().disablePlugin(this);
                return;
            }
        }
        getLogger().info("=====配置文件读取完毕=====");
        getLogger().info("VoteCount已被加载!");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("v11")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V11 = getConfig().getString((new StringBuilder("vote1.1.")).append(name).toString());
                String V12 = getConfig().getString((new StringBuilder("vote1.2.")).append(name).toString());
                String V13 = getConfig().getString((new StringBuilder("vote1.3.")).append(name).toString());
                String V14 = getConfig().getString((new StringBuilder("vote1.4.")).append(name).toString());
                String V15 = getConfig().getString((new StringBuilder("vote1.5.")).append(name).toString());
                if (V11 == null && V12 == null && V13 == null && V14 == null && V15 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote1.1.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v12")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V11 = getConfig().getString((new StringBuilder("vote1.1.")).append(name).toString());
                String V12 = getConfig().getString((new StringBuilder("vote1.2.")).append(name).toString());
                String V13 = getConfig().getString((new StringBuilder("vote1.3.")).append(name).toString());
                String V14 = getConfig().getString((new StringBuilder("vote1.4.")).append(name).toString());
                String V15 = getConfig().getString((new StringBuilder("vote1.5.")).append(name).toString());
                if (V11 == null && V12 == null && V13 == null && V14 == null && V15 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote1.2.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v13")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V11 = getConfig().getString((new StringBuilder("vote1.1.")).append(name).toString());
                String V12 = getConfig().getString((new StringBuilder("vote1.2.")).append(name).toString());
                String V13 = getConfig().getString((new StringBuilder("vote1.3.")).append(name).toString());
                String V14 = getConfig().getString((new StringBuilder("vote1.4.")).append(name).toString());
                String V15 = getConfig().getString((new StringBuilder("vote1.5.")).append(name).toString());
                if (V11 == null && V12 == null && V13 == null && V14 == null && V15 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote1.3.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v14")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V11 = getConfig().getString((new StringBuilder("vote1.1.")).append(name).toString());
                String V12 = getConfig().getString((new StringBuilder("vote1.2.")).append(name).toString());
                String V13 = getConfig().getString((new StringBuilder("vote1.3.")).append(name).toString());
                String V14 = getConfig().getString((new StringBuilder("vote1.4.")).append(name).toString());
                String V15 = getConfig().getString((new StringBuilder("vote1.5.")).append(name).toString());
                if (V11 == null && V12 == null && V13 == null && V14 == null && V15 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote1.4.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v15")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V11 = getConfig().getString((new StringBuilder("vote1.1.")).append(name).toString());
                String V12 = getConfig().getString((new StringBuilder("vote1.2.")).append(name).toString());
                String V13 = getConfig().getString((new StringBuilder("vote1.3.")).append(name).toString());
                String V14 = getConfig().getString((new StringBuilder("vote1.4.")).append(name).toString());
                String V15 = getConfig().getString((new StringBuilder("vote1.5.")).append(name).toString());
                if (V11 == null && V12 == null && V13 == null && V14 == null && V15 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote1.5.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v21")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V21 = getConfig().getString((new StringBuilder("vote2.1.")).append(name).toString());
                String V22 = getConfig().getString((new StringBuilder("vote2.2.")).append(name).toString());
                if (V21 == null && V22 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote2.1.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v22")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V21 = getConfig().getString((new StringBuilder("vote2.1.")).append(name).toString());
                String V22 = getConfig().getString((new StringBuilder("vote2.2.")).append(name).toString());
                if (V21 == null && V22 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote2.2.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v31")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V21 = getConfig().getString((new StringBuilder("vote3.1.")).append(name).toString());
                String V22 = getConfig().getString((new StringBuilder("vote3.2.")).append(name).toString());
                if (V21 == null && V22 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote3.1.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v32")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V31 = getConfig().getString((new StringBuilder("vote3.1.")).append(name).toString());
                String V32 = getConfig().getString((new StringBuilder("vote3.2.")).append(name).toString());
                if (V31 == null && V32 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote3.2.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v41")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V41 = getConfig().getString((new StringBuilder("vote4.1.")).append(name).toString());
                String V42 = getConfig().getString((new StringBuilder("vote4.2.")).append(name).toString());
                String V43 = getConfig().getString((new StringBuilder("vote4.3.")).append(name).toString());
                String V44 = getConfig().getString((new StringBuilder("vote4.4.")).append(name).toString());
                String V45 = getConfig().getString((new StringBuilder("vote4.5.")).append(name).toString());
                if (V41 == null && V42 == null && V43 == null && V44 == null && V45 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote4.1.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v42")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V41 = getConfig().getString((new StringBuilder("vote4.1.")).append(name).toString());
                String V42 = getConfig().getString((new StringBuilder("vote4.2.")).append(name).toString());
                String V43 = getConfig().getString((new StringBuilder("vote4.3.")).append(name).toString());
                String V44 = getConfig().getString((new StringBuilder("vote4.4.")).append(name).toString());
                String V45 = getConfig().getString((new StringBuilder("vote4.5.")).append(name).toString());
                if (V41 == null && V42 == null && V43 == null && V44 == null && V45 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote4.2.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v43")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V41 = getConfig().getString((new StringBuilder("vote4.1.")).append(name).toString());
                String V42 = getConfig().getString((new StringBuilder("vote4.2.")).append(name).toString());
                String V43 = getConfig().getString((new StringBuilder("vote4.3.")).append(name).toString());
                String V44 = getConfig().getString((new StringBuilder("vote4.4.")).append(name).toString());
                String V45 = getConfig().getString((new StringBuilder("vote4.5.")).append(name).toString());
                if (V41 == null && V42 == null && V43 == null && V44 == null && V45 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote4.3.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v44")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V41 = getConfig().getString((new StringBuilder("vote4.1.")).append(name).toString());
                String V42 = getConfig().getString((new StringBuilder("vote4.2.")).append(name).toString());
                String V43 = getConfig().getString((new StringBuilder("vote4.3.")).append(name).toString());
                String V44 = getConfig().getString((new StringBuilder("vote4.4.")).append(name).toString());
                String V45 = getConfig().getString((new StringBuilder("vote4.5.")).append(name).toString());
                if (V41 == null && V42 == null && V43 == null && V44 == null && V45 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote4.4.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("v45")) {
            if (sender instanceof Player) {
                DateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                date = formate.format(now);
                String name = sender.getName();
                String V41 = getConfig().getString((new StringBuilder("vote4.1.")).append(name).toString());
                String V42 = getConfig().getString((new StringBuilder("vote4.2.")).append(name).toString());
                String V43 = getConfig().getString((new StringBuilder("vote4.3.")).append(name).toString());
                String V44 = getConfig().getString((new StringBuilder("vote4.4.")).append(name).toString());
                String V45 = getConfig().getString((new StringBuilder("vote4.5.")).append(name).toString());
                if (V41 == null && V42 == null && V43 == null && V44 == null && V45 == null) {
                    sender.sendMessage(prefix + votes);
                    sender.sendMessage(prefix + author);
                    getConfig().set((new StringBuilder("vote4.5.")).append(name).toString(), Arrays.asList(new String[]{
                        date
                    }));
                    saveConfig();
                    return true;
                } else {
                    sender.sendMessage(prefix + error);
                }
            }
        }
        return false;

    }

    public void onDisable() {
        getLogger().info("VoteCount已被卸载!");
    }
}
