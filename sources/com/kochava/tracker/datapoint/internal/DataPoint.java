package com.kochava.tracker.datapoint.internal;

import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class DataPoint implements DataPointApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataPointLocation f28129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28130c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28131e;
    public final ArrayList f;

    public DataPoint(String str, DataPointLocation dataPointLocation, boolean z2, boolean z3, boolean z4, PayloadType... payloadTypeArr) {
        this.f28128a = str;
        this.f28129b = dataPointLocation;
        this.f28130c = z2;
        this.d = z3;
        this.f28131e = z4;
        this.f = new ArrayList(Arrays.asList(payloadTypeArr));
    }

    public static DataPoint e(String str, boolean z2, boolean z3, PayloadType... payloadTypeArr) {
        return new DataPoint(str, DataPointLocation.f28148Y, true, z2, z3, payloadTypeArr);
    }

    public static DataPoint f(String str, boolean z2, boolean z3, PayloadType... payloadTypeArr) {
        return new DataPoint(str, DataPointLocation.X, z2, z3, false, payloadTypeArr);
    }

    @Override // com.kochava.tracker.datapoint.internal.DataPointApi
    public final boolean a() {
        return this.f28130c;
    }

    @Override // com.kochava.tracker.datapoint.internal.DataPointApi
    public final boolean b() {
        return this.d;
    }

    @Override // com.kochava.tracker.datapoint.internal.DataPointApi
    public final boolean c() {
        return this.f28131e;
    }

    @Override // com.kochava.tracker.datapoint.internal.DataPointApi
    public final boolean d(PayloadType payloadType) {
        return this.f.contains(payloadType);
    }

    @Override // com.kochava.tracker.datapoint.internal.DataPointApi
    public final String getKey() {
        return this.f28128a;
    }

    @Override // com.kochava.tracker.datapoint.internal.DataPointApi
    public final DataPointLocation getLocation() {
        return this.f28129b;
    }
}
