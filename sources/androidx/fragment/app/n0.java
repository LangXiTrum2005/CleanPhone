package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f4402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4406e;

    public n0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f4406e = true;
        this.f4402a = viewGroup;
        this.f4403b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f4406e = true;
        if (this.f4404c) {
            return !this.f4405d;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f4404c = true;
            m0.x.a(this.f4402a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f4404c;
        ViewGroup viewGroup = this.f4402a;
        if (z10 || !this.f4406e) {
            viewGroup.endViewTransition(this.f4403b);
            this.f4405d = true;
        } else {
            this.f4406e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f10) {
        this.f4406e = true;
        if (this.f4404c) {
            return !this.f4405d;
        }
        if (!super.getTransformation(j10, transformation, f10)) {
            this.f4404c = true;
            m0.x.a(this.f4402a, this);
        }
        return true;
    }
}
