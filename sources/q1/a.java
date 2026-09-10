package q1;

import f2.c0;
import i1.p0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f48516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f48518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0 f48520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f48522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f48523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f48524j;

    public a(long j10, p0 p0Var, int i10, c0 c0Var, long j11, p0 p0Var2, int i11, c0 c0Var2, long j12, long j13) {
        this.f48515a = j10;
        this.f48516b = p0Var;
        this.f48517c = i10;
        this.f48518d = c0Var;
        this.f48519e = j11;
        this.f48520f = p0Var2;
        this.f48521g = i11;
        this.f48522h = c0Var2;
        this.f48523i = j12;
        this.f48524j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f48515a == aVar.f48515a && this.f48517c == aVar.f48517c && this.f48519e == aVar.f48519e && this.f48521g == aVar.f48521g && this.f48523i == aVar.f48523i && this.f48524j == aVar.f48524j && Objects.equals(this.f48516b, aVar.f48516b) && Objects.equals(this.f48518d, aVar.f48518d) && Objects.equals(this.f48520f, aVar.f48520f) && Objects.equals(this.f48522h, aVar.f48522h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f48515a), this.f48516b, Integer.valueOf(this.f48517c), this.f48518d, Long.valueOf(this.f48519e), this.f48520f, Integer.valueOf(this.f48521g), this.f48522h, Long.valueOf(this.f48523i), Long.valueOf(this.f48524j));
    }
}
