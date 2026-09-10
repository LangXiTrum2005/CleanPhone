package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sd f23046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f23047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23048c;

    public Oc(Sd telemetryConfigMetaData, double d, List samplingEvents) {
        Intrinsics.f(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.f(samplingEvents, "samplingEvents");
        this.f23046a = telemetryConfigMetaData;
        this.f23047b = d;
        this.f23048c = samplingEvents;
    }
}
