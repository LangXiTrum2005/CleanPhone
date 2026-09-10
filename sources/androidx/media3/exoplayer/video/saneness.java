package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.impassible;
import androidx.media3.common.polder;
import androidx.media3.common.polloi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.arytenoidectomy;
import androidx.media3.exoplayer.empress;
import androidx.media3.exoplayer.kowloon;
import androidx.media3.exoplayer.lampshade;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.competently;
import bluecoat.apical;
import bluecoat.rotuma;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.ImmutableList;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.Ua;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import decarock.grimness;
import decarock.monoploid;
import decarock.supplicat;
import decarock.triweekly;
import decarock.trm;
import java.nio.ByteBuffer;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends MediaCodecRenderer implements androidx.media3.exoplayer.video.dern.saneness {

    /* JADX INFO: renamed from: collection, reason: collision with root package name */
    public static final int[] f12913collection = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: homophylic, reason: collision with root package name */
    public static boolean f12914homophylic;

    /* JADX INFO: renamed from: likeable, reason: collision with root package name */
    public static boolean f12915likeable;

    /* JADX INFO: renamed from: bluecoat, reason: collision with root package name */
    public int f12916bluecoat;

    /* JADX INFO: renamed from: cig, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.dern.attabal f12917cig;

    /* JADX INFO: renamed from: cosy, reason: collision with root package name */
    public final int f12918cosy;

    /* JADX INFO: renamed from: ctenidium, reason: collision with root package name */
    public int f12919ctenidium;

    /* JADX INFO: renamed from: cybernatic, reason: collision with root package name */
    public apical f12920cybernatic;

    /* JADX INFO: renamed from: decarock, reason: collision with root package name */
    public List<impassible> f12921decarock;

    /* JADX INFO: renamed from: demilitarize, reason: collision with root package name */
    public dern f12922demilitarize;

    /* JADX INFO: renamed from: ethene, reason: collision with root package name */
    public polder f12923ethene;

    /* JADX INFO: renamed from: fastrack, reason: collision with root package name */
    public final marial.attabal f12924fastrack;

    /* JADX INFO: renamed from: harlequinade, reason: collision with root package name */
    public wireman f12925harlequinade;

    /* JADX INFO: renamed from: hyalinization, reason: collision with root package name */
    public int f12926hyalinization;

    /* JADX INFO: renamed from: hydromechanics, reason: collision with root package name */
    public int f12927hydromechanics;

    /* JADX INFO: renamed from: incorrectly, reason: collision with root package name */
    public long f12928incorrectly;

    /* JADX INFO: renamed from: liable, reason: collision with root package name */
    public PlaceholderSurface f12929liable;

    /* JADX INFO: renamed from: libya, reason: collision with root package name */
    public boolean f12930libya;

    /* JADX INFO: renamed from: licking, reason: collision with root package name */
    public final rotuma f12931licking;

    /* JADX INFO: renamed from: linendraper, reason: collision with root package name */
    public boolean f12932linendraper;

    /* JADX INFO: renamed from: microanalysis, reason: collision with root package name */
    public polder f12933microanalysis;

    /* JADX INFO: renamed from: microchemistry, reason: collision with root package name */
    public final boolean f12934microchemistry;

    /* JADX INFO: renamed from: miliaria, reason: collision with root package name */
    public int f12935miliaria;

    /* JADX INFO: renamed from: osteal, reason: collision with root package name */
    public final Context f12936osteal;

    /* JADX INFO: renamed from: polyfoil, reason: collision with root package name */
    public boolean f12937polyfoil;

    /* JADX INFO: renamed from: pruinose, reason: collision with root package name */
    public final boolean f12938pruinose;

    /* JADX INFO: renamed from: puffin, reason: collision with root package name */
    public int f12939puffin;

    /* JADX INFO: renamed from: rajahship, reason: collision with root package name */
    public long f12940rajahship;

    /* JADX INFO: renamed from: stupefactive, reason: collision with root package name */
    public VideoSink f12941stupefactive;

    /* JADX INFO: renamed from: sultanate, reason: collision with root package name */
    public boolean f12942sultanate;

    /* JADX INFO: renamed from: tailoring, reason: collision with root package name */
    public Surface f12943tailoring;

    /* JADX INFO: renamed from: tarboosh, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.dern f12944tarboosh;

    /* JADX INFO: renamed from: tout, reason: collision with root package name */
    public int f12945tout;

    /* JADX INFO: renamed from: twybill, reason: collision with root package name */
    public boolean f12946twybill;

    /* JADX INFO: renamed from: undecorated, reason: collision with root package name */
    public long f12947undecorated;

    /* JADX INFO: renamed from: vir, reason: collision with root package name */
    public trm f12948vir;

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f12950attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f12951dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f12952saneness;

        public dern(int i, int i2, int i3) {
            this.f12950attabal = i;
            this.f12952saneness = i2;
            this.f12951dern = i3;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.video.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class C0092saneness {
        public static boolean attabal(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(X3.i.d);
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public final class wireman implements androidx.media3.exoplayer.mediacodec.wireman.InterfaceC0087wireman, Handler.Callback {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Handler f12954kowloon;

        public wireman(androidx.media3.exoplayer.mediacodec.wireman wiremanVar) {
            Handler handlerCuirassed = grimness.cuirassed(this);
            this.f12954kowloon = handlerCuirassed;
            wiremanVar.marial(this, handlerCuirassed);
        }

        @Override // androidx.media3.exoplayer.mediacodec.wireman.InterfaceC0087wireman
        public void attabal(androidx.media3.exoplayer.mediacodec.wireman wiremanVar, long j, long j2) {
            if (grimness.f25080attabal >= 30) {
                saneness(j);
            } else {
                this.f12954kowloon.sendMessageAtFrontOfQueue(Message.obtain(this.f12954kowloon, 0, (int) (j >> 32), (int) j));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            saneness(grimness.tarboosh(message.arg1, message.arg2));
            return true;
        }

        public final void saneness(long j) {
            saneness sanenessVar = saneness.this;
            if (this != sanenessVar.f12925harlequinade || sanenessVar.monroe() == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                saneness.this.wittig();
                return;
            }
            try {
                saneness.this.inrooted(j);
            } catch (ExoPlaybackException e) {
                saneness.this.hydromechanics(e);
            }
        }
    }

    public saneness(Context context, androidx.media3.exoplayer.mediacodec.wireman.saneness sanenessVar, competently competentlyVar, long j, boolean z, Handler handler, marial marialVar, int i) {
        this(context, sanenessVar, competentlyVar, j, z, handler, marialVar, i, 30.0f);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean balance() {
        int i = grimness.f25080attabal;
        byte b = 7;
        if (i <= 28) {
            String str = grimness.f25091saneness;
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
        if (i <= 27 && "HWEML".equals(grimness.f25091saneness)) {
            return true;
        }
        String str2 = grimness.f25094wireman;
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
                    String str3 = grimness.f25091saneness;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b = -1;
                            }
                            break;
                        case -1936688066:
                            b = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b = !str3.equals("vernee_M5") ? (byte) -1 : ExecutionDataWriter.BLOCK_SESSIONINFO;
                            break;
                        case -1481772737:
                            b = !str3.equals("panell_dl") ? (byte) -1 : ExecutionDataWriter.BLOCK_EXECUTIONDATA;
                            break;
                        case -1481772730:
                            b = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b = !str3.equals("SVP-DTV15") ? (byte) -1 : RemoteControlWriter.BLOCK_CMDOK;
                            break;
                        case -794946968:
                            b = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b = !str3.equals("1713") ? (byte) -1 : Utf8.REPLACEMENT_BYTE;
                            break;
                        case 1514185:
                            b = !str3.equals("1714") ? (byte) -1 : RemoteControlWriter.BLOCK_CMDDUMP;
                            break;
                        case 2133089:
                            b = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
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
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
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
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
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
                        case Opcodes.F2I /* 139 */:
                            return true;
                    }
                }
                return false;
        }
    }

    public static int bavaria(androidx.media3.exoplayer.mediacodec.marial marialVar, polloi polloiVar) {
        int iIntValue;
        int i = polloiVar.f11197graveside;
        int i2 = polloiVar.f11184adultoid;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = (String) decarock.attabal.marial(polloiVar.f11218triweekly);
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairPolloi = MediaCodecUtil.polloi(polloiVar);
            str = (pairPolloi == null || !((iIntValue = ((Integer) pairPolloi.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return electropaint(i * i2, 2);
            case "video/hevc":
                return Math.max(2097152, electropaint(i * i2, 2));
            case "video/avc":
                String str2 = grimness.f25094wireman;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(grimness.f25084dern) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && marialVar.f12080beachfront)))) {
                    return -1;
                }
                return electropaint(grimness.cutely(i, 16) * grimness.cutely(i2, 16) * 256, 2);
            case "video/x-vnd.on2.vp9":
                return electropaint(i * i2, 4);
            default:
                return -1;
        }
    }

    public static Point bleacherite(androidx.media3.exoplayer.mediacodec.marial marialVar, polloi polloiVar) {
        int i = polloiVar.f11184adultoid;
        int i2 = polloiVar.f11197graveside;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : f12913collection) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (grimness.f25080attabal >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointSaneness = marialVar.saneness(i6, i4);
                float f2 = polloiVar.f11194dovishness;
                if (pointSaneness != null && marialVar.adultoid(pointSaneness.x, pointSaneness.y, f2)) {
                    return pointSaneness;
                }
            } else {
                try {
                    int iCutely = grimness.cutely(i4, 16) * 16;
                    int iCutely2 = grimness.cutely(i5, 16) * 16;
                    if (iCutely * iCutely2 <= MediaCodecUtil.seminary()) {
                        int i7 = z ? iCutely2 : iCutely;
                        if (!z) {
                            iCutely = iCutely2;
                        }
                        return new Point(i7, iCutely);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    public static void brighton(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    public static int crock(androidx.media3.exoplayer.mediacodec.marial marialVar, polloi polloiVar) {
        if (polloiVar.f11201kowloon == -1) {
            return bavaria(marialVar, polloiVar);
        }
        int size = polloiVar.f11205monoploid.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += polloiVar.f11205monoploid.get(i).length;
        }
        return polloiVar.f11201kowloon + length;
    }

    public static int electropaint(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    public static boolean infiltration() {
        return "NVIDIA".equals(grimness.f25084dern);
    }

    public static List<androidx.media3.exoplayer.mediacodec.marial> philabeg(Context context, competently competentlyVar, polloi polloiVar, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        String str = polloiVar.f11218triweekly;
        if (str == null) {
            return ImmutableList.of();
        }
        if (grimness.f25080attabal >= 26 && "video/dolby-vision".equals(str) && !C0092saneness.attabal(context)) {
            List<androidx.media3.exoplayer.mediacodec.marial> listTriweekly = MediaCodecUtil.triweekly(competentlyVar, polloiVar, z, z2);
            if (!listTriweekly.isEmpty()) {
                return listTriweekly;
            }
        }
        return MediaCodecUtil.dovishness(competentlyVar, polloiVar, z, z2);
    }

    private void transitional() {
        androidx.media3.exoplayer.mediacodec.wireman wiremanVarMonroe = monroe();
        if (wiremanVarMonroe != null && grimness.f25080attabal >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f12927hydromechanics));
            wiremanVarMonroe.dern(bundle);
        }
    }

    public static boolean untruth() {
        return grimness.f25080attabal >= 21;
    }

    public static void weimar(androidx.media3.exoplayer.mediacodec.wireman wiremanVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        wiremanVar.dern(bundle);
    }

    public final void aristocrat(long j, long j2, polloi polloiVar) {
        apical apicalVar = this.f12920cybernatic;
        if (apicalVar != null) {
            apicalVar.wireman(j, j2, polloiVar, hardpan());
        }
    }

    @Override // androidx.media3.exoplayer.video.dern.saneness
    public boolean arytenoidectomy(long j, long j2) {
        return energid(j, j2);
    }

    public MediaFormat astrogate(polloi polloiVar, String str, dern dernVar, float f, boolean z, int i) {
        Pair<Integer, Integer> pairPolloi;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", polloiVar.f11197graveside);
        mediaFormat.setInteger("height", polloiVar.f11184adultoid);
        monoploid.marial(mediaFormat, polloiVar.f11205monoploid);
        monoploid.dern(mediaFormat, "frame-rate", polloiVar.f11194dovishness);
        monoploid.wireman(mediaFormat, "rotation-degrees", polloiVar.f11196gintrap);
        monoploid.saneness(mediaFormat, polloiVar.f11191cuirassed);
        if ("video/dolby-vision".equals(polloiVar.f11218triweekly) && (pairPolloi = MediaCodecUtil.polloi(polloiVar)) != null) {
            monoploid.wireman(mediaFormat, Scopes.PROFILE, ((Integer) pairPolloi.first).intValue());
        }
        mediaFormat.setInteger("max-width", dernVar.f12950attabal);
        mediaFormat.setInteger("max-height", dernVar.f12952saneness);
        monoploid.wireman(mediaFormat, "max-input-size", dernVar.f12951dern);
        int i2 = grimness.f25080attabal;
        if (i2 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            brighton(mediaFormat, i);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f12927hydromechanics));
        }
        return mediaFormat;
    }

    public final boolean ayutthaya(androidx.media3.exoplayer.mediacodec.marial marialVar) {
        if (grimness.f25080attabal < 23 || this.f12937polyfoil || imparkation(marialVar.name)) {
            return false;
        }
        return !marialVar.f12080beachfront || PlaceholderSurface.saneness(this.f12936osteal);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public arytenoidectomy cig(empress empressVar) throws ExoPlaybackException {
        arytenoidectomy arytenoidectomyVarCig = super.cig(empressVar);
        this.f12924fastrack.arytenoidectomy((polloi) decarock.attabal.marial(empressVar.f11879saneness), arytenoidectomyVarCig);
        return arytenoidectomyVarCig;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public float claque(float f, polloi polloiVar, polloi[] polloiVarArr) {
        float fMax = -1.0f;
        for (polloi polloiVar2 : polloiVarArr) {
            float f2 = polloiVar2.f11194dovishness;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void cosy(Exception exc) {
        triweekly.wireman("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f12924fastrack.molybdenite(exc);
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void creditor() {
        super.creditor();
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink == null || !this.f12934microchemistry) {
            return;
        }
        videoSink.release();
    }

    public boolean crosspiece(long j, long j2, boolean z) {
        return j < -500000 && !z;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void decarock(polloi polloiVar) throws ExoPlaybackException {
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink == null || videoSink.isInitialized()) {
            return;
        }
        try {
            this.f12941stupefactive.formularize(polloiVar);
        } catch (VideoSink.VideoSinkException e) {
            throw stratoscope(e, polloiVar, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void demilitarize(polloi polloiVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        androidx.media3.exoplayer.mediacodec.wireman wiremanVarMonroe = monroe();
        if (wiremanVarMonroe != null) {
            wiremanVarMonroe.setVideoScalingMode(this.f12935miliaria);
        }
        int i2 = 0;
        if (this.f12937polyfoil) {
            i = polloiVar.f11197graveside;
            integer = polloiVar.f11184adultoid;
        } else {
            decarock.attabal.marial(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = polloiVar.f11211rotuma;
        if (untruth()) {
            int i3 = polloiVar.f11196gintrap;
            if (i3 == 90 || i3 == 270) {
                f = 1.0f / f;
                int i4 = integer;
                integer = i;
                i = i4;
            }
        } else if (this.f12941stupefactive == null) {
            i2 = polloiVar.f11196gintrap;
        }
        this.f12923ethene = new polder(i, integer, i2, f);
        if (this.f12941stupefactive == null) {
            this.f12944tarboosh.arytenoidectomy(polloiVar.f11194dovishness);
        } else {
            iconoclasm();
            this.f12941stupefactive.taiyuan(1, polloiVar.attabal().palmyra(i).dent(integer).czestochowa(i2).sayid(f).polder());
        }
    }

    @Override // androidx.media3.exoplayer.homozygous
    public void dern() {
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            videoSink.dern();
        } else {
            this.f12944tarboosh.attabal();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public androidx.media3.exoplayer.mediacodec.wireman.attabal dhss(androidx.media3.exoplayer.mediacodec.marial marialVar, polloi polloiVar, MediaCrypto mediaCrypto, float f) {
        PlaceholderSurface placeholderSurface = this.f12929liable;
        if (placeholderSurface != null && placeholderSurface.f12828kowloon != marialVar.f12080beachfront) {
            premed();
        }
        String str = marialVar.f12086saneness;
        dern dernVarStrother = strother(marialVar, polloiVar, merc());
        this.f12922demilitarize = dernVarStrother;
        MediaFormat mediaFormatAstrogate = astrogate(polloiVar, str, dernVarStrother, f, this.f12938pruinose, this.f12937polyfoil ? this.f12916bluecoat : 0);
        if (this.f12943tailoring == null) {
            if (!ayutthaya(marialVar)) {
                throw new IllegalStateException();
            }
            if (this.f12929liable == null) {
                this.f12929liable = PlaceholderSurface.dern(this.f12936osteal, marialVar.f12080beachfront);
            }
            this.f12943tailoring = this.f12929liable;
        }
        garter(mediaFormatAstrogate);
        VideoSink videoSink = this.f12941stupefactive;
        return androidx.media3.exoplayer.mediacodec.wireman.attabal.saneness(marialVar, mediaFormatAstrogate, polloiVar, videoSink != null ? videoSink.attabal() : this.f12943tailoring, mediaCrypto);
    }

    public void diakinesis(int i, int i2) {
        kowloon kowloonVar = this.f12030sakeen;
        kowloonVar.f11952impromptu += i;
        int i3 = i + i2;
        kowloonVar.f11948competently += i3;
        this.f12926hyalinization += i3;
        int i4 = this.f12939puffin + i3;
        this.f12939puffin = i4;
        kowloonVar.f11955taiyuan = Math.max(i4, kowloonVar.f11955taiyuan);
        int i5 = this.f12918cosy;
        if (i5 <= 0 || this.f12926hyalinization < i5) {
            return;
        }
        rsp();
    }

    @RequiresNonNull({"displaySurface"})
    public final void dispope() {
        this.f12924fastrack.monoploid(this.f12943tailoring);
        this.f12946twybill = true;
    }

    public void disrupture(long j) {
        this.f12030sakeen.attabal(j);
        this.f12940rajahship += j;
        this.f12945tout++;
    }

    public void earstone(androidx.media3.exoplayer.mediacodec.wireman wiremanVar, int i, long j, long j2) {
        supplicat.attabal("releaseOutputBuffer");
        wiremanVar.cutely(i, j2);
        supplicat.saneness();
        this.f12030sakeen.f11953marial++;
        this.f12939puffin = 0;
        if (this.f12941stupefactive == null) {
            ghoulish(this.f12923ethene);
            transformable();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecDecoderException empress(Throwable th, androidx.media3.exoplayer.mediacodec.marial marialVar) {
        return new MediaCodecVideoDecoderException(th, marialVar, this.f12943tailoring);
    }

    public boolean energid(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    public final void estragon() {
        int i = this.f12945tout;
        if (i != 0) {
            this.f12924fastrack.polloi(this.f12940rajahship, i);
            this.f12940rajahship = 0L;
            this.f12945tout = 0;
        }
    }

    public final void eyepiece() {
        polder polderVar = this.f12933microanalysis;
        if (polderVar != null) {
            this.f12924fastrack.graveside(polderVar);
        }
    }

    public final void ferrovanadium(androidx.media3.exoplayer.mediacodec.wireman wiremanVar, int i, long j, long j2) {
        if (grimness.f25080attabal >= 21) {
            earstone(wiremanVar, i, j, j2);
        } else {
            montera(wiremanVar, i, j);
        }
    }

    public final void galluses() {
        Surface surface = this.f12943tailoring;
        if (surface == null || !this.f12946twybill) {
            return;
        }
        this.f12924fastrack.monoploid(surface);
    }

    public final void garter(MediaFormat mediaFormat) {
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink == null || videoSink.apical()) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    @Override // androidx.media3.exoplayer.homozygous, androidx.media3.exoplayer.lampshade
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public final void ghoulish(polder polderVar) {
        if (polderVar.equals(polder.f11144marial) || polderVar.equals(this.f12933microanalysis)) {
            return;
        }
        this.f12933microanalysis = polderVar;
        this.f12924fastrack.graveside(polderVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.homozygous
    public void gintrap(float f, float f2) throws ExoPlaybackException {
        super.gintrap(f, f2);
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            videoSink.monoploid(f);
        } else {
            this.f12944tarboosh.polloi(f);
        }
    }

    public void goonda(androidx.media3.exoplayer.mediacodec.wireman wiremanVar, Surface surface) {
        wiremanVar.impromptu(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void grimness(boolean z, boolean z2) throws ExoPlaybackException {
        super.grimness(z, z2);
        boolean z3 = yemenite().f11960saneness;
        decarock.attabal.competently((z3 && this.f12916bluecoat == 0) ? false : true);
        if (this.f12937polyfoil != z3) {
            this.f12937polyfoil = z3;
            incorrectly();
        }
        this.f12924fastrack.kowloon(this.f12030sakeen);
        if (!this.f12930libya) {
            if ((this.f12921decarock != null || !this.f12934microchemistry) && this.f12941stupefactive == null) {
                rotuma rotumaVarMarial = this.f12931licking;
                if (rotumaVarMarial == null) {
                    rotumaVarMarial = new androidx.media3.exoplayer.video.attabal.saneness(this.f12936osteal, this.f12944tarboosh).beachfront(oilcan()).marial();
                }
                this.f12941stupefactive = rotumaVarMarial.saneness();
            }
            this.f12930libya = true;
        }
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink == null) {
            this.f12944tarboosh.kowloon(oilcan());
            this.f12944tarboosh.impromptu(z2);
            return;
        }
        videoSink.adultoid(new attabal(), com.google.common.util.concurrent.rotuma.attabal());
        apical apicalVar = this.f12920cybernatic;
        if (apicalVar != null) {
            this.f12941stupefactive.wireman(apicalVar);
        }
        if (this.f12943tailoring != null && !this.f12948vir.equals(trm.f25148dern)) {
            this.f12941stupefactive.marial(this.f12943tailoring, this.f12948vir);
        }
        this.f12941stupefactive.monoploid(mastfed());
        List<impassible> list = this.f12921decarock;
        if (list != null) {
            this.f12941stupefactive.impromptu(list);
        }
        this.f12941stupefactive.impassible(z2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly, androidx.media3.exoplayer.mastfed.saneness
    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
        if (i == 1) {
            notornis(obj);
            return;
        }
        if (i == 7) {
            apical apicalVar = (apical) decarock.attabal.marial(obj);
            this.f12920cybernatic = apicalVar;
            VideoSink videoSink = this.f12941stupefactive;
            if (videoSink != null) {
                videoSink.wireman(apicalVar);
                return;
            }
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) decarock.attabal.marial(obj)).intValue();
            if (this.f12916bluecoat != iIntValue) {
                this.f12916bluecoat = iIntValue;
                if (this.f12937polyfoil) {
                    incorrectly();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            this.f12927hydromechanics = ((Integer) decarock.attabal.marial(obj)).intValue();
            transitional();
            return;
        }
        if (i == 4) {
            this.f12935miliaria = ((Integer) decarock.attabal.marial(obj)).intValue();
            androidx.media3.exoplayer.mediacodec.wireman wiremanVarMonroe = monroe();
            if (wiremanVarMonroe != null) {
                wiremanVarMonroe.setVideoScalingMode(this.f12935miliaria);
                return;
            }
            return;
        }
        if (i == 5) {
            this.f12944tarboosh.triweekly(((Integer) decarock.attabal.marial(obj)).intValue());
            return;
        }
        if (i == 13) {
            interweave((List) decarock.attabal.marial(obj));
            return;
        }
        if (i != 14) {
            super.handleMessage(i, obj);
            return;
        }
        trm trmVar = (trm) decarock.attabal.marial(obj);
        if (trmVar.saneness() == 0 || trmVar.attabal() == 0) {
            return;
        }
        this.f12948vir = trmVar;
        VideoSink videoSink2 = this.f12941stupefactive;
        if (videoSink2 != null) {
            videoSink2.marial((Surface) decarock.attabal.taiyuan(this.f12943tailoring), trmVar);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean harlequinade(androidx.media3.exoplayer.mediacodec.marial marialVar) {
        return this.f12943tailoring != null || ayutthaya(marialVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public List<androidx.media3.exoplayer.mediacodec.marial> herdbook(competently competentlyVar, polloi polloiVar, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.gintrap(philabeg(this.f12936osteal, competentlyVar, polloiVar, z, this.f12937polyfoil), polloiVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void homozygous(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f12932linendraper) {
            ByteBuffer byteBuffer = (ByteBuffer) decarock.attabal.marial(decoderInputBuffer.f11476adultoid);
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
                        weimar((androidx.media3.exoplayer.mediacodec.wireman) decarock.attabal.marial(monroe()), bArr);
                    }
                }
            }
        }
    }

    public boolean http(long j, long j2, boolean z) {
        return j < -30000 && !z;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void hydrovane() {
        try {
            super.hydrovane();
        } finally {
            this.f12930libya = false;
            if (this.f12929liable != null) {
                premed();
            }
        }
    }

    public boolean imparkation(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (saneness.class) {
            try {
                if (!f12915likeable) {
                    f12914homophylic = balance();
                    f12915likeable = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f12914homophylic;
    }

    public void inrooted(long j) throws ExoPlaybackException {
        alloy(j);
        ghoulish(this.f12923ethene);
        this.f12030sakeen.f11953marial++;
        transformable();
        linendraper(j);
    }

    public void interweave(List<impassible> list) {
        this.f12921decarock = list;
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            videoSink.impromptu(list);
        }
    }

    public boolean irani(long j, boolean z) throws ExoPlaybackException {
        int iDent = dent(j);
        if (iDent == 0) {
            return false;
        }
        if (z) {
            kowloon kowloonVar = this.f12030sakeen;
            kowloonVar.f11956wireman += iDent;
            kowloonVar.f11947beachfront += this.f12919ctenidium;
        } else {
            this.f12030sakeen.f11949cutely++;
            diakinesis(iDent, this.f12919ctenidium);
        }
        picketboat();
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            videoSink.graveside(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.homozygous
    public boolean isEnded() {
        if (!super.isEnded()) {
            return false;
        }
        VideoSink videoSink = this.f12941stupefactive;
        return videoSink == null || videoSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.homozygous
    public boolean isReady() {
        PlaceholderSurface placeholderSurface;
        VideoSink videoSink;
        boolean z = super.isReady() && ((videoSink = this.f12941stupefactive) == null || videoSink.isReady());
        if (z && (((placeholderSurface = this.f12929liable) != null && this.f12943tailoring == placeholderSurface) || monroe() == null || this.f12937polyfoil)) {
            return true;
        }
        return this.f12944tarboosh.wireman(z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int julian(DecoderInputBuffer decoderInputBuffer) {
        return (grimness.f25080attabal < 34 || !this.f12937polyfoil || decoderInputBuffer.f11480graveside >= supplicat()) ? 0 : 32;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean liable(long j, long j2, androidx.media3.exoplayer.mediacodec.wireman wiremanVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, polloi polloiVar) throws ExoPlaybackException {
        decarock.attabal.marial(wiremanVar);
        long jVesuvio = j3 - vesuvio();
        int iDern = this.f12944tarboosh.dern(j3, j, j2, setterwort(), z2, this.f12917cig);
        if (iDern == 4) {
            return false;
        }
        if (z && !z2) {
            pedagogism(wiremanVar, i, jVesuvio);
            return true;
        }
        if (this.f12943tailoring == this.f12929liable && this.f12941stupefactive == null) {
            if (this.f12917cig.beachfront() >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                return false;
            }
            pedagogism(wiremanVar, i, jVesuvio);
            disrupture(this.f12917cig.beachfront());
            return true;
        }
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            try {
                videoSink.render(j, j2);
                long jBeachfront = this.f12941stupefactive.beachfront(j3 + nattier(), z2);
                if (jBeachfront == C.TIME_UNSET) {
                    return false;
                }
                ferrovanadium(wiremanVar, i, jVesuvio, jBeachfront);
                return true;
            } catch (VideoSink.VideoSinkException e) {
                throw stratoscope(e, e.format, 7001);
            }
        }
        if (iDern == 0) {
            long jNanoTime = oilcan().nanoTime();
            aristocrat(jVesuvio, jNanoTime, polloiVar);
            ferrovanadium(wiremanVar, i, jVesuvio, jNanoTime);
            disrupture(this.f12917cig.beachfront());
            return true;
        }
        if (iDern == 1) {
            return mef((androidx.media3.exoplayer.mediacodec.wireman) decarock.attabal.taiyuan(wiremanVar), i, jVesuvio, polloiVar);
        }
        if (iDern == 2) {
            polliwog(wiremanVar, i, jVesuvio);
            disrupture(this.f12917cig.beachfront());
            return true;
        }
        if (iDern != 3) {
            if (iDern == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(iDern));
        }
        pedagogism(wiremanVar, i, jVesuvio);
        disrupture(this.f12917cig.beachfront());
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void libya(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f12937polyfoil;
        if (!z) {
            this.f12919ctenidium++;
        }
        if (grimness.f25080attabal >= 23 || !z) {
            return;
        }
        inrooted(decoderInputBuffer.f11480graveside);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int likeable(competently competentlyVar, polloi polloiVar) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i = 0;
        if (!androidx.media3.common.rotuma.apical(polloiVar.f11218triweekly)) {
            return lampshade.formularize(0);
        }
        boolean z2 = polloiVar.f11208polloi != null;
        List<androidx.media3.exoplayer.mediacodec.marial> listPhilabeg = philabeg(this.f12936osteal, competentlyVar, polloiVar, z2, false);
        if (z2 && listPhilabeg.isEmpty()) {
            listPhilabeg = philabeg(this.f12936osteal, competentlyVar, polloiVar, false, false);
        }
        if (listPhilabeg.isEmpty()) {
            return lampshade.formularize(1);
        }
        if (!MediaCodecRenderer.homophylic(polloiVar)) {
            return lampshade.formularize(2);
        }
        androidx.media3.exoplayer.mediacodec.marial marialVar = listPhilabeg.get(0);
        boolean zImpassible = marialVar.impassible(polloiVar);
        if (!zImpassible) {
            int i2 = 1;
            while (true) {
                if (i2 >= listPhilabeg.size()) {
                    z = true;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.marial marialVar2 = listPhilabeg.get(i2);
                if (marialVar2.impassible(polloiVar)) {
                    z = false;
                    zImpassible = true;
                    marialVar = marialVar2;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = zImpassible ? 4 : 3;
        int i4 = marialVar.arytenoidectomy(polloiVar) ? 16 : 8;
        int i5 = marialVar.f12081competently ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (grimness.f25080attabal >= 26 && "video/dolby-vision".equals(polloiVar.f11218triweekly) && !C0092saneness.attabal(this.f12936osteal)) {
            i6 = 256;
        }
        if (zImpassible) {
            List<androidx.media3.exoplayer.mediacodec.marial> listPhilabeg2 = philabeg(this.f12936osteal, competentlyVar, polloiVar, z2, true);
            if (!listPhilabeg2.isEmpty()) {
                androidx.media3.exoplayer.mediacodec.marial marialVar3 = MediaCodecUtil.gintrap(listPhilabeg2, polloiVar).get(0);
                if (marialVar3.impassible(polloiVar) && marialVar3.arytenoidectomy(polloiVar)) {
                    i = 32;
                }
            }
        }
        return lampshade.competently(i3, i4, i, i5, i6);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void linendraper(long j) {
        super.linendraper(j);
        if (this.f12937polyfoil) {
            return;
        }
        this.f12919ctenidium--;
    }

    public final boolean mef(androidx.media3.exoplayer.mediacodec.wireman wiremanVar, int i, long j, polloi polloiVar) {
        long jCompetently = this.f12917cig.competently();
        long jBeachfront = this.f12917cig.beachfront();
        if (grimness.f25080attabal >= 21) {
            if (overassessment() && jCompetently == this.f12947undecorated) {
                pedagogism(wiremanVar, i, j);
            } else {
                aristocrat(j, jCompetently, polloiVar);
                earstone(wiremanVar, i, j, jCompetently);
                jCompetently = jCompetently;
            }
            disrupture(jBeachfront);
            this.f12947undecorated = jCompetently;
            return true;
        }
        if (jBeachfront >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            return false;
        }
        if (jBeachfront > 11000) {
            try {
                Thread.sleep((jBeachfront - Ua.s) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        aristocrat(j, jCompetently, polloiVar);
        montera(wiremanVar, i, j);
        disrupture(jBeachfront);
        return true;
    }

    @Override // androidx.media3.exoplayer.video.dern.saneness
    public boolean monoploid(long j, long j2, long j3, boolean z, boolean z2) throws ExoPlaybackException {
        return crosspiece(j, j3, z) && irani(j2, z2);
    }

    public void montera(androidx.media3.exoplayer.mediacodec.wireman wiremanVar, int i, long j) {
        supplicat.attabal("releaseOutputBuffer");
        wiremanVar.impassible(i, true);
        supplicat.saneness();
        this.f12030sakeen.f11953marial++;
        this.f12939puffin = 0;
        if (this.f12941stupefactive == null) {
            ghoulish(this.f12923ethene);
            transformable();
        }
    }

    public long nattier() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.media3.exoplayer.video.dern] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly, androidx.media3.exoplayer.video.saneness] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.media3.exoplayer.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    public final void notornis(Object obj) throws ExoPlaybackException {
        ?? Dern;
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            Dern = 0;
        }
        if (Dern == 0) {
            PlaceholderSurface placeholderSurface = this.f12929liable;
            if (placeholderSurface != null) {
                Dern = surface;
                Dern = placeholderSurface;
            } else {
                androidx.media3.exoplayer.mediacodec.marial marialVarAchondroplasia = achondroplasia();
                if (marialVarAchondroplasia != null && ayutthaya(marialVarAchondroplasia)) {
                    Dern = surface;
                    Dern = PlaceholderSurface.dern(this.f12936osteal, marialVarAchondroplasia.f12080beachfront);
                    this.f12929liable = Dern;
                }
            }
        }
        Dern = surface;
        Dern = surface;
        Dern = surface;
        if (this.f12943tailoring == Dern) {
            if (Dern == 0 || Dern == this.f12929liable) {
                return;
            }
            eyepiece();
            galluses();
            return;
        }
        this.f12943tailoring = Dern;
        if (this.f12941stupefactive == null) {
            this.f12944tarboosh.monoploid(Dern);
        }
        this.f12946twybill = false;
        int state = getState();
        androidx.media3.exoplayer.mediacodec.wireman wiremanVarMonroe = monroe();
        if (wiremanVarMonroe != null && this.f12941stupefactive == null) {
            if (grimness.f25080attabal < 23 || Dern == 0 || this.f12942sultanate) {
                incorrectly();
                microchemistry();
            } else {
                goonda(wiremanVarMonroe, Dern);
            }
        }
        if (Dern == 0 || Dern == this.f12929liable) {
            this.f12933microanalysis = null;
            VideoSink videoSink = this.f12941stupefactive;
            if (videoSink != null) {
                videoSink.polloi();
            }
        } else {
            eyepiece();
            if (state == 2) {
                this.f12944tarboosh.marial(true);
            }
        }
        sulfarsenide();
    }

    public boolean overassessment() {
        return true;
    }

    public void pedagogism(androidx.media3.exoplayer.mediacodec.wireman wiremanVar, int i, long j) {
        supplicat.attabal("skipVideoBuffer");
        wiremanVar.impassible(i, false);
        supplicat.saneness();
        this.f12030sakeen.f11947beachfront++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void peridotite() {
        rsp();
        estragon();
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            videoSink.competently();
        } else {
            this.f12944tarboosh.formularize();
        }
        super.peridotite();
    }

    public void polliwog(androidx.media3.exoplayer.mediacodec.wireman wiremanVar, int i, long j) {
        supplicat.attabal("dropVideoBuffer");
        wiremanVar.impassible(i, false);
        supplicat.saneness();
        diakinesis(0, 1);
    }

    public final void premed() {
        Surface surface = this.f12943tailoring;
        PlaceholderSurface placeholderSurface = this.f12929liable;
        if (surface == placeholderSurface) {
            this.f12943tailoring = null;
        }
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.f12929liable = null;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void privatdozent(long j, boolean z) throws ExoPlaybackException {
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            videoSink.graveside(true);
            this.f12941stupefactive.cutely(vesuvio(), nattier());
        }
        super.privatdozent(j, z);
        if (this.f12941stupefactive == null) {
            this.f12944tarboosh.impassible();
        }
        if (z) {
            this.f12944tarboosh.marial(false);
        }
        sulfarsenide();
        this.f12939puffin = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void pruinose(String str, androidx.media3.exoplayer.mediacodec.wireman.attabal attabalVar, long j, long j2) {
        this.f12924fastrack.apical(str, j, j2);
        this.f12942sultanate = imparkation(str);
        this.f12932linendraper = ((androidx.media3.exoplayer.mediacodec.marial) decarock.attabal.marial(achondroplasia())).triweekly();
        sulfarsenide();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void puffin() {
        super.puffin();
        this.f12919ctenidium = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.homozygous
    public void render(long j, long j2) throws ExoPlaybackException {
        super.render(j, j2);
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            try {
                videoSink.render(j, j2);
            } catch (VideoSink.VideoSinkException e) {
                throw stratoscope(e, e.format, 7001);
            }
        }
    }

    @Override // androidx.media3.exoplayer.video.dern.saneness
    public boolean rotuma(long j, long j2, boolean z) {
        return http(j, j2, z);
    }

    public final void rsp() {
        if (this.f12926hyalinization > 0) {
            long jElapsedRealtime = oilcan().elapsedRealtime();
            this.f12924fastrack.triweekly(this.f12926hyalinization, jElapsedRealtime - this.f12928incorrectly);
            this.f12926hyalinization = 0;
            this.f12928incorrectly = jElapsedRealtime;
        }
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void saran() {
        super.saran();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void seminary() {
        this.f12933microanalysis = null;
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            videoSink.arytenoidectomy();
        } else {
            this.f12944tarboosh.competently();
        }
        sulfarsenide();
        this.f12946twybill = false;
        this.f12925harlequinade = null;
        try {
            super.seminary();
        } finally {
            this.f12924fastrack.impassible(this.f12030sakeen);
            this.f12924fastrack.graveside(polder.f11144marial);
        }
    }

    public dern strother(androidx.media3.exoplayer.mediacodec.marial marialVar, polloi polloiVar, polloi[] polloiVarArr) {
        int iBavaria;
        int iMax = polloiVar.f11197graveside;
        int iMax2 = polloiVar.f11184adultoid;
        int iCrock = crock(marialVar, polloiVar);
        if (polloiVarArr.length == 1) {
            if (iCrock != -1 && (iBavaria = bavaria(marialVar, polloiVar)) != -1) {
                iCrock = Math.min((int) (iCrock * 1.5f), iBavaria);
            }
            return new dern(iMax, iMax2, iCrock);
        }
        int length = polloiVarArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            polloi polloiVarPolder = polloiVarArr[i];
            if (polloiVar.f11191cuirassed != null && polloiVarPolder.f11191cuirassed == null) {
                polloiVarPolder = polloiVarPolder.attabal().creditor(polloiVar.f11191cuirassed).polder();
            }
            if (marialVar.marial(polloiVar, polloiVarPolder).f11535wireman != 0) {
                int i2 = polloiVarPolder.f11197graveside;
                z |= i2 == -1 || polloiVarPolder.f11184adultoid == -1;
                iMax = Math.max(iMax, i2);
                iMax2 = Math.max(iMax2, polloiVarPolder.f11184adultoid);
                iCrock = Math.max(iCrock, crock(marialVar, polloiVarPolder));
            }
        }
        if (z) {
            triweekly.impromptu("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointBleacherite = bleacherite(marialVar, polloiVar);
            if (pointBleacherite != null) {
                iMax = Math.max(iMax, pointBleacherite.x);
                iMax2 = Math.max(iMax2, pointBleacherite.y);
                iCrock = Math.max(iCrock, bavaria(marialVar, polloiVar.attabal().palmyra(iMax).dent(iMax2).polder()));
                triweekly.impromptu("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new dern(iMax, iMax2, iCrock);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void stupefactive() {
        super.stupefactive();
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            videoSink.cutely(vesuvio(), nattier());
        } else {
            this.f12944tarboosh.cutely();
        }
        sulfarsenide();
    }

    public final void sulfarsenide() {
        int i;
        androidx.media3.exoplayer.mediacodec.wireman wiremanVarMonroe;
        if (!this.f12937polyfoil || (i = grimness.f25080attabal) < 23 || (wiremanVarMonroe = monroe()) == null) {
            return;
        }
        this.f12925harlequinade = new wireman(wiremanVarMonroe);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            wiremanVarMonroe.dern(bundle);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void tarboosh(String str) {
        this.f12924fastrack.formularize(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public arytenoidectomy timberyard(androidx.media3.exoplayer.mediacodec.marial marialVar, polloi polloiVar, polloi polloiVar2) {
        arytenoidectomy arytenoidectomyVarMarial = marialVar.marial(polloiVar, polloiVar2);
        int i = arytenoidectomyVarMarial.f11533marial;
        dern dernVar = (dern) decarock.attabal.marial(this.f12922demilitarize);
        if (polloiVar2.f11197graveside > dernVar.f12950attabal || polloiVar2.f11184adultoid > dernVar.f12952saneness) {
            i |= 256;
        }
        if (crock(marialVar, polloiVar2) > dernVar.f12951dern) {
            i |= 64;
        }
        int i2 = i;
        return new arytenoidectomy(marialVar.name, polloiVar, polloiVar2, i2 != 0 ? 0 : arytenoidectomyVarMarial.f11535wireman, i2);
    }

    public final void transformable() {
        if (!this.f12944tarboosh.taiyuan() || this.f12943tailoring == null) {
            return;
        }
        dispope();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean unconsolidated() {
        return this.f12937polyfoil && grimness.f25080attabal < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void walach() {
        super.walach();
        this.f12926hyalinization = 0;
        this.f12928incorrectly = oilcan().elapsedRealtime();
        this.f12940rajahship = 0L;
        this.f12945tout = 0;
        VideoSink videoSink = this.f12941stupefactive;
        if (videoSink != null) {
            videoSink.triweekly();
        } else {
            this.f12944tarboosh.apical();
        }
    }

    public final void wittig() {
        microanalysis();
    }

    public saneness(Context context, androidx.media3.exoplayer.mediacodec.wireman.saneness sanenessVar, competently competentlyVar, long j, boolean z, Handler handler, marial marialVar, int i, float f) {
        this(context, sanenessVar, competentlyVar, j, z, handler, marialVar, i, f, null);
    }

    public saneness(Context context, androidx.media3.exoplayer.mediacodec.wireman.saneness sanenessVar, competently competentlyVar, long j, boolean z, Handler handler, marial marialVar, int i, float f, rotuma rotumaVar) {
        super(2, sanenessVar, competentlyVar, z, f);
        Context applicationContext = context.getApplicationContext();
        this.f12936osteal = applicationContext;
        this.f12918cosy = i;
        this.f12931licking = rotumaVar;
        this.f12924fastrack = new marial.attabal(handler, marialVar);
        this.f12934microchemistry = rotumaVar == null;
        if (rotumaVar == null) {
            this.f12944tarboosh = new androidx.media3.exoplayer.video.dern(applicationContext, this, j);
        } else {
            this.f12944tarboosh = rotumaVar.attabal();
        }
        this.f12917cig = new androidx.media3.exoplayer.video.dern.attabal();
        this.f12938pruinose = infiltration();
        this.f12948vir = trm.f25148dern;
        this.f12935miliaria = 1;
        this.f12923ethene = polder.f11144marial;
        this.f12916bluecoat = 0;
        this.f12933microanalysis = null;
        this.f12927hydromechanics = -1000;
    }

    public void iconoclasm() {
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public class attabal implements VideoSink.attabal {
        public attabal() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.attabal
        public void attabal(VideoSink videoSink) {
            decarock.attabal.taiyuan(saneness.this.f12943tailoring);
            saneness.this.dispope();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.attabal
        public void dern(VideoSink videoSink) {
            saneness.this.diakinesis(0, 1);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.attabal
        public void saneness(VideoSink videoSink, polder polderVar) {
        }
    }
}
