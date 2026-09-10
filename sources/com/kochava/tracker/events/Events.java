package com.kochava.tracker.events;

import android.os.Bundle;
import com.kochava.core.json.internal.JsonElement;
import com.kochava.core.json.internal.JsonElementApi;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.json.internal.JsonType;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.tracker.modules.events.internal.EventsControllerApi;
import com.kochava.tracker.modules.events.internal.EventsModuleApi;
import com.smartdigimkt.q0.b;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Events implements EventsApi, EventsModuleApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ClassLoggerApi f28166c = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, BuildConfig.SDK_MODULE_NAME);
    private static final Object d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Events f28167e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<JsonObjectApi> f28168a = new ArrayBlockingQueue(100);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EventsControllerApi f28169b = null;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventsControllerApi f28170a;

        public a(EventsControllerApi eventsControllerApi) {
            this.f28170a = eventsControllerApi;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                JsonObjectApi jsonObjectApi = (JsonObjectApi) Events.this.f28168a.poll();
                if (jsonObjectApi == null) {
                    return;
                }
                try {
                    this.f28170a.i(jsonObjectApi);
                } catch (Throwable th) {
                    Events.f28166c.c("action failed, unknown error occurred");
                    Events.f28166c.c(th);
                }
            }
        }
    }

    private Events() {
    }

    private void b() {
        EventsControllerApi eventsControllerApi = this.f28169b;
        if (eventsControllerApi == null) {
            f28166c.d("Cannot flush queue, SDK not started");
        } else {
            eventsControllerApi.f().b(new a(eventsControllerApi));
        }
    }

    public static EventsApi getInstance() {
        if (f28167e == null) {
            synchronized (d) {
                try {
                    if (f28167e == null) {
                        f28167e = new Events();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28167e;
    }

    public synchronized EventsControllerApi getController() {
        return this.f28169b;
    }

    @Override // com.kochava.tracker.events.EventsApi
    public void send(String str) {
        a(str, null);
    }

    @Override // com.kochava.tracker.events.EventsApi
    public void sendWithDictionary(String str, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            a(str, null);
        } else {
            a(str, ObjectUtil.l(jSONObject, true).p());
        }
    }

    @Override // com.kochava.tracker.events.EventsApi
    public void sendWithEvent(EventApi eventApi) {
        ClassLoggerApi classLoggerApi = f28166c;
        com.kochava.tracker.log.internal.Logger.c(classLoggerApi, "Host called API: Send Event");
        if (eventApi == null || TextUtil.b(eventApi.getEventName())) {
            classLoggerApi.c("sendWithEvent failed, invalid event");
            return;
        }
        this.f28168a.offer(new JsonObject(eventApi.getData()));
        b();
    }

    @Override // com.kochava.tracker.events.EventsApi
    public void sendWithString(String str, String str2) {
        JsonObjectApi jsonObjectApiK = ObjectUtil.k(str2);
        if (jsonObjectApiK != null && jsonObjectApiK.length() > 0) {
            a(str, jsonObjectApiK.p());
        } else if (TextUtil.b(str2)) {
            a(str, null);
        } else {
            a(str, new JsonElement(str2));
        }
    }

    @Override // com.kochava.tracker.modules.events.internal.EventsModuleApi
    public synchronized void setController(EventsControllerApi eventsControllerApi) {
        try {
            this.f28169b = eventsControllerApi;
            if (eventsControllerApi != null) {
                b();
            } else {
                this.f28168a.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(String str, JsonElementApi jsonElementApi) {
        ClassLoggerApi classLoggerApi = f28166c;
        com.kochava.tracker.log.internal.Logger.c(classLoggerApi, "Host called API: Send Event");
        if (!TextUtil.b(str) && (jsonElementApi == null || jsonElementApi.getType() == JsonType.Z || jsonElementApi.getType() == JsonType.j0)) {
            JsonObject jsonObjectW = JsonObject.w();
            jsonObjectW.g(b.S0, str);
            if (jsonElementApi != null) {
                jsonObjectW.e("event_data", jsonElementApi);
            }
            this.f28168a.offer(jsonObjectW);
            b();
            return;
        }
        classLoggerApi.c("send failed, invalid event name or data");
    }

    @Override // com.kochava.tracker.events.EventsApi
    public void sendWithDictionary(String str, Map<String, Object> map) {
        if (map != null && map.size() > 0) {
            a(str, ObjectUtil.l(map, true).p());
        } else {
            a(str, null);
        }
    }

    @Override // com.kochava.tracker.events.EventsApi
    public void sendWithDictionary(String str, Bundle bundle) {
        if (bundle != null && bundle.size() > 0) {
            a(str, ObjectUtil.l(bundle, true).p());
        } else {
            a(str, null);
        }
    }
}
