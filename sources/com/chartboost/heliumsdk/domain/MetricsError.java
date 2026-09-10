package com.chartboost.heliumsdk.domain;

import com.chartboost.heliumsdk.utils.HeliumJsonKt;
import com.google.android.gms.common.util.VisibleForTesting;
import com.smartdigimkt.x.g;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u0010\u0011B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eHÇ\u0001\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/chartboost/heliumsdk/domain/MetricsError;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "JsonParseError", "SimpleError", "Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "Lcom/chartboost/heliumsdk/domain/MetricsError$SimpleError;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public abstract class MetricsError {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<KSerializer<Object>>() { // from class: com.chartboost.heliumsdk.domain.MetricsError$Companion$$cachedSerializer$delegate$1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            return new SealedClassSerializer("com.chartboost.heliumsdk.domain.MetricsError", reflectionFactory.b(MetricsError.class), new KClass[]{reflectionFactory.b(MetricsError.JsonParseError.class), reflectionFactory.b(MetricsError.SimpleError.class)}, new KSerializer[]{MetricsError$JsonParseError$$serializer.INSTANCE, MetricsError$SimpleError$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/domain/MetricsError$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/MetricsError;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return MetricsError.$cachedSerializer$delegate;
        }

        public final KSerializer<MetricsError> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getX();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nB1\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012B\u0017\b\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0013J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u001c\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "Lcom/chartboost/heliumsdk/domain/MetricsError;", "chartboostMediationError", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", g.f39715A, "Ljava/lang/Exception;", "Lkotlin/Exception;", "exceptionMessage", "", "malformedJson", "(Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "", "cmCode", "details", "Lkotlinx/serialization/json/JsonObject;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "getCmCode$annotations", "()V", "getCmCode", "()Ljava/lang/String;", "getDetails$annotations", "getDetails", "()Lkotlinx/serialization/json/JsonObject;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    public static final class JsonParseError extends MetricsError {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int MAX_JSON_SIZE = 3670016;
        private final String cmCode;
        private final JsonObject details;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\t"}, d2 = {"Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError$Companion;", "", "()V", "MAX_JSON_SIZE", "", "getMAX_JSON_SIZE$annotations", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @VisibleForTesting
            public static /* synthetic */ void getMAX_JSON_SIZE$annotations() {
            }

            public final KSerializer<JsonParseError> serializer() {
                return MetricsError$JsonParseError$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ JsonParseError(int i2, @SerialName("cm_code") String str, @SerialName("details") JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
            super(i2, serializationConstructorMarker);
            if (3 != (i2 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i2, 3, MetricsError$JsonParseError$$serializer.INSTANCE.getDescriptor());
            }
            this.cmCode = str;
            this.details = jsonObject;
        }

        @SerialName("cm_code")
        public static /* synthetic */ void getCmCode$annotations() {
        }

        @SerialName("details")
        public static /* synthetic */ void getDetails$annotations() {
        }

        @JvmStatic
        public static final void write$Self(JsonParseError self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            MetricsError.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.cmCode);
            output.encodeSerializableElement(serialDesc, 1, JsonObjectSerializer.INSTANCE, self.details);
        }

        public final String getCmCode() {
            return this.cmCode;
        }

        public final JsonObject getDetails() {
            return this.details;
        }

        private JsonParseError(String str, JsonObject jsonObject) {
            super(null);
            this.cmCode = str;
            this.details = jsonObject;
        }

        public JsonParseError(ChartboostMediationError chartboostMediationError, Exception exception, String exceptionMessage, String malformedJson) {
            Intrinsics.f(chartboostMediationError, "chartboostMediationError");
            Intrinsics.f(exception, "exception");
            Intrinsics.f(exceptionMessage, "exceptionMessage");
            Intrinsics.f(malformedJson, "malformedJson");
            String code = chartboostMediationError.getCode();
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "type", Reflection.f43333a.b(exception.getClass()).toString());
            JsonElementBuildersKt.put(jsonObjectBuilder, "description", exceptionMessage);
            JsonElementBuildersKt.put(jsonObjectBuilder, "data_as_string", HeliumJsonKt.getMaxJsonPayload(malformedJson, MAX_JSON_SIZE));
            this(code, jsonObjectBuilder.build());
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B1\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB\u0017\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÇ\u0001R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/chartboost/heliumsdk/domain/MetricsError$SimpleError;", "Lcom/chartboost/heliumsdk/domain/MetricsError;", "chartboostMediationError", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "(Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "seen1", "", "cmCode", "", "details", "Lkotlinx/serialization/json/JsonObject;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "getCmCode$annotations", "()V", "getCmCode", "()Ljava/lang/String;", "getDetails$annotations", "getDetails", "()Lkotlinx/serialization/json/JsonObject;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    public static final class SimpleError extends MetricsError {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String cmCode;
        private final JsonObject details;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/domain/MetricsError$SimpleError$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/MetricsError$SimpleError;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SimpleError> serializer() {
                return MetricsError$SimpleError$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ SimpleError(int i2, @SerialName("cm_code") String str, @SerialName("details") JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
            super(i2, serializationConstructorMarker);
            if (3 != (i2 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i2, 3, MetricsError$SimpleError$$serializer.INSTANCE.getDescriptor());
            }
            this.cmCode = str;
            this.details = jsonObject;
        }

        @SerialName("cm_code")
        public static /* synthetic */ void getCmCode$annotations() {
        }

        @SerialName("details")
        public static /* synthetic */ void getDetails$annotations() {
        }

        @JvmStatic
        public static final void write$Self(SimpleError self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            MetricsError.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.cmCode);
            output.encodeSerializableElement(serialDesc, 1, JsonObjectSerializer.INSTANCE, self.details);
        }

        public final String getCmCode() {
            return this.cmCode;
        }

        public final JsonObject getDetails() {
            return this.details;
        }

        private SimpleError(String str, JsonObject jsonObject) {
            super(null);
            this.cmCode = str;
            this.details = jsonObject;
        }

        public SimpleError(ChartboostMediationError chartboostMediationError) {
            Intrinsics.f(chartboostMediationError, "chartboostMediationError");
            String code = chartboostMediationError.getCode();
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "type", chartboostMediationError.name());
            JsonElementBuildersKt.put(jsonObjectBuilder, "description", chartboostMediationError.getMessage());
            this(code, jsonObjectBuilder.build());
        }
    }

    public /* synthetic */ MetricsError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final void write$Self(MetricsError self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
    }

    private MetricsError() {
    }

    @Deprecated
    public /* synthetic */ MetricsError(int i2, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
