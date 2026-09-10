package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import saneness.resplend;

/* JADX INFO: loaded from: classes.dex */
public final class qm2 {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final hc1 b;
    public final String c;
    public final ArrayList d;
    public final HashSet e;
    public final Object f;
    public boolean g;
    public final Intent h;
    public final resplend i;
    public final WeakReference j;
    public final IBinder.DeathRecipient k;
    public final AtomicInteger l;
    public pm2 m;
    public IInterface n;

    public qm2(Context context, hc1 hc1Var, Intent intent, resplend resplendVar) {
        this(context, hc1Var, intent, resplendVar, 0);
    }

    public final void a(final TaskCompletionSource taskCompletionSource) {
        this.e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: saneness.hereditist
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f37164attabal.a(taskCompletionSource, task);
            }
        });
    }

    public final void b(lk2 lk2Var) {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(lk2Var);
    }

    public qm2(Context context, hc1 hc1Var, Intent intent, resplend resplendVar, int i) {
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new Object();
        this.k = new IBinder.DeathRecipient() { // from class: saneness.orcelite
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                this.f37237attabal.a();
            }
        };
        this.l = new AtomicInteger(0);
        this.a = context;
        this.b = hc1Var;
        this.c = "PrewarmService";
        this.h = intent;
        this.i = resplendVar;
        this.j = new WeakReference(null);
    }

    public final void a(lk2 lk2Var) {
        if (this.n == null && !this.g) {
            this.b.a("Initiate binding to the service.", new Object[0]);
            this.d.add(lk2Var);
            pm2 pm2Var = new pm2(this);
            this.m = pm2Var;
            this.g = true;
            if (this.a.bindService(this.h, pm2Var, 1)) {
                return;
            }
            this.b.a("Failed to bind to the service.", new Object[0]);
            this.g = false;
            for (lk2 lk2Var2 : this.d) {
                rm2 rm2Var = new rm2();
                TaskCompletionSource taskCompletionSource = lk2Var2.a;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(rm2Var);
                }
            }
            this.d.clear();
            return;
        }
        if (this.g) {
            this.b.a("Waiting to bind to the service.", new Object[0]);
            this.d.add(lk2Var);
        } else {
            lk2Var.run();
        }
    }

    public final /* synthetic */ void a(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
    }

    public final void a() {
        this.b.a("reportBinderDeath", new Object[0]);
        if (this.j.get() == null) {
            this.b.a("%s : Binder has died.", this.c);
            for (lk2 lk2Var : this.d) {
                RemoteException remoteException = new RemoteException(this.c + " : Binder has died.");
                TaskCompletionSource taskCompletionSource = lk2Var.a;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(remoteException);
                }
            }
            this.d.clear();
            synchronized (this.f) {
                try {
                    Iterator it = this.e.iterator();
                    while (it.hasNext()) {
                        ((TaskCompletionSource) it.next()).trySetException(new RemoteException(this.c + " : Binder has died."));
                    }
                    this.e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new ClassCastException();
    }
}
