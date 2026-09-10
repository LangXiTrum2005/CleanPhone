package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
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
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class hl extends WebChromeClient implements bb.e, ck {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2245 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2246;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2247;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2248;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private WebChromeClient f2249;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private WebChromeClient f2250;

    static {
        char[] cArr = new char[1100];
        ByteBuffer.wrap("\u0006/\u001e\u00116\u0002N\u001ff ~6\u0096_®AÆ}ÞWöl\u000e\u0095&\u008d>\u008aV¤n\u0088\u0086Ý\u009e×¶ÏÎîæéþð\u0017\u001f/\u001ex\u008c`·H£0\u0082\u0018\u008b\u0000ÕèèÐó¸\u0089 È\u0088åp/X\u0015@<(\u0012\u0010\tølàkÈt°_\u0098\u0019\u0080Zi¯Q\u008d9\u009b!\u008a\t\u0096ñÿÙüÁæ©Ò\u0091þy!a$I?1\n\u0019\u001c\u0001\u0011oîwÕ_Á'à\u000fé\u0017·ÿ\u008aÇ\u0091¯ë·ª\u009f\u0087gMOwW^?p\u0007kï\u000e÷\tß\u0016§=\u008f{\u00978~ÍFí.î6ä\u001eöæ\u0086Î\u008dÖ\u0092¾§\u0086\u008bnBvS^_&j\b\u0085\u0010¾8ª@\u008bh\u0082pÜ\u0098á úÈ\u0080ÐÁøì\u0000&(\u001c05X\u001b`\u0000\u0088e\u0090b¸}ÀVè\u0010ðS\u0019¦!\u0086I\u0085Q\u008fy\u009d\u0081í©æ±ùÙÌáý\t#\u0011#96ôKìpÄd¼E\u0094L\u008c\u0012d/\\44N,\u000f\u0004\"üèÔÒÌû¤Õ\u009cÎt«l¬D³<\u0098\u0014Þ\f\u009dåhÝHµK\u00adA\u0085S}#U(M7%\u0002\u001d.õáí÷Åõ½Â\u0095÷\u008dÑe©]´5»-\u0090\u0005\u009a\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)GAHYCqO\u0089\u0007¡%¹/Ñ\u001cé\u001b\u0001í\u0019Ú1ñIÁaÇr¸j\u0083B\u0097:¶\u0012¿\náâÜÚÇ²½ªü\u0082Ñz\u001bR!J\b\"&\u001a=òXê_Â@ºk\u0092-\u008anc\u009b[¡3´+µ\u0003 ûúÓØËÒ£á\u009bæs\u0010k'C\f;<\u0013:\u00159\r\u0002%\u0016]7u>m`\u0085]½FÕ<Í}åP\u001d\u009a5 -\u0089E§}¼\u0095Ù\u008dÞ¥ÁÝêõ¬íï\u0004\u001a<+T.L5d%\u009cL´I¬wÄ}üf\u0014\u0098\f\u009f$\u0093wcoXGL?m\u0017d\u000f:ç\u0007ß\u001c·f¯'\u0087\n\u007fÀWúOÓ'ý\u001fæ÷\u0083ï\u0084Ç\u009b¿°\u0097ö\u008fµf@^`6c.{\u0006kþ\u0007Ö\u0005Î\u000e¦\b\u009e=vÅnßFÍmªu\u0091]\u0085%¤\r\u00ad\u0015óýÎÅÕ\u00ad¯µî\u009dÃe\tM3U\u001a=4\u0005/íJõMÝR¥y\u008d?\u0095||\u0089D¸,£4¬\u001c¤äÎÌèÔÚ¼é\u0084ÿl\u0000t\u0014\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)^ASYmqT\u0089!¡\"¹(×\u0005Ï>ç*\u009f\u000b·\u0002¯\\Ga\u007fz\u0017\u0000\u000fA'lß¦÷\u009cïµ\u0087\u009b¿\u0080WåOâgý\u001fÖ7\u0090/ÓÆ&þ\u001e\u0096\u0013\u008e/¦\u0017^jvvnu\u0006Z>Y\u0013´\u000b\u008f#\u009b[ºs³kí\u0083Ð»ËÓ±ËðãÝ\u001b\u00173-+\u0004C*{1\u0093T\u008bS£LÛgó!ëb\u0002\u0097:¯R¢J\u008db»\u009aÚ²ÌªÝÂí\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)^ASYnq]\u0089\"¡?¹.Ñ\ré!\u0001î\u0019à1÷IÅaÔ\u000b*\u0013\u0011;\u0005C$k-ss\u009bN£UË/ÓnûC\u0003\u0089+³3\u009a[´c¯\u008bÊ\u0093Í»ÒÃùë¿óü\u001a\t\">J7R z2\u0082Nª[²VÚcâ_\n\u008e\u0012\u0097:\u0096B©j¾r \u009aÂ¢êÊúÒìúã\u0001\n\u008e\u000e\u00965¾!Æ\u0000î\töW\u001ej&qN\u000bVJ~g\u0086\u00ad®\u0097¶¾Þ\u0090æ\u008b\u000eî\u0016é>öFÝn\u009bvØ\u009f-§\u0018Ï\u000e×\bÿ\u001f\u0007`/x7v_WgV\u008f¤\u0097©¿\u0083Ç\u008aï\u0089÷\u009a\u001fê'ìOØWÎ\u007fÜ\u0084!¬(´\u0004Ü\u000bä\u0010\f|\u0014W<aD@lVtG\u009c·\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)SAEYCqT\u0089+¡3¹=Ñ\u001cé\u001d\u0001ï\u0019â1ÈIÁaÂyÑ\u0091¡©§Á\u0093Ù\u0085ñ\u0097\nj\"c:TRAjP\u0082%\u009a\u001c²*Ê\u000bâ\u001dú\f\u0012ü\u0000Z\u0018a0uHT`]x\u0003\u0090>¨%À_Ø\u001eð3\bù Ã8êPÄhß\u0080º\u0098½°¢È\u0089àÏø\u008c\u0011y)[AZYAqJ\u00892¡<¹0Ñ\u001eé\u0004\u0001ñ\u0019Á1âIÊaÚyÆ\u0091¤©¿\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u000fð\u0019\bè ü8õPÆhÓ\u0080à\u0098£°ªÈ\u008dà\u0097ø\u0095\u0011f)4AOYBqh\u0089!¡\"¹1Ñ\u0001é\u0007\u0001ó\u0019å1÷IÊaâyÙ\u0091¹©¡Á\u0085Ù\u009fñ\u008c\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)DAEY^qU\u0089-¡#¹/Ñ\u0001é\u001b\u0001î\u0019Þ1ýIÕaÅyÙ\u0091»© Á£Ù\u008dñ\u0096\ng\"u:pRMjP\u0099¨\u0081\u0093©\u0087Ñ¦ù¯áñ\tÌ1×Y\u00adAâiô\u0091\u0005¹\u0011¡\u0018É+ñ>\u0019\r\u0001N)GQ`yzax\u0088\u008b°ÙØ¢À¯è\u0085\u0010Ì8Ï ÜHìpê\u0098\u001e\u0080\b¨\u001aÐ'ø\u000fà4\bT0LXh@rha\u0093ª»\u009c£\u009fË¦ó¼\u001bÁ\u0003Ä+Ñ\u0006g\u001e\\6HNif`~>\u0096\u0003®\u0018ÆbÞ#ö\u000e\u000eÄ&þ>×Vùnâ\u0086\u0087\u009e\u0080¶\u009fÎ´æòþ±\u0017D/|Gq_Zws\u008f\u000b§\u0017¿\u0011×?ï\"\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)WAOYBqK\u0089+¡<¹9Ñ%é\u0011\u0001ó\u0019ÿ1ùIÃaÕ\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u009b\u0011m)`AdYIq^\u0089%¡%¹0Ñ\u001cé\"\u0001é\u0019è1ýIËaàyÓ\u0091»© Á\u0085Ù\u009e\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u009b\u0011m)`AvYEq\\\u0089!¡?¹\u0010Ñ\u0007é\u0015\u0001ä\u0019å1öIÃaàyÎ\u0091§©³Á\u0092Ù\u0089ñ\u008b\nw\"F:uRMjC\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u009b\u0011m)`AvYEqK\u0089-¡$¹9Ñ\fé<\u0001é\u0019ÿ1ìIËaÂyÅ\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)GAHYCqO\u0089\u0002¡9¹0Ñ\ré7\u0001è\u0019ã1÷I×aÕyÎr1j?B::%\u0012\u0014\n\u000bânÚr²Sª^\u0082yz·R¤J\u0089\"\u0096\u001a\u0090òùê÷Âëºñ\u0092Ê\u008aÃc;[,3\u0002\u0000g\u0018i0lHp`Rxk\u0090-¨6À#Ø\u0004ð\n\bë ý8ùPëhØ\u0080©\u0098©°¶È\u0090".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1100);
        f2248 = cArr;
        f2247 = 8445136619319465996L;
    }

    public hl(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f2249 = webChromeClient;
        this.f2250 = webChromeClient2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private WebChromeClient m2198() {
        WebChromeClient webChromeClient;
        int i2 = f2245 + 89;
        int i3 = i2 % 128;
        f2246 = i3;
        if (i2 % 2 != 0) {
            webChromeClient = this.f2249;
            int i4 = 7 / 0;
        } else {
            webChromeClient = this.f2249;
        }
        int i5 = i3 + 103;
        f2245 = i5 % 128;
        if (i5 % 2 != 0) {
            return webChromeClient;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2199(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f2248[i3 + i4]) ^ (((long) i4) * f2247)) ^ ((long) c2));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Object m2200() {
        int i2 = f2245;
        int i3 = i2 + 9;
        f2246 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        WebChromeClient webChromeClient = this.f2250;
        int i4 = i2 + 75;
        f2246 = i4 % 128;
        if (i4 % 2 == 0) {
            return webChromeClient;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        f2245 = (f2246 + 11) % 128;
        try {
            this.f2250.getDefaultVideoPoster();
            f2246 = (f2245 + 3) % 128;
        } catch (Throwable th) {
            kb.m2752(m2199(24 - TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionGroup(0L), (char) (View.combineMeasuredStates(0, 0) + 1656)).intern(), m2199(43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 889, (char) (Process.myTid() >> 22)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient == null) {
            return super.getDefaultVideoPoster();
        }
        f2246 = (f2245 + 25) % 128;
        return webChromeClient.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        try {
            this.f2250.getVideoLoadingProgressView();
        } catch (Throwable th) {
            kb.m2752(m2199((ViewConfiguration.getFadingEdgeLength() >> 16) + 24, ViewConfiguration.getLongPressTimeout() >> 16, (char) (1656 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern(), m2199(48 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.getTrimmedLength("") + 931, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient != null) {
            f2245 = (f2246 + 119) % 128;
            return webChromeClient.getVideoLoadingProgressView();
        }
        View videoLoadingProgressView = super.getVideoLoadingProgressView();
        f2245 = (f2246 + 63) % 128;
        return videoLoadingProgressView;
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        try {
            this.f2250.getVisitedHistory(valueCallback);
        } catch (Throwable th) {
            kb.m2752(m2199((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (Process.getGidForName("") + 1657)).intern(), m2199(38 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 978, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient == null) {
            super.getVisitedHistory(valueCallback);
            f2245 = (f2246 + 77) % 128;
            return;
        }
        int i2 = f2246 + 59;
        f2245 = i2 % 128;
        if (i2 % 2 != 0) {
            webChromeClient.getVisitedHistory(valueCallback);
        } else {
            webChromeClient.getVisitedHistory(valueCallback);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        try {
            this.f2250.onCloseWindow(webView);
            f2246 = (f2245 + 107) % 128;
        } catch (Throwable th) {
            kb.m2752(m2199(Color.argb(0, 0, 0, 0) + 24, (-1) - ImageFormat.getBitsPerPixel(0), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 1656)).intern(), m2199((ViewConfiguration.getWindowTouchSlop() >> 8) + 34, 321 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (28142 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient == null) {
            super.onCloseWindow(webView);
        } else {
            f2246 = (f2245 + 87) % 128;
            webChromeClient.onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i2, String str2) {
        f2246 = (f2245 + 121) % 128;
        try {
            this.f2250.onConsoleMessage(str, i2, str2);
            f2246 = (f2245 + 55) % 128;
        } catch (Throwable th) {
            kb.m2752(m2199(23 - TextUtils.lastIndexOf("", '0'), KeyEvent.getDeadChar(0, 0), (char) (1656 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern(), m2199(((byte) KeyEvent.getModifierMetaStateMask()) + 38, 852 - KeyEvent.keyCodeFromString(""), (char) (Process.myTid() >> 22)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient == null) {
            super.onConsoleMessage(str, i2, str2);
            return;
        }
        int i3 = f2246 + 119;
        f2245 = i3 % 128;
        if (i3 % 2 == 0) {
            webChromeClient.onConsoleMessage(str, i2, str2);
            int i4 = 11 / 0;
        } else {
            webChromeClient.onConsoleMessage(str, i2, str2);
        }
        f2245 = (f2246 + 19) % 128;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z2, boolean z3, Message message) {
        int i2 = f2246 + 93;
        f2245 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2250.onCreateWindow(webView, z2, z3, message);
                throw null;
            }
            this.f2250.onCreateWindow(webView, z2, z3, message);
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient == null) {
                return super.onCreateWindow(webView, z2, z3, message);
            }
            f2245 = (f2246 + 83) % 128;
            return webChromeClient.onCreateWindow(webView, z2, z3, message);
        } catch (Throwable th) {
            kb.m2752(m2199('H' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) (1656 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), m2199(36 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 250 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (5500 - ExpandableListView.getPackedPositionGroup(0L))).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        f2246 = (f2245 + 11) % 128;
        try {
            this.f2250.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
            f2246 = (f2245 + 59) % 128;
        } catch (Throwable th) {
            kb.m2752(m2199((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, (-1) - MotionEvent.axisFromString(""), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1657)).intern(), m2199(44 - Color.blue(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 483, (char) (Color.rgb(0, 0, 0) + 16780143)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient != null) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } else {
            super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        try {
            this.f2250.onGeolocationPermissionsHidePrompt();
        } catch (Throwable th) {
            kb.m2752(m2199(Gravity.getAbsoluteGravity(0, 0) + 24, ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (1655 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), m2199((ViewConfiguration.getLongPressTimeout() >> 16) + 55, 584 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsHidePrompt();
            return;
        }
        f2245 = (f2246 + 47) % 128;
        webChromeClient.onGeolocationPermissionsHidePrompt();
        f2246 = (f2245 + 85) % 128;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        int i2 = f2246 + 119;
        f2245 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2250.onGeolocationPermissionsShowPrompt(str, callback);
                throw null;
            }
            this.f2250.onGeolocationPermissionsShowPrompt(str, callback);
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient != null) {
                webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
                int i3 = f2246 + 67;
                f2245 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            super.onGeolocationPermissionsShowPrompt(str, callback);
            int i4 = f2246 + 103;
            f2245 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            kb.m2752(m2199((ViewConfiguration.getTouchSlop() >> 8) + 24, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (1655 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), m2199(TextUtils.getOffsetAfter("", 0) + 55, TextUtils.indexOf((CharSequence) "", '0') + 529, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36426)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        int i2 = f2245 + 81;
        f2246 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2250.onHideCustomView();
                throw null;
            }
            this.f2250.onHideCustomView();
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient == null) {
                super.onHideCustomView();
                return;
            }
            int i3 = f2246 + 43;
            f2245 = i3 % 128;
            if (i3 % 2 != 0) {
                webChromeClient.onHideCustomView();
            } else {
                webChromeClient.onHideCustomView();
                throw null;
            }
        } catch (Throwable th) {
            kb.m2752(m2199(24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (1656 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), m2199(View.resolveSizeAndState(0, 0, 0) + 37, (Process.myTid() >> 22) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, (char) (29436 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        int i2 = f2245 + 81;
        f2246 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2250.onJsAlert(webView, str, str2, jsResult);
                throw null;
            }
            this.f2250.onJsAlert(webView, str, str2, jsResult);
            f2245 = (f2246 + 25) % 128;
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient == null) {
                return super.onJsAlert(webView, str, str2, jsResult);
            }
            f2245 = (f2246 + 87) % 128;
            return webChromeClient.onJsAlert(webView, str, str2, jsResult);
        } catch (Throwable th) {
            kb.m2752(m2199(ExpandableListView.getPackedPositionGroup(0L) + 24, TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1655)).intern(), m2199(TextUtils.indexOf("", "", 0) + 30, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 353, (char) ExpandableListView.getPackedPositionType(0L)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        int i2 = f2246 + 119;
        f2245 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2250.onJsBeforeUnload(webView, str, str2, jsResult);
                int i3 = 51 / 0;
            } else {
                this.f2250.onJsBeforeUnload(webView, str, str2, jsResult);
            }
        } catch (Throwable th) {
            kb.m2752(m2199(24 - TextUtils.getOffsetAfter("", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1655 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), m2199((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, Color.blue(0) + 447, (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient != null) {
            return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        boolean zOnJsBeforeUnload = super.onJsBeforeUnload(webView, str, str2, jsResult);
        int i4 = f2246 + 71;
        f2245 = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnJsBeforeUnload;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f2250.onJsConfirm(webView, str, str2, jsResult);
            f2246 = (f2245 + 75) % 128;
        } catch (Throwable th) {
            kb.m2752(m2199(((Process.getThreadPriority(0) + 20) >> 6) + 24, TextUtils.lastIndexOf("", '0') + 1, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 1656)).intern(), m2199(31 - MotionEvent.axisFromString(""), 384 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (55105 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient == null) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }
        int i2 = f2245 + 43;
        f2246 = i2 % 128;
        if (i2 % 2 == 0) {
            return webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        }
        webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        WebView webView2;
        String str4;
        String str5;
        String str6;
        JsPromptResult jsPromptResult2;
        WebChromeClient webChromeClient;
        int i2 = f2246 + 87;
        f2245 = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                try {
                    this.f2250.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                    jsPromptResult2 = jsPromptResult;
                    str6 = str3;
                    str5 = str2;
                    str4 = str;
                    webView2 = webView;
                } catch (Throwable th) {
                    th = th;
                    jsPromptResult2 = jsPromptResult;
                    str6 = str3;
                    str5 = str2;
                    str4 = str;
                    webView2 = webView;
                    kb.m2752(m2199(24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 1656)).intern(), m2199(TextUtils.getTrimmedLength("") + 31, 416 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (5105 - TextUtils.getCapsMode("", 0, 0))).intern(), th, false);
                }
            } catch (Throwable th2) {
                th = th2;
                webView2 = webView;
                str4 = str;
                str5 = str2;
                str6 = str3;
                jsPromptResult2 = jsPromptResult;
            }
            webChromeClient = this.f2249;
            if (webChromeClient != null) {
                return super.onJsPrompt(webView2, str4, str5, str6, jsPromptResult2);
            }
            f2246 = (f2245 + 19) % 128;
            return webChromeClient.onJsPrompt(webView2, str4, str5, str6, jsPromptResult2);
        }
        webView2 = webView;
        str4 = str;
        str5 = str2;
        str6 = str3;
        jsPromptResult2 = jsPromptResult;
        try {
            this.f2250.onJsPrompt(webView2, str4, str5, str6, jsPromptResult2);
            throw null;
        } catch (Throwable th3) {
            th = th3;
        }
        kb.m2752(m2199(24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 1656)).intern(), m2199(TextUtils.getTrimmedLength("") + 31, 416 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (5105 - TextUtils.getCapsMode("", 0, 0))).intern(), th, false);
        webChromeClient = this.f2249;
        if (webChromeClient != null) {
            return super.onJsPrompt(webView2, str4, str5, str6, jsPromptResult2);
        }
        f2246 = (f2245 + 19) % 128;
        return webChromeClient.onJsPrompt(webView2, str4, str5, str6, jsPromptResult2);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        f2245 = (f2246 + 97) % 128;
        try {
            this.f2250.onJsTimeout();
            f2246 = (f2245 + 75) % 128;
        } catch (Throwable th) {
            kb.m2752(m2199(24 - View.resolveSizeAndState(0, 0, 0), (Process.getThreadPriority(0) + 20) >> 6, (char) (1656 - ((Process.getThreadPriority(0) + 20) >> 6))).intern(), m2199(KeyEvent.normalizeMetaState(0) + 32, 820 - View.MeasureSpec.getSize(0), (char) (TextUtils.lastIndexOf("", '0') + 1571)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        return webChromeClient != null ? webChromeClient.onJsTimeout() : super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        f2246 = (f2245 + 121) % 128;
        try {
            this.f2250.onPermissionRequest(permissionRequest);
            f2246 = (f2245 + 21) % 128;
        } catch (Throwable th) {
            kb.m2752(m2199(25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (Color.green(0) + 1656)).intern(), m2199(39 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 638 - (KeyEvent.getMaxKeyCode() >> 16), (char) (KeyEvent.keyCodeFromString("") + 31)).intern(), th, false);
        }
        try {
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient == null) {
                super.onPermissionRequest(permissionRequest);
            } else {
                f2245 = (f2246 + 87) % 128;
                webChromeClient.onPermissionRequest(permissionRequest);
            }
        } catch (Throwable th2) {
            kb.m2752(m2199(Gravity.getAbsoluteGravity(0, 0) + 24, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1656)).intern(), m2199((ViewConfiguration.getTapTimeout() >> 16) + 43, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 678, (char) View.combineMeasuredStates(0, 0)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        f2245 = (f2246 + 1) % 128;
        try {
            this.f2250.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th) {
            kb.m2752(m2199((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, ExpandableListView.getPackedPositionGroup(0L), (char) (1657 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), m2199(47 - TextUtils.lastIndexOf("", '0'), ((Process.getThreadPriority(0) + 20) >> 6) + 721, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        try {
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient != null) {
                f2246 = (f2245 + 71) % 128;
                webChromeClient.onPermissionRequestCanceled(permissionRequest);
            } else {
                super.onPermissionRequestCanceled(permissionRequest);
                f2246 = (f2245 + 45) % 128;
            }
        } catch (Throwable th2) {
            kb.m2752(m2199((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, ViewConfiguration.getTapTimeout() >> 16, (char) (1656 - TextUtils.indexOf("", "", 0, 0))).intern(), m2199(50 - MotionEvent.axisFromString(""), 769 - Color.green(0), (char) (39406 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i2) {
        int i3 = f2245 + 39;
        f2246 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.f2250.onProgressChanged(webView, i2);
                throw null;
            }
            this.f2250.onProgressChanged(webView, i2);
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient == null) {
                super.onProgressChanged(webView, i2);
                return;
            }
            int i4 = f2245 + 89;
            f2246 = i4 % 128;
            if (i4 % 2 == 0) {
                webChromeClient.onProgressChanged(webView, i2);
            } else {
                webChromeClient.onProgressChanged(webView, i2);
                throw null;
            }
        } catch (Throwable th) {
            kb.m2752(m2199(23 - TextUtils.lastIndexOf("", '0'), ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (1657 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), m2199((ViewConfiguration.getFadingEdgeLength() >> 16) + 38, 24 - TextUtils.indexOf("", "", 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 30921)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        int i2 = f2245 + 91;
        f2246 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2250.onReceivedIcon(webView, bitmap);
                throw null;
            }
            this.f2250.onReceivedIcon(webView, bitmap);
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient == null) {
                super.onReceivedIcon(webView, bitmap);
                int i3 = f2245 + 59;
                f2246 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i4 = f2245 + 113;
            f2246 = i4 % 128;
            if (i4 % 2 == 0) {
                webChromeClient.onReceivedIcon(webView, bitmap);
            } else {
                webChromeClient.onReceivedIcon(webView, bitmap);
                throw null;
            }
        } catch (Throwable th) {
            kb.m2752(m2199(23 - ((byte) KeyEvent.getModifierMetaStateMask()), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 1656)).intern(), m2199((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34, ExpandableListView.getPackedPositionGroup(0L) + 98, (char) (2239 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        int i2 = f2246 + 51;
        f2245 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2250.onReceivedTitle(webView, str);
                throw null;
            }
            this.f2250.onReceivedTitle(webView, str);
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient == null) {
                super.onReceivedTitle(webView, str);
            } else {
                f2246 = (f2245 + 87) % 128;
                webChromeClient.onReceivedTitle(webView, str);
            }
        } catch (Throwable th) {
            kb.m2752(m2199(24 - ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.indexOf("", "", 0) + 1656)).intern(), m2199(36 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 62 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 28587)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z2) {
        f2246 = (f2245 + 53) % 128;
        try {
            this.f2250.onReceivedTouchIconUrl(webView, str, z2);
        } catch (Throwable th) {
            kb.m2752(m2199(24 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1656)).intern(), m2199(43 - (ViewConfiguration.getKeyRepeatDelay() >> 16), AndroidCharacter.getMirror('0') + 'U', (char) (62477 - MotionEvent.axisFromString(""))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient != null) {
            f2246 = (f2245 + 77) % 128;
            webChromeClient.onReceivedTouchIconUrl(webView, str, z2);
        } else {
            super.onReceivedTouchIconUrl(webView, str, z2);
            f2245 = (f2246 + 51) % 128;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        f2245 = (f2246 + 91) % 128;
        try {
            this.f2250.onRequestFocus(webView);
            f2245 = (f2246 + 53) % 128;
        } catch (Throwable th) {
            kb.m2752(m2199(TextUtils.indexOf("", "") + 24, TextUtils.getOffsetBefore("", 0), (char) (1657 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), m2199(35 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 284, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 30502)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient == null) {
            super.onRequestFocus(webView);
            return;
        }
        int i2 = f2246 + 57;
        f2245 = i2 % 128;
        if (i2 % 2 != 0) {
            webChromeClient.onRequestFocus(webView);
        } else {
            webChromeClient.onRequestFocus(webView);
            int i3 = 60 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        int i2 = f2245 + 81;
        f2246 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2250.onShowCustomView(view, customViewCallback);
                throw null;
            }
            this.f2250.onShowCustomView(view, customViewCallback);
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient == null) {
                super.onShowCustomView(view, customViewCallback);
                return;
            }
            int i3 = f2246 + 111;
            f2245 = i3 % 128;
            if (i3 % 2 != 0) {
                webChromeClient.onShowCustomView(view, customViewCallback);
            } else {
                webChromeClient.onShowCustomView(view, customViewCallback);
                int i4 = 19 / 0;
            }
        } catch (Throwable th) {
            kb.m2752(m2199(24 - Color.red(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1656 - View.resolveSize(0, 0))).intern(), m2199(AndroidCharacter.getMirror('0') - 11, Color.blue(0) + 176, (char) Drawable.resolveOpacity(0, 0)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        f2246 = (f2245 + 101) % 128;
        try {
            this.f2250.onShowFileChooser(webView, valueCallback, fileChooserParams);
        } catch (Throwable th) {
            kb.m2752(m2199((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (1656 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), m2199(38 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1017 - TextUtils.getOffsetAfter("", 0), (char) TextUtils.getTrimmedLength("")).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient == null) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        f2246 = (f2245 + 113) % 128;
        int i2 = f2246 + 35;
        f2245 = i2 % 128;
        if (i2 % 2 != 0) {
            return webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006b  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
    /* JADX INFO: renamed from: ﾇ */
    public final Object mo792(String str, List<Object> list, ch chVar) {
        int iHashCode = str.hashCode();
        byte b2 = 0;
        if (iHashCode != 1395849045) {
            if (iHashCode == 1442029578 && str.equals(m2199(Gravity.getAbsoluteGravity(0, 0) + 25, 1055 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (29271 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern())) {
                f2245 = (f2246 + 117) % 128;
            } else {
                b2 = -1;
            }
        } else if (str.equals(m2199(View.MeasureSpec.getSize(0) + 20, View.combineMeasuredStates(0, 0) + 1080, (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
            f2246 = (f2245 + 93) % 128;
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return m2198();
        }
        if (b2 != 1) {
            return null;
        }
        return m2200();
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        int i3 = f2245 + 35;
        f2246 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.f2250.onShowCustomView(view, i2, customViewCallback);
                throw null;
            }
            this.f2250.onShowCustomView(view, i2, customViewCallback);
            WebChromeClient webChromeClient = this.f2249;
            if (webChromeClient != null) {
                f2246 = (f2245 + 69) % 128;
                webChromeClient.onShowCustomView(view, i2, customViewCallback);
            } else {
                super.onShowCustomView(view, i2, customViewCallback);
            }
        } catch (Throwable th) {
            kb.m2752(m2199(KeyEvent.keyCodeFromString("") + 24, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1657)).intern(), m2199(36 - TextUtils.lastIndexOf("", '0'), 176 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), th, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            this.f2250.onConsoleMessage(consoleMessage);
        } catch (Throwable th) {
            kb.m2752(m2199((ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (View.resolveSizeAndState(0, 0, 0) + 1656)).intern(), m2199((ViewConfiguration.getLongPressTimeout() >> 16) + 37, (ViewConfiguration.getTapTimeout() >> 16) + 852, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2249;
        if (webChromeClient != null) {
            f2246 = (f2245 + 83) % 128;
            return webChromeClient.onConsoleMessage(consoleMessage);
        }
        boolean zOnConsoleMessage = super.onConsoleMessage(consoleMessage);
        int i2 = f2246 + 47;
        f2245 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
        return zOnConsoleMessage;
    }
}
