package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.warren.AdActivity;
import com.vungle.warren.AdvertisementPresentationFactory;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.VungleWebViewActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.ui.view.VungleNativeView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.ui.view.WebViewAPI;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cc extends be {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f1205 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1206 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1207;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f1208;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1209;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1210;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1211;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1212;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1213;

    static {
        char[] cArr = new char[531];
        f2.v("7;ý¡ä\bÎ\u008d±\u000e\u009b³\u0082 d\u008aO\\1Æ\u0018W\u0002üåw\u0000V\u0019ÿ3zLùfD\u007f×\u0099x²´Ì?å³ÿ\u0000\u0000V\u0019ÿ3zLùfD\u007f×\u0000V\u0019ÿ3zLùfD\u007f×\u0099}²¥Ì$å³ÿ\u0012\u0018\u00872\fL{\u0000c\u0019å3yL°f^\u007fÇ\u0099R²¡Ì<å¿ÿJ\u0018\u00992\u0019Lpeþ\u007fs\u0098Î²\u0004ËÁåWþæ\u0018\u00041©K\bd\u0097~\u0016\u0098a±ÏË{äÖþE\u0017À1)J¾d-\u0000c\u0019å3yL°f^\u007fÇ\u0099R²¡Ì<å¿ÿJ\u0018\u00992\u0019Lpeþ\u007fs\u0098Î²\u0004ËÁåWþæ\u0018\u00041©K\bd\u0097~\u0016\u0098a±ÙË}äÀþz\u0017ß1%J½d\u0015}½\u0097\u001c°\u009bÊ\näoýä\u0017c/Ï6`\u001cìcuIÔPH¶Û\u009d;ã»Ê9Ð\u008f7\u000e\u001d\u0082\u0000P\u0019æ3uLýfM\u007fß\u0099Y²¨Ì$\u0000V\u0019ÿ3zLùfD\u007f×\u0099k²£Ì2å\u0099ÿ\b\u0018\u00872\u001dLleø\u0096µ\u008f\b¥\u0083Ú\u0016ð½é!\u0097\u008d\u008e;¤¨Û:ñ´è\u000b\u000e¢%z[árkhÛ\u008fR¥ÆÛ´höq_[Í$E\u000eþ\u0017IñâÚ?¤\u0085\u008d\u000e\u0097ªp&Z£$Û\rB=w$Þ\u000eLqÄ[\u007fBÈ¤c\u008f«ñ\u0002Ø\u0084Â(\u0000L\u0019å3wLÿfD\u007fó\u0099X²\u0096Ì\"å¿ÿ\u0017\u0018\u008b2\u0016Lveé\u007fd\u0000M\u0019Ø3UL×fl\u007fó\u0099X²\u0096Ì\"å¿ÿ\u0017\u0018\u008b2\u0016Lveé\u007fd7\n.¥\u0004){°Q\u0011H\u008d®\u001e\u0085þû~ÒüÈJ/Ë\u0005G{\u0019RµH8¯\u0098\u0085\u0004ü\u0091Ò\u0001Éâ/m\u0006þ|BSÕIw¯.\u0086¦ü'Ó\u0086É\u0015 \u0084\u0000W\u0019ï3vLßfL\u007fä\u0099U²£Ì'\u0000W\u0019ï3vLßfL\u007fâ\u0099N²£Ì#å¿ÿ\n\u0018\u009a2\u001dLp\u0000M\u0019Ø3UL×fl\u007fó\u0099X²\u0090Ì9å¿ÿ\u0013\u0000M\u0019Ø3UL×fl\u007fö\u0099Y²ªÌ5å½ÿ\u0005\u0018\u009a2\u001d³üªS\u0080ßÿFÕçÌ{*è\u0001\b\u007f\u0088V\nL¼«=\u0081±ÿïÖCÌÎ+n\u0001òxgV÷M\u0010«\u009d\u0082>ø\u009e×;Í¢+×\u0002GxéWvMâ¤\u007f\u0082\u0098ù\u0019×\u008cÎ\u0011\u0000A\u0019î3ULýf\\\u007fÛ\u0099J²¯Ì$å£Ó;Ê\u0092à\u0017\u009f\u0094µ)¬ºJ\u0013aÊ\u001fS6Ù,lËñ\u0000c\u0019å3yL°f^\u007fÇ\u0099R²¡Ì<å¿ÿJ\u0018\u00992\u0019Lpeþ\u007fs\u0098Î²\u0004ËâåKþ¦\u001851°K\u0003d²~\u001b\u0098j±àË}äÐ7d.Í\u0004H{ËQvHå®L\u0085\u0095û\fÒ\u0086È3/®\u0005\u001c{YRÛHS\u000f×\u0016Q<ÍC\u0004iêps\u0096æ½\u0015Ã\u0088ê\u000bðþ\u0017-=\u00adCÄjJpÇ\u0097z½°ÄuêãñR\u0017\u0090>\u0001D·k3qà\u0097æ¾OÄÂëqñô\u0018g>¶E\u001fk\u008er\u0004\u0098¹¿4Å\u009eëÛòA\u0018Ù¡\u0012¸»\u0092>í½Ç\u0000Þ\u009386\u0013ãm`D÷^V¹Ï\u0093jí/Ä\u00adÞ%4ù-\u007f\u0007ãx*RÄK]\u00adÈ\u0086;ø¦Ñ%ËÐ,\u0003\u0006\u0083xêQdKé¬T\u0086\u009eÿ[ÑÍÊ|,¾\u0005/\u007f\u0099P\u001dJÎ¬È\u0085aÿìÐ_ÊÚ#I\u0005\u0094~1PºI-£\u0084\u0084\rþ°ÐõÉo#÷\u0000g\u0019ï3`LÎfD\u007fÓ\u0099_²£Ì=å¿ÿ\n\u0018\u009a", "ISO-8859-1", cArr, 0, 531);
        f1209 = cArr;
        f1212 = 593050940662815114L;
        f1208 = true;
        f1205 = true;
        f1210 = 11;
        f1211 = new char[]{'F', 'a', 128, 'y', 'r', 'w', 'p', 'b', 'm', 't', 130, 'L', 'n', 127, 129, 132, ']', '{', 'z', '~', '}', 'o', 'N', 'l', 'W', '[', 'j', 'x', 'T', 133, 'X', 'v', 'O', '`'};
    }

    public cc(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m1453() {
        f1206 = (f1207 + 37) % 128;
        Class clsM1454 = m1454();
        id.m2382().m2384();
        try {
            Iterator<Field> it = id.m2382().m2384().m2314(clsM1454, hw.m2307().m2342(String.class).m2341(8).m2343(16).m2344()).iterator();
            while (it.hasNext()) {
                f1206 = (f1207 + 31) % 128;
                String str = (String) it.next().get(null);
                if (str.startsWith(m1462((char) (65016 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -TextUtils.indexOf((CharSequence) "", '0', 0, 0), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()) || str.startsWith(m1462((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 13, ((byte) KeyEvent.getModifierMetaStateMask()) + 12).intern())) {
                    return str.split(m1459(null, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u0081").intern())[0];
                }
                f1207 = (f1206 + 11) % 128;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Class m1454() {
        int i10 = (f1206 + 11) % 128;
        f1207 = i10;
        int i11 = i10 + 73;
        f1206 = i11 % 128;
        if (i11 % 2 != 0) {
            return VungleApiClient.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Map<String, String> m1455(Advertisement advertisement) {
        int i10 = f1207 + 47;
        f1206 = i10 % 128;
        if (i10 % 2 == 0) {
            advertisement.getDownloadableUrls();
            throw null;
        }
        Map<String, String> downloadableUrls = advertisement.getDownloadableUrls();
        int i11 = f1207 + 51;
        f1206 = i11 % 128;
        if (i11 % 2 != 0) {
            return downloadableUrls;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1456(Advertisement advertisement) {
        int i10 = f1207 + 85;
        f1206 = i10 % 128;
        int i11 = i10 % 2;
        String strM1457 = m1457(advertisement);
        if (i11 == 0) {
            int i12 = 15 / 0;
        }
        f1206 = (f1207 + 3) % 128;
        return strM1457;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Map m1460(Advertisement advertisement) {
        int i10 = f1206 + 57;
        f1207 = i10 % 128;
        if (i10 % 2 != 0) {
            m1455(advertisement);
            throw null;
        }
        Map<String, String> mapM1455 = m1455(advertisement);
        f1206 = (f1207 + InterfaceC0435l1.d.b.f29114k) % 128;
        return mapM1455;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1463(Advertisement advertisement) {
        f1206 = (f1207 + 33) % 128;
        String strM1465 = m1465(advertisement);
        f1206 = (f1207 + 27) % 128;
        return strM1465;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Placement m1464(Repository repository, String str) {
        f1207 = (f1206 + InterfaceC0435l1.d.b.f29105b) % 128;
        Placement placementM1458 = m1458(repository, str);
        int i10 = f1206 + InterfaceC0435l1.d.b.f29105b;
        f1207 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 35 / 0;
        }
        return placementM1458;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻛ */
    public final String mo818() {
        int i10 = f1207;
        int i11 = i10 + 87;
        f1206 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (this.f1213 == null) {
            f1206 = (i10 + 89) % 128;
            String strM1453 = m1453();
            this.f1213 = strM1453;
            m820(strM1453);
        }
        String str = this.f1213;
        int i12 = f1207 + 21;
        f1206 = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1466(Placement placement) {
        int i10 = f1207 + 77;
        f1206 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1461(placement);
        }
        m1461(placement);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        int i10 = f1207 + 39;
        f1206 = i10 % 128;
        if (i10 % 2 == 0) {
            mo818();
            throw null;
        }
        String strMo818 = mo818();
        if (strMo818 == null) {
            return null;
        }
        String str = strMo818.split(m1462((char) (14099 - TextUtils.indexOf((CharSequence) "", '0')), ViewConfiguration.getScrollDefaultDelay() >> 16, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())[1];
        f1206 = (f1207 + 99) % 128;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        byte b10;
        f1207 = (f1206 + 49) % 128;
        switch (str.hashCode()) {
            case -2075872274:
                b10 = !str.equals(m1462((char) KeyEvent.normalizeMetaState(0), 221 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 15 - TextUtils.indexOf((CharSequence) "", '0')).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -2012803321:
                if (!str.equals(m1462((char) (KeyEvent.keyCodeFromString("") + 13466), Color.rgb(0, 0, 0) + 16777693, 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    f1207 = (f1206 + 93) % 128;
                    b10 = 32;
                }
                break;
            case -1853707364:
                b10 = !str.equals(m1462((char) (TextUtils.getOffsetBefore("", 0) + 4020), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 419, View.MeasureSpec.getSize(0) + 42).intern()) ? (byte) -1 : (byte) 30;
                break;
            case -1850654380:
                if (!str.equals(m1462((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 38631), 158 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 5 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    b10 = -1;
                } else {
                    f1206 = (f1207 + 107) % 128;
                    b10 = 8;
                }
                break;
            case -1836618638:
                b10 = !str.equals(m1462((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 351, 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 26;
                break;
            case -1740904301:
                b10 = !str.equals(m1462((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15676), 193 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1721428911:
                b10 = !str.equals(m1462((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.argb(0, 0, 0, 0) + 24, 6 - (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1057659822:
                if (!str.equals(m1462((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46014), 314 - TextUtils.indexOf((CharSequence) "", '0', 0), 36 - Color.blue(0)).intern())) {
                    b10 = -1;
                } else {
                    f1207 = (f1206 + 3) % 128;
                    b10 = 25;
                }
                break;
            case -965507231:
                if (!str.equals(m1459(null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u009d\u009a\u008c\u008b\u0087\u008a\u0082\u0089\u0087\u0088").intern())) {
                    b10 = -1;
                } else {
                    f1206 = (f1207 + 19) % 128;
                    b10 = 22;
                }
                break;
            case -899612152:
                b10 = !str.equals(m1462((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.lastIndexOf("", '0') + 80, View.MeasureSpec.getMode(0) + 42).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -828205665:
                b10 = !str.equals(m1462((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), TextUtils.getTrimmedLength("") + 291, MotionEvent.axisFromString("") + 12).intern()) ? (byte) -1 : (byte) 23;
                break;
            case -747599243:
                b10 = !str.equals(m1459(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, "\u008e\u008d\u0098\u0095\u008e\u0084\u0093\u0097\u0096\u008c").intern()) ? (byte) -1 : (byte) 11;
                break;
            case -498060603:
                b10 = !str.equals(m1462((char) (Process.myTid() >> 22), (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, Process.getGidForName("") + 10).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -350701718:
                b10 = !str.equals(m1459(null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u0090\u0095\u0093\u008e\u008a\u0094\u0093\u0092\u0087\u0091").intern()) ? (byte) -1 : (byte) 10;
                break;
            case -92732536:
                b10 = !str.equals(m1462((char) Color.argb(0, 0, 0, 0), 374 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 30 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? (byte) -1 : (byte) 28;
                break;
            case 156342925:
                b10 = !str.equals(m1462((char) ((Process.myTid() >> 22) + 41284), 461 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 15).intern()) ? (byte) -1 : (byte) 31;
                break;
            case 315438882:
                b10 = !str.equals(m1462((char) ((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 14130), View.getDefaultSize(0, 0) + InterfaceC0435l1.a.b.f29083c, 16 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()) ? (byte) -1 : (byte) 29;
                break;
            case 332396988:
                b10 = !str.equals(m1462((char) TextUtils.getTrimmedLength(""), 268 - View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionType(0L) + 9).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 505165239:
                b10 = !str.equals(m1459(null, KeyEvent.keyCodeFromString("") + 127, null, "\u0090\u008e\u008a\u008f\u008a\u008e\u008d\u008c\u008b\u0087\u008a\u0082\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082").intern()) ? (byte) -1 : (byte) 3;
                break;
            case 670892517:
                b10 = !str.equals(m1462((char) (12174 - TextUtils.getCapsMode("", 0, 0)), 121 - (ViewConfiguration.getLongPressTimeout() >> 16), 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case 746354589:
                b10 = !str.equals(m1459(null, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u0095\u0087\u008e\u0084\u0087\u0094\u0087\u0095\u009a\u0086\u0098\u008d\u0093\u0099").intern()) ? (byte) -1 : (byte) 15;
                break;
            case 798818448:
                b10 = !str.equals(m1459(null, 126 - ExpandableListView.getPackedPositionChild(0L), null, "\u008b\u0087\u008a\u0082\u0086\u0098\u008d\u0093\u0099").intern()) ? (byte) -1 : (byte) 14;
                break;
            case 1033471823:
                if (!str.equals(m1462((char) KeyEvent.getDeadChar(0, 0), Color.green(0) + 44, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 34).intern())) {
                    b10 = -1;
                } else {
                    f1206 = (f1207 + 5) % 128;
                    b10 = 2;
                }
                break;
            case 1110462460:
                b10 = !str.equals(m1462((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 302 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 13).intern()) ? (byte) -1 : (byte) 24;
                break;
            case 1205766784:
                b10 = !str.equals(m1462((char) View.MeasureSpec.getMode(0), 30 - KeyEvent.normalizeMetaState(0), 14 - ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 1208038126:
                if (!str.equals(m1462((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getPressedStateDuration() >> 16) + 143, ExpandableListView.getPackedPositionGroup(0L) + 15).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1207 + 65;
                    f1206 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (byte) 7 : (byte) 45;
                }
                break;
            case 1230133745:
                if (!str.equals(m1462((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 277, 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    f1207 = (f1206 + 55) % 128;
                    b10 = 21;
                }
                break;
            case 1461477995:
                b10 = !str.equals(m1462((char) ((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 14155), TextUtils.indexOf("", "", 0, 0) + 236, 32 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1611471226:
                b10 = !str.equals(m1462((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 204, (ViewConfiguration.getEdgeSlop() >> 16) + 16).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 1731532800:
                b10 = !str.equals(m1462((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 26810), TextUtils.indexOf("", "", 0, 0) + 178, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 1766407901:
                b10 = !str.equals(m1462((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 54125), 361 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 12).intern()) ? (byte) -1 : (byte) 27;
                break;
            case 1777696764:
                b10 = !str.equals(m1462((char) (38877 - ((Process.getThreadPriority(0) + 20) >> 6)), ExpandableListView.getPackedPositionGroup(0L) + 164, (ViewConfiguration.getFadingEdgeLength() >> 16) + 14).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 1861686093:
                b10 = !str.equals(m1459(null, (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u0095\u0087\u008e\u0084\u0087\u0094\u0087\u0095\u009a\u008e\u0084\u0087\u009c\u0087\u0094\u008a\u008e\u0095\u0087\u008f\u0096\u008c\u009b\u008e\u008d\u0098\u0095\u008e\u0084\u0093\u0097\u0096\u008c").intern()) ? (byte) -1 : (byte) 18;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return Vungle.class;
            case 1:
            case 2:
                return VungleActivity.class;
            case 3:
            case 4:
                return VungleWebViewActivity.class;
            case 5:
                return Advertisement.class;
            case 6:
                return Placement.class;
            case 7:
                return VungleWebClient.class;
            case 8:
                return Report.class;
            case 9:
                return PlayAdCallback.class;
            case 10:
                return Repository.class;
            case 11:
                return AdContract.class;
            case 12:
                return LocalAdContract.class;
            case 13:
                return LocalAdView.class;
            case 14:
                return LocalAdContract.LocalView.class;
            case 15:
                return LocalAdContract.LocalPresenter.class;
            case 16:
                return LocalAdPresenter.class;
            case 17:
                return MRAIDAdPresenter.class;
            case 18:
                return AdContract.AdvertisementPresenter.class;
            case 19:
                return AdvertisementPresentationFactory.class;
            case 20:
                return WebAdContract.WebAdView.class;
            case 21:
                return WebAdContract.WebAdPresenter.class;
            case 22:
                return WebViewAPI.class;
            case 23:
                return MRAIDAdView.class;
            case 24:
                return WebViewAPI.MRAIDDelegate.class;
            case 25:
                return AdContract.AdvertisementPresenter.EventListener.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return AdActivity.class;
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return VungleBanner.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                return VungleBannerView.class;
            case 31:
            case 32:
                return VungleNativeView.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1462((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 519 - (ViewConfiguration.getTapTimeout() >> 16), 13 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cc.m1464((Repository) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1459(null, 127 - ExpandableListView.getPackedPositionType(0L), null, "\u0096\u0087\u009e\u008a\u008f\u008a\u008e\u0084\u0087\u008d\u0084\u009d\u0094\u008a").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(cc.m1466((Placement) list.get(0)));
            }
        });
        map.put(m1459(null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, null, "\u0096\u009d\u008e\u0087 \u0095\u0098\u009f\u0096\u008c\u008e\u0087\u0085").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cc.m1456((Advertisement) list.get(0));
            }
        });
        map.put(m1459(null, 127 - (Process.myTid() >> 22), null, "\u0084\u0085\u008a\u0098\u0092\u009c\u0098\u0097\u008e\u0087\u0085").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cc.m1463((Advertisement) list.get(0));
            }
        });
        map.put(m1459(null, View.resolveSizeAndState(0, 0, 0) + 127, null, "\u0094\u0086\u0095¢\u0087\u0086\u0089\u0098\u0096\u0098\u0093\u0086\u0084\u008b\u0093¡\u008e\u0087\u0085").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cc.m1460((Advertisement) list.get(0));
            }
        });
        int i10 = f1207 + 9;
        f1206 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1465(Advertisement advertisement) {
        f1207 = (f1206 + 73) % 128;
        String campaign = advertisement.getCampaign();
        f1207 = (f1206 + 29) % 128;
        return campaign;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1457(Advertisement advertisement) {
        int i10 = f1206 + 9;
        f1207 = i10 % 128;
        if (i10 % 2 == 0) {
            return advertisement.getAdMarketId();
        }
        advertisement.getAdMarketId();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1462(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1209[i10 + i12]) ^ (((long) i12) * f1212)) ^ ((long) c4));
                        c.f1154 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m1461(Placement placement) {
        int i10 = f1206 + InterfaceC0435l1.d.b.f29112i;
        f1207 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsIncentivized = placement.isIncentivized();
        if (i11 != 0) {
            int i12 = 42 / 0;
        }
        int i13 = f1207 + 43;
        f1206 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 91 / 0;
        }
        return zIsIncentivized;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Placement m1458(Repository repository, String str) {
        Placement placement;
        int i10 = f1206 + 51;
        f1207 = i10 % 128;
        if (i10 % 2 != 0) {
            placement = (Placement) repository.load(str, Placement.class).get();
            int i11 = 21 / 0;
        } else {
            placement = (Placement) repository.load(str, Placement.class).get();
        }
        int i12 = f1207 + 95;
        f1206 = i12 % 128;
        if (i12 % 2 != 0) {
            return placement;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1459(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f1211;
                int i11 = f1210;
                if (f1205) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1208) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
