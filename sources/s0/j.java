package s0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ak.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f49828a = new j();

    /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|34) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r1 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        r12.f49891f = r11;
        r12.f49892g = r3;
        r12.f49894i = 1;
        r0 = cn.d0.l(r3, r12);
        r1 = bk.a.f5708a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0071 -> B:27:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.io.FileOutputStream r11, ck.c r12) throws java.io.IOException {
        /*
            boolean r0 = r12 instanceof s0.r0
            if (r0 == 0) goto L13
            r0 = r12
            s0.r0 r0 = (s0.r0) r0
            int r1 = r0.f49894i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49894i = r1
            goto L18
        L13:
            s0.r0 r0 = new s0.r0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f49893h
            int r1 = r0.f49894i
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            long r3 = r0.f49892g
            java.io.FileOutputStream r11 = r0.f49891f
            t9.e.z(r12)
            r12 = r0
            goto L75
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            t9.e.z(r12)
            r3 = 10
            r12 = r0
        L38:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
        */
        //  java.lang.String r1 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
        /*
            if (r0 > 0) goto L7a
            java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L55
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L55
            kotlin.jvm.internal.n.e(r0, r1)     // Catch: java.io.IOException -> L55
            goto L8d
        L55:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L79
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = an.h.q0(r1, r5, r6)
            if (r1 != r2) goto L79
            r12.f49891f = r11
            r12.f49892g = r3
            r12.f49894i = r2
            java.lang.Object r0 = cn.d0.l(r3, r12)
            bk.a r1 = bk.a.f5708a
            if (r0 != r1) goto L75
            r0 = r1
            goto L8d
        L75:
            r0 = 2
            long r0 = (long) r0
            long r3 = r3 * r0
            goto L38
        L79:
            throw r0
        L7a:
            java.nio.channels.FileChannel r5 = r11.getChannel()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)
            kotlin.jvm.internal.n.e(r0, r1)
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.j.a(java.io.FileOutputStream, ck.c):java.lang.Object");
    }

    public static e0 b(a1 a1Var, na.g gVar, List migrations, hn.d dVar, jk.a aVar) {
        kotlin.jvm.internal.n.f(migrations, "migrations");
        i0 i0Var = new i0(a1Var, h0.f49819e, aVar);
        c cVar = gVar;
        if (gVar == null) {
            cVar = new ne.c(14);
        }
        return new e0(i0Var, j1.f.C(new b4.c(migrations, (ak.f) null, 8)), cVar, dVar);
    }

    public static e0 c(a1 a1Var, na.g gVar, List list, hn.d dVar, jk.a aVar, int i10) {
        if ((i10 & 2) != 0) {
            gVar = null;
        }
        if ((i10 & 4) != 0) {
            list = xj.v.f53866a;
        }
        return b(a1Var, gVar, list, dVar, aVar);
    }
}
