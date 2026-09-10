package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.http.SslError;
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
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class hr extends WebViewClient implements ba.d, ch {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2364 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2365;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2366;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2367;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private WebViewClient f2368;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WebViewClient f2369;

    static {
        char[] cArr = new char[1092];
        f2.v("\u0000WkWÖ\u0006AÀ¬¡\u0017\u009f\u0083[î\u001dYüÄ«/\u0091\u009bH\u0006,qÎÜÙG\u008d³O\u001e \u0089åôÂ_\u0087Ëh\u008fÕäÐY\u0086Îi#*\u0098J\fÕa Ö K? 0\u0014Ô\u0089\u0084þsS_È\n<Õ\u0091¬\u0006q{TÐXDù¹´.\u0081\u0083Uø\u001elàÁ\u00996\u009e«_\u0000>tìé¹^\u0086³Q(\u0013\u009cêñÆf°Ûa0!¤ö\u0019Í\u008e\u0098ãoXrÍ\u0019!Ì\u0096\u009c\u000b+\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/»\u009bT\u00061qíÜÕG\u0080³c\u001e>\u0089íôÓ_\u0086Ën6l¡\r\fØw\u008dãaN*¹\u001c$å\u008fªûkf2Ñ\u0000<Í§²\u0013m~oé\u001eTò¿\u009c+m\u0096U\u0001\u0002lñ×¤B\u009b®\u0006\u0019\u0015\u0084àï¨Zß\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËi6$¡\u0011\fÅw\u008eãpN\t¹\u000e$Ï\u008f®û|f)Ñ\u0016<Á§\u0083\u0013z~Vé Tñ¿±+f\u0096]\u0001\blÿ×âB\u008e®K\u0019\u0011\u0084çï¡Z\u0085Æ\\1s\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/»\u009bT\u00061qíÜÕG\u0080³c\u001e>\u0089íôÓ_\u0086Ën6l¡\r\fØw\u008dãaN*¹\u001c$å\u008fªûkf2Ñ\u0000<Í§²\u0013m~oé\u001eTò¿\u009c+m\u0096U\u0001\u0002lñ×¤B\u009b®\u0006\u0019\u0012\u0084÷ïµZ\u0083ÆM1)\u009cø\u0007\u0097Up>u\u0083#\u0014Ìù\u008fBïÖp»\u0005\f\u0085\u0091\u009az\u0095ÎqS!$Ö\u0089ú\u0012¯æpK\tÜÔ¡ñ\ný\u009e@c\u0017ô\u001bYä\"°¶D\u001b ì9qþÚ\u009b®O3\u0010\u0084#¸\u0098Ó\u009dnËù$\u0014g¯\u0007;\u0098Víám|r\u0097}#\u0099¾ÉÉ>d\u0012ÿG\u000b\u0098¦á1<L\u0019ç\u0015s¨\u008eÿ\u0019ó´\fÏX[¬öÝ\u0001Ì\u009c\u00197hC ÞõiÊ\u0084\u001d\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËu6\"¡2\fßw\u0083ãpN\u0014¹\u001d$Ù\u008f³û{f2Ñ\u0011<Á@L+I\u0096\u001f\u0001ðì³WÓÃL®9\u0019¹\u0084¦o©ÛMF\u001d1ê\u009cÆ\u0007\u0093óL^5Éè´Í\u001fÁ\u008b`v-á\u0018LÌ7\u0087£y\u000e\u0006ù\u001fd×Ï°»u&*\u0091\u001e|Ýç«SS>V©\u0014\u0014âÿ¼kxÖIÚ\u009c±\u0099\fÏ\u009b vcÍ\u0003Y\u009c4é\u0083i\u001evõyA\u009dÜÍ«:\u0006\u0016\u009dCi\u009cÄåS8.\u001d\u0085\u0011\u0011¬ìû{óÖ\u0006\u00adT9\u0080\u0094þcÏþ\nUW!²¼ý\u000bÂæ\u000f}jÉ²¤\u00973Æ%\u009cN\u0099óÏd \u0089c2\u0003¦\u009cËé|iáv\ny¾\u009d#ÍT:ù\u0016bC\u0096\u009c;å¬8Ñ\u001dz\u0011î¬\u0013û\u0084õ)\fRXÆ¨kö\u009c×\u0001\u0016ªaÞ\u0092CëôÙ\u0019\u0012\u0082}(\u0083C\u0086þÐi?\u0084|?\u001c«\u0083Æöqvìi\u0007f³\u0082.ÒY%ô\to\\\u009b\u00836ú¡'Ü\u0002w\u000eã³\u001eä\u0089þ$\u0019_VË¿fÒ\u0091Û\f\u001f§oÓªNëùÝ\u0014\u0011\u008fc;§V\u0093ÁÄ\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä\u00ad/\u009a\u009b`\u00067qøÜÑG¼³E\u001e!\u0089ñôÔ_\u0085Ës6?¡\r\fÙw\u008dãz\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈË~6#¡+\fÀw\u0086ãuN2¹\u001d$ü\u008fµû}f)Ñ\u0006<Á§²\u0013@~Sé\u001fTê¿¿+p\u0096M\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËu6\"¡,\fÕw\u0081ãqN/¹\u000e$Ï\u008f¸û]f3Ñ\u001e<á§¤\u0013z~Ué\u001e»®Ð«mýú\u0012\u0017Q¬18®UÛâ[\u007fD\u0094K ¯½ÿÊ\bg$üq\b®¥×2\nO/ä#p\u009e\u008dÉ\u001aÇ·>ÌjX\u009aõÄ\u0002å\u009f$4S@¦ÝÇjð\u0087*\u001cS¨\u0097Å\u0092Râï\u0007\u0004O\u0090»-ººü×\u0006lDùd\u0015±8ÙSÜî\u008aye\u0094&/F»ÙÖ¬a,ü=\u0017\t£Ö>¨I\u007fäN\u007f\u0015\u008b\u009c&¡±jÌCg\u0013óï\u000e¾\u0099Â4CO\u0010ÛÚv¿\u0081\u0087\u001cS·)Ãä^¹é\u008a\u0004{\u009f&+ýFÃÑ\u009elv\u0087\u000f\u0013û®Ú9\u008eTVï3z\u0011\u0096Ç!\u0099¼}×,\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËu6\"¡,\fÕw\u0081ãqN/¹\u000e$Ï\u008f¸ûFf4Ñ\u0006<Ô§\u0097\u0013}~Né\u0004TÌ¿µ+s\u0096A\u0001\u0003lë×¾\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËi6$¡\u0011\fÅw\u008eãpN\t¹\u000e$Ï\u008f®û|f)Ñ\u0016<Á§\u009d\u0013m~Cé)Tè¿µ+l\u0096@ \u009fK\u009aöÌa#\u008c`7\u0000£\u009fÎêyjäu\u000fz»\u009e&ÎQ9ü\u0015g@\u0093\u009f>æ©;Ô\u001e\u007f\u0012ë¯\u0016ø\u0081ñ,\u0004WPÃ¯nò\u0099Æ\u0004\u001c¯cÛ°FÑñÍ\u001c\u0007\u0087I3¤^\u0085ÉØt0.PEUø\u0003oì\u0082¯9Ï\u00adPÀ%w¥êº\u0001µµQ(\u0001_öòÚi\u008f\u009dP0)§ôÚÑqÝå`\u00187\u008f8\"ÆY\u0096Ím`6\u0097.\n×¡¨ÕuH2ÿ\u0002\u0012Õ\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËu6\"¡,\fÕw\u0081ãqN/¹\u000e$Ï\u008f¸ûBf/Ñ\u0015<Í§¸\u0013Z~_é\u001dTë¿µ+q\u0096@©\u008cÂ\u0089\u007fßè0\u0005s¾\u0013*\u008cGùðymf\u0086i2\u008d¯ÝØ*u\u0006îS\u001a\u008c·õ (]\rö\u0001b¼\u009fë\bå¥\u001cÞHJ¸çæ\u0010Ç\u008d\u0006&qR\u008fÏýxÏ\u0095\u001d\u000eZº³×\u0081@Êý%\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËu6\"¡,\fÕw\u008cãpN#¹\n$ú\u008f®ûaf#Ñ\u0017<×§¥\u0013O~Ué\u0002Tû\u0000gkWÖ\u0010AÁ¬º\u0017\u009b\u0083\\î.YõÄ¦/£\u009bC\u0006:qÜÜÕG\u008b³W\u001e\u0011\u0089èôß_\u008dËt68\u0000gkWÖ\u0010AÂ¬ª\u0017\u00ad\u0083Iî<YÆÄ«/\u0091\u009bQ\u0006\u001bqæÜÕG\u008b³N\u001e&\u00059n<ÓjD\u0085©Æ\u0012¦\u0086'ëJ\\\u0085ÁÒ*í\u009ez\u0003At\u008eÙ¥Bñ¶)\u001bZ\u008c\u0091ñ¤ZóÎF3g¤g\t®rÈæ\u0001K_¼s!\u0095\u008aÌþ\u001bcYÔ`9¬¢î\u0016\u0011{%ì\u007fQ\u0090ºÍ.\n\u0093'\u0004hiÄÒØGá«&\u001cu\u0081\u0098êÝ_ªÃ94C\u0099\u0084\u0002ªwãÛ:L\b±Ý\u0000'", "ISO-8859-1", cArr, 0, 1092);
        f2367 = cArr;
        f2365 = 8380931267175344946L;
    }

    public hr(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f2368 = webViewClient;
        this.f2369 = webViewClient2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m2289() {
        int i10 = f2364;
        f2366 = (i10 + 69) % 128;
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            return false;
        }
        int i11 = i10 + 85;
        f2366 = i11 % 128;
        int i12 = i11 % 2;
        Class<?> cls = webViewClient.getClass();
        if (i12 == 0) {
            return !cls.equals(WebViewClient.class);
        }
        cls.equals(WebViewClient.class);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Object m2290() {
        int i10 = f2366 + 65;
        f2364 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2369;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WebViewClient m2292() {
        int i10 = f2366 + 51;
        f2364 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2368;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m2294(WebView webView, WebResourceRequest webResourceRequest, boolean z10) {
        try {
            if (this.f2369.shouldOverrideUrlLoading(webView, webResourceRequest) || z10) {
                WebViewClient webViewClient = this.f2368;
                if (webViewClient instanceof hr) {
                    f2366 = (f2364 + 65) % 128;
                    ((hr) webViewClient).m2294(webView, webResourceRequest, true);
                }
                return true;
            }
        } catch (Throwable th2) {
            kl.m2899(m2293((char) TextUtils.getCapsMode("", 0, 0), ViewConfiguration.getKeyRepeatDelay() >> 16, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21).intern(), m2293((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 124 - Drawable.resolveOpacity(0, 0), 54 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), th2, false);
        }
        WebViewClient webViewClient2 = this.f2368;
        if (webViewClient2 != null) {
            int i10 = f2364 + 69;
            f2366 = i10 % 128;
            try {
                if (i10 % 2 == 0) {
                    return webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
                throw null;
            } catch (Throwable th3) {
                kl.m2899(m2293((char) ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0), 22 - TextUtils.indexOf("", "")).intern(), m2293((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), AndroidCharacter.getMirror('0') + 130, 55 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), th3, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        int i10 = f2366 + 23;
        f2364 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2369.doUpdateVisitedHistory(webView, str, z10);
                throw null;
            }
            this.f2369.doUpdateVisitedHistory(webView, str, z10);
            WebViewClient webViewClient = this.f2368;
            if (webViewClient == null) {
                super.doUpdateVisitedHistory(webView, str, z10);
            } else {
                f2364 = (f2366 + 11) % 128;
                webViewClient.doUpdateVisitedHistory(webView, str, z10);
            }
        } catch (Throwable th2) {
            kl.m2899(m2293((char) Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.getMode(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21).intern(), m2293((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 522 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 43 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        f2366 = (f2364 + 49) % 128;
        try {
            this.f2369.onFormResubmission(webView, message, message2);
            f2366 = (f2364 + 117) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2293((char) View.resolveSizeAndState(0, 0, 0), (Process.getThreadPriority(0) + 20) >> 6, 23 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m2293((char) (10439 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 455 - ExpandableListView.getPackedPositionChild(0L), 39 - Color.red(0)).intern(), th2, false);
        }
        try {
            WebViewClient webViewClient = this.f2368;
            if (webViewClient == null) {
                super.onFormResubmission(webView, message, message2);
            } else {
                f2364 = (f2366 + 69) % 128;
                webViewClient.onFormResubmission(webView, message, message2);
            }
        } catch (Error e10) {
            kl.m2899(m2293((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 21 - TextUtils.lastIndexOf("", '0', 0)).intern(), m2293((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 495, 27 - Color.alpha(0)).intern(), e10, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        try {
            this.f2369.onLoadResource(webView, str);
        } catch (Throwable th2) {
            kl.m2899(m2293((char) Color.blue(0), (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Color.blue(0) + 22).intern(), m2293((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 302 - TextUtils.lastIndexOf("", '0', 0), Process.getGidForName("") + 36).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            super.onLoadResource(webView, str);
            f2366 = (f2364 + InterfaceC0435l1.d.b.f29114k) % 128;
            return;
        }
        int i10 = f2366 + InterfaceC0435l1.d.b.f29107d;
        f2364 = i10 % 128;
        if (i10 % 2 != 0) {
            webViewClient.onLoadResource(webView, str);
        } else {
            webViewClient.onLoadResource(webView, str);
            int i11 = 1 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        int i10 = f2364 + 17;
        f2366 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2369.onPageCommitVisible(webView, str);
                int i11 = 45 / 0;
            } else {
                this.f2369.onPageCommitVisible(webView, str);
            }
        } catch (Throwable th2) {
            kl.m2899(m2293((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0), 22 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m2293((char) (21813 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 234 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 34 - Color.argb(0, 0, 0, 0)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            super.onPageCommitVisible(webView, str);
            f2366 = (f2364 + 45) % 128;
            return;
        }
        int i12 = f2366 + 23;
        f2364 = i12 % 128;
        if (i12 % 2 == 0) {
            webViewClient.onPageCommitVisible(webView, str);
            throw null;
        }
        webViewClient.onPageCommitVisible(webView, str);
        f2364 = (f2366 + 29) % 128;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        try {
            this.f2369.onPageFinished(webView, str);
        } catch (Throwable th2) {
            kl.m2899(m2293((char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 22).intern(), m2293((char) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 47325), 268 - Color.red(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 35).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient != null) {
            f2364 = (f2366 + 11) % 128;
            webViewClient.onPageFinished(webView, str);
            return;
        }
        super.onPageFinished(webView, str);
        int i10 = f2366 + 95;
        f2364 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        try {
            this.f2369.onPageStarted(webView, str, bitmap);
            f2364 = (f2366 + 57) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2293((char) View.MeasureSpec.getMode(0), View.resolveSizeAndState(0, 0, 0), AndroidCharacter.getMirror('0') - 26).intern(), m2293((char) (21812 - ((byte) KeyEvent.getModifierMetaStateMask())), (Process.myPid() >> 22) + 234, MotionEvent.axisFromString("") + 35).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            super.onPageStarted(webView, str, bitmap);
            return;
        }
        int i10 = f2366 + 69;
        f2364 = i10 % 128;
        if (i10 % 2 != 0) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            webViewClient.onPageStarted(webView, str, bitmap);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        int i10 = f2364 + 21;
        f2366 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2369.onReceivedClientCertRequest(webView, clientCertRequest);
                throw null;
            }
            this.f2369.onReceivedClientCertRequest(webView, clientCertRequest);
            try {
                WebViewClient webViewClient = this.f2368;
                if (webViewClient != null) {
                    webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
                } else {
                    super.onReceivedClientCertRequest(webView, clientCertRequest);
                    f2364 = (f2366 + 47) % 128;
                }
            } catch (Throwable th2) {
                kl.m2899(m2293((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.alpha(0), AndroidCharacter.getMirror('0') - 26).intern(), m2293((char) (TextUtils.getOffsetAfter("", 0) + 14492), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 652, KeyEvent.keyCodeFromString("") + 51).intern(), th2, false);
            }
        } catch (Throwable th3) {
            kl.m2899(m2293((char) TextUtils.getTrimmedLength(""), AndroidCharacter.getMirror('0') - '0', 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m2293((char) (48107 - (ViewConfiguration.getEdgeSlop() >> 16)), KeyEvent.getDeadChar(0, 0) + IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, TextUtils.indexOf((CharSequence) "", '0', 0) + 49).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        f2366 = (f2364 + 9) % 128;
        try {
            this.f2369.onReceivedError(webView, i10, str, str2);
        } catch (Throwable th2) {
            kl.m2899(m2293((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.green(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22).intern(), m2293((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 9689), 421 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 36).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            super.onReceivedError(webView, i10, str, str2);
            return;
        }
        webViewClient.onReceivedError(webView, i10, str, str2);
        int i11 = f2366 + 91;
        f2364 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        f2364 = (f2366 + 39) % 128;
        try {
            this.f2369.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            f2366 = (f2364 + 35) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2293((char) (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22).intern(), m2293((char) TextUtils.getTrimmedLength(""), 702 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 46 - View.resolveSizeAndState(0, 0, 0)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            f2366 = (f2364 + 119) % 128;
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f2369.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } catch (Throwable th2) {
            kl.m2899(m2293((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", ""), Color.rgb(0, 0, 0) + 16777238).intern(), m2293((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43465), 910 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0') + 41).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            return;
        }
        f2366 = (f2364 + 19) % 128;
        webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        f2366 = (f2364 + 51) % 128;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        f2366 = (f2364 + InterfaceC0435l1.d.b.f29109f) % 128;
        try {
            this.f2369.onReceivedLoginRequest(webView, str, str2, str3);
        } catch (Throwable th2) {
            kl.m2899(m2293((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0), 22 - Color.blue(0)).intern(), m2293((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 867 - TextUtils.getCapsMode("", 0, 0), Gravity.getAbsoluteGravity(0, 0) + 43).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
            return;
        }
        f2364 = (f2366 + 59) % 128;
        webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        int i10 = f2366 + 17;
        f2364 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 65 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i10 = f2366 + 9;
        f2364 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2369.onReceivedSslError(webView, sslErrorHandler, sslError);
                throw null;
            }
            this.f2369.onReceivedSslError(webView, sslErrorHandler, sslError);
            WebViewClient webViewClient = this.f2368;
            if (webViewClient == null) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            }
            int i11 = f2364 + 119;
            f2366 = i11 % 128;
            if (i11 % 2 == 0) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
                int i12 = 15 / 0;
            }
        } catch (Throwable th2) {
            kl.m2899(m2293((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-16777216) - Color.rgb(0, 0, 0), View.MeasureSpec.getMode(0) + 22).intern(), m2293((char) (KeyEvent.getMaxKeyCode() >> 16), 565 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-16777177) - Color.rgb(0, 0, 0)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        f2364 = (f2366 + 37) % 128;
        try {
            this.f2369.onRenderProcessGone(webView, renderProcessGoneDetail);
        } catch (Throwable th2) {
            kl.m2899(m2293((char) (Process.myTid() >> 22), (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 23).intern(), m2293((char) View.resolveSizeAndState(0, 0, 0), 998 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getWindowTouchSlop() >> 8) + 40).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            return true;
        }
        f2364 = (f2366 + 89) % 128;
        return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f10, float f11) {
        int i10 = f2364 + 99;
        f2366 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2369.onScaleChanged(webView, f10, f11);
                int i11 = 86 / 0;
            } else {
                this.f2369.onScaleChanged(webView, f10, f11);
            }
        } catch (Throwable th2) {
            kl.m2899(m2293((char) View.resolveSize(0, 0), ViewConfiguration.getMaximumFlingVelocity() >> 16, ExpandableListView.getPackedPositionGroup(0L) + 22).intern(), m2293((char) (11797 - View.getDefaultSize(0, 0)), 832 - (KeyEvent.getMaxKeyCode() >> 16), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 35).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            super.onScaleChanged(webView, f10, f11);
            return;
        }
        f2364 = (f2366 + InterfaceC0435l1.d.b.f29109f) % 128;
        webViewClient.onScaleChanged(webView, f10, f11);
        f2364 = (f2366 + 107) % 128;
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        int i10 = f2364 + 65;
        f2366 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2369.onTooManyRedirects(webView, message, message2);
                int i11 = 59 / 0;
            } else {
                this.f2369.onTooManyRedirects(webView, message, message2);
            }
        } catch (Throwable th2) {
            kl.m2899(m2293((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 22 - ExpandableListView.getPackedPositionGroup(0L)).intern(), m2293((char) (TextUtils.getCapsMode("", 0, 0) + 56025), TextUtils.lastIndexOf("", '0', 0) + 382, ExpandableListView.getPackedPositionChild(0L) + 40).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            super.onTooManyRedirects(webView, message, message2);
            return;
        }
        int i12 = f2366 + 37;
        f2364 = i12 % 128;
        if (i12 % 2 != 0) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            webViewClient.onTooManyRedirects(webView, message, message2);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        f2366 = (f2364 + 91) % 128;
        try {
            this.f2369.onUnhandledKeyEvent(webView, keyEvent);
        } catch (Throwable th2) {
            kl.m2899(m2293((char) View.MeasureSpec.getSize(0), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, ImageFormat.getBitsPerPixel(0) + 23).intern(), m2293((char) (8410 - TextUtils.getOffsetAfter("", 0)), 792 - TextUtils.indexOf("", "", 0, 0), 40 - KeyEvent.getDeadChar(0, 0)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            super.onUnhandledKeyEvent(webView, keyEvent);
            return;
        }
        int i10 = f2364 + 123;
        f2366 = i10 % 128;
        if (i10 % 2 == 0) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            this.f2369.shouldInterceptRequest(webView, str);
        } catch (Throwable th2) {
            kl.m2899(m2293((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21).intern(), m2293((char) (Drawable.resolveOpacity(0, 0) + 16393), 339 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 43).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient != null) {
            f2364 = (f2366 + 69) % 128;
            WebResourceResponse webResourceResponseShouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, str);
            f2366 = (f2364 + 27) % 128;
            return webResourceResponseShouldInterceptRequest;
        }
        WebResourceResponse webResourceResponseShouldInterceptRequest2 = super.shouldInterceptRequest(webView, str);
        int i10 = f2366 + 27;
        f2364 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 20 / 0;
        }
        return webResourceResponseShouldInterceptRequest2;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i10 = f2364 + 59;
        f2366 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2369.shouldOverrideKeyEvent(webView, keyEvent);
                int i11 = 30 / 0;
            } else {
                this.f2369.shouldOverrideKeyEvent(webView, keyEvent);
            }
        } catch (Throwable th2) {
            kl.m2899(m2293((char) (ViewConfiguration.getFadingEdgeLength() >> 16), ViewConfiguration.getDoubleTapTimeout() >> 16, 21 - Process.getGidForName("")).intern(), m2293((char) View.getDefaultSize(0, 0), 749 - Color.argb(0, 0, 0, 0), 43 - View.resolveSizeAndState(0, 0, 0)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        int i12 = f2366 + 61;
        f2364 = i12 % 128;
        if (i12 % 2 != 0) {
            return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        }
        webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i10 = f2366 + 29;
        f2364 = i10 % 128;
        return m2291(webView, str, i10 % 2 == 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo821(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        Exception exc;
        int i10 = f2366 + 17;
        f2364 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            try {
                int iHashCode = str.hashCode();
                byte b10 = -1;
                if (iHashCode != 368095040) {
                    if (iHashCode == 381550901) {
                        try {
                            if (str.equals(m2293((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 989 - ImageFormat.getBitsPerPixel(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24).intern())) {
                                b10 = 0;
                            }
                        } catch (Exception e10) {
                            exc = e10;
                            String strM1643 = clVar.m1643();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m2293((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1403), 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 60).intern());
                            sb2.append(str);
                            sb2.append(m2293((char) (ViewConfiguration.getTapTimeout() >> 16), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1091, 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
                            cn.m1708(strM1643, sb2.toString(), exc);
                        }
                    }
                } else if (str.equals(m2293((char) TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + Z3.f28073j, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18).intern())) {
                    f2366 = (f2364 + 43) % 128;
                    b10 = 1;
                }
                if (b10 == 0) {
                    return m2292();
                }
                if (b10 == 1) {
                    return m2290();
                }
                new ds(clVar, eeVar, m2293((char) TextUtils.getOffsetAfter("", 0), ViewConfiguration.getScrollBarSize() >> 8, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21).intern(), str).m2034(clVar.m1643());
                return null;
            } catch (Exception e11) {
                e = e11;
                exc = e;
            }
            String strM1644 = clVar.m1643();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2293((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1403), 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 60).intern());
            sb3.append(str);
            sb3.append(m2293((char) (ViewConfiguration.getTapTimeout() >> 16), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1091, 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
            cn.m1708(strM1644, sb3.toString(), exc);
            return null;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r11 != false) goto L12;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m2291(android.webkit.WebView r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hr.m2291(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2293(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2367[i10 + i12]) ^ (((long) i12) * f2365)) ^ ((long) c4));
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

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        int i10 = f2364 + 53;
        f2366 = i10 % 128;
        boolean zM2294 = m2294(webView, webResourceRequest, i10 % 2 != 0);
        int i11 = f2364 + 89;
        f2366 = i11 % 128;
        if (i11 % 2 == 0) {
            return zM2294;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i10 = f2364 + 87;
        f2366 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2369.onReceivedError(webView, webResourceRequest, webResourceError);
                int i11 = 4 / 0;
            } else {
                this.f2369.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        } catch (Throwable th2) {
            kl.m2899(m2293((char) ('0' - AndroidCharacter.getMirror('0')), ExpandableListView.getPackedPositionGroup(0L), KeyEvent.keyCodeFromString("") + 22).intern(), m2293((char) (9689 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 420, 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient != null) {
            int i12 = f2366 + 19;
            f2364 = i12 % 128;
            if (i12 % 2 != 0) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
            } else {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
                int i13 = 36 / 0;
                return;
            }
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int i10 = f2366 + 75;
        f2364 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2369.shouldInterceptRequest(webView, webResourceRequest);
                int i11 = 24 / 0;
            } else {
                this.f2369.shouldInterceptRequest(webView, webResourceRequest);
            }
        } catch (Throwable th2) {
            kl.m2899(m2293((char) ExpandableListView.getPackedPositionGroup(0L), Drawable.resolveOpacity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 22).intern(), m2293((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16392), 338 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 43 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2368;
        if (webViewClient == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        f2364 = (f2366 + 75) % 128;
        WebResourceResponse webResourceResponseShouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        f2364 = (f2366 + 69) % 128;
        return webResourceResponseShouldInterceptRequest;
    }
}
