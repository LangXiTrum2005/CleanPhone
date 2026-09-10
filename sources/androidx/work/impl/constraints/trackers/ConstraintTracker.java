package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintTracker<T> {
    public static final String f = Logger.e("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskExecutor f8735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8737c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8738e;

    public ConstraintTracker(Context context, TaskExecutor taskExecutor) {
        this.f8736b = context.getApplicationContext();
        this.f8735a = taskExecutor;
    }

    public abstract Object a();

    public final void b(ConstraintController constraintController) {
        synchronized (this.f8737c) {
            try {
                if (this.d.remove(constraintController) && this.d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f8737c) {
            try {
                Object obj2 = this.f8738e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f8738e = obj;
                    final ArrayList arrayList = new ArrayList(this.d);
                    this.f8735a.a().execute(new Runnable() { // from class: androidx.work.impl.constraints.trackers.ConstraintTracker.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((ConstraintListener) it.next()).a(ConstraintTracker.this.f8738e);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
