package com.vungle.ads.internal.protos;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: compiled from: Sdk.java */
/* JADX INFO: loaded from: classes2.dex */
public interface saneness extends MessageLiteOrBuilder {
    Sdk$SDKMetric getMetrics(int i);

    int getMetricsCount();

    List<Sdk$SDKMetric> getMetricsList();
}
