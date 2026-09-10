package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.internal.measurement.f2;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class es extends ep {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1993 = -4347888209372508124L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1994 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1995;

    public es(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2192(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f1993);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        ea eaVar;
        int i10;
        ea eaVarM2165 = m2186().m2165(eeVar, clVar);
        try {
            Object objM2124 = m2187().m2165(eeVar, clVar).m2124();
            if (objM2124 instanceof JSONObject) {
                return new ea(((JSONObject) objM2124).opt((String) eaVarM2165.m2124()));
            }
            if (objM2124 instanceof JSONArray) {
                eaVar = new ea(((JSONArray) objM2124).opt(eaVarM2165.m2121().intValue()));
                int i11 = f1994 + 65;
                f1995 = i11 % 128;
                i10 = i11 % 2 != 0 ? 60 : 88;
                return eaVar;
            }
            if (objM2124 instanceof Map) {
                return new ea(((Map) objM2124).get(eaVarM2165.m2124()));
            }
            if (objM2124 instanceof List) {
                return new ea(((List) objM2124).get(eaVarM2165.m2121().intValue()));
            }
            if (!objM2124.getClass().isArray()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2192("ၡີⶐ䳢毚詫ꤓ졧\ue75dֳ⒏䎄拴臊ꀠ\udf0e︴ᵄ㮧媟秫飘럔혨\uf51cᑻ㌊冲炕濧躞괼찼\ueb17ੰ⥈䞻暘藿ꓞ쌲\ue25fĽ", 7907 - View.MeasureSpec.getMode(0)).intern());
                sb2.append(this);
                sb2.append(m2192("ဃ\uaac3斾\u20c7ﬢ똌煣ు욫臁峲᜴퉘浨⡁\ue2b2뷔磒㏳칣褏䑫Ỻ\ud99e铲⾑\uea23ꔅ恻㭘\uf5b2낗䯫ث섊鱶坔ᇵ겅柭⋆ﴤ렅獏\u0df8", 47838 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                sb2.append(objM2124);
                new dr(clVar, eeVar, sb2.toString()).m2034(clVar.m1643());
                f1995 = (f1994 + 25) % 128;
                return new ea(null);
            }
            eaVar = new ea(((Object[]) objM2124)[eaVarM2165.m2121().intValue()]);
            int i12 = f1994 + 47;
            f1995 = i12 % 128;
            if (i12 % 2 == 0) {
                return eaVar;
            }
            int i13 = i10 / 0;
            return eaVar;
        } catch (Exception e10) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2192("ၡີⶐ䳢毚詫ꤓ졧\ue75dֳ⒏䎄拴臊ꀠ\udf0e︴ᵄ㮧媟秫飘럔혨\uf51cᑻ㌊冲炕濧躞괼찼\ueb17ੰ⥈䞻暘藿ꓞ쌲\ue25fĽ", (KeyEvent.getMaxKeyCode() >> 16) + 7907).intern());
            sb3.append(this);
            new dr(clVar, eeVar, f2.m(sb3, m2192("ဃ", TextUtils.indexOf((CharSequence) "", '0') + 63998)), e10).m2034(clVar.m1643());
        }
    }
}
