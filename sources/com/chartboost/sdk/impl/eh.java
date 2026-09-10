package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f13825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zg f13826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f13827c;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13828b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke(String it) {
            Intrinsics.f(it, "it");
            return new JSONObject(it);
        }
    }

    public eh(SharedPreferences sharedPreferences, zg trackingBodyBuilder, Function1 jsonFactory) {
        Intrinsics.f(sharedPreferences, "sharedPreferences");
        Intrinsics.f(trackingBodyBuilder, "trackingBodyBuilder");
        Intrinsics.f(jsonFactory, "jsonFactory");
        this.f13825a = sharedPreferences;
        this.f13826b = trackingBodyBuilder;
        this.f13827c = jsonFactory;
    }

    public final void a(JSONArray jsonArray) {
        Intrinsics.f(jsonArray, "jsonArray");
        try {
            for (JSONObject jSONObject : w7.asList(jsonArray)) {
                this.f13825a.edit().putString(a(jSONObject), jSONObject.toString()).apply();
            }
        } catch (Exception e2) {
            za.a("cacheEventToTrackingRequestBodyAndSave error " + e2, (Throwable) null, 2, (Object) null);
        }
    }

    public final String b(ch chVar) {
        return chVar.f().getValue() + chVar.i();
    }

    public /* synthetic */ eh(SharedPreferences sharedPreferences, zg zgVar, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, zgVar, (i2 & 4) != 0 ? a.f13828b : function1);
    }

    public final void a(ch event, s6 environmentData, int i2) {
        Intrinsics.f(event, "event");
        Intrinsics.f(environmentData, "environmentData");
        if (this.f13825a.getAll().size() > i2) {
            za.a("Persistence limit reached. Drop old events!", (Throwable) null, 2, (Object) null);
            this.f13825a.edit().clear().apply();
        }
        try {
            this.f13825a.edit().putString(b(event), this.f13826b.a(event, environmentData)).apply();
        } catch (Exception e2) {
            za.a("cacheEventToTrackingRequestBodyAndSave error " + e2, (Throwable) null, 2, (Object) null);
        }
    }

    public final void a(ch event) {
        Intrinsics.f(event, "event");
        try {
            za.a("clearEventFromStorage: " + event.f().getValue(), (Throwable) null, 2, (Object) null);
            this.f13825a.edit().remove(event.f().getValue()).apply();
        } catch (Exception e2) {
            za.a("clearEventFromStorage error " + e2, (Throwable) null, 2, (Object) null);
        }
    }

    public final List a(List events, s6 environmentData) {
        Intrinsics.f(events, "events");
        Intrinsics.f(environmentData, "environmentData");
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.n(events, 10));
            Iterator it = events.iterator();
            while (it.hasNext()) {
                arrayList.add((JSONObject) this.f13827c.invoke(this.f13826b.a((ch) it.next(), environmentData)));
            }
            return arrayList;
        } catch (Exception e2) {
            za.a("cacheEventToTrackingRequestBody error " + e2, (Throwable) null, 2, (Object) null);
            return EmptyList.X;
        }
    }

    public final void a(ch event, s6 environmentData) {
        Intrinsics.f(event, "event");
        Intrinsics.f(environmentData, "environmentData");
        try {
            za.a("forcePersistEvent: " + event.f().getValue(), (Throwable) null, 2, (Object) null);
            this.f13825a.edit().putString(event.f().getValue(), this.f13826b.a(event, environmentData)).apply();
        } catch (Exception e2) {
            za.a("forcePersistEvent error " + e2, (Throwable) null, 2, (Object) null);
        }
    }

    public final String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(com.smartdigimkt.q0.b.S0) + jSONObject.getLong("event_timestamp");
    }

    public final List a() {
        try {
            List listI0 = CollectionsKt.i0(this.f13825a.getAll().values());
            ArrayList arrayList = new ArrayList(CollectionsKt.n(listI0, 10));
            Iterator it = listI0.iterator();
            while (it.hasNext()) {
                Object objInvoke = this.f13827c.invoke(String.valueOf(it.next()));
                this.f13825a.edit().clear().apply();
                arrayList.add((JSONObject) objInvoke);
            }
            return arrayList;
        } catch (Exception e2) {
            za.a("loadEventsAsJsonList error " + e2, (Throwable) null, 2, (Object) null);
            return EmptyList.X;
        }
    }
}
