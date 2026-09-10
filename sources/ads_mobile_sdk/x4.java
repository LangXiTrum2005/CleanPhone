package ads_mobile_sdk;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import saneness.neurotropism;
import saneness.psalmodic;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends psalmodic {
    public final neurotropism a;

    public x4(neurotropism neurotropismVar) {
        new TaskCompletionSource().getTask();
        this.a = neurotropismVar;
    }

    @Override // saneness.psalmodic
    public final Task a(int i, long j, Exception exc) {
        ((kc1) this.a).a(i, j, exc, null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }
}
