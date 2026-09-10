package com.kochava.tracker.datapoint.internal;

import com.kochava.tracker.payload.internal.PayloadType;

/* JADX INFO: loaded from: classes5.dex */
public interface DataPointApi {
    boolean a();

    boolean b();

    boolean c();

    boolean d(PayloadType payloadType);

    String getKey();

    DataPointLocation getLocation();
}
