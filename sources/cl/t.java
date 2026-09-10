package cl;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends bm.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f6595c;

    public /* synthetic */ t(AbstractCollection abstractCollection, int i10) {
        this.f6594b = i10;
        this.f6595c = abstractCollection;
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // bm.m
    public final void b(zk.c fakeOverride) {
        switch (this.f6594b) {
            case 0:
                if (fakeOverride == null) {
                    a(0);
                    throw null;
                }
                bm.l.r(fakeOverride, null);
                ((LinkedHashSet) this.f6595c).add(fakeOverride);
                return;
            default:
                kotlin.jvm.internal.n.f(fakeOverride, "fakeOverride");
                bm.l.r(fakeOverride, null);
                ((ArrayList) this.f6595c).add(fakeOverride);
                return;
        }
    }

    @Override // bm.m
    public final void d(zk.c cVar, zk.c fromCurrent) {
        switch (this.f6594b) {
            case 0:
                if (fromCurrent != null) {
                    return;
                }
                a(2);
                throw null;
            default:
                kotlin.jvm.internal.n.f(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof y) {
                    ((y) fromCurrent).Q0(zk.o.f54988a, cVar);
                    return;
                }
                return;
        }
    }
}
