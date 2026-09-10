package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC3201cm0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4244a;
    public final Intent b;
    public final ScheduledExecutorService c;
    public final ArrayDeque d;
    public BinderC3024am0 e;
    public boolean f;

    public ServiceConnectionC3201cm0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.f4244a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        while (!this.d.isEmpty()) {
            try {
                BinderC3024am0 binderC3024am0 = this.e;
                if (binderC3024am0 == null || !binderC3024am0.isBinderAlive()) {
                    if (!this.f) {
                        this.f = true;
                        try {
                            if (!ConnectionTracker.getInstance().bindService(this.f4244a, this.b, this, 65)) {
                                this.f = false;
                                while (true) {
                                    ArrayDeque arrayDeque = this.d;
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                    } else {
                                        ((C3113bm0) arrayDeque.poll()).b.trySetResult(null);
                                    }
                                }
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    return;
                }
                this.e.a((C3113bm0) this.d.poll());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Task b(Intent intent) {
        C3113bm0 c3113bm0;
        c3113bm0 = new C3113bm0(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        c3113bm0.b.getTask().addOnCompleteListener(scheduledExecutorService, new C2503Is(scheduledExecutorService.schedule(new RunnableC2928Zc(c3113bm0, 20), 20L, TimeUnit.SECONDS), 2));
        this.d.add(c3113bm0);
        a();
        return c3113bm0.b.getTask();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f = false;
            if (iBinder instanceof BinderC3024am0) {
                this.e = (BinderC3024am0) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.d;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((C3113bm0) arrayDeque.poll()).b.trySetResult(null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
