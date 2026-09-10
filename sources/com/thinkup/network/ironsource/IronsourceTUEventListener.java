package com.thinkup.network.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public interface IronsourceTUEventListener {
    void notifyClick();

    void notifyClose();

    void notifyLoadFail(String str, String str2);

    void notifyLoaded();

    void notifyPlayEnd();

    void notifyPlayFail(String str, String str2);

    void notifyPlayStart();

    void notifyReward();
}
