package i9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.ironsource.Xa;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42916a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f42917b = new LinkedBlockingQueue();

    public final IBinder a() {
        c0.g("BlockingServiceConnection.getService() called on main thread");
        if (this.f42916a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f42916a = true;
        return (IBinder) this.f42917b.take();
    }

    public final IBinder b() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f42916a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f42916a = true;
        IBinder iBinder = (IBinder) this.f42917b.poll(Xa.f27908s, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f42917b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
