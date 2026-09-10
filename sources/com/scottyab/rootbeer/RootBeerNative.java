package com.scottyab.rootbeer;

import irredeemable.attabal;

/* JADX INFO: loaded from: classes4.dex */
public class RootBeerNative {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f23663attabal = false;

    static {
        try {
            System.loadLibrary("toolChecker");
            f23663attabal = true;
        } catch (UnsatisfiedLinkError e) {
            attabal.saneness(e);
        }
    }

    public boolean attabal() {
        return f23663attabal;
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
