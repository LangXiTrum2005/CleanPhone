package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends ck.i implements jk.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f41116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ f f41118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f41119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ck.i f41120j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(jk.d dVar, ak.f fVar) {
        super(3, fVar);
        this.f41120j = (ck.i) dVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ck.i, jk.d] */
    @Override // jk.d
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l0 l0Var = new l0(this.f41120j, (ak.f) obj3);
        l0Var.f41118h = (f) obj;
        l0Var.f41119i = (Object[]) obj2;
        return l0Var.invokeSuspend(wj.r.f53297a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r8, r7) == r6) goto L15;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [ck.i, jk.d] */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fn.f r0 = r7.f41118h
            java.lang.Object[] r1 = r7.f41119i
            int r2 = r7.f41117g
            r3 = 2
            r4 = 1
            r5 = 0
            bk.a r6 = bk.a.f5708a
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            t9.e.z(r8)
            goto L4b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1d:
            fn.f r0 = r7.f41116f
            t9.e.z(r8)
            goto L3c
        L23:
            t9.e.z(r8)
            r8 = 0
            r8 = r1[r8]
            r1 = r1[r4]
            r7.f41118h = r5
            r7.f41119i = r5
            r7.f41116f = r0
            r7.f41117g = r4
            ck.i r2 = r7.f41120j
            java.lang.Object r8 = r2.invoke(r8, r1, r7)
            if (r8 != r6) goto L3c
            goto L4a
        L3c:
            r7.f41118h = r5
            r7.f41119i = r5
            r7.f41116f = r5
            r7.f41117g = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r6) goto L4b
        L4a:
            return r6
        L4b:
            wj.r r7 = wj.r.f53297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
