package A;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.inmobi.media.C2943b1;
import com.inmobi.media.C3065i8;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class V implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3160Y;
    public final /* synthetic */ View Z;

    public /* synthetic */ V(View view, int i2, Object obj) {
        this.X = i2;
        this.f3160Y = obj;
        this.Z = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.X) {
            case 0:
                C2943b1.a((C3065i8) this.f3160Y, this.Z, valueAnimator);
                break;
            case 1:
                C2943b1.b((C3065i8) this.f3160Y, this.Z, valueAnimator);
                break;
            default:
                ((ViewPropertyAnimatorUpdateListener) this.f3160Y).a();
                break;
        }
    }
}
