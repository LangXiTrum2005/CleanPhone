package com.p004ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class eg extends ej {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1883 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1884 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1885 = {-405170401, 90346153, -500461674, -1283309533, -2011764121, -1886511268, 536288967, -1998981079, -1265893219, -1573804769, -1515868198, -168166575, 117959913, -968067837, 393849155, 669992311, -1830006624, 45022515};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ee f1886;

    public eg(ee eeVar, ee eeVar2, ee eeVar3, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
        this.f1886 = eeVar3;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2092(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1885.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ee m2093() {
        int i2 = f1883;
        ee eeVar = this.f1886;
        f1884 = (i2 + 83) % 128;
        return eeVar;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ej
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eg.class == obj.getClass()) {
            if (!super.equals(obj)) {
                f1883 = (f1884 + 19) % 128;
                return false;
            }
            eg egVar = (eg) obj;
            ee eeVar = this.f1886;
            if (eeVar != null) {
                int i2 = f1884 + 27;
                f1883 = i2 % 128;
                int i3 = i2 % 2;
                ee eeVar2 = egVar.f1886;
                if (i3 == 0) {
                    return eeVar.equals(eeVar2);
                }
                eeVar.equals(eeVar2);
                throw null;
            }
            if (egVar.f1886 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ej
    public final int hashCode() {
        f1884 = (f1883 + 107) % 128;
        int iHashCode = super.hashCode() * 31;
        ee eeVar = this.f1886;
        int iHashCode2 = iHashCode + (eeVar != null ? eeVar.hashCode() : 0);
        int i2 = f1884 + 17;
        f1883 = i2 % 128;
        if (i2 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ej
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(m2092(new int[]{-2133606961, 677274057}, 3 - KeyEvent.getDeadChar(0, 0)).intern());
        sb.append(m2093().toString());
        String string = sb.toString();
        f1884 = (f1883 + 105) % 128;
        return string;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        f1884 = (f1883 + 115) % 128;
        du duVarM2086 = m2097().m2086(drVar, cpVar);
        du duVarM2087 = m2093().m2086(drVar, cpVar);
        try {
            Object objM2043 = m2098().m2086(drVar, cpVar).m2043();
            if (objM2043 instanceof JSONObject) {
                ((JSONObject) objM2043).put((String) duVarM2086.m2043(), duVarM2087.m2043());
            } else if (objM2043 instanceof JSONArray) {
                ((JSONArray) objM2043).put(duVarM2086.m2048().intValue(), duVarM2087.m2043());
            } else if (objM2043 instanceof Map) {
                int i2 = f1884 + 53;
                f1883 = i2 % 128;
                if (i2 % 2 != 0) {
                    ((Map) objM2043).put(duVarM2086.m2043(), duVarM2087.m2043());
                    throw null;
                }
                ((Map) objM2043).put(duVarM2086.m2043(), duVarM2087.m2043());
            } else if (objM2043 instanceof List) {
                ((List) objM2043).set(duVarM2086.m2048().intValue(), duVarM2087.m2043());
            } else if (objM2043.getClass().isArray()) {
                ((Object[]) objM2043)[duVarM2086.m2048().intValue()] = duVarM2087.m2043();
                f1883 = (f1884 + 123) % 128;
            } else {
                String strM1616 = cpVar.m1616();
                StringBuilder sb = new StringBuilder();
                sb.append(m2092(new int[]{-1663869227, -10748094, -484951422, -2076391795, 399102204, -7247341, 2146948538, -622712800, -418522293, -1931587187, -1694235183, -806785779, 1778035557, -729110223, 835476238, -1688099229, -136523524, -241334155, 1564979787, 1844983954, -733406461, 1853471376}, 41 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                sb.append(this);
                sb.append(m2085());
                sb.append(m2092(new int[]{386129766, 245734933, 1167976963, 2015217694, 1530180641, -520103584, 1063949491, -936832285, 1453749157, 1084501516, 1072069617, -305005421, 269882778, 2065630678, -1817936495, -1752843798, 1637611197, 313505183, -613815350, -1358209972, -1412307754, 700152628}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 41).intern());
                sb.append(objM2043);
                cq.m1676(strM1616, sb.toString(), null);
            }
        } catch (Exception e2) {
            String strM1617 = cpVar.m1616();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2092(new int[]{-1663869227, -10748094, -484951422, -2076391795, 399102204, -7247341, 2146948538, -622712800, -418522293, -1931587187, -1694235183, -806785779, 1778035557, -729110223, 835476238, -1688099229, -136523524, -241334155, 1564979787, 1844983954, -733406461, 1853471376}, TextUtils.getOffsetBefore("", 0) + 42).intern());
            sb2.append(this);
            sb2.append(m2085());
            cq.m1676(strM1617, sb2.toString(), e2);
        }
        int i3 = f1884 + 73;
        f1883 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 84 / 0;
        }
        return duVarM2087;
    }
}
