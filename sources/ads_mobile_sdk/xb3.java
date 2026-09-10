package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import saneness.anthropography;
import saneness.phraseological;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb3 implements anthropography {
    public static final /* synthetic */ xb3 b;
    public static final /* synthetic */ xb3 c;
    public static final /* synthetic */ xb3 d;
    public static final /* synthetic */ xb3 e;
    public static final /* synthetic */ xb3 f;
    public static final /* synthetic */ xb3 g;
    public static final /* synthetic */ xb3 h;
    public static final /* synthetic */ xb3 i;
    public static final /* synthetic */ xb3 j;
    public static final /* synthetic */ xb3 k;
    public static final /* synthetic */ xb3 l;
    public static final /* synthetic */ xb3 m;
    public static final /* synthetic */ xb3 n;
    public static final /* synthetic */ xb3 o;
    public static final /* synthetic */ xb3 p;
    public static final /* synthetic */ xb3 q;
    public static final /* synthetic */ xb3 r;
    public static final /* synthetic */ xb3 s;
    public static final /* synthetic */ xb3 t;
    public static final /* synthetic */ xb3 u;
    public static final /* synthetic */ xb3 v;
    public final /* synthetic */ int a;

    static {
        int iAttabal = sanitaria.attabal(((~1281944976) & 1463473736) | 847256033, (1281944976 & 1698424328) | 948255187, -1554299394, 419914800) ^ (1727952741 % 1091714937);
        v = new xb3(20);
        u = new xb3(19);
        t = new xb3(18);
        s = new xb3(17);
        r = new xb3(16);
        q = new xb3(15);
        p = new xb3(14);
        o = new xb3(13);
        n = new xb3(12);
        m = new xb3(11);
        l = new xb3(10);
        k = new xb3(9);
        j = new xb3(8);
        i = new xb3(7);
        h = new xb3(6);
        g = new xb3(5);
        f = new xb3(4);
        e = new xb3(3);
        d = new xb3(iAttabal);
        c = new xb3(1);
        b = new xb3(0);
    }

    public /* synthetic */ xb3(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        y62 y62Var;
        y62 y62Var2;
        y62 y62Var3;
        y62 y62Var4;
        y62 y62Var5;
        y62 y62Var6;
        y62 y62Var7;
        y62 y62Var8;
        y62 y62Var9;
        y62 y62Var10;
        y62 y62Var11;
        y62 y62Var12;
        y62 y62Var13;
        y62 y62Var14;
        y62 y62Var15;
        y62 y62Var16;
        y62 y62Var17;
        y62 y62Var18;
        y62 y62Var19;
        y62 y62Var20;
        char c2 = 0;
        long j2 = 1;
        switch (this.a) {
            case 0:
                uc3 uc3Var = (uc3) obj;
                try {
                    qc3 qc3Var = uc3Var.a;
                    long jC = qc3Var.a().c();
                    if (qc3Var.a().c() != 0) {
                        uc3Var.c.a(jC);
                        break;
                    }
                    return Optional.empty();
                } catch (gc3 | hc3 unused) {
                    y62Var = y62.j;
                    return Optional.of(y62Var);
                } catch (oc3 unused2) {
                    y62Var = y62.y;
                    return Optional.of(y62Var);
                } catch (wc3 unused3) {
                    y62Var = y62.z;
                    return Optional.of(y62Var);
                }
            case 1:
                try {
                    qc3 qc3Var2 = ((uc3) obj).a;
                    long jC2 = qc3Var2.a().c();
                    zc3 zc3VarA = qc3Var2.a();
                    zc3 zc3VarA2 = qc3Var2.a();
                    List listE = zc3VarA2.e();
                    if (jC2 < 0) {
                        jC2 += (long) (listE.size() + 1);
                    }
                    if (jC2 < 0 || jC2 >= listE.size() + 1) {
                        throw new xc3();
                    }
                    listE.add((int) jC2, zc3VarA);
                    qc3Var2.a(zc3VarA2);
                    return Optional.empty();
                } catch (oc3 unused4) {
                    y62Var2 = y62.y;
                    return Optional.of(y62Var2);
                } catch (pc3 e2) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e2);
                } catch (wc3 unused5) {
                    y62Var2 = y62.z;
                    return Optional.of(y62Var2);
                } catch (xc3 unused6) {
                    y62Var2 = y62.J;
                    return Optional.of(y62Var2);
                }
            case 2:
                uc3 uc3Var2 = (uc3) obj;
                try {
                    qc3 qc3Var3 = uc3Var2.a;
                    long jC3 = qc3Var3.a().c();
                    if (qc3Var3.a().c() == 0) {
                        uc3Var2.c.a(jC3);
                        break;
                    }
                    return Optional.empty();
                } catch (gc3 | hc3 unused7) {
                    y62Var3 = y62.j;
                    return Optional.of(y62Var3);
                } catch (oc3 unused8) {
                    y62Var3 = y62.y;
                    return Optional.of(y62Var3);
                } catch (wc3 unused9) {
                    y62Var3 = y62.z;
                    return Optional.of(y62Var3);
                }
            case 3:
                try {
                    qc3 qc3Var4 = ((uc3) obj).a;
                    qc3Var4.a(zc3.a(qc3Var4.a().e().size()));
                    return Optional.empty();
                } catch (oc3 unused10) {
                    y62Var4 = y62.y;
                    return Optional.of(y62Var4);
                } catch (pc3 e3) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e3);
                } catch (wc3 unused11) {
                    y62Var4 = y62.z;
                    return Optional.of(y62Var4);
                }
            case 4:
                try {
                    qc3 qc3Var5 = ((uc3) obj).a;
                    qc3Var5.a(zc3.a(qc3Var5.a().d().a.length));
                    return Optional.empty();
                } catch (oc3 unused12) {
                    y62Var5 = y62.y;
                    return Optional.of(y62Var5);
                } catch (pc3 e4) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e4);
                } catch (wc3 unused13) {
                    y62Var5 = y62.z;
                    return Optional.of(y62Var5);
                }
            case 5:
                try {
                    qc3 qc3Var6 = ((uc3) obj).a;
                    qc3Var6.a(zc3.a(Math.log(qc3Var6.a().g())));
                    return Optional.empty();
                } catch (oc3 unused14) {
                    y62Var6 = y62.y;
                    return Optional.of(y62Var6);
                } catch (pc3 e5) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e5);
                } catch (wc3 unused15) {
                    y62Var6 = y62.z;
                    return Optional.of(y62Var6);
                }
            case 6:
                try {
                    qc3 qc3Var7 = ((uc3) obj).a;
                    long jC4 = qc3Var7.a().c();
                    long jC5 = qc3Var7.a().c();
                    if (jC4 == 0 || jC5 == 0) {
                        j2 = 0;
                    }
                    qc3Var7.a(zc3.a(j2));
                    return Optional.empty();
                } catch (oc3 unused16) {
                    y62Var7 = y62.y;
                    return Optional.of(y62Var7);
                } catch (pc3 e6) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e6);
                } catch (wc3 unused17) {
                    y62Var7 = y62.z;
                    return Optional.of(y62Var7);
                }
            case 7:
                try {
                    qc3 qc3Var8 = ((uc3) obj).a;
                    if (qc3Var8.a().c() != 0) {
                        j2 = 0;
                    }
                    qc3Var8.a(zc3.a(j2));
                    return Optional.empty();
                } catch (oc3 unused18) {
                    y62Var8 = y62.y;
                    return Optional.of(y62Var8);
                } catch (pc3 e7) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e7);
                } catch (wc3 unused19) {
                    y62Var8 = y62.z;
                    return Optional.of(y62Var8);
                }
            case 8:
                try {
                    qc3 qc3Var9 = ((uc3) obj).a;
                    long jC6 = qc3Var9.a().c();
                    long jC7 = qc3Var9.a().c();
                    if (jC6 == 0 && jC7 == 0) {
                        j2 = 0;
                    }
                    qc3Var9.a(zc3.a(j2));
                    return Optional.empty();
                } catch (oc3 unused20) {
                    y62Var9 = y62.y;
                    return Optional.of(y62Var9);
                } catch (pc3 e8) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e8);
                } catch (wc3 unused21) {
                    y62Var9 = y62.z;
                    return Optional.of(y62Var9);
                }
            case 9:
                uc3 uc3Var3 = (uc3) obj;
                try {
                    qc3 qc3Var10 = uc3Var3.a;
                    try {
                        int iCompare = new vc3(false).compare(qc3Var10.a(), qc3Var10.a());
                        qc3 qc3Var11 = uc3Var3.a;
                        if (iCompare >= 0) {
                            j2 = 0;
                        }
                        qc3Var11.a(zc3.a(j2));
                        return Optional.empty();
                    } catch (IllegalArgumentException unused22) {
                        return Optional.of(y62.e);
                    }
                } catch (oc3 unused23) {
                    return Optional.of(y62.y);
                } catch (pc3 e9) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e9);
                }
            case 10:
                uc3 uc3Var4 = (uc3) obj;
                try {
                    try {
                        try {
                            qc3 qc3Var12 = uc3Var4.a;
                            long jC8 = qc3Var12.a().c();
                            int[] iArr = {1516266761, 1142957872, 446044582, 1147282962, 861635011, -1643766350, 500618996, 1941690360, 410409117};
                            char c3 = 7;
                            char c4 = '\b';
                            int i2 = iArr[7] % iArr[8];
                            ArrayList arrayList = new ArrayList();
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < qc3Var12.b) {
                                try {
                                    zc3 zc3VarA3 = zc3.a((zc3) qc3Var12.a.get(i3));
                                    int[] iArr2 = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
                                    int i5 = iArr2[c2];
                                    int i6 = iArr2[1];
                                    int i7 = iArr2[2];
                                    int i8 = iArr2[3];
                                    char c5 = c3;
                                    char c6 = c4;
                                    if (i4 >= (sanitaria.attabal(((~i5) & i6) | i7, (i5 & i8) | iArr2[4], iArr2[5], iArr2[6]) ^ (iArr2[c5] % iArr2[c6]))) {
                                        throw new pc3();
                                    }
                                    if (i4 == arrayList.size()) {
                                        arrayList.add(zc3VarA3);
                                    } else {
                                        arrayList.set(i4, zc3VarA3);
                                    }
                                    i4++;
                                    i3++;
                                    c3 = c5;
                                    c4 = c6;
                                    c2 = 0;
                                } catch (pc3 e10) {
                                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e10);
                                }
                            }
                            char c7 = c3;
                            char c8 = c4;
                            ic3 ic3Var = uc3Var4.c;
                            ic3 ic3Var2 = new ic3(ic3Var.b, ic3Var.a, ic3Var.c.a(), ic3Var.d);
                            int[] iArr3 = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
                            int i9 = iArr3[c7] % iArr3[c8];
                            new nc3();
                            ic3Var2.a(jC8);
                            qc3Var12.a(zc3.a(new phraseological()));
                            return Optional.empty();
                        } catch (oc3 unused24) {
                            y62Var10 = y62.y;
                            return Optional.of(y62Var10);
                        } catch (wc3 unused25) {
                            y62Var10 = y62.z;
                            return Optional.of(y62Var10);
                        }
                    } catch (pc3 e11) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e11);
                    }
                } catch (gc3 | hc3 unused26) {
                    y62Var10 = y62.u;
                    return Optional.of(y62Var10);
                }
            case 11:
                try {
                    qc3 qc3Var13 = ((uc3) obj).a;
                    qc3Var13.a(zc3.a(qc3Var13.a().a((Class) qc3Var13.a().b())));
                    return Optional.empty();
                } catch (oc3 unused27) {
                    y62Var11 = y62.y;
                    return Optional.of(y62Var11);
                } catch (pc3 e12) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e12);
                } catch (wc3 unused28) {
                    y62Var11 = y62.q;
                    return Optional.of(y62Var11);
                }
            case 12:
                try {
                    qc3 qc3Var14 = ((uc3) obj).a;
                    long jC9 = qc3Var14.a().c();
                    long jC10 = qc3Var14.a().c();
                    if (jC9 == 0) {
                        return Optional.of(y62.G);
                    }
                    qc3Var14.a(zc3.a(jC10 % jC9));
                    return Optional.empty();
                } catch (oc3 unused29) {
                    y62Var12 = y62.y;
                    return Optional.of(y62Var12);
                } catch (pc3 e13) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e13);
                } catch (wc3 unused30) {
                    y62Var12 = y62.z;
                    return Optional.of(y62Var12);
                }
            case 13:
                try {
                    qc3 qc3Var15 = ((uc3) obj).a;
                    qc3Var15.a(zc3.a(qc3Var15.a().g() * qc3Var15.a().g()));
                    return Optional.empty();
                } catch (oc3 unused31) {
                    y62Var13 = y62.y;
                    return Optional.of(y62Var13);
                } catch (pc3 e14) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e14);
                } catch (wc3 unused32) {
                    y62Var13 = y62.z;
                    return Optional.of(y62Var13);
                }
            case 14:
                try {
                    qc3 qc3Var16 = ((uc3) obj).a;
                    qc3Var16.a(zc3.a(qc3Var16.a().c() * qc3Var16.a().c()));
                    return Optional.empty();
                } catch (oc3 unused33) {
                    y62Var14 = y62.y;
                    return Optional.of(y62Var14);
                } catch (pc3 e15) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e15);
                } catch (wc3 unused34) {
                    y62Var14 = y62.z;
                    return Optional.of(y62Var14);
                }
            case 15:
                try {
                    qc3 qc3Var17 = ((uc3) obj).a;
                    long jC11 = qc3Var17.a().c();
                    ArrayList arrayList2 = new ArrayList();
                    for (long j3 = 0; j3 < jC11; j3++) {
                        arrayList2.add(qc3Var17.a());
                    }
                    Collections.reverse(arrayList2);
                    qc3Var17.a(zc3.a(arrayList2));
                    return Optional.empty();
                } catch (oc3 unused35) {
                    y62Var15 = y62.y;
                    return Optional.of(y62Var15);
                } catch (pc3 e16) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e16);
                } catch (wc3 unused36) {
                    y62Var15 = y62.z;
                    return Optional.of(y62Var15);
                }
            case 16:
                try {
                    qc3 qc3Var18 = ((uc3) obj).a;
                    qc3Var18.a(zc3.a(Math.pow(qc3Var18.a().g(), qc3Var18.a().g())));
                    return Optional.empty();
                } catch (oc3 unused37) {
                    y62Var16 = y62.y;
                    return Optional.of(y62Var16);
                } catch (pc3 e17) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e17);
                } catch (wc3 unused38) {
                    y62Var16 = y62.z;
                    return Optional.of(y62Var16);
                }
            case 17:
                try {
                    ((uc3) obj).a.a(zc3.a((Object) null));
                    return Optional.empty();
                } catch (pc3 unused39) {
                    return Optional.of(y62.b);
                }
            case 18:
                uc3 uc3Var5 = (uc3) obj;
                try {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(uc3Var5.c.b(64L).a());
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    uc3Var5.a.a(zc3.a(Double.longBitsToDouble(byteBufferWrap.getLong())));
                    return Optional.empty();
                } catch (gc3 e18) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e18);
                } catch (hc3 unused40) {
                    y62Var17 = y62.A;
                    return Optional.of(y62Var17);
                } catch (pc3 unused41) {
                    y62Var17 = y62.b;
                    return Optional.of(y62Var17);
                }
            case 19:
                uc3 uc3Var6 = (uc3) obj;
                try {
                    uc3Var6.a.a(zc3.a(uc3Var6.c.d()));
                    return Optional.empty();
                } catch (fc3 unused42) {
                    y62Var18 = y62.E;
                    return Optional.of(y62Var18);
                } catch (hc3 unused43) {
                    y62Var18 = y62.A;
                    return Optional.of(y62Var18);
                } catch (pc3 unused44) {
                    y62Var18 = y62.b;
                    return Optional.of(y62Var18);
                }
            default:
                uc3 uc3Var7 = (uc3) obj;
                try {
                    long jD = uc3Var7.c.d();
                    if (jD < 0 || jD > 2147483647L) {
                        y62Var20 = y62.A;
                    } else {
                        if ((7 & jD) == 0) {
                            uc3Var7.a.a(zc3.a(uc3Var7.c.b(jD)));
                            return Optional.empty();
                        }
                        y62Var20 = y62.f;
                    }
                    return Optional.of(y62Var20);
                } catch (fc3 unused45) {
                    y62Var19 = y62.E;
                    return Optional.of(y62Var19);
                } catch (gc3 e19) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e19);
                } catch (hc3 unused46) {
                    y62Var19 = y62.A;
                    return Optional.of(y62Var19);
                } catch (pc3 unused47) {
                    y62Var19 = y62.b;
                    return Optional.of(y62Var19);
                }
        }
    }
}
