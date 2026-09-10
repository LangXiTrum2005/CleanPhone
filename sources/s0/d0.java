package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.a0 f49771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f49773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.a0 f49774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f49775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f49776k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kotlin.jvm.internal.a0 a0Var, e0 e0Var, Object obj, boolean z10, ak.f fVar) {
        super(2, fVar);
        this.f49774i = a0Var;
        this.f49775j = e0Var;
        this.f49776k = obj;
        this.l = z10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        d0 d0Var = new d0(this.f49774i, this.f49775j, this.f49776k, this.l, fVar);
        d0Var.f49773h = obj;
        return d0Var;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((n0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r5.b(r1, r7) == r6) goto L16;
     */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f49772g
            java.lang.Object r1 = r7.f49776k
            s0.e0 r2 = r7.f49775j
            kotlin.jvm.internal.a0 r3 = r7.f49774i
            r4 = 2
            r5 = 1
            bk.a r6 = bk.a.f5708a
            if (r0 == 0) goto L28
            if (r0 == r5) goto L1e
            if (r0 != r4) goto L16
            t9.e.z(r8)
            goto L59
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1e:
            kotlin.jvm.internal.a0 r0 = r7.f49771f
            java.lang.Object r5 = r7.f49773h
            s0.n0 r5 = (s0.n0) r5
            t9.e.z(r8)
            goto L43
        L28:
            t9.e.z(r8)
            java.lang.Object r8 = r7.f49773h
            s0.n0 r8 = (s0.n0) r8
            s0.p0 r0 = r2.g()
            r7.f49773h = r8
            r7.f49771f = r3
            r7.f49772g = r5
            java.lang.Object r0 = r0.e(r7)
            if (r0 != r6) goto L40
            goto L58
        L40:
            r5 = r8
            r8 = r0
            r0 = r3
        L43:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.f44754a = r8
            r8 = 0
            r7.f49773h = r8
            r7.f49771f = r8
            r7.f49772g = r4
            java.lang.Object r8 = r5.b(r1, r7)
            if (r8 != r6) goto L59
        L58:
            return r6
        L59:
            boolean r7 = r7.l
            if (r7 == 0) goto L71
            qj.x r7 = r2.f49789h
            s0.d r8 = new s0.d
            if (r1 == 0) goto L68
            int r0 = r1.hashCode()
            goto L69
        L68:
            r0 = 0
        L69:
            int r2 = r3.f44754a
            r8.<init>(r0, r2, r1)
            r7.y(r8)
        L71:
            wj.r r7 = wj.r.f53297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
