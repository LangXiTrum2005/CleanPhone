package xf;

import com.applovin.impl.ca;
import java.nio.ShortBuffer;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f53784e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShortBuffer f53785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f53786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f53787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jk.a f53788d;

    static {
        ShortBuffer shortBufferAllocate = ShortBuffer.allocate(0);
        n.e(shortBufferAllocate, "allocate(...)");
        f53784e = new c(shortBufferAllocate, 0L, 0.0d, new defpackage.c(24));
    }

    public c(ShortBuffer shortBuffer, long j10, double d10, jk.a aVar) {
        this.f53785a = shortBuffer;
        this.f53786b = j10;
        this.f53787c = d10;
        this.f53788d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.a(this.f53785a, cVar.f53785a) && this.f53786b == cVar.f53786b && Double.compare(this.f53787c, cVar.f53787c) == 0 && n.a(this.f53788d, cVar.f53788d);
    }

    public final int hashCode() {
        return this.f53788d.hashCode() + ((Double.hashCode(this.f53787c) + ca.j(this.f53786b, this.f53785a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "Chunk(buffer=" + this.f53785a + ", timeUs=" + this.f53786b + ", timeStretch=" + this.f53787c + ", release=" + this.f53788d + ")";
    }
}
