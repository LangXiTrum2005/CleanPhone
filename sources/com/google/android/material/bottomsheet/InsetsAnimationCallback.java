package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class InsetsAnimationCallback extends WindowInsetsAnimationCompat.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f19139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19140c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f19141e = new int[2];

    public InsetsAnimationCallback(View view) {
        this.f19139b = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void a() {
        this.f19139b.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void b() {
        View view = this.f19139b;
        int[] iArr = this.f19141e;
        view.getLocationOnScreen(iArr);
        this.f19140c = iArr[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat c(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) it.next();
            if ((windowInsetsAnimationCompat.b() & 8) != 0) {
                this.f19139b.setTranslationY(AnimationUtils.c(windowInsetsAnimationCompat.a(), this.d, 0));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsAnimationCompat.BoundsCompat d(WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        View view = this.f19139b;
        int[] iArr = this.f19141e;
        view.getLocationOnScreen(iArr);
        int i2 = this.f19140c - iArr[1];
        this.d = i2;
        view.setTranslationY(i2);
        return boundsCompat;
    }
}
