package com.google.gson;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f24756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f24757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r[] f24758c;

    static {
        n nVar = new n();
        f24756a = nVar;
        o oVar = new o();
        f24757b = oVar;
        f24758c = new r[]{nVar, oVar, new r() { // from class: com.google.gson.p
            public static Double b(String str, ge.a aVar) throws ge.c {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        boolean z10 = true;
                        if (aVar.f41876o != 1) {
                            z10 = false;
                        }
                        if (!z10) {
                            throw new ge.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.t());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e10) {
                    StringBuilder sbK = d5.u.k("Cannot parse ", str, "; at path ");
                    sbK.append(aVar.t());
                    throw new k(sbK.toString(), e10);
                }
            }

            @Override // com.google.gson.r
            public final Number a(ge.a aVar) throws IOException {
                String strF = aVar.F();
                if (strF.indexOf(46) >= 0) {
                    return b(strF, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(strF));
                } catch (NumberFormatException unused) {
                    return b(strF, aVar);
                }
            }
        }, new r() { // from class: com.google.gson.q
            @Override // com.google.gson.r
            public final Number a(ge.a aVar) throws IOException {
                String strF = aVar.F();
                try {
                    return ae.i.j(strF);
                } catch (NumberFormatException e10) {
                    StringBuilder sbK = d5.u.k("Cannot parse ", strF, "; at path ");
                    sbK.append(aVar.t());
                    throw new k(sbK.toString(), e10);
                }
            }
        }};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f24758c.clone();
    }

    public abstract Number a(ge.a aVar);
}
