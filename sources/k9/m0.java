package k9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f44478a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44479b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f44481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f44482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f44483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f44484g;

    public m0(o0 o0Var, l0 l0Var) {
        this.f44484g = o0Var;
        this.f44482e = l0Var;
    }

    public final ConnectionResult a(String str, Executor executor) {
        try {
            Intent intentA = e0.a(this.f44484g.f44497b, this.f44482e);
            this.f44479b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(p9.f.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                o0 o0Var = this.f44484g;
                o9.a aVar = o0Var.f44499d;
                Context context = o0Var.f44497b;
                l0 l0Var = this.f44482e;
                boolean zD = aVar.d(context, str, intentA, this, 4225, executor);
                this.f44480c = zD;
                if (zD) {
                    o0Var.f44498c.sendMessageDelayed(o0Var.f44498c.obtainMessage(1, l0Var), o0Var.f44501f);
                    return ConnectionResult.f11639f;
                }
                this.f44479b = 2;
                try {
                    o0Var.f44499d.c(o0Var.f44497b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new ConnectionResult(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (d0 e10) {
            return e10.f44402a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o0 o0Var = this.f44484g;
        synchronized (o0Var.f44496a) {
            try {
                o0Var.f44498c.removeMessages(1, this.f44482e);
                this.f44481d = iBinder;
                this.f44483f = componentName;
                Iterator it = this.f44478a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f44479b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o0 o0Var = this.f44484g;
        synchronized (o0Var.f44496a) {
            try {
                o0Var.f44498c.removeMessages(1, this.f44482e);
                this.f44481d = null;
                this.f44483f = componentName;
                Iterator it = this.f44478a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f44479b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
