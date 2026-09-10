package com.mbridge.msdk.playercommon.exoplayer2;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ExoPlayerLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;
    public static final String TAG = "ExoPlayer";
    public static final boolean TRACE_ENABLED = true;
    public static final String VERSION = "2.8.4";
    public static final int VERSION_INT = 2008004;
    public static final String VERSION_SLASHY = "ExoPlayerLib/2.8.4";
    private static final HashSet<String> registeredModules = new HashSet<>();
    private static String registeredModulesString = "goog.exo.core";

    private ExoPlayerLibraryInfo() {
    }

    public static synchronized void registerModule(String str) {
        if (registeredModules.add(str)) {
            registeredModulesString += ", " + str;
        }
    }

    public static synchronized String registeredModules() {
        return registeredModulesString;
    }
}
