package m1;

import com.ironsource.mediationsdk.logger.IronSourceError;
import d5.u;
import i1.b0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f45769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45771d;

    public a(byte[] bArr, int i10, int i11, String str) {
        byte b10;
        str.getClass();
        boolean z10 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i11 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                go.k.i(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                go.k.i(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                go.k.i(z10);
                break;
            case "auxiliary.tracks.map":
                go.k.i(i11 == 0);
                break;
        }
        this.f45768a = str;
        this.f45769b = bArr;
        this.f45770c = i10;
        this.f45771d = i11;
    }

    public final ArrayList d() {
        go.k.s("Metadata is not an auxiliary tracks map", this.f45768a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f45769b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(bArr[i10 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f45768a.equals(aVar.f45768a) && Arrays.equals(this.f45769b, aVar.f45769b) && this.f45770c == aVar.f45770c && this.f45771d == aVar.f45771d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f45769b) + u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f45768a)) * 31) + this.f45770c) * 31) + this.f45771d;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    public final String toString() {
        String string;
        String str = this.f45768a;
        byte[] bArr = this.f45769b;
        int i10 = this.f45771d;
        if (i10 != 0) {
            if (i10 == 1) {
                String str2 = y.f44830a;
                string = new String(bArr, StandardCharsets.UTF_8);
            } else if (i10 == 23) {
                go.k.g("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(com.bumptech.glide.c.m(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i10 == 67) {
                go.k.g("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                string = String.valueOf(com.bumptech.glide.c.m(bArr[0], bArr[1], bArr[2], bArr[3]));
            } else if (i10 == 75) {
                string = String.valueOf(Byte.toUnsignedInt(bArr[0]));
            } else if (i10 != 78) {
                string = y.Y(bArr);
            } else {
                string = String.valueOf(new l1.q(bArr).F());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbI = u.i("track types = ");
            new na.g(String.valueOf(',')).s(sbI, arrayListD.iterator());
            string = sbI.toString();
        } else {
            string = y.Y(bArr);
        }
        return l1.d.g("mdta: key=", str, ", value=", string);
    }
}
