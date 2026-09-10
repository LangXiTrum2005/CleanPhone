package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f22506a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f22507b = "media3.common";

    public static synchronized void a(String str) {
        if (f22506a.add(str)) {
            String str2 = f22507b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str);
            f22507b = sb2.toString();
        }
    }
}
