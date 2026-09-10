package h9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zs;
import com.google.android.gms.internal.measurement.u6;
import eb.d0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k9.c0;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42272a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Messenger f42273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f42274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f42275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f42276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f42277f;

    public i(k kVar) {
        this.f42277f = kVar;
        u6 u6Var = new u6(Looper.getMainLooper(), new h(this, 0));
        Looper.getMainLooper();
        this.f42273b = new Messenger(u6Var);
        this.f42275d = new ArrayDeque();
        this.f42276e = new SparseArray();
    }

    public final synchronized boolean a(j jVar) {
        int i10 = this.f42272a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f42275d.add(jVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f42275d.add(jVar);
            ((ScheduledExecutorService) this.f42277f.f42288c).execute(new g(this, 1));
            return true;
        }
        this.f42275d.add(jVar);
        c0.k(this.f42272a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f42272a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            o9.a aVarB = o9.a.b();
            k kVar = this.f42277f;
            if (aVarB.a((Context) kVar.f42287b, intent, this, 1)) {
                ((ScheduledExecutorService) kVar.f42288c).schedule(new g(this, 0), 30L, TimeUnit.SECONDS);
            } else {
                b("Unable to bind to service");
            }
        } catch (SecurityException e10) {
            c("Unable to bind to service", e10);
        }
        return true;
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.f42272a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f42272a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f42272a = 4;
            o9.a.b().c((Context) this.f42277f.f42287b, this);
            zs zsVar = new zs(7, str, securityException);
            ArrayDeque arrayDeque = this.f42275d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(zsVar);
            }
            arrayDeque.clear();
            int i11 = 0;
            while (true) {
                SparseArray sparseArray = this.f42276e;
                if (i11 >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((j) sparseArray.valueAt(i11)).c(zsVar);
                    i11++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        try {
            if (this.f42272a == 2 && this.f42275d.isEmpty() && this.f42276e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f42272a = 3;
                o9.a.b().c((Context) this.f42277f.f42287b, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f42277f.f42288c).execute(new i0(23, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f42277f.f42288c).execute(new g(this, 2));
    }
}
