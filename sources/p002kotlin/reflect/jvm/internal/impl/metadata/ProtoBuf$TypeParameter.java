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
import p002kotlin.reflect.jvm.internal.impl.protobuf.impromptu;
import p002kotlin.reflect.jvm.internal.impl.protobuf.kowloon;
import p002kotlin.reflect.jvm.internal.impl.protobuf.marial;
import p002kotlin.reflect.jvm.internal.impl.protobuf.wireman;

/* JADX INFO: loaded from: classes5.dex */
public final class ProtoBuf$TypeParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeParameter> implements kowloon {
    public static arytenoidectomy<ProtoBuf$TypeParameter> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$TypeParameter f30985kowloon;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private boolean reified_;
    private final wireman unknownFields;
    private int upperBoundIdMemoizedSerializedSize;
    private List<Integer> upperBoundId_;
    private List<ProtoBuf$Type> upperBound_;
    private Variance variance_;

    public enum Variance implements impromptu.attabal {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static impromptu.saneness<Variance> f30987kowloon = new attabal();
        private final int value;

        public static class attabal implements impromptu.saneness<Variance> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public Variance findValueByNumber(int i) {
                return Variance.valueOf(i);
            }
        }

        Variance(int i, int i2) {
            this.value = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
        public final int getNumber() {
            return this.value;
        }

        public static Variance valueOf(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }
    }

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$TypeParameter> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$TypeParameter dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeParameter(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(true);
        f30985kowloon = protoBuf$TypeParameter;
        protoBuf$TypeParameter.dern();
    }

    private void dern() {
        this.id_ = 0;
        this.name_ = 0;
        this.reified_ = false;
        this.variance_ = Variance.INV;
        List list = Collections.EMPTY_LIST;
        this.upperBound_ = list;
        this.upperBoundId_ = list;
    }

    public static ProtoBuf$TypeParameter getDefaultInstance() {
        return f30985kowloon;
    }

    public static saneness newBuilder() {
        return saneness.polloi();
    }

