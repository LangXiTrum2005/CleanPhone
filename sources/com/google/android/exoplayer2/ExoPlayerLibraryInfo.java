package com.google.android.exoplayer2;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class ExoPlayerLibraryInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f17074a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f17075b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f17074a.add(str)) {
            f17075b += ", " + str;
        }
    }
}
