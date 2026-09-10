package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc implements cd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ lc f16848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ lc f16849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ lc f16850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ lc f16851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ lc f16852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ lc f16853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ lc f16854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ lc f16855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ lc f16856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ lc f16857k;
    public static final /* synthetic */ lc l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ lc f16858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ lc f16859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ lc f16860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ lc f16861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ lc f16862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ lc f16863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ lc f16864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ lc f16865t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ lc f16866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ lc f16867v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16868a;

    static {
        int i10 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i11 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i12 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i13 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i14 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i15 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i16 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        f16867v = new lc((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        f16866u = new lc((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        f16865t = new lc((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        f16864s = new lc(i16);
        f16863r = new lc(i13);
        f16862q = new lc(i14);
        lc lcVar = new lc(i15);
        int i17 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i18 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i19 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i20 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i21 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i22 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i23 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i24 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i25 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        f16861p = lcVar;
        f16860o = new lc(i12);
        f16859n = new lc(i17);
        f16858m = new lc(i18);
        l = new lc(i19);
        f16857k = new lc(i11);
        f16856j = new lc(i20);
        f16855i = new lc(i21);
        f16854h = new lc(i22);
        f16853g = new lc(i10);
        f16852f = new lc(i23);
        f16851e = new lc(i24);
        f16850d = new lc(i25);
        f16849c = new lc(1);
        f16848b = new lc(0);
    }

    public /* synthetic */ lc(int i10) {
        this.f16868a = i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:96:0x01b6 A[Catch: bd -> 0x0044, ad | zc -> 0x00c4, ClassNotFoundException -> 0x01c6, gd -> 0x01ca, TryCatch #8 {bd -> 0x0044, blocks: (B:5:0x0016, B:9:0x0032, B:11:0x003a, B:16:0x004b, B:18:0x0056, B:31:0x00b5, B:19:0x005f, B:20:0x0064, B:21:0x0065, B:23:0x006d, B:24:0x0072, B:28:0x007a, B:30:0x0082, B:34:0x00bd, B:35:0x00c2, B:36:0x00c3, B:41:0x00d3, B:42:0x00e5, B:44:0x00eb, B:50:0x0119, B:47:0x00fa, B:48:0x0101, B:52:0x0120, B:59:0x013f, B:64:0x015d, B:97:0x01ba, B:68:0x0168, B:72:0x0173, B:79:0x0187, B:83:0x0192, B:87:0x019d, B:91:0x01a8, B:95:0x01b3, B:96:0x01b6, B:103:0x01d2, B:107:0x01e9, B:112:0x020c, B:119:0x023a, B:124:0x025b, B:133:0x0283, B:135:0x0299, B:143:0x02c7, B:136:0x029c, B:140:0x02ad, B:142:0x02c5, B:145:0x02cc, B:164:0x034b, B:190:0x03f7, B:192:0x03ff, B:196:0x0409, B:199:0x0417, B:197:0x040e, B:198:0x0413, B:211:0x0459, B:215:0x047c, B:219:0x04ca, B:223:0x04e6, B:236:0x052d, B:240:0x0553, B:244:0x0576), top: B:252:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        gc gcVar;
        Object obj2;
        gc gcVar2;
        int i10 = this.f16868a;
        long j10 = 1;
        Class<?> cls = Void.TYPE;
        Object obj3 = null;
        int i11 = 0;
        try {
            try {
                try {
                    try {
                        switch (i10) {
                            case 0:
                                bc.q qVar = ((ed) obj).f13933a;
                                qVar.e(id.b(qVar.f().m() + qVar.f().m()));
                                return Optional.empty();
                            case 1:
                                bc.q qVar2 = ((ed) obj).f13933a;
                                qVar2.e(id.c(qVar2.f().q() + qVar2.f().q()));
                                return Optional.empty();
                            case 2:
                                bc.q qVar3 = ((ed) obj).f13933a;
                                qVar3.e(id.d(qVar3.f().n().d(qVar3.f().n())));
                                return Optional.empty();
                            case 3:
                                ed edVar = (ed) obj;
                                try {
                                    long jG = edVar.f13935c.g();
                                    for (long j11 = 0; j11 < jG; j11++) {
                                        edVar.f13933a.e(id.a(null));
                                    }
                                    return Optional.empty();
                                } catch (bd unused) {
                                    gcVar = gc.f14810b;
                                    return Optional.of(gcVar);
                                }
                            case 4:
                                bc.q qVar4 = ((ed) obj).f13933a;
                                qVar4.e(id.b(qVar4.f().m() & qVar4.f().m()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j12 = jArr[0];
                                long j13 = jArr[1];
                                long j14 = jArr[2];
                                long j15 = jArr[3];
                                long j16 = jArr[4];
                                long j17 = jArr[5];
                                long j18 = jArr[6];
                                long j19 = jArr[7];
                                long j20 = (((((~j12) & j13) | j14) + ((j12 & j15) | j16)) - j17) + j18;
                                long j21 = j19 % 102194872;
                                bc.q qVar5 = ((ed) obj).f13933a;
                                qVar5.e(id.b((j20 ^ j21) ^ qVar5.f().m()));
                                return Optional.empty();
                            case 6:
                                bc.q qVar6 = ((ed) obj).f13933a;
                                qVar6.e(id.b(qVar6.f().m() | qVar6.f().m()));
                                return Optional.empty();
                            case 7:
                                bc.q qVar7 = ((ed) obj).f13933a;
                                qVar7.e(id.b(qVar7.f().m() ^ qVar7.f().m()));
                                return Optional.empty();
                            case 8:
                                ed edVar2 = (ed) obj;
                                try {
                                    bc.q qVar8 = edVar2.f13933a;
                                    long jM = qVar8.f().m();
                                    so0 so0Var = edVar2.f13934b;
                                    vc vcVar = edVar2.f13935c;
                                    so0Var.d(vcVar.c(), 0L, qVar8.f5574b);
                                    vcVar.b(jM);
                                    return Optional.empty();
                                } catch (tc | uc unused2) {
                                    gcVar = gc.f14826s;
                                    return Optional.of(gcVar);
                                } catch (yc unused3) {
                                    gcVar = gc.C;
                                    return Optional.of(gcVar);
                                }
                            case 9:
                                try {
                                    bc.q qVar9 = ((ed) obj).f13933a;
                                    long jM2 = qVar9.f().m();
                                    ArrayList arrayList = (ArrayList) qVar9.f().o();
                                    int size = arrayList.size();
                                    Object objH = qVar9.f().h();
                                    Object objL = qVar9.f().l();
                                    if (objL instanceof Method) {
                                        Method method = (Method) objL;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (objH instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) objH).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                ArrayList arrayList2 = (ArrayList) ((id) arrayList.get(0)).o();
                                                if (arrayList2.size() == length) {
                                                    int i12 = 0;
                                                    while (i12 < arrayList2.size()) {
                                                        objArr2[i12] = ((id) arrayList2.get(i12)).i(parameterTypes2[i12]);
                                                        i12++;
                                                        obj3 = obj3;
                                                    }
                                                    obj2 = obj3;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                obj2 = null;
                                                while (i11 < size) {
                                                    objArr[i11] = ((id) arrayList.get(i11)).i(parameterTypes[i11]);
                                                    i11++;
                                                }
                                            }
                                            try {
                                                Object objInvoke = method.invoke(objH, objArr);
                                                qVar9.e((method.getReturnType() == Void.class || method.getReturnType() == cls) ? id.a(obj2) : jM2 != 0 ? id.g(objInvoke) : id.a(objInvoke));
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                gcVar = gc.f14825r;
                                                return Optional.of(gcVar);
                                            }
                                        }
                                    }
                                    return Optional.of(gc.f14824q);
                                } catch (gd unused5) {
                                    gcVar = gc.f14824q;
                                }
                                break;
                            case 10:
                                ed edVar3 = (ed) obj;
                                bc.q qVar10 = edVar3.f13933a;
                                int intExact = Math.toIntExact(qVar10.f().m());
                                qc qcVarN = qVar10.f().n();
                                qc qcVarN2 = qVar10.f().n();
                                if (qcVarN.f19023a.length != 16) {
                                    return Optional.of(gc.I);
                                }
                                int[] iArr = new int[4];
                                ByteBuffer.wrap(qcVarN.a()).asIntBuffer().get(iArr);
                                b2.w wVar = new b2.w(intExact, 3, iArr);
                                byte[] bArrA = qcVarN2.a();
                                byte[] bArr = new byte[8];
                                int i13 = 0;
                                while (i13 < bArrA.length) {
                                    if (i13 % 8 == 0) {
                                        wVar.l(i13 >>> 3, bArr);
                                    } else if (i13 == 0) {
                                        i13 = 0;
                                        wVar.l(i13 >>> 3, bArr);
                                    }
                                    bArrA[i13] = (byte) (((bArrA[i13] ^ bArr[i13 % 8]) << 24) >> 24);
                                    i13++;
                                }
                                edVar3.f13933a.e(id.d(qc.e(bArrA)));
                                return Optional.empty();
                            case 11:
                                bc.q qVar11 = ((ed) obj).f13933a;
                                double dQ = qVar11.f().q();
                                double dQ2 = qVar11.f().q();
                                if (dQ == 0.0d) {
                                    gcVar2 = gc.G;
                                    return Optional.of(gcVar2);
                                }
                                qVar11.e(id.c(dQ2 / dQ));
                                return Optional.empty();
                            case 12:
                                bc.q qVar12 = ((ed) obj).f13933a;
                                long jM3 = qVar12.f().m();
                                long jM4 = qVar12.f().m();
                                if (jM3 == 0) {
                                    gcVar2 = gc.G;
                                    return Optional.of(gcVar2);
                                }
                                qVar12.e(id.b(jM4 / jM3));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((ed) obj).f13933a.f();
                                    return Optional.empty();
                                } catch (ad unused6) {
                                    gcVar = gc.B;
                                    return Optional.of(gcVar);
                                }
                            case 14:
                                ed edVar4 = (ed) obj;
                                long jM5 = edVar4.f13933a.f().m();
                                bc.q qVar13 = edVar4.f13933a;
                                qVar13.e(id.j(qVar13.g(jM5)));
                                return Optional.empty();
                            case 15:
                                ed edVar5 = (ed) obj;
                                long jM6 = edVar5.f13934b.i().f21834b + edVar5.f13933a.f().m();
                                bc.q qVar14 = edVar5.f13933a;
                                qVar14.e(id.j(qVar14.g(-jM6)));
                                return Optional.empty();
                            case 16:
                                ed edVar6 = (ed) obj;
                                long jG2 = edVar6.f13934b.i().f21834b + edVar6.f13935c.g();
                                bc.q qVar15 = edVar6.f13933a;
                                qVar15.e(id.j(qVar15.g(-jG2)));
                                return Optional.empty();
                            case 17:
                                try {
                                    bc.q qVar16 = ((ed) obj).f13933a;
                                    if (new fd(true).compare(qVar16.f(), qVar16.f()) != 0) {
                                        j10 = 0;
                                    }
                                    qVar16.e(id.b(j10));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    gcVar = gc.f14813e;
                                    return Optional.of(gcVar);
                                }
                            case 18:
                                try {
                                    bc.q qVar17 = ((ed) obj).f13933a;
                                    String strC = qVar17.f().n().c();
                                    switch (strC.hashCode()) {
                                        case -1325958191:
                                            if (strC.equals("double")) {
                                                cls = Double.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 104431:
                                            if (strC.equals("int")) {
                                                cls = Integer.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3039496:
                                            if (strC.equals("byte")) {
                                                cls = Byte.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3052374:
                                            if (strC.equals("char")) {
                                                cls = Character.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3327612:
                                            if (strC.equals(Constants.LONG)) {
                                                cls = Long.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3625364:
                                            if (!strC.equals("void")) {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 64711720:
                                            if (strC.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 97526364:
                                            if (strC.equals("float")) {
                                                cls = Float.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 109413500:
                                            if (strC.equals("short")) {
                                                cls = Short.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        default:
                                            cls = Class.forName(strC);
                                            break;
                                    }
                                    qVar17.e(id.a(cls));
                                    return Optional.empty();
                                } catch (gd unused8) {
                                    gcVar = gc.f14820m;
                                    return Optional.of(gcVar);
                                } catch (ClassNotFoundException unused9) {
                                    gcVar = gc.f14821n;
                                    return Optional.of(gcVar);
                                }
                            case 19:
                                try {
                                    bc.q qVar18 = ((ed) obj).f13933a;
                                    ArrayList arrayList3 = (ArrayList) qVar18.f().o();
                                    Class<?>[] clsArr = new Class[arrayList3.size()];
                                    while (i11 < arrayList3.size()) {
                                        Object objL2 = ((id) arrayList3.get(i11)).l();
                                        if (!(objL2 instanceof Class)) {
                                            return Optional.of(gc.f14822o);
                                        }
                                        clsArr[i11] = (Class) objL2;
                                        i11++;
                                    }
                                    String strC2 = qVar18.f().n().c();
                                    Object objL3 = qVar18.f().l();
                                    if (objL3 instanceof Class) {
                                        qVar18.e(id.a(((Class) objL3).getMethod(strC2, clsArr)));
                                        return Optional.empty();
                                    }
                                    return Optional.of(gc.f14822o);
                                } catch (gd unused10) {
                                    gcVar = gc.f14822o;
                                    return Optional.of(gcVar);
                                } catch (NoSuchMethodException unused11) {
                                    gcVar = gc.f14823p;
                                    return Optional.of(gcVar);
                                } catch (SecurityException unused12) {
                                    gcVar = gc.D;
                                    return Optional.of(gcVar);
                                }
                            default:
                                bc.q qVar19 = ((ed) obj).f13933a;
                                long jM7 = qVar19.f().m();
                                id idVarF = qVar19.f();
                                id idVarF2 = qVar19.f();
                                int i14 = idVarF2.f15715g;
                                int i15 = i14 - 1;
                                if (i14 == 0) {
                                    throw null;
                                }
                                if (i15 == 3) {
                                    qc qcVarN3 = idVarF2.n();
                                    if (jM7 < 0) {
                                        jM7 += (long) qcVarN3.f19023a.length;
                                    }
                                    if (idVarF.f15715g != 4) {
                                        throw new gd();
                                    }
                                    if (jM7 >= 0 && jM7 < qcVarN3.f19023a.length) {
                                        char cCharAt = qcVarN3.c().charAt((int) jM7);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length());
                                        sb2.append(cCharAt);
                                        idVarF = id.d(qc.e(sb2.toString().getBytes(Charset.forName(pc.a("Hn2H4l0=")))));
                                    }
                                } else {
                                    if (i15 != 4) {
                                        throw new gd();
                                    }
                                    List listO = idVarF2.o();
                                    if (jM7 < 0) {
                                        jM7 += (long) ((ArrayList) listO).size();
                                    }
                                    if (jM7 >= 0) {
                                        ArrayList arrayList4 = (ArrayList) listO;
                                        if (jM7 < arrayList4.size()) {
                                            idVarF = (id) arrayList4.get((int) jM7);
                                        }
                                    }
                                }
                                qVar19.e(idVarF);
                                return Optional.empty();
                        }
                    } catch (ad unused13) {
                        gcVar = gc.f14815g;
                    }
                } catch (ad | zc unused14) {
                    gcVar = gc.f14832y;
                }
            } catch (gd | sc | uc unused15) {
                gcVar = gc.f14833z;
            }
        } catch (bd e10) {
            throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e10);
        }
    }
}
