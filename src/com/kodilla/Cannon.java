package com.kodilla;

public class Cannon {
    private boolean isLoaded;

    Cannon(){
        this.isLoaded = false;
    }

    public void fire() {
        if(this.isLoaded) {
            System.out.println("Fire!");
            System.out.println("                  __\n" + " sjw             /  \\\n" + "           .-.  |    |\n" + "   *    _.-'  \\  \\__/\n" + "    \\.-'       \\\n" + "   /          _/\n" + "  |      _  /\"\n" + "  |     /_\\'\n" + "   \\    \\_/\n" + "    \"\"\"\"");
        } else {
            System.out.println("Cannon isn't loaded. Loading the cannon!");
            this.isLoaded = true;
        }

    }
}
