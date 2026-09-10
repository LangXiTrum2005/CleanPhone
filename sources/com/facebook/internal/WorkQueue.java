package com.facebook.internal;

import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/WorkQueue;", "", "Companion", "WorkItem", "WorkNode", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class WorkQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f16399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WorkNode f16400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkNode f16401c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16402e;
    public final Executor f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/WorkQueue$Companion;", "", "", "DEFAULT_MAX_CONCURRENT", "I", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final void a(boolean z2) {
            if (!z2) {
                throw new FacebookException("Validation failed");
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/WorkQueue$WorkItem;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface WorkItem {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/WorkQueue$WorkNode;", "Lcom/facebook/internal/WorkQueue$WorkItem;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public final class WorkNode implements WorkItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WorkNode f16403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WorkNode f16404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16405c;
        public final Runnable d;

        public WorkNode(Runnable runnable) {
            this.d = runnable;
        }

        public final WorkNode a(WorkNode workNode, boolean z2) {
            Companion.a(this.f16403a == null);
            Companion.a(this.f16404b == null);
            if (workNode == null) {
                this.f16404b = this;
                this.f16403a = this;
                workNode = this;
            } else {
                this.f16403a = workNode;
                WorkNode workNode2 = workNode.f16404b;
                this.f16404b = workNode2;
                if (workNode2 != null) {
                    workNode2.f16403a = this;
                }
                WorkNode workNode3 = this.f16403a;
                if (workNode3 != null) {
                    workNode3.f16404b = workNode2 != null ? workNode2.f16403a : null;
                }
            }
            return z2 ? this : workNode;
        }

        public final WorkNode b(WorkNode workNode) {
            Companion.a(this.f16403a != null);
            Companion.a(this.f16404b != null);
            if (workNode == this && (workNode = this.f16403a) == this) {
                workNode = null;
            }
            WorkNode workNode2 = this.f16403a;
            if (workNode2 != null) {
                workNode2.f16404b = this.f16404b;
            }
            WorkNode workNode3 = this.f16404b;
            if (workNode3 != null) {
                workNode3.f16403a = workNode2;
            }
            this.f16404b = null;
            this.f16403a = null;
            return workNode;
        }
    }

    public WorkQueue(int i2, int i3) {
        Executor executorE = FacebookSdk.e();
        this.f16402e = i2;
        this.f = executorE;
        this.f16399a = new ReentrantLock();
    }

    public static WorkItem a(WorkQueue workQueue, Runnable runnable) {
        workQueue.getClass();
        WorkNode workNode = workQueue.new WorkNode(runnable);
        ReentrantLock reentrantLock = workQueue.f16399a;
        reentrantLock.lock();
        try {
            workQueue.f16400b = workNode.a(workQueue.f16400b, true);
            reentrantLock.unlock();
            workQueue.b(null);
            return workNode;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(WorkNode workNode) {
        final WorkNode workNode2;
        ReentrantLock reentrantLock = this.f16399a;
        reentrantLock.lock();
        if (workNode != null) {
            this.f16401c = workNode.b(this.f16401c);
            this.d--;
        }
        if (this.d < this.f16402e) {
            workNode2 = this.f16400b;
            if (workNode2 != null) {
                this.f16400b = workNode2.b(workNode2);
                this.f16401c = workNode2.a(this.f16401c, false);
                this.d++;
                workNode2.f16405c = true;
            }
        } else {
            workNode2 = null;
        }
        reentrantLock.unlock();
        if (workNode2 != null) {
            this.f.execute(new Runnable() { // from class: com.facebook.internal.WorkQueue$execute$1
                @Override // java.lang.Runnable
                public final void run() {
                    WorkQueue workQueue = this.X;
                    WorkQueue.WorkNode workNode3 = workNode2;
                    if (CrashShieldHandler.b(this)) {
                        return;
                    }
                    try {
                        try {
                            workNode3.d.run();
                        } finally {
                            workQueue.b(workNode3);
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.a(this, th);
                    }
                }
            });
        }
    }
}
