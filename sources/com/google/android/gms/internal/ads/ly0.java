package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum ly0 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO("audio");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17157a;

    ly0(String str) {
        this.f17157a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17157a;
    }
}
