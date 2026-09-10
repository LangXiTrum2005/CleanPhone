package k9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.u6;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f44493g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static o0 f44494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HandlerThread f44495i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f44496a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f44497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile u6 f44498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o9.a f44499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f44501f;

    public o0(Context context, Looper looper) {
        n0 n0Var = new n0(this);
        this.f44497b = context.getApplicationContext();
        u6 u6Var = new u6(looper, n0Var);
        Looper.getMainLooper();
        this.f44498c = u6Var;
        this.f44499d = o9.a.b();
        this.f44500e = 5000L;
        this.f44501f = 300000L;
    }

    public static o0 a(Context context) {
        synchronized (f44493g) {
            try {
                if (f44494h == null) {
                    f44494h = new o0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f44494h;
    }

    public final ConnectionResult b(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        ConnectionResult connectionResultA;
        HashMap map = this.f44496a;
        synchronized (map) {
            try {
                m0 m0Var = (m0) map.get(l0Var);
                if (executor == null) {
                    executor = null;
                }
                if (m0Var == null) {
                    m0Var = new m0(this, l0Var);
                    m0Var.f44478a.put(serviceConnection, serviceConnection);
                    connectionResultA = m0Var.a(str, executor);
                    map.put(l0Var, m0Var);
                } else {
                    this.f44498c.removeMessages(0, l0Var);
                    if (m0Var.f44478a.containsKey(serviceConnection)) {
                        String string = l0Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    m0Var.f44478a.put(serviceConnection, serviceConnection);
                    int i10 = m0Var.f44479b;
                    if (i10 == 1) {
                        serviceConnection.onServiceConnected(m0Var.f44483f, m0Var.f44481d);
                    } else if (i10 == 2) {
                        connectionResultA = m0Var.a(str, executor);
                    }
                    connectionResultA = null;
                }
                if (m0Var.f44480c) {
                    return ConnectionResult.f11639f;
                }
                if (connectionResultA == null) {
                    connectionResultA = new ConnectionResult(-1, null, null);
                }
                return connectionResultA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(l0 l0Var, ServiceConnection serviceConnection) {
        c0.i(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f44496a;
        synchronized (map) {
            try {
                m0 m0Var = (m0) map.get(l0Var);
                if (m0Var == null) {
                    String string = l0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!m0Var.f44478a.containsKey(serviceConnection)) {
                    String string2 = l0Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                m0Var.f44478a.remove(serviceConnection);
                if (m0Var.f44478a.isEmpty()) {
                    this.f44498c.sendMessageDelayed(this.f44498c.obtainMessage(0, l0Var), this.f44500e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
