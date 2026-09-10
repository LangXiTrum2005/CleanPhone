package com.kochava.tracker.init.internal;

import com.kochava.core.json.internal.JsonArray;
import com.kochava.core.json.internal.JsonArrayApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class InitResponseNetworking implements InitResponseNetworkingApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f28208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f28209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InitResponseNetworkingUrls f28210c;
    public final JsonArrayApi d;

    public InitResponseNetworking() {
        this.f28208a = 10.0d;
        this.f28209b = 0.0d;
        this.f28210c = new InitResponseNetworkingUrls();
        this.d = JsonArray.g();
    }

    public final long[] a() {
        double[] dArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            JsonArrayApi jsonArrayApi = this.d;
            if (i2 >= jsonArrayApi.length()) {
                break;
            }
            Double d = jsonArrayApi.getDouble(i2);
            if (d != null) {
                arrayList.add(d);
            }
            i2++;
        }
        if (arrayList.isEmpty()) {
            dArr = new double[]{7.0d, 30.0d, 300.0d, 1800.0d};
        } else {
            int size = arrayList.size();
            double[] dArr2 = new double[size];
            for (int i3 = 0; i3 < size; i3++) {
                Double d2 = (Double) arrayList.get(i3);
                dArr2[i3] = d2 != null ? d2.doubleValue() : 0.0d;
            }
            dArr = dArr2;
        }
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            jArr[i4] = Math.round(dArr[i4] * 1000.0d);
        }
        return jArr;
    }

    public InitResponseNetworking(double d, double d2, InitResponseNetworkingUrls initResponseNetworkingUrls, JsonArrayApi jsonArrayApi) {
        this.f28208a = d;
        this.f28209b = d2;
        this.f28210c = initResponseNetworkingUrls;
        this.d = jsonArrayApi;
    }
}
