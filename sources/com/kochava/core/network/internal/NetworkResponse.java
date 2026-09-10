package com.kochava.core.network.internal;

import com.kochava.core.json.internal.JsonElement;
import com.kochava.core.json.internal.JsonElementApi;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.network.base.internal.NetworkBaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class NetworkResponse extends NetworkBaseResponse implements NetworkResponseApi {
    public final JsonElement f;

    public NetworkResponse(boolean z2, boolean z3, long j, long j2, JsonObject jsonObject, JsonElement jsonElement) {
        super(z2, z3, j, j2, jsonObject);
        this.f = jsonElement;
    }

    public final JsonElementApi b() {
        if (this.f28045b) {
            return this.f;
        }
        throw new IllegalStateException("Data not accessible on failure.");
    }
}
