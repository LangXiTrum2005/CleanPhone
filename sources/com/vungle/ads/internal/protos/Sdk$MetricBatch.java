package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Sdk$MetricBatch extends GeneratedMessageLite<Sdk$MetricBatch, attabal> implements saneness {
    private static final Sdk$MetricBatch DEFAULT_INSTANCE;
    public static final int METRICS_FIELD_NUMBER = 1;
    private static volatile Parser<Sdk$MetricBatch> PARSER;
    private Internal.ProtobufList<Sdk$SDKMetric> metrics_ = GeneratedMessageLite.emptyProtobufList();

    public static final class attabal extends GeneratedMessageLite.Builder<Sdk$MetricBatch, attabal> implements saneness {
        public /* synthetic */ attabal(com.vungle.ads.internal.protos.attabal attabalVar) {
            this();
        }

        public attabal addAllMetrics(Iterable<? extends Sdk$SDKMetric> iterable) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addAllMetrics(iterable);
            return this;
        }

        public attabal addMetrics(Sdk$SDKMetric sdk$SDKMetric) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(sdk$SDKMetric);
            return this;
        }

        public attabal clearMetrics() {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).clearMetrics();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.saneness
        public Sdk$SDKMetric getMetrics(int i) {
            return ((Sdk$MetricBatch) this.instance).getMetrics(i);
        }

        @Override // com.vungle.ads.internal.protos.saneness
        public int getMetricsCount() {
            return ((Sdk$MetricBatch) this.instance).getMetricsCount();
        }

        @Override // com.vungle.ads.internal.protos.saneness
        public List<Sdk$SDKMetric> getMetricsList() {
            return Collections.unmodifiableList(((Sdk$MetricBatch) this.instance).getMetricsList());
        }

        public attabal removeMetrics(int i) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).removeMetrics(i);
            return this;
        }

        public attabal setMetrics(int i, Sdk$SDKMetric sdk$SDKMetric) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).setMetrics(i, sdk$SDKMetric);
            return this;
        }

        private attabal() {
            super(Sdk$MetricBatch.DEFAULT_INSTANCE);
        }

        public attabal addMetrics(int i, Sdk$SDKMetric sdk$SDKMetric) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(i, sdk$SDKMetric);
            return this;
        }

        public attabal setMetrics(int i, Sdk$SDKMetric.attabal attabalVar) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).setMetrics(i, attabalVar.build());
            return this;
        }

        public attabal addMetrics(Sdk$SDKMetric.attabal attabalVar) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(attabalVar.build());
            return this;
        }

        public attabal addMetrics(int i, Sdk$SDKMetric.attabal attabalVar) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(i, attabalVar.build());
            return this;
        }
    }

    static {
        Sdk$MetricBatch sdk$MetricBatch = new Sdk$MetricBatch();
        DEFAULT_INSTANCE = sdk$MetricBatch;
        GeneratedMessageLite.registerDefaultInstance(Sdk$MetricBatch.class, sdk$MetricBatch);
    }

    private Sdk$MetricBatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends Sdk$SDKMetric> iterable) {
        ensureMetricsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.metrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(sdk$SDKMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureMetricsIsMutable() {
        Internal.ProtobufList<Sdk$SDKMetric> protobufList = this.metrics_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.metrics_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Sdk$MetricBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static attabal newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$MetricBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$MetricBatch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Sdk$MetricBatch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetrics(int i) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(int i, Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i, sdk$SDKMetric);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        com.vungle.ads.internal.protos.attabal attabalVar = null;
        switch (com.vungle.ads.internal.protos.attabal.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Sdk$MetricBatch();
            case 2:
                return new attabal(attabalVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"metrics_", Sdk$SDKMetric.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sdk$MetricBatch> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Sdk$MetricBatch.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.vungle.ads.internal.protos.saneness
    public Sdk$SDKMetric getMetrics(int i) {
        return this.metrics_.get(i);
    }

    @Override // com.vungle.ads.internal.protos.saneness
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // com.vungle.ads.internal.protos.saneness
    public List<Sdk$SDKMetric> getMetricsList() {
        return this.metrics_;
    }

    public marial getMetricsOrBuilder(int i) {
        return this.metrics_.get(i);
    }

    public List<? extends marial> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public static attabal newBuilder(Sdk$MetricBatch sdk$MetricBatch) {
        return DEFAULT_INSTANCE.createBuilder(sdk$MetricBatch);
    }

    public static Sdk$MetricBatch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$MetricBatch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sdk$MetricBatch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(int i, Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i, sdk$SDKMetric);
    }

    public static Sdk$MetricBatch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sdk$MetricBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$MetricBatch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Sdk$MetricBatch parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$MetricBatch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$MetricBatch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sdk$MetricBatch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$MetricBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
