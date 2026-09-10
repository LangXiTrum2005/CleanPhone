package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mc implements cd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ mc f17373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ mc f17374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ mc f17375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ mc f17376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mc f17377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mc f17378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ mc f17379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ mc f17380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ mc f17381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ mc f17382k;
    public static final /* synthetic */ mc l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ mc f17383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ mc f17384n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ mc f17385o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ mc f17386p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ mc f17387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ mc f17388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ mc f17389s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ mc f17390t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ mc f17391u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ mc f17392v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17393a;

    static {
        int i10 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i11 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i12 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i13 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i14 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i15 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i16 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f17392v = new mc((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f17391u = new mc((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f17390t = new mc((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f17389s = new mc(i16);
        f17388r = new mc(i13);
        f17387q = new mc(i14);
        mc mcVar = new mc(i15);
        int i17 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i18 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i19 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i20 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i21 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i22 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i23 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i24 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i25 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f17386p = mcVar;
        f17385o = new mc(i12);
        f17384n = new mc(i17);
        f17383m = new mc(i18);
        l = new mc(i19);
        f17382k = new mc(i11);
        f17381j = new mc(i20);
        f17380i = new mc(i21);
        f17379h = new mc(i22);
        f17378g = new mc(i10);
        f17377f = new mc(i23);
        f17376e = new mc(i24);
        f17375d = new mc(i25);
        f17374c = new mc(1);
        f17373b = new mc(0);
    }

    public /* synthetic */ mc(int i10) {
        this.f17393a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        gc gcVar;
        long j10 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    switch (this.f17393a) {
                                        case 0:
                                            ed edVar = (ed) obj;
                                            bc.q qVar = edVar.f13933a;
                                            long jM = qVar.f().m();
                                            if (qVar.f().m() != 0) {
                                                edVar.f13935c.b(jM);
                                            }
                                            return Optional.empty();
                                        case 1:
                                            try {
                                                bc.q qVar2 = ((ed) obj).f13933a;
                                                long jM2 = qVar2.f().m();
                                                id idVarF = qVar2.f();
                                                id idVarF2 = qVar2.f();
                                                List listO = idVarF2.o();
                                                if (jM2 < 0) {
                                                    jM2 += (long) (((ArrayList) listO).size() + 1);
                                                }
                                                if (jM2 >= 0) {
                                                    ArrayList arrayList = (ArrayList) listO;
                                                    if (jM2 < arrayList.size() + 1) {
                                                        arrayList.add((int) jM2, idVarF);
                                                        qVar2.e(idVarF2);
                                                        return Optional.empty();
                                                    }
                                                }
                                                throw new hd();
                                            } catch (hd unused) {
                                                gcVar = gc.J;
                                            }
                                            break;
                                        case 2:
                                            ed edVar2 = (ed) obj;
                                            bc.q qVar3 = edVar2.f13933a;
                                            long jM3 = qVar3.f().m();
                                            if (qVar3.f().m() == 0) {
                                                edVar2.f13935c.b(jM3);
                                            }
                                            return Optional.empty();
                                        case 3:
                                            bc.q qVar4 = ((ed) obj).f13933a;
                                            qVar4.e(id.b(((ArrayList) qVar4.f().o()).size()));
                                            return Optional.empty();
                                        case 4:
                                            bc.q qVar5 = ((ed) obj).f13933a;
                                            qVar5.e(id.b(qVar5.f().n().f19023a.length));
                                            return Optional.empty();
                                        case 5:
                                            bc.q qVar6 = ((ed) obj).f13933a;
                                            qVar6.e(id.c(Math.log(qVar6.f().q())));
                                            return Optional.empty();
                                        case 6:
                                            bc.q qVar7 = ((ed) obj).f13933a;
                                            long jM4 = qVar7.f().m();
                                            long jM5 = qVar7.f().m();
                                            if (jM4 == 0 || jM5 == 0) {
                                                j10 = 0;
                                            }
                                            qVar7.e(id.b(j10));
                                            return Optional.empty();
                                        case 7:
                                            bc.q qVar8 = ((ed) obj).f13933a;
                                            if (qVar8.f().m() != 0) {
                                                j10 = 0;
                                            }
                                            qVar8.e(id.b(j10));
                                            return Optional.empty();
                                        case 8:
                                            bc.q qVar9 = ((ed) obj).f13933a;
                                            long jM6 = qVar9.f().m();
                                            long jM7 = qVar9.f().m();
                                            if (jM6 == 0 && jM7 == 0) {
                                                j10 = 0;
                                            }
                                            qVar9.e(id.b(j10));
                                            return Optional.empty();
                                        case 9:
                                            ed edVar3 = (ed) obj;
                                            bc.q qVar10 = edVar3.f13933a;
                                            try {
                                                int iCompare = new fd(false).compare(qVar10.f(), qVar10.f());
                                                bc.q qVar11 = edVar3.f13933a;
                                                if (iCompare >= 0) {
                                                    j10 = 0;
                                                }
                                                qVar11.e(id.b(j10));
                                                return Optional.empty();
                                            } catch (IllegalArgumentException unused2) {
                                                return Optional.of(gc.f14813e);
                                            }
                                        case 10:
                                            ed edVar4 = (ed) obj;
                                            try {
                                                bc.q qVar12 = edVar4.f13933a;
                                                long jM8 = qVar12.f().m();
                                                bc.q qVar13 = new bc.q(2);
                                                for (int i10 = 0; i10 < qVar12.f5574b; i10++) {
                                                    try {
                                                        qVar13.e(id.j((id) qVar12.f5573a.get(i10)));
                                                    } catch (bd e10) {
                                                        throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e10);
                                                    }
                                                }
                                                vc vcVar = edVar4.f13935c;
                                                qc qcVar = (qc) vcVar.f21149b;
                                                int i11 = vcVar.f21148a;
                                                kc kcVarMo167zzc = ((kc) vcVar.f21150c).mo167zzc();
                                                s6 s6Var = (s6) vcVar.f21151d;
                                                vc vcVar2 = new vc(qcVar, i11, kcVarMo167zzc);
                                                vcVar2.f21151d = s6Var;
                                                new so0(6);
                                                vcVar2.b(jM8);
                                                qVar12.e(id.a(new s6(23)));
                                                return Optional.empty();
                                            } catch (tc | uc unused3) {
                                                gcVar = gc.f14828u;
                                            }
                                            break;
                                        case 11:
                                            try {
                                                bc.q qVar14 = ((ed) obj).f13933a;
                                                qVar14.e(id.a(qVar14.f().i((Class) qVar14.f().l())));
                                                return Optional.empty();
                                            } catch (gd unused4) {
                                                gcVar = gc.f14824q;
                                            }
                                            break;
                                        case 12:
                                            bc.q qVar15 = ((ed) obj).f13933a;
                                            long jM9 = qVar15.f().m();
                                            long jM10 = qVar15.f().m();
                                            if (jM9 == 0) {
                                                return Optional.of(gc.G);
                                            }
                                            qVar15.e(id.b(jM10 % jM9));
                                            return Optional.empty();
                                        case 13:
                                            bc.q qVar16 = ((ed) obj).f13933a;
                                            qVar16.e(id.c(qVar16.f().q() * qVar16.f().q()));
                                            return Optional.empty();
                                        case 14:
                                            bc.q qVar17 = ((ed) obj).f13933a;
                                            qVar17.e(id.b(qVar17.f().m() * qVar17.f().m()));
                                            return Optional.empty();
                                        case 15:
                                            bc.q qVar18 = ((ed) obj).f13933a;
                                            long jM11 = qVar18.f().m();
                                            ArrayList arrayList2 = new ArrayList();
                                            for (long j11 = 0; j11 < jM11; j11++) {
                                                arrayList2.add(qVar18.f());
                                            }
                                            Collections.reverse(arrayList2);
                                            qVar18.e(id.e(arrayList2));
                                            return Optional.empty();
                                        case 16:
                                            bc.q qVar19 = ((ed) obj).f13933a;
                                            qVar19.e(id.c(Math.pow(qVar19.f().q(), qVar19.f().q())));
                                            return Optional.empty();
                                        case 17:
                                            ((ed) obj).f13933a.e(id.a(null));
                                            return Optional.empty();
                                        case 18:
                                            ed edVar5 = (ed) obj;
                                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(edVar5.f13935c.h(64L).a());
                                            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                            edVar5.f13933a.e(id.c(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                            return Optional.empty();
                                        case 19:
                                            ed edVar6 = (ed) obj;
                                            edVar6.f13933a.e(id.b(edVar6.f13935c.g()));
                                            return Optional.empty();
                                        default:
                                            ed edVar7 = (ed) obj;
                                            vc vcVar3 = edVar7.f13935c;
                                            long jG = vcVar3.g();
                                            if (jG >= 0 && jG <= 2147483647L) {
                                                if ((7 & jG) != 0) {
                                                    return Optional.of(gc.f14814f);
                                                }
                                                edVar7.f13933a.e(id.d(vcVar3.h(jG)));
                                                return Optional.empty();
                                            }
                                            return Optional.of(gc.A);
                                    }
                                } catch (uc unused5) {
                                    gcVar = gc.A;
                                }
                            } catch (sc unused6) {
                                gcVar = gc.E;
                            }
                        } catch (tc | uc unused7) {
                            gcVar = gc.f14818j;
                        }
                    } catch (gd unused8) {
                        gcVar = gc.f14833z;
                    }
                } catch (ad unused9) {
                    gcVar = gc.f14832y;
                }
            } catch (bd unused10) {
                gcVar = gc.f14810b;
            }
        } catch (bd | tc e11) {
            throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e11);
        }
        return Optional.of(gcVar);
    }
}
