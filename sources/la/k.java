package la;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f45259n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f45261b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f45267h;
    public j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f45271m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f45263d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f45264e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f45265f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f45269j = new IBinder.DeathRecipient() { // from class: la.g
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            k kVar = this.f45251a;
            kVar.f45261b.a("reportBinderDeath", new Object[0]);
            if (kVar.f45268i.get() != null) {
                throw new ClassCastException();
            }
            kVar.f45261b.a("%s : Binder has died.", kVar.f45262c);
            for (f fVar : kVar.f45263d) {
                RemoteException remoteException = new RemoteException(String.valueOf(kVar.f45262c).concat(" : Binder has died."));
                TaskCompletionSource taskCompletionSource = fVar.f45250a;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(remoteException);
                }
            }
            kVar.f45263d.clear();
            synchronized (kVar.f45265f) {
                kVar.c();
            }
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f45270k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45262c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f45268i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [la.g] */
    public k(Context context, e eVar, Intent intent) {
        this.f45260a = context;
        this.f45261b = eVar;
        this.f45267h = intent;
    }

    public static void b(k kVar, ka.d dVar) {
        d dVar2 = kVar.f45271m;
        e eVar = kVar.f45261b;
        ArrayList<f> arrayList = kVar.f45263d;
        if (dVar2 != null || kVar.f45266g) {
            if (!kVar.f45266g) {
                dVar.run();
                return;
            } else {
                eVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(dVar);
                return;
            }
        }
        eVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(dVar);
        j jVar = new j(kVar, 0);
        kVar.l = jVar;
        kVar.f45266g = true;
        if (kVar.f45260a.bindService(kVar.f45267h, jVar, 1)) {
            return;
        }
        eVar.a("Failed to bind to the service.", new Object[0]);
        kVar.f45266g = false;
        for (f fVar : arrayList) {
            aa.b bVar = new aa.b("Failed to bind to the service.", 13);
            TaskCompletionSource taskCompletionSource = fVar.f45250a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(bVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f45259n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f45262c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f45262c, 10);
                    handlerThread.start();
                    map.put(this.f45262c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f45262c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f45264e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f45262c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
