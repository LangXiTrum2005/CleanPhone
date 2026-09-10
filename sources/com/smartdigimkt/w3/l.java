package com.smartdigimkt.w3;

import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f39324a = "ExoPlayer";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39325b = "2.8.4";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f39326c = "ExoPlayerLib/2.8.4";
    public static final int d = 2008004;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f39327e = true;
    public static final boolean f = true;
    private static final HashSet<String> g = new HashSet<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f39328h = "goog.exo.core";

    private l() {
    }

    public static synchronized String a() {
        return f39328h;
    }

    public static synchronized void a(String str) {
        if (g.add(str)) {
            f39328h += ", " + str;
        }
    }
}
