package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Tap;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.VideoContentListenerAdapter;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IArichMediaVideoView;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0341fe;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bt extends be {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f995 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f996 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f997 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f998;

    static {
        char[] cArr = new char[1352];
        f2.v("\u0083\bÃh\u0003¡Cñ\u0082/ÂC\u0002\u0088BÄ\u0081\u0010ÁH\u0001â@\u0005\u0080{À®\u0000ÆG\u001a\u0087_Ç\u0097\u0007ÓFF\u0086¿Æý\u0005,ES\u0085\u008cÅÜ\u00046D_\u0084ñË#\u000beK±\u008bÕÊ\u001f\u0000c@(\u0080ãÀû\u0001zA\u001a\u0081ÈÁ\u0094\u0002JBQ\u0082¯Ãc\u0003:Cþ\u0083\u0090ÄH\u0004\u0013DÃ\u0084\u0097Å3\u0005éEý\u0086iÆ\u0005\u0006ÃFÁ\u0087WÇ\u001e\u0007°Hb\u0088$Èð\b\u0094IN\u0089\u000bÉÆ\tÒJ\n\u008aäÊ¿\u000b}K-\u008bÇË\u008e\f@L\u0012\u008c´Íl\r\u0019Mù\u008dªÎ@\u000e\u001eNÝ\u008e\u009bÏ-\u000fÊO½\u0090yÐ*\u0010×P\u008e\u0091@Ñ8\u0011£Rs\u0092'Òã\u0012µSW\u0093\u0013\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃK\u0003!C÷\u0083\u008eÄZ\u0004\u0013DÅ\u0084\u009bÅ \u0005âE\u0092\u0086~Æ \u0006ËF\u009b\u0087_Ç\u000b\u0007\u00adH\u007f\u0088+\u008exÎ3\u000eøNà\u008faÏ\u0001\u000fÓO\u008f\u008cQÌJ\f´Mx\u008d!Íå\r\u008bJS\u008a\bÊØ\n\u008cK(\u008bòËæ\brH\u001e\u0088ØÈÚ\tLI\u0005\u0089«Æy\u0006?Fë\u0086\u008fÇU\u0007\u0010GÝ\u0087ÉÄ\u0011\u0004ÿD¤\u0085fÅ6\u0005ÜE\u0095\u0082[Â\t\u0002¯Cw\u0083\rÃù\u0003©@R\u0080\u0004ÀË\u0000\u0093A?\u0081öÁº\u001eL^\"\u009eþÞ\u0093\u001f]_\u000b\u009f\u00adÜu\u001c!\\÷\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£Ã_\u0003=Cø\u0083\u008aÄd\u0004\u0015DÓ\u0084\u0097Å$\u0005ÚEº\u0086~Æ\u0004\u0006ÇF¿\u0087ZÇ\u001c\u0007½Hn\u0088 ÈØ\b\u0083IS\u0089\u0007ÉÃ\t\u0095J7\u008aóÊ\u0092\u000bwK-\u008bÃ\u0000c@(\u0080ãÀû\u0001zA\u001a\u0081ÈÁ\u0094\u0002JBQ\u0082¯Ãc\u0003:Cþ\u0083\u0090ÄH\u0004\u0013DÃ\u0084\u0097Å3\u0005éEý\u0086iÆ\u0005\u0006ÃFÁ\u0087WÇ\u001e\u0007°Hb\u0088$Èð\b\u0094IN\u0089\u000bÉÆ\tÒJ\n\u008aäÊ¿\u000b}K-\u008bÇË\u008e\f@L\u0012\u008c´Íl\r\u0002Mþ\u008d½ÎM\u000e!NÖ\u008e\u009eÏ(\u000féO\u0099\u0090\u007fÐ9\u0010ÁP\u0084\u0091bÑ\u0015\u0011¡R~\u0092+Òç\u0012\u009dS@\u0093\u001eÓØ\u0013\u008eTV\u0094òÔ´\u0015WU4\u0095ÐÕ\u008cA\u0094\u0001ôÁ=\u0081m@³\u0000ßÀ\u0014\u0080XC\u008c\u0003ÔÃ~\u0082\u0091Bí\u0002\u0015ÂO\u0085\u009bEÙt\u001f4\u007fô¶´æu85Tõ\u009fµÓv\u00076_öõ·\u001awf7\u009f÷Ñ°\u000epS0\u0084ðÛ±g\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃL\u00030CÉ\u0083\u0087ÄG\u0004\u0014DÒ\u0084\u008cÅ \u0005þ\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£Ã@\u00031Cÿ\u0083\u008bÄH\u0004\u0004DÞ\u0084\u0091Å+\u0005ÂE²\u0086wÆ\u0004x\u00888Çø\f¸{y³9Äù\u0002¹Wz´:ßúi»\u00ad{ò;?ûQ\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃN\u0003;Cõ\u0083\u0096ÄL\u0004\u001eDÃ\u0084½Å*\u0005âE§\u0086hÆ\u000e\u0006ÄF\u0083\u0087SÇ\u000f\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃX\u0003:Cò\u0083\u0096Äj\u0004\u001fDÙ\u0084\u008aÅ7\u0005ãE¿\u0086vÆ\u0004\u0006Ú\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃL\u00030CÍ\u0083\u008bÄL\u0004\u0007Dâ\u0084\u0090Å,\u0005øE\u0090\u0086uÆ\u000f\u0006ÜF\u009d\u0087YÇ\u0011\u0007¨Hn\u0088 H¤\bØÈ\u0016\u0088PI©\tûÉ(\u0089pJ¥\nïÊN\u008b¨KÜ\u000b\u001aËv\u0000E@1\u0080ëÀ»\u0001hA\u0010\u0081æÁ\u0098\u0002KB\u000b\u0082£Ãc\u00031Cé\u009fÙ\u0003eC\u0005\u0083ÌÃ\u009c\u0002BB.\u0082åÂ©\u0001}A%\u0081\u008fÀg\u0000\r@Û\u0080¢Çv\u0007?Gé\u0087·Æ\f\u0006ÎF©\u0085_Å)\u0005áE¬\u0084YÄ>\u0004\u0086KS\u008b\u001bËÛ\u000b¸JH\u008a-Ê÷\n¤I\u001d\u0089ÉÉ\u0091\bXH\u0016\u0088øÎ2\u008eRN\u009b\u000eËÏ\u0015\u008fyO²\u000fþÌ*\u008crLØ\r0ÍZ\u008d\u008cMõ\n!Êh\u008a¾Jà\u000b[Ë\u0099\u008béH\u0005\b_È¥\u0088ñI#\trÉÌ\u0086<F@\u0006\u0091Æï\u00879G{\u0007«Çõ¢ââ\u009a\"^b\u0004£Çã\u0094#qc+ øà® \u001caÍ¡¬áF!%fé¦¡æm&/g\u0083\u0000I@)\u0080úÀ°\u0001nA\r\u0081ËÁ\u009d\u0002zB\r\u0082©Ãz\u0003'Cþ\u0083\u0090Äe\u0004\u0019DÄ\u0084\u008aÅ \u0005âE¶\u0086h\u0000T@&\u0080þ\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃK\u0003!C÷\u0083\u008eÄZ\u0004\u0013DÅ\u0084\u009bÅ \u0005âE\u0092\u0086~Æ$\u0006ÞF\u008a\u0087XÇ\t\u0007·HG\u0088;Èê\b\u0094IB\u0089\u0000ÉÐ\t\u008eJ\u0002\u008aîÊ°\u000bhK+\u008bÃË\u009fE¶\u0005ÖÅ\u001f\u0085OD\u0091\u0004ýÄ6\u0084zG®\u0007öÇ\\\u0086´FÞ\u0006\bÆq\u0081¥Aì\u0001:Ád\u0080ß@\u001d\u0000yÃ\u008b\u0083÷C#\u0003SÂ¦\u0082ìBO\r\u0086ÍÂ\u008d\nMs\f½Ìã\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃL\u00030CÍ\u0083\u008bÄL\u0004\u0007Dá\u0084\u0097Å!\u0005éE¼\u0086YÆ\u000e\u0006ÆF\u009b\u0087SÇ\u0013\u0007°HH\u0088=È÷\b\u0094IU\u0089\u0001ÉÙ\t\u0090J&\u008aø\u0000E@1\u0080ëÀ»\u0001hA\u0010\u0081æÁ\u0098\u0002KB\u000b\u0082£Ãc\u00031Cé\u0083£ÄM\u0004\u0011DÇ\u0084\u008aÅ \u0005þ\u0000V@.\u0080êÀ°\u0001sA \u0081ÅÁ\u009f\u0002LB\u001a\u0082¨Ãy\u0003\u0018Cò\u0083\u0091Ä]\u0004\u0015DÙ\u0084\u009bÅ7\u0005ÍE·\u0086{Æ\u0011\u0006ÜF\u008a\u0087DF\b\u0006GÆ\u0082\u0086æG<\u0007KÇ\u008f\u0087ûD\u0010\u0004J\u0000I@\u0006\u0080ãÀ§\u0001}A\n\u0081ÎÁ¦\u0002]B\u001d\u0082\u0090Ãd\u00031Cì\u0083¡ÄF\u0004\u001eDÃ\u0084\u008cÅ*\u0005àE¿\u0086\u007fÆ\u0013Óï\u0093 S~\u0013\u001aÒÞ\u0092 Rc\u0012\u001cÑ÷\u0091\u00adÙ\u0013\u0099pY¤\u0019ýØ#\u0098JX\u0083\u0018ÂÛ\r\u009bK[Ø\u001a6Úz\u009a \u0000I@\u0006\u0080üÀ¼\u0001\u007fA\u000b\u0081çÁ\u0094\u0002\\B\u0016\u0082§Ã[\u0003=Cÿ\u0083\u0087ÄF\u0004&DÞ\u0084\u009bÅ2\u0000B@&\u0080ýÀ°\u0001JA\n\u0081ÎÁ\u0094\u0002WB)\u0082¯Ãh\u0003#C×\u0083\u008bÄZ\u0004\u0004DÒ\u0084\u0090Å \u0005þ\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃK\u0003!C÷\u0083\u008eÄZ\u0004\u0013DÅ\u0084\u009bÅ \u0005âE\u0092\u0086~Æ$\u0006ÞF\u008a\u0087XÇ\t\u0007·HG\u0088;Èê\b\u0094IB\u0089\u0000ÉÐ\t\u008eJ\u0014\u008aãÊ¥\u000bpK\u0016\u008bËË\u009d\fFL\u001e\u008c±Íz\r9Mø\u008d°Îa\u000e\rNÇ\u008e\u009b\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃL\u00030CÍ\u0083\u008bÄL\u0004\u0007Dò\u0084\u0088Å \u0005âE§\u0086iÆ-\u0006ÁF\u009c\u0087BÇ\u0018\u0007ªHn\u0088 ÈÎ\b\u0089IS\u0089\u0006Éü\t\u0091J3\u008aøÊ´\u000bkK,\u008bÏË\u0082\fZL?\u008c£Í}\r1\u0083|Ã9\u0003áC\u008d\u0082rÂ\n\u0002ÃB\u008f\u0081MÁ\u0010\u0001\u008d@d\u0080 Àã\u0000\u009cGA\u0087\u0018ÇÉ\u0007\u0081F\f\u0086òÆ¹\u0005tE\u001f\u0085ÀÅ\u0080Í×\u008d\u0092MJ\r6ÌÜ\u008c¼Ln\f\bÏì\u0099\u0095ÙÐ\u0019\bYf\u0098\u008aØÒ\u00187Xm\u009b¾Ûè\u001bZZ\u008b\u0098iØ4\u0018ÈX \u0099pÙ\u000f\u0019ÙY\u0092\u009aJÚ\u001a\u001a£[c\u009b\u0015Ûÿ\u0000i@4\u0080ØÀ¼\u0001xA\u0006\u0081ÅÁ°\u0002\\\u0004ÕD\u0090\u0084HÄ$\u0005ÂE¸\u0085{Å(\u0006ÞF¥\u0086\u0006ÇÐ\u0007\u0093GN\u00878ÀÎ\u0000°@i\u0000g@\"\u0080úÀ\u0099\u0001}A\u001a\u0081ÅÁ\u0084\u0002L\u000faO$\u008füÏ\u0080\u000e\u007fN\t\u008eÉÎ\u0094\rJM\u001c\u008d¤Ì^\f<Lô\u008c\u0090Ël\u000b\u0019Kß\u008b\u008cÊ1\nåJ¹\u0089pÉ\u0002\tÜ\u0000g@\"\u0080úÀ\u0086\u0001yA\u000f\u0081ÏÁ\u0092\u0002LB\u001a\u0082¢ÃN\u0003;Cõ\u0083\u0096ÄL\u0004\u001eDÃ\u0084½Å*\u0005âE§\u0086hÆ\u000e\u0006ÄF\u0083\u0087SÇ\u000f\u0000g@\"\u0080úÀ\u0090\u0001jA\u0006\u0081ÄÁ\u0085\u0002KB3\u0082¯Ã~\u0003 Cþ\u0083\u008cÄL\u0004\u00020Yp\b°Ððº1@q,±îñ¯2ar\u0019²\u0085óT3\nsÔ³¦ôf4(Ú8\u009a}Z¥\u001aËÛ'\u009bo[\u0085\u001bÁØ\u0013\u0000g@\"\u0080úÀ\u0080\u0001rA\n\u0081ÞÁµ\u0002QB\f\u0082¶Ãa\u00035Câ\u0083¶ÄP\u0004\u0000DÒ\u0084»Å+\u0005ùE¾\u0000g@\"\u0080úÀ\u0098\u0001nA\u0002\u0081ÃÁ\u0095\u0002zB\u001e\u0082¨Ãc\u00031Cé\u0083´Ä@\u0004\u0015DÀ\u0084·Å!nò.·îo®\toä/\u0086ïM¯\u0001lÞ,\u0099ì:\u00ad÷m¯-Jí\u0016ªÈj\u0084*fê\u0004«½kx+/èá\u0000I@\t\u0080ÚÀ\u0090\u0001NA0\u0081þÁ¸\u0002lB6\u0082\u0087ÃA\u0017ËW\u0081\u0097G×\u0016\u0016ÈV§\u0096lÖ&\u0015ú\u0000M@\u0015\u0080ËÀ\u0096\u0001HgH'\fçÊ§\u0091fS&;\u000bRK\u0002\u008bÙË\u0094\nNJ'\u008aïÊµ\u0000S@\u0016\u0080ÛÀ\u0094\u0001NA&\u0000V@\u0002\u0080ÜÀ\u0081\u0001UA \u0081ëÁ½\u008bÑË\u0097\u000b]K\u0001\u008aÜÊº\nk", "ISO-8859-1", cArr, 0, 1352);
        f995 = cArr;
        f998 = 7482872454586449991L;
    }

    public bt(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static InneractiveUnitController m1157(InneractiveAdSpot inneractiveAdSpot) {
        f997 = (f996 + 1) % 128;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        int i10 = f996 + 43;
        f997 = i10 % 128;
        if (i10 % 2 != 0) {
            return selectedUnitController;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m1158(InneractiveAdSpot inneractiveAdSpot) {
        f996 = (f997 + 87) % 128;
        String clickThroughUrl = inneractiveAdSpot.getAdContent().getClickThroughUrl();
        f996 = (f997 + 37) % 128;
        return clickThroughUrl;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ int m1159() {
        int i10 = f996 + 15;
        f997 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1164();
        }
        int i11 = 92 / 0;
        return m1164();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m1162(InneractiveAdSpot inneractiveAdSpot) {
        f997 = (f996 + 39) % 128;
        boolean zIsFullscreenAd = inneractiveAdSpot.getAdContent().isFullscreenAd();
        int i10 = f996 + 55;
        f997 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 35 / 0;
        }
        return zIsFullscreenAd;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean m1163(InneractiveAdSpot inneractiveAdSpot) {
        f997 = (f996 + 7) % 128;
        boolean zIsVideoAd = inneractiveAdSpot.getAdContent().isVideoAd();
        int i10 = f996 + 67;
        f997 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 20 / 0;
        }
        return zIsVideoAd;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Object m1165(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f997 + 15;
        f996 = i10 % 128;
        if (i10 % 2 != 0) {
            inneractiveAdSpot.getAdContent();
            throw null;
        }
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        f997 = (f996 + 47) % 128;
        return adContent;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static InneractiveAdRequest m1166(InneractiveAdSpot inneractiveAdSpot) {
        f997 = (f996 + InterfaceC0435l1.d.b.f29109f) % 128;
        InneractiveAdRequest currentProcessedRequest = inneractiveAdSpot.getCurrentProcessedRequest();
        f997 = (f996 + 61) % 128;
        return currentProcessedRequest;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveContentController.EventsListener m1168(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f996 = (f997 + InterfaceC0435l1.d.b.f29107d) % 128;
        InneractiveContentController.EventsListener eventsListenerM1184 = m1184(inneractiveFullscreenVideoContentController);
        f996 = (f997 + 31) % 128;
        return eventsListenerM1184;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveAdSpot m1171(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        f997 = (f996 + InterfaceC0435l1.d.b.f29110g) % 128;
        InneractiveAdSpot inneractiveAdSpotM1167 = m1167(inneractiveAdViewUnitController);
        f996 = (f997 + 11) % 128;
        return inneractiveAdSpotM1167;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1175(InneractiveAdRequest inneractiveAdRequest) {
        int i10 = f996 + 41;
        f997 = i10 % 128;
        int i11 = i10 % 2;
        String strM1173 = m1173(inneractiveAdRequest);
        if (i11 == 0) {
            int i12 = 61 / 0;
        }
        return strM1173;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m1178(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        f997 = (f996 + 65) % 128;
        Object objM1186 = m1186(inneractiveFullscreenAdActivity);
        f997 = (f996 + 117) % 128;
        return objM1186;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveAdRequest m1183(InneractiveAdSpot inneractiveAdSpot) {
        f997 = (f996 + 67) % 128;
        InneractiveAdRequest inneractiveAdRequestM1166 = m1166(inneractiveAdSpot);
        f997 = (f996 + 79) % 128;
        return inneractiveAdRequestM1166;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveUnitController m1160(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f997 + 65;
        f996 = i10 % 128;
        if (i10 % 2 != 0) {
            m1157(inneractiveAdSpot);
            throw null;
        }
        InneractiveUnitController inneractiveUnitControllerM1157 = m1157(inneractiveAdSpot);
        f997 = (f996 + 63) % 128;
        return inneractiveUnitControllerM1157;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Enum m1161(String str) {
        f997 = (f996 + 91) % 128;
        switch (str.hashCode()) {
            case -2032180703:
                if (!str.equals(m1180((char) (35733 - TextUtils.getOffsetBefore("", 0)), 1344 - ((byte) KeyEvent.getModifierMetaStateMask()), 7 - Color.red(0)).intern())) {
                    return null;
                }
                f996 = (f997 + 97) % 128;
                return UnitDisplayType.DEFAULT;
            case -1841345251:
                if (str.equals(m1180((char) Color.blue(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1332, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6).intern())) {
                    return UnitDisplayType.SQUARE;
                }
                return null;
            case -1372958932:
                if (!str.equals(m1180((char) View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0', 0) + 1292, 11 - MotionEvent.axisFromString("")).intern())) {
                    return null;
                }
                f996 = (f997 + 13) % 128;
                return UnitDisplayType.INTERSTITIAL;
            case -1201514634:
                if (str.equals(m1180((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1336 - TextUtils.indexOf((CharSequence) "", '0', 0), 8 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    return UnitDisplayType.VERTICAL;
                }
                return null;
            case -77725029:
                if (str.equals(m1180((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6022), 1303 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 9 - TextUtils.getTrimmedLength("")).intern())) {
                    return UnitDisplayType.LANDSCAPE;
                }
                return null;
            case 73622449:
                if (!str.equals(m1180((char) TextUtils.getOffsetBefore("", 0), 1360 - AndroidCharacter.getMirror('0'), 5 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    return null;
                }
                int i10 = f996 + InterfaceC0435l1.d.b.f29112i;
                f997 = i10 % 128;
                if (i10 % 2 != 0) {
                    return UnitDisplayType.MRECT;
                }
                break;
            case 543046670:
                if (!str.equals(m1180((char) (2815 - TextUtils.lastIndexOf("", '0', 0)), 1322 - TextUtils.indexOf((CharSequence) "", '0'), 8 - Color.red(0)).intern())) {
                    return null;
                }
                break;
            case 1951953708:
                if (str.equals(m1180((char) (26377 - TextUtils.lastIndexOf("", '0', 0)), 1317 - ((Process.getThreadPriority(0) + 20) >> 6), 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    return UnitDisplayType.BANNER;
                }
                return null;
            default:
                return null;
        }
        return UnitDisplayType.REWARDED;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int m1164() {
        int i10 = f996 + 117;
        f997 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = R.id.inneractive_webview_mraid;
            throw null;
        }
        int i12 = R.id.inneractive_webview_mraid;
        int i13 = f997 + 99;
        f996 = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1169(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f997 + 75;
        f996 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1165(inneractiveAdSpot);
        }
        m1165(inneractiveAdSpot);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1174(InneractiveAdSpot inneractiveAdSpot) {
        f996 = (f997 + 87) % 128;
        boolean zM1162 = m1162(inneractiveAdSpot);
        int i10 = f997 + 87;
        f996 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 10 / 0;
        }
        return zM1162;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1176(InneractiveAdSpot inneractiveAdSpot) {
        f997 = (f996 + 121) % 128;
        String strM1158 = m1158(inneractiveAdSpot);
        int i10 = f997 + 119;
        f996 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 82 / 0;
        }
        return strM1158;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m1179(InneractiveUnitController inneractiveUnitController) {
        f997 = (f996 + 99) % 128;
        Object objM1170 = m1170(inneractiveUnitController);
        f996 = (f997 + 87) % 128;
        return objM1170;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1185(String str) {
        int i10 = f997 + 5;
        f996 = i10 % 128;
        int i11 = i10 % 2;
        Enum enumM1161 = m1161(str);
        if (i11 != 0) {
            int i12 = 56 / 0;
        }
        return enumM1161;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1173(InneractiveAdRequest inneractiveAdRequest) {
        f997 = (f996 + 29) % 128;
        String spotId = inneractiveAdRequest.getSpotId();
        f997 = (f996 + 121) % 128;
        return spotId;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1177(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i10 = f996 + 97;
        f997 = i10 % 128;
        int i11 = i10 % 2;
        m1187(inneractiveContentController, eventsListener);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1181(ImpressionData impressionData) {
        int i10 = f997 + 59;
        f996 = i10 % 128;
        if (i10 % 2 != 0) {
            m1172(impressionData);
            throw null;
        }
        String strM1172 = m1172(impressionData);
        f996 = (f997 + InterfaceC0435l1.d.b.f29109f) % 128;
        return strM1172;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m1186(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i10 = f996 + 13;
        f997 = i10 % 128;
        int i11 = i10 % 2;
        ViewGroup layout = inneractiveFullscreenAdActivity.getLayout();
        if (i11 == 0) {
            int i12 = 31 / 0;
        }
        f996 = (f997 + 51) % 128;
        return layout;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f997 = (f996 + 55) % 128;
        String version = InneractiveAdManager.getVersion();
        f997 = (f996 + 81) % 128;
        return version;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Object m1170(InneractiveUnitController inneractiveUnitController) {
        f996 = (f997 + 37) % 128;
        InneractiveContentController selectedContentController = inneractiveUnitController.getSelectedContentController();
        f997 = (f996 + 25) % 128;
        return selectedContentController;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1172(ImpressionData impressionData) {
        int i10 = f996 + 67;
        f997 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getAdvertiserDomain();
        }
        impressionData.getAdvertiserDomain();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1182(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f997 + 11;
        f996 = i10 % 128;
        if (i10 % 2 != 0) {
            m1163(inneractiveAdSpot);
            throw null;
        }
        boolean zM1163 = m1163(inneractiveAdSpot);
        f997 = (f996 + 75) % 128;
        return zM1163;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static InneractiveContentController.EventsListener m1184(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f996 = (f997 + 65) % 128;
        InneractiveContentController.EventsListener eventsListener = inneractiveFullscreenVideoContentController.getEventsListener();
        int i10 = f997 + InterfaceC0435l1.d.b.f29110g;
        f996 = i10 % 128;
        if (i10 % 2 == 0) {
            return eventsListener;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0123  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f0  */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -1764994669:
                if (!str.equals(m1180((char) (54182 - Color.argb(0, 0, 0, 0)), Color.alpha(0) + 864, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10).intern())) {
                    b10 = -1;
                } else {
                    f996 = (f997 + 53) % 128;
                    b10 = 29;
                }
                break;
            case -1757761411:
                b10 = !str.equals(m1180((char) TextUtils.indexOf("", "", 0), (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 803, TextUtils.indexOf("", "", 0, 0) + 27).intern()) ? (byte) -1 : (byte) 26;
                break;
            case -1751837367:
                b10 = !str.equals(m1180((char) TextUtils.getTrimmedLength(""), 105 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -1661930846:
                b10 = !str.equals(m1180((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 247, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 81).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -1611796569:
                b10 = !str.equals(m1180((char) (52860 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 581, 37 - (ViewConfiguration.getScrollBarSize() >> 8)).intern()) ? (byte) -1 : (byte) 18;
                break;
            case -1452673136:
                b10 = !str.equals(m1180((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29783), TextUtils.getCapsMode("", 0, 0) + 344, TextUtils.getOffsetBefore("", 0) + 20).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -1264220508:
                b10 = !str.equals(m1180((char) TextUtils.indexOf("", ""), 476 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf("", "", 0) + 31).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1205203919:
                b10 = !str.equals(m1180((char) ((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 812), (ViewConfiguration.getScrollBarSize() >> 8) + 538, 43 - (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -1190251081:
                b10 = !str.equals(m1180((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 17919), TextUtils.getTrimmedLength("") + IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, 35 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()) ? (byte) -1 : (byte) 23;
                break;
            case -1115843213:
                b10 = !str.equals(m1180((char) (55643 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 874, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14).intern()) ? (byte) -1 : (byte) 30;
                break;
            case -955341033:
                if (!str.equals(m1180((char) (17985 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.indexOf((CharSequence) "", '0') + 831, 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f996 + 83;
                    f997 = i10 % 128;
                    if (i10 % 2 != 0) {
                        b10 = 27;
                    } else {
                        b10 = 98;
                    }
                }
                break;
            case -758374370:
                b10 = !str.equals(m1180((char) Color.green(0), 743 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0') + 40).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -587023626:
                b10 = !str.equals(m1180((char) TextUtils.indexOf("", ""), 839 - TextUtils.lastIndexOf("", '0', 0), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 28;
                break;
            case -312786562:
                if (!str.equals(m1180((char) (View.resolveSizeAndState(0, 0, 0) + 33601), TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33).intern())) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -233888832:
                if (!str.equals(m1180((char) (ImageFormat.getBitsPerPixel(0) + 1), 928 - MotionEvent.axisFromString(""), 55 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f996 + 19;
                    int i12 = i11 % 128;
                    f997 = i12;
                    b10 = i11 % 2 == 0 ? (byte) 106 : (byte) 33;
                    f996 = (i12 + 89) % 128;
                }
                break;
            case -50587944:
                if (!str.equals(m1180((char) (18673 - View.combineMeasuredStates(0, 0)), ExpandableListView.getPackedPositionChild(0L) + IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 15).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f997 + 121;
                    f996 = i13 % 128;
                    b10 = i13 % 2 == 0 ? (byte) 14 : (byte) 85;
                }
                break;
            case 82:
                b10 = !str.equals(m1180((char) (40843 - TextUtils.getOffsetAfter("", 0)), Color.argb(0, 0, 0, 0) + 537, (ViewConfiguration.getTouchSlop() >> 8) + 1).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 83843:
                b10 = !str.equals(m1180((char) (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 661, 2 - TextUtils.lastIndexOf("", '0', 0)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 114221977:
                b10 = !str.equals(m1180((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 424, ExpandableListView.getPackedPositionGroup(0L) + 28).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 218220615:
                b10 = !str.equals(m1180((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 384, 24 - ExpandableListView.getPackedPositionType(0L)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 294386593:
                b10 = !str.equals(m1180((char) (16861 - View.MeasureSpec.getSize(0)), 327 - View.combineMeasuredStates(0, 0), 17 - KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 305774826:
                b10 = !str.equals(m1180((char) TextUtils.getTrimmedLength(""), 984 - (Process.myPid() >> 22), (ViewConfiguration.getJumpTapTimeout() >> 16) + 49).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 334157136:
                b10 = !str.equals(m1180((char) (KeyEvent.getMaxKeyCode() >> 16), 888 - Color.alpha(0), View.combineMeasuredStates(0, 0) + 20).intern()) ? (byte) -1 : (byte) 31;
                break;
            case 598324252:
                b10 = !str.equals(m1180((char) Gravity.getAbsoluteGravity(0, 0), 452 - KeyEvent.getDeadChar(0, 0), ImageFormat.getBitsPerPixel(0) + 26).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 652259752:
                if (!str.equals(m1180((char) TextUtils.getCapsMode("", 0, 0), 663 - ((byte) KeyEvent.getModifierMetaStateMask()), 44 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f997 + 99;
                    f996 = i14 % 128;
                    if (i14 % 2 == 0) {
                        b10 = 22;
                    } else {
                        b10 = 27;
                    }
                }
                break;
            case 778319234:
                b10 = !str.equals(m1180((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 783, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 809010015:
                b10 = !str.equals(m1180((char) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), 638 - Color.blue(0), 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 986039922:
                b10 = !str.equals(m1180((char) (View.MeasureSpec.getMode(0) + 41652), MotionEvent.axisFromString("") + 619, TextUtils.lastIndexOf("", '0', 0) + 21).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 996606931:
                b10 = !str.equals(m1180((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 30913), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + InterfaceC0435l1.a.b.f29089i, (ViewConfiguration.getTapTimeout() >> 16) + 15).intern()) ? (byte) -1 : (byte) 10;
                break;
            case 1840053850:
                if (!str.equals(m1180((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 34 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 71 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f997 + 89;
                    f996 = i15 % 128;
                    if (i15 % 2 == 0) {
                        b10 = 1;
                    } else {
                        b10 = 0;
                    }
                }
                break;
            case 1945237502:
                b10 = !str.equals(m1180((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), MotionEvent.axisFromString("") + InterfaceC0435l1.c.b.f29100f, (ViewConfiguration.getEdgeSlop() >> 16) + 43).intern()) ? (byte) -1 : (byte) 4;
                break;
            case 1956883725:
                b10 = !str.equals(m1180((char) (ViewConfiguration.getTouchSlop() >> 8), 522 - TextUtils.indexOf((CharSequence) "", '0', 0), 14 - ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 2019288557:
                b10 = !str.equals(m1180((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36378), 136 - TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 68).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 2082429859:
                if (!str.equals(m1180((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 908 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 20).intern())) {
                    b10 = -1;
                } else {
                    f997 = (f996 + 23) % 128;
                    b10 = 32;
                }
                break;
            case 2110184418:
                b10 = !str.equals(m1180((char) View.resolveSize(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 364, 21 - (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 8;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return InneractiveInternalBrowserActivity.class;
            case 2:
            case 3:
                return InneractiveFullscreenAdActivity.class;
            case 4:
            case 5:
                return InneractiveRichMediaVideoPlayerActivityCore.class;
            case 6:
                return InneractiveAdSpot.class;
            case 7:
                return InneractiveAdRequest.class;
            case 8:
                return InneractiveAdRenderer.class;
            case 9:
                return InneractiveMediationName.class;
            case 10:
                return IAConfigManager.class;
            case 11:
                return InneractiveContentController.class;
            case 12:
                return InneractiveUnitController.class;
            case 13:
                return InneractiveAdViewUnitController.class;
            case 14:
                return UnitDisplayType.class;
            case 15:
                return InneractiveUnitController.EventsListener.class;
            case 16:
                return R.class;
            case 17:
                return InneractiveFullscreenVideoContentController.class;
            case 18:
                return InneractiveFullscreenAdEventsListener.class;
            case 19:
                return VideoContentListener.class;
            case 20:
                return InneractiveInternalBrowserActivity.InternalBrowserListener.class;
            case 21:
                return Tap.class;
            case 22:
                return InneractiveFullscreenAdEventsListenerAdapter.class;
            case 23:
                return InneractiveFullscreenUnitController.class;
            case 24:
                return InneractiveAdViewVideoContentController.class;
            case 25:
                return InneractiveUnitController.EventsListenerAdapter.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return VideoContentListenerAdapter.class;
            case 27:
                return IAMraidKit.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return IAmraidWebViewController.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                return IAVideoKit.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                return ImpressionData.class;
            case 31:
                return IArichMediaVideoView.class;
            case 32:
                return IArichMediaVideoView.BaseVideoViewListener.class;
            case 33:
                return InneractiveFullscreenAdEventsListenerWithImpressionData.class;
            case 34:
                return InneractiveAdViewEventsListenerWithImpressionData.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static InneractiveAdSpot m1167(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        f997 = (f996 + 63) % 128;
        InneractiveAdSpot adSpot = inneractiveAdViewUnitController.getAdSpot();
        f997 = (f996 + 45) % 128;
        return adSpot;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1187(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i10 = f997 + 73;
        f996 = i10 % 128;
        int i11 = i10 % 2;
        inneractiveContentController.setEventsListener(eventsListener);
        if (i11 != 0) {
            int i12 = 57 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1180((char) (33563 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), View.combineMeasuredStates(0, 0) + IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 26 - TextUtils.indexOf("", "", 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1183((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1180((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52656), 1059 - TextUtils.indexOf("", ""), 9 - TextUtils.getTrimmedLength("")).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1175((InneractiveAdRequest) list.get(0));
            }
        });
        map.put(m1180((char) (39410 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1067 - TextUtils.lastIndexOf("", '0'), 12 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1169((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1180((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 38913), 1080 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 14 - ExpandableListView.getPackedPositionType(0L)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bt.m1174((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m1180((char) (ViewConfiguration.getScrollBarSize() >> 8), View.resolveSize(0, 0) + 1094, ((Process.getThreadPriority(0) + 20) >> 6) + 9).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bt.m1182((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m1180((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + InterfaceC0341fe.a.f28681c), 1103 - View.combineMeasuredStates(0, 0), 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1176((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1180((char) ((-1) - MotionEvent.axisFromString("")), 1121 - TextUtils.indexOf("", "", 0, 0), 9 - TextUtils.indexOf("", "", 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1178((InneractiveFullscreenAdActivity) list.get(0));
            }
        });
        map.put(m1180((char) (3846 - Color.blue(0)), 1130 - Color.argb(0, 0, 0, 0), 24 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1160((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1180((char) ((Process.getThreadPriority(0) + 20) >> 6), 1155 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1179((InneractiveUnitController) list.get(0));
            }
        });
        map.put(m1180((char) Drawable.resolveOpacity(0, 0), (Process.myTid() >> 22) + 1183, TextUtils.indexOf("", "") + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1168((InneractiveFullscreenVideoContentController) list.get(0));
            }
        });
        map.put(m1180((char) (12330 - TextUtils.getTrimmedLength("")), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1199, (ViewConfiguration.getJumpTapTimeout() >> 16) + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bt.m1177((InneractiveContentController) list.get(0), (InneractiveContentController.EventsListener) list.get(1));
                return null;
            }
        });
        map.put(m1180((char) (Process.getGidForName("") + 55904), Color.alpha(0) + 1217, ImageFormat.getBitsPerPixel(0) + 10).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1171((InneractiveAdViewUnitController) list.get(0));
            }
        });
        map.put(m1180((char) ExpandableListView.getPackedPositionGroup(0L), 1225 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1185((String) list.get(0));
            }
        });
        map.put(m1180((char) (KeyEvent.getMaxKeyCode() >> 16), 1248 - ExpandableListView.getPackedPositionGroup(0L), 20 - Color.blue(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Integer.valueOf(bt.m1159());
            }
        });
        map.put(m1180((char) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 28309), 1268 - KeyEvent.keyCodeFromString(""), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 22).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bt.m1181((ImpressionData) list.get(0));
            }
        });
        f997 = (f996 + 125) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1180(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f995[i10 + i12]) ^ (((long) i12) * f998)) ^ ((long) c4));
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
}
