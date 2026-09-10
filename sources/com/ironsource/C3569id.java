package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3569id {
    private final Integer a;
    private final String b;
    private final Boolean c;
    private final String d;
    private final Integer e;
    private final Boolean f;
    private final C3836y3 g;
    private final Tc h;

    public C3569id() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3569id)) {
            return false;
        }
        C3569id c3569id = (C3569id) obj;
        return Intrinsics.wireman(this.a, c3569id.a) && Intrinsics.wireman(this.b, c3569id.b) && Intrinsics.wireman(this.c, c3569id.c) && Intrinsics.wireman(this.d, c3569id.d) && Intrinsics.wireman(this.e, c3569id.e) && Intrinsics.wireman(this.f, c3569id.f) && Intrinsics.wireman(this.g, c3569id.g) && Intrinsics.wireman(this.h, c3569id.h);
    }

    public final Boolean f() {
        return this.f;
    }

    public final C3836y3 g() {
        return this.g;
    }

    public final Tc h() {
        return this.h;
    }

    public int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C3836y3 c3836y3 = this.g;
        int iHashCode7 = (iHashCode6 + (c3836y3 == null ? 0 : c3836y3.hashCode())) * 31;
        Tc tc = this.h;
        return iHashCode7 + (tc != null ? tc.hashCode() : 0);
    }

    public final C3836y3 i() {
        return this.g;
    }

    public final Boolean j() {
        return this.f;
    }

    public final Tc k() {
        return this.h;
    }

    public final Integer l() {
        return this.a;
    }

    public final String m() {
        return this.b;
    }

    public final Integer n() {
        return this.e;
    }

    public final String o() {
        return this.d;
    }

    public final Boolean p() {
        return this.c;
    }

    public String toString() {
        return "PlacementConfig2(placementId=" + this.a + ", placementName=" + this.b + ", isDefault=" + this.c + ", virtualItemName=" + this.d + ", virtualItemCount=" + this.e + ", delivery=" + this.f + ", capping=" + this.g + ", pacing=" + this.h + ")";
    }

    public C3569id(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C3836y3 c3836y3, Tc tc) {
        this.a = num;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = num2;
        this.f = bool2;
        this.g = c3836y3;
        this.h = tc;
    }

    public final C3569id a(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C3836y3 c3836y3, Tc tc) {
        return new C3569id(num, str, bool, str2, num2, bool2, c3836y3, tc);
    }

    public static /* synthetic */ C3569id a(C3569id c3569id, Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C3836y3 c3836y3, Tc tc, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c3569id.a;
        }
        if ((i & 2) != 0) {
            str = c3569id.b;
        }
        if ((i & 4) != 0) {
            bool = c3569id.c;
        }
        if ((i & 8) != 0) {
            str2 = c3569id.d;
        }
        if ((i & 16) != 0) {
            num2 = c3569id.e;
        }
        if ((i & 32) != 0) {
            bool2 = c3569id.f;
        }
        if ((i & 64) != 0) {
            c3836y3 = c3569id.g;
        }
        if ((i & 128) != 0) {
            tc = c3569id.h;
        }
        C3836y3 c3836y4 = c3836y3;
        Tc tc2 = tc;
        Integer num3 = num2;
        Boolean bool3 = bool2;
        return c3569id.a(num, str, bool, str2, num3, bool3, c3836y4, tc2);
    }

    public /* synthetic */ C3569id(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C3836y3 c3836y3, Tc tc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c3836y3, (i & 128) != 0 ? null : tc);
    }
}
