package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class hh extends WebViewClient implements bb.e, ck {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2217 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2218;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2219;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2220;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WebViewClient f2221;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WebViewClient f2222;

    static {
        char[] cArr = new char[IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID];
        ByteBuffer.wrap("\u0000Wd\\È\u0010,ý\u0090\u008dõxY!½Ì!¤\u0086hê_N\u001d²Ø\u0016¡{{ß4Cÿ§»\fcpOÔ\u001b8ß\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lênN\u0011²à\u0016\u008c{mß#Cõ§§\fgpIÔT8Þ\u009c\u008e\u0001pe-Éý-®\u0092LöJZ\u0010¾Ü\"\u0095\u0087Ië=O÷³\u009e\u0018v|Qà:DÀ¨\u0089\rEq3Õý9«\u009e-\u0002Kf\u0005ÊÜ.À\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lêuN\u0001²Å\u0016\u0082{wß9CÓ§¥\fkp^Ô\u001a8Ù\u009cÆ\u0001le0Éþ-¿\u0092oöXZ:¾Ø\"\u0082\u0087Rë+Oû³¯\u0018a|hà\u0004DÃ¨¤\rNq;Õ÷9¥\u009ek\u0002Yf_ÊÅ.\u009b\u0093N÷r.©J§æì\u0002(¾zÛÑwÓ\u0093\r\u000f\u0004¨\u0080Ä\u0082`ý\u009c\f8`U\u0081ñÏm\u0019\u0089K\"\u008b^¥ú¸\u00162²b/\u009cKÁç\u0011\u0003B¼ Ø¦tü\u00900\fy©¥ÅÑa\u001b\u009dr6\u009aR½ÎÖj,\u0086e#©_ßû\u0011\u0017G°Á, Hþä-\u0000p½«ÙÄu\f\u0091\b\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lêuN\u0001²Å\u0016\u0082{wß9CÓ§¥\fkp^Ô\u001a8Ù\u009cÆ\u0001le0Éþ-¿\u0092oöXZ:¾Ø\"\u0082\u0087Rë+Oû³¯\u0018a|hà\u0004DÃ¨¤\rNq;Õ÷9¥\u009ek\u0002Yf_ÊÂ.\u008c\u0093S÷.[ñ¿¾$r\u0088\u0016H\u0082,\u008c\u0080Çd\u0003ØQ½ú\u0011øõ&i/Î«¢©\u0006Öú'^K3ª\u0097ä\u000b2ï`D 8\u008e\u009c\u0093p\u0005ÔOI\u0088-þ\u00811ehÚ\u0097¾\u008f\u0012Óö\u001bjTÏ\u0082£ú\u0097\u001aó\u0014__»\u009b\u0007ÉbbÎ`*¾¶·\u00113}1ÙN%¿\u0081Óì2H|Ôª0ø\u009b8ç\u0016C\u000b¯\u009d\u000b×\u0096\u0010òf^©ºð\u0005\u001aa\nÍD)\u0098µË\u0010\u0017|cØ©\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lênN\u0011²à\u0016\u008c{mß#Cõ§§\fgpIÔT8Â\u009c\u0088\u0001Se7Éð-®\u0092QöYZ\u0006¾Á\"\u0092\u0087Rë:O÷\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lênN\u0011²à\u0016\u008c{mß#Cõ§§\fgpIÔT8Þ\u009c\u008e\u0001pe-Éý-®\u0092JöRZ\u0001¾Ë\"\u0095\u0087Cë<Oâ³¿\u0018V|Xà\u0007DÚ¨\u008d\rRq.A\u0012%\u001c\u0089Wm\u0093ÑÁ´j\u0018hü¶`¿Ç;«9\u000fFó·WÛ::\u009et\u0002¢æðM01\u001e\u0095\u0003y\u0095Ýß@\u001c$`\u0088©lÐÓ5·\u0005\u001b[ÿ«cÕÆ\u0013ªg\u000e·òùY0=\u001e¡Rl¸\b¶¤ý@9ük\u0099À5ÂÑ\u001cM\u0015ê\u0091\u0086\u0093\"ìÞ\u001dzq\u0017\u0090³Þ/\bËZ`\u009a\u001c´¸©T?ðum°\tÀ¥\u000fARþ\u0097\u009a·6íÒ7N_ë¯\u0087Ö#\u0000ßDO¼+²\u0087ùc=ßoºÄ\u0016Æò\u0018n\u0011É\u0095¥\u0097\u0001èý\u0019Yu4\u0094\u0090Ú\f\fè^C\u009e?°\u009b\u00adw;ÓqN *Î\u0086\u001ab^Ý¨¹ \u0015ÿñ\"m|È´¤É\u0000\u0018üAW\u00943«¯á\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086nêTN5²Ã\u0016\u0097{sß\u0005Cõ§º\fwpYÔ\u00198Ä\u009c\u0095\u0001le1Éþ-¤N\"*,\u0086gb£Þñ»Z\u0017Xó\u0086o\u008fÈ\u000b¤\t\u0000vü\u0087Xë5\n\u0091D\r\u0092éÀB\u0000>.\u009a3v®ÒîO-+O\u0087\u0092cÌÜ\u0010¸>\u0014Dð lóÉ.¥J\u0001\u0090ýÈV+23®b\n¼æàC4?D\u000fÁkÏÇ\u0084#@\u009f\u0012ú¹V»²e.l\u0089èåêA\u0095½d\u0019\btéÐ§Lq¨#\u0003ã\u007fÍÛÐ7F\u0093\f\u000eÉj¹Æv\"+\u009dîùÎU\u0094±N-0\u0088×ä±@S¼=\u0017òsÖï\u00800§T©øâ\u001c& tÅßiÝ\u008d\u0003\u0011\n¶\u008eÚ\u008c~ó\u0082\u0002&nK\u008fïÁs\u0017\u0097E<\u0085@«ä¶\b ¬j1¯Ußù\u0010\u001dM¢\u0088Æ¨jò\u008e(\u0012F·®ÛÒ\u007f\u0015\u0083G(\u0092L\u009cÐñt?\u0098~=\u0091AÝå\u0000\t[®\u00822¯Vá|\u008a\u0018\u0084´ÏP\u000bìY\u0089ò%ðÁ.]'ú\u00ad\u0096\u00942ÐÎ\u000fjC\u0007¿£ÿ?\u007fÛip¿\f\u009d¨ÜD\u000bàG}ð\u0019øµ0QWî©\u008a\u0090&ßÂ\b^^û\u008a\u0097ò3\u001eÏhd¢\u0000\u0097\u009c×8\u0014Ôdq\u008b\rç©(EQâ¯~\u0080\u001aÍ¶\u001aRUï\u0099)²M¼á÷\u00053¹aÜÊpÈ\u0094\u0016\b\u001f¯\u009bÃ\u0099gæ\u009b\u0017?{R\u009aöÔj\u0002\u008eP%\u0090Y¾ý£\u00115µ\u007f(ºLÊà\u0005\u0004X»\u009dß½sç\u0097=\u000bX®£ÂÚf\u0015\u009a}1\u0086U¾Éém\n\u0081z$§XØü\u0001\u0010H·\u0086õã\u0091í=¦Ùbe0\u0000\u009b¬\u0099HGÔNsÊ\u001fÈ»·GFã*\u008eË*\u0085¶SR\u0001ùÁ\u0085ï!òÍxi(ôÖ\u0090\u008b<[Ø\bgê\u0003ì¯¶Kz×3rï\u001e\u009bºQF&íÇ\u0089â\u0015\u0095±\u007f]+øé\u0084\u0088ÇU£[\u000f\u0010ëÔW\u00862-\u009e/zñæøA|-~\u0089\u0001uðÑ\u009c¼}\u00183\u0084å`·Ëw·Y\u0013DÿÒ[\u0098ÆZ¢&\u000eéê»U}1H\u009d\tyÛå\u0093@{,,\u0088ût\u009eßb»H'\b\u0083Ë\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lênN\u0011²à\u0016\u008c{mß#Cõ§§\fgpIÔT8Â\u009c\u0088\u0001Le;Éð-¦\u0092fö\u007fZ\u001d¾Ï\"\u0089\u0087Gë<Oö\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lênN\u0011²à\u0016\u008c{mß#Cõ§§\fgpIÔT8Â\u009c\u0088\u0001Me=Éò-¯\u0092jöJZ\u0010¾Ê\"«\u0087Oë>Oû³¥\u0018V|Xà\u0007DÚ¨\u008d\rRq.6©R§þì\u001a(¦zÃÑoÓ\u008b\r\u0017\u0004°\u0080Ü\u0082xý\u0084\f `M\u0081éÏu\u0019\u0091K:\u008bF¥â¸\u000e.ªd7¡SÑÿ\u001e\u001bC¤\u0086À¦lü\u0088&\u0014C±¸ÝÁy\u000e\u0085b.\u009aJ£Öõr1ûc\u009fm3&×âk°\u000e\u001b¢\u0019FÇÚÎ}J\u0011Hµ7IÆíª\u0080K$\u0005¸Ó\\\u0081÷A\u008bo/rÃäg®úk\u009e\u001b2ÙÖ\u0088i@\rh¡\u0003EúÙ®|e\u0010\u001a´ÇH\u009eãe\u0087t\u001b>¿ì¿¿Û\u0084wÞ\u0093$/NJ¤æþ\u0002'\u009eu9½UµñÎ\r\u0016©kÄ¯`êü?\u0018R³¶Ï\u008akÉ\u0087\u001b#J\u0000gd\\È\u0006,ÿ\u0090\u0086õJY3½í!\u009e\u0086hê_N\u0004²ï\u0016\u0089{wß2Cþ§½".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID);
        f2220 = cArr;
        f2219 = -3310082484054891463L;
    }

    public hh(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f2221 = webViewClient;
        this.f2222 = webViewClient2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m2187() {
        int i2 = f2217 + 21;
        f2218 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient != null && !webViewClient.getClass().equals(WebViewClient.class)) {
            int i3 = f2218 + 5;
            f2217 = i3 % 128;
            return !(i3 % 2 == 0);
        }
        int i4 = f2218 + 43;
        f2217 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WebViewClient m2189() {
        int i2 = (f2217 + 41) % 128;
        f2218 = i2;
        WebViewClient webViewClient = this.f2221;
        int i3 = i2 + 101;
        f2217 = i3 % 128;
        if (i3 % 2 != 0) {
            return webViewClient;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Object m2191() {
        int i2 = f2217;
        WebViewClient webViewClient = this.f2222;
        f2218 = (i2 + 69) % 128;
        return webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        int i2 = f2218 + 3;
        f2217 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2222.doUpdateVisitedHistory(webView, str, z2);
                throw null;
            }
            this.f2222.doUpdateVisitedHistory(webView, str, z2);
            WebViewClient webViewClient = this.f2221;
            if (webViewClient != null) {
                f2218 = (f2217 + 85) % 128;
                webViewClient.doUpdateVisitedHistory(webView, str, z2);
            } else {
                super.doUpdateVisitedHistory(webView, str, z2);
                f2217 = (f2218 + 41) % 128;
            }
        } catch (Throwable th) {
            kb.m2752(m2186(22 - View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.keyCodeFromString(""), (char) (AndroidCharacter.getMirror('0') - '0')).intern(), m2186(ExpandableListView.getPackedPositionGroup(0L) + 43, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 522, (char) (TextUtils.lastIndexOf("", '0') + 20072)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        int i2 = f2217 + 87;
        f2218 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2222.onFormResubmission(webView, message, message2);
                throw null;
            }
            this.f2222.onFormResubmission(webView, message, message2);
            try {
                WebViewClient webViewClient = this.f2221;
                if (webViewClient == null) {
                    super.onFormResubmission(webView, message, message2);
                } else {
                    f2218 = (f2217 + 107) % 128;
                    webViewClient.onFormResubmission(webView, message, message2);
                }
            } catch (Error e2) {
                kb.m2752(m2186((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern(), m2186(27 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.red(0) + 495, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), (Throwable) e2, false);
            }
        } catch (Throwable th) {
            kb.m2752(m2186(KeyEvent.normalizeMetaState(0) + 22, TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) (ExpandableListView.getPackedPositionChild(0L) + 1)).intern(), m2186((ViewConfiguration.getWindowTouchSlop() >> 8) + 39, TextUtils.indexOf("", "") + 456, (char) (ExpandableListView.getPackedPositionGroup(0L) + 20473)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        f2218 = (f2217 + 9) % 128;
        try {
            this.f2222.onLoadResource(webView, str);
        } catch (Throwable th) {
            kb.m2752(m2186(21 - MotionEvent.axisFromString(""), View.combineMeasuredStates(0, 0), (char) TextUtils.getTrimmedLength("")).intern(), m2186(34 - MotionEvent.axisFromString(""), 303 - (ViewConfiguration.getTapTimeout() >> 16), (char) View.resolveSizeAndState(0, 0, 0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient != null) {
            f2218 = (f2217 + 87) % 128;
            webViewClient.onLoadResource(webView, str);
            return;
        }
        super.onLoadResource(webView, str);
        int i2 = f2218 + 85;
        f2217 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        int i2 = f2217 + 71;
        f2218 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2222.onPageCommitVisible(webView, str);
                throw null;
            }
            this.f2222.onPageCommitVisible(webView, str);
            WebViewClient webViewClient = this.f2221;
            if (webViewClient == null) {
                super.onPageCommitVisible(webView, str);
                return;
            }
            int i3 = f2217 + 71;
            f2218 = i3 % 128;
            if (i3 % 2 == 0) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                webViewClient.onPageCommitVisible(webView, str);
                throw null;
            }
        } catch (Throwable th) {
            kb.m2752(m2186((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern(), m2186(TextUtils.lastIndexOf("", '0', 0, 0) + 35, 234 - TextUtils.indexOf("", "", 0), (char) (Color.blue(0) + 18631)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int i2 = f2218 + 63;
        f2217 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2222.onPageFinished(webView, str);
                throw null;
            }
            this.f2222.onPageFinished(webView, str);
            WebViewClient webViewClient = this.f2221;
            if (webViewClient == null) {
                super.onPageFinished(webView, str);
            } else {
                f2218 = (f2217 + 5) % 128;
                webViewClient.onPageFinished(webView, str);
            }
        } catch (Throwable th) {
            kb.m2752(m2186(22 - TextUtils.getCapsMode("", 0, 0), (-1) - TextUtils.lastIndexOf("", '0'), (char) Color.blue(0)).intern(), m2186(35 - View.MeasureSpec.getSize(0), 268 - (Process.myTid() >> 22), (char) (38751 - TextUtils.getCapsMode("", 0, 0))).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        int i2 = f2218 + 117;
        f2217 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2222.onPageStarted(webView, str, bitmap);
                throw null;
            }
            this.f2222.onPageStarted(webView, str, bitmap);
            WebViewClient webViewClient = this.f2221;
            if (webViewClient == null) {
                super.onPageStarted(webView, str, bitmap);
                return;
            }
            int i3 = f2218 + 113;
            f2217 = i3 % 128;
            if (i3 % 2 != 0) {
                webViewClient.onPageStarted(webView, str, bitmap);
            } else {
                webViewClient.onPageStarted(webView, str, bitmap);
                int i4 = 40 / 0;
            }
        } catch (Throwable th) {
            kb.m2752(m2186(Process.getGidForName("") + 23, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern(), m2186(34 - (ViewConfiguration.getFadingEdgeLength() >> 16), 235 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (18631 - Color.blue(0))).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        int i2 = f2217 + 67;
        f2218 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2222.onReceivedClientCertRequest(webView, clientCertRequest);
                throw null;
            }
            this.f2222.onReceivedClientCertRequest(webView, clientCertRequest);
            try {
                WebViewClient webViewClient = this.f2221;
                if (webViewClient != null) {
                    webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
                } else {
                    super.onReceivedClientCertRequest(webView, clientCertRequest);
                    f2217 = (f2218 + 75) % 128;
                }
            } catch (Throwable th) {
                kb.m2752(m2186(21 - Process.getGidForName(""), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m2186((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50, TextUtils.getOffsetBefore("", 0) + 652, (char) (Gravity.getAbsoluteGravity(0, 0) + 31951)).intern(), th, false);
            }
        } catch (Throwable th2) {
            kb.m2752(m2186(MotionEvent.axisFromString("") + 23, (-1) - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.indexOf("", "", 0, 0)).intern(), m2186((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49, Process.getGidForName("") + IronSourceError.ERROR_BN_LOAD_EXCEPTION, (char) (12514 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        int i3 = f2217 + 9;
        f2218 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.f2222.onReceivedError(webView, i2, str, str2);
                throw null;
            }
            this.f2222.onReceivedError(webView, i2, str, str2);
            WebViewClient webViewClient = this.f2221;
            if (webViewClient == null) {
                super.onReceivedError(webView, i2, str, str2);
                return;
            }
            int i4 = f2218 + 1;
            f2217 = i4 % 128;
            if (i4 % 2 == 0) {
                webViewClient.onReceivedError(webView, i2, str, str2);
                int i5 = 38 / 0;
            } else {
                webViewClient.onReceivedError(webView, i2, str, str2);
            }
            int i6 = f2217 + 79;
            f2218 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 27 / 0;
            }
        } catch (Throwable th) {
            kb.m2752(m2186(22 - View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), m2186(36 - (ViewConfiguration.getWindowTouchSlop() >> 8), 420 - ExpandableListView.getPackedPositionGroup(0L), (char) (27901 - Color.argb(0, 0, 0, 0))).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        int i2 = f2217 + 75;
        f2218 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2222.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                throw null;
            }
            this.f2222.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            WebViewClient webViewClient = this.f2221;
            if (webViewClient == null) {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                return;
            }
            int i3 = f2217 + 119;
            f2218 = i3 % 128;
            if (i3 % 2 == 0) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                throw null;
            }
        } catch (Throwable th) {
            kb.m2752(m2186(23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), m2186((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46, 703 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 10743)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f2222.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            f2218 = (f2217 + 81) % 128;
        } catch (Throwable th) {
            kb.m2752(m2186(23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (ImageFormat.getBitsPerPixel(0) + 1)).intern(), m2186(ImageFormat.getBitsPerPixel(0) + 41, (ViewConfiguration.getFadingEdgeLength() >> 16) + 910, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 14060)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient == null) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            int i2 = f2217 + 123;
            f2218 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i3 = f2218 + 73;
        f2217 = i3 % 128;
        if (i3 % 2 != 0) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        f2217 = (f2218 + 79) % 128;
        try {
            this.f2222.onReceivedLoginRequest(webView, str, str2, str3);
        } catch (Throwable th) {
            kb.m2752(m2186((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), m2186(43 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 867, (char) View.resolveSize(0, 0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient == null) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            f2218 = (f2217 + 25) % 128;
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i2 = f2217 + 105;
        f2218 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2222.onReceivedSslError(webView, sslErrorHandler, sslError);
                int i3 = 15 / 0;
            } else {
                this.f2222.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        } catch (Throwable th) {
            kb.m2752(m2186(21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-1) - ImageFormat.getBitsPerPixel(0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), m2186(39 - View.getDefaultSize(0, 0), 565 - KeyEvent.keyCodeFromString(""), (char) (AndroidCharacter.getMirror('0') + 3924)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient == null) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            return;
        }
        int i4 = f2218 + 123;
        f2217 = i4 % 128;
        if (i4 % 2 != 0) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        f2218 = (f2217 + 53) % 128;
        try {
            this.f2222.onRenderProcessGone(webView, renderProcessGoneDetail);
            f2218 = (f2217 + 71) % 128;
        } catch (Throwable th) {
            kb.m2752(m2186(Color.blue(0) + 22, ExpandableListView.getPackedPositionType(0L), (char) Color.blue(0)).intern(), m2186(40 - View.MeasureSpec.makeMeasureSpec(0, 0), 950 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 64295)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient == null) {
            return true;
        }
        f2217 = (f2218 + 35) % 128;
        return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        int i2 = f2218 + 47;
        f2217 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2222.onScaleChanged(webView, f, f2);
                int i3 = 43 / 0;
            } else {
                this.f2222.onScaleChanged(webView, f, f2);
            }
        } catch (Throwable th) {
            kb.m2752(m2186(23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), m2186(35 - (ViewConfiguration.getPressedStateDuration() >> 16), 832 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient == null) {
            super.onScaleChanged(webView, f, f2);
        } else {
            f2218 = (f2217 + 3) % 128;
            webViewClient.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        f2217 = (f2218 + 63) % 128;
        try {
            this.f2222.onTooManyRedirects(webView, message, message2);
        } catch (Throwable th) {
            kb.m2752(m2186(22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) Gravity.getAbsoluteGravity(0, 0)).intern(), m2186((KeyEvent.getMaxKeyCode() >> 16) + 39, 381 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (16727 - View.resolveSize(0, 0))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
            f2218 = (f2217 + 39) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i2 = f2218 + 105;
        f2217 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2222.onUnhandledKeyEvent(webView, keyEvent);
                throw null;
            }
            this.f2222.onUnhandledKeyEvent(webView, keyEvent);
            WebViewClient webViewClient = this.f2221;
            if (webViewClient == null) {
                super.onUnhandledKeyEvent(webView, keyEvent);
                return;
            }
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            int i3 = f2217 + 107;
            f2218 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 35 / 0;
            }
        } catch (Throwable th) {
            kb.m2752(m2186(Color.red(0) + 22, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0)).intern(), m2186(40 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 792 - TextUtils.indexOf("", "", 0, 0), (char) (Color.rgb(0, 0, 0) + 16828176)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        int i2 = f2217 + 95;
        f2218 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2222.shouldInterceptRequest(webView, str);
                int i3 = 97 / 0;
            } else {
                this.f2222.shouldInterceptRequest(webView, str);
            }
            f2218 = (f2217 + 49) % 128;
        } catch (Throwable th) {
            kb.m2752(m2186(ExpandableListView.getPackedPositionGroup(0L) + 22, ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) Color.alpha(0)).intern(), m2186(43 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 338 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) Color.green(0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        f2218 = (f2217 + 85) % 128;
        return webViewClient.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f2222.shouldOverrideKeyEvent(webView, keyEvent);
            f2218 = (f2217 + 53) % 128;
        } catch (Throwable th) {
            kb.m2752(m2186((ViewConfiguration.getPressedStateDuration() >> 16) + 22, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (TextUtils.lastIndexOf("", '0') + 1)).intern(), m2186(43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 750 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (62886 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient == null) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        f2217 = (f2218 + 31) % 128;
        return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f2217 = (f2218 + 3) % 128;
        boolean zM2188 = m2188(webView, str, false);
        f2217 = (f2218 + 5) % 128;
        return zM2188;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0071  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
    /* JADX INFO: renamed from: ﾇ */
    public final Object mo792(String str, List<Object> list, ch chVar) {
        int iHashCode = str.hashCode();
        byte b2 = 0;
        if (iHashCode != 368095040) {
            if (iHashCode == 381550901 && str.equals(m2186(23 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 990, (char) (49112 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern())) {
                f2217 = (f2218 + 75) % 128;
            } else {
                b2 = -1;
            }
        } else if (str.equals(m2186((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, ((byte) KeyEvent.getModifierMetaStateMask()) + 1014, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
            f2218 = (f2217 + 93) % 128;
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return m2189();
        }
        if (b2 != 1) {
            return null;
        }
        return m2191();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m2188(WebView webView, String str, boolean z2) {
        try {
            if (this.f2222.shouldOverrideUrlLoading(webView, str) || z2) {
                WebViewClient webViewClient = this.f2221;
                if (webViewClient instanceof hh) {
                    f2217 = (f2218 + 121) % 128;
                    ((hh) webViewClient).m2188(webView, str, true);
                }
                return true;
            }
        } catch (Throwable th) {
            kb.m2752(m2186((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) View.MeasureSpec.getSize(0)).intern(), m2186((ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        if (m2187()) {
            int i2 = f2218 + 115;
            f2217 = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    return this.f2221.shouldOverrideUrlLoading(webView, str);
                }
                this.f2221.shouldOverrideUrlLoading(webView, str);
                throw null;
            } catch (Throwable th2) {
                kb.m2752(m2186((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, View.getDefaultSize(0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m2186((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 72, (char) KeyEvent.keyCodeFromString("")).intern(), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r11 != false) goto L12;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m2190(android.webkit.WebView r9, android.webkit.WebResourceRequest r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.hh.m2190(android.webkit.WebView, android.webkit.WebResourceRequest, boolean):boolean");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        f2218 = (f2217 + 35) % 128;
        boolean zM2190 = m2190(webView, webResourceRequest, false);
        int i2 = f2217 + 37;
        f2218 = i2 % 128;
        if (i2 % 2 == 0) {
            return zM2190;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i2 = f2217 + 69;
        f2218 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2222.onReceivedError(webView, webResourceRequest, webResourceError);
                throw null;
            }
            this.f2222.onReceivedError(webView, webResourceRequest, webResourceError);
            WebViewClient webViewClient = this.f2221;
            if (webViewClient != null) {
                f2217 = (f2218 + 79) % 128;
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        } catch (Throwable th) {
            kb.m2752(m2186((-16777194) - Color.rgb(0, 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) KeyEvent.keyCodeFromString("")).intern(), m2186(36 - (ViewConfiguration.getTouchSlop() >> 8), 420 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (27901 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern(), th, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            this.f2222.shouldInterceptRequest(webView, webResourceRequest);
        } catch (Throwable th) {
            kb.m2752(m2186(TextUtils.lastIndexOf("", '0') + 23, TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m2186(43 - (Process.myTid() >> 22), 338 - ExpandableListView.getPackedPositionGroup(0L), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2221;
        if (webViewClient == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        f2217 = (f2218 + 93) % 128;
        WebResourceResponse webResourceResponseShouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        int i2 = f2217 + 91;
        f2218 = i2 % 128;
        if (i2 % 2 == 0) {
            return webResourceResponseShouldInterceptRequest;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2186(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f2220[i3 + i4]) ^ (((long) i4) * f2219)) ^ ((long) c2));
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
}
