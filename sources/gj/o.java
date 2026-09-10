package gj;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f41956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41958c;

    public o(ComponentName componentName) {
        this.f41956a = componentName;
    }

    public abstract void a(Intent intent);

    public final void b(int i10) {
        if (!this.f41957b) {
            this.f41957b = true;
            this.f41958c = i10;
        } else {
            if (this.f41958c == i10) {
                return;
            }
            StringBuilder sbU = defpackage.e.u(i10, "Given job ID ", " is different than previous ");
            sbU.append(this.f41958c);
            throw new IllegalArgumentException(sbU.toString());
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
