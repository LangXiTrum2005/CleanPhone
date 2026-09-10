package wa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f53009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f53011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f53012d;

    public c0(h hVar, String str, h hVar2, c cVar) {
        this.f53009a = hVar;
        this.f53010b = str;
        this.f53011c = hVar2;
        this.f53012d = cVar;
    }

    @Override // va.i
    public final boolean a() {
        return this.f53009a != h.F;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f53011c.equals(this.f53011c) && c0Var.f53012d.equals(this.f53012d) && c0Var.f53010b.equals(this.f53010b) && c0Var.f53009a.equals(this.f53009a);
    }

    public final int hashCode() {
        return Objects.hash(c0.class, this.f53010b, this.f53011c, this.f53012d, this.f53009a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f53010b + ", dekParsingStrategy: " + this.f53011c + ", dekParametersForNewKeys: " + this.f53012d + ", variant: " + this.f53009a + ")";
    }
}
