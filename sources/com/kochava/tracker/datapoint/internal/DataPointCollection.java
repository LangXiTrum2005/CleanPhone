package com.kochava.tracker.datapoint.internal;

import android.content.Context;
import android.support.v4.media.a;
import com.kochava.core.json.internal.JsonElementApi;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.json.internal.JsonType;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadMetadata;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DataPointCollection implements DataPointCollectionApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ClassLoggerApi f28132b = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "DataPointCollection");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataPointApi[] f28133a = a();

    public abstract DataPointApi[] a();

    public abstract JsonElementApi b(Context context, PayloadMetadata payloadMetadata, String str, ArrayList arrayList, List list);

    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    public final void c(Context context, PayloadMetadata payloadMetadata, boolean z2, boolean z3, ArrayList arrayList, List list, List list2, List list3, JsonObjectApi jsonObjectApi, JsonObjectApi jsonObjectApi2) {
        DataPointApi[] dataPointApiArr;
        int i2;
        ClassLoggerApi classLoggerApi = f28132b;
        DataPointCollection dataPointCollection = this;
        DataPointApi[] dataPointApiArr2 = dataPointCollection.f28133a;
        int length = dataPointApiArr2.length;
        int i3 = 0;
        while (i3 < length) {
            DataPointApi dataPointApi = dataPointApiArr2[i3];
            String key = dataPointApi.getKey();
            PayloadType payloadType = payloadMetadata.f28257a;
            if (dataPointApi.d(payloadType)) {
                DataPointLocation dataPointLocation = DataPointLocation.X;
                if (z3 || dataPointApi.getLocation() == dataPointLocation || payloadType == PayloadType.k0) {
                    if (!list.contains(key)) {
                        if ((payloadType == PayloadType.k0 || !list2.contains(key)) && (dataPointApi.a() || !z2)) {
                            boolean zB = dataPointApi.b();
                            DataPointLocation dataPointLocation2 = DataPointLocation.f28148Y;
                            if (zB || ((dataPointApi.getLocation() != dataPointLocation2 || !jsonObjectApi2.i(key)) && (dataPointApi.getLocation() != dataPointLocation || !jsonObjectApi.i(key)))) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                dataPointApiArr = dataPointApiArr2;
                                i2 = length;
                                try {
                                    JsonElementApi jsonElementApiB = dataPointCollection.b(context, payloadMetadata, key, arrayList, list3);
                                    if (!jsonElementApiB.c() && jsonElementApiB.isValid() && ((jsonElementApiB.getType() != JsonType.Z || !TextUtil.b(jsonElementApiB.a())) && ((jsonElementApiB.getType() != JsonType.j0 || jsonElementApiB.b().length() != 0) && (jsonElementApiB.getType() != JsonType.k0 || jsonElementApiB.e().length() != 0)))) {
                                        if (dataPointApi.getLocation() == dataPointLocation) {
                                            if (dataPointApi.c()) {
                                                jsonObjectApi.b(jsonElementApiB.b());
                                            } else {
                                                jsonObjectApi.e(key, jsonElementApiB);
                                            }
                                        } else if (dataPointApi.getLocation() == dataPointLocation2) {
                                            if (dataPointApi.c()) {
                                                jsonObjectApi2.b(jsonElementApiB.b());
                                            } else {
                                                jsonObjectApi2.e(key, jsonElementApiB);
                                            }
                                        }
                                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                        if (jCurrentTimeMillis2 > 500) {
                                            StringBuilder sbY = a.y("Datapoint gathering took longer then expected for ", key, " at ");
                                            sbY.append(jCurrentTimeMillis2 / 1000.0d);
                                            sbY.append(" seconds");
                                            classLoggerApi.d(sbY.toString());
                                        }
                                    }
                                } catch (Throwable unused) {
                                    classLoggerApi.d("Unable to gather datapoint: " + key);
                                }
                            }
                        }
                    }
                    dataPointApiArr = dataPointApiArr2;
                    i2 = length;
                }
                dataPointApiArr = dataPointApiArr2;
                i2 = length;
            } else {
                dataPointApiArr = dataPointApiArr2;
                i2 = length;
            }
            i3++;
            dataPointCollection = this;
            dataPointApiArr2 = dataPointApiArr;
            length = i2;
        }
    }
}
