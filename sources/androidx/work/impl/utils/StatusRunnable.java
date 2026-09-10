package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class StatusRunnable<T> implements Runnable {

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$1, reason: invalid class name */
    class AnonymousClass1 extends StatusRunnable<List<WorkInfo>> {
        @Override // androidx.work.impl.utils.StatusRunnable
        public final Object b() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$2, reason: invalid class name */
    class AnonymousClass2 extends StatusRunnable<WorkInfo> {
        @Override // androidx.work.impl.utils.StatusRunnable
        public final Object b() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$3, reason: invalid class name */
    class AnonymousClass3 extends StatusRunnable<List<WorkInfo>> {
        @Override // androidx.work.impl.utils.StatusRunnable
        public final Object b() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$4, reason: invalid class name */
    class AnonymousClass4 extends StatusRunnable<List<WorkInfo>> {
        @Override // androidx.work.impl.utils.StatusRunnable
        public final Object b() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$5, reason: invalid class name */
    class AnonymousClass5 extends StatusRunnable<List<WorkInfo>> {
        @Override // androidx.work.impl.utils.StatusRunnable
        public final Object b() {
            throw null;
        }
    }

    public abstract Object b();

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r1 = this;
            r0 = 0
            r1.b()     // Catch: java.lang.Throwable -> L5
            throw r0     // Catch: java.lang.Throwable -> L5
        L5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.StatusRunnable.run():void");
    }
}
