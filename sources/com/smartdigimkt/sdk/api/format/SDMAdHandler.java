package com.smartdigimkt.sdk.api.format;

/* JADX INFO: loaded from: classes6.dex */
public interface SDMAdHandler {
    SDMAd getSDMAd();

    void notifyLoss(SDMLossInfo sDMLossInfo);

    void notifyWin(SDMWinInfo sDMWinInfo);
}
