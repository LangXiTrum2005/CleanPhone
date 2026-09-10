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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
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
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bo extends be {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f907 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f908 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f909;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f910;

    static {
        char[] cArr = new char[1080];
        f2.v("\u0000Vå\u0005ÊÒ¯\u0093\u0095Iz\u000f_ÎD\u009f*N\u000f\u0001ôÍÙ\u0085\u0000^å\u001cÊä¯\u009b\u0095\\z$_®D\u009d*+\u000f\u001côäÙä²\fW}x´\u001dö'\tÈ\\\u0000Hå9Êð¯²\u0095Mz\u0018_ÃD¯*n\u000f4ôòÙ¯¿l¤,\u0089ån²\u0000På,Êá¯£\u0095ez-_åD®*t\u000f\u0014ôùÙ°¿e\u0000Aå$\u0098Â}£Rv7#\rèâ¢ÇcÜ(²å\u0097¿lNA)'ê<¢\u0011cö4íþ\b\u009c'KB\u0002xÁ\u0097\u008f²J©\u000bÇÊâ¸\u0019O4\u001dRÚIªdO\u0083\u001a¹Ï\u0000Hå9Êð¯²\u0095Mz\u0018_ÐD²*o\u000f0ôåÙ²¿t¤)\u0089ån³p<\u0095Mº\u0084ßÆå9\nl/£4ÑZ\u0016\u007fb\u0084\u009d©ÑÏ\u0003Ôcù\u009d\u001eÀ$\u001cIwn\u0098sÛ\u0099\u0007¾UÃ\u0096èØ\u000e\u0011\u0013z8\u0095]Âc6\u0088U\u00ad\u0086\u0000cå/Êí¯î\u0095hz9_ðD²*m\u000f8ô®Ù¡¿n¤$\u0089òn¯Ti9$\u001e®\u0003³édÎ+³®\u0098§~rc!Hð-¨\u0013iø#ÝóÂî¨H\u008d9rðW²=M\"\u0018\u0007×ì¥Òb·\u0016\u009cé\u0081¥gwL\u00171é\u0016´ühá\u0003Æì«¯\u0091sv![â@¬&e\u000b\u000eðáÕ¶»B !\u0085ò\u0000Hå9Êð¯²\u0095Mz\u0018_ÎD¯*O\u000f&ôæÙ¥¿r¤3\u0089Án£Tt9)\u001eö\u0003©étÎ9ª¯Oã`!\u0005\"?¤Ðõõ<î~\u0080¡¥ô^bsm\u0015¢\u000eè#>Äcþ¥\u0093è´b©\u007fC¨dç\u0019b2mÔ¯Éøâ%\u0087z¹¥Røw5h\"\u0002\u0084'õØ<ý~\u0097\u0081\u0088Ô\u00ad\u0002Fcx\u0083\u001dê6*+iÍ¾æÿ\u009b\r¼oV¸Kål:\u0001e;¸Üõ\u0000Hå9Êð¯²\u0095Mz\u0018_ÏD¦*f\u000f%ôòÙ\u0096¿i¤%\u0089÷n¥Tr9\u0001\u001eã\u0003´éiÎ6³é\u0098´~y\u0000cå/Êí¯î\u0095hz9_ðD²*m\u000f8ô®Ù¡¿n¤$\u0089òn¯Ti9$\u001e®\u0003³édÎ+³®\u0098¡~cc4Hé-¶\u0013iø4ÝùÂî¨H\u008d9rðW²=M\"\u0018\u0007Ïì¦Òf·%\u009cò\u0081\u0096giL%1÷\u0016¥ürá\u0001Æã«´\u0091iv6[é@´&y\u0000Hå9Êð¯²\u0095Mz\u0018_ÒD¥*q\u000f5ôéÙ²¿e¤$\u0089Én®Tf9/\u001eò\u0003\u00adéaÎ4³é\u0098¯~nc\u0001Hã-´\u0013iø6ÝéÂ´¨y\u0000cå/Êí¯î\u0095hz9_ðD²*m\u000f8ô®Ù¡¿n¤$\u0089òn¯Ti9$\u001e®\u0003³édÎ+³®\u0098¡~cc4Hé-¶\u0013iø4ÝùÂî¨H\u008d9rðW²=M\"\u0018\u0007Òì¥Òq·5\u009cé\u0081²geL$1É\u0016®üfá/Æò«\u00ad\u0091av4[é@¯&n\u000b\u0001ðãÕ´»i 6\u0085éj´Py\u0000Hå9Êð¯²\u0095Mz\u0018_ÂD¡*s\u000f%ôÖÙ©¿e¤7\u0089Ãn¯Tn94\u001eò\u0003¯élÎ,³å\u0098²\nqï\u0000ÀÉ¥\u008b\u009ftp!UïN\u0098 J\u0005\rþïÓ\u0090µ\\®\u000e\u0083úd\u0096^W3\r\u0014Ë\t\u0096ãUÄ\u0015¹Ü\u0092\u008b\u00895lDC\u008d&Ï\u001c0óeÖªÍØ£\u001f\u0086i}\u008fPÜ6\u001b-[\u0000\u0094çÞÝ+°T\u0097\u0098\u008aÊ`>GR:\u0093\u0011É÷\u000fêRÁ\u0091¤Ñ\u009a\u0018qO\u0082zg\u0013HÓ-\u0090\u0017Gø6ÝÔÆ\u0096¨]\u008d\u0010vð[\u009b=A&\u001c\u000bÁì\u008c\u0000Wå%Êâ¯\u0094\u0095rz!_æD¦*i\u000f#ôÏÙ¢¿j¤%\u0089ãn´\u0000Wå%Êâ¯\u0094\u0095rz!_æD¦*i\u000f#ôÕÙ\u0092¿L\u0000Hå9Êð¯²\u0095Mz\u0018_ÌD¥*a\u000f2ôîÙ\u008d¿o¤2\u0089ån\u0083To9.\u001eô\u0003²éoÎ,³ì\u0098¥~r\u0085÷`\u0086OO*\r\u0010òÿ§ÚrÁ\r¯Þ\u008a\u0096q[\\):Ö!\u009a\fHë<ÑÐ¼\u0091\u009bK\u0086\rlÐK\u00936S\u001d\u001aûÍÇ½\"Ì\r\u0005hGR¸½í\u0098:\u0083Sí\u0093ÈÐ3\u0007\u001ebx\u0090c×N#©\\\u0093\u0090þÂÙ6ÄZ.\u009b\tÁt\u0007_Z¹\u0099¤Ù\u008f\u0010êG\u0000Hå9Êð¯²\u0095Mz\u0018_×D¥*b\u000f\u0016ôéÙ¥¿w\u0000Hå9Êð¯²\u0095Mz\u0018_×D¥*b\u000f\u0016ôéÙ¥¿w¤\u0003\u0089ìn©Te9.\u001eôû0\u001eA1\u0088TÊn5\u0081`¤·¿ÞÑ\u001eô]\u000f\u008a\"îD\u0011_]r\u008f\u0095Ý¯\nÂpå\u0099øÖ\u0012\u001c5TH\u009dcÊ\u0000Oå&Êæ¯¥\u0095rz\u0016_éD¥*w\u000f%ôòÙ\u0088¿a¤.\u0089än¬Te92\u001eÌ\u0003©ésÎ4³å\u0098®~ec2\u0000Hå9Êð¯²\u0095Mz\u0018_ÓD«*i\u000f0ôÃÙ¯¿n¤4\u0089òn¯Tl9,\u001eå\u0003²\u008aæo\u0097@^%\u001c\u001fãð¶Õ}Î\u0005 Ç\u0085\u009e~mS\u00015À.\u009a\u0003\\ä\u0001ÞÂ³\u0082\u0094K\u0089\u001ccâD\u00879]\u0012\u001aôËé\u0080ÂK§\u001c\u0000Hå9Êð¯²\u0095Mz\u0018_ÂD²*o\u000f7ôóÙ¥¿r¤\u0001\u0089ãn´Ti96\u001eé\u0003´éy_`º,\u0095îðíÊk%:\u0000ó\u001b±unP;«\u00ad\u0086¢àmû'Öñ1¬\u000bjf'A\u00ad\\°¶g\u0091(ì\u00adÇ¬!u<&\u0017ñr¯Lb§:\u0082\u00ad\u009d\u008b÷zÒ3-ñ\b\u008eb[}\u0001Xñ³¬\u008dtè0ÃæÞ±8B\u0013 n÷Iª£u¾*\u0099÷ôºðL\u0015\u000e:ß_¼eN\u008a\t¯ÿ´\u0099ÚJÿ\r\u0004Í)\u0082OHT$yÉ\u009e\u0081¤NÉ\bîßó¾\u0019Y>\u0007CØ\u0000gå%Êô¯\u008f\u0095fz&_åD²*C\u000f!ôãÙ¨¿e¤\u0003\u0089ìn©Tc9+\u001eÔ\u0003¨érÎ/³õ\u0098§~hc\u0015Hò-¬@_¥\u001d\u008aÌï¹Õ\\:,\u001fÁ\u0004\u0088j]\u0000gå%Êô¯\u0090\u0095lz!_ãD¥*m\u000f%ôîÙ´¿T¤9\u0089ðn¥TE9.\u001eõ\u0003\u00ad\u0000gå%Êô¯\u0084\u0095ez0_åD®*d\u000f%ôîÙ£¿y¤\b\u0089ïn¬Td9%\u001eò\u0003\u0089énÎ3³ô\u0098¡~nc#Hå\u0000gå%Êô¯\u0084\u0095iz3_ôD²*i\u000f\"ôõÙ´¿o¤2\u0089Én¤\f_é\u001dÆÌ£¨\u0099Tv\u0019SÛH\u009d&U\u0003\u001døÖÕ\u008c³{¨\u0017\u0085Öb\u008cXJ5\u0017\u0012Ô\u000f\u0094å]Â\n\u0000gå%Êô¯\u0090\u0095rz%_ìD¯*a\u000f$ôåÙ¤¿D¤!\u0089ôn¡¤-Aon¾\u000bÚ1+Þxû«àç\u008e/«~P¯}ø\u001b9\u0000Rå\u0005Ê×¯\u0081\u0095Rz\u0004_ÅD\u0084\u0000Iå\u000eÊÔ¯\u0085\u0095Rz\u0013_ÔD\u0089*T\u000f\tôÁÙ\u008c\u0014àñ§Þ\u007f»(\u0081ån Km¼>Y\u007fv¤\u0013ï)9Æ~ã¹øä\u00969³qH¼eù\u0003*\u0018u5´", "ISO-8859-1", cArr, 0, 1080);
        f907 = cArr;
        f909 = -2605419941773777600L;
    }

    public bo(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x00ce  */
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Object m1022(String str) {
        f908 = (f910 + 7) % 128;
        byte b10 = 0;
        switch (str.hashCode()) {
            case -1617199657:
                if (!str.equals(m1024((char) (Color.blue(0) + 5289), 1059 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), AndroidCharacter.getMirror('0') - ')').intern())) {
                    b10 = -1;
                } else {
                    int i10 = f908 + 63;
                    f910 = i10 % 128;
                    b10 = i10 % 2 == 0 ? (byte) 2 : (byte) 5;
                }
                break;
            case -1372958932:
                if (!str.equals(m1024((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1046, (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 12).intern())) {
                    b10 = -1;
                } else {
                    f910 = (f908 + InterfaceC0435l1.d.b.f29105b) % 128;
                    b10 = 1;
                }
                break;
            case -65580248:
                if (!str.equals(m1024((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 48241), TextUtils.getOffsetAfter("", 0) + 1065, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15).intern())) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 543046670:
                if (!str.equals(m1024((char) (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + IronSourceError.ERROR_RV_SHOW_EXCEPTION, (ViewConfiguration.getLongPressTimeout() >> 16) + 8).intern())) {
                    b10 = -1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            return PlacementType.REWARDED;
        }
        if (b10 == 1) {
            return PlacementType.INTERSTITIAL;
        }
        if (b10 == 2) {
            return PlacementType.INVALID;
        }
        if (b10 != 3) {
            return null;
        }
        return PlacementType.NOT_INITIALIZED;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ DependencyHolder m1023() {
        int i10 = f910 + 65;
        f908 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1021();
        }
        m1021();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1026(DependencyHolder dependencyHolder) {
        f910 = (f908 + 119) % 128;
        String strM1038 = m1038(dependencyHolder);
        int i10 = f910 + 17;
        f908 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1038;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1029(OfferCacheEntity offerCacheEntity) {
        int i10 = f908 + 97;
        f910 = i10 % 128;
        int i11 = i10 % 2;
        String str = offerCacheEntity.clickThroughUrl;
        if (i11 != 0) {
            int i12 = 4 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ PlacementController m1030(HyprMXController hyprMXController) {
        f908 = (f910 + 9) % 128;
        PlacementController placementControllerM1033 = m1033(hyprMXController);
        int i10 = f910 + 95;
        f908 = i10 % 128;
        if (i10 % 2 != 0) {
            return placementControllerM1033;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ PreloadedVastData m1032(DependencyHolder dependencyHolder) {
        f908 = (f910 + 17) % 128;
        PreloadedVastData preloadedVastDataM1028 = m1028(dependencyHolder);
        f910 = (f908 + 71) % 128;
        return preloadedVastDataM1028;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m1035(String str) {
        int i10 = f908 + 33;
        f910 = i10 % 128;
        if (i10 % 2 != 0) {
            m1022(str);
            throw null;
        }
        Object objM1022 = m1022(str);
        f908 = (f910 + 11) % 128;
        return objM1022;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static PreloadedVastData m1028(DependencyHolder dependencyHolder) {
        f910 = (f908 + InterfaceC0435l1.d.b.f29110g) % 128;
        PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        f910 = (f908 + 91) % 128;
        return preloadedData;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1034(PreloadedVastData preloadedVastData) {
        int i10 = f910 + 73;
        f908 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1031(preloadedVastData);
        }
        m1031(preloadedVastData);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1036(Ad ad2) {
        int i10 = f910 + InterfaceC0435l1.d.b.f29107d;
        f908 = i10 % 128;
        if (i10 % 2 == 0) {
            m1025(ad2);
            throw null;
        }
        String strM1025 = m1025(ad2);
        int i11 = f908 + 91;
        f910 = i11 % 128;
        if (i11 % 2 == 0) {
            return strM1025;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f908 = (f910 + 79) % 128;
        try {
            try {
                String str = (String) BuildConfig.class.getDeclaredField(m1024((char) TextUtils.getOffsetBefore("", 0), ViewConfiguration.getScrollBarSize() >> 8, 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()).get(null);
                f910 = (f908 + 125) % 128;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return id.m2382().m2383().m2493(BuildConfig.class, m1024((char) ('0' - AndroidCharacter.getMirror('0')), View.MeasureSpec.getSize(0) + 12, 11 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x021c  */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -2118473762:
                if (!str.equals(m1024((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 45636), 24 - Color.alpha(0), Drawable.resolveOpacity(0, 0) + 6).intern())) {
                    b10 = -1;
                } else {
                    f910 = (f908 + 1) % 128;
                    b10 = 0;
                }
                break;
            case -2115661176:
                b10 = !str.equals(m1024((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 35196), (ViewConfiguration.getScrollBarSize() >> 8) + IronSourceError.ERROR_CODE_INIT_FAILED, Color.argb(0, 0, 0, 0) + 30).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -2082076211:
                b10 = !str.equals(m1024((char) (35502 - View.getDefaultSize(0, 0)), Color.red(0) + 763, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28).intern()) ? (byte) -1 : (byte) 29;
                break;
            case -2060981001:
                b10 = !str.equals(m1024((char) (Color.rgb(0, 0, 0) + 16816262), 60 - ImageFormat.getBitsPerPixel(0), View.resolveSize(0, 0) + 16).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1783324338:
                b10 = !str.equals(m1024((char) (((Process.getThreadPriority(0) + 20) >> 6) + 43724), Color.blue(0) + 226, 54 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1711062568:
                if (!str.equals(m1024((char) (28788 - (KeyEvent.getMaxKeyCode() >> 16)), 109 - ExpandableListView.getPackedPositionChild(0L), 31 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    f908 = (f910 + 69) % 128;
                    b10 = 7;
                }
                break;
            case -1632261541:
                b10 = !str.equals(m1024((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 661 - KeyEvent.keyCodeFromString(""), 13 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -1625751435:
                b10 = !str.equals(m1024((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 443 - AndroidCharacter.getMirror('0'), 65 - (ViewConfiguration.getTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1429076201:
                b10 = !str.equals(m1024((char) (51189 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 633, View.getDefaultSize(0, 0) + 28).intern()) ? (byte) -1 : (byte) 23;
                break;
            case -1345825871:
                b10 = !str.equals(m1024((char) View.MeasureSpec.makeMeasureSpec(0, 0), 94 - Color.green(0), 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1289932600:
                b10 = !str.equals(m1024((char) (AndroidCharacter.getMirror('0') - '0'), KeyEvent.keyCodeFromString("") + 554, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -1102538544:
                b10 = !str.equals(m1024((char) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 717 - (ViewConfiguration.getTapTimeout() >> 16), 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 27;
                break;
            case -1056910325:
                if (!str.equals(m1024((char) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), 141 - (ViewConfiguration.getPressedStateDuration() >> 16), 63 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f910 + 107;
                    f908 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (byte) 8 : (byte) 34;
                }
                break;
            case -793729563:
                b10 = !str.equals(m1024((char) (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 204, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -684201479:
                if (!str.equals(m1024((char) View.MeasureSpec.makeMeasureSpec(0, 0), 743 - (Process.myTid() >> 22), 19 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f910 + InterfaceC0435l1.d.b.f29110g;
                    int i12 = i11 % 128;
                    f908 = i12;
                    byte b11 = i11 % 2 == 0 ? (byte) 4 : (byte) 28;
                    f910 = (i12 + 21) % 128;
                    b10 = b11;
                }
                break;
            case -411143178:
                b10 = !str.equals(m1024((char) Color.alpha(0), 305 - TextUtils.getCapsMode("", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 57).intern()) ? (byte) -1 : (byte) 12;
                break;
            case -352824194:
                if (!str.equals(m1024((char) (60846 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 77, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17).intern())) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -58290677:
                b10 = !str.equals(m1024((char) (2617 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 484 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 23 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -52302939:
                b10 = !str.equals(m1024((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 24324), 812 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0) + 52).intern()) ? (byte) -1 : (byte) 31;
                break;
            case -48720897:
                if (!str.equals(m1024((char) (ViewConfiguration.getTouchSlop() >> 8), 279 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 25).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f908 + 91;
                    f910 = i13 % 128;
                    b10 = i13 % 2 == 0 ? (byte) 11 : (byte) 65;
                }
                break;
            case 2115:
                if (!str.equals(m1024((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 59, 2 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f908 + 91;
                    f910 = i14 % 128;
                    if (i14 % 2 == 0) {
                        b10 = 3;
                    } else {
                        b10 = 5;
                    }
                }
                break;
            case 5206681:
                b10 = !str.equals(m1024((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Drawable.resolveOpacity(0, 0) + 791, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21).intern()) ? (byte) -1 : (byte) 30;
                break;
            case 99044255:
                b10 = !str.equals(m1024((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 46, 12 - ImageFormat.getBitsPerPixel(0)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 217655834:
                b10 = !str.equals(m1024((char) Drawable.resolveOpacity(0, 0), Color.blue(0) + 30, 16 - Color.argb(0, 0, 0, 0)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 748493318:
                b10 = !str.equals(m1024((char) TextUtils.getOffsetAfter("", 0), KeyEvent.keyCodeFromString("") + 674, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 902272186:
                b10 = !str.equals(m1024((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34240), 608 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0) + 25).intern()) ? (byte) -1 : (byte) 22;
                break;
            case 1056638846:
                b10 = !str.equals(m1024((char) Color.argb(0, 0, 0, 0), 361 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 33 - View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 13;
                break;
            case 1527993897:
                b10 = !str.equals(m1024((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 33333), 538 - ((Process.getThreadPriority(0) + 20) >> 6), 17 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 1564846544:
                if (!str.equals(m1024((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 460 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f910 + 85;
                    f908 = i15 % 128;
                    b10 = i15 % 2 != 0 ? (byte) 15 : (byte) 98;
                }
                break;
            case 1575934042:
                if (!str.equals(m1024((char) (View.resolveSize(0, 0) + 64376), (Process.myPid() >> 22) + 693, 24 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    f908 = (f910 + InterfaceC0435l1.d.b.f29107d) % 128;
                    b10 = 26;
                }
                break;
            case 1775126662:
                b10 = !str.equals(m1024((char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 571 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 1872662391:
                b10 = !str.equals(m1024((char) TextUtils.getOffsetAfter("", 0), 583 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) + 26).intern()) ? (byte) -1 : (byte) 21;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
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
                f910 = (f908 + 117) % 128;
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
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return OfferViewerHandler.class;
            case 27:
                return OfferViewerHandler.OfferViewerHandlerListener.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return HyprMXSkipController.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                return HyprMXSkipController.Listener.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
                return HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1037(OfferCacheEntity offerCacheEntity) {
        f908 = (f910 + 37) % 128;
        String strM1029 = m1029(offerCacheEntity);
        f910 = (f908 + 69) % 128;
        return strM1029;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1024((char) (61483 - Color.red(0)), 864 - (ViewConfiguration.getScrollBarSize() >> 8), 23 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bo.m1039((WebTrafficObject) list.get(0));
            }
        });
        map.put(m1024((char) Color.blue(0), (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 887, 29 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bo.m1037((OfferCacheEntity) list.get(0));
            }
        });
        map.put(m1024((char) (16439 - TextUtils.lastIndexOf("", '0', 0)), 915 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 9 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bo.m1036((Ad) list.get(0));
            }
        });
        map.put(m1024((char) TextUtils.indexOf("", "", 0, 0), 924 - (ViewConfiguration.getFadingEdgeLength() >> 16), 20 - View.combineMeasuredStates(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bo.m1035((String) list.get(0));
            }
        });
        map.put(m1024((char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 944 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 28).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bo.m1023();
            }
        });
        map.put(m1024((char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 971 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 16 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bo.m1026((DependencyHolder) list.get(0));
            }
        });
        map.put(m1024((char) (3128 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 988 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 22).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bo.m1030((HyprMXController) list.get(0));
            }
        });
        map.put(m1024((char) KeyEvent.keyCodeFromString(""), 1009 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 15 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bo.m1032((DependencyHolder) list.get(0));
            }
        });
        map.put(m1024((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42057), KeyEvent.normalizeMetaState(0) + IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, 13 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bo.m1034((PreloadedVastData) list.get(0));
            }
        });
        int i10 = f908 + InterfaceC0435l1.d.b.f29112i;
        f910 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 59 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ List m1039(WebTrafficObject webTrafficObject) {
        int i10 = f908 + 71;
        f910 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1027(webTrafficObject);
        }
        m1027(webTrafficObject);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1038(DependencyHolder dependencyHolder) {
        f908 = (f910 + 31) % 128;
        String distributorId = dependencyHolder.getDistributorId();
        int i10 = f910 + 7;
        f908 = i10 % 128;
        if (i10 % 2 != 0) {
            return distributorId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<WebTrafficObject.WebTrafficURL> m1027(WebTrafficObject webTrafficObject) {
        int i10 = f908 + 9;
        f910 = i10 % 128;
        int i11 = i10 % 2;
        List<WebTrafficObject.WebTrafficURL> list = webTrafficObject.urls;
        if (i11 != 0) {
            throw null;
        }
        int i12 = f910 + 89;
        f908 = i12 % 128;
        if (i12 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1025(Ad ad2) {
        int i10 = f910 + 49;
        f908 = i10 % 128;
        int i11 = i10 % 2;
        String str = ad2.type;
        if (i11 == 0) {
            throw null;
        }
        int i12 = f910 + 11;
        f908 = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1024(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f907[i10 + i12]) ^ (((long) i12) * f909)) ^ ((long) c4));
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

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static DependencyHolder m1021() {
        f908 = (f910 + InterfaceC0435l1.d.b.f29110g) % 128;
        DependencyHolder dependencyHolder = DependencyHolder.INSTANCE;
        f908 = (f910 + 33) % 128;
        return dependencyHolder;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static PlacementController m1033(HyprMXController hyprMXController) {
        f910 = (f908 + 57) % 128;
        PlacementController placementController = hyprMXController.getPlacementController();
        f908 = (f910 + 33) % 128;
        return placementController;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m1031(PreloadedVastData preloadedVastData) {
        int i10 = f910 + 25;
        f908 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject parameters = preloadedVastData.getParameters();
        if (i11 == 0) {
            int i12 = 55 / 0;
        }
        f910 = (f908 + InterfaceC0435l1.d.b.f29110g) % 128;
        return parameters;
    }
}
