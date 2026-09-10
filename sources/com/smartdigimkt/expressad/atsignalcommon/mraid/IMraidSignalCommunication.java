package com.smartdigimkt.expressad.atsignalcommon.mraid;

import com.smartdigimkt.x.d;

/* JADX INFO: loaded from: classes5.dex */
public interface IMraidSignalCommunication {
    void close();

    void expand(String str, boolean z2);

    d getMraidCampaign();

    void open(String str);

    void unload();

    void useCustomClose(boolean z2);
}
