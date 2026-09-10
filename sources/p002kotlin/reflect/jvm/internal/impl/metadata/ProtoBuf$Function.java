package p002kotlin.reflect.jvm.internal.impl.metadata;

import com.google.android.gms.ads.AdSize;
import java.io.IOException;
import java.io.InputStream;
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
public final class ProtoBuf$Function extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Function> implements kowloon {
    public static arytenoidectomy<ProtoBuf$Function> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$Function f30889kowloon;
    private int bitField0_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ProtoBuf$Type> contextReceiverType_;
    private ProtoBuf$Contract contract_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private ProtoBuf$Type receiverType_;
    private int returnTypeId_;
    private ProtoBuf$Type returnType_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private ProtoBuf$TypeTable typeTable_;
    private final wireman unknownFields;
    private List<ProtoBuf$ValueParameter> valueParameter_;
    private List<Integer> versionRequirement_;

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$Function> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Function dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Function(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(true);
        f30889kowloon = protoBuf$Function;
        protoBuf$Function.dern();
    }

    private void dern() {
        this.flags_ = 6;
        this.oldFlags_ = 6;
        this.name_ = 0;
        this.returnType_ = ProtoBuf$Type.getDefaultInstance();
        this.returnTypeId_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.receiverType_ = ProtoBuf$Type.getDefaultInstance();
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.valueParameter_ = list;
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirement_ = list;
        this.contract_ = ProtoBuf$Contract.getDefaultInstance();
    }

    public static ProtoBuf$Function getDefaultInstance() {
        return f30889kowloon;
    }

    public static saneness newBuilder() {
        return saneness.polloi();
    }

