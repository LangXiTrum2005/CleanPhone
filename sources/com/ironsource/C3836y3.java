package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3836y3 {
    private final Boolean a;
    private final String b;
    private final Integer c;

    public C3836y3() {
        this(null, null, null, 7, null);
    }

    public final Boolean a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final Boolean d() {
        return this.a;
    }

    public final Integer e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3836y3)) {
            return false;
        }
        C3836y3 c3836y3 = (C3836y3) obj;
        return Intrinsics.wireman(this.a, c3836y3.a) && Intrinsics.wireman(this.b, c3836y3.b) && Intrinsics.wireman(this.c, c3836y3.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CappingConfig2(enabled=" + this.a + ", unit=" + this.b + ", maxImpressions=" + this.c + ")";
    }

    public C3836y3(Boolean bool, String str, Integer num) {
        this.a = bool;
        this.b = str;
        this.c = num;
    }

    public final C3836y3 a(Boolean bool, String str, Integer num) {
        return new C3836y3(bool, str, num);
    }

    public static /* synthetic */ C3836y3 a(C3836y3 c3836y3, Boolean bool, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c3836y3.a;
        }
        if ((i & 2) != 0) {
            str = c3836y3.b;
        }
        if ((i & 4) != 0) {
            num = c3836y3.c;
        }
        return c3836y3.a(bool, str, num);
    }

    public /* synthetic */ C3836y3(Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
