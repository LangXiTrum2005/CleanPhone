package com.smartdigimkt.sdk.api.format;

import com.smartdigimkt.sdk.api.SDMAdConst;

/* JADX INFO: loaded from: classes6.dex */
public interface SDMAdEcpmInfo {
    double getEcpm(SDMAdConst.CURRENCY currency);

    String getEncEcpmInfo(SDMAdConst.CURRENCY currency);

    int getSecretId();
}
