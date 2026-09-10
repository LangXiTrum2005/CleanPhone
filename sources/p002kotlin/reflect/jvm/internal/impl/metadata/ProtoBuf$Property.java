package p002kotlin.reflect.jvm.internal.impl.metadata;

import com.google.android.gms.ads.AdSize;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p002kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront;
import p002kotlin.reflect.jvm.internal.impl.protobuf.kowloon;
import p002kotlin.reflect.jvm.internal.impl.protobuf.marial;
import p002kotlin.reflect.jvm.internal.impl.protobuf.wireman;

/* JADX INFO: loaded from: classes5.dex */
public final class ProtoBuf$Property extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Property> implements kowloon {
    public static arytenoidectomy<ProtoBuf$Property> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$Property f30922kowloon;
    private int bitField0_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ProtoBuf$Type> contextReceiverType_;
    private int flags_;
    private int getterFlags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private ProtoBuf$Type receiverType_;
    private int returnTypeId_;
    private ProtoBuf$Type returnType_;
    private int setterFlags_;
    private ProtoBuf$ValueParameter setterValueParameter_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private final wireman unknownFields;
    private List<Integer> versionRequirement_;

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$Property> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Property dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Property(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(true);
        f30922kowloon = protoBuf$Property;
        protoBuf$Property.dern();
    }

    private void dern() {
        this.flags_ = 518;
        this.oldFlags_ = 2054;
        this.name_ = 0;
        this.returnType_ = ProtoBuf$Type.getDefaultInstance();
        this.returnTypeId_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.receiverType_ = ProtoBuf$Type.getDefaultInstance();
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.setterValueParameter_ = ProtoBuf$ValueParameter.getDefaultInstance();
        this.getterFlags_ = 0;
        this.setterFlags_ = 0;
        this.versionRequirement_ = list;
    }

    public static ProtoBuf$Property getDefaultInstance() {
        return f30922kowloon;
    }

    public static saneness newBuilder() {
        return saneness.polloi();
    }

    public ProtoBuf$Type getContextReceiverType(int i) {
        return this.contextReceiverType_.get(i);
    }

    public int getContextReceiverTypeCount() {
        return this.contextReceiverType_.size();
    }

    public List<Integer> getContextReceiverTypeIdList() {
        return this.contextReceiverTypeId_;
    }

