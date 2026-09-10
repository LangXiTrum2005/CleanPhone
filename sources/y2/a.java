package y2;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.b0;
import i1.d0;
import i1.o;
import i1.p;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f54186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f54187h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f54191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f54192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54193f;

    static {
        o oVar = new o();
        oVar.f42600m = d0.n(MimeTypes.APPLICATION_ID3);
        f54186g = new p(oVar);
        o oVar2 = new o();
        oVar2.f42600m = d0.n(MimeTypes.APPLICATION_SCTE35);
        f54187h = new p(oVar2);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f54188a = str;
        this.f54189b = str2;
        this.f54190c = j10;
        this.f54191d = j11;
        this.f54192e = bArr;
    }

    @Override // i1.b0
    public final p a() {
        String str = this.f54188a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f54187h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f54186g;
            default:
                return null;
        }
    }

    @Override // i1.b0
    public final byte[] c() {
        if (a() != null) {
            return this.f54192e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f54190c == aVar.f54190c && this.f54191d == aVar.f54191d && Objects.equals(this.f54188a, aVar.f54188a) && Objects.equals(this.f54189b, aVar.f54189b) && Arrays.equals(this.f54192e, aVar.f54192e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f54193f == 0) {
            String str = this.f54188a;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f54189b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f54190c;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f54191d;
            this.f54193f = Arrays.hashCode(this.f54192e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f54193f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f54188a + ", id=" + this.f54191d + ", durationMs=" + this.f54190c + ", value=" + this.f54189b;
    }
}
