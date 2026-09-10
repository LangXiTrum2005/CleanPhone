package com.kochava.tracker.payload.internal;

import android.content.Context;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.network.internal.NetworkResponseApi;
import com.kochava.tracker.datapoint.internal.DataPointManager;

/* JADX INFO: loaded from: classes5.dex */
public interface PayloadApi {
    NetworkResponseApi a(Context context, int i2, long[] jArr);

    JsonObjectApi b();

    boolean c(DataPointManager dataPointManager);

    void d(Context context, DataPointManager dataPointManager);

    JsonObjectApi getData();

    JsonObject toJson();
}
