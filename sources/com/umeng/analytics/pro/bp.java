package com.umeng.analytics.pro;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* JADX INFO: loaded from: classes3.dex */
public class bp extends bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2522a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private static final cu j = new cu("TApplicationException");
    private static final ck k = new ck(PglCryptUtils.KEY_MESSAGE, (byte) 11, 1);
    private static final ck l = new ck("type", (byte) 8, 2);
    private static final long m = 1;
    protected int i;

    public bp() {
        this.i = 0;
    }

    public int a() {
        return this.i;
    }

    public void b(cp cpVar) throws bw {
        cpVar.a(j);
        if (getMessage() != null) {
            cpVar.a(k);
            cpVar.a(getMessage());
            cpVar.c();
        }
        cpVar.a(l);
        cpVar.a(this.i);
        cpVar.c();
        cpVar.d();
        cpVar.b();
    }

    public static bp a(cp cpVar) throws bw {
        cpVar.j();
        String strZ = null;
        int iW = 0;
        while (true) {
            ck ckVarL = cpVar.l();
            byte b2 = ckVarL.b;
            if (b2 == 0) {
                cpVar.k();
                return new bp(iW, strZ);
            }
            short s = ckVarL.c;
            if (s != 1) {
                if (s != 2) {
                    cs.a(cpVar, b2);
                } else if (b2 == 8) {
                    iW = cpVar.w();
                } else {
                    cs.a(cpVar, b2);
                }
            } else if (b2 == 11) {
                strZ = cpVar.z();
            } else {
                cs.a(cpVar, b2);
            }
            cpVar.m();
        }
    }

    public bp(int i) {
        this.i = i;
    }

    public bp(int i, String str) {
        super(str);
        this.i = i;
    }

    public bp(String str) {
        super(str);
        this.i = 0;
    }
}
