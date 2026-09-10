package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.support.v4.media.a;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmScheduler implements Scheduler {
    public static final String X = Logger.e("SystemAlarmScheduler");

    @Override // androidx.work.impl.Scheduler
    public final void a(String str) {
        String str2 = CommandHandler.e0;
        Intent intent = new Intent((Context) null, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        throw null;
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(WorkSpec... workSpecArr) {
        if (workSpecArr.length <= 0) {
            return;
        }
        WorkSpec workSpec = workSpecArr[0];
        Logger.c().a(X, a.C("Scheduling work with workSpecId ", workSpec.f8776a), new Throwable[0]);
        CommandHandler.b(null, workSpec.f8776a);
        throw null;
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean d() {
        return true;
    }
}
