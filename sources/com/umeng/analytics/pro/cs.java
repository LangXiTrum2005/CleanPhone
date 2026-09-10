package com.umeng.analytics.pro;

/* JADX INFO: loaded from: classes3.dex */
public class cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f2549a = Integer.MAX_VALUE;

    public static void a(int i) {
        f2549a = i;
    }

    public static void a(cp cpVar, byte b) throws bw {
        a(cpVar, b, f2549a);
    }

    public static void a(cp cpVar, byte b, int i) throws bw {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    cpVar.t();
                    return;
                case 3:
                    cpVar.u();
                    return;
                case 4:
                    cpVar.y();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    cpVar.v();
                    return;
                case 8:
                    cpVar.w();
                    return;
                case 10:
                    cpVar.x();
                    return;
                case 11:
                    cpVar.A();
                    return;
                case 12:
                    cpVar.j();
                    while (true) {
                        byte b2 = cpVar.l().b;
                        if (b2 == 0) {
                            cpVar.k();
                            return;
                        } else {
                            a(cpVar, b2, i - 1);
                            cpVar.m();
                        }
                    }
                    break;
                case 13:
                    cm cmVarN = cpVar.n();
                    while (i2 < cmVarN.c) {
                        int i3 = i - 1;
                        a(cpVar, cmVarN.f2545a, i3);
                        a(cpVar, cmVarN.b, i3);
                        i2++;
                    }
                    cpVar.o();
                    return;
                case 14:
                    ct ctVarR = cpVar.r();
                    while (i2 < ctVarR.b) {
                        a(cpVar, ctVarR.f2550a, i - 1);
                        i2++;
                    }
                    cpVar.s();
                    return;
                case 15:
                    cl clVarP = cpVar.p();
                    while (i2 < clVarP.b) {
                        a(cpVar, clVarP.f2544a, i - 1);
                        i2++;
                    }
                    cpVar.q();
                    return;
            }
        } else {
            throw new bw("Maximum skip depth exceeded");
        }
    }

    public static cr a(byte[] bArr, cr crVar) {
        if (bArr[0] > 16) {
            return new cj.a();
        }
        return (bArr.length <= 1 || (bArr[1] & 128) == 0) ? crVar : new cj.a();
    }
}
