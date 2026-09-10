package zc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.ironsource.vh;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f54824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f54825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f54826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d0 f54827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54828f;

    public f0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new q9.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f54826d = new ArrayDeque();
        this.f54828f = false;
        Context applicationContext = context.getApplicationContext();
        this.f54823a = applicationContext;
        this.f54824b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f54825c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f54826d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                d0 d0Var = this.f54827e;
                if (d0Var == null || !d0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f54827e.a((e0) this.f54826d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task b(Intent intent) {
        e0 e0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            e0Var = new e0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f54825c;
            e0Var.f54821b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new vh(scheduledThreadPoolExecutor.schedule(new q1.c(e0Var, 16), 20L, TimeUnit.SECONDS)));
            this.f54826d.add(e0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return e0Var.f54821b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f54828f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f54828f) {
            return;
        }
        this.f54828f = true;
        try {
            if (o9.a.b().a(this.f54823a, this.f54824b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.f54826d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((e0) arrayDeque.poll()).f54821b.trySetResult(null);
                }
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        this.f54828f = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f54828f = false;
            if (iBinder instanceof d0) {
                this.f54827e = (d0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f54826d;
            while (!arrayDeque.isEmpty()) {
                ((e0) arrayDeque.poll()).f54821b.trySetResult(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
