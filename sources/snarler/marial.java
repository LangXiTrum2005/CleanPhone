package snarler;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ConfigCacheClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Executor f37680attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Task<com.google.firebase.remoteconfig.internal.saneness> f37681dern = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final kowloon f37682saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Map<String, marial> f37679wireman = new HashMap();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Executor f37678marial = new androidx.privacysandbox.ads.adservices.measurement.cutely();

    /* JADX INFO: compiled from: ConfigCacheClient.java */
    public static class saneness<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final CountDownLatch f37683attabal;

        public saneness() {
            this.f37683attabal = new CountDownLatch(1);
        }

        public boolean attabal(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f37683attabal.await(j, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f37683attabal.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f37683attabal.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f37683attabal.countDown();
        }
    }

    public marial(Executor executor, kowloon kowloonVar) {
        this.f37680attabal = executor;
        this.f37682saneness = kowloonVar;
    }

    public static /* synthetic */ Task attabal(marial marialVar, boolean z, com.google.firebase.remoteconfig.internal.saneness sanenessVar, Void r3) {
        if (z) {
            marialVar.cutely(sanenessVar);
        } else {
            marialVar.getClass();
        }
        return Tasks.forResult(sanenessVar);
    }

    public static synchronized marial competently(Executor executor, kowloon kowloonVar) {
        String strAttabal;
        Map<String, marial> map;
        try {
            strAttabal = kowloonVar.attabal();
            map = f37679wireman;
            if (!map.containsKey(strAttabal)) {
                map.put(strAttabal, new marial(executor, kowloonVar));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(strAttabal);
    }

    public static <TResult> TResult dern(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        saneness sanenessVar = new saneness();
        Executor executor = f37678marial;
        task.addOnSuccessListener(executor, sanenessVar);
        task.addOnFailureListener(executor, sanenessVar);
        task.addOnCanceledListener(executor, sanenessVar);
        if (!sanenessVar.attabal(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public com.google.firebase.remoteconfig.internal.saneness beachfront(long j) {
        synchronized (this) {
            try {
                Task<com.google.firebase.remoteconfig.internal.saneness> task = this.f37681dern;
                if (task == null || !task.isSuccessful()) {
                    try {
                        return (com.google.firebase.remoteconfig.internal.saneness) dern(wireman(), j, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        return null;
                    }
                }
                return this.f37681dern.getResult();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void cutely(com.google.firebase.remoteconfig.internal.saneness sanenessVar) {
        this.f37681dern = Tasks.forResult(sanenessVar);
    }

    public Task<com.google.firebase.remoteconfig.internal.saneness> impromptu(com.google.firebase.remoteconfig.internal.saneness sanenessVar) {
        return taiyuan(sanenessVar, true);
    }

    public com.google.firebase.remoteconfig.internal.saneness marial() {
        return beachfront(5L);
    }

    public Task<com.google.firebase.remoteconfig.internal.saneness> taiyuan(final com.google.firebase.remoteconfig.internal.saneness sanenessVar, final boolean z) {
        return Tasks.call(this.f37680attabal, new Callable() { // from class: snarler.dern
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37660kowloon.f37682saneness.wireman(sanenessVar);
            }
        }).onSuccessTask(this.f37680attabal, new SuccessContinuation() { // from class: snarler.wireman
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return marial.attabal(this.f37690attabal, z, sanenessVar, (Void) obj);
            }
        });
    }

    public synchronized Task<com.google.firebase.remoteconfig.internal.saneness> wireman() {
        try {
            Task<com.google.firebase.remoteconfig.internal.saneness> task = this.f37681dern;
            if (task == null || (task.isComplete() && !this.f37681dern.isSuccessful())) {
                Executor executor = this.f37680attabal;
                final kowloon kowloonVar = this.f37682saneness;
                Objects.requireNonNull(kowloonVar);
                this.f37681dern = Tasks.call(executor, new Callable() { // from class: snarler.saneness
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return kowloonVar.dern();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37681dern;
    }
}
