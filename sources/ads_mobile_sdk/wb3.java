package ads_mobile_sdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;
import saneness.anthropography;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb3 implements anthropography {
    public static final /* synthetic */ wb3 b;
    public static final /* synthetic */ wb3 c;
    public static final /* synthetic */ wb3 d;
    public static final /* synthetic */ wb3 e;
    public static final /* synthetic */ wb3 f;
    public static final /* synthetic */ wb3 g;
    public static final /* synthetic */ wb3 h;
    public static final /* synthetic */ wb3 i;
    public static final /* synthetic */ wb3 j;
    public static final /* synthetic */ wb3 k;
    public static final /* synthetic */ wb3 l;
    public static final /* synthetic */ wb3 m;
    public static final /* synthetic */ wb3 n;
    public static final /* synthetic */ wb3 o;
    public static final /* synthetic */ wb3 p;
    public static final /* synthetic */ wb3 q;
    public static final /* synthetic */ wb3 r;
    public static final /* synthetic */ wb3 s;
    public static final /* synthetic */ wb3 t;
    public static final /* synthetic */ wb3 u;
    public static final /* synthetic */ wb3 v;
    public final /* synthetic */ int a;

    static {
        int iAttabal = sanitaria.attabal(((~1424268980) & 433259076) | 136627722, (1424268980 & 299303110) | 33824130, 606102243, 157354814) ^ (1129566413 % 184803526);
        v = new wb3(20);
        u = new wb3(19);
        t = new wb3(18);
        s = new wb3(17);
        r = new wb3(16);
        q = new wb3(15);
        p = new wb3(14);
        o = new wb3(13);
        n = new wb3(12);
        m = new wb3(11);
        l = new wb3(10);
        k = new wb3(9);
        j = new wb3(8);
        i = new wb3(7);
        h = new wb3(6);
        g = new wb3(5);
        f = new wb3(4);
        e = new wb3(3);
        d = new wb3(iAttabal);
        c = new wb3(1);
        b = new wb3(0);
    }

    public /* synthetic */ wb3(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01f5 A[Catch: pc3 -> 0x019c, ClassNotFoundException -> 0x020f, wc3 -> 0x0216, oc3 -> 0x0219, TryCatch #30 {oc3 -> 0x0219, pc3 -> 0x019c, wc3 -> 0x0216, ClassNotFoundException -> 0x020f, blocks: (B:72:0x016b, B:77:0x0199, B:112:0x01f9, B:83:0x01a7, B:87:0x01b2, B:94:0x01c6, B:98:0x01d1, B:102:0x01dc, B:106:0x01e7, B:110:0x01f2, B:111:0x01f5), top: B:443:0x016b }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
        qc3 qc3Var;
        zc3 zc3VarA;
        y62 y62Var11;
        byte[] bArr;
        y62 y62Var12;
        y62 y62Var13;
        y62 y62Var14;
        y62 y62Var15;
        y62 y62Var16;
        y62 y62Var17;
        y62 y62Var18;
        y62 y62Var19;
        y62 y62Var20;
        y62 y62Var21;
        zc3 zc3VarA2;
        int i2 = this.a;
        long j2 = 1;
        Class<?> cls = Void.TYPE;
        switch (i2) {
            case 0:
                try {
                    qc3 qc3Var2 = ((uc3) obj).a;
                    qc3Var2.a(zc3.a(qc3Var2.a().c() + qc3Var2.a().c()));
                    return Optional.empty();
                } catch (oc3 unused) {
                    y62Var = y62.y;
                    return Optional.of(y62Var);
                } catch (pc3 e2) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e2);
                } catch (wc3 unused2) {
                    y62Var = y62.z;
                    return Optional.of(y62Var);
                }
            case 1:
                try {
                    qc3 qc3Var3 = ((uc3) obj).a;
                    qc3Var3.a(zc3.a(qc3Var3.a().g() + qc3Var3.a().g()));
                    return Optional.empty();
                } catch (oc3 unused3) {
                    y62Var2 = y62.y;
                    return Optional.of(y62Var2);
                } catch (pc3 e3) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e3);
                } catch (wc3 unused4) {
                    y62Var2 = y62.z;
                    return Optional.of(y62Var2);
                }
            case 2:
                try {
                    qc3 qc3Var4 = ((uc3) obj).a;
                    qc3Var4.a(zc3.a(qc3Var4.a().d().a(qc3Var4.a().d())));
                    return Optional.empty();
                } catch (oc3 unused5) {
                    y62Var3 = y62.y;
                    return Optional.of(y62Var3);
                } catch (pc3 e4) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e4);
                } catch (wc3 unused6) {
                    y62Var3 = y62.z;
                    return Optional.of(y62Var3);
                }
            case 3:
                uc3 uc3Var = (uc3) obj;
                try {
                    long jD = uc3Var.c.d();
                    for (long j3 = 0; j3 < jD; j3++) {
                        uc3Var.a.a(zc3.a((Object) null));
                    }
                    return Optional.empty();
                } catch (fc3 | hc3 unused7) {
                    y62Var4 = y62.z;
                    return Optional.of(y62Var4);
                } catch (pc3 unused8) {
                    y62Var4 = y62.b;
                    return Optional.of(y62Var4);
                }
            case 4:
                try {
                    qc3 qc3Var5 = ((uc3) obj).a;
                    qc3Var5.a(zc3.a(qc3Var5.a().c() & qc3Var5.a().c()));
                    return Optional.empty();
                } catch (oc3 unused9) {
                    y62Var5 = y62.y;
                    return Optional.of(y62Var5);
                } catch (pc3 e5) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e5);
                } catch (wc3 unused10) {
                    y62Var5 = y62.z;
                    return Optional.of(y62Var5);
                }
            case 5:
                try {
                    qc3 qc3Var6 = ((uc3) obj).a;
                    qc3Var6.a(zc3.a(~qc3Var6.a().c()));
                    return Optional.empty();
                } catch (oc3 unused11) {
                    y62Var6 = y62.y;
                    return Optional.of(y62Var6);
                } catch (pc3 e6) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e6);
                } catch (wc3 unused12) {
                    y62Var6 = y62.z;
                    return Optional.of(y62Var6);
                }
            case 6:
                try {
                    qc3 qc3Var7 = ((uc3) obj).a;
                    qc3Var7.a(zc3.a(qc3Var7.a().c() | qc3Var7.a().c()));
                    return Optional.empty();
                } catch (oc3 unused13) {
                    y62Var7 = y62.y;
                    return Optional.of(y62Var7);
                } catch (pc3 e7) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e7);
                } catch (wc3 unused14) {
                    y62Var7 = y62.z;
                    return Optional.of(y62Var7);
                }
            case 7:
                try {
                    qc3 qc3Var8 = ((uc3) obj).a;
                    qc3Var8.a(zc3.a(qc3Var8.a().c() ^ qc3Var8.a().c()));
                    return Optional.empty();
                } catch (oc3 unused15) {
                    y62Var8 = y62.y;
                    return Optional.of(y62Var8);
                } catch (pc3 e8) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e8);
                } catch (wc3 unused16) {
                    y62Var8 = y62.z;
                    return Optional.of(y62Var8);
                }
            case 8:
                uc3 uc3Var2 = (uc3) obj;
                try {
                    qc3 qc3Var9 = uc3Var2.a;
                    long jC = qc3Var9.a().c();
                    uc3Var2.b.a(uc3Var2.c.a(), 0L, qc3Var9.b);
                    uc3Var2.c.a(jC);
                    return Optional.empty();
                } catch (gc3 | hc3 unused17) {
                    y62Var9 = y62.s;
                    return Optional.of(y62Var9);
                } catch (lc3 unused18) {
                    y62Var9 = y62.C;
                    return Optional.of(y62Var9);
                } catch (oc3 unused19) {
                    y62Var9 = y62.y;
                    return Optional.of(y62Var9);
                } catch (wc3 unused20) {
                    y62Var9 = y62.z;
                    return Optional.of(y62Var9);
                }
            case 9:
                uc3 uc3Var3 = (uc3) obj;
                try {
                    qc3 qc3Var10 = uc3Var3.a;
                    long jC2 = qc3Var10.a().c();
                    List listE = qc3Var10.a().e();
                    int size = listE.size();
                    Object objA = qc3Var10.a().a();
                    Object objB = qc3Var10.a().b();
                    if (objB instanceof Method) {
                        Method method = (Method) objB;
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == size) {
                            Object[] objArr = new Object[size];
                            if (objA instanceof Constructor) {
                                Class<?>[] parameterTypes2 = ((Constructor) objA).getParameterTypes();
                                int length = parameterTypes2.length;
                                Object[] objArr2 = new Object[length];
                                List listE2 = ((zc3) listE.get(0)).e();
                                if (listE2.size() == length) {
                                    for (int i3 = 0; i3 < listE2.size(); i3++) {
                                        objArr2[i3] = ((zc3) listE2.get(i3)).a((Class) parameterTypes2[i3]);
                                    }
                                    objArr[0] = objArr2;
                                }
                            } else {
                                for (int i4 = 0; i4 < size; i4++) {
                                    objArr[i4] = ((zc3) listE.get(i4)).a((Class) parameterTypes[i4]);
                                }
                            }
                            try {
                                Object objInvoke = method.invoke(objA, objArr);
                                try {
                                    if (method.getReturnType() == Void.class || method.getReturnType() == cls) {
                                        qc3Var = uc3Var3.a;
                                        zc3VarA = zc3.a((Object) null);
                                    } else if (jC2 != 0) {
                                        qc3Var = uc3Var3.a;
                                        zc3VarA = zc3.b(objInvoke);
                                    } else {
                                        qc3Var = uc3Var3.a;
                                        zc3VarA = zc3.a(objInvoke);
                                    }
                                    qc3Var.a(zc3VarA);
                                    return Optional.empty();
                                } catch (pc3 e9) {
                                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e9);
                                }
                            } catch (Throwable unused21) {
                                y62Var10 = y62.r;
                                return Optional.of(y62Var10);
                            }
                        }
                    }
                    return Optional.of(y62.q);
                } catch (oc3 unused22) {
                    y62Var10 = y62.y;
                } catch (wc3 unused23) {
                    y62Var10 = y62.q;
                }
                break;
            case 10:
                uc3 uc3Var4 = (uc3) obj;
                try {
                    qc3 qc3Var11 = uc3Var4.a;
                    int intExact = Math.toIntExact(qc3Var11.a().c());
                    dc3 dc3VarD = qc3Var11.a().d();
                    dc3 dc3VarD2 = qc3Var11.a().d();
                    if (dc3VarD.a.length != 16) {
                        return Optional.of(y62.I);
                    }
                    int[] iArr = new int[4];
                    ByteBuffer.wrap(dc3VarD.a()).asIntBuffer().get(iArr);
                    vb3 vb3Var = new vb3(intExact, iArr);
                    byte[] bArrA = dc3VarD2.a();
                    byte[] bArr2 = new byte[8];
                    int i5 = 0;
                    while (i5 < bArrA.length) {
                        if (i5 % 8 == 0) {
                            vb3Var.a(i5 >>> 3, bArr2);
                        } else if (i5 == 0) {
                            i5 = 0;
                            vb3Var.a(i5 >>> 3, bArr2);
                        }
                        bArrA[i5] = (byte) (((bArrA[i5] ^ bArr2[i5 % 8]) << 24) >> 24);
                        i5++;
                    }
                    int length2 = bArrA.length;
                    if (length2 == 0) {
                        bArr = new byte[0];
                    } else {
                        byte[] bArr3 = new byte[length2];
                        System.arraycopy(bArrA, 0, bArr3, 0, length2);
                        bArr = bArr3;
                    }
                    try {
                        uc3Var4.a.a(zc3.a(new dc3(bArr)));
                        return Optional.empty();
                    } catch (pc3 e10) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e10);
                    }
                } catch (oc3 unused24) {
                    y62Var11 = y62.y;
                    return Optional.of(y62Var11);
                } catch (wc3 unused25) {
                    y62Var11 = y62.z;
                    return Optional.of(y62Var11);
                }
            case 11:
                try {
                    qc3 qc3Var12 = ((uc3) obj).a;
                    double dG = qc3Var12.a().g();
                    double dG2 = qc3Var12.a().g();
                    if (dG == 0.0d) {
                        return Optional.of(y62.G);
                    }
                    qc3Var12.a(zc3.a(dG2 / dG));
                    return Optional.empty();
                } catch (oc3 unused26) {
                    y62Var12 = y62.y;
                    return Optional.of(y62Var12);
                } catch (pc3 e11) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e11);
                } catch (wc3 unused27) {
                    y62Var12 = y62.z;
                    return Optional.of(y62Var12);
                }
            case 12:
                try {
                    qc3 qc3Var13 = ((uc3) obj).a;
                    long jC3 = qc3Var13.a().c();
                    long jC4 = qc3Var13.a().c();
                    if (jC3 == 0) {
                        return Optional.of(y62.G);
                    }
                    qc3Var13.a(zc3.a(jC4 / jC3));
                    return Optional.empty();
                } catch (oc3 unused28) {
                    y62Var13 = y62.y;
                    return Optional.of(y62Var13);
                } catch (pc3 e12) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e12);
                } catch (wc3 unused29) {
                    y62Var13 = y62.z;
                    return Optional.of(y62Var13);
                }
            case 13:
                try {
                    ((uc3) obj).a.a();
                    return Optional.empty();
                } catch (oc3 unused30) {
                    return Optional.of(y62.B);
                }
            case 14:
                uc3 uc3Var5 = (uc3) obj;
                try {
                    long jC5 = uc3Var5.a.a().c();
                    try {
                        qc3 qc3Var14 = uc3Var5.a;
                        qc3Var14.a(zc3.a((zc3) qc3Var14.a.get(qc3Var14.a(jC5))));
                        return Optional.empty();
                    } catch (oc3 unused31) {
                        y62Var14 = y62.g;
                        return Optional.of(y62Var14);
                    } catch (pc3 e13) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e13);
                    }
                } catch (oc3 unused32) {
                    y62Var14 = y62.y;
                } catch (wc3 unused33) {
                    y62Var14 = y62.z;
                }
                break;
            case 15:
                uc3 uc3Var6 = (uc3) obj;
                try {
                    long jC6 = uc3Var6.b.a().b + uc3Var6.a.a().c();
                    try {
                        qc3 qc3Var15 = uc3Var6.a;
                        qc3Var15.a(zc3.a((zc3) qc3Var15.a.get(qc3Var15.a(-jC6))));
                        return Optional.empty();
                    } catch (oc3 unused34) {
                        y62Var15 = y62.g;
                        return Optional.of(y62Var15);
                    } catch (pc3 e14) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e14);
                    }
                } catch (mc3 | oc3 unused35) {
                    y62Var15 = y62.y;
                } catch (wc3 unused36) {
                    y62Var15 = y62.z;
                }
                break;
            case 16:
                uc3 uc3Var7 = (uc3) obj;
                try {
                    long jD2 = uc3Var7.b.a().b + uc3Var7.c.d();
                    try {
                        qc3 qc3Var16 = uc3Var7.a;
                        qc3Var16.a(zc3.a((zc3) qc3Var16.a.get(qc3Var16.a(-jD2))));
                        return Optional.empty();
                    } catch (oc3 unused37) {
                        y62Var16 = y62.g;
                        return Optional.of(y62Var16);
                    } catch (pc3 e15) {
                        throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e15);
                    }
                } catch (fc3 | hc3 unused38) {
                    y62Var16 = y62.z;
                } catch (mc3 unused39) {
                    y62Var16 = y62.y;
                }
                break;
            case 17:
                try {
                    qc3 qc3Var17 = ((uc3) obj).a;
                    if (new vc3(true).compare(qc3Var17.a(), qc3Var17.a()) != 0) {
                        j2 = 0;
                    }
                    qc3Var17.a(zc3.a(j2));
                    return Optional.empty();
                } catch (oc3 unused40) {
                    y62Var17 = y62.y;
                    return Optional.of(y62Var17);
                } catch (pc3 e16) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e16);
                } catch (IllegalArgumentException unused41) {
                    y62Var17 = y62.e;
                    return Optional.of(y62Var17);
                }
            case 18:
                try {
                    qc3 qc3Var18 = ((uc3) obj).a;
                    dc3 dc3VarD3 = qc3Var18.a().d();
                    dc3VarD3.getClass();
                    Charset charsetForName = Charset.forName(bc3.a("Hn2H4l0="));
                    byte[] bArr4 = dc3VarD3.a;
                    String str = new String(bArr4, 0, bArr4.length, charsetForName);
                    switch (str.hashCode()) {
                        case -1325958191:
                            if (str.equals("double")) {
                                cls = Double.TYPE;
                            } else {
                                cls = Class.forName(str);
                            }
                            break;
                        case 104431:
                            if (str.equals("int")) {
                                cls = Integer.TYPE;
                            } else {
                                cls = Class.forName(str);
                            }
                            break;
                        case 3039496:
                            if (str.equals("byte")) {
                                cls = Byte.TYPE;
                            } else {
                                cls = Class.forName(str);
                            }
                            break;
                        case 3052374:
                            if (str.equals("char")) {
                                cls = Character.TYPE;
                            } else {
                                cls = Class.forName(str);
                            }
                            break;
                        case 3327612:
                            if (str.equals("long")) {
                                cls = Long.TYPE;
                            } else {
                                cls = Class.forName(str);
                            }
                            break;
                        case 3625364:
                            if (!str.equals("void")) {
                                cls = Class.forName(str);
                            }
                            break;
                        case 64711720:
                            if (str.equals("boolean")) {
                                cls = Boolean.TYPE;
                            } else {
                                cls = Class.forName(str);
                            }
                            break;
                        case 97526364:
                            if (str.equals("float")) {
                                cls = Float.TYPE;
                            } else {
                                cls = Class.forName(str);
                            }
                            break;
                        case 109413500:
                            if (str.equals("short")) {
                                cls = Short.TYPE;
                            } else {
                                cls = Class.forName(str);
                            }
                            break;
                        default:
                            cls = Class.forName(str);
                            break;
                    }
                    qc3Var18.a(zc3.a((Object) cls));
                    return Optional.empty();
                } catch (oc3 unused42) {
                    y62Var18 = y62.y;
                    return Optional.of(y62Var18);
                } catch (pc3 e17) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e17);
                } catch (wc3 unused43) {
                    y62Var18 = y62.m;
                    return Optional.of(y62Var18);
                } catch (ClassNotFoundException unused44) {
                    y62Var18 = y62.n;
                    return Optional.of(y62Var18);
                }
            case 19:
                try {
                    qc3 qc3Var19 = ((uc3) obj).a;
                    List listE3 = qc3Var19.a().e();
                    Class<?>[] clsArr = new Class[listE3.size()];
                    for (int i6 = 0; i6 < listE3.size(); i6++) {
                        Object objB2 = ((zc3) listE3.get(i6)).b();
                        if (!(objB2 instanceof Class)) {
                            y62Var20 = y62.o;
                            return Optional.of(y62Var20);
                        }
                        clsArr[i6] = (Class) objB2;
                    }
                    dc3 dc3VarD4 = qc3Var19.a().d();
                    dc3VarD4.getClass();
                    Charset charsetForName2 = Charset.forName(bc3.a("Hn2H4l0="));
                    byte[] bArr5 = dc3VarD4.a;
                    String str2 = new String(bArr5, 0, bArr5.length, charsetForName2);
                    Object objB3 = qc3Var19.a().b();
                    if (objB3 instanceof Class) {
                        qc3Var19.a(zc3.a(((Class) objB3).getMethod(str2, clsArr)));
                        return Optional.empty();
                    }
                    y62Var20 = y62.o;
                    return Optional.of(y62Var20);
                } catch (oc3 unused45) {
                    y62Var19 = y62.y;
                    return Optional.of(y62Var19);
                } catch (pc3 e18) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e18);
                } catch (wc3 unused46) {
                    y62Var19 = y62.o;
                    return Optional.of(y62Var19);
                } catch (NoSuchMethodException unused47) {
                    y62Var19 = y62.p;
                    return Optional.of(y62Var19);
                } catch (SecurityException unused48) {
                    y62Var19 = y62.D;
                    return Optional.of(y62Var19);
                }
            default:
                try {
                    qc3 qc3Var20 = ((uc3) obj).a;
                    long jC7 = qc3Var20.a().c();
                    zc3 zc3VarA3 = qc3Var20.a();
                    zc3 zc3VarA4 = qc3Var20.a();
                    int i7 = zc3VarA4.g;
                    int i8 = i7 - 1;
                    if (i7 == 0) {
                        throw null;
                    }
                    if (i8 == 3) {
                        dc3 dc3VarD5 = zc3VarA4.d();
                        if (jC7 < 0) {
                            jC7 += (long) dc3VarD5.a.length;
                        }
                        if (zc3VarA3.g != 4) {
                            throw new wc3();
                        }
                        if (jC7 >= 0 && jC7 < dc3VarD5.a.length) {
                            Charset charsetForName3 = Charset.forName(bc3.a("Hn2H4l0="));
                            byte[] bArr6 = dc3VarD5.a;
                            char cCharAt = new String(bArr6, 0, bArr6.length, charsetForName3).charAt((int) jC7);
                            StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length());
                            sb.append(cCharAt);
                            zc3VarA2 = zc3.a(dc3.a(sb.toString()));
                            zc3VarA3 = zc3VarA2;
                        }
                    } else {
                        if (i8 != 4) {
                            throw new wc3();
                        }
                        List listE4 = zc3VarA4.e();
                        if (jC7 < 0) {
                            jC7 += (long) listE4.size();
                        }
                        if (jC7 >= 0 && jC7 < listE4.size()) {
                            zc3VarA2 = (zc3) listE4.get((int) jC7);
                            zc3VarA3 = zc3VarA2;
                        }
                    }
                    qc3Var20.a(zc3VarA3);
                    return Optional.empty();
                } catch (oc3 unused49) {
                    y62Var21 = y62.y;
                    return Optional.of(y62Var21);
                } catch (pc3 e19) {
                    throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e19);
                } catch (wc3 unused50) {
                    y62Var21 = y62.z;
                    return Optional.of(y62Var21);
                }
        }
    }
}
