package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class SequentialExecutor implements Executor {
    public static final Logger g0 = Logger.getLogger(SequentialExecutor.class.getName());
    public final Executor X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayDeque f20254Y = new ArrayDeque();
    public WorkerRunningState Z = WorkerRunningState.X;
    public long e0 = 0;
    public final QueueWorker f0 = new QueueWorker();

    public final class QueueWorker implements Runnable {
        public Runnable X;

        public QueueWorker() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0036 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        
            r9.X.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
        
            com.google.firebase.concurrent.SequentialExecutor.g0.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.X, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
        
            r9.X = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.firebase.concurrent.SequentialExecutor r2 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L50
                java.util.ArrayDeque r2 = r2.f20254Y     // Catch: java.lang.Throwable -> L50
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L50
                if (r0 != 0) goto L28
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = r0.Z     // Catch: java.lang.Throwable -> L1c
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.e0     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L40
            L14:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L40
            L1c:
                r0 = move-exception
                goto L73
            L1e:
                long r5 = r0.e0     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.e0 = r5     // Catch: java.lang.Throwable -> L1c
                r0.Z = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                com.google.firebase.concurrent.SequentialExecutor r3 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.f20254Y     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                r9.X = r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L41
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.X     // Catch: java.lang.Throwable -> L1c
                r0.Z = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L40
                goto L14
            L40:
                return
            L41:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L50
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.X     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
                r3.run()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            L4d:
                r9.X = r2     // Catch: java.lang.Throwable -> L50
                goto L2
            L50:
                r0 = move-exception
                goto L75
            L52:
                r0 = move-exception
                goto L70
            L54:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.SequentialExecutor.g0     // Catch: java.lang.Throwable -> L52
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L52
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
                r6.<init>()     // Catch: java.lang.Throwable -> L52
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.Runnable r7 = r9.X     // Catch: java.lang.Throwable -> L52
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L52
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
                goto L4d
            L70:
                r9.X = r2     // Catch: java.lang.Throwable -> L50
                throw r0     // Catch: java.lang.Throwable -> L50
            L73:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L50
            L75:
                if (r1 == 0) goto L7e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L7e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.QueueWorker.b():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                b();
            } catch (Error e2) {
                synchronized (SequentialExecutor.this.f20254Y) {
                    SequentialExecutor.this.Z = WorkerRunningState.X;
                    throw e2;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.X;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.Z + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WorkerRunningState {
        public static final WorkerRunningState X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final WorkerRunningState f20256Y;
        public static final WorkerRunningState Z;
        public static final WorkerRunningState e0;
        public static final /* synthetic */ WorkerRunningState[] f0;

        static {
            WorkerRunningState workerRunningState = new WorkerRunningState("IDLE", 0);
            X = workerRunningState;
            WorkerRunningState workerRunningState2 = new WorkerRunningState("QUEUING", 1);
            f20256Y = workerRunningState2;
            WorkerRunningState workerRunningState3 = new WorkerRunningState("QUEUED", 2);
            Z = workerRunningState3;
            WorkerRunningState workerRunningState4 = new WorkerRunningState("RUNNING", 3);
            e0 = workerRunningState4;
            f0 = new WorkerRunningState[]{workerRunningState, workerRunningState2, workerRunningState3, workerRunningState4};
        }

        public static WorkerRunningState valueOf(String str) {
            return (WorkerRunningState) Enum.valueOf(WorkerRunningState.class, str);
        }

        public static WorkerRunningState[] values() {
            return (WorkerRunningState[]) f0.clone();
        }
    }

    public SequentialExecutor(Executor executor) {
        this.X = (Executor) Preconditions.checkNotNull(executor);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        WorkerRunningState workerRunningState;
        boolean z2;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f20254Y) {
            WorkerRunningState workerRunningState2 = this.Z;
            if (workerRunningState2 != WorkerRunningState.e0 && workerRunningState2 != (workerRunningState = WorkerRunningState.Z)) {
                long j = this.e0;
                Runnable runnable2 = new Runnable() { // from class: com.google.firebase.concurrent.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        runnable.run();
                    }

                    public final String toString() {
                        return runnable.toString();
                    }
                };
                this.f20254Y.add(runnable2);
                WorkerRunningState workerRunningState3 = WorkerRunningState.f20256Y;
                this.Z = workerRunningState3;
                try {
                    this.X.execute(this.f0);
                    if (this.Z != workerRunningState3) {
                        return;
                    }
                    synchronized (this.f20254Y) {
                        try {
                            if (this.e0 == j && this.Z == workerRunningState3) {
                                this.Z = workerRunningState;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.f20254Y) {
                        try {
                            WorkerRunningState workerRunningState4 = this.Z;
                            if (workerRunningState4 != WorkerRunningState.X && workerRunningState4 != WorkerRunningState.f20256Y) {
                                z2 = false;
                            } else if (this.f20254Y.removeLastOccurrence(runnable2)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!(e2 instanceof RejectedExecutionException) || z2) {
                                throw e2;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f20254Y.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.X + "}";
    }
}