    public int getId() {
        return this.id_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$TypeParameter> getParserForType() {
        return PARSER;
    }

    public boolean getReified() {
        return this.reified_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.id_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iKowloon += CodedOutputStream.kowloon(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iKowloon += CodedOutputStream.attabal(3, this.reified_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iKowloon += CodedOutputStream.impromptu(4, this.variance_.getNumber());
        }
        for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
            iKowloon += CodedOutputStream.molybdenite(5, this.upperBound_.get(i2));
        }
        int iArytenoidectomy = 0;
        for (int i3 = 0; i3 < this.upperBoundId_.size(); i3++) {
            iArytenoidectomy += CodedOutputStream.arytenoidectomy(this.upperBoundId_.get(i3).intValue());
        }
        int iArytenoidectomy2 = iKowloon + iArytenoidectomy;
        if (!getUpperBoundIdList().isEmpty()) {
            iArytenoidectomy2 = iArytenoidectomy2 + 1 + CodedOutputStream.arytenoidectomy(iArytenoidectomy);
        }
        this.upperBoundIdMemoizedSerializedSize = iArytenoidectomy;
        int iExtensionsSerializedSize = iArytenoidectomy2 + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ProtoBuf$Type getUpperBound(int i) {
        return this.upperBound_.get(i);
    }

    public int getUpperBoundCount() {
        return this.upperBound_.size();
    }

    public List<Integer> getUpperBoundIdList() {
        return this.upperBoundId_;
    }

    public List<ProtoBuf$Type> getUpperBoundList() {
        return this.upperBound_;
    }

    public Variance getVariance() {
        return this.variance_;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasReified() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasVariance() {
        return (this.bitField0_ & 8) == 8;
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
        if (!hasId()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (!hasName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getUpperBoundCount(); i++) {
            if (!getUpperBound(i).isInitialized()) {
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
            codedOutputStream.cultivated(1, this.id_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.cultivated(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.seminary(3, this.reified_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.walach(4, this.variance_.getNumber());
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            codedOutputStream.milliradian(5, this.upperBound_.get(i));
        }
        if (getUpperBoundIdList().size() > 0) {
            codedOutputStream.sensatory(50);
            codedOutputStream.sensatory(this.upperBoundIdMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
            codedOutputStream.premeiotic(this.upperBoundId_.get(i2).intValue());
        }
        attabalVarNewExtensionWriter.attabal(1000, codedOutputStream);
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
        return newBuilder().beachfront(protoBuf$TypeParameter);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$TypeParameter getDefaultInstanceForType() {
        return f30985kowloon;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$TypeParameter(GeneratedMessageLite.dern<ProtoBuf$TypeParameter, ?> dernVar) {
        super(dernVar);
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = dernVar.marial();
    }

    public ProtoBuf$TypeParameter(boolean z) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$TypeParameter(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        this.upperBoundIdMemoizedSerializedSize = -1;
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
                        if (iPolder == 8) {
                            this.bitField0_ |= 1;
                            this.id_ = marialVar.molybdenite();
                        } else if (iPolder == 16) {
                            this.bitField0_ |= 2;
                            this.name_ = marialVar.molybdenite();
                        } else if (iPolder == 24) {
                            this.bitField0_ |= 4;
                            this.reified_ = marialVar.apical();
                        } else if (iPolder == 32) {
                            int iTriweekly = marialVar.triweekly();
                            Variance varianceValueOf = Variance.valueOf(iTriweekly);
                            if (varianceValueOf == null) {
                                codedOutputStreamMerc.sensatory(iPolder);
                                codedOutputStreamMerc.sensatory(iTriweekly);
                            } else {
                                this.bitField0_ |= 8;
                                this.variance_ = varianceValueOf;
                            }
                        } else if (iPolder == 42) {
                            if ((i & 16) != 16) {
                                this.upperBound_ = new ArrayList();
                                i |= 16;
                            }
                            this.upperBound_.add((ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar));
                        } else if (iPolder == 48) {
                            if ((i & 32) != 32) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            this.upperBoundId_.add(Integer.valueOf(marialVar.molybdenite()));
                        } else if (iPolder != 50) {
                            if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                            }
                        } else {
                            int iCutely = marialVar.cutely(marialVar.cuirassed());
                            if ((i & 32) != 32 && marialVar.marial() > 0) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            while (marialVar.marial() > 0) {
                                this.upperBoundId_.add(Integer.valueOf(marialVar.molybdenite()));
                            }
                            marialVar.taiyuan(iCutely);
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((i & 16) == 16) {
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                }
                if ((i & 32) == 32) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
        if ((i & 16) == 16) {
            this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
        }
        if ((i & 32) == 32) {
            this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.dern<ProtoBuf$TypeParameter, saneness> implements kowloon {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public boolean f30988adultoid;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public Variance f30989dovishness = Variance.INV;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public List<ProtoBuf$Type> f30990gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f30991graveside;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f30992molybdenite;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f30993polloi;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public List<Integer> f30994rotuma;

        public saneness() {
            List list = Collections.EMPTY_LIST;
            this.f30990gintrap = list;
            this.f30994rotuma = list;
            adultoid();
        }

        public static saneness polloi() {
            return new saneness();
        }

        public saneness cord(boolean z) {
            this.f30993polloi |= 4;
            this.f30988adultoid = z;
            return this;
        }

        public saneness cuirassed(Variance variance) {
            variance.getClass();
            this.f30993polloi |= 8;
            this.f30989dovishness = variance;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
            if (protoBuf$TypeParameter == ProtoBuf$TypeParameter.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$TypeParameter.hasId()) {
                rotuma(protoBuf$TypeParameter.getId());
            }
            if (protoBuf$TypeParameter.hasName()) {
                preprohormone(protoBuf$TypeParameter.getName());
            }
            if (protoBuf$TypeParameter.hasReified()) {
                cord(protoBuf$TypeParameter.getReified());
            }
            if (protoBuf$TypeParameter.hasVariance()) {
                cuirassed(protoBuf$TypeParameter.getVariance());
            }
            if (!protoBuf$TypeParameter.upperBound_.isEmpty()) {
                if (this.f30990gintrap.isEmpty()) {
                    this.f30990gintrap = protoBuf$TypeParameter.upperBound_;
                    this.f30993polloi &= -17;
                } else {
                    graveside();
                    this.f30990gintrap.addAll(protoBuf$TypeParameter.upperBound_);
                }
            }
            if (!protoBuf$TypeParameter.upperBoundId_.isEmpty()) {
                if (this.f30994rotuma.isEmpty()) {
                    this.f30994rotuma = protoBuf$TypeParameter.upperBoundId_;
                    this.f30993polloi &= -33;
                } else {
                    molybdenite();
                    this.f30994rotuma.addAll(protoBuf$TypeParameter.upperBoundId_);
                }
            }
            formularize(protoBuf$TypeParameter);
            competently(marial().dern(protoBuf$TypeParameter.unknownFields));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$TypeParameter protoBuf$TypeParameter = null;
            try {
                try {
                    ProtoBuf$TypeParameter protoBuf$TypeParameterDern = ProtoBuf$TypeParameter.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$TypeParameterDern != null) {
                        beachfront(protoBuf$TypeParameterDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$TypeParameter != null) {
                        beachfront(protoBuf$TypeParameter);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$TypeParameter protoBuf$TypeParameter2 = (ProtoBuf$TypeParameter) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$TypeParameter = protoBuf$TypeParameter2;
                    if (protoBuf$TypeParameter != null) {
                        beachfront(protoBuf$TypeParameter);
                    }
                    throw th;
                }
            }
        }

        public final void graveside() {
            if ((this.f30993polloi & 16) != 16) {
                this.f30990gintrap = new ArrayList(this.f30990gintrap);
                this.f30993polloi |= 16;
            }
        }

        public ProtoBuf$TypeParameter kowloon() {
            ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(this);
            int i = this.f30993polloi;
            int i2 = (i & 1) != 1 ? 0 : 1;
            protoBuf$TypeParameter.id_ = this.f30992molybdenite;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$TypeParameter.name_ = this.f30991graveside;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$TypeParameter.reified_ = this.f30988adultoid;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$TypeParameter.variance_ = this.f30989dovishness;
            if ((this.f30993polloi & 16) == 16) {
                this.f30990gintrap = Collections.unmodifiableList(this.f30990gintrap);
                this.f30993polloi &= -17;
            }
            protoBuf$TypeParameter.upperBound_ = this.f30990gintrap;
            if ((this.f30993polloi & 32) == 32) {
                this.f30994rotuma = Collections.unmodifiableList(this.f30994rotuma);
                this.f30993polloi &= -33;
            }
            protoBuf$TypeParameter.upperBoundId_ = this.f30994rotuma;
            protoBuf$TypeParameter.bitField0_ = i2;
            return protoBuf$TypeParameter;
        }

        public final void molybdenite() {
            if ((this.f30993polloi & 32) != 32) {
                this.f30994rotuma = new ArrayList(this.f30994rotuma);
                this.f30993polloi |= 32;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return polloi().beachfront(kowloon());
        }

        public saneness preprohormone(int i) {
            this.f30993polloi |= 2;
            this.f30991graveside = i;
            return this;
        }

        public saneness rotuma(int i) {
            this.f30993polloi |= 1;
            this.f30992molybdenite = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$TypeParameter build() {
            ProtoBuf$TypeParameter protoBuf$TypeParameterKowloon = kowloon();
            if (protoBuf$TypeParameterKowloon.isInitialized()) {
                return protoBuf$TypeParameterKowloon;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$TypeParameterKowloon);
        }

        private void adultoid() {
        }
    }
}
