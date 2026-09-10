package androidx.work.impl.constraints.controllers;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintController<T> implements ConstraintListener<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8727a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintTracker f8729c;
    public WorkConstraintsTracker d;

    public interface OnConstraintUpdatedCallback {
    }

    public ConstraintController(ConstraintTracker constraintTracker) {
        this.f8729c = constraintTracker;
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public final void a(Object obj) {
        this.f8728b = obj;
        e(this.d, obj);
    }

    public abstract boolean b(WorkSpec workSpec);

    public abstract boolean c(Object obj);

    public final void d(Collection collection) {
        this.f8727a.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            if (b(workSpec)) {
                this.f8727a.add(workSpec.f8776a);
            }
        }
        if (this.f8727a.isEmpty()) {
            this.f8729c.b(this);
        } else {
            ConstraintTracker constraintTracker = this.f8729c;
            synchronized (constraintTracker.f8737c) {
                try {
                    if (constraintTracker.d.add(this)) {
                        if (constraintTracker.d.size() == 1) {
                            constraintTracker.f8738e = constraintTracker.a();
                            Logger.c().a(ConstraintTracker.f, String.format("%s: initial state = %s", constraintTracker.getClass().getSimpleName(), constraintTracker.f8738e), new Throwable[0]);
                            constraintTracker.d();
                        }
                        a(constraintTracker.f8738e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e(this.d, this.f8728b);
    }

    public final void e(WorkConstraintsTracker workConstraintsTracker, Object obj) {
        ArrayList<String> arrayList = this.f8727a;
        if (arrayList.isEmpty() || workConstraintsTracker == null) {
            return;
        }
        if (obj == null || c(obj)) {
            synchronized (workConstraintsTracker.f8726c) {
                WorkConstraintsCallback workConstraintsCallback = workConstraintsTracker.f8724a;
                if (workConstraintsCallback != null) {
                    workConstraintsCallback.b(arrayList);
                }
            }
            return;
        }
        synchronized (workConstraintsTracker.f8726c) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (String str : arrayList) {
                    if (workConstraintsTracker.a(str)) {
                        Logger.c().a(WorkConstraintsTracker.d, "Constraints met for " + str, new Throwable[0]);
                        arrayList2.add(str);
                    }
                }
                WorkConstraintsCallback workConstraintsCallback2 = workConstraintsTracker.f8724a;
                if (workConstraintsCallback2 != null) {
                    workConstraintsCallback2.f(arrayList2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
