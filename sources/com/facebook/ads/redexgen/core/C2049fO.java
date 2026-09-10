package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2049fO extends AnimatorListenerAdapter {
    public static String[] A01 = {"TrZNDxp7XgPrLwMeMcKKV4LE6uuIfYVU", "ULEyXJCc47teQ6YZ0eXPV0V7C", "At5pbwNHr2LiheLI", "DEC0Eom9qK7OI0oKL1WQ5oYEbz9lc5Gt", "Go2f3K9Z", "jmF0Wp1VVfzp13IVqL", "AKLTgtcpjio1lTTBDL2vrOjYxOjCOJfp", "yZ5UHZcmQhcxGg9JLD5yPnSTYa225zYb"};
    public final /* synthetic */ DQ A00;

    public C2049fO(DQ dq) {
        this.A00 = dq;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00.A04) {
            YB.A0H(this.A00.A03);
        }
        DQ dq = this.A00;
        if (A01[5].length() == 4) {
            throw new RuntimeException();
        }
        A01[2] = "6jsFEd17ts6f8PQH6w";
        dq.A03.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.A00.A01 = EnumC2044fJ.A04;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = EnumC2044fJ.A02;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }
}
