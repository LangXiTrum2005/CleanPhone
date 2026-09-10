package p002kotlin.reflect.jvm.internal.impl.metadata;

import com.google.android.gms.ads.AdSize;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p002kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront;
import p002kotlin.reflect.jvm.internal.impl.protobuf.impromptu;
import p002kotlin.reflect.jvm.internal.impl.protobuf.kowloon;
import p002kotlin.reflect.jvm.internal.impl.protobuf.marial;
import p002kotlin.reflect.jvm.internal.impl.protobuf.wireman;

/* JADX INFO: loaded from: classes5.dex */
public final class ProtoBuf$Class extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Class> implements kowloon {
    public static arytenoidectomy<ProtoBuf$Class> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$Class f30829kowloon;
    private int bitField0_;
    private int companionObjectName_;
    private List<ProtoBuf$Constructor> constructor_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ProtoBuf$Type> contextReceiverType_;
    private List<ProtoBuf$EnumEntry> enumEntry_;
    private int flags_;
    private int fqName_;
    private List<ProtoBuf$Function> function_;
    private int inlineClassUnderlyingPropertyName_;
    private int inlineClassUnderlyingTypeId_;
    private ProtoBuf$Type inlineClassUnderlyingType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int multiFieldValueClassUnderlyingNameMemoizedSerializedSize;
    private List<Integer> multiFieldValueClassUnderlyingName_;
    private int multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize;
    private List<Integer> multiFieldValueClassUnderlyingTypeId_;
    private List<ProtoBuf$Type> multiFieldValueClassUnderlyingType_;
    private int nestedClassNameMemoizedSerializedSize;
    private List<Integer> nestedClassName_;
    private List<ProtoBuf$Property> property_;
    private int sealedSubclassFqNameMemoizedSerializedSize;
    private List<Integer> sealedSubclassFqName_;
    private int supertypeIdMemoizedSerializedSize;
    private List<Integer> supertypeId_;
    private List<ProtoBuf$Type> supertype_;
    private List<ProtoBuf$TypeAlias> typeAlias_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private ProtoBuf$TypeTable typeTable_;
    private final wireman unknownFields;
    private ProtoBuf$VersionRequirementTable versionRequirementTable_;
    private List<Integer> versionRequirement_;

    public enum Kind implements impromptu.attabal {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);


        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static impromptu.saneness<Kind> f30831kowloon = new attabal();
        private final int value;

