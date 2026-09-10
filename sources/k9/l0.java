package k9;

import android.content.ComponentName;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f44473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44474d;

    public l0(ComponentName componentName) {
        this.f44471a = null;
        this.f44472b = null;
        c0.h(componentName);
        this.f44473c = componentName;
        this.f44474d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return c0.l(this.f44471a, l0Var.f44471a) && c0.l(this.f44472b, l0Var.f44472b) && c0.l(this.f44473c, l0Var.f44473c) && this.f44474d == l0Var.f44474d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44471a, this.f44472b, this.f44473c, 4225, Boolean.valueOf(this.f44474d)});
    }

    public final String toString() {
        String str = this.f44471a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f44473c;
        c0.h(componentName);
        return componentName.flattenToString();
    }

    public l0(String str, boolean z10) {
        c0.e(str);
        this.f44471a = str;
        c0.e("com.google.android.gms");
        this.f44472b = "com.google.android.gms";
        this.f44473c = null;
        this.f44474d = z10;
    }
}
