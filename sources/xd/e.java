package xd;

import com.google.android.gms.internal.ads.kj1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements rn.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f53747a;
    private static final pn.d descriptor;

    static {
        e eVar = new e();
        f53747a = eVar;
        rn.m mVar = new rn.m("com.google.firebase.sessions.settings.SessionConfigs", eVar, 5);
        mVar.j("sessionsEnabled", false);
        mVar.j("sessionSamplingRate", false);
        mVar.j("sessionTimeoutSeconds", false);
        mVar.j("cacheDurationSeconds", false);
        mVar.j("cacheUpdatedTimeSeconds", false);
        descriptor = mVar;
    }

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        g value = (g) obj;
        kotlin.jvm.internal.n.f(value, "value");
        pn.d dVar = descriptor;
        f4.a aVarA = aVar.a(dVar);
        aVarA.g(dVar, 0, rn.a.f49704a, value.f53748a);
        aVarA.g(dVar, 1, rn.c.f49706a, value.f53749b);
        rn.f fVar = rn.f.f49713a;
        aVarA.g(dVar, 2, fVar, value.f53750c);
        aVarA.g(dVar, 3, fVar, value.f53751d);
        aVarA.g(dVar, 4, rn.i.f49719a, value.f53752e);
        aVarA.l(dVar);
    }

    @Override // nn.a
    public final Object b(kj1 decoder) {
        kotlin.jvm.internal.n.f(decoder, "decoder");
        pn.d dVar = descriptor;
        kj1 kj1VarB = decoder.b(dVar);
        int i10 = 0;
        Boolean bool = null;
        Double d10 = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z10 = true;
        while (z10) {
            int iC = kj1VarB.c(dVar);
            if (iC == -1) {
                z10 = false;
            } else if (iC == 0) {
                bool = (Boolean) kj1VarB.i(dVar, 0, rn.a.f49704a, bool);
                i10 |= 1;
            } else if (iC == 1) {
                d10 = (Double) kj1VarB.i(dVar, 1, rn.c.f49706a, d10);
                i10 |= 2;
            } else if (iC == 2) {
                num = (Integer) kj1VarB.i(dVar, 2, rn.f.f49713a, num);
                i10 |= 4;
            } else if (iC == 3) {
                num2 = (Integer) kj1VarB.i(dVar, 3, rn.f.f49713a, num2);
                i10 |= 8;
            } else {
                if (iC != 4) {
                    throw new nn.d(iC);
                }
                l = (Long) kj1VarB.i(dVar, 4, rn.i.f49719a, l);
                i10 |= 16;
            }
        }
        kj1VarB.n(dVar);
        return new g(i10, bool, d10, num, num2, l);
    }

    @Override // rn.e
    public final nn.a[] c() {
        nn.a aVarV = no.b.v(rn.a.f49704a);
        nn.a aVarV2 = no.b.v(rn.c.f49706a);
        rn.f fVar = rn.f.f49713a;
        return new nn.a[]{aVarV, aVarV2, no.b.v(fVar), no.b.v(fVar), no.b.v(rn.i.f49719a)};
    }

    @Override // nn.a
    public final pn.d d() {
        return descriptor;
    }
}
