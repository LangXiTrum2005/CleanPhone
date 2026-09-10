package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class cn {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f1306 = 12561;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1307 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1308 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1309 = 30183;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f1310 = 57924;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f1311 = 280;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private dl f1312;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<cp> f1313 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private de f1314;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private bg f1315;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private dj f1316;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Context f1317;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private az f1318;

    public cn(Context context, dj djVar, az azVar, de deVar, bg bgVar) {
        this.f1316 = djVar;
        this.f1318 = azVar;
        this.f1314 = deVar;
        this.f1315 = bgVar;
        this.f1317 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized List<cp> m1535() {
        f1307 = (f1308 + 99) % 128;
        if (this.f1313 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f1313);
        f1307 = (f1308 + 35) % 128;
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #1 {all -> 0x0016, blocks: (B:3:0x0001, B:14:0x001a, B:10:0x0015, B:6:0x000f), top: B:21:0x0001, inners: #0 }] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m1537(dl dlVar) {
        try {
            int i2 = f1307 + 19;
            int i3 = i2 % 128;
            f1308 = i3;
            if (i2 % 2 == 0) {
                int i4 = 49 / 0;
                if (dlVar != null) {
                    f1307 = (i3 + 93) % 128;
                    this.f1312 = dlVar;
                }
            } else if (dlVar != null) {
                f1307 = (i3 + 93) % 128;
                this.f1312 = dlVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ List m1542(cn cnVar) {
        int i2 = f1307 + 23;
        int i3 = i2 % 128;
        f1308 = i3;
        int i4 = i2 % 2;
        List<cp> list = cnVar.f1313;
        if (i4 == 0) {
            throw null;
        }
        f1307 = (i3 + 25) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final Context m1543() {
        int i2 = (f1307 + 49) % 128;
        f1308 = i2;
        Context context = this.f1317;
        f1307 = (i2 + 31) % 128;
        return context;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final synchronized dl m1544() {
        dl dlVar;
        int i2 = f1307;
        dlVar = this.f1312;
        int i3 = i2 + 23;
        f1308 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        return dlVar;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final synchronized boolean m1545() {
        boolean zMo776;
        f1308 = (f1307 + 9) % 128;
        zMo776 = this.f1315.mo776();
        f1307 = (f1308 + 89) % 128;
        return zMo776;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final az m1546() {
        int i2 = f1307 + 49;
        int i3 = i2 % 128;
        f1308 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        az azVar = this.f1318;
        int i4 = i3 + 121;
        f1307 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return azVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m1547() {
        int i2 = f1307 + 43;
        f1308 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1315.m787();
        }
        this.f1315.m787();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m1548() {
        int i2 = f1308 + 91;
        f1307 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1316.m1920();
        }
        this.f1316.m1920();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m1549() {
        int i2 = f1307 + 95;
        f1308 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1316.m1924();
        }
        this.f1316.m1924();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m1550() {
        int i2 = f1307 + 79;
        f1308 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1315.mo793();
            throw null;
        }
        String strMo793 = this.f1315.mo793();
        int i3 = f1307 + 7;
        f1308 = i3 % 128;
        if (i3 % 2 != 0) {
            return strMo793;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m1551() {
        String strM1547 = m1547();
        if (TextUtils.isEmpty(strM1547)) {
            return null;
        }
        f1308 = (f1307 + 61) % 128;
        if (m1538("Ⴎ胓誶垓䴑씱陘奆", '7' - AndroidCharacter.getMirror('0')).intern().equals(strM1547)) {
            return null;
        }
        int i2 = f1307 + 101;
        f1308 = i2 % 128;
        if (i2 % 2 == 0) {
            if (m1538("ᦹ磏\udea9⯛궺눯籓̡", 107 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern().equals(strM1547)) {
                return null;
            }
        } else if (m1538("ᦹ磏\udea9⯛궺눯籓̡", 9 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern().equals(strM1547)) {
            return null;
        }
        return this.f1316.m1923(m1547());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1553() {
        String strM1921;
        int i2 = f1307 + 101;
        f1308 = i2 % 128;
        if (i2 % 2 == 0) {
            strM1921 = this.f1316.m1921();
            int i3 = 57 / 0;
        } else {
            strM1921 = this.f1316.m1921();
        }
        int i4 = f1308 + 67;
        f1307 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM1921;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1555() {
        int i2 = f1308 + 109;
        f1307 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1313.iterator();
            throw null;
        }
        Iterator<cp> it = this.f1313.iterator();
        f1307 = (f1308 + 31) % 128;
        while (it.hasNext()) {
            it.next().m1612();
        }
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cn.5
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                cn.m1542(cn.this).clear();
            }
        });
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m1556() {
        int i2 = f1308 + 93;
        f1307 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1316.m1918();
            throw null;
        }
        dl dlVarM1918 = this.f1316.m1918();
        if (dlVarM1918 != null) {
            m1540(dlVarM1918);
            if (this.f1315.mo777()) {
                jp.m2634(dlVarM1918);
            }
        }
        this.f1316.m1919().m1981(m1538("⬖╾貮࠲쭚䧷饊ꊡ㝟\uee38⡦혆", 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), this.f1315);
        Iterator<String> it = this.f1316.m1917().keySet().iterator();
        f1307 = (f1308 + 93) % 128;
        while (it.hasNext()) {
            int i3 = f1308 + 121;
            f1307 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f1316.m1917().get(it.next()).m1972();
                throw null;
            }
            dp dpVar = this.f1316.m1917().get(it.next());
            if (!dpVar.m1972()) {
                m1536(new cp(this, this.f1314, this.f1315, m1541(dpVar), this.f1316.m1919()));
            }
        }
        m1539(this.f1316, this.f1315);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hs m1541(dp dpVar) {
        int i2 = (f1307 + 95) % 128;
        f1308 = i2;
        if (dpVar != null) {
            return new hs(dpVar, m1541(this.f1316.m1917().get(dpVar.m1969())));
        }
        int i3 = i2 + 83;
        f1307 = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1554(String str, List<Object> list) {
        int i2 = f1308 + 97;
        f1307 = i2 % 128;
        if (i2 % 2 != 0) {
            m1535().iterator();
            throw null;
        }
        Iterator<cp> it = m1535().iterator();
        f1308 = (f1307 + 3) % 128;
        while (it.hasNext()) {
            int i3 = f1308 + 23;
            f1307 = i3 % 128;
            if (i3 % 2 != 0) {
                it.next().m1621(str, list);
                throw null;
            }
            it.next().m1621(str, list);
            f1308 = (f1307 + 95) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m1552() {
        int i2 = f1307 + 63;
        f1308 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1316.m1922();
            throw null;
        }
        String strM1922 = this.f1316.m1922();
        int i3 = f1308 + 111;
        f1307 = i3 % 128;
        if (i3 % 2 == 0) {
            return strM1922;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1536(cp cpVar) {
        f1307 = (f1308 + 39) % 128;
        this.f1313.add(cpVar);
        int i2 = f1307 + 93;
        f1308 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1557() {
        f1307 = (f1308 + 11) % 128;
        String strM1925 = this.f1316.m1925();
        f1308 = (f1307 + 123) % 128;
        return strM1925;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1540(dl dlVar) {
        f1308 = (f1307 + 59) % 128;
        m1537(dlVar);
        f1307 = (f1308 + 45) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m1539(dj djVar, bg bgVar) {
        try {
            int i2 = f1308 + 89;
            f1307 = i2 % 128;
            if (i2 % 2 == 0) {
                if (bgVar.mo776()) {
                    Iterator<cp> it = m1535().iterator();
                    while (it.hasNext()) {
                        int i3 = f1308 + 51;
                        f1307 = i3 % 128;
                        if (i3 % 2 != 0) {
                            cp next = it.next();
                            djVar.m1919().m1985().m1981(next.m1626().m2256(), next);
                            int i4 = 79 / 0;
                        } else {
                            cp next2 = it.next();
                            djVar.m1919().m1985().m1981(next2.m1626().m2256(), next2);
                        }
                        f1308 = (f1307 + 15) % 128;
                    }
                }
            } else {
                bgVar.mo776();
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1538(String str, int i2) {
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
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1310)) ^ ((c3 >>> 5) + f1306)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1309) ^ ((c4 + i4) ^ ((c4 << 4) + f1311))));
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
