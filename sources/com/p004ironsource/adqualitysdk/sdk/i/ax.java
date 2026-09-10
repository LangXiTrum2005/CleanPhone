package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
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
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.p004ironsource.adqualitysdk.sdk.i.bb.AnonymousClass1;
import com.p004ironsource.adqualitysdk.sdk.i.bb.AnonymousClass3;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ax {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static char f430 = 35991;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static char f431 = 32552;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f432 = 1;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static char[] f433 = {'$', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'A', '_', 136, 139, 137, AbstractJsonLexerKt.BEGIN_OBJ, '|', 141, 142, 133, 127, AbstractJsonLexerKt.END_LIST, 'K', 'm', AbstractJsonLexerKt.UNICODE_ESC, '~', 134, 129, 133, 137, 145, 'g', 16, '&', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', 'r', 251, 272, 272, 267, 262, 269, 275, 274, 257, 249, 265, 265, 262, 264, 269, 143, 285, 285, 278, 'd', 222, 245, 243, 243, 204, 195, 229, 231, 233, 238, 237, 198, 196, 236, 241, 241, 236, 231, 238, 244, 243, 204, 197, 238, 245, 243, 243, 245, 132, 269, 267, 261, 267, 268, 264, '+', 'i', 129, AbstractJsonLexerKt.END_OBJ, 't', 'z', AbstractJsonLexerKt.END_OBJ, '~', AbstractJsonLexerKt.END_OBJ, 'V', AbstractJsonLexerKt.COLON, 'q', 'p', 'r', 'I', 'K', 'l', 'j', 'I', 'G', 'n', 'q', 'J', 'F', 'm', 'h', 'b', 'd', 'd', 'B', 'D', 'k', 'G', 'J', 'n', 'k', 'i', 'S', 'Z', 'J', 'F', 'h', 'c', 'j', 's', 'J', 'G', 'n', 'i', 'B', 'G', 'j', 'C', 'J', 'n', 'f', 'B', 'A', 'i', 'n', 'n', 'i', 'd'};

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f434 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f435 = 31667;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f436 = 35875;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private az f437;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private ix f438;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private ISAdQualityInitListener f439;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f441;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private bb f442;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f445 = false;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<cn> f446 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<gi> f449 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, JSONObject> f447 = new HashMap();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<String, String> f448 = new HashMap();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private de f440 = new de();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private dr f444 = dr.m1980();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Map<String, aw> f443 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ax$5, reason: invalid class name */
    public class AnonymousClass5 extends it {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private /* synthetic */ List f519;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private /* synthetic */ String f520;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ String f521;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ Context f522;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ Map f523;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ Runnable f525;

        public AnonymousClass5(String str, Context context, String str2, List list, Map map, Runnable runnable) {
            this.f521 = str;
            this.f522 = context;
            this.f520 = str2;
            this.f519 = list;
            this.f523 = map;
            this.f525 = runnable;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            if (as.m467().mo491(this.f521, ax.m579(ax.this))) {
                ax.m596(ax.this, this.f522, this.f520, this.f521, this.f519, new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.5.5
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        if (ax.m574(ax.this)) {
                            s.m2918(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.5.5.1
                                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo276() {
                                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                    ax.m623(ax.this, anonymousClass5.f522, anonymousClass5.f523, anonymousClass5.f525);
                                }
                            }, as.m467().mo468());
                        }
                    }
                });
                return;
            }
            JSONObject jSONObject = new JSONObject();
            ax.m597(ax.this, this.f521, jSONObject);
            ax.m572(ax.this).put(this.f521, jSONObject);
            s.m2918(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.5.1
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    ax.m623(ax.this, anonymousClass5.f522, anonymousClass5.f523, anonymousClass5.f525);
                }
            }, as.m467().mo468());
        }
    }

    public ax(ix ixVar, ai aiVar, String str, bb bbVar, ISAdQualityInitListener iSAdQualityInitListener) {
        this.f438 = ixVar;
        az azVar = new az(s.m2916(), aiVar);
        this.f437 = azVar;
        kb.m2750(azVar);
        this.f437.m733(new in() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.1

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f450 = 0;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f451 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f452 = {343, 339, 322, 328, 341, 338};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static boolean f453 = true;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f454 = 227;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static boolean f455 = true;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m635(String str2, int[] iArr, int i2, String str3) throws UnsupportedEncodingException {
                Object bytes = str3;
                if (str3 != null) {
                    bytes = str3.getBytes(CharEncoding.ISO_8859_1);
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (o.f2877) {
                    try {
                        char[] cArr2 = f452;
                        int i3 = f454;
                        if (f455) {
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
                        if (f453) {
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

            @Override // com.p004ironsource.adqualitysdk.sdk.i.in
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final JSONObject mo636(String str2, JSONObject jSONObject) {
                f451 = (f450 + 21) % 128;
                if (!str2.equals(m635(null, null, 127 - TextUtils.getTrimmedLength(""), "\u0085\u0086\u0085\u0085\u0084\u0083\u0082\u0081").intern())) {
                    f450 = (f451 + 19) % 128;
                    return null;
                }
                int i2 = f451 + 33;
                f450 = i2 % 128;
                if (i2 % 2 == 0) {
                    return ax.this.m634();
                }
                int i3 = 48 / 0;
                return ax.this.m634();
            }
        });
        this.f441 = str;
        this.f442 = bbVar;
        this.f439 = iSAdQualityInitListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if ((!m570()) != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (m570() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m567() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.ax.f434     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 + 3
            int r0 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ax.f432 = r0     // Catch: java.lang.Throwable -> L2e
            com.ironsource.adqualitysdk.sdk.i.as r0 = com.p004ironsource.adqualitysdk.sdk.i.as.m467()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.mo470()     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 == 0) goto L38
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.ax.f432     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 + 73
            int r2 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ax.f434 = r2     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 % 2
            r2 = 1
            if (r0 == 0) goto L30
            boolean r0 = r4.m570()     // Catch: java.lang.Throwable -> L2e
            r3 = 72
            int r3 = r3 / r1
            r0 = r0 ^ r2
            if (r0 == r2) goto L38
            goto L36
        L2c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2e
        L2e:
            r0 = move-exception
            goto L3a
        L30:
            boolean r0 = r4.m570()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L38
        L36:
            monitor-exit(r4)
            return r2
        L38:
            monitor-exit(r4)
            return r1
        L3a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.ax.m567():boolean");
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private synchronized void m568() {
        f434 = (f432 + 63) % 128;
        if (!(!this.f442.m763())) {
            m627().adQualitySdkInitSuccess();
        } else {
            m627().adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, m582(false, new int[]{117, 53, 0, 27}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000").intern());
            f434 = (f432 + 113) % 128;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private List<cn> m569() {
        f434 = (f432 + 7) % 128;
        if (this.f446 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f446);
        f434 = (f432 + 123) % 128;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized boolean m570() {
        f432 = (f434 + 27) % 128;
        boolean zMo469 = as.m467().mo469();
        int i2 = f432 + 49;
        f434 = i2 % 128;
        if (i2 % 2 == 0) {
            return zMo469;
        }
        int i3 = 77 / 0;
        return zMo469;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Map m572(ax axVar) {
        int i2 = f434 + 45;
        f432 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, JSONObject> mapM580 = axVar.m580();
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        int i5 = f432 + 45;
        f434 = i5 % 128;
        if (i5 % 2 == 0) {
            return mapM580;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ boolean m574(ax axVar) {
        f434 = (f432 + 7) % 128;
        boolean zM570 = axVar.m570();
        int i2 = f434 + 31;
        f432 = i2 % 128;
        if (i2 % 2 != 0) {
            return zM570;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ List m576(ax axVar) {
        f432 = (f434 + 13) % 128;
        List<gi> listM577 = axVar.m577();
        f432 = (f434 + 57) % 128;
        return listM577;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ void m578(ax axVar) {
        f434 = (f432 + 1) % 128;
        axVar.m593();
        f432 = (f434 + 71) % 128;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ String m579(ax axVar) {
        int i2 = (f432 + 121) % 128;
        f434 = i2;
        String str = axVar.f441;
        int i3 = i2 + 51;
        f432 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ dr m581(ax axVar, dr drVar) {
        int i2 = f434 + 39;
        f432 = i2 % 128;
        int i3 = i2 % 2;
        axVar.f444 = drVar;
        if (i3 != 0) {
            return drVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m590(ax axVar) {
        f432 = (f434 + 85) % 128;
        List<cn> listM569 = axVar.m569();
        f434 = (f432 + 13) % 128;
        return listM569;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ bb m599(ax axVar) {
        int i2 = f432;
        f434 = (i2 + 39) % 128;
        bb bbVar = axVar.f442;
        int i3 = i2 + 23;
        f434 = i3 % 128;
        if (i3 % 2 == 0) {
            return bbVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ cn m610(ax axVar, Context context, String str, bg bgVar) {
        int i2 = f434 + 41;
        f432 = i2 % 128;
        if (i2 % 2 == 0) {
            axVar.m589(context, str, bgVar);
            throw null;
        }
        cn cnVarM589 = axVar.m589(context, str, bgVar);
        f432 = (f434 + 17) % 128;
        return cnVarM589;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ List m617(ax axVar) {
        int i2 = f432 + 67;
        f434 = i2 % 128;
        if (i2 % 2 != 0) {
            axVar.m571();
            throw null;
        }
        List<cn> listM571 = axVar.m571();
        f434 = (f432 + 65) % 128;
        return listM571;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized List<cn> m571() {
        List<cn> list;
        int i2 = f432;
        int i3 = i2 + 107;
        f434 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        list = this.f446;
        f434 = (i2 + 11) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private synchronized Map<String, String> m573() {
        Map<String, String> map;
        try {
            int i2 = f434 + 57;
            f432 = i2 % 128;
            if (i2 % 2 == 0) {
                map = this.f448;
                int i3 = 77 / 0;
            } else {
                map = this.f448;
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long m575() {
        if (as.m467().mo499()) {
            f434 = (f432 + 89) % 128;
            return 2000L;
        }
        f432 = (f434 + 25) % 128;
        return 0L;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private synchronized List<gi> m577() {
        List<gi> list;
        int i2 = f434 + 93;
        int i3 = i2 % 128;
        f432 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        list = this.f449;
        int i4 = i3 + 59;
        f434 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        throw th;
        return list;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private synchronized Map<String, JSONObject> m580() {
        Map<String, JSONObject> map;
        int i2 = (f434 + 5) % 128;
        f432 = i2;
        map = this.f447;
        f434 = (i2 + 67) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Map m583(ax axVar) {
        int i2 = f434 + 47;
        f432 = i2 % 128;
        if (i2 % 2 == 0) {
            axVar.m573();
            throw null;
        }
        Map<String, String> mapM573 = axVar.m573();
        int i3 = f434 + 125;
        f432 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        return mapM573;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m596(ax axVar, Context context, String str, String str2, List list, it itVar) {
        int i2 = f432 + 39;
        f434 = i2 % 128;
        int i3 = i2 % 2;
        axVar.m584(context, str, str2, (List<gi>) list, itVar);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m600(ax axVar, List list) {
        int i2 = f432 + 81;
        f434 = i2 % 128;
        int i3 = i2 % 2;
        axVar.f446 = list;
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m616(ax axVar) {
        f434 = (f432 + 107) % 128;
        axVar.m568();
        f432 = (f434 + 81) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m621(ax axVar, Context context, String str, String str2, gi giVar, cn cnVar, boolean z2, bg bgVar, it itVar) {
        f434 = (f432 + 35) % 128;
        axVar.m594(context, str, str2, giVar, cnVar, z2, bgVar, itVar);
        int i2 = f434 + 63;
        f432 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m586(ax axVar, Context context, List list, List list2, it itVar) {
        f434 = (f432 + 65) % 128;
        axVar.m585(context, list, list2, itVar);
        f434 = (f432 + 27) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m597(ax axVar, String str, JSONObject jSONObject) {
        f432 = (f434 + 95) % 128;
        axVar.m625(str, jSONObject);
        f434 = (f432 + 43) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Map m601(ax axVar, Map map) {
        int i2 = (f432 + 55) % 128;
        f434 = i2;
        axVar.f443 = map;
        f432 = (i2 + 117) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m622(ax axVar, Context context, String str, String str2, List list, it itVar) {
        int i2 = f432 + 31;
        f434 = i2 % 128;
        int i3 = i2 % 2;
        axVar.m620(context, str, str2, (List<gi>) list, itVar);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m633(ISAdQualityAdListener iSAdQualityAdListener) {
        int i2 = f434 + 67;
        f432 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f437.m735(iSAdQualityAdListener);
        } else {
            this.f437.m735(iSAdQualityAdListener);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m587(ax axVar, String str) {
        f434 = (f432 + 61) % 128;
        boolean zM609 = axVar.m609(str);
        int i2 = f432 + 35;
        f434 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
        return zM609;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m602(ax axVar, cn cnVar) {
        int i2 = f434 + 47;
        f432 = i2 % 128;
        if (i2 % 2 == 0) {
            m591(cnVar);
            throw null;
        }
        JSONObject jSONObjectM591 = m591(cnVar);
        f432 = (f434 + 3) % 128;
        return jSONObjectM591;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m623(ax axVar, Context context, Map map, Runnable runnable) {
        f432 = (f434 + 95) % 128;
        axVar.m595(context, (Map<String, List<gi>>) map, runnable);
        int i2 = f432 + 53;
        f434 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m629(final Context context, final Runnable runnable) {
        try {
            if (!this.f445) {
                String strIntern = m611("ﹳ꓁桀\uf7ccѡ䐼銛\uf63f텹ꑗ蠜Ͷ", (Process.myPid() >> 22) + 12).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m582(false, new int[]{0, 36, 27, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001").intern());
                sb.append(IronSourceAdQuality.getSDKVersion());
                sb.append(m582(false, new int[]{36, 15, 0, 0}, "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000").intern());
                n.m2830(strIntern, sb.toString());
                it itVar = new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.10
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.10.5
                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                runnable.run();
                            }
                        });
                        ax.m604(ax.this, context);
                    }
                };
                if (m567()) {
                    int i2 = f434 + 1;
                    f432 = i2 % 128;
                    if (i2 % 2 == 0) {
                        m615(context, itVar);
                        throw null;
                    }
                    m615(context, itVar);
                } else {
                    m618(context, itVar);
                    f432 = (f434 + 7) % 128;
                }
                this.f445 = true;
                return;
            }
            s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.12
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    runnable.run();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m632() {
        s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.11
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                Iterator it = ax.m590(ax.this).iterator();
                while (it.hasNext()) {
                    ((cn) it.next()).m1555();
                }
                ax.m617(ax.this).clear();
                ax.m600(ax.this, (List) null);
            }
        });
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.4
            public AnonymousClass4() {
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                bb.this.f716.clear();
                bb.this.f716 = null;
            }
        });
        this.f442 = null;
        s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.15
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() throws Exception {
                ax.m581(ax.this, (dr) null);
            }
        });
        int i2 = f432 + 61;
        f434 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m585(Context context, final List<gi> list, final List<String> list2, final it itVar) {
        final Context context2;
        f434 = (f432 + 45) % 128;
        if (list.isEmpty()) {
            return;
        }
        gi giVarRemove = list.remove(0);
        String strRemove = list2.remove(0);
        if (list.isEmpty()) {
            f434 = (f432 + 113) % 128;
            context2 = context;
        } else {
            context2 = context;
            itVar = new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.13
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    s.m2920(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.13.4
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                            ax.m586(ax.this, context2, list, list2, itVar);
                        }
                    }, as.m467().mo468());
                }
            };
        }
        m614(context2, giVarRemove, strRemove, itVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m604(ax axVar, Context context) {
        int i2 = f434 + 99;
        f432 = i2 % 128;
        int i3 = i2 % 2;
        axVar.m613(context);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m634() {
        int i2 = f434 + 117;
        f432 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                JSONObject jSONObjectM603 = m603(m580());
                f434 = (f432 + 43) % 128;
                return jSONObjectM603;
            }
            m603(m580());
            throw null;
        } catch (JSONException e2) {
            n.m2832(m582(false, new int[]{51, 16, 162, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), m611("餃ꤟ랝騟ࡪ셥㣦촢ﳹ䂘ꥵ㉙욚\uf8a8쒄䱼\uf77e㋽⻰띺鱖㳞\uf6e7뻖햶ﭛ\uf14f\uf69e쒄䱼ᐏ츆", 30 - ImageFormat.getBitsPerPixel(0)).intern(), e2);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m605(ax axVar, Context context, String str, String str2, gi giVar, it itVar) {
        f434 = (f432 + 13) % 128;
        axVar.m619(context, str, str2, giVar, itVar);
        f434 = (f432 + 25) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m606(ax axVar, cn cnVar, String str) {
        int i2 = f432 + 31;
        f434 = i2 % 128;
        int i3 = i2 % 2;
        axVar.m624(cnVar, str);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        f434 = (f432 + 93) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m607(cn cnVar) {
        int i2 = f432 + 31;
        f434 = i2 % 128;
        if (i2 % 2 == 0) {
            return m626(cnVar);
        }
        m626(cnVar);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m608(cn cnVar, String str) {
        int i2 = f434 + 69;
        f432 = i2 % 128;
        if (i2 % 2 != 0) {
            return m588(cnVar, str);
        }
        m588(cnVar, str);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m615(Context context, it itVar) {
        m585(context, new ArrayList(bc.m768()), new ArrayList(bc.m767()), itVar);
        f432 = (f434 + 59) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m631() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = new HashSet(m573().keySet()).iterator();
            f434 = (f432 + 91) % 128;
            while (it.hasNext()) {
                int i2 = f432 + 65;
                f434 = i2 % 128;
                if (i2 % 2 != 0) {
                    String str = (String) it.next();
                    jSONObject2.put(str, m573().get(str));
                    int i3 = 0 / 0;
                } else {
                    String str2 = (String) it.next();
                    jSONObject2.put(str2, m573().get(str2));
                }
            }
            jSONObject.put(m582(true, new int[]{67, 4, 171, 0}, "\u0000\u0001\u0000\u0001").intern(), jSONObject2);
            return jSONObject;
        } catch (JSONException e2) {
            n.m2832(m582(false, new int[]{51, 16, 162, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), m582(false, new int[]{71, 29, 131, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001").intern(), e2);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m618(Context context, it itVar) {
        int i2 = f432 + 91;
        f434 = i2 % 128;
        if (i2 % 2 == 0) {
            m614(context, bc.m769(), bc.m774(), itVar);
            f434 = (f432 + 69) % 128;
        } else {
            m614(context, bc.m769(), bc.m774(), itVar);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m614(final Context context, final gi giVar, final String str, final it itVar) {
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.14
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                final String lowerCase = str.toLowerCase();
                ax.m599(ax.this).m764(lowerCase);
                s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.14.5

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static int f474 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static char f475 = 4;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f476;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static char[] f477 = {'C', 'o', 'n', 'e', 'c', 't', 'r', 'M', 'a', 'g', 'I', 'i', 'l', 'z', ' ', 'E'};

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m637(byte b2, String str2, int i2) {
                        String str3;
                        Object charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (i.f2343) {
                            try {
                                char[] cArr2 = f477;
                                char c2 = f475;
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
                                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                                int i4 = (i.f2346 * c2) + i.f2342;
                                                int i5 = (i.f2344 * c2) + i.f2341;
                                                int i6 = i.f2348;
                                                cArr3[i6] = cArr2[i4];
                                                cArr3[i6 + 1] = cArr2[i5];
                                            } else if (i.f2346 == i.f2344) {
                                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                                i.f2341 = a.b(i.f2341, c2, 1, c2);
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
                                str3 = new String(cArr3);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str3;
                    }

                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        String strIntern = m637((byte) (63 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0001\u0002¬¬\u0000\u0007\t\u0005\u0007\u0004\n\u0000\t\n\u0002\u0007", 15 - TextUtils.indexOf((CharSequence) "", '0')).intern();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m637((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 104), "\u000e\u0006\t\u0007\b\t\u000f\b\u000f\t\u0001\n\f\u0006\u0002\u0003\u0003\u0000\u0005\u0006\u0002\u0005\u0089", (Process.myTid() >> 22) + 23).intern());
                        sb.append(lowerCase);
                        n.m2844(strIntern, sb.toString());
                        try {
                            AnonymousClass14 anonymousClass14 = AnonymousClass14.this;
                            ax.m605(ax.this, context, str, lowerCase, giVar, itVar);
                            int i2 = f474 + 91;
                            f476 = i2 % 128;
                            if (i2 % 2 != 0) {
                                int i3 = 77 / 0;
                            }
                        } catch (Throwable th) {
                            s.m2922(ax.m599(ax.this).new AnonymousClass3(lowerCase, ba.b.f698));
                            ax.m583(ax.this).put(str, kb.m2753(th).toString());
                            String strIntern2 = m637((byte) (Drawable.resolveOpacity(0, 0) + 62), "\u0001\u0002¬¬\u0000\u0007\t\u0005\u0007\u0004\n\u0000\t\n\u0002\u0007", 15 - MotionEvent.axisFromString("")).intern();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m637((byte) (65 - View.getDefaultSize(0, 0)), "\u000e\u0007\u0005\u0002\n\u0002\u0005\u0007\u0000\u000b\u0007\t\u0001\n\f\u0006\u0002\u0003\u0003\u0000\u0005\u0006\u0002\u0005a", 25 - ExpandableListView.getPackedPositionGroup(0L)).intern());
                            sb2.append(lowerCase);
                            kb.m2755(strIntern2, sb2.toString(), th, true, true, true);
                        }
                    }
                });
            }
        });
        f434 = (f432 + 123) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m584(final Context context, final String str, final String str2, final List<gi> list, final it itVar) {
        s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.3

            /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
            private static int f493 = 1;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f494 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static long f495 = -6272247352762324575L;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static char f496;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f497;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m639(int i2, char c2, String str3, String str4, String str5) {
                String str6;
                Object charArray = str5;
                if (str5 != null) {
                    charArray = str5.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str4;
                if (str4 != null) {
                    charArray2 = str4.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str3;
                if (str3 != null) {
                    charArray3 = str3.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (j.f2569) {
                    try {
                        char[] cArr4 = (char[]) cArr3.clone();
                        char[] cArr5 = (char[]) cArr.clone();
                        cArr4[0] = (char) (c2 ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i2));
                        int length = cArr2.length;
                        char[] cArr6 = new char[length];
                        j.f2567 = 0;
                        while (true) {
                            int i3 = j.f2567;
                            if (i3 < length) {
                                int i4 = (i3 + 2) % 4;
                                int i5 = (i3 + 3) % 4;
                                int i6 = cArr4[i3 % 4] * 32718;
                                char c3 = cArr5[i4];
                                char c4 = (char) ((i6 + c3) % 65535);
                                j.f2568 = c4;
                                cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                                cArr4[i5] = c4;
                                int i7 = j.f2567;
                                cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f495) ^ ((long) f494)) ^ ((long) f496));
                                j.f2567 = i7 + 1;
                            } else {
                                str6 = new String(cArr6);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str6;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                String strIntern = m639((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Color.blue(0) + 49089), "Ⴗ호섻調", "㬲炉퍄깑瓗뺑媿吘꣯\uf4dc归閤퀠\ufaf5嘌䏢", "ꦡ댷聃ꣴ").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m639((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1209627490, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "捠ᥳꁈ䌝", "ᕫᰏ驙냮芊䱉倂ᖺ莵\uee29ꮦ\ue1ac冄됣誛◃瓐輘县昬殖훚\uf519", "ꦡ댷聃ꣴ").intern());
                sb.append(str2);
                n.m2844(strIntern, sb.toString());
                try {
                    ax.m622(ax.this, context, str, str2, list, itVar);
                } catch (Throwable th) {
                    if (ax.m599(ax.this) != null) {
                        s.m2922(ax.m599(ax.this).new AnonymousClass3(str2, ba.b.f698));
                    }
                    ax.m583(ax.this).put(str, kb.m2753(th).toString());
                    String strIntern2 = m639(TextUtils.getTrimmedLength(""), (char) ((Process.myTid() >> 22) + 49089), "Ⴗ호섻調", "㬲炉퍄깑瓗뺑媿吘꣯\uf4dc归閤퀠\ufaf5嘌䏢", "ꦡ댷聃ꣴ").intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m639(View.getDefaultSize(0, 0) + 362923436, (char) Drawable.resolveOpacity(0, 0), "걂ꇅ\ueb15箿", "廮\udfc3좑◪ࣽվ蠢꿙ףּ橡芻㉶۴檣\uedceᩡ걝௨販⟨훆湒窘⪞鮸", "ꦡ댷聃ꣴ").intern());
                    sb2.append(str2);
                    kb.m2755(strIntern2, sb2.toString(), th, true, true, true);
                    int i2 = f497 + 115;
                    f493 = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                }
            }
        });
        int i2 = f434 + 61;
        f432 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m613(final Context context) {
        f432 = (f434 + 35) % 128;
        if (!m570()) {
            s.m2920(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.20
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.20.1
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            ax.m616(ax.this);
                        }
                    });
                }
            }, as.m467().mo473());
        }
        final Map<String, List<gi>> mapM772 = bc.m772();
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.19
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ax.m601(ax.this, as.m467().mo493());
                ax.m623(ax.this, context, mapM772, new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.19.4
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        if (ax.m574(ax.this)) {
                            ax.m616(ax.this);
                        }
                    }
                });
                as.m467().mo495(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.19.1

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f484 = 0;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f485 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static long f486 = 7143807921309903958L;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m638(String str, int i2) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (f.f1955) {
                            try {
                                char[] cArrM2116 = f.m2116(f486, cArr, i2);
                                f.f1954 = 4;
                                while (true) {
                                    int i3 = f.f1954;
                                    if (i3 < cArrM2116.length) {
                                        int i4 = i3 - 4;
                                        f.f1953 = i4;
                                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f486));
                                        f.f1954 = i3 + 1;
                                    } else {
                                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str2;
                    }

                    @Override // com.p004ironsource.adqualitysdk.sdk.i.at
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo319() {
                        f485 = (f484 + 105) % 128;
                        ax.m601(ax.this, as.m467().mo493());
                        n.m2844(m638("䌯䍬ᖐ禩ꢕ灗ꥁ\uec2d\uf212摤﨧ᨘ⇭뛢䭪䯱坆戀鲆땕", TextUtils.getCapsMode("", 0, 0)).intern(), m638("㌄㍀则㸦➯ｰౘ䤻舾⏤甝뼏凓\uf100쑅\ueee7❥브Ꭽၐ\uf608\u0ff9愆䌼䗘\udd08끷\uf2ee᭺ꨮﾩ⑊\uea18篷䴖圢", 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
                        ax.m578(ax.this);
                        int i2 = f485 + 27;
                        f484 = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                    }
                });
            }
        });
        f432 = (f434 + 101) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m588(cn cnVar, String str) {
        f434 = (f432 + 101) % 128;
        if (m582(false, new int[]{100, 7, 196, 7}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern().equals(str)) {
            return true;
        }
        f432 = (f434 + 107) % 128;
        if (!TextUtils.isEmpty(str)) {
            f434 = (f432 + 7) % 128;
            if (kd.m2781(str, cnVar.m1549()) >= 0) {
                int i2 = f434 + 75;
                f432 = i2 % 128;
                int i3 = i2 % 2;
                String strM1548 = cnVar.m1548();
                if (i3 == 0) {
                    kd.m2781(str, strM1548);
                    throw null;
                }
                if (kd.m2781(str, strM1548) <= 0) {
                    return true;
                }
            }
        }
        f432 = (f434 + 113) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m595(Context context, Map<String, List<gi>> map, Runnable runnable) {
        Context context2;
        Map<String, List<gi>> map2;
        Runnable runnable2;
        while (map != null) {
            f432 = (f434 + 27) % 128;
            if (map.size() <= 0) {
                break;
            }
            f432 = (f434 + 45) % 128;
            String next = map.keySet().iterator().next();
            List<gi> listRemove = map.remove(next);
            String strM612 = m612(listRemove);
            if (strM612 != null) {
                this.f442.m764(strM612);
                context2 = context;
                map2 = map;
                runnable2 = runnable;
                s.m2924(new AnonymousClass5(strM612, context2, next, listRemove, map2, runnable2));
                if (!(!m570())) {
                    return;
                }
            } else {
                context2 = context;
                map2 = map;
                runnable2 = runnable;
            }
            context = context2;
            map = map2;
            runnable = runnable2;
        }
        final Runnable runnable3 = runnable;
        s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.2
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                s.m2924(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.2.3
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        runnable3.run();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m625(String str, JSONObject jSONObject) {
        s.m2922(this.f442.new AnonymousClass1(str, ba.c.f712));
        if (jSONObject != null) {
            f434 = (f432 + 43) % 128;
            try {
                jSONObject.put(m611("寏蟭ᐏ츆", 3 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), true);
                int i2 = f432 + 17;
                f434 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m612(List<gi> list) {
        if (list == null) {
            return null;
        }
        f434 = (f432 + 65) % 128;
        if (list.isEmpty()) {
            return null;
        }
        int i2 = f434 + 51;
        f432 = i2 % 128;
        if (i2 % 2 == 0) {
            if (list.get(0) == null) {
                return null;
            }
        } else if (list.get(0) == null) {
            return null;
        }
        return list.get(0).mo2139();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m628(String str) {
        m630(str, new ArrayList());
        int i2 = f432 + 85;
        f434 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m627() {
        ISAdQualityInitListener iSAdQualityInitListener;
        try {
            int i2 = f432 + 17;
            int i3 = i2 % 128;
            f434 = i3;
            if (i2 % 2 != 0) {
                iSAdQualityInitListener = this.f439;
                int i4 = 98 / 0;
            } else {
                iSAdQualityInitListener = this.f439;
            }
            f432 = (i3 + 49) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return iSAdQualityInitListener;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m582(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2186) {
            try {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = new char[i3];
                System.arraycopy(f433, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    h.f2185 = 0;
                    char c2 = 0;
                    while (true) {
                        int i6 = h.f2185;
                        if (i6 >= i3) {
                            break;
                        }
                        if (bArr[i6] == 1) {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                        } else {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                        }
                        c2 = cArr2[i6];
                        h.f2185 = i6 + 1;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i7 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i7, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i7);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    h.f2185 = 0;
                    while (true) {
                        int i8 = h.f2185;
                        if (i8 >= i3) {
                            break;
                        }
                        cArr4[i8] = cArr[(i3 - i8) - 1];
                        h.f2185 = i8 + 1;
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    h.f2185 = 0;
                    while (true) {
                        int i9 = h.f2185;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr[i9] = (char) (cArr[i9] - iArr[2]);
                        h.f2185 = i9 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m624(final cn cnVar, final String str) {
        final String strM1557 = cnVar.m1557();
        s.m2922(this.f442.new AnonymousClass1(strM1557, ba.c.f714));
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.4

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f504 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f505 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f507 = {'l', 207, 'x', 243, 251, 247, 238, 244, 245, 241, 'F', 136, 131, 138, 144, 143, '~', 'v', 134, 134, 131, 133, 138, 'y', 'x', 141};

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f506 = 22;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m641(int i2, int i3, int i4, String str2, boolean z2) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (b.f672) {
                    try {
                        char[] cArr2 = new char[i3];
                        b.f673 = 0;
                        while (true) {
                            int i5 = b.f673;
                            if (i5 >= i3) {
                                break;
                            }
                            b.f671 = cArr[i5];
                            cArr2[b.f673] = (char) (b.f671 + i4);
                            int i6 = b.f673;
                            cArr2[i6] = (char) (cArr2[i6] - f506);
                            b.f673 = i6 + 1;
                        }
                        if (i2 > 0) {
                            b.f674 = i2;
                            char[] cArr3 = new char[i3];
                            System.arraycopy(cArr2, 0, cArr3, 0, i3);
                            int i7 = b.f674;
                            System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                            int i8 = b.f674;
                            System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                        }
                        if (z2) {
                            char[] cArr4 = new char[i3];
                            b.f673 = 0;
                            while (true) {
                                int i9 = b.f673;
                                if (i9 >= i3) {
                                    break;
                                }
                                cArr4[i9] = cArr2[(i3 - i9) - 1];
                                b.f673 = i9 + 1;
                            }
                            cArr2 = cArr4;
                        }
                        str3 = new String(cArr2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str3;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo642(Throwable th) {
                s.m2922(ax.m599(ax.this).new AnonymousClass3(strM1557, ba.b.f696));
                String strIntern = m640(false, new int[]{10, 16, 31, 13}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m641(ExpandableListView.getPackedPositionType(0L) + 10, 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 121, "\u0011\u0006\u000b\u0006ﾽ\u000f\f\u000f\u000f￢ﾽ\u000f\f\u0011\u0000\u0002\u000b\u000b\f\u0000ﾽ\u0004\u000b\u0006\u0017\u0006\t\ufffe\u0006", true).intern());
                sb.append(strM1557);
                kb.m2755(strIntern, sb.toString(), th, true, true, true);
                f505 = (f504 + 97) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() throws Exception {
                f504 = (f505 + 47) % 128;
                JSONObject jSONObjectM602 = ax.m602(ax.this, cnVar);
                int i2 = 2;
                jSONObjectM602.put(m640(true, new int[]{0, 2, 97, 0}, "\u0001\u0001").intern(), true);
                ax.m572(ax.this).put(cnVar.m1557(), jSONObjectM602);
                String strM1547 = cnVar.m1547();
                if (m640(false, new int[]{2, 8, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001").intern().equals(strM1547)) {
                    String strIntern = m640(false, new int[]{10, 16, 31, 13}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001").intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(cnVar.m1553());
                    sb.append(m641(View.combineMeasuredStates(0, 0) + 6, 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), 117 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0014\u0002\u0003\r\u0006\u0005\uffc1\u0004\u0010\u000f\u000f\u0006\u0004\u0015\u0010\u0013\uffc1\n\u0014\uffc1\u0005\n", false).intern());
                    n.m2844(strIntern, sb.toString());
                    s.m2922(ax.m599(ax.this).new AnonymousClass1(strM1557, ba.c.f712));
                } else if (ax.m587(ax.this, strM1557)) {
                    String strIntern2 = m640(false, new int[]{10, 16, 31, 13}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001").intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cnVar.m1553());
                    sb2.append(m641((ViewConfiguration.getLongPressTimeout() >> 16) + 14, 39 - (ViewConfiguration.getScrollBarSize() >> 8), 117 - KeyEvent.normalizeMetaState(0), "\u0013\u0010\u000e\uffc1\u0015\t\u0006\uffc1\u0014\u0006\u0013\u0017\u0006\u0013\uffc1\u0004\u0010\u000f\u000f\u0006\u0004\u0015\u0010\u0013\uffc1\u0018\u0002\u0014\uffc1\u0005\n\u0014\u0002\u0003\r\u0006\u0005\uffc1\u0007", false).intern());
                    n.m2844(strIntern2, sb2.toString());
                    s.m2922(ax.m599(ax.this).new AnonymousClass1(strM1557, ba.c.f712));
                    jSONObjectM602.put(m641(3 - KeyEvent.keyCodeFromString(""), 3 - (ViewConfiguration.getJumpTapTimeout() >> 16), 126 - TextUtils.getTrimmedLength(""), "\u000b\ufffb￼", true).intern(), true);
                } else if (ax.m608(cnVar, strM1547)) {
                    s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.4.3

                        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                        private static int f512 = 0;

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static int f513 = 1;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static char f514 = 26239;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static char f515 = 54340;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static char f516 = 38473;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static char f517 = 41735;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static String m643(String str2, int i3) {
                            String str3;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (m.f2870) {
                                try {
                                    char[] cArr2 = new char[cArr.length];
                                    m.f2869 = 0;
                                    char[] cArr3 = new char[2];
                                    while (true) {
                                        int i4 = m.f2869;
                                        if (i4 < cArr.length) {
                                            cArr3[0] = cArr[i4];
                                            cArr3[1] = cArr[i4 + 1];
                                            int i5 = 58224;
                                            for (int i6 = 0; i6 < 16; i6++) {
                                                char c2 = cArr3[1];
                                                char c3 = cArr3[0];
                                                char c4 = (char) (c2 - (((c3 + i5) ^ ((c3 << 4) + f517)) ^ ((c3 >>> 5) + f515)));
                                                cArr3[1] = c4;
                                                cArr3[0] = (char) (c3 - (((c4 >>> 5) + f514) ^ ((c4 + i5) ^ ((c4 << 4) + f516))));
                                                i5 -= 40503;
                                            }
                                            int i7 = m.f2869;
                                            cArr2[i7] = cArr3[0];
                                            cArr2[i7 + 1] = cArr3[1];
                                            m.f2869 = i7 + 2;
                                        } else {
                                            str3 = new String(cArr2, 0, i3);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return str3;
                        }

                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo642(Throwable th) {
                            try {
                                ((JSONObject) ax.m572(ax.this).get(cnVar.m1557())).put(m643("\ue0fbⅠ⊡ꇃ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 4).intern(), false);
                                f512 = (f513 + 7) % 128;
                            } catch (JSONException e2) {
                                n.m2832(m643("簄햍仯ᕕ輸\uf194ࢅ酒흸▌㝬칆薸졲Ⱅ爜", 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m643("蓛곊麹놃ꖴ굂겊씄캊浴\ue0fbⅠ\uea5b\uea75\ue0fbⅠ⊡ꇃ觍硳ᙧ\ue55e夓셈仯ᕕ輸\uf194ࢅ酒ꖴ굂䶸\u16fcﺩ님\uee71\udc52럩륮\u07beႠ䲆ᡆ", '\\' - AndroidCharacter.getMirror('0')).intern(), e2);
                            }
                            s.m2922(ax.m599(ax.this).new AnonymousClass3(strM1557, ba.b.f700));
                            String strIntern3 = m643("簄햍仯ᕕ輸\uf194ࢅ酒흸▌㝬칆薸졲Ⱅ爜", 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m643("蓛곊麹놃ꖴ굂\ue0fbⅠ⊡ꇃ⏄鈺ે斋⋡䆖⟧綂\uf2ee苆", TextUtils.getOffsetBefore("", 0) + 19).intern());
                            sb3.append(cnVar.m1553());
                            kb.m2755(strIntern3, a.C(sb3, m643("\ue6be㔃䲆ᡆ賚튛욀\u05fc漍ᬔ", 10 - KeyEvent.getDeadChar(0, 0))), th, true, true, true);
                            String strIntern4 = m643("洋\ue506旁䁚ঢ璘⊡ꇃ盺☯茷\ue98d", 12 - TextUtils.getCapsMode("", 0, 0)).intern();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m643("覩࿇煮诿\ue6c6\uf37f漍ᬔ\uf5d6껚\udd47㮜젴뿣Ꮌꎯ쏤㚄ⴉ❿䞱ᠢ뎭\ue9d9\ue0fbⅠ⊡ꇃ⏄鈺ે斋⋡䆖⟧綂\uab6dᠱ鯽․钳\u19cb㯮聦ે斋㒫蘥ᔪ뤂茷\ue98d\uf2ee苆", 53 - TextUtils.getOffsetBefore("", 0)).intern());
                            sb4.append(cnVar.m1553());
                            sb4.append(m643("\ue6be㔃䲆ᡆ賚튛욀\u05fc漍ᬔㇳ\udad1", 11 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
                            n.m2828(strIntern4, sb4.toString());
                            int i3 = f512 + 125;
                            f513 = i3 % 128;
                            if (i3 % 2 == 0) {
                                throw null;
                            }
                        }

                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            cnVar.m1556();
                            s.m2922(ax.m599(ax.this).new AnonymousClass1(strM1557, ba.c.f715));
                            String strIntern3 = m643("簄햍仯ᕕ輸\uf194ࢅ酒흸▌㝬칆薸졲Ⱅ爜", Color.argb(0, 0, 0, 0) + 16).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(cnVar.m1553());
                            sb3.append(m643("\ue6be㔃䲆ᡆ賚튛욀\u05fc漍ᬔ惿䜴첨諅镫뷈\ud8ab쉸\uf7b1∗ꖽ㔍\uf4f2ꖊ\ue0fbⅠ⊡ꇃ⏄鈺ે斋陆䇐奫뙃", 35 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                            n.m2844(strIntern3, sb3.toString());
                            int i3 = f512 + 121;
                            f513 = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i4 = 36 / 0;
                            }
                        }
                    });
                    ax.m617(ax.this).add(cnVar);
                } else {
                    jSONObjectM602.put(m641(-((byte) KeyEvent.getModifierMetaStateMask()), 3 - (Process.myPid() >> 22), 138 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\uffff\uffff\u0002", true).intern(), false);
                    s.m2922(ax.m599(ax.this).new AnonymousClass3(strM1557, ba.b.f701));
                    String strIntern3 = m640(false, new int[]{10, 16, 31, 13}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001").intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    kb.m2755(strIntern3, a.C(sb3, m641(8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 19 - Color.red(0), View.MeasureSpec.getMode(0) + 117, "\u0011\u0016\u0014\uffc1\u0015\u0010\u000f\uffc1\u0015\u0006\u001a\uffc1ￍ\u0005\u0006\u0015\u0013\u0010\u0011", true)), null, true, true, true);
                    ISAdQualityInitListener iSAdQualityInitListenerM627 = ax.this.m627();
                    ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(cnVar.m1553());
                    sb4.append(m641(ExpandableListView.getPackedPositionChild(0L) + 3, (ViewConfiguration.getTouchSlop() >> 8) + 13, 106 - (KeyEvent.getMaxKeyCode() >> 16), "\u001aￌￌ\uffff\ufff0\ufff7ￌ\"\u0011\u001e\u001f\u0015\u001b", false).intern());
                    sb4.append(cnVar.m1547());
                    sb4.append(m641(TextUtils.indexOf((CharSequence) "", '0', 0) + 35, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 38, TextUtils.indexOf("", "") + 117, "\u0006\u000f\u000f\u0010\u0004\uffc1\u0006\t\u0015\uffc1\u001a\u0003\uffc1\u0005\u0006\u0015\u0013\u0010\u0011\u0011\u0016\u0014\uffc1\u0015\u0006\u001a\uffc1\u0015\u0010\u000f\uffc1\u0014\n\uffc1\u0013\u0010\u0015\u0004", true).intern());
                    iSAdQualityInitListenerM627.adQualitySdkInitFailed(iSAdQualityInitError, sb4.toString());
                    i2 = 2;
                }
                jSONObjectM602.remove(m640(true, new int[]{0, i2, 97, 0}, "\u0001\u0001").intern());
                f504 = (f505 + 29) % 128;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m640(boolean z2, int[] iArr, String str2) throws UnsupportedEncodingException {
                String str3;
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes(CharEncoding.ISO_8859_1);
                }
                byte[] bArr = (byte[]) bytes;
                synchronized (h.f2186) {
                    try {
                        int i2 = iArr[0];
                        int i3 = iArr[1];
                        int i4 = iArr[2];
                        int i5 = iArr[3];
                        char[] cArr = new char[i3];
                        System.arraycopy(f507, i2, cArr, 0, i3);
                        if (bArr != null) {
                            char[] cArr2 = new char[i3];
                            h.f2185 = 0;
                            char c2 = 0;
                            while (true) {
                                int i6 = h.f2185;
                                if (i6 >= i3) {
                                    break;
                                }
                                if (bArr[i6] == 1) {
                                    cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                                } else {
                                    cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                                }
                                c2 = cArr2[i6];
                                h.f2185 = i6 + 1;
                            }
                            cArr = cArr2;
                        }
                        if (i5 > 0) {
                            char[] cArr3 = new char[i3];
                            System.arraycopy(cArr, 0, cArr3, 0, i3);
                            int i7 = i3 - i5;
                            System.arraycopy(cArr3, 0, cArr, i7, i5);
                            System.arraycopy(cArr3, i5, cArr, 0, i7);
                        }
                        if (z2) {
                            char[] cArr4 = new char[i3];
                            h.f2185 = 0;
                            while (true) {
                                int i8 = h.f2185;
                                if (i8 >= i3) {
                                    break;
                                }
                                cArr4[i8] = cArr[(i3 - i8) - 1];
                                h.f2185 = i8 + 1;
                            }
                            cArr = cArr4;
                        }
                        if (i4 > 0) {
                            h.f2185 = 0;
                            while (true) {
                                int i9 = h.f2185;
                                if (i9 >= i3) {
                                    break;
                                }
                                cArr[i9] = (char) (cArr[i9] - iArr[2]);
                                h.f2185 = i9 + 1;
                            }
                        }
                        str3 = new String(cArr);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str3;
            }
        });
        int i2 = f432 + 97;
        f434 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m609(String str) {
        if (!this.f443.containsKey(str)) {
            return false;
        }
        int i2 = f434 + 71;
        f432 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f443.get(str).m564(this.f441);
            throw null;
        }
        if (!this.f443.get(str).m564(this.f441)) {
            return false;
        }
        int i3 = f434;
        f432 = (i3 + 29) % 128;
        int i4 = i3 + 121;
        f432 = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private cn m589(Context context, String str, bg bgVar) {
        int i2 = f432;
        int i3 = i2 + 61;
        f434 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str == null) {
            int i4 = i2 + 95;
            f434 = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        cn cnVar = new cn(context, new dj(str, this.f444), this.f437, this.f440, bgVar);
        int i5 = f434 + 85;
        f432 = i5 % 128;
        if (i5 % 2 != 0) {
            return cnVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m603(Map<String, JSONObject> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = new HashSet(map.keySet()).iterator();
        while (it.hasNext()) {
            int i2 = f432 + 31;
            f434 = i2 % 128;
            if (i2 % 2 != 0) {
                String str = (String) it.next();
                jSONObject2.put(str.toLowerCase(), map.get(str));
                int i3 = 19 / 0;
            } else {
                String str2 = (String) it.next();
                jSONObject2.put(str2.toLowerCase(), map.get(str2));
            }
        }
        jSONObject.put(m611("\uea89捇㛮¥", ExpandableListView.getPackedPositionChild(0L) + 5).intern(), jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m611(String str, int i2) {
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
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f430)) ^ ((c3 >>> 5) + f431)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f436) ^ ((c4 + i4) ^ ((c4 << 4) + f435))));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m620(Context context, String str, String str2, List<gi> list, it itVar) {
        f434 = (f432 + 63) % 128;
        Iterator<gi> it = list.iterator();
        f434 = (f432 + 27) % 128;
        while (it.hasNext()) {
            f432 = (f434 + 69) % 128;
            m619(context, str, str2, it.next(), itVar);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m594(final Context context, final String str, final String str2, final gi giVar, final cn cnVar, final boolean z2, final bg bgVar, final it itVar) {
        s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.9

            /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
            private static char f545 = 0;

            /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
            private static int f546 = -816930986;

            /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
            private static int f547 = 1;

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f548;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static long f549;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m644(int i2, char c2, String str3, String str4, String str5) {
                String str6;
                Object charArray = str5;
                if (str5 != null) {
                    charArray = str5.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str4;
                if (str4 != null) {
                    charArray2 = str4.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str3;
                if (str3 != null) {
                    charArray3 = str3.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (j.f2569) {
                    try {
                        char[] cArr4 = (char[]) cArr3.clone();
                        char[] cArr5 = (char[]) cArr.clone();
                        cArr4[0] = (char) (c2 ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i2));
                        int length = cArr2.length;
                        char[] cArr6 = new char[length];
                        j.f2567 = 0;
                        while (true) {
                            int i3 = j.f2567;
                            if (i3 < length) {
                                int i4 = (i3 + 2) % 4;
                                int i5 = (i3 + 3) % 4;
                                int i6 = cArr4[i3 % 4] * 32718;
                                char c3 = cArr5[i4];
                                char c4 = (char) ((i6 + c3) % 65535);
                                j.f2568 = c4;
                                cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                                cArr4[i5] = c4;
                                int i7 = j.f2567;
                                cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f549) ^ ((long) f546)) ^ ((long) f545));
                                j.f2567 = i7 + 1;
                            } else {
                                str6 = new String(cArr6);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str6;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                String strIntern;
                it itVar2;
                if (cnVar == null || ax.m576(ax.this).contains(giVar)) {
                    return;
                }
                s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.2

                    /* JADX INFO: renamed from: ﻐ */
                    private /* synthetic */ boolean f720;

                    /* JADX INFO: renamed from: ｋ */
                    private /* synthetic */ cn f721;

                    /* JADX INFO: renamed from: ﾒ */
                    private /* synthetic */ String f723;

                    public AnonymousClass2() {
                        str = str;
                        cnVar = cnVar;
                        z = z;
                    }

                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        ba baVarM760 = bb.m760(bb.this, str);
                        if (baVarM760 != null) {
                            baVarM760.m752(cnVar);
                        }
                    }
                });
                if (!cnVar.m1545() && (itVar2 = itVar) != null) {
                    s.m2926(itVar2);
                }
                if (!ax.m607(cnVar)) {
                    s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.9.4

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static int f559 = 0;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static char[] f560 = {'9', 'j', 'k', '9', 'n', 'l', 'n', 'G', ' ', 'I', 'k', 'g', 'E', 'K', 'm', 'k', 16, 'G', 'n', 'l', 'n', 'r', 'k', 'm', 'K', 'E', 'g', 'k', 'I', '@', 'f', 'l', 'n', 'o', 'a', '9', 'I', 'l', 'k', 'm', 'o', 's', 'k', 'k', 'I', 24, 'W', 128, 'Y', 'W', 'y', '~', '~', AbstractJsonLexerKt.BEGIN_OBJ, 'D', 136, 143, 149, 148, 131, AbstractJsonLexerKt.BEGIN_OBJ, 139, 139, 136, 138, 143, '~', AbstractJsonLexerKt.END_OBJ, 146, 146};

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f561 = 1;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static String m645(boolean z3, int[] iArr, String str3) throws UnsupportedEncodingException {
                            String str4;
                            Object bytes = str3;
                            if (str3 != null) {
                                bytes = str3.getBytes(CharEncoding.ISO_8859_1);
                            }
                            byte[] bArr = (byte[]) bytes;
                            synchronized (h.f2186) {
                                try {
                                    int i2 = iArr[0];
                                    int i3 = iArr[1];
                                    int i4 = iArr[2];
                                    int i5 = iArr[3];
                                    char[] cArr = new char[i3];
                                    System.arraycopy(f560, i2, cArr, 0, i3);
                                    if (bArr != null) {
                                        char[] cArr2 = new char[i3];
                                        h.f2185 = 0;
                                        char c2 = 0;
                                        while (true) {
                                            int i6 = h.f2185;
                                            if (i6 >= i3) {
                                                break;
                                            }
                                            if (bArr[i6] == 1) {
                                                cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                                            } else {
                                                cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                                            }
                                            c2 = cArr2[i6];
                                            h.f2185 = i6 + 1;
                                        }
                                        cArr = cArr2;
                                    }
                                    if (i5 > 0) {
                                        char[] cArr3 = new char[i3];
                                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                                        int i7 = i3 - i5;
                                        System.arraycopy(cArr3, 0, cArr, i7, i5);
                                        System.arraycopy(cArr3, i5, cArr, 0, i7);
                                    }
                                    if (z3) {
                                        char[] cArr4 = new char[i3];
                                        h.f2185 = 0;
                                        while (true) {
                                            int i8 = h.f2185;
                                            if (i8 >= i3) {
                                                break;
                                            }
                                            cArr4[i8] = cArr[(i3 - i8) - 1];
                                            h.f2185 = i8 + 1;
                                        }
                                        cArr = cArr4;
                                    }
                                    if (i4 > 0) {
                                        h.f2185 = 0;
                                        while (true) {
                                            int i9 = h.f2185;
                                            if (i9 >= i3) {
                                                break;
                                            }
                                            cArr[i9] = (char) (cArr[i9] - iArr[2]);
                                            h.f2185 = i9 + 1;
                                        }
                                    }
                                    str4 = new String(cArr);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return str4;
                        }

                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            f561 = (f559 + 49) % 128;
                            if (!ax.m583(ax.this).containsKey(cnVar.m1557())) {
                                s.m2922(ax.m599(ax.this).new AnonymousClass3(cnVar.m1557(), ba.b.f702));
                                AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                JSONObject jSONObjectM602 = ax.m602(ax.this, cnVar);
                                try {
                                    jSONObjectM602.put(m645(false, new int[]{0, 3, 0, 1}, "\u0001\u0000\u0001").intern(), false);
                                } catch (JSONException unused) {
                                }
                                ax.m572(ax.this).put(cnVar.m1557(), jSONObjectM602);
                                String strM762 = ax.m599(ax.this).m762(cnVar.m1557());
                                ax.m583(ax.this).put(cnVar.m1557(), strM762);
                                ISAdQualityInitListener iSAdQualityInitListenerM627 = ax.this.m627();
                                ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
                                StringBuilder sb = new StringBuilder();
                                sb.append(cnVar.m1553());
                                sb.append(m645(false, new int[]{3, 13, 0, 5}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern());
                                sb.append(cnVar.m1547());
                                sb.append(m645(true, new int[]{16, 29, 0, 0}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000").intern());
                                sb.append(cnVar.m1551());
                                sb.append(m645(false, new int[]{45, 9, 16, 0}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001").intern());
                                iSAdQualityInitListenerM627.adQualitySdkInitFailed(iSAdQualityInitError, sb.toString());
                                kb.m2755(m645(false, new int[]{54, 16, 36, 12}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000").intern(), strM762, null, true, true, true);
                                f559 = (f561 + 111) % 128;
                            }
                            f559 = (f561 + 101) % 128;
                        }
                    });
                    return;
                }
                String strIntern2 = m644(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (52796 - (Process.myPid() >> 22)), "᪅\u2e64㲴࿎", "섄邽㉡淋腶딪㠥挔ᅯ\udc3a䴕탿鷏㩿ꭊ䫗", "\u0000\u0000\u0000\u0000").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m644(383071107 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 22017), "芯픳Ė퉖", "貫いꭒм軐憐옋뵍\uefe5훖ᔎ䊢\ud9e0", "\u0000\u0000\u0000\u0000").intern());
                sb.append(str);
                sb.append(m644(TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34184), "鲮쯃蠉礪", "뱔ऒꆅ֛ꝥ湮\ufbc3ꘌ㯤࢞쑭䳢훹뙲쯄矂熥┻", "\u0000\u0000\u0000\u0000").intern());
                if (z2) {
                    strIntern = m644(ViewConfiguration.getFadingEdgeLength() >> 16, (char) KeyEvent.normalizeMetaState(0), "撲\ue663䖺ػ", "\u18ff槿⧷⁌\uf5ae牑樘弯", "\u0000\u0000\u0000\u0000").intern();
                } else {
                    strIntern = m644((ViewConfiguration.getDoubleTapTimeout() >> 16) - 865976641, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "뾀戾擌\uf140", "ꠤ\ue651紦\ue238ꛌ筘铉␜误", "\u0000\u0000\u0000\u0000").intern();
                    f548 = (f547 + 99) % 128;
                }
                sb.append(strIntern);
                cq.m1678(strIntern2, sb.toString());
                bgVar.m791();
                if (cnVar.m1545()) {
                    f547 = (f548 + 103) % 128;
                    it itVar3 = itVar;
                    if (itVar3 != null) {
                        s.m2926(itVar3);
                    }
                }
                if (r.m2874().m2905()) {
                    return;
                }
                f548 = (f547 + 59) % 128;
                ax.m606(ax.this, cnVar, str);
                if (ax.m587(ax.this, cnVar.m1557())) {
                    return;
                }
                int i2 = f548 + 111;
                f547 = i2 % 128;
                if (i2 % 2 != 0) {
                    ax.m576(ax.this).add(giVar);
                } else {
                    ax.m576(ax.this).add(giVar);
                    int i3 = 93 / 0;
                }
            }
        });
        f434 = (f432 + 87) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m591(cn cnVar) {
        f434 = (f432 + 125) % 128;
        JSONObject jSONObjectM592 = m592(cnVar.m1547());
        try {
            jSONObjectM592.put(ik.f2426, cnVar.m1552());
        } catch (JSONException e2) {
            n.m2832(m582(false, new int[]{51, 16, 162, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), m611("餃ꤟ랝騟ࡪ셥补ኧ葜⭁鹙縔ꥵ㉙욚\uf8a8쒄䱼\uf77e㋽⻰띺鱖㳞\uf6e7뻖햶ﭛ\uf14f\uf69e쒄䱼⸽ఫ腬랠\udb86著", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36).intern(), e2);
        }
        int i2 = f432 + 87;
        f434 = i2 % 128;
        if (i2 % 2 == 0) {
            return jSONObjectM592;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m619(final Context context, final String str, final String str2, final gi giVar, final it itVar) {
        jb.e eVarM2157 = giVar.m2157();
        final bg bgVarMo2141 = giVar.mo2141();
        m598(str2, bgVarMo2141);
        s.m2922(this.f442.new AnonymousClass1(str2, ba.c.f713));
        final String strM2487 = this.f438.m2487(eVarM2157, new ip() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.8
            @Override // com.p004ironsource.adqualitysdk.sdk.i.ip
            /* JADX INFO: renamed from: ﻐ */
            public final void mo550(String str3) {
                ax.m621(ax.this, context, str, str2, giVar, ax.m610(ax.this, context, str3, bgVarMo2141), false, bgVarMo2141, itVar);
            }
        });
        s.m2920(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.7
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ax.m621(ax.this, context, str, str2, giVar, ax.m610(ax.this, context, strM2487, bgVarMo2141), true, bgVarMo2141, itVar);
            }
        }, m575());
        f434 = (f432 + 53) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m593() {
        ArrayList<cn> arrayList = new ArrayList();
        Iterator<cn> it = m569().iterator();
        while (it.hasNext()) {
            int i2 = f434 + 41;
            f432 = i2 % 128;
            if (i2 % 2 != 0) {
                cn next = it.next();
                if (m609(next.m1557())) {
                    arrayList.add(next);
                    f432 = (f434 + 27) % 128;
                }
                f432 = (f434 + 23) % 128;
            } else {
                m609(it.next().m1557());
                throw null;
            }
        }
        for (final cn cnVar : arrayList) {
            String strIntern = m582(false, new int[]{51, 16, 162, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m582(false, new int[]{107, 10, 19, 10}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001").intern());
            sb.append(cnVar.m1553());
            sb.append(m611("욚\uf8a8쒄䱼\uf77e㋽⻰띺鱖㳞", Gravity.getAbsoluteGravity(0, 0) + 10).intern());
            n.m2830(strIntern, sb.toString());
            String strM1557 = cnVar.m1557();
            m625(strM1557, m580().get(strM1557));
            s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.6
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    cnVar.m1555();
                }
            });
            m571().remove(cnVar);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m626(cn cnVar) {
        int i2 = f432 + 95;
        f434 = i2 % 128;
        if (i2 % 2 == 0) {
            String strM1551 = cnVar.m1551();
            if (strM1551 == null || kd.m2781(IronSourceAdQuality.getSDKVersion(), strM1551) >= 0) {
                return true;
            }
            f434 = (f432 + 101) % 128;
            return false;
        }
        cnVar.m1551();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m598(String str, bg bgVar) {
        if (bgVar != null) {
            f432 = (f434 + 9) % 128;
            m580().put(str, m592(bgVar.m787()));
        }
        int i2 = f432 + 101;
        f434 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m592(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ik.f2424, str);
        } catch (JSONException e2) {
            n.m2832(m582(false, new int[]{51, 16, 162, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), m611("餃ꤟ랝騟ࡪ셥补ኧ葜⭁鹙縔ꥵ㉙욚\uf8a8쒄䱼\uf77e㋽⻰띺鱖㳞\uf6e7뻖햶ﭛ\uf14f\uf69e쒄䱼⸽ఫ腬랠\udb86著", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37).intern(), e2);
        }
        int i2 = f432 + 73;
        f434 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m630(String str, List<Object> list) {
        f432 = (f434 + 77) % 128;
        Iterator<cn> it = m569().iterator();
        f432 = (f434 + 3) % 128;
        while (it.hasNext()) {
            it.next().m1554(str, list);
        }
    }
}
