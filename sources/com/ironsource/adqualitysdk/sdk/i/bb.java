package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bb {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f623 = 1;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f627 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f629 = -1847458106;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f630 = 9;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f632 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f633 = 1541941282;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ISAdQualityAdListener f634;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ai f635;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Handler f636;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f631 = {2, -1, -15, 19, -4, -13, 15, 4, -21, 17, 2, 2, -1, -11, 0, 1, -5, 1, 20, -21, 17, 2, -8, 2, 13, 1, -10, 9, 18, -33, 6, 9, -17, 49};

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f626 = 55266;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f628 = 41088;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f624 = 27790;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f625 = 51239;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Set<iv> f638 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Set<String> f637 = new HashSet();

    public bb(Handler handler, ai aiVar) {
        this.f635 = aiVar;
        this.f636 = handler;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ai m712(bb bbVar) {
        int i10 = f623;
        int i11 = i10 + 39;
        f627 = i11 % 128;
        int i12 = i11 % 2;
        ai aiVar = bbVar.f635;
        if (i12 != 0) {
            throw null;
        }
        f627 = (i10 + 21) % 128;
        return aiVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m717(bb bbVar, String str, JSONObject jSONObject) {
        f627 = (f623 + 7) % 128;
        bbVar.m716(str, jSONObject);
        int i10 = f623 + 55;
        f627 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 43 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final void m718(JSONObject jSONObject) {
        f627 = (f623 + 85) % 128;
        m724(m715("࠲㭉戭婦쪑踹稧飞ᧆ폠", 10 - Color.argb(0, 0, 0, 0)).intern(), jSONObject);
        int i10 = f623 + InterfaceC0435l1.d.b.f29114k;
        f627 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 47 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final void m719(JSONObject jSONObject) {
        int i10 = f627 + 31;
        f623 = i10 % 128;
        m724(m715("࠲㭉戭婦徥獇ࢉꗞ㣅䡂甒ꉿ\ue555\uf235", i10 % 2 == 0 ? 57 << (ViewConfiguration.getLongPressTimeout() % 118) : (ViewConfiguration.getLongPressTimeout() >> 16) + 13).intern(), jSONObject);
        int i11 = f627 + 45;
        f623 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final void m720(JSONObject jSONObject) {
        f627 = (f623 + 91) % 128;
        m724(m713((short) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1847458203 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 10, ((byte) KeyEvent.getModifierMetaStateMask()) - 1541941270, (byte) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), jSONObject);
        f627 = (f623 + 117) % 128;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final void m721(JSONObject jSONObject) {
        f627 = (f623 + 25) % 128;
        m724(m715("࠲㭉戭婦粶㎲Ầ爬淈겋ࢉꗞꙴ毒\uef0c⊩", View.MeasureSpec.getSize(0) + 15).intern(), jSONObject);
        f627 = (f623 + 89) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m722(JSONObject jSONObject) {
        int i10 = (f623 + 93) % 128;
        f627 = i10;
        ISAdQualityAdListener iSAdQualityAdListener = this.f634;
        if (iSAdQualityAdListener != null) {
            int i11 = i10 + InterfaceC0435l1.d.b.f29105b;
            f623 = i11 % 128;
            if (i11 % 2 != 0) {
                iSAdQualityAdListener.adClosed(jSONObject.optString(is.f2612), ISAdQualityAdType.fromInt(jSONObject.optInt(is.f2611)));
            } else {
                iSAdQualityAdListener.adClosed(jSONObject.optString(is.f2612), ISAdQualityAdType.fromInt(jSONObject.optInt(is.f2611)));
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m725(JSONObject jSONObject) {
        f627 = (f623 + 45) % 128;
        int iOptInt = jSONObject.optInt(is.f2611);
        ISAdQualityAdListener iSAdQualityAdListener = this.f634;
        if (iSAdQualityAdListener != null) {
            int i10 = f623 + 19;
            f627 = i10 % 128;
            if (i10 % 2 == 0) {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(is.f2612), ISAdQualityAdType.fromInt(iOptInt));
            } else {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(is.f2612), ISAdQualityAdType.fromInt(iOptInt));
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m729(JSONObject jSONObject) {
        f623 = (f627 + 19) % 128;
        m724(m713((short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) + 1847458203, (-10) - KeyEvent.keyCodeFromString(""), (-1541941282) - (Process.myPid() >> 22), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), jSONObject);
        f623 = (f627 + 3) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m716(final String str, JSONObject jSONObject) {
        m711(str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str2 = is.f2612;
            jSONObject2.put(str2, jSONObject.remove(str2));
            String str3 = is.f2566;
            jSONObject2.put(str3, jSONObject.remove(str3));
            f627 = (f623 + 9) % 128;
        } catch (JSONException unused) {
        }
        this.f635.m381(str, jSONObject, jSONObject2, new je() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.4
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (is.f2555.contains(str)) {
                    p.m2994(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            bb.m712(bb.this).m386();
                        }
                    });
                }
            }
        });
        int i10 = f627 + 53;
        f623 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 53 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m726(JSONObject jSONObject) {
        int i10 = f627 + 95;
        f623 = i10 % 128;
        m724(m715("࠲㭉戭婦䓡恏㧂⪞⤍\ud8b0\ue555\uf235", i10 % 2 == 0 ? 16777227 >> Color.rgb(0, 0, 0) : Color.rgb(0, 0, 0) + 16777227).intern(), jSONObject);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m730(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = f623;
        this.f634 = iSAdQualityAdListener;
        int i11 = i10 + InterfaceC0435l1.d.b.f29112i;
        f627 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 94 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m713(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f630;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f631;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f633 + i12] + i13);
                    } else {
                        i14 = (short) (f632[f633 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f633 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f629);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f631;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f632;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m731(JSONObject jSONObject) {
        f623 = (f627 + 35) % 128;
        m724(m715("࠲㭉戭婦ࢉꗞᴟ脸\uf6ad嚯\ue555\uf235", TextUtils.lastIndexOf("", '0') + 12).intern(), jSONObject);
        int i10 = f627 + InterfaceC0435l1.d.b.f29110g;
        f623 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m727(String str, String str2, String str3, String str4) {
        int i10 = f627 + 9;
        f623 = i10 % 128;
        if (i10 % 2 == 0) {
            m728(str, str2, str3, str4, null, false);
        } else {
            m728(str, str2, str3, str4, null, false);
        }
        int i11 = f627 + 91;
        f623 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 82 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m711(String str, JSONObject jSONObject) {
        Iterator it = new HashSet(this.f638).iterator();
        while (it.hasNext()) {
            int i10 = f627 + 115;
            f623 = i10 % 128;
            if (i10 % 2 != 0) {
                JSONObject jSONObjectMo657 = ((iv) it.next()).mo657(str, jSONObject);
                if (jSONObjectMo657 != null) {
                    kj.m2869(jSONObject, jSONObjectMo657);
                    f627 = (f623 + 41) % 128;
                }
            } else {
                ((iv) it.next()).mo657(str, jSONObject);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m728(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z10) {
        synchronized (this.f637) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(m713((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1847458165, (-10) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1541941261, (byte) KeyEvent.normalizeMetaState(0)).intern());
                sb2.append(str2);
                String string = sb2.toString();
                if (!this.f637.contains(string) || z10 || ar.m468().mo500()) {
                    this.f637.add(string);
                    if (Math.random() * 100.0d < m714()) {
                        JSONObject jSONObjectM353 = ai.m353(str, str2, str3, str4, jSONObject);
                        m711(m715("捺\ud945踢植\udc05꺞㎲搈", 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), jSONObjectM353);
                        this.f635.m385(m715("捺\ud945踢植\udc05꺞㎲搈", 7 - TextUtils.lastIndexOf("", '0')).intern(), jSONObjectM353);
                        return;
                    }
                    m.m2964(m713((short) Color.argb(0, 0, 0, 0), 1847458175 - View.MeasureSpec.getMode(0), KeyEvent.normalizeMetaState(0) - 10, AndroidCharacter.getMirror('0') - 10299, (byte) ((-16777216) - Color.rgb(0, 0, 0))).intern(), m715("\uef82㡔胦ⲳᴟ脸⭛돡箓䒺촰둱\uf59eអ뺣ᬬ㣅䡂\ue7bb罝㽓퉇ᘵ囹앁획ꅟ搩⭛돡\uf84c桴\uf8a0钣鿉ꂃ闄䈐\u0fe4⁵婡纚䓡恏虸鲾꧘䝕\ue555\uf235", 49 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m724(final String str, final JSONObject jSONObject) {
        this.f636.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                bb.m717(bb.this, str, jSONObject);
            }
        });
        f627 = (f623 + 121) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m723(iv ivVar) {
        f623 = (f627 + 37) % 128;
        this.f638.add(ivVar);
        f627 = (f623 + 125) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return com.ironsource.adqualitysdk.sdk.i.ar.m468().mo491();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.bb.f623 + 119;
        com.ironsource.adqualitysdk.sdk.i.bb.f627 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r0 = 34 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return 100.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m468().mo490() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m468().mo490() == false) goto L9;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static double m714() {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.bb.f627
            int r0 = r0 + 91
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.bb.f623 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1a
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m468()
            boolean r0 = r0.mo490()
            r1 = 5
            int r1 = r1 / 0
            if (r0 != 0) goto L2d
            goto L24
        L1a:
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m468()
            boolean r0 = r0.mo490()
            if (r0 != 0) goto L2d
        L24:
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m468()
            double r0 = r0.mo491()
            return r0
        L2d:
            int r0 = com.ironsource.adqualitysdk.sdk.i.bb.f623
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.bb.f627 = r1
            int r0 = r0 % 2
            r1 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r0 == 0) goto L3f
            r0 = 34
            int r0 = r0 / 0
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bb.m714():double");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m715(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f626)) ^ ((c5 >>> 5) + f624)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f628) ^ ((c10 + i12) ^ ((c10 << 4) + f625))));
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
