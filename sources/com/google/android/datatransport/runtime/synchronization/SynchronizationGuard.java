package com.google.android.datatransport.runtime.synchronization;

/* JADX INFO: loaded from: classes3.dex */
public interface SynchronizationGuard {

    public interface CriticalSection<T> {
        Object execute();
    }

    Object a(CriticalSection criticalSection);
}
