package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cp {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1472 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1473 = 2261539803667671093L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1474;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private List<cl> f1475 = new ArrayList();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private dp f1476;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private bb f1477;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private dg f1478;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private be f1479;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private dc f1480;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Context f1481;

    public cp(Context context, dg dgVar, bb bbVar, dc dcVar, be beVar) {
        this.f1478 = dgVar;
        this.f1477 = bbVar;
        this.f1480 = dcVar;
        this.f1479 = beVar;
        this.f1481 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private synchronized void m1719() {
        try {
            if (this.f1479.mo807()) {
                for (cl clVar : m1720()) {
                    f1472 = (f1474 + 39) % 128;
                    this.f1478.m1919().m2160().m2152(clVar.m1644().m2372(), clVar);
                }
            }
            f1472 = (f1474 + InterfaceC0435l1.d.b.f29105b) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized List<cl> m1720() {
        int i10 = f1474 + 119;
        f1472 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f1475 != null) {
            return new ArrayList(this.f1475);
        }
        ArrayList arrayList = new ArrayList();
        f1472 = (f1474 + 55) % 128;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m1722(cp cpVar) {
        int i10 = f1474;
        int i11 = i10 + 27;
        f1472 = i11 % 128;
        int i12 = i11 % 2;
        List<cl> list = cpVar.f1475;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + InterfaceC0435l1.d.b.f29112i;
        f1472 = i13 % 128;
        if (i13 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ic m1724(dl dlVar) {
        int i10 = f1474 + 27;
        f1472 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (dlVar == null) {
            return null;
        }
        ic icVar = new ic(dlVar, m1724(this.f1478.m1920().get(dlVar.m2022())));
        int i11 = f1472 + 9;
        f1474 = i11 % 128;
        if (i11 % 2 == 0) {
            return icVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public final Context m1727() {
        int i10 = (f1472 + 13) % 128;
        f1474 = i10;
        Context context = this.f1481;
        int i11 = i10 + InterfaceC0435l1.d.b.f29110g;
        f1472 = i11 % 128;
        if (i11 % 2 != 0) {
            return context;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final synchronized dp m1728() {
        int i10 = f1472 + 33;
        f1474 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return this.f1476;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final bb m1729() {
        int i10 = f1472 + 51;
        int i11 = i10 % 128;
        f1474 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        bb bbVar = this.f1477;
        int i12 = i11 + 57;
        f1472 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 52 / 0;
        }
        return bbVar;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final synchronized boolean m1730() {
        boolean zMo807;
        f1472 = (f1474 + 115) % 128;
        zMo807 = this.f1479.mo807();
        f1474 = (f1472 + 53) % 128;
        return zMo807;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m1731() {
        String strM1735;
        int i10 = f1474 + 69;
        f1472 = i10 % 128;
        if (i10 % 2 == 0) {
            strM1735 = m1735();
            int i11 = 45 / 0;
            if (TextUtils.isEmpty(strM1735)) {
                return null;
            }
        } else {
            strM1735 = m1735();
            if (TextUtils.isEmpty(strM1735)) {
                return null;
            }
        }
        int i12 = f1472 + 81;
        f1474 = i12 % 128;
        if (i12 % 2 != 0) {
            if (m1721("ꡰͺﹶꥴѽｵ꩷", (TypedValue.complexToFraction(0, 1.0f, 1.0f) > 1.0f ? 1 : (TypedValue.complexToFraction(0, 1.0f, 1.0f) == 1.0f ? 0 : -1)) * 43777).intern().equals(strM1735)) {
                return null;
            }
        } else if (m1721("ꡰͺﹶꥴѽｵ꩷", (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 43777).intern().equals(strM1735)) {
            return null;
        }
        if (m1721("ꡱଇ\uee90䈅▛餞粒퀬", 41850 - TextUtils.lastIndexOf("", '0')).intern().equals(strM1735)) {
            return null;
        }
        return this.f1478.m1922(m1735());
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m1732() {
        f1472 = (f1474 + 85) % 128;
        String strM1924 = this.f1478.m1924();
        int i10 = f1472 + 99;
        f1474 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1924;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m1733() {
        f1472 = (f1474 + 25) % 128;
        String strM1921 = this.f1478.m1921();
        int i10 = f1472 + InterfaceC0435l1.d.b.f29107d;
        f1474 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1921;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m1734() {
        f1474 = (f1472 + 89) % 128;
        String strMo818 = this.f1479.mo818();
        f1472 = (f1474 + 67) % 128;
        return strMo818;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m1735() {
        f1472 = (f1474 + 37) % 128;
        String strM819 = this.f1479.m819();
        f1472 = (f1474 + 35) % 128;
        return strM819;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r0
  0x0021: PHI (r0v5 com.ironsource.adqualitysdk.sdk.i.dp) = (r0v4 com.ironsource.adqualitysdk.sdk.i.dp), (r0v16 com.ironsource.adqualitysdk.sdk.i.dp) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m1736() {
        dp dpVarM1918;
        cp cpVar;
        int i10 = f1472 + 37;
        f1474 = i10 % 128;
        if (i10 % 2 != 0) {
            dpVarM1918 = this.f1478.m1918();
            int i11 = 51 / 0;
            if (dpVarM1918 != null) {
                m1726(dpVarM1918);
                if (this.f1479.mo814()) {
                    jz.m2771(dpVarM1918);
                }
            }
        } else {
            dpVarM1918 = this.f1478.m1918();
            if (dpVarM1918 != null) {
                m1726(dpVarM1918);
                if (this.f1479.mo814()) {
                    jz.m2771(dpVarM1918);
                }
            }
        }
        this.f1478.m1919().m2152(m1721("ꡛ巗䍇䣕繏揟楥Ồф\u09ca㽌⓱", 62850 - TextUtils.indexOf((CharSequence) "", '0')).intern(), this.f1479);
        Iterator<String> it = this.f1478.m1920().keySet().iterator();
        while (it.hasNext()) {
            f1474 = (f1472 + InterfaceC0435l1.d.b.f29114k) % 128;
            dl dlVar = this.f1478.m1920().get(it.next());
            if (dlVar.m2021()) {
                cpVar = this;
            } else {
                cpVar = this;
                cpVar.m1725(new cl(cpVar, this.f1480, this.f1479, this.m1724(dlVar), this.f1478.m1919()));
            }
            this = cpVar;
        }
        cp cpVar2 = this;
        cpVar2.m1719();
        Iterator<cl> it2 = cpVar2.m1720().iterator();
        while (it2.hasNext()) {
            it2.next().m1646();
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m1739() {
        f1472 = (f1474 + 69) % 128;
        String strM1926 = this.f1478.m1926();
        f1472 = (f1474 + 87) % 128;
        return strM1926;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m1741() {
        int i10 = f1474 + 79;
        f1472 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1475.iterator();
            throw null;
        }
        Iterator<cl> it = this.f1475.iterator();
        while (it.hasNext()) {
            f1474 = (f1472 + 107) % 128;
            it.next().m1637();
            f1474 = (f1472 + 17) % 128;
        }
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                cp.m1722(cp.this).clear();
            }
        });
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m1723(dp dpVar) {
        int i10 = f1474;
        f1472 = (i10 + 85) % 128;
        if (dpVar != null) {
            this.f1476 = dpVar;
            f1472 = (i10 + 23) % 128;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m1740(String str, List<Object> list) {
        f1474 = (f1472 + 69) % 128;
        Iterator<cl> it = m1720().iterator();
        while (it.hasNext()) {
            it.next().m1645(str, list);
        }
        int i10 = f1474 + 65;
        f1472 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1737() {
        f1474 = (f1472 + 47) % 128;
        String strM1923 = this.f1478.m1923();
        f1474 = (f1472 + 39) % 128;
        return strM1923;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1721(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f1473);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1738() {
        int i10 = f1472 + 37;
        f1474 = i10 % 128;
        int i11 = i10 % 2;
        dg dgVar = this.f1478;
        if (i11 == 0) {
            return dgVar.m1925();
        }
        dgVar.m1925();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1725(cl clVar) {
        int i10 = f1472 + InterfaceC0435l1.d.b.f29107d;
        f1474 = i10 % 128;
        int i11 = i10 % 2;
        this.f1475.add(clVar);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f1472 + 75;
        f1474 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1726(dp dpVar) {
        int i10 = f1474 + InterfaceC0435l1.d.b.f29107d;
        f1472 = i10 % 128;
        int i11 = i10 % 2;
        m1723(dpVar);
        if (i11 == 0) {
            int i12 = 64 / 0;
        }
        f1472 = (f1474 + 21) % 128;
    }
}
