package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@Encodable
public abstract class ProtoEncoderDoNotUse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProtobufEncoder f16835a;

    static {
        ProtobufEncoder.Builder builder = new ProtobufEncoder.Builder();
        builder.a(ProtoEncoderDoNotUse.class, AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder.f16800a);
        builder.a(ClientMetrics.class, AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.f16788a);
        builder.a(TimeWindow.class, AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder.f16805a);
        builder.a(LogSourceMetrics.class, AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder.f16797a);
        builder.a(LogEventDropped.class, AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder.f16794a);
        builder.a(GlobalMetrics.class, AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder.f16792a);
        builder.a(StorageMetrics.class, AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder.f16802a);
        f16835a = new ProtobufEncoder(new HashMap(builder.f20811a), new HashMap(builder.f20812b), builder.f20813c);
    }

    public abstract ClientMetrics a();
}
