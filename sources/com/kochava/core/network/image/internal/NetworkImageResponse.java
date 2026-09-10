package com.kochava.core.network.image.internal;

import android.graphics.Bitmap;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.network.base.internal.NetworkBaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public class NetworkImageResponse extends NetworkBaseResponse implements NetworkImageResponseApi {
    public final Bitmap f;

    public NetworkImageResponse(boolean z2, boolean z3, long j, long j2, JsonObject jsonObject, Bitmap bitmap) {
        super(z2, z3, j, j2, jsonObject);
        this.f = bitmap;
    }
}
