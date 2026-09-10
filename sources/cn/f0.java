package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f6709a;

    static {
        String property;
        dn.e eVar;
        i0 i0Var;
        int i10 = hn.v.f42459a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            jn.e eVar2 = n0.f6748a;
            eVar = hn.o.f42451a;
            dn.e eVar3 = eVar.f38972d;
            if (eVar == null) {
                i0Var = eVar;
                i0Var = e0.f6703i;
            }
        } else {
            i0Var = e0.f6703i;
        }
        i0Var = eVar;
        f6709a = i0Var;
    }
}
