package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExecutionModule_ExecutorFactory f16834a = new ExecutionModule_ExecutorFactory();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SafeLoggingExecutor(Executors.newSingleThreadExecutor());
    }
}
