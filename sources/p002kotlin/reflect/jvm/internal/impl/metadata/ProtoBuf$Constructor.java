package p002kotlin.reflect.jvm.internal.impl.metadata;

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
public final class ProtoBuf$Constructor extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Constructor> implements kowloon {
    public static arytenoidectomy<ProtoBuf$Constructor> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$Constructor f30857kowloon;
    private int bitField0_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final wireman unknownFields;
    private List<ProtoBuf$ValueParameter> valueParameter_;
    private List<Integer> versionRequirement_;

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$Constructor> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Constructor dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Constructor(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(true);
        f30857kowloon = protoBuf$Constructor;
        protoBuf$Constructor.dern();
    }

    private void dern() {
        this.flags_ = 6;
        List list = Collections.EMPTY_LIST;
        this.valueParameter_ = list;
        this.versionRequirement_ = list;
    }

    public static ProtoBuf$Constructor getDefaultInstance() {
        return f30857kowloon;
    }

    public static saneness newBuilder() {
        return saneness.polloi();
    }

    public int getFlags() {
        return this.flags_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$Constructor> getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            iKowloon += CodedOutputStream.molybdenite(2, this.valueParameter_.get(i2));
        }
        int iArytenoidectomy = 0;
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            iArytenoidectomy += CodedOutputStream.arytenoidectomy(this.versionRequirement_.get(i3).intValue());
        }
        int size = iKowloon + iArytenoidectomy + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
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

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
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
        for (int i = 0; i < getValueParameterCount(); i++) {
            if (!getValueParameter(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
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
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            codedOutputStream.milliradian(2, this.valueParameter_.get(i));
        }
        for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
            codedOutputStream.cultivated(31, this.versionRequirement_.get(i2).intValue());
        }
        attabalVarNewExtensionWriter.attabal(19000, codedOutputStream);
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$Constructor protoBuf$Constructor) {
        return newBuilder().beachfront(protoBuf$Constructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Constructor getDefaultInstanceForType() {
        return f30857kowloon;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Constructor(GeneratedMessageLite.dern<ProtoBuf$Constructor, ?> dernVar) {
        super(dernVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = dernVar.marial();
    }

    public ProtoBuf$Constructor(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$Constructor(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                    try {
                        int iPolder = marialVar.polder();
                        if (iPolder != 0) {
                            if (iPolder == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = marialVar.molybdenite();
                            } else if (iPolder == 18) {
                                if ((i & 2) != 2) {
                                    this.valueParameter_ = new ArrayList();
                                    i |= 2;
                                }
                                this.valueParameter_.add((ProtoBuf$ValueParameter) marialVar.adultoid(ProtoBuf$ValueParameter.PARSER, beachfrontVar));
                            } else if (iPolder == 248) {
                                if ((i & 4) != 4) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                this.versionRequirement_.add(Integer.valueOf(marialVar.molybdenite()));
                            } else if (iPolder != 250) {
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                }
                            } else {
                                int iCutely = marialVar.cutely(marialVar.cuirassed());
                                if ((i & 4) != 4 && marialVar.marial() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                while (marialVar.marial() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(marialVar.molybdenite()));
                                }
                                marialVar.taiyuan(iCutely);
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((i & 2) == 2) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if ((i & 4) == 4) {
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
        if ((i & 2) == 2) {
            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
        }
        if ((i & 4) == 4) {
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

    public static final class saneness extends GeneratedMessageLite.dern<ProtoBuf$Constructor, saneness> implements kowloon {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public List<Integer> f30858adultoid;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public List<ProtoBuf$ValueParameter> f30859graveside;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f30860molybdenite = 6;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f30861polloi;

        public saneness() {
            List list = Collections.EMPTY_LIST;
            this.f30859graveside = list;
            this.f30858adultoid = list;
            adultoid();
        }

        private void graveside() {
            if ((this.f30861polloi & 4) != 4) {
                this.f30858adultoid = new ArrayList(this.f30858adultoid);
                this.f30861polloi |= 4;
            }
        }

        public static saneness polloi() {
            return new saneness();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$Constructor protoBuf$Constructor) {
            if (protoBuf$Constructor == ProtoBuf$Constructor.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Constructor.hasFlags()) {
                rotuma(protoBuf$Constructor.getFlags());
            }
            if (!protoBuf$Constructor.valueParameter_.isEmpty()) {
                if (this.f30859graveside.isEmpty()) {
                    this.f30859graveside = protoBuf$Constructor.valueParameter_;
                    this.f30861polloi &= -3;
                } else {
                    molybdenite();
                    this.f30859graveside.addAll(protoBuf$Constructor.valueParameter_);
                }
            }
            if (!protoBuf$Constructor.versionRequirement_.isEmpty()) {
                if (this.f30858adultoid.isEmpty()) {
                    this.f30858adultoid = protoBuf$Constructor.versionRequirement_;
                    this.f30861polloi &= -5;
                } else {
                    graveside();
                    this.f30858adultoid.addAll(protoBuf$Constructor.versionRequirement_);
                }
            }
            formularize(protoBuf$Constructor);
            competently(marial().dern(protoBuf$Constructor.unknownFields));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$Constructor protoBuf$Constructor = null;
            try {
                try {
                    ProtoBuf$Constructor protoBuf$ConstructorDern = ProtoBuf$Constructor.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$ConstructorDern != null) {
                        beachfront(protoBuf$ConstructorDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$Constructor != null) {
                        beachfront(protoBuf$Constructor);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Constructor protoBuf$Constructor2 = (ProtoBuf$Constructor) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Constructor = protoBuf$Constructor2;
                    if (protoBuf$Constructor != null) {
                        beachfront(protoBuf$Constructor);
                    }
                    throw th;
                }
            }
        }

        public ProtoBuf$Constructor kowloon() {
            ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(this);
            int i = (this.f30861polloi & 1) != 1 ? 0 : 1;
            protoBuf$Constructor.flags_ = this.f30860molybdenite;
            if ((this.f30861polloi & 2) == 2) {
                this.f30859graveside = Collections.unmodifiableList(this.f30859graveside);
                this.f30861polloi &= -3;
            }
            protoBuf$Constructor.valueParameter_ = this.f30859graveside;
            if ((this.f30861polloi & 4) == 4) {
                this.f30858adultoid = Collections.unmodifiableList(this.f30858adultoid);
                this.f30861polloi &= -5;
            }
            protoBuf$Constructor.versionRequirement_ = this.f30858adultoid;
            protoBuf$Constructor.bitField0_ = i;
            return protoBuf$Constructor;
        }

        public final void molybdenite() {
            if ((this.f30861polloi & 2) != 2) {
                this.f30859graveside = new ArrayList(this.f30859graveside);
                this.f30861polloi |= 2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return polloi().beachfront(kowloon());
        }

        public saneness rotuma(int i) {
            this.f30861polloi |= 1;
            this.f30860molybdenite = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Constructor build() {
            ProtoBuf$Constructor protoBuf$ConstructorKowloon = kowloon();
            if (protoBuf$ConstructorKowloon.isInitialized()) {
                return protoBuf$ConstructorKowloon;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$ConstructorKowloon);
        }

        private void adultoid() {
        }
    }
}
