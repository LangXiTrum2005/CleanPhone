package s0;

import com.google.android.gms.internal.ads.l11;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.c f49793a = new ln.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na.g f49794b = new na.g(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fn.q0 f49795c = new fn.q0(new l11(2, null, 7));

    public e1(String str) {
    }

    @Override // s0.p0
    public final Object a(ck.c cVar) {
        return new Integer(((AtomicInteger) this.f49794b.f46631b).get());
    }

    @Override // s0.p0
    public final fn.e b() {
        return this.f49795c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [s0.e1] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [ln.c] */
    @Override // s0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(jk.b r7, ck.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof s0.c1
            if (r0 == 0) goto L13
            r0 = r8
            s0.c1 r0 = (s0.c1) r0
            int r1 = r0.f49768j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49768j = r1
            goto L18
        L13:
            s0.c1 r0 = new s0.c1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f49766h
            int r1 = r0.f49768j
            r2 = 2
            r3 = 1
            r4 = 0
            bk.a r5 = bk.a.f5708a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.f49764f
            ln.a r6 = (ln.a) r6
            t9.e.z(r8)     // Catch: java.lang.Throwable -> L2f
            goto L62
        L2f:
            r7 = move-exception
            goto L68
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            ln.c r6 = r0.f49765g
            java.lang.Object r7 = r0.f49764f
            jk.b r7 = (jk.b) r7
            t9.e.z(r8)
            goto L55
        L43:
            t9.e.z(r8)
            r0.f49764f = r7
            ln.c r6 = r6.f49793a
            r0.f49765g = r6
            r0.f49768j = r3
            java.lang.Object r8 = r6.e(r0)
            if (r8 != r5) goto L55
            goto L61
        L55:
            r0.f49764f = r6     // Catch: java.lang.Throwable -> L2f
            r0.f49765g = r4     // Catch: java.lang.Throwable -> L2f
            r0.f49768j = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L62
        L61:
            return r5
        L62:
            ln.c r6 = (ln.c) r6
            r6.g(r4)
            return r8
        L68:
            ln.c r6 = (ln.c) r6
            r6.g(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.e1.c(jk.b, ck.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // s0.p0
    public final Object d(jk.c cVar, ck.c cVar2) throws Throwable {
        d1 d1Var;
        ln.c cVar3;
        boolean z10;
        Throwable th2;
        if (cVar2 instanceof d1) {
            d1Var = (d1) cVar2;
            int i10 = d1Var.f49781j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d1Var.f49781j = i10 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(this, cVar2);
            }
        } else {
            d1Var = new d1(this, cVar2);
        }
        Object obj = d1Var.f49779h;
        int i11 = d1Var.f49781j;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = d1Var.f49778g;
            cVar3 = d1Var.f49777f;
            try {
                t9.e.z(obj);
                if (z10) {
                    cVar3.g(null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z10) {
                    cVar3.g(null);
                }
                throw th2;
            }
        }
        t9.e.z(obj);
        ln.c cVar4 = this.f49793a;
        boolean zF = cVar4.f();
        try {
            Object objValueOf = Boolean.valueOf(zF);
            d1Var.f49777f = cVar4;
            d1Var.f49778g = zF;
            d1Var.f49781j = 1;
            Object objInvoke = cVar.invoke(objValueOf, d1Var);
            Object obj2 = bk.a.f5708a;
            if (objInvoke == obj2) {
                return obj2;
            }
            cVar3 = cVar4;
            z10 = zF;
            obj = objInvoke;
            if (z10) {
                cVar3.g(null);
            }
            return obj;
        } catch (Throwable th4) {
            cVar3 = cVar4;
            z10 = zF;
            th2 = th4;
            if (z10) {
                cVar3.g(null);
            }
            throw th2;
        }
    }

    @Override // s0.p0
    public final Object e(d0 d0Var) {
        return new Integer(((AtomicInteger) this.f49794b.f46631b).incrementAndGet());
    }
}
