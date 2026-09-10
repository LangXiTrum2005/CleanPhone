package atria;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: HideRightViewOnScrollDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman extends beachfront {
    @Override // atria.beachfront
    public <V extends View> int attabal(V v, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // atria.beachfront
    public int dern() {
        return 0;
    }

    @Override // atria.beachfront
    public <V extends View> void marial(V v, int i) {
        v.setTranslationX(i);
    }

    @Override // atria.beachfront
    public int saneness() {
        return 0;
    }

    @Override // atria.beachfront
    public <V extends View> ViewPropertyAnimator wireman(V v, int i) {
        return v.animate().translationX(i);
    }
}
