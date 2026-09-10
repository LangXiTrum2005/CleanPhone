package bc;

import com.applovin.impl.ca;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5542c;

    public c(String str, Map additionalCustomKeys, long j10) {
        kotlin.jvm.internal.n.f(additionalCustomKeys, "additionalCustomKeys");
        this.f5540a = str;
        this.f5541b = j10;
        this.f5542c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.n.a(this.f5540a, cVar.f5540a) && this.f5541b == cVar.f5541b && kotlin.jvm.internal.n.a(this.f5542c, cVar.f5542c);
    }

    public final int hashCode() {
        return this.f5542c.hashCode() + ca.j(this.f5541b, this.f5540a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f5540a + ", timestamp=" + this.f5541b + ", additionalCustomKeys=" + this.f5542c + ')';
    }
}
