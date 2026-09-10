package androidx.work.impl.background.greedy;

import androidx.work.Logger;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class DelayedWorkTracker {
    public static final String d = Logger.e("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GreedyScheduler f8698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultRunnableScheduler f8699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8700c = new HashMap();

    public DelayedWorkTracker(GreedyScheduler greedyScheduler, DefaultRunnableScheduler defaultRunnableScheduler) {
        this.f8698a = greedyScheduler;
        this.f8699b = defaultRunnableScheduler;
    }
}
