package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
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
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends WebChromeClient implements ba.d, ch {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2388 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2389;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2390;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2391;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private WebChromeClient f2392;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WebChromeClient f2393;

    static {
        char[] cArr = new char[1163];
        f2.v("\u0000WWy®Z\u0005\u0017\\\u0018³þ\nÇa©¸\u0085\u000f¿gt¾]\u00155l\u0002Ãü\u001aàq¥È¿\u001f\u0097wfÎQ%8|\u0007Óö\u0001\u0014V?¯\u001b\u0004j]S²ý\u000b\u0090`û¹\u0091\u000eÀf\u001d¿\u0007\u0014MmTÂª\u001b\u0081pôÉã\u001eÌv7ÏA$r}WÒ\u0085+\u0083\u0080\u0082Ùî.×\u0086$ß\u000e4j\u008dvâ¹;¬\u0090\u0087éâ>Ä\u00969\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÖ*Å\u0081ßØ½/\u009d\u0087fÞI5,\u008c0ãé:è\u0091Ôè±\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÖ*Å\u0081ßØ½/\u009d\u0087fÞI5,\u008c-ãã:ó\u0091Ö\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÖ*Å\u0081ßØ½/\u009d\u0087fÞI5,\u008c0ãï:é\u0091Ûè¼?¹\u0097oîGE*\u009c5ó\u000eJô;ýlÖ\u0095ò>\u0083gº\u0088\u00141yZ\u0012\u0083x4)\\ô\u0085î.¤W½øC!hJ\u001dó\n$%LÞõ¨\u001e\u009bG¾èo\u0011pºkã\u0017\u0014\u000f¼Ýåç\u000e\u0084·³ØU\u0001rªiÓ\t\u0004?±¿æ\u0094\u001f°´Áíø\u0002V»;ÐP\t:¾kÖ¶\u000f¬¤æÝÿr\u0001«*À_yH®gÆ\u009c\u007fê\u0094ÙÍüb6\u009b30\"iG\u009eM6\u009fo¥\u0084Æ=ñR\u0017\u008b0 +YK\u008e}\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÇ*Ò\u0081ÙØ¹/\u0080\u0087uÞ{5!\u008c\nãä:ó\u0091Ï\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÖ*Å\u0081ÍØ\u00ad/\u0091\u0087cÞX5\u000e\u008c\u000bãã:é\u0091Ë \u00ad÷\u0086\u000e¢¥Óüê\u0013Dª)ÁB\u0018(¯yÇ¤\u001e¾µôÌíc\u0013º8ÑMhZ¿u×\u008enø\u0085ËÜîs/\u008a$!;xC\u008fy'¯~\u00ad\u0095Î,èC\u0007\u009a\u0003\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÎ*Ó\u0081ýØ´/\u0091\u0087bÞX\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÎ*Ó\u0081ÿØ·/\u009a\u0087vÞE5:\u008c\tÜø\u008bÓr÷Ù\u0086\u0080¿o\u0011Ö|½\u0017d}Ó,»ñbëÉ¡°¸\u001fFÆm\u00ad\u0018\u0014\u000fÃ «Û\u0012\u00adù\u009e »\u000fsön]Q\u0004\u0017ó&[À\u0002áé\u0081\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÎ*Ó\u0081þØ½/\u0092\u0087\u007fÞ^5-\u008c1ãî:ð\u0091×èµ?\u0094Cú\u0014ÑíõF\u0084\u001f½ð\u0013I~\"\u0015û\u007fL.$óýéV£/º\u0080DYo2\u001a\u008b\r\\\"4Ù\u008d¯f\u009c?¹\u0090~igÂ`\u009b\u0002l.ÄË\u009döv\u0093Ï\u009f ^yWÒf«\t|.ÔÀ\u00adò\u0006ªßª°¬\tSâj<(k\u0003\u0092'9V`o\u008fÁ6¬]Ç\u0084\u00ad3ü[!\u0082;)qPhÿ\u0096&½MÈôß#ðK\u000bò}\u0019N@kï®\u0016¨½¾äÙ\u0013ö»\u001eâ \tQ°`ß\u0082\u0006\u009f\u00ad\u0085ÔÜ\u0003ï«\fÒ,yZ ~Ïxv\u009a\u009d·ÄÎsÒ\u009b\rÂ&iZ\u0090a?gf\u0096\u008d°4Ñcñü\u0086«\u00adR\u0089ùø ÁOoö\u0002\u009diD\u0003óR\u009b\u008fB\u0095éß\u0090Æ?8æ\u0013\u008df4qã^\u008b¥2ÓÙà\u0080Å/\u0000Ö\u0006}\u0010$wÓX{°\"\u008eÉÿpÎ\u001f,Æ1m+\u0014rÃAk¢\u0012\u0082¹ô`Ð\u000fÖ¶4]\u0019\u0004`³g[¢\u0002\u0083©æPÏÿÉ¦8M\u001eô\u007f£_\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÔ*Å\u0081ÎØµ/\u009d\u0087cÞ_5!\u008c\u000bãî:Î\u0091Ýè¥?\u0085\u0097iî[E0Vh\u0001CøgS\u0016\n/å\u0081\\ì7\u0087îíY²1TèuC\u0011:(\u0095ËLî'Í\u009e\u009eI§!P\u0098zs\b*+\u0085\u0089|â×ÿ\u008e¥y¼ÑO\u0088lc\fÚ:µÞlØÇú¾\u0097i\u008fÁD¸t\u0013\u001cÊ(¥\"\u001cÁ\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÔ*Å\u0081ÎØµ/\u009d\u0087cÞ_5!\u008c\u000bãî:Î\u0091Ýè¥?\u0085\u0097iî[E0\u009c#ó\u001dJö¡×øµO\u0080§mþ@\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u009fgy¾X\u0015<l\u0005Ãæ\u001aÃqàÈ³\u001f\u008aw}ÎW%%|\u0006Ó¤*Ï\u0081ÒØ\u0088/\u0091\u0087bÞA5!\u008c\u0017ãó:õ\u0091×èº?¢\u0097iîYE1\u009c\u0005ó\u000fJì¡÷ø±O\u0082§kþAU,¬9\u0003\u001c\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÎ*Ó\u0081èØ±/\u0099\u0087uÞC5=\u008c\u0010\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÇ*Ï\u0081ÒØ«/\u009b\u0087|ÞI5\u0005\u008c\u0001ãó:ï\u0091Ùè³?\u0095fZ1qÈUc$:\u001dÕ³lÞ\u0007µÞßi\u008e\u0001SØIs\u0003\n\u001a¥ä|Ï\u0017º®\u00ady\u0082\u0011y¨\u000fC4\u001a\u0012µïLûçÆ¾¡I\u008aáz¸_S#ê-\u0085ö\\ç÷Â\u008e¤Y¿ñ|\u0088D#/ú\u001a\u0095\u0011Sô\u0004ßýûV\u008a\u000f³à\u001dYp2\u001bëq\\ 4ýíçF\u00ad?´\u0090JIa\"\u0014\u009b\u0003L,$×\u009d¡v\u009a/¼\u0080AyGÒd\u008b\r| ÔÎ\u008dÑf\u0096ß´°UiDÂg»\u0002l\u0011ÄÏ½ö\u0016\u0092Ï£ ¨\u0019Zòv«7\u001c4ôÜ\u00adâ\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%+|\rÓð*ö\u0081ÕØ«/\u009d\u0087dÞI5,\u008c,ãé:ï\u0091Ìè»?\u0082\u0097us\u009b$°Ý\u0094vå/ÜÀry\u001f\u0012tË\u001e|O\u0014\u0092Í\u0088fÂ\u001fÛ°%i\u000e\u0002{»llC\u0004¸½ÎVý\u000fØ \tY\u0016ò\r«q\\lô§\u00ad\u009eFóÿù\u00906I-â\t\u009byLKä \u0005ãRý«È\u0000\u0087Y\u0086¶i\u000f\\d0½\u0001\n\u001cbË»Õ\u0010¶i«Æd\u001fRt+Í5\u001a\u0019rÓËØ ¡y\u0089Ön/P\u0000gWy®L\u0005\u0000\\\u0012³Û\nÍa¦¸£\u000f\u0094gj¾[\u0015=l\tÃË\u001aÈq©È¹\u001f\u0096w`\u0000EWn®J\u0005;\\\u0002³¬\nßa¬¸\u0089\u000f\u0090g}¾\u0014\u00155l\u0014Ãí\u001aÇqµÈ¨\u001f\u0091wzÎW%l|?Óá*Â\u0081ÿØ°/\u0086\u0087\u007fÞA5-\u008c'ãì:õ\u0091Ýèº?\u0084\u0097HîME'\u009c\u000fó\u000eJù¡Àø¿O\u009e§(þJU!¬(\u0003\u0011Zâ±Õ\bì_\u0085·a\u000eTeT¼7\u0013\u0010j°Á\u008b/1", "ISO-8859-1", cArr, 0, 1163);
        f2390 = cArr;
        f2389 = 515938261104940828L;
    }

    public hu(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f2393 = webChromeClient;
        this.f2392 = webChromeClient2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Object m2300() {
        int i10 = f2388 + 97;
        f2391 = i10 % 128;
        int i11 = i10 % 2;
        WebChromeClient webChromeClient = this.f2392;
        if (i11 != 0) {
            int i12 = 66 / 0;
        }
        return webChromeClient;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WebChromeClient m2302() {
        int i10 = f2388;
        WebChromeClient webChromeClient = this.f2393;
        int i11 = i10 + 41;
        f2391 = i11 % 128;
        if (i11 % 2 == 0) {
            return webChromeClient;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        int i10 = f2391 + 39;
        f2388 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2392.getDefaultVideoPoster();
                throw null;
            }
            this.f2392.getDefaultVideoPoster();
            WebChromeClient webChromeClient = this.f2393;
            if (webChromeClient != null) {
                int i11 = f2391 + InterfaceC0435l1.d.b.f29107d;
                f2388 = i11 % 128;
                if (i11 % 2 != 0) {
                    return webChromeClient.getDefaultVideoPoster();
                }
                webChromeClient.getDefaultVideoPoster();
                throw null;
            }
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            int i12 = f2388 + 15;
            f2391 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 61 / 0;
            }
            return defaultVideoPoster;
        } catch (Throwable th2) {
            kl.m2899(m2301((char) View.resolveSizeAndState(0, 0, 0), ViewConfiguration.getScrollBarFadeDuration() >> 16, 25 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m2301((char) (26143 - View.MeasureSpec.makeMeasureSpec(0, 0)), KeyEvent.keyCodeFromString("") + 889, (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 41).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        f2391 = (f2388 + 99) % 128;
        try {
            this.f2392.getVideoLoadingProgressView();
            f2388 = (f2391 + 59) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2301((char) View.combineMeasuredStates(0, 0), Color.green(0), TextUtils.lastIndexOf("", '0') + 25).intern(), m2301((char) ((-16755791) - Color.rgb(0, 0, 0)), KeyEvent.getDeadChar(0, 0) + 931, 48 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient != null) {
            return webChromeClient.getVideoLoadingProgressView();
        }
        View videoLoadingProgressView = super.getVideoLoadingProgressView();
        int i10 = f2391 + 41;
        f2388 = i10 % 128;
        if (i10 % 2 != 0) {
            return videoLoadingProgressView;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        f2388 = (f2391 + 55) % 128;
        try {
            this.f2392.getVisitedHistory(valueCallback);
        } catch (Throwable th2) {
            kl.m2899(m2301((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ViewConfiguration.getDoubleTapTimeout() >> 16, 23 - TextUtils.indexOf((CharSequence) "", '0')).intern(), m2301((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 980 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 38 - Color.argb(0, 0, 0, 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient != null) {
            webChromeClient.getVisitedHistory(valueCallback);
            int i10 = f2388 + 61;
            f2391 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        super.getVisitedHistory(valueCallback);
        int i11 = f2391 + 115;
        f2388 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        f2388 = (f2391 + InterfaceC0435l1.d.b.f29107d) % 128;
        try {
            this.f2392.onCloseWindow(webView);
        } catch (Throwable th2) {
            kl.m2899(m2301((char) Color.green(0), '0' - AndroidCharacter.getMirror('0'), 24 - TextUtils.indexOf("", "", 0)).intern(), m2301((char) (41192 - KeyEvent.keyCodeFromString("")), 320 - Color.alpha(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient == null) {
            super.onCloseWindow(webView);
            return;
        }
        int i10 = f2391 + 91;
        f2388 = i10 % 128;
        if (i10 % 2 == 0) {
            webChromeClient.onCloseWindow(webView);
            throw null;
        }
        webChromeClient.onCloseWindow(webView);
        f2388 = (f2391 + 75) % 128;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i10, String str2) {
        int i11 = f2391 + 87;
        f2388 = i11 % 128;
        try {
            if (i11 % 2 == 0) {
                this.f2392.onConsoleMessage(str, i10, str2);
                int i12 = 12 / 0;
            } else {
                this.f2392.onConsoleMessage(str, i10, str2);
            }
        } catch (Throwable th2) {
            kl.m2899(m2301((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.indexOf("", "", 0, 0), 25 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m2301((char) View.MeasureSpec.makeMeasureSpec(0, 0), (-16776364) - Color.rgb(0, 0, 0), 37 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient == null) {
            super.onConsoleMessage(str, i10, str2);
            return;
        }
        webChromeClient.onConsoleMessage(str, i10, str2);
        int i13 = f2391 + 73;
        f2388 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 90 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        f2391 = (f2388 + InterfaceC0435l1.d.b.f29114k) % 128;
        try {
            this.f2392.onCreateWindow(webView, z10, z11, message);
        } catch (Throwable th2) {
            kl.m2899(m2301((char) (Process.myTid() >> 22), ViewConfiguration.getKeyRepeatTimeout() >> 16, 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), m2301((char) Color.red(0), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 249, View.resolveSize(0, 0) + 35).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient == null) {
            return super.onCreateWindow(webView, z10, z11, message);
        }
        int i10 = f2391 + 79;
        f2388 = i10 % 128;
        if (i10 % 2 != 0) {
            return webChromeClient.onCreateWindow(webView, z10, z11, message);
        }
        webChromeClient.onCreateWindow(webView, z10, z11, message);
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        f2388 = (f2391 + 49) % 128;
        try {
            this.f2392.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
        } catch (Throwable th2) {
            kl.m2899(m2301((char) (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24).intern(), m2301((char) (17343 - View.MeasureSpec.makeMeasureSpec(0, 0)), 484 - (ViewConfiguration.getTapTimeout() >> 16), Color.green(0) + 44).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient != null) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
            return;
        }
        super.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
        int i10 = f2391 + 83;
        f2388 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        try {
            this.f2392.onGeolocationPermissionsHidePrompt();
            f2388 = (f2391 + 31) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2301((char) View.combineMeasuredStates(0, 0), KeyEvent.getMaxKeyCode() >> 16, View.MeasureSpec.makeMeasureSpec(0, 0) + 24).intern(), m2301((char) (64707 - Color.red(0)), 583 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (Process.myPid() >> 22) + 55).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient != null) {
            f2391 = (f2388 + 39) % 128;
            webChromeClient.onGeolocationPermissionsHidePrompt();
            return;
        }
        super.onGeolocationPermissionsHidePrompt();
        int i10 = f2388 + 71;
        f2391 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        f2391 = (f2388 + 29) % 128;
        try {
            this.f2392.onGeolocationPermissionsShowPrompt(str, callback);
            f2388 = (f2391 + 77) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2301((char) TextUtils.indexOf("", "", 0, 0), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), 24 - Color.argb(0, 0, 0, 0)).intern(), m2301((char) (15469 - View.getDefaultSize(0, 0)), 527 - MotionEvent.axisFromString(""), ExpandableListView.getPackedPositionChild(0L) + 56).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            return;
        }
        f2391 = (f2388 + 47) % 128;
        webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
        int i10 = f2391 + 117;
        f2388 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        try {
            this.f2392.onHideCustomView();
            f2388 = (f2391 + 99) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2301((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), ViewConfiguration.getMaximumFlingVelocity() >> 16, 24 - View.resolveSize(0, 0)).intern(), m2301((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 45562), 213 - KeyEvent.normalizeMetaState(0), 36 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient == null) {
            super.onHideCustomView();
            return;
        }
        int i10 = f2391 + 119;
        f2388 = i10 % 128;
        if (i10 % 2 != 0) {
            webChromeClient.onHideCustomView();
        } else {
            webChromeClient.onHideCustomView();
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f2392.onJsAlert(webView, str, str2, jsResult);
        } catch (Throwable th2) {
            kl.m2899(m2301((char) (ImageFormat.getBitsPerPixel(0) + 1), Color.alpha(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25).intern(), m2301((char) Color.alpha(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 355, 30 - TextUtils.indexOf("", "", 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient == null) {
            boolean zOnJsAlert = super.onJsAlert(webView, str, str2, jsResult);
            int i10 = f2388 + 23;
            f2391 = i10 % 128;
            if (i10 % 2 == 0) {
                return zOnJsAlert;
            }
            throw null;
        }
        int i11 = f2388 + 15;
        f2391 = i11 % 128;
        if (i11 % 2 != 0) {
            webChromeClient.onJsAlert(webView, str, str2, jsResult);
            throw null;
        }
        boolean zOnJsAlert2 = webChromeClient.onJsAlert(webView, str, str2, jsResult);
        f2391 = (f2388 + 21) % 128;
        return zOnJsAlert2;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        f2388 = (f2391 + 87) % 128;
        try {
            this.f2392.onJsBeforeUnload(webView, str, str2, jsResult);
        } catch (Throwable th2) {
            kl.m2899(m2301((char) TextUtils.indexOf("", ""), KeyEvent.getDeadChar(0, 0), 24 - View.MeasureSpec.getSize(0)).intern(), m2301((char) (ImageFormat.getBitsPerPixel(0) + 1), 447 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 37).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient == null) {
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        boolean zOnJsBeforeUnload = webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        f2388 = (f2391 + 97) % 128;
        return zOnJsBeforeUnload;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f2392.onJsConfirm(webView, str, str2, jsResult);
        } catch (Throwable th2) {
            kl.m2899(m2301((char) (KeyEvent.getMaxKeyCode() >> 16), ImageFormat.getBitsPerPixel(0) + 1, View.MeasureSpec.getMode(0) + 24).intern(), m2301((char) Color.green(0), ExpandableListView.getPackedPositionGroup(0L) + 384, 33 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient == null) {
            boolean zOnJsConfirm = super.onJsConfirm(webView, str, str2, jsResult);
            f2391 = (f2388 + InterfaceC0435l1.d.b.f29114k) % 128;
            return zOnJsConfirm;
        }
        int i10 = f2388 + 59;
        f2391 = i10 % 128;
        if (i10 % 2 == 0) {
            return webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        }
        webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        f2391 = (f2388 + 47) % 128;
        try {
            try {
                this.f2392.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                webView = webView;
                str = str;
                str2 = str2;
                str3 = str3;
                jsPromptResult = jsPromptResult;
            } catch (Throwable th2) {
                th = th2;
                webView = webView;
                str = str;
                str2 = str2;
                str3 = str3;
                jsPromptResult = jsPromptResult;
                kl.m2899(m2301((char) Color.red(0), View.combineMeasuredStates(0, 0), (Process.myPid() >> 22) + 24).intern(), m2301((char) (56509 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 416 - Color.blue(0), TextUtils.getCapsMode("", 0, 0) + 31).intern(), th, false);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient == null) {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        int i10 = f2391 + 47;
        f2388 = i10 % 128;
        if (i10 % 2 != 0) {
            return webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        f2391 = (f2388 + 49) % 128;
        try {
            this.f2392.onJsTimeout();
        } catch (Throwable th2) {
            kl.m2899(m2301((char) (ViewConfiguration.getEdgeSlop() >> 16), ViewConfiguration.getPressedStateDuration() >> 16, 23 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m2301((char) ExpandableListView.getPackedPositionType(0L), 820 - TextUtils.getCapsMode("", 0, 0), 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient != null) {
            f2391 = (f2388 + 5) % 128;
            return webChromeClient.onJsTimeout();
        }
        boolean zOnJsTimeout = super.onJsTimeout();
        f2391 = (f2388 + 31) % 128;
        return zOnJsTimeout;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        int i10 = f2391 + 27;
        f2388 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2392.onPermissionRequest(permissionRequest);
                throw null;
            }
            this.f2392.onPermissionRequest(permissionRequest);
            f2391 = (f2388 + 69) % 128;
            try {
                WebChromeClient webChromeClient = this.f2393;
                if (webChromeClient == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                int i11 = f2388 + 29;
                f2391 = i11 % 128;
                if (i11 % 2 != 0 && Build.VERSION.SDK_INT < 83) {
                    return;
                }
                webChromeClient.onPermissionRequest(permissionRequest);
            } catch (Throwable th2) {
                kl.m2899(m2301((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", ""), 24 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m2301((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22061), 679 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Color.rgb(0, 0, 0) + 16777259).intern(), th2, false);
            }
        } catch (Throwable th3) {
            kl.m2899(m2301((char) Gravity.getAbsoluteGravity(0, 0), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 24).intern(), m2301((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 638 - (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 41).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        int i10 = f2388 + InterfaceC0435l1.d.b.f29105b;
        f2391 = i10 % 128;
        if (i10 % 2 != 0) {
            try {
                if (Build.VERSION.SDK_INT >= 58) {
                    this.f2392.onPermissionRequestCanceled(permissionRequest);
                }
            } catch (Throwable th2) {
                kl.m2899(m2301((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0), 25 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m2301((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 722, (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 48).intern(), th2, false);
            }
        } else {
            this.f2392.onPermissionRequestCanceled(permissionRequest);
        }
        try {
            WebChromeClient webChromeClient = this.f2393;
            if (webChromeClient == null) {
                super.onPermissionRequestCanceled(permissionRequest);
                return;
            }
            int i11 = f2391 + 71;
            f2388 = i11 % 128;
            if (i11 % 2 == 0) {
                webChromeClient.onPermissionRequestCanceled(permissionRequest);
                throw null;
            }
            webChromeClient.onPermissionRequestCanceled(permissionRequest);
            int i12 = f2388 + 89;
            f2391 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th3) {
            kl.m2899(m2301((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0), 24 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m2301((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), Color.blue(0) + 769, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 50).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        int i11 = f2388 + 39;
        f2391 = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                this.f2392.onProgressChanged(webView, i10);
                throw null;
            }
            this.f2392.onProgressChanged(webView, i10);
            WebChromeClient webChromeClient = this.f2393;
            if (webChromeClient == null) {
                super.onProgressChanged(webView, i10);
                return;
            }
            f2388 = (f2391 + 65) % 128;
            webChromeClient.onProgressChanged(webView, i10);
            int i12 = f2391 + 45;
            f2388 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            kl.m2899(m2301((char) TextUtils.getTrimmedLength(""), ViewConfiguration.getTouchSlop() >> 8, 23 - Process.getGidForName("")).intern(), m2301((char) (AndroidCharacter.getMirror('0') + 289), KeyEvent.normalizeMetaState(0) + 24, 38 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        int i10 = f2388 + 53;
        f2391 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2392.onReceivedIcon(webView, bitmap);
                throw null;
            }
            this.f2392.onReceivedIcon(webView, bitmap);
            WebChromeClient webChromeClient = this.f2393;
            if (webChromeClient != null) {
                f2391 = (f2388 + 79) % 128;
                webChromeClient.onReceivedIcon(webView, bitmap);
                return;
            }
            super.onReceivedIcon(webView, bitmap);
            int i11 = f2391 + 23;
            f2388 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            kl.m2899(m2301((char) KeyEvent.getDeadChar(0, 0), MotionEvent.axisFromString("") + 1, View.resolveSizeAndState(0, 0, 0) + 24).intern(), m2301((char) KeyEvent.normalizeMetaState(0), 98 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 35).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        int i10 = f2388 + 117;
        f2391 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2392.onReceivedTitle(webView, str);
                throw null;
            }
            this.f2392.onReceivedTitle(webView, str);
            WebChromeClient webChromeClient = this.f2393;
            if (webChromeClient == null) {
                super.onReceivedTitle(webView, str);
                return;
            }
            int i11 = f2391 + 77;
            f2388 = i11 % 128;
            if (i11 % 2 != 0) {
                webChromeClient.onReceivedTitle(webView, str);
            } else {
                webChromeClient.onReceivedTitle(webView, str);
                int i12 = 44 / 0;
            }
        } catch (Throwable th2) {
            kl.m2899(m2301((char) KeyEvent.getDeadChar(0, 0), (-1) - TextUtils.indexOf((CharSequence) "", '0'), 24 - Color.green(0)).intern(), m2301((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 62, TextUtils.lastIndexOf("", '0') + 37).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        int i10 = f2391 + 81;
        f2388 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2392.onReceivedTouchIconUrl(webView, str, z10);
                throw null;
            }
            this.f2392.onReceivedTouchIconUrl(webView, str, z10);
            WebChromeClient webChromeClient = this.f2393;
            if (webChromeClient == null) {
                super.onReceivedTouchIconUrl(webView, str, z10);
                return;
            }
            webChromeClient.onReceivedTouchIconUrl(webView, str, z10);
            int i11 = f2388 + 27;
            f2391 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            kl.m2899(m2301((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (Process.getThreadPriority(0) + 20) >> 6, 24 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m2301((char) (ViewConfiguration.getLongPressTimeout() >> 16), 133 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 43).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        int i10 = f2391 + 89;
        f2388 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2392.onRequestFocus(webView);
                throw null;
            }
            this.f2392.onRequestFocus(webView);
            f2391 = (f2388 + 119) % 128;
            WebChromeClient webChromeClient = this.f2393;
            if (webChromeClient == null) {
                super.onRequestFocus(webView);
            } else {
                f2388 = (f2391 + 13) % 128;
                webChromeClient.onRequestFocus(webView);
            }
        } catch (Throwable th2) {
            kl.m2899(m2301((char) Color.blue(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, 24 - View.MeasureSpec.getSize(0)).intern(), m2301((char) ((-1) - TextUtils.lastIndexOf("", '0')), Color.alpha(0) + 285, (Process.myPid() >> 22) + 35).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        f2388 = (f2391 + 57) % 128;
        try {
            this.f2392.onShowCustomView(view, customViewCallback);
        } catch (Throwable th2) {
            kl.m2899(m2301((char) (ViewConfiguration.getScrollBarSize() >> 8), View.getDefaultSize(0, 0), Color.alpha(0) + 24).intern(), m2301((char) ((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 15288), MotionEvent.axisFromString("") + 177, 37 - View.getDefaultSize(0, 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient == null) {
            super.onShowCustomView(view, customViewCallback);
            return;
        }
        webChromeClient.onShowCustomView(view, customViewCallback);
        int i10 = f2388 + 45;
        f2391 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 10 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int i10 = f2391 + 51;
        f2388 = i10 % 128;
        if (i10 % 2 == 0) {
            try {
                if (Build.VERSION.SDK_INT >= 104) {
                    this.f2392.onShowFileChooser(webView, valueCallback, fileChooserParams);
                }
            } catch (Throwable th2) {
                kl.m2899(m2301((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Process.getThreadPriority(0) + 20) >> 6, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24).intern(), m2301((char) (Color.blue(0) + 29662), View.resolveSize(0, 0) + 1017, KeyEvent.normalizeMetaState(0) + 38).intern(), th2, false);
            }
        } else {
            this.f2392.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient != null) {
            f2391 = (f2388 + 9) % 128;
            f2391 = (f2388 + 119) % 128;
            return webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        boolean zOnShowFileChooser = super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        f2391 = (f2388 + 27) % 128;
        return zOnShowFileChooser;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2301(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2390[i10 + i12]) ^ (((long) i12) * f2389)) ^ ((long) c4));
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

    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo821(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        byte b10;
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 1395849045) {
                if (iHashCode == 1442029578 && str.equals(m2301((char) (ExpandableListView.getPackedPositionType(0L) + 1412), TextUtils.lastIndexOf("", '0', 0) + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, 24 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    f2391 = (f2388 + 121) % 128;
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals(m2301((char) (ViewConfiguration.getScrollBarSize() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 1081, 21 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                b10 = 1;
            } else {
                b10 = -1;
            }
            if (b10 != 0) {
                if (b10 == 1) {
                    return m2300();
                }
                new ds(clVar, eeVar, m2301((char) (TextUtils.lastIndexOf("", '0') + 1), KeyEvent.keyCodeFromString(""), AndroidCharacter.getMirror('0') - 24).intern(), str).m2034(clVar.m1643());
                return null;
            }
            WebChromeClient webChromeClientM2302 = m2302();
            int i10 = f2388 + InterfaceC0435l1.d.b.f29112i;
            f2391 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 80 / 0;
            }
            return webChromeClientM2302;
        } catch (Exception e10) {
            String strM1643 = clVar.m1643();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2301((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + ErrorCodes.THROWABLE, (-16777154) - Color.rgb(0, 0, 0)).intern());
            sb2.append(str);
            sb2.append(m2301((char) (12054 - (ViewConfiguration.getEdgeSlop() >> 16)), 1162 - Color.green(0), 1 - Color.red(0)).intern());
            cn.m1708(strM1643, sb2.toString(), e10);
            return null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            this.f2392.onConsoleMessage(consoleMessage);
        } catch (Throwable th2) {
            kl.m2899(m2301((char) KeyEvent.keyCodeFromString(""), Process.getGidForName("") + 1, 24 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m2301((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 852 - View.combineMeasuredStates(0, 0), View.resolveSizeAndState(0, 0, 0) + 37).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient != null) {
            int i10 = f2388 + 7;
            f2391 = i10 % 128;
            if (i10 % 2 == 0) {
                return webChromeClient.onConsoleMessage(consoleMessage);
            }
            webChromeClient.onConsoleMessage(consoleMessage);
            throw null;
        }
        boolean zOnConsoleMessage = super.onConsoleMessage(consoleMessage);
        f2388 = (f2391 + 89) % 128;
        return zOnConsoleMessage;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f2392.onShowCustomView(view, i10, customViewCallback);
        } catch (Throwable th2) {
            kl.m2899(m2301((char) (ViewConfiguration.getTouchSlop() >> 8), View.resolveSize(0, 0), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m2301((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15287), TextUtils.getOffsetBefore("", 0) + 176, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2393;
        if (webChromeClient != null) {
            f2391 = (f2388 + 31) % 128;
            webChromeClient.onShowCustomView(view, i10, customViewCallback);
            return;
        }
        super.onShowCustomView(view, i10, customViewCallback);
        int i11 = f2391 + 33;
        f2388 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }
}
