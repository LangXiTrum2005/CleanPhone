package com.smartdigimkt.j;

import com.smartdigimkt.expressad.atsignalcommon.mraid.IMraidSignalCommunication;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IMraidSignalCommunication {
    void a(Object obj, String str);

    void cai(Object obj, String str);

    void click(Object obj, String str);

    void getFileInfo(Object obj, String str);

    void getNetstat(Object obj, String str);

    void handlerH5Exception(Object obj, String str);

    void increaseOfferFrequence(Object obj, String str);

    void init(Object obj, String str);

    void install(Object obj, String str);

    void openURL(Object obj, String str);

    void readyStatus(Object obj, String str);

    void reportUrls(Object obj, String str);

    void resetCountdown(Object obj, String str);

    void sendImpressions(Object obj, String str);

    void toggleCloseBtn(Object obj, String str);

    void triggerCloseBtn(Object obj, String str);
}
