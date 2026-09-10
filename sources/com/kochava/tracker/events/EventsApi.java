package com.kochava.tracker.events;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface EventsApi {
    void send(String str);

    void sendWithDictionary(String str, Bundle bundle);

    void sendWithDictionary(String str, Map<String, Object> map);

    void sendWithDictionary(String str, JSONObject jSONObject);

    void sendWithEvent(EventApi eventApi);

    void sendWithString(String str, String str2);
}
