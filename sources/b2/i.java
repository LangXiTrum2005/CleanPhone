package b2;

import cc.a2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f5293g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f5295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f5299f;

    public i(h hVar) {
        this.f5294a = hVar.f5285a;
        this.f5295b = hVar.f5286b;
        this.f5296c = hVar.f5287c;
        this.f5297d = hVar.f5288d;
        this.f5298e = hVar.f5289e;
        this.f5299f = hVar.f5290f;
    }

    public static int a(int i10) {
        return a2.D(i10 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f5295b == iVar.f5295b && this.f5296c == iVar.f5296c && this.f5294a == iVar.f5294a && this.f5297d == iVar.f5297d && this.f5298e == iVar.f5298e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f5295b) * 31) + this.f5296c) * 31) + (this.f5294a ? 1 : 0)) * 31;
        long j10 = this.f5297d;
        return ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f5298e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f5295b), Integer.valueOf(this.f5296c), Long.valueOf(this.f5297d), Integer.valueOf(this.f5298e), Boolean.valueOf(this.f5294a)};
        String str = l1.y.f44830a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
