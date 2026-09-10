package com.adjust.sdk.sig;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f6996a;

    static {
        j1 j1Var = new j1(i1.f6966b);
        a(j1Var);
        f6996a = new n1(new l1(j1Var.f6969a, j1Var.f6970b, j1Var.f6971c));
    }

    public static String a(a0 a0Var) {
        n1 n1Var = f6996a;
        n1Var.getClass();
        z zVar = z.f7030a;
        o1 o1Var = new o1();
        try {
            new v2(new x(o1Var), n1Var, p3.OBJ, new v2[p3.f7001g.f6953a.length]).a(zVar, a0Var);
            String string = o1Var.toString();
            o1Var.a();
            byte[] bArr = s2.f7007a;
            byte[] bArrA = d3.a(string);
            int length = bArrA.length;
            for (int i10 = 0; i10 < length; i10++) {
                bArrA[i10] = (byte) (bArrA[i10] ^ bArr[i10 % 19]);
            }
            return Base64.encodeToString(bArrA, 2);
        } catch (Throwable th2) {
            o1Var.a();
            throw th2;
        }
    }

    public static final m3 a(j1 j1Var) {
        j1Var.f6969a = true;
        j1Var.f6970b = false;
        return m3.f6988a;
    }
}
