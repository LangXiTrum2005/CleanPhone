package androidx.work;

import android.content.Context;
import android.support.v4.media.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8650a = Logger.e("WorkerFactory");

    /* JADX INFO: renamed from: androidx.work.WorkerFactory$1, reason: invalid class name */
    class AnonymousClass1 extends WorkerFactory {
        @Override // androidx.work.WorkerFactory
        public final ListenableWorker a() {
            return null;
        }
    }

    public abstract ListenableWorker a();

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f8650a;
        ListenableWorker listenableWorkerA = a();
        if (listenableWorkerA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                Logger.c().b(str2, a.C("Invalid class: ", str), th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerA = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    Logger.c().b(str2, a.C("Could not instantiate ", str), th2);
                }
            }
        }
        if (listenableWorkerA == null || !listenableWorkerA.isUsed()) {
            return listenableWorkerA;
        }
        throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.n("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
