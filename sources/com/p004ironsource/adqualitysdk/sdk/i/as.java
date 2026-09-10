package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class as extends AnonymousClass3 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static as f345;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.as$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private au f346;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private JSONObject f347;

        /* JADX INFO: renamed from: く, reason: contains not printable characters */
        public final au m500() {
            return this.f346;
        }

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        public final synchronized JSONObject m501() {
            return this.f347;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void m502(au auVar) {
            this.f346 = auVar;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public synchronized void mo503(JSONObject jSONObject) {
            this.f347 = jSONObject;
        }
    }

    public interface b {
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        void mo504();

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        void mo505();
    }

    public static class c extends as {

        /* JADX INFO: renamed from: く, reason: contains not printable characters */
        private static int f348 = 0;

        /* JADX INFO: renamed from: っ, reason: contains not printable characters */
        private static int f349 = 1;

        /* JADX INFO: renamed from: ト, reason: contains not printable characters */
        private static boolean f350 = true;

        /* JADX INFO: renamed from: リ, reason: contains not printable characters */
        private static boolean f351 = true;

        /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
        private static char[] f352 = {195, 203, 194, 193, 197, 202, 210, 209, 191, 192, 207, 208, 201, 140, 212, 205, 204, 196, 199, 198, 176, 161};

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private static int f353 = 94;

        /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
        private static int f354 = 58;

        /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
        private boolean f355;

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private boolean f356;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private boolean f357;

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private int f358;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private List f359;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private aj f360;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private List<at> f361;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private List<at> f362;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private b f363;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private ap f364;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private at f365;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private iw f366;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private Handler f367;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private ar f368;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private aq f369;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private av f370;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private je f371;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private final int f372;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private final int f373;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private final int f374;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private final int f375;

        public c() {
            super((byte) 0);
            m519((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2, ImageFormat.getBitsPerPixel(0) + 4, ImageFormat.getBitsPerPixel(0) + 168, "\u0001\ufff8\t", true).intern();
            m523(null, null, 127 - View.MeasureSpec.getMode(0), "\u0083\u0082\u0081").intern();
            m523(null, null, Color.green(0) + 127, "\u0087\u0086\u0085\u0084").intern();
            m523(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0087\u0086\u0088\u0084").intern();
            m519(3 - View.getDefaultSize(0, 0), 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 165 - TextUtils.indexOf("", "", 0), "\ufffe\ufffa\u0005\u0003", false).intern();
            m523(null, null, ImageFormat.getBitsPerPixel(0) + 128, "\u008a\u0087\u0087\u0089").intern();
            m519(4 - (ViewConfiguration.getTapTimeout() >> 16), 4 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 162, "\ufffa\n\u0003\ufffb", false).intern();
            m519(1 - TextUtils.lastIndexOf("", '0', 0), KeyEvent.keyCodeFromString("") + 3, 165 - ExpandableListView.getPackedPositionType(0L), "\u0001\b\ufff9", true).intern();
            m523(null, null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, "\u0088\u008b\u0089\u0088").intern();
            TimeUnit timeUnit = TimeUnit.HOURS;
            timeUnit.toMillis(24L);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            this.f372 = (int) timeUnit2.toMillis(5L);
            this.f373 = (int) timeUnit.toMillis(12L);
            this.f374 = (int) timeUnit2.toMillis(3L);
            this.f375 = (int) timeUnit2.toMillis(10L);
            this.f358 = 0;
            this.f359 = null;
            this.f355 = false;
        }

        /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
        private int m506() {
            f349 = (f348 + 107) % 128;
            int iOptInt = m501().optInt(m519(2 - (Process.myPid() >> 22), (Process.myTid() >> 22) + 4, 165 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0001\u0007\u0002\ufff8", false).intern(), 3);
            f349 = (f348 + 33) % 128;
            return iOptInt;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d A[Catch: all -> 0x0017, TryCatch #1 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x000e, B:16:0x0027, B:15:0x001d, B:10:0x0016, B:13:0x0019, B:6:0x0010), top: B:23:0x0001, inners: #0 }] */
        /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
        private synchronized void m507() {
            try {
                int i2 = f348 + 71;
                f349 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 3 / 0;
                    if (this.f367 != null) {
                        this.f367.post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.1
                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                c.this.m529(true);
                                if (c.m511(c.this) != null) {
                                    c.m511(c.this).mo319();
                                }
                                Iterator it = new ArrayList(c.m520(c.this)).iterator();
                                while (it.hasNext()) {
                                    ((at) it.next()).mo319();
                                }
                                c.m520(c.this).clear();
                                Iterator it2 = new ArrayList(c.m524(c.this)).iterator();
                                while (it2.hasNext()) {
                                    ((at) it2.next()).mo319();
                                }
                            }
                        });
                    }
                } else if (this.f367 != null) {
                    this.f367.post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.1
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            c.this.m529(true);
                            if (c.m511(c.this) != null) {
                                c.m511(c.this).mo319();
                            }
                            Iterator it = new ArrayList(c.m520(c.this)).iterator();
                            while (it.hasNext()) {
                                ((at) it.next()).mo319();
                            }
                            c.m520(c.this).clear();
                            Iterator it2 = new ArrayList(c.m524(c.this)).iterator();
                            while (it2.hasNext()) {
                                ((at) it2.next()).mo319();
                            }
                        }
                    });
                }
                f348 = (f349 + 3) % 128;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
        private JSONObject m508() {
            String strM2562;
            int i2 = f349 + 75;
            f348 = i2 % 128;
            if (i2 % 2 == 0 ? (strM2562 = this.f371.m2562(m523(null, null, 127 - KeyEvent.normalizeMetaState(0), "\u0081\u0094\u0084\u0089\u0084\u008e\u0085\u0093\u0092\u0091\u0090\u0084\u008c").intern())) != null : (strM2562 = this.f371.m2562(m523(null, null, 12 >> KeyEvent.normalizeMetaState(1), "\u0081\u0094\u0084\u0089\u0084\u008e\u0085\u0093\u0092\u0091\u0090\u0084\u008c").intern())) != null) {
                try {
                    return new JSONObject(strM2562);
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObject = new JSONObject();
            f349 = (f348 + 83) % 128;
            return jSONObject;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ int m509(c cVar) {
            int i2 = f349;
            f348 = (i2 + 79) % 128;
            int i3 = cVar.f358;
            cVar.f358 = i3 + 1;
            int i4 = i2 + 79;
            f348 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 73 / 0;
            }
            return i3;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public static /* synthetic */ Handler m510(c cVar) {
            int i2 = f348;
            f349 = (i2 + 7) % 128;
            Handler handler = cVar.f367;
            f349 = (i2 + 23) % 128;
            return handler;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ at m511(c cVar) {
            int i2 = (f349 + 3) % 128;
            f348 = i2;
            at atVar = cVar.f365;
            f349 = (i2 + 51) % 128;
            return atVar;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ int m512(c cVar) {
            int i2 = f349 + 31;
            f348 = i2 % 128;
            int i3 = i2 % 2;
            int iM506 = cVar.m506();
            if (i3 != 0) {
                int i4 = 14 / 0;
            }
            return iM506;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ void m514(c cVar) {
            int i2 = f348 + 125;
            f349 = i2 % 128;
            int i3 = i2 % 2;
            cVar.m507();
            if (i3 == 0) {
                int i4 = 80 / 0;
            }
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ je m516(c cVar) {
            int i2 = f348 + 97;
            int i3 = i2 % 128;
            f349 = i3;
            int i4 = i2 % 2;
            je jeVar = cVar.f371;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 57;
            f348 = i5 % 128;
            if (i5 % 2 == 0) {
                return jeVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ b m517(c cVar) {
            int i2 = (f349 + 89) % 128;
            f348 = i2;
            b bVar = cVar.f363;
            f349 = (i2 + 119) % 128;
            return bVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ List m520(c cVar) {
            int i2 = f349;
            f348 = (i2 + 95) % 128;
            List<at> list = cVar.f361;
            f348 = (i2 + 51) % 128;
            return list;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ List m524(c cVar) {
            int i2 = f349;
            f348 = (i2 + 105) % 128;
            List<at> list = cVar.f362;
            int i3 = i2 + 95;
            f348 = i3 % 128;
            if (i3 % 2 == 0) {
                return list;
            }
            throw null;
        }

        /* JADX INFO: renamed from: っ, reason: contains not printable characters */
        public final int m526() {
            f349 = (f348 + 11) % 128;
            int iOptInt = m501().optInt(m519(1 - TextUtils.indexOf("", ""), 2 - MotionEvent.axisFromString(""), 162 - KeyEvent.getDeadChar(0, 0), "\ufffb\f\ufff9", true).intern(), this.f373);
            int i2 = f349 + 55;
            f348 = i2 % 128;
            if (i2 % 2 == 0) {
                return iOptInt;
            }
            throw null;
        }

        /* JADX INFO: renamed from: へ, reason: contains not printable characters */
        public final synchronized iw m527() {
            iw iwVar;
            int i2 = (f348 + 55) % 128;
            f349 = i2;
            iwVar = this.f366;
            f348 = (i2 + 85) % 128;
            return iwVar;
        }

        /* JADX INFO: renamed from: ト, reason: contains not printable characters */
        public final int m528() throws UnsupportedEncodingException {
            JSONObject jSONObjectM501;
            String strM523;
            int i2 = f349 + 43;
            f348 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM501 = m501();
                strM523 = m523(null, null, 27 % (ViewConfiguration.getJumpTapTimeout() >>> 7), "\u0087\u008c\u0084");
            } else {
                jSONObjectM501 = m501();
                strM523 = m523(null, null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0087\u008c\u0084");
            }
            int iOptInt = jSONObjectM501.optInt(strM523.intern(), this.f372);
            int i3 = f348 + 35;
            f349 = i3 % 128;
            if (i3 % 2 != 0) {
                return iOptInt;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: リ */
        public final int mo468() {
            int iOptInt;
            synchronized (this) {
                iOptInt = m501().optInt(m519((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1, 3 - (Process.myPid() >> 22), 165 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0001\b\ufff9", true).intern(), 100);
            }
            return iOptInt;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ヮ */
        public final boolean mo469() {
            JSONObject jSONObjectM501;
            String strM519;
            int i2 = f349 + 45;
            f348 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM501 = m501();
                strM519 = m519(2 >>> (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 5 / (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 14552 / Color.argb(0, 0, 0, 1), "\ufffa\n\u0003\ufffb", false);
            } else {
                jSONObjectM501 = m501();
                strM519 = m519(5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, Color.argb(0, 0, 0, 0) + 163, "\ufffa\n\u0003\ufffb", false);
            }
            boolean zOptBoolean = jSONObjectM501.optBoolean(strM519.intern());
            int i3 = f348 + 11;
            f349 = i3 % 128;
            if (i3 % 2 != 0) {
                return zOptBoolean;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ヶ */
        public final boolean mo470() throws UnsupportedEncodingException {
            JSONObject jSONObjectM501;
            String strM523;
            int i2 = f349 + 81;
            f348 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM501 = m501();
                strM523 = m523(null, null, 28 % (ViewConfiguration.getWindowTouchSlop() + 65), "\u0088\u008b\u0089\u0088");
            } else {
                jSONObjectM501 = m501();
                strM523 = m523(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0088\u008b\u0089\u0088");
            }
            return jSONObjectM501.optBoolean(strM523.intern());
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: 丫 */
        public final List mo471() {
            f349 = (f348 + 11) % 128;
            if (this.f359 == null) {
                this.f359 = kc.m2764(m501().optJSONArray(m523(null, null, View.resolveSize(0, 0) + 127, "\u008a\u0087\u0087\u0089").intern()), new kc.b<ISAdQualityAdType>() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    public final /* synthetic */ ISAdQualityAdType mo535(JSONArray jSONArray, int i2) {
                        return ISAdQualityAdType.fromInt(jSONArray.optInt(i2));
                    }
                });
            }
            List list = this.f359;
            int i2 = f349 + 83;
            f348 = i2 % 128;
            if (i2 % 2 == 0) {
                return list;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: 乁 */
        public final long mo472() {
            f349 = (f348 + 93) % 128;
            String strM2562 = this.f371.m2562(m519((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, View.resolveSizeAndState(0, 0, 0) + 37, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 159, "\uffde\n\t\t\u0000\ufffe\u000f\n\r\ufff0\u000b\uffff￼\u000f\u0000\uffef\u0004\b\u0000\u000e\u000f￼\b\u000b\u0007\n\t\u0002\uffc9￼\uffff\f\uffc9\u0007￼\u000e\u000f", false).intern());
            long j = TextUtils.isEmpty(strM2562) ? 0L : Long.parseLong(strM2562);
            int i2 = f348 + 57;
            f349 = i2 % 128;
            if (i2 % 2 != 0) {
                return j;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: 爫 */
        public final int mo473() throws UnsupportedEncodingException {
            JSONObject jSONObjectM501;
            String strM523;
            int i2 = f349 + 61;
            f348 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM501 = m501();
                strM523 = m523(null, null, 112 % (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), "\u0087\u0086\u0088\u0084");
            } else {
                jSONObjectM501 = m501();
                strM523 = m523(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0087\u0086\u0088\u0084");
            }
            int iOptInt = jSONObjectM501.optInt(strM523.intern(), this.f375);
            f348 = (f349 + 117) % 128;
            return iOptInt;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﬤ */
        public final String mo474() {
            if (m501() == null) {
                return null;
            }
            f348 = (f349 + 73) % 128;
            String strOptString = m501().optString(m519(KeyEvent.getDeadChar(0, 0) + 2, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, 166 - View.resolveSizeAndState(0, 0, 0), "\b\ufff8\b\ufff8", true).intern());
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            f349 = (f348 + 37) % 128;
            String strM540 = m500().m540();
            f348 = (f349 + 83) % 128;
            return strM540;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: טּ */
        public final int mo475() {
            f349 = (f348 + 61) % 128;
            int iOptInt = m501().optInt(m523(null, null, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u0087\u0086\u0085\u0084").intern(), this.f374);
            f349 = (f348 + 109) % 128;
            return iOptInt;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: סּ */
        public final synchronized void mo476() {
            this.f367.removeCallbacksAndMessages(null);
            this.f367 = null;
            s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.5
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    c.m520(c.this).clear();
                    c.m524(c.this).clear();
                    c.m518(c.this, null);
                }
            });
            f348 = (f349 + 79) % 128;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ףּ */
        public final JSONObject mo477() {
            int i2 = f349 + 95;
            f348 = i2 % 128;
            if (i2 % 2 != 0) {
                m500();
                throw null;
            }
            if (m500() == null) {
                return null;
            }
            int i3 = f349 + 105;
            f348 = i3 % 128;
            if (i3 % 2 == 0) {
                return m500().m542();
            }
            int i4 = 37 / 0;
            return m500().m542();
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﭖ */
        public final aq mo478() {
            int i2 = f348;
            aq aqVar = this.f369;
            f349 = (i2 + 79) % 128;
            return aqVar;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﭴ */
        public final ap mo479() {
            int i2 = (f349 + 81) % 128;
            f348 = i2;
            ap apVar = this.f364;
            int i3 = i2 + 21;
            f349 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 23 / 0;
            }
            return apVar;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﭸ */
        public final av mo480() {
            int i2 = f349 + 123;
            f348 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.f370;
            }
            int i3 = 17 / 0;
            return this.f370;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﮉ */
        public final ar mo481() {
            int i2 = f349 + 7;
            int i3 = i2 % 128;
            f348 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            ar arVar = this.f368;
            f349 = (i3 + 103) % 128;
            return arVar;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﮌ */
        public final String mo482() {
            f348 = (f349 + 25) % 128;
            String strOptString = m501().optString(m519(ImageFormat.getBitsPerPixel(0) + 3, 3 - (Process.myTid() >> 22), 167 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0001\ufff8\t", true).intern());
            f349 = (f348 + 35) % 128;
            return strOptString;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﺙ */
        public final int mo486() {
            int iM541;
            au auVarM500 = m500();
            if (auVarM500 != null) {
                f349 = (f348 + 125) % 128;
                iM541 = auVarM500.m541();
            } else {
                iM541 = 3000;
            }
            f348 = (f349 + 21) % 128;
            return iM541;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static boolean m515(JSONObject jSONObject) {
            int i2 = f349 + 101;
            f348 = i2 % 128;
            return jSONObject.has(m523(null, null, i2 % 2 != 0 ? 62 >>> (ViewConfiguration.getMaximumFlingVelocity() >> 100) : (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "\u0088\u0087\u0093\u0089\u008c\u0087").intern());
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ at m518(c cVar, at atVar) {
            int i2 = f348;
            f349 = (i2 + 67) % 128;
            cVar.f365 = atVar;
            int i3 = i2 + 95;
            f349 = i3 % 128;
            if (i3 % 2 != 0) {
                return atVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ void m525(JSONObject jSONObject, long j) {
            f348 = (f349 + 85) % 128;
            m522(jSONObject, j);
            f348 = (f349 + 67) % 128;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﮐ */
        public final boolean mo483() {
            int i2 = f348 + 93;
            f349 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.f357;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﱟ */
        public final double mo484() {
            JSONObject jSONObjectM501;
            String strM519;
            int i2 = f349 + 61;
            f348 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM501 = m501();
                strM519 = m519(TextUtils.indexOf((CharSequence) "", 'O') * 3, 4 / TextUtils.indexOf("", ""), 2363 / ExpandableListView.getPackedPositionGroup(1L), "\ufffe\ufffa\u0005\u0003", true);
            } else {
                jSONObjectM501 = m501();
                strM519 = m519(2 - TextUtils.indexOf((CharSequence) "", '0'), 4 - TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionGroup(0L) + 165, "\ufffe\ufffa\u0005\u0003", false);
            }
            return jSONObjectM501.optDouble(strM519.intern(), 1.0d);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﱡ */
        public final double mo485() {
            JSONObject jSONObjectM501;
            String strM519;
            int i2 = f348 + 51;
            f349 = i2 % 128;
            if (i2 % 2 == 0) {
                jSONObjectM501 = m501();
                strM519 = m519(2 >>> (ViewConfiguration.getKeyRepeatDelay() % 41), 3 % TextUtils.indexOf("", ""), 5911 / (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\ufff8\u0007\u0003", true);
            } else {
                jSONObjectM501 = m501();
                strM519 = m519(2 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 3 - TextUtils.indexOf("", ""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 166, "\ufff8\u0007\u0003", true);
            }
            return jSONObjectM501.optDouble(strM519.intern(), 5.0d);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﻏ */
        public final synchronized boolean mo487() {
            boolean z2;
            int i2 = f348;
            int i3 = i2 + 57;
            f349 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            z2 = this.f356;
            f349 = (i2 + 23) % 128;
            return z2;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final synchronized void m529(boolean z2) {
            int i2 = f348 + 91;
            f349 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f356 = z2;
                throw null;
            }
            this.f356 = z2;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﾇ */
        public final void mo496(ix ixVar) {
            f348 = (f349 + 99) % 128;
            m500().m545(ixVar);
            int i2 = f349 + 11;
            f348 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private aw m513(String str) {
            f349 = (f348 + 79) % 128;
            if (str == null) {
                return null;
            }
            aw awVar = mo493().get(str);
            f348 = (f349 + 115) % 128;
            return awVar;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﻛ */
        public final void mo489(JSONObject jSONObject) {
            int i2 = f348 + 11;
            f349 = i2 % 128;
            if (i2 % 2 != 0) {
                mo503(jSONObject);
                m507();
            } else {
                mo503(jSONObject);
                m507();
                throw null;
            }
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as.AnonymousClass3
        /* JADX INFO: renamed from: ｋ */
        public final synchronized void mo503(JSONObject jSONObject) {
            try {
                if (m515(jSONObject)) {
                    m521(jSONObject);
                    f348 = (f349 + 81) % 128;
                }
                super.mo503(jSONObject);
                this.f370.mo503(jSONObject);
                this.f368.mo503(jSONObject);
                this.f369.mo503(jSONObject);
                this.f364.mo503(jSONObject);
                int i2 = f348 + 95;
                f349 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﾇ */
        public final void mo494(final Context context, final ao aoVar, boolean z2) {
            f349 = (f348 + 41) % 128;
            if (z2) {
                s.m2918(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.3
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        if (!c.this.m527().m2471().m2507()) {
                            c.m517(c.this).mo505();
                        } else {
                            if (c.this.mo487()) {
                                return;
                            }
                            c.m517(c.this).mo504();
                        }
                    }
                }, as.m467().mo475());
            }
            m529(false);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = new jr(context, aoVar, mo472()).mo285(new JSONObject(), m527().m2471().m2507(), true, false);
            } catch (JSONException e2) {
                n.m2832(m523(null, null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0085\u0093\u0092\u0091\u0090\u0096\u0081\u0087\u0090\u0082\u0081\u0095").intern(), m519((ViewConfiguration.getLongPressTimeout() >> 16) + 4, KeyEvent.normalizeMetaState(0) + 25, 154 - TextUtils.getOffsetAfter("", 0), "\u0016\u0005\u000e\u0014￥\u0012\u0012\u000f\u0012\uffc0\u0003\u0012\u0005\u0001\u0014\t\u000e\u0007\uffc0\u0002\u0001\u0013\u0005\uffc0\u0005", false).intern(), e2);
            }
            m527().m2472(this.f360.m404(m519(-MotionEvent.axisFromString(""), Color.green(0) + 4, 168 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "￼\u0007￼\u0001", true).intern()), jSONObject, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.2

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static int f377 = 1;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f378 = 0;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static int f379 = 154;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static char[] f380 = {'~', 252, 240, 239, 253, 258, 261, 256, 232, 237, 258, 254, 'n', 221, 221, '7', 'j', 'g', 'h', 'J', 'H', 'b', 'b', 'e', 'f', 'k', 'j', 'i', 'M', 153, '1', 'A', 'C', 'j', 'k', 'n', 't', 'l', 'f', 'C', 'I', 'p', 'p', 'r', AbstractJsonLexerKt.BEGIN_LIST, '2', '-', 'V', 'k', 'm', 't', 'k', 'l', 'I', 'F', 'n', 'p', 'l', 'C', 'C', 'h', 'g', 'j', 'n'};

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m531(int i2, int i3, int i4, String str, boolean z3) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (com.p004ironsource.adqualitysdk.sdk.i.b.f672) {
                        try {
                            char[] cArr2 = new char[i3];
                            com.p004ironsource.adqualitysdk.sdk.i.b.f673 = 0;
                            while (true) {
                                int i5 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                                if (i5 >= i3) {
                                    break;
                                }
                                com.p004ironsource.adqualitysdk.sdk.i.b.f671 = cArr[i5];
                                cArr2[com.p004ironsource.adqualitysdk.sdk.i.b.f673] = (char) (com.p004ironsource.adqualitysdk.sdk.i.b.f671 + i4);
                                int i6 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                                cArr2[i6] = (char) (cArr2[i6] - f379);
                                com.p004ironsource.adqualitysdk.sdk.i.b.f673 = i6 + 1;
                            }
                            if (i2 > 0) {
                                com.p004ironsource.adqualitysdk.sdk.i.b.f674 = i2;
                                char[] cArr3 = new char[i3];
                                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                                int i7 = com.p004ironsource.adqualitysdk.sdk.i.b.f674;
                                System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                                int i8 = com.p004ironsource.adqualitysdk.sdk.i.b.f674;
                                System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                            }
                            if (z3) {
                                char[] cArr4 = new char[i3];
                                com.p004ironsource.adqualitysdk.sdk.i.b.f673 = 0;
                                while (true) {
                                    int i9 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                                    if (i9 >= i3) {
                                        break;
                                    }
                                    cArr4[i9] = cArr2[(i3 - i9) - 1];
                                    com.p004ironsource.adqualitysdk.sdk.i.b.f673 = i9 + 1;
                                }
                                cArr2 = cArr4;
                            }
                            str2 = new String(cArr2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return str2;
                }

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private void m533(int i2) {
                    synchronized (c.this) {
                        try {
                            if (c.m510(c.this) != null) {
                                s.m2920(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.2.1
                                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo276() {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        c.this.mo494(context, aoVar, false);
                                    }
                                }, i2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:13:0x004d A[PHI: r2 r13
  0x004d: PHI (r2v10 int) = (r2v4 int), (r2v14 int) binds: [B:6:0x002c, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v10 java.lang.String) binds: [B:6:0x002c, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:15:0x0051  */
                /* JADX WARN: Code duplicated, block: B:16:0x0052 A[Catch: Exception -> 0x017b, TRY_LEAVE, TryCatch #0 {Exception -> 0x017b, blocks: (B:24:0x0182, B:16:0x0052, B:21:0x0096, B:11:0x0039), top: B:29:0x0039 }] */
                /* JADX WARN: Code duplicated, block: B:18:0x007f  */
                @Override // com.p004ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻛ */
                public final void mo381(iu iuVar) {
                    int iM2450;
                    String strM2451;
                    int i2;
                    int i3;
                    int i4;
                    Exception e3;
                    JSONObject jSONObjectM2446;
                    int i5 = f378 + 125;
                    f377 = i5 % 128;
                    if (i5 % 2 == 0) {
                        try {
                            iM2450 = iuVar.m2449().m2450();
                            strM2451 = iuVar.m2449().m2451();
                            if (iM2450 >= 11037) {
                                if (iM2450 > 299) {
                                    jSONObjectM2446 = iuVar.m2446();
                                    if (jSONObjectM2446.optBoolean(m531((ViewConfiguration.getPressedStateDuration() >> 16) + 2, 2 - TextUtils.lastIndexOf("", '0'), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 260, "\ufff9\b\u0001", true).intern())) {
                                        f377 = (f378 + 69) % 128;
                                        r.m2874().m2904();
                                        f377 = (f378 + 35) % 128;
                                    }
                                    n.m2845(m532(false, new int[]{0, 12, 148, 2}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern(), m531((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, 28 - TextUtils.lastIndexOf("", '0', 0), 253 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "ﾽ\u000f\u0002\u0000\u0002\u0006\u0013\u0002\u0001ﾽ\u0000\f\u000b\u0003\u0006\u0004ￗ\ufff0\u0012\u0000\u0000\u0002\u0010\u0010\u0003\u0012\t\t\u0016", false).intern(), jSONObjectM2446);
                                    JSONObject jSONObjectM2767 = kc.m2767(jSONObjectM2446);
                                    c.this.m530(jSONObjectM2767.optLong(m531(2 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, 263 - View.MeasureSpec.getMode(0), "\u0007\u0006\uffff\ufff6", false).intern(), 0L));
                                    jSONObjectM2767.remove(m532(true, new int[]{12, 3, 106, 0}, "\u0001\u0001\u0001").intern());
                                    c.m516(c.this).m2560(m532(false, new int[]{15, 13, 0, 10}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000").intern(), jSONObjectM2767.toString(), null);
                                    jSONObjectM2446.put(m532(false, new int[]{28, 2, 38, 2}, "\u0000\u0001").intern(), ju.m2666());
                                    jSONObjectM2446.put(m531(3 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2 - Color.red(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 270, "\u0000\u0001", true).intern(), ju.m2665());
                                    c.m525(jSONObjectM2446, iuVar.m2447());
                                    c.this.mo503(jSONObjectM2446);
                                    c.m514(c.this);
                                    m533(c.this.m526());
                                    return;
                                }
                            }
                            mo382(iuVar, strM2451);
                        } catch (Exception e4) {
                            e3 = e4;
                            i3 = 2;
                            i4 = 148;
                            i2 = 12;
                            kb.m2746(m532(false, new int[]{0, i2, i4, i3}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern(), m531(10 - TextUtils.getOffsetAfter("", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 252, "\u0012\u0011\u0000\u000f\uffbf\u0011\u000e\u0011\u0011￤\r\u000e\u0012\t\uffbf\u0006\b\u0005\r\u000e\u0002\uffbf\u0004\u0013\u000e\f\u0004\u0011\uffbf\u0006\r\b", true).intern(), e3, false, true);
                        }
                    } else {
                        try {
                            iM2450 = iuVar.m2449().m2450();
                            strM2451 = iuVar.m2449().m2451();
                            if (iM2450 >= 200) {
                                if (iM2450 > 299) {
                                    jSONObjectM2446 = iuVar.m2446();
                                    if (jSONObjectM2446.optBoolean(m531((ViewConfiguration.getPressedStateDuration() >> 16) + 2, 2 - TextUtils.lastIndexOf("", '0'), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 260, "\ufff9\b\u0001", true).intern())) {
                                        f377 = (f378 + 69) % 128;
                                        r.m2874().m2904();
                                        f377 = (f378 + 35) % 128;
                                    }
                                    n.m2845(m532(false, new int[]{0, 12, 148, 2}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern(), m531((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, 28 - TextUtils.lastIndexOf("", '0', 0), 253 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "ﾽ\u000f\u0002\u0000\u0002\u0006\u0013\u0002\u0001ﾽ\u0000\f\u000b\u0003\u0006\u0004ￗ\ufff0\u0012\u0000\u0000\u0002\u0010\u0010\u0003\u0012\t\t\u0016", false).intern(), jSONObjectM2446);
                                    JSONObject jSONObjectM2768 = kc.m2767(jSONObjectM2446);
                                    c.this.m530(jSONObjectM2768.optLong(m531(2 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, 263 - View.MeasureSpec.getMode(0), "\u0007\u0006\uffff\ufff6", false).intern(), 0L));
                                    jSONObjectM2768.remove(m532(true, new int[]{12, 3, 106, 0}, "\u0001\u0001\u0001").intern());
                                    c.m516(c.this).m2560(m532(false, new int[]{15, 13, 0, 10}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000").intern(), jSONObjectM2768.toString(), null);
                                    jSONObjectM2446.put(m532(false, new int[]{28, 2, 38, 2}, "\u0000\u0001").intern(), ju.m2666());
                                    jSONObjectM2446.put(m531(3 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2 - Color.red(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 270, "\u0000\u0001", true).intern(), ju.m2665());
                                    c.m525(jSONObjectM2446, iuVar.m2447());
                                    c.this.mo503(jSONObjectM2446);
                                    c.m514(c.this);
                                    m533(c.this.m526());
                                    return;
                                }
                            }
                            mo382(iuVar, strM2451);
                        } catch (Exception e5) {
                            e3 = e5;
                            i4 = 148;
                            i3 = 2;
                            i2 = 12;
                            kb.m2746(m532(false, new int[]{0, i2, i4, i3}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern(), m531(10 - TextUtils.getOffsetAfter("", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 252, "\u0012\u0011\u0000\u000f\uffbf\u0011\u000e\u0011\u0011￤\r\u000e\u0012\t\uffbf\u0006\b\u0005\r\u000e\u0002\uffbf\u0004\u0013\u000e\f\u0004\u0011\uffbf\u0006\r\b", true).intern(), e3, false, true);
                        }
                    }
                }

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static String m532(boolean z3, int[] iArr, String str) throws UnsupportedEncodingException {
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
                            System.arraycopy(f380, i2, cArr, 0, i3);
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
                            str2 = new String(cArr);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return str2;
                }

                @Override // com.p004ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻛ */
                public final void mo382(iu iuVar, String str) {
                    int iM2450;
                    if (iuVar != null) {
                        iM2450 = iuVar.m2449().m2450();
                        f377 = (f378 + 7) % 128;
                    } else {
                        f378 = (f377 + 3) % 128;
                        iM2450 = -1;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(m532(true, new int[]{30, 34, 0, 15}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001").intern());
                    sb.append(iM2450);
                    n.m2828(m532(false, new int[]{0, 12, 148, 2}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern(), sb.toString());
                    if (iM2450 == 403 || c.m509(c.this) >= c.m512(c.this)) {
                        return;
                    }
                    m533(c.this.m528());
                    f377 = (f378 + 13) % 128;
                }
            });
            f348 = (f349 + 73) % 128;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﾒ */
        public final void mo498(Context context, iw iwVar, aj ajVar, b bVar, boolean z2) {
            this.f371 = new je(context, m523(null, null, 126 - Process.getGidForName(""), "\u0085\u0093\u0092\u0091\u0090\u0084\u0081\u0087\u0090\u0082\u0081\u008c\u008e\u008a\u0083\u008e\u008f\u008d\u008e\u008d\u0084\u0089\u008a\u0081\u0084\u0089\u008c\u0087").intern(), m519((-16777202) - Color.rgb(0, 0, 0), (-16777196) - Color.rgb(0, 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + ModuleDescriptor.MODULE_VERSION, "ￋ\u0011\u0003\u0001\u0010\u0003\u0012ￋￒ\u0010\u0001\r\f\u0004\u0011\r\r\u000b\n\uffff", false).intern());
            this.f366 = iwVar;
            this.f356 = false;
            this.f357 = z2;
            this.f360 = ajVar;
            this.f367 = new Handler(Looper.getMainLooper());
            au auVar = new au();
            this.f370 = new av(auVar);
            this.f368 = new ar(auVar);
            this.f369 = new aq(auVar);
            this.f364 = new ap();
            mo503(m508());
            m502(auVar);
            this.f363 = bVar;
            this.f361 = new ArrayList();
            this.f362 = new ArrayList();
            int i2 = f348 + 11;
            f349 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﻛ */
        public final void mo488(final at atVar) {
            f349 = (f348 + 111) % 128;
            Handler handler = this.f367;
            if (handler != null) {
                handler.post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.8
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        c.m518(c.this, atVar);
                        if (c.this.mo487()) {
                            atVar.mo319();
                        }
                    }
                });
                f348 = (f349 + 17) % 128;
            }
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﻛ */
        public final boolean mo490() {
            JSONObject jSONObjectM501;
            int windowTouchSlop;
            int i2 = f348 + 55;
            f349 = i2 % 128;
            if (i2 % 2 == 0) {
                jSONObjectM501 = m501();
                windowTouchSlop = 6 >>> (ViewConfiguration.getWindowTouchSlop() >> 74);
            } else {
                jSONObjectM501 = m501();
                windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 127;
            }
            return jSONObjectM501.optBoolean(m523(null, null, windowTouchSlop, "\u0088\u0092\u0081").intern(), false);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ｋ */
        public final boolean mo492() {
            int i2 = f348 + 121;
            f349 = i2 % 128;
            boolean zOptBoolean = i2 % 2 == 0 ? m501().optBoolean(m523(null, null, 11 / Color.red(0), "\u0081\u0083\u008c").intern(), false) : m501().optBoolean(m523(null, null, 127 - Color.red(0), "\u0081\u0083\u008c").intern(), true);
            int i3 = f348 + 37;
            f349 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 64 / 0;
            }
            return zOptBoolean;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﻛ */
        public final boolean mo491(String str, String str2) {
            f349 = (f348 + 75) % 128;
            aw awVarM513 = m513(str);
            if (awVarM513 != null) {
                f348 = (f349 + 37) % 128;
                if (awVarM513.m564(str2)) {
                    return false;
                }
            }
            int i2 = f348 + 105;
            f349 = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﾇ */
        public final void mo495(final at atVar) {
            int i2 = f348 + 105;
            f349 = i2 % 128;
            if (i2 % 2 != 0) {
                Handler handler = this.f367;
                if (handler != null) {
                    handler.post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.4
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            c.m524(c.this).add(atVar);
                            if (c.this.mo487()) {
                                atVar.mo319();
                            }
                        }
                    });
                    f349 = (f348 + 93) % 128;
                    return;
                }
                return;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﾇ */
        public final Map<String, aw> mo493() {
            Map<String, aw> map = new HashMap<>();
            try {
                String strOptString = m501().optString(m523(null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0088\u0084\u0083").intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    map = kc.m2765(new JSONObject(strOptString), new kc.c<aw>() { // from class: com.ironsource.adqualitysdk.sdk.i.as.c.6
                        @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        public final /* synthetic */ aw mo534(JSONObject jSONObject, String str) {
                            return new aw(jSONObject.optJSONObject(str));
                        }
                    });
                }
            } catch (JSONException e2) {
                kb.m2752(m523(null, null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0085\u0093\u0092\u0091\u0090\u0096\u0081\u0087\u0090\u0082\u0081\u0095").intern(), m519(27 - (KeyEvent.getMaxKeyCode() >> 16), 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + ModuleDescriptor.MODULE_VERSION, "\u0011\u0007￢\r\ufff2\u0011\u0010\r\u0012\u0001\u0003\f\f\r￡\u0012\u0003\u0005ﾾ\f\u0007ﾾ\u0010\r\u0010\u0010￣\u0003\n\u0000\uffff", true).intern(), (Throwable) e2, false);
            }
            int i2 = f349 + 113;
            f348 = i2 % 128;
            if (i2 % 2 == 0) {
                return map;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﾒ */
        public final boolean mo499() {
            f348 = (f349 + 7) % 128;
            boolean zOptBoolean = m501().optBoolean(m519(ExpandableListView.getPackedPositionType(0L) + 3, TextUtils.indexOf("", "") + 4, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 161, "￼\uffff\u000b\ufffa", true).intern(), true);
            int i2 = f348 + 93;
            f349 = i2 % 128;
            if (i2 % 2 != 0) {
                return zOptBoolean;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.as
        /* JADX INFO: renamed from: ﾒ */
        public final String mo497(String str) {
            f348 = (f349 + 109) % 128;
            aw awVarM513 = m513(str);
            if (awVarM513 == null) {
                return null;
            }
            String strM563 = awVarM513.m563();
            int i2 = f348 + 41;
            f349 = i2 % 128;
            if (i2 % 2 != 0) {
                return strM563;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static void m522(JSONObject jSONObject, long j) {
            f348 = (f349 + 13) % 128;
            if (jSONObject.has(m519(Process.getGidForName("") + 3, View.resolveSizeAndState(0, 0, 0) + 3, (-16777043) - Color.rgb(0, 0, 0), "\u0001\u0000\u0000", false).intern())) {
                try {
                    jSONObject.put(m519(1 - TextUtils.lastIndexOf("", '0', 0, 0), 3 - TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionGroup(0L) + TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, "\u0001\u0000\u0000", false).intern(), jSONObject.optLong(m519(1 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2, 173 - TextUtils.indexOf("", "", 0), "\u0001\u0000\u0000", false).intern()) + (j / 2));
                    return;
                } catch (JSONException unused) {
                }
            }
            f348 = (f349 + 23) % 128;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m523(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f352;
                    int i3 = f353;
                    if (f350) {
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
                    if (f351) {
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
        public final void m530(long j) {
            if (this.f355) {
                return;
            }
            f348 = (f349 + 13) % 128;
            this.f371.m2564(m519((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, 37 - TextUtils.indexOf("", ""), 158 - TextUtils.lastIndexOf("", '0', 0, 0), "\uffde\n\t\t\u0000\ufffe\u000f\n\r\ufff0\u000b\uffff￼\u000f\u0000\uffef\u0004\b\u0000\u000e\u000f￼\b\u000b\u0007\n\t\u0002\uffc9￼\uffff\f\uffc9\u0007￼\u000e\u000f", false).intern(), String.valueOf(j));
            this.f355 = true;
            f349 = (f348 + 73) % 128;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static void m521(JSONObject jSONObject) {
            int i2 = f349 + 93;
            f348 = i2 % 128;
            kc.m2759(jSONObject, jSONObject.optJSONObject(m523(null, null, i2 % 2 != 0 ? 118 - (ViewConfiguration.getDoubleTapTimeout() + 21) : 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0088\u0087\u0093\u0089\u008c\u0087").intern()));
            int i3 = f349 + 109;
            f348 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 1 / 0;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m519(int i2, int i3, int i4, String str, boolean z2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (com.p004ironsource.adqualitysdk.sdk.i.b.f672) {
                try {
                    char[] cArr2 = new char[i3];
                    com.p004ironsource.adqualitysdk.sdk.i.b.f673 = 0;
                    while (true) {
                        int i5 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                        if (i5 >= i3) {
                            break;
                        }
                        com.p004ironsource.adqualitysdk.sdk.i.b.f671 = cArr[i5];
                        cArr2[com.p004ironsource.adqualitysdk.sdk.i.b.f673] = (char) (com.p004ironsource.adqualitysdk.sdk.i.b.f671 + i4);
                        int i6 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                        cArr2[i6] = (char) (cArr2[i6] - f354);
                        com.p004ironsource.adqualitysdk.sdk.i.b.f673 = i6 + 1;
                    }
                    if (i2 > 0) {
                        com.p004ironsource.adqualitysdk.sdk.i.b.f674 = i2;
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr2, 0, cArr3, 0, i3);
                        int i7 = com.p004ironsource.adqualitysdk.sdk.i.b.f674;
                        System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                        int i8 = com.p004ironsource.adqualitysdk.sdk.i.b.f674;
                        System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                    }
                    if (z2) {
                        char[] cArr4 = new char[i3];
                        com.p004ironsource.adqualitysdk.sdk.i.b.f673 = 0;
                        while (true) {
                            int i9 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                            if (i9 >= i3) {
                                break;
                            }
                            cArr4[i9] = cArr2[(i3 - i9) - 1];
                            com.p004ironsource.adqualitysdk.sdk.i.b.f673 = i9 + 1;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    public /* synthetic */ as(byte b2) {
        this();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized as m467() {
        try {
            if (f345 == null) {
                f345 = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f345;
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public abstract int mo468();

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public abstract boolean mo469();

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public abstract boolean mo470();

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public abstract List mo471();

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public abstract long mo472();

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public abstract int mo473();

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public abstract String mo474();

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public abstract int mo475();

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public abstract void mo476();

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public abstract JSONObject mo477();

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public abstract aq mo478();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public abstract ap mo479();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public abstract av mo480();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public abstract ar mo481();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public abstract String mo482();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public abstract boolean mo483();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public abstract double mo484();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public abstract double mo485();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public abstract int mo486();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public abstract boolean mo487();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo488(at atVar);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo489(JSONObject jSONObject);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo490();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo491(String str, String str2);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract boolean mo492();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract Map<String, aw> mo493();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo494(Context context, ao aoVar, boolean z2);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo495(at atVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo496(ix ixVar);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract String mo497(String str);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo498(Context context, iw iwVar, aj ajVar, b bVar, boolean z2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo499();

    private as() {
    }
}
