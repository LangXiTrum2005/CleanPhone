package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f52150f = Math.random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f52151g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mb.g f52152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.d f52153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd.j f52154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f52155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ak.k f52156e;

    public s0(mb.g firebaseApp, uc.d firebaseInstallations, xd.j sessionSettings, l eventGDTLogger, ak.k backgroundDispatcher) {
        kotlin.jvm.internal.n.f(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.n.f(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.n.f(sessionSettings, "sessionSettings");
        kotlin.jvm.internal.n.f(eventGDTLogger, "eventGDTLogger");
        kotlin.jvm.internal.n.f(backgroundDispatcher, "backgroundDispatcher");
        this.f52152a = firebaseApp;
        this.f52153b = firebaseInstallations;
        this.f52154c = sessionSettings;
        this.f52155d = eventGDTLogger;
        this.f52156e = backgroundDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r0.b(r1) == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ud.s0 r6, ck.c r7) {
        /*
            xd.j r0 = r6.f52154c
            boolean r1 = r7 instanceof ud.r0
            if (r1 == 0) goto L15
            r1 = r7
            ud.r0 r1 = (ud.r0) r1
            int r2 = r1.f52147h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f52147h = r2
            goto L1a
        L15:
            ud.r0 r1 = new ud.r0
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r6 = r1.f52145f
            int r7 = r1.f52147h
            r2 = 2
            r3 = 1
            java.lang.String r4 = "FirebaseSessions"
            bk.a r5 = bk.a.f5708a
            if (r7 == 0) goto L3a
            if (r7 == r3) goto L36
            if (r7 != r2) goto L2e
            t9.e.z(r6)
            goto L7f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            t9.e.z(r6)
            goto L48
        L3a:
            t9.e.z(r6)
            vd.c r6 = vd.c.f52564a
            r1.f52147h = r3
            java.lang.Object r6 = r6.b(r1)
            if (r6 != r5) goto L48
            goto L7e
        L48:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L5e
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L5e
            goto Lb4
        L5e:
            java.util.Iterator r6 = r6.iterator()
        L62:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb4
            java.lang.Object r7 = r6.next()
            zb.h r7 = (zb.h) r7
            zb.u r7 = r7.f54690a
            boolean r7 = r7.a()
            if (r7 == 0) goto L62
            r1.f52147h = r2
            java.lang.Object r6 = r0.b(r1)
            if (r6 != r5) goto L7f
        L7e:
            return r5
        L7f:
            xd.o r6 = r0.f53758a
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L8c
        L87:
            boolean r3 = r6.booleanValue()
            goto L95
        L8c:
            xd.o r6 = r0.f53759b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L95
            goto L87
        L95:
            if (r3 != 0) goto L9f
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L9f:
            double r6 = ud.s0.f52150f
            double r0 = r0.a()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto Lac
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        Lac:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lb4:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.s0.a(ud.s0, ck.c):java.lang.Object");
    }
}
