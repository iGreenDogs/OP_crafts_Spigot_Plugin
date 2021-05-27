package com.roeemamet.plugins.test;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Map;

public class Item_Maker {
    public ItemStack makeItem(Material m, String name, String desc, int amount){
        ItemStack item = new ItemStack (m, amount);

        //name
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(name);
        //lore
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(desc);
        //hide vanilla tooltip
        im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        //make custom item flags
        item.setItemMeta(im);

        return item;
    }
    public ItemStack pickaxepog(int amount) {
        Material m = Material.WOODEN_PICKAXE;
        String name = (ChatColor.BLUE + "WOODEN POGAXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack pickaxe(int amount) {
        Material m = Material.STONE_PICKAXE;
        String name = (ChatColor.BLUE + "STONE POGAXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack pog(int amount) {
        Material m = Material.IRON_PICKAXE;
        String name = (ChatColor.BLUE + "IRON POGAXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack yaypickaxepog(int amount) {
        Material m = Material.GOLDEN_PICKAXE;
        String name = (ChatColor.BLUE + "GOLDEN POGAXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack superpickaxepog(int amount) {
        Material m = Material.DIAMOND_PICKAXE;
        String name = (ChatColor.BLUE + "DIAMOND POGAXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack supermegapickaxepog(int amount) {
        Material m = Material.NETHERITE_PICKAXE;
        String name = (ChatColor.BLUE + "NETHERITE POGAXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack axepog(int amount) {
        Material m = Material.WOODEN_AXE;
        String name = (ChatColor.BLUE + "POG WOODEN AXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack doubleaxepog(int amount) {
        Material m = Material.STONE_AXE;
        String name = (ChatColor.BLUE + "POG STONE AXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack pogaxepog(int amount) {
        Material m = Material.IRON_AXE;
        String name = (ChatColor.BLUE + "POG IRON AXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack doublepogaxepog(int amount) {
        Material m = Material.GOLDEN_AXE;
        String name = (ChatColor.BLUE + "POG GOLD AXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack superaxepog(int amount) {
        Material m = Material.DIAMOND_AXE;
        String name = (ChatColor.BLUE + "POG DIAMOND AXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack megaaxepog(int amount) {
        Material m = Material.DIAMOND_AXE;
        String name = (ChatColor.BLUE + "POG NETHERITE AXE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack spadepog(int amount) {
        Material m = Material.WOODEN_SHOVEL;
        String name = (ChatColor.BLUE + "POG WOODEN SPADE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack doublespadepog(int amount) {
        Material m = Material.STONE_SHOVEL;
        String name = (ChatColor.BLUE + "POG STONE SPADE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack pogspadepog(int amount) {
        Material m = Material.IRON_SHOVEL;
        String name = (ChatColor.BLUE + "POG IRON SPADE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack doublepogspadepog(int amount) {
        Material m = Material.GOLDEN_SHOVEL;
        String name = (ChatColor.BLUE + "POG GOLDEN SPADE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack superspadepog(int amount) {
        Material m = Material.DIAMOND_SHOVEL;
        String name = (ChatColor.BLUE + "POG DIAMOND SPADE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack megaspadepog(int amount) {
        Material m = Material.NETHERITE_SHOVEL;
        String name = (ChatColor.BLUE + "POG NETHERITE SPADE" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 32767);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
        item.addUnsafeEnchantment(Enchantment.MENDING, 32767);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 32767);
        return item;
    }
    public ItemStack jesusfeet(int amount) {
        Material m = Material.LEATHER_BOOTS;
        String name = (ChatColor.DARK_AQUA + "JESUS FETT" + ChatColor.RESET);
        String desc = (ChatColor.RED + "POGAXE GO BRRRRRRRRRR");
        ItemStack item = makeItem(m, name, desc, amount);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
        item.addUnsafeEnchantment(Enchantment.FROST_WALKER, 20);
        return item;
    }
}
