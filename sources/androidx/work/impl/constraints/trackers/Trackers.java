package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: classes.dex */
public class Trackers {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Trackers f8744e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BatteryChargingTracker f8745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BatteryNotLowTracker f8746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NetworkStateTracker f8747c;
    public StorageNotLowTracker d;

    public static synchronized Trackers a(Context context, TaskExecutor taskExecutor) {
        try {
            if (f8744e == null) {
                Trackers trackers = new Trackers();
                Context applicationContext = context.getApplicationContext();
                trackers.f8745a = new BatteryChargingTracker(applicationContext, taskExecutor);
                trackers.f8746b = new BatteryNotLowTracker(applicationContext, taskExecutor);
                trackers.f8747c = new NetworkStateTracker(applicationContext, taskExecutor);
                trackers.d = new StorageNotLowTracker(applicationContext, taskExecutor);
                f8744e = trackers;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8744e;
    }
}
