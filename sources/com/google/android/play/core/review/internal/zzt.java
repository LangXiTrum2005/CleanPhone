package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
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

/* JADX INFO: loaded from: classes4.dex */
public final class zzt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f19657n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzi f19659b;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f19662h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f19664l;
    public zzf m;
    public final ArrayList d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f19661e = new HashSet();
    public final Object f = new Object();
    public final zzk j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.review.internal.zzk
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzt zztVar = this.X;
            zztVar.f19659b.a("reportBinderDeath", new Object[0]);
            zzo zzoVar = (zzo) zztVar.f19663i.get();
            if (zzoVar != null) {
                zztVar.f19659b.a("calling onBinderDied", new Object[0]);
                zzoVar.zza();
            } else {
                zztVar.f19659b.a("%s : Binder has died.", zztVar.f19660c);
                for (zzj zzjVar : zztVar.d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(zztVar.f19660c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = zzjVar.X;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                zztVar.d.clear();
            }
            synchronized (zztVar.f) {
                zztVar.e();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19660c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f19663i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.review.internal.zzk] */
    public zzt(Context context, zzi zziVar, Intent intent) {
        this.f19658a = context;
        this.f19659b = zziVar;
        this.f19662h = intent;
    }

    public static void b(zzt zztVar, zzj zzjVar) {
        zzf zzfVar = zztVar.m;
        ArrayList<zzj> arrayList = zztVar.d;
        zzi zziVar = zztVar.f19659b;
        if (zzfVar != null || zztVar.g) {
            if (!zztVar.g) {
                zzjVar.run();
                return;
            } else {
                zziVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zzjVar);
                return;
            }
        }
        zziVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(zzjVar);
        zzr zzrVar = new zzr(zztVar);
        zztVar.f19664l = zzrVar;
        zztVar.g = true;
        if (zztVar.f19658a.bindService(zztVar.f19662h, zzrVar, 1)) {
            return;
        }
        zziVar.a("Failed to bind to the service.", new Object[0]);
        zztVar.g = false;
        for (zzj zzjVar2 : arrayList) {
            zzu zzuVar = new zzu("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = zzjVar2.X;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(zzuVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f19657n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f19660c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f19660c, 10);
                    handlerThread.start();
                    map.put(this.f19660c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f19660c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(zzj zzjVar, TaskCompletionSource taskCompletionSource) {
        a().post(new zzm(this, zzjVar.X, taskCompletionSource, zzjVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.f19661e.remove(taskCompletionSource);
        }
        a().post(new zzn(this));
    }

    public final void e() {
        HashSet hashSet = this.f19661e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f19660c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
