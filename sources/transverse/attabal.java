package transverse;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: LeftSheetDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f38929attabal;

    public attabal(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f38929attabal = sideSheetBehavior;
    }

    @Override // transverse.wireman
    public boolean apical(float f) {
        return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // transverse.wireman
    public void arytenoidectomy(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.f38929attabal.lotta()) {
            marginLayoutParams.leftMargin = i2;
        }
    }

    @Override // transverse.wireman
    public int attabal(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // transverse.wireman
    public int beachfront() {
        return this.f38929attabal.coffeecake();
    }

    @Override // transverse.wireman
    public int competently() {
        return -this.f38929attabal.permissivist();
    }

    @Override // transverse.wireman
    public int cutely() {
        return 1;
    }

    @Override // transverse.wireman
    public int dern(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // transverse.wireman
    public boolean formularize(View view) {
        return view.getRight() < (wireman() - marial()) / 2;
    }

    @Override // transverse.wireman
    public boolean impassible(float f, float f2) {
        return marial.attabal(f, f2) && Math.abs(f) > ((float) this.f38929attabal.sayid());
    }

    @Override // transverse.wireman
    public <V extends View> int impromptu(V v) {
        return v.getRight() + this.f38929attabal.coffeecake();
    }

    @Override // transverse.wireman
    public void kowloon(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // transverse.wireman
    public int marial() {
        return (-this.f38929attabal.permissivist()) - this.f38929attabal.coffeecake();
    }

    @Override // transverse.wireman
    public float saneness(int i) {
        float fMarial = marial();
        return (i - fMarial) / (wireman() - fMarial);
    }

    @Override // transverse.wireman
    public int taiyuan(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // transverse.wireman
    public boolean triweekly(View view, float f) {
        return Math.abs(((float) view.getLeft()) + (f * this.f38929attabal.treadless())) > this.f38929attabal.itchy();
    }

    @Override // transverse.wireman
    public int wireman() {
        return Math.max(0, this.f38929attabal.nosophobia() + this.f38929attabal.coffeecake());
    }
}
