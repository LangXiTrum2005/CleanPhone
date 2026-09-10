package ag;

import com.applovin.impl.ca;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f3575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jk.a f3578d;

    public g(ByteBuffer buffer, long j10, int i10, jk.a aVar) {
        n.f(buffer, "buffer");
        this.f3575a = buffer;
        this.f3576b = j10;
        this.f3577c = i10;
        this.f3578d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return n.a(this.f3575a, gVar.f3575a) && this.f3576b == gVar.f3576b && this.f3577c == gVar.f3577c && n.a(this.f3578d, gVar.f3578d);
    }

    public final int hashCode() {
        return this.f3578d.hashCode() + wi.d.f(this.f3577c, ca.j(this.f3576b, this.f3575a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "WriterData(buffer=" + this.f3575a + ", timeUs=" + this.f3576b + ", flags=" + this.f3577c + ", release=" + this.f3578d + ")";
    }
}
