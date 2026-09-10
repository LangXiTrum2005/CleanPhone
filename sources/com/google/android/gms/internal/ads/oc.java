package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc implements cd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ oc f18217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ oc f18218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ oc f18219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ oc f18220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ oc f18221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ oc f18222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ oc f18223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ oc f18224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ oc f18225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ oc f18226k;
    public static final /* synthetic */ oc l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ oc f18227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ oc f18228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ oc f18229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ oc f18230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ oc f18231q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18232a;

    static {
        int i10 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i11 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i12 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i13 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i14 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i15 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i16 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i17 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i18 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i19 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i20 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i21 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        f18231q = new oc((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        f18230p = new oc((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        f18229o = new oc(i21);
        f18228n = new oc(i12);
        f18227m = new oc(i13);
        l = new oc(i14);
        f18226k = new oc(i11);
        f18225j = new oc(i15);
        f18224i = new oc(i16);
        f18223h = new oc(i17);
        f18222g = new oc(i10);
        f18221f = new oc(i18);
        f18220e = new oc(i19);
        f18219d = new oc(i20);
        f18218c = new oc(1);
        f18217b = new oc(0);
    }

    public /* synthetic */ oc(int i10) {
        this.f18232a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws IOException {
        gc gcVar;
        id idVarF;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.f18232a) {
                                case 0:
                                    return ((ed) obj).a();
                                case 1:
                                    try {
                                        bc.q qVar = ((ed) obj).f13933a;
                                        long jM = qVar.f().m();
                                        id idVarF2 = qVar.f();
                                        List listO = idVarF2.o();
                                        if (jM < 0) {
                                            jM += (long) ((ArrayList) listO).size();
                                        }
                                        if (jM >= 0) {
                                            ArrayList arrayList = (ArrayList) listO;
                                            if (jM < arrayList.size()) {
                                                arrayList.remove((int) jM);
                                                qVar.e(idVarF2);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new hd();
                                    } catch (hd unused) {
                                        gcVar = gc.J;
                                    }
                                    break;
                                case 2:
                                    ed edVar = (ed) obj;
                                    bc.q qVar2 = edVar.f13933a;
                                    id idVarF3 = qVar2.f();
                                    qc qcVarN = qVar2.f().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    idVarF3.k(byteArrayOutputStream);
                                    edVar.f13933a.e(id.d(qcVarN.d(qc.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    ed edVar2 = (ed) obj;
                                    bc.q qVar3 = edVar2.f13933a;
                                    id idVarF4 = qVar3.f();
                                    qc qcVarN2 = qVar3.f().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    s6.r(idVarF4.m(), new x11(byteArrayOutputStream2, 5), false);
                                    edVar2.f13933a.e(id.d(qcVarN2.d(qc.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    ed edVar3 = (ed) obj;
                                    vc vcVar = edVar3.f13935c;
                                    bc.q qVar4 = edVar3.f13933a;
                                    qVar4.f5573a.set(qVar4.d(-(edVar3.f13934b.i().f21834b + vcVar.g())), qVar4.f());
                                    return Optional.empty();
                                case 5:
                                    bc.q qVar5 = ((ed) obj).f13933a;
                                    qVar5.e(id.b(qVar5.f().m() << ((int) qVar5.f().m())));
                                    return Optional.empty();
                                case 6:
                                    bc.q qVar6 = ((ed) obj).f13933a;
                                    qVar6.e(id.b(qVar6.f().m() >>> ((int) qVar6.f().m())));
                                    return Optional.empty();
                                case 7:
                                    bc.q qVar7 = ((ed) obj).f13933a;
                                    qVar7.e(id.c(qVar7.f().q() - qVar7.f().q()));
                                    return Optional.empty();
                                case 8:
                                    bc.q qVar8 = ((ed) obj).f13933a;
                                    qVar8.e(id.b(qVar8.f().m() - qVar8.f().m()));
                                    return Optional.empty();
                                case 9:
                                    ed edVar4 = (ed) obj;
                                    bc.q qVar9 = edVar4.f13933a;
                                    long jM2 = qVar9.f().m();
                                    id idVarF5 = qVar9.f();
                                    bc.q qVar10 = edVar4.f13933a;
                                    id idVarG = qVar10.g(jM2);
                                    qVar10.f5573a.set(qVar10.d(jM2), idVarF5);
                                    qVar10.e(idVarG);
                                    return Optional.empty();
                                case 10:
                                    ed edVar5 = (ed) obj;
                                    bc.q qVar11 = edVar5.f13933a;
                                    long jM3 = edVar5.f13934b.i().f21834b + qVar11.f().m();
                                    id idVarF6 = qVar11.f();
                                    bc.q qVar12 = edVar5.f13933a;
                                    long j10 = -jM3;
                                    id idVarG2 = qVar12.g(j10);
                                    qVar12.f5573a.set(qVar12.d(j10), idVarF6);
                                    qVar12.e(idVarG2);
                                    return Optional.empty();
                                case 11:
                                    ed edVar6 = (ed) obj;
                                    vc vcVar2 = edVar6.f13935c;
                                    bc.q qVar13 = edVar6.f13933a;
                                    long jG = edVar6.f13934b.i().f21834b + vcVar2.g();
                                    id idVarF7 = qVar13.f();
                                    long j11 = -jG;
                                    id idVarG3 = qVar13.g(j11);
                                    qVar13.f5573a.set(qVar13.d(j11), idVarF7);
                                    qVar13.e(idVarG3);
                                    return Optional.empty();
                                case 12:
                                    ed edVar7 = (ed) obj;
                                    long jM4 = edVar7.f13933a.f().m();
                                    try {
                                        bc.q qVar14 = edVar7.f13933a;
                                        if (jM4 == 0) {
                                            idVarF = qVar14.f();
                                        } else {
                                            int iD = qVar14.d(jM4);
                                            qVar14.f5574b--;
                                            idVarF = (id) qVar14.f5573a.remove(iD);
                                        }
                                        qVar14.e(idVarF);
                                        return Optional.empty();
                                    } catch (ad unused2) {
                                        gcVar = gc.f14816h;
                                    }
                                    break;
                                case 13:
                                    ed edVar8 = (ed) obj;
                                    try {
                                        bc.q qVar15 = edVar8.f13933a;
                                        long jM5 = qVar15.f().m();
                                        long jM6 = qVar15.f().m();
                                        so0 so0Var = edVar8.f13934b;
                                        vc vcVar3 = edVar8.f13935c;
                                        so0Var.d(vcVar3.c(), jM6, so0Var.i().f21834b);
                                        vcVar3.b(jM5);
                                        return Optional.empty();
                                    } catch (tc | uc unused3) {
                                        gcVar = gc.f14826s;
                                    } catch (yc unused4) {
                                        gcVar = gc.C;
                                    } catch (zc unused5) {
                                        gcVar = gc.f14831x;
                                    }
                                    break;
                                case 14:
                                    ed edVar9 = (ed) obj;
                                    try {
                                        edVar9.f13933a.e(id.g(edVar9.f13933a.f().l()));
                                        return Optional.empty();
                                    } catch (gd unused6) {
                                        gcVar = gc.f14824q;
                                    }
                                    break;
                                default:
                                    try {
                                        bc.q qVar16 = ((ed) obj).f13933a;
                                        Iterator it = ((ArrayList) qVar16.f().o()).iterator();
                                        while (it.hasNext()) {
                                            qVar16.e((id) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (bd unused7) {
                                        gcVar = gc.f14810b;
                                    }
                                    break;
                            }
                        } catch (gd unused8) {
                            gcVar = gc.l;
                        }
                    } catch (gd | sc | uc unused9) {
                        gcVar = gc.f14833z;
                    }
                } catch (ad | zc unused10) {
                    gcVar = gc.f14832y;
                }
            } catch (bd | IOException e10) {
                throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e10);
            }
        } catch (ad unused11) {
            gcVar = gc.f14817i;
        }
        return Optional.of(gcVar);
    }
}
