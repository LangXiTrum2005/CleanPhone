package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.premeiotic;

/* JADX INFO: compiled from: ViewOffsetHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final View f19525attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f19526beachfront = true;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f19527competently = true;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f19528dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f19529marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f19530saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f19531wireman;

    public wireman(View view) {
        this.f19525attabal = view;
    }

    public void attabal() {
        View view = this.f19525attabal;
        premeiotic.splinterproof(view, this.f19531wireman - (view.getTop() - this.f19530saneness));
        View view2 = this.f19525attabal;
        premeiotic.mathsort(view2, this.f19529marial - (view2.getLeft() - this.f19528dern));
    }

    public boolean beachfront(int i) {
        if (!this.f19526beachfront || this.f19531wireman == i) {
            return false;
        }
        this.f19531wireman = i;
        attabal();
        return true;
    }

    public int dern() {
        return this.f19531wireman;
    }

    public boolean marial(int i) {
        if (!this.f19527competently || this.f19529marial == i) {
            return false;
        }
        this.f19529marial = i;
        attabal();
        return true;
    }

    public int saneness() {
        return this.f19530saneness;
    }

    public void wireman() {
        this.f19530saneness = this.f19525attabal.getTop();
        this.f19528dern = this.f19525attabal.getLeft();
    }
}
