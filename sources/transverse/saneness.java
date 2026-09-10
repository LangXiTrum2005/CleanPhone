package transverse;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: RightSheetDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f38938attabal;

    public saneness(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f38938attabal = sideSheetBehavior;
    }

    @Override // transverse.wireman
    public boolean apical(float f) {
        return f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // transverse.wireman
    public void arytenoidectomy(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int iLotta = this.f38938attabal.lotta();
        if (i <= iLotta) {
            marginLayoutParams.rightMargin = iLotta - i;
        }
    }

    @Override // transverse.wireman
    public int attabal(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // transverse.wireman
    public int beachfront() {
        return this.f38938attabal.lotta();
    }

    @Override // transverse.wireman
    public int competently() {
        return wireman();
    }

    @Override // transverse.wireman
    public int cutely() {
        return 0;
    }

    @Override // transverse.wireman
    public int dern(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // transverse.wireman
    public boolean formularize(View view) {
        return view.getLeft() > (marial() + wireman()) / 2;
    }

    @Override // transverse.wireman
    public boolean impassible(float f, float f2) {
        return marial.attabal(f, f2) && Math.abs(f) > ((float) this.f38938attabal.sayid());
    }

    @Override // transverse.wireman
    public <V extends View> int impromptu(V v) {
        return v.getLeft() - this.f38938attabal.coffeecake();
    }

    @Override // transverse.wireman
    public void kowloon(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // transverse.wireman
    public int marial() {
        return this.f38938attabal.lotta();
    }

    @Override // transverse.wireman
    public float saneness(int i) {
        float fMarial = marial();
        return (fMarial - i) / (fMarial - wireman());
    }

    @Override // transverse.wireman
    public int taiyuan(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // transverse.wireman
    public boolean triweekly(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.f38938attabal.treadless())) > this.f38938attabal.itchy();
    }

    @Override // transverse.wireman
    public int wireman() {
        return Math.max(0, (marial() - this.f38938attabal.permissivist()) - this.f38938attabal.coffeecake());
    }
}
