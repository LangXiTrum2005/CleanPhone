package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.fs1;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rc f23931c = new rc(oc.f23803b, kc.B());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oc f23932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kc f23933b;

    public rc(oc ocVar, kc kcVar) {
        ocVar.getClass();
        this.f23932a = ocVar;
        this.f23933b = kcVar;
    }

    public static rc a(fs1 fs1Var, boolean z10) throws u1 {
        oc ocVarA;
        int iT = fs1Var.T();
        if (iT > 1) {
            throw new u1(com.applovin.impl.ca.m(new StringBuilder(String.valueOf(iT).length() + 44), "Unsupported version: ", iT, ". Current version is: 1"));
        }
        fs1Var.T();
        int iJ = fs1Var.j(fs1Var.R());
        z0 z0Var = z0.f24189a;
        int i10 = n0.f23760a;
        kc kcVarA = kc.A(fs1Var, z0.f24190b);
        fs1Var.m(iJ);
        mc mcVar = new mc();
        Inflater inflater = mcVar.f23737a;
        try {
            if (z10) {
                int iJ2 = fs1Var.j(fs1Var.R());
                int iN = fs1Var.n();
                try {
                    ocVarA = oc.a(fs1.v(new InflaterInputStream(new lc(mcVar, fs1Var), inflater, iN < 0 ? 4096 : Math.min(iN, 4096)), 4096));
                    inflater.reset();
                    if (fs1Var.n() != 0) {
                        throw new u1("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    fs1Var.m(iJ2);
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            } else {
                inflater.setInput(fs1Var.Q());
                try {
                    ocVarA = oc.a(fs1.v(new lc(mcVar, 0), 4096));
                    inflater.reset();
                } catch (Throwable th3) {
                    inflater.reset();
                    throw th3;
                }
            }
            mcVar.close();
            return new rc(ocVarA, kcVarA);
        } catch (Throwable th4) {
            try {
                mcVar.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }
}
