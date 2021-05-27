package com.roeemamet.plugins.test;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("YAY! You Found My plugin and Enabled it.");
        PluginManager pm = getServer().getPluginManager();
        Bukkit.addRecipe(getjomama());
        Bukkit.addRecipe(getdoublejomama());
        Bukkit.addRecipe(getpogjomama());
        Bukkit.addRecipe(getdoublepogjomama());
        Bukkit.addRecipe(getsuperjomama());
        Bukkit.addRecipe(getmegajomama());
        Bukkit.addRecipe(getaxepog());
        Bukkit.addRecipe(getdoubleaxepog());
        Bukkit.addRecipe(getpogaxepog());
        Bukkit.addRecipe(getdoublepogaxepog());
        Bukkit.addRecipe(getsuperpogaxepog());
        Bukkit.addRecipe(getmegapogaxepog());
        Bukkit.addRecipe(getspadepog());
        Bukkit.addRecipe(getdoublespadepog());
        Bukkit.addRecipe(getpogspadepog());
        Bukkit.addRecipe(getdoublepogspadepog());
        Bukkit.addRecipe(getsuperspadepog());
        Bukkit.addRecipe(getmegaspadepog());
        Bukkit.addRecipe(getchainmailchest());
        Bukkit.addRecipe(getjesusfeet());
        Bukkit.addRecipe(getchainmailfeet());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(":( You Found My plugin and DISABLED it. Goodbye.");
    }

    //commands

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            String lowercmd = cmd.getName().toLowerCase();
            switch (lowercmd) {
                case "jomama":
                    ItemStack item = new Item_Maker().pickaxepog(1);
                    player.getInventory().addItem(item);
                    return true;
                case "doublejomama":
                    ItemStack item2 = new Item_Maker().pickaxe(1);
                    player.getInventory().addItem(item2);
                    return true;
                case "pogjomama":
                    ItemStack item3 = new Item_Maker().pog(1);
                    player.getInventory().addItem(item3);
                    return true;
                case "doublepogjomama":
                    ItemStack item4 = new Item_Maker().yaypickaxepog(1);
                    player.getInventory().addItem(item4);
                    return true;
                case "superjomama":
                    ItemStack item5 = new Item_Maker().superpickaxepog(1);
                    player.getInventory().addItem(item5);
                    return true;
                case "megajomama":
                    ItemStack item6 = new Item_Maker().supermegapickaxepog(1);
                    player.getInventory().addItem(item6);
                    return true;
                default:
                    player.sendMessage("Oops, there was a problem :(");
                    return true;
            }
        }
        return false;
    }
    //recipes
    public ShapedRecipe getjomama() {
        ItemStack item = new Item_Maker().pickaxepog(1);
        NamespacedKey key = new NamespacedKey(this, "wooden_pogaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", "WWW");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.STRIPPED_OAK_WOOD);
        return recipe;
    }
    public ShapedRecipe getdoublejomama() {
        ItemStack item = new Item_Maker().pickaxe(1);
        NamespacedKey key = new NamespacedKey(this, "stone_pogaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", "WWW");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.SMOOTH_STONE);
        return recipe;
    }
    public ShapedRecipe getpogjomama() {
        ItemStack item = new Item_Maker().pog(1);
        NamespacedKey key = new NamespacedKey(this, "iron_pogaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", "WWW");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.IRON_BLOCK);
        return recipe;
    }
    public ShapedRecipe getdoublepogjomama() {
        ItemStack item = new Item_Maker().yaypickaxepog(1);
        NamespacedKey key = new NamespacedKey(this, "golden_pogaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", "WWW");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.GOLD_BLOCK);
        return recipe;
    }
    public ShapedRecipe getsuperjomama() {
        ItemStack item = new Item_Maker().superpickaxepog(1);
        NamespacedKey key = new NamespacedKey(this, "diamond_pogaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", "WWW");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.DIAMOND_BLOCK);
        return recipe;
    }
    public ShapedRecipe getmegajomama() {
        ItemStack item = new Item_Maker().supermegapickaxepog(1);
        NamespacedKey key = new NamespacedKey(this, "netherite_pogaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", "WWW");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.NETHERITE_INGOT);
        return recipe;
    }
    public ShapedRecipe getaxepog() {
        ItemStack item = new Item_Maker().axepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_wooden_axe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", "WS ", "WW ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.STRIPPED_OAK_WOOD);
        return recipe;
    }
    public ShapedRecipe getdoubleaxepog() {
        ItemStack item = new Item_Maker().doubleaxepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_stone_axe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", "WS ", "WW ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.SMOOTH_STONE);
        return recipe;
    }
    public ShapedRecipe getpogaxepog() {
        ItemStack item = new Item_Maker().pogaxepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_iron_axe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", "WS ", "WW ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.IRON_BLOCK);
        return recipe;
    }
    public ShapedRecipe getdoublepogaxepog() {
        ItemStack item = new Item_Maker().doublepogaxepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_golden_axe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", "WS ", "WW ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.GOLD_BLOCK);
        return recipe;
    }
    public ShapedRecipe getsuperpogaxepog() {
        ItemStack item = new Item_Maker().superaxepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_diamond_axe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", "WS ", "WW ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.DIAMOND_BLOCK);
        return recipe;
    }
    public ShapedRecipe getmegapogaxepog() {
        ItemStack item = new Item_Maker().megaaxepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_netherite_axe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", "WS ", "WW ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.NETHERITE_INGOT);
        return recipe;
    }





    //spades
    public ShapedRecipe getspadepog() {
        ItemStack item = new Item_Maker().spadepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_wooden_spade");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", " W ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.STRIPPED_OAK_WOOD);
        return recipe;
    }
    public ShapedRecipe getdoublespadepog() {
        ItemStack item = new Item_Maker().doublespadepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_stone_spade");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", " W ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.SMOOTH_STONE);
        return recipe;
    }
    public ShapedRecipe getpogspadepog() {
        ItemStack item = new Item_Maker().pogspadepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_iron_spade");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", " W ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.IRON_BLOCK);
        return recipe;
    }
    public ShapedRecipe getdoublepogspadepog() {
        ItemStack item = new Item_Maker().doublepogspadepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_golden_spade");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", " W ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.GOLD_BLOCK);
        return recipe;
    }
    public ShapedRecipe getsuperspadepog() {
        ItemStack item = new Item_Maker().superspadepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_diamond_spade");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", " W ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.DIAMOND_BLOCK);
        return recipe;
    }
    public ShapedRecipe getmegaspadepog() {
        ItemStack item = new Item_Maker().megaspadepog(1);
        NamespacedKey key = new NamespacedKey(this, "pog_netherite_spade");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" S ", " S ", " W ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('W', Material.NETHERITE_INGOT);
        return recipe;
    }

    //Chainmail Craftable
    public ShapedRecipe getchainmailchest() {
        ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        NamespacedKey key = new NamespacedKey(this, "CHAINMAIL_CHESTPLATE");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("C C", "CCC", "CCC");
        recipe.setIngredient('C', Material.CHAIN);
        return recipe;
    }
    public ShapedRecipe getchainmaillegs() {
        ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        NamespacedKey key = new NamespacedKey(this, "CHAINMAIL_LEGGINGS");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("CCC", "C C", "C C");
        recipe.setIngredient('C', Material.CHAIN);
        return recipe;
    }
    public ShapedRecipe getchainmailhead() {
        ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
        NamespacedKey key = new NamespacedKey(this, "CHAINMAIL_HELMET");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("CCC", "C C", "   ");
        recipe.setIngredient('C', Material.CHAIN);
        return recipe;
    }
    public ShapedRecipe getchainmailfeet() {
        ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS);
        NamespacedKey key = new NamespacedKey(this, "CHAINMAIL_BOOTS");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("C C", "C C", "   ");
        recipe.setIngredient('C', Material.CHAIN);
        return recipe;
    }

    //Jesus Feet (Elad and Meitar joke)
    public ShapedRecipe getjesusfeet() {
        ItemStack item = new Item_Maker().megaspadepog(1);
        NamespacedKey key = new NamespacedKey(this, "jesus_feet");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("LIL", "LIL", "III");
        recipe.setIngredient('L', Material.LEATHER);
        recipe.setIngredient('I', Material.ICE);
        return recipe;
    }
}
