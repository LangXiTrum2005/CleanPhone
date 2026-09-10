package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: NestedScrollingParentHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class kattegat {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f9353attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f9354saneness;

    public kattegat(ViewGroup viewGroup) {
    }

    public int attabal() {
        return this.f9353attabal | this.f9354saneness;
    }

    public void dern(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f9354saneness = i;
        } else {
            this.f9353attabal = i;
        }
    }

    public void saneness(View view, View view2, int i) {
        dern(view, view2, i, 0);
    }

    public void wireman(View view, int i) {
        if (i == 1) {
            this.f9354saneness = 0;
        } else {
            this.f9353attabal = 0;
        }
    }
}
