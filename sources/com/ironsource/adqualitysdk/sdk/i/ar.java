package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
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
import com.ironsource.InterfaceC0435l1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ar extends AnonymousClass5 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ar f335;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ar$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private JSONObject f336;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private aw f337;

        /* JADX INFO: renamed from: っ, reason: contains not printable characters */
        public final aw m505() {
            return this.f337;
        }

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        public final synchronized JSONObject m506() {
            return this.f336;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public synchronized void mo507(JSONObject jSONObject) {
            this.f336 = jSONObject;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void m508(aw awVar) {
            this.f337 = awVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        void mo509();

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        void mo510();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class e extends ar {

        /* JADX INFO: renamed from: く, reason: contains not printable characters */
        private static int f338 = 1;

        /* JADX INFO: renamed from: っ, reason: contains not printable characters */
        private static char f339 = 5;

        /* JADX INFO: renamed from: へ, reason: contains not printable characters */
        private static char[] f340 = {'e', 'm', 'd', 'c', 's', 'l', 'u', 't', 'r', 'a', 'b', 'k', '.', 'v', 'o', 'n', 'f', 'i', 'g', 'R', 'C', 'p', 'q', 'U', 'T'};

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        private static int f341 = 0;

        /* JADX INFO: renamed from: ト, reason: contains not printable characters */
        private static char f342 = 46412;

        /* JADX INFO: renamed from: リ, reason: contains not printable characters */
        private static char f343 = 31160;

        /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
        private static char f344 = 24915;

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private static char f345 = 6375;

        /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
        private boolean f346;

        /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
        private as f347;

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private List f348;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private int f349;

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private boolean f350;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private al f351;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private boolean f352;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private c f353;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private ax f354;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<ax> f355;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private List<ax> f356;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private ao f357;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private at f358;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private Handler f359;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private aq f360;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private jj f361;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private ap f362;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private final int f363;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private jm f364;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private final int f365;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private final int f366;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private final int f367;

        public e() {
            super((byte) 0);
            m523("澑\u2e76刺܃", TextUtils.indexOf("", "") + 3).intern();
            m526(View.MeasureSpec.getMode(0) + 3, "\u0001\u0002\u009d", (byte) (MotionEvent.axisFromString("") + 58)).intern();
            m523("沸\ue0fe樵㘄", (Process.myTid() >> 22) + 4).intern();
            m523("㕺쫅樵㘄", 5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
            m523("以分ឬ퀐", (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 3).intern();
            m523("龎\ue3c9ㆬ\uec5b", 4 - (Process.myPid() >> 22)).intern();
            m526(TextUtils.lastIndexOf("", '0', 0) + 5, "\u0004\u0000\u0007\u0000", (byte) (33 - TextUtils.getOffsetAfter("", 0))).intern();
            m526((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3, "\u0000\t¤", (byte) (64 - View.MeasureSpec.getMode(0))).intern();
            m523("ꭏ㶪\uee6a͉", ((Process.getThreadPriority(0) + 20) >> 6) + 4).intern();
            m523("붌ී啸욵", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3).intern();
            m526(View.MeasureSpec.getSize(0) + 3, "\t\u0001ç", (byte) (115 - ExpandableListView.getPackedPositionGroup(0L))).intern();
            m526(((Process.getThreadPriority(0) + 20) >> 6) + 4, "\u0002\u0006\u0007\f", (byte) (View.getDefaultSize(0, 0) + 118)).intern();
            TimeUnit timeUnit = TimeUnit.HOURS;
            timeUnit.toMillis(24L);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            this.f365 = (int) timeUnit2.toMillis(5L);
            this.f363 = (int) timeUnit.toMillis(12L);
            this.f367 = (int) timeUnit2.toMillis(3L);
            this.f366 = (int) timeUnit2.toMillis(10L);
            this.f349 = 0;
            this.f348 = null;
            this.f346 = false;
        }

        /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
        private boolean m511() {
            int i10 = f338 + 83;
            f341 = i10 % 128;
            boolean zOptBoolean = m506().optBoolean((i10 % 2 != 0 ? m526(3 / TextUtils.lastIndexOf("", 'g'), "\t\u0001ç", (byte) (38 % View.resolveSizeAndState(1, 1, 0))) : m526(TextUtils.lastIndexOf("", '0') + 4, "\t\u0001ç", (byte) (View.resolveSizeAndState(0, 0, 0) + 115))).intern());
            int i11 = f341 + 39;
            f338 = i11 % 128;
            if (i11 % 2 != 0) {
                return zOptBoolean;
            }
            throw null;
        }

        /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
        private boolean m512() {
            int mirror;
            int iLastIndexOf;
            int i10 = f341 + 59;
            f338 = i10 % 128;
            int i11 = i10 % 2;
            JSONObject jSONObjectM506 = m506();
            if (i11 == 0) {
                mirror = '^' / AndroidCharacter.getMirror('5');
                iLastIndexOf = 100 << TextUtils.lastIndexOf("", '\n');
            } else {
                mirror = '4' - AndroidCharacter.getMirror('0');
                iLastIndexOf = 117 - TextUtils.lastIndexOf("", '0');
            }
            boolean zOptBoolean = jSONObjectM506.optBoolean(m526(mirror, "\u0002\u0006\u0007\f", (byte) iLastIndexOf).intern());
            int i12 = f341 + 29;
            f338 = i12 % 128;
            if (i12 % 2 != 0) {
                return zOptBoolean;
            }
            throw null;
        }

        /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
        private int m513() {
            f338 = (f341 + 77) % 128;
            int iOptInt = m506().optInt(m523("\ud8b1쵘✞훂", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3).intern(), 3);
            int i10 = f338 + 67;
            f341 = i10 % 128;
            if (i10 % 2 == 0) {
                return iOptInt;
            }
            throw null;
        }

        /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
        private JSONObject m514() {
            f338 = (f341 + 15) % 128;
            String strM2674 = this.f364.m2674(m523("䘽駘墧૱ি욤\uf365㕌潿椵ᆻꢘ苆깯", 14 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
            if (strM2674 != null) {
                try {
                    return new JSONObject(strM2674);
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObject = new JSONObject();
            int i10 = f341 + 1;
            f338 = i10 % 128;
            if (i10 % 2 != 0) {
                return jSONObject;
            }
            throw null;
        }

        /* JADX INFO: renamed from: K, reason: contains not printable characters */
        private synchronized void m515() {
            try {
                f338 = (f341 + 21) % 128;
                Handler handler = this.f359;
                if (handler != null) {
                    handler.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            e.this.m536(true);
                            if (e.m519(e.this) != null) {
                                e.m519(e.this).mo304();
                            }
                            Iterator it = new ArrayList(e.m529(e.this)).iterator();
                            while (it.hasNext()) {
                                ((ax) it.next()).mo304();
                            }
                            e.m529(e.this).clear();
                            Iterator it2 = new ArrayList(e.m531(e.this)).iterator();
                            while (it2.hasNext()) {
                                ((ax) it2.next()).mo304();
                            }
                        }
                    });
                }
                int i10 = f341 + 81;
                f338 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 56 / 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ int m516(e eVar) {
            f338 = (f341 + 41) % 128;
            int iM513 = eVar.m513();
            int i10 = f341 + 61;
            f338 = i10 % 128;
            if (i10 % 2 != 0) {
                return iM513;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ int m517(e eVar) {
            int i10 = f338;
            f341 = (i10 + 35) % 128;
            int i11 = eVar.f349;
            eVar.f349 = i11 + 1;
            f341 = (i10 + 37) % 128;
            return i11;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ Handler m518(e eVar) {
            int i10 = f338;
            f341 = (i10 + 65) % 128;
            Handler handler = eVar.f359;
            f341 = (i10 + 117) % 128;
            return handler;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ ax m519(e eVar) {
            int i10 = f338 + 97;
            f341 = i10 % 128;
            int i11 = i10 % 2;
            ax axVar = eVar.f354;
            if (i11 != 0) {
                int i12 = 87 / 0;
            }
            return axVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ void m520(e eVar) {
            int i10 = f341 + 121;
            f338 = i10 % 128;
            int i11 = i10 % 2;
            eVar.m515();
            if (i11 == 0) {
                throw null;
            }
            int i12 = f338 + 51;
            f341 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 13 / 0;
            }
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ jm m522(e eVar) {
            int i10 = (f338 + 81) % 128;
            f341 = i10;
            jm jmVar = eVar.f364;
            f338 = (i10 + 107) % 128;
            return jmVar;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ c m524(e eVar) {
            int i10 = f341 + InterfaceC0435l1.d.b.f29114k;
            f338 = i10 % 128;
            int i11 = i10 % 2;
            c cVar = eVar.f353;
            if (i11 != 0) {
                return cVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ List m529(e eVar) {
            int i10 = (f341 + 107) % 128;
            f338 = i10;
            List<ax> list = eVar.f355;
            int i11 = i10 + 61;
            f341 = i11 % 128;
            if (i11 % 2 == 0) {
                return list;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ List m531(e eVar) {
            int i10 = f341;
            int i11 = i10 + 23;
            f338 = i11 % 128;
            int i12 = i11 % 2;
            List<ax> list = eVar.f356;
            if (i12 == 0) {
                throw null;
            }
            f338 = (i10 + 91) % 128;
            return list;
        }

        /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
        public final int m533() {
            f338 = (f341 + 89) % 128;
            int iOptInt = m506().optInt(m526((-16777213) - Color.rgb(0, 0, 0), "\u0004\bÄ", (byte) (79 - TextUtils.lastIndexOf("", '0', 0))).intern(), this.f363);
            f338 = (f341 + 73) % 128;
            return iOptInt;
        }

        /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
        public final synchronized jj m534() {
            jj jjVar;
            int i10 = (f341 + 13) % 128;
            f338 = i10;
            jjVar = this.f361;
            int i11 = i10 + 125;
            f341 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            return jjVar;
        }

        /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
        public final int m535() {
            JSONObject jSONObjectM506;
            int iIndexOf;
            int iLastIndexOf;
            int i10 = f341 + InterfaceC0435l1.d.b.f29114k;
            f338 = i10 % 128;
            if (i10 % 2 == 0) {
                jSONObjectM506 = m506();
                iIndexOf = 4 << TextUtils.indexOf("", "", 1, 0);
                iLastIndexOf = 96 << TextUtils.lastIndexOf("", (char) 5, 0, 0);
            } else {
                jSONObjectM506 = m506();
                iIndexOf = TextUtils.indexOf("", "", 0, 0) + 3;
                iLastIndexOf = 93 - TextUtils.lastIndexOf("", '0', 0, 0);
            }
            return jSONObjectM506.optInt(m526(iIndexOf, "\b\rÒ", (byte) iLastIndexOf).intern(), this.f365);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: く */
        public final Map<String, String> mo469() {
            int i10 = f341 + 9;
            f338 = i10 % 128;
            if (i10 % 2 == 0) {
                m512();
                throw null;
            }
            if (m512()) {
                f341 = (f338 + 27) % 128;
                if (this.f347 != null) {
                    HashMap map = new HashMap(this.f347.m546());
                    int i11 = f341 + 99;
                    f338 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 79 / 0;
                    }
                    return map;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0022  */
        /* JADX WARN: Code duplicated, block: B:14:0x0032  */
        /* JADX WARN: Code duplicated, block: B:9:0x001d  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: へ */
        public final String mo470() {
            as asVar;
            int i10;
            int i11 = f338 + InterfaceC0435l1.d.b.f29107d;
            f341 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 22 / 0;
                if (m511()) {
                    asVar = this.f347;
                    if (asVar != null) {
                        String strM544 = asVar.m544();
                        i10 = f341 + 119;
                        f338 = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i13 = 99 / 0;
                        }
                        return strM544;
                    }
                }
            } else if (m511()) {
                asVar = this.f347;
                if (asVar != null) {
                    String strM545 = asVar.m544();
                    i10 = f341 + 119;
                    f338 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i14 = 99 / 0;
                    }
                    return strM545;
                }
            }
            int i15 = f341 + InterfaceC0435l1.d.b.f29114k;
            f338 = i15 % 128;
            if (i15 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ト */
        public final boolean mo471() {
            int i10 = f341 + 45;
            f338 = i10 % 128;
            return m506().optBoolean(m523("붌ී啸욵", i10 % 2 == 0 ? KeyEvent.normalizeMetaState(0) + 2 : 3 - KeyEvent.normalizeMetaState(0)).intern());
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: リ */
        public final boolean mo472() {
            int i10 = f338 + 71;
            f341 = i10 % 128;
            boolean zOptBoolean = m506().optBoolean(m523("ꭏ㶪\uee6a͉", i10 % 2 != 0 ? (ViewConfiguration.getMaximumDrawingCacheSize() * 96) + 4 : 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
            int i11 = f338 + 89;
            f341 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 78 / 0;
            }
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヮ */
        public final boolean mo473() {
            int size;
            byte bLastIndexOf;
            int i10 = f338 + 99;
            f341 = i10 % 128;
            int i11 = i10 % 2;
            JSONObject jSONObjectM506 = m506();
            if (i11 != 0) {
                size = View.MeasureSpec.getSize(0) + 5;
                bLastIndexOf = (byte) (117 % TextUtils.lastIndexOf("", 'G', 1));
            } else {
                size = View.MeasureSpec.getSize(0) + 4;
                bLastIndexOf = (byte) (32 - TextUtils.lastIndexOf("", '0', 0));
            }
            return jSONObjectM506.optBoolean(m526(size, "\u0004\u0000\u0007\u0000", bLastIndexOf).intern());
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヶ */
        public final List mo474() {
            f341 = (f338 + 85) % 128;
            if (this.f348 == null) {
                this.f348 = kj.m2866(m506().optJSONArray(m523("龎\ue3c9ㆬ\uec5b", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5).intern()), new kj.e<ISAdQualityAdType>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    public final /* synthetic */ ISAdQualityAdType mo542(JSONArray jSONArray, int i10) {
                        return ISAdQualityAdType.fromInt(jSONArray.optInt(i10));
                    }
                });
            }
            List list = this.f348;
            f341 = (f338 + 45) % 128;
            return list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 丫 */
        public final int mo475() {
            int iOptInt;
            synchronized (this) {
                iOptInt = m506().optInt(m526((Process.myTid() >> 22) + 3, "\u0000\t¤", (byte) (64 - TextUtils.indexOf("", "", 0))).intern(), 100);
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 乁 */
        public final long mo476() {
            f338 = (f341 + 125) % 128;
            String strM2674 = this.f364.m2674(m526((ViewConfiguration.getTouchSlop() >> 8) + 37, "\t\n\u0010\u0013\u000e\u0007\u0007\u0002\n\u0007\u000e\t\u0005\u0016\n\u0013\u0014\u0005\u0002\b\r\t\u0018\u0016\u0004\u0007\u0005\u0002\u0016\u0013\u0002\u0001\u0002\t\u0006\u0004\u0099", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40)).intern());
            if (TextUtils.isEmpty(strM2674)) {
                return 0L;
            }
            int i10 = f341 + 125;
            f338 = i10 % 128;
            if (i10 % 2 != 0) {
                return Long.parseLong(strM2674);
            }
            Long.parseLong(strM2674);
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 爫 */
        public final JSONObject mo477() {
            if (m505() == null) {
                return null;
            }
            f338 = (f341 + 45) % 128;
            JSONObject jSONObjectM667 = m505().m667();
            int i10 = f341 + 3;
            f338 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 41 / 0;
            }
            return jSONObjectM667;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﬤ */
        public final int mo478() {
            JSONObject jSONObjectM506;
            String strM523;
            int i10 = f341 + 1;
            f338 = i10 % 128;
            if (i10 % 2 == 0) {
                jSONObjectM506 = m506();
                strM523 = m523("㕺쫅樵㘄", 3 >> (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1)));
            } else {
                jSONObjectM506 = m506();
                strM523 = m523("㕺쫅樵㘄", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3);
            }
            return jSONObjectM506.optInt(strM523.intern(), this.f366);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: טּ */
        public final synchronized void mo479() {
            this.f359.removeCallbacksAndMessages(null);
            this.f359 = null;
            p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.1
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    e.m529(e.this).clear();
                    e.m531(e.this).clear();
                    e.m525(e.this, null);
                }
            });
            f338 = (f341 + 3) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: סּ */
        public final int mo480() {
            f341 = (f338 + 93) % 128;
            int iOptInt = m506().optInt(m523("沸\ue0fe樵㘄", 4 - (Process.myPid() >> 22)).intern(), this.f367);
            f338 = (f341 + InterfaceC0435l1.d.b.f29110g) % 128;
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ףּ */
        public final String mo481() {
            f338 = (f341 + 93) % 128;
            if (m506() == null) {
                return null;
            }
            int i10 = f341 + 57;
            f338 = i10 % 128;
            if (i10 % 2 == 0) {
                String strOptString = m506().optString(m526(4 % View.MeasureSpec.getMode(0), "\u0007\f\u0007\f", (byte) (81 % (ViewConfiguration.getWindowTouchSlop() * 12))).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    return strOptString;
                }
            } else {
                String strOptString2 = m506().optString(m526(View.MeasureSpec.getMode(0) + 4, "\u0007\f\u0007\f", (byte) (61 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern());
                if (!TextUtils.isEmpty(strOptString2)) {
                    return strOptString2;
                }
            }
            return m505().m669();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭖ */
        public final aq mo482() {
            int i10 = f341 + 7;
            f338 = i10 % 128;
            if (i10 % 2 != 0) {
                return this.f360;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭴ */
        public final ao mo483() {
            int i10 = f338;
            ao aoVar = this.f357;
            f341 = (i10 + 107) % 128;
            return aoVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭸ */
        public final ap mo484() {
            int i10 = (f338 + 67) % 128;
            f341 = i10;
            ap apVar = this.f362;
            f338 = (i10 + 29) % 128;
            return apVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮉ */
        public final String mo485() {
            f341 = (f338 + 57) % 128;
            String strOptString = m506().optString(m523("澑\u2e76刺܃", 3 - View.MeasureSpec.getSize(0)).intern());
            f341 = (f338 + InterfaceC0435l1.d.b.f29114k) % 128;
            return strOptString;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮌ */
        public final at mo486() {
            int i10 = f338;
            at atVar = this.f358;
            f341 = (i10 + 71) % 128;
            return atVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱟ */
        public final double mo488() {
            f338 = (f341 + 57) % 128;
            double dOptDouble = m506().optDouble(m523("以分ឬ퀐", ((Process.getThreadPriority(0) + 20) >> 6) + 4).intern(), 1.0d);
            f341 = (f338 + 9) % 128;
            return dOptDouble;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ ax m525(e eVar, ax axVar) {
            int i10 = f338;
            int i11 = i10 + 61;
            f341 = i11 % 128;
            int i12 = i11 % 2;
            eVar.f354 = axVar;
            if (i12 != 0) {
                throw null;
            }
            int i13 = i10 + 39;
            f341 = i13 % 128;
            if (i13 % 2 == 0) {
                return axVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ void m530(JSONObject jSONObject, long j10) {
            f338 = (f341 + InterfaceC0435l1.d.b.f29110g) % 128;
            m521(jSONObject, j10);
            f338 = (f341 + 31) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮐ */
        public final int mo487() {
            f338 = (f341 + 27) % 128;
            aw awVarM505 = m505();
            if (awVarM505 == null) {
                return IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
            }
            int i10 = f338 + 117;
            f341 = i10 % 128;
            if (i10 % 2 == 0) {
                return awVarM505.m666();
            }
            awVarM505.m666();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱡ */
        public final synchronized boolean mo489() {
            boolean z10;
            int i10 = f338;
            z10 = this.f352;
            int i11 = i10 + 125;
            f341 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            return z10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﺙ */
        public final boolean mo490() {
            int i10 = f338 + 33;
            int i11 = i10 % 128;
            f341 = i11;
            if (i10 % 2 != 0) {
                throw null;
            }
            boolean z10 = this.f350;
            int i12 = i11 + 77;
            f338 = i12 % 128;
            if (i12 % 2 != 0) {
                return z10;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻏ */
        public final double mo491() {
            int i10;
            byte modifierMetaStateMask;
            int i11 = f341 + 31;
            f338 = i11 % 128;
            int i12 = i11 % 2;
            JSONObject jSONObjectM506 = m506();
            if (i12 == 0) {
                i10 = (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)) + 5;
                modifierMetaStateMask = (byte) (62 / ((byte) KeyEvent.getModifierMetaStateMask()));
            } else {
                i10 = 4 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
                modifierMetaStateMask = (byte) (91 - ((byte) KeyEvent.getModifierMetaStateMask()));
            }
            return jSONObjectM506.optDouble(m526(i10, "\u0005\u0002Ì", modifierMetaStateMask).intern(), 5.0d);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻐ */
        public final void mo492(Context context, jj jjVar, al alVar, c cVar, boolean z10) {
            this.f364 = new jm(context, m526((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28, "\b\t\b\u0004\u0005\u000f\b\u0004\f\r\f\u000e\u0011\u0007\u000b\r\u0005\u0003\u0004\u000b\u0005\u0002\u0004\r\u0010\u0011\u0012\u0013", (byte) (12 - View.resolveSize(0, 0))).intern(), m523("⇾ꤻ禫ꫳ⟕㩿ꝧ᫁誓\ued55ጐ셉\uf22a㦨䂿\ue8dc⢾癤苚哠", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 20).intern());
            this.f361 = jjVar;
            this.f352 = false;
            this.f350 = z10;
            this.f351 = alVar;
            this.f359 = new Handler(Looper.getMainLooper());
            aw awVar = new aw();
            this.f358 = new at(awVar);
            this.f362 = new ap(awVar);
            this.f360 = new aq(awVar);
            this.f357 = new ao();
            mo507(m514());
            m508(awVar);
            this.f353 = cVar;
            this.f355 = new ArrayList();
            this.f356 = new ArrayList();
            int i10 = f338 + 115;
            f341 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar.AnonymousClass5
        /* JADX INFO: renamed from: ﻛ */
        public final synchronized void mo507(JSONObject jSONObject) {
            try {
                f338 = (f341 + 41) % 128;
                if (m527(jSONObject)) {
                    m532(jSONObject);
                    f341 = (f338 + 49) % 128;
                }
                super.mo507(jSONObject);
                this.f358.mo507(jSONObject);
                this.f362.mo507(jSONObject);
                this.f360.mo507(jSONObject);
                this.f357.mo507(jSONObject);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo502(final Context context, final as asVar, boolean z10) {
            f341 = (f338 + 95) % 128;
            this.f347 = asVar;
            if (z10) {
                p.m2991(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        if (!e.this.m534().m2628().m2604()) {
                            e.m524(e.this).mo509();
                        } else {
                            if (e.this.mo489()) {
                                return;
                            }
                            e.m524(e.this).mo510();
                        }
                    }
                }, ar.m468().mo480());
                f338 = (f341 + 37) % 128;
            }
            m536(false);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = new ka(context, asVar, mo476()).mo326(new JSONObject(), m534().m2628().m2604(), true, false);
            } catch (JSONException e10) {
                m.m2983(m526(13 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u000f\u0004\u0004\u000b\u0005\u0002\u0018\n\u0010\u0011\u0012\u0013", (byte) (58 - View.combineMeasuredStates(0, 0))).intern(), m523("䆷拲史紎톲꧀ප\ue6b1련첨徊锫浝덁ᙯ诹\ue43a艖〟㲇\uea37ꜣ澑\u2e76\uef06\uda48", 26 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), e10);
            }
            m534().m2630(this.f351.m430(m523("扨ﲅ댿╓", (ViewConfiguration.getTouchSlop() >> 8) + 4).intern()), jSONObject, new ji() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.5

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f375 = 1;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static int f377 = 0;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static char f378 = 0;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static long f380 = 7155428204448527445L;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static int f381;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static char[] f376 = {42368, 22902, 23613, 21502, 22178, 19058, 18711, 19706, 17332, 18301, 31281, 31230, 'S', 64692, 63969, 63008, 62305, 61366, 60661, 59681, 59005, 58021, 57318, 56370, 55596, 54719, 53995, 53036, 52341, 51384, 50660, 49718, 49008, 48117, 47349, 46392, 45686, 44735, 44019, 43068, 42278, 3831, 62009, 63341, 63659, 17424, 47318, 48530, 37202, 28034, 26829, 26381, 25154, 32396, 32193, 30793, 30539, 29576, 20169, 19715, 18505, 45707, 20045, 41609, 24137};

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static long f379 = -6053810036959085375L;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m538(char c4, int i10, int i11) {
                    String str;
                    synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1153) {
                        try {
                            char[] cArr = new char[i11];
                            com.ironsource.adqualitysdk.sdk.i.c.f1154 = 0;
                            while (true) {
                                int i12 = com.ironsource.adqualitysdk.sdk.i.c.f1154;
                                if (i12 < i11) {
                                    cArr[i12] = (char) ((((long) f376[i10 + i12]) ^ (((long) i12) * f379)) ^ ((long) c4));
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

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static String m539(char c4, String str, String str2, String str3, int i10) {
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
                                    cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f380) ^ ((long) f381)) ^ ((long) f378));
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

                @Override // com.ironsource.adqualitysdk.sdk.i.ji
                /* JADX INFO: renamed from: ﾇ */
                public final void mo399(jd jdVar) {
                    try {
                        int iM2576 = jdVar.m2571().m2576();
                        String strM2575 = jdVar.m2571().m2575();
                        try {
                            if (iM2576 >= 200) {
                                f375 = (f377 + 9) % 128;
                                if (iM2576 <= 299) {
                                    JSONObject jSONObjectM2574 = jdVar.m2574();
                                    if (jSONObjectM2574.optBoolean(m539((char) (60176 - Color.red(0)), "㑕痷《捍", "ᨌ숛Ⴅ\uedeb", "頭婘\uf44d", (-1514005734) - KeyEvent.getDeadChar(0, 0)).intern())) {
                                        f377 = (f375 + 67) % 128;
                                        s.m3035().m3058();
                                    }
                                    m.m2973(m538((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42451), Process.getGidForName("") + 1, TextUtils.getTrimmedLength("") + 12).intern(), m538((char) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, (-16777187) - Color.rgb(0, 0, 0)).intern(), jSONObjectM2574);
                                    JSONObject jSONObjectM2855 = kj.m2855(jSONObjectM2574);
                                    e.this.m537(jSONObjectM2855.optLong(m538((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 3739), (-16777175) - Color.rgb(0, 0, 0), 3 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), 0L));
                                    jSONObjectM2855.remove(m538((char) (17507 - Color.red(0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45, 3 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                                    e.m522(e.this).m2678(m538((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37151), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 48, 13 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), jSONObjectM2855.toString(), null);
                                    jSONObjectM2574.put(m538((char) (45823 - TextUtils.indexOf("", "", 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 62, TextUtils.indexOf((CharSequence) "", '0', 0) + 3).intern(), ke.m2803());
                                    jSONObjectM2574.put(m538((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 41724), 63 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 2).intern(), ke.m2801());
                                    e.m530(jSONObjectM2574, jdVar.m2573());
                                    e.this.mo507(jSONObjectM2574);
                                    f375 = (f377 + 13) % 128;
                                    e.m520(e.this);
                                    m540(e.this.m533());
                                    return;
                                }
                                kl.m2900(m538((char) (View.resolveSizeAndState(0, 0, 0) + 42450), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1, 13 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m539((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47950), "㑕痷《捍", "뾿턖亖\ue1bb", "轿㛮\ue441鹽⥹◇ꂭ蹣\udd34扦듢賶鮤봣\udb60碃憎ꝺ\udbc5ᓃ餻〡庺섷\uf1cc誌鐻塃꼖쓚䚗ﭢ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), e, false, true);
                                e.m520(e.this);
                                m540(e.this.m533());
                                return;
                            }
                            mo400(jdVar, strM2575);
                        } catch (Exception e11) {
                            e = e11;
                            kl.m2900(m538((char) (View.resolveSizeAndState(0, 0, 0) + 42450), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1, 13 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m539((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47950), "㑕痷《捍", "뾿턖亖\ue1bb", "轿㛮\ue441鹽⥹◇ꂭ蹣\udd34扦듢賶鮤봣\udb60碃憎ꝺ\udbc5ᓃ餻〡庺섷\uf1cc誌鐻塃꼖쓚䚗ﭢ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), e, false, true);
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.ji
                /* JADX INFO: renamed from: ﾒ */
                public final void mo400(jd jdVar, String str) {
                    int iM2576;
                    if (jdVar != null) {
                        int i10 = f375 + 119;
                        f377 = i10 % 128;
                        if (i10 % 2 != 0) {
                            jdVar.m2571().m2576();
                            throw null;
                        }
                        iM2576 = jdVar.m2571().m2576();
                    } else {
                        f375 = (f377 + InterfaceC0435l1.d.b.f29110g) % 128;
                        iM2576 = -1;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m539((char) Color.argb(0, 0, 0, 0), "㑕痷《捍", "\ued3c抎\ud8db㊝", "擒㺛㏉ꞛ泀ꮿ춯有値屷谌醨죤ꃶ萼䱘⼃䀚㜧₸牣쟯畬䀄휿㚅쮌躢鲸㗤\uda27僣녅ﻻ", 1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
                    sb2.append(iM2576);
                    m.m2968(m538((char) (42450 - View.resolveSizeAndState(0, 0, 0)), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), TextUtils.indexOf("", "", 0) + 12).intern(), sb2.toString());
                    if (iM2576 != 403 && e.m517(e.this) < e.m516(e.this)) {
                        int i11 = f375 + 53;
                        f377 = i11 % 128;
                        if (i11 % 2 != 0) {
                            m540(e.this.m535());
                            throw null;
                        }
                        m540(e.this.m535());
                    }
                    int i12 = f377 + 81;
                    f375 = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private void m540(int i10) {
                    synchronized (e.this) {
                        try {
                            if (e.m518(e.this) != null) {
                                p.m2997(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.5.3
                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* JADX INFO: renamed from: ｋ */
                                    public final void mo254() {
                                        AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                        e.this.mo502(context, asVar, false);
                                    }
                                }, i10);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            });
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final void mo498(final ax axVar) {
            int i10 = f341 + 9;
            f338 = i10 % 128;
            if (i10 % 2 != 0) {
                Handler handler = this.f359;
                if (handler != null) {
                    handler.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            e.m531(e.this).add(axVar);
                            if (e.this.mo489()) {
                                axVar.mo304();
                            }
                        }
                    });
                    f341 = (f338 + 51) % 128;
                    return;
                }
                return;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final void mo499(final ax axVar) {
            int i10 = f338 + 79;
            f341 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            Handler handler = this.f359;
            if (handler != null) {
                handler.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.10
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        if (e.this.mo489()) {
                            axVar.mo304();
                        } else {
                            e.m529(e.this).add(axVar);
                        }
                    }
                });
                f341 = (f338 + 107) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final Map<String, au> mo497() {
            Map<String, au> map = new HashMap<>();
            try {
                String strOptString = m506().optString(m526(3 - (Process.myTid() >> 22), "\u0003\u0004·", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 67)).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    map = kj.m2860(new JSONObject(strOptString), new kj.a<au>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.6
                        @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        public final /* synthetic */ au mo541(JSONObject jSONObject, String str) {
                            return new au(jSONObject.optJSONObject(str));
                        }
                    });
                }
            } catch (JSONException e10) {
                kl.m2899(m526(AndroidCharacter.getMirror('0') - '$', "\u000f\u0004\u0004\u000b\u0005\u0002\u0018\n\u0010\u0011\u0012\u0013", (byte) (Color.red(0) + 58)).intern(), m523("䆷拲史紎톲꧀扨ﲅ듬ጘ烡\uf7b2货\uf749輥ﳁ誓\ued55雒뺄끘\ua82e鈐滟翤괚ꭏ㶪⋺\ueb2a苆깯", (KeyEvent.getMaxKeyCode() >> 16) + 31).intern(), e10, false);
            }
            f338 = (f341 + 33) % 128;
            return map;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo500() {
            f341 = (f338 + 89) % 128;
            boolean zOptBoolean = m506().optBoolean(m523("蛰\uf1b8\u206d斟", Gravity.getAbsoluteGravity(0, 0) + 3).intern(), false);
            int i10 = f341 + 55;
            f338 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 14 / 0;
            }
            return zOptBoolean;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m537(long j10) {
            boolean z10;
            int i10 = f338 + 45;
            int i11 = i10 % 128;
            f341 = i11;
            if (i10 % 2 == 0) {
                if (this.f346) {
                    return;
                }
                int i12 = i11 + 25;
                f338 = i12 % 128;
                if (i12 % 2 == 0) {
                    this.f364.m2672(m526(KeyEvent.keyCodeFromString("") + 119, "\t\n\u0010\u0013\u000e\u0007\u0007\u0002\n\u0007\u000e\t\u0005\u0016\n\u0013\u0014\u0005\u0002\b\r\t\u0018\u0016\u0004\u0007\u0005\u0002\u0016\u0013\u0002\u0001\u0002\t\u0006\u0004\u0099", (byte) (23 % (ViewConfiguration.getKeyRepeatTimeout() - 48))).intern(), String.valueOf(j10));
                    z10 = false;
                } else {
                    this.f364.m2672(m526(37 - KeyEvent.keyCodeFromString(""), "\t\n\u0010\u0013\u000e\u0007\u0007\u0002\n\u0007\u000e\t\u0005\u0016\n\u0013\u0014\u0005\u0002\b\r\t\u0018\u0016\u0004\u0007\u0005\u0002\u0016\u0013\u0002\u0001\u0002\t\u0006\u0004\u0099", (byte) (41 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern(), String.valueOf(j10));
                    z10 = true;
                }
                this.f346 = z10;
                return;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final synchronized void m536(boolean z10) {
            int i10 = f341;
            int i11 = i10 + 23;
            f338 = i11 % 128;
            if (i11 % 2 == 0) {
                this.f352 = z10;
                throw null;
            }
            this.f352 = z10;
            f338 = (i10 + 61) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo495(JSONObject jSONObject, as asVar) {
            int i10 = f341 + 55;
            f338 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f347 = asVar;
                mo507(jSONObject);
                m515();
                f341 = (f338 + 121) % 128;
                return;
            }
            this.f347 = asVar;
            mo507(jSONObject);
            m515();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean m527(JSONObject jSONObject) {
            f338 = (f341 + 75) % 128;
            boolean zHas = jSONObject.has(m523("蘳鱟鎟ﯷ䏈\uec9a", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6).intern());
            int i10 = f341 + 29;
            f338 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 4 / 0;
            }
            return zHas;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo503(final ax axVar) {
            f338 = (f341 + InterfaceC0435l1.d.b.f29112i) % 128;
            Handler handler = this.f359;
            if (handler != null) {
                handler.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        e.m525(e.this, axVar);
                        if (e.this.mo489()) {
                            axVar.mo304();
                        }
                    }
                });
                f341 = (f338 + 5) % 128;
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m526(int i10, String str, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (j.f2647) {
                try {
                    char[] cArr2 = f340;
                    char c4 = f339;
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

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private au m528(String str) {
            if (str != null) {
                f338 = (f341 + 97) % 128;
                return mo497().get(str);
            }
            f341 = (f338 + 115) % 128;
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final boolean mo504() {
            f341 = (f338 + 117) % 128;
            boolean zOptBoolean = m506().optBoolean(m523("浱᫋苆깯", 3 - Color.red(0)).intern(), true);
            int i10 = f341 + InterfaceC0435l1.d.b.f29105b;
            f338 = i10 % 128;
            if (i10 % 2 != 0) {
                return zOptBoolean;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻐ */
        public final void mo493(jh jhVar) {
            int i10 = f341 + 41;
            f338 = i10 % 128;
            int i11 = i10 % 2;
            m505().m673(jhVar);
            if (i11 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final String mo501(String str) {
            f341 = (f338 + 57) % 128;
            au auVarM528 = m528(str);
            if (auVarM528 == null) {
                return null;
            }
            String strM575 = auVarM528.m575();
            int i10 = f338 + InterfaceC0435l1.d.b.f29107d;
            f341 = i10 % 128;
            if (i10 % 2 == 0) {
                return strM575;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻐ */
        public final boolean mo494() {
            int i10 = f341 + 55;
            f338 = i10 % 128;
            int i11 = i10 % 2;
            JSONObject jSONObjectM506 = m506();
            boolean zOptBoolean = i11 == 0 ? jSONObjectM506.optBoolean(m523("㫚웵潿椵", 4 / Color.red(1)).intern(), false) : jSONObjectM506.optBoolean(m523("㫚웵潿椵", Color.red(0) + 4).intern(), true);
            int i12 = f341 + 53;
            f338 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 28 / 0;
            }
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final boolean mo496(String str, String str2) {
            int i10 = f341 + 41;
            f338 = i10 % 128;
            if (i10 % 2 != 0) {
                au auVarM528 = m528(str);
                if (auVarM528 == null || !auVarM528.m576(str2)) {
                    return true;
                }
                f338 = (f341 + 117) % 128;
                return false;
            }
            m528(str);
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static void m521(JSONObject jSONObject, long j10) {
            f338 = (f341 + 125) % 128;
            if (jSONObject.has(m526(3 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0002\t\u009d", (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42)).intern())) {
                try {
                    jSONObject.put(m526(3 - Color.alpha(0), "\u0002\t\u009d", (byte) (43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), jSONObject.optLong(m526(View.getDefaultSize(0, 0) + 3, "\u0002\t\u009d", (byte) (View.combineMeasuredStates(0, 0) + 42)).intern()) + (j10 / 2));
                    f338 = (f341 + 45) % 128;
                } catch (JSONException unused) {
                }
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static void m532(JSONObject jSONObject) {
            f341 = (f338 + 55) % 128;
            kj.m2869(jSONObject, jSONObject.optJSONObject(m523("蘳鱟鎟ﯷ䏈\uec9a", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7).intern()));
            f338 = (f341 + 85) % 128;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m523(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (o.f3076) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    o.f3077 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = o.f3077;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c4 = cArr3[1];
                                char c5 = cArr3[0];
                                char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f343)) ^ ((c5 >>> 5) + f342)));
                                cArr3[1] = c10;
                                cArr3[0] = (char) (c5 - (((c10 >>> 5) + f345) ^ ((c10 + i12) ^ ((c10 << 4) + f344))));
                                i12 -= 40503;
                            }
                            int i14 = o.f3077;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            o.f3077 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public /* synthetic */ ar(byte b10) {
        this();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized ar m468() {
        try {
            if (f335 == null) {
                f335 = new e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f335;
    }

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public abstract Map<String, String> mo469();

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public abstract String mo470();

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public abstract boolean mo471();

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public abstract boolean mo472();

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public abstract boolean mo473();

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public abstract List mo474();

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public abstract int mo475();

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public abstract long mo476();

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public abstract JSONObject mo477();

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public abstract int mo478();

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public abstract void mo479();

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public abstract int mo480();

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public abstract String mo481();

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public abstract aq mo482();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public abstract ao mo483();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public abstract ap mo484();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public abstract String mo485();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public abstract at mo486();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public abstract int mo487();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public abstract double mo488();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public abstract boolean mo489();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public abstract boolean mo490();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public abstract double mo491();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract void mo492(Context context, jj jjVar, al alVar, c cVar, boolean z10);

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract void mo493(jh jhVar);

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo494();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo495(JSONObject jSONObject, as asVar);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo496(String str, String str2);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract Map<String, au> mo497();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract void mo498(ax axVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo499(ax axVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo500();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract String mo501(String str);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo502(Context context, as asVar, boolean z10);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo503(ax axVar);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo504();

    private ar() {
    }
}
