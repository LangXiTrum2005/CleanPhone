package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3648n3 {
    private final int a;
    private final String b;
    private final boolean c;
    private final C3479dd d;

    public AbstractC3648n3(int i, String placementName, boolean z, C3479dd c3479dd) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.a = i;
        this.b = placementName;
        this.c = z;
        this.d = c3479dd;
    }

    public final C3479dd a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public String toString() {
        return "placement name: " + this.b;
    }

    public final boolean a(int i) {
        return this.a == i;
    }

    public /* synthetic */ AbstractC3648n3(int i, String str, boolean z, C3479dd c3479dd, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c3479dd);
    }
}
