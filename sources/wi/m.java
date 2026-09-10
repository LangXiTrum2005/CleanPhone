package wi;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f53254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f53256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f53257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f53258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f53259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f53260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f53261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f53262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.g f53263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f53264k;
    public final m[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Locale[] f53265m;

    public m(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, n nVar, Integer num, String str, k5.g gVar, String[] strArr, m[] mVarArr, Locale[] localeArr) {
        this.f53254a = z10;
        this.f53255b = z11;
        this.f53256c = z12;
        this.f53257d = z13;
        this.f53258e = z14;
        this.f53259f = i10;
        this.f53260g = nVar;
        this.f53261h = num;
        this.f53262i = str;
        this.f53263j = gVar;
        this.f53264k = strArr;
        this.l = mVarArr;
        this.f53265m = localeArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 wi.m, still in use, count: 2, list:
          (r8v1 wi.m) from 0x0220: PHI (r8v2 wi.m) = (r8v1 wi.m), (r8v4 wi.m) binds: [B:120:0x0213, B:308:0x049b] A[DONT_GENERATE, DONT_INLINE]
          (r8v1 wi.m) from 0x01ea: MOVE (r29v3 wi.m) = (r8v1 wi.m) (LINE:491)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static wi.m a(org.json.JSONObject r36) {
        /*
            Method dump skipped, instruction units count: 1656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.m.a(org.json.JSONObject):wi.m");
    }
}
