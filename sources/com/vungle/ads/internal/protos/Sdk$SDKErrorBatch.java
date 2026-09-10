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
public final class Sdk$SDKErrorBatch extends GeneratedMessageLite<Sdk$SDKErrorBatch, attabal> implements dern {
    private static final Sdk$SDKErrorBatch DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 1;
    private static volatile Parser<Sdk$SDKErrorBatch> PARSER;
    private Internal.ProtobufList<Sdk$SDKError> errors_ = GeneratedMessageLite.emptyProtobufList();

    public static final class attabal extends GeneratedMessageLite.Builder<Sdk$SDKErrorBatch, attabal> implements dern {
        public /* synthetic */ attabal(com.vungle.ads.internal.protos.attabal attabalVar) {
            this();
        }

        public attabal addAllErrors(Iterable<? extends Sdk$SDKError> iterable) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addAllErrors(iterable);
            return this;
        }

        public attabal addErrors(Sdk$SDKError sdk$SDKError) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(sdk$SDKError);
            return this;
        }

        public attabal clearErrors() {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).clearErrors();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.dern
        public Sdk$SDKError getErrors(int i) {
            return ((Sdk$SDKErrorBatch) this.instance).getErrors(i);
        }

        @Override // com.vungle.ads.internal.protos.dern
        public int getErrorsCount() {
            return ((Sdk$SDKErrorBatch) this.instance).getErrorsCount();
        }

        @Override // com.vungle.ads.internal.protos.dern
        public List<Sdk$SDKError> getErrorsList() {
            return Collections.unmodifiableList(((Sdk$SDKErrorBatch) this.instance).getErrorsList());
        }

        public attabal removeErrors(int i) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).removeErrors(i);
            return this;
        }

        public attabal setErrors(int i, Sdk$SDKError sdk$SDKError) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).setErrors(i, sdk$SDKError);
            return this;
        }

        private attabal() {
            super(Sdk$SDKErrorBatch.DEFAULT_INSTANCE);
        }

        public attabal addErrors(int i, Sdk$SDKError sdk$SDKError) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(i, sdk$SDKError);
            return this;
        }

        public attabal setErrors(int i, Sdk$SDKError.attabal attabalVar) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).setErrors(i, attabalVar.build());
            return this;
        }

        public attabal addErrors(Sdk$SDKError.attabal attabalVar) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(attabalVar.build());
            return this;
        }

        public attabal addErrors(int i, Sdk$SDKError.attabal attabalVar) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(i, attabalVar.build());
            return this;
        }
    }

    static {
        Sdk$SDKErrorBatch sdk$SDKErrorBatch = new Sdk$SDKErrorBatch();
        DEFAULT_INSTANCE = sdk$SDKErrorBatch;
        GeneratedMessageLite.registerDefaultInstance(Sdk$SDKErrorBatch.class, sdk$SDKErrorBatch);
    }

    private Sdk$SDKErrorBatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllErrors(Iterable<? extends Sdk$SDKError> iterable) {
        ensureErrorsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.errors_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addErrors(Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.add(sdk$SDKError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrors() {
        this.errors_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureErrorsIsMutable() {
        Internal.ProtobufList<Sdk$SDKError> protobufList = this.errors_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.errors_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Sdk$SDKErrorBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static attabal newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKErrorBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Sdk$SDKErrorBatch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeErrors(int i) {
        ensureErrorsIsMutable();
        this.errors_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrors(int i, Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.set(i, sdk$SDKError);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        com.vungle.ads.internal.protos.attabal attabalVar = null;
        switch (com.vungle.ads.internal.protos.attabal.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Sdk$SDKErrorBatch();
            case 2:
                return new attabal(attabalVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"errors_", Sdk$SDKError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sdk$SDKErrorBatch> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Sdk$SDKErrorBatch.class) {
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

    @Override // com.vungle.ads.internal.protos.dern
    public Sdk$SDKError getErrors(int i) {
        return this.errors_.get(i);
    }

    @Override // com.vungle.ads.internal.protos.dern
    public int getErrorsCount() {
        return this.errors_.size();
    }

    @Override // com.vungle.ads.internal.protos.dern
    public List<Sdk$SDKError> getErrorsList() {
        return this.errors_;
    }

    public wireman getErrorsOrBuilder(int i) {
        return this.errors_.get(i);
    }

    public List<? extends wireman> getErrorsOrBuilderList() {
        return this.errors_;
    }

    public static attabal newBuilder(Sdk$SDKErrorBatch sdk$SDKErrorBatch) {
        return DEFAULT_INSTANCE.createBuilder(sdk$SDKErrorBatch);
    }

    public static Sdk$SDKErrorBatch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addErrors(int i, Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.add(i, sdk$SDKError);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sdk$SDKErrorBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKErrorBatch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Sdk$SDKErrorBatch parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$SDKErrorBatch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKErrorBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
