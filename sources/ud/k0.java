package ud;

import com.google.android.gms.internal.ads.kj1;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k0 implements rn.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f52118a;
    private static final pn.d descriptor;

    static {
        k0 k0Var = new k0();
        f52118a = k0Var;
        rn.m mVar = new rn.m("com.google.firebase.sessions.SessionDetails", k0Var, 4);
        mVar.j(JsonStorageKeyNames.SESSION_ID_KEY, false);
        mVar.j("firstSessionId", false);
        mVar.j("sessionIndex", false);
        mVar.j("sessionStartTimestampUs", false);
        descriptor = mVar;
    }

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        m0 value = (m0) obj;
        kotlin.jvm.internal.n.f(value, "value");
        pn.d dVar = descriptor;
        f4.a aVarA = aVar.a(dVar);
        aVarA.k(dVar, 0, value.f52123a);
        aVarA.k(dVar, 1, value.f52124b);
        int i10 = value.f52125c;
        aVarA.b(dVar, 2);
        aVarA.c(i10);
        aVarA.e(dVar, 3, value.f52126d);
        aVarA.l(dVar);
    }

    @Override // nn.a
    public final Object b(kj1 decoder) {
        kotlin.jvm.internal.n.f(decoder, "decoder");
        pn.d dVar = descriptor;
        kj1 kj1VarB = decoder.b(dVar);
        int i10 = 0;
        int iE = 0;
        String strM = null;
        String strM2 = null;
        long jG = 0;
        boolean z10 = true;
        while (z10) {
            int iC = kj1VarB.c(dVar);
            if (iC == -1) {
                z10 = false;
            } else if (iC == 0) {
                strM = kj1VarB.m(dVar, 0);
                i10 |= 1;
            } else if (iC == 1) {
                strM2 = kj1VarB.m(dVar, 1);
                i10 |= 2;
            } else if (iC == 2) {
                iE = kj1VarB.e(dVar, 2);
                i10 |= 4;
            } else {
                if (iC != 3) {
                    throw new nn.d(iC);
                }
                jG = kj1VarB.g(dVar, 3);
                i10 |= 8;
            }
        }
        kj1VarB.n(dVar);
        return new m0(i10, strM, iE, strM2, jG);
    }

    @Override // rn.e
    public final nn.a[] c() {
        rn.p pVar = rn.p.f49742a;
        return new nn.a[]{pVar, pVar, rn.f.f49713a, rn.i.f49719a};
    }

    @Override // nn.a
    public final pn.d d() {
        return descriptor;
    }
}
