package androidx.fragment.app;

import android.animation.AnimatorSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f4369a = new k();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.n.f(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j10) {
        kotlin.jvm.internal.n.f(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j10);
    }
}
