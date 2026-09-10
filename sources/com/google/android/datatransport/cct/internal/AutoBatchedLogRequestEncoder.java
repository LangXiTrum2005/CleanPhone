package com.google.android.datatransport.cct.internal;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoBatchedLogRequestEncoder f16690a = new AutoBatchedLogRequestEncoder();

    public static final class AndroidClientInfoEncoder implements ObjectEncoder<AndroidClientInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AndroidClientInfoEncoder f16691a = new AndroidClientInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16692b = FieldDescriptor.a("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16693c = FieldDescriptor.a("model");
        public static final FieldDescriptor d = FieldDescriptor.a("hardware");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f16694e = FieldDescriptor.a(d9.h.G);
        public static final FieldDescriptor f = FieldDescriptor.a(AppLovinEventTypes.USER_VIEWED_PRODUCT);
        public static final FieldDescriptor g = FieldDescriptor.a("osBuild");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f16695h = FieldDescriptor.a("manufacturer");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f16696i = FieldDescriptor.a("fingerprint");
        public static final FieldDescriptor j = FieldDescriptor.a("locale");
        public static final FieldDescriptor k = FieldDescriptor.a("country");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f16697l = FieldDescriptor.a("mccMnc");
        public static final FieldDescriptor m = FieldDescriptor.a("applicationBuild");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f16692b, androidClientInfo.m());
            objectEncoderContext.f(f16693c, androidClientInfo.j());
            objectEncoderContext.f(d, androidClientInfo.f());
            objectEncoderContext.f(f16694e, androidClientInfo.d());
            objectEncoderContext.f(f, androidClientInfo.l());
            objectEncoderContext.f(g, androidClientInfo.k());
            objectEncoderContext.f(f16695h, androidClientInfo.h());
            objectEncoderContext.f(f16696i, androidClientInfo.e());
            objectEncoderContext.f(j, androidClientInfo.g());
            objectEncoderContext.f(k, androidClientInfo.c());
            objectEncoderContext.f(f16697l, androidClientInfo.i());
            objectEncoderContext.f(m, androidClientInfo.b());
        }
    }

    public static final class BatchedLogRequestEncoder implements ObjectEncoder<BatchedLogRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BatchedLogRequestEncoder f16698a = new BatchedLogRequestEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16699b = FieldDescriptor.a("logRequest");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).f(f16699b, ((BatchedLogRequest) obj).b());
        }
    }

    public static final class ClientInfoEncoder implements ObjectEncoder<ClientInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClientInfoEncoder f16700a = new ClientInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16701b = FieldDescriptor.a("clientType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16702c = FieldDescriptor.a("androidClientInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f16701b, clientInfo.c());
            objectEncoderContext.f(f16702c, clientInfo.b());
        }
    }

    public static final class ComplianceDataEncoder implements ObjectEncoder<ComplianceData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ComplianceDataEncoder f16703a = new ComplianceDataEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16704b = FieldDescriptor.a("privacyContext");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16705c = FieldDescriptor.a("productIdOrigin");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ComplianceData complianceData = (ComplianceData) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f16704b, complianceData.b());
            objectEncoderContext.f(f16705c, complianceData.c());
        }
    }

    public static final class ExperimentIdsEncoder implements ObjectEncoder<ExperimentIds> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExperimentIdsEncoder f16706a = new ExperimentIdsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16707b = FieldDescriptor.a("clearBlob");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16708c = FieldDescriptor.a("encryptedBlob");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ExperimentIds experimentIds = (ExperimentIds) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f16707b, experimentIds.b());
            objectEncoderContext.f(f16708c, experimentIds.c());
        }
    }

    public static final class ExternalPRequestContextEncoder implements ObjectEncoder<ExternalPRequestContext> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExternalPRequestContextEncoder f16709a = new ExternalPRequestContextEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16710b = FieldDescriptor.a("originAssociatedProductId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).f(f16710b, ((ExternalPRequestContext) obj).b());
        }
    }

    public static final class ExternalPrivacyContextEncoder implements ObjectEncoder<ExternalPrivacyContext> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExternalPrivacyContextEncoder f16711a = new ExternalPrivacyContextEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16712b = FieldDescriptor.a("prequest");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).f(f16712b, ((ExternalPrivacyContext) obj).b());
        }
    }

    public static final class LogEventEncoder implements ObjectEncoder<LogEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogEventEncoder f16713a = new LogEventEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16714b = FieldDescriptor.a("eventTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16715c = FieldDescriptor.a("eventCode");
        public static final FieldDescriptor d = FieldDescriptor.a("complianceData");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f16716e = FieldDescriptor.a("eventUptimeMs");
        public static final FieldDescriptor f = FieldDescriptor.a("sourceExtension");
        public static final FieldDescriptor g = FieldDescriptor.a("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f16717h = FieldDescriptor.a("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f16718i = FieldDescriptor.a("networkConnectionInfo");
        public static final FieldDescriptor j = FieldDescriptor.a("experimentIds");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            LogEvent logEvent = (LogEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f16714b, logEvent.c());
            objectEncoderContext.f(f16715c, logEvent.b());
            objectEncoderContext.f(d, logEvent.a());
            objectEncoderContext.b(f16716e, logEvent.d());
            objectEncoderContext.f(f, logEvent.g());
            objectEncoderContext.f(g, logEvent.h());
            objectEncoderContext.b(f16717h, logEvent.i());
            objectEncoderContext.f(f16718i, logEvent.f());
            objectEncoderContext.f(j, logEvent.e());
        }
    }

    public static final class LogRequestEncoder implements ObjectEncoder<LogRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogRequestEncoder f16719a = new LogRequestEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16720b = FieldDescriptor.a("requestTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16721c = FieldDescriptor.a("requestUptimeMs");
        public static final FieldDescriptor d = FieldDescriptor.a("clientInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f16722e = FieldDescriptor.a("logSource");
        public static final FieldDescriptor f = FieldDescriptor.a("logSourceName");
        public static final FieldDescriptor g = FieldDescriptor.a("logEvent");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f16723h = FieldDescriptor.a("qosTier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            LogRequest logRequest = (LogRequest) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f16720b, logRequest.g());
            objectEncoderContext.b(f16721c, logRequest.h());
            objectEncoderContext.f(d, logRequest.b());
            objectEncoderContext.f(f16722e, logRequest.d());
            objectEncoderContext.f(f, logRequest.e());
            objectEncoderContext.f(g, logRequest.c());
            objectEncoderContext.f(f16723h, logRequest.f());
        }
    }

    public static final class NetworkConnectionInfoEncoder implements ObjectEncoder<NetworkConnectionInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NetworkConnectionInfoEncoder f16724a = new NetworkConnectionInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f16725b = FieldDescriptor.a("networkType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f16726c = FieldDescriptor.a("mobileSubtype");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f16725b, networkConnectionInfo.c());
            objectEncoderContext.f(f16726c, networkConnectionInfo.b());
        }
    }

    public final void a(EncoderConfig encoderConfig) {
        BatchedLogRequestEncoder batchedLogRequestEncoder = BatchedLogRequestEncoder.f16698a;
        JsonDataEncoderBuilder jsonDataEncoderBuilder = (JsonDataEncoderBuilder) encoderConfig;
        jsonDataEncoderBuilder.b(BatchedLogRequest.class, batchedLogRequestEncoder);
        jsonDataEncoderBuilder.b(AutoValue_BatchedLogRequest.class, batchedLogRequestEncoder);
        LogRequestEncoder logRequestEncoder = LogRequestEncoder.f16719a;
        jsonDataEncoderBuilder.b(LogRequest.class, logRequestEncoder);
        jsonDataEncoderBuilder.b(AutoValue_LogRequest.class, logRequestEncoder);
        ClientInfoEncoder clientInfoEncoder = ClientInfoEncoder.f16700a;
        jsonDataEncoderBuilder.b(ClientInfo.class, clientInfoEncoder);
        jsonDataEncoderBuilder.b(AutoValue_ClientInfo.class, clientInfoEncoder);
        AndroidClientInfoEncoder androidClientInfoEncoder = AndroidClientInfoEncoder.f16691a;
        jsonDataEncoderBuilder.b(AndroidClientInfo.class, androidClientInfoEncoder);
        jsonDataEncoderBuilder.b(AutoValue_AndroidClientInfo.class, androidClientInfoEncoder);
        LogEventEncoder logEventEncoder = LogEventEncoder.f16713a;
        jsonDataEncoderBuilder.b(LogEvent.class, logEventEncoder);
        jsonDataEncoderBuilder.b(AutoValue_LogEvent.class, logEventEncoder);
        ComplianceDataEncoder complianceDataEncoder = ComplianceDataEncoder.f16703a;
        jsonDataEncoderBuilder.b(ComplianceData.class, complianceDataEncoder);
        jsonDataEncoderBuilder.b(AutoValue_ComplianceData.class, complianceDataEncoder);
        ExternalPrivacyContextEncoder externalPrivacyContextEncoder = ExternalPrivacyContextEncoder.f16711a;
        jsonDataEncoderBuilder.b(ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        jsonDataEncoderBuilder.b(AutoValue_ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        ExternalPRequestContextEncoder externalPRequestContextEncoder = ExternalPRequestContextEncoder.f16709a;
        jsonDataEncoderBuilder.b(ExternalPRequestContext.class, externalPRequestContextEncoder);
        jsonDataEncoderBuilder.b(AutoValue_ExternalPRequestContext.class, externalPRequestContextEncoder);
        NetworkConnectionInfoEncoder networkConnectionInfoEncoder = NetworkConnectionInfoEncoder.f16724a;
        jsonDataEncoderBuilder.b(NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        jsonDataEncoderBuilder.b(AutoValue_NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        ExperimentIdsEncoder experimentIdsEncoder = ExperimentIdsEncoder.f16706a;
        jsonDataEncoderBuilder.b(ExperimentIds.class, experimentIdsEncoder);
        jsonDataEncoderBuilder.b(AutoValue_ExperimentIds.class, experimentIdsEncoder);
    }
}
