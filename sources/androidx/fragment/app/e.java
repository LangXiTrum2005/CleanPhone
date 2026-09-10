package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f4292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f4295d;

    public e(c2 c2Var, ViewGroup viewGroup, View view, f fVar) {
        this.f4292a = c2Var;
        this.f4293b = viewGroup;
        this.f4294c = view;
        this.f4295d = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.n.f(animation, "animation");
        ViewGroup viewGroup = this.f4293b;
        viewGroup.post(new d(viewGroup, this.f4294c, this.f4295d, 0));
        if (g1.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4292a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.n.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.n.f(animation, "animation");
        if (g1.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4292a + " has reached onAnimationStart.");
        }
    }
}
