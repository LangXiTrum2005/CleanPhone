package p002kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import p002kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront;
import p002kotlin.reflect.jvm.internal.impl.protobuf.kowloon;
import p002kotlin.reflect.jvm.internal.impl.protobuf.marial;
import p002kotlin.reflect.jvm.internal.impl.protobuf.wireman;

/* JADX INFO: loaded from: classes5.dex */
public final class ProtoBuf$ValueParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$ValueParameter> implements kowloon {
    public static arytenoidectomy<ProtoBuf$ValueParameter> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$ValueParameter f30999kowloon;
    private int bitField0_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int typeId_;
    private ProtoBuf$Type type_;
    private final wireman unknownFields;
    private int varargElementTypeId_;
    private ProtoBuf$Type varargElementType_;

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$ValueParameter> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$ValueParameter dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$ValueParameter(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(true);
        f30999kowloon = protoBuf$ValueParameter;
        protoBuf$ValueParameter.dern();
    }

    private void dern() {
        this.flags_ = 0;
        this.name_ = 0;
        this.type_ = ProtoBuf$Type.getDefaultInstance();
        this.typeId_ = 0;
        this.varargElementType_ = ProtoBuf$Type.getDefaultInstance();
        this.varargElementTypeId_ = 0;
    }

    public static ProtoBuf$ValueParameter getDefaultInstance() {
        return f30999kowloon;
    }

