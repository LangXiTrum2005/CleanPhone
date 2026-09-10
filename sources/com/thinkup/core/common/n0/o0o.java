package com.thinkup.core.common.n0;

import com.thinkup.core.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public interface o0o {
    void onLoadCanceled(int i2);

    void onLoadError(int i2, String str, AdError adError);

    void onLoadFinish(int i2, Object obj);

    void onLoadStart(int i2);
}
