package gh;

import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f41903b;

    public e(Object obj, File file) {
        this.f41902a = obj;
        this.f41903b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return n.a(this.f41902a, eVar.f41902a) && n.a(this.f41903b, eVar.f41903b);
    }

    public final int hashCode() {
        Object obj = this.f41902a;
        return this.f41903b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "PendingWrite(data=" + this.f41902a + ", file=" + this.f41903b + ")";
    }
}