    public static ProtoBuf$Function parseFrom(InputStream inputStream, beachfront beachfrontVar) throws IOException {
        return PARSER.attabal(inputStream, beachfrontVar);
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

    public ProtoBuf$Contract getContract() {
        return this.contract_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getName() {
        return this.name_;
    }

    public int getOldFlags() {
        return this.oldFlags_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$Function> getParserForType() {
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
        for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
            iKowloon += CodedOutputStream.molybdenite(6, this.valueParameter_.get(i3));
        }
        if ((this.bitField0_ & 16) == 16) {
            iKowloon += CodedOutputStream.kowloon(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iKowloon += CodedOutputStream.kowloon(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            iKowloon += CodedOutputStream.kowloon(9, this.flags_);
        }
        for (int i4 = 0; i4 < this.contextReceiverType_.size(); i4++) {
            iKowloon += CodedOutputStream.molybdenite(10, this.contextReceiverType_.get(i4));
        }
        int iArytenoidectomy = 0;
        for (int i5 = 0; i5 < this.contextReceiverTypeId_.size(); i5++) {
            iArytenoidectomy += CodedOutputStream.arytenoidectomy(this.contextReceiverTypeId_.get(i5).intValue());
        }
        int iMolybdenite = iKowloon + iArytenoidectomy;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iMolybdenite = iMolybdenite + 1 + CodedOutputStream.arytenoidectomy(iArytenoidectomy);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iArytenoidectomy;
        if ((this.bitField0_ & 128) == 128) {
            iMolybdenite += CodedOutputStream.molybdenite(30, this.typeTable_);
        }
        int iArytenoidectomy2 = 0;
        for (int i6 = 0; i6 < this.versionRequirement_.size(); i6++) {
            iArytenoidectomy2 += CodedOutputStream.arytenoidectomy(this.versionRequirement_.get(i6).intValue());
        }
        int size = iMolybdenite + iArytenoidectomy2 + (getVersionRequirementList().size() * 2);
        if ((this.bitField0_ & 256) == 256) {
            size += CodedOutputStream.molybdenite(32, this.contract_);
        }
        int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
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

    public ProtoBuf$TypeTable getTypeTable() {
        return this.typeTable_;
    }

    public ProtoBuf$ValueParameter getValueParameter(int i) {
        return this.valueParameter_.get(i);
    }

    public int getValueParameterCount() {
        return this.valueParameter_.size();
    }

    public List<ProtoBuf$ValueParameter> getValueParameterList() {
        return this.valueParameter_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasContract() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
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

    public boolean hasTypeTable() {
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
        for (int i3 = 0; i3 < getValueParameterCount(); i3++) {
            if (!getValueParameter(i3).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasTypeTable() && !getTypeTable().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasContract() && !getContract().isInitialized()) {
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
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            codedOutputStream.milliradian(6, this.valueParameter_.get(i2));
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.cultivated(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.cultivated(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.cultivated(9, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            codedOutputStream.milliradian(10, this.contextReceiverType_.get(i3));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            codedOutputStream.sensatory(90);
            codedOutputStream.sensatory(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            codedOutputStream.premeiotic(this.contextReceiverTypeId_.get(i4).intValue());
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.milliradian(30, this.typeTable_);
        }
        for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
            codedOutputStream.cultivated(31, this.versionRequirement_.get(i5).intValue());
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.milliradian(32, this.contract_);
        }
        attabalVarNewExtensionWriter.attabal(19000, codedOutputStream);
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$Function protoBuf$Function) {
        return newBuilder().beachfront(protoBuf$Function);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Function getDefaultInstanceForType() {
        return f30889kowloon;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Function(GeneratedMessageLite.dern<ProtoBuf$Function, ?> dernVar) {
        super(dernVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = dernVar.marial();
    }

    public ProtoBuf$Function(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$Function(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                            int i3 = (i == true ? 1 : 0) & 1024;
                            i = i;
                            if (i3 != 1024) {
                                this.valueParameter_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 1024;
                            }
                            this.valueParameter_.add((ProtoBuf$ValueParameter) marialVar.adultoid(ProtoBuf$ValueParameter.PARSER, beachfrontVar));
                            continue;
                        case 56:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = marialVar.molybdenite();
                            continue;
                        case 64:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = marialVar.molybdenite();
                            continue;
                        case 72:
                            this.bitField0_ |= 1;
                            this.flags_ = marialVar.molybdenite();
                            continue;
                        case 82:
                            int i4 = (i == true ? 1 : 0) & 256;
                            i = i;
                            if (i4 != 256) {
                                this.contextReceiverType_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 256;
                            }
                            this.contextReceiverType_.add((ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar));
                            continue;
                        case 88:
                            int i5 = (i == true ? 1 : 0) & 512;
                            i = i;
                            if (i5 != 512) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 512;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(marialVar.molybdenite()));
                            continue;
                        case 90:
                            int iCutely = marialVar.cutely(marialVar.cuirassed());
                            int i6 = (i == true ? 1 : 0) & 512;
                            i = i;
                            if (i6 != 512 && marialVar.marial() > 0) {
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
                        case 242:
                            ProtoBuf$TypeTable.saneness builder3 = (this.bitField0_ & 128) == 128 ? this.typeTable_.toBuilder() : null;
                            ProtoBuf$TypeTable protoBuf$TypeTable = (ProtoBuf$TypeTable) marialVar.adultoid(ProtoBuf$TypeTable.PARSER, beachfrontVar);
                            this.typeTable_ = protoBuf$TypeTable;
                            if (builder3 != null) {
                                builder3.beachfront(protoBuf$TypeTable);
                                this.typeTable_ = builder3.apical();
                            }
                            this.bitField0_ |= 128;
                            continue;
                        case 248:
                            int i7 = (i == true ? 1 : 0) & 4096;
                            i = i;
                            if (i7 != 4096) {
                                this.versionRequirement_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 4096;
                            }
                            this.versionRequirement_.add(Integer.valueOf(marialVar.molybdenite()));
                            continue;
                        case AdSize.MEDIUM_RECTANGLE_HEIGHT /* 250 */:
                            int iCutely2 = marialVar.cutely(marialVar.cuirassed());
                            int i8 = (i == true ? 1 : 0) & 4096;
                            i = i;
                            if (i8 != 4096 && marialVar.marial() > 0) {
                                i = i;
                                this.versionRequirement_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 4096;
                            }
                            i = i;
                            while (marialVar.marial() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(marialVar.molybdenite()));
                            }
                            marialVar.taiyuan(iCutely2);
                            continue;
                        case 258:
                            ProtoBuf$Contract.saneness builder4 = (this.bitField0_ & 256) == 256 ? this.contract_.toBuilder() : null;
                            ProtoBuf$Contract protoBuf$Contract = (ProtoBuf$Contract) marialVar.adultoid(ProtoBuf$Contract.PARSER, beachfrontVar);
                            this.contract_ = protoBuf$Contract;
                            if (builder4 != null) {
                                builder4.beachfront(protoBuf$Contract);
                                this.contract_ = builder4.apical();
                            }
                            this.bitField0_ |= 256;
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
                if (((i == true ? 1 : 0) & 1024) == 1024) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if (((i == true ? 1 : 0) & 256) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if (((i == true ? 1 : 0) & 512) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if (((i == true ? 1 : 0) & 4096) == 4096) {
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
        if (((i == true ? 1 : 0) & 1024) == 1024) {
            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
        }
        if (((i == true ? 1 : 0) & 256) == 256) {
            this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
        }
        if (((i == true ? 1 : 0) & 512) == 512) {
            this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
        }
        if (((i == true ? 1 : 0) & 4096) == 4096) {
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

    public static final class saneness extends GeneratedMessageLite.dern<ProtoBuf$Function, saneness> implements kowloon {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public int f30890adultoid;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public int f30891cord;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public List<ProtoBuf$Type> f30892cuirassed;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public int f30894gintrap;

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
        public ProtoBuf$TypeTable f30897oilcan;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f30898polloi;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public ProtoBuf$Type f30899preprohormone;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public List<ProtoBuf$TypeParameter> f30900rotuma;

        /* JADX INFO: renamed from: sealless, reason: collision with root package name */
        public ProtoBuf$Contract f30901sealless;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
        public List<Integer> f30902stratoscope;

        /* JADX INFO: renamed from: trm, reason: collision with root package name */
        public List<ProtoBuf$ValueParameter> f30903trm;

        /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
        public List<Integer> f30904yemenite;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f30896molybdenite = 6;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f30895graveside = 6;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public ProtoBuf$Type f30893dovishness = ProtoBuf$Type.getDefaultInstance();

        public saneness() {
            List list = Collections.EMPTY_LIST;
            this.f30900rotuma = list;
            this.f30899preprohormone = ProtoBuf$Type.getDefaultInstance();
            this.f30892cuirassed = list;
            this.f30902stratoscope = list;
            this.f30903trm = list;
            this.f30897oilcan = ProtoBuf$TypeTable.getDefaultInstance();
            this.f30904yemenite = list;
            this.f30901sealless = ProtoBuf$Contract.getDefaultInstance();
            rotuma();
        }

        private void adultoid() {
            if ((this.f30898polloi & 32) != 32) {
                this.f30900rotuma = new ArrayList(this.f30900rotuma);
                this.f30898polloi |= 32;
            }
        }

        private void dovishness() {
            if ((this.f30898polloi & 1024) != 1024) {
                this.f30903trm = new ArrayList(this.f30903trm);
                this.f30898polloi |= 1024;
            }
        }

        private void gintrap() {
            if ((this.f30898polloi & 4096) != 4096) {
                this.f30904yemenite = new ArrayList(this.f30904yemenite);
                this.f30898polloi |= 4096;
            }
        }

        private void graveside() {
            if ((this.f30898polloi & 256) != 256) {
                this.f30892cuirassed = new ArrayList(this.f30892cuirassed);
                this.f30898polloi |= 256;
            }
        }

        private void molybdenite() {
            if ((this.f30898polloi & 512) != 512) {
                this.f30902stratoscope = new ArrayList(this.f30902stratoscope);
                this.f30898polloi |= 512;
            }
        }

        public static saneness polloi() {
            return new saneness();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: cord, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$Function protoBuf$Function) {
            if (protoBuf$Function == ProtoBuf$Function.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Function.hasFlags()) {
                yemenite(protoBuf$Function.getFlags());
            }
            if (protoBuf$Function.hasOldFlags()) {
                supplicat(protoBuf$Function.getOldFlags());
            }
            if (protoBuf$Function.hasName()) {
                sealless(protoBuf$Function.getName());
            }
            if (protoBuf$Function.hasReturnType()) {
                trm(protoBuf$Function.getReturnType());
            }
            if (protoBuf$Function.hasReturnTypeId()) {
                merc(protoBuf$Function.getReturnTypeId());
            }
            if (!protoBuf$Function.typeParameter_.isEmpty()) {
                if (this.f30900rotuma.isEmpty()) {
                    this.f30900rotuma = protoBuf$Function.typeParameter_;
                    this.f30898polloi &= -33;
                } else {
                    adultoid();
                    this.f30900rotuma.addAll(protoBuf$Function.typeParameter_);
                }
            }
            if (protoBuf$Function.hasReceiverType()) {
                stratoscope(protoBuf$Function.getReceiverType());
            }
            if (protoBuf$Function.hasReceiverTypeId()) {
                restrictive(protoBuf$Function.getReceiverTypeId());
            }
            if (!protoBuf$Function.contextReceiverType_.isEmpty()) {
                if (this.f30892cuirassed.isEmpty()) {
                    this.f30892cuirassed = protoBuf$Function.contextReceiverType_;
                    this.f30898polloi &= -257;
                } else {
                    graveside();
                    this.f30892cuirassed.addAll(protoBuf$Function.contextReceiverType_);
                }
            }
            if (!protoBuf$Function.contextReceiverTypeId_.isEmpty()) {
                if (this.f30902stratoscope.isEmpty()) {
                    this.f30902stratoscope = protoBuf$Function.contextReceiverTypeId_;
                    this.f30898polloi &= -513;
                } else {
                    molybdenite();
                    this.f30902stratoscope.addAll(protoBuf$Function.contextReceiverTypeId_);
                }
            }
            if (!protoBuf$Function.valueParameter_.isEmpty()) {
                if (this.f30903trm.isEmpty()) {
                    this.f30903trm = protoBuf$Function.valueParameter_;
                    this.f30898polloi &= -1025;
                } else {
                    dovishness();
                    this.f30903trm.addAll(protoBuf$Function.valueParameter_);
                }
            }
            if (protoBuf$Function.hasTypeTable()) {
                oilcan(protoBuf$Function.getTypeTable());
            }
            if (!protoBuf$Function.versionRequirement_.isEmpty()) {
                if (this.f30904yemenite.isEmpty()) {
                    this.f30904yemenite = protoBuf$Function.versionRequirement_;
                    this.f30898polloi &= -4097;
                } else {
                    gintrap();
                    this.f30904yemenite.addAll(protoBuf$Function.versionRequirement_);
                }
            }
            if (protoBuf$Function.hasContract()) {
                preprohormone(protoBuf$Function.getContract());
            }
            formularize(protoBuf$Function);
            competently(marial().dern(protoBuf$Function.unknownFields));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: cuirassed, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$Function protoBuf$Function = null;
            try {
                try {
                    ProtoBuf$Function protoBuf$FunctionDern = ProtoBuf$Function.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$FunctionDern != null) {
                        beachfront(protoBuf$FunctionDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$Function != null) {
                        beachfront(protoBuf$Function);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Function protoBuf$Function2 = (ProtoBuf$Function) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Function = protoBuf$Function2;
                    if (protoBuf$Function != null) {
                        beachfront(protoBuf$Function);
                    }
                    throw th;
                }
            }
        }

        public ProtoBuf$Function kowloon() {
            ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(this);
            int i = this.f30898polloi;
            int i2 = (i & 1) != 1 ? 0 : 1;
            protoBuf$Function.flags_ = this.f30896molybdenite;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$Function.oldFlags_ = this.f30895graveside;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$Function.name_ = this.f30890adultoid;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$Function.returnType_ = this.f30893dovishness;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$Function.returnTypeId_ = this.f30894gintrap;
            if ((this.f30898polloi & 32) == 32) {
                this.f30900rotuma = Collections.unmodifiableList(this.f30900rotuma);
                this.f30898polloi &= -33;
            }
            protoBuf$Function.typeParameter_ = this.f30900rotuma;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            protoBuf$Function.receiverType_ = this.f30899preprohormone;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            protoBuf$Function.receiverTypeId_ = this.f30891cord;
            if ((this.f30898polloi & 256) == 256) {
                this.f30892cuirassed = Collections.unmodifiableList(this.f30892cuirassed);
                this.f30898polloi &= -257;
            }
            protoBuf$Function.contextReceiverType_ = this.f30892cuirassed;
            if ((this.f30898polloi & 512) == 512) {
                this.f30902stratoscope = Collections.unmodifiableList(this.f30902stratoscope);
                this.f30898polloi &= -513;
            }
            protoBuf$Function.contextReceiverTypeId_ = this.f30902stratoscope;
            if ((this.f30898polloi & 1024) == 1024) {
                this.f30903trm = Collections.unmodifiableList(this.f30903trm);
                this.f30898polloi &= -1025;
            }
            protoBuf$Function.valueParameter_ = this.f30903trm;
            if ((i & 2048) == 2048) {
                i2 |= 128;
            }
            protoBuf$Function.typeTable_ = this.f30897oilcan;
            if ((this.f30898polloi & 4096) == 4096) {
                this.f30904yemenite = Collections.unmodifiableList(this.f30904yemenite);
                this.f30898polloi &= -4097;
            }
            protoBuf$Function.versionRequirement_ = this.f30904yemenite;
            if ((i & 8192) == 8192) {
                i2 |= 256;
            }
            protoBuf$Function.contract_ = this.f30901sealless;
            protoBuf$Function.bitField0_ = i2;
            return protoBuf$Function;
        }

        public saneness merc(int i) {
            this.f30898polloi |= 16;
            this.f30894gintrap = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return polloi().beachfront(kowloon());
        }

        public saneness oilcan(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if ((this.f30898polloi & 2048) != 2048 || this.f30897oilcan == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f30897oilcan = protoBuf$TypeTable;
            } else {
                this.f30897oilcan = ProtoBuf$TypeTable.newBuilder(this.f30897oilcan).beachfront(protoBuf$TypeTable).apical();
            }
            this.f30898polloi |= 2048;
            return this;
        }

        public saneness preprohormone(ProtoBuf$Contract protoBuf$Contract) {
            if ((this.f30898polloi & 8192) != 8192 || this.f30901sealless == ProtoBuf$Contract.getDefaultInstance()) {
                this.f30901sealless = protoBuf$Contract;
            } else {
                this.f30901sealless = ProtoBuf$Contract.newBuilder(this.f30901sealless).beachfront(protoBuf$Contract).apical();
            }
            this.f30898polloi |= 8192;
            return this;
        }

        public saneness restrictive(int i) {
            this.f30898polloi |= 128;
            this.f30891cord = i;
            return this;
        }

        public saneness sealless(int i) {
            this.f30898polloi |= 4;
            this.f30890adultoid = i;
            return this;
        }

        public saneness stratoscope(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30898polloi & 64) != 64 || this.f30899preprohormone == ProtoBuf$Type.getDefaultInstance()) {
                this.f30899preprohormone = protoBuf$Type;
            } else {
                this.f30899preprohormone = ProtoBuf$Type.newBuilder(this.f30899preprohormone).beachfront(protoBuf$Type).kowloon();
            }
            this.f30898polloi |= 64;
            return this;
        }

        public saneness supplicat(int i) {
            this.f30898polloi |= 2;
            this.f30895graveside = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Function build() {
            ProtoBuf$Function protoBuf$FunctionKowloon = kowloon();
            if (protoBuf$FunctionKowloon.isInitialized()) {
                return protoBuf$FunctionKowloon;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$FunctionKowloon);
        }

        public saneness trm(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30898polloi & 8) != 8 || this.f30893dovishness == ProtoBuf$Type.getDefaultInstance()) {
                this.f30893dovishness = protoBuf$Type;
            } else {
                this.f30893dovishness = ProtoBuf$Type.newBuilder(this.f30893dovishness).beachfront(protoBuf$Type).kowloon();
            }
            this.f30898polloi |= 8;
            return this;
        }

        public saneness yemenite(int i) {
            this.f30898polloi |= 1;
            this.f30896molybdenite = i;
            return this;
        }

        private void rotuma() {
        }
    }
}
