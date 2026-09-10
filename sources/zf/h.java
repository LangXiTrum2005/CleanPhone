package zf;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f54949d = new h(0, null, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f54950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54952c;

    public h(long j10, ByteBuffer byteBuffer, int i10) {
        this.f54950a = byteBuffer;
        this.f54951b = i10;
        this.f54952c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return n.a(this.f54950a, hVar.f54950a) && this.f54951b == hVar.f54951b && this.f54952c == hVar.f54952c;
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.f54950a;
        return Long.hashCode(this.f54952c) + wi.d.f(this.f54951b, (byteBuffer == null ? 0 : byteBuffer.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EncoderData(buffer=");
        sb2.append(this.f54950a);
        sb2.append(", id=");
        sb2.append(this.f54951b);
        sb2.append(", timeUs=");
        return defpackage.e.r(sb2, this.f54952c, ")");
    }
}
