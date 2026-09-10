package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: SearchBarAnimationHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Animator f20875marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public Animator f20877wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<Object> f20871attabal = new LinkedHashSet();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<AnimatorListenerAdapter> f20876saneness = new LinkedHashSet();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Set<AnimatorListenerAdapter> f20874dern = new LinkedHashSet();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f20872beachfront = true;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public Animator f20873competently = null;

    public void attabal(boolean z) {
        this.f20872beachfront = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void saneness(SearchBar searchBar) {
        Animator animator = this.f20877wireman;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f20875marial;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof phrasemonger.attabal) {
            ((phrasemonger.attabal) centerView).attabal();
        }
        if (centerView != 0) {
            centerView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
