package com.mbridge.msdk.mbbanner.common.listener;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface a {
    void a(CampaignEx campaignEx);

    void a(boolean z10);

    void a(boolean z10, String str);

    void close();

    void readyStatus(int i10);

    void toggleCloseBtn(int i10);

    void triggerCloseBtn(String str);
}
