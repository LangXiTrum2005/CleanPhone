package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: DrawerLayoutUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int f20625attabal = Color.alpha(-1728053248);

    /* JADX INFO: compiled from: DrawerLayoutUtils.java */
    public class attabal extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ DrawerLayout f20626attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ View f20627saneness;

        public attabal(DrawerLayout drawerLayout, View view) {
            this.f20626attabal = drawerLayout;
            this.f20627saneness = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f20626attabal.marial(this.f20627saneness, false);
            this.f20626attabal.setScrimColor(-1728053248);
        }
    }

    public static ValueAnimator.AnimatorUpdateListener dern(final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.saneness
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                drawerLayout.setScrimColor(monroe.dern.apical(-1728053248, phrasemonger.saneness.dern(dern.f20625attabal, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }

    public static Animator.AnimatorListener saneness(DrawerLayout drawerLayout, View view) {
        return new attabal(drawerLayout, view);
    }
}
