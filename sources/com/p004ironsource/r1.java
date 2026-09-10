package com.p004ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ironsource/r1;", "", "Lcom/ironsource/n1;", "a", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "b", "adUnit", "adInfo", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/n1;", "d", "()Lcom/ironsource/n1;", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "c", "()Lcom/unity3d/mediation/LevelPlayAdInfo;", "<init>", "(Lcom/ironsource/n1;Lcom/unity3d/mediation/LevelPlayAdInfo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n1 adUnit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LevelPlayAdInfo adInfo;

    public r1(n1 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.f(adUnit, "adUnit");
        this.adUnit = adUnit;
        this.adInfo = levelPlayAdInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n1 getAdUnit() {
        return this.adUnit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    public final LevelPlayAdInfo c() {
        return this.adInfo;
    }

    public final n1 d() {
        return this.adUnit;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) other;
        return Intrinsics.a(this.adUnit, r1Var.adUnit) && Intrinsics.a(this.adInfo, r1Var.adInfo);
    }

    public int hashCode() {
        int iHashCode = this.adUnit.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.adInfo;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.adUnit + ", adInfo=" + this.adInfo + ')';
    }

    public /* synthetic */ r1(n1 n1Var, LevelPlayAdInfo levelPlayAdInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(n1Var, (i2 & 2) != 0 ? null : levelPlayAdInfo);
    }

    public final r1 a(n1 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        return new r1(adUnit, adInfo);
    }

    public static /* synthetic */ r1 a(r1 r1Var, n1 n1Var, LevelPlayAdInfo levelPlayAdInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            n1Var = r1Var.adUnit;
        }
        if ((i2 & 2) != 0) {
            levelPlayAdInfo = r1Var.adInfo;
        }
        return r1Var.a(n1Var, levelPlayAdInfo);
    }
}
