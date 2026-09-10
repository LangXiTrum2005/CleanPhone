package r8;

import com.google.android.gms.internal.ads.z40;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f49480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f49481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f49482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f49483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f49484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f49485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f49486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f49487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f49488j;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f49479a = str;
        this.f49480b = num;
        this.f49481c = lVar;
        this.f49482d = j10;
        this.f49483e = j11;
        this.f49484f = map;
        this.f49485g = num2;
        this.f49486h = str2;
        this.f49487i = bArr;
        this.f49488j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f49484f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f49484f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final z40 c() {
        z40 z40Var = new z40();
        String str = this.f49479a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        z40Var.f22491a = str;
        z40Var.f22492b = this.f49480b;
        z40Var.f22497g = this.f49485g;
        z40Var.f22498h = this.f49486h;
        z40Var.f22499i = this.f49487i;
        z40Var.f22500j = this.f49488j;
        l lVar = this.f49481c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        z40Var.f22493c = lVar;
        z40Var.f22494d = Long.valueOf(this.f49482d);
        z40Var.f22495e = Long.valueOf(this.f49483e);
        z40Var.f22496f = new HashMap(this.f49484f);
        return z40Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str2 = hVar.f49486h;
            Integer num3 = hVar.f49485g;
            Integer num4 = hVar.f49480b;
            if (this.f49479a.equals(hVar.f49479a) && ((num = this.f49480b) != null ? num.equals(num4) : num4 == null) && this.f49481c.equals(hVar.f49481c) && this.f49482d == hVar.f49482d && this.f49483e == hVar.f49483e && this.f49484f.equals(hVar.f49484f) && ((num2 = this.f49485g) != null ? num2.equals(num3) : num3 == null) && ((str = this.f49486h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f49487i, hVar.f49487i) && Arrays.equals(this.f49488j, hVar.f49488j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f49479a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f49480b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f49481c.hashCode()) * 1000003;
        long j10 = this.f49482d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f49483e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f49484f.hashCode()) * 1000003;
        Integer num2 = this.f49485g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f49486h;
        return Arrays.hashCode(this.f49488j) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f49487i)) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f49479a + ", code=" + this.f49480b + ", encodedPayload=" + this.f49481c + ", eventMillis=" + this.f49482d + ", uptimeMillis=" + this.f49483e + ", autoMetadata=" + this.f49484f + ", productId=" + this.f49485g + ", pseudonymousId=" + this.f49486h + ", experimentIdsClear=" + Arrays.toString(this.f49487i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f49488j) + "}";
    }
}
