package com.unity3d.scar.adapter.common;

import android.support.v4.media.a;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;

/* JADX INFO: loaded from: classes6.dex */
public class GMAAdsError extends WebViewAdsError {
    public static GMAAdsError a(ScarAdMetadata scarAdMetadata) {
        String strC = a.C("Cannot show ad that is not loaded for placement ", scarAdMetadata.f42790a);
        return new GMAAdsError(GMAEvent.t0, strC, scarAdMetadata.f42790a, scarAdMetadata.f42791b, strC);
    }

    @Override // com.unity3d.scar.adapter.common.WebViewAdsError
    public final String getDomain() {
        return "GMA";
    }
}
