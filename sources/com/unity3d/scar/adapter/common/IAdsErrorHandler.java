package com.unity3d.scar.adapter.common;

import com.unity3d.scar.adapter.common.IUnityAdsError;

/* JADX INFO: loaded from: classes6.dex */
public interface IAdsErrorHandler<T extends IUnityAdsError> {
    void handleError(IUnityAdsError iUnityAdsError);
}
