package com.inmobi.media;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2956be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sd f23466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Oc f23467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2973ce f23468c;

    public C2956be(Sd telemetryConfigMetaData, List samplingEvents) {
        Intrinsics.f(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.f(samplingEvents, "samplingEvents");
        this.f23466a = telemetryConfigMetaData;
        double dRandom = Math.random();
        this.f23467b = new Oc(telemetryConfigMetaData, dRandom, samplingEvents);
        this.f23468c = new C2973ce(telemetryConfigMetaData, dRandom);
    }

    public final int a(Td telemetryEventType, String eventType) {
        Intrinsics.f(telemetryEventType, "telemetryEventType");
        Intrinsics.f(eventType, "eventType");
        int iOrdinal = telemetryEventType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            C2973ce c2973ce = this.f23468c;
            c2973ce.getClass();
            if (c2973ce.f23498b >= c2973ce.f23497a.g) {
                return 0;
            }
            Pd pd = Pd.f23077a;
            return 2;
        }
        Oc oc = this.f23467b;
        oc.getClass();
        if (!oc.f23048c.contains(eventType)) {
            return 1;
        }
        if (oc.f23047b >= oc.f23046a.g) {
            return 0;
        }
        Pd pd2 = Pd.f23077a;
        return 2;
    }
}
