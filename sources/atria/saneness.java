package atria;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: HideBottomViewOnScrollDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends beachfront {
    @Override // atria.beachfront
    public <V extends View> int attabal(V v, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // atria.beachfront
    public int dern() {
        return 1;
    }

    @Override // atria.beachfront
    public <V extends View> void marial(V v, int i) {
        v.setTranslationY(i);
    }

    @Override // atria.beachfront
    public int saneness() {
        return 0;
    }

    @Override // atria.beachfront
    public <V extends View> ViewPropertyAnimator wireman(V v, int i) {
        return v.animate().translationY(i);
    }
}
