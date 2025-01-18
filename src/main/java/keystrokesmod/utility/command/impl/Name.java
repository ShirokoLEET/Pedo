package keystrokesmod.utility.command.impl;

import keystrokesmod.utility.Utils;
import keystrokesmod.utility.command.Command;

public class Name extends Command {
    public Name() {
        super("name", new String[] { "ign", "name" });
    }

    @Override
    public void onExecute(String[] args) {
        if (!Utils.nullCheck()) {
            return;
        }
        Utils.addToClipboard(mc.thePlayer.getName());
        chatWithPrefix("&7Copied &b" + mc.thePlayer.getName() + " &7to clipboard");
    }
}
