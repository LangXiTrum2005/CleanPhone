package com.chartboost.sdk.impl;

import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13455c;
    public final WindowInsetsCompat d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Insets f13456e;

    public af(int i2, int i3, float f, WindowInsetsCompat windowInsetsCompat, Insets insets) {
        this.f13453a = i2;
        this.f13454b = i3;
        this.f13455c = f;
        this.d = windowInsetsCompat;
        this.f13456e = insets;
    }

    public final float a() {
        return this.f13455c;
    }

    public final int b() {
        return this.f13454b;
    }

    public final Insets c() {
        return this.f13456e;
    }

    public final int d() {
        return this.f13453a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return this.f13453a == afVar.f13453a && this.f13454b == afVar.f13454b && Float.compare(this.f13455c, afVar.f13455c) == 0 && Intrinsics.a(this.d, afVar.d) && Intrinsics.a(this.f13456e, afVar.f13456e);
    }

    public int hashCode() {
        int iHashCode = (Float.hashCode(this.f13455c) + androidx.media3.extractor.text.ttml.a.a(this.f13454b, Integer.hashCode(this.f13453a) * 31, 31)) * 31;
        WindowInsetsCompat windowInsetsCompat = this.d;
        int iHashCode2 = (iHashCode + (windowInsetsCompat == null ? 0 : windowInsetsCompat.hashCode())) * 31;
        Insets insets = this.f13456e;
        return iHashCode2 + (insets != null ? insets.hashCode() : 0);
    }

    public String toString() {
        int i2 = this.f13453a;
        int i3 = this.f13454b;
        float f = this.f13455c;
        WindowInsetsCompat windowInsetsCompat = this.d;
        Insets insets = this.f13456e;
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "RenderingContainer(width=", ", height=", ", density=");
        sbP.append(f);
        sbP.append(", windowInsets=");
        sbP.append(windowInsetsCompat);
        sbP.append(", systemInsets=");
        sbP.append(insets);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ af(int i2, int i3, float f, WindowInsetsCompat windowInsetsCompat, Insets insets, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, f, (i4 & 8) != 0 ? null : windowInsetsCompat, (i4 & 16) != 0 ? null : insets);
    }
}
