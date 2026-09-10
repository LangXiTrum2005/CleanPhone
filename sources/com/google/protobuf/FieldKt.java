package com.google.protobuf;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/FieldKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FieldKt {
    public static final FieldKt INSTANCE = new FieldKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0002^_B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ'\u0010\u0018\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001a\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0015\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0019\u0010\u0017J-\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\u001a\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0087\n¢\u0006\u0004\b \u0010\u001eJ0\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u0013H\u0087\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0007¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u000bJ\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R$\u00101\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00106\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010<\u001a\u0002072\u0006\u0010\u0015\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010?\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00103\"\u0004\b>\u00105R$\u0010B\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u00103\"\u0004\bA\u00105R$\u0010H\u001a\u00020C2\u0006\u0010\u0015\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010K\u001a\u00020C2\u0006\u0010\u0015\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR$\u0010N\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u00103\"\u0004\bM\u00105R$\u0010T\u001a\u00020O2\u0006\u0010\u0015\u001a\u00020O8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001d\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128F¢\u0006\u0006\u001a\u0004\bU\u0010VR$\u0010Z\u001a\u00020C2\u0006\u0010\u0015\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010E\"\u0004\bY\u0010GR$\u0010]\u001a\u00020C2\u0006\u0010\u0015\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010E\"\u0004\b\\\u0010G¨\u0006`"}, d2 = {"Lcom/google/protobuf/FieldKt$Dsl;", "", "Lcom/google/protobuf/Field$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/Field$Builder;)V", "Lcom/google/protobuf/Field;", "_build", "()Lcom/google/protobuf/Field;", "Lwj/r;", "clearKind", "()V", "clearCardinality", "clearNumber", "clearName", "clearTypeUrl", "clearOneofIndex", "clearPacked", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/FieldKt$Dsl$OptionsProxy;", X3.i.X, "addOptions", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Option;)V", "add", "plusAssignOptions", "plusAssign", "", "values", "addAllOptions", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllOptions", "", "index", "setOptions", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Option;)V", "set", "clearOptions", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearJsonName", "clearDefaultValue", "Lcom/google/protobuf/Field$Builder;", "Lcom/google/protobuf/Field$Kind;", "getKind", "()Lcom/google/protobuf/Field$Kind;", "setKind", "(Lcom/google/protobuf/Field$Kind;)V", "kind", "getKindValue", "()I", "setKindValue", "(I)V", "kindValue", "Lcom/google/protobuf/Field$Cardinality;", "getCardinality", "()Lcom/google/protobuf/Field$Cardinality;", "setCardinality", "(Lcom/google/protobuf/Field$Cardinality;)V", "cardinality", "getCardinalityValue", "setCardinalityValue", "cardinalityValue", "getNumber", "setNumber", "number", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getTypeUrl", "setTypeUrl", "typeUrl", "getOneofIndex", "setOneofIndex", "oneofIndex", "", "getPacked", "()Z", "setPacked", "(Z)V", "packed", "getOptions", "()Lcom/google/protobuf/kotlin/DslList;", "options", "getJsonName", "setJsonName", "jsonName", "getDefaultValue", "setDefaultValue", "defaultValue", "Companion", "OptionsProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Field.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FieldKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FieldKt$Dsl;", "builder", "Lcom/google/protobuf/Field$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Field.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FieldKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Field.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ Field _build() {
            Field fieldBuild = this._builder.build();
            kotlin.jvm.internal.n.e(fieldBuild, "_builder.build()");
            return fieldBuild;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addOptions(value);
        }

        public final void clearCardinality() {
            this._builder.clearCardinality();
        }

        public final void clearDefaultValue() {
            this._builder.clearDefaultValue();
        }

        public final void clearJsonName() {
            this._builder.clearJsonName();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final void clearOneofIndex() {
            this._builder.clearOneofIndex();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearPacked() {
            this._builder.clearPacked();
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final Field.Cardinality getCardinality() {
            Field.Cardinality cardinality = this._builder.getCardinality();
            kotlin.jvm.internal.n.e(cardinality, "_builder.getCardinality()");
            return cardinality;
        }

        public final int getCardinalityValue() {
            return this._builder.getCardinalityValue();
        }

        public final String getDefaultValue() {
            String defaultValue = this._builder.getDefaultValue();
            kotlin.jvm.internal.n.e(defaultValue, "_builder.getDefaultValue()");
            return defaultValue;
        }

        public final String getJsonName() {
            String jsonName = this._builder.getJsonName();
            kotlin.jvm.internal.n.e(jsonName, "_builder.getJsonName()");
            return jsonName;
        }

        public final Field.Kind getKind() {
            Field.Kind kind = this._builder.getKind();
            kotlin.jvm.internal.n.e(kind, "_builder.getKind()");
            return kind;
        }

        public final int getKindValue() {
            return this._builder.getKindValue();
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.n.e(name, "_builder.getName()");
            return name;
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final int getOneofIndex() {
            return this._builder.getOneofIndex();
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.n.e(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final boolean getPacked() {
            return this._builder.getPacked();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            kotlin.jvm.internal.n.e(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addOptions(dslList, value);
        }

        public final void setCardinality(Field.Cardinality value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCardinality(value);
        }

        public final void setCardinalityValue(int i10) {
            this._builder.setCardinalityValue(i10);
        }

        public final void setDefaultValue(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDefaultValue(value);
        }

        public final void setJsonName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setJsonName(value);
        }

        public final void setKind(Field.Kind value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setKind(value);
        }

        public final void setKindValue(int i10) {
            this._builder.setKindValue(i10);
        }

        public final void setName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setName(value);
        }

        public final void setNumber(int i10) {
            this._builder.setNumber(i10);
        }

        public final void setOneofIndex(int i10) {
            this._builder.setOneofIndex(i10);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setOptions(i10, value);
        }

        public final void setPacked(boolean z10) {
            this._builder.setPacked(z10);
        }

        public final void setTypeUrl(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTypeUrl(value);
        }

        private Dsl(Field.Builder builder) {
            this._builder = builder;
        }
    }

    private FieldKt() {
    }
}
