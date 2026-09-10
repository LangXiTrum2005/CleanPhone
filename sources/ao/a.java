package ao;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f5053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5054d;

    public a(String name, boolean z10) {
        n.f(name, "name");
        this.f5051a = name;
        this.f5052b = z10;
        this.f5054d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f5051a;
    }
}
