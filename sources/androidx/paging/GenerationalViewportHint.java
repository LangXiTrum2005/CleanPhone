package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/GenerationalViewportHint;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GenerationalViewportHint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewportHint f7804b;

    public GenerationalViewportHint(int i2, ViewportHint hint) {
        Intrinsics.f(hint, "hint");
        this.f7803a = i2;
        this.f7804b = hint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerationalViewportHint)) {
            return false;
        }
        GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) obj;
        return this.f7803a == generationalViewportHint.f7803a && Intrinsics.a(this.f7804b, generationalViewportHint.f7804b);
    }

    public final int hashCode() {
        return this.f7804b.hashCode() + (Integer.hashCode(this.f7803a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f7803a + ", hint=" + this.f7804b + ')';
    }
}
