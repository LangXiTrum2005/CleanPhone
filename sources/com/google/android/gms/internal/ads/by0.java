package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class by0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdFormat f12923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12924c;

    public /* synthetic */ by0(ay0 ay0Var) {
        this.f12922a = (String) ay0Var.f12537b;
        this.f12923b = (AdFormat) ay0Var.f12539d;
        this.f12924c = (String) ay0Var.f12538c;
    }

    public final String a() {
        AdFormat adFormat = this.f12923b;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof by0) {
            by0 by0Var = (by0) obj;
            if (this.f12922a.equals(by0Var.f12922a) && (adFormat = this.f12923b) != null && (adFormat2 = by0Var.f12923b) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12922a, this.f12923b);
    }
}
