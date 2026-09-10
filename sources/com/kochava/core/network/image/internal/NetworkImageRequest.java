package com.kochava.core.network.image.internal;

import android.graphics.Bitmap;
import com.kochava.core.downloader.internal.ImageDownloadJob;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.network.base.internal.NetworkBaseRequest;
import com.kochava.core.network.internal.NetworkValidateResult;
import com.kochava.core.util.internal.ObjectUtil;
import com.p004ironsource.qt;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class NetworkImageRequest extends NetworkBaseRequest implements NetworkImageRequestApi {
    public final NetworkImageResponse h(int i2, ImageDownloadJob imageDownloadJob, long j, JsonObject jsonObject, boolean z2, Bitmap bitmap) {
        NetworkValidateResult networkValidateResult;
        if (!z2 || bitmap == null) {
            networkValidateResult = i2 > 4 ? new NetworkValidateResult(0L, false, false) : new NetworkValidateResult(-1L, false, true);
        } else {
            networkValidateResult = new NetworkValidateResult(0L, true, false);
        }
        if (networkValidateResult.f28048a && bitmap != null) {
            return new NetworkImageResponse(true, false, 0L, j, jsonObject, bitmap);
        }
        long j2 = networkValidateResult.f28050c;
        if (j2 < 0) {
            return new NetworkImageResponse(false, networkValidateResult.f28049b, e(i2), j, jsonObject, null);
        }
        return new NetworkImageResponse(false, networkValidateResult.f28049b, j2, j, jsonObject, null);
    }

    public final synchronized NetworkImageResponse i(int i2, ImageDownloadJob imageDownloadJob) {
        long jCurrentTimeMillis;
        JsonObject jsonObjectW;
        Bitmap bitmapF;
        jCurrentTimeMillis = System.currentTimeMillis();
        jsonObjectW = JsonObject.w();
        try {
            try {
                bitmapF = NetworkBaseRequest.f(jsonObjectW, this.f28040a, this.f28041b, this.d, this.f28042c);
                jsonObjectW.q((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
                jsonObjectW.g("url", this.f28041b.toString());
                jsonObjectW.o(qt.f26623n, true);
            } catch (Throwable th) {
                jsonObjectW.q((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
                jsonObjectW.g("url", this.f28041b.toString());
                jsonObjectW.o(qt.f26623n, false);
                throw th;
            }
        } catch (IOException e2) {
            String strN = ObjectUtil.n(e2.getMessage());
            jsonObjectW.g("error", strN != null ? strN : "");
            NetworkImageResponse networkImageResponseH = h(i2, imageDownloadJob, System.currentTimeMillis() - jCurrentTimeMillis, jsonObjectW, false, null);
            jsonObjectW.q((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
            jsonObjectW.g("url", this.f28041b.toString());
            jsonObjectW.o(qt.f26623n, false);
            return networkImageResponseH;
        }
        return h(i2, imageDownloadJob, System.currentTimeMillis() - jCurrentTimeMillis, jsonObjectW, true, bitmapF);
    }
}
