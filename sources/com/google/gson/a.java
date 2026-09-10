package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24735d = new a("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24738c;

    static {
        new a("\n", "  ", true);
    }

    public a(String str, String str2, boolean z10) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f24736a = str;
        this.f24737b = str2;
        this.f24738c = z10;
    }
}
