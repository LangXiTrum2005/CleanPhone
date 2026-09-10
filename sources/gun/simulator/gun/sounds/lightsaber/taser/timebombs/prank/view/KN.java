package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class KN extends AbstractC5097yN {
    public static final int[] J1 = {1920, 1600, 1440, GL20.GL_INVALID_ENUM, 960, 854, 640, 540, 480};
    public static boolean K1;
    public static boolean L1;
    public int A1;
    public int B1;
    public final Context C0;
    public final C5213zh0 D0;
    public float D1;
    public final Gh0 E0;
    public Ih0 E1;
    public final long F0;
    public boolean F1;
    public final int G0;
    public int G1;
    public final boolean H0;
    public JN H1;
    public C4640t8 I0;
    public InterfaceC4685th0 I1;
    public boolean J0;
    public boolean K0;
    public Surface L0;
    public PlaceholderSurface M0;
    public boolean N0;
    public int O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public long S0;
    public long T0;
    public long U0;
    public int V0;
    public int W0;
    public int X0;
    public long u1;
    public long v1;
    public long w1;
    public int x1;
    public long y1;
    public int z1;

    public KN(Context context, G7 g7, Handler handler, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os) {
        super(2, g7, 30.0f);
        this.F0 = 5000L;
        this.G0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.C0 = applicationContext;
        this.D0 = new C5213zh0(applicationContext);
        this.E0 = new Gh0(handler, surfaceHolderCallbackC2658Os);
        this.H0 = "NVIDIA".equals(Ug0.c);
        this.T0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.z1 = -1;
        this.A1 = -1;
        this.D1 = -1.0f;
        this.O0 = 1;
        this.G1 = 0;
        this.E1 = null;
    }

    public static boolean o0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (KN.class) {
            try {
                if (!K1) {
                    L1 = p0();
                    K1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return L1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean p0() {
        int i = Ug0.f3833a;
        byte b = 7;
        if (i <= 28) {
            String str = Ug0.b;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i <= 27 && "HWEML".equals(Ug0.b)) {
            return true;
        }
        String str2 = Ug0.d;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i <= 26) {
                    String str3 = Ug0.b;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            if (!str3.equals("GIONEE_SWW1609")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case -2144781185:
                            if (!str3.equals("GIONEE_SWW1627")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case -2144781160:
                            if (!str3.equals("GIONEE_SWW1631")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case -2097309513:
                            if (!str3.equals("K50a40")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case -2022874474:
                            if (!str3.equals("CP8676_I02")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case -1978993182:
                            if (!str3.equals("NX541J")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        case -1978990237:
                            if (!str3.equals("NX573J")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b = -1;
                            }
                            break;
                        case -1936688066:
                            if (!str3.equals("PGN610")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case -1936688065:
                            if (!str3.equals("PGN611")) {
                                b = -1;
                            } else {
                                b = 9;
                            }
                            break;
                        case -1931988508:
                            if (!str3.equals("AquaPowerM")) {
                                b = -1;
                            } else {
                                b = 10;
                            }
                            break;
                        case -1885099851:
                            if (!str3.equals("RAIJIN")) {
                                b = -1;
                            } else {
                                b = 11;
                            }
                            break;
                        case -1696512866:
                            if (!str3.equals("XT1663")) {
                                b = -1;
                            } else {
                                b = 12;
                            }
                            break;
                        case -1680025915:
                            if (!str3.equals("ComioS1")) {
                                b = -1;
                            } else {
                                b = com.umeng.analytics.pro.cw.k;
                            }
                            break;
                        case -1615810839:
                            if (!str3.equals("Phantom6")) {
                                b = -1;
                            } else {
                                b = com.umeng.analytics.pro.cw.l;
                            }
                            break;
                        case -1600724499:
                            if (!str3.equals("pacificrim")) {
                                b = -1;
                            } else {
                                b = com.umeng.analytics.pro.cw.m;
                            }
                            break;
                        case -1554255044:
                            if (!str3.equals("vernee_M5")) {
                                b = -1;
                            } else {
                                b = com.umeng.analytics.pro.cw.n;
                            }
                            break;
                        case -1481772737:
                            if (!str3.equals("panell_dl")) {
                                b = -1;
                            } else {
                                b = 17;
                            }
                            break;
                        case -1481772730:
                            if (!str3.equals("panell_ds")) {
                                b = -1;
                            } else {
                                b = 18;
                            }
                            break;
                        case -1481772729:
                            if (!str3.equals("panell_dt")) {
                                b = -1;
                            } else {
                                b = 19;
                            }
                            break;
                        case -1320080169:
                            if (!str3.equals("GiONEE_GBL7319")) {
                                b = -1;
                            } else {
                                b = 20;
                            }
                            break;
                        case -1217592143:
                            if (!str3.equals("BRAVIA_ATV2")) {
                                b = -1;
                            } else {
                                b = 21;
                            }
                            break;
                        case -1180384755:
                            if (!str3.equals("iris60")) {
                                b = -1;
                            } else {
                                b = 22;
                            }
                            break;
                        case -1139198265:
                            if (!str3.equals("Slate_Pro")) {
                                b = -1;
                            } else {
                                b = 23;
                            }
                            break;
                        case -1052835013:
                            if (!str3.equals("namath")) {
                                b = -1;
                            } else {
                                b = 24;
                            }
                            break;
                        case -993250464:
                            if (!str3.equals("A10-70F")) {
                                b = -1;
                            } else {
                                b = 25;
                            }
                            break;
                        case -993250458:
                            if (!str3.equals("A10-70L")) {
                                b = -1;
                            } else {
                                b = 26;
                            }
                            break;
                        case -965403638:
                            if (!str3.equals("s905x018")) {
                                b = -1;
                            } else {
                                b = 27;
                            }
                            break;
                        case -958336948:
                            if (!str3.equals("ELUGA_Ray_X")) {
                                b = -1;
                            } else {
                                b = 28;
                            }
                            break;
                        case -879245230:
                            if (!str3.equals("tcl_eu")) {
                                b = -1;
                            } else {
                                b = 29;
                            }
                            break;
                        case -842500323:
                            if (!str3.equals("nicklaus_f")) {
                                b = -1;
                            } else {
                                b = 30;
                            }
                            break;
                        case -821392978:
                            if (!str3.equals("A7000-a")) {
                                b = -1;
                            } else {
                                b = 31;
                            }
                            break;
                        case -797483286:
                            if (!str3.equals("SVP-DTV15")) {
                                b = -1;
                            } else {
                                b = 32;
                            }
                            break;
                        case -794946968:
                            if (!str3.equals("watson")) {
                                b = -1;
                            } else {
                                b = 33;
                            }
                            break;
                        case -788334647:
                            if (!str3.equals("whyred")) {
                                b = -1;
                            } else {
                                b = 34;
                            }
                            break;
                        case -782144577:
                            if (!str3.equals("OnePlus5T")) {
                                b = -1;
                            } else {
                                b = 35;
                            }
                            break;
                        case -575125681:
                            if (!str3.equals("GiONEE_CBL7513")) {
                                b = -1;
                            } else {
                                b = 36;
                            }
                            break;
                        case -521118391:
                            if (!str3.equals("GIONEE_GBL7360")) {
                                b = -1;
                            } else {
                                b = 37;
                            }
                            break;
                        case -430914369:
                            if (!str3.equals("Pixi4-7_3G")) {
                                b = -1;
                            } else {
                                b = 38;
                            }
                            break;
                        case -290434366:
                            if (!str3.equals("taido_row")) {
                                b = -1;
                            } else {
                                b = 39;
                            }
                            break;
                        case -282781963:
                            if (!str3.equals("BLACK-1X")) {
                                b = -1;
                            } else {
                                b = 40;
                            }
                            break;
                        case -277133239:
                            if (!str3.equals("Z12_PRO")) {
                                b = -1;
                            } else {
                                b = 41;
                            }
                            break;
                        case -173639913:
                            if (!str3.equals("ELUGA_A3_Pro")) {
                                b = -1;
                            } else {
                                b = 42;
                            }
                            break;
                        case -56598463:
                            if (!str3.equals("woods_fn")) {
                                b = -1;
                            } else {
                                b = 43;
                            }
                            break;
                        case 2126:
                            if (!str3.equals("C1")) {
                                b = -1;
                            } else {
                                b = 44;
                            }
                            break;
                        case 2564:
                            if (!str3.equals("Q5")) {
                                b = -1;
                            } else {
                                b = 45;
                            }
                            break;
                        case 2715:
                            if (!str3.equals("V1")) {
                                b = -1;
                            } else {
                                b = 46;
                            }
                            break;
                        case 2719:
                            if (!str3.equals("V5")) {
                                b = -1;
                            } else {
                                b = 47;
                            }
                            break;
                        case 3091:
                            if (!str3.equals("b5")) {
                                b = -1;
                            } else {
                                b = 48;
                            }
                            break;
                        case 3483:
                            if (!str3.equals("mh")) {
                                b = -1;
                            } else {
                                b = 49;
                            }
                            break;
                        case 73405:
                            if (!str3.equals("JGZ")) {
                                b = -1;
                            } else {
                                b = 50;
                            }
                            break;
                        case 75537:
                            if (!str3.equals("M04")) {
                                b = -1;
                            } else {
                                b = 51;
                            }
                            break;
                        case 75739:
                            if (!str3.equals("M5c")) {
                                b = -1;
                            } else {
                                b = 52;
                            }
                            break;
                        case 76779:
                            if (!str3.equals("MX6")) {
                                b = -1;
                            } else {
                                b = 53;
                            }
                            break;
                        case 78669:
                            if (!str3.equals("P85")) {
                                b = -1;
                            } else {
                                b = 54;
                            }
                            break;
                        case 79305:
                            if (!str3.equals("PLE")) {
                                b = -1;
                            } else {
                                b = 55;
                            }
                            break;
                        case 80618:
                            if (!str3.equals("QX1")) {
                                b = -1;
                            } else {
                                b = 56;
                            }
                            break;
                        case 88274:
                            if (!str3.equals("Z80")) {
                                b = -1;
                            } else {
                                b = 57;
                            }
                            break;
                        case 98846:
                            if (!str3.equals("cv1")) {
                                b = -1;
                            } else {
                                b = 58;
                            }
                            break;
                        case 98848:
                            if (!str3.equals("cv3")) {
                                b = -1;
                            } else {
                                b = 59;
                            }
                            break;
                        case 99329:
                            if (!str3.equals("deb")) {
                                b = -1;
                            } else {
                                b = 60;
                            }
                            break;
                        case 101481:
                            if (!str3.equals("flo")) {
                                b = -1;
                            } else {
                                b = 61;
                            }
                            break;
                        case 1513190:
                            if (!str3.equals("1601")) {
                                b = -1;
                            } else {
                                b = 62;
                            }
                            break;
                        case 1514184:
                            if (!str3.equals("1713")) {
                                b = -1;
                            } else {
                                b = 63;
                            }
                            break;
                        case 1514185:
                            if (!str3.equals("1714")) {
                                b = -1;
                            } else {
                                b = 64;
                            }
                            break;
                        case 2133089:
                            if (!str3.equals("F01H")) {
                                b = -1;
                            } else {
                                b = 65;
                            }
                            break;
                        case 2133091:
                            if (!str3.equals("F01J")) {
                                b = -1;
                            } else {
                                b = 66;
                            }
                            break;
                        case 2133120:
                            if (!str3.equals("F02H")) {
                                b = -1;
                            } else {
                                b = 67;
                            }
                            break;
                        case 2133151:
                            if (!str3.equals("F03H")) {
                                b = -1;
                            } else {
                                b = 68;
                            }
                            break;
                        case 2133182:
                            if (!str3.equals("F04H")) {
                                b = -1;
                            } else {
                                b = 69;
                            }
                            break;
                        case 2133184:
                            if (!str3.equals("F04J")) {
                                b = -1;
                            } else {
                                b = 70;
                            }
                            break;
                        case 2436959:
                            if (!str3.equals("P681")) {
                                b = -1;
                            } else {
                                b = 71;
                            }
                            break;
                        case 2463773:
                            if (!str3.equals("Q350")) {
                                b = -1;
                            } else {
                                b = 72;
                            }
                            break;
                        case 2464648:
                            if (!str3.equals("Q427")) {
                                b = -1;
                            } else {
                                b = 73;
                            }
                            break;
                        case 2689555:
                            if (!str3.equals("XE2X")) {
                                b = -1;
                            } else {
                                b = 74;
                            }
                            break;
                        case 3154429:
                            if (!str3.equals("fugu")) {
                                b = -1;
                            } else {
                                b = 75;
                            }
                            break;
                        case 3284551:
                            if (!str3.equals("kate")) {
                                b = -1;
                            } else {
                                b = 76;
                            }
                            break;
                        case 3351335:
                            if (!str3.equals("mido")) {
                                b = -1;
                            } else {
                                b = 77;
                            }
                            break;
                        case 3386211:
                            if (!str3.equals("p212")) {
                                b = -1;
                            } else {
                                b = 78;
                            }
                            break;
                        case 41325051:
                            if (!str3.equals("MEIZU_M5")) {
                                b = -1;
                            } else {
                                b = 79;
                            }
                            break;
                        case 51349633:
                            if (!str3.equals("601LV")) {
                                b = -1;
                            } else {
                                b = 80;
                            }
                            break;
                        case 51350594:
                            if (!str3.equals("602LV")) {
                                b = -1;
                            } else {
                                b = 81;
                            }
                            break;
                        case 55178625:
                            if (!str3.equals("Aura_Note_2")) {
                                b = -1;
                            } else {
                                b = 82;
                            }
                            break;
                        case 61542055:
                            if (!str3.equals("A1601")) {
                                b = -1;
                            } else {
                                b = 83;
                            }
                            break;
                        case 65355429:
                            if (!str3.equals("E5643")) {
                                b = -1;
                            } else {
                                b = 84;
                            }
                            break;
                        case 66214468:
                            if (!str3.equals("F3111")) {
                                b = -1;
                            } else {
                                b = 85;
                            }
                            break;
                        case 66214470:
                            if (!str3.equals("F3113")) {
                                b = -1;
                            } else {
                                b = 86;
                            }
                            break;
                        case 66214473:
                            if (!str3.equals("F3116")) {
                                b = -1;
                            } else {
                                b = 87;
                            }
                            break;
                        case 66215429:
                            if (!str3.equals("F3211")) {
                                b = -1;
                            } else {
                                b = 88;
                            }
                            break;
                        case 66215431:
                            if (!str3.equals("F3213")) {
                                b = -1;
                            } else {
                                b = 89;
                            }
                            break;
                        case 66215433:
                            if (!str3.equals("F3215")) {
                                b = -1;
                            } else {
                                b = 90;
                            }
                            break;
                        case 66216390:
                            if (!str3.equals("F3311")) {
                                b = -1;
                            } else {
                                b = 91;
                            }
                            break;
                        case 76402249:
                            if (!str3.equals("PRO7S")) {
                                b = -1;
                            } else {
                                b = 92;
                            }
                            break;
                        case 76404105:
                            if (!str3.equals("Q4260")) {
                                b = -1;
                            } else {
                                b = 93;
                            }
                            break;
                        case 76404911:
                            if (!str3.equals("Q4310")) {
                                b = -1;
                            } else {
                                b = 94;
                            }
                            break;
                        case 80963634:
                            if (!str3.equals("V23GB")) {
                                b = -1;
                            } else {
                                b = 95;
                            }
                            break;
                        case 82882791:
                            if (!str3.equals("X3_HK")) {
                                b = -1;
                            } else {
                                b = 96;
                            }
                            break;
                        case 98715550:
                            if (!str3.equals("i9031")) {
                                b = -1;
                            } else {
                                b = 97;
                            }
                            break;
                        case 101370885:
                            if (!str3.equals("l5460")) {
                                b = -1;
                            } else {
                                b = 98;
                            }
                            break;
                        case 102844228:
                            if (!str3.equals("le_x6")) {
                                b = -1;
                            } else {
                                b = 99;
                            }
                            break;
                        case 165221241:
                            if (!str3.equals("A2016a40")) {
                                b = -1;
                            } else {
                                b = 100;
                            }
                            break;
                        case 182191441:
                            if (!str3.equals("CPY83_I00")) {
                                b = -1;
                            } else {
                                b = 101;
                            }
                            break;
                        case 245388979:
                            if (!str3.equals("marino_f")) {
                                b = -1;
                            } else {
                                b = 102;
                            }
                            break;
                        case 287431619:
                            if (!str3.equals("griffin")) {
                                b = -1;
                            } else {
                                b = 103;
                            }
                            break;
                        case 307593612:
                            if (!str3.equals("A7010a48")) {
                                b = -1;
                            } else {
                                b = 104;
                            }
                            break;
                        case 308517133:
                            if (!str3.equals("A7020a48")) {
                                b = -1;
                            } else {
                                b = 105;
                            }
                            break;
                        case 316215098:
                            if (!str3.equals("TB3-730F")) {
                                b = -1;
                            } else {
                                b = 106;
                            }
                            break;
                        case 316215116:
                            if (!str3.equals("TB3-730X")) {
                                b = -1;
                            } else {
                                b = 107;
                            }
                            break;
                        case 316246811:
                            if (!str3.equals("TB3-850F")) {
                                b = -1;
                            } else {
                                b = 108;
                            }
                            break;
                        case 316246818:
                            if (!str3.equals("TB3-850M")) {
                                b = -1;
                            } else {
                                b = 109;
                            }
                            break;
                        case 407160593:
                            if (!str3.equals("Pixi5-10_4G")) {
                                b = -1;
                            } else {
                                b = 110;
                            }
                            break;
                        case 507412548:
                            if (!str3.equals("QM16XE_U")) {
                                b = -1;
                            } else {
                                b = 111;
                            }
                            break;
                        case 793982701:
                            if (!str3.equals("GIONEE_WBL5708")) {
                                b = -1;
                            } else {
                                b = 112;
                            }
                            break;
                        case 794038622:
                            if (!str3.equals("GIONEE_WBL7365")) {
                                b = -1;
                            } else {
                                b = 113;
                            }
                            break;
                        case 794040393:
                            if (!str3.equals("GIONEE_WBL7519")) {
                                b = -1;
                            } else {
                                b = 114;
                            }
                            break;
                        case 835649806:
                            if (!str3.equals("manning")) {
                                b = -1;
                            } else {
                                b = 115;
                            }
                            break;
                        case 917340916:
                            if (!str3.equals("A7000plus")) {
                                b = -1;
                            } else {
                                b = 116;
                            }
                            break;
                        case 958008161:
                            if (!str3.equals("j2xlteins")) {
                                b = -1;
                            } else {
                                b = 117;
                            }
                            break;
                        case 1060579533:
                            if (!str3.equals("panell_d")) {
                                b = -1;
                            } else {
                                b = 118;
                            }
                            break;
                        case 1150207623:
                            if (!str3.equals("LS-5017")) {
                                b = -1;
                            } else {
                                b = 119;
                            }
                            break;
                        case 1176899427:
                            if (!str3.equals("itel_S41")) {
                                b = -1;
                            } else {
                                b = 120;
                            }
                            break;
                        case 1280332038:
                            if (!str3.equals("hwALE-H")) {
                                b = -1;
                            } else {
                                b = 121;
                            }
                            break;
                        case 1306947716:
                            if (!str3.equals("EverStar_S")) {
                                b = -1;
                            } else {
                                b = 122;
                            }
                            break;
                        case 1349174697:
                            if (!str3.equals("htc_e56ml_dtul")) {
                                b = -1;
                            } else {
                                b = 123;
                            }
                            break;
                        case 1522194893:
                            if (!str3.equals("woods_f")) {
                                b = -1;
                            } else {
                                b = 124;
                            }
                            break;
                        case 1691543273:
                            if (!str3.equals("CPH1609")) {
                                b = -1;
                            } else {
                                b = 125;
                            }
                            break;
                        case 1691544261:
                            if (!str3.equals("CPH1715")) {
                                b = -1;
                            } else {
                                b = 126;
                            }
                            break;
                        case 1709443163:
                            if (!str3.equals("iball8735_9806")) {
                                b = -1;
                            } else {
                                b = 127;
                            }
                            break;
                        case 1865889110:
                            if (!str3.equals("santoni")) {
                                b = -1;
                            } else {
                                b = 128;
                            }
                            break;
                        case 1906253259:
                            if (!str3.equals("PB2-670M")) {
                                b = -1;
                            } else {
                                b = 129;
                            }
                            break;
                        case 1977196784:
                            if (!str3.equals("Infinix-X572")) {
                                b = -1;
                            } else {
                                b = 130;
                            }
                            break;
                        case 2006372676:
                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                b = -1;
                            } else {
                                b = 131;
                            }
                            break;
                        case 2019281702:
                            if (!str3.equals("DM-01K")) {
                                b = -1;
                            } else {
                                b = 132;
                            }
                            break;
                        case 2029784656:
                            if (!str3.equals("HWBLN-H")) {
                                b = -1;
                            } else {
                                b = 133;
                            }
                            break;
                        case 2030379515:
                            if (!str3.equals("HWCAM-H")) {
                                b = -1;
                            } else {
                                b = 134;
                            }
                            break;
                        case 2033393791:
                            if (!str3.equals("ASUS_X00AD_2")) {
                                b = -1;
                            } else {
                                b = 135;
                            }
                            break;
                        case 2047190025:
                            if (!str3.equals("ELUGA_Note")) {
                                b = -1;
                            } else {
                                b = 136;
                            }
                            break;
                        case 2047252157:
                            if (!str3.equals("ELUGA_Prim")) {
                                b = -1;
                            } else {
                                b = 137;
                            }
                            break;
                        case 2048319463:
                            if (!str3.equals("HWVNS-H")) {
                                b = -1;
                            } else {
                                b = 138;
                            }
                            break;
                        case 2048855701:
                            if (!str3.equals("HWWAS-H")) {
                                b = -1;
                            } else {
                                b = 139;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case Input.Keys.PERIOD /* 56 */:
                        case Input.Keys.ALT_LEFT /* 57 */:
                        case Input.Keys.ALT_RIGHT /* 58 */:
                        case Input.Keys.SHIFT_LEFT /* 59 */:
                        case 60:
                        case Input.Keys.TAB /* 61 */:
                        case Input.Keys.SPACE /* 62 */:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case Input.Keys.GRAVE /* 68 */:
                        case Input.Keys.MINUS /* 69 */:
                        case Input.Keys.EQUALS /* 70 */:
                        case Input.Keys.LEFT_BRACKET /* 71 */:
                        case Input.Keys.RIGHT_BRACKET /* 72 */:
                        case Input.Keys.BACKSLASH /* 73 */:
                        case Input.Keys.SEMICOLON /* 74 */:
                        case Input.Keys.APOSTROPHE /* 75 */:
                        case Input.Keys.SLASH /* 76 */:
                        case Input.Keys.AT /* 77 */:
                        case Input.Keys.NUM /* 78 */:
                        case Input.Keys.HEADSETHOOK /* 79 */:
                        case Input.Keys.FOCUS /* 80 */:
                        case Input.Keys.PLUS /* 81 */:
                        case Input.Keys.MENU /* 82 */:
                        case Input.Keys.NOTIFICATION /* 83 */:
                        case Input.Keys.SEARCH /* 84 */:
                        case Input.Keys.MEDIA_PLAY_PAUSE /* 85 */:
                        case Input.Keys.MEDIA_STOP /* 86 */:
                        case Input.Keys.MEDIA_NEXT /* 87 */:
                        case Input.Keys.MEDIA_PREVIOUS /* 88 */:
                        case 89:
                        case Input.Keys.MEDIA_FAST_FORWARD /* 90 */:
                        case Input.Keys.MUTE /* 91 */:
                        case 92:
                        case Input.Keys.PAGE_DOWN /* 93 */:
                        case 94:
                        case Input.Keys.SWITCH_CHARSET /* 95 */:
                        case Input.Keys.BUTTON_A /* 96 */:
                        case Input.Keys.BUTTON_B /* 97 */:
                        case Input.Keys.BUTTON_C /* 98 */:
                        case Input.Keys.BUTTON_X /* 99 */:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case ASSET_FAILED_STATUS_CODE_VALUE:
                        case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                        case JSON_ENCODE_ERROR_VALUE:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case INVALID_METRICS_ENDPOINT_VALUE:
                        case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                        case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case Input.Keys.F9 /* 139 */:
                            return true;
                    }
                }
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    public static int q0(C4619sw c4619sw, C4745uN c4745uN) {
        int i;
        int iIntValue;
        int i2 = c4619sw.q;
        if (i2 == -1 || (i = c4619sw.r) == -1) {
            return -1;
        }
        String str = c4619sw.l;
        if ("video/dolby-vision".equals(str)) {
            Pair pairD = GN.d(c4619sw);
            str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return ((i2 * i) * 3) / 4;
            case "video/hevc":
                return Math.max(2097152, ((i2 * i) * 3) / 4);
            case "video/avc":
                String str2 = Ug0.d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Ug0.c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && c4745uN.f)))) {
                    return -1;
                }
                return ((Ug0.g(i, 16) * Ug0.g(i2, 16)) * 768) / 4;
            case "video/x-vnd.on2.vp9":
                return ((i2 * i) * 3) / 8;
            default:
                return -1;
        }
    }

    public static AC r0(Context context, InterfaceC5185zN interfaceC5185zN, C4619sw c4619sw, boolean z, boolean z2) {
        String str = c4619sw.l;
        if (str == null) {
            C5086yC c5086yC = AC.b;
            return C3965lY.e;
        }
        ((C2297Au) interfaceC5185zN).getClass();
        List listE = GN.e(str, z, z2);
        String strB = GN.b(c4619sw);
        if (strB == null) {
            return AC.j(listE);
        }
        List listE2 = GN.e(strB, z, z2);
        if (Ug0.f3833a >= 26 && "video/dolby-vision".equals(c4619sw.l) && !listE2.isEmpty() && !IN.a(context)) {
            return AC.j(listE2);
        }
        C5086yC c5086yC2 = AC.b;
        C4998xC c4998xC = new C4998xC();
        c4998xC.I0(listE);
        c4998xC.I0(listE2);
        return c4998xC.J0();
    }

    public static int s0(C4619sw c4619sw, C4745uN c4745uN) {
        if (c4619sw.m == -1) {
            return q0(c4619sw, c4745uN);
        }
        List list = c4619sw.n;
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) list.get(i)).length;
        }
        return c4619sw.m + length;
    }

    public final void A0(int i, int i2) {
        C2599Ml c2599Ml = this.x0;
        c2599Ml.h += i;
        int i3 = i + i2;
        c2599Ml.g += i3;
        this.V0 += i3;
        int i4 = this.W0 + i3;
        this.W0 = i4;
        c2599Ml.i = Math.max(i4, c2599Ml.i);
        int i5 = this.G0;
        if (i5 <= 0 || this.V0 < i5) {
            return;
        }
        t0();
    }

    public final void B0(long j) {
        C2599Ml c2599Ml = this.x0;
        c2599Ml.k += j;
        c2599Ml.l++;
        this.w1 += j;
        this.x1++;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final boolean G() {
        return this.F1 && Ug0.f3833a < 23;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final float H(float f, C4619sw[] c4619swArr) {
        float fMax = -1.0f;
        for (C4619sw c4619sw : c4619swArr) {
            float f2 = c4619sw.s;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final ArrayList I(InterfaceC5185zN interfaceC5185zN, C4619sw c4619sw, boolean z) {
        AC acR0 = r0(this.C0, interfaceC5185zN, c4619sw, z, this.F1);
        Pattern pattern = GN.f3119a;
        ArrayList arrayList = new ArrayList(acR0);
        Collections.sort(arrayList, new BN(new AN(c4619sw)));
        return arrayList;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final C4130nN K(C4745uN c4745uN, C4619sw c4619sw, MediaCrypto mediaCrypto, float f) {
        C2879Xf c2879Xf;
        C4640t8 c4640t8;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        boolean z;
        Pair pairD;
        int iQ0;
        PlaceholderSurface placeholderSurface = this.M0;
        if (placeholderSurface != null && placeholderSurface.secure != c4745uN.f) {
            if (this.L0 == placeholderSurface) {
                this.L0 = null;
            }
            placeholderSurface.release();
            this.M0 = null;
        }
        String str = c4745uN.c;
        C4619sw[] c4619swArr = this.h;
        c4619swArr.getClass();
        int iMax = c4619sw.q;
        int iS0 = s0(c4619sw, c4745uN);
        int length = c4619swArr.length;
        float f2 = c4619sw.s;
        int i = c4619sw.q;
        C2879Xf c2879Xf2 = c4619sw.x;
        int i2 = c4619sw.r;
        if (length == 1) {
            if (iS0 != -1 && (iQ0 = q0(c4619sw, c4745uN)) != -1) {
                iS0 = Math.min((int) (iS0 * 1.5f), iQ0);
            }
            c4640t8 = new C4640t8(iMax, i2, iS0);
            c2879Xf = c2879Xf2;
        } else {
            int iMax2 = i2;
            int i3 = 0;
            boolean z2 = false;
            for (int length2 = c4619swArr.length; i3 < length2; length2 = length2) {
                C4619sw c4619sw2 = c4619swArr[i3];
                C4619sw[] c4619swArr2 = c4619swArr;
                if (c2879Xf2 != null && c4619sw2.x == null) {
                    C4531rw c4531rwA = c4619sw2.a();
                    c4531rwA.w = c2879Xf2;
                    c4619sw2 = new C4619sw(c4531rwA);
                }
                if (c4745uN.b(c4619sw, c4619sw2).d != 0) {
                    int i4 = c4619sw2.r;
                    int i5 = c4619sw2.q;
                    z2 |= i5 == -1 || i4 == -1;
                    iMax = Math.max(iMax, i5);
                    iMax2 = Math.max(iMax2, i4);
                    iS0 = Math.max(iS0, s0(c4619sw2, c4745uN));
                }
                i3++;
                c4619swArr = c4619swArr2;
            }
            if (z2) {
                AbstractC4038mJ.f();
                boolean z3 = i2 > i;
                int i6 = z3 ? i2 : i;
                int i7 = z3 ? i : i2;
                float f3 = i7 / i6;
                int[] iArr = J1;
                c2879Xf = c2879Xf2;
                int i8 = 0;
                while (true) {
                    if (i8 < 9) {
                        int i9 = iArr[i8];
                        int[] iArr2 = iArr;
                        int i10 = (int) (i9 * f3);
                        if (i9 > i6 && i10 > i7) {
                            int i11 = i6;
                            int i12 = i7;
                            if (Ug0.f3833a < 21) {
                                f3 = f3;
                                try {
                                    int iG = Ug0.g(i9, 16) * 16;
                                    int iG2 = Ug0.g(i10, 16) * 16;
                                    if (iG * iG2 <= GN.i()) {
                                        int i13 = z3 ? iG2 : iG;
                                        if (!z3) {
                                            iG = iG2;
                                        }
                                        point = new Point(i13, iG);
                                        break;
                                    }
                                    i8++;
                                    iArr = iArr2;
                                    i6 = i11;
                                    i7 = i12;
                                    f3 = f3;
                                } catch (DN unused) {
                                    point = null;
                                    break;
                                }
                            } else {
                                int i14 = z3 ? i10 : i9;
                                if (!z3) {
                                    i9 = i10;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = c4745uN.d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point2 = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point2 = new Point(Ug0.g(i14, widthAlignment) * widthAlignment, Ug0.g(i9, heightAlignment) * heightAlignment);
                                }
                                Point point3 = point2;
                                if (c4745uN.f(point2.x, point2.y, f2)) {
                                    point = point3;
                                    break;
                                }
                                i8++;
                                iArr = iArr2;
                                i6 = i11;
                                i7 = i12;
                                f3 = f3;
                            }
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    C4531rw c4531rwA2 = c4619sw.a();
                    c4531rwA2.p = iMax;
                    c4531rwA2.q = iMax2;
                    iS0 = Math.max(iS0, q0(new C4619sw(c4531rwA2), c4745uN));
                    AbstractC4038mJ.f();
                }
            } else {
                c2879Xf = c2879Xf2;
            }
            c4640t8 = new C4640t8(iMax, iMax2, iS0);
        }
        this.I0 = c4640t8;
        int i15 = this.F1 ? this.G1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i);
        mediaFormat.setInteger("height", i2);
        FW.Y(mediaFormat, c4619sw.n);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        FW.N(mediaFormat, "rotation-degrees", c4619sw.t);
        if (c2879Xf != null) {
            C2879Xf c2879Xf3 = c2879Xf;
            FW.N(mediaFormat, "color-transfer", c2879Xf3.c);
            FW.N(mediaFormat, "color-standard", c2879Xf3.f3985a);
            FW.N(mediaFormat, "color-range", c2879Xf3.b);
            byte[] bArr = c2879Xf3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c4619sw.l) && (pairD = GN.d(c4619sw)) != null) {
            FW.N(mediaFormat, Scopes.PROFILE, ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", c4640t8.f5019a);
        mediaFormat.setInteger("max-height", c4640t8.b);
        FW.N(mediaFormat, "max-input-size", c4640t8.c);
        if (Ug0.f3833a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.H0) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (this.L0 == null) {
            if (!y0(c4745uN)) {
                throw new IllegalStateException();
            }
            if (this.M0 == null) {
                this.M0 = PlaceholderSurface.d(this.C0, c4745uN.f);
            }
            this.L0 = this.M0;
        }
        return new C4130nN(c4745uN, mediaFormat, c4619sw, this.L0, mediaCrypto);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void L(C2677Pl c2677Pl) {
        if (this.K0) {
            ByteBuffer byteBuffer = c2677Pl.g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC4306pN interfaceC4306pN = this.G;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC4306pN.e(bundle);
                    }
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void P(Exception exc) {
        AbstractC4038mJ.d("Video codec error", exc);
        Gh0 gh0 = this.E0;
        Handler handler = gh0.f3131a;
        if (handler != null) {
            handler.post(new RunnableC3976le0(21, gh0, exc));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void Q(String str, long j, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Gh0 gh0 = this.E0;
        Handler handler = gh0.f3131a;
        if (handler != null) {
            handler.post(new RunnableC3847k7(gh0, str, j, j2, 1));
        }
        this.J0 = o0(str);
        C4745uN c4745uN = this.N;
        c4745uN.getClass();
        boolean z = false;
        if (Ug0.f3833a >= 29 && MimeTypes.VIDEO_VP9.equals(c4745uN.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c4745uN.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.K0 = z;
        if (Ug0.f3833a < 23 || !this.F1) {
            return;
        }
        InterfaceC4306pN interfaceC4306pN = this.G;
        interfaceC4306pN.getClass();
        this.H1 = new JN(this, interfaceC4306pN);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void R(String str) {
        Gh0 gh0 = this.E0;
        Handler handler = gh0.f3131a;
        if (handler != null) {
            handler.post(new RunnableC3976le0(20, gh0, str));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final C2729Rl S(C3692iN c3692iN) {
        C2729Rl c2729RlS = super.S(c3692iN);
        C4619sw c4619sw = (C4619sw) c3692iN.c;
        Gh0 gh0 = this.E0;
        Handler handler = gh0.f3131a;
        if (handler != null) {
            handler.post(new RunnableC4746uO(gh0, c4619sw, c2729RlS, 8));
        }
        return c2729RlS;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void T(C4619sw c4619sw, MediaFormat mediaFormat) {
        InterfaceC4306pN interfaceC4306pN = this.G;
        if (interfaceC4306pN != null) {
            interfaceC4306pN.setVideoScalingMode(this.O0);
        }
        if (this.F1) {
            this.z1 = c4619sw.q;
            this.A1 = c4619sw.r;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.z1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.A1 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f = c4619sw.u;
        this.D1 = f;
        int i = Ug0.f3833a;
        int i2 = c4619sw.t;
        if (i < 21) {
            this.B1 = i2;
        } else if (i2 == 90 || i2 == 270) {
            int i3 = this.z1;
            this.z1 = this.A1;
            this.A1 = i3;
            this.D1 = 1.0f / f;
        }
        C5213zh0 c5213zh0 = this.D0;
        c5213zh0.f = c4619sw.s;
        C2764Su c2764Su = c5213zh0.f5337a;
        c2764Su.f3741a.c();
        c2764Su.b.c();
        c2764Su.c = false;
        c2764Su.d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        c2764Su.e = 0;
        c5213zh0.b();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void V(long j) {
        super.V(j);
        if (this.F1) {
            return;
        }
        this.X0--;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void W() {
        n0();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void X(C2677Pl c2677Pl) {
        boolean z = this.F1;
        if (!z) {
            this.X0++;
        }
        if (Ug0.f3833a >= 23 || !z) {
            return;
        }
        long j = c2677Pl.f;
        m0(j);
        v0();
        this.x0.e++;
        u0();
        V(j);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final boolean Z(long j, long j2, InterfaceC4306pN interfaceC4306pN, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C4619sw c4619sw) {
        boolean z3;
        long j4;
        long j5;
        interfaceC4306pN.getClass();
        if (this.S0 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.S0 = j;
        }
        if (j3 != this.u1) {
            C5213zh0 c5213zh0 = this.D0;
            long j6 = c5213zh0.n;
            if (j6 != -1) {
                c5213zh0.p = j6;
                c5213zh0.q = c5213zh0.o;
            }
            c5213zh0.m++;
            long j7 = j3 * 1000;
            C2764Su c2764Su = c5213zh0.f5337a;
            c2764Su.f3741a.b(j7);
            if (c2764Su.f3741a.a()) {
                c2764Su.c = false;
            } else if (c2764Su.d != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                if (c2764Su.c) {
                    C2738Ru c2738Ru = c2764Su.b;
                    long j8 = c2738Ru.d;
                    if (j8 != 0) {
                        if (c2738Ru.g[(int) ((j8 - 1) % 15)]) {
                            c2764Su.b.c();
                            c2764Su.b.b(c2764Su.d);
                        }
                    }
                } else {
                    c2764Su.b.c();
                    c2764Su.b.b(c2764Su.d);
                }
                c2764Su.c = true;
                c2764Su.b.b(j7);
            }
            if (c2764Su.c && c2764Su.b.a()) {
                C2738Ru c2738Ru2 = c2764Su.f3741a;
                c2764Su.f3741a = c2764Su.b;
                c2764Su.b = c2738Ru2;
                c2764Su.c = false;
            }
            c2764Su.d = j7;
            c2764Su.e = c2764Su.f3741a.a() ? 0 : c2764Su.e + 1;
            c5213zh0.b();
            this.u1 = j3;
        }
        long j9 = this.y0.b;
        long j10 = j3 - j9;
        if (z && !z2) {
            z0(interfaceC4306pN, i);
            return true;
        }
        double d = this.E;
        boolean z4 = this.f == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j11 = (long) ((j3 - j) / d);
        if (z4) {
            j11 -= jElapsedRealtime - j2;
        }
        if (this.L0 == this.M0) {
            if (j11 >= -30000) {
                return false;
            }
            z0(interfaceC4306pN, i);
            B0(j11);
            return true;
        }
        long j12 = jElapsedRealtime - this.v1;
        boolean z5 = this.R0 ? !this.P0 : z4 || this.Q0;
        if (this.T0 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j >= j9 && (z5 || (z4 && j11 < -30000 && j12 > 100000))) {
            long jNanoTime = System.nanoTime();
            InterfaceC4685th0 interfaceC4685th0 = this.I1;
            if (interfaceC4685th0 != null) {
                interfaceC4685th0.a(j10, jNanoTime, c4619sw, this.I);
            }
            if (Ug0.f3833a >= 21) {
                x0(interfaceC4306pN, i, jNanoTime);
            } else {
                w0(interfaceC4306pN, i);
            }
            B0(j11);
            return true;
        }
        if (!z4 || j == this.S0) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long j13 = (j11 * 1000) + jNanoTime2;
        C5213zh0 c5213zh1 = this.D0;
        if (c5213zh1.p != -1 && c5213zh1.f5337a.f3741a.a()) {
            C2764Su c2764Su2 = c5213zh1.f5337a;
            if (c2764Su2.f3741a.a()) {
                C2738Ru c2738Ru3 = c2764Su2.f3741a;
                long j14 = c2738Ru3.e;
                j5 = j14 == 0 ? 0L : c2738Ru3.f / j14;
            } else {
                j5 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            }
            long j15 = c5213zh1.q + ((long) (((c5213zh1.m - c5213zh1.p) * j5) / c5213zh1.i));
            if (Math.abs(j13 - j15) <= 20000000) {
                j13 = j15;
            } else {
                c5213zh1.m = 0L;
                c5213zh1.p = -1L;
                c5213zh1.n = -1L;
            }
        }
        c5213zh1.n = c5213zh1.m;
        c5213zh1.o = j13;
        ChoreographerFrameCallbackC5125yh0 choreographerFrameCallbackC5125yh0 = c5213zh1.c;
        if (choreographerFrameCallbackC5125yh0 != null && c5213zh1.k != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            long j16 = choreographerFrameCallbackC5125yh0.f5292a;
            if (j16 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                long j17 = c5213zh1.k;
                long j18 = (((j13 - j16) / j17) * j17) + j16;
                if (j13 <= j18) {
                    j4 = j18 - j17;
                } else {
                    j4 = j18;
                    j18 = j17 + j18;
                }
                if (j18 - j13 >= j13 - j4) {
                    j18 = j4;
                }
                j13 = j18 - c5213zh1.l;
            }
        }
        long j19 = (j13 - jNanoTime2) / 1000;
        boolean z6 = this.T0 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        if (j19 < -500000 && !z2) {
            W20 w20 = this.g;
            w20.getClass();
            int iSkipData = w20.skipData(j - this.i);
            if (iSkipData != 0) {
                if (z6) {
                    C2599Ml c2599Ml = this.x0;
                    c2599Ml.d += iSkipData;
                    c2599Ml.f += this.X0;
                } else {
                    this.x0.j++;
                    A0(iSkipData, this.X0);
                }
                if (!E()) {
                    return false;
                }
                N();
                return false;
            }
        }
        if (j19 < -30000 && !z2) {
            if (z6) {
                z0(interfaceC4306pN, i);
                z3 = true;
            } else {
                FW.c("dropVideoBuffer");
                interfaceC4306pN.j(i, false);
                FW.A();
                z3 = true;
                A0(0, 1);
            }
            B0(j19);
            return z3;
        }
        if (Ug0.f3833a >= 21) {
            if (j19 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                if (j13 == this.y1) {
                    z0(interfaceC4306pN, i);
                } else {
                    InterfaceC4685th0 interfaceC4685th1 = this.I1;
                    if (interfaceC4685th1 != null) {
                        interfaceC4685th1.a(j10, j13, c4619sw, this.I);
                    }
                    x0(interfaceC4306pN, i, j13);
                }
                B0(j19);
                this.y1 = j13;
                return true;
            }
        } else if (j19 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            if (j19 > 11000) {
                try {
                    Thread.sleep((j19 - WorkRequest.MIN_BACKOFF_MILLIS) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            InterfaceC4685th0 interfaceC4685th2 = this.I1;
            if (interfaceC4685th2 != null) {
                interfaceC4685th2.a(j10, j13, c4619sw, this.I);
            }
            w0(interfaceC4306pN, i);
            B0(j19);
            return true;
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void d0() {
        super.d0();
        this.X0 = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final String e() {
        return "MediaCodecVideoRenderer";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final boolean h() {
        PlaceholderSurface placeholderSurface;
        if (super.h() && (this.P0 || (((placeholderSurface = this.M0) != null && this.L0 == placeholderSurface) || this.G == null || this.F1))) {
            this.T0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            return true;
        }
        if (this.T0 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.T0) {
            return true;
        }
        this.T0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final boolean h0(C4745uN c4745uN) {
        return this.L0 != null || y0(c4745uN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pN] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.google.android.exoplayer2.video.PlaceholderSurface] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YU
    public final void handleMessage(int i, Object obj) {
        ?? D;
        Handler handler;
        Handler handler2;
        Surface surface;
        int iIntValue;
        C5213zh0 c5213zh0 = this.D0;
        if (i != 1) {
            if (i == 7) {
                this.I1 = (InterfaceC4685th0) obj;
                return;
            }
            if (i == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.G1 != iIntValue2) {
                    this.G1 = iIntValue2;
                    if (this.F1) {
                        b0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i == 5 && c5213zh0.j != (iIntValue = ((Integer) obj).intValue())) {
                    c5213zh0.j = iIntValue;
                    c5213zh0.c(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.O0 = iIntValue3;
            InterfaceC4306pN interfaceC4306pN = this.G;
            if (interfaceC4306pN != null) {
                interfaceC4306pN.setVideoScalingMode(iIntValue3);
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            D = 0;
        }
        if (D == 0) {
            PlaceholderSurface placeholderSurface = this.M0;
            if (placeholderSurface != null) {
                D = surface;
                D = placeholderSurface;
            } else {
                C4745uN c4745uN = this.N;
                if (c4745uN != null && y0(c4745uN)) {
                    D = surface;
                    D = PlaceholderSurface.d(this.C0, c4745uN.f);
                    this.M0 = D;
                }
            }
        }
        D = surface;
        D = surface;
        D = surface;
        Surface surface2 = this.L0;
        int i2 = 19;
        Gh0 gh0 = this.E0;
        if (surface2 == D) {
            if (D == 0 || D == this.M0) {
                return;
            }
            Ih0 ih0 = this.E1;
            if (ih0 != null && (handler = gh0.f3131a) != null) {
                handler.post(new RunnableC3976le0(i2, gh0, ih0));
            }
            if (this.N0) {
                Surface surface3 = this.L0;
                Handler handler3 = gh0.f3131a;
                if (handler3 != null) {
                    handler3.post(new Eh0(gh0, surface3, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            return;
        }
        this.L0 = D;
        c5213zh0.getClass();
        ?? r7 = D instanceof PlaceholderSurface ? 0 : D;
        if (c5213zh0.e != r7) {
            c5213zh0.a();
            c5213zh0.e = r7;
            c5213zh0.c(true);
        }
        this.N0 = false;
        int i3 = this.f;
        ?? r0 = this.G;
        if (r0 != 0) {
            if (Ug0.f3833a < 23 || D == 0 || this.J0) {
                b0();
                N();
            } else {
                r0.c(D);
            }
        }
        if (D == 0 || D == this.M0) {
            this.E1 = null;
            n0();
            return;
        }
        Ih0 ih1 = this.E1;
        if (ih1 != null && (handler2 = gh0.f3131a) != null) {
            handler2.post(new RunnableC3976le0(i2, gh0, ih1));
        }
        n0();
        if (i3 == 2) {
            long j = this.F0;
            this.T0 = j > 0 ? SystemClock.elapsedRealtime() + j : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void i() {
        Gh0 gh0 = this.E0;
        this.E1 = null;
        n0();
        this.N0 = false;
        this.H1 = null;
        try {
            super.i();
            C2599Ml c2599Ml = this.x0;
            gh0.getClass();
            synchronized (c2599Ml) {
            }
            Handler handler = gh0.f3131a;
            if (handler != null) {
                handler.post(new Fh0(gh0, c2599Ml, 0));
            }
        } catch (Throwable th) {
            gh0.a(this.x0);
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void j(boolean z, boolean z2) {
        this.x0 = new C2599Ml();
        C5196zY c5196zY = this.c;
        c5196zY.getClass();
        boolean z3 = c5196zY.f5328a;
        FW.s((z3 && this.G1 == 0) ? false : true);
        if (this.F1 != z3) {
            this.F1 = z3;
            b0();
        }
        C2599Ml c2599Ml = this.x0;
        Gh0 gh0 = this.E0;
        Handler handler = gh0.f3131a;
        if (handler != null) {
            handler.post(new Fh0(gh0, c2599Ml, 1));
        }
        this.Q0 = z2;
        this.R0 = false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final int j0(InterfaceC5185zN interfaceC5185zN, C4619sw c4619sw) {
        boolean z;
        int i = 0;
        if (!AbstractC5011xP.m(c4619sw.l)) {
            return AbstractC3950lJ.b(0, 0, 0);
        }
        boolean z2 = c4619sw.o != null;
        Context context = this.C0;
        AC acR0 = r0(context, interfaceC5185zN, c4619sw, z2, false);
        if (z2 && acR0.isEmpty()) {
            acR0 = r0(context, interfaceC5185zN, c4619sw, false, false);
        }
        if (acR0.isEmpty()) {
            return AbstractC3950lJ.b(1, 0, 0);
        }
        int i2 = c4619sw.G;
        if (i2 != 0 && i2 != 2) {
            return AbstractC3950lJ.b(2, 0, 0);
        }
        C4745uN c4745uN = (C4745uN) acR0.get(0);
        boolean zD = c4745uN.d(c4619sw);
        if (!zD) {
            int i3 = 1;
            while (true) {
                if (i3 >= acR0.size()) {
                    z = true;
                    break;
                }
                C4745uN c4745uN2 = (C4745uN) acR0.get(i3);
                if (c4745uN2.d(c4619sw)) {
                    c4745uN = c4745uN2;
                    z = false;
                    zD = true;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zD ? 4 : 3;
        int i5 = c4745uN.e(c4619sw) ? 16 : 8;
        int i6 = c4745uN.g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (Ug0.f3833a >= 26 && "video/dolby-vision".equals(c4619sw.l) && !IN.a(context)) {
            i7 = 256;
        }
        if (zD) {
            AC acR1 = r0(context, interfaceC5185zN, c4619sw, z2, true);
            if (!acR1.isEmpty()) {
                Pattern pattern = GN.f3119a;
                ArrayList arrayList = new ArrayList(acR1);
                Collections.sort(arrayList, new BN(new AN(c4619sw)));
                C4745uN c4745uN3 = (C4745uN) arrayList.get(0);
                if (c4745uN3.d(c4619sw) && c4745uN3.e(c4619sw)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void k(long j, boolean z) {
        super.k(j, z);
        n0();
        C5213zh0 c5213zh0 = this.D0;
        c5213zh0.m = 0L;
        c5213zh0.p = -1L;
        c5213zh0.n = -1L;
        long jElapsedRealtime = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.u1 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.S0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.W0 = 0;
        if (!z) {
            this.T0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            return;
        }
        long j2 = this.F0;
        if (j2 > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + j2;
        }
        this.T0 = jElapsedRealtime;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void l() {
        try {
            try {
                z();
                b0();
                InterfaceC2889Xp interfaceC2889Xp = this.A;
                if (interfaceC2889Xp != null) {
                    interfaceC2889Xp.b(null);
                }
                this.A = null;
                PlaceholderSurface placeholderSurface = this.M0;
                if (placeholderSurface != null) {
                    if (this.L0 == placeholderSurface) {
                        this.L0 = null;
                    }
                    placeholderSurface.release();
                    this.M0 = null;
                }
            } catch (Throwable th) {
                InterfaceC2889Xp interfaceC2889Xp2 = this.A;
                if (interfaceC2889Xp2 != null) {
                    interfaceC2889Xp2.b(null);
                }
                this.A = null;
                throw th;
            }
        } catch (Throwable th2) {
            PlaceholderSurface placeholderSurface2 = this.M0;
            if (placeholderSurface2 != null) {
                if (this.L0 == placeholderSurface2) {
                    this.L0 = null;
                }
                placeholderSurface2.release();
                this.M0 = null;
            }
            throw th2;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void m() {
        this.V0 = 0;
        this.U0 = SystemClock.elapsedRealtime();
        this.v1 = SystemClock.elapsedRealtime() * 1000;
        this.w1 = 0L;
        this.x1 = 0;
        C5213zh0 c5213zh0 = this.D0;
        c5213zh0.d = true;
        c5213zh0.m = 0L;
        c5213zh0.p = -1L;
        c5213zh0.n = -1L;
        InterfaceC4861vh0 interfaceC4861vh0 = c5213zh0.b;
        if (interfaceC4861vh0 != null) {
            ChoreographerFrameCallbackC5125yh0 choreographerFrameCallbackC5125yh0 = c5213zh0.c;
            choreographerFrameCallbackC5125yh0.getClass();
            choreographerFrameCallbackC5125yh0.b.sendEmptyMessage(1);
            interfaceC4861vh0.b(new Md0(c5213zh0, 24));
        }
        c5213zh0.c(false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void n() {
        this.T0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        t0();
        int i = this.x1;
        if (i != 0) {
            long j = this.w1;
            Gh0 gh0 = this.E0;
            Handler handler = gh0.f3131a;
            if (handler != null) {
                handler.post(new Dh0(gh0, j, i));
            }
            this.w1 = 0L;
            this.x1 = 0;
        }
        C5213zh0 c5213zh0 = this.D0;
        c5213zh0.d = false;
        InterfaceC4861vh0 interfaceC4861vh0 = c5213zh0.b;
        if (interfaceC4861vh0 != null) {
            interfaceC4861vh0.a();
            ChoreographerFrameCallbackC5125yh0 choreographerFrameCallbackC5125yh0 = c5213zh0.c;
            choreographerFrameCallbackC5125yh0.getClass();
            choreographerFrameCallbackC5125yh0.b.sendEmptyMessage(2);
        }
        c5213zh0.a();
    }

    public final void n0() {
        InterfaceC4306pN interfaceC4306pN;
        this.P0 = false;
        if (Ug0.f3833a < 23 || !this.F1 || (interfaceC4306pN = this.G) == null) {
            return;
        }
        this.H1 = new JN(this, interfaceC4306pN);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void t(float f, float f2) {
        super.t(f, f2);
        C5213zh0 c5213zh0 = this.D0;
        c5213zh0.i = f;
        c5213zh0.m = 0L;
        c5213zh0.p = -1L;
        c5213zh0.n = -1L;
        c5213zh0.c(false);
    }

    public final void t0() {
        if (this.V0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.U0;
            int i = this.V0;
            Gh0 gh0 = this.E0;
            Handler handler = gh0.f3131a;
            if (handler != null) {
                handler.post(new Dh0(gh0, i, j));
            }
            this.V0 = 0;
            this.U0 = jElapsedRealtime;
        }
    }

    public final void u0() {
        this.R0 = true;
        if (this.P0) {
            return;
        }
        this.P0 = true;
        Surface surface = this.L0;
        Gh0 gh0 = this.E0;
        Handler handler = gh0.f3131a;
        if (handler != null) {
            handler.post(new Eh0(gh0, surface, SystemClock.elapsedRealtime()));
        }
        this.N0 = true;
    }

    public final void v0() {
        int i = this.z1;
        if (i == -1 && this.A1 == -1) {
            return;
        }
        Ih0 ih0 = this.E1;
        if (ih0 != null && ih0.f3234a == i && ih0.b == this.A1 && ih0.c == this.B1 && ih0.d == this.D1) {
            return;
        }
        Ih0 ih1 = new Ih0(this.z1, this.D1, this.A1, this.B1);
        this.E1 = ih1;
        Gh0 gh0 = this.E0;
        Handler handler = gh0.f3131a;
        if (handler != null) {
            handler.post(new RunnableC3976le0(19, gh0, ih1));
        }
    }

    public final void w0(InterfaceC4306pN interfaceC4306pN, int i) {
        v0();
        FW.c("releaseOutputBuffer");
        interfaceC4306pN.j(i, true);
        FW.A();
        this.v1 = SystemClock.elapsedRealtime() * 1000;
        this.x0.e++;
        this.W0 = 0;
        u0();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final C2729Rl x(C4745uN c4745uN, C4619sw c4619sw, C4619sw c4619sw2) {
        C2729Rl c2729RlB = c4745uN.b(c4619sw, c4619sw2);
        C4640t8 c4640t8 = this.I0;
        int i = c4640t8.f5019a;
        int i2 = c4619sw2.q;
        int i3 = c2729RlB.e;
        if (i2 > i || c4619sw2.r > c4640t8.b) {
            i3 |= 256;
        }
        if (s0(c4619sw2, c4745uN) > this.I0.c) {
            i3 |= 64;
        }
        int i4 = i3;
        return new C2729Rl(c4745uN.f5075a, c4619sw, c4619sw2, i4 != 0 ? 0 : c2729RlB.d, i4);
    }

    public final void x0(InterfaceC4306pN interfaceC4306pN, int i, long j) {
        v0();
        FW.c("releaseOutputBuffer");
        interfaceC4306pN.f(i, j);
        FW.A();
        this.v1 = SystemClock.elapsedRealtime() * 1000;
        this.x0.e++;
        this.W0 = 0;
        u0();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final C4569sN y(IllegalStateException illegalStateException, C4745uN c4745uN) {
        Surface surface = this.L0;
        HN hn = new HN(illegalStateException, c4745uN);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return hn;
    }

    public final boolean y0(C4745uN c4745uN) {
        return Ug0.f3833a >= 23 && !this.F1 && !o0(c4745uN.f5075a) && (!c4745uN.f || PlaceholderSurface.c(this.C0));
    }

    public final void z0(InterfaceC4306pN interfaceC4306pN, int i) {
        FW.c("skipVideoBuffer");
        interfaceC4306pN.j(i, false);
        FW.A();
        this.x0.f++;
    }
}
