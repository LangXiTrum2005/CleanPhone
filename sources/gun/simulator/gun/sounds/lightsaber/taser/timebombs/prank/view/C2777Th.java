package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2777Th {
    public static final HashMap d = new HashMap();
    public static final N5 e = new N5(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f3784a;
    public final C2726Ri b;
    public Task c = null;

    public C2777Th(ScheduledExecutorService scheduledExecutorService, C2726Ri c2726Ri) {
        this.f3784a = scheduledExecutorService;
        this.b = c2726Ri;
    }

    public static Object a(Task task, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        C2294Ar c2294Ar = new C2294Ar();
        Executor executor = e;
        task.addOnSuccessListener(executor, c2294Ar);
        task.addOnFailureListener(executor, c2294Ar);
        task.addOnCanceledListener(executor, c2294Ar);
        if (!((CountDownLatch) c2294Ar.b).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized C2777Th c(ScheduledExecutorService scheduledExecutorService, C2726Ri c2726Ri) {
        String str;
        HashMap map;
        try {
            str = c2726Ri.b;
            map = d;
            if (!map.containsKey(str)) {
                map.put(str, new C2777Th(scheduledExecutorService, c2726Ri));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C2777Th) map.get(str);
    }

    public final synchronized Task b() {
        try {
            Task task = this.c;
            if (task == null || (task.isComplete() && !this.c.isSuccessful())) {
                Executor executor = this.f3784a;
                C2726Ri c2726Ri = this.b;
                Objects.requireNonNull(c2726Ri);
                this.c = Tasks.call(executor, new CallableC4668tY(c2726Ri, 1));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }
}
