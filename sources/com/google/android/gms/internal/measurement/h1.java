package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.fs1;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f23533a;

    static {
        z0 z0Var = z0.f24189a;
        int i10 = n0.f23760a;
    }

    public h1(i1 i1Var) {
        this.f23533a = i1Var;
    }

    public final i1 a(InputStream inputStream, z0 z0Var) throws u1 {
        fs1 fs1VarV = fs1.v(inputStream, 4096);
        int i10 = i1.zzd;
        i1 i1VarI = this.f23533a.i();
        try {
            o2 o2VarA = l2.f23690c.a(i1VarI.getClass());
            androidx.datastore.preferences.protobuf.n nVar = (androidx.datastore.preferences.protobuf.n) fs1VarV.f14525c;
            if (nVar == null) {
                nVar = new androidx.datastore.preferences.protobuf.n(fs1VarV, (byte) 0);
            }
            o2VarA.e(i1VarI, nVar, z0Var);
            o2VarA.a(i1VarI);
            fs1VarV.B(0);
            if (i1.r(i1VarI, true)) {
                return i1VarI;
            }
            throw new s2().d();
        } catch (s2 e10) {
            throw e10.d();
        } catch (u1 e11) {
            if (e11.f24012a) {
                throw new u1(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof u1) {
                throw ((u1) e12.getCause());
            }
            throw new u1(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof u1) {
                throw ((u1) e13.getCause());
            }
            throw e13;
        }
    }
}
