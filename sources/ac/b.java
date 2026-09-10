package ac;

import com.applovin.impl.da;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final da f3455a = new da(1);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        a aVar = new a(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 0);
        da daVar = f3455a;
        task.continueWithTask(daVar, aVar);
        task2.continueWithTask(daVar, aVar);
        return taskCompletionSource.getTask();
    }
}
