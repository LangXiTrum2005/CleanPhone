package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ih implements jh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gh f23598a = new gh();

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public String e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogSite{ class=");
        sb2.append(a());
        sb2.append(", method=");
        sb2.append(b());
        sb2.append(", line=");
        sb2.append(c());
        if (d() != null) {
            sb2.append(", file=");
            sb2.append(d());
        }
        if (e() != null) {
            sb2.append(", filePath=");
            sb2.append(e());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
