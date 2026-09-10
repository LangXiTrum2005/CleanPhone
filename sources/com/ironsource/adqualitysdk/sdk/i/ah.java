package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ah extends ka {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f149 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f151;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f153;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Handler f154;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f155;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private int f156;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f157;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f152 = {18715, 43047, 35613, 59919, 52591, 11377, 3905, 28348, 16817, 41140, 33682, 58094, 50640, 9433, 1559, 31010, 22532, 47996, 39550, 64850, 56402, 16314, 7818, 24095, 48907, 39993, 'd', 57703, 49749, 's', 57702, 49743, 41821, 55635, 14426, 7010, 60837, 3243, 12189};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f148 = 5499615291181359379L;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f150 = 4741201730987580008L;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface d {
        void onEventGenerated(JSONObject jSONObject);
    }

    public ah(Context context, as asVar, int i10, String str, long j10) {
        super(context, asVar, j10);
        this.f156 = i10;
        this.f153 = 0;
        this.f155 = 1;
        this.f157 = str;
        HandlerThread handlerThread = new HandlerThread(m321((char) (TextUtils.getOffsetAfter("", 0) + 18778), Process.getGidForName("") + 1, 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        handlerThread.start();
        this.f154 = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ int m318(ah ahVar) {
        int i10 = f149;
        f151 = (i10 + 29) % 128;
        int i11 = ahVar.f155;
        f151 = (i10 + 5) % 128;
        return i11;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ int m319(ah ahVar) {
        int i10 = f151 + 51;
        f149 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = ahVar.f153;
            ahVar.f153 = i11;
            return i11;
        }
        int i12 = ahVar.f153;
        ahVar.f153 = i12 + 1;
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return r3.f153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3.f153 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3.f153 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ah.f149 = (r1 + 95) % 128;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m320() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ah.f149
            int r0 = r0 + 41
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ah.f151 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L15
            int r0 = r3.f153
            r2 = 67
            int r2 = r2 / 0
            if (r0 != 0) goto L21
            goto L19
        L15:
            int r0 = r3.f153
            if (r0 != 0) goto L21
        L19:
            int r1 = r1 + 95
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ah.f149 = r1
            r3 = 1
            return r3
        L21:
            int r3 = r3.f153
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ah.m320():int");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ int m324(ah ahVar) {
        int i10;
        int i11;
        int i12 = f151 + 69;
        f149 = i12 % 128;
        if (i12 % 2 == 0) {
            i10 = ahVar.f155;
            i11 = i10 % 1;
        } else {
            i10 = ahVar.f155;
            i11 = i10 + 1;
        }
        ahVar.f155 = i11;
        return i10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m327(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final boolean z10, final d dVar) throws Throwable {
        try {
            try {
                this.f154.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.5

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static char[] f167 = {'C', 133, 'z', '|', 127, 127, 134, '|', '|', 134, '}', '|', 134, '2', 'i', 'g', 'g', '5', 'o', ':', 's', 'i', 'b', 'd', 'c', 'a', 'b', 'g', '[', 182, 182, 177, 'z', 249, 255, 253, 242, 239, 246};

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f168 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static int f169 = 1;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m329(String str2, int[] iArr, boolean z11) throws UnsupportedEncodingException {
                        String str3;
                        Object bytes = str2;
                        if (str2 != null) {
                            bytes = str2.getBytes("ISO-8859-1");
                        }
                        byte[] bArr = (byte[]) bytes;
                        synchronized (h.f2261) {
                            try {
                                int i10 = iArr[0];
                                int i11 = iArr[1];
                                int i12 = iArr[2];
                                int i13 = iArr[3];
                                char[] cArr = new char[i11];
                                System.arraycopy(f167, i10, cArr, 0, i11);
                                if (bArr != null) {
                                    char[] cArr2 = new char[i11];
                                    h.f2262 = 0;
                                    char c4 = 0;
                                    while (true) {
                                        int i14 = h.f2262;
                                        if (i14 >= i11) {
                                            break;
                                        }
                                        if (bArr[i14] == 1) {
                                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                                        } else {
                                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                                        }
                                        c4 = cArr2[i14];
                                        h.f2262 = i14 + 1;
                                    }
                                    cArr = cArr2;
                                }
                                if (i13 > 0) {
                                    char[] cArr3 = new char[i11];
                                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                                    int i15 = i11 - i13;
                                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                                }
                                if (z11) {
                                    char[] cArr4 = new char[i11];
                                    h.f2262 = 0;
                                    while (true) {
                                        int i16 = h.f2262;
                                        if (i16 >= i11) {
                                            break;
                                        }
                                        cArr4[i16] = cArr[(i11 - i16) - 1];
                                        h.f2262 = i16 + 1;
                                    }
                                    cArr = cArr4;
                                }
                                if (i12 > 0) {
                                    h.f2262 = 0;
                                    while (true) {
                                        int i17 = h.f2262;
                                        if (i17 >= i11) {
                                            break;
                                        }
                                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                                        h.f2262 = i17 + 1;
                                    }
                                }
                                str3 = new String(cArr);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str3;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() throws Exception {
                        if (str.equals(m329("\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 13, 19, 0}, false).intern())) {
                            int i10 = f168 + 77;
                            f169 = i10 % 128;
                            if (i10 % 2 == 0) {
                                ah.m319(ah.this);
                                throw null;
                            }
                            ah.m319(ah.this);
                        }
                        int iM318 = ah.m318(ah.this);
                        ah.m324(ah.this);
                        JSONObject jSONObjectM2855 = kj.m2855(jSONObject);
                        jSONObjectM2855.put(m329("\u0001\u0001\u0001\u0000", new int[]{13, 4, 0, 1}, false).intern(), str);
                        jSONObjectM2855.put(m329("\u0001\u0001", new int[]{17, 2, 6, 1}, true).intern(), iM318);
                        String strIntern = m329("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{19, 9, 0, 0}, false).intern();
                        JSONObject jSONObject3 = jSONObject2;
                        if (jSONObject3 != null) {
                            strIntern = jSONObject3.optString(is.f2612);
                            String str2 = is.f2566;
                            jSONObjectM2855.put(str2, jSONObject2.optString(str2, null));
                        }
                        if (TextUtils.isEmpty(strIntern)) {
                            f168 = (f169 + 11) % 128;
                            strIntern = m329("\u0000\u0001\u0001\u0001", new int[]{28, 4, 72, 0}, false).intern();
                            f168 = (f169 + 17) % 128;
                        }
                        jSONObjectM2855.put(is.f2610, strIntern);
                        if (!jSONObjectM2855.has(is.f2609)) {
                            jSONObjectM2855.put(is.f2609, strIntern);
                        }
                        final JSONObject jSONObjectMo326 = ah.this.mo326(jSONObjectM2855, z10, true, str.equals(m329("\u0000\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{32, 7, 139, 2}, false).intern()));
                        p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.5.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* JADX INFO: renamed from: ｋ */
                            public final void mo254() {
                                dVar.onEventGenerated(jSONObjectMo326);
                            }
                        });
                    }
                });
                f151 = (f149 + InterfaceC0435l1.d.b.f29105b) % 128;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ka
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject mo326(JSONObject jSONObject, boolean z10, boolean z11, boolean z12) throws JSONException {
        long jM2803;
        long jM2801;
        synchronized (this) {
            jM2803 = ke.m2803();
            jM2801 = ke.m2801();
        }
        JSONObject jSONObjectMo326 = super.mo326(jSONObject, z10, z11, z12);
        try {
            long jOptLong = jSONObjectMo326.optLong(is.f2604);
            jSONObjectMo326.remove(is.f2604);
            if (jOptLong != 0) {
                long j10 = jM2801 - (jM2803 - jOptLong);
                jSONObjectMo326.put(m321((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 24171), Color.green(0) + 23, 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), jM2803);
                jSONObjectMo326.put(m322("煞춘浑焭㨩鞅\ud9f5", Drawable.resolveOpacity(0, 0)).intern(), jM2801);
                jM2803 = jOptLong;
                jM2801 = j10;
            }
            jSONObjectMo326.put(m321((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 3 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), jM2803);
            jSONObjectMo326.put(m322("擲齂쯮撇撈앞", View.resolveSizeAndState(0, 0, 0)).intern(), jM2801);
            jSONObjectMo326.put(m321((char) ('0' - AndroidCharacter.getMirror('0')), Drawable.resolveOpacity(0, 0) + 29, 4 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), this.f157);
            jSONObjectMo326.put(m321((char) (55584 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), KeyEvent.keyCodeFromString("") + 33, 4 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), this.f156);
            jSONObjectMo326.put(m321((char) (60886 - KeyEvent.normalizeMetaState(0)), 36 - View.resolveSizeAndState(0, 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 4).intern(), m320());
            if (ar.m468().mo473()) {
                jSONObjectMo326.put(m322("㧣ῦᖵ㦀ࠐ䗽ꄉ\u074c", TextUtils.getTrimmedLength("")).intern(), true);
            }
            ao aoVarMo483 = ar.m468().mo483();
            if (aoVarMo483 != null) {
                String strM447 = aoVarMo483.m447();
                if (!TextUtils.isEmpty(strM447)) {
                    jSONObjectMo326.put(m322("\udff1䘈ᥬ\udf94鉅ᰔ귈", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern(), strM447);
                }
            }
            if (z11) {
                m323(jSONObjectMo326);
            }
            return jSONObjectMo326;
        } catch (JSONException e10) {
            m.m2983(m321((char) (Color.alpha(0) + 18778), Color.rgb(0, 0, 0) + 16777216, 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m322("︁楎滶﹄젗㍔\uda54은韓굦烥낽ⴤ䒇\ue692⨆슏﹡齦葪壷槃㗈緛\uee6cΣꩲ휮", ViewConfiguration.getWindowTouchSlop() >> 8).intern(), e10);
            return jSONObjectMo326;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m325(final JSONArray jSONArray, final boolean z10, final d dVar) {
        this.f154.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.2

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f158 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f159 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f160 = {'7', 'i', 'm', 'm', 'l', 's', ' ', 'W', 'g', 'f', 'r', 'v', 'n', 'f', 'k', '\\', ']', 'm', 'i', 'q', ']', 'V', 'i', 'i', 'k', 'i', 'j', 'q', 'p', '0', 'j', 'l', 'Y', '`', 'q', 'i', 'm', 'm', 'B', 'C', 'j', 'k', 'n', 'j', 'c', 'k', 'j', 'A', 'I', 'p', 'p', 'r', '['};

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() throws Exception {
                f158 = (f159 + 71) % 128;
                final JSONObject jSONObjectMo326 = ah.this.mo326(null, z10, false, false);
                try {
                    jSONObjectMo326.put(m328("\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{0, 6, 0, 4}, true).intern(), jSONArray);
                } catch (JSONException e10) {
                    m.m2983(m328("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{6, 23, 0, 0}, false).intern(), m328("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{29, 24, 0, 24}, true).intern(), e10);
                }
                p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.2.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        dVar.onEventGenerated(jSONObjectMo326);
                    }
                });
                int i10 = f159 + 93;
                f158 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 4 / 0;
                }
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m328(String str, int[] iArr, boolean z11) throws UnsupportedEncodingException {
                String str2;
                Object bytes = str;
                if (str != null) {
                    bytes = str.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                synchronized (h.f2261) {
                    try {
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int i12 = iArr[2];
                        int i13 = iArr[3];
                        char[] cArr = new char[i11];
                        System.arraycopy(f160, i10, cArr, 0, i11);
                        if (bArr != null) {
                            char[] cArr2 = new char[i11];
                            h.f2262 = 0;
                            char c4 = 0;
                            while (true) {
                                int i14 = h.f2262;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (bArr[i14] == 1) {
                                    cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                                } else {
                                    cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                                }
                                c4 = cArr2[i14];
                                h.f2262 = i14 + 1;
                            }
                            cArr = cArr2;
                        }
                        if (i13 > 0) {
                            char[] cArr3 = new char[i11];
                            System.arraycopy(cArr, 0, cArr3, 0, i11);
                            int i15 = i11 - i13;
                            System.arraycopy(cArr3, 0, cArr, i15, i13);
                            System.arraycopy(cArr3, i13, cArr, 0, i15);
                        }
                        if (z11) {
                            char[] cArr4 = new char[i11];
                            h.f2262 = 0;
                            while (true) {
                                int i16 = h.f2262;
                                if (i16 >= i11) {
                                    break;
                                }
                                cArr4[i16] = cArr[(i11 - i16) - 1];
                                h.f2262 = i16 + 1;
                            }
                            cArr = cArr4;
                        }
                        if (i12 > 0) {
                            h.f2262 = 0;
                            while (true) {
                                int i17 = h.f2262;
                                if (i17 >= i11) {
                                    break;
                                }
                                cArr[i17] = (char) (cArr[i17] - iArr[2]);
                                h.f2262 = i17 + 1;
                            }
                        }
                        str2 = new String(cArr);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        });
        f149 = (f151 + InterfaceC0435l1.d.b.f29114k) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m323(JSONObject jSONObject) {
        JSONObject jSONObjectM2864;
        String strM322;
        int i10 = f151 + 33;
        f149 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                it itVarM2730 = jq.m2720().m2730();
                jSONObjectM2864 = kj.m2864(itVarM2730.m2554(), itVarM2730.m2553(), itVarM2730.m2555(), itVarM2730.m2552());
                strM322 = m322("⃓稟ꖒ₿飧‖ᄱ鞫䤧빸뮗\ue05c\uf3fb", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)));
            } else {
                it itVarM2731 = jq.m2720().m2730();
                jSONObjectM2864 = kj.m2864(itVarM2731.m2554(), itVarM2731.m2553(), itVarM2731.m2555(), itVarM2731.m2552());
                strM322 = m322("⃓稟ꖒ₿飧‖ᄱ鞫䤧빸뮗\ue05c\uf3fb", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)));
            }
            jSONObject.put(strM322.intern(), jSONObjectM2864);
            f151 = (f149 + 67) % 128;
        } catch (JSONException e10) {
            m.m2983(m321((char) (18779 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) + 24).intern(), m322("㞃鞞黀㟦왵춄⩢줢幑厶胑뻉\ue4a7멟ᚾ⑪ୃº漑訞酷霙엥玮⟋ﴶ婄\ud942乣䏓뀦仨풍ꨢ", KeyEvent.normalizeMetaState(0)).intern(), e10);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m321(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f152[i10 + i12]) ^ (((long) i12) * f148)) ^ ((long) c4));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m322(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f150, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f150));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
