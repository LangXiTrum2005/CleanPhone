package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I3 f26130b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26131a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26131a = iArr;
        }
    }

    public G3(boolean z10, I3 i10) {
        this.f26129a = z10;
        this.f26130b = i10;
    }

    public final boolean a() {
        return this.f26129a;
    }

    public final I3 b() {
        return this.f26130b;
    }

    public final I3 c() {
        return this.f26130b;
    }

    public final boolean d() {
        return this.f26129a;
    }

    public final String e() {
        I3 i10 = this.f26130b;
        int i11 = i10 == null ? -1 : a.f26131a[i10.ordinal()];
        if (i11 == 1) {
            return "Placement delivery is false";
        }
        if (i11 == 2) {
            return "In pacing mode";
        }
        if (i11 != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G3)) {
            return false;
        }
        G3 g10 = (G3) obj;
        return this.f26129a == g10.f26129a && this.f26130b == g10.f26130b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f26129a;
        ?? r0 = z10;
        if (z10) {
            r0 = 1;
        }
        int i10 = r0 * 31;
        I3 i11 = this.f26130b;
        return i10 + (i11 == null ? 0 : i11.hashCode());
    }

    public String toString() {
        return "CappingStatus(isCapped=" + this.f26129a + " reason=" + this.f26130b + ")";
    }

    public /* synthetic */ G3(boolean z10, I3 i10, int i11, kotlin.jvm.internal.g gVar) {
        this(z10, (i11 & 2) != 0 ? null : i10);
    }

    public final G3 a(boolean z10, I3 i10) {
        return new G3(z10, i10);
    }

    public static /* synthetic */ G3 a(G3 g10, boolean z10, I3 i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = g10.f26129a;
        }
        if ((i11 & 2) != 0) {
            i10 = g10.f26130b;
        }
        return g10.a(z10, i10);
    }
}
