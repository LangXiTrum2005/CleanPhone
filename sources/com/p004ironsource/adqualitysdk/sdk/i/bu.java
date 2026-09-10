package com.p004ironsource.adqualitysdk.sdk.i;

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
import com.fyber.inneractive.sdk.c.f;
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
import com.p004ironsource.cs;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bu extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1033 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1034 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1035 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1036 = 1;

    static {
        char[] cArr = new char[1352];
        ByteBuffer.wrap("\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6RR\"n\t\u008aË¦\u00adÃ~ß û\u001e\u0017á3¦PjlA\u0088\u0014¤ýÀ»Ü»ùH\u0015(1äMÈi\u0086\u0086T¢(\u0000c\u001c^8\u000fT½p¢\u008c\u008c©DÅ2áúý\u0097\u0019\u00836uR\"n\u0018\u008aÜ¦¾Ãsß5û\u001b\u0017Õ3±P+lE\u0088\u0003¤óÀçÜ\u009bùH\u0015(1äMÈi\u0086\u0086T¢8¾çÚÀöÊ\u0013\\/(K\u0019gÍ\u0083« k¼XØ\u0018ôô\u0010¸,\u009aIye\u000f\u0081æ\u009d¦¹\u0086ÖKò7\u000eë*úF\u009bcu\u007f<\u009b\u000f·ÈÓ¬ðN\f#(\u0005DË`¥}m\u0099Aµ\u001f\u0098M\u0084[ \bÌòè²\u0014\u00901A]'yåeË\u0081\u008b®YÊ=ö\u0015\u0012Æ>¨[wG7c\u0013\u008fÂ«¾È@ôV\u0010\"<ÿX¹D\u0097aY\u008d1©ýÕÃ\u0000c\u001c^8\u000fT½p¢\u008c\u008c©DÅ2áúý\u0097\u0019\u00836uR\"n\u0018\u008aÜ¦¾Ãsß5û\u001b\u0017Õ3±P+lE\u0088\u0003¤óÀçÜ\u009bùH\u0015(1äMÈi\u0086\u0086T¢8¾çÚÀöÊ\u0013\\/(K\u0019gÍ\u0083« k¼XØ\u0018ôô\u0010¸,\u009aIve\u0014\u0081þ\u009d¯¹\u0087ÖFò$\u000eâ*ÝF\u0087c[\u007f/\u009b=·ÎÓªðf\f6(\u0018DÖ`ª\u0099¬\u0085º¡éÍ\u0013éS\u0015q0 \\Æx\u0004d*\u0080j¯¬ËÀ÷û\u0013#?wZ\u0090FÀbþ\u008e'ªgÉ\u0089õ·\u0011ç=\u0012Y|Es`¯\u008cÀ¨\rÔ)ðK\u001f¦;À'\u000eC oh\u008a\u0084¶ÚÒÑþ\"\u001aN9\u008a\u0000c\u001c^8\u000fT½p¢\u008c\u008c©DÅ2áúý\u0097\u0019\u00836uR\"n\u0018\u008aÜ¦¾Ãsß5û\u001b\u0017Õ3±P+lE\u0088\u0003¤óÀçÜ\u009bùH\u0015(1äMÈi\u0086\u0086T¢8¾çÚÀöÊ\u0013\\/(K\u0019gÍ\u0083« k¼XØ\u0018ôô\u0010¸,\u009aIbe\b\u0081ñ\u009d«¹¹Ö@ò2\u000eî*ÙF¿cs\u007f/\u009b\u0019·ÂÓ\u008eðc\f!(\bDÇ`¡}E\u0099Vµ\u0012Ñþí¾\t\u0090&^B\"^ÏzÒ\u0096\u009c³z\u008aì\u0096ú²©ÞSú\u0013\u00061#àO\u0086kDwj\u0093*¼ÿØ\u008dä\u008b\u0000{,\u0015IÁ\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6ZR(n/\u008aË¦®Ãeß$û\u0001\u0017×\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6ZR(n/\u008aË¦±Ãtß$û\u0000\u0017Æ3¦\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6VR)n\u0019\u008aÇ¦¾Ãdß(û\u001d\u0017Í3\u009aPdl[\u0088\u0002ÅüÙÅý\u0094\u0091Iµ\u001fI&lú\u0000\u0085$p8mÜ1óÏ\u0097\u009e«\u00adOiííñûÕ¨¹R\u009d\u0012a0Dá(\u0087\fE\u0010kô+Ûü¿\u0087\u0083·g~K\u001e.Ú2\u0091\u0016\u0095úhÞ\u001e½Õ\u0081àe¬IP-\u00011;\u0014ýVPJFn\u0015\u0002ï&¯Ú\u008dÿ\\\u0093:·ø«ÖO\u0096`W\u0004;8\rÜÃð\u0085\u0095f\u00896\u00ad\u001fAÈe¢\u0006p:CÞ\u001bòóÃÀßÖû\u0085\u0097\u007f³?O\u001djÌ\u0006ª\"h>FÚ\u0006õÓ\u0091¡\u00ad¢INe3\u0000î\u001c\u009d8\u0095ÔCð)\u0093Ï¯ÐK\u0080ge\u00032\u001f\u001c:ÎÖ¹òa\u008eE\u0004\u0004\u0018\u000e<ZP¶tÑ\u0088Í\u00ad\u0004Ávåµù\u0089\u001dÂ2\u001eVdj\\\u008e\u009a\u008fÐ\u0093Ò·\u0092Ûhÿ%\u0003\u0013&ÿJ«nnrX\u0096\u001a¹àÝ¼á\u009a[ÈX#D5`f\f\u009c(ÜÔþñ/\u009dI¹\u008b¥¥Aån7\nS6{Ò¨þÆ\u009b\u0019\u0087Y£}O¬kÐ\b945Ðiü\u0097\u0098Ì\u0084Ó¡.MXi\u0093\u0015±1ëÞ>úxæ\u0087\u0082·®úK\rwC\u0013q?®ÛÖø\u0012üõàãÄ°¨J\u008c\np(Uù9\u009f\u001d]\u0001så3Êá®\u0085\u0092\u00adv~Z\u0010?Ï#\u008f\u0007«ëzÏ\u0006¬ø\u0090ît\u009eXR<\u0010 (\u0005ãé\u0093Í}±k\u0095 zè^\u0088BP&j\n*V/J!n\u007f\u0002\u008f&ÒÚÏÿ0\u0093@·\u0085«¥Oý`\u0016\u0004y8mÜ¤ðÒ\u0095\f\u0089V\u00adnA¨\u0000I\u001c_8\u0016Töp¶\u008c\u009b©GÅ;áÊýË\u0019\u00856lR?n\u0018\u008aÜ¦\u0093Ãyß2û\u0006\u0017Æ3ºP`lD\u0000T\u001cP8\u0012}&a0Ec)\u0099\rÙñûÔ*¸L\u009c\u008e\u0080 dàK2/V\u0013~÷\u00adÛÃ¾\u001c¢\\\u0086xj©NÕ-+\u0011=õMÙ\u0081½Ã¡û\u00840h@L®0¸\u0014óû;ß[Ã\u0083§¹\u008bùn;RM6y\u001a·þÂÝ\u0000Á&\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6]R9n\u0011\u008aÂ¦¬Ãsß3û\u0017\u0017Æ3ºPPlX\u0088\u000e¤ìÀ\u008aÜ\u0095ùE\u0015(1ÿMÑi\u0083\u0086L¢4¾ð\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6ZR(n+\u008aÇ¦ºÃgß\u0017û\u001b\u0017Ç3±Pjlu\u0088\b¤öÀ½Ü\u009fùE\u0015(1ÎMÑi\u0081\u0086T¢#¾íÚßö\u0088\u0013p/4\u0000E\u001cG8\u0007Týp°\u008c\u0086©jÅ>áûýÍ\u0019\u008f6uR)n\u000f\u008aï¦»Ãqß1û\u0006\u0017Æ3¦\u0000V\u001cX8\u0006Töp«\u008c¶©IÅ9áüýÜ\u0019\u00846oR\u0000n\u0014\u008aÝ¦«Ãuß/û\u0017\u0017Ñ3\u0095PalW\u0088\u0017¤ìÀ¬Ü\u0088\u0000I\u001cp8/Táp¥\u008c\u009c©BÅ\u001cááýÍ\u0000I\u001cp8\u000fTáp¥\u008c\u009c©BÅ\u0000áíýÛ\u0019¼6rR)n\n\u008aí¦°Ã~ß5û\u0000\u0017Ì3¸PilS\u0088\u0015\u0000I\u001cp84Túp \u008c\u0090©IÅ\u001cááýÍ\u0000I\u001c\\8\u0012Táp¡\u008c\u0086©UÅ>áçý×\u0019®6zR8n\u001c\u0000I\u001cp8\u0010Túp§\u008c\u009d©kÅ2áìýÐ\u0019\u008b6MR%n\u0019\u008aË¦°ÃFß(û\u0017\u0017Ô\u0000B\u001cP8\u0011Töp\u0092\u008c\u009c©BÅ2áçýï\u0019\u00836~R;n1\u008aÇ¦¬Ãdß$û\u001c\u0017Æ3¦\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6]R9n\u0011\u008aÂ¦¬Ãsß3û\u0017\u0017Æ3ºPDlR\u0088\"¤îÀ¬Ü\u0094ù_\u0015/1ÁM×i\u009c\u0086T¢4¾ìÚÖö\u0096\u0013B//K\u0003gÀ\u0083\u0090 g¼KØ\u001eôø\u0010½,\u008cIYe\u000e\u0081ü\u009d\u0087¹\u0095ÖQò7(Ä4Ò\u0010\u0081|{X;¤\u0019\u0081Èí®ÉlÕB1\u0002\u001e×z¥F¦¢J\u008e7ëê÷\u0089Ó\u0089?K\u001b7xüDÈ ¦\u008c|è7ô\u0003ÑÃ=¿\u0019eeAA5®Ä\u008a¨\u0096gòwÞ\u0004;è\u0007¹c\u009fOV«'\u0088î\u0094Ùð\u008fÜT8\"\u0004\u0006aÜ\u0000g\u001cT8\u0016TÐp±\u008c\u0087©TÅ2áæýÍ\u0019º6iR#n\u001e\u008aË¦¬Ãcß$û\u0016\u0017ñ3±PtlC\u0088\u0002¤ëÀ½\u0087\u009d\u009b®¿ìÓ:÷N\u000b`.¨Bäf\u0016\u0000g\u001cT8\u0016TÒp \u008c¶©IÅ9áüýÜ\u0019\u00846o\u0000i\u001cB8$Tæp¨\u008c\u0099©UÅ4áúýÜ\u0019\u008f6uR\rn\u0019\u0000i\u001cB84Túp \u008c\u0090©IÅ\u0016áì:]&n\u0002,nêJ\u0092¶¦\u0093\u007fÿ\u0006ÛæÇë#¢\fNh\u0003T °ü\u009c°ùXå\u0017\u0000g\u001cT8\u0016Tßp¥\u008c\u008c©IÅ\"áü\u0000g\u001cT8\u0016TÀp¡\u008c\u0099©CÅ4áüýÜ\u0019\u008e6NR\"n\u0014\u008aÚ¦\u009cÃ\u007fß/û\u0006\u0017Ñ3»PilZ\u0088\u0002¤ê\u0000g\u001cT8\u0016TÀp¡\u008c\u0099©CÅ4áüýÜ\u0019\u008e6XR#n\u0013\u008aÚ¦ºÃ~ß5û1\u0017Ì3ºPqlD\u0088\b¤ôÀ¥Ü\u009fùY\u0000g\u001cT8\u0016TÖp²\u008c\u0090©HÅ#áûýõ\u0019\u00836hR8n\u0018\u008aÀ¦ºÃb©sµT\u0091\u0016ýÖÙ²%\u0090\u0000Hl#HûTõ°\u0083\u009fhû8Ç\u0018#À\u000fºjb\u0000g\u001cT8\u0016TÒp \u008c¦©VÅ8áü\u0000g\u001cT8\u0016TÆpª\u008c\u009c©RÅ\u0013ááýÊ\u0019\u009a6wR-n\u0004\u008aú¦¦Ã`ß$û7\u0017Í3¡Ph\u0000g\u001cT8\u0016TÞp¶\u008c\u0094©OÅ3áÊýØ\u0019\u00846uR)n\u000f\u008aø¦¶Ãuß6û;\u0017Ç\u0000g\u001cT8\u0016TÚp©\u008c\u0085©TÅ2áûýÊ\u0019\u00836tR\"n9\u008aÏ¦«Ãqß\u0005û\u001d\u0017Î3µPllX\u0000I\u001c\u007f86TÖp\u0096\u008c¦©rÅ\u001eáÜýð\u0019«6W\u0000L\u001cp8,T×p\u0097\u008c¶©gÅ\u0007áÍ\u009fI\u0083g§#ËÔï\u0094\u0000B\u001cp8,TÝp\u0081\u008c§ÉöÕÐñ\u0091\u009dv¹2E\u0015`Ç\f·\u0000S\u001c`87TÒp\u0096\u008c°\u0000V\u001ct80TÇp\u008d\u008c¶©gÅ\u001b\u0000D\u001ct8$TÒp\u0091\u008c¹©r".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1352);
        f1033 = cArr;
        f1034 = -5382659218389394383L;
    }

    public bu(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static InneractiveUnitController m1174(InneractiveAdSpot inneractiveAdSpot) {
        f1035 = (f1036 + 81) % 128;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        int i2 = f1035 + 53;
        f1036 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return selectedUnitController;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m1175(InneractiveAdSpot inneractiveAdSpot) {
        f1036 = (f1035 + 23) % 128;
        String clickThroughUrl = inneractiveAdSpot.getAdContent().getClickThroughUrl();
        int i2 = f1036 + 65;
        f1035 = i2 % 128;
        if (i2 % 2 == 0) {
            return clickThroughUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean m1177(InneractiveAdSpot inneractiveAdSpot) {
        f1036 = (f1035 + 5) % 128;
        boolean zIsVideoAd = inneractiveAdSpot.getAdContent().isVideoAd();
        int i2 = f1035 + 15;
        f1036 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return zIsVideoAd;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveUnitController m1178(InneractiveAdSpot inneractiveAdSpot) {
        int i2 = f1036 + 61;
        f1035 = i2 % 128;
        if (i2 % 2 != 0) {
            m1174(inneractiveAdSpot);
            throw null;
        }
        InneractiveUnitController inneractiveUnitControllerM1174 = m1174(inneractiveAdSpot);
        f1036 = (f1035 + 125) % 128;
        return inneractiveUnitControllerM1174;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ int m1179() {
        int i2 = f1035 + 63;
        f1036 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1176();
        }
        m1176();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Object m1181(InneractiveAdSpot inneractiveAdSpot) {
        f1035 = (f1036 + 63) % 128;
        f adContent = inneractiveAdSpot.getAdContent();
        int i2 = f1035 + 51;
        f1036 = i2 % 128;
        if (i2 % 2 != 0) {
            return adContent;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static InneractiveAdRequest m1182(InneractiveAdSpot inneractiveAdSpot) {
        f1036 = (f1035 + 31) % 128;
        InneractiveAdRequest currentProcessedRequest = inneractiveAdSpot.getCurrentProcessedRequest();
        f1036 = (f1035 + 29) % 128;
        return currentProcessedRequest;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveAdSpot m1184(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i2 = f1036 + 105;
        f1035 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1192(inneractiveAdViewUnitController);
        }
        m1192(inneractiveAdViewUnitController);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1190(InneractiveAdSpot inneractiveAdSpot) {
        f1035 = (f1036 + 69) % 128;
        boolean zM1180 = m1180(inneractiveAdSpot);
        f1036 = (f1035 + 95) % 128;
        return zM1180;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveAdRequest m1191(InneractiveAdSpot inneractiveAdSpot) {
        int i2 = f1036 + 73;
        f1035 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1182(inneractiveAdSpot);
        }
        m1182(inneractiveAdSpot);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveContentController.EventsListener m1194(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f1035 = (f1036 + 39) % 128;
        InneractiveContentController.EventsListener eventsListenerM1199 = m1199(inneractiveFullscreenVideoContentController);
        f1035 = (f1036 + 29) % 128;
        return eventsListenerM1199;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m1200(InneractiveAdSpot inneractiveAdSpot) {
        int i2 = f1035 + 51;
        f1036 = i2 % 128;
        if (i2 % 2 == 0) {
            m1181(inneractiveAdSpot);
            throw null;
        }
        Object objM1181 = m1181(inneractiveAdSpot);
        int i3 = f1035 + 61;
        f1036 = i3 % 128;
        if (i3 % 2 != 0) {
            return objM1181;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int m1176() {
        f1036 = (f1035 + 53) % 128;
        int i2 = R.id.inneractive_webview_mraid;
        int i3 = f1036 + 61;
        f1035 = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean m1180(InneractiveAdSpot inneractiveAdSpot) {
        f1035 = (f1036 + 23) % 128;
        boolean zIsFullscreenAd = inneractiveAdSpot.getAdContent().isFullscreenAd();
        f1036 = (f1035 + 65) % 128;
        return zIsFullscreenAd;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Enum m1183(String str) {
        byte b2 = 7;
        switch (str.hashCode()) {
            case -2032180703:
                if (!str.equals(m1202((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, 1345 - View.resolveSizeAndState(0, 0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1036 + 75;
                    f1035 = i2 % 128;
                    if (i2 % 2 != 0) {
                        b2 = 102;
                    }
                }
                break;
            case -1841345251:
                if (!str.equals(m1202(ExpandableListView.getPackedPositionGroup(0L) + 6, 1331 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1035 + 83;
                    f1036 = i3 % 128;
                    b2 = i3 % 2 != 0 ? (byte) 5 : (byte) 2;
                }
                break;
            case -1372958932:
                b2 = !str.equals(m1202(12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1292, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1201514634:
                b2 = str.equals(m1202(9 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1336, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) 6 : (byte) -1;
                break;
            case -77725029:
                if (!str.equals(m1202(9 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1303 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) View.getDefaultSize(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    f1035 = (f1036 + 37) % 128;
                    b2 = 1;
                }
                break;
            case 73622449:
                if (!str.equals(m1202(5 - Color.blue(0), 1313 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (40709 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1036;
                    f1035 = (i4 + 21) % 128;
                    f1035 = (i4 + 7) % 128;
                }
                break;
            case 543046670:
                b2 = !str.equals(m1202(Color.green(0) + 8, 1323 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (51620 - TextUtils.indexOf("", "", 0, 0))).intern()) ? (byte) -1 : (byte) 4;
                break;
            case 1951953708:
                b2 = !str.equals(m1202(6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1317 - Color.alpha(0), (char) Color.alpha(0)).intern()) ? (byte) -1 : (byte) 3;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return UnitDisplayType.INTERSTITIAL;
            case 1:
                return UnitDisplayType.LANDSCAPE;
            case 2:
                return UnitDisplayType.MRECT;
            case 3:
                return UnitDisplayType.BANNER;
            case 4:
                return UnitDisplayType.REWARDED;
            case 5:
                return UnitDisplayType.SQUARE;
            case 6:
                return UnitDisplayType.VERTICAL;
            case 7:
                return UnitDisplayType.DEFAULT;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1185(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i2 = f1036 + 39;
        f1035 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1189(inneractiveFullscreenAdActivity);
        }
        m1189(inneractiveFullscreenAdActivity);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1193(ImpressionData impressionData) {
        int i2 = f1036 + 87;
        f1035 = i2 % 128;
        if (i2 % 2 != 0) {
            m1186(impressionData);
            throw null;
        }
        String strM1186 = m1186(impressionData);
        f1036 = (f1035 + 101) % 128;
        return strM1186;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1195(String str) {
        f1036 = (f1035 + 11) % 128;
        Enum enumM1183 = m1183(str);
        int i2 = f1035 + 123;
        f1036 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 20 / 0;
        }
        return enumM1183;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1203(InneractiveAdRequest inneractiveAdRequest) {
        int i2 = f1036 + 55;
        f1035 = i2 % 128;
        int i3 = i2 % 2;
        String strM1197 = m1197(inneractiveAdRequest);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = f1036 + 9;
        f1035 = i5 % 128;
        if (i5 % 2 == 0) {
            return strM1197;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1202(26 - (ViewConfiguration.getEdgeSlop() >> 16), 1033 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1191((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1202(ExpandableListView.getPackedPositionChild(0L) + 10, 1059 - TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34810)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1203((InneractiveAdRequest) list.get(0));
            }
        });
        map.put(m1202((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, 1068 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1200((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1202(13 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 1081, (char) Color.green(0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(bu.m1190((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m1202(View.combineMeasuredStates(0, 0) + 9, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1095, (char) KeyEvent.normalizeMetaState(0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(bu.m1188((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m1202(TextUtils.indexOf("", "") + 18, 1104 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (14905 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1198((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1202(AndroidCharacter.getMirror('0') - '\'', 1121 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1185((InneractiveFullscreenAdActivity) list.get(0));
            }
        });
        map.put(m1202(25 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 1130, (char) Color.blue(0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1178((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1202(28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1156, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1196((InneractiveUnitController) list.get(0));
            }
        });
        map.put(m1202((ViewConfiguration.getFadingEdgeLength() >> 16) + 17, 1182 - Process.getGidForName(""), (char) (Process.myTid() >> 22)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1194((InneractiveFullscreenVideoContentController) list.get(0));
            }
        });
        map.put(m1202(TextUtils.indexOf("", "", 0) + 17, TextUtils.indexOf("", "", 0, 0) + cs.c.INSTANCE_LOAD_FAILED, (char) (43264 - TextUtils.indexOf("", ""))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bu.m1187((InneractiveContentController) list.get(0), (InneractiveContentController.EventsListener) list.get(1));
                return null;
            }
        });
        map.put(m1202(9 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 1217, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1184((InneractiveAdViewUnitController) list.get(0));
            }
        });
        map.put(m1202(22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1225 - Process.getGidForName(""), (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1195((String) list.get(0));
            }
        });
        map.put(m1202(20 - (KeyEvent.getMaxKeyCode() >> 16), 1248 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Integer.valueOf(bu.m1179());
            }
        });
        map.put(m1202(22 - ExpandableListView.getPackedPositionChild(0L), AndroidCharacter.getMirror('0') + 1220, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bu.m1193((ImpressionData) list.get(0));
            }
        });
        int i2 = f1036 + 59;
        f1035 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1187(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i2 = f1035 + 43;
        f1036 = i2 % 128;
        int i3 = i2 % 2;
        m1204(inneractiveContentController, eventsListener);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m1196(InneractiveUnitController inneractiveUnitController) {
        int i2 = f1036 + 13;
        f1035 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1201(inneractiveUnitController);
        }
        m1201(inneractiveUnitController);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00e3  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2 = 1;
        switch (str.hashCode()) {
            case -1764994669:
                b2 = !str.equals(m1202(10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 864, (char) TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 29;
                break;
            case -1757761411:
                if (!str.equals(m1202(View.resolveSize(0, 0) + 27, 802 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1035 + 117;
                    f1036 = i2 % 128;
                    b2 = i2 % 2 != 0 ? (byte) 26 : (byte) 108;
                }
                break;
            case -1751837367:
                b2 = !str.equals(m1202((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31, 104 - ExpandableListView.getPackedPositionChild(0L), (char) (38916 - (Process.myPid() >> 22))).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -1661930846:
                if (!str.equals(m1202((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 79, 247 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1036 + 27;
                    f1035 = i3 % 128;
                    if (i3 % 2 == 0) {
                        b2 = 5;
                    } else {
                        b2 = 4;
                    }
                }
                break;
            case -1611796569:
                if (!str.equals(m1202(36 - ((byte) KeyEvent.getModifierMetaStateMask()), 581 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 64700)).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1036 + 11;
                    f1035 = i4 % 128;
                    b2 = i4 % 2 == 0 ? (byte) 18 : (byte) 65;
                }
                break;
            case -1452673136:
                b2 = !str.equals(m1202(20 - Color.green(0), 345 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -1264220508:
                if (!str.equals(m1202(30 - Process.getGidForName(""), View.getDefaultSize(0, 0) + 477, (char) (50057 - View.resolveSizeAndState(0, 0, 0))).intern())) {
                    b2 = -1;
                } else {
                    f1035 = (f1036 + 107) % 128;
                    b2 = 13;
                }
                break;
            case -1205203919:
                b2 = str.equals(m1202(42 - TextUtils.indexOf((CharSequence) "", '0', 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 537, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22633)).intern()) ? (byte) 17 : (byte) -1;
                break;
            case -1190251081:
                b2 = !str.equals(m1202(TextUtils.lastIndexOf("", '0', 0) + 36, 707 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case -1115843213:
                b2 = !str.equals(m1202(14 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 873 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 30;
                break;
            case -955341033:
                if (!str.equals(m1202((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, 830 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((-16777216) - Color.rgb(0, 0, 0))).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1035 + 81;
                    f1036 = i5 % 128;
                    b2 = i5 % 2 != 0 ? (byte) 27 : (byte) 104;
                }
                break;
            case -758374370:
                b2 = !str.equals(m1202(39 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 743 - Gravity.getAbsoluteGravity(0, 0), (char) Drawable.resolveOpacity(0, 0)).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -587023626:
                b2 = !str.equals(m1202(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, TextUtils.lastIndexOf("", '0', 0, 0) + 841, (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern()) ? (byte) -1 : (byte) 28;
                break;
            case -312786562:
                b2 = !str.equals(m1202(ImageFormat.getBitsPerPixel(0) + 35, View.MeasureSpec.getMode(0), (char) KeyEvent.keyCodeFromString("")).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -233888832:
                b2 = !str.equals(m1202((ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, 929 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 33;
                break;
            case -50587944:
                b2 = str.equals(m1202(15 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getTouchSlop() >> 8) + IronSourceError.ERROR_CODE_INIT_FAILED, (char) (1105 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern()) ? (byte) 14 : (byte) -1;
                break;
            case 82:
                b2 = !str.equals(m1202(1 - Color.blue(0), 537 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (AndroidCharacter.getMirror('0') + 23402)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 83843:
                b2 = !str.equals(m1202((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2, 661 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 114221977:
                b2 = !str.equals(m1202((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27, TextUtils.getTrimmedLength("") + 424, (char) (60836 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 218220615:
                b2 = !str.equals(m1202((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, 385 - View.getDefaultSize(0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 294386593:
                b2 = !str.equals(m1202(16 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 327, (char) (35493 - Color.green(0))).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 305774826:
                b2 = !str.equals(m1202(Process.getGidForName("") + 50, 985 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10381)).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 334157136:
                b2 = !str.equals(m1202((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, TextUtils.getOffsetAfter("", 0) + 888, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 31;
                break;
            case 598324252:
                b2 = !str.equals(m1202((ViewConfiguration.getFadingEdgeLength() >> 16) + 25, 452 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22040)).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 652259752:
                b2 = !str.equals(m1202(44 - ((Process.getThreadPriority(0) + 20) >> 6), 663 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (32111 - Drawable.resolveOpacity(0, 0))).intern()) ? (byte) -1 : (byte) 22;
                break;
            case 778319234:
                b2 = !str.equals(m1202(21 - TextUtils.getOffsetBefore("", 0), 782 - Color.blue(0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 809010015:
                b2 = !str.equals(m1202(View.MeasureSpec.getSize(0) + 23, Color.argb(0, 0, 0, 0) + 638, (char) KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 986039922:
                b2 = str.equals(m1202(MotionEvent.axisFromString("") + 21, 618 - Color.green(0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22136)).intern()) ? (byte) 19 : (byte) -1;
                break;
            case 996606931:
                b2 = !str.equals(m1202(((Process.getThreadPriority(0) + 20) >> 6) + 15, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 409, (char) (TextUtils.getTrimmedLength("") + 50613)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case 1840053850:
                if (!str.equals(m1202((ViewConfiguration.getDoubleTapTimeout() >> 16) + 71, 34 - View.combineMeasuredStates(0, 0), (char) Drawable.resolveOpacity(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    f1036 = (f1035 + 97) % 128;
                }
                break;
            case 1945237502:
                if (!str.equals(m1202((ViewConfiguration.getFadingEdgeLength() >> 16) + 43, TextUtils.lastIndexOf("", '0', 0, 0) + 205, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 39397)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 1956883725:
                b2 = !str.equals(m1202(15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 523 - TextUtils.indexOf("", ""), (char) (36758 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 2019288557:
                b2 = !str.equals(m1202(67 - ExpandableListView.getPackedPositionChild(0L), Gravity.getAbsoluteGravity(0, 0) + Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, (char) Color.green(0)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 2082429859:
                b2 = !str.equals(m1202(View.resolveSizeAndState(0, 0, 0) + 21, 907 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) TextUtils.getOffsetAfter("", 0)).intern()) ? (byte) -1 : (byte) 32;
                break;
            case 2110184418:
                b2 = !str.equals(m1202(21 - TextUtils.getOffsetBefore("", 0), 364 - Gravity.getAbsoluteGravity(0, 0), (char) Gravity.getAbsoluteGravity(0, 0)).intern()) ? (byte) -1 : (byte) 8;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
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
            case 26:
                return VideoContentListenerAdapter.class;
            case 27:
                return IAMraidKit.class;
            case 28:
                return IAmraidWebViewController.class;
            case 29:
                return IAVideoKit.class;
            case 30:
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        int i2 = f1036 + 69;
        f1035 = i2 % 128;
        if (i2 % 2 != 0) {
            InneractiveAdManager.getVersion();
            throw null;
        }
        String version = InneractiveAdManager.getVersion();
        int i3 = f1036 + 89;
        f1035 = i3 % 128;
        if (i3 % 2 == 0) {
            return version;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1188(InneractiveAdSpot inneractiveAdSpot) {
        f1036 = (f1035 + 79) % 128;
        boolean zM1177 = m1177(inneractiveAdSpot);
        int i2 = f1035 + 71;
        f1036 = i2 % 128;
        if (i2 % 2 != 0) {
            return zM1177;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1198(InneractiveAdSpot inneractiveAdSpot) {
        f1035 = (f1036 + 85) % 128;
        String strM1175 = m1175(inneractiveAdSpot);
        f1036 = (f1035 + 27) % 128;
        return strM1175;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m1201(InneractiveUnitController inneractiveUnitController) {
        f1036 = (f1035 + 103) % 128;
        InneractiveContentController selectedContentController = inneractiveUnitController.getSelectedContentController();
        f1036 = (f1035 + 61) % 128;
        return selectedContentController;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1186(ImpressionData impressionData) {
        f1036 = (f1035 + 125) % 128;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        int i2 = f1036 + 81;
        f1035 = i2 % 128;
        if (i2 % 2 == 0) {
            return advertiserDomain;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1197(InneractiveAdRequest inneractiveAdRequest) {
        int i2 = f1035 + 47;
        f1036 = i2 % 128;
        int i3 = i2 % 2;
        String spotId = inneractiveAdRequest.getSpotId();
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = f1035 + 45;
        f1036 = i5 % 128;
        if (i5 % 2 != 0) {
            return spotId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static InneractiveContentController.EventsListener m1199(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f1035 = (f1036 + 101) % 128;
        InneractiveContentController.EventsListener eventsListener = inneractiveFullscreenVideoContentController.getEventsListener();
        int i2 = f1035 + 67;
        f1036 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return eventsListener;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1204(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        f1036 = (f1035 + 5) % 128;
        inneractiveContentController.setEventsListener(eventsListener);
        f1035 = (f1036 + 31) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1202(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f1033[i3 + i4]) ^ (((long) i4) * f1034)) ^ ((long) c2));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object m1189(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i2 = f1035 + 11;
        f1036 = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup layout = inneractiveFullscreenAdActivity.getLayout();
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        f1035 = (f1036 + 43) % 128;
        return layout;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static InneractiveAdSpot m1192(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i2 = f1036 + 7;
        f1035 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveAdSpot adSpot = inneractiveAdViewUnitController.getAdSpot();
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = f1036 + 87;
        f1035 = i5 % 128;
        if (i5 % 2 == 0) {
            return adSpot;
        }
        throw null;
    }
}
