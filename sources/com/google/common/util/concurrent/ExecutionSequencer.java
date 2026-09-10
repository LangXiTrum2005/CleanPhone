package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ExecutionSequencer {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ExecutionSequencer$1, reason: invalid class name */
    class AnonymousClass1 implements AsyncCallable<Object> {
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ExecutionSequencer$2, reason: invalid class name */
    class AnonymousClass2 implements AsyncCallable<Object> {
        public final String toString() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunningState {
        public static final RunningState X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ RunningState[] f20128Y;

        /* JADX INFO: Fake field, exist only in values array */
        RunningState EF0;

        static {
            RunningState runningState = new RunningState("NOT_RUN", 0);
            RunningState runningState2 = new RunningState("CANCELLED", 1);
            X = runningState2;
            f20128Y = new RunningState[]{runningState, runningState2, new RunningState("STARTED", 2)};
        }

        public static RunningState valueOf(String str) {
            return (RunningState) Enum.valueOf(RunningState.class, str);
        }

        public static RunningState[] values() {
            return (RunningState[]) f20128Y.clone();
        }
    }

    public static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {
        public Runnable X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Thread f20129Y;

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            if (get() == RunningState.X) {
                return;
            }
            this.f20129Y = Thread.currentThread();
            try {
                throw null;
            } catch (Throwable th) {
                this.f20129Y = null;
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (Thread.currentThread() == this.f20129Y) {
                throw null;
            }
            Runnable runnable = this.X;
            Objects.requireNonNull(runnable);
            this.X = null;
            runnable.run();
        }
    }

    public static final class ThreadConfinedTaskQueue {
    }
}
