package com.kochava.tracker.datapoint.internal;

import android.content.Context;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.tracker.payload.internal.PayloadMetadata;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class DataPointManager implements DataPointManagerApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataPointCollectionInstance f28149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataPointCollectionIdentifiers f28150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataPointCollectionState f28151c;
    public final DataPointCollection d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28152e = false;
    public ArrayList f = new ArrayList();
    public List g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f28153h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f28154i = new ArrayList();
    public List j = new ArrayList();
    public List k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f28155l = new ArrayList();

    public DataPointManager() {
        DataPointCollectionInstance dataPointCollectionInstance = new DataPointCollectionInstance();
        DataPointCollection dataPointCollection = null;
        dataPointCollectionInstance.f28141c = null;
        dataPointCollectionInstance.d = null;
        dataPointCollectionInstance.f28142e = null;
        dataPointCollectionInstance.f = null;
        dataPointCollectionInstance.g = null;
        dataPointCollectionInstance.f28143h = null;
        dataPointCollectionInstance.f28144i = 0L;
        dataPointCollectionInstance.j = null;
        dataPointCollectionInstance.k = null;
        dataPointCollectionInstance.f28145l = null;
        dataPointCollectionInstance.m = null;
        dataPointCollectionInstance.f28146n = null;
        dataPointCollectionInstance.o = null;
        dataPointCollectionInstance.f28147p = null;
        dataPointCollectionInstance.q = null;
        dataPointCollectionInstance.r = null;
        dataPointCollectionInstance.s = null;
        this.f28149a = dataPointCollectionInstance;
        DataPointCollectionIdentifiers dataPointCollectionIdentifiers = new DataPointCollectionIdentifiers();
        dataPointCollectionIdentifiers.f28134c = null;
        dataPointCollectionIdentifiers.d = null;
        dataPointCollectionIdentifiers.f28135e = null;
        dataPointCollectionIdentifiers.f = null;
        dataPointCollectionIdentifiers.g = null;
        dataPointCollectionIdentifiers.f28136h = null;
        dataPointCollectionIdentifiers.f28137i = null;
        dataPointCollectionIdentifiers.j = null;
        dataPointCollectionIdentifiers.k = null;
        dataPointCollectionIdentifiers.f28138l = null;
        dataPointCollectionIdentifiers.m = null;
        dataPointCollectionIdentifiers.f28139n = null;
        dataPointCollectionIdentifiers.o = null;
        dataPointCollectionIdentifiers.f28140p = null;
        dataPointCollectionIdentifiers.q = null;
        this.f28150b = dataPointCollectionIdentifiers;
        this.f28151c = new DataPointCollectionState();
        try {
            Object objNewInstance = Class.forName("com.kochava.tracker.datapointnetwork.internal.DataPointCollectionNetwork").newInstance();
            if (!(objNewInstance instanceof DataPointCollection)) {
                throw new Exception("DataPointCollection of invalid type");
            }
            dataPointCollection = (DataPointCollection) objNewInstance;
            this.d = dataPointCollection;
        } catch (Throwable unused) {
            DataPointCollection.f28132b.d("Unable to build data collection module com.kochava.tracker.datapointnetwork.internal.DataPointCollectionNetwork");
        }
    }

    public final synchronized void a(Context context, PayloadMetadata payloadMetadata, boolean z2, JsonObjectApi jsonObjectApi, JsonObjectApi jsonObjectApi2) {
        JsonObjectApi jsonObjectApi3;
        this.f28149a.c(context, payloadMetadata, z2, this.f28152e, this.f, this.g, this.k, this.j, jsonObjectApi, jsonObjectApi2);
        this.f28150b.c(context, payloadMetadata, z2, this.f28152e, this.f, this.g, this.k, this.j, jsonObjectApi, jsonObjectApi2);
        this.f28151c.c(context, payloadMetadata, z2, this.f28152e, this.f, this.g, this.k, this.j, jsonObjectApi, jsonObjectApi2);
        DataPointCollection dataPointCollection = this.d;
        if (dataPointCollection != null) {
            jsonObjectApi3 = jsonObjectApi2;
            dataPointCollection.c(context, payloadMetadata, z2, this.f28152e, this.f, this.g, this.k, this.j, jsonObjectApi, jsonObjectApi3);
        } else {
            jsonObjectApi3 = jsonObjectApi2;
        }
        if (z2) {
            for (String str : this.g) {
                if (!str.isEmpty()) {
                    jsonObjectApi3.remove(str);
                    jsonObjectApi.remove(str);
                }
            }
            if (payloadMetadata.f28257a != PayloadType.k0) {
                for (String str2 : this.k) {
                    if (!str2.isEmpty()) {
                        jsonObjectApi3.remove(str2);
                        jsonObjectApi.remove(str2);
                    }
                }
            }
            if (payloadMetadata.f28257a == PayloadType.l0) {
                List<String> list = this.j;
                JsonObjectApi jsonObjectApiK = jsonObjectApi3.k("identity_link", false);
                if (jsonObjectApiK != null) {
                    for (String str3 : list) {
                        if (!str3.isEmpty()) {
                            jsonObjectApiK.remove(str3);
                        }
                    }
                    if (jsonObjectApiK.length() == 0) {
                        jsonObjectApi3.remove("identity_link");
                    }
                }
            }
        }
    }

    public final synchronized DataPointCollectionIdentifiers b() {
        return this.f28150b;
    }

    public final synchronized DataPointCollectionInstance c() {
        return this.f28149a;
    }

    public final synchronized boolean d(String str) {
        return !this.f28154i.contains(str);
    }

    public final synchronized boolean e(String str) {
        return !this.j.contains(str);
    }

    public final synchronized boolean f(PayloadType payloadType, String str) {
        if (this.g.contains(str)) {
            return false;
        }
        return payloadType == PayloadType.k0 || !this.k.contains(str);
    }

    public final synchronized void g(List list) {
        this.f28154i = list;
    }

    public final synchronized void h(boolean z2) {
        this.f28152e = z2;
    }

    public final synchronized void i(List list) {
        this.j = list;
    }
}
