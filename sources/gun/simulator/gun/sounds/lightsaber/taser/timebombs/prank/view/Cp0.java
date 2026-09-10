package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class Cp0 {
    public static final HashMap n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2944a;
    public final B4 b;
    public boolean g;
    public final Intent h;
    public ServiceConnectionC3340eN l;
    public IInterface m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final yp0 j = new IBinder.DeathRecipient() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yp0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            Cp0 cp0 = this.f5301a;
            cp0.b.c("reportBinderDeath", new Object[0]);
            AbstractC3950lJ.z(cp0.i.get());
            String str = cp0.c;
            cp0.b.c("%s : Binder has died.", str);
            ArrayList<vp0> arrayList = cp0.d;
            for (vp0 vp0Var : arrayList) {
                RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                TaskCompletionSource taskCompletionSource = vp0Var.f5157a;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(remoteException);
                }
            }
            arrayList.clear();
            cp0.b();
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yp0] */
    public Cp0(Context context, B4 b4, Intent intent) {
        this.f2944a = context;
        this.b = b4;
        this.h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
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
        return handler;
    }

    public final void b() {
        synchronized (this.f) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
