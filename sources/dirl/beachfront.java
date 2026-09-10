package dirl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final Map f25249kowloon = new HashMap();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f25251attabal;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f25253competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f25255dern;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public ServiceConnection f25257impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Intent f25258impromptu;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final preprohormone f25260saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final sealless f25261taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public IInterface f25262triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List f25263wireman = new ArrayList();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Set f25259marial = new HashSet();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Object f25252beachfront = new Object();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final IBinder.DeathRecipient f25250apical = new IBinder.DeathRecipient() { // from class: dirl.cuirassed
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            beachfront.apical(this.f25265attabal);
        }
    };

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final AtomicInteger f25256formularize = new AtomicInteger(0);

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final WeakReference f25254cutely = new WeakReference(null);

    public beachfront(Context context, preprohormone preprohormoneVar, String str, Intent intent, sealless seallessVar, yemenite yemeniteVar) {
        this.f25251attabal = context;
        this.f25260saneness = preprohormoneVar;
        this.f25255dern = str;
        this.f25258impromptu = intent;
        this.f25261taiyuan = seallessVar;
    }

    public static /* synthetic */ void apical(beachfront beachfrontVar) {
        beachfrontVar.f25260saneness.dern("reportBinderDeath", new Object[0]);
        yemenite yemeniteVar = (yemenite) beachfrontVar.f25254cutely.get();
        if (yemeniteVar != null) {
            beachfrontVar.f25260saneness.dern("calling onBinderDied", new Object[0]);
            yemeniteVar.a();
        } else {
            beachfrontVar.f25260saneness.dern("%s : Binder has died.", beachfrontVar.f25255dern);
            Iterator it = beachfrontVar.f25263wireman.iterator();
            while (it.hasNext()) {
                ((cord) it.next()).attabal(beachfrontVar.gintrap());
            }
            beachfrontVar.f25263wireman.clear();
        }
        synchronized (beachfrontVar.f25252beachfront) {
            beachfrontVar.rotuma();
        }
    }

    public static /* bridge */ /* synthetic */ void kowloon(final beachfront beachfrontVar, final TaskCompletionSource taskCompletionSource) {
        beachfrontVar.f25259marial.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: dirl.stratoscope
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f25279attabal.adultoid(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void molybdenite(beachfront beachfrontVar) {
        beachfrontVar.f25260saneness.dern("unlinkToDeath", new Object[0]);
        beachfrontVar.f25262triweekly.asBinder().unlinkToDeath(beachfrontVar.f25250apical, 0);
    }

    public static /* bridge */ /* synthetic */ void monoploid(beachfront beachfrontVar, cord cordVar) {
        if (beachfrontVar.f25262triweekly != null || beachfrontVar.f25253competently) {
            if (!beachfrontVar.f25253competently) {
                cordVar.run();
                return;
            } else {
                beachfrontVar.f25260saneness.dern("Waiting to bind to the service.", new Object[0]);
                beachfrontVar.f25263wireman.add(cordVar);
                return;
            }
        }
        beachfrontVar.f25260saneness.dern("Initiate binding to the service.", new Object[0]);
        beachfrontVar.f25263wireman.add(cordVar);
        marial marialVar = new marial(beachfrontVar, null);
        beachfrontVar.f25257impassible = marialVar;
        beachfrontVar.f25253competently = true;
        if (beachfrontVar.f25251attabal.bindService(beachfrontVar.f25258impromptu, marialVar, 1)) {
            return;
        }
        beachfrontVar.f25260saneness.dern("Failed to bind to the service.", new Object[0]);
        beachfrontVar.f25253competently = false;
        Iterator it = beachfrontVar.f25263wireman.iterator();
        while (it.hasNext()) {
            ((cord) it.next()).attabal(new af());
        }
        beachfrontVar.f25263wireman.clear();
    }

    public static /* bridge */ /* synthetic */ void polloi(beachfront beachfrontVar) {
        beachfrontVar.f25260saneness.dern("linkToDeath", new Object[0]);
        try {
            beachfrontVar.f25262triweekly.asBinder().linkToDeath(beachfrontVar.f25250apical, 0);
        } catch (RemoteException e) {
            beachfrontVar.f25260saneness.saneness(e, "linkToDeath failed", new Object[0]);
        }
    }

    public final /* synthetic */ void adultoid(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f25252beachfront) {
            this.f25259marial.remove(taskCompletionSource);
        }
    }

    public final Handler dern() {
        Handler handler;
        Map map = f25249kowloon;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f25255dern)) {
                    HandlerThread handlerThread = new HandlerThread(this.f25255dern, 10);
                    handlerThread.start();
                    map.put(this.f25255dern, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f25255dern);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void dovishness(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f25252beachfront) {
            this.f25259marial.remove(taskCompletionSource);
        }
        dern().post(new oilcan(this));
    }

    public final RemoteException gintrap() {
        return new RemoteException(String.valueOf(this.f25255dern).concat(" : Binder has died."));
    }

    public final void graveside(cord cordVar, TaskCompletionSource taskCompletionSource) {
        dern().post(new trm(this, cordVar.dern(), taskCompletionSource, cordVar));
    }

    public final IInterface marial() {
        return this.f25262triweekly;
    }

    public final void rotuma() {
        Iterator it = this.f25259marial.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(gintrap());
        }
        this.f25259marial.clear();
    }
}
