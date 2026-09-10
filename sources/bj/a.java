package bj;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import defpackage.e;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f5705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f5707c;

    public a(int i10, Activity activity, k0 k0Var) {
        this.f5705a = activity;
        this.f5706b = i10;
        this.f5707c = k0Var;
        k0Var.f47269b = this;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        Activity activity = this.f5705a;
        int i10 = this.f5706b;
        View viewFindViewById = activity.findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById.getContentSensitivity();
        }
        throw new IllegalArgumentException(e.h(i10, "FlutterView with ID ", "not found"));
    }

    public final void b(int i10) {
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        Activity activity = this.f5705a;
        int i11 = this.f5706b;
        View viewFindViewById = activity.findViewById(i11);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException(e.h(i11, "FlutterView with ID ", "not found"));
        }
        if (viewFindViewById.getContentSensitivity() == i10) {
            return;
        }
        viewFindViewById.setContentSensitivity(i10);
        viewFindViewById.invalidate();
    }
}
