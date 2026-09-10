package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.EventInternal;

/* JADX INFO: loaded from: classes3.dex */
public interface TransportBackend {
    EventInternal a(EventInternal eventInternal);

    BackendResponse b(BackendRequest backendRequest);
}
