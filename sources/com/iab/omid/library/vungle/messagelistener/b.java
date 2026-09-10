package com.iab.omid.library.vungle.messagelistener;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface b {
    String getListenerName();

    void onMessageReceived(String str, JSONObject jSONObject);

    void onWebMessageListenerUnsupported();
}
