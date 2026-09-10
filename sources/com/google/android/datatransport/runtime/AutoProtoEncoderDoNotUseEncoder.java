package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.proto.AtProtobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {

    public static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClientMetricsEncoder f16788a = new ClientMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16790c;
        public static final FieldDescriptor d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f16791e;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("window");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f20798a = 1;
            builder.b(atProtobuf.a());
            f16789b = builder.a();
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("logSourceMetrics");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f20798a = 2;
            builder2.b(atProtobuf2.a());
            f16790c = builder2.a();
            FieldDescriptor.Builder builder3 = new FieldDescriptor.Builder("globalMetrics");
            AtProtobuf atProtobuf3 = new AtProtobuf();
            atProtobuf3.f20798a = 3;
            builder3.b(atProtobuf3.a());
            d = builder3.a();
            FieldDescriptor.Builder builder4 = new FieldDescriptor.Builder("appNamespace");
            AtProtobuf atProtobuf4 = new AtProtobuf();
            atProtobuf4.f20798a = 4;
            builder4.b(atProtobuf4.a());
            f16791e = builder4.a();
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ClientMetrics clientMetrics = (ClientMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f16789b, clientMetrics.f16876a);
            objectEncoderContext.f(f16790c, clientMetrics.f16877b);
            objectEncoderContext.f(d, clientMetrics.f16878c);
            objectEncoderContext.f(f16791e, clientMetrics.d);
        }
    }

    public static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GlobalMetricsEncoder f16792a = new GlobalMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16793b;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("storageMetrics");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f20798a = 1;
            builder.b(atProtobuf.a());
            f16793b = builder.a();
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).f(f16793b, ((GlobalMetrics) obj).f16882a);
        }
    }

    public static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogEventDroppedEncoder f16794a = new LogEventDroppedEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16796c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("eventsDroppedCount");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f20798a = 1;
            builder.b(atProtobuf.a());
            f16795b = builder.a();
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("reason");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f20798a = 3;
            builder2.b(atProtobuf2.a());
            f16796c = builder2.a();
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            LogEventDropped logEventDropped = (LogEventDropped) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f16795b, logEventDropped.f16883a);
            objectEncoderContext.f(f16796c, logEventDropped.f16884b);
        }
    }

    public static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogSourceMetricsEncoder f16797a = new LogSourceMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16799c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("logSource");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f20798a = 1;
            builder.b(atProtobuf.a());
            f16798b = builder.a();
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("logEventDropped");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f20798a = 2;
            builder2.b(atProtobuf2.a());
            f16799c = builder2.a();
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            LogSourceMetrics logSourceMetrics = (LogSourceMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f16798b, logSourceMetrics.f16887a);
            objectEncoderContext.f(f16799c, logSourceMetrics.f16888b);
        }
    }

    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProtoEncoderDoNotUseEncoder f16800a = new ProtoEncoderDoNotUseEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16801b = FieldDescriptor.a("clientMetrics");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).f(f16801b, ((ProtoEncoderDoNotUse) obj).a());
        }
    }

    public static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StorageMetricsEncoder f16802a = new StorageMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16804c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("currentCacheSizeBytes");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f20798a = 1;
            builder.b(atProtobuf.a());
            f16803b = builder.a();
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("maxCacheSizeBytes");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f20798a = 2;
            builder2.b(atProtobuf2.a());
            f16804c = builder2.a();
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            StorageMetrics storageMetrics = (StorageMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f16803b, storageMetrics.f16891a);
            objectEncoderContext.b(f16804c, storageMetrics.f16892b);
        }
    }

    public static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimeWindowEncoder f16805a = new TimeWindowEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16807c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("startMs");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f20798a = 1;
            builder.b(atProtobuf.a());
            f16806b = builder.a();
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("endMs");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f20798a = 2;
            builder2.b(atProtobuf2.a());
            f16807c = builder2.a();
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            TimeWindow timeWindow = (TimeWindow) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f16806b, timeWindow.f16894a);
            objectEncoderContext.b(f16807c, timeWindow.f16895b);
        }
    }
}
