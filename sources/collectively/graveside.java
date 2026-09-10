package collectively;

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
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class graveside {

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final Map f15815triweekly = new HashMap();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f15817attabal;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f15819competently;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public ServiceConnection f15822formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public IInterface f15823impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Intent f15824impromptu;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final taiyuan f15826saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List f15828wireman = new ArrayList();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Set f15825marial = new HashSet();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Object f15818beachfront = new Object();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final IBinder.DeathRecipient f15820cutely = new IBinder.DeathRecipient() { // from class: collectively.apical
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            graveside.cutely(this.f15805attabal);
        }
    };

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final AtomicInteger f15816apical = new AtomicInteger(0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f15821dern = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final WeakReference f15827taiyuan = new WeakReference(null);

    public graveside(Context context, taiyuan taiyuanVar, String str, Intent intent, com.google.android.play.core.review.marial marialVar, kowloon kowloonVar) {
        this.f15817attabal = context;
        this.f15826saneness = taiyuanVar;
        this.f15824impromptu = intent;
    }

    public static /* bridge */ /* synthetic */ void arytenoidectomy(graveside gravesideVar, cutely cutelyVar) {
        if (gravesideVar.f15823impassible != null || gravesideVar.f15819competently) {
            if (!gravesideVar.f15819competently) {
                cutelyVar.run();
                return;
            } else {
                gravesideVar.f15826saneness.dern("Waiting to bind to the service.", new Object[0]);
                gravesideVar.f15828wireman.add(cutelyVar);
                return;
            }
        }
        gravesideVar.f15826saneness.dern("Initiate binding to the service.", new Object[0]);
        gravesideVar.f15828wireman.add(cutelyVar);
        polloi polloiVar = new polloi(gravesideVar, null);
        gravesideVar.f15822formularize = polloiVar;
        gravesideVar.f15819competently = true;
        if (gravesideVar.f15817attabal.bindService(gravesideVar.f15824impromptu, polloiVar, 1)) {
            return;
        }
        gravesideVar.f15826saneness.dern("Failed to bind to the service.", new Object[0]);
        gravesideVar.f15819competently = false;
        Iterator it = gravesideVar.f15828wireman.iterator();
        while (it.hasNext()) {
            ((cutely) it.next()).dern(new zzu());
        }
        gravesideVar.f15828wireman.clear();
    }

    public static /* synthetic */ void cutely(graveside gravesideVar) {
        gravesideVar.f15826saneness.dern("reportBinderDeath", new Object[0]);
        kowloon kowloonVar = (kowloon) gravesideVar.f15827taiyuan.get();
        if (kowloonVar != null) {
            gravesideVar.f15826saneness.dern("calling onBinderDied", new Object[0]);
            kowloonVar.zza();
        } else {
            gravesideVar.f15826saneness.dern("%s : Binder has died.", gravesideVar.f15821dern);
            Iterator it = gravesideVar.f15828wireman.iterator();
            while (it.hasNext()) {
                ((cutely) it.next()).dern(gravesideVar.dovishness());
            }
            gravesideVar.f15828wireman.clear();
        }
        synchronized (gravesideVar.f15818beachfront) {
            gravesideVar.gintrap();
        }
    }

    public static /* bridge */ /* synthetic */ void monoploid(graveside gravesideVar) {
        gravesideVar.f15826saneness.dern("linkToDeath", new Object[0]);
        try {
            gravesideVar.f15823impassible.asBinder().linkToDeath(gravesideVar.f15820cutely, 0);
        } catch (RemoteException e) {
            gravesideVar.f15826saneness.saneness(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void polloi(graveside gravesideVar) {
        gravesideVar.f15826saneness.dern("unlinkToDeath", new Object[0]);
        gravesideVar.f15823impassible.asBinder().unlinkToDeath(gravesideVar.f15820cutely, 0);
    }

    public static /* bridge */ /* synthetic */ void triweekly(final graveside gravesideVar, final TaskCompletionSource taskCompletionSource) {
        gravesideVar.f15825marial.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: collectively.formularize
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f15813attabal.graveside(taskCompletionSource, task);
            }
        });
    }

    public final void adultoid(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f15818beachfront) {
            this.f15825marial.remove(taskCompletionSource);
        }
        dern().post(new triweekly(this));
    }

    public final Handler dern() {
        Handler handler;
        Map map = f15815triweekly;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f15821dern)) {
                    HandlerThread handlerThread = new HandlerThread(this.f15821dern, 10);
                    handlerThread.start();
                    map.put(this.f15821dern, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f15821dern);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final RemoteException dovishness() {
        return new RemoteException(String.valueOf(this.f15821dern).concat(" : Binder has died."));
    }

    public final void gintrap() {
        Iterator it = this.f15825marial.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(dovishness());
        }
        this.f15825marial.clear();
    }

    public final /* synthetic */ void graveside(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f15818beachfront) {
            this.f15825marial.remove(taskCompletionSource);
        }
    }

    public final IInterface marial() {
        return this.f15823impassible;
    }

    public final void molybdenite(cutely cutelyVar, TaskCompletionSource taskCompletionSource) {
        dern().post(new impassible(this, cutelyVar.saneness(), taskCompletionSource, cutelyVar));
    }
}
