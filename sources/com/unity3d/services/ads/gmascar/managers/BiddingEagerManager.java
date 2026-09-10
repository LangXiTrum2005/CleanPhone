package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class BiddingEagerManager extends BiddingBaseManager {
    public BiddingEagerManager(IScarAdFormatProvider iScarAdFormatProvider, IUnityAdsTokenListener iUnityAdsTokenListener) {
        super(iScarAdFormatProvider, iUnityAdsTokenListener);
    }

    @Override // com.unity3d.services.ads.gmascar.managers.BiddingBaseManager
    public void start() {
        permitSignalsUpload();
        fetchSignals();
    }
}
