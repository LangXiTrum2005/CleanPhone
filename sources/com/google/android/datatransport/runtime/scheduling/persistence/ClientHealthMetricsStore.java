package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;

/* JADX INFO: loaded from: classes3.dex */
public interface ClientHealthMetricsStore {
    void d();

    ClientMetrics h();

    void i(long j, LogEventDropped.Reason reason, String str);
}
