package j2;

import android.content.Context;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.consent_sdk.x;
import com.ironsource.C0520pe;
import com.ironsource.F9;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import f2.c0;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import l1.u;
import n1.z;
import oa.j0;
import oa.n1;
import oa.o0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements d, z {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n1 f43640p = j0.A(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n1 f43641q = j0.A(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n1 f43642r = j0.A(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n1 f43643s = j0.A(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n1 f43644t = j0.A(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final n1 f43645u = j0.A(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static g f43646v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f43648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final am.e f43649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f43650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f43652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f43655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f43656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f43657k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f43658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f43659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f43660o;

    public g(Context context, HashMap map) {
        boolean z10;
        u uVar = u.f44822a;
        this.f43647a = context == null ? null : context.getApplicationContext();
        this.f43648b = o0.e(map);
        this.f43649c = new am.e(11);
        this.f43652f = new s();
        this.f43650d = uVar;
        this.f43651e = true;
        if (context == null) {
            this.f43659n = 0;
            this.l = 1000000L;
            return;
        }
        l1.p pVarA = l1.p.a(context);
        int iB = pVarA.b();
        this.f43659n = iB;
        this.l = a(iB);
        f fVar = new f(this);
        Executor executorG = l1.a.g();
        CopyOnWriteArrayList<l1.o> copyOnWriteArrayList = pVarA.f44805b;
        for (l1.o oVar : copyOnWriteArrayList) {
            if (oVar.f44800a.get() == null) {
                copyOnWriteArrayList.remove(oVar);
            }
        }
        l1.o oVar2 = new l1.o(pVarA, fVar, executorG);
        synchronized (pVarA.f44806c) {
            pVarA.f44805b.add(oVar2);
            z10 = pVarA.f44808e;
        }
        if (z10) {
            oVar2.f44801b.execute(new com.mbridge.msdk.config.component.info.provider.subprovider.f(oVar2, 19));
        }
    }

    /* JADX WARN: Code duplicated, block: B:1149:0x1216  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final long a(int i10) {
        int[] iArr;
        long jLongValue;
        Integer numValueOf = Integer.valueOf(i10);
        o0 o0Var = this.f43648b;
        Long lValueOf = (Long) o0Var.get(numValueOf);
        if (lValueOf == null) {
            lValueOf = (Long) o0Var.get(0);
        } else if (lValueOf.longValue() == C.TIME_UNSET) {
            String str = this.f43660o;
            if (str == null) {
                str = "";
            }
            byte b10 = -1;
            switch (str.hashCode()) {
                case 2083:
                    if (str.equals("AD")) {
                        b10 = 0;
                    }
                    break;
                case 2084:
                    if (str.equals("AE")) {
                        b10 = 1;
                    }
                    break;
                case 2085:
                    if (str.equals("AF")) {
                        b10 = 2;
                    }
                    break;
                case 2086:
                    if (str.equals("AG")) {
                        b10 = 3;
                    }
                    break;
                case 2088:
                    if (str.equals("AI")) {
                        b10 = 4;
                    }
                    break;
                case 2091:
                    if (str.equals("AL")) {
                        b10 = 5;
                    }
                    break;
                case 2092:
                    if (str.equals("AM")) {
                        b10 = 6;
                    }
                    break;
                case 2094:
                    if (str.equals("AO")) {
                        b10 = 7;
                    }
                    break;
                case 2096:
                    if (str.equals("AQ")) {
                        b10 = 8;
                    }
                    break;
                case 2097:
                    if (str.equals("AR")) {
                        b10 = 9;
                    }
                    break;
                case 2098:
                    if (str.equals("AS")) {
                        b10 = 10;
                    }
                    break;
                case 2099:
                    if (str.equals("AT")) {
                        b10 = 11;
                    }
                    break;
                case C0520pe.f30018g /* 2100 */:
                    if (str.equals("AU")) {
                        b10 = 12;
                    }
                    break;
                case 2102:
                    if (str.equals("AW")) {
                        b10 = 13;
                    }
                    break;
                case 2103:
                    if (str.equals("AX")) {
                        b10 = 14;
                    }
                    break;
                case 2105:
                    if (str.equals("AZ")) {
                        b10 = 15;
                    }
                    break;
                case 2111:
                    if (str.equals("BA")) {
                        b10 = 16;
                    }
                    break;
                case 2112:
                    if (str.equals("BB")) {
                        b10 = 17;
                    }
                    break;
                case 2114:
                    if (str.equals("BD")) {
                        b10 = 18;
                    }
                    break;
                case 2115:
                    if (str.equals("BE")) {
                        b10 = 19;
                    }
                    break;
                case 2116:
                    if (str.equals("BF")) {
                        b10 = 20;
                    }
                    break;
                case 2117:
                    if (str.equals("BG")) {
                        b10 = 21;
                    }
                    break;
                case 2118:
                    if (str.equals("BH")) {
                        b10 = 22;
                    }
                    break;
                case 2119:
                    if (str.equals("BI")) {
                        b10 = 23;
                    }
                    break;
                case 2120:
                    if (str.equals("BJ")) {
                        b10 = 24;
                    }
                    break;
                case 2122:
                    if (str.equals("BL")) {
                        b10 = 25;
                    }
                    break;
                case 2123:
                    if (str.equals("BM")) {
                        b10 = 26;
                    }
                    break;
                case 2124:
                    if (str.equals("BN")) {
                        b10 = 27;
                    }
                    break;
                case 2125:
                    if (str.equals("BO")) {
                        b10 = 28;
                    }
                    break;
                case 2127:
                    if (str.equals("BQ")) {
                        b10 = 29;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        b10 = 30;
                    }
                    break;
                case 2129:
                    if (str.equals("BS")) {
                        b10 = 31;
                    }
                    break;
                case 2130:
                    if (str.equals("BT")) {
                        b10 = 32;
                    }
                    break;
                case 2133:
                    if (str.equals("BW")) {
                        b10 = 33;
                    }
                    break;
                case 2135:
                    if (str.equals("BY")) {
                        b10 = 34;
                    }
                    break;
                case 2136:
                    if (str.equals("BZ")) {
                        b10 = 35;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        b10 = 36;
                    }
                    break;
                case 2145:
                    if (str.equals("CD")) {
                        b10 = 37;
                    }
                    break;
                case 2147:
                    if (str.equals("CF")) {
                        b10 = 38;
                    }
                    break;
                case 2148:
                    if (str.equals("CG")) {
                        b10 = 39;
                    }
                    break;
                case 2149:
                    if (str.equals("CH")) {
                        b10 = 40;
                    }
                    break;
                case 2150:
                    if (str.equals("CI")) {
                        b10 = 41;
                    }
                    break;
                case 2152:
                    if (str.equals("CK")) {
                        b10 = 42;
                    }
                    break;
                case 2153:
                    if (str.equals("CL")) {
                        b10 = 43;
                    }
                    break;
                case 2154:
                    if (str.equals("CM")) {
                        b10 = 44;
                    }
                    break;
                case 2155:
                    if (str.equals("CN")) {
                        b10 = 45;
                    }
                    break;
                case 2156:
                    if (str.equals("CO")) {
                        b10 = 46;
                    }
                    break;
                case 2159:
                    if (str.equals("CR")) {
                        b10 = 47;
                    }
                    break;
                case 2162:
                    if (str.equals("CU")) {
                        b10 = 48;
                    }
                    break;
                case 2163:
                    if (str.equals("CV")) {
                        b10 = 49;
                    }
                    break;
                case 2164:
                    if (str.equals("CW")) {
                        b10 = 50;
                    }
                    break;
                case 2165:
                    if (str.equals("CX")) {
                        b10 = 51;
                    }
                    break;
                case 2166:
                    if (str.equals("CY")) {
                        b10 = 52;
                    }
                    break;
                case 2167:
                    if (str.equals("CZ")) {
                        b10 = 53;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        b10 = 54;
                    }
                    break;
                case 2182:
                    if (str.equals("DJ")) {
                        b10 = 55;
                    }
                    break;
                case 2183:
                    if (str.equals("DK")) {
                        b10 = 56;
                    }
                    break;
                case 2185:
                    if (str.equals("DM")) {
                        b10 = 57;
                    }
                    break;
                case 2187:
                    if (str.equals("DO")) {
                        b10 = 58;
                    }
                    break;
                case 2198:
                    if (str.equals("DZ")) {
                        b10 = 59;
                    }
                    break;
                case 2206:
                    if (str.equals("EC")) {
                        b10 = 60;
                    }
                    break;
                case 2208:
                    if (str.equals("EE")) {
                        b10 = 61;
                    }
                    break;
                case F9.a.f26069e /* 2210 */:
                    if (str.equals("EG")) {
                        b10 = 62;
                    }
                    break;
                case 2221:
                    if (str.equals("ER")) {
                        b10 = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        b10 = 64;
                    }
                    break;
                case 2223:
                    if (str.equals("ET")) {
                        b10 = 65;
                    }
                    break;
                case 2243:
                    if (str.equals("FI")) {
                        b10 = 66;
                    }
                    break;
                case 2244:
                    if (str.equals("FJ")) {
                        b10 = 67;
                    }
                    break;
                case 2245:
                    if (str.equals("FK")) {
                        b10 = 68;
                    }
                    break;
                case 2247:
                    if (str.equals("FM")) {
                        b10 = 69;
                    }
                    break;
                case 2249:
                    if (str.equals("FO")) {
                        b10 = 70;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        b10 = 71;
                    }
                    break;
                case 2266:
                    if (str.equals("GA")) {
                        b10 = 72;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        b10 = 73;
                    }
                    break;
                case 2269:
                    if (str.equals("GD")) {
                        b10 = 74;
                    }
                    break;
                case 2270:
                    if (str.equals("GE")) {
                        b10 = 75;
                    }
                    break;
                case 2271:
                    if (str.equals("GF")) {
                        b10 = 76;
                    }
                    break;
                case 2272:
                    if (str.equals("GG")) {
                        b10 = 77;
                    }
                    break;
                case 2273:
                    if (str.equals("GH")) {
                        b10 = 78;
                    }
                    break;
                case 2274:
                    if (str.equals("GI")) {
                        b10 = 79;
                    }
                    break;
                case 2277:
                    if (str.equals("GL")) {
                        b10 = 80;
                    }
                    break;
                case 2278:
                    if (str.equals("GM")) {
                        b10 = 81;
                    }
                    break;
                case 2279:
                    if (str.equals("GN")) {
                        b10 = 82;
                    }
                    break;
                case 2281:
                    if (str.equals("GP")) {
                        b10 = 83;
                    }
                    break;
                case 2282:
                    if (str.equals("GQ")) {
                        b10 = 84;
                    }
                    break;
                case 2283:
                    if (str.equals("GR")) {
                        b10 = 85;
                    }
                    break;
                case 2285:
                    if (str.equals("GT")) {
                        b10 = 86;
                    }
                    break;
                case 2286:
                    if (str.equals("GU")) {
                        b10 = 87;
                    }
                    break;
                case 2288:
                    if (str.equals("GW")) {
                        b10 = 88;
                    }
                    break;
                case 2290:
                    if (str.equals("GY")) {
                        b10 = 89;
                    }
                    break;
                case 2307:
                    if (str.equals("HK")) {
                        b10 = 90;
                    }
                    break;
                case 2314:
                    if (str.equals("HR")) {
                        b10 = 91;
                    }
                    break;
                case 2316:
                    if (str.equals("HT")) {
                        b10 = 92;
                    }
                    break;
                case 2317:
                    if (str.equals("HU")) {
                        b10 = 93;
                    }
                    break;
                case 2331:
                    if (str.equals("ID")) {
                        b10 = 94;
                    }
                    break;
                case 2332:
                    if (str.equals("IE")) {
                        b10 = 95;
                    }
                    break;
                case 2339:
                    if (str.equals("IL")) {
                        b10 = 96;
                    }
                    break;
                case 2340:
                    if (str.equals("IM")) {
                        b10 = 97;
                    }
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        b10 = 98;
                    }
                    break;
                case 2342:
                    if (str.equals("IO")) {
                        b10 = 99;
                    }
                    break;
                case 2344:
                    if (str.equals("IQ")) {
                        b10 = 100;
                    }
                    break;
                case 2345:
                    if (str.equals("IR")) {
                        b10 = 101;
                    }
                    break;
                case 2346:
                    if (str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                        b10 = 102;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        b10 = 103;
                    }
                    break;
                case 2363:
                    if (str.equals("JE")) {
                        b10 = 104;
                    }
                    break;
                case 2371:
                    if (str.equals("JM")) {
                        b10 = 105;
                    }
                    break;
                case 2373:
                    if (str.equals("JO")) {
                        b10 = 106;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        b10 = 107;
                    }
                    break;
                case 2394:
                    if (str.equals("KE")) {
                        b10 = 108;
                    }
                    break;
                case 2396:
                    if (str.equals("KG")) {
                        b10 = 109;
                    }
                    break;
                case 2397:
                    if (str.equals("KH")) {
                        b10 = 110;
                    }
                    break;
                case 2398:
                    if (str.equals("KI")) {
                        b10 = 111;
                    }
                    break;
                case 2402:
                    if (str.equals("KM")) {
                        b10 = 112;
                    }
                    break;
                case 2403:
                    if (str.equals("KN")) {
                        b10 = 113;
                    }
                    break;
                case 2407:
                    if (str.equals("KR")) {
                        b10 = 114;
                    }
                    break;
                case 2412:
                    if (str.equals("KW")) {
                        b10 = 115;
                    }
                    break;
                case 2414:
                    if (str.equals("KY")) {
                        b10 = 116;
                    }
                    break;
                case 2415:
                    if (str.equals("KZ")) {
                        b10 = 117;
                    }
                    break;
                case 2421:
                    if (str.equals("LA")) {
                        b10 = 118;
                    }
                    break;
                case 2422:
                    if (str.equals("LB")) {
                        b10 = 119;
                    }
                    break;
                case 2423:
                    if (str.equals("LC")) {
                        b10 = 120;
                    }
                    break;
                case 2429:
                    if (str.equals("LI")) {
                        b10 = 121;
                    }
                    break;
                case 2431:
                    if (str.equals("LK")) {
                        b10 = 122;
                    }
                    break;
                case 2438:
                    if (str.equals("LR")) {
                        b10 = 123;
                    }
                    break;
                case 2439:
                    if (str.equals("LS")) {
                        b10 = 124;
                    }
                    break;
                case 2440:
                    if (str.equals("LT")) {
                        b10 = 125;
                    }
                    break;
                case 2441:
                    if (str.equals("LU")) {
                        b10 = 126;
                    }
                    break;
                case 2442:
                    if (str.equals("LV")) {
                        b10 = 127;
                    }
                    break;
                case 2445:
                    if (str.equals("LY")) {
                        b10 = 128;
                    }
                    break;
                case 2452:
                    if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                        b10 = 129;
                    }
                    break;
                case 2454:
                    if (str.equals("MC")) {
                        b10 = 130;
                    }
                    break;
                case 2455:
                    if (str.equals("MD")) {
                        b10 = 131;
                    }
                    break;
                case 2456:
                    if (str.equals("ME")) {
                        b10 = 132;
                    }
                    break;
                case 2457:
                    if (str.equals("MF")) {
                        b10 = 133;
                    }
                    break;
                case 2458:
                    if (str.equals("MG")) {
                        b10 = 134;
                    }
                    break;
                case 2459:
                    if (str.equals("MH")) {
                        b10 = 135;
                    }
                    break;
                case 2462:
                    if (str.equals("MK")) {
                        b10 = 136;
                    }
                    break;
                case 2463:
                    if (str.equals("ML")) {
                        b10 = 137;
                    }
                    break;
                case 2464:
                    if (str.equals("MM")) {
                        b10 = 138;
                    }
                    break;
                case 2465:
                    if (str.equals("MN")) {
                        b10 = 139;
                    }
                    break;
                case 2466:
                    if (str.equals("MO")) {
                        b10 = 140;
                    }
                    break;
                case 2467:
                    if (str.equals("MP")) {
                        b10 = 141;
                    }
                    break;
                case 2468:
                    if (str.equals("MQ")) {
                        b10 = 142;
                    }
                    break;
                case 2469:
                    if (str.equals("MR")) {
                        b10 = 143;
                    }
                    break;
                case 2470:
                    if (str.equals("MS")) {
                        b10 = 144;
                    }
                    break;
                case 2471:
                    if (str.equals("MT")) {
                        b10 = 145;
                    }
                    break;
                case 2472:
                    if (str.equals("MU")) {
                        b10 = 146;
                    }
                    break;
                case 2473:
                    if (str.equals("MV")) {
                        b10 = 147;
                    }
                    break;
                case 2474:
                    if (str.equals("MW")) {
                        b10 = 148;
                    }
                    break;
                case 2475:
                    if (str.equals("MX")) {
                        b10 = 149;
                    }
                    break;
                case 2476:
                    if (str.equals("MY")) {
                        b10 = 150;
                    }
                    break;
                case 2477:
                    if (str.equals("MZ")) {
                        b10 = 151;
                    }
                    break;
                case 2483:
                    if (str.equals("NA")) {
                        b10 = 152;
                    }
                    break;
                case 2485:
                    if (str.equals("NC")) {
                        b10 = 153;
                    }
                    break;
                case 2487:
                    if (str.equals("NE")) {
                        b10 = 154;
                    }
                    break;
                case 2488:
                    if (str.equals("NF")) {
                        b10 = 155;
                    }
                    break;
                case 2489:
                    if (str.equals("NG")) {
                        b10 = 156;
                    }
                    break;
                case 2491:
                    if (str.equals("NI")) {
                        b10 = 157;
                    }
                    break;
                case 2494:
                    if (str.equals("NL")) {
                        b10 = 158;
                    }
                    break;
                case 2497:
                    if (str.equals("NO")) {
                        b10 = 159;
                    }
                    break;
                case 2498:
                    if (str.equals("NP")) {
                        b10 = 160;
                    }
                    break;
                case 2500:
                    if (str.equals("NR")) {
                        b10 = 161;
                    }
                    break;
                case F9.b.f26079e /* 2503 */:
                    if (str.equals("NU")) {
                        b10 = 162;
                    }
                    break;
                case 2508:
                    if (str.equals("NZ")) {
                        b10 = 163;
                    }
                    break;
                case 2526:
                    if (str.equals("OM")) {
                        b10 = 164;
                    }
                    break;
                case 2545:
                    if (str.equals("PA")) {
                        b10 = 165;
                    }
                    break;
                case 2549:
                    if (str.equals("PE")) {
                        b10 = 166;
                    }
                    break;
                case 2550:
                    if (str.equals("PF")) {
                        b10 = 167;
                    }
                    break;
                case 2551:
                    if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                        b10 = 168;
                    }
                    break;
                case 2552:
                    if (str.equals("PH")) {
                        b10 = 169;
                    }
                    break;
                case 2555:
                    if (str.equals("PK")) {
                        b10 = 170;
                    }
                    break;
                case 2556:
                    if (str.equals("PL")) {
                        b10 = 171;
                    }
                    break;
                case 2557:
                    if (str.equals("PM")) {
                        b10 = 172;
                    }
                    break;
                case 2562:
                    if (str.equals("PR")) {
                        b10 = 173;
                    }
                    break;
                case 2563:
                    if (str.equals("PS")) {
                        b10 = 174;
                    }
                    break;
                case 2564:
                    if (str.equals("PT")) {
                        b10 = 175;
                    }
                    break;
                case 2567:
                    if (str.equals("PW")) {
                        b10 = 176;
                    }
                    break;
                case 2569:
                    if (str.equals("PY")) {
                        b10 = 177;
                    }
                    break;
                case 2576:
                    if (str.equals("QA")) {
                        b10 = 178;
                    }
                    break;
                case 2611:
                    if (str.equals("RE")) {
                        b10 = 179;
                    }
                    break;
                case 2621:
                    if (str.equals("RO")) {
                        b10 = 180;
                    }
                    break;
                case 2625:
                    if (str.equals("RS")) {
                        b10 = 181;
                    }
                    break;
                case 2627:
                    if (str.equals("RU")) {
                        b10 = 182;
                    }
                    break;
                case 2629:
                    if (str.equals("RW")) {
                        b10 = 183;
                    }
                    break;
                case 2638:
                    if (str.equals("SA")) {
                        b10 = 184;
                    }
                    break;
                case 2639:
                    if (str.equals("SB")) {
                        b10 = 185;
                    }
                    break;
                case 2640:
                    if (str.equals("SC")) {
                        b10 = 186;
                    }
                    break;
                case 2641:
                    if (str.equals("SD")) {
                        b10 = 187;
                    }
                    break;
                case 2642:
                    if (str.equals("SE")) {
                        b10 = 188;
                    }
                    break;
                case 2644:
                    if (str.equals("SG")) {
                        b10 = 189;
                    }
                    break;
                case 2645:
                    if (str.equals("SH")) {
                        b10 = 190;
                    }
                    break;
                case 2646:
                    if (str.equals("SI")) {
                        b10 = 191;
                    }
                    break;
                case 2647:
                    if (str.equals("SJ")) {
                        b10 = 192;
                    }
                    break;
                case 2648:
                    if (str.equals("SK")) {
                        b10 = 193;
                    }
                    break;
                case 2649:
                    if (str.equals("SL")) {
                        b10 = 194;
                    }
                    break;
                case 2650:
                    if (str.equals("SM")) {
                        b10 = 195;
                    }
                    break;
                case 2651:
                    if (str.equals("SN")) {
                        b10 = 196;
                    }
                    break;
                case 2652:
                    if (str.equals("SO")) {
                        b10 = 197;
                    }
                    break;
                case 2655:
                    if (str.equals("SR")) {
                        b10 = 198;
                    }
                    break;
                case 2656:
                    if (str.equals("SS")) {
                        b10 = 199;
                    }
                    break;
                case 2657:
                    if (str.equals("ST")) {
                        b10 = 200;
                    }
                    break;
                case 2659:
                    if (str.equals("SV")) {
                        b10 = 201;
                    }
                    break;
                case 2661:
                    if (str.equals("SX")) {
                        b10 = 202;
                    }
                    break;
                case 2662:
                    if (str.equals("SY")) {
                        b10 = 203;
                    }
                    break;
                case 2663:
                    if (str.equals("SZ")) {
                        b10 = 204;
                    }
                    break;
                case 2671:
                    if (str.equals("TC")) {
                        b10 = 205;
                    }
                    break;
                case 2672:
                    if (str.equals("TD")) {
                        b10 = 206;
                    }
                    break;
                case 2675:
                    if (str.equals("TG")) {
                        b10 = 207;
                    }
                    break;
                case 2676:
                    if (str.equals("TH")) {
                        b10 = 208;
                    }
                    break;
                case 2678:
                    if (str.equals("TJ")) {
                        b10 = 209;
                    }
                    break;
                case 2680:
                    if (str.equals("TL")) {
                        b10 = 210;
                    }
                    break;
                case 2681:
                    if (str.equals("TM")) {
                        b10 = 211;
                    }
                    break;
                case 2682:
                    if (str.equals("TN")) {
                        b10 = 212;
                    }
                    break;
                case 2683:
                    if (str.equals("TO")) {
                        b10 = 213;
                    }
                    break;
                case 2686:
                    if (str.equals("TR")) {
                        b10 = 214;
                    }
                    break;
                case 2688:
                    if (str.equals("TT")) {
                        b10 = 215;
                    }
                    break;
                case 2690:
                    if (str.equals("TV")) {
                        b10 = 216;
                    }
                    break;
                case 2691:
                    if (str.equals("TW")) {
                        b10 = 217;
                    }
                    break;
                case 2694:
                    if (str.equals("TZ")) {
                        b10 = 218;
                    }
                    break;
                case 2700:
                    if (str.equals("UA")) {
                        b10 = 219;
                    }
                    break;
                case 2706:
                    if (str.equals("UG")) {
                        b10 = 220;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        b10 = 221;
                    }
                    break;
                case 2724:
                    if (str.equals("UY")) {
                        b10 = 222;
                    }
                    break;
                case 2725:
                    if (str.equals("UZ")) {
                        b10 = 223;
                    }
                    break;
                case 2731:
                    if (str.equals("VA")) {
                        b10 = 224;
                    }
                    break;
                case 2733:
                    if (str.equals("VC")) {
                        b10 = 225;
                    }
                    break;
                case 2735:
                    if (str.equals("VE")) {
                        b10 = 226;
                    }
                    break;
                case 2737:
                    if (str.equals("VG")) {
                        b10 = 227;
                    }
                    break;
                case 2739:
                    if (str.equals("VI")) {
                        b10 = 228;
                    }
                    break;
                case 2744:
                    if (str.equals("VN")) {
                        b10 = 229;
                    }
                    break;
                case 2751:
                    if (str.equals("VU")) {
                        b10 = 230;
                    }
                    break;
                case 2767:
                    if (str.equals("WF")) {
                        b10 = 231;
                    }
                    break;
                case 2780:
                    if (str.equals("WS")) {
                        b10 = 232;
                    }
                    break;
                case 2803:
                    if (str.equals("XK")) {
                        b10 = 233;
                    }
                    break;
                case 2828:
                    if (str.equals("YE")) {
                        b10 = 234;
                    }
                    break;
                case 2843:
                    if (str.equals("YT")) {
                        b10 = 235;
                    }
                    break;
                case 2855:
                    if (str.equals("ZA")) {
                        b10 = 236;
                    }
                    break;
                case 2867:
                    if (str.equals("ZM")) {
                        b10 = 237;
                    }
                    break;
                case 2877:
                    if (str.equals("ZW")) {
                        b10 = 238;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                case 4:
                case 17:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                case 50:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                case InterfaceC0435l1.d.b.f29114k /* 113 */:
                case 116:
                case InterfaceC0435l1.c.b.f29097c /* 202 */:
                case 225:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case 2:
                case 204:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 3:
                case 41:
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case 6:
                case 165:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case 8:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                case 162:
                case 186:
                case 190:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case 9:
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case 10:
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case 11:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                case 93:
                case InterfaceC0435l1.d.b.f29106c /* 102 */:
                case 127:
                case 145:
                case 188:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case 12:
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case 13:
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case 14:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                case 121:
                case 144:
                case 172:
                case 195:
                case 224:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case 15:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                case 128:
                case 194:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case 16:
                case 106:
                case 214:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case 19:
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case 20:
                case 187:
                case InterfaceC0435l1.c.b.f29098d /* 203 */:
                case InterfaceC0435l1.c.b.f29101g /* 206 */:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case 21:
                case 175:
                case 191:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case 22:
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case 23:
                case 84:
                case 92:
                case 154:
                case 226:
                case 234:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case 24:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case 25:
                case 141:
                case 177:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case 27:
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case 31:
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case 32:
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case 33:
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case 34:
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                case 42:
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case 36:
                case 219:
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case 37:
                case 137:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case 39:
                case 62:
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case 40:
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                case 208:
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case 44:
                case 143:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case 45:
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                case 157:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                case InterfaceC0435l1.d.b.f29112i /* 111 */:
                case 161:
                case 210:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                case 123:
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                case 209:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case 60:
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case 64:
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case 65:
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case 66:
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case 67:
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case 68:
                case 155:
                case PsExtractor.AUDIO_STREAM /* 192 */:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case 69:
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case 70:
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 71:
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case 72:
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case 73:
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case 74:
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case 75:
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case 76:
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case 77:
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case 78:
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 79:
                case 97:
                case InterfaceC0435l1.d.b.f29108e /* 104 */:
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case 80:
                case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case 81:
                case 199:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 82:
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case 83:
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case 85:
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case 86:
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case 87:
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case 88:
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case 90:
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case 91:
                case 115:
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case 95:
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case 96:
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 98:
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case 99:
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case 100:
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case InterfaceC0435l1.d.b.f29105b /* 101 */:
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case InterfaceC0435l1.d.b.f29107d /* 103 */:
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case InterfaceC0435l1.d.b.f29109f /* 105 */:
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case 107:
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case 108:
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case InterfaceC0435l1.d.b.f29110g /* 109 */:
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case InterfaceC0435l1.d.b.f29111h /* 110 */:
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case InterfaceC0435l1.d.b.f29113j /* 112 */:
                case 230:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case 114:
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case 117:
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case 118:
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case 119:
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case 120:
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case 122:
                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case 124:
                case 168:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case 125:
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case 131:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case 132:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case 133:
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                case 211:
                case 216:
                case 231:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case 136:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case 139:
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case 140:
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case 142:
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case 147:
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case 150:
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case 151:
                case 232:
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case 152:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 153:
                case 235:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case 159:
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case 160:
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case 163:
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case 164:
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case 166:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case 170:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 171:
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case 173:
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case 174:
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case 176:
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case 178:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 179:
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case 180:
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case 181:
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case 182:
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case 183:
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case 184:
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 185 */:
                case 238:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case 193:
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case 196:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 197:
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case 200:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case InterfaceC0435l1.c.b.f29096b /* 201 */:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case InterfaceC0435l1.c.b.f29100f /* 205 */:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case InterfaceC0435l1.c.b.f29102h /* 207 */:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case 212:
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case 213:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case 215:
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case 217:
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case 218:
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case 220:
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case 221:
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case 222:
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case 223:
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case 227:
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case 228:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 229:
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case 233:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case 237:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i10 == 2) {
                jLongValue = ((Long) f43640p.get(iArr[0])).longValue();
            } else if (i10 == 3) {
                jLongValue = ((Long) f43641q.get(iArr[1])).longValue();
            } else if (i10 == 4) {
                jLongValue = ((Long) f43642r.get(iArr[2])).longValue();
            } else if (i10 == 5) {
                jLongValue = ((Long) f43643s.get(iArr[3])).longValue();
            } else if (i10 == 7) {
                jLongValue = ((Long) f43640p.get(iArr[0])).longValue();
            } else if (i10 != 9) {
                jLongValue = i10 != 10 ? 1000000L : ((Long) f43644t.get(iArr[4])).longValue();
            } else {
                jLongValue = ((Long) f43645u.get(iArr[5])).longValue();
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    public final void b(int i10, long j10, long j11) {
        final int i11;
        final long j12;
        final long j13;
        if (i10 == 0 && j10 == 0 && j11 == this.f43658m) {
            return;
        }
        this.f43658m = j11;
        for (final c cVar : (CopyOnWriteArrayList) this.f43649c.f3698b) {
            if (cVar.f43632c) {
                i11 = i10;
                j12 = j10;
                j13 = j11;
            } else {
                i11 = i10;
                j12 = j10;
                j13 = j11;
                cVar.f43630a.post(new Runnable() { // from class: j2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.f fVar = cVar.f43631b;
                        x xVar = fVar.f48532d;
                        q1.a aVarE = fVar.E(((j0) xVar.f23261b).isEmpty() ? null : (c0) oa.q.k((j0) xVar.f23261b));
                        fVar.I(aVarE, 1006, new k3.n(aVarE, i11, j12, j13));
                    }
                });
            }
            i10 = i11;
            j10 = j12;
            j11 = j13;
        }
    }
}
