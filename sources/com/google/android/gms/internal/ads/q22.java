package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q22 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p22 f18901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18902c;

    public q22(g22 g22Var, v22 v22Var, int i10) {
        String string = g22Var.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25 + string.length());
        sb2.append("Decoder init failed: [");
        sb2.append(i10);
        sb2.append("], ");
        sb2.append(string);
        String string2 = sb2.toString();
        String str = g22Var.f14678o;
        int iAbs = Math.abs(i10);
        this(string2, v22Var, str, null, l1.d.k(new StringBuilder(String.valueOf(iAbs).length() + 60), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", iAbs));
    }

    public q22(String str, Throwable th2, String str2, p22 p22Var, String str3) {
        super(str, th2);
        this.f18900a = str2;
        this.f18901b = p22Var;
        this.f18902c = str3;
    }
}
