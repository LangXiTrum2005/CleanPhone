package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdPreferences.Placement f41451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41452b;

    public rg(AdPreferences.Placement placement) {
        this.f41451a = placement;
        this.f41452b = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rg.class == obj.getClass()) {
            rg rgVar = (rg) obj;
            if (this.f41452b == rgVar.f41452b && this.f41451a == rgVar.f41451a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f41451a, Integer.valueOf(this.f41452b)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public rg(AdPreferences.Placement placement, int i2) {
        this.f41451a = placement;
        this.f41452b = i2;
    }
}
