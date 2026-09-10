package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4986x5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5206a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C4986x5(int i, Object obj, Object obj2) {
        this.f5206a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f5206a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((AppBarLayout) obj2).lambda$initializeLiftOnScrollWithElevation$1((MaterialShapeDrawable) obj, valueAnimator);
                break;
            default:
                ((ExpandCollapseAnimationHelper) obj2).lambda$getExpandCollapseAnimator$0((Rect) obj, valueAnimator);
                break;
        }
    }
}
