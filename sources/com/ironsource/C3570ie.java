package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3570ie {
    private final String a;
    private final String b;
    private final List<IronSource.a> c;

    public C3570ie(String appKey, String str, List<IronSource.a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.a = appKey;
        this.b = str;
        this.c = legacyAdFormats;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<IronSource.a> c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final List<IronSource.a> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3570ie)) {
            return false;
        }
        C3570ie c3570ie = (C3570ie) obj;
        return Intrinsics.wireman(this.a, c3570ie.a) && Intrinsics.wireman(this.b, c3570ie.b) && Intrinsics.wireman(this.c, c3570ie.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "SdkInitRequest(appKey=" + this.a + ", userId=" + this.b + ", legacyAdFormats=" + this.c + ")";
    }

    public final C3570ie a(String appKey, String str, List<IronSource.a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new C3570ie(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3570ie a(C3570ie c3570ie, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3570ie.a;
        }
        if ((i & 2) != 0) {
            str2 = c3570ie.b;
        }
        if ((i & 4) != 0) {
            list = c3570ie.c;
        }
        return c3570ie.a(str, str2, list);
    }

    public final void a(List<? extends IronSource.a> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.c.clear();
        this.c.addAll(adFormats);
    }

    public /* synthetic */ C3570ie(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }
}
