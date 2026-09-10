package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class eh extends ef {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1932 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1933 = -2603100958732371142L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1934 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final Map<String, ef> f1935 = new HashMap();

    public eh(Map<String, ef> map) {
        for (String str : map.keySet()) {
            this.f1935.put(eb.m2127(str), map.get(str));
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2167(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f1933, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f1933));
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

    public final boolean equals(Object obj) {
        int i10 = f1934;
        int i11 = i10 + 121;
        int i12 = i11 % 128;
        f1932 = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            f1934 = (i12 + 65) % 128;
            return true;
        }
        if (obj != null) {
            f1932 = (i10 + 99) % 128;
            if (eh.class == obj.getClass()) {
                eh ehVar = (eh) obj;
                Map<String, ef> map = this.f1935;
                if (map != null) {
                    return map.equals(ehVar.f1935);
                }
                if (ehVar.f1935 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r1 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r0 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r1 = r1 + 99;
        com.ironsource.adqualitysdk.sdk.i.eh.f1932 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if ((r1 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4.f1935 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.f1935 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = r1 + 47;
        com.ironsource.adqualitysdk.sdk.i.eh.f1932 = r1 % 128;
        r1 = r1 % 2;
        r4 = r4.f1935.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.eh.f1932
            int r0 = r0 + 33
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1934 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 != 0) goto L15
            java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ef> r0 = r4.f1935
            r3 = 12
            int r3 = r3 / r2
            if (r0 == 0) goto L2d
            goto L19
        L15:
            java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ef> r0 = r4.f1935
            if (r0 == 0) goto L2d
        L19:
            int r1 = r1 + 47
            int r0 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1932 = r0
            int r1 = r1 % 2
            java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ef> r4 = r4.f1935
            int r4 = r4.hashCode()
            if (r1 == 0) goto L2c
            r0 = 89
            int r0 = r0 / r2
        L2c:
            return r4
        L2d:
            int r1 = r1 + 99
            int r4 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.eh.f1932 = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L38
            return r2
        L38:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.eh.hashCode():int");
    }

    public final String toString() {
        if (this.f1935.isEmpty()) {
            f1934 = (f1932 + InterfaceC0435l1.d.b.f29114k) % 128;
            return m2167("튌틷ﴋ왌︬\ud99f", ViewConfiguration.getDoubleTapTimeout() >> 16).intern();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2167("\ueeaf\ueed4襤숾\u0cffࣽ", View.resolveSizeAndState(0, 0, 0)).intern());
        Iterator<String> it = this.f1935.keySet().iterator();
        f1932 = (f1934 + 1) % 128;
        boolean z10 = true;
        while (it.hasNext()) {
            int i10 = f1932 + 59;
            f1934 = i10 % 128;
            if (i10 % 2 == 0) {
                it.next();
                throw null;
            }
            String next = it.next();
            if (!z10) {
                sb2.append(m2167("혯혃這ꬃᶾ༙", Process.myPid() >> 22).intern());
            }
            sb2.append(m2167("ᛲᛐ䞱ꑟ嫼", View.MeasureSpec.getSize(0)).intern());
            sb2.append(next);
            sb2.append(m2167("㗩㗋珒䣒\ue689郝닜", 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
            sb2.append(this.f1935.get(next));
            z10 = false;
        }
        return f2.m(sb2, m2167("䲵䲕\ue01f\udb58\u0b3b˃", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : this.f1935.keySet()) {
            f1932 = (f1934 + 21) % 128;
            ea eaVarM2165 = this.f1935.get(str).m2165(eeVar, clVar);
            try {
                jSONObject.put(str, eaVarM2165.m2124());
                f1934 = (f1932 + 23) % 128;
            } catch (JSONException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2167("㒱㓴凒檚眏צĉ됧\ud82b秐戦⫔\ued15䒬儤㼷\uf26e倀㱏찲蝾뽦⬽턟鑘詼ក\ue674맡", KeyEvent.normalizeMetaState(0)).intern());
                sb2.append(eaVarM2165.m2124());
                new dr(clVar, eeVar, f2.k(m2167("⨪⨊㳦\u07baབ远祍㸀웢ᒯᩴꃯ\uf3da", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), str, sb2)).m2034(clVar.m1643());
            }
        }
        return new ea(jSONObject);
    }
}
