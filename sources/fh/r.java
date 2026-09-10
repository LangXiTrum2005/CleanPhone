package fh;

import cn.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f40909g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z10, ak.f fVar) {
        super(2, fVar);
        this.f40909g = z10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        return new r(this.f40909g, fVar);
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (fh.s.a(r4.f40909g, r4) == r3) goto L15;
     */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f40908f
            r1 = 1
            r2 = 2
            bk.a r3 = bk.a.f5708a
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L18
            if (r0 != r2) goto L10
            t9.e.z(r5)
            goto L3f
        L10:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L18:
            t9.e.z(r5)
            goto L32
        L1c:
            t9.e.z(r5)
            fh.b r5 = new fh.b
            r0 = 0
            r5.<init>(r2, r0, r2)
            r4.f40908f = r1
            jn.e r0 = cn.n0.f6748a
            dn.e r0 = hn.o.f42451a
            java.lang.Object r5 = cn.d0.J(r0, r5, r4)
            if (r5 != r3) goto L32
            goto L3e
        L32:
            fh.s r5 = fh.s.f40910a
            r4.f40908f = r2
            boolean r5 = r4.f40909g
            java.lang.Object r4 = fh.s.a(r5, r4)
            if (r4 != r3) goto L3f
        L3e:
            return r3
        L3f:
            wj.r r4 = wj.r.f53297a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
