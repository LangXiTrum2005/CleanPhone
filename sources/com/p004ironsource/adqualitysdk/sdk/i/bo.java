package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.activity.HyprMXBaseViewController;
import com.hyprmx.android.sdk.activity.HyprMXMraidViewController;
import com.hyprmx.android.sdk.activity.HyprMXNoOffersActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferWebViewController;
import com.hyprmx.android.sdk.activity.HyprMXRequiredInformationActivity;
import com.hyprmx.android.sdk.activity.HyprMXVastViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebTrafficViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebView;
import com.hyprmx.android.sdk.activity.HyprMXWebViewClient;
import com.hyprmx.android.sdk.activity.OfferViewerHandler;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMX;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.graphics.HyprMXLearnMoreController;
import com.hyprmx.android.sdk.graphics.HyprMXSkipController;
import com.hyprmx.android.sdk.graphics.HyprMXWebViewWithClosableNavBar;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.overlay.HyprMXBrowserActivity;
import com.hyprmx.android.sdk.placement.PlacementController;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.hyprmx.android.sdk.utility.HyprMXProperties;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bo extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f904 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f905 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f906 = null;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f907 = 1;

    static {
        char[] cArr = new char[1080];
        ByteBuffer.wrap("ñ'\u0017b=\u008fB h`\u008e\u0090\u0097;½tÃ\u008fè6\u000e`\u0014\u0086\u0000^æ\nÌÈ³Y\u0099\u0004\u007fÊf*L\u00072\u009b\u0019Zÿ8å\u0096\u0000Hæ/ÌÜ³p\u0099\u0015\u007fö\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfGL52Þ\u0019rÿ.åÝÌd²2\u0098Ñ\u007fx\u0000Pæ:ÌÍ³a\u0099=\u007fÃfaL42Ä\u0019Rÿ%åÂÌm\u0000Aæ2e©\u0083Þ©1Ö\u008aüÛ\u001a'\u0003\u008c)ÙW>|\u0092\u009aù\u00800©\u0089××ý<\u001a\u0095\u0094dr\u0010Xý'Z\r\u0003ëûòTØ\u000b¦à\u008ddk\tqõXH&.\fáëJñ5\u0086 `GJ´5\u0018\u001f}ù\u009eà<Ê@´·\u009f\u001eyQc¨J\u00144_\u001e¹ù\u0011NÈ¨¯\u0082\\ýð×\u00951v(Ó\u0002¿|RWÐ±µ«W\u0082ÿü\u0089Ö]1þ+\u0088\u0005u|àV\u008d°K«ï\u0085\u0086ÿVÖõ0¨*]\u0005ä\u007fªY_°æ|\u0007\u009a]°¥ÏHåT\u0003³\u001a\u00100LN¹e\u001a\u0083\u0016\u0099·°\u0002Î^ä¢\u0003\u0001\u0019m7¶NFdu\u0082¸\u0099\u0001·.Í¹ä\u0006\u0002c\u0018¨7\u001eMek¹\u0082\u0003\u0098 ¶ìÍ\u000bëx\u0001Ô\u001816RL÷k\u001b\u0081v\u009fô¶\u0011ÌsêÛ\u0001-\u001fy5ÚL,jQ\u0080Ä\u009f)µoÓËê\"\u0000r\u001eÑ5\fSyiÀ\u0080\u000e\u009e{´Â\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfJL52ÿ\u0019`ÿ:å×Ìz²-\u0098õ\u007fie\u0014Kß2z\u0018\u000bþÌåw\u0000cæ9ÌÁ³,\u00990\u007f×ftL(2Ý\u0019~ÿråÓÌf²:\u0098Æ\u007fee\tKÒ2\"\u0018\u0011þÜåeËJ±Û\u0098s~\u0012dÕKd1\u0001\u0017ÊþmäDÊ\u0088±o\u0097\u001c}°dUJ60\u008a\u0017uý?ã Êz°\u0017\u0096º}mc5I©0T\u0016\u001füºãKÉ\f¯·\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfKL<2Ö\u0019cÿ.åäÌa²;\u0098Ã\u007foe\u0012K÷2o\u0018\u0016þÑåxË\r±Î\u0098i;\u0015ÝO÷·\u0088Z¢FD¡]\u0002w^\t«\"\bÄ\u0004Þ¥÷\u0010\u0089L£°D\u0013^\u007fp¤\tT#gÅªÞ\u0013ð<\u008a\u00ad£\u0005Ed_£p\u0012\nw,¼Å\u001bß2ñþ\u008a\u0019¬jFÆ_#q@\u000bý,\nÆ`ØÕñ\u0018\u008bR\u00ad×F\rXurÙ\u000b$-AÇÙØ òg\u0094Î\u00ad;GxYß\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfVL?2Á\u0019sÿ5åÀÌm²:\u0098ý\u007fde\u0006KÙ2~\u0018\u000fþÙåzË\r±Õ\u0098~~'dßKf1\u0001\u0017Èþ}ä\u001eÊ¹N\u008c¨Ö\u0082.ýÃ×ß18(\u009b\u0002Ç|2W\u0091±\u009d«<\u0082\u0089üÕÖ)1\u008a+æ\u0005=|ÍVþ°3«\u008a\u0085¥ÿ4Ö\u009c0ý*:\u0005\u008b\u007fîY%°\u0082ª«\u0084gÿ\u0080Ùó3_*º\u0004Ù~yY\u0090³î\u00ad\\\u0084\u009aþïØB3\u0095-Ò\u0007K~©Xö²Q\u00ad \u0087öáUØ¢2ú,Q\u0007\u0088að[I²®¬ç\u0086Rá±Û\u0016\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfFL;2Ã\u0019cÿ\nåÛÌm²)\u0098÷\u007fee\u000eKÂ2~\u0018\rþÔåbË\u0001±È*ÒÌµæF\u0099ê³\u008fUlLÈf¡\u0018Y3èÕ\u0090ÏAæ÷\u0098³²mUÿO\u0094aX\u0018ä2\u0097ÔNÏøá\u009b\u009bR\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfSL?2Ò\u0019Rÿ.åÓÌn²8\u0098Ý\u007fie6Kß2i\u0018\u0015þûåaË\n±Î\u0098b~\tdÐK~1\r\u0017Ìëò\r\u008d'wXÚr\u0097\u0094P\u008dØ§\u0084ÙeòÞ\u0014¤\u000ea'ÁY\u008as}\u0094Î\u0000Wæ3ÌÎ³V\u0099*\u007fÏfbL<2Ù\u0019eÿ\u0013åÐÌb²;\u0098×\u007f~\tãï\u0087Åzºâ\u0090\u009ev{oÖE\u0088;m\u0010Ñö½ìTÅð4EÒ\"øÑ\u0087}\u00ad\u0018KûREx2\u0006Ü-yË?Ñòøj\u0086!¬ÜKDQ\u0002\u007fÕ\u0006u,\u001dÊÚÑoÿ\u0005\u0085Ò¬o6AÐ&úÕ\u0085y¯\u001cIÿP@z!\u0004Ø/fÉ1Óíúh\u00842®ÊI@S\u0006}Ñ\u0004q.\u0019ÈÞÓký\u0001\u0087Ö®k\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfKL<2Ö\u0019cÿ.ååÌm²<\u0098â\u007fce\u0005KÁ2O\u0018\rþÖåzË\u0016±Õ\u0098|~\ndÙK`\u001b,ýK×¸¨\u0014\u0082qd\u0092}7W[)¶\u00024äQþ³×\u001b\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfSL?2Ò\u0019Pÿ5å×Ì\u007f²\u001d\u0098Ø\u007fce\u0005KØ2x\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfKL<2Ö\u0019cÿ.åäÌa²;\u0098Ã\u007foe\u0012Kþ2m\u0018\fþÜåbË\u0001±ÈEÎ£±\u0089KöæÜ«:y#ì\t¾wF\\âº¯ {\u0089è÷±ÝQ:ç \u0084\u000eEwÁ]\u008a»J û\u008e\u0080ôUÝô;\u0095ø9\u001e^4\u00adK\u0001ad\u0087\u0087\u009e&´@Ê¨á\u0007\u0007n\u001d¬4\u0017J[`·\u0087\u0014\u009d}³«Ê\u0018àaÊS,4\u0006ÇykS\u000eµí¬L\u0086*øÂÓm5\u0004/Æ\u0006}x1RÝµ~¯\u0017\u0081ÁørÒ\u000b4ï/|\u0001\f{ÕRn´\u0013®Â\u0081{\u0019\rÿjÕ\u0099ª5\u0080Pf³\u007f\u0003Um+\u009a\u00004æjü\u0092Õ?«Z\u0081\u0092f;|LR\u0085+ \u0001Sç\u0084\u0000cæ9ÌÁ³,\u00990\u007f×ftL(2Ý\u0019~ÿråÓÌf²:\u0098Æ\u007fee\tKÒ2\"\u0018\u0011þÜåeËJ±Õ\u0098f~\u0003dÎK~1\t\u0017Çþ:ä\"Ê¹±f\u0097\u001e}\u008fd@J,0¶\u0017uý\u0007ãµÊy°\u0000\u0096\u0089}}c\u0000I£0V\u0016\u001fü¸ã[\u0000gæ3ÌØ³U\u0099=\u007fÌfPL(2Ñ\u0019`ÿ:åÛÌk²\u0011\u0098Ö\u007f`e\u0005KÕ2x\u00187þÊåbË\u0017\u0000gæ3ÌØ³M\u0099>\u007fÈfaL(2ó\u0019gÿ?åÚÌm²\u001d\u0098Ø\u007fce\u0003KÝ2X\u0018\nþÊåaË\u0011±Ý\u0098x~3dÎK~G¨¡ü\u008b\u0017ô\u008cÞó85!²\u000båu\u001a\u0000gæ3ÌØ³R\u00994\u007fÏfgL?2Ý\u0019cÿ2åÆÌ\\²'\u0098Ä\u007foe%KØ2y\u0018\u000f\u0000gæ3ÌØ³F\u0099=\u007fÞfaL42Ô\u0019cÿ2åÑÌq²\u0016\u0098Û\u007ffe\u0004KÓ2~\u0018+þÖå}Ë\u0010±Û\u0098~~\u0005dÙ\u008eCh\u0017Bü=b\u0017\u0015ñùèTÂ\f¼ý\u0097@q\rkâBC<\b\u0016ÙñJ\u0000gæ3ÌØ³R\u00994\u007fÏfgL?2Ý\u0019cÿ2åÆÌK²1\u0098Ú\u007f~e\u0012KÙ2`\u0018\u000eþÝå|\u0000gæ3ÌØ³R\u0099*\u007fËfhL52Ñ\u0019bÿ9åÖÌL²?\u0098À\u007fk\u000e|è(ÂÃ½I\u0097\"qÇh~B,<Î\u0017iñ\"ëÛÂ`\u0000Ræ\u0013Ìû³C\u0099\n\u007fêfAL\u001e:øÜ©öI\u0089ö£»EL\\áv¢\bU#þÅ¬ßO\u0000Iæ\u0018Ìú³C\u0099\u0014\u007fçf@tý\u0092ª¸KÇîí¢\u000bS\u0012þ8½FJmô\u008b£\u0091H¸áÆ¨ìC".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1080);
        f906 = cArr;
        f904 = -3586115473121089962L;
    }

    public bo(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static DependencyHolder m990() {
        f905 = (f907 + 19) % 128;
        DependencyHolder dependencyHolder = DependencyHolder.INSTANCE;
        f905 = (f907 + 47) % 128;
        return dependencyHolder;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ DependencyHolder m991() {
        int i2 = f905 + 5;
        f907 = i2 % 128;
        if (i2 % 2 == 0) {
            m990();
            throw null;
        }
        DependencyHolder dependencyHolderM990 = m990();
        int i3 = f905 + 1;
        f907 = i3 % 128;
        if (i3 % 2 != 0) {
            return dependencyHolderM990;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ PlacementController m993(HyprMXController hyprMXController) {
        f907 = (f905 + 107) % 128;
        PlacementController placementControllerM998 = m998(hyprMXController);
        int i2 = f907 + 101;
        f905 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
        return placementControllerM998;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ PreloadedVastData m996(DependencyHolder dependencyHolder) {
        f905 = (f907 + 75) % 128;
        PreloadedVastData preloadedVastDataM997 = m997(dependencyHolder);
        f905 = (f907 + 109) % 128;
        return preloadedVastDataM997;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m1000(String str) {
        int i2 = f907 + 107;
        f905 = i2 % 128;
        if (i2 % 2 == 0) {
            return m992(str);
        }
        m992(str);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1005(Ad ad) {
        int i2 = f907 + 123;
        f905 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1001(ad);
        }
        m1001(ad);
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2 = 1;
        switch (str.hashCode()) {
            case -2118473762:
                b2 = !str.equals(m1004(7 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, (char) View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -2115661176:
                b2 = !str.equals(m1004(30 - Color.alpha(0), KeyEvent.keyCodeFromString("") + IronSourceError.ERROR_CODE_INIT_FAILED, (char) (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -2082076211:
                if (!str.equals(m1004(View.resolveSizeAndState(0, 0, 0) + 28, TextUtils.indexOf((CharSequence) "", '0', 0) + 764, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 51739)).intern())) {
                    b2 = -1;
                } else {
                    f907 = (f905 + 61) % 128;
                    b2 = 29;
                }
                break;
            case -2060981001:
                b2 = !str.equals(m1004((ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, 60 - ExpandableListView.getPackedPositionChild(0L), (char) (26093 - Color.red(0))).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1783324338:
                b2 = !str.equals(m1004(Color.green(0) + 54, TextUtils.getOffsetAfter("", 0) + Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, (char) KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1711062568:
                if (!str.equals(m1004(31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 110 - Color.alpha(0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20095)).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f905 + 75;
                    f907 = i2 % 128;
                    b2 = i2 % 2 != 0 ? (byte) 7 : (byte) 98;
                }
                break;
            case -1632261541:
                b2 = !str.equals(m1004((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, ExpandableListView.getPackedPositionType(0L) + 661, (char) (7012 - View.resolveSizeAndState(0, 0, 0))).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -1625751435:
                b2 = !str.equals(m1004((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 65, 395 - Gravity.getAbsoluteGravity(0, 0), (char) (Color.green(0) + 20207)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1429076201:
                b2 = !str.equals(m1004(28 - View.MeasureSpec.getMode(0), 633 - TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case -1345825871:
                if (!str.equals(m1004(16 - View.MeasureSpec.getSize(0), 94 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((Process.myTid() >> 22) + 34408)).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f907 + 25;
                    f905 = i3 % 128;
                    b2 = i3 % 2 == 0 ? (byte) 6 : (byte) 63;
                }
                break;
            case -1289932600:
                b2 = !str.equals(m1004(ExpandableListView.getPackedPositionType(0L) + 16, 554 - (Process.myPid() >> 22), (char) ExpandableListView.getPackedPositionType(0L)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -1102538544:
                b2 = !str.equals(m1004((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26, 717 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (Color.argb(0, 0, 0, 0) + 17793)).intern()) ? (byte) -1 : (byte) 27;
                break;
            case -1056910325:
                b2 = !str.equals(m1004((ViewConfiguration.getFadingEdgeLength() >> 16) + 63, 141 - (ViewConfiguration.getTapTimeout() >> 16), (char) (31843 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -793729563:
                b2 = !str.equals(m1004(TextUtils.getCapsMode("", 0, 0) + 22, 203 - Process.getGidForName(""), (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -684201479:
                b2 = !str.equals(m1004(20 - TextUtils.indexOf("", "", 0, 0), KeyEvent.keyCodeFromString("") + 743, (char) (63601 - ExpandableListView.getPackedPositionType(0L))).intern()) ? (byte) -1 : (byte) 28;
                break;
            case -411143178:
                b2 = str.equals(m1004(57 - Color.blue(0), 304 - ExpandableListView.getPackedPositionChild(0L), (char) (TextUtils.indexOf("", "") + 15222)).intern()) ? (byte) 12 : (byte) -1;
                break;
            case -352824194:
                b2 = !str.equals(m1004(16 - Process.getGidForName(""), TextUtils.getOffsetBefore("", 0) + 77, (char) (37939 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -58290677:
                if (!str.equals(m1004(24 - KeyEvent.keyCodeFromString(""), 484 - (ViewConfiguration.getTouchSlop() >> 8), (char) (10906 - Color.red(0))).intern())) {
                    b2 = -1;
                } else {
                    f905 = (f907 + 71) % 128;
                    b2 = 16;
                }
                break;
            case -52302939:
                if (!str.equals(m1004(Color.rgb(0, 0, 0) + 16777268, TextUtils.indexOf((CharSequence) "", '0') + 813, (char) (Color.rgb(0, 0, 0) + 16777216)).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f905 + 3;
                    f907 = i4 % 128;
                    b2 = i4 % 2 != 0 ? (byte) 31 : (byte) 38;
                }
                break;
            case -48720897:
                b2 = !str.equals(m1004((ViewConfiguration.getPressedStateDuration() >> 16) + 25, 280 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) Color.red(0)).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 2115:
                if (!str.equals(m1004(2 - View.MeasureSpec.makeMeasureSpec(0, 0), 58 - TextUtils.lastIndexOf("", '0'), (char) TextUtils.getOffsetAfter("", 0)).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f907 + 45;
                    f905 = i5 % 128;
                    b2 = i5 % 2 == 0 ? (byte) 3 : (byte) 2;
                }
                break;
            case 5206681:
                if (!str.equals(m1004(20 - TextUtils.lastIndexOf("", '0'), (Process.myTid() >> 22) + 791, (char) (6470 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern())) {
                    b2 = -1;
                } else {
                    f907 = (f905 + 105) % 128;
                    b2 = 30;
                }
                break;
            case 99044255:
                if (!str.equals(m1004(13 - Color.blue(0), Color.blue(0) + 46, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f905 = (f907 + 109) % 128;
                }
                break;
            case 217655834:
                if (!str.equals(m1004(16 - View.MeasureSpec.getSize(0), 30 - Color.green(0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b2 = -1;
                }
                break;
            case 748493318:
                if (!str.equals(m1004(19 - View.getDefaultSize(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 673, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern())) {
                    b2 = -1;
                } else {
                    int i6 = f907 + 37;
                    f905 = i6 % 128;
                    b2 = i6 % 2 == 0 ? (byte) 25 : (byte) 112;
                }
                break;
            case 902272186:
                if (!str.equals(m1004(24 - MotionEvent.axisFromString(""), 607 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13833)).intern())) {
                    b2 = -1;
                } else {
                    int i7 = f907 + 15;
                    f905 = i7 % 128;
                    b2 = i7 % 2 == 0 ? (byte) 22 : (byte) 94;
                }
                break;
            case 1056638846:
                b2 = !str.equals(m1004(TextUtils.indexOf("", "", 0, 0) + 33, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 362, (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 13;
                break;
            case 1527993897:
                b2 = !str.equals(m1004(16 - View.MeasureSpec.makeMeasureSpec(0, 0), 537 - Process.getGidForName(""), (char) (60349 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 1564846544:
                b2 = !str.equals(m1004(ExpandableListView.getPackedPositionGroup(0L) + 24, 459 - ExpandableListView.getPackedPositionChild(0L), (char) (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 1575934042:
                b2 = !str.equals(m1004((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 692, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 26;
                break;
            case 1775126662:
                b2 = !str.equals(m1004(13 - (KeyEvent.getMaxKeyCode() >> 16), Process.getGidForName("") + 571, (char) (ExpandableListView.getPackedPositionGroup(0L) + 2484)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 1872662391:
                b2 = !str.equals(m1004(25 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 583 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (View.resolveSize(0, 0) + 13325)).intern()) ? (byte) -1 : (byte) 21;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return HyprMX.class;
            case 1:
                return HyprMXController.class;
            case 2:
                return PlacementType.class;
            case 3:
                return Ad.class;
            case 4:
                return DependencyHolder.class;
            case 5:
                return PreloadedVastData.class;
            case 6:
                return HyprMXProperties.class;
            case 7:
            case 8:
                return HyprMXWebViewWithClosableNavBar.class;
            case 9:
            case 10:
                return HyprMXNoOffersActivity.class;
            case 11:
            case 12:
                return HyprMXOfferViewerActivity.class;
            case 13:
            case 14:
                return HyprMXRequiredInformationActivity.class;
            case 15:
                return HyprMXBaseViewController.class;
            case 16:
                return HyprMXVastViewController.class;
            case 17:
                return HyprMXWebTrafficViewController.class;
            case 18:
                return OfferCacheEntity.class;
            case 19:
                return WebTrafficObject.class;
            case 20:
                return WebTrafficObject.WebTrafficURL.class;
            case 21:
                return HyprMXLearnMoreController.class;
            case 22:
                return HyprMXMraidViewController.class;
            case 23:
                return HyprMXOfferWebViewController.class;
            case 24:
                return HyprMXWebView.class;
            case 25:
                return HyprMXWebViewClient.class;
            case 26:
                return OfferViewerHandler.class;
            case 27:
                return OfferViewerHandler.OfferViewerHandlerListener.class;
            case 28:
                return HyprMXSkipController.class;
            case 29:
                return HyprMXSkipController.Listener.class;
            case 30:
            case 31:
                return HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x00ac  */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Object m992(String str) {
        byte b2 = 0;
        switch (str.hashCode()) {
            case -1617199657:
                if (!str.equals(m1004((ViewConfiguration.getScrollBarSize() >> 8) + 7, 1058 - TextUtils.indexOf("", "", 0, 0), (char) ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -1372958932:
                if (str.equals(m1004(11 - TextUtils.lastIndexOf("", '0'), 1046 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15026)).intern())) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                break;
            case -65580248:
                if (!str.equals(m1004(15 - TextUtils.indexOf("", ""), TextUtils.indexOf("", "") + 1065, (char) (29875 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                    b2 = -1;
                } else {
                    f905 = (f907 + 109) % 128;
                    b2 = 3;
                }
                break;
            case 543046670:
                if (!str.equals(m1004(8 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "") + IronSourceError.ERROR_RV_SHOW_EXCEPTION, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b2 = -1;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return PlacementType.REWARDED;
        }
        if (b2 == 1) {
            return PlacementType.INTERSTITIAL;
        }
        if (b2 == 2) {
            return PlacementType.INVALID;
        }
        if (b2 == 3) {
            return PlacementType.NOT_INITIALIZED;
        }
        f907 = (f905 + 111) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m995(WebTrafficObject webTrafficObject) {
        f905 = (f907 + 115) % 128;
        List<WebTrafficObject.WebTrafficURL> listM999 = m999(webTrafficObject);
        f905 = (f907 + 21) % 128;
        return listM999;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject m1003(PreloadedVastData preloadedVastData) {
        f905 = (f907 + 71) % 128;
        JSONObject parameters = preloadedVastData.getParameters();
        int i2 = f905 + 67;
        f907 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return parameters;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1006(OfferCacheEntity offerCacheEntity) {
        int i2 = f905 + 95;
        f907 = i2 % 128;
        if (i2 % 2 == 0) {
            m994(offerCacheEntity);
            throw null;
        }
        String strM994 = m994(offerCacheEntity);
        int i3 = f905 + 9;
        f907 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
        return strM994;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1004(23 - (ViewConfiguration.getPressedStateDuration() >> 16), 864 - TextUtils.getTrimmedLength(""), (char) KeyEvent.normalizeMetaState(0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bo.m995((WebTrafficObject) list.get(0));
            }
        });
        map.put(m1004(ExpandableListView.getPackedPositionChild(0L) + 29, (Process.myPid() >> 22) + 887, (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bo.m1006((OfferCacheEntity) list.get(0));
            }
        });
        map.put(m1004(TextUtils.indexOf("", "", 0) + 9, 915 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 18383)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bo.m1005((Ad) list.get(0));
            }
        });
        map.put(m1004(20 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 924, (char) (Process.myPid() >> 22)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bo.m1000((String) list.get(0));
            }
        });
        map.put(m1004(27 - (ViewConfiguration.getEdgeSlop() >> 16), 944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bo.m991();
            }
        });
        map.put(m1004(16 - (ViewConfiguration.getLongPressTimeout() >> 16), 971 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 36388)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bo.m1007((DependencyHolder) list.get(0));
            }
        });
        map.put(m1004((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, 987 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bo.m993((HyprMXController) list.get(0));
            }
        });
        map.put(m1004((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17, 1009 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.getOffsetAfter("", 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bo.m996((DependencyHolder) list.get(0));
            }
        });
        map.put(m1004(12 - ((byte) KeyEvent.getModifierMetaStateMask()), 1025 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 3612)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bo.m1008((PreloadedVastData) list.get(0));
            }
        });
        int i2 = f907 + 71;
        f905 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m994(OfferCacheEntity offerCacheEntity) {
        int i2 = f905 + 65;
        f907 = i2 % 128;
        int i3 = i2 % 2;
        String str = offerCacheEntity.clickThroughUrl;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1001(Ad ad) {
        f905 = (f907 + 73) % 128;
        String str = ad.type;
        f905 = (f907 + 7) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1007(DependencyHolder dependencyHolder) {
        int i2 = f907 + 97;
        f905 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1002(dependencyHolder);
        }
        m1002(dependencyHolder);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1002(DependencyHolder dependencyHolder) {
        f907 = (f905 + 5) % 128;
        String distributorId = dependencyHolder.getDistributorId();
        f907 = (f905 + 3) % 128;
        return distributorId;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1008(PreloadedVastData preloadedVastData) {
        int i2 = f907 + 25;
        f905 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1003(preloadedVastData);
        }
        m1003(preloadedVastData);
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f905 = (f907 + 93) % 128;
        try {
            try {
                String str = (String) BuildConfig.class.getDeclaredField(m1004(12 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0, 0), (char) (61808 - TextUtils.indexOf((CharSequence) "", '0'))).intern()).get(null);
                int i2 = f907 + 73;
                f905 = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                throw null;
            } catch (Exception unused) {
                return hr.m2242().m2245().m2314(BuildConfig.class, m1004(TextUtils.getOffsetAfter("", 0) + 12, 12 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1004(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f906[i3 + i4]) ^ (((long) i4) * f904)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List<WebTrafficObject.WebTrafficURL> m999(WebTrafficObject webTrafficObject) {
        int i2 = f905 + 63;
        f907 = i2 % 128;
        int i3 = i2 % 2;
        List<WebTrafficObject.WebTrafficURL> list = webTrafficObject.urls;
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static PreloadedVastData m997(DependencyHolder dependencyHolder) {
        f905 = (f907 + 89) % 128;
        PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        f907 = (f905 + 85) % 128;
        return preloadedData;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static PlacementController m998(HyprMXController hyprMXController) {
        int i2 = f907 + 125;
        f905 = i2 % 128;
        int i3 = i2 % 2;
        PlacementController placementController = hyprMXController.getPlacementController();
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return placementController;
    }
}
