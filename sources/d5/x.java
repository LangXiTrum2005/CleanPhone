package d5;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f38710a = o.i("WorkerFactory");

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f38710a;
        ListenableWorker listenableWorker = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th2) {
            o.g().f(str2, defpackage.e.n("Invalid class: ", str), th2);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                listenableWorker = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th3) {
                o.g().f(str2, defpackage.e.n("Could not instantiate ", str), th3);
            }
        }
        if (listenableWorker == null || !listenableWorker.isUsed()) {
            return listenableWorker;
        }
        throw new IllegalStateException(l1.d.h("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
