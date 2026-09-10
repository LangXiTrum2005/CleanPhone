package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fk extends fq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1978 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1979 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1980 = {AbstractJsonLexerKt.BEGIN_OBJ, '\n', ' ', AbstractJsonLexerKt.END_OBJ};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1981 = 2;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private fq[] f1982;

    public fk(List<fq> list) {
        fq[] fqVarArr = new fq[list.size()];
        this.f1982 = fqVarArr;
        list.toArray(fqVarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i2 = f1978 + 71;
            f1979 = i2 % 128;
            if (i2 % 2 != 0) {
                obj.getClass();
                throw null;
            }
            if (fk.class == obj.getClass()) {
                fq[] fqVarArr = this.f1982;
                fq[] fqVarArr2 = ((fk) obj).f1982;
                if (fqVarArr != null) {
                    return fqVarArr.equals(fqVarArr2);
                }
                if (fqVarArr2 != null) {
                    return false;
                }
                f1979 = (f1978 + 13) % 128;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return r4.f1982.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4.f1982 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.f1982 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.fk.f1978 = (r1 + 47) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.fk.f1978
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.fk.f1979 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L15
            com.ironsource.adqualitysdk.sdk.i.fq[] r0 = r4.f1982
            r3 = 32
            int r3 = r3 / r2
            if (r0 == 0) goto L26
            goto L19
        L15:
            com.ironsource.adqualitysdk.sdk.i.fq[] r0 = r4.f1982
            if (r0 == 0) goto L26
        L19:
            int r1 = r1 + 47
            int r1 = r1 % 128
            com.p004ironsource.adqualitysdk.sdk.i.fk.f1978 = r1
            com.ironsource.adqualitysdk.sdk.i.fq[] r0 = r4.f1982
            int r0 = r0.hashCode()
            return r0
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.fk.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2123((byte) (42 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0001\u0000", 2 - TextUtils.getOffsetBefore("", 0)).intern());
        for (fq fqVar : this.f1982) {
            f1979 = (f1978 + 73) % 128;
            sb.append(m2123((byte) (13 - TextUtils.indexOf("", "")), "----", 4 - TextUtils.indexOf("", "", 0)).intern());
            sb.append(fqVar.toString());
            sb.append(m2123((byte) (75 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), RequestConfiguration.MAX_AD_CONTENT_RATING_T, View.resolveSizeAndState(0, 0, 0) + 1).intern());
        }
        String strC = a.C(sb, m2123((byte) (View.resolveSizeAndState(0, 0, 0) + 38), "£", -TextUtils.indexOf((CharSequence) "", '0')));
        f1979 = (f1978 + 21) % 128;
        return strC;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.fq
    /* JADX INFO: renamed from: ｋ */
    public final du mo2122(dr drVar, cp cpVar) {
        du duVar = new du(null);
        dr drVar2 = new dr(drVar);
        fq[] fqVarArr = this.f1982;
        int length = fqVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            duVar = fqVarArr[i2].mo2122(drVar2, cpVar);
            if (duVar.m2046()) {
                break;
            }
            f1978 = (f1979 + 9) % 128;
            if (!(!duVar.m2044())) {
                break;
            }
            f1978 = (f1979 + 47) % 128;
            if (duVar.m2040()) {
                break;
            }
            i2++;
            f1979 = (f1978 + 89) % 128;
        }
        return duVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2123(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f1980;
                char c2 = f1981;
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
}
