package net.cham.dragonballredux.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {

    public static final KeyMapping STAT_MENU_KEY = new KeyMapping(
            "key.dragonballredux.stat_menu",
            KeyConflictContext.UNIVERSAL,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_V,
            "key.category.dragonballredux.dbrbindings"
    );
}
