package sequal;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: ExpandableWidgetHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final View f37517attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f37519saneness = false;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f37518dern = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public saneness(attabal attabalVar) {
        this.f37517attabal = (View) attabalVar;
    }

    public final void attabal() {
        ViewParent parent = this.f37517attabal.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).beachfront(this.f37517attabal);
        }
    }

    public boolean beachfront(boolean z) {
        if (this.f37519saneness == z) {
            return false;
        }
        this.f37519saneness = z;
        attabal();
        return true;
    }

    public void competently(int i) {
        this.f37518dern = i;
    }

    public boolean dern() {
        return this.f37519saneness;
    }

    public Bundle marial() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f37519saneness);
        bundle.putInt("expandedComponentIdHint", this.f37518dern);
        return bundle;
    }

    public int saneness() {
        return this.f37518dern;
    }

    public void wireman(Bundle bundle) {
        this.f37519saneness = bundle.getBoolean("expanded", false);
        this.f37518dern = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f37519saneness) {
            attabal();
        }
    }
}
