package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qo1 f19148c = new qo1("NIST_P256", zh1.f22621a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qo1 f19149d = new qo1("NIST_P384", zh1.f22622b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qo1 f19150e = new qo1("NIST_P521", zh1.f22623c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f19152b;

    public qo1(String str, ECParameterSpec eCParameterSpec) {
        this.f19151a = str;
        this.f19152b = eCParameterSpec;
    }

    public final String toString() {
        return this.f19151a;
    }
}