    public List<ProtoBuf$Type> getContextReceiverTypeList() {
        return this.contextReceiverType_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getGetterFlags() {
        return this.getterFlags_;
    }

    public int getName() {
        return this.name_;
    }

    public int getOldFlags() {
        return this.oldFlags_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$Property> getParserForType() {
        return PARSER;
    }

    public ProtoBuf$Type getReceiverType() {
        return this.receiverType_;
    }

    public int getReceiverTypeId() {
        return this.receiverTypeId_;
    }

    public ProtoBuf$Type getReturnType() {
        return this.returnType_;
    }

    public int getReturnTypeId() {
        return this.returnTypeId_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iKowloon = (this.bitField0_ & 2) == 2 ? CodedOutputStream.kowloon(1, this.oldFlags_) : 0;
        if ((this.bitField0_ & 4) == 4) {
            iKowloon += CodedOutputStream.kowloon(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iKowloon += CodedOutputStream.molybdenite(3, this.returnType_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iKowloon += CodedOutputStream.molybdenite(4, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 32) == 32) {
            iKowloon += CodedOutputStream.molybdenite(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            iKowloon += CodedOutputStream.molybdenite(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            iKowloon += CodedOutputStream.kowloon(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            iKowloon += CodedOutputStream.kowloon(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iKowloon += CodedOutputStream.kowloon(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iKowloon += CodedOutputStream.kowloon(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            iKowloon += CodedOutputStream.kowloon(11, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            iKowloon += CodedOutputStream.molybdenite(12, this.contextReceiverType_.get(i3));
        }
        int iArytenoidectomy = 0;
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            iArytenoidectomy += CodedOutputStream.arytenoidectomy(this.contextReceiverTypeId_.get(i4).intValue());
        }
        int iArytenoidectomy2 = iKowloon + iArytenoidectomy;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iArytenoidectomy2 = iArytenoidectomy2 + 1 + CodedOutputStream.arytenoidectomy(iArytenoidectomy);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iArytenoidectomy;
        int iArytenoidectomy3 = 0;
        for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
            iArytenoidectomy3 += CodedOutputStream.arytenoidectomy(this.versionRequirement_.get(i5).intValue());
        }
        int size = iArytenoidectomy2 + iArytenoidectomy3 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getSetterFlags() {
        return this.setterFlags_;
    }

    public ProtoBuf$ValueParameter getSetterValueParameter() {
        return this.setterValueParameter_;
    }

    public ProtoBuf$TypeParameter getTypeParameter(int i) {
        return this.typeParameter_.get(i);
    }

    public int getTypeParameterCount() {
        return this.typeParameter_.size();
    }

    public List<ProtoBuf$TypeParameter> getTypeParameterList() {
        return this.typeParameter_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasGetterFlags() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasName() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasOldFlags() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasReceiverType() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasReceiverTypeId() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasReturnType() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasReturnTypeId() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasSetterFlags() {
        return (this.bitField0_ & 512) == 512;
    }

    public boolean hasSetterValueParameter() {
        return (this.bitField0_ & 128) == 128;
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
        if (hasReturnType() && !getReturnType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasReceiverType() && !getReceiverType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
            if (!getContextReceiverType(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
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
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.cultivated(1, this.oldFlags_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.cultivated(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.milliradian(3, this.returnType_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            codedOutputStream.milliradian(4, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.milliradian(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.milliradian(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.cultivated(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            codedOutputStream.cultivated(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.cultivated(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.cultivated(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.cultivated(11, this.flags_);
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            codedOutputStream.milliradian(12, this.contextReceiverType_.get(i2));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            codedOutputStream.sensatory(106);
            codedOutputStream.sensatory(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
            codedOutputStream.premeiotic(this.contextReceiverTypeId_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            codedOutputStream.cultivated(31, this.versionRequirement_.get(i4).intValue());
        }
        attabalVarNewExtensionWriter.attabal(19000, codedOutputStream);
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$Property protoBuf$Property) {
        return newBuilder().beachfront(protoBuf$Property);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Property getDefaultInstanceForType() {
        return f30922kowloon;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Property(GeneratedMessageLite.dern<ProtoBuf$Property, ?> dernVar) {
        super(dernVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = dernVar.marial();
    }

    public ProtoBuf$Property(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$Property(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        dern();
        wireman.saneness sanenessVarArytenoidectomy = wireman.arytenoidectomy();
        CodedOutputStream codedOutputStreamMerc = CodedOutputStream.merc(sanenessVarArytenoidectomy, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iPolder = marialVar.polder();
                    switch (iPolder) {
                        case 0:
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = marialVar.molybdenite();
                            continue;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = marialVar.molybdenite();
                            continue;
                        case 26:
                            ProtoBuf$Type.saneness builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar);
                            this.returnType_ = protoBuf$Type;
                            if (builder != null) {
                                builder.beachfront(protoBuf$Type);
                                this.returnType_ = builder.kowloon();
                            }
                            this.bitField0_ |= 8;
                            continue;
                        case 34:
                            int i2 = (i == true ? 1 : 0) & 32;
                            i = i;
                            if (i2 != 32) {
                                this.typeParameter_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 32;
                            }
                            this.typeParameter_.add((ProtoBuf$TypeParameter) marialVar.adultoid(ProtoBuf$TypeParameter.PARSER, beachfrontVar));
                            continue;
                        case 42:
                            ProtoBuf$Type.saneness builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar);
                            this.receiverType_ = protoBuf$Type2;
                            if (builder2 != null) {
                                builder2.beachfront(protoBuf$Type2);
                                this.receiverType_ = builder2.kowloon();
                            }
                            this.bitField0_ |= 32;
                            continue;
                        case 50:
                            ProtoBuf$ValueParameter.saneness builder3 = (this.bitField0_ & 128) == 128 ? this.setterValueParameter_.toBuilder() : null;
                            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) marialVar.adultoid(ProtoBuf$ValueParameter.PARSER, beachfrontVar);
                            this.setterValueParameter_ = protoBuf$ValueParameter;
                            if (builder3 != null) {
                                builder3.beachfront(protoBuf$ValueParameter);
                                this.setterValueParameter_ = builder3.kowloon();
                            }
                            this.bitField0_ |= 128;
                            continue;
                        case 56:
                            this.bitField0_ |= 256;
                            this.getterFlags_ = marialVar.molybdenite();
                            continue;
                        case 64:
                            this.bitField0_ |= 512;
                            this.setterFlags_ = marialVar.molybdenite();
                            continue;
                        case 72:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = marialVar.molybdenite();
                            continue;
                        case 80:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = marialVar.molybdenite();
                            continue;
                        case 88:
                            this.bitField0_ |= 1;
                            this.flags_ = marialVar.molybdenite();
                            continue;
                        case 98:
                            int i3 = (i == true ? 1 : 0) & 256;
                            i = i;
                            if (i3 != 256) {
                                this.contextReceiverType_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 256;
                            }
                            this.contextReceiverType_.add((ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar));
                            continue;
                        case 104:
                            int i4 = (i == true ? 1 : 0) & 512;
                            i = i;
                            if (i4 != 512) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 512;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(marialVar.molybdenite()));
                            continue;
                        case 106:
                            int iCutely = marialVar.cutely(marialVar.cuirassed());
                            int i5 = (i == true ? 1 : 0) & 512;
                            i = i;
                            if (i5 != 512 && marialVar.marial() > 0) {
                                i = i;
                                this.contextReceiverTypeId_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 512;
                            }
                            i = i;
                            while (marialVar.marial() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(marialVar.molybdenite()));
                            }
                            marialVar.taiyuan(iCutely);
                            continue;
                        case 248:
                            int i6 = (i == true ? 1 : 0) & 8192;
                            i = i;
                            if (i6 != 8192) {
                                this.versionRequirement_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 8192;
                            }
                            this.versionRequirement_.add(Integer.valueOf(marialVar.molybdenite()));
                            continue;
                        case AdSize.MEDIUM_RECTANGLE_HEIGHT /* 250 */:
                            int iCutely2 = marialVar.cutely(marialVar.cuirassed());
                            int i7 = (i == true ? 1 : 0) & 8192;
                            i = i;
                            if (i7 != 8192 && marialVar.marial() > 0) {
                                i = i;
                                this.versionRequirement_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 8192;
                            }
                            i = i;
                            while (marialVar.marial() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(marialVar.molybdenite()));
                            }
                            marialVar.taiyuan(iCutely2);
                            continue;
                        default:
                            if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if (((i == true ? 1 : 0) & 256) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if (((i == true ? 1 : 0) & 512) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if (((i == true ? 1 : 0) & 8192) == 8192) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
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
        if (((i == true ? 1 : 0) & 32) == 32) {
            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
        }
        if (((i == true ? 1 : 0) & 256) == 256) {
            this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
        }
        if (((i == true ? 1 : 0) & 512) == 512) {
            this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
        }
        if (((i == true ? 1 : 0) & 8192) == 8192) {
            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.dern<ProtoBuf$Property, saneness> implements kowloon {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public int f30923adultoid;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public int f30924cord;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public List<ProtoBuf$Type> f30925cuirassed;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public int f30927gintrap;

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
        public int f30930oilcan;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f30931polloi;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public ProtoBuf$Type f30932preprohormone;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public List<ProtoBuf$TypeParameter> f30933rotuma;

        /* JADX INFO: renamed from: sealless, reason: collision with root package name */
        public List<Integer> f30934sealless;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
        public List<Integer> f30935stratoscope;

        /* JADX INFO: renamed from: trm, reason: collision with root package name */
        public ProtoBuf$ValueParameter f30936trm;

        /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
        public int f30937yemenite;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f30929molybdenite = 518;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f30928graveside = 2054;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public ProtoBuf$Type f30926dovishness = ProtoBuf$Type.getDefaultInstance();

        public saneness() {
            List list = Collections.EMPTY_LIST;
            this.f30933rotuma = list;
            this.f30932preprohormone = ProtoBuf$Type.getDefaultInstance();
            this.f30925cuirassed = list;
            this.f30935stratoscope = list;
            this.f30936trm = ProtoBuf$ValueParameter.getDefaultInstance();
            this.f30934sealless = list;
            gintrap();
        }

        private void adultoid() {
            if ((this.f30931polloi & 32) != 32) {
                this.f30933rotuma = new ArrayList(this.f30933rotuma);
                this.f30931polloi |= 32;
            }
        }

        private void dovishness() {
            if ((this.f30931polloi & 8192) != 8192) {
                this.f30934sealless = new ArrayList(this.f30934sealless);
                this.f30931polloi |= 8192;
            }
        }

        private void graveside() {
            if ((this.f30931polloi & 256) != 256) {
                this.f30925cuirassed = new ArrayList(this.f30925cuirassed);
                this.f30931polloi |= 256;
            }
        }

        private void molybdenite() {
            if ((this.f30931polloi & 512) != 512) {
                this.f30935stratoscope = new ArrayList(this.f30935stratoscope);
                this.f30931polloi |= 512;
            }
        }

        public static saneness polloi() {
            return new saneness();
        }

        public saneness cord(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30931polloi & 64) != 64 || this.f30932preprohormone == ProtoBuf$Type.getDefaultInstance()) {
                this.f30932preprohormone = protoBuf$Type;
            } else {
                this.f30932preprohormone = ProtoBuf$Type.newBuilder(this.f30932preprohormone).beachfront(protoBuf$Type).kowloon();
            }
            this.f30931polloi |= 64;
            return this;
        }

        public saneness cuirassed(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30931polloi & 8) != 8 || this.f30926dovishness == ProtoBuf$Type.getDefaultInstance()) {
                this.f30926dovishness = protoBuf$Type;
            } else {
                this.f30926dovishness = ProtoBuf$Type.newBuilder(this.f30926dovishness).beachfront(protoBuf$Type).kowloon();
            }
            this.f30931polloi |= 8;
            return this;
        }

        public ProtoBuf$Property kowloon() {
            ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(this);
            int i = this.f30931polloi;
            int i2 = (i & 1) != 1 ? 0 : 1;
            protoBuf$Property.flags_ = this.f30929molybdenite;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$Property.oldFlags_ = this.f30928graveside;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$Property.name_ = this.f30923adultoid;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$Property.returnType_ = this.f30926dovishness;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$Property.returnTypeId_ = this.f30927gintrap;
            if ((this.f30931polloi & 32) == 32) {
                this.f30933rotuma = Collections.unmodifiableList(this.f30933rotuma);
                this.f30931polloi &= -33;
            }
            protoBuf$Property.typeParameter_ = this.f30933rotuma;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            protoBuf$Property.receiverType_ = this.f30932preprohormone;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            protoBuf$Property.receiverTypeId_ = this.f30924cord;
            if ((this.f30931polloi & 256) == 256) {
                this.f30925cuirassed = Collections.unmodifiableList(this.f30925cuirassed);
                this.f30931polloi &= -257;
            }
            protoBuf$Property.contextReceiverType_ = this.f30925cuirassed;
            if ((this.f30931polloi & 512) == 512) {
                this.f30935stratoscope = Collections.unmodifiableList(this.f30935stratoscope);
                this.f30931polloi &= -513;
            }
            protoBuf$Property.contextReceiverTypeId_ = this.f30935stratoscope;
            if ((i & 1024) == 1024) {
                i2 |= 128;
            }
            protoBuf$Property.setterValueParameter_ = this.f30936trm;
            if ((i & 2048) == 2048) {
                i2 |= 256;
            }
            protoBuf$Property.getterFlags_ = this.f30930oilcan;
            if ((i & 4096) == 4096) {
                i2 |= 512;
            }
            protoBuf$Property.setterFlags_ = this.f30937yemenite;
            if ((this.f30931polloi & 8192) == 8192) {
                this.f30934sealless = Collections.unmodifiableList(this.f30934sealless);
                this.f30931polloi &= -8193;
            }
            protoBuf$Property.versionRequirement_ = this.f30934sealless;
            protoBuf$Property.bitField0_ = i2;
            return protoBuf$Property;
        }

        public saneness merc(int i) {
            this.f30931polloi |= 4096;
            this.f30937yemenite = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return polloi().beachfront(kowloon());
        }

        public saneness oilcan(int i) {
            this.f30931polloi |= 2048;
            this.f30930oilcan = i;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: preprohormone, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$Property protoBuf$Property = null;
            try {
                try {
                    ProtoBuf$Property protoBuf$PropertyDern = ProtoBuf$Property.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$PropertyDern != null) {
                        beachfront(protoBuf$PropertyDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$Property != null) {
                        beachfront(protoBuf$Property);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Property protoBuf$Property2 = (ProtoBuf$Property) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Property = protoBuf$Property2;
                    if (protoBuf$Property != null) {
                        beachfront(protoBuf$Property);
                    }
                    throw th;
                }
            }
        }

        public saneness restrictive(int i) {
            this.f30931polloi |= 16;
            this.f30927gintrap = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$Property protoBuf$Property) {
            if (protoBuf$Property == ProtoBuf$Property.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Property.hasFlags()) {
                trm(protoBuf$Property.getFlags());
            }
            if (protoBuf$Property.hasOldFlags()) {
                sealless(protoBuf$Property.getOldFlags());
            }
            if (protoBuf$Property.hasName()) {
                yemenite(protoBuf$Property.getName());
            }
            if (protoBuf$Property.hasReturnType()) {
                cuirassed(protoBuf$Property.getReturnType());
            }
            if (protoBuf$Property.hasReturnTypeId()) {
                restrictive(protoBuf$Property.getReturnTypeId());
            }
            if (!protoBuf$Property.typeParameter_.isEmpty()) {
                if (this.f30933rotuma.isEmpty()) {
                    this.f30933rotuma = protoBuf$Property.typeParameter_;
                    this.f30931polloi &= -33;
                } else {
                    adultoid();
                    this.f30933rotuma.addAll(protoBuf$Property.typeParameter_);
                }
            }
            if (protoBuf$Property.hasReceiverType()) {
                cord(protoBuf$Property.getReceiverType());
            }
            if (protoBuf$Property.hasReceiverTypeId()) {
                supplicat(protoBuf$Property.getReceiverTypeId());
            }
            if (!protoBuf$Property.contextReceiverType_.isEmpty()) {
                if (this.f30925cuirassed.isEmpty()) {
                    this.f30925cuirassed = protoBuf$Property.contextReceiverType_;
                    this.f30931polloi &= -257;
                } else {
                    graveside();
                    this.f30925cuirassed.addAll(protoBuf$Property.contextReceiverType_);
                }
            }
            if (!protoBuf$Property.contextReceiverTypeId_.isEmpty()) {
                if (this.f30935stratoscope.isEmpty()) {
                    this.f30935stratoscope = protoBuf$Property.contextReceiverTypeId_;
                    this.f30931polloi &= -513;
                } else {
                    molybdenite();
                    this.f30935stratoscope.addAll(protoBuf$Property.contextReceiverTypeId_);
                }
            }
            if (protoBuf$Property.hasSetterValueParameter()) {
                stratoscope(protoBuf$Property.getSetterValueParameter());
            }
            if (protoBuf$Property.hasGetterFlags()) {
                oilcan(protoBuf$Property.getGetterFlags());
            }
            if (protoBuf$Property.hasSetterFlags()) {
                merc(protoBuf$Property.getSetterFlags());
            }
            if (!protoBuf$Property.versionRequirement_.isEmpty()) {
                if (this.f30934sealless.isEmpty()) {
                    this.f30934sealless = protoBuf$Property.versionRequirement_;
                    this.f30931polloi &= -8193;
                } else {
                    dovishness();
                    this.f30934sealless.addAll(protoBuf$Property.versionRequirement_);
                }
            }
            formularize(protoBuf$Property);
            competently(marial().dern(protoBuf$Property.unknownFields));
            return this;
        }

        public saneness sealless(int i) {
            this.f30931polloi |= 2;
            this.f30928graveside = i;
            return this;
        }

        public saneness stratoscope(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
            if ((this.f30931polloi & 1024) != 1024 || this.f30936trm == ProtoBuf$ValueParameter.getDefaultInstance()) {
                this.f30936trm = protoBuf$ValueParameter;
            } else {
                this.f30936trm = ProtoBuf$ValueParameter.newBuilder(this.f30936trm).beachfront(protoBuf$ValueParameter).kowloon();
            }
            this.f30931polloi |= 1024;
            return this;
        }

        public saneness supplicat(int i) {
            this.f30931polloi |= 128;
            this.f30924cord = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Property build() {
            ProtoBuf$Property protoBuf$PropertyKowloon = kowloon();
            if (protoBuf$PropertyKowloon.isInitialized()) {
                return protoBuf$PropertyKowloon;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$PropertyKowloon);
        }

        public saneness trm(int i) {
            this.f30931polloi |= 1;
            this.f30929molybdenite = i;
            return this;
        }

        public saneness yemenite(int i) {
            this.f30931polloi |= 4;
            this.f30923adultoid = i;
            return this;
        }

        private void gintrap() {
        }
    }
}
