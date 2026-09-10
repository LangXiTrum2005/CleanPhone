package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends m0 {
    private static final a2 zzb;
    private n0 zzd = j1.f22849d;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        m0.e(a2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (r7 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.auth.a2 j(byte[] r7) throws com.google.android.gms.internal.auth.q0 {
        /*
            com.google.android.gms.internal.auth.a2 r0 = com.google.android.gms.internal.auth.a2.zzb
            int r5 = r7.length
            com.google.android.gms.internal.auth.i0 r1 = com.google.android.gms.internal.auth.i0.f22843a
            com.google.android.gms.internal.auth.m0 r2 = r0.b()
            com.google.android.gms.internal.auth.i1 r0 = com.google.android.gms.internal.auth.i1.f22844c     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.n1 -> L7b com.google.android.gms.internal.auth.q0 -> L87
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.n1 -> L7b com.google.android.gms.internal.auth.q0 -> L87
            com.google.android.gms.internal.auth.l1 r3 = r0.a(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.n1 -> L7b com.google.android.gms.internal.auth.q0 -> L87
            b2.d0 r6 = new b2.d0     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.n1 -> L7b com.google.android.gms.internal.auth.q0 -> L87
            r4 = 4
            r6.<init>(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.n1 -> L7b com.google.android.gms.internal.auth.q0 -> L87
            r1.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.n1 -> L7b com.google.android.gms.internal.auth.q0 -> L87
            r4 = 0
            r1 = r3
            r3 = r7
            r1.f(r2, r3, r4, r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.n1 -> L7b com.google.android.gms.internal.auth.q0 -> L87
            r1.a(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L5b java.io.IOException -> L60 com.google.android.gms.internal.auth.n1 -> L7b com.google.android.gms.internal.auth.q0 -> L87
            r7 = 1
            java.lang.Object r1 = r2.h(r7)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r7) goto L33
            goto L47
        L33:
            if (r1 == 0) goto L4a
            java.lang.Class r7 = r2.getClass()
            com.google.android.gms.internal.auth.l1 r7 = r0.a(r7)
            boolean r7 = r7.e(r2)
            r0 = 2
            r2.h(r0)
            if (r7 == 0) goto L4a
        L47:
            com.google.android.gms.internal.auth.a2 r2 = (com.google.android.gms.internal.auth.a2) r2
            return r2
        L4a:
            com.google.android.gms.internal.auth.n1 r7 = new com.google.android.gms.internal.auth.n1
            java.lang.String r0 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r7.<init>(r0)
            com.google.android.gms.internal.auth.q0 r0 = new com.google.android.gms.internal.auth.q0
            java.lang.String r7 = r7.getMessage()
            r0.<init>(r7)
            throw r0
        L5b:
            com.google.android.gms.internal.auth.q0 r7 = com.google.android.gms.internal.auth.q0.h()
            throw r7
        L60:
            r0 = move-exception
            r7 = r0
            java.lang.Throwable r0 = r7.getCause()
            boolean r0 = r0 instanceof com.google.android.gms.internal.auth.q0
            if (r0 == 0) goto L71
            java.lang.Throwable r7 = r7.getCause()
            com.google.android.gms.internal.auth.q0 r7 = (com.google.android.gms.internal.auth.q0) r7
            throw r7
        L71:
            com.google.android.gms.internal.auth.q0 r0 = new com.google.android.gms.internal.auth.q0
            java.lang.String r1 = r7.getMessage()
            r0.<init>(r1, r7)
            throw r0
        L7b:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.internal.auth.q0 r0 = new com.google.android.gms.internal.auth.q0
            java.lang.String r7 = r7.getMessage()
            r0.<init>(r7)
            throw r0
        L87:
            r0 = move-exception
            r7 = r0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.a2.j(byte[]):com.google.android.gms.internal.auth.a2");
    }

    @Override // com.google.android.gms.internal.auth.m0
    public final Object h(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new k1(zzb, new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new a2();
        }
        if (i11 == 4) {
            return new z1();
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final n0 k() {
        return this.zzd;
    }
}
