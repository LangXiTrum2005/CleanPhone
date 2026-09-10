package com.google.android.material.color.utilities;

import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialDynamicColors {
    public static DynamicColor c() {
        return new DynamicColor("inverse_surface", new c(21), new c(22), false, null, null, null);
    }

    public final DynamicColor a() {
        return new DynamicColor("error", new c(12), new c(13), true, new a(this, 2), new ContrastCurve(), new a(this, 14));
    }

    public final DynamicColor b() {
        return new DynamicColor("error_container", new c(27), new c(28), true, new a(this, 2), new ContrastCurve(), new a(this, 16));
    }

    public final DynamicColor d() {
        return new DynamicColor("primary", new N.a(2), new N.a(3), true, new a(this, 2), new ContrastCurve(), new a(this, 0));
    }

    public final DynamicColor e() {
        return new DynamicColor("primary_container", new N.a(20), new N.a(21), true, new a(this, 2), new ContrastCurve(), new a(this, 4));
    }

    public final DynamicColor f() {
        return new DynamicColor(d9.h.f24718Y, new b(28), new b(29), true, new a(this, 2), new ContrastCurve(), new a(this, 10));
    }

    public final DynamicColor g() {
        return new DynamicColor("secondary_container", new N.a(14), new N.a(15), true, new a(this, 2), new ContrastCurve(), new a(this, 3));
    }

    public final DynamicColor h() {
        return new DynamicColor("tertiary", new N.a(4), new N.a(5), true, new a(this, 2), new ContrastCurve(), new a(this, 1));
    }

    public final DynamicColor i() {
        return new DynamicColor("tertiary_container", new b(23), new b(25), true, new a(this, 2), new ContrastCurve(), new a(this, 8));
    }
}
