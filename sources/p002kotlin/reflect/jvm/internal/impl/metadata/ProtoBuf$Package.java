package p002kotlin.reflect.jvm.internal.impl.metadata;

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
public final class ProtoBuf$Package extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Package> implements kowloon {
    public static arytenoidectomy<ProtoBuf$Package> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$Package f30909kowloon;
    private int bitField0_;
    private List<ProtoBuf$Function> function_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ProtoBuf$Property> property_;
    private List<ProtoBuf$TypeAlias> typeAlias_;
    private ProtoBuf$TypeTable typeTable_;
    private final wireman unknownFields;
    private ProtoBuf$VersionRequirementTable versionRequirementTable_;

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$Package> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Package dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Package(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(true);
        f30909kowloon = protoBuf$Package;
        protoBuf$Package.dern();
    }

    private void dern() {
        List list = Collections.EMPTY_LIST;
        this.function_ = list;
        this.property_ = list;
        this.typeAlias_ = list;
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirementTable_ = ProtoBuf$VersionRequirementTable.getDefaultInstance();
    }

    public static ProtoBuf$Package getDefaultInstance() {
        return f30909kowloon;
    }

    public static saneness newBuilder() {
        return saneness.polloi();
    }

    public static ProtoBuf$Package parseFrom(InputStream inputStream, beachfront beachfrontVar) throws IOException {
        return PARSER.attabal(inputStream, beachfrontVar);
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

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$Package> getParserForType() {
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iMolybdenite = 0;
        for (int i2 = 0; i2 < this.function_.size(); i2++) {
            iMolybdenite += CodedOutputStream.molybdenite(3, this.function_.get(i2));
        }
        for (int i3 = 0; i3 < this.property_.size(); i3++) {
            iMolybdenite += CodedOutputStream.molybdenite(4, this.property_.get(i3));
        }
        for (int i4 = 0; i4 < this.typeAlias_.size(); i4++) {
            iMolybdenite += CodedOutputStream.molybdenite(5, this.typeAlias_.get(i4));
        }
        if ((this.bitField0_ & 1) == 1) {
            iMolybdenite += CodedOutputStream.molybdenite(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            iMolybdenite += CodedOutputStream.molybdenite(32, this.versionRequirementTable_);
        }
        int iExtensionsSerializedSize = iMolybdenite + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
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

    public ProtoBuf$TypeTable getTypeTable() {
        return this.typeTable_;
    }

    public ProtoBuf$VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable_;
    }

    public boolean hasTypeTable() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasVersionRequirementTable() {
        return (this.bitField0_ & 2) == 2;
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
        for (int i = 0; i < getFunctionCount(); i++) {
            if (!getFunction(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getPropertyCount(); i2++) {
            if (!getProperty(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
            if (!getTypeAlias(i3).isInitialized()) {
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
        for (int i = 0; i < this.function_.size(); i++) {
            codedOutputStream.milliradian(3, this.function_.get(i));
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            codedOutputStream.milliradian(4, this.property_.get(i2));
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            codedOutputStream.milliradian(5, this.typeAlias_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.milliradian(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.milliradian(32, this.versionRequirementTable_);
        }
        attabalVarNewExtensionWriter.attabal(200, codedOutputStream);
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$Package protoBuf$Package) {
        return newBuilder().beachfront(protoBuf$Package);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Package getDefaultInstanceForType() {
        return f30909kowloon;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Package(GeneratedMessageLite.dern<ProtoBuf$Package, ?> dernVar) {
        super(dernVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = dernVar.marial();
    }

    public ProtoBuf$Package(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$Package(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                    if (iPolder != 0) {
                        if (iPolder == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.function_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.function_.add((ProtoBuf$Function) marialVar.adultoid(ProtoBuf$Function.PARSER, beachfrontVar));
                        } else if (iPolder == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.property_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.property_.add((ProtoBuf$Property) marialVar.adultoid(ProtoBuf$Property.PARSER, beachfrontVar));
                        } else if (iPolder != 42) {
                            if (iPolder == 242) {
                                ProtoBuf$TypeTable.saneness builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                ProtoBuf$TypeTable protoBuf$TypeTable = (ProtoBuf$TypeTable) marialVar.adultoid(ProtoBuf$TypeTable.PARSER, beachfrontVar);
                                this.typeTable_ = protoBuf$TypeTable;
                                if (builder != null) {
                                    builder.beachfront(protoBuf$TypeTable);
                                    this.typeTable_ = builder.apical();
                                }
                                this.bitField0_ |= 1;
                            } else if (iPolder != 258) {
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                }
                            } else {
                                ProtoBuf$VersionRequirementTable.saneness builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) marialVar.adultoid(ProtoBuf$VersionRequirementTable.PARSER, beachfrontVar);
                                this.versionRequirementTable_ = protoBuf$VersionRequirementTable;
                                if (builder2 != null) {
                                    builder2.beachfront(protoBuf$VersionRequirementTable);
                                    this.versionRequirementTable_ = builder2.apical();
                                }
                                this.bitField0_ |= 2;
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.typeAlias_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.typeAlias_.add((ProtoBuf$TypeAlias) marialVar.adultoid(ProtoBuf$TypeAlias.PARSER, beachfrontVar));
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((i == true ? 1 : 0) & 1) == 1) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                }
                if (((i == true ? 1 : 0) & 2) == 2) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                }
                if (((i == true ? 1 : 0) & 4) == 4) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
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
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.function_ = Collections.unmodifiableList(this.function_);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.property_ = Collections.unmodifiableList(this.property_);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.dern<ProtoBuf$Package, saneness> implements kowloon {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public List<ProtoBuf$TypeAlias> f30910adultoid;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public ProtoBuf$TypeTable f30911dovishness;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public ProtoBuf$VersionRequirementTable f30912gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public List<ProtoBuf$Property> f30913graveside;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public List<ProtoBuf$Function> f30914molybdenite;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f30915polloi;

        public saneness() {
            List list = Collections.EMPTY_LIST;
            this.f30914molybdenite = list;
            this.f30913graveside = list;
            this.f30910adultoid = list;
            this.f30911dovishness = ProtoBuf$TypeTable.getDefaultInstance();
            this.f30912gintrap = ProtoBuf$VersionRequirementTable.getDefaultInstance();
            dovishness();
        }

        private void adultoid() {
            if ((this.f30915polloi & 4) != 4) {
                this.f30910adultoid = new ArrayList(this.f30910adultoid);
                this.f30915polloi |= 4;
            }
        }

        private void graveside() {
            if ((this.f30915polloi & 2) != 2) {
                this.f30913graveside = new ArrayList(this.f30913graveside);
                this.f30915polloi |= 2;
            }
        }

        private void molybdenite() {
            if ((this.f30915polloi & 1) != 1) {
                this.f30914molybdenite = new ArrayList(this.f30914molybdenite);
                this.f30915polloi |= 1;
            }
        }

        public static saneness polloi() {
            return new saneness();
        }

        public saneness cord(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if ((this.f30915polloi & 16) != 16 || this.f30912gintrap == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
                this.f30912gintrap = protoBuf$VersionRequirementTable;
            } else {
                this.f30912gintrap = ProtoBuf$VersionRequirementTable.newBuilder(this.f30912gintrap).beachfront(protoBuf$VersionRequirementTable).apical();
            }
            this.f30915polloi |= 16;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$Package protoBuf$Package) {
            if (protoBuf$Package == ProtoBuf$Package.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$Package.function_.isEmpty()) {
                if (this.f30914molybdenite.isEmpty()) {
                    this.f30914molybdenite = protoBuf$Package.function_;
                    this.f30915polloi &= -2;
                } else {
                    molybdenite();
                    this.f30914molybdenite.addAll(protoBuf$Package.function_);
                }
            }
            if (!protoBuf$Package.property_.isEmpty()) {
                if (this.f30913graveside.isEmpty()) {
                    this.f30913graveside = protoBuf$Package.property_;
                    this.f30915polloi &= -3;
                } else {
                    graveside();
                    this.f30913graveside.addAll(protoBuf$Package.property_);
                }
            }
            if (!protoBuf$Package.typeAlias_.isEmpty()) {
                if (this.f30910adultoid.isEmpty()) {
                    this.f30910adultoid = protoBuf$Package.typeAlias_;
                    this.f30915polloi &= -5;
                } else {
                    adultoid();
                    this.f30910adultoid.addAll(protoBuf$Package.typeAlias_);
                }
            }
            if (protoBuf$Package.hasTypeTable()) {
                preprohormone(protoBuf$Package.getTypeTable());
            }
            if (protoBuf$Package.hasVersionRequirementTable()) {
                cord(protoBuf$Package.getVersionRequirementTable());
            }
            formularize(protoBuf$Package);
            competently(marial().dern(protoBuf$Package.unknownFields));
            return this;
        }

        public ProtoBuf$Package kowloon() {
            ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(this);
            int i = this.f30915polloi;
            if ((i & 1) == 1) {
                this.f30914molybdenite = Collections.unmodifiableList(this.f30914molybdenite);
                this.f30915polloi &= -2;
            }
            protoBuf$Package.function_ = this.f30914molybdenite;
            if ((this.f30915polloi & 2) == 2) {
                this.f30913graveside = Collections.unmodifiableList(this.f30913graveside);
                this.f30915polloi &= -3;
            }
            protoBuf$Package.property_ = this.f30913graveside;
            if ((this.f30915polloi & 4) == 4) {
                this.f30910adultoid = Collections.unmodifiableList(this.f30910adultoid);
                this.f30915polloi &= -5;
            }
            protoBuf$Package.typeAlias_ = this.f30910adultoid;
            int i2 = (i & 8) != 8 ? 0 : 1;
            protoBuf$Package.typeTable_ = this.f30911dovishness;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            protoBuf$Package.versionRequirementTable_ = this.f30912gintrap;
            protoBuf$Package.bitField0_ = i2;
            return protoBuf$Package;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return polloi().beachfront(kowloon());
        }

        public saneness preprohormone(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if ((this.f30915polloi & 8) != 8 || this.f30911dovishness == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f30911dovishness = protoBuf$TypeTable;
            } else {
                this.f30911dovishness = ProtoBuf$TypeTable.newBuilder(this.f30911dovishness).beachfront(protoBuf$TypeTable).apical();
            }
            this.f30915polloi |= 8;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$Package protoBuf$Package = null;
            try {
                try {
                    ProtoBuf$Package protoBuf$PackageDern = ProtoBuf$Package.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$PackageDern != null) {
                        beachfront(protoBuf$PackageDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$Package != null) {
                        beachfront(protoBuf$Package);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Package protoBuf$Package2 = (ProtoBuf$Package) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Package = protoBuf$Package2;
                    if (protoBuf$Package != null) {
                        beachfront(protoBuf$Package);
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Package build() {
            ProtoBuf$Package protoBuf$PackageKowloon = kowloon();
            if (protoBuf$PackageKowloon.isInitialized()) {
                return protoBuf$PackageKowloon;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$PackageKowloon);
        }

        private void dovishness() {
        }
    }
}
