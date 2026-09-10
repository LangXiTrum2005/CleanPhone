package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vq1 implements ef1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f21254e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ok1 f21255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f21257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f21258d;

    public vq1(sj1 sj1Var) {
        this.f21255a = zw1.i(mk1.j(nk1.b(sj1Var.f19982b.f21189a), sj1Var.f19983c));
        vj1 vj1Var = sj1Var.f19982b;
        this.f21256b = vj1Var.f21190b;
        this.f21257c = sj1Var.f19984d.b();
        if (vj1Var.f21191c.equals(af1.f12023q)) {
            this.f21258d = Arrays.copyOf(f21254e, 1);
        } else {
            this.f21258d = new byte[0];
        }
    }

    public vq1(xj1 xj1Var) {
        String strValueOf = String.valueOf(xj1Var.f21912b.f12817d);
        this.f21255a = new vc("HMAC".concat(strValueOf), new SecretKeySpec(((zq1) xj1Var.f21913c.f20839b).b(), "HMAC"));
        bk1 bk1Var = xj1Var.f21912b;
        this.f21256b = bk1Var.f12815b;
        this.f21257c = xj1Var.f21914d.b();
        if (bk1Var.f12816c.equals(ak1.f12055d)) {
            this.f21258d = Arrays.copyOf(f21254e, 1);
        } else {
            this.f21258d = new byte[0];
        }
    }

    public vq1(vc vcVar, int i10) throws InvalidAlgorithmParameterException {
        this.f21255a = vcVar;
        this.f21256b = i10;
        this.f21257c = new byte[0];
        this.f21258d = new byte[0];
        vcVar.a(i10, new byte[0]);
    }
}
