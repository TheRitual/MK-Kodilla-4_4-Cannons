package com.kodilla;

public class Cannon {
    private boolean loaded;
    private final String id;

    Cannon(boolean loaded)
    {
        this.loaded = loaded;
        this.id = Long.toString(System.nanoTime() % 10000L);
        if( this.loaded==true ) {
            System.out.println("[C" + getId() + "]\u27B0\u25CF\u270F || Created loaded cannon");
        } else {
            System.out.println("[C" + getId() + "]\u27B0\u25CB\u270F || Created unloaded cannon");
        }
    }

    Cannon(){
        this(false);
    }

    public String getId() {
        return id;
    }
    public void fire() {
        if(this.loaded) {
            System.out.println("[C" + getId() + "]\u27B0\u25CE\u270F\u273a\u2728 =\u2635\u2689 F I R E ! ! !");
            this.loaded = false;
        } else {
            this.loadCanon();
            this.loaded = true;
        }
    }

    public void loadCanon(){
        if( this.isLoaded() ) {
            System.out.println("[C" + getId() + "]\u27B0\u25CF\u270F || Canon already loaded");
        } else {
            System.out.println("[C" + getId() + "]\u27B0\u25C9\u270F || Loading Canon");
            this.loaded = true;
            System.out.println("[C" + getId() + "]\u27B0\u25CF\u270F || Canon loaded");
        }
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public void status() {
        if (this.isLoaded()) {
            System.out.println("[C" + getId() + "]\u27B0\u25CF\u270F || Canon is loaded");
        } else {
            System.out.println("[C" + getId() + "]\u27B0\u25CB\u270F || Canon is unloaded");
        }
    }

    public static void text(String txt) {
        System.out.print("\n\n\u2631\u2632\u2633\u2634\u2635\u2636\u2637 ");
        System.out.print(txt);
        System.out.println(" \u2637\u2636\u2635\u2634\u2633\u2632\u2631\n");
    }
}
