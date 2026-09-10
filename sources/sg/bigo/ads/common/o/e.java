package sg.bigo.ads.common.o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
class e implements ServiceConnection, IBinder.DeathRecipient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f47357c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f47360e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f47359b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BlockingQueue<IBinder> f47358a = new LinkedBlockingQueue(1);

    private e(Context context) {
        this.f47360e = context;
    }

    public static e a(Context context) {
        if (f47357c == null) {
            synchronized (e.class) {
                try {
                    if (f47357c == null) {
                        f47357c = new e(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f47357c;
    }

    private void b() {
        try {
            synchronized (d) {
                this.f47358a.clear();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        b();
    }

    public final f a(long j, TimeUnit timeUnit) {
        try {
            IBinder iBinderPoll = this.f47358a.poll(j, timeUnit);
            if (iBinderPoll == null) {
                return null;
            }
            a(iBinderPoll);
            return f.a.a(iBinderPoll);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final synchronized void a() {
        if (this.f47359b) {
            try {
                this.f47359b = false;
                b();
                this.f47360e.unbindService(this);
            } catch (Exception unused) {
            }
        }
    }

    private void a(IBinder iBinder) {
        try {
            synchronized (d) {
                this.f47358a.clear();
                this.f47358a.add(iBinder);
            }
        } catch (Exception unused) {
        }
    }
}
