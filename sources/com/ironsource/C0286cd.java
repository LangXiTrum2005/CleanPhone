package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0286cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28375a;

    public C0286cd(String baseControllerUrl) {
        kotlin.jvm.internal.n.f(baseControllerUrl, "baseControllerUrl");
        this.f28375a = baseControllerUrl;
    }

    public final String a() {
        String str = this.f28375a;
        String strSubstring = str.substring(0, an.h.A0(str, "/", 6));
        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
