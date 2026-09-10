package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class r extends IronSourceAdQuality {

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private static int f2880 = 0;

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    private static char[] f2881 = null;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    private static long f2882 = 0;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f2883 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static r f2884;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private ix f2885;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private je f2887;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private ak f2888;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private al f2889;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private ISAdQualityAdListener f2890;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ax f2891;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private ai f2893;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private iw f2894;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Context f2898;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ISAdQualityConfig f2902;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final ao f2903 = new ao();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2900 = false;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2901 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f2899 = false;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f2897 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f2896 = false;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private ISAdQualityLogLevel f2895 = ISAdQualityLogLevel.INFO;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f2886 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private final aj f2892 = new aj();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.r$2, reason: invalid class name */
    public class AnonymousClass2 extends it {

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static long f2904 = -9020098904204469274L;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ String f2906;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ Activity f2907;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ Application f2908;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ ISAdQualityConfig f2909;

        public AnonymousClass2(ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
            this.f2909 = iSAdQualityConfig;
            this.f2906 = str;
            this.f2908 = application;
            this.f2907 = activity;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2908(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2055) {
                try {
                    g.f2056 = i2;
                    char[] cArr2 = new char[cArr.length];
                    g.f2054 = 0;
                    while (true) {
                        int i3 = g.f2054;
                        if (i3 < cArr.length) {
                            cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2904);
                            g.f2054++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            try {
                String userId = this.f2909.getUserId();
                r.m2901(r.this, this.f2909.getLogLevel());
                String strIntern = m2908("鮧\uf7f1䍑\udeca⩋薵ᄽ沷\uf807䮾Ƛ㍜", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27762).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m2908("鮯\uaac3酪ࡳ庣淰뱈슂ᇄ\u202c睦薸푂᭞⦕磷輾\ude3d\uecc1㌇䉊郡ꟿ\uf63eҗ䮕", View.MeasureSpec.getSize(0) + 12619).intern());
                sb.append(this.f2906);
                n.m2830(strIntern, sb.toString());
                ih.m2416(this.f2908.getApplicationContext()).m2422();
                r.m2891(r.this, this.f2909.isTestMode());
                if (this.f2909.isTestMode()) {
                    n.m2828(m2908("鮧\uf7f1䍑\udeca⩋薵ᄽ沷\uf807䮾Ƛ㍜", 27763 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m2908("鮱\ue1f8漊\uf4b5狓\uf873䖛썞䤿횐屰\ud9b7⟽괕⪺뀘㹢뮉į躄ᒪ鉁ᾥ攙\ue36b梁\uf637玊臨䝍쳤䨓큣嶪\udb0c⅖껕㐹놙㾢蕊ʣ蠅ᙶ鎓ᥴ曕\uecb7橳\uf7bf納ﭥ䃞츾䯌퇸彇꒵∈ꠣ㗖댠㢗蛳౫視\u17fc鵞\u1ae7怉\uee6e毊\uf13b绑쓧䉚쾾唙팴壕\ua633⏉ꧬ㝂벹㨎聭ෝ謪ႄ黤\ue402懣\uef44", 31327 - KeyEvent.getDeadChar(0, 0)).intern());
                }
                try {
                    Class.forName(m2908("鮇홱p牿걭Ṓ䡔먇\uf441♔遲숔㰹渺\ud816\u0a12䐢똎\ue017勶", (KeyEvent.getMaxKeyCode() >> 16) + 19961).intern());
                } catch (Throwable unused) {
                }
                Activity activity = this.f2907;
                if (activity != null) {
                    jy.m2700(activity);
                } else {
                    jy.m2703(this.f2908);
                }
                r.m2867(r.this).m437(this.f2906);
                r.m2867(r.this).m441(this.f2909.getInitializationSource());
                r.m2867(r.this).m443(this.f2909.getCoppa());
                r.m2867(r.this).m445(this.f2909.getDeviceIdType());
                r.m2867(r.this).m442(this.f2909.getMetaData());
                Context applicationContext = this.f2908.getApplicationContext();
                r.m2898(r.this, applicationContext);
                r.m2883(r.this, new iw(applicationContext));
                r rVar = r.this;
                r.m2899(rVar);
                r.m2894(rVar, new je(applicationContext, aj.m400(), "B0r1sW@sH3re"));
                as.m467().mo498(applicationContext, r.m2893(r.this), r.m2899(r.this), new as.b() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.4

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static int f2929 = 0;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f2930 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static long f2931 = -6575137435121282771L;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m2911(String str, int i2) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (g.f2055) {
                            try {
                                g.f2056 = i2;
                                char[] cArr2 = new char[cArr.length];
                                g.f2054 = 0;
                                while (true) {
                                    int i3 = g.f2054;
                                    if (i3 < cArr.length) {
                                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2931);
                                        g.f2054++;
                                    } else {
                                        str2 = new String(cArr2);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.as.b
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo504() {
                        f2929 = (f2930 + 81) % 128;
                        r.m2896(r.this, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, m2911("ᅤ┫秆趶쀨ᓱ⢲缒돬잤ᨆ⺪抂뤸췀Ƕ吞棧벹\uf304ߠ害湃ꋢ\uf6baഁ䇫闺ꠕﳥザ䜃鯢꾭\ue213", 13398 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
                        int i2 = f2930 + 103;
                        f2929 = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.as.b
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo505() {
                        r rVar2;
                        ISAdQualityInitError iSAdQualityInitError;
                        int iResolveSizeAndState;
                        int i2 = f2929 + 101;
                        f2930 = i2 % 128;
                        if (i2 % 2 == 0) {
                            rVar2 = r.this;
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            iResolveSizeAndState = 6011 - View.resolveSizeAndState(0, 1, 1);
                        } else {
                            rVar2 = r.this;
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            iResolveSizeAndState = 5923 - View.resolveSizeAndState(0, 0, 0);
                        }
                        r.m2896(rVar2, iSAdQualityInitError, m2911("ᅣ١㽋吪䷄拶鮈낷ꡇ셽\uf653\uefcfӦ㶄助䩅捾頊넲ꛛ\udfff", iResolveSizeAndState).intern());
                        f2930 = (f2929 + 9) % 128;
                    }
                }, r.m2880(r.this));
                r.m2884(r.this, new ix(applicationContext, r.m2893(r.this), r.m2899(r.this).m402()));
                final String strM2677 = jw.m2677(applicationContext);
                as.m467().mo488(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.1

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static int f2910 = 1;

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f2911 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static char f2912 = 24228;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static char f2913 = 6553;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static char f2914 = 8168;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static char f2915 = 14949;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m2909(String str, int i2) {
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
                                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f2914)) ^ ((c3 >>> 5) + f2912)));
                                            cArr3[1] = c4;
                                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f2913) ^ ((c4 + i4) ^ ((c4 << 4) + f2915))));
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

                    @Override // com.p004ironsource.adqualitysdk.sdk.i.at
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo319() {
                        int i2 = f2911 + 115;
                        f2910 = i2 % 128;
                        if (i2 % 2 == 0) {
                            if (as.m467().mo491(m2909("阀蜉\ue99b末捒ﶮ", 60 >>> KeyEvent.keyCodeFromString("")).intern(), strM2677)) {
                                return;
                            }
                        } else if (as.m467().mo491(m2909("阀蜉\ue99b末捒ﶮ", 6 - KeyEvent.keyCodeFromString("")).intern(), strM2677)) {
                            return;
                        }
                        r.m2889(r.this);
                        f2910 = (f2911 + 107) % 128;
                    }
                });
                as.m467().mo496(r.m2858(r.this));
                r.m2890(r.this, applicationContext);
                r rVar2 = r.this;
                r.m2873(rVar2, new ai(applicationContext, r.m2867(rVar2), r.m2899(r.this), this.f2907 != null, strM2677, new q() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.3
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.q
                    public void onEvent(final String str) {
                        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.3.3

                            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                            private static char f2921 = 29882;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static int f2922 = 0;

                            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                            private static int f2923 = 1;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static char f2924 = 6589;

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static char f2925 = 63511;

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static char f2926 = 719;

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static String m2910(String str2, int i2) {
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
                                            int i3 = m.f2869;
                                            if (i3 < cArr.length) {
                                                cArr3[0] = cArr[i3];
                                                cArr3[1] = cArr[i3 + 1];
                                                int i4 = 58224;
                                                for (int i5 = 0; i5 < 16; i5++) {
                                                    char c2 = cArr3[1];
                                                    char c3 = cArr3[0];
                                                    char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f2924)) ^ ((c3 >>> 5) + f2921)));
                                                    cArr3[1] = c4;
                                                    cArr3[0] = (char) (c3 - (((c4 >>> 5) + f2926) ^ ((c4 + i4) ^ ((c4 << 4) + f2925))));
                                                    i4 -= 40503;
                                                }
                                                int i6 = m.f2869;
                                                cArr2[i6] = cArr3[0];
                                                cArr2[i6 + 1] = cArr3[1];
                                                m.f2869 = i6 + 2;
                                            } else {
                                                str3 = new String(cArr2, 0, i2);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return str3;
                            }

                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                f2922 = (f2923 + 81) % 128;
                                r.m2860(r.this).m630(m2910("ᐗꨓ\uee7b걮뜔⧿\uee7b걮\ue7b4깜项͍⓺讍伪\udf3a䤕\u0e83䛟륀Ꞃ䇏辛䴪", Process.getGidForName("") + 24).intern(), Collections.singletonList(str));
                                f2922 = (f2923 + 27) % 128;
                            }
                        });
                    }
                }));
                if (!this.f2909.isUserIdSet()) {
                    r.m2867(r.this).m433();
                    userId = r.m2864(r.this).m366();
                }
                if (r.this.m2907()) {
                    r.m2864(r.this).m369(new ag() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.5
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.ag
                        public void onEventReceived(JSONObject jSONObject) {
                            im.m2442(r.m2862(r.this), ik.f2434, jSONObject, new Object[0]);
                        }
                    });
                }
                r.m2864(r.this).m372(new je.e() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je.e
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo2570() {
                        r.m2889(r.this);
                    }
                });
                bb bbVar = new bb();
                r rVar3 = r.this;
                r.m2882(rVar3, new ax(r.m2858(rVar3), r.m2864(r.this), strM2677, bbVar, new ISAdQualityInitListener() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.7
                    @Override // com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                        r.m2896(r.this, iSAdQualityInitError, str);
                    }

                    @Override // com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitSuccess() {
                        r.m2866(r.this);
                    }
                }));
                r.m2860(r.this).m633(new ISAdQualityAdListener() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.10
                    @Override // com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (r.m2853(r.this) != null) {
                            r.m2853(r.this).adClosed(str, iSAdQualityAdType);
                        }
                    }

                    @Override // com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (r.m2853(r.this) != null) {
                            r.m2853(r.this).adDisplayed(str, iSAdQualityAdType);
                        }
                    }
                });
                r rVar4 = r.this;
                r.m2881(rVar4, new ak(r.m2860(rVar4)));
                r rVar5 = r.this;
                r.m2892(rVar5, new al(r.m2864(rVar5)));
                String strIntern2 = m2908("鮧\uf7f1䍑\udeca⩋薵ᄽ沷\uf807䮾Ƛ㍜", 27763 - TextUtils.indexOf("", "")).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2908("鮯\uf690䇭\udced⼣먪ᕙ枉\uf2a7䷟\ud8ed⬢蘞ᅌ揀ﺾ䧂ꓲ㜎舭ᵫ澁絛喕ꃸ㌔蹖ᤡ殟욥凜겧㽦", TextUtils.lastIndexOf("", '0', 0, 0) + 27942).intern());
                sb2.append(r.m2899(r.this).m401());
                n.m2844(strIntern2, sb2.toString());
                r rVar6 = r.this;
                Context context = this.f2907;
                if (context == null) {
                    context = applicationContext;
                }
                r.m2870(rVar6, context, userId);
                r.m2876(r.this, applicationContext);
                r.m2851(r.this);
                r.m2856(r.this);
            } catch (Throwable th) {
                String strIntern3 = m2908("鮣᎗讒\u0380뮘㏉ꮝ⎝\udb97厉쮑䎦ﮮ玨\uebb6探᮸鎲௰莖㮉뎘⯀ꏲ寛폌䯄쏞篆\uf3c8殜\ue3e8鯂Ꮞ", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 34819).intern();
                kb.m2755(m2908("鮧\uf7f1䍑\udeca⩋薵ᄽ沷\uf807䮾Ƛ㍜", 27763 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), strIntern3, th, true, false, true);
                r.m2896(r.this, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern3);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.r$3, reason: invalid class name */
    public class AnonymousClass3 implements at {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ boolean f2936;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ boolean f2937;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ boolean f2938;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ String f2939;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ Context f2940;

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.r$3$4, reason: invalid class name */
        public class AnonymousClass4 extends it {

            /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.r$3$4$2, reason: invalid class name */
            public class AnonymousClass2 extends it {

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f2942 = 1;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static char f2943 = 48108;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static long f2944;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static int f2945;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f2946;

                public AnonymousClass2() {
                }

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static String m2912(String str, char c2, int i2, String str2, String str3) {
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
                    synchronized (j.f2569) {
                        try {
                            char[] cArr4 = (char[]) cArr.clone();
                            char[] cArr5 = (char[]) cArr2.clone();
                            cArr4[0] = (char) (c2 ^ cArr4[0]);
                            cArr5[2] = (char) (cArr5[2] + ((char) i2));
                            int length = cArr3.length;
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
                                    cArr6[i7] = (char) (((((long) (c4 ^ cArr3[i7])) ^ f2944) ^ ((long) f2946)) ^ ((long) f2943));
                                    j.f2567 = i7 + 1;
                                } else {
                                    str4 = new String(cArr6);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return str4;
                }

                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    r.m2852(r.this).m2563(m2912("敊㵾ⲫ팸꘤躵㼱㣩팓\udd9d镆낓밞⒁", (char) (View.combineMeasuredStates(0, 0) + 4464), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", "띚\uf65c灦向").intern(), new je.c() { // from class: com.ironsource.adqualitysdk.sdk.i.r.3.4.2.2

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static int f2948 = 0;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f2949 = 1;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static char f2950 = 4;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static char[] f2951 = {'f', 'l', 'a', 'g', '.', 'i', 'r', 's', 't', 'S', 'e', 'n', 'h', 'j', 'k', 'm'};

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static String m2913(byte b2, String str, int i2) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (i.f2343) {
                                try {
                                    char[] cArr2 = f2951;
                                    char c2 = f2950;
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
                                    str2 = new String(cArr3);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return str2;
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x001f A[PHI: r7
  0x001f: PHI (r7v2 boolean) = (r7v1 boolean), (r7v4 boolean) binds: [B:8:0x001c, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // com.ironsource.adqualitysdk.sdk.i.je.c
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo2569(String str) {
                            final boolean zIsEmpty;
                            int i2 = f2949 + 63;
                            f2948 = i2 % 128;
                            if (i2 % 2 != 0) {
                                zIsEmpty = TextUtils.isEmpty(str);
                                int i3 = 15 / 0;
                                if (zIsEmpty) {
                                    r.m2852(r.this).m2565(m2913((byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 124), "\u0001\u0002\u0003\u0000\b\u0004\u0006\u0007\u0004\u000b\n\u000b\u000b\b", 13 - TextUtils.lastIndexOf("", '0')).intern(), m2913((byte) (66 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u0001\u0003\u0003\u0005¦", 5 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), null);
                                    f2948 = (f2949 + 5) % 128;
                                }
                            } else {
                                zIsEmpty = TextUtils.isEmpty(str);
                                if (zIsEmpty) {
                                    r.m2852(r.this).m2565(m2913((byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 124), "\u0001\u0002\u0003\u0000\b\u0004\u0006\u0007\u0004\u000b\n\u000b\u000b\b", 13 - TextUtils.lastIndexOf("", '0')).intern(), m2913((byte) (66 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u0001\u0003\u0003\u0005¦", 5 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), null);
                                    f2948 = (f2949 + 5) % 128;
                                }
                            }
                            s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.r.3.4.2.2.3

                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                private static long f2953 = -7831816361021396026L;

                                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                private static int f2954 = 1;

                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                private static int f2955;

                                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                private static String m2914(String str2, int i4) {
                                    String str3;
                                    Object charArray = str2;
                                    if (str2 != null) {
                                        charArray = str2.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (g.f2055) {
                                        try {
                                            g.f2056 = i4;
                                            char[] cArr2 = new char[cArr.length];
                                            g.f2054 = 0;
                                            while (true) {
                                                int i5 = g.f2054;
                                                if (i5 < cArr.length) {
                                                    cArr2[i5] = (char) (((long) (cArr[i5] ^ (g.f2056 * i5))) ^ f2953);
                                                    g.f2054++;
                                                } else {
                                                    str3 = new String(cArr2);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return str3;
                                }

                                /* JADX WARN: Code duplicated, block: B:11:0x0047  */
                                /* JADX WARN: Code duplicated, block: B:12:0x004a  */
                                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo276() {
                                    String strIntern;
                                    ai aiVarM2864 = r.m2864(r.this);
                                    String strIntern2 = m2914("⮲\uf84b豣偘摜࡞\udc5c", 54268 - MotionEvent.axisFromString("")).intern();
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    if (anonymousClass3.f2938) {
                                        int i4 = f2955 + 81;
                                        f2954 = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            int i5 = 63 / 0;
                                            if (anonymousClass3.f2939 != null) {
                                                strIntern = anonymousClass3.f2939;
                                            } else {
                                                strIntern = m2914("⮨졈\uec5c聛", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 58363).intern();
                                            }
                                        } else if (anonymousClass3.f2939 != null) {
                                            strIntern = anonymousClass3.f2939;
                                        } else {
                                            strIntern = m2914("⮨졈\uec5c聛", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 58363).intern();
                                        }
                                    } else {
                                        f2955 = (f2954 + 107) % 128;
                                        strIntern = null;
                                    }
                                    ax axVarM2860 = r.m2860(r.this);
                                    new gp(r.m2862(r.this));
                                    r.m2862(r.this);
                                    aiVarM2864.m374(strIntern2, jt.m2662(strIntern, axVarM2860, zIsEmpty, r.m2867(r.this)));
                                    AnonymousClass3 anonymousClass4 = AnonymousClass3.this;
                                    if (anonymousClass4.f2937) {
                                        r.m2864(r.this).m373();
                                        f2954 = (f2955 + 119) % 128;
                                    }
                                    f2955 = (f2954 + 29) % 128;
                                }
                            });
                        }
                    });
                    int i2 = f2945 + 81;
                    f2942 = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                }
            }

            public AnonymousClass4() {
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                if (anonymousClass3.f2936) {
                    r.m2860(r.this).m629(AnonymousClass3.this.f2940, new AnonymousClass2());
                }
            }
        }

        public AnonymousClass3(boolean z2, Context context, boolean z3, String str, boolean z4) {
            this.f2936 = z2;
            this.f2940 = context;
            this.f2938 = z3;
            this.f2939 = str;
            this.f2937 = z4;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.at
        /* JADX INFO: renamed from: ﾒ */
        public final void mo319() {
            s.m2926(new AnonymousClass4());
        }
    }

    static {
        m2861();
        f2884 = null;
        int i2 = f2880 + 15;
        f2883 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private r() {
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static /* synthetic */ al m2848(r rVar) {
        int i2 = f2883;
        f2880 = (i2 + 117) % 128;
        al alVar = rVar.f2889;
        int i3 = i2 + 113;
        f2880 = i3 % 128;
        if (i3 % 2 == 0) {
            return alVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static /* synthetic */ Set m2849(r rVar) {
        int i2 = f2880;
        f2883 = (i2 + 65) % 128;
        Set<ISAdQualityInitListener> set = rVar.f2886;
        f2883 = (i2 + 17) % 128;
        return set;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ void m2851(r rVar) {
        int i2 = f2880 + 95;
        f2883 = i2 % 128;
        rVar.m2878(i2 % 2 != 0);
        int i3 = f2883 + 105;
        f2880 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static /* synthetic */ je m2852(r rVar) {
        int i2 = f2883 + 31;
        f2880 = i2 % 128;
        int i3 = i2 % 2;
        je jeVar = rVar.f2887;
        if (i3 == 0) {
            return jeVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ ISAdQualityAdListener m2853(r rVar) {
        int i2 = f2880 + 27;
        f2883 = i2 % 128;
        int i3 = i2 % 2;
        ISAdQualityAdListener iSAdQualityAdListener = rVar.f2890;
        if (i3 != 0) {
            return iSAdQualityAdListener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2855(r rVar) {
        f2880 = (f2883 + 27) % 128;
        boolean zM2854 = rVar.m2854();
        int i2 = f2880 + 105;
        f2883 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
        return zM2854;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ void m2856(r rVar) {
        f2883 = (f2880 + 19) % 128;
        rVar.m2902(false);
        int i2 = f2883 + 1;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ ix m2858(r rVar) {
        int i2 = f2883 + 25;
        f2880 = i2 % 128;
        int i3 = i2 % 2;
        ix ixVar = rVar.f2885;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return ixVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static void m2861() {
        char[] cArr = new char[1582];
        ByteBuffer.wrap("\u0000Iµ\u009ekÛ!\u0003×e\u008dtB¯ø÷®\u0001dA\u001a{Ï\u009c\u0085Ø;\"ñ\u0018§j\\¾\u0012ôÈ\u001e~^4eé½\u009f÷U\u0011\u000b]Á%v±,ðâ\u0002\u0098MNc\u0003«¹ÔoM%[Ûu\u0090³F\u0081ü\u0003²Nh{\u001d¡Ó\u0082\u0089\r?Yõ)ª¹`Å\u0016PÌI\u0082s7§íÁ£QY\u007f\u000fhÄ¬zÌ0\u0004æV\u009cxQ \u0007\u0089½2s0)}Þ¶\u0094ÎJ\u0017\u0000 ¶zk²!Ç×\u001bX\u0004íì3\u008eyW\u008f\u0010Õ(\u001aâ ªöT<#B\u0003\u0097Á\u0000Iµ\u009ekÛ!\u0003×e\u008dtB¯ø÷®\u0001dA\u001a{Ï\u009c\u0085Ø;\"ñ\u0018§j\\¾\u0012ôÈ\u001e~^4eé½\u009f÷U\u0011\u000b]Á%v³,óâ\u001e\u0098\\Ng\u0003·¹ÙoM%YÛf\u0090¸FÍü\u000b²_\u0000Iµ\u009ekÛ!\u0003×e\u008dtB¯ø÷®\u0001dA\u001a{Ïï\u0085Ï;-ñ}§#\\¹\u0012óÈ\u0003~C4mé°\u009fòU\u0002\u000bBÁ`vò,òâ\t\u0098MNn\u0003¼¹ÄoM%YÛf\u0090ºF\u0081ü\f²^h(\u001d°ÓÚ\u0089\n?_õ|ª¢`Æ\u0016\u0014Ì\u001d\u0082e7¹íÈ£\bY\u001e\u000fdÄ¶zÆ0\u0017^¬ëC5\u001b\u007f¯\u0089¯ÓÎ\u001cH¦\u001aðî:®D\u0084\u0091AÛ\u001feï¯£ù\u0089\u0002\u001fL_\u0096¥ \u0091j¸·\u007fÁ\u0015\u000bÕU¢\u009f\u008b(Qr\u0019¼÷Æ¯\u0010É]oç\u000b1É{õ\u0085\u009fÎZ\u0018=¢¡ì§6\u008fCO\u008d9×äa¼«\u0091ôW>b\u0000Cµ¬kô!@×@\u008d!B§øõ®\u0001dA\u001akÏ®\u0085ð;\u0000ñL§f\\ð\u0012ÔÈ9~v4`é\u0080\u009fëU\n\u000bTÁlv¦,æâL\u0098jNB\u0003\u0098¹\u0080o\u001a%SÛs\u0090¼F\u0081ü\u0000²Nhd\u001d¹Ó\u0082\u0089\u0000?Nõ)ª³`Î\u0016\u0000ÌI\u0082s7÷íÑ£\u0002Y[\u000fyÄøzÌ0\u0016æ\u0011\u0000Cµ¬kô!@×@\u008d!B§øõ®\u0001dA\u001akÏ®\u0085ð;\u0000ñL§f\\ð\u0012°ÈJ~V4té¡\u009fÕU\u000e\u000bAÁ%v±,þâ\u0002\u0098\u001eNr\u0003ó¹Âo\b%\u001aÛi\u0090¡FÍü\u0002²\u001bhg\u001d§Ó\u0082\u0089\n?Qõyª¢`Ú\u0016^\u0000Iµ\u009ekÛ!\u0003×e\u008dtB¯ø÷®\u0001dA\u001a{Ï\u009c\u0085Ø;\"ñ\u0016§t\\±\u0012îÈJ~V4hé£\u009fûU\n\u000b\\Á|vò,ìâ\u0004\u0098LNr\u0003·¹Ïo\u001a%TÛ)\u0000Iµ\u009ekÛ!\u0003×e\u008dtB¯ø÷®\u0001dA\u001a{Ï\u009c\u0085Ø;\"ñ\u0016§t\\±\u0012îÈJ~Y4aé§\u009fûU\u0019\u000b\u0018Álv¼,öâ\u0018\u0098PNg\u0003¿¹Éo\u0017%_Ûc\u0090ôF\u008cüN²Uhg\u001dõÓÌ\u0089\n?Yõmªö`×\u0016\u001fÌ\u001d\u0082y7¿íÑ£\u0005YZ\u000fdÄ¯zË0\\o\u0003ÚÔ\u0004\u0091NI¸/â>-å\u0097½ÁK\u000b\u000bu1 ¥ê\u0085Tg\u009e7Èi3í}¶§S\u0011][=\u0086óð¡:Ud\u0016® \u0019ïC»\u0000 µ«kè!\b×Y\u008d!B\u008føÿ®9d@\u001acÏ£\u0085õ;\u001dñO§#\\ \u0012ñÈ\u000b~C4bé¾\u009fìU\u0006\u0000sµ¢kõ!\n×X\u008d`\u0000 µºkó!\u0013×\\\u008d!B¼øþ®\tdF\u001amÏ¡\u0085¦;IC*öÐ(\u0087bg\u0094)ÎN\u0001Ò»\u009cír'.Y\u0019\u008cÉÆ\u009dxa²yä\b\u001fÐQ\u0085\u008bkeÀÐ:\u000emD\u008d²Ãè¤'8\u009d{Ë\u0099\u0001Ä\u007fîª$à~^Ì\u0094ÆÂõ90wj\u00ad¦\u001bÖQ¡\u0000Cµ¬kô!@×@\u008d!B\u00adøó®\td[\u001aeÏª\u0085¼;\u001cñE§f\\¢\u0012½È\u0003~S4$éü\u009f¾U\"\u000bkÁDv¶,Îâ\u0019\u0098XNj\u0003º¹Ôo\u0014%\u001aÛT\u0090\u0090FêüN²Lhi\u001d¦Ó\u0082\u0089\u001c?Tõ|ª¢`Ç\u0016\u001fÌJ\u0082d7ùÎ\u0082{y¥4ï\u009c\u0019\u0082C¯\u008cf64`\u0093ª\u0087Ô·\u0001}K3õÛ?\u008ci´\u0092bÜ<\u0006Ô°Ìú\u0096'YQ\u0004\u009bÔÅ²\u000f«¸hâ(,ÞV\u0096\u0080¤Í(w(¡òëª\u0015ü^m\u0088\u001f2Ó|\u008f¦¡Ók\u001dYG×ñ\u0086;¾da®\u0011ØÅ\u0002\u0081Lñù+#\u001cmÂ\u0097\u0084Á¾\nd´\u001bþü(\u0097R²\u009fpÉ4sÌ½¼ÒZg¼¹ùóS\u0005U_f\u0090¿*ý|\\¶HÈr\u001dûWëé\u001c#Lu0\u008e°À©\u001a\u001c¬Fæ0;«Mÿ\u0087\u0013Ù@\u00131¤©þù0XJH\u009c\u007fÑ·kÀ½\u0000\u0000Eµ\u009fkÈ!(×f\u008d Bîøî®\u001bdP\u001apÏï\u0085Õ;-ñ\u0016§j\\£\u0012½È\u0004~B4hé½\u009f°UK\u000bhÁiv·,þâ\u001f\u0098\\N&\u0003¾¹Áo\u0006%_Û'\u0090§FÔü\u001c²^h(\u001d¡ÓÍ\u0089O?Lõhª¥`Ð\u0016PÌ\\\u0082*7¡íÅ£\u001dYW\u000foÄøzË0\u001dæQ\u009c!Q·\u0007Ó½\u001fs,)-Þ¯\u0094ÔJ\u0011\u00003¶.k\u0092!ì×U\u008d6C`øü®àd%\u001a\u0002Ðt\u0085\u008c;ßñ\u0016§(]x\u0012ªÈÒ~X4\u0016êV\u009f\u0094U\u0082\u0000aµ£kã!\u0013×\\\u008dhB øü®EdL\u001amÏº\u0085±;\u001eñW§m\\¤\u0000Eµ\u009fkÈ!(×f\u008d BîøÂ®\u0007d@\u001a%Ï½\u0085ù;IñC§p\\¹\u0012óÈ\r~\u00174pé¹\u009fûUK\u000b\\Á`v´,þâ\u0019\u0098UNr\u0003ó¹Õo\u001e%_Ûu\u0090ôFèü*²\u001b\u0000.µíkÊ!\u000b×Q\u008d`B½øþ®HdX\u001acÏ¤\u0085ù;IñE§v\\¢\u0012øÈJ~C4kéñ\u009fîU\n\u000bKÁvvò,þâL\u0098LNh\u0003º¹Ño\u0018%_Û'\u0090¡FÒü\u000b²Ih(\u001d\u009cÓæ\u0089O?Zõfª¤`\u0083\u0016\u0015Ì\\\u0082i7¿í\u0084£\u0004YM\u000fnÄªz\u00850\u0006æP\u009c,Q\u0090\u0007õ½2s$)\\Þ¯\u0094ÆJ\u0018\u0000(¶zk¢!\u0088×&\u008d\u0006CDøòòÕG.\u0099cÓ\u0099%\u0098\u007fÄ°\u0011\nV\\\u0080\u0096èèû=\"w|É\u008c\u0003ÎUö®|àB:¢\u008cðÆ¨\u001b(ma§\u0082ùÆ3©\u0084\u0017ÞW\u0010ÀjÜ¼ùñeK\f\u0085ù01îs¤ RÅ\b÷Ç?}w+¯áÏ\u009föJ8\u0000f|aÉ«\u0017æ]A«Oñl>µ\u0084àÒ)\u0018Y\u0000tµ¿kû!\u0004×Q\u008dcB¯øø®\u0003d\u001b\u001aiÏ¹\u0085²;\rñT§-\\±\u0012óÈ\u000b~[4}é¥\u009f÷U\b\u000bKe:Ðë\u000e¼DC²\u0011è)'ª\u009d¡ËD\u0001\u001f\u007f9ªãà¡^\r\u0094KÂ+9÷wµ\u00adO\u001b\u0007Q9\u008cñú´0Qä©QF\u008f\u001eÅª3ªiË¦W\u001c\u0014Jö\u0080ÿþ\u0081+Ka\u0002ßæ\u0015®C\u0087¸[ö\u001b, \u009a©Ð\u008b\rH{\u0000±¡ï¿%\u0080\u0092\\È\u0010\u0006¦|þªÌçp]\u0019\u008bÆÁ´?¼tK¢*\u0018èV¸\u008c\u0096ùF7hmÖÛ\u0092\u0011¨N\u001c\u0084>òû(¤fÀÓN\t&Gî½ ë\u0085 ]\u009e8Ôö\u0002û\u0000Mµ¸ké!\u0013×\u0014\u008drB«øï®Hd\\\u001alÏ»\u0085ù;\u001bñX§b\\¼\u0012½È\u001e~R4wé¥\u009f¾U\u0006\u000bWÁav·,¿â\u000e\u0098\\N`\u0003¼¹Òo\b%\u001aÛn\u0090ºFÈü\u001a²Rhi\u001d¹ÓË\u0089\u0015?Uõgª±`\u0082\u0000aµ£kþ!\u0015×[\u008dhBªøµ®\u0001d[\u001avÏª\u0085ò;\u001dñ\u0018§b\\³\u0012éÈ\u0003~X4jéÿ\u009fÜU*\u000blÁQv\u0097,Íâ5\u0098fNE\u0003\u009b¹áo#%}ÛB\u0090\u0090\u0000Fµ¬kó!\u000b×Q\u008deBîøï®\u0007d\u0015\u001apÏª\u0085û;\u0000ñE§w\\µ\u0012ïÈJ~U4eé¥\u009fêU\u000e\u000bJÁ|vò,íâ\t\u0098ZNc\u0003º¹Öo\b%H\u0000Cµ¬kô!@×@\u008d!B½øþ®\u001cd\u0015\u001acÏ«\u0085¼;\u0005ñ_§p\\¤\u0012øÈ\u0004~R4véñ\u009f³UK\u000bqÁVv\u0093,ûâ=\u0098LNg\u0003¿¹Éo\u0019%CÛ'\u0090\u0087Fåü%²\u001bh\u007f\u001d´ÓÑ\u0089O?Oõaª£`×\u0016\u0014ÌR\u0082}7¹í\u008a\u0000Cµ¬kô!@×@\u008d!B½øþ®\u0006dQ\u001a\"Ï¬\u0085é;\u001añB§l\\½\u0012½È\u0007~R4`é¸\u009fÿU\u001f\u000bQÁjv¼,¿â\u001e\u0098\\Np\u0003¶¹Îo\u0018%_Û'\u0090ùF\u0081ü'²hhI\u001d±Óó\u0089\u001a?]õeª¿`×\u0016\tÌ\u001d\u0082Y7\u0093íï£QYI\u000fjÄ«z\u00850\u0001æW\u009cyQ\u00ad\u0007Â½\u001cs7)cÞô\u008fñ:\u001eäF®òXò\u0002\u0093Í\u000fwL!´ëã\u0095\u0090@\u001e\n[´¨~ð(ÞÓ\u000f\u009d\u000fGµñà»Òf\n\u0010MÚ\u00ad\u0084ãNØù\u000e£\rm¬\u0017îÁÂ\u008c\u00046|àªªíT\u0095\u001fKÉ3s\u0095=Úçû\u0092\u0003\\A\u0006¨°ïz×%\rïe\u0099»C¯\rë¸!b],ãÖå\u0080ÊKJõy¿¯iù\u0013\u009eÞ\u0002\u0088z2¨ü\u0086¦ÖQ\t\u001byÅ¯\u008f\u00899Ùä\r®4\u0000Cµ¬kô!@×@\u008d!B½øþ®\u001cd\u0015\u001aqÏª\u0085û;\u0004ñS§m\\¤\u0012½ÈG~\u00174Mé\u0082\u009fßU\u000f\u000biÁpv³,óâ\u0005\u0098MN\u007f\u0003ó¹óo)%qÛ'\u0090£FÀü\u001d²\u001bh{\u001d½Ó×\u0089\u001b?Xõfª¡`Í\u0016^\u0000Cµ¬kô!@×@\u008d!B½øþ®\u001cd\u0015\u001aaÏ \u0085ò;\u000fñ_§d\\ð\u0012°ÈJ~~4Wé\u0090\u009fúU:\u000bMÁdv¾,öâ\u0018\u0098@N&\u0003\u0080¹äo&%\u001aÛp\u0090µFÒüN²Hh`\u001d ÓÖ\u0089\u000b?Sõ~ª¸`\u008d\u0000Cµ¬kô!@×@\u008d!B½øþ®\u001cd\u0015\u001aaÏ \u0085ò;\u000fñ_§d\\ð\u0012°ÈJ~~4Wé\u0090\u009fúU:\u000bMÁdv¾,öâ\u0018\u0098@N&\u0003\u0080¹äo&%\u001aÛn\u0090§F\u0081ü\u000f²Whz\u001d°ÓÃ\u0089\u000b?Eõ)ª¿`Í\u0016\u0019ÌI\u0082c7¶íÈ£\u0018YD\u000fnÄ¼z\u008b\u0000iµªkô!\b×F\u008ddB\u0091øë®\u001adP\u001a]Ï¦\u0085ò;\u0000ñB§\\\\³\u0012òÈ\u0004~Q4mé¶".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1582);
        f2881 = cArr;
        f2882 = 7159271710447023565L;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ Context m2862(r rVar) {
        int i2 = (f2883 + 121) % 128;
        f2880 = i2;
        Context context = rVar.f2898;
        int i3 = i2 + 25;
        f2883 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return context;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ ai m2864(r rVar) {
        int i2 = (f2883 + 9) % 128;
        f2880 = i2;
        ai aiVar = rVar.f2893;
        f2883 = (i2 + 59) % 128;
        return aiVar;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ void m2866(r rVar) {
        f2883 = (f2880 + 83) % 128;
        rVar.m2850();
        int i2 = f2883 + 99;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ ao m2867(r rVar) {
        f2880 = (f2883 + 93) % 128;
        ao aoVarM2863 = rVar.m2863();
        int i2 = f2880 + 75;
        f2883 = i2 % 128;
        if (i2 % 2 != 0) {
            return aoVarM2863;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ai m2873(r rVar, ai aiVar) {
        int i2 = (f2883 + 73) % 128;
        f2880 = i2;
        rVar.f2893 = aiVar;
        f2883 = (i2 + 85) % 128;
        return aiVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ak m2881(r rVar, ak akVar) {
        int i2 = f2883 + 79;
        f2880 = i2 % 128;
        int i3 = i2 % 2;
        rVar.f2888 = akVar;
        if (i3 == 0) {
            return akVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ al m2892(r rVar, al alVar) {
        int i2 = (f2880 + 61) % 128;
        f2883 = i2;
        rVar.f2889 = alVar;
        f2880 = (i2 + 1) % 128;
        return alVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Context m2898(r rVar, Context context) {
        int i2 = (f2883 + 95) % 128;
        f2880 = i2;
        rVar.f2898 = context;
        f2883 = (i2 + 75) % 128;
        return context;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void changeUserId(String str) {
        String str2;
        try {
            if (m2872(str)) {
                boolean zEquals = str.equals(m2863().m440());
                boolean z2 = !zEquals;
                boolean zMo2598 = ji.m2594().mo2598();
                if (!zEquals) {
                    int i2 = f2880;
                    f2883 = (i2 + 93) % 128;
                    if (zMo2598) {
                        int i3 = i2 + 101;
                        f2883 = i3 % 128;
                        if (i3 % 2 == 0) {
                            this.f2893.m375();
                            throw null;
                        }
                        this.f2893.m375();
                    }
                }
                str2 = str;
                try {
                    m2869(this.f2898, str2, z2, true, zMo2598);
                } catch (Exception e2) {
                    e = e2;
                    kb.m2755(m2885((char) (TextUtils.getOffsetAfter("", 0) + 22597), (ViewConfiguration.getJumpTapTimeout() >> 16) + 74, View.MeasureSpec.getMode(0) + 12).intern(), a.n(new StringBuilder(), m2885((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25988), 527 - TextUtils.lastIndexOf("", '0'), 21 - TextUtils.indexOf("", "")), str2), e, true, false, true);
                }
            }
        } catch (Exception e3) {
            e = e3;
            str2 = str;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str) {
        f2880 = (f2883 + 29) % 128;
        initialize(context, str, null);
        int i2 = f2880 + 47;
        f2883 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (m2854() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4.f2888.m416(r5);
        com.p004ironsource.adqualitysdk.sdk.i.r.f2883 = (com.p004ironsource.adqualitysdk.sdk.i.r.f2880 + 67) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.n.m2828(m2885((char) (22598 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 74 - android.widget.ExpandableListView.getPackedPositionGroup(0), 12 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m2885((char) (36786 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), 1332 - android.view.KeyEvent.getDeadChar(0, 0), 73 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.n.m2828(m2885((char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 22597), 74 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 11 - android.text.TextUtils.lastIndexOf("", '0')).intern(), m2885((char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1265, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 67).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (m2905() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (m2905() == false) goto L9;
     */
    @Override // com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendCustomMediationRevenue(com.p004ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue r5) {
        /*
            r4 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.r.f2883
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.r.f2880 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = r4.m2905()
            r2 = 18
            int r2 = r2 / r1
            if (r0 == 0) goto L1d
            goto L76
        L17:
            boolean r0 = r4.m2905()
            if (r0 != 0) goto L76
        L1d:
            boolean r0 = r4.m2854()
            if (r0 == 0) goto L31
            com.ironsource.adqualitysdk.sdk.i.ak r0 = r4.f2888
            r0.m416(r5)
            int r5 = com.p004ironsource.adqualitysdk.sdk.i.r.f2880
            int r5 = r5 + 67
            int r5 = r5 % 128
            com.p004ironsource.adqualitysdk.sdk.i.r.f2883 = r5
            return
        L31:
            float r5 = android.media.AudioTrack.getMaxVolume()
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            int r5 = 22598 - r5
            char r5 = (char) r5
            r2 = 0
            int r2 = android.widget.ExpandableListView.getPackedPositionGroup(r2)
            int r2 = 74 - r2
            int r3 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r3 = r3 >> 16
            int r3 = 12 - r3
            java.lang.String r5 = m2885(r5, r2, r3)
            java.lang.String r5 = r5.intern()
            r2 = 36786(0x8fb2, float:5.1548E-41)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r2 = r2 - r3
            char r2 = (char) r2
            int r3 = android.view.KeyEvent.getDeadChar(r1, r1)
            int r3 = 1332 - r3
            float r1 = android.util.TypedValue.complexToFloat(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r0 = 73 - r0
            java.lang.String r0 = m2885(r2, r3, r0)
            java.lang.String r0 = r0.intern()
            com.p004ironsource.adqualitysdk.sdk.i.n.m2828(r5, r0)
            return
        L76:
            int r5 = android.view.KeyEvent.getMaxKeyCode()
            int r5 = r5 >> 16
            int r5 = r5 + 22597
            char r5 = (char) r5
            int r0 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r0 = r0 >> 16
            int r0 = 74 - r0
            java.lang.String r2 = ""
            r3 = 48
            int r2 = android.text.TextUtils.lastIndexOf(r2, r3)
            int r2 = 11 - r2
            java.lang.String r5 = m2885(r5, r0, r2)
            java.lang.String r5 = r5.intern()
            int r0 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r0 = (byte) r0
            int r0 = (-1) - r0
            char r0 = (char) r0
            int r2 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r2 = r2 >> 16
            int r2 = r2 + 1265
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r1 = r1 + 67
            java.lang.String r0 = m2885(r0, r2, r1)
            java.lang.String r0 = r0.intern()
            com.p004ironsource.adqualitysdk.sdk.i.n.m2828(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.r.sendCustomMediationRevenue(com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue):void");
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        if (!m2905()) {
            this.f2890 = iSAdQualityAdListener;
            f2880 = (f2883 + 37) % 128;
            return;
        }
        f2880 = (f2883 + 19) % 128;
        n.m2828(m2885((char) (Color.argb(0, 0, 0, 0) + 22597), 73 - ImageFormat.getBitsPerPixel(0), 11 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m2885((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 1212, 53 - View.getDefaultSize(0, 0)).intern());
        int i2 = f2883 + 69;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        if (m2905()) {
            f2880 = (f2883 + 45) % 128;
            n.m2828(m2885((char) (22597 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 75, 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m2885((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1454 - Color.green(0), 48 - (Process.myPid() >> 22)).intern());
        } else if (!m2857()) {
            this.f2902 = iSAdQualityConfig;
        } else {
            f2883 = (f2880 + 119) % 128;
            n.m2828(m2885((char) (22597 - View.resolveSize(0, 0)), KeyEvent.keyCodeFromString("") + 74, Drawable.resolveOpacity(0, 0) + 12).intern(), m2885((char) View.resolveSizeAndState(0, 0, 0), View.MeasureSpec.getMode(0) + 1502, (ViewConfiguration.getFadingEdgeLength() >> 16) + 58).intern());
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setSegment(final ISAdQualitySegment iSAdQualitySegment) {
        if (!m2905()) {
            s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.r.4

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static int f2958 = 1;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f2959 = 0;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char[] f2960 = {'A', 'd', 'Q', AbstractJsonLexerKt.UNICODE_ESC, 'a', 'l', 'i', 't', 'y', 'S', 'D', 'K', 'C', 'n', '\'', ' ', 's', 'e', 'g', 'm', '-', 'I', 'o', 'z', '.'};

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static char f2961 = 5;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static String m2915(byte b2, String str, int i2) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (i.f2343) {
                        try {
                            char[] cArr2 = f2960;
                            char c2 = f2961;
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
                            str2 = new String(cArr3);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return str2;
                }

                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    f2958 = (f2959 + 57) % 128;
                    if (r.m2855(r.this)) {
                        if (r.m2848(r.this) != null) {
                            r.m2848(r.this).m421(iSAdQualitySegment);
                        }
                    } else {
                        n.m2828(m2915((byte) (TextUtils.indexOf((CharSequence) "", '0') + 116), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f", 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m2915((byte) (Color.rgb(0, 0, 0) + 16777256), "\u000e\u0002\u000e\n\u0005\u0011\u0011\u0012\u0005\u0011\u0011\u0012\u0013\u000f\u0012\f\u0005\u0011\u0000\u0014\u0018\u0006\u0001\u0002\u0003\u0004\u0000\t\u0007\b\u0005\u0012\u0005\u000e\n\u0010\u000b\u0015\u0012\n\u0002\f\u0010\u0005\u000b\b\b\u0007\u0000\t\b\u0015\u0010\u0002V", (ViewConfiguration.getWindowTouchSlop() >> 8) + 55).intern());
                        int i2 = f2958 + 63;
                        f2959 = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                    }
                }
            });
            f2880 = (f2883 + 55) % 128;
            return;
        }
        f2880 = (f2883 + 97) % 128;
        n.m2828(m2885((char) (22597 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 74, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern(), m2885((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1406 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 49 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
        int i2 = f2883 + 5;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality
    @Deprecated
    public void setUserConsent(boolean z2) {
        int i2 = f2880 + 83;
        f2883 = i2 % 128;
        if (i2 % 2 == 0) {
            m2863().m447(z2);
            throw null;
        }
        m2863().m447(z2);
        f2880 = (f2883 + 97) % 128;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public synchronized void shutdown() {
        f2883 = (f2880 + 115) % 128;
        m2871(false);
        int i2 = f2883 + 105;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private void m2850() {
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.r.5
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                for (ISAdQualityInitListener iSAdQualityInitListener : r.m2849(r.this)) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                r.m2849(r.this).clear();
            }
        });
        int i2 = f2880 + 119;
        f2883 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m2854() {
        boolean z2;
        int i2 = f2880;
        int i3 = i2 + 43;
        f2883 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        z2 = this.f2900;
        int i4 = i2 + 87;
        f2883 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        throw th;
        return z2;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized boolean m2857() {
        int i2 = f2880;
        boolean z2 = this.f2901;
        int i3 = i2 + 43;
        f2883 = i3 % 128;
        if (i3 % 2 != 0) {
            return z2;
        }
        int i4 = 24 / 0;
        return z2;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized boolean m2859() {
        boolean z2;
        try {
            int i2 = f2880 + 19;
            f2883 = i2 % 128;
            if (i2 % 2 == 0) {
                z2 = this.f2897;
                int i3 = 53 / 0;
            } else {
                z2 = this.f2897;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ ax m2860(r rVar) {
        int i2 = f2883 + 39;
        f2880 = i2 % 128;
        int i3 = i2 % 2;
        ax axVar = rVar.f2891;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return axVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized ao m2863() {
        ao aoVar;
        int i2 = (f2880 + 37) % 128;
        f2883 = i2;
        aoVar = this.f2903;
        f2880 = (i2 + 81) % 128;
        return aoVar;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private JSONObject m2865() {
        int i2 = f2883 + 21;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            m2863().m434();
            throw null;
        }
        Map<String, String> mapM434 = m2863().m434();
        if (mapM434 != null && mapM434.containsKey(m2885((char) (TextUtils.getOffsetBefore("", 0) + 34200), View.MeasureSpec.makeMeasureSpec(0, 0) + 960, 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
            try {
                return new JSONObject(mapM434.get(m2885((char) (34200 - ((Process.getThreadPriority(0) + 20) >> 6)), 960 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13).intern()));
            } catch (JSONException unused) {
            }
        }
        int i3 = f2880 + 121;
        f2883 = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2870(r rVar, Context context, String str) {
        f2883 = (f2880 + 39) % 128;
        rVar.m2869(context, str, true, false, true);
        int i2 = f2880 + 35;
        f2883 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2876(r rVar, Context context) {
        f2880 = (f2883 + 121) % 128;
        rVar.m2868(context);
        int i2 = f2880 + 87;
        f2883 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ax m2882(r rVar, ax axVar) {
        int i2 = f2883;
        int i3 = i2 + 27;
        f2880 = i3 % 128;
        int i4 = i3 % 2;
        rVar.f2891 = axVar;
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
        int i6 = i2 + 125;
        f2880 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 13 / 0;
        }
        return axVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ iw m2893(r rVar) {
        int i2 = f2880;
        f2883 = (i2 + 105) % 128;
        iw iwVar = rVar.f2894;
        int i3 = i2 + 49;
        f2883 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
        return iwVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ aj m2899(r rVar) {
        int i2 = f2883 + 125;
        f2880 = i2 % 128;
        int i3 = i2 % 2;
        aj ajVar = rVar.f2892;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return ajVar;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        if (context instanceof Application) {
            int i2 = f2883 + 103;
            f2880 = i2 % 128;
            if (i2 % 2 == 0) {
                m2875((Application) context, str, iSAdQualityConfig);
                return;
            } else {
                m2875((Application) context, str, iSAdQualityConfig);
                throw null;
            }
        }
        if (context != null && !(!(context.getApplicationContext() instanceof Application))) {
            m2875((Application) context.getApplicationContext(), str, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            m2886((Activity) context, str, iSAdQualityConfig);
            int i3 = f2883 + 25;
            f2880 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        String strIntern = m2885((char) (Process.myPid() >> 22), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, 74 - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
        n.m2828(m2885((char) (22597 - View.resolveSizeAndState(0, 0, 0)), TextUtils.getOffsetBefore("", 0) + 74, 12 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), strIntern);
        m2877(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
        int i4 = f2880 + 103;
        f2883 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized ax m2903() {
        ax axVar;
        try {
            int i2 = f2880 + 117;
            f2883 = i2 % 128;
            if (i2 % 2 == 0) {
                axVar = this.f2891;
                int i3 = 46 / 0;
            } else {
                axVar = this.f2891;
            }
        } catch (Throwable th) {
            throw th;
        }
        return axVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m2871(boolean z2) {
        f2883 = (f2880 + 97) % 128;
        try {
            if (!(!m2905())) {
                n.m2828(m2885((char) (22597 - View.MeasureSpec.getMode(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 73, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern(), m2885((char) Color.blue(0), TextUtils.getTrimmedLength("") + 342, TextUtils.indexOf((CharSequence) "", '0', 0) + 37).intern());
                return;
            }
            if (!m2854()) {
                f2880 = (f2883 + 91) % 128;
                n.m2828(m2885((char) (22597 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 74 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 13).intern(), m2885((char) (MotionEvent.axisFromString("") + 1), TextUtils.indexOf("", "", 0, 0) + 378, 60 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
                f2880 = (f2883 + 27) % 128;
                return;
            }
            String strIntern = m2885((char) (View.combineMeasuredStates(0, 0) + 28490), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 436, TextUtils.getTrimmedLength("") + 28).intern();
            if (z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(strIntern);
                sb.append(m2885((char) Color.red(0), 464 - ExpandableListView.getPackedPositionChild(0L), KeyEvent.normalizeMetaState(0) + 24).intern());
                strIntern = sb.toString();
            }
            String strMo497 = as.m467().mo497(m2885((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 489 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 6 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
            if (!TextUtils.isEmpty(strMo497)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strIntern);
                sb2.append(m2885((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 496, 14 - TextUtils.indexOf("", "", 0)).intern());
                sb2.append(strMo497);
                strIntern = sb2.toString();
            }
            n.m2844(m2885((char) (22597 - KeyEvent.keyCodeFromString("")), 73 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12).intern(), strIntern);
            m2900(ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern);
            this.f2899 = true;
            as.m467().mo476();
            ih.m2416(this.f2898).m2424();
            this.f2891.m632();
            this.f2894.m2470();
            this.f2893.m371();
            hr.m2243();
        } catch (Exception e2) {
            kb.m2755(m2885((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 22597), 74 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), m2885((char) (17262 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getTapTimeout() >> 16) + IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, Color.green(0) + 19).intern(), e2, true, false, true);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2880(r rVar) {
        f2880 = (f2883 + 99) % 128;
        boolean zM2859 = rVar.m2859();
        int i2 = f2883 + 1;
        f2880 = i2 % 128;
        if (i2 % 2 == 0) {
            return zM2859;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ iw m2883(r rVar, iw iwVar) {
        int i2 = f2880 + 21;
        f2883 = i2 % 128;
        int i3 = i2 % 2;
        rVar.f2894 = iwVar;
        if (i3 != 0) {
            return iwVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ je m2894(r rVar, je jeVar) {
        int i2 = f2880 + 119;
        f2883 = i2 % 128;
        int i3 = i2 % 2;
        rVar.f2887 = jeVar;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return jeVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2901(r rVar, ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i2 = f2883 + 123;
        f2880 = i2 % 128;
        int i3 = i2 % 2;
        rVar.m2895(iSAdQualityLogLevel);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static r m2874() {
        synchronized (r.class) {
            try {
                if (f2884 == null) {
                    f2884 = new r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2884;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ix m2884(r rVar, ix ixVar) {
        int i2 = f2883 + 39;
        f2880 = i2 % 128;
        int i3 = i2 % 2;
        rVar.f2885 = ixVar;
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return ixVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2896(r rVar, ISAdQualityInitError iSAdQualityInitError, String str) {
        int i2 = f2883 + 103;
        f2880 = i2 % 128;
        int i3 = i2 % 2;
        rVar.m2900(iSAdQualityInitError, str);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        f2880 = (f2883 + 7) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m2907() {
        boolean z2;
        try {
            int i2 = f2883 + 37;
            int i3 = i2 % 128;
            f2880 = i3;
            if (i2 % 2 != 0) {
                z2 = this.f2896;
                int i4 = 81 / 0;
            } else {
                z2 = this.f2896;
            }
            f2883 = (i3 + 45) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2889(r rVar) {
        int i2 = f2883 + 41;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            rVar.m2871(false);
        } else {
            rVar.m2871(true);
        }
        int i3 = f2880 + 119;
        f2883 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m2897(boolean z2) {
        int i2 = f2883 + 15;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f2897 = z2;
            throw null;
        }
        this.f2897 = z2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m2902(boolean z2) {
        int i2 = f2883;
        this.f2901 = z2;
        int i3 = i2 + 93;
        f2880 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2890(r rVar, Context context) {
        f2883 = (f2880 + 89) % 128;
        rVar.m2888(context);
        f2880 = (f2883 + 93) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2900(ISAdQualityInitError iSAdQualityInitError, String str) {
        f2883 = (f2880 + 93) % 128;
        m2877(this.f2886, iSAdQualityInitError, str);
        int i2 = f2883 + 87;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized ISAdQualityLogLevel m2906() {
        int i2 = f2883 + 37;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        return this.f2895;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2891(r rVar, boolean z2) {
        int i2 = f2880 + 37;
        f2883 = i2 % 128;
        int i3 = i2 % 2;
        rVar.m2897(z2);
        if (i3 == 0) {
            throw null;
        }
        f2883 = (f2880 + 111) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m2895(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i2 = f2883;
        this.f2895 = iSAdQualityLogLevel;
        int i3 = i2 + 1;
        f2880 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2886(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        f2880 = (f2883 + 51) % 128;
        m2887(activity.getApplication(), activity, str, iSAdQualityConfig);
        f2883 = (f2880 + 99) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0056 A[PHI: r0
  0x0056: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v17 java.lang.String) binds: [B:8:0x0054, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013d, code lost:
    
        if (r4.isUserIdSet() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0144, code lost:
    
        if (r4.isUserIdSet() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0147, code lost:
    
        r10 = m2885((char) android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 233, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 60).intern();
        com.p004ironsource.adqualitysdk.sdk.i.n.m2828(r0, r10);
        m2877(r4.getAdQualityInitListeners(), com.p004ironsource.adqualitysdk.sdk.ISAdQualityInitError.ILLEGAL_USER_ID, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0170, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2887(android.app.Application r10, android.app.Activity r11, java.lang.String r12, com.p004ironsource.adqualitysdk.sdk.ISAdQualityConfig r13) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.r.m2887(android.app.Application, android.app.Activity, java.lang.String, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig):void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2875(Application application, String str, ISAdQualityConfig iSAdQualityConfig) {
        f2880 = (f2883 + 81) % 128;
        m2887(application, null, str, iSAdQualityConfig);
        f2880 = (f2883 + 9) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m2878(boolean z2) {
        try {
            int i2 = f2883 + 89;
            f2880 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f2900 = false;
            } else {
                this.f2900 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2877(final Set<ISAdQualityInitListener> set, final ISAdQualityInitError iSAdQualityInitError, final String str) {
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.r.6
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                for (ISAdQualityInitListener iSAdQualityInitListener : set) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitFailed(iSAdQualityInitError, str);
                    }
                }
                set.clear();
            }
        });
        int i2 = f2883 + 37;
        f2880 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m2879(ISAdQualityConfig iSAdQualityConfig) {
        f2883 = (f2880 + 121) % 128;
        if (this.f2902 == null) {
            return true;
        }
        try {
            String str = iSAdQualityConfig.getMetaData().get(m2885((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 34201), Gravity.getAbsoluteGravity(0, 0) + 960, (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern());
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str).optBoolean(m2885((char) ExpandableListView.getPackedPositionGroup(0L), 1559 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionType(0L) + 22).intern());
            }
            f2883 = (f2880 + 105) % 128;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m2872(String str) {
        if (m2905()) {
            n.m2828(m2885((char) (22598 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 75, 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m2885((char) (Process.myPid() >> 22), (ViewConfiguration.getTapTimeout() >> 16) + 549, 51 - ImageFormat.getBitsPerPixel(0)).intern());
            f2883 = (f2880 + 85) % 128;
            return false;
        }
        if (!m2854()) {
            n.m2828(m2885((char) (22597 - (ViewConfiguration.getLongPressTimeout() >> 16)), KeyEvent.keyCodeFromString("") + 74, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12).intern(), m2885((char) (MotionEvent.axisFromString("") + 52956), 602 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 65 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
            int i2 = f2880 + 49;
            f2883 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!TextUtils.isEmpty(str)) {
            f2883 = (f2880 + 83) % 128;
            return true;
        }
        n.m2828(m2885((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22597), 74 - TextUtils.getOffsetBefore("", 0), 12 - Color.red(0)).intern(), m2885((char) ((ViewConfiguration.getTapTimeout() >> 16) + 53780), 666 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 34).intern());
        int i3 = f2883 + 33;
        f2880 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2869(Context context, String str, boolean z2, boolean z3, boolean z4) {
        int i2 = f2883 + 17;
        f2880 = i2 % 128;
        if (i2 % 2 == 0) {
            String strM440 = m2863().m440();
            m2863().m446(str);
            if (str == null) {
                n.m2828(m2885((char) (TextUtils.lastIndexOf("", '0', 0) + 22598), TextUtils.getOffsetAfter("", 0) + 74, 11 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m2885((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 701 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 92 - Process.getGidForName("")).intern());
            } else if (!str.equals(m2885((char) TextUtils.getOffsetBefore("", 0), 792 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getPressedStateDuration() >> 16) + 17).intern())) {
                String strIntern = m2885((char) (22596 - TextUtils.lastIndexOf("", '0')), 74 - Color.alpha(0), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m2885((char) (62092 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 927 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
                sb.append(str);
                n.m2830(strIntern, sb.toString());
            } else {
                String strIntern2 = m2885((char) (22597 - TextUtils.getOffsetBefore("", 0)), 74 - Drawable.resolveOpacity(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2885((char) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.rgb(0, 0, 0) + 16778026, TextUtils.getOffsetAfter("", 0) + 40).intern());
                sb2.append(str);
                sb2.append(m2885((char) View.MeasureSpec.getSize(0), 851 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 77 - TextUtils.getOffsetAfter("", 0)).intern());
                n.m2828(strIntern2, sb2.toString());
            }
            as.m467().mo495(new AnonymousClass3(z2, context, z3, strM440, z4));
            JSONObject jSONObjectM2865 = m2865();
            if (jSONObjectM2865 != null) {
                as.m467().mo489(jSONObjectM2865);
                return;
            }
            as.m467().mo494(context, m2863(), true);
            int i3 = f2883 + 23;
            f2880 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        m2863().m440();
        m2863().m446(str);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m2905() {
        boolean z2;
        int i2 = (f2883 + 55) % 128;
        f2880 = i2;
        z2 = this.f2899;
        f2883 = (i2 + 49) % 128;
        return z2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2888(Context context) {
        f2880 = (f2883 + 39) % 128;
        String strM2562 = this.f2887.m2562(m2885((char) (31752 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.MeasureSpec.getSize(0) + 973, KeyEvent.normalizeMetaState(0) + 10).intern());
        if (TextUtils.isEmpty(strM2562)) {
            return;
        }
        new je(context, m2885((char) TextUtils.indexOf("", ""), (Process.myTid() >> 22) + 983, 25 - Color.red(0)).intern(), m2885((char) (25929 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1007, 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()).m2568(m2885((char) (31752 - TextUtils.getOffsetAfter("", 0)), 973 - Gravity.getAbsoluteGravity(0, 0), 9 - Process.getGidForName("")).intern(), strM2562);
        this.f2887.m2567(m2885((char) (31752 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 973, 10 - TextUtils.getOffsetAfter("", 0)).intern());
        f2880 = (f2883 + 11) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2904() {
        f2880 = (f2883 + 105) % 128;
        if (!m2905()) {
            if (!m2854()) {
                this.f2896 = true;
                f2883 = (f2880 + 45) % 128;
                return;
            } else {
                f2883 = (f2880 + 121) % 128;
                n.m2828(m2885((char) (22597 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 74, 12 - TextUtils.getTrimmedLength("")).intern(), m2885((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 1092, Color.alpha(0) + 48).intern());
                return;
            }
        }
        n.m2828(m2885((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22597), TextUtils.lastIndexOf("", '0') + 75, 12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m2885((char) (58650 - AndroidCharacter.getMirror('0')), TextUtils.getOffsetBefore("", 0) + IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, 60 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2885(char c2, int i2, int i3) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i3];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i3) {
                        cArr[i4] = (char) ((((long) f2881[i2 + i4]) ^ (((long) i4) * f2882)) ^ ((long) c2));
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2868(Context context) {
        try {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.r.1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    jy.m2715(intent);
                }
            }, new IntentFilter(m2885((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.blue(0) + 1140, TextUtils.lastIndexOf("", '0', 0, 0) + 38).intern()), null, s.m2916());
            f2880 = (f2883 + 109) % 128;
        } catch (Throwable th) {
            n.m2847(m2885((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22597), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 74, (ViewConfiguration.getPressedStateDuration() >> 16) + 12).intern(), m2885((char) Color.blue(0), View.MeasureSpec.getSize(0) + 1177, 35 - (Process.myPid() >> 22)).intern(), th);
        }
    }
}
