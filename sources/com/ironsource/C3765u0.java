package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3765u0 {
    private final AbstractC3698q0 a;
    private final LevelPlayAdInfo b;

    public C3765u0(AbstractC3698q0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = adUnit;
        this.b = levelPlayAdInfo;
    }

    public final AbstractC3698q0 a() {
        return this.a;
    }

    public final LevelPlayAdInfo b() {
        return this.b;
    }

    public final LevelPlayAdInfo c() {
        return this.b;
    }

    public final AbstractC3698q0 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3765u0)) {
            return false;
        }
        C3765u0 c3765u0 = (C3765u0) obj;
        return Intrinsics.wireman(this.a, c3765u0.a) && Intrinsics.wireman(this.b, c3765u0.b);
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.a + ", adInfo=" + this.b + ")";
    }

    public /* synthetic */ C3765u0(AbstractC3698q0 abstractC3698q0, LevelPlayAdInfo levelPlayAdInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3698q0, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    public final C3765u0 a(AbstractC3698q0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C3765u0(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ C3765u0 a(C3765u0 c3765u0, AbstractC3698q0 abstractC3698q0, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC3698q0 = c3765u0.a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c3765u0.b;
        }
        return c3765u0.a(abstractC3698q0, levelPlayAdInfo);
    }
}
