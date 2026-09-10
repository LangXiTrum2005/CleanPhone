package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* JADX INFO: compiled from: AnimatorTracker.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Animator f20247attabal;

    public void attabal() {
        Animator animator = this.f20247attabal;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void dern(Animator animator) {
        attabal();
        this.f20247attabal = animator;
    }

    public void saneness() {
        this.f20247attabal = null;
    }
}
