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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/EnumKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class EnumKt {
    public static final EnumKt INSTANCE = new EnumKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 S2\u00020\u0001:\u0003STUB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0087\n¢\u0006\u0004\b\u001a\u0010\u0018J0\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\rH\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b \u0010!J'\u0010\u0012\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u000f\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J(\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u000f\u001a\u00020#H\u0087\n¢\u0006\u0004\b'\u0010&J-\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020#0\u0015H\u0007¢\u0006\u0004\b(\u0010\u0018J.\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020#0\u0015H\u0087\n¢\u0006\u0004\b)\u0010\u0018J0\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\fH\u0007¢\u0006\u0004\b,\u0010!J\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\u000bJ\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u000bJ\r\u00102\u001a\u00020\t¢\u0006\u0004\b2\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R$\u00109\u001a\u0002042\u0006\u0010\u000f\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001d\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001d\u0010>\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f8F¢\u0006\u0006\u001a\u0004\b=\u0010;R$\u0010D\u001a\u00020?2\u0006\u0010\u000f\u001a\u00020?8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010J\u001a\u00020E2\u0006\u0010\u000f\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010O\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010R\u001a\u0002042\u0006\u0010\u000f\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u00106\"\u0004\bQ\u00108¨\u0006V"}, d2 = {"Lcom/google/protobuf/EnumKt$Dsl;", "", "Lcom/google/protobuf/Enum$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/Enum$Builder;)V", "Lcom/google/protobuf/Enum;", "_build", "()Lcom/google/protobuf/Enum;", "Lwj/r;", "clearName", "()V", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/EnumValue;", "Lcom/google/protobuf/EnumKt$Dsl$EnumvalueProxy;", X3.i.X, "addEnumvalue", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/EnumValue;)V", "add", "plusAssignEnumvalue", "plusAssign", "", "values", "addAllEnumvalue", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllEnumvalue", "", "index", "setEnumvalue", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/EnumValue;)V", "set", "clearEnumvalue", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/EnumKt$Dsl$OptionsProxy;", "addOptions", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Option;)V", "plusAssignOptions", "addAllOptions", "plusAssignAllOptions", "setOptions", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Option;)V", "clearOptions", "clearSourceContext", "", "hasSourceContext", "()Z", "clearSyntax", "clearEdition", "Lcom/google/protobuf/Enum$Builder;", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getEnumvalue", "()Lcom/google/protobuf/kotlin/DslList;", "enumvalue", "getOptions", "options", "Lcom/google/protobuf/SourceContext;", "getSourceContext", "()Lcom/google/protobuf/SourceContext;", "setSourceContext", "(Lcom/google/protobuf/SourceContext;)V", "sourceContext", "Lcom/google/protobuf/Syntax;", "getSyntax", "()Lcom/google/protobuf/Syntax;", "setSyntax", "(Lcom/google/protobuf/Syntax;)V", "syntax", "getSyntaxValue", "()I", "setSyntaxValue", "(I)V", "syntaxValue", "getEdition", "setEdition", "edition", "Companion", "EnumvalueProxy", "OptionsProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Enum.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/EnumKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/EnumKt$Dsl;", "builder", "Lcom/google/protobuf/Enum$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Enum.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/EnumKt$Dsl$EnumvalueProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class EnumvalueProxy extends DslProxy {
            private EnumvalueProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/EnumKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Enum.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ Enum _build() {
            Enum enumBuild = this._builder.build();
            kotlin.jvm.internal.n.e(enumBuild, "_builder.build()");
            return enumBuild;
        }

        public final /* synthetic */ void addAllEnumvalue(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllEnumvalue(values);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addEnumvalue(DslList dslList, EnumValue value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addEnumvalue(value);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addOptions(value);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearEnumvalue(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearEnumvalue();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final String getEdition() {
            String edition = this._builder.getEdition();
            kotlin.jvm.internal.n.e(edition, "_builder.getEdition()");
            return edition;
        }

        public final /* synthetic */ DslList getEnumvalue() {
            List<EnumValue> enumvalueList = this._builder.getEnumvalueList();
            kotlin.jvm.internal.n.e(enumvalueList, "_builder.getEnumvalueList()");
            return new DslList(enumvalueList);
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.n.e(name, "_builder.getName()");
            return name;
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.n.e(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            kotlin.jvm.internal.n.e(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            kotlin.jvm.internal.n.e(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, Iterable<EnumValue> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllEnumvalue(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, EnumValue value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addEnumvalue(dslList, value);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addOptions(dslList, value);
        }

        public final void setEdition(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setEdition(value);
        }

        public final /* synthetic */ void setEnumvalue(DslList dslList, int i10, EnumValue value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setEnumvalue(i10, value);
        }

        public final void setName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setName(value);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setOptions(i10, value);
        }

        public final void setSourceContext(SourceContext value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setSourceContext(value);
        }

        public final void setSyntax(Syntax value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setSyntax(value);
        }

        public final void setSyntaxValue(int i10) {
            this._builder.setSyntaxValue(i10);
        }

        private Dsl(Enum.Builder builder) {
            this._builder = builder;
        }
    }

    private EnumKt() {
    }
}
