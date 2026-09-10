package com.google.android.exoplayer2.upstream;

import A.I0;
import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.exoplayer2.util.SystemClock;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.vj;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.thinkup.core.api.TUCountryCode;
import com.thinkup.core.common.n.mo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ImmutableList f18758n = ImmutableList.y(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final ImmutableList o = ImmutableList.y(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ImmutableList f18759p = ImmutableList.y(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final ImmutableList q = ImmutableList.y(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final ImmutableList r = ImmutableList.y(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final ImmutableList s = ImmutableList.y(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static DefaultBandwidthMeter t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableMap f18760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BandwidthMeter.EventListener.EventDispatcher f18761b = new BandwidthMeter.EventListener.EventDispatcher();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SlidingPercentile f18762c;
    public final SystemClock d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18763e;
    public int f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18765i;
    public long j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18766l;
    public long m;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f18767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f18768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18769c;
        public final SystemClock d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f18770e;

        /* JADX WARN: Code duplicated, block: B:13:0x0038  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        public Builder(Context context) {
            String strC;
            int[] iArr;
            TelephonyManager telephonyManager;
            this.f18767a = context == null ? null : context.getApplicationContext();
            int i2 = Util.f18979a;
            if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                strC = Ascii.c(Locale.getDefault().getCountry());
            } else {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (TextUtils.isEmpty(networkCountryIso)) {
                    strC = Ascii.c(Locale.getDefault().getCountry());
                } else {
                    strC = Ascii.c(networkCountryIso);
                }
            }
            ImmutableList immutableList = DefaultBandwidthMeter.f18758n;
            strC.getClass();
            byte b2 = -1;
            switch (strC.hashCode()) {
                case 2083:
                    if (strC.equals("AD")) {
                        b2 = 0;
                    }
                    break;
                case 2084:
                    if (strC.equals("AE")) {
                        b2 = 1;
                    }
                    break;
                case 2085:
                    if (strC.equals("AF")) {
                        b2 = 2;
                    }
                    break;
                case 2086:
                    if (strC.equals("AG")) {
                        b2 = 3;
                    }
                    break;
                case 2088:
                    if (strC.equals("AI")) {
                        b2 = 4;
                    }
                    break;
                case 2091:
                    if (strC.equals("AL")) {
                        b2 = 5;
                    }
                    break;
                case 2092:
                    if (strC.equals("AM")) {
                        b2 = 6;
                    }
                    break;
                case 2094:
                    if (strC.equals("AO")) {
                        b2 = 7;
                    }
                    break;
                case 2096:
                    if (strC.equals("AQ")) {
                        b2 = 8;
                    }
                    break;
                case 2098:
                    if (strC.equals("AS")) {
                        b2 = 9;
                    }
                    break;
                case 2099:
                    if (strC.equals("AT")) {
                        b2 = 10;
                    }
                    break;
                case 2100:
                    if (strC.equals("AU")) {
                        b2 = 11;
                    }
                    break;
                case 2102:
                    if (strC.equals("AW")) {
                        b2 = 12;
                    }
                    break;
                case 2103:
                    if (strC.equals("AX")) {
                        b2 = 13;
                    }
                    break;
                case 2105:
                    if (strC.equals("AZ")) {
                        b2 = 14;
                    }
                    break;
                case 2111:
                    if (strC.equals("BA")) {
                        b2 = 15;
                    }
                    break;
                case 2112:
                    if (strC.equals("BB")) {
                        b2 = 16;
                    }
                    break;
                case 2114:
                    if (strC.equals("BD")) {
                        b2 = 17;
                    }
                    break;
                case 2115:
                    if (strC.equals("BE")) {
                        b2 = 18;
                    }
                    break;
                case 2116:
                    if (strC.equals("BF")) {
                        b2 = 19;
                    }
                    break;
                case 2117:
                    if (strC.equals("BG")) {
                        b2 = 20;
                    }
                    break;
                case 2118:
                    if (strC.equals("BH")) {
                        b2 = 21;
                    }
                    break;
                case 2119:
                    if (strC.equals("BI")) {
                        b2 = 22;
                    }
                    break;
                case 2120:
                    if (strC.equals("BJ")) {
                        b2 = 23;
                    }
                    break;
                case 2122:
                    if (strC.equals("BL")) {
                        b2 = 24;
                    }
                    break;
                case 2123:
                    if (strC.equals("BM")) {
                        b2 = 25;
                    }
                    break;
                case 2124:
                    if (strC.equals("BN")) {
                        b2 = 26;
                    }
                    break;
                case 2125:
                    if (strC.equals("BO")) {
                        b2 = 27;
                    }
                    break;
                case 2127:
                    if (strC.equals("BQ")) {
                        b2 = 28;
                    }
                    break;
                case 2128:
                    if (strC.equals("BR")) {
                        b2 = 29;
                    }
                    break;
                case 2129:
                    if (strC.equals("BS")) {
                        b2 = 30;
                    }
                    break;
                case 2130:
                    if (strC.equals("BT")) {
                        b2 = 31;
                    }
                    break;
                case 2133:
                    if (strC.equals("BW")) {
                        b2 = 32;
                    }
                    break;
                case 2135:
                    if (strC.equals("BY")) {
                        b2 = 33;
                    }
                    break;
                case 2136:
                    if (strC.equals("BZ")) {
                        b2 = 34;
                    }
                    break;
                case 2142:
                    if (strC.equals("CA")) {
                        b2 = 35;
                    }
                    break;
                case 2145:
                    if (strC.equals("CD")) {
                        b2 = 36;
                    }
                    break;
                case 2147:
                    if (strC.equals("CF")) {
                        b2 = 37;
                    }
                    break;
                case 2148:
                    if (strC.equals("CG")) {
                        b2 = 38;
                    }
                    break;
                case 2149:
                    if (strC.equals("CH")) {
                        b2 = 39;
                    }
                    break;
                case 2150:
                    if (strC.equals("CI")) {
                        b2 = 40;
                    }
                    break;
                case 2152:
                    if (strC.equals("CK")) {
                        b2 = 41;
                    }
                    break;
                case 2153:
                    if (strC.equals("CL")) {
                        b2 = 42;
                    }
                    break;
                case 2154:
                    if (strC.equals("CM")) {
                        b2 = 43;
                    }
                    break;
                case 2155:
                    if (strC.equals("CN")) {
                        b2 = 44;
                    }
                    break;
                case 2156:
                    if (strC.equals("CO")) {
                        b2 = 45;
                    }
                    break;
                case 2159:
                    if (strC.equals("CR")) {
                        b2 = 46;
                    }
                    break;
                case 2162:
                    if (strC.equals("CU")) {
                        b2 = 47;
                    }
                    break;
                case 2163:
                    if (strC.equals("CV")) {
                        b2 = 48;
                    }
                    break;
                case 2164:
                    if (strC.equals("CW")) {
                        b2 = 49;
                    }
                    break;
                case 2165:
                    if (strC.equals("CX")) {
                        b2 = 50;
                    }
                    break;
                case 2166:
                    if (strC.equals("CY")) {
                        b2 = 51;
                    }
                    break;
                case 2167:
                    if (strC.equals("CZ")) {
                        b2 = 52;
                    }
                    break;
                case 2177:
                    if (strC.equals("DE")) {
                        b2 = 53;
                    }
                    break;
                case 2182:
                    if (strC.equals("DJ")) {
                        b2 = 54;
                    }
                    break;
                case 2183:
                    if (strC.equals("DK")) {
                        b2 = 55;
                    }
                    break;
                case 2185:
                    if (strC.equals("DM")) {
                        b2 = 56;
                    }
                    break;
                case 2187:
                    if (strC.equals("DO")) {
                        b2 = 57;
                    }
                    break;
                case 2198:
                    if (strC.equals("DZ")) {
                        b2 = 58;
                    }
                    break;
                case 2206:
                    if (strC.equals("EC")) {
                        b2 = 59;
                    }
                    break;
                case 2208:
                    if (strC.equals("EE")) {
                        b2 = 60;
                    }
                    break;
                case vj.a.INSTANCE_VISIBLE /* 2210 */:
                    if (strC.equals("EG")) {
                        b2 = 61;
                    }
                    break;
                case 2221:
                    if (strC.equals("ER")) {
                        b2 = 62;
                    }
                    break;
                case 2222:
                    if (strC.equals("ES")) {
                        b2 = 63;
                    }
                    break;
                case 2223:
                    if (strC.equals("ET")) {
                        b2 = 64;
                    }
                    break;
                case 2243:
                    if (strC.equals("FI")) {
                        b2 = 65;
                    }
                    break;
                case 2244:
                    if (strC.equals("FJ")) {
                        b2 = 66;
                    }
                    break;
                case 2247:
                    if (strC.equals("FM")) {
                        b2 = 67;
                    }
                    break;
                case 2249:
                    if (strC.equals("FO")) {
                        b2 = 68;
                    }
                    break;
                case 2252:
                    if (strC.equals("FR")) {
                        b2 = 69;
                    }
                    break;
                case 2266:
                    if (strC.equals("GA")) {
                        b2 = 70;
                    }
                    break;
                case 2267:
                    if (strC.equals("GB")) {
                        b2 = 71;
                    }
                    break;
                case 2269:
                    if (strC.equals("GD")) {
                        b2 = 72;
                    }
                    break;
                case 2270:
                    if (strC.equals("GE")) {
                        b2 = 73;
                    }
                    break;
                case 2271:
                    if (strC.equals("GF")) {
                        b2 = 74;
                    }
                    break;
                case 2272:
                    if (strC.equals("GG")) {
                        b2 = 75;
                    }
                    break;
                case 2273:
                    if (strC.equals("GH")) {
                        b2 = 76;
                    }
                    break;
                case 2274:
                    if (strC.equals("GI")) {
                        b2 = 77;
                    }
                    break;
                case 2277:
                    if (strC.equals("GL")) {
                        b2 = 78;
                    }
                    break;
                case 2278:
                    if (strC.equals("GM")) {
                        b2 = 79;
                    }
                    break;
                case 2279:
                    if (strC.equals("GN")) {
                        b2 = 80;
                    }
                    break;
                case 2281:
                    if (strC.equals("GP")) {
                        b2 = 81;
                    }
                    break;
                case 2282:
                    if (strC.equals("GQ")) {
                        b2 = 82;
                    }
                    break;
                case 2283:
                    if (strC.equals("GR")) {
                        b2 = 83;
                    }
                    break;
                case 2285:
                    if (strC.equals("GT")) {
                        b2 = 84;
                    }
                    break;
                case 2286:
                    if (strC.equals("GU")) {
                        b2 = 85;
                    }
                    break;
                case 2288:
                    if (strC.equals("GW")) {
                        b2 = 86;
                    }
                    break;
                case 2290:
                    if (strC.equals("GY")) {
                        b2 = 87;
                    }
                    break;
                case 2307:
                    if (strC.equals(com.smartdigimkt.d2.a.f34406b0)) {
                        b2 = 88;
                    }
                    break;
                case 2310:
                    if (strC.equals("HN")) {
                        b2 = 89;
                    }
                    break;
                case 2314:
                    if (strC.equals("HR")) {
                        b2 = 90;
                    }
                    break;
                case 2316:
                    if (strC.equals("HT")) {
                        b2 = 91;
                    }
                    break;
                case 2317:
                    if (strC.equals("HU")) {
                        b2 = 92;
                    }
                    break;
                case 2331:
                    if (strC.equals("ID")) {
                        b2 = 93;
                    }
                    break;
                case 2332:
                    if (strC.equals("IE")) {
                        b2 = 94;
                    }
                    break;
                case 2339:
                    if (strC.equals("IL")) {
                        b2 = 95;
                    }
                    break;
                case 2340:
                    if (strC.equals("IM")) {
                        b2 = 96;
                    }
                    break;
                case 2341:
                    if (strC.equals(TUCountryCode.INDIA)) {
                        b2 = 97;
                    }
                    break;
                case 2342:
                    if (strC.equals("IO")) {
                        b2 = 98;
                    }
                    break;
                case 2344:
                    if (strC.equals("IQ")) {
                        b2 = 99;
                    }
                    break;
                case 2345:
                    if (strC.equals("IR")) {
                        b2 = 100;
                    }
                    break;
                case 2346:
                    if (strC.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                        b2 = 101;
                    }
                    break;
                case 2347:
                    if (strC.equals("IT")) {
                        b2 = 102;
                    }
                    break;
                case 2363:
                    if (strC.equals("JE")) {
                        b2 = 103;
                    }
                    break;
                case 2371:
                    if (strC.equals("JM")) {
                        b2 = 104;
                    }
                    break;
                case 2373:
                    if (strC.equals("JO")) {
                        b2 = 105;
                    }
                    break;
                case 2374:
                    if (strC.equals("JP")) {
                        b2 = 106;
                    }
                    break;
                case 2394:
                    if (strC.equals("KE")) {
                        b2 = 107;
                    }
                    break;
                case 2396:
                    if (strC.equals("KG")) {
                        b2 = 108;
                    }
                    break;
                case 2397:
                    if (strC.equals("KH")) {
                        b2 = 109;
                    }
                    break;
                case 2398:
                    if (strC.equals("KI")) {
                        b2 = 110;
                    }
                    break;
                case 2402:
                    if (strC.equals("KM")) {
                        b2 = 111;
                    }
                    break;
                case 2403:
                    if (strC.equals("KN")) {
                        b2 = 112;
                    }
                    break;
                case 2407:
                    if (strC.equals("KR")) {
                        b2 = 113;
                    }
                    break;
                case 2412:
                    if (strC.equals("KW")) {
                        b2 = 114;
                    }
                    break;
                case 2414:
                    if (strC.equals("KY")) {
                        b2 = 115;
                    }
                    break;
                case 2415:
                    if (strC.equals("KZ")) {
                        b2 = 116;
                    }
                    break;
                case 2421:
                    if (strC.equals("LA")) {
                        b2 = 117;
                    }
                    break;
                case 2422:
                    if (strC.equals("LB")) {
                        b2 = 118;
                    }
                    break;
                case 2423:
                    if (strC.equals("LC")) {
                        b2 = 119;
                    }
                    break;
                case 2429:
                    if (strC.equals("LI")) {
                        b2 = 120;
                    }
                    break;
                case 2431:
                    if (strC.equals("LK")) {
                        b2 = 121;
                    }
                    break;
                case 2438:
                    if (strC.equals("LR")) {
                        b2 = 122;
                    }
                    break;
                case 2439:
                    if (strC.equals("LS")) {
                        b2 = 123;
                    }
                    break;
                case 2440:
                    if (strC.equals("LT")) {
                        b2 = 124;
                    }
                    break;
                case 2441:
                    if (strC.equals("LU")) {
                        b2 = 125;
                    }
                    break;
                case 2442:
                    if (strC.equals("LV")) {
                        b2 = 126;
                    }
                    break;
                case 2445:
                    if (strC.equals("LY")) {
                        b2 = AbstractJsonLexerKt.TC_INVALID;
                    }
                    break;
                case 2452:
                    if (strC.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                        b2 = 128;
                    }
                    break;
                case 2454:
                    if (strC.equals("MC")) {
                        b2 = 129;
                    }
                    break;
                case 2455:
                    if (strC.equals("MD")) {
                        b2 = 130;
                    }
                    break;
                case 2456:
                    if (strC.equals("ME")) {
                        b2 = 131;
                    }
                    break;
                case 2457:
                    if (strC.equals("MF")) {
                        b2 = 132;
                    }
                    break;
                case 2458:
                    if (strC.equals("MG")) {
                        b2 = 133;
                    }
                    break;
                case 2459:
                    if (strC.equals("MH")) {
                        b2 = 134;
                    }
                    break;
                case 2462:
                    if (strC.equals("MK")) {
                        b2 = 135;
                    }
                    break;
                case 2463:
                    if (strC.equals("ML")) {
                        b2 = 136;
                    }
                    break;
                case 2464:
                    if (strC.equals("MM")) {
                        b2 = 137;
                    }
                    break;
                case 2465:
                    if (strC.equals("MN")) {
                        b2 = 138;
                    }
                    break;
                case 2466:
                    if (strC.equals("MO")) {
                        b2 = 139;
                    }
                    break;
                case 2467:
                    if (strC.equals("MP")) {
                        b2 = 140;
                    }
                    break;
                case 2468:
                    if (strC.equals("MQ")) {
                        b2 = 141;
                    }
                    break;
                case 2469:
                    if (strC.equals("MR")) {
                        b2 = 142;
                    }
                    break;
                case 2470:
                    if (strC.equals("MS")) {
                        b2 = 143;
                    }
                    break;
                case 2471:
                    if (strC.equals("MT")) {
                        b2 = 144;
                    }
                    break;
                case 2472:
                    if (strC.equals("MU")) {
                        b2 = 145;
                    }
                    break;
                case 2473:
                    if (strC.equals("MV")) {
                        b2 = 146;
                    }
                    break;
                case 2474:
                    if (strC.equals("MW")) {
                        b2 = 147;
                    }
                    break;
                case 2475:
                    if (strC.equals("MX")) {
                        b2 = 148;
                    }
                    break;
                case 2476:
                    if (strC.equals("MY")) {
                        b2 = 149;
                    }
                    break;
                case 2477:
                    if (strC.equals("MZ")) {
                        b2 = 150;
                    }
                    break;
                case 2483:
                    if (strC.equals("NA")) {
                        b2 = 151;
                    }
                    break;
                case 2485:
                    if (strC.equals("NC")) {
                        b2 = 152;
                    }
                    break;
                case 2487:
                    if (strC.equals("NE")) {
                        b2 = 153;
                    }
                    break;
                case 2489:
                    if (strC.equals("NG")) {
                        b2 = 154;
                    }
                    break;
                case 2491:
                    if (strC.equals("NI")) {
                        b2 = 155;
                    }
                    break;
                case 2494:
                    if (strC.equals("NL")) {
                        b2 = 156;
                    }
                    break;
                case 2497:
                    if (strC.equals("NO")) {
                        b2 = 157;
                    }
                    break;
                case 2498:
                    if (strC.equals("NP")) {
                        b2 = 158;
                    }
                    break;
                case 2500:
                    if (strC.equals("NR")) {
                        b2 = 159;
                    }
                    break;
                case vj.b.INSTANCE_NOT_FOUND_IN_LOAD /* 2503 */:
                    if (strC.equals("NU")) {
                        b2 = 160;
                    }
                    break;
                case 2508:
                    if (strC.equals("NZ")) {
                        b2 = 161;
                    }
                    break;
                case 2526:
                    if (strC.equals("OM")) {
                        b2 = 162;
                    }
                    break;
                case 2545:
                    if (strC.equals("PA")) {
                        b2 = 163;
                    }
                    break;
                case 2549:
                    if (strC.equals("PE")) {
                        b2 = 164;
                    }
                    break;
                case 2550:
                    if (strC.equals("PF")) {
                        b2 = 165;
                    }
                    break;
                case 2551:
                    if (strC.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                        b2 = 166;
                    }
                    break;
                case 2552:
                    if (strC.equals("PH")) {
                        b2 = 167;
                    }
                    break;
                case 2555:
                    if (strC.equals("PK")) {
                        b2 = 168;
                    }
                    break;
                case 2556:
                    if (strC.equals("PL")) {
                        b2 = 169;
                    }
                    break;
                case 2557:
                    if (strC.equals("PM")) {
                        b2 = 170;
                    }
                    break;
                case 2562:
                    if (strC.equals("PR")) {
                        b2 = 171;
                    }
                    break;
                case 2563:
                    if (strC.equals("PS")) {
                        b2 = 172;
                    }
                    break;
                case 2564:
                    if (strC.equals("PT")) {
                        b2 = 173;
                    }
                    break;
                case 2567:
                    if (strC.equals("PW")) {
                        b2 = 174;
                    }
                    break;
                case 2569:
                    if (strC.equals("PY")) {
                        b2 = 175;
                    }
                    break;
                case 2576:
                    if (strC.equals("QA")) {
                        b2 = 176;
                    }
                    break;
                case 2611:
                    if (strC.equals("RE")) {
                        b2 = 177;
                    }
                    break;
                case 2621:
                    if (strC.equals("RO")) {
                        b2 = 178;
                    }
                    break;
                case 2625:
                    if (strC.equals("RS")) {
                        b2 = 179;
                    }
                    break;
                case 2627:
                    if (strC.equals("RU")) {
                        b2 = 180;
                    }
                    break;
                case 2629:
                    if (strC.equals("RW")) {
                        b2 = 181;
                    }
                    break;
                case 2638:
                    if (strC.equals("SA")) {
                        b2 = 182;
                    }
                    break;
                case 2639:
                    if (strC.equals("SB")) {
                        b2 = 183;
                    }
                    break;
                case 2640:
                    if (strC.equals("SC")) {
                        b2 = 184;
                    }
                    break;
                case 2641:
                    if (strC.equals("SD")) {
                        b2 = 185;
                    }
                    break;
                case 2642:
                    if (strC.equals("SE")) {
                        b2 = 186;
                    }
                    break;
                case 2644:
                    if (strC.equals("SG")) {
                        b2 = 187;
                    }
                    break;
                case 2645:
                    if (strC.equals("SH")) {
                        b2 = 188;
                    }
                    break;
                case 2646:
                    if (strC.equals("SI")) {
                        b2 = 189;
                    }
                    break;
                case 2647:
                    if (strC.equals("SJ")) {
                        b2 = 190;
                    }
                    break;
                case 2648:
                    if (strC.equals("SK")) {
                        b2 = 191;
                    }
                    break;
                case 2649:
                    if (strC.equals("SL")) {
                        b2 = 192;
                    }
                    break;
                case 2650:
                    if (strC.equals("SM")) {
                        b2 = 193;
                    }
                    break;
                case 2651:
                    if (strC.equals("SN")) {
                        b2 = 194;
                    }
                    break;
                case 2652:
                    if (strC.equals("SO")) {
                        b2 = 195;
                    }
                    break;
                case 2655:
                    if (strC.equals("SR")) {
                        b2 = 196;
                    }
                    break;
                case 2656:
                    if (strC.equals("SS")) {
                        b2 = 197;
                    }
                    break;
                case 2657:
                    if (strC.equals("ST")) {
                        b2 = 198;
                    }
                    break;
                case 2659:
                    if (strC.equals("SV")) {
                        b2 = 199;
                    }
                    break;
                case 2661:
                    if (strC.equals("SX")) {
                        b2 = 200;
                    }
                    break;
                case 2662:
                    if (strC.equals("SY")) {
                        b2 = 201;
                    }
                    break;
                case 2663:
                    if (strC.equals("SZ")) {
                        b2 = 202;
                    }
                    break;
                case 2671:
                    if (strC.equals("TC")) {
                        b2 = 203;
                    }
                    break;
                case 2672:
                    if (strC.equals("TD")) {
                        b2 = 204;
                    }
                    break;
                case 2675:
                    if (strC.equals("TG")) {
                        b2 = 205;
                    }
                    break;
                case 2676:
                    if (strC.equals("TH")) {
                        b2 = 206;
                    }
                    break;
                case 2678:
                    if (strC.equals("TJ")) {
                        b2 = 207;
                    }
                    break;
                case 2679:
                    if (strC.equals("TK")) {
                        b2 = 208;
                    }
                    break;
                case 2680:
                    if (strC.equals("TL")) {
                        b2 = 209;
                    }
                    break;
                case 2681:
                    if (strC.equals("TM")) {
                        b2 = 210;
                    }
                    break;
                case 2682:
                    if (strC.equals("TN")) {
                        b2 = 211;
                    }
                    break;
                case 2683:
                    if (strC.equals("TO")) {
                        b2 = 212;
                    }
                    break;
                case 2686:
                    if (strC.equals("TR")) {
                        b2 = 213;
                    }
                    break;
                case 2688:
                    if (strC.equals("TT")) {
                        b2 = 214;
                    }
                    break;
                case 2690:
                    if (strC.equals("TV")) {
                        b2 = 215;
                    }
                    break;
                case 2691:
                    if (strC.equals(com.smartdigimkt.d2.a.a0)) {
                        b2 = 216;
                    }
                    break;
                case 2694:
                    if (strC.equals("TZ")) {
                        b2 = 217;
                    }
                    break;
                case 2700:
                    if (strC.equals("UA")) {
                        b2 = 218;
                    }
                    break;
                case 2706:
                    if (strC.equals("UG")) {
                        b2 = 219;
                    }
                    break;
                case 2718:
                    if (strC.equals("US")) {
                        b2 = 220;
                    }
                    break;
                case 2724:
                    if (strC.equals("UY")) {
                        b2 = 221;
                    }
                    break;
                case 2725:
                    if (strC.equals("UZ")) {
                        b2 = 222;
                    }
                    break;
                case 2731:
                    if (strC.equals("VA")) {
                        b2 = 223;
                    }
                    break;
                case 2733:
                    if (strC.equals("VC")) {
                        b2 = 224;
                    }
                    break;
                case 2735:
                    if (strC.equals("VE")) {
                        b2 = 225;
                    }
                    break;
                case 2737:
                    if (strC.equals("VG")) {
                        b2 = 226;
                    }
                    break;
                case 2739:
                    if (strC.equals("VI")) {
                        b2 = 227;
                    }
                    break;
                case 2744:
                    if (strC.equals("VN")) {
                        b2 = 228;
                    }
                    break;
                case 2751:
                    if (strC.equals("VU")) {
                        b2 = 229;
                    }
                    break;
                case 2767:
                    if (strC.equals("WF")) {
                        b2 = 230;
                    }
                    break;
                case 2780:
                    if (strC.equals("WS")) {
                        b2 = 231;
                    }
                    break;
                case 2803:
                    if (strC.equals("XK")) {
                        b2 = 232;
                    }
                    break;
                case 2828:
                    if (strC.equals("YE")) {
                        b2 = 233;
                    }
                    break;
                case 2843:
                    if (strC.equals("YT")) {
                        b2 = 234;
                    }
                    break;
                case 2855:
                    if (strC.equals("ZA")) {
                        b2 = 235;
                    }
                    break;
                case 2867:
                    if (strC.equals("ZM")) {
                        b2 = 236;
                    }
                    break;
                case 2877:
                    if (strC.equals("ZW")) {
                        b2 = 237;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                case 49:
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 3, 4, 4, 2};
                    break;
                case 2:
                case 166:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case 3:
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 4:
                case 16:
                case 25:
                case 28:
                case 56:
                case 68:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 3, 2, 2};
                    break;
                case 6:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                case 8:
                case 62:
                case 188:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case 9:
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case 10:
                    iArr = new int[]{1, 2, 1, 4, 1, 4};
                    break;
                case 11:
                    iArr = new int[]{0, 2, 1, 1, 3, 0};
                    break;
                case 12:
                case 85:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case 13:
                case 50:
                case 120:
                case 140:
                case 143:
                case 170:
                case 193:
                case STALE_CACHED_RESPONSE_VALUE:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case 14:
                case 19:
                case 58:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case 15:
                case 94:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 17:
                case 116:
                    iArr = new int[]{2, 1, 2, 2, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{0, 1, 4, 4, 3, 2};
                    break;
                case 20:
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 83:
                case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case 21:
                    iArr = new int[]{1, 3, 1, 4, 4, 2};
                    break;
                case 22:
                case 91:
                case OMSDK_JS_WRITE_FAILED_VALUE:
                case 153:
                case 204:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                case 233:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case 23:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case 24:
                case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                case 175:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case 26:
                    iArr = new int[]{3, 2, 0, 1, 2, 2};
                    break;
                case 27:
                    iArr = new int[]{1, 2, 3, 2, 2, 2};
                    break;
                case 29:
                    iArr = new int[]{1, 1, 2, 1, 1, 0};
                    break;
                case 30:
                case 118:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case 31:
                case 150:
                case 231:
                    iArr = new int[]{3, 1, 2, 1, 2, 2};
                    break;
                case 32:
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case 33:
                    iArr = new int[]{1, 1, 2, 3, 2, 2};
                    break;
                case 34:
                case 41:
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case 35:
                    iArr = new int[]{0, 2, 3, 3, 3, 3};
                    break;
                case 36:
                case 111:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case 37:
                case 183:
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case 38:
                case 76:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 39:
                    iArr = new int[]{0, 0, 0, 0, 0, 3};
                    break;
                case 40:
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case 42:
                    iArr = new int[]{1, 1, 2, 1, 3, 2};
                    break;
                case 43:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case 44:
                    iArr = new int[]{2, 0, 4, 3, 3, 1};
                    break;
                case 45:
                    iArr = new int[]{2, 3, 4, 2, 2, 2};
                    break;
                case 46:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case 47:
                case 110:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case 48:
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case AD_REWARD_USER_VALUE:
                case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                case 126:
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case 53:
                    iArr = new int[]{0, 1, 3, 2, 2, 2};
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                case 201:
                case 207:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                case 60:
                case mo.oom.m0n /* 92 */:
                case 124:
                case 144:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    iArr = new int[]{3, 4, 4, 4, 4, 2};
                    break;
                case 59:
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case 64:
                case 194:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 65:
                    iArr = new int[]{0, 0, 0, 2, 0, 2};
                    break;
                case 66:
                    iArr = new int[]{3, 1, 2, 3, 2, 2};
                    break;
                case 67:
                    iArr = new int[]{4, 2, 3, 0, 2, 2};
                    break;
                case mo.oom.onn /* 69 */:
                    iArr = new int[]{1, 1, 2, 1, 1, 2};
                    break;
                case com.smartdigimkt.f3.b.B0 /* 70 */:
                case 205:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case 71:
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case 72:
                case 112:
                case 115:
                case 119:
                case 200:
                case 224:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 73:
                    iArr = new int[]{1, 0, 0, 2, 2, 2};
                    break;
                case mo.oom.ooo /* 74 */:
                case 168:
                case PsExtractor.AUDIO_STREAM /* 192 */:
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case mo.oom.oom /* 75 */:
                    iArr = new int[]{0, 2, 1, 0, 2, 2};
                    break;
                case mo.oom.ono /* 77 */:
                case 103:
                    iArr = new int[]{1, 2, 0, 1, 2, 2};
                    break;
                case 78:
                case 208:
                    iArr = new int[]{2, 2, 2, 4, 2, 2};
                    break;
                case mo.oom.on0 /* 79 */:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 80:
                    iArr = new int[]{4, 4, 4, 2, 2, 2};
                    break;
                case mo.oom.m00 /* 81 */:
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case 82:
                    iArr = new int[]{4, 4, 3, 3, 2, 2};
                    break;
                case 84:
                    iArr = new int[]{2, 2, 2, 1, 1, 2};
                    break;
                case 86:
                    iArr = new int[]{4, 4, 2, 2, 2, 2};
                    break;
                case 87:
                    iArr = new int[]{3, 0, 1, 1, 2, 2};
                    break;
                case 88:
                    iArr = new int[]{0, 1, 1, 3, 2, 0};
                    break;
                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case mo.oom.mo0 /* 93 */:
                    iArr = new int[]{3, 1, 1, 2, 3, 2};
                    break;
                case 95:
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 96:
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case 97:
                    iArr = new int[]{1, 1, 2, 1, 2, 1};
                    break;
                case 98:
                case AD_RESPONSE_EMPTY_VALUE:
                case 230:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case 99:
                case 190:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case 100:
                    iArr = new int[]{4, 2, 3, 3, 4, 2};
                    break;
                case 101:
                    iArr = new int[]{0, 0, 1, 0, 0, 2};
                    break;
                case 102:
                    iArr = new int[]{0, 0, 1, 1, 1, 2};
                    break;
                case 104:
                    iArr = new int[]{2, 4, 2, 1, 2, 2};
                    break;
                case 105:
                    iArr = new int[]{2, 0, 1, 1, 2, 2};
                    break;
                case 106:
                    iArr = new int[]{0, 3, 3, 3, 4, 4};
                    break;
                case 107:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 108:
                case 141:
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case 109:
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case 113:
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case 114:
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case 117:
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case 121:
                    iArr = new int[]{3, 2, 3, 4, 4, 2};
                    break;
                case 122:
                    iArr = new int[]{3, 4, 3, 4, 2, 2};
                    break;
                case 123:
                case MRAID_JS_COPY_FAILED_VALUE:
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 125:
                    iArr = new int[]{1, 1, 4, 2, 0, 2};
                    break;
                case 127:
                case 212:
                case 237:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case 128:
                    iArr = new int[]{3, 3, 2, 1, 2, 2};
                    break;
                case 129:
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 130:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case 131:
                    iArr = new int[]{2, 0, 0, 1, 1, 2};
                    break;
                case 134:
                    iArr = new int[]{4, 2, 1, 3, 2, 2};
                    break;
                case 135:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case PRIVACY_URL_ERROR_VALUE:
                case AD_RESPONSE_TIMED_OUT_VALUE:
                    iArr = new int[]{3, 4, 2, 2, 2, 2};
                    break;
                case TPAT_RETRY_FAILED_VALUE:
                    iArr = new int[]{2, 2, 2, 3, 4, 2};
                    break;
                case 138:
                    iArr = new int[]{2, 0, 1, 2, 2, 2};
                    break;
                case 139:
                    iArr = new int[]{0, 2, 4, 4, 4, 2};
                    break;
                case 142:
                    iArr = new int[]{4, 2, 3, 4, 2, 2};
                    break;
                case 145:
                case 182:
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 4, 1, 3, 3, 2};
                    break;
                case 147:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{1, 0, 4, 1, 2, 2};
                    break;
                case 151:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 152:
                    iArr = new int[]{3, 2, 3, 4, 2, 2};
                    break;
                case 154:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    iArr = new int[]{2, 3, 4, 3, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{0, 2, 3, 3, 0, 4};
                    break;
                case 157:
                    iArr = new int[]{0, 1, 2, 1, 1, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 2, 2};
                    break;
                case 159:
                    iArr = new int[]{4, 0, 3, 2, 2, 2};
                    break;
                case 160:
                    iArr = new int[]{4, 2, 2, 1, 2, 2};
                    break;
                case 161:
                    iArr = new int[]{1, 0, 2, 2, 4, 2};
                    break;
                case 162:
                    iArr = new int[]{2, 3, 1, 3, 4, 2};
                    break;
                case 163:
                    iArr = new int[]{2, 3, 3, 3, 2, 2};
                    break;
                case 164:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 165:
                case 199:
                    iArr = new int[]{2, 3, 3, 1, 2, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 1, 3, 2, 2, 0};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 2, 4, 2};
                    break;
                case 171:
                    iArr = new int[]{2, 0, 2, 0, 2, 1};
                    break;
                case 172:
                    iArr = new int[]{3, 4, 1, 4, 2, 2};
                    break;
                case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case 174:
                    iArr = new int[]{2, 2, 4, 2, 2, 2};
                    break;
                case 176:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 177:
                    iArr = new int[]{1, 2, 2, 3, 1, 2};
                    break;
                case 178:
                    iArr = new int[]{0, 0, 1, 2, 1, 2};
                    break;
                case 179:
                    iArr = new int[]{2, 0, 0, 0, 2, 2};
                    break;
                case 180:
                    iArr = new int[]{1, 0, 0, 0, 3, 3};
                    break;
                case 181:
                    iArr = new int[]{3, 3, 1, 0, 2, 2};
                    break;
                case 184:
                    iArr = new int[]{4, 3, 1, 1, 2, 2};
                    break;
                case 185:
                    iArr = new int[]{4, 3, 4, 2, 2, 2};
                    break;
                case 186:
                    iArr = new int[]{0, 1, 1, 1, 0, 2};
                    break;
                case 187:
                    iArr = new int[]{2, 3, 3, 3, 3, 3};
                    break;
                case 191:
                    iArr = new int[]{1, 1, 1, 1, 3, 2};
                    break;
                case 195:
                    iArr = new int[]{3, 2, 2, 4, 4, 2};
                    break;
                case 196:
                    iArr = new int[]{2, 4, 3, 0, 2, 2};
                    break;
                case 197:
                case 210:
                    iArr = new int[]{4, 2, 2, 3, 2, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case 202:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 203:
                    iArr = new int[]{2, 2, 1, 3, 2, 2};
                    break;
                case 206:
                    iArr = new int[]{0, 1, 2, 1, 2, 2};
                    break;
                case 209:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case BaseATView.g.f38289J /* 211 */:
                case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                    iArr = new int[]{2, 1, 1, 1, 2, 2};
                    break;
                case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case INVALID_GZIP_BID_PAYLOAD_VALUE:
                    iArr = new int[]{1, 4, 0, 0, 2, 2};
                    break;
                case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                    iArr = new int[]{0, 2, 0, 0, 0, 0};
                    break;
                case MRAID_JS_DOES_NOT_EXIST_VALUE:
                    iArr = new int[]{0, 1, 1, 2, 4, 2};
                    break;
                case AD_RESPONSE_RETRY_AFTER_VALUE:
                    iArr = new int[]{1, 1, 4, 1, 3, 1};
                    break;
                case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                    iArr = new int[]{2, 2, 3, 4, 3, 2};
                    break;
                case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                    iArr = new int[]{2, 2, 0, 1, 2, 2};
                    break;
                case 227:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 228:
                    iArr = new int[]{0, 0, 1, 2, 2, 1};
                    break;
                case 229:
                    iArr = new int[]{4, 3, 3, 1, 2, 2};
                    break;
                case 232:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 234:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 235:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{4, 4, 4, 3, 3, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            ImmutableList immutableList2 = DefaultBandwidthMeter.f18758n;
            map.put(2, (Long) immutableList2.get(iArr[0]));
            map.put(3, (Long) DefaultBandwidthMeter.o.get(iArr[1]));
            map.put(4, (Long) DefaultBandwidthMeter.f18759p.get(iArr[2]));
            map.put(5, (Long) DefaultBandwidthMeter.q.get(iArr[3]));
            map.put(10, (Long) DefaultBandwidthMeter.r.get(iArr[4]));
            map.put(9, (Long) DefaultBandwidthMeter.s.get(iArr[5]));
            map.put(7, (Long) immutableList2.get(iArr[0]));
            this.f18768b = map;
            this.f18769c = 2000;
            this.d = Clock.f18892a;
            this.f18770e = true;
        }
    }

    public DefaultBandwidthMeter(Context context, HashMap map, int i2, SystemClock systemClock, boolean z2) {
        this.f18760a = ImmutableMap.e(map);
        this.f18762c = new SlidingPercentile(i2);
        this.d = systemClock;
        this.f18763e = z2;
        if (context == null) {
            this.f18765i = 0;
            this.f18766l = g(0);
            return;
        }
        NetworkTypeObserver networkTypeObserverB = NetworkTypeObserver.b(context);
        int iC = networkTypeObserverB.c();
        this.f18765i = iC;
        this.f18766l = g(iC);
        b bVar = new b(this);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = networkTypeObserverB.f18948b;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(bVar));
        networkTypeObserverB.f18947a.post(new I0(29, networkTypeObserverB, bVar));
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final TransferListener a() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final void b(BandwidthMeter.EventListener eventListener) {
        CopyOnWriteArrayList<BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener> copyOnWriteArrayList = this.f18761b.f18726a;
        for (BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener : copyOnWriteArrayList) {
            if (handlerAndListener.f18728b == eventListener) {
                handlerAndListener.f18729c = true;
                copyOnWriteArrayList.remove(handlerAndListener);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final synchronized void c(DataSpec dataSpec, boolean z2) {
        boolean z3;
        if (z2) {
            try {
                int i2 = dataSpec.f18747i;
                z3 = true;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            if (this.f == 0) {
                this.d.getClass();
                this.g = android.os.SystemClock.elapsedRealtime();
            }
            this.f++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final void d(Handler handler, BandwidthMeter.EventListener eventListener) {
        eventListener.getClass();
        BandwidthMeter.EventListener.EventDispatcher eventDispatcher = this.f18761b;
        eventDispatcher.getClass();
        CopyOnWriteArrayList<BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener> copyOnWriteArrayList = eventDispatcher.f18726a;
        for (BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener : copyOnWriteArrayList) {
            if (handlerAndListener.f18728b == eventListener) {
                handlerAndListener.f18729c = true;
                copyOnWriteArrayList.remove(handlerAndListener);
            }
        }
        copyOnWriteArrayList.add(new BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener(handler, eventListener));
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final synchronized void e(DataSpec dataSpec, boolean z2, int i2) {
        boolean z3;
        if (z2) {
            int i3 = dataSpec.f18747i;
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f18764h += (long) i2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public final synchronized void f(DataSpec dataSpec, boolean z2) throws Throwable {
        Throwable th;
        boolean z3;
        DefaultBandwidthMeter defaultBandwidthMeter;
        try {
            if (z2) {
                try {
                    int i2 = dataSpec.f18747i;
                    z3 = true;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else {
                z3 = false;
            }
            if (z3) {
                try {
                    Assertions.d(this.f > 0);
                    this.d.getClass();
                    long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    int i3 = (int) (jElapsedRealtime - this.g);
                    this.j += (long) i3;
                    long j = this.k;
                    long j2 = this.f18764h;
                    this.k = j + j2;
                    if (i3 > 0) {
                        this.f18762c.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i3);
                        if (this.j >= 2000 || this.k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                            this.f18766l = (long) this.f18762c.b();
                        }
                        defaultBandwidthMeter = this;
                        defaultBandwidthMeter.h(i3, this.f18764h, this.f18766l);
                        defaultBandwidthMeter.g = jElapsedRealtime;
                        defaultBandwidthMeter.f18764h = 0L;
                    } else {
                        defaultBandwidthMeter = this;
                    }
                    defaultBandwidthMeter.f--;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final long g(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        ImmutableMap immutableMap = this.f18760a;
        Long l2 = (Long) immutableMap.get(numValueOf);
        if (l2 == null) {
            l2 = (Long) immutableMap.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    public final void h(int i2, long j, long j2) {
        final int i3;
        final long j3;
        final long j4;
        if (i2 == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        for (final BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener : this.f18761b.f18726a) {
            if (handlerAndListener.f18729c) {
                i3 = i2;
                j3 = j;
                j4 = j2;
            } else {
                i3 = i2;
                j3 = j;
                j4 = j2;
                handlerAndListener.f18727a.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener2 = handlerAndListener;
                        handlerAndListener2.f18728b.onBandwidthSample(i3, j3, j4);
                    }
                });
            }
            i2 = i3;
            j = j3;
            j2 = j4;
        }
    }
}
