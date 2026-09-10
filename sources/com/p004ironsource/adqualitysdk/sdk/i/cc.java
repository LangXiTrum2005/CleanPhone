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
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
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
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class cc extends bg {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1185 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1187 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1188 = 29;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1190 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f1192 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1189 = {'J', 'r', 139, 134, 145, 150, '^', 129, 144, 'f', 'i', 130, 143, 'b', 149, 'q', '_', 't', 127, 's', 148, 141, 'o', 142, 146, 147, 'j', 140, 151, '~', '`', 138, 128, 'p', 133, 'e', 137, 131, 132, 'm', 'l', 'd', 'a', 'v', 'n', 'c'};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f1184 = 11262;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f1186 = 13939;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1183 = 41215;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1191 = 1009;

    public class a extends WebViewApp implements hg<WebViewApp> {

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static int f1201 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f1202 = 16526;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f1203 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f1204 = 43528;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f1205 = 6;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char[] f1206 = {'W', 'e', 'b', 'V', 'i', 'w', 'A', 'p', '.', 's', 't', 'F', 'a', 'l', AbstractJsonLexerKt.UNICODE_ESC, 'r', 'M', 'g', 'C', 'o', 'd', 'I', 'n', 'z', 'v', 'k', 'h', 'c', 'm', 'E', 'S', 'X', 'Y', 'Z', AbstractJsonLexerKt.BEGIN_LIST, '\\'};

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f1207 = 58902;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f1208 = 5570;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private WebViewApp f1210;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ch f1211;

        public a(WebViewApp webViewApp, ch chVar) {
            this.f1210 = webViewApp;
            this.f1211 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private WebViewApp m1421() {
            int i2 = f1203 + 105;
            f1201 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.f1210;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m1423(byte b2, String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (i.f2343) {
                try {
                    char[] cArr2 = f1206;
                    char c2 = f1205;
                    char[] cArr3 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr3[i2] = (char) (cArr[i2] - b2);
                    }
                    if (i2 > 1) {
                        i.f2348 = 0;
                        while (true) {
                            int i3 = i.f2348;
                            if (i3 >= i2) {
                                break;
                            }
                            i.f2347 = cArr[i3];
                            i.f2345 = cArr[i.f2348 + 1];
                            if (i.f2347 == i.f2345) {
                                cArr3[i.f2348] = (char) (i.f2347 - b2);
                                cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                            } else {
                                i.f2346 = i.f2347 / c2;
                                i.f2342 = i.f2347 % c2;
                                i.f2344 = i.f2345 / c2;
                                i.f2341 = i.f2345 % c2;
                                if (i.f2342 == i.f2341) {
                                    i.f2346 = com.google.firebase.crashlytics.internal.model.a.b(i.f2346, c2, 1, c2);
                                    i.f2344 = com.google.firebase.crashlytics.internal.model.a.b(i.f2344, c2, 1, c2);
                                    int i4 = (i.f2346 * c2) + i.f2342;
                                    int i5 = (i.f2344 * c2) + i.f2341;
                                    int i6 = i.f2348;
                                    cArr3[i6] = cArr2[i4];
                                    cArr3[i6 + 1] = cArr2[i5];
                                } else if (i.f2346 == i.f2344) {
                                    i.f2342 = com.google.firebase.crashlytics.internal.model.a.b(i.f2342, c2, 1, c2);
                                    i.f2341 = com.google.firebase.crashlytics.internal.model.a.b(i.f2341, c2, 1, c2);
                                    int i7 = (i.f2346 * c2) + i.f2342;
                                    int i8 = (i.f2344 * c2) + i.f2341;
                                    int i9 = i.f2348;
                                    cArr3[i9] = cArr2[i7];
                                    cArr3[i9 + 1] = cArr2[i8];
                                } else {
                                    int i10 = (i.f2346 * c2) + i.f2341;
                                    int i11 = (i.f2344 * c2) + i.f2342;
                                    int i12 = i.f2348;
                                    cArr3[i12] = cArr2[i10];
                                    cArr3[i12 + 1] = cArr2[i11];
                                }
                            }
                            i.f2348 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x005b  */
        @Override // com.unity3d.services.core.webview.WebViewApp
        public void addCallback(NativeCallback nativeCallback) {
            int i2 = f1203 + 21;
            f1201 = i2 % 128;
            if (i2 % 2 == 0) {
                cc ccVar = cc.this;
                ch chVar = this.f1211;
                String strIntern = m1423((byte) (22 << View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bßß\u0006\u000eÓÓ\u0018\u0012ÛÛ\u0000\u000e\u001c\u001a", ((byte) KeyEvent.getModifierMetaStateMask()) * 113).intern();
                Object[] objArr = new Object[0];
                objArr[0] = nativeCallback;
                ccVar.m790(this, chVar, strIntern, objArr);
                if (this.f1210 != null) {
                    this.f1210.addCallback(nativeCallback);
                }
            } else {
                cc.this.m790(this, this.f1211, m1423((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 111), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bßß\u0006\u000eÓÓ\u0018\u0012ÛÛ\u0000\u000e\u001c\u001a", ((byte) KeyEvent.getModifierMetaStateMask()) + 23).intern(), nativeCallback);
                if (this.f1210 != null) {
                    this.f1210.addCallback(nativeCallback);
                }
            }
            int i3 = f1203 + 59;
            f1201 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public NativeCallback getCallback(String str) {
            int i2 = f1203 + 25;
            f1201 = i2 % 128;
            if (i2 % 2 == 0) {
                cc ccVar = cc.this;
                ch chVar = this.f1211;
                String strIntern = m1422("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆鈒퇑ꐇ⠢\ueb4c⪕㓀늏", 117 / (TypedValue.complexToFloat(0) > 1.0f ? 1 : (TypedValue.complexToFloat(0) == 1.0f ? 0 : -1))).intern();
                Object[] objArr = new Object[1];
                objArr[1] = str;
                ccVar.m790(this, chVar, strIntern, objArr);
                if (this.f1210 == null) {
                    return null;
                }
            } else {
                cc.this.m790(this, this.f1211, m1422("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆鈒퇑ꐇ⠢\ueb4c⪕㓀늏", 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), str);
                if (this.f1210 == null) {
                    return null;
                }
            }
            f1201 = (f1203 + 93) % 128;
            NativeCallback callback = this.f1210.getCallback(str);
            int i3 = f1201 + 51;
            f1203 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 18 / 0;
            }
            return callback;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public Configuration getConfiguration() {
            cc.this.m790(this, this.f1211, m1422("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆\ue894렶櫤\u0992枖뙹㡢李挫ᕕꧪ圪꿌럥", Color.rgb(0, 0, 0) + 16777243).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1210;
            if (webViewApp != null) {
                f1201 = (f1203 + 27) % 128;
                return webViewApp.getConfiguration();
            }
            f1201 = (f1203 + 69) % 128;
            return null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public ErrorState getErrorStateFromWebAppCode() {
            f1201 = (f1203 + 51) % 128;
            cc.this.m790(this, this.f1211, m1423((byte) (22 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0085\u0085\u000b\u000e\u0004\u0007\u001b\u0011\r\u0015\f!\u0006\u0010\u0007\u0004\t\u0011\u0016\u0019\u0001\u0002\u0000\b\u0085\u0085\u0013\u0014\u0013\u0002", 38 - KeyEvent.getDeadChar(0, 0)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1210;
            if (webViewApp == null) {
                int i2 = f1203 + 67;
                f1201 = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i3 = f1203 + 17;
            f1201 = i3 % 128;
            if (i3 % 2 != 0) {
                return webViewApp.getErrorStateFromWebAppCode();
            }
            webViewApp.getErrorStateFromWebAppCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
        
            if (r6.f1210 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
        
            if (r6.f1210 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
        
            com.ironsource.adqualitysdk.sdk.i.cc.a.f1201 = (com.ironsource.adqualitysdk.sdk.i.cc.a.f1203 + 39) % 128;
            r0 = r6.f1210.getWebAppFailureCode();
            com.ironsource.adqualitysdk.sdk.i.cc.a.f1203 = (com.ironsource.adqualitysdk.sdk.i.cc.a.f1201 + 91) % 128;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getWebAppFailureCode() {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f1203
                int r0 = r0 + 15
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f1201 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆者뭇䌤\ue822ﭶ\uf891衍鋣裊鞹㡢李贘ȫ\uf7d6\uf4d0\uea28捔"
                r2 = 0
                if (r0 != 0) goto L2e
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.p004ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f1211
                int r4 = android.view.ViewConfiguration.getKeyRepeatTimeout()
                int r4 = r4 >> 10
                r5 = 41
                int r5 = r5 / r4
                java.lang.String r1 = m1422(r1, r5)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m790(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1210
                if (r0 == 0) goto L62
                goto L4b
            L2e:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.p004ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f1211
                int r4 = android.view.ViewConfiguration.getKeyRepeatTimeout()
                int r4 = r4 >> 16
                int r4 = 31 - r4
                java.lang.String r1 = m1422(r1, r4)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m790(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1210
                if (r0 == 0) goto L62
            L4b:
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f1203
                int r0 = r0 + 39
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f1201 = r0
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1210
                int r0 = r0.getWebAppFailureCode()
                int r1 = com.ironsource.adqualitysdk.sdk.i.cc.a.f1201
                int r1 = r1 + 91
                int r1 = r1 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f1203 = r1
                return r0
            L62:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.a.getWebAppFailureCode():int");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public String getWebAppFailureMessage() {
            int i2 = f1203 + 71;
            f1201 = i2 % 128;
            if (i2 % 2 == 0) {
                cc.this.m790(this, this.f1211, m1422("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆者뭇䌤\ue822ﭶ\uf891衍鋣裊鞹㡢李펿▋渴\ue99c䧍㣻銥뎼", 19 >> Gravity.getAbsoluteGravity(1, 0)).intern(), new Object[1]);
                if (this.f1210 == null) {
                    return null;
                }
            } else {
                cc.this.m790(this, this.f1211, m1422("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆者뭇䌤\ue822ﭶ\uf891衍鋣裊鞹㡢李펿▋渴\ue99c䧍㣻銥뎼", Gravity.getAbsoluteGravity(0, 0) + 34).intern(), new Object[0]);
                if (this.f1210 == null) {
                    return null;
                }
            }
            int i3 = f1203 + 45;
            f1201 = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f1210.getWebAppFailureMessage();
            }
            int i4 = 21 / 0;
            return this.f1210.getWebAppFailureMessage();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
        
            return r6.f1210.getWebView();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f1203 + 13;
            com.ironsource.adqualitysdk.sdk.i.cc.a.f1201 = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
        
            if ((r0 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
        
            if (r6.f1210 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
        
            if (r6.f1210 != null) goto L9;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.unity3d.services.core.webview.WebView getWebView() {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f1201
                int r0 = r0 + 49
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f1203 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bàà\u000b\u000e\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002ç"
                r2 = 0
                if (r0 == 0) goto L37
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.p004ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f1211
                float r4 = android.media.AudioTrack.getMaxVolume()
                r5 = 1065353216(0x3f800000, float:1.0)
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                int r4 = 105 - r4
                byte r4 = (byte) r4
                int r2 = android.view.KeyEvent.normalizeMetaState(r2)
                int r2 = 96 - r2
                java.lang.String r1 = m1423(r4, r1, r2)
                java.lang.String r1 = r1.intern()
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.m790(r6, r3, r1, r2)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1210
                if (r0 == 0) goto L63
                goto L5c
            L37:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.p004ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f1211
                float r4 = android.media.AudioTrack.getMaxVolume()
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                int r4 = r4 + 111
                byte r4 = (byte) r4
                int r5 = android.view.KeyEvent.normalizeMetaState(r2)
                int r5 = 21 - r5
                java.lang.String r1 = m1423(r4, r1, r5)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.m790(r6, r3, r1, r2)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1210
                if (r0 == 0) goto L63
            L5c:
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1210
                com.unity3d.services.core.webview.WebView r0 = r0.getWebView()
                return r0
            L63:
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f1203
                int r0 = r0 + 13
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f1201 = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 == 0) goto L71
                return r1
            L71:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.a.getWebView():com.unity3d.services.core.webview.WebView");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean invokeCallback(Invocation invocation) {
            cc.this.m790(this, this.f1211, m1423((byte) (13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b||\n\u0002\u0012\u001c\u0019\u001f\u0000\u0013\r\u000e\u000e\u0001\u000f\u0018w", ((byte) KeyEvent.getModifierMetaStateMask()) + 26).intern(), invocation);
            WebViewApp webViewApp = this.f1210;
            if (webViewApp == null) {
                return false;
            }
            int i2 = f1203 + 113;
            f1201 = i2 % 128;
            if (i2 % 2 == 0) {
                webViewApp.invokeCallback(invocation);
                throw null;
            }
            boolean zInvokeCallback = webViewApp.invokeCallback(invocation);
            f1203 = (f1201 + 85) % 128;
            return zInvokeCallback;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
        public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
            f1203 = (f1201 + 57) % 128;
            cc.this.m790(this, this.f1211, m1423((byte) (56 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b¨¨\n\u0002\u0012\u001c\u0019\u001f\u0004\r\u0004\u0007\u0019\u0014\u009c", 23 - Color.blue(0)).intern(), str, str2, method, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1210;
            if (webViewApp == null) {
                return false;
            }
            f1201 = (f1203 + 101) % 128;
            return webViewApp.invokeMethod(str, str2, method, objArr);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
        
            if (r6.f1210 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
        
            if (r6.f1210 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
        
            r0 = r6.f1210.isWebAppInitialized();
            r1 = com.ironsource.adqualitysdk.sdk.i.cc.a.f1201 + 111;
            com.ironsource.adqualitysdk.sdk.i.cc.a.f1203 = r1 % 128;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isWebAppInitialized() {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f1201
                int r0 = r0 + 77
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f1203 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891\ud97d᱀ꌭ鉌淬顧ꫯ浡⩍촻\ud84dᾘ澝凒㢆ᥠ棙ₓἥ騦"
                r2 = 0
                if (r0 == 0) goto L2c
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.p004ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f1211
                r4 = 24
                int r5 = android.graphics.ImageFormat.getBitsPerPixel(r2)
                int r4 = r4 >>> r5
                java.lang.String r1 = m1422(r1, r4)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m790(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1210
                if (r0 == 0) goto L5c
                goto L47
            L2c:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.p004ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f1211
                int r4 = android.graphics.ImageFormat.getBitsPerPixel(r2)
                int r4 = r4 + 31
                java.lang.String r1 = m1422(r1, r4)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m790(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1210
                if (r0 == 0) goto L5c
            L47:
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f1210
                boolean r0 = r0.isWebAppInitialized()
                int r1 = com.ironsource.adqualitysdk.sdk.i.cc.a.f1201
                int r1 = r1 + 111
                int r2 = r1 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f1203 = r2
                int r1 = r1 % 2
                if (r1 != 0) goto L5a
                return r0
            L5a:
                r0 = 0
                throw r0
            L5c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.a.isWebAppInitialized():boolean");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppLoaded() {
            f1201 = (f1203 + 65) % 128;
            cc.this.m790(this, this.f1211, m1422("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891\ud97d᱀ꌭ鉌淬顧ꫯ浡₤િ䂶频㸂菒曡\uede7", (ViewConfiguration.getLongPressTimeout() >> 16) + 25).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1210;
            if (webViewApp == null) {
                int i2 = f1201 + 97;
                f1203 = i2 % 128;
                if (i2 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            int i3 = f1203 + 101;
            f1201 = i3 % 128;
            if (i3 % 2 == 0) {
                webViewApp.isWebAppLoaded();
                throw null;
            }
            boolean zIsWebAppLoaded = webViewApp.isWebAppLoaded();
            int i4 = f1203 + 9;
            f1201 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 0;
            }
            return zIsWebAppLoaded;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void removeCallback(NativeCallback nativeCallback) {
            f1201 = (f1203 + 103) % 128;
            cc.this.m790(this, this.f1211, m1423((byte) (125 - TextUtils.indexOf("", "")), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bíí\t\u000e\u0004\u0019\u0012\u0019\u0000\u0013\r\u000e\u000e\u0001\u000f\u0018è", 25 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), nativeCallback);
            WebViewApp webViewApp = this.f1210;
            if (webViewApp != null) {
                webViewApp.removeCallback(nativeCallback);
                f1201 = (f1203 + 113) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void resetWebViewAppInitialization() {
            f1203 = (f1201 + 61) % 128;
            cc.this.m790(this, this.f1211, m1423((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 92), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bËË\t\u000e\u0003\u0007\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bËË\u0016\u0017\n\u0010\u0000\u0010\u0010\u0001\u0012\u0011\u0010\n\u0014\u0017", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1210;
            if (webViewApp != null) {
                webViewApp.resetWebViewAppInitialization();
                f1201 = (f1203 + 53) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean sendEvent(Enum r6, Enum r7, Object... objArr) {
            f1201 = (f1203 + 75) % 128;
            cc.this.m790(this, this.f1211, m1422("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891텈\uf681礃뙰\uf479漨쏎扸ﶳ럥", 20 - Drawable.resolveOpacity(0, 0)).intern(), r6, r7, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1210;
            if (webViewApp == null) {
                return false;
            }
            boolean zSendEvent = webViewApp.sendEvent(r6, r7, objArr);
            f1201 = (f1203 + 7) % 128;
            return zSendEvent;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0050  */
        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setConfiguration(Configuration configuration) {
            int i2 = f1201 + 123;
            f1203 = i2 % 128;
            if (i2 % 2 != 0) {
                cc ccVar = cc.this;
                ch chVar = this.f1211;
                String strIntern = m1422("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891텈\uf681絉盆\ue894렶櫤\u0992枖뙹㡢李挫ᕕꧪ圪꿌럥", 116 << (ViewConfiguration.getJumpTapTimeout() << 6)).intern();
                Object[] objArr = new Object[1];
                objArr[1] = configuration;
                ccVar.m790(this, chVar, strIntern, objArr);
                if (this.f1210 != null) {
                    this.f1210.setConfiguration(configuration);
                }
            } else {
                cc.this.m790(this, this.f1211, m1422("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891텈\uf681絉盆\ue894렶櫤\u0992枖뙹㡢李挫ᕕꧪ圪꿌럥", 27 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), configuration);
                if (this.f1210 != null) {
                    this.f1210.setConfiguration(configuration);
                }
            }
            f1201 = (f1203 + 71) % 128;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureCode(int i2) {
            f1203 = (f1201 + 13) % 128;
            cc.this.m790(this, this.f1211, m1423((byte) (17 - (ViewConfiguration.getJumpTapTimeout() >> 16)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0081\u0081\t\n\u0004\u0007\u0001\u0002\u0000\b\u0081\u0081\u0006\u0011\u0001\u0010\u000f\u0010\u0000\u0013\u0014\u0015v", (Process.myTid() >> 22) + 31).intern(), Integer.valueOf(i2));
            WebViewApp webViewApp = this.f1210;
            if (webViewApp != null) {
                f1201 = (f1203 + 61) % 128;
                webViewApp.setWebAppFailureCode(i2);
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureMessage(String str) {
            f1201 = (f1203 + 105) % 128;
            cc.this.m790(this, this.f1211, m1423((byte) (View.combineMeasuredStates(0, 0) + 83), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÃÃ\t\n\u0004\u0007\u0001\u0002\u0000\bÃÃ\u0006\u0011\u0001\u0010\u000f\u0010\u0004\r\u0003\u0007\u0006\u000f\r\u0005", Process.getGidForName("") + 35).intern(), str);
            WebViewApp webViewApp = this.f1210;
            if (webViewApp != null) {
                webViewApp.setWebAppFailureMessage(str);
            }
            f1201 = (f1203 + 51) % 128;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppInitialized(boolean z2) {
            f1203 = (f1201 + 55) % 128;
            cc.this.m790(this, this.f1211, m1423((byte) (TextUtils.getOffsetBefore("", 0) + 22), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0086\u0086\t\n\u0004\u0007\u0001\u0002\u0000\b\u0086\u0086\u0016\u0017\n\u0010\u0000\u0010\u0010\u0001\u0013\u0005z", 30 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), Boolean.valueOf(z2));
            WebViewApp webViewApp = this.f1210;
            if (webViewApp != null) {
                webViewApp.setWebAppInitialized(z2);
                f1201 = (f1203 + 121) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppLoaded(boolean z2) {
            f1201 = (f1203 + 43) % 128;
            cc.this.m790(this, this.f1211, m1422("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891텈\uf681絉盆者뭇䌤\ue822ﭶ\uf891䥙\uf4e2覆⇎ἥ騦", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25).intern(), Boolean.valueOf(z2));
            WebViewApp webViewApp = this.f1210;
            if (webViewApp != null) {
                webViewApp.setWebAppLoaded(z2);
            }
            int i2 = f1203 + 23;
            f1201 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebView(WebView webView) {
            f1201 = (f1203 + 63) % 128;
            cc.this.m790(this, this.f1211, m1423((byte) (View.getDefaultSize(0, 0) + 27), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u008b\u008b\t\n\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002\u0092", 21 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), webView);
            WebViewApp webViewApp = this.f1210;
            if (webViewApp != null) {
                int i2 = f1201 + 83;
                f1203 = i2 % 128;
                int i3 = i2 % 2;
                webViewApp.setWebView(webView);
                if (i3 != 0) {
                    throw null;
                }
            }
            f1201 = (f1203 + 45) % 128;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﻛ */
        public final /* synthetic */ WebViewApp mo713() {
            f1201 = (f1203 + 39) % 128;
            WebViewApp webViewAppM1421 = m1421();
            int i2 = f1203 + 17;
            f1201 = i2 % 128;
            if (i2 % 2 != 0) {
                return webViewAppM1421;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m1422(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (m.f2870) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    m.f2869 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i3 = m.f2869;
                        if (i3 < cArr.length) {
                            cArr3[0] = cArr[i3];
                            cArr3[1] = cArr[i3 + 1];
                            int i4 = 58224;
                            for (int i5 = 0; i5 < 16; i5++) {
                                char c2 = cArr3[1];
                                char c3 = cArr3[0];
                                char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1204)) ^ ((c3 >>> 5) + f1202)));
                                cArr3[1] = c4;
                                cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1207) ^ ((c4 + i4) ^ ((c4 << 4) + f1208))));
                                i4 -= 40503;
                            }
                            int i6 = m.f2869;
                            cArr2[i6] = cArr3[0];
                            cArr2[i6 + 1] = cArr3[1];
                            m.f2869 = i6 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    public cc(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static Object m1399() {
        int i2 = f1187 + 123;
        f1185 = i2 % 128;
        if (i2 % 2 == 0) {
            UnityAds.getListener();
            throw null;
        }
        IUnityAdsListener listener = UnityAds.getListener();
        int i3 = f1185 + 97;
        f1187 = i3 % 128;
        if (i3 % 2 == 0) {
            return listener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ Object m1400() {
        Object objM1399;
        int i2 = f1187 + 61;
        f1185 = i2 % 128;
        if (i2 % 2 == 0) {
            objM1399 = m1399();
            int i3 = 54 / 0;
        } else {
            objM1399 = m1399();
        }
        f1185 = (f1187 + 33) % 128;
        return objM1399;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m1401() {
        int i2 = f1185 + 79;
        f1187 = i2 % 128;
        if (i2 % 2 == 0) {
            return ClientProperties.getGameId();
        }
        ClientProperties.getGameId();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static Object m1403() {
        f1185 = (f1187 + 11) % 128;
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        f1185 = (f1187 + 29) % 128;
        return currentApp;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static void m1404(IUnityAdsListener iUnityAdsListener) {
        int i2 = f1185 + 81;
        f1187 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.removeListener(iUnityAdsListener);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1406(IUnityAdsListener iUnityAdsListener) {
        int i2 = f1187 + 77;
        f1185 = i2 % 128;
        int i3 = i2 % 2;
        m1404(iUnityAdsListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f1185 + 123;
        f1187 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1409(IUnityAdsListener iUnityAdsListener) {
        f1187 = (f1185 + 25) % 128;
        m1418(iUnityAdsListener);
        int i2 = f1185 + 33;
        f1187 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1411(IUnityAdsListener iUnityAdsListener) {
        int i2 = f1187 + 69;
        f1185 = i2 % 128;
        int i3 = i2 % 2;
        m1416(iUnityAdsListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ BannerView.IListener m1413(BannerView bannerView) {
        int i2 = f1185 + 23;
        f1187 = i2 % 128;
        if (i2 % 2 != 0) {
            m1405(bannerView);
            throw null;
        }
        BannerView.IListener iListenerM1405 = m1405(bannerView);
        int i3 = f1187 + 15;
        f1185 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        return iListenerM1405;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1417(BannerView bannerView) {
        f1185 = (f1187 + 23) % 128;
        String strM1407 = m1407(bannerView);
        f1185 = (f1187 + 63) % 128;
        return strM1407;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static Enum m1402(String str) {
        byte b2;
        int iHashCode = str.hashCode();
        if (iHashCode != 183181625) {
            if (iHashCode == 2066319421 && str.equals(m1408((String) null, (int[]) null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "«\u008e\u008b\u008a\u0087®").intern())) {
                f1187 = (f1185 + 65) % 128;
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals(m1408((String) null, (int[]) null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u008e\u0090\u008e\u008b¨\u009b©\u009f").intern())) {
            f1185 = (f1187 + 39) % 128;
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return WebRequestEvent.COMPLETE;
        }
        if (b2 != 1) {
            return null;
        }
        return WebRequestEvent.FAILED;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1416(IUnityAdsListener iUnityAdsListener) {
        int i2 = f1185 + 29;
        f1187 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.setListener(iUnityAdsListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f1185 + 17;
        f1187 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1419(BannerView bannerView, BannerView.IListener iListener) {
        f1185 = (f1187 + 63) % 128;
        m1412(bannerView, iListener);
        int i2 = f1187 + 109;
        f1185 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1420(Object obj, ch chVar) {
        a aVar = new a((WebViewApp) obj, chVar);
        f1187 = (f1185 + 47) % 128;
        return aVar;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1408((String) null, (int[]) null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0096\u0096\u0087\u0095\u008c\u0084\u0094\u0093\u008c\u0092\u0085\u0083\u008c\u008d\u008d\u0099\u009f\u0085\u008c§").intern(), new bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cc.m1403();
            }
        });
        map.put(m1408((String) null, (int[]) null, TextUtils.indexOf("", "") + 127, "\u0096\u0096\u0087\u0095\u008c\u0084\u0094\u0093\u008c\u0092\u0091\u0090\u008c\u0085\u009e\u008c\u008d¡").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cc.this.m1420(list.get(0), chVar);
            }
        });
        map.put(m1415("昧ۻׅพⵖ˃箱毁隫뭏⨩治\ud8e3讒各젔Ϫ恎ᆄ㸷", KeyEvent.keyCodeFromString("") + 20).intern(), new bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cc.m1410(list.get(0));
                return null;
            }
        });
        map.put(m1408((String) null, (int[]) null, (ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0088\u008a\u008c \u009eª\u0085\u008c§").intern(), new bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cc.m1401();
            }
        });
        map.put(m1415("䲽៥濪\uf508앇\ude3c⯓澹쉉⨒\ueb3c\ue2f0뿗\uf2a5⺟\ued75錒⫏럗\uda36", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cc.m1400();
            }
        });
        map.put(m1408((String) null, (int[]) null, TextUtils.getTrimmedLength("") + 127, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0085\u008c\u0089").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cc.m1411((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1408((String) null, (int[]) null, TextUtils.getOffsetAfter("", 0) + 127, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0088\u0088\u009e").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cc.m1409((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1408((String) null, (int[]) null, TextUtils.lastIndexOf("", '0', 0) + 128, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u008c\u009a\u009c \u008c\u008d").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cc.m1406((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1415("䲽៥\uef6f؋鍟ﴫ慗⠧行\uf512竘Ỏ鱳햩ׅพ暳ᨶ㇂嘏㜉⊄풤볬", 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cc.m1414((String) list.get(0));
            }
        });
        map.put(m1415("䲽៥\uef6f؋鍟ﴫ⟃灜遶甑㘧욞\uf2d8在⩁왥隫뭏", View.MeasureSpec.makeMeasureSpec(0, 0) + 18).intern(), new bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cc.m1402((String) list.get(0));
            }
        });
        map.put(m1408((String) null, (int[]) null, View.MeasureSpec.getSize(0) + 127, "\u0088\u008a\u0085\u0083\u008c \u008c¡\u009e¥¨\u0085\u008c§").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cc.m1417((BannerView) list.get(0));
            }
        });
        map.put(m1415("䲽៥\u0bc4몵讳ꠌ錒⫏覡\uf60a뿗\uf2a5⺟\ued75錒⫏럗\uda36", 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cc.m1413((BannerView) list.get(0));
            }
        });
        map.put(m1408((String) null, (int[]) null, 127 - (Process.myTid() >> 22), "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u008d\u008c\u0083\u0083\u009e\u0091\u0085\u008c\u0089").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cc.m1419((BannerView) list.get(0), (BannerView.IListener) list.get(1));
                return null;
            }
        });
        int i2 = f1187 + 55;
        f1185 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x037a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0392  */
    /* JADX WARN: Code duplicated, block: B:104:0x0396  */
    /* JADX WARN: Code duplicated, block: B:106:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:107:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:109:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    /* JADX WARN: Code duplicated, block: B:110:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:112:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:118:0x0409  */
    /* JADX WARN: Code duplicated, block: B:119:0x040b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0421  */
    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    /* JADX WARN: Code duplicated, block: B:13:0x005f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0074  */
    /* JADX WARN: Code duplicated, block: B:17:0x0080  */
    /* JADX WARN: Code duplicated, block: B:188:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
    /* JADX WARN: Code duplicated, block: B:190:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    /* JADX WARN: Code duplicated, block: B:200:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x009f  */
    /* JADX WARN: Code duplicated, block: B:220:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:33:0x010b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0116  */
    /* JADX WARN: Code duplicated, block: B:36:0x012c  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:40:0x013d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0155  */
    /* JADX WARN: Code duplicated, block: B:43:0x0159  */
    /* JADX WARN: Code duplicated, block: B:45:0x0171  */
    /* JADX WARN: Code duplicated, block: B:46:0x0175  */
    /* JADX WARN: Code duplicated, block: B:48:0x018d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0199  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x0208  */
    /* JADX WARN: Code duplicated, block: B:61:0x020b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0225  */
    /* JADX WARN: Code duplicated, block: B:67:0x023d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0253  */
    /* JADX WARN: Code duplicated, block: B:70:0x0257  */
    /* JADX WARN: Code duplicated, block: B:72:0x026d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0271  */
    /* JADX WARN: Code duplicated, block: B:75:0x0289  */
    /* JADX WARN: Code duplicated, block: B:76:0x0294  */
    /* JADX WARN: Code duplicated, block: B:78:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:79:0x02af  */
    /* JADX WARN: Code duplicated, block: B:81:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:84:0x02df  */
    /* JADX WARN: Code duplicated, block: B:85:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0303  */
    /* JADX WARN: Code duplicated, block: B:88:0x0307  */
    /* JADX WARN: Code duplicated, block: B:90:0x0320  */
    /* JADX WARN: Code duplicated, block: B:91:0x0323  */
    /* JADX WARN: Code duplicated, block: B:93:0x033b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0346  */
    /* JADX WARN: Code duplicated, block: B:96:0x035e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0361  */
    /* JADX WARN: Code duplicated, block: B:99:0x0377  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        int i2;
        int i3;
        int i4;
        int i5 = f1185 + 11;
        f1187 = i5 % 128;
        byte b2 = 1;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
            switch (str.hashCode()) {
                case -2043984616:
                    if (str.equals(m1408((String) null, (int[]) null, View.getDefaultSize(0, 0) + 127, "\u008d\u008c\u0083\u0084\u009e\u0085\u0083\u009c\u009f\u008d\u008c\u0086\u009e¥¨\u0093\u008c\u0092\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 23;
                    }
                    break;
                case -1797664962:
                    if (str.equals(m1408((String) null, (int[]) null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0083\u009c\u0084\u0085\u009e\u009d\u0084\u0085\u008c\u0083\u009c\u009b\u0086\u0085\u0084\u0083\u0082").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 7;
                    }
                    break;
                case -1719935914:
                    if (str.equals(m1408((String) null, (int[]) null, MotionEvent.axisFromString("") + 128, "\u0088¥©\u0095\u008c\u0084\u0094\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        i2 = f1187 + 45;
                        f1185 = i2 % 128;
                        if (i2 % 2 == 0) {
                            b2 = 32;
                        } else {
                            b2 = 12;
                        }
                    }
                    break;
                case -1673897431:
                    if (str.equals(m1415("᪂볰뀶\ud7ad誺喢귝\uf197ﭼ恝肹삅桁\uedc6逤諤", 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 24;
                    }
                    break;
                case -1673719574:
                    if (str.equals(m1408((String) null, (int[]) null, TextUtils.indexOf("", "", 0) + 127, "\u009c¦\u0083\u008a\u008d\u009c\u008d\u008d\u008e\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 25;
                    }
                    break;
                case -1627944928:
                    if (str.equals(m1408((String) null, (int[]) null, KeyEvent.keyCodeFromString("") + 127, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = 19;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1543737546:
                    if (str.equals(m1408((String) null, (int[]) null, Color.green(0) + 127, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case -1347165098:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0096\u0096\u0087\u0095\u008c\u0084\u0094\u0093\u008c\u0092\u0091\u0090").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case -1251710408:
                    if (str.equals(m1415("桨✻\ue862䤮\uf564㠆糛髆㌗ڞ̓盲昧ۻ࣐풪㎞\ue695㘧욞몞㢤讳ꠌ錒⫏鷇\ud8fe\ue0daᬘ各젔\ueb71ᣝ᪂볰뀶\ud7ad誺喢慗⠧行\uf512", 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b2 = -1;
                    } else {
                        f1187 = (f1185 + 1) % 128;
                        b2 = 33;
                    }
                    break;
                case -858834302:
                    if (!(!str.equals(m1408((String) null, (int[]) null, 127 - (KeyEvent.getMaxKeyCode() >> 16), "\u008c\u009d\u0084¢\u008d\u008c\u0083\u0083\u009e\u0091\u0086\u0085\u0084\u0083\u0082").intern()))) {
                        b2 = -1;
                    } else {
                        b2 = 15;
                    }
                    break;
                case -800280637:
                    if (str.equals(m1408((String) null, (int[]) null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0083\u009c\u0084\u0085\u009e\u008d\u0099§\u0084¦\u0083\u009c\u009f\u008c¥\u0099\u0088\u009c\u009b\u0089\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 20;
                    }
                    break;
                case -618035586:
                    if (str.equals(m1415("栗쮬糛髆㙒\ue1da隕\uf563⨩治\ud8e3讒各젔ᐵ䔟", ((byte) KeyEvent.getModifierMetaStateMask()) + 16).intern())) {
                        b2 = -1;
                    } else {
                        f1185 = (f1187 + 59) % 128;
                        b2 = 10;
                    }
                    break;
                case -598903877:
                    if (str.equals(m1415("뙑乘䭏ꐺ쉉⨒\uf407矮鰚欕鱳햩誺喢쉉⨒枭즈⺟\ued75럗\uda36", TextUtils.getTrimmedLength("") + 21).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 8;
                    }
                    break;
                case -327500225:
                    if (str.equals(m1415("⨩治\ud8e3讒各젔漗☜⩁왥隫뭏镨\ued5f⺟\ued75큊ꏅ꽬갽", 20 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 6;
                    }
                    break;
                case -324012869:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0085\u0089\u008c\u0099\u0098\u008c\u0097\u0093\u008c\u0092").intern())) {
                        b2 = -1;
                    } else {
                        f1187 = (f1185 + 21) % 128;
                        b2 = 11;
                    }
                    break;
                case -262912338:
                    if (str.equals(m1408((String) null, (int[]) null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0085\u0083\u008c\u009a\u008e\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 18;
                    }
                    break;
                case -133620343:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - ExpandableListView.getPackedPositionGroup(0L), "\u0085\u0083\u008c\u009a\u008e \u009c\u0085\u0089\u0099\u009f").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 9;
                    }
                    break;
                case -30759555:
                    if (!str.equals(m1408((String) null, (int[]) null, Color.green(0) + 127, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082").intern())) {
                        b2 = -1;
                    }
                    break;
                case 252148886:
                    if (str.equals(m1408((String) null, (int[]) null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0086\u0085\u0084\u009a\u0084\u0085¡\u0087\u0085\u0084\u0083\u0082\u0088\u0087").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 12;
                    }
                    break;
                case 626721475:
                    if (str.equals(m1415("栗쮬糛髆㙒\ue1da隕\uf563⨩治\ud8e3讒各젔Ϫ恎ᆄ㸷", 18 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 692588017:
                    if (str.equals(m1415("᪂볰뀶\ud7ad誺喢慗⠧行\uf512镨\ued5f袡ꟽ逤諤", 14 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 28;
                    }
                    break;
                case 819533772:
                    if (!(!str.equals(m1408((String) null, (int[]) null, 126 - TextUtils.lastIndexOf("", '0', 0), "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u008d\u008c\u0083\u0083\u009e\u0091\u0086\u0085\u0084\u0083\u0082\u008a").intern()))) {
                        b2 = -1;
                    } else {
                        f1185 = (f1187 + 85) % 128;
                        b2 = 29;
                    }
                    break;
                case 961427118:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (Process.myTid() >> 22), "\u008c\u0088\u0084¤\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 17;
                    }
                    break;
                case 961754217:
                    if (str.equals(m1408((String) null, (int[]) null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0095\u009c£¢\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        f1185 = (f1187 + 75) % 128;
                        b2 = 16;
                    }
                    break;
                case 961844241:
                    if (str.equals(m1408((String) null, (int[]) null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, "\u0095\u008c\u0084\u0094\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 26;
                    }
                    break;
                case 1067215379:
                    if (str.equals(m1415("桨✻\ue862䤮\uf564㠆糛髆㌗ڞ̓盲昧ۻ࣐풪㎞\ue695㘧욞몞㢤讳ꠌ錒⫏鷇\u4f82d\ueeb1讳ꠌ錒⫏䖌뮆各젔ᐵ䔟", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 27;
                    }
                    break;
                case 1246120607:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - TextUtils.indexOf("", "", 0, 0), "\u0085\u0083\u008c\u009a\u008e\u0085\u0089\u008c\u0099\u0098\u008c\u0097\u0093\u008c\u0092").intern())) {
                        b2 = -1;
                    } else {
                        i3 = f1185 + 89;
                        f1187 = i3 % 128;
                        if (i3 % 2 != 0) {
                            b2 = 5;
                        } else {
                            b2 = 2;
                        }
                    }
                    break;
                case 1326268204:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u008a\u0095\u008c\u0084\u0094\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        f1185 = (f1187 + 15) % 128;
                        b2 = 30;
                    }
                    break;
                case 1374920114:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0089\u008d\u008c\u0083\u0083\u009e\u0091\u0086\u0085\u0084\u0083\u0082").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 14;
                    }
                    break;
                case 1407526303:
                    if (str.equals(m1408((String) null, (int[]) null, Process.getGidForName("") + 128, "\u0089\u008c\u0084\u0085\u008d\u008c\u0096\u009c\u008d¨\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 21;
                    }
                    break;
                case 1646468069:
                    if (str.equals(m1415("᪂볰뀶\ud7ad誺喢慗⠧行\uf512\uf407矮鰚欕鱳햩誺喢", (-16777198) - Color.rgb(0, 0, 0)).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 31;
                    }
                    break;
                case 1658279126:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0088\u008c\u0088\u0083\u008c\u0085\u008f\u008e\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 1982491468:
                    if (str.equals(m1415("᪂볰뀶\ud7ad誺喢", TextUtils.getOffsetBefore("", 0) + 6).intern())) {
                        b2 = -1;
                    } else {
                        i4 = f1187 + 93;
                        f1185 = i4 % 128;
                        if (i4 % 2 == 0) {
                            b2 = 13;
                        } else {
                            b2 = 12;
                        }
                    }
                    break;
                case 2068667541:
                    if (str.equals(m1415("᪂볰뀶\ud7ad誺喢颂丑\uf174ᨫ彖మ埻\uf7ee", (ViewConfiguration.getJumpTapTimeout() >> 16) + 14).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 22;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -2043984616:
                    if (str.equals(m1408((String) null, (int[]) null, View.getDefaultSize(0, 0) + 127, "\u008d\u008c\u0083\u0084\u009e\u0085\u0083\u009c\u009f\u008d\u008c\u0086\u009e¥¨\u0093\u008c\u0092\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 23;
                    }
                    break;
                case -1797664962:
                    if (str.equals(m1408((String) null, (int[]) null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0083\u009c\u0084\u0085\u009e\u009d\u0084\u0085\u008c\u0083\u009c\u009b\u0086\u0085\u0084\u0083\u0082").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 7;
                    }
                    break;
                case -1719935914:
                    if (str.equals(m1408((String) null, (int[]) null, MotionEvent.axisFromString("") + 128, "\u0088¥©\u0095\u008c\u0084\u0094\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        i2 = f1187 + 45;
                        f1185 = i2 % 128;
                        if (i2 % 2 == 0) {
                            b2 = 32;
                        } else {
                            b2 = 12;
                        }
                    }
                    break;
                case -1673897431:
                    if (str.equals(m1415("᪂볰뀶\ud7ad誺喢귝\uf197ﭼ恝肹삅桁\uedc6逤諤", 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 24;
                    }
                    break;
                case -1673719574:
                    if (str.equals(m1408((String) null, (int[]) null, TextUtils.indexOf("", "", 0) + 127, "\u009c¦\u0083\u008a\u008d\u009c\u008d\u008d\u008e\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 25;
                    }
                    break;
                case -1627944928:
                    if (str.equals(m1408((String) null, (int[]) null, KeyEvent.keyCodeFromString("") + 127, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 19;
                    }
                    break;
                case -1543737546:
                    if (str.equals(m1408((String) null, (int[]) null, Color.green(0) + 127, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case -1347165098:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0096\u0096\u0087\u0095\u008c\u0084\u0094\u0093\u008c\u0092\u0091\u0090").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case -1251710408:
                    if (str.equals(m1415("桨✻\ue862䤮\uf564㠆糛髆㌗ڞ̓盲昧ۻ࣐풪㎞\ue695㘧욞몞㢤讳ꠌ錒⫏鷇\ud8fe\ue0daᬘ各젔\ueb71ᣝ᪂볰뀶\ud7ad誺喢慗⠧行\uf512", 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b2 = -1;
                    } else {
                        f1187 = (f1185 + 1) % 128;
                        b2 = 33;
                    }
                    break;
                case -858834302:
                    if (!(!str.equals(m1408((String) null, (int[]) null, 127 - (KeyEvent.getMaxKeyCode() >> 16), "\u008c\u009d\u0084¢\u008d\u008c\u0083\u0083\u009e\u0091\u0086\u0085\u0084\u0083\u0082").intern()))) {
                        b2 = -1;
                    } else {
                        b2 = 15;
                    }
                    break;
                case -800280637:
                    if (str.equals(m1408((String) null, (int[]) null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0083\u009c\u0084\u0085\u009e\u008d\u0099§\u0084¦\u0083\u009c\u009f\u008c¥\u0099\u0088\u009c\u009b\u0089\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 20;
                    }
                    break;
                case -618035586:
                    if (str.equals(m1415("栗쮬糛髆㙒\ue1da隕\uf563⨩治\ud8e3讒各젔ᐵ䔟", ((byte) KeyEvent.getModifierMetaStateMask()) + 16).intern())) {
                        b2 = -1;
                    } else {
                        f1185 = (f1187 + 59) % 128;
                        b2 = 10;
                    }
                    break;
                case -598903877:
                    if (str.equals(m1415("뙑乘䭏ꐺ쉉⨒\uf407矮鰚欕鱳햩誺喢쉉⨒枭즈⺟\ued75럗\uda36", TextUtils.getTrimmedLength("") + 21).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 8;
                    }
                    break;
                case -327500225:
                    if (str.equals(m1415("⨩治\ud8e3讒各젔漗☜⩁왥隫뭏镨\ued5f⺟\ued75큊ꏅ꽬갽", 20 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 6;
                    }
                    break;
                case -324012869:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0085\u0089\u008c\u0099\u0098\u008c\u0097\u0093\u008c\u0092").intern())) {
                        b2 = -1;
                    } else {
                        f1187 = (f1185 + 21) % 128;
                        b2 = 11;
                    }
                    break;
                case -262912338:
                    if (str.equals(m1408((String) null, (int[]) null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0085\u0083\u008c\u009a\u008e\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 18;
                    }
                    break;
                case -133620343:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - ExpandableListView.getPackedPositionGroup(0L), "\u0085\u0083\u008c\u009a\u008e \u009c\u0085\u0089\u0099\u009f").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 9;
                    }
                    break;
                case -30759555:
                    if (!str.equals(m1408((String) null, (int[]) null, Color.green(0) + 127, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082").intern())) {
                        b2 = -1;
                    }
                    break;
                case 252148886:
                    if (str.equals(m1408((String) null, (int[]) null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0086\u0085\u0084\u009a\u0084\u0085¡\u0087\u0085\u0084\u0083\u0082\u0088\u0087").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 12;
                    }
                    break;
                case 626721475:
                    if (str.equals(m1415("栗쮬糛髆㙒\ue1da隕\uf563⨩治\ud8e3讒各젔Ϫ恎ᆄ㸷", 18 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 692588017:
                    if (str.equals(m1415("᪂볰뀶\ud7ad誺喢慗⠧行\uf512镨\ued5f袡ꟽ逤諤", 14 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 28;
                    }
                    break;
                case 819533772:
                    if (!(!str.equals(m1408((String) null, (int[]) null, 126 - TextUtils.lastIndexOf("", '0', 0), "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u008d\u008c\u0083\u0083\u009e\u0091\u0086\u0085\u0084\u0083\u0082\u008a").intern()))) {
                        b2 = -1;
                    } else {
                        f1185 = (f1187 + 85) % 128;
                        b2 = 29;
                    }
                    break;
                case 961427118:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (Process.myTid() >> 22), "\u008c\u0088\u0084¤\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 17;
                    }
                    break;
                case 961754217:
                    if (str.equals(m1408((String) null, (int[]) null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0095\u009c£¢\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        f1185 = (f1187 + 75) % 128;
                        b2 = 16;
                    }
                    break;
                case 961844241:
                    if (str.equals(m1408((String) null, (int[]) null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, "\u0095\u008c\u0084\u0094\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 26;
                    }
                    break;
                case 1067215379:
                    if (str.equals(m1415("桨✻\ue862䤮\uf564㠆糛髆㌗ڞ̓盲昧ۻ࣐풪㎞\ue695㘧욞몞㢤讳ꠌ錒⫏鷇\u4f82d\ueeb1讳ꠌ錒⫏䖌뮆各젔ᐵ䔟", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 27;
                    }
                    break;
                case 1246120607:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - TextUtils.indexOf("", "", 0, 0), "\u0085\u0083\u008c\u009a\u008e\u0085\u0089\u008c\u0099\u0098\u008c\u0097\u0093\u008c\u0092").intern())) {
                        b2 = -1;
                    } else {
                        i3 = f1185 + 89;
                        f1187 = i3 % 128;
                        if (i3 % 2 != 0) {
                            b2 = 5;
                        } else {
                            b2 = 2;
                        }
                    }
                    break;
                case 1326268204:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u008a\u0095\u008c\u0084\u0094\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        f1185 = (f1187 + 15) % 128;
                        b2 = 30;
                    }
                    break;
                case 1374920114:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0089\u008d\u008c\u0083\u0083\u009e\u0091\u0086\u0085\u0084\u0083\u0082").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 14;
                    }
                    break;
                case 1407526303:
                    if (str.equals(m1408((String) null, (int[]) null, Process.getGidForName("") + 128, "\u0089\u008c\u0084\u0085\u008d\u008c\u0096\u009c\u008d¨\u008d\u008c\u0083\u0083\u009e\u0091").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 21;
                    }
                    break;
                case 1646468069:
                    if (str.equals(m1415("᪂볰뀶\ud7ad誺喢慗⠧行\uf512\uf407矮鰚欕鱳햩誺喢", (-16777198) - Color.rgb(0, 0, 0)).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 31;
                    }
                    break;
                case 1658279126:
                    if (str.equals(m1408((String) null, (int[]) null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0088\u008c\u0088\u0083\u008c\u0085\u008f\u008e\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 1982491468:
                    if (str.equals(m1415("᪂볰뀶\ud7ad誺喢", TextUtils.getOffsetBefore("", 0) + 6).intern())) {
                        b2 = -1;
                    } else {
                        i4 = f1187 + 93;
                        f1185 = i4 % 128;
                        if (i4 % 2 == 0) {
                            b2 = 13;
                        } else {
                            b2 = 12;
                        }
                    }
                    break;
                case 2068667541:
                    if (str.equals(m1415("᪂볰뀶\ud7ad誺喢颂丑\uf174ᨫ彖మ埻\uf7ee", (ViewConfiguration.getJumpTapTimeout() >> 16) + 14).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 22;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
        }
        switch (b2) {
            case 0:
                return UnityAds.class;
            case 1:
                return IUnityAdsListener.class;
            case 2:
                return IUnityAdsExtendedListener.class;
            case 3:
                return WebViewApp.class;
            case 4:
                return a.class;
            case 5:
                return WebRequestEvent.class;
            case 6:
                return WebViewEventCategory.class;
            case 7:
                return UnityMonetization.class;
            case 8:
                return ShowAdListenerAdapter.class;
            case 9:
                return CustomEvent.class;
            case 10:
                return WebView.class;
            case 11:
                return WebRequest.class;
            case 12:
                return AdUnitActivity.class;
            case 13:
                return Banner.class;
            case 14:
                return UnityBanners.class;
            case 15:
                return UnityBannerSize.class;
            case 16:
                return BannerShow.class;
            case 17:
                return BannerHide.class;
            case 18:
                return BannerEvent.class;
            case 19:
                return BannerListener.class;
            case 20:
                return BannersModuleConfiguration.class;
            case 21:
                return BannerProperties.class;
            case 22:
                return BannerPosition.class;
            case 23:
                return BannerWebPlayerContainer.class;
            case 24:
                return BannerErrorCode.class;
            case 25:
                return BannerErrorInfo.class;
            case 26:
            case 27:
                return BannerView.class;
            case 28:
                return BannerViewCache.class;
            case 29:
                return IUnityBannerListener.class;
            case 30:
                return BannerView.IListener.class;
            case 31:
                return BannerView.Listener.class;
            case 32:
            case 33:
                return com.unity3d.services.banners.view.BannerView.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static BannerView.IListener m1405(BannerView bannerView) {
        f1185 = (f1187 + 29) % 128;
        BannerView.IListener listener = bannerView.getListener();
        f1187 = (f1185 + 3) % 128;
        return listener;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x011d  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Enum m1414(String str) {
        byte b2 = 5;
        switch (str.hashCode()) {
            case -1810696374:
                if (!str.equals(m1408((String) null, (int[]) null, 127 - View.getDefaultSize(0, 0), "\u008e\u008b\u009f¬\u009f\u008e®\u008a\u008b").intern())) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case -1166291365:
                if (!str.equals(m1408((String) null, (int[]) null, Color.alpha(0) + 127, "\u008eª\u0087\u0097©\u0090¢").intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1187 + 77;
                    f1185 = i2 % 128;
                    b2 = i2 % 2 != 0 ? (byte) 6 : (byte) 87;
                }
                break;
            case -276710660:
                if (!str.equals(m1408((String) null, (int[]) null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, "\u0097\u008e¬\u0087\u008b¨©\u008e«\u008a\u0094").intern())) {
                    b2 = -1;
                } else {
                    f1187 = (f1185 + 77) % 128;
                    b2 = 1;
                }
                break;
            case -54373961:
                if (!str.equals(m1415("\ueb21쑥ต棔䅼\uf6a4犗贅뀒戍맩\ued7a", 11 - MotionEvent.axisFromString("")).intern())) {
                    b2 = -1;
                }
                break;
            case 63879010:
                if (!str.equals(m1415("\udd68䮑姧߮\u0010ꁴ", 5 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 1167718561:
                if (!str.equals(m1408((String) null, (int[]) null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0090¢\u0087\u009f«\u0087©\u0097\u0091").intern())) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 1813675631:
                if (!str.equals(m1408((String) null, (int[]) null, Color.blue(0) + 127, "\u0090¢\u008e\u0082\u00ad\u008e\u0097").intern())) {
                    b2 = -1;
                } else {
                    f1187 = (f1185 + 27) % 128;
                    b2 = 2;
                }
                break;
            case 1815350732:
                if (!str.equals(m1415("ꆻᄮᝤశ௴ꑖ\u0010ꁴ", 7 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 1926303783:
                if (!str.equals(m1415("ಈ賞鑰\uec05⹃ག", (ViewConfiguration.getFadingEdgeLength() >> 16) + 6).intern())) {
                    b2 = -1;
                } else {
                    f1187 = (f1185 + 105) % 128;
                    b2 = 0;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f1187 = (f1185 + 63) % 128;
        String version = UnityAds.getVersion();
        if (version == null) {
            f1187 = (f1185 + 99) % 128;
            return null;
        }
        int i2 = f1187 + 105;
        f1185 = i2 % 128;
        return i2 % 2 == 0 ? version.split(m1408((String) null, (int[]) null, 99 / (ViewConfiguration.getScrollBarFadeDuration() % 75), "\u0081").intern())[0] : version.split(m1408((String) null, (int[]) null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, "\u0081").intern())[0];
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1418(IUnityAdsListener iUnityAdsListener) {
        f1185 = (f1187 + 11) % 128;
        UnityAds.addListener(iUnityAdsListener);
        f1187 = (f1185 + 85) % 128;
    }

    public static class e extends bg {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f1212 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f1213 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f1214 = 1031895675;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static byte[] f1215 = {5, 11, -13, 13, -11, 17, 34, -51, 11, -5, 25, -15, 35, 5, 11, -13, 13, -11, 17, 34, -51, 11, -5, 25, -15, 35, 19, -70, 11, -5, -7, 17, 3, 51, -69, 15, 3, 51, -69, 14, 2, -6, -13, 4, 13, -14, 69, -54, 49, -70, 5, 11, -5, -7, 71, -63, -2, 12, 18, -4, 19, -28, 13, -9, 0, 13, 31, 18, -4, 19, -28, 13, -9, 0, 13, 31, 20, -69, 1, 13, -9, 0, 13, -1, 52, -69, 14, 2, -6, -13, 4, 13, -14, 69, -54, 49, -70, 5, 11, -5, -7, 71, -63, -2, 12, 0, 0, 0, 0, 0};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f1216 = 122;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f1217 = -2092926391;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static short[] f1218;

        public e(String str) {
            super(str);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ﻛ */
        public final Map<String, bg.b> mo707() {
            HashMap map = new HashMap();
            int i2 = f1212 + 33;
            f1213 = i2 % 128;
            if (i2 % 2 != 0) {
                return map;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ｋ */
        public final Class mo708(String str) {
            int i2 = f1212 + 103;
            f1213 = i2 % 128;
            if (i2 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            byte b2 = -1;
            switch (str.hashCode()) {
                case 252148886:
                    if (str.equals(m1424((byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) - 108, (-1031895674) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2092926456 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        f1213 = (f1212 + 23) % 128;
                        b2 = 0;
                    }
                    break;
                case 961844241:
                    if (str.equals(m1424((byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 112, View.resolveSizeAndState(0, 0, 0) - 1031895617, 2092926458 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                        b2 = 2;
                    }
                    break;
                case 1067215379:
                    if (str.equals(m1424((byte) ((-1) - TextUtils.lastIndexOf("", '0')), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-83) - TextUtils.indexOf("", "", 0, 0), (-1031895609) - TextUtils.indexOf((CharSequence) "", '0'), 2092926490 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                        int i3 = f1212 + 27;
                        f1213 = i3 % 128;
                        b2 = i3 % 2 != 0 ? (byte) 3 : (byte) 5;
                    }
                    break;
                case 1531208100:
                    if (str.equals(m1424((byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (short) (Process.myPid() >> 22), (-76) - TextUtils.getOffsetAfter("", 0), (-1031895662) - View.MeasureSpec.getMode(0), 2092926490 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        f1213 = (f1212 + 125) % 128;
                        b2 = 1;
                    }
                    break;
            }
            if (b2 == 0 || b2 == 1) {
                return AdUnitActivity.class;
            }
            if (b2 == 2 || b2 == 3) {
                return BannerView.class;
            }
            return null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ﾒ */
        public final String mo709() {
            String version;
            int i2 = f1212 + 79;
            f1213 = i2 % 128;
            if (i2 % 2 == 0) {
                version = UnityAds.getVersion();
                int i3 = 91 / 0;
                if (version == null) {
                    return null;
                }
            } else {
                version = UnityAds.getVersion();
                if (version == null) {
                    return null;
                }
            }
            f1212 = (f1213 + 121) % 128;
            String str = version.split(m1424((byte) Color.green(0), (short) (ImageFormat.getBitsPerPixel(0) + 1), (-121) - (ViewConfiguration.getTouchSlop() >> 8), (-1031895674) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2092926437 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())[0];
            int i4 = f1212 + 99;
            f1213 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 73 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m1424(byte b2, short s, int i2, int i3, int i4) {
            String string;
            synchronized (k.f2833) {
                try {
                    StringBuilder sb = new StringBuilder();
                    int i5 = f1216;
                    int i6 = i2 + i5;
                    int i7 = i6 == -1 ? 1 : 0;
                    if (i7 != 0) {
                        byte[] bArr = f1215;
                        if (bArr != null) {
                            i6 = (byte) (bArr[f1214 + i3] + i5);
                        } else {
                            i6 = (short) (f1218[f1214 + i3] + i5);
                        }
                    }
                    if (i6 > 0) {
                        k.f2836 = ((i3 + i6) - 2) + f1214 + i7;
                        k.f2834 = b2;
                        char c2 = (char) (i4 + f1217);
                        k.f2837 = c2;
                        sb.append(c2);
                        k.f2835 = k.f2837;
                        k.f2838 = 1;
                        while (k.f2838 < i6) {
                            byte[] bArr2 = f1215;
                            if (bArr2 != null) {
                                int i8 = k.f2836;
                                k.f2836 = i8 - 1;
                                k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                            } else {
                                short[] sArr = f1218;
                                int i9 = k.f2836;
                                k.f2836 = i9 - 1;
                                k.f2837 = (char) (k.f2835 + (((short) (sArr[i9] + s)) ^ k.f2834));
                            }
                            sb.append(k.f2837);
                            k.f2835 = k.f2837;
                            k.f2838++;
                        }
                    }
                    string = sb.toString();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return string;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m1410(Object obj) {
        int i2 = f1185 + 71;
        f1187 = i2 % 128;
        int i3 = i2 % 2;
        WebViewApp.setCurrentApp((a) obj);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = f1185 + 49;
        f1187 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1407(BannerView bannerView) {
        int i2 = f1187 + 21;
        f1185 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = bannerView.getPlacementId();
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1408(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f1189;
                int i3 = f1188;
                if (f1192) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1190) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1415(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1184)) ^ ((c3 >>> 5) + f1183)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1186) ^ ((c4 + i4) ^ ((c4 << 4) + f1191))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1412(BannerView bannerView, BannerView.IListener iListener) {
        f1187 = (f1185 + 33) % 128;
        bannerView.setListener(iListener);
        int i2 = f1185 + 73;
        f1187 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
