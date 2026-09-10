package com.mbridge.msdk.mbsignalcommon.mraid;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface b {
    void close();

    void expand(String str, boolean z10);

    CampaignEx getMraidCampaign();

    void open(String str);

    void unload();

    void useCustomClose(boolean z10);
}
