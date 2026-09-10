package io.flutter.view;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43511b;

    public l(View view, int i10) {
        this.f43510a = view;
        this.f43511b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f43511b == lVar.f43511b && this.f43510a.equals(lVar.f43510a);
    }

    public final int hashCode() {
        return ((this.f43510a.hashCode() + 31) * 31) + this.f43511b;
    }
}
