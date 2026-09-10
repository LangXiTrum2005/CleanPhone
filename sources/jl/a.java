package jl;

import bm.l;
import bm.m;
import java.util.Collection;
import java.util.LinkedHashSet;
import lm.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f43961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f43962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f43963d;

    public a(k kVar, LinkedHashSet linkedHashSet, boolean z10) {
        this.f43961b = kVar;
        this.f43962c = linkedHashSet;
        this.f43963d = z10;
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i10 == 3) {
            objArr[0] = "member";
        } else if (i10 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else if (i10 == 3 || i10 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // bm.m
    public final void b(zk.c cVar) {
        if (cVar == null) {
            a(0);
            throw null;
        }
        l.r(cVar, new cl.a(this, 3));
        this.f43962c.add(cVar);
    }

    @Override // bm.m
    public final void d(zk.c cVar, zk.c cVar2) {
        if (cVar2 != null) {
            return;
        }
        a(2);
        throw null;
    }

    @Override // bm.m
    public final void p(zk.c cVar, Collection collection) {
        if (cVar == null) {
            a(3);
            throw null;
        }
        if (!this.f43963d || cVar.getKind() == 2) {
            cVar.t0(collection);
        }
    }
}