    public static saneness newBuilder() {
        return saneness.polloi();
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$ValueParameter> getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iKowloon += CodedOutputStream.kowloon(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iKowloon += CodedOutputStream.molybdenite(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iKowloon += CodedOutputStream.molybdenite(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iKowloon += CodedOutputStream.kowloon(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iKowloon += CodedOutputStream.kowloon(6, this.varargElementTypeId_);
        }
        int iExtensionsSerializedSize = iKowloon + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ProtoBuf$Type getType() {
        return this.type_;
    }

    public int getTypeId() {
        return this.typeId_;
    }

    public ProtoBuf$Type getVarargElementType() {
        return this.varargElementType_;
    }

    public int getVarargElementTypeId() {
        return this.varargElementTypeId_;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasType() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasTypeId() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasVarargElementType() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasVarargElementTypeId() {
        return (this.bitField0_ & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.kowloon
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!hasName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasType() && !getType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage<MessageType>.attabal attabalVarNewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.cultivated(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.cultivated(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.milliradian(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.milliradian(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.cultivated(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.cultivated(6, this.varargElementTypeId_);
        }
        attabalVarNewExtensionWriter.attabal(200, codedOutputStream);
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        return newBuilder().beachfront(protoBuf$ValueParameter);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$ValueParameter getDefaultInstanceForType() {
        return f30999kowloon;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$ValueParameter(GeneratedMessageLite.dern<ProtoBuf$ValueParameter, ?> dernVar) {
        super(dernVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = dernVar.marial();
    }

    public ProtoBuf$ValueParameter(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$ValueParameter(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        ProtoBuf$Type.saneness builder;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        dern();
        wireman.saneness sanenessVarArytenoidectomy = wireman.arytenoidectomy();
        CodedOutputStream codedOutputStreamMerc = CodedOutputStream.merc(sanenessVarArytenoidectomy, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iPolder = marialVar.polder();
                    if (iPolder != 0) {
                        if (iPolder == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = marialVar.molybdenite();
                        } else if (iPolder != 16) {
                            if (iPolder == 26) {
                                builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar);
                                this.type_ = protoBuf$Type;
                                if (builder != null) {
                                    builder.beachfront(protoBuf$Type);
                                    this.type_ = builder.kowloon();
                                }
                                this.bitField0_ |= 4;
                            } else if (iPolder == 34) {
                                builder = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar);
                                this.varargElementType_ = protoBuf$Type2;
                                if (builder != null) {
                                    builder.beachfront(protoBuf$Type2);
                                    this.varargElementType_ = builder.kowloon();
                                }
                                this.bitField0_ |= 16;
                            } else if (iPolder == 40) {
                                this.bitField0_ |= 8;
                                this.typeId_ = marialVar.molybdenite();
                            } else if (iPolder != 48) {
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                }
                            } else {
                                this.bitField0_ |= 32;
                                this.varargElementTypeId_ = marialVar.molybdenite();
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.name_ = marialVar.molybdenite();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                try {
                    codedOutputStreamMerc.restrictive();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = sanenessVarArytenoidectomy.cutely();
                }
                makeExtensionsImmutable();
                throw th;
            }
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.dern<ProtoBuf$ValueParameter, saneness> implements kowloon {

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public int f31001dovishness;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f31003graveside;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f31004molybdenite;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f31005polloi;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public int f31006rotuma;

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public ProtoBuf$Type f31000adultoid = ProtoBuf$Type.getDefaultInstance();

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public ProtoBuf$Type f31002gintrap = ProtoBuf$Type.getDefaultInstance();

        public saneness() {
            molybdenite();
        }

        public static saneness polloi() {
            return new saneness();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$ValueParameter protoBuf$ValueParameter = null;
            try {
                try {
                    ProtoBuf$ValueParameter protoBuf$ValueParameterDern = ProtoBuf$ValueParameter.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$ValueParameterDern != null) {
                        beachfront(protoBuf$ValueParameterDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$ValueParameter != null) {
                        beachfront(protoBuf$ValueParameter);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$ValueParameter protoBuf$ValueParameter2 = (ProtoBuf$ValueParameter) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$ValueParameter = protoBuf$ValueParameter2;
                    if (protoBuf$ValueParameter != null) {
                        beachfront(protoBuf$ValueParameter);
                    }
                    throw th;
                }
            }
        }

        public saneness cord(int i) {
            this.f31005polloi |= 8;
            this.f31001dovishness = i;
            return this;
        }

        public saneness cuirassed(int i) {
            this.f31005polloi |= 32;
            this.f31006rotuma = i;
            return this;
        }

        public saneness dovishness(ProtoBuf$Type protoBuf$Type) {
            if ((this.f31005polloi & 4) != 4 || this.f31000adultoid == ProtoBuf$Type.getDefaultInstance()) {
                this.f31000adultoid = protoBuf$Type;
            } else {
                this.f31000adultoid = ProtoBuf$Type.newBuilder(this.f31000adultoid).beachfront(protoBuf$Type).kowloon();
            }
            this.f31005polloi |= 4;
            return this;
        }

        public saneness gintrap(ProtoBuf$Type protoBuf$Type) {
            if ((this.f31005polloi & 16) != 16 || this.f31002gintrap == ProtoBuf$Type.getDefaultInstance()) {
                this.f31002gintrap = protoBuf$Type;
            } else {
                this.f31002gintrap = ProtoBuf$Type.newBuilder(this.f31002gintrap).beachfront(protoBuf$Type).kowloon();
            }
            this.f31005polloi |= 16;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
            if (protoBuf$ValueParameter == ProtoBuf$ValueParameter.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$ValueParameter.hasFlags()) {
                rotuma(protoBuf$ValueParameter.getFlags());
            }
            if (protoBuf$ValueParameter.hasName()) {
                preprohormone(protoBuf$ValueParameter.getName());
            }
            if (protoBuf$ValueParameter.hasType()) {
                dovishness(protoBuf$ValueParameter.getType());
            }
            if (protoBuf$ValueParameter.hasTypeId()) {
                cord(protoBuf$ValueParameter.getTypeId());
            }
            if (protoBuf$ValueParameter.hasVarargElementType()) {
                gintrap(protoBuf$ValueParameter.getVarargElementType());
            }
            if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
                cuirassed(protoBuf$ValueParameter.getVarargElementTypeId());
            }
            formularize(protoBuf$ValueParameter);
            competently(marial().dern(protoBuf$ValueParameter.unknownFields));
            return this;
        }

        public ProtoBuf$ValueParameter kowloon() {
            ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(this);
            int i = this.f31005polloi;
            int i2 = (i & 1) != 1 ? 0 : 1;
            protoBuf$ValueParameter.flags_ = this.f31004molybdenite;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$ValueParameter.name_ = this.f31003graveside;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$ValueParameter.type_ = this.f31000adultoid;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$ValueParameter.typeId_ = this.f31001dovishness;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$ValueParameter.varargElementType_ = this.f31002gintrap;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            protoBuf$ValueParameter.varargElementTypeId_ = this.f31006rotuma;
            protoBuf$ValueParameter.bitField0_ = i2;
            return protoBuf$ValueParameter;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return polloi().beachfront(kowloon());
        }

        public saneness preprohormone(int i) {
            this.f31005polloi |= 2;
            this.f31003graveside = i;
            return this;
        }

        public saneness rotuma(int i) {
            this.f31005polloi |= 1;
            this.f31004molybdenite = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$ValueParameter build() {
            ProtoBuf$ValueParameter protoBuf$ValueParameterKowloon = kowloon();
            if (protoBuf$ValueParameterKowloon.isInitialized()) {
                return protoBuf$ValueParameterKowloon;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$ValueParameterKowloon);
        }

        private void molybdenite() {
        }
    }
}
