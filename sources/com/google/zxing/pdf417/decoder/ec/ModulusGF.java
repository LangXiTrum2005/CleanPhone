package com.google.zxing.pdf417.decoder.ec;

/* JADX INFO: loaded from: classes3.dex */
public final class ModulusGF {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21390c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f21391a = new int[929];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21392b = new int[929];

    static {
        new ModulusGF();
    }

    public ModulusGF() {
        int i2 = 1;
        for (int i3 = 0; i3 < 929; i3++) {
            this.f21391a[i3] = i2;
            i2 = (i2 * 3) % 929;
        }
        for (int i4 = 0; i4 < 928; i4++) {
            this.f21392b[this.f21391a[i4]] = i4;
        }
        new ModulusPoly(new int[]{0});
        new ModulusPoly(new int[]{1});
    }
}
