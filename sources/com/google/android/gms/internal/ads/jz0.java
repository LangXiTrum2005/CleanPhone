package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jz0 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16225d;

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[PHI: r7
  0x003c: PHI (r7v13 int) = (r7v0 int), (r7v16 int) binds: [B:17:0x0032, B:21:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public jz0(byte[] bArr, int i10, int i11, String str) {
        byte b10;
        boolean z10 = true;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    if (i11 != 23) {
                        z10 = false;
                    } else if (bArr.length == 4) {
                        i11 = 23;
                    } else {
                        i11 = 23;
                        z10 = false;
                    }
                    ps1.v(z10);
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    if (i11 != 75) {
                        z10 = false;
                    } else if (bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                        i11 = 75;
                    } else {
                        i11 = 75;
                        z10 = false;
                    }
                    ps1.v(z10);
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    if (i11 != 78) {
                        z10 = false;
                    } else if (bArr.length == 8) {
                        i11 = 78;
                    } else {
                        i11 = 78;
                        z10 = false;
                    }
                    ps1.v(z10);
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    if (i11 != 78) {
                        z10 = false;
                    } else if (bArr.length == 8) {
                        i11 = 78;
                    } else {
                        i11 = 78;
                        z10 = false;
                    }
                    ps1.v(z10);
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    ps1.v(i11 == 0);
                }
                break;
        }
        this.f16222a = str;
        this.f16223b = bArr;
        this.f16224c = i10;
        this.f16225d = i11;
    }

    public final ArrayList b() {
        ps1.d0("Metadata is not an auxiliary tracks map", this.f16222a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f16223b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(bArr[i10 + 2] & 255));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jz0.class == obj.getClass()) {
            jz0 jz0Var = (jz0) obj;
            if (this.f16222a.equals(jz0Var.f16222a) && Arrays.equals(this.f16223b, jz0Var.f16223b) && this.f16224c == jz0Var.f16224c && this.f16225d == jz0Var.f16225d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f16223b) + ((this.f16222a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31) + this.f16224c) * 31) + this.f16225d;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    public final String toString() {
        String string;
        String str = this.f16222a;
        byte[] bArr = this.f16223b;
        int i10 = this.f16225d;
        if (i10 != 0) {
            if (i10 == 1) {
                String str2 = uu0.f20901a;
                string = new String(bArr, StandardCharsets.UTF_8);
            } else if (i10 == 23) {
                int length = bArr.length;
                if (!(length >= 4)) {
                    throw new IllegalArgumentException(dv.B("array too small: %s < %s", Integer.valueOf(length), 4));
                }
                string = String.valueOf(Float.intBitsToFloat(gc1.l(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i10 == 67) {
                int length2 = bArr.length;
                if (!(length2 >= 4)) {
                    throw new IllegalArgumentException(dv.B("array too small: %s < %s", Integer.valueOf(length2), 4));
                }
                string = String.valueOf(gc1.l(bArr[0], bArr[1], bArr[2], bArr[3]));
            } else if (i10 == 75) {
                string = String.valueOf(Byte.toUnsignedInt(bArr[0]));
            } else if (i10 != 78) {
                String str3 = uu0.f20901a;
                string = rb1.f19515f.f().g(bArr.length, bArr);
            } else {
                string = String.valueOf(new np0(bArr).j());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListB = b();
            StringBuilder sbI = d5.u.i("track types = ");
            v71.z(sbI, arrayListB.iterator(), ",");
            string = sbI.toString();
        } else {
            String str4 = uu0.f20901a;
            string = rb1.f19515f.f().g(bArr.length, bArr);
        }
        return d5.u.h(new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(string).length()), "mdta: key=", str, ", value=", string);
    }
}
