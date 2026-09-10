package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.WorkConstraintsTracker;

/* JADX INFO: loaded from: classes.dex */
class ConstraintsCommandHandler {
    public static final String d = Logger.e("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkConstraintsTracker f8710c;

    public ConstraintsCommandHandler(Context context, int i2, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f8708a = context;
        this.f8709b = i2;
        this.f8710c = new WorkConstraintsTracker(context, systemAlarmDispatcher.f8713Y, null);
    }
}
