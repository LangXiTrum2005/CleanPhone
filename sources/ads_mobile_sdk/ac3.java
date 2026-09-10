package ads_mobile_sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import saneness.anthropography;
import saneness.phraseological;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ac3 implements anthropography {
    public static final /* synthetic */ ac3 b;
    public static final /* synthetic */ ac3 c;
    public static final /* synthetic */ ac3 d;
    public static final /* synthetic */ ac3 e;
    public static final /* synthetic */ ac3 f;
    public static final /* synthetic */ ac3 g;
    public static final /* synthetic */ ac3 h;
    public static final /* synthetic */ ac3 i;
    public static final /* synthetic */ ac3 j;
    public static final /* synthetic */ ac3 k;
    public static final /* synthetic */ ac3 l;
    public static final /* synthetic */ ac3 m;
    public static final /* synthetic */ ac3 n;
    public static final /* synthetic */ ac3 o;
    public static final /* synthetic */ ac3 p;
    public static final /* synthetic */ ac3 q;
    public final /* synthetic */ int a;

    static {
        int iAttabal = sanitaria.attabal(((~1566288819) & 1018167620) | 793479703, (1566288819 & 284165456) | 1648575546, -1602978314, 292218004) ^ (846942590 % 524688209);
        q = new ac3(15);
        p = new ac3(14);
        o = new ac3(13);
        n = new ac3(12);
        m = new ac3(11);
        l = new ac3(10);
        k = new ac3(9);
        j = new ac3(8);
        i = new ac3(7);
        h = new ac3(6);
        g = new ac3(5);
        f = new ac3(4);
        e = new ac3(3);
        d = new ac3(iAttabal);
        c = new ac3(1);
        b = new ac3(0);
    }

    public /* synthetic */ ac3(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        y62 y62Var;
        y62 y62Var2;
        byte[] bArr;
        byte[] bArr2;
        y62 y62Var3;
        byte[] bArr3;
        byte[] bArr4;
        y62 y62Var4;
        y62 y62Var5;
        y62 y62Var6;
        y62 y62Var7;
        y62 y62Var8;
        y62 y62Var9;
        y62 y62Var10;
        y62 y62Var11;
        y62 y62Var12;
        zc3 zc3VarA;
        y62 y62Var13;
        y62 y62Var14;
        y62 y62Var15;
        int iAttabal = sanitaria.attabal(((~603123090) & 1079339320) | 204100681, (603123090 & 1131784560) | 52466888, 1421285553, 105108813) ^ (1216803069 % 33252481);
        switch (this.a) {
            case 0:
                return ((uc3) obj).a();
            case 1:
                try {
                    qc3 qc3Var = ((uc3) obj).a;
                    long jC = qc3Var.a().c();
                    zc3 zc3VarA2 = qc3Var.a();
                    List listE = zc3VarA2.e();
                    if (jC < 0) {
                        jC += (long) listE.size();
                    }
                    if (jC < 0 || jC >= listE.size()) {
                        throw new xc3();
                    }
                    listE.remove((int) jC);
                    qc3Var.a(zc3VarA2);
                    return Optional.empty();
                } catch (oc3 unused) {
                    y62Var = y62.y;
                    return Optional.of(y62Var);
                } catch (pc3 e2) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e2);
                } catch (wc3 unused2) {
                    y62Var = y62.z;
                    return Optional.of(y62Var);
                } catch (xc3 unused3) {
                    y62Var = y62.J;
                    return Optional.of(y62Var);
                }
            case 2:
                uc3 uc3Var = (uc3) obj;
                try {
                    qc3 qc3Var2 = uc3Var.a;
                    zc3 zc3VarA3 = qc3Var2.a();
                    dc3 dc3VarD = qc3Var2.a().d();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        zc3VarA3.a(byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        int length = byteArray.length;
                        if (length == 0) {
                            bArr = new byte[0];
                        } else {
                            byte[] bArr5 = new byte[length];
                            System.arraycopy(byteArray, 0, bArr5, 0, length);
                            bArr = bArr5;
                        }
                        byte[] bArr6 = dc3VarD.a;
                        int length2 = bArr6.length + bArr.length;
                        byte[] bArr7 = new byte[length2];
                        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
                        System.arraycopy(bArr, 0, bArr7, dc3VarD.a.length, bArr.length);
                        if (length2 == 0) {
                            bArr2 = new byte[0];
                        } else {
                            bArr2 = new byte[length2];
                            System.arraycopy(bArr7, 0, bArr2, 0, length2);
                        }
                        try {
                            uc3Var.a.a(zc3.a(new dc3(bArr2)));
                            return Optional.empty();
                        } catch (pc3 e3) {
                            throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e3);
                        }
                    } catch (wc3 unused4) {
                        y62Var2 = y62.l;
                        return Optional.of(y62Var2);
                    } catch (IOException e4) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e4);
                    }
                } catch (oc3 unused5) {
                    y62Var2 = y62.y;
                } catch (wc3 unused6) {
                    y62Var2 = y62.z;
                }
                break;
            case 3:
                uc3 uc3Var2 = (uc3) obj;
                try {
                    qc3 qc3Var3 = uc3Var2.a;
                    zc3 zc3VarA4 = qc3Var3.a();
                    dc3 dc3VarD2 = qc3Var3.a().d();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        phraseological.saneness(zc3VarA4.c(), new yc3(byteArrayOutputStream2, iAttabal), false);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        int length3 = byteArray2.length;
                        if (length3 == 0) {
                            bArr3 = new byte[0];
                        } else {
                            byte[] bArr8 = new byte[length3];
                            System.arraycopy(byteArray2, 0, bArr8, 0, length3);
                            bArr3 = bArr8;
                        }
                        byte[] bArr9 = dc3VarD2.a;
                        int length4 = bArr9.length + bArr3.length;
                        byte[] bArr10 = new byte[length4];
                        System.arraycopy(bArr9, 0, bArr10, 0, bArr9.length);
                        System.arraycopy(bArr3, 0, bArr10, dc3VarD2.a.length, bArr3.length);
                        if (length4 == 0) {
                            bArr4 = new byte[0];
                        } else {
                            bArr4 = new byte[length4];
                            System.arraycopy(bArr10, 0, bArr4, 0, length4);
                        }
                        try {
                            uc3Var2.a.a(zc3.a(new dc3(bArr4)));
                            return Optional.empty();
                        } catch (pc3 e5) {
                            throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e5);
                        }
                    } catch (wc3 unused7) {
                        y62Var3 = y62.l;
                        return Optional.of(y62Var3);
                    } catch (IOException e6) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e6);
                    }
                } catch (oc3 unused8) {
                    y62Var3 = y62.y;
                } catch (wc3 unused9) {
                    y62Var3 = y62.z;
                }
                break;
            case 4:
                uc3 uc3Var3 = (uc3) obj;
                try {
                    long jD = uc3Var3.b.a().b + uc3Var3.c.d();
                    zc3 zc3VarA5 = uc3Var3.a.a();
                    try {
                        qc3 qc3Var4 = uc3Var3.a;
                        qc3Var4.a.set(qc3Var4.a(-jD), zc3VarA5);
                        return Optional.empty();
                    } catch (oc3 unused10) {
                        y62Var4 = y62.i;
                        return Optional.of(y62Var4);
                    }
                } catch (fc3 | hc3 unused11) {
                    y62Var4 = y62.z;
                } catch (mc3 | oc3 unused12) {
                    y62Var4 = y62.y;
                }
                break;
            case 5:
                try {
                    qc3 qc3Var5 = ((uc3) obj).a;
                    qc3Var5.a(zc3.a(qc3Var5.a().c() << ((int) qc3Var5.a().c())));
                    return Optional.empty();
                } catch (oc3 unused13) {
                    y62Var5 = y62.y;
                    return Optional.of(y62Var5);
                } catch (pc3 e7) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e7);
                } catch (wc3 unused14) {
                    y62Var5 = y62.z;
                    return Optional.of(y62Var5);
                }
            case 6:
                try {
                    qc3 qc3Var6 = ((uc3) obj).a;
                    qc3Var6.a(zc3.a(qc3Var6.a().c() >>> ((int) qc3Var6.a().c())));
                    return Optional.empty();
                } catch (oc3 unused15) {
                    y62Var6 = y62.y;
                    return Optional.of(y62Var6);
                } catch (pc3 e8) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e8);
                } catch (wc3 unused16) {
                    y62Var6 = y62.z;
                    return Optional.of(y62Var6);
                }
            case 7:
                try {
                    qc3 qc3Var7 = ((uc3) obj).a;
                    qc3Var7.a(zc3.a(qc3Var7.a().g() - qc3Var7.a().g()));
                    return Optional.empty();
                } catch (oc3 unused17) {
                    y62Var7 = y62.y;
                    return Optional.of(y62Var7);
                } catch (pc3 e9) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e9);
                } catch (wc3 unused18) {
                    y62Var7 = y62.z;
                    return Optional.of(y62Var7);
                }
            case 8:
                try {
                    qc3 qc3Var8 = ((uc3) obj).a;
                    qc3Var8.a(zc3.a(qc3Var8.a().c() - qc3Var8.a().c()));
                    return Optional.empty();
                } catch (oc3 unused19) {
                    y62Var8 = y62.y;
                    return Optional.of(y62Var8);
                } catch (pc3 e10) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e10);
                } catch (wc3 unused20) {
                    y62Var8 = y62.z;
                    return Optional.of(y62Var8);
                }
            case 9:
                uc3 uc3Var4 = (uc3) obj;
                try {
                    qc3 qc3Var9 = uc3Var4.a;
                    long jC2 = qc3Var9.a().c();
                    zc3 zc3VarA6 = qc3Var9.a();
                    try {
                        qc3 qc3Var10 = uc3Var4.a;
                        zc3 zc3Var = (zc3) qc3Var10.a.get(qc3Var10.a(jC2));
                        qc3Var10.a.set(qc3Var10.a(jC2), zc3VarA6);
                        qc3Var10.a(zc3Var);
                        return Optional.empty();
                    } catch (oc3 unused21) {
                        y62Var9 = y62.i;
                        return Optional.of(y62Var9);
                    } catch (pc3 e11) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e11);
                    }
                } catch (oc3 unused22) {
                    y62Var9 = y62.y;
                } catch (wc3 unused23) {
                    y62Var9 = y62.z;
                }
                break;
            case 10:
                uc3 uc3Var5 = (uc3) obj;
                try {
                    qc3 qc3Var11 = uc3Var5.a;
                    long jC3 = uc3Var5.b.a().b + qc3Var11.a().c();
                    zc3 zc3VarA7 = qc3Var11.a();
                    try {
                        qc3 qc3Var12 = uc3Var5.a;
                        long j2 = -jC3;
                        zc3 zc3Var2 = (zc3) qc3Var12.a.get(qc3Var12.a(j2));
                        qc3Var12.a.set(qc3Var12.a(j2), zc3VarA7);
                        qc3Var12.a(zc3Var2);
                        return Optional.empty();
                    } catch (oc3 unused24) {
                        y62Var10 = y62.i;
                        return Optional.of(y62Var10);
                    } catch (pc3 e12) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e12);
                    }
                } catch (mc3 | oc3 unused25) {
                    y62Var10 = y62.y;
                } catch (wc3 unused26) {
                    y62Var10 = y62.z;
                }
                break;
            case 11:
                uc3 uc3Var6 = (uc3) obj;
                try {
                    long jD2 = uc3Var6.b.a().b + uc3Var6.c.d();
                    zc3 zc3VarA8 = uc3Var6.a.a();
                    try {
                        qc3 qc3Var13 = uc3Var6.a;
                        long j3 = -jD2;
                        zc3 zc3Var3 = (zc3) qc3Var13.a.get(qc3Var13.a(j3));
                        qc3Var13.a.set(qc3Var13.a(j3), zc3VarA8);
                        qc3Var13.a(zc3Var3);
                        return Optional.empty();
                    } catch (oc3 unused27) {
                        y62Var11 = y62.i;
                        return Optional.of(y62Var11);
                    } catch (pc3 e13) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e13);
                    }
                } catch (fc3 | hc3 unused28) {
                    y62Var11 = y62.z;
                } catch (mc3 | oc3 unused29) {
                    y62Var11 = y62.y;
                }
                break;
            case 12:
                uc3 uc3Var7 = (uc3) obj;
                try {
                    long jC4 = uc3Var7.a.a().c();
                    try {
                        qc3 qc3Var14 = uc3Var7.a;
                        if (jC4 == 0) {
                            zc3VarA = qc3Var14.a();
                        } else {
                            int iA = qc3Var14.a(jC4);
                            qc3Var14.b--;
                            zc3VarA = (zc3) qc3Var14.a.remove(iA);
                        }
                        qc3Var14.a(zc3VarA);
                        return Optional.empty();
                    } catch (oc3 unused30) {
                        y62Var12 = y62.h;
                        return Optional.of(y62Var12);
                    } catch (pc3 e14) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e14);
                    }
                } catch (oc3 unused31) {
                    y62Var12 = y62.y;
                } catch (wc3 unused32) {
                    y62Var12 = y62.z;
                }
                break;
            case 13:
                uc3 uc3Var8 = (uc3) obj;
                try {
                    qc3 qc3Var15 = uc3Var8.a;
                    long jC5 = qc3Var15.a().c();
                    long jC6 = qc3Var15.a().c();
                    nc3 nc3Var = uc3Var8.b;
                    nc3Var.a(uc3Var8.c.a(), jC6, nc3Var.a().b);
                    uc3Var8.c.a(jC5);
                    return Optional.empty();
                } catch (gc3 | hc3 unused33) {
                    y62Var13 = y62.s;
                    return Optional.of(y62Var13);
                } catch (lc3 unused34) {
                    y62Var13 = y62.C;
                    return Optional.of(y62Var13);
                } catch (mc3 unused35) {
                    y62Var13 = y62.x;
                    return Optional.of(y62Var13);
                } catch (oc3 unused36) {
                    y62Var13 = y62.y;
                    return Optional.of(y62Var13);
                } catch (wc3 unused37) {
                    y62Var13 = y62.z;
                    return Optional.of(y62Var13);
                }
            case 14:
                uc3 uc3Var9 = (uc3) obj;
                try {
                    try {
                        uc3Var9.a.a(zc3.b(uc3Var9.a.a().b()));
                        return Optional.empty();
                    } catch (pc3 e15) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e15);
                    } catch (wc3 unused38) {
                        y62Var14 = y62.q;
                        return Optional.of(y62Var14);
                    }
                } catch (oc3 unused39) {
                    y62Var14 = y62.y;
                }
                break;
            default:
                try {
                    qc3 qc3Var16 = ((uc3) obj).a;
                    Iterator it = qc3Var16.a().e().iterator();
                    while (it.hasNext()) {
                        qc3Var16.a((zc3) it.next());
                    }
                    return Optional.empty();
                } catch (oc3 unused40) {
                    y62Var15 = y62.y;
                    return Optional.of(y62Var15);
                } catch (pc3 unused41) {
                    y62Var15 = y62.b;
                    return Optional.of(y62Var15);
                } catch (wc3 unused42) {
                    y62Var15 = y62.z;
                    return Optional.of(y62Var15);
                }
        }
    }
}
