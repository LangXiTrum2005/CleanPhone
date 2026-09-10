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
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.measurement.f2;
import com.google.protobuf.ByteString;
import com.ironsource.F9;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsBaseOptions;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerHide;
import com.unity3d.services.banners.BannerShow;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.UnityBanners;
import com.unity3d.services.banners.api.Banner;
import com.unity3d.services.banners.api.BannerListener;
import com.unity3d.services.banners.configuration.BannersModuleConfiguration;
import com.unity3d.services.banners.properties.BannerProperties;
import com.unity3d.services.banners.view.BannerEvent;
import com.unity3d.services.banners.view.BannerPosition;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.monetization.UnityMonetization;
import com.unity3d.services.monetization.placementcontent.ads.ShowAdListenerAdapter;
import com.unity3d.services.monetization.placementcontent.core.CustomEvent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cg extends be {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1261 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1262 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1263 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1264;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends WebViewApp implements hj<WebViewApp> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f1287 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f1288 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f1293 = 6;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private WebViewApp f1294;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ck f1295;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char[] f1292 = {'W', 'e', 'b', 'V', 'i', 'w', 'A', 'p', '.', 's', 't', 'L', 'o', 'a', 'd', 'F', 'l', 'u', 'r', 'M', 'g', 'C', 'I', 'n', 'z', 'f', 'v', 'k', 'h', 'c', 'm', 'X', 'Y', 'Z', '[', '\\'};

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static long f1291 = -3881577000749892678L;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f1289 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f1290 = 0;

        public e(WebViewApp webViewApp, ck ckVar) {
            this.f1294 = webViewApp;
            this.f1295 = ckVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private WebViewApp m1545() {
            int i10 = f1287;
            WebViewApp webViewApp = this.f1294;
            f1288 = (i10 + 33) % 128;
            return webViewApp;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m1546(int i10, String str, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (j.f2647) {
                try {
                    char[] cArr2 = f1292;
                    char c4 = f1293;
                    char[] cArr3 = new char[i10];
                    if (i10 % 2 != 0) {
                        i10--;
                        cArr3[i10] = (char) (cArr[i10] - b10);
                    }
                    if (i10 > 1) {
                        j.f2654 = 0;
                        while (true) {
                            int i11 = j.f2654;
                            if (i11 >= i10) {
                                break;
                            }
                            j.f2653 = cArr[i11];
                            j.f2650 = cArr[j.f2654 + 1];
                            if (j.f2653 == j.f2650) {
                                cArr3[j.f2654] = (char) (j.f2653 - b10);
                                cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                            } else {
                                j.f2652 = j.f2653 / c4;
                                j.f2649 = j.f2653 % c4;
                                j.f2651 = j.f2650 / c4;
                                j.f2648 = j.f2650 % c4;
                                if (j.f2649 == j.f2648) {
                                    j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                    j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                    int i12 = (j.f2652 * c4) + j.f2649;
                                    int i13 = (j.f2651 * c4) + j.f2648;
                                    int i14 = j.f2654;
                                    cArr3[i14] = cArr2[i12];
                                    cArr3[i14 + 1] = cArr2[i13];
                                } else if (j.f2652 == j.f2651) {
                                    j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                    j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                    int i15 = (j.f2652 * c4) + j.f2649;
                                    int i16 = (j.f2651 * c4) + j.f2648;
                                    int i17 = j.f2654;
                                    cArr3[i17] = cArr2[i15];
                                    cArr3[i17 + 1] = cArr2[i16];
                                } else {
                                    int i18 = (j.f2652 * c4) + j.f2648;
                                    int i19 = (j.f2651 * c4) + j.f2649;
                                    int i20 = j.f2654;
                                    cArr3[i20] = cArr2[i18];
                                    cArr3[i20 + 1] = cArr2[i19];
                                }
                            }
                            j.f2654 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m1547(char c4, String str, String str2, String str3, int i10) {
            String str4;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str2;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str;
            if (str != null) {
                charArray3 = str.toCharArray();
            }
            char[] cArr3 = (char[]) charArray3;
            synchronized (f.f2016) {
                try {
                    char[] cArr4 = (char[]) cArr2.clone();
                    char[] cArr5 = (char[]) cArr3.clone();
                    cArr4[0] = (char) (c4 ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i10));
                    int length = cArr.length;
                    char[] cArr6 = new char[length];
                    f.f2015 = 0;
                    while (true) {
                        int i11 = f.f2015;
                        if (i11 < length) {
                            int i12 = (i11 + 2) % 4;
                            int i13 = (i11 + 3) % 4;
                            int i14 = cArr4[i11 % 4] * 32718;
                            char c5 = cArr5[i12];
                            char c10 = (char) ((i14 + c5) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                            f.f2017 = c10;
                            cArr5[i13] = (char) d5.u.d(cArr4[i13], 32718, c5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                            cArr4[i13] = c10;
                            int i15 = f.f2015;
                            cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f1291) ^ ((long) f1289)) ^ ((long) f1290));
                            f.f2015 = i15 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str4;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void addCallback(NativeCallback nativeCallback) {
            cg.this.m823(this, this.f1295, m1546((ViewConfiguration.getJumpTapTimeout() >> 16) + 22, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u008f\u008f\u0007\u000e\u0083\u0083\u0013\u000f\u008b\u008b\u0001\u000e\u0018\u001c", (byte) (31 - View.resolveSizeAndState(0, 0, 0))).intern(), nativeCallback);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp != null) {
                f1288 = (f1287 + 31) % 128;
                webViewApp.addCallback(nativeCallback);
                f1287 = (f1288 + 31) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public NativeCallback getCallback(String str) {
            f1287 = (f1288 + 49) % 128;
            cg.this.m823(this, this.f1295, m1547((char) TextUtils.getOffsetBefore("", 0), "﮺藹\ude48쨡", "\ud963願\uf466窹", "꺗㏼텇㼊볊霺ꪆ⸘⠺Ⴄꅛ홙Ἂꅹ厃阡\uf793═ኅ輙퐍鶦", View.resolveSize(0, 0)).intern(), str);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp == null) {
                return null;
            }
            NativeCallback callback = webViewApp.getCallback(str);
            int i10 = f1288 + 5;
            f1287 = i10 % 128;
            if (i10 % 2 == 0) {
                return callback;
            }
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public Configuration getConfiguration() {
            f1287 = (f1288 + 43) % 128;
            cg.this.m823(this, this.f1295, m1546(27 - Gravity.getAbsoluteGravity(0, 0), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bìì\u000e\u001a\u0004\u0007\u0012\u000f\u0013\u001d\u0002\u0016\f\u0017\u0010\u0007\u0000\u0010ê", (byte) (123 - TextUtils.lastIndexOf("", '0', 0))).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp == null) {
                return null;
            }
            f1288 = (f1287 + 49) % 128;
            return webViewApp.getConfiguration();
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public ErrorState getErrorStateFromWebAppCode() {
            f1287 = (f1288 + 21) % 128;
            cg.this.m823(this, this.f1295, m1547((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "﮺藹\ude48쨡", "뀜ቐ\u0fdf缀", "⭑伳㶒坍\uf7f4\ueb1f苝犉\ue2c6暫輢齄귡胷ꄖ盾╓\ued3aᒿ姖겊媪ퟫ氉扻\ud9a9ཏᶆ\udde8ﭯ\uf38c寥ꬾ赱\uf192ꜿⅮ彨", ViewConfiguration.getScrollDefaultDelay() >> 16).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp == null) {
                return null;
            }
            int i10 = f1287 + 117;
            f1288 = i10 % 128;
            if (i10 % 2 != 0) {
                return webViewApp.getErrorStateFromWebAppCode();
            }
            int i11 = 71 / 0;
            return webViewApp.getErrorStateFromWebAppCode();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        
            if (r6.f1294 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
        
            if (r6.f1294 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
        
            r6 = r6.f1294.getWebAppFailureCode();
            com.ironsource.adqualitysdk.sdk.i.cg.e.f1287 = (com.ironsource.adqualitysdk.sdk.i.cg.e.f1288 + 45) % 128;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getWebAppFailureCode() {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.cg.e.f1288
                int r0 = r0 + 13
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cg.e.f1287 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u000e\u001a\u0004\u0007\u0001\u0002\u0000\b\u0082\u0082\u0010\u000e\n\u0016\f\u0017\u0003\u0013\r\u000fw"
                r2 = 0
                if (r0 == 0) goto L34
                com.ironsource.adqualitysdk.sdk.i.cg r0 = com.ironsource.adqualitysdk.sdk.i.cg.this
                com.ironsource.adqualitysdk.sdk.i.ck r3 = r6.f1295
                r4 = 120(0x78, float:1.68E-43)
                r5 = 1
                int r5 = android.view.View.resolveSizeAndState(r5, r5, r2)
                int r4 = r4 >>> r5
                int r5 = android.view.KeyEvent.normalizeMetaState(r2)
                int r5 = 34 - r5
                byte r5 = (byte) r5
                java.lang.String r1 = m1546(r4, r1, r5)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m823(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1294
                if (r0 == 0) goto L65
                goto L56
            L34:
                com.ironsource.adqualitysdk.sdk.i.cg r0 = com.ironsource.adqualitysdk.sdk.i.cg.this
                com.ironsource.adqualitysdk.sdk.i.ck r3 = r6.f1295
                int r4 = android.view.View.resolveSizeAndState(r2, r2, r2)
                int r4 = 31 - r4
                int r5 = android.view.KeyEvent.normalizeMetaState(r2)
                int r5 = 18 - r5
                byte r5 = (byte) r5
                java.lang.String r1 = m1546(r4, r1, r5)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m823(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1294
                if (r0 == 0) goto L65
            L56:
                com.unity3d.services.core.webview.WebViewApp r6 = r6.f1294
                int r6 = r6.getWebAppFailureCode()
                int r0 = com.ironsource.adqualitysdk.sdk.i.cg.e.f1288
                int r0 = r0 + 45
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cg.e.f1287 = r0
                return r6
            L65:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cg.e.getWebAppFailureCode():int");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public String getWebAppFailureMessage() {
            cg.this.m823(this, this.f1295, m1546(33 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bºº\u000e\u001a\u0004\u0007\u0001\u0002\u0000\bºº\u0010\u000e\n\u0016\f\u0017\u0007\u0019\u0003\u0007\u0007\u000f\u0013\u0002", (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 74)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp == null) {
                f1287 = (f1288 + 85) % 128;
                return null;
            }
            int i10 = f1288 + 73;
            f1287 = i10 % 128;
            if (i10 % 2 == 0) {
                return webViewApp.getWebAppFailureMessage();
            }
            webViewApp.getWebAppFailureMessage();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public WebView getWebView() {
            f1287 = (f1288 + 1) % 128;
            cg.this.m823(this, this.f1295, m1547((char) ((-1) - Process.getGidForName("")), "﮺藹\ude48쨡", "⚡᭛쨷꺺", "모盂芧ᔯ恮\ud9af恝撅㕎슀송ꔦ쀙币씒痥搜钐⦧성䎼", 924539685 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp == null) {
                return null;
            }
            WebView webView = webViewApp.getWebView();
            int i10 = f1287 + 63;
            f1288 = i10 % 128;
            if (i10 % 2 != 0) {
                return webView;
            }
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean invokeCallback(Invocation invocation) {
            cg.this.m823(this, this.f1295, m1546(25 - TextUtils.getOffsetBefore("", 0), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÊÊ\n\u0002\u0014\u001d\u000f\u0018\u0003\u0013\u000e\u0011\u000e\u0004\u0011\u0019Å", (byte) (90 - (Process.myPid() >> 22))).intern(), invocation);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp == null) {
                f1287 = (f1288 + 19) % 128;
                return false;
            }
            int i10 = f1287 + 85;
            f1288 = i10 % 128;
            if (i10 % 2 != 0) {
                return webViewApp.invokeCallback(invocation);
            }
            boolean zInvokeCallback = webViewApp.invokeCallback(invocation);
            int i11 = 87 / 0;
            return zInvokeCallback;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
        public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
            f1288 = (f1287 + 125) % 128;
            cg.this.m823(this, this.f1295, m1546(23 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000brr\n\u0002\u0014\u001d\u000f\u0018\u0007\u0019\u0004\u0007\u0018\u0010f", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 2)).intern(), str, str2, method, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1294;
            if (webViewApp == null) {
                return false;
            }
            int i10 = f1288 + 39;
            f1287 = i10 % 128;
            if (i10 % 2 == 0) {
                return webViewApp.invokeMethod(str, str2, method, objArr);
            }
            webViewApp.invokeMethod(str, str2, method, objArr);
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppInitialized() {
            f1287 = (f1288 + 53) % 128;
            cg.this.m823(this, this.f1295, m1547((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38393), "﮺藹\ude48쨡", "䨕\ue0cd\uf8d3뢕", "\uea27龇⤖ф\ueef1븻㤧\ua8dc4ꇢ畝屒䅼騸늮国ጦ刄췄昲笯ﭑꠘ冉칄\uf1a5\uf46a끑㐒殢", Color.green(0)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp != null) {
                f1288 = (f1287 + 83) % 128;
                return webViewApp.isWebAppInitialized();
            }
            f1287 = (f1288 + 121) % 128;
            return false;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppLoaded() {
            f1287 = (f1288 + 47) % 128;
            cg.this.m823(this, this.f1295, m1546(Color.rgb(0, 0, 0) + 16777241, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÅÅ\n\u0002\u0006\u0003\u0002\u0003\u0007\b\b\u0006\r\u000e\r\u0002¹", (byte) (85 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp == null) {
                return false;
            }
            boolean zIsWebAppLoaded = webViewApp.isWebAppLoaded();
            f1287 = (f1288 + 29) % 128;
            return zIsWebAppLoaded;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void removeCallback(NativeCallback nativeCallback) {
            f1287 = (f1288 + 33) % 128;
            cg.this.m823(this, this.f1295, m1546((ViewConfiguration.getWindowTouchSlop() >> 8) + 25, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÄÄ\u0006\u0014\u0000\u001f\u000e\u0018\u0003\u0013\u000e\u0011\u000e\u0004\u0011\u0019¿", (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 84)).intern(), nativeCallback);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp != null) {
                int i10 = f1288 + 79;
                f1287 = i10 % 128;
                int i11 = i10 % 2;
                webViewApp.removeCallback(nativeCallback);
                if (i11 != 0) {
                    throw null;
                }
            }
            f1288 = (f1287 + 41) % 128;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0060  */
        @Override // com.unity3d.services.core.webview.WebViewApp
        public void resetWebViewAppInitialization() {
            int i10 = f1287 + 87;
            f1288 = i10 % 128;
            if (i10 % 2 == 0) {
                cg.this.m823(this, this.f1295, m1546('_' >>> AndroidCharacter.getMirror('<'), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u0006\u0014\u0003\u0007\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u0017\u0012\n\u0010\u0001\u0010\u0016\n\u0019\f\u0010\n\u0011\u0012", (byte) (27 >>> (ViewConfiguration.getScrollDefaultDelay() << 107))).intern(), new Object[0]);
                if (this.f1294 != null) {
                    this.f1294.resetWebViewAppInitialization();
                }
            } else {
                cg.this.m823(this, this.f1295, m1546('X' - AndroidCharacter.getMirror('0'), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u0006\u0014\u0003\u0007\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u0017\u0012\n\u0010\u0001\u0010\u0016\n\u0019\f\u0010\n\u0011\u0012", (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 18)).intern(), new Object[0]);
                if (this.f1294 != null) {
                    this.f1294.resetWebViewAppInitialization();
                }
            }
            int i11 = f1288 + 17;
            f1287 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 / 0;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean sendEvent(Enum r10, Enum r11, Object... objArr) {
            cg.this.m823(this, this.f1295, m1547((char) TextUtils.getTrimmedLength(""), "﮺藹\ude48쨡", "\uda4a綰ٝ暅", "匢ṑ䨥\ue175寘鉧㘲ᵧ柔ĥ曤촥陥❾╄\uecf1训퀊̤쾅", KeyEvent.getMaxKeyCode() >> 16).intern(), r10, r11, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1294;
            if (webViewApp == null) {
                int i10 = f1287 + 25;
                f1288 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 16 / 0;
                }
                return false;
            }
            int i12 = f1288 + 47;
            f1287 = i12 % 128;
            if (i12 % 2 == 0) {
                return webViewApp.sendEvent(r10, r11, objArr);
            }
            webViewApp.sendEvent(r10, r11, objArr);
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setConfiguration(Configuration configuration) {
            f1288 = (f1287 + 3) % 128;
            cg.this.m823(this, this.f1295, m1546((Process.myTid() >> 22) + 27, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bww\t\n\u0004\u0007\u0012\u000f\u0013\u001d\u0002\u0016\f\u0017\u0010\u0007\u0000\u0010u", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 7)).intern(), configuration);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp != null) {
                webViewApp.setConfiguration(configuration);
            }
            int i10 = f1287 + 65;
            f1288 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 64 / 0;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureCode(int i10) {
            cg.this.m823(this, this.f1295, m1546((ViewConfiguration.getLongPressTimeout() >> 16) + 31, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÏÏ\t\n\u0004\u0007\u0001\u0002\u0000\bÏÏ\u0010\u000e\n\u0016\f\u0017\u0003\u0013\r\u000fÄ", (byte) (94 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), Integer.valueOf(i10));
            WebViewApp webViewApp = this.f1294;
            if (webViewApp != null) {
                f1287 = (f1288 + 119) % 128;
                webViewApp.setWebAppFailureCode(i10);
            }
            int i11 = f1287 + 123;
            f1288 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 90 / 0;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureMessage(String str) {
            f1288 = (f1287 + 11) % 128;
            cg.this.m823(this, this.f1295, m1546((ViewConfiguration.getTouchSlop() >> 8) + 34, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u009e\u009e\t\n\u0004\u0007\u0001\u0002\u0000\b\u009e\u009e\u0010\u000e\n\u0016\f\u0017\u0007\u0019\u0003\u0007\u0007\u000f\u0013\u0002", (byte) (46 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern(), str);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp != null) {
                webViewApp.setWebAppFailureMessage(str);
            }
            int i10 = f1288 + 75;
            f1287 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 55 / 0;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppInitialized(boolean z10) {
            f1288 = (f1287 + 51) % 128;
            cg.this.m823(this, this.f1295, m1546(KeyEvent.normalizeMetaState(0) + 31, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÆÆ\t\n\u0004\u0007\u0001\u0002\u0000\bÆÆ\u0017\u0012\n\u0010\u0001\u0010\u0016\n\u0019\u0000º", (byte) ((Process.myTid() >> 22) + 86)).intern(), Boolean.valueOf(z10));
            WebViewApp webViewApp = this.f1294;
            if (webViewApp != null) {
                int i10 = f1287 + 31;
                f1288 = i10 % 128;
                int i11 = i10 % 2;
                webViewApp.setWebAppInitialized(z10);
                if (i11 == 0) {
                    throw null;
                }
                f1287 = (f1288 + 19) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppLoaded(boolean z10) {
            f1287 = (f1288 + 69) % 128;
            cg.this.m823(this, this.f1295, m1546(26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÑÑ\t\n\u0004\u0007\u0001\u0002\u0000\bÑÑ\u0006\u0011\u000e\u000f\u0002\r", (byte) (97 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern(), Boolean.valueOf(z10));
            WebViewApp webViewApp = this.f1294;
            if (webViewApp != null) {
                int i10 = f1288 + 67;
                f1287 = i10 % 128;
                int i11 = i10 % 2;
                webViewApp.setWebAppLoaded(z10);
                if (i11 != 0) {
                    int i12 = 35 / 0;
                }
            }
            int i13 = f1288 + 95;
            f1287 = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebView(WebView webView) {
            cg.this.m823(this, this.f1295, m1547((char) TextUtils.indexOf("", "", 0, 0), "﮺藹\ude48쨡", "荈犁鞵鮀", "ڨ剅逵㯍箆\udbd6嗨ả嗭\ue803䳙톍\ue4c1麥♟곯̍쪟괛⪑\ue00c", (-1250786941) - ExpandableListView.getPackedPositionGroup(0L)).intern(), webView);
            WebViewApp webViewApp = this.f1294;
            if (webViewApp != null) {
                f1287 = (f1288 + 3) % 128;
                webViewApp.setWebView(webView);
            }
            int i10 = f1287 + 117;
            f1288 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hj
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ WebViewApp mo800() {
            f1287 = (f1288 + 93) % 128;
            WebViewApp webViewAppM1545 = m1545();
            f1288 = (f1287 + 71) % 128;
            return webViewAppM1545;
        }
    }

    static {
        char[] cArr = new char[1281];
        f2.v("\u0080Ó\u0000ULF\u00989ä\f0Ù|\u0089È\u0094\u0015ka\u0015\u00ad\u0006ùùEÌ\u0091\u0099ÞI*Tv+\u0000ULF\u00989ä\f0Ù|\u0089È\u0094\u0015ka\t\u00ad=ùþEÑ\u0091\u0094Þq*qv<Âó\u000eäZ¹¦\u008bóT?-\u008b\u001e×ý#²ÆD\u008aW^(\"\u001döÈº\u0098\u000e\u0085Óz§\u0018k,?ï\u0083ÀW\u0085\u0018`ì`°-\u0004âÈü\u009c¹`\u009d5Tù7M\u0005\u0011ìåµ©µzhÎZ\u0092\u0005fü*Ïþ¬Cc\r\u001bA\b\u0095wéB=\u0097qÇÅÚ\u0018%lY Cô¼H \u009cÇÓ#'\t{WÏ¾\u0003\u0096Q\u000b\u001d5ÉXµBa\u009d-Á\u0099ÆD\"0hüv¨¿\u0014\u0097\u0000WLM\u00982ä*0Å|¹È\u0085\u0015}a3\u00ad\u001cùÕEÎ\u0091\u0085Þf*DQ\u0003\u001d\u0019Éfµza\u009d-ù\u0099ÓD\t0büY¨ª\u0014\u0098À÷\u008f={\u0010'i\u0093³_\u0093\u000bö÷Õ\u0000ULF\u00989ä\f0Ù|\u0085È\u009f\u0015va%\u00ad\u001cùùEÂ\u0091\u0081Þ|*Yv7ÂîÛz\u0097iC\u0016?&ëÈ§\u0085\u0013\u0095ÎXº\u001av5\"Ü\u009eÿJ¬\u0005SñX\u00ad\u0015\u0019ÈÕñ\u0081\u008d}´({þæ²øf\u0086\u001a©Îj\u0082\u00006\u0010ëË\u009f\u0080S£\u0007A\u0000ULF\u00989ä\f0Ù|\u0089È\u0094\u0015ka\u0017\u00ad\rùòEî\u0091\u0089Þm*GÕd\u0099~M\u00011\u0019åö©\u008a\u001d¶ÀN´\u0000x/\u008d¾Á³\u0015úié½6ñCEN\u0098\u0084ìË þt\u0019È.\u001ckS\u008e\u0000BLI\u0098>ä\u00160Å|º\u0000ULF\u00989ä\f0Ù|\u008aÈ\u0091\u0015va.\u00ad\rùâEË\u0000ULF\u00989ä\f0Ù|\u008aÈ\u0091\u0015va.\u00ad\rùâEë\u0091\u0089Þr*U \u009aì\u00918æDÎ\u0090\u001dÜbh{µ¨Á÷\rÇ\u0084ãÈè\u001c\u009f`·´dø\u001bL\u0019\u0091Ðå\u0085)¬Ï[\u0083PW'+\u000fÿÜ³£\u0007¬Úw®<b\u001f6ý\u0000BLI\u0098>ä\u00160Å|ºÈ¼\u0015qa3\u00ad\u001cùõEÖ\u0091\u0085Þz\u0000BLI\u0098>ä\u00160Å|ºÈ\u0083\u0015Ua/\u00ad\fùåEÔ\u0091\u0085ÞK*_v6Âæ\u000eÁZ·¦\u008dóR?)\u008b\u0004×ñ#¯o\u0086\u0000BLI\u0098>ä\u00160Å|ºÈ \u0015ja/\u00ad\u0018ùõEÊ\u0091\u0094Þa*Uv+\u0000BLI\u0098>ä\u00160Å|ºÈ \u0015wa3\u00ad\u0001ùäEÑ\u0091\u008fÞf\u0000BLI\u0098>ä\u00160Å|ºÈ§\u0015}a\"\u00ad8ùüEÙ\u0091\u0099Þm*Bv\u001bÂï\u000eÆZ¤¦\u0099óI?&\u008b\u0015×êò\u0016¾\u001djj\u0016BÂ\u0091\u008eî:áç>\u0093f_S\u000b¶·¯cÛ,8Ø\u0001\u0000BLI\u0098>ä\u00160Å|ºÈµ\u0015ja2\u00ad\u0007ùâEñ\u0091\u008eÞn*_\u0000BLI\u0098>ä\u00160Å|ºÈ¦\u0015qa%\u00ad\u001f\u0000cLG\u0098=äV0Õ|¦È\u0099\u0015la9\u00ad[ùôE\u0096\u0091\u0093Þm*Bv.Âé\u000eËZµ¦\u008bó\u000e?*\u008b\u0011×ö#®o\u008d¼b\bKTN ÊìÑ8¶\u0085nÑM\u001d\"i.µÉ\u0001\u00adM\u0087\u0000BLI\u0098>ä\u00160Å|ºÈ¦\u0015qa%\u00ad\u001fùÓEÙ\u0091\u0083Þ`*U\u0000IL}\u0098>ä\u00110Ô|±È²\u0015ya.\u00ad\u0006ùõEÊ\u0091¬Þa*Cv,Âå\u000eÆZµ¦\u008a\u0000BLI\u0098>ä\u00160Å|ºÈ¦\u0015qa%\u00ad\u001fùÙEô\u0091\u0089Þ{*Dv=Âî\u000eÍZ¢Å¸\u0089³]Ä!ìõ?¹@\r\\Ð\u008b¤ßhå<&\u0080+Ti\u001b\u0086ï¯³Ì\u0007\u001fË \u0000BLI\u0098>ä\u00160Å|ºÈ¦\u0015qa%\u00ad\u001fùßEÔ\u0091\u0084\u0000cLG\u0098=äV0Õ|¦È\u0099\u0015la9\u00ad[ùôE\u0096\u0091\u0093Þm*Bv.Âé\u000eËZµ¦\u008bó\u000e?*\u008b\u0011×ö#®o\u008d¼b\bKTN þìÙ8½\u0085wÑ\u0006\u001d\u0012i\u0019µÎ\u0001¦M\u0095\u009ajæ\u00162\u0001~õÊÏ\u0000FL]\u0098<ä\u00140Ó|«È\u0082\u0015}a%\u00ad\u0006ùÇEÝ\u0091\u0082Þ^*Yv=Â÷\u000eìZ¹¦\u008bóP?$\u008b\u0011×áRß\u001eûÊ\u0081¶êbi.\u001a\u009a%GÐ3\u0085ÿç«H\u0017*Ã=\u008cÐxÿ$Ê\u0090]\\p\b\u001cô(¡ým\u008dÙ©\u0085VqR=\u0012îÙZè\u0006°òg¾oj\u0016×Ù\u0083ñO\u0082;\u0093çyS\u0016\u001f\u001aÈÍ´\u0099`£,h\u0098mD/1Äýà©\u0085\u0015E¶úú÷.¤R¡\u0086qÊ\u0016~(£×;³w´£Æßø\u000b=GSóf.¬ZÇ\u0096öÂ\u000e~9ªqå\u0088\u0011§MÏù\u001c5\raG\u009dhÈ\u0084\u0004Ó°çì\u001d\u0018sT~\u0087²3¦oó\u009b\u0003×'\u0003X\u0000ULF\u00989ä\f0Ù|\u0089È\u0094\u0015ka\f\u00ad\u0007ùñEÜ\u0091¯Þx*Dv1Âï\u000eÆZ£Wå\u001böÏ\u0089³¼gi+9\u009f$BÛ6²ú¹®S\u0012mÆ\u001f\u0089È}ô!\u0081\u0095_Yv\r\u0013\u009eðÒý\u0006§z¦®câ\u0014V \u008bÝÈ\u0015\u0084\u0012Po,Kø\u0098´ê\u0000öÝ<©yeN1£\u008d\u009cYÂ\u00167â\u0003¾}µHùM-=Q\u0013\u0085ÂÉ«}\u008f `Ô%\u0018\u0007LÙðÂ$\u0089kj\u009fH\u001fÙSí\u0087®û\u0081/Dc!×!\nì~£²«æhZG\u008e\u0007ÁÔ5Éi»Ýd\u0011]E.¹\rìÂû\u008c·¦cÏ\u001fÐË>\u0087Q3iî\u0096\u009aÅV÷\u0002,¾6ji%µÑ²\u008dÖ9\u001cõ\u0002¡K]c\u0000cLZ\u00985ä\u00190Ô|\u00adÈ¤\u0015Za\u0017\u00ad\rùòEî\u0091\u0089Þm*Gv\u0019Âð\u000eØ7({\u0016¯\u007fÓ`\u0007\u008eKáÿÙ\"&Vu\u009aGÎ\u009cr\u0086¦Ùé\u0005\u001d\u0002Afõ¬9²mû\u0091ÓH[\u0004qÐ\u0018¬\u0003xý4\u0099\u0080©]m)\u0018C\u0082\u000f¨ÛÁ§Ès+?D\u008baV\u0084\"äîéº\u0006\u0006\u0011Òl\u009d\u009ei¡5Ø\u0081\u000bM(\u0019G\u0000sLM\u0098$ä-0Î|¡È\u0084\u0015aa\u0001\u00ad\fùãEô\u0091\u0089Þ{*Dv=Âî\u000eÍZ¢\u0000aLL\u00984ä-0Î|¡È\u0084\u0015aa\u0001\u00ad\fùãEô\u0091\u0089Þ{*Dv=Âî\u000eÍZ¢, `\u001f´oÈE\u001c\u0084Pÿä÷9$M{\u0081NÕ»i«½Öò)\u0006.Zcî¡\"\u008evç\u008aÄß\u0017\u0013h$`hJ¼#À(\u0014ÂX\u00adì¡1vE\"\u0089\u0018ÝÒaÉµ\u0082úa\u000eCR\u001cææ*Û~²\u0082\u0098×H\u001b=¯\u000ek\"'\bóa\u008fj[\u0080\u0017ï£ç~8\ntÆX\u0092°.\u008eúÑµ\bA\u0003\u001dx©«e\u0099\u0000gLM\u0098$ä(0Ì|©È\u0093\u0015}a-\u00ad\rùþEÌ\u0091©ÞlGï\u000bÅß¬£²wI;.\u008f\u0016Rõ&ºê¬¾q\u0002CÖ\u001c\u0099åmÖ1µ\u0085zr8>\u0006êo\u0096qB\u008a\u000eíºÕg6\u0013yßo\u008b²7\u0080ãß¬&X\u0015\u0004v°¹ý)±\u0003ej\u0019yÍ\u009e\u0081ö5Ñè$\u009czPS\u0004°¸\u009flÚ#?×7\u008br\u0085\u0002É(\u001dAaMµ©ùÌMö\u0090\u0018äH(h|\u009bÀ©\u0014Ì[\t¯\u0013óOG\u008a\u008b ßô#ùv\nºO\u000e\u007fR\u0098¦Æêù\u001fìSÆ\u0087¯û¿/Dc\"×\u001f\nÜ~»²\u0097ærZ\\\u008e\u0005Áð\u001b9W\u0013\u0083zÿb+\u009fgâÓÏ»(÷\u0002#k_p\u008b\u008eÇêsÚ®\u001eÚk\u0016aB\u00adþ\u0098*Âe\u0004\u0091\u0013Í~yªµ\u0089áë\u001dçH\u001d\u0084h0Ol²\u0098ýÔÓ\u00076³\u0012ï\\\u009c\rÐ'\u0004NxB¬¦àÃTù\u0089\u0017ýG1ge\u0094Ù¦\rÃB\u0006¶\u001cê@^\u0085\u0092¯Æþ:ûo+£E\u0017tK\u009d¿Ùóö \u0013\u00941ÈO<\u0094p¿¤Ü\u0019\u001e\u0000gLM\u0098$ä+0Ô|ºÈ\u0099\u0015va'\u00ad<ùñEß\u0091\u0093èâ¤Èp¡\f©ØW\u0094, \u0016ýö\u0089¬E\u0083\u0011r\u00adiy\n6æÂÐ\u009e³¶Zúw.\u001eR-\u0086òÊ\u0087\u0086!Ê\u0016\u001ecbJ¶\u0098úïNË\u0093.çn+Z\u007fµ\u0000RLm\u0098\u0001ä-0å|\u009bÈ¤\u0000RLm\u0098\u0003ä70ì|\u009eÈµ¤Ñèû<\u0081@¢\u0094w\u0091ËÝï\t\u0096u¾¡mí\u0003Y,\u0084Ùð\u009e<©hLÔi\u0000SL|\u0098\u001fä*0á|\u008fÈµ§±ë\u0089?ìCÊ\u0097\u0017ÛxoB²¸Æç\t\u0080E\u00ad\u0091Úíñ9/u]Á\u007f\u001c\u0098hÉ\u0000CLg\u0098\u001dä(0ì|\u008dÈ¤\u0015]\u0018FTi\u0080\u0019ü4(åd\u008c", "ISO-8859-1", cArr, 0, 1281);
        f1261 = cArr;
        f1264 = -7554200149052339160L;
    }

    public cg(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ Object m1507() {
        int i10 = f1263 + 5;
        f1262 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1508();
        }
        m1508();
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static Object m1508() {
        f1263 = (f1262 + 55) % 128;
        IUnityAdsListener listener = UnityAds.getListener();
        int i10 = f1263 + 43;
        f1262 = i10 % 128;
        if (i10 % 2 == 0) {
            return listener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m1509() {
        String gameId;
        int i10 = f1262 + InterfaceC0435l1.d.b.f29112i;
        f1263 = i10 % 128;
        if (i10 % 2 == 0) {
            gameId = ClientProperties.getGameId();
            int i11 = 14 / 0;
        } else {
            gameId = ClientProperties.getGameId();
        }
        int i12 = f1262 + 5;
        f1263 = i12 % 128;
        if (i12 % 2 != 0) {
            return gameId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ String m1510() {
        int i10 = f1263 + 107;
        f1262 = i10 % 128;
        if (i10 % 2 != 0) {
            m1509();
            throw null;
        }
        String strM1509 = m1509();
        int i11 = f1263 + 11;
        f1262 = i11 % 128;
        if (i11 % 2 == 0) {
            return strM1509;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static void m1512(IUnityAdsListener iUnityAdsListener) {
        f1263 = (f1262 + 59) % 128;
        UnityAds.removeListener(iUnityAdsListener);
        f1262 = (f1263 + 99) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static Enum m1514(String str) {
        f1262 = (f1263 + 17) % 128;
        int iHashCode = str.hashCode();
        byte b10 = 0;
        if (iHashCode != 183181625) {
            if (iHashCode == 2066319421 && str.equals(m1529((char) (6144 - TextUtils.getOffsetAfter("", 0)), 1275 - Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0') + 7).intern())) {
                f1262 = (f1263 + 75) % 128;
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals(m1529((char) Color.red(0), 1266 - ExpandableListView.getPackedPositionChild(0L), 8 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
            int i10 = f1263 + 123;
            f1262 = i10 % 128;
            if (i10 % 2 != 0) {
                b10 = 1;
            }
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return WebRequestEvent.COMPLETE;
        }
        if (b10 != 1) {
            return null;
        }
        return WebRequestEvent.FAILED;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static String m1516() {
        f1263 = (f1262 + 65) % 128;
        String gameId = ClientProperties.getGameId();
        f1263 = (f1262 + 9) % 128;
        return gameId;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static UnityAdsLoadOptions m1517(AdObject adObject) {
        f1263 = (f1262 + InterfaceC0435l1.d.b.f29105b) % 128;
        UnityAdsLoadOptions loadOptions = adObject.getLoadOptions();
        int i10 = f1263 + 7;
        f1262 = i10 % 128;
        if (i10 % 2 == 0) {
            return loadOptions;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ ByteString m1518(AdObject adObject) {
        f1262 = (f1263 + 35) % 128;
        ByteString byteStringM1539 = m1539(adObject);
        f1263 = (f1262 + 119) % 128;
        return byteStringM1539;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ UnityAdsLoadOptions m1524(AdObject adObject) {
        int i10 = f1263 + InterfaceC0435l1.d.b.f29110g;
        f1262 = i10 % 128;
        if (i10 % 2 != 0) {
            m1517(adObject);
            throw null;
        }
        UnityAdsLoadOptions unityAdsLoadOptionsM1517 = m1517(adObject);
        int i11 = f1263 + 65;
        f1262 = i11 % 128;
        if (i11 % 2 == 0) {
            return unityAdsLoadOptionsM1517;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1530(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i10 = f1263 + InterfaceC0435l1.d.b.f29112i;
        f1262 = i10 % 128;
        if (i10 % 2 != 0) {
            m1526(diagnosticEvent);
            throw null;
        }
        String strM1526 = m1526(diagnosticEvent);
        f1262 = (f1263 + 51) % 128;
        return strM1526;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ BannerView.IListener m1535(BannerView bannerView) {
        int i10 = f1262 + 29;
        f1263 = i10 % 128;
        int i11 = i10 % 2;
        BannerView.IListener iListenerM1525 = m1525(bannerView);
        if (i11 == 0) {
            int i12 = 52 / 0;
        }
        return iListenerM1525;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1542(IUnityAdsListener iUnityAdsListener) {
        f1263 = (f1262 + 65) % 128;
        UnityAds.addListener(iUnityAdsListener);
        int i10 = f1262 + 5;
        f1263 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 81 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static Object m1511() {
        f1263 = (f1262 + 93) % 128;
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        int i10 = f1263 + 71;
        f1262 = i10 % 128;
        if (i10 % 2 == 0) {
            return currentApp;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1519(BannerView bannerView) {
        f1262 = (f1263 + 83) % 128;
        String strM1541 = m1541(bannerView);
        f1263 = (f1262 + 93) % 128;
        return strM1541;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1527(IUnityAdsListener iUnityAdsListener) {
        f1262 = (f1263 + InterfaceC0435l1.d.b.f29112i) % 128;
        m1512(iUnityAdsListener);
        int i10 = f1263 + 115;
        f1262 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ byte[] m1534(AdObject adObject) {
        f1263 = (f1262 + 79) % 128;
        byte[] bArrM1513 = m1513(adObject);
        f1262 = (f1263 + InterfaceC0435l1.d.b.f29107d) % 128;
        return bArrM1513;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1536(AdObject adObject) {
        int i10 = f1263 + 63;
        f1262 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1515(adObject);
        }
        m1515(adObject);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Enum m1540(String str) {
        int i10 = f1263 + InterfaceC0435l1.d.b.f29107d;
        f1262 = i10 % 128;
        byte b10 = 2;
        if (i10 % 2 != 0) {
            str.hashCode();
            throw null;
        }
        switch (str.hashCode()) {
            case -1810696374:
                if (!str.equals(m1529((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + F9.a.f26072h), Color.argb(0, 0, 0, 0) + 1258, 10 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f1262 + 1;
                    f1263 = i11 % 128;
                    b10 = i11 % 2 != 0 ? (byte) 8 : (byte) 95;
                }
                break;
            case -1166291365:
                b10 = !str.equals(m1529((char) (ViewConfiguration.getPressedStateDuration() >> 16), 1242 - ((Process.getThreadPriority(0) + 20) >> 6), AndroidCharacter.getMirror('0') - ')').intern()) ? (byte) -1 : (byte) 6;
                break;
            case -276710660:
                b10 = !str.equals(m1529((char) (34423 - Color.red(0)), 1200 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -54373961:
                b10 = !str.equals(m1529((char) (37256 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 1230 - (ViewConfiguration.getFadingEdgeLength() >> 16), 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case 63879010:
                b10 = !str.equals(m1529((char) (TextUtils.getTrimmedLength("") + 42130), 1226 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 5).intern()) ? (byte) -1 : (byte) 4;
                break;
            case 1167718561:
                if (!str.equals(m1529((char) (Gravity.getAbsoluteGravity(0, 0) + 42995), 1250 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 8).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1262 + 79;
                    f1263 = i12 % 128;
                    b10 = i12 % 2 != 0 ? (byte) 7 : (byte) 40;
                }
                break;
            case 1813675631:
                if (!str.equals(m1529((char) KeyEvent.getDeadChar(0, 0), 1211 - (ViewConfiguration.getFadingEdgeLength() >> 16), (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 7).intern())) {
                    b10 = -1;
                } else {
                    f1263 = (f1262 + 125) % 128;
                }
                break;
            case 1815350732:
                b10 = !str.equals(m1529((char) View.resolveSize(0, 0), 1218 - Drawable.resolveOpacity(0, 0), 7 - (ViewConfiguration.getTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 1926303783:
                b10 = !str.equals(m1529((char) (46618 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1193 - MotionEvent.axisFromString(""), 6 - Color.argb(0, 0, 0, 0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return WebViewEventCategory.ADUNIT;
            case 1:
                return WebViewEventCategory.VIDEOPLAYER;
            case 2:
                return WebViewEventCategory.REQUEST;
            case 3:
                return WebViewEventCategory.RESOLVE;
            case 4:
                return WebViewEventCategory.CACHE;
            case 5:
                return WebViewEventCategory.CONNECTIVITY;
            case 6:
                return WebViewEventCategory.STORAGE;
            case 7:
                return WebViewEventCategory.BROADCAST;
            case 8:
                return WebViewEventCategory.LIFECYCLE;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static byte[] m1513(AdObject adObject) {
        int i10 = f1263 + 25;
        f1262 = i10 % 128;
        int i11 = i10 % 2;
        ByteString trackingToken = adObject.getTrackingToken();
        if (i11 != 0) {
            trackingToken.toByteArray();
            throw null;
        }
        byte[] byteArray = trackingToken.toByteArray();
        int i12 = f1262 + InterfaceC0435l1.d.b.f29114k;
        f1263 = i12 % 128;
        if (i12 % 2 != 0) {
            return byteArray;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Map m1520(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        f1262 = (f1263 + 65) % 128;
        Map mapM1537 = m1537(diagnosticEvent);
        int i10 = f1263 + InterfaceC0435l1.d.b.f29107d;
        f1262 = i10 % 128;
        if (i10 % 2 == 0) {
            return mapM1537;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1528(BannerView bannerView, BannerView.IListener iListener) {
        f1262 = (f1263 + 83) % 128;
        m1523(bannerView, iListener);
        f1263 = (f1262 + 121) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1538(IUnityAdsListener iUnityAdsListener) {
        int i10 = f1263 + InterfaceC0435l1.d.b.f29107d;
        f1262 = i10 % 128;
        int i11 = i10 % 2;
        m1532(iUnityAdsListener);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f1263 + 27;
        f1262 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 9 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        switch (str.hashCode()) {
            case -2043984616:
                if (!str.equals(m1529((char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 410 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24).intern())) {
                    return null;
                }
                f1262 = (f1263 + 71) % 128;
                return BannerWebPlayerContainer.class;
            case -2015334886:
                if (!str.equals(m1529((char) ((Process.myPid() >> 22) + 40625), 745 - TextUtils.getOffsetAfter("", 0), 8 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return null;
                }
                int i10 = f1262 + 7;
                f1263 = i10 % 128;
                if (i10 % 2 == 0) {
                    return WebView.class;
                }
                return AdFormat.class;
            case -1797664962:
                if (!str.equals(m1529((char) (ViewConfiguration.getTouchSlop() >> 8), 139 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    return null;
                }
                int i11 = f1262 + 11;
                f1263 = i11 % 128;
                if (i11 % 2 == 0) {
                    return null;
                }
                return UnityMonetization.class;
            case -1769924254:
                if (str.equals(m1529((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46779), ExpandableListView.getPackedPositionType(0L) + 667, Color.argb(0, 0, 0, 0) + 8).intern())) {
                    return AdObject.class;
                }
                return null;
            case -1719935914:
                if (str.equals(m1529((char) (ImageFormat.getBitsPerPixel(0) + 1), 537 - KeyEvent.getDeadChar(0, 0), 13 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    return com.unity3d.services.banners.view.BannerView.class;
                }
                return null;
            case -1673897431:
                if (str.equals(m1529((char) (62036 - Color.alpha(0)), ExpandableListView.getPackedPositionType(0L) + 386, 15 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    return BannerErrorCode.class;
                }
                return null;
            case -1673719574:
                if (str.equals(m1529((char) ExpandableListView.getPackedPositionGroup(0L), 400 - MotionEvent.axisFromString(""), 15 - View.getDefaultSize(0, 0)).intern())) {
                    return BannerErrorInfo.class;
                }
                return null;
            case -1627944928:
                if (str.equals(m1529((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 292, 14 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    return BannerListener.class;
                }
                return null;
            case -1543737546:
                if (!str.equals(m1529((char) View.getDefaultSize(0, 0), (Process.myPid() >> 22) + 1, TextUtils.getOffsetBefore("", 0) + 16).intern())) {
                    return null;
                }
                f1263 = (f1262 + 89) % 128;
                return UnityAds.class;
            case -1347165098:
                if (str.equals(m1529((char) (Color.red(0) + 20831), Color.red(0) + 93, 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    return e.class;
                }
                return null;
            case -1258512514:
                if (str.equals(m1529((char) (Drawable.resolveOpacity(0, 0) + 51286), 753 - (Process.myTid() >> 22), 16 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    return ClientProperties.class;
                }
                return null;
            case -1251710408:
                if (!str.equals(m1529((char) ('0' - AndroidCharacter.getMirror('0')), 550 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 44 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    return null;
                }
                int i12 = f1262 + 37;
                f1263 = i12 % 128;
                if (i12 % 2 == 0) {
                    return null;
                }
                return com.unity3d.services.banners.view.BannerView.class;
            case -858834302:
                if (str.equals(m1529((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 245, 15 - KeyEvent.keyCodeFromString("")).intern())) {
                    return UnityBannerSize.class;
                }
                return null;
            case -800280637:
                if (str.equals(m1529((char) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 306, 26 - View.MeasureSpec.getMode(0)).intern())) {
                    return BannersModuleConfiguration.class;
                }
                return null;
            case -618035586:
                if (str.equals(m1529((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (Process.myTid() >> 22) + PsExtractor.PRIVATE_STREAM_1, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14).intern())) {
                    return WebView.class;
                }
                return null;
            case -598903877:
                if (!str.equals(m1529((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 56106), 157 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21).intern())) {
                    return null;
                }
                int i13 = f1263 + 27;
                f1262 = i13 % 128;
                if (i13 % 2 != 0) {
                    return null;
                }
                return ShowAdListenerAdapter.class;
            case -553681069:
                if (str.equals(m1529((char) (15346 - TextUtils.getOffsetAfter("", 0)), MotionEvent.axisFromString("") + 676, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33).intern())) {
                    return AndroidFullscreenWebViewAdPlayer.class;
                }
                return null;
            case -327500225:
                if (str.equals(m1529((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20820), 120 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20).intern())) {
                    return WebViewEventCategory.class;
                }
                return null;
            case -324825325:
                if (str.equals(m1529((char) (46348 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.lastIndexOf("", '0') + 770, (ViewConfiguration.getFadingEdgeLength() >> 16) + 15).intern())) {
                    return DiagnosticEventRequestOuterClass.DiagnosticEvent.class;
                }
                return null;
            case -324012869:
                if (str.equals(m1529((char) (54579 - Color.red(0)), Color.argb(0, 0, 0, 0) + 204, (ViewConfiguration.getLongPressTimeout() >> 16) + 10).intern())) {
                    return WebRequest.class;
                }
                return null;
            case -262912338:
                if (str.equals(m1529((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 53017), (ViewConfiguration.getTapTimeout() >> 16) + 281, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10).intern())) {
                    return BannerEvent.class;
                }
                return null;
            case -249507173:
                if (str.equals(m1529((char) (21180 - View.MeasureSpec.getSize(0)), View.resolveSize(0, 0) + 618, 48 - Process.getGidForName("")).intern())) {
                    return FullScreenWebViewDisplay.class;
                }
                return null;
            case -133620343:
                if (str.equals(m1529((char) (65189 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 178 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 11 - View.MeasureSpec.getMode(0)).intern())) {
                    return CustomEvent.class;
                }
                return null;
            case -30759555:
                if (str.equals(m1529((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, 25 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    return IUnityAdsListener.class;
                }
                return null;
            case 29694293:
                if (str.equals(m1529((char) (8079 - MotionEvent.axisFromString("")), Color.alpha(0) + 784, (ViewConfiguration.getEdgeSlop() >> 16) + 21).intern())) {
                    return IUnityAdsShowListener.class;
                }
                return null;
            case 67119908:
                if (!str.equals(m1529((char) Color.argb(0, 0, 0, 0), 594 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 24).intern())) {
                    return null;
                }
                int i14 = f1262 + 97;
                f1263 = i14 % 128;
                if (i14 % 2 == 0) {
                    return null;
                }
                return FullScreenWebViewDisplay.class;
            case 252148886:
                if (!str.equals(m1529((char) (36351 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 214 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 14 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    return null;
                }
                f1263 = (f1262 + 81) % 128;
                return AdUnitActivity.class;
            case 539301490:
                if (str.equals(m1529((char) (22448 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 726 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20).intern())) {
                    return UnityAdsBaseOptions.class;
                }
                return null;
            case 626721475:
                if (str.equals(m1529((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 3405), '{' - AndroidCharacter.getMirror('0'), 18 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    return WebViewApp.class;
                }
                return null;
            case 692588017:
                if (str.equals(m1529((char) View.resolveSize(0, 0), 465 - KeyEvent.keyCodeFromString(""), Color.blue(0) + 15).intern())) {
                    return BannerViewCache.class;
                }
                return null;
            case 819533772:
                if (!str.equals(m1529((char) (ViewConfiguration.getPressedStateDuration() >> 16), 480 - (ViewConfiguration.getPressedStateDuration() >> 16), 20 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    return null;
                }
                f1263 = (f1262 + 73) % 128;
                return IUnityBannerListener.class;
            case 961427118:
                if (str.equals(m1529((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 33954), TextUtils.indexOf("", "") + 271, TextUtils.getCapsMode("", 0, 0) + 10).intern())) {
                    return BannerHide.class;
                }
                return null;
            case 961754217:
                if (!str.equals(m1529((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41175), 262 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 11).intern())) {
                    return null;
                }
                int i15 = f1262 + 67;
                f1263 = i15 % 128;
                if (i15 % 2 == 0) {
                    return null;
                }
                return BannerShow.class;
            case 961844241:
                if (str.equals(m1529((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 416, 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    return BannerView.class;
                }
                return null;
            case 1067215379:
                if (str.equals(m1529((char) TextUtils.indexOf("", ""), View.MeasureSpec.makeMeasureSpec(0, 0) + 426, 39 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    return BannerView.class;
                }
                return null;
            case 1246120607:
                if (str.equals(m1529((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + InterfaceC0435l1.d.b.f29108e, 15 - TextUtils.getTrimmedLength("")).intern())) {
                    return WebRequestEvent.class;
                }
                return null;
            case 1326268204:
                if (str.equals(m1529((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 500 - TextUtils.getOffsetAfter("", 0), 19 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    return BannerView.IListener.class;
                }
                return null;
            case 1374920114:
                if (str.equals(m1529((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 234, 12 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return UnityBanners.class;
                }
                return null;
            case 1407526303:
                if (str.equals(m1529((char) (MotionEvent.axisFromString("") + 1), 331 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.green(0) + 16).intern())) {
                    return BannerProperties.class;
                }
                return null;
            case 1646468069:
                if (str.equals(m1529((char) (50682 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 519, 17 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    return BannerView.Listener.class;
                }
                return null;
            case 1658279126:
                if (str.equals(m1529((char) (50704 - MotionEvent.axisFromString("")), (Process.myTid() >> 22) + 42, (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 33).intern())) {
                    return IUnityAdsExtendedListener.class;
                }
                return null;
            case 1982491468:
                if (str.equals(m1529((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 229, 7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    return Banner.class;
                }
                return null;
            case 2020034237:
                if (str.equals(m1529((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 707 - Color.blue(0), 19 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    return UnityAdsLoadOptions.class;
                }
                return null;
            case 2068667541:
                if (str.equals(m1529((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 347, 14 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return BannerPosition.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1521(UnityAdsLoadOptions unityAdsLoadOptions) {
        int i10 = f1263 + 27;
        f1262 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM1531 = m1531(unityAdsLoadOptions);
        if (i11 != 0) {
            int i12 = 93 / 0;
        }
        return jSONObjectM1531;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static BannerView.IListener m1525(BannerView bannerView) {
        int i10 = f1263 + 1;
        f1262 = i10 % 128;
        if (i10 % 2 == 0) {
            return bannerView.getListener();
        }
        bannerView.getListener();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1529((char) (64491 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 805, 20 - View.MeasureSpec.getSize(0)).intern(), new be.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1511();
            }
        });
        map.put(m1529((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.red(0) + 825, 18 - TextUtils.indexOf("", "", 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.this.m1543(list.get(0), ckVar);
            }
        });
        map.put(m1529((char) (14171 - KeyEvent.getDeadChar(0, 0)), 843 - (KeyEvent.getMaxKeyCode() >> 16), 20 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new be.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cg.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                cg.m1533(list.get(0));
                return null;
            }
        });
        map.put(m1529((char) ((ViewConfiguration.getTouchSlop() >> 8) + 18492), (Process.myPid() >> 22) + 863, 9 - TextUtils.getCapsMode("", 0, 0)).intern(), new be.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cg.16
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1516();
            }
        });
        map.put(m1529((char) (17381 - View.combineMeasuredStates(0, 0)), 872 - (ViewConfiguration.getTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 19).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.18
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1507();
            }
        });
        map.put(m1529((char) View.MeasureSpec.makeMeasureSpec(0, 0), 891 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 18 - ExpandableListView.getPackedPositionChild(0L)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.19
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                cg.m1538((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1529((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 911, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.17
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                cg.m1522((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1529((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 11346), 929 - View.MeasureSpec.makeMeasureSpec(0, 0), 22 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.20
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                cg.m1527((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1529((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9222), 951 - TextUtils.indexOf("", ""), 23 - ExpandableListView.getPackedPositionGroup(0L)).intern(), new be.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cg.22
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1540((String) list.get(0));
            }
        });
        map.put(m1529((char) (27462 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 975 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new be.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1514((String) list.get(0));
            }
        });
        map.put(m1529((char) View.resolveSize(0, 0), 992 - (ViewConfiguration.getEdgeSlop() >> 16), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1519((BannerView) list.get(0));
            }
        });
        map.put(m1529((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18313), 1006 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1535((BannerView) list.get(0));
            }
        });
        map.put(m1529((char) (29260 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, TextUtils.indexOf((CharSequence) "", '0', 0) + 18).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                cg.m1528((BannerView) list.get(0), (BannerView.IListener) list.get(1));
                return null;
            }
        });
        map.put(m1529((char) (Color.blue(0) + 64846), 1040 - TextUtils.getOffsetAfter("", 0), 16 - View.combineMeasuredStates(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1518((AdObject) list.get(0));
            }
        });
        map.put(m1529((char) (View.getDefaultSize(0, 0) + 34149), Color.blue(0) + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, Gravity.getAbsoluteGravity(0, 0) + 26).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1536((AdObject) list.get(0));
            }
        });
        map.put(m1529((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8074), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1083, 14 - TextUtils.getOffsetAfter("", 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1524((AdObject) list.get(0));
            }
        });
        map.put(m1529((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7006), 1096 - ((Process.getThreadPriority(0) + 20) >> 6), 6 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1521((UnityAdsLoadOptions) list.get(0));
            }
        });
        map.put(m1529((char) ((KeyEvent.getMaxKeyCode() >> 16) + 47951), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1103, 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1510();
            }
        });
        map.put(m1529((char) (TextUtils.getOffsetBefore("", 0) + 40042), 1133 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1530((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        map.put(m1529((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1165, 13 - KeyEvent.normalizeMetaState(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1520((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        map.put(m1529((char) (59525 - ExpandableListView.getPackedPositionGroup(0L)), View.MeasureSpec.getMode(0) + 1178, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 15).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cg.m1534((AdObject) list.get(0));
            }
        });
        f1263 = (f1262 + InterfaceC0435l1.d.b.f29112i) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1522(IUnityAdsListener iUnityAdsListener) {
        int i10 = f1262 + 81;
        f1263 = i10 % 128;
        int i11 = i10 % 2;
        m1542(iUnityAdsListener);
        if (i11 == 0) {
            int i12 = 49 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1526(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i10 = f1262 + 91;
        f1263 = i10 % 128;
        if (i10 % 2 == 0) {
            diagnosticEvent.getPlacementId();
            throw null;
        }
        String placementId = diagnosticEvent.getPlacementId();
        f1263 = (f1262 + 59) % 128;
        return placementId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        return r4.split(m1529((char) (android.view.View.getDefaultSize(0, 0) + 33022), android.view.ViewConfiguration.getLongPressTimeout() >> 16, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern())[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.cg.f1262 = (com.ironsource.adqualitysdk.sdk.i.cg.f1263 + 67) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4 != null) goto L9;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String mo793() {
        /*
            r4 = this;
            int r4 = com.ironsource.adqualitysdk.sdk.i.cg.f1262
            int r4 = r4 + 27
            int r0 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.cg.f1263 = r0
            int r4 = r4 % 2
            r0 = 0
            if (r4 != 0) goto L17
            java.lang.String r4 = com.unity3d.ads.UnityAds.getVersion()
            r1 = 89
            int r1 = r1 / r0
            if (r4 == 0) goto L43
            goto L1d
        L17:
            java.lang.String r4 = com.unity3d.ads.UnityAds.getVersion()
            if (r4 == 0) goto L43
        L1d:
            r1 = 33022(0x80fe, float:4.6274E-41)
            int r2 = android.view.View.getDefaultSize(r0, r0)
            int r2 = r2 + r1
            char r1 = (char) r2
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            int r2 = r2 >> 16
            int r3 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r3 = r3 >> 24
            int r3 = r3 + 1
            java.lang.String r1 = m1529(r1, r2, r3)
            java.lang.String r1 = r1.intern()
            java.lang.String[] r4 = r4.split(r1)
            r4 = r4[r0]
            return r4
        L43:
            int r4 = com.ironsource.adqualitysdk.sdk.i.cg.f1263
            int r4 = r4 + 67
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.cg.f1262 = r4
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cg.mo793():java.lang.String");
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c extends be {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f1281 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f1282 = 219;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f1283 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean f1284 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static boolean f1285 = true;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f1286 = {264, 284, 319, 304, 329, 324, 335, 318, 337, 340, 330, 328, 265, 336, 270, 334, 320, 333, 316, 285, 305, 338, 317};

        public c(String str) {
            super(str);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.be
        /* JADX INFO: renamed from: ﻐ */
        public final String mo793() {
            int i10 = f1283 + 63;
            f1281 = i10 % 128;
            if (i10 % 2 == 0) {
                UnityAds.getVersion();
                throw null;
            }
            String version = UnityAds.getVersion();
            if (version == null) {
                return null;
            }
            String str = version.split(m1544(null, 127 - View.resolveSize(0, 0), null, "\u0081").intern())[0];
            f1281 = (f1283 + 13) % 128;
            return str;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.be
        /* JADX INFO: renamed from: ｋ */
        public final Class mo794(String str) {
            int i10 = f1281 + 9;
            f1283 = i10 % 128;
            if (i10 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            byte b10 = -1;
            switch (str.hashCode()) {
                case 252148886:
                    if (str.equals(m1544(null, 127 - Color.argb(0, 0, 0, 0), null, "\u008a\u0087\u0086\u0089\u0086\u0087\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082").intern())) {
                        f1283 = (f1281 + InterfaceC0435l1.d.b.f29114k) % 128;
                        b10 = 0;
                    }
                    break;
                case 961844241:
                    if (str.equals(m1544(null, 128 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), null, "\u0096\u0091\u0086\u0095\u0092\u0091\u0085\u0085\u0093\u0094").intern())) {
                        int i11 = f1281 + 3;
                        f1283 = i11 % 128;
                        b10 = i11 % 2 == 0 ? (byte) 2 : (byte) 5;
                    }
                    break;
                case 1067215379:
                    if (str.equals(m1544(null, View.MeasureSpec.getMode(0) + 127, null, "\u0096\u0091\u0086\u0095\u0092\u0091\u0085\u0085\u0093\u0094\u008d\u0090\u0092\u0091\u0085\u0085\u0093\u0097\u008d\u0090\u0091\u0088\u0086\u0089\u0092\u0091\u0090\u008d\u0083\u008f\u008a\u0087\u0086\u0085\u008e\u008d\u008c\u008b\u0088").intern())) {
                        b10 = 3;
                    }
                    break;
                case 1531208100:
                    if (str.equals(m1544(null, View.resolveSizeAndState(0, 0, 0) + 127, null, "\u008a\u0087\u0086\u0089\u0086\u0087\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u008d\u0087\u0086\u0085\u008e\u0083\u0093\u008d\u0090\u0083\u0093\u008d\u0090\u0091\u0088\u0086\u0089\u0092\u0091\u0090\u008d\u0083\u008f\u008a\u0087\u0086\u0085\u008e\u008d\u008c\u008b\u0088").intern())) {
                        b10 = 1;
                    }
                    break;
            }
            if (b10 == 0 || b10 == 1) {
                return AdUnitActivity.class;
            }
            if (b10 == 2 || b10 == 3) {
                return BannerView.class;
            }
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.be
        /* JADX INFO: renamed from: ﾇ */
        public final Map<String, be.c> mo795() {
            HashMap map = new HashMap();
            int i10 = f1283 + 95;
            f1281 = i10 % 128;
            if (i10 % 2 != 0) {
                return map;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m1544(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f1286;
                    int i11 = f1282;
                    if (f1285) {
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
                    if (f1284) {
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

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m1515(AdObject adObject) {
        int i10 = f1262 + 1;
        f1263 = i10 % 128;
        if (i10 % 2 == 0) {
            adObject.getPlacementId();
            throw null;
        }
        String placementId = adObject.getPlacementId();
        int i11 = f1263 + 95;
        f1262 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 68 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1523(BannerView bannerView, BannerView.IListener iListener) {
        f1262 = (f1263 + 69) % 128;
        bannerView.setListener(iListener);
        int i10 = f1263 + 117;
        f1262 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1541(BannerView bannerView) {
        int i10 = f1262 + 115;
        f1263 = i10 % 128;
        if (i10 % 2 != 0) {
            return bannerView.getPlacementId();
        }
        bannerView.getPlacementId();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static ByteString m1539(AdObject adObject) {
        int i10 = f1262 + 5;
        f1263 = i10 % 128;
        if (i10 % 2 == 0) {
            adObject.getOpportunityId();
            throw null;
        }
        ByteString opportunityId = adObject.getOpportunityId();
        f1263 = (f1262 + 19) % 128;
        return opportunityId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1543(Object obj, ck ckVar) {
        e eVar = new e((WebViewApp) obj, ckVar);
        f1263 = (f1262 + 85) % 128;
        return eVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map m1537(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        f1263 = (f1262 + 83) % 128;
        Map<String, String> stringTagsMap = diagnosticEvent.getStringTagsMap();
        f1262 = (f1263 + InterfaceC0435l1.d.b.f29105b) % 128;
        return stringTagsMap;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1532(IUnityAdsListener iUnityAdsListener) {
        f1263 = (f1262 + 35) % 128;
        UnityAds.setListener(iUnityAdsListener);
        f1262 = (f1263 + 3) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m1533(Object obj) {
        f1263 = (f1262 + 21) % 128;
        WebViewApp.setCurrentApp((e) obj);
        int i10 = f1263 + 93;
        f1262 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 50 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m1531(UnityAdsLoadOptions unityAdsLoadOptions) {
        f1263 = (f1262 + 41) % 128;
        JSONObject data = unityAdsLoadOptions.getData();
        f1262 = (f1263 + 39) % 128;
        return data;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1529(char c4, int i10, int i11) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1153) {
            try {
                char[] cArr = new char[i11];
                com.ironsource.adqualitysdk.sdk.i.c.f1154 = 0;
                while (true) {
                    int i12 = com.ironsource.adqualitysdk.sdk.i.c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1261[i10 + i12]) ^ (((long) i12) * f1264)) ^ ((long) c4));
                        com.ironsource.adqualitysdk.sdk.i.c.f1154 = i12 + 1;
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
