package q8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f48875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f48876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f48878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f48880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f48881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f48882i;

    public s(long j10, Integer num, a0 a0Var, long j11, byte[] bArr, String str, long j12, i0 i0Var, b0 b0Var) {
        this.f48874a = j10;
        this.f48875b = num;
        this.f48876c = a0Var;
        this.f48877d = j11;
        this.f48878e = bArr;
        this.f48879f = str;
        this.f48880g = j12;
        this.f48881h = i0Var;
        this.f48882i = b0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        a0 a0Var;
        String str;
        i0 i0Var;
        b0 b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            b0 b0Var2 = sVar.f48882i;
            i0 i0Var2 = sVar.f48881h;
            String str2 = sVar.f48879f;
            a0 a0Var2 = sVar.f48876c;
            Integer num2 = sVar.f48875b;
            if (this.f48874a == sVar.f48874a && ((num = this.f48875b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.f48876c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.f48877d == sVar.f48877d) {
                if (Arrays.equals(this.f48878e, e0Var instanceof s ? ((s) e0Var).f48878e : sVar.f48878e) && ((str = this.f48879f) != null ? str.equals(str2) : str2 == null) && this.f48880g == sVar.f48880g && ((i0Var = this.f48881h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.f48882i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48874a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f48875b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.f48876c;
        int iHashCode2 = (iHashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j11 = this.f48877d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f48878e)) * 1000003;
        String str = this.f48879f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f48880g;
        int i11 = (iHashCode4 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        i0 i0Var = this.f48881h;
        int iHashCode5 = (i11 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.f48882i;
        return iHashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f48874a + ", eventCode=" + this.f48875b + ", complianceData=" + this.f48876c + ", eventUptimeMs=" + this.f48877d + ", sourceExtension=" + Arrays.toString(this.f48878e) + ", sourceExtensionJsonProto3=" + this.f48879f + ", timezoneOffsetSeconds=" + this.f48880g + ", networkConnectionInfo=" + this.f48881h + ", experimentIds=" + this.f48882i + "}";
    }
}
