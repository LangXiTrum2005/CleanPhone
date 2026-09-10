package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements x, ox1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ya1 f22421n = ca1.w(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ya1 f22422o = ca1.w(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ya1 f22423p = ca1.w(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ya1 f22424q = ca1.w(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ya1 f22425r = ca1.w(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ya1 f22426s = ca1.w(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static z f22427t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final db1 f22429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vf f22430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.o1 f22431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f22437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22438k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f22439m;

    public z(Context context, HashMap map) {
        boolean z10;
        this.f22428a = context == null ? null : context.getApplicationContext();
        this.f22429b = db1.a(map);
        this.f22430c = new vf();
        this.f22431d = new androidx.recyclerview.widget.o1();
        if (context == null) {
            this.l = 0;
            this.f22437j = 1000000L;
            return;
        }
        wo0 wo0VarA = wo0.a(context);
        int iB = wo0VarA.b();
        this.l = iB;
        this.f22437j = b(iB);
        y yVar = new y(this);
        Executor executorG = rb0.g();
        CopyOnWriteArrayList<nn0> copyOnWriteArrayList = wo0VarA.f21557b;
        for (nn0 nn0Var : copyOnWriteArrayList) {
            if (nn0Var.f17867a.get() == null) {
                copyOnWriteArrayList.remove(nn0Var);
            }
        }
        nn0 nn0Var2 = new nn0(wo0VarA, yVar, executorG);
        synchronized (wo0VarA.f21558c) {
            wo0VarA.f21557b.add(nn0Var2);
            z10 = wo0VarA.f21560e;
        }
        if (z10) {
            nn0Var2.f17868b.execute(new x60(nn0Var2, 18));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0130, code lost:
    
        if (r3.equals("AQ") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0148, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x016e, code lost:
    
        if (r3.equals("GM") != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0178, code lost:
    
        if (r3.equals("GL") != false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0182, code lost:
    
        if (r3.equals("GI") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d2, code lost:
    
        if (r3.equals("FK") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0214, code lost:
    
        if (r3.equals("ER") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x023a, code lost:
    
        if (r3.equals("CX") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0244, code lost:
    
        if (r3.equals("CW") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x025c, code lost:
    
        if (r3.equals("CU") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0282, code lost:
    
        if (r3.equals("CM") != false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x028c, code lost:
    
        if (r3.equals("CL") != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0296, code lost:
    
        if (r3.equals("CK") != false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02a0, code lost:
    
        if (r3.equals("ZW") != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x02c6, code lost:
    
        if (r3.equals("YT") != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x02d0, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02e8, code lost:
    
        if (r3.equals("WS") != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x02f2, code lost:
    
        if (r3.equals("WF") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02fc, code lost:
    
        if (r3.equals("VU") != false) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0330, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x033a, code lost:
    
        if (r3.equals("VC") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0344, code lost:
    
        if (r3.equals("VA") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0386, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x03ac, code lost:
    
        if (r3.equals("TV") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x03c4, code lost:
    
        if (r3.equals("TR") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03ea, code lost:
    
        if (r3.equals("TM") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x03f4, code lost:
    
        if (r3.equals("TL") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x03fe, code lost:
    
        if (r3.equals("TJ") != false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0408, code lost:
    
        if (r3.equals("TH") != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x040f, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0424, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x043c, code lost:
    
        if (r3.equals("SZ") != false) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0446, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0450, code lost:
    
        if (r3.equals("SX") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0476, code lost:
    
        if (r3.equals("SS") != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x047d, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x04ae, code lost:
    
        if (r3.equals("SM") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x04b8, code lost:
    
        if (r3.equals("SL") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x04d0, code lost:
    
        if (r3.equals("SJ") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x04da, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x04e4, code lost:
    
        if (r3.equals("SH") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x04fc, code lost:
    
        if (r3.equals("SE") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0506, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0510, code lost:
    
        if (r3.equals("SC") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x051a, code lost:
    
        if (r3.equals("SB") != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0521, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0064, code lost:
    
        if (r3.equals("CI") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x058a, code lost:
    
        if (r3.equals("PY") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05a2, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x05c8, code lost:
    
        if (r3.equals("PM") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x05fc, code lost:
    
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0622, code lost:
    
        if (r3.equals("PA") != false) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0648, code lost:
    
        if (r3.equals("NU") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x064f, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0656, code lost:
    
        if (r3.equals("NR") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007c, code lost:
    
        if (r3.equals("CG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x068a, code lost:
    
        if (r3.equals("NI") != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06a2, code lost:
    
        if (r3.equals("NF") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06a9, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x06b0, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x06ba, code lost:
    
        if (r3.equals("NC") != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x06c1, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x06d6, code lost:
    
        if (r3.equals("MZ") != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x06dd, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x072a, code lost:
    
        if (r3.equals("MT") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0734, code lost:
    
        if (r3.equals("MS") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x073e, code lost:
    
        if (r3.equals("MR") != false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0745, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x075a, code lost:
    
        if (r3.equals("MP") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0761, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0784, code lost:
    
        if (r3.equals("MM") != false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x078e, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x07a6, code lost:
    
        if (r3.equals("MH") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x07ad, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x07b4, code lost:
    
        if (r3.equals("MG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x07e8, code lost:
    
        if (r3.equals("MC") != false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x07ef, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0804, code lost:
    
        if (r3.equals("LY") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x080e, code lost:
    
        if (r3.equals("LV") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0834, code lost:
    
        if (r3.equals("LS") != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x083b, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0842, code lost:
    
        if (r3.equals("LR") != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x084c, code lost:
    
        if (r3.equals("LK") != false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0853, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x085a, code lost:
    
        if (r3.equals("LI") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x089c, code lost:
    
        if (r3.equals("KY") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x08a6, code lost:
    
        if (r3.equals("KW") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08be, code lost:
    
        if (r3.equals("KN") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x08c8, code lost:
    
        if (r3.equals("KM") != false) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x08cf, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x08d6, code lost:
    
        if (r3.equals("KI") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x08dd, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00be, code lost:
    
        if (r3.equals("BQ") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x091c, code lost:
    
        if (r3.equals("JO") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0934, code lost:
    
        if (r3.equals("JE") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x094b, code lost:
    
        if (r3.equals(com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE) != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x098d, code lost:
    
        if (r3.equals("IM") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0994, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x09c5, code lost:
    
        if (r3.equals("HU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x09cf, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x09d9, code lost:
    
        if (r3.equals("HR") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x09e0, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x0a57, code lost:
    
        if (r3.equals("EG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x0a5e, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0a65, code lost:
    
        if (r3.equals("EE") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0a6c, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x0a81, code lost:
    
        if (r3.equals("DZ") != false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x0a88, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0a8f, code lost:
    
        if (r3.equals("DO") != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x0a96, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0a9d, code lost:
    
        if (r3.equals("DM") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x0ab5, code lost:
    
        if (r3.equals("CR") != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x0abc, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0ac3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0aca, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0ad1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0ad8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0afb, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0b02, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f2, code lost:
    
        if (r3.equals("BL") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0b17, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0b1e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0b25, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0b2c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0b4f, code lost:
    
        if (r3.equals("AZ") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0b66, code lost:
    
        if (r3.equals("AI") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x0b9a, code lost:
    
        if (r3.equals("DJ") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0ba1, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0ba8, code lost:
    
        if (r3.equals("AG") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0baf, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x0bb6, code lost:
    
        if (r3.equals("AF") != false) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x0bbd, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0bd2, code lost:
    
        if (r3.equals("AD") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x0bdb, code lost:
    
        if (r3.equals("BZ") != false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:893:0x0be2, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:899:0x0bf7, code lost:
    
        if (r3.equals("BB") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010a, code lost:
    
        if (r3.equals("AT") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:901:0x0bfe, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:903:0x0c05, code lost:
    
        if (r3.equals("BA") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:905:0x0c0c, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:907:0x0c13, code lost:
    
        if (r3.equals("AX") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x0c1a, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x0c2f, code lost:
    
        if (r3.equals("AM") != false) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x0c36, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] c(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 6662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z.c(java.lang.String):int[]");
    }

    public final void a(int i10, long j10, final long j11) {
        final int i11;
        final long j12;
        if (i10 == 0) {
            if (j10 != 0) {
                j12 = j10;
            } else if (j11 == this.f22438k) {
                return;
            } else {
                j12 = 0;
            }
            i11 = 0;
        } else {
            i11 = i10;
            j12 = j10;
        }
        this.f22438k = j11;
        for (final w wVar : (CopyOnWriteArrayList) this.f22430c.f21157b) {
            if (!wVar.f21330c) {
                wVar.f21328a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object next;
                        Object objLast;
                        r32 r32Var;
                        d02 d02Var = wVar.f21329b;
                        v90 v90Var = d02Var.f13329d;
                        if (((ca1) v90Var.f21136b).isEmpty()) {
                            r32Var = null;
                        } else {
                            List list = (ca1) v90Var.f21136b;
                            if (list != null) {
                                if (list.isEmpty()) {
                                    throw new NoSuchElementException();
                                }
                                objLast = list.get(list.size() - 1);
                            } else if (list instanceof SortedSet) {
                                objLast = ((SortedSet) list).last();
                            } else {
                                aa1 aa1VarListIterator = list.listIterator(0);
                                do {
                                    next = aa1VarListIterator.next();
                                } while (aa1VarListIterator.hasNext());
                                objLast = next;
                            }
                            r32Var = (r32) objLast;
                        }
                        zz1 zz1VarI = d02Var.i(r32Var);
                        d02Var.f(zz1VarI, 1006, new b2.d0(zz1VarI, i11, j12, j11));
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    public final long b(int i10) {
        long jLongValue;
        Integer numValueOf = Integer.valueOf(i10);
        db1 db1Var = this.f22429b;
        Long lValueOf = (Long) db1Var.get(numValueOf);
        if (lValueOf == null) {
            lValueOf = (Long) db1Var.get(0);
        } else if (lValueOf.longValue() == C.TIME_UNSET) {
            String str = this.f22439m;
            if (str == null) {
                str = "";
            }
            int[] iArrC = c(str);
            if (i10 == 2) {
                jLongValue = ((Long) f22421n.get(iArrC[0])).longValue();
            } else if (i10 == 3) {
                jLongValue = ((Long) f22422o.get(iArrC[1])).longValue();
            } else if (i10 == 4) {
                jLongValue = ((Long) f22423p.get(iArrC[2])).longValue();
            } else if (i10 == 5) {
                jLongValue = ((Long) f22424q.get(iArrC[3])).longValue();
            } else if (i10 == 7) {
                jLongValue = ((Long) f22421n.get(iArrC[0])).longValue();
            } else if (i10 != 9) {
                jLongValue = i10 != 10 ? 1000000L : ((Long) f22425r.get(iArrC[4])).longValue();
            } else {
                jLongValue = ((Long) f22426s.get(iArrC[5])).longValue();
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final synchronized void d(po1 po1Var, boolean z10, int i10) {
        boolean z11;
        if (z10) {
            po1Var.getClass();
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f22434g += (long) i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final synchronized void f(po1 po1Var, boolean z10) throws Throwable {
        Throwable th2;
        boolean z11;
        z zVar;
        try {
            if (z10) {
                try {
                    po1Var.getClass();
                    z11 = true;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } else {
                z11 = false;
            }
            if (z11) {
                try {
                    ps1.c0(this.f22432e > 0);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i10 = (int) (jElapsedRealtime - this.f22433f);
                    this.f22435h += (long) i10;
                    long j10 = this.f22436i;
                    long j11 = this.f22434g;
                    this.f22436i = j10 + j11;
                    if (i10 > 0) {
                        androidx.recyclerview.widget.o1 o1Var = this.f22431d;
                        o1Var.n((j11 * 8000.0f) / i10, (int) Math.sqrt(j11));
                        if (this.f22435h >= 2000 || this.f22436i >= 524288) {
                            this.f22437j = (long) o1Var.o();
                        }
                        zVar = this;
                        zVar.a(i10, this.f22434g, this.f22437j);
                        zVar.f22433f = jElapsedRealtime;
                        zVar.f22434g = 0L;
                    } else {
                        zVar = this;
                    }
                    zVar.f22432e--;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final synchronized void i(yg1 yg1Var, po1 po1Var, boolean z10) {
        boolean z11;
        if (z10) {
            po1Var.getClass();
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f22432e == 0) {
                this.f22433f = SystemClock.elapsedRealtime();
            }
            this.f22432e++;
        }
    }
}
