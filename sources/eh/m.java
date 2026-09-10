package eh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f40095a = new m();

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006a -> B:20:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.ArrayList r6, ck.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof eh.l
            if (r0 == 0) goto L13
            r0 = r7
            eh.l r0 = (eh.l) r0
            int r1 = r0.f40094k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40094k = r1
            goto L18
        L13:
            eh.l r0 = new eh.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.f40092i
            int r7 = r0.f40094k
            r1 = 1
            if (r7 == 0) goto L35
            if (r7 != r1) goto L2d
            dh.b r6 = r0.f40091h
            java.util.Iterator r7 = r0.f40090g
            java.util.Map r2 = r0.f40089f
            java.util.Map r2 = (java.util.Map) r2
            t9.e.z(r5)
            goto L6d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            t9.e.z(r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
            r7 = r6
        L43:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r7.next()
            r6 = r5
            dh.b r6 = (dh.b) r6
            r5 = r2
            java.util.Map r5 = (java.util.Map) r5
            r0.f40089f = r5
            r0.f40090g = r7
            r0.f40091h = r6
            r0.f40094k = r1
            b4.a r5 = new b4.a
            r3 = 1
            r4 = 0
            r5.<init>(r6, r4, r3)
            jn.e r3 = cn.n0.f6748a
            java.lang.Object r5 = cn.d0.J(r3, r5, r0)
            bk.a r3 = bk.a.f5708a
            if (r5 != r3) goto L6d
            return r3
        L6d:
            java.util.List r5 = (java.util.List) r5
            r2.put(r6, r5)
            goto L43
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.m.a(java.util.ArrayList, ck.c):java.lang.Object");
    }
}
