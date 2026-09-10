package xd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f53758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f53759b;

    public j(o localOverrideSettings, o remoteSettings) {
        kotlin.jvm.internal.n.f(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.n.f(remoteSettings, "remoteSettings");
        this.f53758a = localOverrideSettings;
        this.f53759b = remoteSettings;
    }

    public final double a() {
        Double d10 = this.f53758a.d();
        if (d10 != null) {
            double dDoubleValue = d10.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double d11 = this.f53759b.d();
        if (d11 != null) {
            double dDoubleValue2 = d11.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r5.f53759b.b(r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ck.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof xd.i
            if (r0 == 0) goto L13
            r0 = r6
            xd.i r0 = (xd.i) r0
            int r1 = r0.f53757h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53757h = r1
            goto L18
        L13:
            xd.i r0 = new xd.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f53755f
            int r1 = r0.f53757h
            r2 = 2
            r3 = 1
            bk.a r4 = bk.a.f5708a
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            t9.e.z(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            t9.e.z(r6)
            goto L44
        L36:
            t9.e.z(r6)
            r0.f53757h = r3
            xd.o r6 = r5.f53758a
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r4) goto L44
            goto L4e
        L44:
            r0.f53757h = r2
            xd.o r5 = r5.f53759b
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r4) goto L4f
        L4e:
            return r4
        L4f:
            wj.r r5 = wj.r.f53297a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.j.b(ck.c):java.lang.Object");
    }
}
