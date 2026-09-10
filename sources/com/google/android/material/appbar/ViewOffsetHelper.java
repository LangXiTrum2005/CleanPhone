package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class ViewOffsetHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f19103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19105c;
    public int d;

    public ViewOffsetHelper(View view) {
        this.f19103a = view;
    }

    public final void a() {
        int i2 = this.d;
        View view = this.f19103a;
        int top2 = i2 - (view.getTop() - this.f19104b);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        view.offsetTopAndBottom(top2);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f19105c));
    }

    public final boolean b(int i2) {
        if (this.d == i2) {
            return false;
        }
        this.d = i2;
        a();
        return true;
    }
}
