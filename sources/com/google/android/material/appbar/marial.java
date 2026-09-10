package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import bubbles.impromptu;
import com.google.android.material.internal.rotuma;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: ViewUtilsLollipop.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f19520attabal = {R.attr.stateListAnimator};

    public static void attabal(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void dern(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray typedArrayTaiyuan = rotuma.taiyuan(context, attributeSet, f19520attabal, i, i2, new int[0]);
        try {
            if (typedArrayTaiyuan.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayTaiyuan.getResourceId(0, 0)));
            }
        } finally {
            typedArrayTaiyuan.recycle();
        }
    }

    public static void saneness(View view, float f) {
        int integer = view.getResources().getInteger(impromptu.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, bubbles.dern.state_liftable, -bubbles.dern.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
