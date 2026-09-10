package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0595u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0524q0 f30763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LevelPlayAdInfo f30764b;

    public C0595u0(AbstractC0524q0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f30763a = adUnit;
        this.f30764b = levelPlayAdInfo;
    }

    public final AbstractC0524q0 a() {
        return this.f30763a;
    }

    public final LevelPlayAdInfo b() {
        return this.f30764b;
    }

    public final LevelPlayAdInfo c() {
        return this.f30764b;
    }

    public final AbstractC0524q0 d() {
        return this.f30763a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0595u0)) {
            return false;
        }
        C0595u0 c0595u0 = (C0595u0) obj;
        return kotlin.jvm.internal.n.a(this.f30763a, c0595u0.f30763a) && kotlin.jvm.internal.n.a(this.f30764b, c0595u0.f30764b);
    }

    public int hashCode() {
        int iHashCode = this.f30763a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f30764b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f30763a + ", adInfo=" + this.f30764b + ")";
    }

    public /* synthetic */ C0595u0(AbstractC0524q0 abstractC0524q0, LevelPlayAdInfo levelPlayAdInfo, int i10, kotlin.jvm.internal.g gVar) {
        this(abstractC0524q0, (i10 & 2) != 0 ? null : levelPlayAdInfo);
    }

    public final C0595u0 a(AbstractC0524q0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        return new C0595u0(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ C0595u0 a(C0595u0 c0595u0, AbstractC0524q0 abstractC0524q0, LevelPlayAdInfo levelPlayAdInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC0524q0 = c0595u0.f30763a;
        }
        if ((i10 & 2) != 0) {
            levelPlayAdInfo = c0595u0.f30764b;
        }
        return c0595u0.a(abstractC0524q0, levelPlayAdInfo);
    }
}