        public static class attabal implements impromptu.saneness<Kind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public Kind findValueByNumber(int i) {
                return Kind.valueOf(i);
            }
        }

        Kind(int i, int i2) {
            this.value = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
        public final int getNumber() {
            return this.value;
        }

        public static Kind valueOf(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }
    }

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$Class> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Class dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Class(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(true);
        f30829kowloon = protoBuf$Class;
        protoBuf$Class.dern();
    }

    private void dern() {
        this.flags_ = 6;
        this.fqName_ = 0;
        this.companionObjectName_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.supertype_ = list;
        this.supertypeId_ = list;
        this.nestedClassName_ = list;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.constructor_ = list;
        this.function_ = list;
        this.property_ = list;
        this.typeAlias_ = list;
        this.enumEntry_ = list;
        this.sealedSubclassFqName_ = list;
        this.inlineClassUnderlyingPropertyName_ = 0;
        this.inlineClassUnderlyingType_ = ProtoBuf$Type.getDefaultInstance();
        this.inlineClassUnderlyingTypeId_ = 0;
        this.multiFieldValueClassUnderlyingName_ = list;
        this.multiFieldValueClassUnderlyingType_ = list;
        this.multiFieldValueClassUnderlyingTypeId_ = list;
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirement_ = list;
        this.versionRequirementTable_ = ProtoBuf$VersionRequirementTable.getDefaultInstance();
    }

    public static ProtoBuf$Class getDefaultInstance() {
        return f30829kowloon;
    }

    public static saneness newBuilder() {
        return saneness.polloi();
    }

    public static ProtoBuf$Class parseFrom(InputStream inputStream, beachfront beachfrontVar) throws IOException {
        return PARSER.attabal(inputStream, beachfrontVar);
    }

    public int getCompanionObjectName() {
        return this.companionObjectName_;
    }

    public ProtoBuf$Constructor getConstructor(int i) {
        return this.constructor_.get(i);
    }

    public int getConstructorCount() {
        return this.constructor_.size();
    }

    public List<ProtoBuf$Constructor> getConstructorList() {
        return this.constructor_;
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

    public ProtoBuf$EnumEntry getEnumEntry(int i) {
        return this.enumEntry_.get(i);
    }

    public int getEnumEntryCount() {
        return this.enumEntry_.size();
    }

    public List<ProtoBuf$EnumEntry> getEnumEntryList() {
        return this.enumEntry_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getFqName() {
        return this.fqName_;
    }

    public ProtoBuf$Function getFunction(int i) {
        return this.function_.get(i);
    }

    public int getFunctionCount() {
        return this.function_.size();
    }

    public List<ProtoBuf$Function> getFunctionList() {
        return this.function_;
    }

    public int getInlineClassUnderlyingPropertyName() {
        return this.inlineClassUnderlyingPropertyName_;
    }

    public ProtoBuf$Type getInlineClassUnderlyingType() {
        return this.inlineClassUnderlyingType_;
    }

    public int getInlineClassUnderlyingTypeId() {
        return this.inlineClassUnderlyingTypeId_;
    }

    public int getMultiFieldValueClassUnderlyingNameCount() {
        return this.multiFieldValueClassUnderlyingName_.size();
    }

    public List<Integer> getMultiFieldValueClassUnderlyingNameList() {
        return this.multiFieldValueClassUnderlyingName_;
    }

    public ProtoBuf$Type getMultiFieldValueClassUnderlyingType(int i) {
        return this.multiFieldValueClassUnderlyingType_.get(i);
    }

    public int getMultiFieldValueClassUnderlyingTypeCount() {
        return this.multiFieldValueClassUnderlyingType_.size();
    }

    public int getMultiFieldValueClassUnderlyingTypeIdCount() {
        return this.multiFieldValueClassUnderlyingTypeId_.size();
    }

    public List<Integer> getMultiFieldValueClassUnderlyingTypeIdList() {
        return this.multiFieldValueClassUnderlyingTypeId_;
    }

    public List<ProtoBuf$Type> getMultiFieldValueClassUnderlyingTypeList() {
        return this.multiFieldValueClassUnderlyingType_;
    }

    public List<Integer> getNestedClassNameList() {
        return this.nestedClassName_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$Class> getParserForType() {
        return PARSER;
    }

    public ProtoBuf$Property getProperty(int i) {
        return this.property_.get(i);
    }

    public int getPropertyCount() {
        return this.property_.size();
    }

    public List<ProtoBuf$Property> getPropertyList() {
        return this.property_;
    }

    public List<Integer> getSealedSubclassFqNameList() {
        return this.sealedSubclassFqName_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.flags_) : 0;
        int iArytenoidectomy = 0;
        for (int i2 = 0; i2 < this.supertypeId_.size(); i2++) {
            iArytenoidectomy += CodedOutputStream.arytenoidectomy(this.supertypeId_.get(i2).intValue());
        }
        int iMolybdenite = iKowloon + iArytenoidectomy;
        if (!getSupertypeIdList().isEmpty()) {
            iMolybdenite = iMolybdenite + 1 + CodedOutputStream.arytenoidectomy(iArytenoidectomy);
        }
        this.supertypeIdMemoizedSerializedSize = iArytenoidectomy;
        if ((this.bitField0_ & 2) == 2) {
            iMolybdenite += CodedOutputStream.kowloon(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iMolybdenite += CodedOutputStream.kowloon(4, this.companionObjectName_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            iMolybdenite += CodedOutputStream.molybdenite(5, this.typeParameter_.get(i3));
        }
        for (int i4 = 0; i4 < this.supertype_.size(); i4++) {
            iMolybdenite += CodedOutputStream.molybdenite(6, this.supertype_.get(i4));
        }
        int iArytenoidectomy2 = 0;
        for (int i5 = 0; i5 < this.nestedClassName_.size(); i5++) {
            iArytenoidectomy2 += CodedOutputStream.arytenoidectomy(this.nestedClassName_.get(i5).intValue());
        }
        int iMolybdenite2 = iMolybdenite + iArytenoidectomy2;
        if (!getNestedClassNameList().isEmpty()) {
            iMolybdenite2 = iMolybdenite2 + 1 + CodedOutputStream.arytenoidectomy(iArytenoidectomy2);
        }
        this.nestedClassNameMemoizedSerializedSize = iArytenoidectomy2;
        for (int i6 = 0; i6 < this.constructor_.size(); i6++) {
            iMolybdenite2 += CodedOutputStream.molybdenite(8, this.constructor_.get(i6));
        }
        for (int i7 = 0; i7 < this.function_.size(); i7++) {
            iMolybdenite2 += CodedOutputStream.molybdenite(9, this.function_.get(i7));
        }
        for (int i8 = 0; i8 < this.property_.size(); i8++) {
            iMolybdenite2 += CodedOutputStream.molybdenite(10, this.property_.get(i8));
        }
        for (int i9 = 0; i9 < this.typeAlias_.size(); i9++) {
            iMolybdenite2 += CodedOutputStream.molybdenite(11, this.typeAlias_.get(i9));
        }
        for (int i10 = 0; i10 < this.enumEntry_.size(); i10++) {
            iMolybdenite2 += CodedOutputStream.molybdenite(13, this.enumEntry_.get(i10));
        }
        int iArytenoidectomy3 = 0;
        for (int i11 = 0; i11 < this.sealedSubclassFqName_.size(); i11++) {
            iArytenoidectomy3 += CodedOutputStream.arytenoidectomy(this.sealedSubclassFqName_.get(i11).intValue());
        }
        int iMolybdenite3 = iMolybdenite2 + iArytenoidectomy3;
        if (!getSealedSubclassFqNameList().isEmpty()) {
            iMolybdenite3 = iMolybdenite3 + 2 + CodedOutputStream.arytenoidectomy(iArytenoidectomy3);
        }
        this.sealedSubclassFqNameMemoizedSerializedSize = iArytenoidectomy3;
        if ((this.bitField0_ & 8) == 8) {
            iMolybdenite3 += CodedOutputStream.kowloon(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iMolybdenite3 += CodedOutputStream.molybdenite(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iMolybdenite3 += CodedOutputStream.kowloon(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i12 = 0; i12 < this.contextReceiverType_.size(); i12++) {
            iMolybdenite3 += CodedOutputStream.molybdenite(20, this.contextReceiverType_.get(i12));
        }
        int iArytenoidectomy4 = 0;
        for (int i13 = 0; i13 < this.contextReceiverTypeId_.size(); i13++) {
            iArytenoidectomy4 += CodedOutputStream.arytenoidectomy(this.contextReceiverTypeId_.get(i13).intValue());
        }
        int iArytenoidectomy5 = iMolybdenite3 + iArytenoidectomy4;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iArytenoidectomy5 = iArytenoidectomy5 + 2 + CodedOutputStream.arytenoidectomy(iArytenoidectomy4);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iArytenoidectomy4;
        int iArytenoidectomy6 = 0;
        for (int i14 = 0; i14 < this.multiFieldValueClassUnderlyingName_.size(); i14++) {
            iArytenoidectomy6 += CodedOutputStream.arytenoidectomy(this.multiFieldValueClassUnderlyingName_.get(i14).intValue());
        }
        int iMolybdenite4 = iArytenoidectomy5 + iArytenoidectomy6;
        if (!getMultiFieldValueClassUnderlyingNameList().isEmpty()) {
            iMolybdenite4 = iMolybdenite4 + 2 + CodedOutputStream.arytenoidectomy(iArytenoidectomy6);
        }
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = iArytenoidectomy6;
        for (int i15 = 0; i15 < this.multiFieldValueClassUnderlyingType_.size(); i15++) {
            iMolybdenite4 += CodedOutputStream.molybdenite(23, this.multiFieldValueClassUnderlyingType_.get(i15));
        }
        int iArytenoidectomy7 = 0;
        for (int i16 = 0; i16 < this.multiFieldValueClassUnderlyingTypeId_.size(); i16++) {
            iArytenoidectomy7 += CodedOutputStream.arytenoidectomy(this.multiFieldValueClassUnderlyingTypeId_.get(i16).intValue());
        }
        int iMolybdenite5 = iMolybdenite4 + iArytenoidectomy7;
        if (!getMultiFieldValueClassUnderlyingTypeIdList().isEmpty()) {
            iMolybdenite5 = iMolybdenite5 + 2 + CodedOutputStream.arytenoidectomy(iArytenoidectomy7);
        }
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = iArytenoidectomy7;
        if ((this.bitField0_ & 64) == 64) {
            iMolybdenite5 += CodedOutputStream.molybdenite(30, this.typeTable_);
        }
        int iArytenoidectomy8 = 0;
        for (int i17 = 0; i17 < this.versionRequirement_.size(); i17++) {
            iArytenoidectomy8 += CodedOutputStream.arytenoidectomy(this.versionRequirement_.get(i17).intValue());
        }
        int size = iMolybdenite5 + iArytenoidectomy8 + (getVersionRequirementList().size() * 2);
        if ((this.bitField0_ & 128) == 128) {
            size += CodedOutputStream.molybdenite(32, this.versionRequirementTable_);
        }
        int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ProtoBuf$Type getSupertype(int i) {
        return this.supertype_.get(i);
    }

    public int getSupertypeCount() {
        return this.supertype_.size();
    }

    public List<Integer> getSupertypeIdList() {
        return this.supertypeId_;
    }

    public List<ProtoBuf$Type> getSupertypeList() {
        return this.supertype_;
    }

    public ProtoBuf$TypeAlias getTypeAlias(int i) {
        return this.typeAlias_.get(i);
    }

    public int getTypeAliasCount() {
        return this.typeAlias_.size();
    }

    public List<ProtoBuf$TypeAlias> getTypeAliasList() {
        return this.typeAlias_;
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

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public ProtoBuf$VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable_;
    }

    public boolean hasCompanionObjectName() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasFqName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasInlineClassUnderlyingPropertyName() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasInlineClassUnderlyingType() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasInlineClassUnderlyingTypeId() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasTypeTable() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasVersionRequirementTable() {
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
        if (!hasFqName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
            if (!getSupertype(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
            if (!getContextReceiverType(i3).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < getConstructorCount(); i4++) {
            if (!getConstructor(i4).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < getFunctionCount(); i5++) {
            if (!getFunction(i5).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < getPropertyCount(); i6++) {
            if (!getProperty(i6).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < getTypeAliasCount(); i7++) {
            if (!getTypeAlias(i7).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < getEnumEntryCount(); i8++) {
            if (!getEnumEntry(i8).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < getMultiFieldValueClassUnderlyingTypeCount(); i9++) {
            if (!getMultiFieldValueClassUnderlyingType(i9).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasTypeTable() && !getTypeTable().isInitialized()) {
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
        if (getSupertypeIdList().size() > 0) {
            codedOutputStream.sensatory(18);
            codedOutputStream.sensatory(this.supertypeIdMemoizedSerializedSize);
        }
        for (int i = 0; i < this.supertypeId_.size(); i++) {
            codedOutputStream.premeiotic(this.supertypeId_.get(i).intValue());
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.cultivated(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.cultivated(4, this.companionObjectName_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            codedOutputStream.milliradian(5, this.typeParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
            codedOutputStream.milliradian(6, this.supertype_.get(i3));
        }
        if (getNestedClassNameList().size() > 0) {
            codedOutputStream.sensatory(58);
            codedOutputStream.sensatory(this.nestedClassNameMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
            codedOutputStream.premeiotic(this.nestedClassName_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
            codedOutputStream.milliradian(8, this.constructor_.get(i5));
        }
        for (int i6 = 0; i6 < this.function_.size(); i6++) {
            codedOutputStream.milliradian(9, this.function_.get(i6));
        }
        for (int i7 = 0; i7 < this.property_.size(); i7++) {
            codedOutputStream.milliradian(10, this.property_.get(i7));
        }
        for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
            codedOutputStream.milliradian(11, this.typeAlias_.get(i8));
        }
        for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
            codedOutputStream.milliradian(13, this.enumEntry_.get(i9));
        }
        if (getSealedSubclassFqNameList().size() > 0) {
            codedOutputStream.sensatory(130);
            codedOutputStream.sensatory(this.sealedSubclassFqNameMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
            codedOutputStream.premeiotic(this.sealedSubclassFqName_.get(i10).intValue());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.cultivated(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.milliradian(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.cultivated(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
            codedOutputStream.milliradian(20, this.contextReceiverType_.get(i11));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            codedOutputStream.sensatory(Opcodes.TABLESWITCH);
            codedOutputStream.sensatory(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
            codedOutputStream.premeiotic(this.contextReceiverTypeId_.get(i12).intValue());
        }
        if (getMultiFieldValueClassUnderlyingNameList().size() > 0) {
            codedOutputStream.sensatory(Opcodes.GETSTATIC);
            codedOutputStream.sensatory(this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize);
        }
        for (int i13 = 0; i13 < this.multiFieldValueClassUnderlyingName_.size(); i13++) {
            codedOutputStream.premeiotic(this.multiFieldValueClassUnderlyingName_.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.multiFieldValueClassUnderlyingType_.size(); i14++) {
            codedOutputStream.milliradian(23, this.multiFieldValueClassUnderlyingType_.get(i14));
        }
        if (getMultiFieldValueClassUnderlyingTypeIdList().size() > 0) {
            codedOutputStream.sensatory(Opcodes.MONITORENTER);
            codedOutputStream.sensatory(this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize);
        }
        for (int i15 = 0; i15 < this.multiFieldValueClassUnderlyingTypeId_.size(); i15++) {
            codedOutputStream.premeiotic(this.multiFieldValueClassUnderlyingTypeId_.get(i15).intValue());
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.milliradian(30, this.typeTable_);
        }
        for (int i16 = 0; i16 < this.versionRequirement_.size(); i16++) {
            codedOutputStream.cultivated(31, this.versionRequirement_.get(i16).intValue());
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.milliradian(32, this.versionRequirementTable_);
        }
        attabalVarNewExtensionWriter.attabal(19000, codedOutputStream);
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$Class protoBuf$Class) {
        return newBuilder().beachfront(protoBuf$Class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Class getDefaultInstanceForType() {
        return f30829kowloon;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Class(GeneratedMessageLite.dern<ProtoBuf$Class, ?> dernVar) {
        super(dernVar);
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = dernVar.marial();
    }

    public ProtoBuf$Class(boolean z) {
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public static final class saneness extends GeneratedMessageLite.dern<ProtoBuf$Class, saneness> implements kowloon {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public int f30832adultoid;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public List<ProtoBuf$Type> f30833cord;

        /* JADX INFO: renamed from: creditor, reason: collision with root package name */
        public ProtoBuf$VersionRequirementTable f30834creditor;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public List<Integer> f30835cuirassed;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public List<ProtoBuf$TypeParameter> f30836dovishness;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public List<ProtoBuf$Type> f30837gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f30838graveside;

        /* JADX INFO: renamed from: grimness, reason: collision with root package name */
        public List<Integer> f30839grimness;

        /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
        public List<Integer> f30840kattegat;

        /* JADX INFO: renamed from: merc, reason: collision with root package name */
        public int f30841merc;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f30842molybdenite = 6;

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
        public List<ProtoBuf$Property> f30843oilcan;

        /* JADX INFO: renamed from: polder, reason: collision with root package name */
        public List<Integer> f30844polder;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f30845polloi;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public List<Integer> f30846preprohormone;

        /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
        public List<Integer> f30847privatdozent;

        /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
        public ProtoBuf$Type f30848restrictive;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public List<Integer> f30849rotuma;

        /* JADX INFO: renamed from: saran, reason: collision with root package name */
        public ProtoBuf$TypeTable f30850saran;

        /* JADX INFO: renamed from: sealless, reason: collision with root package name */
        public List<ProtoBuf$EnumEntry> f30851sealless;

        /* JADX INFO: renamed from: seminary, reason: collision with root package name */
        public List<ProtoBuf$Type> f30852seminary;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
        public List<ProtoBuf$Constructor> f30853stratoscope;

        /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
        public int f30854supplicat;

        /* JADX INFO: renamed from: trm, reason: collision with root package name */
        public List<ProtoBuf$Function> f30855trm;

        /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
        public List<ProtoBuf$TypeAlias> f30856yemenite;

        public saneness() {
            List list = Collections.EMPTY_LIST;
            this.f30836dovishness = list;
            this.f30837gintrap = list;
            this.f30849rotuma = list;
            this.f30846preprohormone = list;
            this.f30833cord = list;
            this.f30835cuirassed = list;
            this.f30853stratoscope = list;
            this.f30855trm = list;
            this.f30843oilcan = list;
            this.f30856yemenite = list;
            this.f30851sealless = list;
            this.f30840kattegat = list;
            this.f30848restrictive = ProtoBuf$Type.getDefaultInstance();
            this.f30844polder = list;
            this.f30852seminary = list;
            this.f30839grimness = list;
            this.f30850saran = ProtoBuf$TypeTable.getDefaultInstance();
            this.f30847privatdozent = list;
            this.f30834creditor = ProtoBuf$VersionRequirementTable.getDefaultInstance();
            merc();
        }

        public static saneness polloi() {
            return new saneness();
        }

        public final void adultoid() {
            if ((this.f30845polloi & 128) != 128) {
                this.f30833cord = new ArrayList(this.f30833cord);
                this.f30845polloi |= 128;
            }
        }

        public final void cord() {
            if ((this.f30845polloi & Opcodes.ASM8) != 524288) {
                this.f30852seminary = new ArrayList(this.f30852seminary);
                this.f30845polloi |= Opcodes.ASM8;
            }
        }

        public final void cuirassed() {
            if ((this.f30845polloi & 64) != 64) {
                this.f30846preprohormone = new ArrayList(this.f30846preprohormone);
                this.f30845polloi |= 64;
            }
        }

        public final void dovishness() {
            if ((this.f30845polloi & 8192) != 8192) {
                this.f30851sealless = new ArrayList(this.f30851sealless);
                this.f30845polloi |= 8192;
            }
        }

        public final void gintrap() {
            if ((this.f30845polloi & 1024) != 1024) {
                this.f30855trm = new ArrayList(this.f30855trm);
                this.f30845polloi |= 1024;
            }
        }

        public final void graveside() {
            if ((this.f30845polloi & 256) != 256) {
                this.f30835cuirassed = new ArrayList(this.f30835cuirassed);
                this.f30845polloi |= 256;
            }
        }

        public saneness grimness(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30845polloi & 65536) != 65536 || this.f30848restrictive == ProtoBuf$Type.getDefaultInstance()) {
                this.f30848restrictive = protoBuf$Type;
            } else {
                this.f30848restrictive = ProtoBuf$Type.newBuilder(this.f30848restrictive).beachfront(protoBuf$Type).kowloon();
            }
            this.f30845polloi |= 65536;
            return this;
        }

        public saneness hydrovane(int i) {
            this.f30845polloi |= 4;
            this.f30832adultoid = i;
            return this;
        }

        public ProtoBuf$Class kowloon() {
            ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(this);
            int i = this.f30845polloi;
            int i2 = (i & 1) != 1 ? 0 : 1;
            protoBuf$Class.flags_ = this.f30842molybdenite;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$Class.fqName_ = this.f30838graveside;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$Class.companionObjectName_ = this.f30832adultoid;
            if ((this.f30845polloi & 8) == 8) {
                this.f30836dovishness = Collections.unmodifiableList(this.f30836dovishness);
                this.f30845polloi &= -9;
            }
            protoBuf$Class.typeParameter_ = this.f30836dovishness;
            if ((this.f30845polloi & 16) == 16) {
                this.f30837gintrap = Collections.unmodifiableList(this.f30837gintrap);
                this.f30845polloi &= -17;
            }
            protoBuf$Class.supertype_ = this.f30837gintrap;
            if ((this.f30845polloi & 32) == 32) {
                this.f30849rotuma = Collections.unmodifiableList(this.f30849rotuma);
                this.f30845polloi &= -33;
            }
            protoBuf$Class.supertypeId_ = this.f30849rotuma;
            if ((this.f30845polloi & 64) == 64) {
                this.f30846preprohormone = Collections.unmodifiableList(this.f30846preprohormone);
                this.f30845polloi &= -65;
            }
            protoBuf$Class.nestedClassName_ = this.f30846preprohormone;
            if ((this.f30845polloi & 128) == 128) {
                this.f30833cord = Collections.unmodifiableList(this.f30833cord);
                this.f30845polloi &= -129;
            }
            protoBuf$Class.contextReceiverType_ = this.f30833cord;
            if ((this.f30845polloi & 256) == 256) {
                this.f30835cuirassed = Collections.unmodifiableList(this.f30835cuirassed);
                this.f30845polloi &= -257;
            }
            protoBuf$Class.contextReceiverTypeId_ = this.f30835cuirassed;
            if ((this.f30845polloi & 512) == 512) {
                this.f30853stratoscope = Collections.unmodifiableList(this.f30853stratoscope);
                this.f30845polloi &= -513;
            }
            protoBuf$Class.constructor_ = this.f30853stratoscope;
            if ((this.f30845polloi & 1024) == 1024) {
                this.f30855trm = Collections.unmodifiableList(this.f30855trm);
                this.f30845polloi &= -1025;
            }
            protoBuf$Class.function_ = this.f30855trm;
            if ((this.f30845polloi & 2048) == 2048) {
                this.f30843oilcan = Collections.unmodifiableList(this.f30843oilcan);
                this.f30845polloi &= -2049;
            }
            protoBuf$Class.property_ = this.f30843oilcan;
            if ((this.f30845polloi & 4096) == 4096) {
                this.f30856yemenite = Collections.unmodifiableList(this.f30856yemenite);
                this.f30845polloi &= -4097;
            }
            protoBuf$Class.typeAlias_ = this.f30856yemenite;
            if ((this.f30845polloi & 8192) == 8192) {
                this.f30851sealless = Collections.unmodifiableList(this.f30851sealless);
                this.f30845polloi &= -8193;
            }
            protoBuf$Class.enumEntry_ = this.f30851sealless;
            if ((this.f30845polloi & 16384) == 16384) {
                this.f30840kattegat = Collections.unmodifiableList(this.f30840kattegat);
                this.f30845polloi &= -16385;
            }
            protoBuf$Class.sealedSubclassFqName_ = this.f30840kattegat;
            if ((i & 32768) == 32768) {
                i2 |= 8;
            }
            protoBuf$Class.inlineClassUnderlyingPropertyName_ = this.f30854supplicat;
            if ((i & 65536) == 65536) {
                i2 |= 16;
            }
            protoBuf$Class.inlineClassUnderlyingType_ = this.f30848restrictive;
            if ((i & 131072) == 131072) {
                i2 |= 32;
            }
            protoBuf$Class.inlineClassUnderlyingTypeId_ = this.f30841merc;
            if ((this.f30845polloi & Opcodes.ASM4) == 262144) {
                this.f30844polder = Collections.unmodifiableList(this.f30844polder);
                this.f30845polloi &= -262145;
            }
            protoBuf$Class.multiFieldValueClassUnderlyingName_ = this.f30844polder;
            if ((this.f30845polloi & Opcodes.ASM8) == 524288) {
                this.f30852seminary = Collections.unmodifiableList(this.f30852seminary);
                this.f30845polloi &= -524289;
            }
            protoBuf$Class.multiFieldValueClassUnderlyingType_ = this.f30852seminary;
            if ((this.f30845polloi & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                this.f30839grimness = Collections.unmodifiableList(this.f30839grimness);
                this.f30845polloi &= -1048577;
            }
            protoBuf$Class.multiFieldValueClassUnderlyingTypeId_ = this.f30839grimness;
            if ((i & 2097152) == 2097152) {
                i2 |= 64;
            }
            protoBuf$Class.typeTable_ = this.f30850saran;
            if ((this.f30845polloi & 4194304) == 4194304) {
                this.f30847privatdozent = Collections.unmodifiableList(this.f30847privatdozent);
                this.f30845polloi &= -4194305;
            }
            protoBuf$Class.versionRequirement_ = this.f30847privatdozent;
            if ((i & 8388608) == 8388608) {
                i2 |= 128;
            }
            protoBuf$Class.versionRequirementTable_ = this.f30834creditor;
            protoBuf$Class.bitField0_ = i2;
            return protoBuf$Class;
        }

        public saneness mathsort(int i) {
            this.f30845polloi |= 32768;
            this.f30854supplicat = i;
            return this;
        }

        public final void molybdenite() {
            if ((this.f30845polloi & 512) != 512) {
                this.f30853stratoscope = new ArrayList(this.f30853stratoscope);
                this.f30845polloi |= 512;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public saneness wireman() {
            return polloi().beachfront(kowloon());
        }

        public final void oilcan() {
            if ((this.f30845polloi & 32) != 32) {
                this.f30849rotuma = new ArrayList(this.f30849rotuma);
                this.f30845polloi |= 32;
            }
        }

        public saneness peridotite(int i) {
            this.f30845polloi |= 2;
            this.f30838graveside = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: polder, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$Class protoBuf$Class) {
            if (protoBuf$Class == ProtoBuf$Class.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Class.hasFlags()) {
                walach(protoBuf$Class.getFlags());
            }
            if (protoBuf$Class.hasFqName()) {
                peridotite(protoBuf$Class.getFqName());
            }
            if (protoBuf$Class.hasCompanionObjectName()) {
                hydrovane(protoBuf$Class.getCompanionObjectName());
            }
            if (!protoBuf$Class.typeParameter_.isEmpty()) {
                if (this.f30836dovishness.isEmpty()) {
                    this.f30836dovishness = protoBuf$Class.typeParameter_;
                    this.f30845polloi &= -9;
                } else {
                    supplicat();
                    this.f30836dovishness.addAll(protoBuf$Class.typeParameter_);
                }
            }
            if (!protoBuf$Class.supertype_.isEmpty()) {
                if (this.f30837gintrap.isEmpty()) {
                    this.f30837gintrap = protoBuf$Class.supertype_;
                    this.f30845polloi &= -17;
                } else {
                    yemenite();
                    this.f30837gintrap.addAll(protoBuf$Class.supertype_);
                }
            }
            if (!protoBuf$Class.supertypeId_.isEmpty()) {
                if (this.f30849rotuma.isEmpty()) {
                    this.f30849rotuma = protoBuf$Class.supertypeId_;
                    this.f30845polloi &= -33;
                } else {
                    oilcan();
                    this.f30849rotuma.addAll(protoBuf$Class.supertypeId_);
                }
            }
            if (!protoBuf$Class.nestedClassName_.isEmpty()) {
                if (this.f30846preprohormone.isEmpty()) {
                    this.f30846preprohormone = protoBuf$Class.nestedClassName_;
                    this.f30845polloi &= -65;
                } else {
                    cuirassed();
                    this.f30846preprohormone.addAll(protoBuf$Class.nestedClassName_);
                }
            }
            if (!protoBuf$Class.contextReceiverType_.isEmpty()) {
                if (this.f30833cord.isEmpty()) {
                    this.f30833cord = protoBuf$Class.contextReceiverType_;
                    this.f30845polloi &= -129;
                } else {
                    adultoid();
                    this.f30833cord.addAll(protoBuf$Class.contextReceiverType_);
                }
            }
            if (!protoBuf$Class.contextReceiverTypeId_.isEmpty()) {
                if (this.f30835cuirassed.isEmpty()) {
                    this.f30835cuirassed = protoBuf$Class.contextReceiverTypeId_;
                    this.f30845polloi &= -257;
                } else {
                    graveside();
                    this.f30835cuirassed.addAll(protoBuf$Class.contextReceiverTypeId_);
                }
            }
            if (!protoBuf$Class.constructor_.isEmpty()) {
                if (this.f30853stratoscope.isEmpty()) {
                    this.f30853stratoscope = protoBuf$Class.constructor_;
                    this.f30845polloi &= -513;
                } else {
                    molybdenite();
                    this.f30853stratoscope.addAll(protoBuf$Class.constructor_);
                }
            }
            if (!protoBuf$Class.function_.isEmpty()) {
                if (this.f30855trm.isEmpty()) {
                    this.f30855trm = protoBuf$Class.function_;
                    this.f30845polloi &= -1025;
                } else {
                    gintrap();
                    this.f30855trm.addAll(protoBuf$Class.function_);
                }
            }
            if (!protoBuf$Class.property_.isEmpty()) {
                if (this.f30843oilcan.isEmpty()) {
                    this.f30843oilcan = protoBuf$Class.property_;
                    this.f30845polloi &= -2049;
                } else {
                    stratoscope();
                    this.f30843oilcan.addAll(protoBuf$Class.property_);
                }
            }
            if (!protoBuf$Class.typeAlias_.isEmpty()) {
                if (this.f30856yemenite.isEmpty()) {
                    this.f30856yemenite = protoBuf$Class.typeAlias_;
                    this.f30845polloi &= -4097;
                } else {
                    sealless();
                    this.f30856yemenite.addAll(protoBuf$Class.typeAlias_);
                }
            }
            if (!protoBuf$Class.enumEntry_.isEmpty()) {
                if (this.f30851sealless.isEmpty()) {
                    this.f30851sealless = protoBuf$Class.enumEntry_;
                    this.f30845polloi &= -8193;
                } else {
                    dovishness();
                    this.f30851sealless.addAll(protoBuf$Class.enumEntry_);
                }
            }
            if (!protoBuf$Class.sealedSubclassFqName_.isEmpty()) {
                if (this.f30840kattegat.isEmpty()) {
                    this.f30840kattegat = protoBuf$Class.sealedSubclassFqName_;
                    this.f30845polloi &= -16385;
                } else {
                    trm();
                    this.f30840kattegat.addAll(protoBuf$Class.sealedSubclassFqName_);
                }
            }
            if (protoBuf$Class.hasInlineClassUnderlyingPropertyName()) {
                mathsort(protoBuf$Class.getInlineClassUnderlyingPropertyName());
            }
            if (protoBuf$Class.hasInlineClassUnderlyingType()) {
                grimness(protoBuf$Class.getInlineClassUnderlyingType());
            }
            if (protoBuf$Class.hasInlineClassUnderlyingTypeId()) {
                splinterproof(protoBuf$Class.getInlineClassUnderlyingTypeId());
            }
            if (!protoBuf$Class.multiFieldValueClassUnderlyingName_.isEmpty()) {
                if (this.f30844polder.isEmpty()) {
                    this.f30844polder = protoBuf$Class.multiFieldValueClassUnderlyingName_;
                    this.f30845polloi &= -262145;
                } else {
                    rotuma();
                    this.f30844polder.addAll(protoBuf$Class.multiFieldValueClassUnderlyingName_);
                }
            }
            if (!protoBuf$Class.multiFieldValueClassUnderlyingType_.isEmpty()) {
                if (this.f30852seminary.isEmpty()) {
                    this.f30852seminary = protoBuf$Class.multiFieldValueClassUnderlyingType_;
                    this.f30845polloi &= -524289;
                } else {
                    cord();
                    this.f30852seminary.addAll(protoBuf$Class.multiFieldValueClassUnderlyingType_);
                }
            }
            if (!protoBuf$Class.multiFieldValueClassUnderlyingTypeId_.isEmpty()) {
                if (this.f30839grimness.isEmpty()) {
                    this.f30839grimness = protoBuf$Class.multiFieldValueClassUnderlyingTypeId_;
                    this.f30845polloi &= -1048577;
                } else {
                    preprohormone();
                    this.f30839grimness.addAll(protoBuf$Class.multiFieldValueClassUnderlyingTypeId_);
                }
            }
            if (protoBuf$Class.hasTypeTable()) {
                saran(protoBuf$Class.getTypeTable());
            }
            if (!protoBuf$Class.versionRequirement_.isEmpty()) {
                if (this.f30847privatdozent.isEmpty()) {
                    this.f30847privatdozent = protoBuf$Class.versionRequirement_;
                    this.f30845polloi &= -4194305;
                } else {
                    restrictive();
                    this.f30847privatdozent.addAll(protoBuf$Class.versionRequirement_);
                }
            }
            if (protoBuf$Class.hasVersionRequirementTable()) {
                starveling(protoBuf$Class.getVersionRequirementTable());
            }
            formularize(protoBuf$Class);
            competently(marial().dern(protoBuf$Class.unknownFields));
            return this;
        }

        public final void preprohormone() {
            if ((this.f30845polloi & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576) {
                this.f30839grimness = new ArrayList(this.f30839grimness);
                this.f30845polloi |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            }
        }

        public final void restrictive() {
            if ((this.f30845polloi & 4194304) != 4194304) {
                this.f30847privatdozent = new ArrayList(this.f30847privatdozent);
                this.f30845polloi |= 4194304;
            }
        }

        public final void rotuma() {
            if ((this.f30845polloi & Opcodes.ASM4) != 262144) {
                this.f30844polder = new ArrayList(this.f30844polder);
                this.f30845polloi |= Opcodes.ASM4;
            }
        }

        public saneness saran(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if ((this.f30845polloi & 2097152) != 2097152 || this.f30850saran == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f30850saran = protoBuf$TypeTable;
            } else {
                this.f30850saran = ProtoBuf$TypeTable.newBuilder(this.f30850saran).beachfront(protoBuf$TypeTable).apical();
            }
            this.f30845polloi |= 2097152;
            return this;
        }

        public final void sealless() {
            if ((this.f30845polloi & 4096) != 4096) {
                this.f30856yemenite = new ArrayList(this.f30856yemenite);
                this.f30845polloi |= 4096;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: seminary, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$Class protoBuf$Class = null;
            try {
                try {
                    ProtoBuf$Class protoBuf$ClassDern = ProtoBuf$Class.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$ClassDern != null) {
                        beachfront(protoBuf$ClassDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$Class != null) {
                        beachfront(protoBuf$Class);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Class protoBuf$Class2 = (ProtoBuf$Class) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Class = protoBuf$Class2;
                    if (protoBuf$Class != null) {
                        beachfront(protoBuf$Class);
                    }
                    throw th;
                }
            }
        }

        public saneness splinterproof(int i) {
            this.f30845polloi |= 131072;
            this.f30841merc = i;
            return this;
        }

        public saneness starveling(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if ((this.f30845polloi & 8388608) != 8388608 || this.f30834creditor == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
                this.f30834creditor = protoBuf$VersionRequirementTable;
            } else {
                this.f30834creditor = ProtoBuf$VersionRequirementTable.newBuilder(this.f30834creditor).beachfront(protoBuf$VersionRequirementTable).apical();
            }
            this.f30845polloi |= 8388608;
            return this;
        }

        public final void stratoscope() {
            if ((this.f30845polloi & 2048) != 2048) {
                this.f30843oilcan = new ArrayList(this.f30843oilcan);
                this.f30845polloi |= 2048;
            }
        }

        public final void supplicat() {
            if ((this.f30845polloi & 8) != 8) {
                this.f30836dovishness = new ArrayList(this.f30836dovishness);
                this.f30845polloi |= 8;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Class build() {
            ProtoBuf$Class protoBuf$ClassKowloon = kowloon();
            if (protoBuf$ClassKowloon.isInitialized()) {
                return protoBuf$ClassKowloon;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$ClassKowloon);
        }

        public final void trm() {
            if ((this.f30845polloi & 16384) != 16384) {
                this.f30840kattegat = new ArrayList(this.f30840kattegat);
                this.f30845polloi |= 16384;
            }
        }

        public saneness walach(int i) {
            this.f30845polloi |= 1;
            this.f30842molybdenite = i;
            return this;
        }

        public final void yemenite() {
            if ((this.f30845polloi & 16) != 16) {
                this.f30837gintrap = new ArrayList(this.f30837gintrap);
                this.f30845polloi |= 16;
            }
        }

        private void merc() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBuf$Class(marial marialVar, beachfront beachfrontVar) throws Throwable {
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        dern();
        wireman.saneness sanenessVarArytenoidectomy = wireman.arytenoidectomy();
        boolean z = true;
        CodedOutputStream codedOutputStreamMerc = CodedOutputStream.merc(sanenessVarArytenoidectomy, 1);
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = z;
            if (!z2) {
                try {
                    try {
                        int iPolder = marialVar.polder();
                        switch (iPolder) {
                            case 0:
                                z2 = z3;
                                z = z3;
                                break;
                            case 8:
                                this.bitField0_ |= 1;
                                this.flags_ = marialVar.molybdenite();
                                z = z3;
                                break;
                            case 16:
                                if ((i & 32) != 32) {
                                    this.supertypeId_ = new ArrayList();
                                    i |= 32;
                                }
                                this.supertypeId_.add(Integer.valueOf(marialVar.molybdenite()));
                                z = z3;
                                break;
                            case 18:
                                int iCutely = marialVar.cutely(marialVar.cuirassed());
                                if ((i & 32) != 32 && marialVar.marial() > 0) {
                                    this.supertypeId_ = new ArrayList();
                                    i |= 32;
                                }
                                while (marialVar.marial() > 0) {
                                    this.supertypeId_.add(Integer.valueOf(marialVar.molybdenite()));
                                }
                                marialVar.taiyuan(iCutely);
                                z = z3;
                                break;
                            case 24:
                                this.bitField0_ |= 2;
                                this.fqName_ = marialVar.molybdenite();
                                z = z3;
                                break;
                            case 32:
                                this.bitField0_ |= 4;
                                this.companionObjectName_ = marialVar.molybdenite();
                                z = z3;
                                break;
                            case 42:
                                if ((i & 8) != 8) {
                                    this.typeParameter_ = new ArrayList();
                                    i |= 8;
                                }
                                this.typeParameter_.add((ProtoBuf$TypeParameter) marialVar.adultoid(ProtoBuf$TypeParameter.PARSER, beachfrontVar));
                                z = z3;
                                break;
                            case 50:
                                if ((i & 16) != 16) {
                                    this.supertype_ = new ArrayList();
                                    i |= 16;
                                }
                                this.supertype_.add((ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar));
                                z = z3;
                                break;
                            case 56:
                                if ((i & 64) != 64) {
                                    this.nestedClassName_ = new ArrayList();
                                    i |= 64;
                                }
                                this.nestedClassName_.add(Integer.valueOf(marialVar.molybdenite()));
                                z = z3;
                                break;
                            case 58:
                                int iCutely2 = marialVar.cutely(marialVar.cuirassed());
                                if ((i & 64) != 64 && marialVar.marial() > 0) {
                                    this.nestedClassName_ = new ArrayList();
                                    i |= 64;
                                }
                                while (marialVar.marial() > 0) {
                                    this.nestedClassName_.add(Integer.valueOf(marialVar.molybdenite()));
                                }
                                marialVar.taiyuan(iCutely2);
                                z = z3;
                                break;
                            case 66:
                                if ((i & 512) != 512) {
                                    this.constructor_ = new ArrayList();
                                    i |= 512;
                                }
                                this.constructor_.add((ProtoBuf$Constructor) marialVar.adultoid(ProtoBuf$Constructor.PARSER, beachfrontVar));
                                z = z3;
                                break;
                            case 74:
                                if ((i & 1024) != 1024) {
                                    this.function_ = new ArrayList();
                                    i |= 1024;
                                }
                                this.function_.add((ProtoBuf$Function) marialVar.adultoid(ProtoBuf$Function.PARSER, beachfrontVar));
                                z = z3;
                                break;
                            case 82:
                                if ((i & 2048) != 2048) {
                                    this.property_ = new ArrayList();
                                    i |= 2048;
                                }
                                this.property_.add((ProtoBuf$Property) marialVar.adultoid(ProtoBuf$Property.PARSER, beachfrontVar));
                                z = z3;
                                break;
                            case 90:
                                if ((i & 4096) != 4096) {
                                    this.typeAlias_ = new ArrayList();
                                    i |= 4096;
                                }
                                this.typeAlias_.add((ProtoBuf$TypeAlias) marialVar.adultoid(ProtoBuf$TypeAlias.PARSER, beachfrontVar));
                                z = z3;
                                break;
                            case 106:
                                if ((i & 8192) != 8192) {
                                    this.enumEntry_ = new ArrayList();
                                    i |= 8192;
                                }
                                this.enumEntry_.add((ProtoBuf$EnumEntry) marialVar.adultoid(ProtoBuf$EnumEntry.PARSER, beachfrontVar));
                                z = z3;
                                break;
                            case 128:
                                if ((i & 16384) != 16384) {
                                    this.sealedSubclassFqName_ = new ArrayList();
                                    i |= 16384;
                                }
                                this.sealedSubclassFqName_.add(Integer.valueOf(marialVar.molybdenite()));
                                z = z3;
                                break;
                            case 130:
                                int iCutely3 = marialVar.cutely(marialVar.cuirassed());
                                if ((i & 16384) != 16384 && marialVar.marial() > 0) {
                                    this.sealedSubclassFqName_ = new ArrayList();
                                    i |= 16384;
                                }
                                while (marialVar.marial() > 0) {
                                    this.sealedSubclassFqName_.add(Integer.valueOf(marialVar.molybdenite()));
                                }
                                marialVar.taiyuan(iCutely3);
                                z = z3;
                                break;
                            case 136:
                                this.bitField0_ |= 8;
                                this.inlineClassUnderlyingPropertyName_ = marialVar.molybdenite();
                                z = z3;
                                break;
                            case Opcodes.I2C /* 146 */:
                                ProtoBuf$Type.saneness builder = (this.bitField0_ & 16) == 16 ? this.inlineClassUnderlyingType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar);
                                this.inlineClassUnderlyingType_ = protoBuf$Type;
                                if (builder != 0) {
                                    builder.beachfront(protoBuf$Type);
                                    this.inlineClassUnderlyingType_ = builder.kowloon();
                                }
                                this.bitField0_ |= 16;
                                z = z3;
                                break;
                            case Opcodes.DCMPG /* 152 */:
                                this.bitField0_ |= 32;
                                this.inlineClassUnderlyingTypeId_ = marialVar.molybdenite();
                                z = z3;
                                break;
                            case Opcodes.IF_ICMPGE /* 162 */:
                                if ((i & 128) != 128) {
                                    this.contextReceiverType_ = new ArrayList();
                                    i |= 128;
                                }
                                this.contextReceiverType_.add((ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar));
                                z = z3;
                                break;
                            case Opcodes.JSR /* 168 */:
                                if ((i & 256) != 256) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    i |= 256;
                                }
                                this.contextReceiverTypeId_.add(Integer.valueOf(marialVar.molybdenite()));
                                z = z3;
                                break;
                            case Opcodes.TABLESWITCH /* 170 */:
                                int iCutely4 = marialVar.cutely(marialVar.cuirassed());
                                if ((i & 256) != 256 && marialVar.marial() > 0) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    i |= 256;
                                }
                                while (marialVar.marial() > 0) {
                                    this.contextReceiverTypeId_.add(Integer.valueOf(marialVar.molybdenite()));
                                }
                                marialVar.taiyuan(iCutely4);
                                z = z3;
                                break;
                            case Opcodes.ARETURN /* 176 */:
                                if ((i & Opcodes.ASM4) != 262144) {
                                    this.multiFieldValueClassUnderlyingName_ = new ArrayList();
                                    i |= Opcodes.ASM4;
                                }
                                this.multiFieldValueClassUnderlyingName_.add(Integer.valueOf(marialVar.molybdenite()));
                                z = z3;
                                break;
                            case Opcodes.GETSTATIC /* 178 */:
                                int iCutely5 = marialVar.cutely(marialVar.cuirassed());
                                if ((i & Opcodes.ASM4) != 262144 && marialVar.marial() > 0) {
                                    this.multiFieldValueClassUnderlyingName_ = new ArrayList();
                                    i |= Opcodes.ASM4;
                                }
                                while (marialVar.marial() > 0) {
                                    this.multiFieldValueClassUnderlyingName_.add(Integer.valueOf(marialVar.molybdenite()));
                                }
                                marialVar.taiyuan(iCutely5);
                                z = z3;
                                break;
                            case Opcodes.INVOKEDYNAMIC /* 186 */:
                                if ((i & Opcodes.ASM8) != 524288) {
                                    this.multiFieldValueClassUnderlyingType_ = new ArrayList();
                                    i |= Opcodes.ASM8;
                                }
                                this.multiFieldValueClassUnderlyingType_.add((ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar));
                                z = z3;
                                break;
                            case 192:
                                if ((i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576) {
                                    this.multiFieldValueClassUnderlyingTypeId_ = new ArrayList();
                                    i |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                }
                                this.multiFieldValueClassUnderlyingTypeId_.add(Integer.valueOf(marialVar.molybdenite()));
                                z = z3;
                                break;
                            case Opcodes.MONITORENTER /* 194 */:
                                int iCutely6 = marialVar.cutely(marialVar.cuirassed());
                                if ((i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576 && marialVar.marial() > 0) {
                                    this.multiFieldValueClassUnderlyingTypeId_ = new ArrayList();
                                    i |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                }
                                while (marialVar.marial() > 0) {
                                    this.multiFieldValueClassUnderlyingTypeId_.add(Integer.valueOf(marialVar.molybdenite()));
                                }
                                marialVar.taiyuan(iCutely6);
                                z = z3;
                                break;
                            case 242:
                                ProtoBuf$TypeTable.saneness builder2 = (this.bitField0_ & 64) == 64 ? this.typeTable_.toBuilder() : null;
                                ProtoBuf$TypeTable protoBuf$TypeTable = (ProtoBuf$TypeTable) marialVar.adultoid(ProtoBuf$TypeTable.PARSER, beachfrontVar);
                                this.typeTable_ = protoBuf$TypeTable;
                                if (builder2 != 0) {
                                    builder2.beachfront(protoBuf$TypeTable);
                                    this.typeTable_ = builder2.apical();
                                }
                                this.bitField0_ |= 64;
                                z = z3;
                                break;
                            case 248:
                                if ((i & 4194304) != 4194304) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4194304;
                                }
                                this.versionRequirement_.add(Integer.valueOf(marialVar.molybdenite()));
                                z = z3;
                                break;
                            case AdSize.MEDIUM_RECTANGLE_HEIGHT /* 250 */:
                                int iCutely7 = marialVar.cutely(marialVar.cuirassed());
                                if ((i & 4194304) != 4194304 && marialVar.marial() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4194304;
                                }
                                while (marialVar.marial() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(marialVar.molybdenite()));
                                }
                                marialVar.taiyuan(iCutely7);
                                z = z3;
                                break;
                            case 258:
                                try {
                                    ProtoBuf$VersionRequirementTable.saneness builder3 = (this.bitField0_ & 128) == 128 ? this.versionRequirementTable_.toBuilder() : null;
                                    ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) marialVar.adultoid(ProtoBuf$VersionRequirementTable.PARSER, beachfrontVar);
                                    this.versionRequirementTable_ = protoBuf$VersionRequirementTable;
                                    if (builder3 != 0) {
                                        builder3.beachfront(protoBuf$VersionRequirementTable);
                                        this.versionRequirementTable_ = builder3.apical();
                                    }
                                    this.bitField0_ |= 128;
                                    z = z3;
                                } catch (InvalidProtocolBufferException e) {
                                    e = e;
                                    throw e.setUnfinishedMessage(this);
                                } catch (IOException e2) {
                                    e = e2;
                                    throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                } catch (Throwable th) {
                                    th = th;
                                    if ((i & 32) == 32) {
                                        this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                                    }
                                    if ((i & 8) == 8) {
                                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                    }
                                    if ((i & 16) == 16) {
                                        this.supertype_ = Collections.unmodifiableList(this.supertype_);
                                    }
                                    if ((i & 64) == 64) {
                                        this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                                    }
                                    if ((i & 512) == 512) {
                                        this.constructor_ = Collections.unmodifiableList(this.constructor_);
                                    }
                                    if ((i & 1024) == 1024) {
                                        this.function_ = Collections.unmodifiableList(this.function_);
                                    }
                                    if ((i & 2048) == 2048) {
                                        this.property_ = Collections.unmodifiableList(this.property_);
                                    }
                                    if ((i & 4096) == 4096) {
                                        this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                                    }
                                    if ((i & 8192) == 8192) {
                                        this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                                    }
                                    if ((i & 16384) == 16384) {
                                        this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                                    }
                                    if ((i & 128) == 128) {
                                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                    }
                                    if ((i & 256) == 256) {
                                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                    }
                                    if ((i & Opcodes.ASM4) == 262144) {
                                        this.multiFieldValueClassUnderlyingName_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingName_);
                                    }
                                    if ((i & Opcodes.ASM8) == 524288) {
                                        this.multiFieldValueClassUnderlyingType_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingType_);
                                    }
                                    if ((i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                                        this.multiFieldValueClassUnderlyingTypeId_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingTypeId_);
                                    }
                                    if ((i & 4194304) == 4194304) {
                                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                    }
                                    try {
                                        codedOutputStreamMerc.restrictive();
                                        break;
                                    } catch (IOException unused) {
                                    } finally {
                                        this.unknownFields = sanenessVarArytenoidectomy.cutely();
                                    }
                                    makeExtensionsImmutable();
                                    throw th;
                                }
                                break;
                            default:
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                    z2 = z3;
                                }
                                z = z3;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        e = e3;
                    } catch (IOException e4) {
                        e = e4;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if ((i & 32) == 32) {
                    this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                }
                if ((i & 8) == 8) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i & 16) == 16) {
                    this.supertype_ = Collections.unmodifiableList(this.supertype_);
                }
                if ((i & 64) == 64) {
                    this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                }
                if ((i & 512) == 512) {
                    this.constructor_ = Collections.unmodifiableList(this.constructor_);
                }
                if ((i & 1024) == 1024) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                }
                if ((i & 2048) == 2048) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                }
                if ((i & 4096) == 4096) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                }
                if ((i & 8192) == 8192) {
                    this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                }
                if ((i & 16384) == 16384) {
                    this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                }
                if ((i & 128) == 128) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if ((i & 256) == 256) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if ((i & Opcodes.ASM4) == 262144) {
                    this.multiFieldValueClassUnderlyingName_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingName_);
                }
                if ((i & Opcodes.ASM8) == 524288) {
                    this.multiFieldValueClassUnderlyingType_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingType_);
                }
                if ((i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                    this.multiFieldValueClassUnderlyingTypeId_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingTypeId_);
                }
                if ((i & 4194304) == 4194304) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                try {
                    codedOutputStreamMerc.restrictive();
                } catch (IOException unused2) {
                } finally {
                    this.unknownFields = sanenessVarArytenoidectomy.cutely();
                }
                makeExtensionsImmutable();
                return;
            }
        }
    }
}
