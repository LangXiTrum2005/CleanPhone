package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class br1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final br1 f12867d = new br1("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12870c;

    static {
        new br1("\n", "  ", true);
    }

    public br1(String str, String str2, boolean z10) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f12868a = str;
        this.f12869b = str2;
        this.f12870c = z10;
    }
}
