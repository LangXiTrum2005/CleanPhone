package p002kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
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
public final class ProtoBuf$VersionRequirement extends GeneratedMessageLite implements kowloon {
    public static arytenoidectomy<ProtoBuf$VersionRequirement> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$VersionRequirement f31007kowloon;
    private int bitField0_;
    private int errorCode_;
    private Level level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int message_;
    private final wireman unknownFields;
    private int versionFull_;
    private VersionKind versionKind_;
    private int version_;

    public enum Level implements impromptu.attabal {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static impromptu.saneness<Level> f31009kowloon = new attabal();
        private final int value;

        public static class attabal implements impromptu.saneness<Level> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public Level findValueByNumber(int i) {
                return Level.valueOf(i);
            }
        }

        Level(int i, int i2) {
            this.value = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
        public final int getNumber() {
            return this.value;
        }

        public static Level valueOf(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }
    }

    public enum VersionKind implements impromptu.attabal {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static impromptu.saneness<VersionKind> f31011kowloon = new attabal();
        private final int value;

        public static class attabal implements impromptu.saneness<VersionKind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public VersionKind findValueByNumber(int i) {
                return VersionKind.valueOf(i);
            }
        }

        VersionKind(int i, int i2) {
            this.value = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
        public final int getNumber() {
            return this.value;
        }

        public static VersionKind valueOf(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }
    }

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$VersionRequirement> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$VersionRequirement dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$VersionRequirement(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(true);
        f31007kowloon = protoBuf$VersionRequirement;
        protoBuf$VersionRequirement.saneness();
    }

    public static ProtoBuf$VersionRequirement getDefaultInstance() {
        return f31007kowloon;
    }

    public static saneness newBuilder() {
        return saneness.impassible();
    }

    private void saneness() {
        this.version_ = 0;
        this.versionFull_ = 0;
        this.level_ = Level.ERROR;
        this.errorCode_ = 0;
        this.message_ = 0;
        this.versionKind_ = VersionKind.LANGUAGE_VERSION;
    }

    public int getErrorCode() {
        return this.errorCode_;
    }

    public Level getLevel() {
        return this.level_;
    }

    public int getMessage() {
        return this.message_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$VersionRequirement> getParserForType() {
        return PARSER;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.version_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iKowloon += CodedOutputStream.kowloon(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iKowloon += CodedOutputStream.impromptu(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iKowloon += CodedOutputStream.kowloon(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iKowloon += CodedOutputStream.kowloon(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iKowloon += CodedOutputStream.impromptu(6, this.versionKind_.getNumber());
        }
        int size = iKowloon + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getVersion() {
        return this.version_;
    }

    public int getVersionFull() {
        return this.versionFull_;
    }

    public VersionKind getVersionKind() {
        return this.versionKind_;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasLevel() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasMessage() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasVersion() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasVersionFull() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasVersionKind() {
        return (this.bitField0_ & 32) == 32;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.kowloon
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.cultivated(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.cultivated(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.walach(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.cultivated(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.cultivated(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.walach(6, this.versionKind_.getNumber());
        }
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
        return newBuilder().beachfront(protoBuf$VersionRequirement);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$VersionRequirement getDefaultInstanceForType() {
        return f31007kowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$VersionRequirement(GeneratedMessageLite.saneness sanenessVar) {
        super(sanenessVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = sanenessVar.marial();
    }

    public ProtoBuf$VersionRequirement(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$VersionRequirement(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        saneness();
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
                            this.version_ = marialVar.molybdenite();
                        } else if (iPolder == 16) {
                            this.bitField0_ |= 2;
                            this.versionFull_ = marialVar.molybdenite();
                        } else if (iPolder == 24) {
                            int iTriweekly = marialVar.triweekly();
                            Level levelValueOf = Level.valueOf(iTriweekly);
                            if (levelValueOf == null) {
                                codedOutputStreamMerc.sensatory(iPolder);
                                codedOutputStreamMerc.sensatory(iTriweekly);
                            } else {
                                this.bitField0_ |= 4;
                                this.level_ = levelValueOf;
                            }
                        } else if (iPolder == 32) {
                            this.bitField0_ |= 8;
                            this.errorCode_ = marialVar.molybdenite();
                        } else if (iPolder == 40) {
                            this.bitField0_ |= 16;
                            this.message_ = marialVar.molybdenite();
                        } else if (iPolder != 48) {
                            if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                            }
                        } else {
                            int iTriweekly2 = marialVar.triweekly();
                            VersionKind versionKindValueOf = VersionKind.valueOf(iTriweekly2);
                            if (versionKindValueOf == null) {
                                codedOutputStreamMerc.sensatory(iPolder);
                                codedOutputStreamMerc.sensatory(iTriweekly2);
                            } else {
                                this.bitField0_ |= 32;
                                this.versionKind_ = versionKindValueOf;
                            }
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

    public static final class saneness extends GeneratedMessageLite.saneness<ProtoBuf$VersionRequirement, saneness> implements kowloon {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public int f31012adultoid;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f31013arytenoidectomy;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f31015graveside;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f31017monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f31018polloi;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public Level f31016molybdenite = Level.ERROR;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public VersionKind f31014dovishness = VersionKind.LANGUAGE_VERSION;

        public saneness() {
            triweekly();
        }

        public static saneness impassible() {
            return new saneness();
        }

        public saneness adultoid(int i) {
            this.f31013arytenoidectomy |= 1;
            this.f31017monoploid = i;
            return this;
        }

        public ProtoBuf$VersionRequirement apical() {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(this);
            int i = this.f31013arytenoidectomy;
            int i2 = (i & 1) != 1 ? 0 : 1;
            protoBuf$VersionRequirement.version_ = this.f31017monoploid;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$VersionRequirement.versionFull_ = this.f31018polloi;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$VersionRequirement.level_ = this.f31016molybdenite;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$VersionRequirement.errorCode_ = this.f31015graveside;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$VersionRequirement.message_ = this.f31012adultoid;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            protoBuf$VersionRequirement.versionKind_ = this.f31014dovishness;
            protoBuf$VersionRequirement.bitField0_ = i2;
            return protoBuf$VersionRequirement;
        }

        public saneness dovishness(int i) {
            this.f31013arytenoidectomy |= 2;
            this.f31018polloi = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return impassible().beachfront(apical());
        }

        public saneness gintrap(VersionKind versionKind) {
            versionKind.getClass();
            this.f31013arytenoidectomy |= 32;
            this.f31014dovishness = versionKind;
            return this;
        }

        public saneness graveside(int i) {
            this.f31013arytenoidectomy |= 16;
            this.f31012adultoid = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
            if (protoBuf$VersionRequirement == ProtoBuf$VersionRequirement.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$VersionRequirement.hasVersion()) {
                adultoid(protoBuf$VersionRequirement.getVersion());
            }
            if (protoBuf$VersionRequirement.hasVersionFull()) {
                dovishness(protoBuf$VersionRequirement.getVersionFull());
            }
            if (protoBuf$VersionRequirement.hasLevel()) {
                molybdenite(protoBuf$VersionRequirement.getLevel());
            }
            if (protoBuf$VersionRequirement.hasErrorCode()) {
                polloi(protoBuf$VersionRequirement.getErrorCode());
            }
            if (protoBuf$VersionRequirement.hasMessage()) {
                graveside(protoBuf$VersionRequirement.getMessage());
            }
            if (protoBuf$VersionRequirement.hasVersionKind()) {
                gintrap(protoBuf$VersionRequirement.getVersionKind());
            }
            competently(marial().dern(protoBuf$VersionRequirement.unknownFields));
            return this;
        }

        public saneness molybdenite(Level level) {
            level.getClass();
            this.f31013arytenoidectomy |= 4;
            this.f31016molybdenite = level;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement = null;
            try {
                try {
                    ProtoBuf$VersionRequirement protoBuf$VersionRequirementDern = ProtoBuf$VersionRequirement.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$VersionRequirementDern != null) {
                        beachfront(protoBuf$VersionRequirementDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$VersionRequirement != null) {
                        beachfront(protoBuf$VersionRequirement);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$VersionRequirement protoBuf$VersionRequirement2 = (ProtoBuf$VersionRequirement) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$VersionRequirement = protoBuf$VersionRequirement2;
                    if (protoBuf$VersionRequirement != null) {
                        beachfront(protoBuf$VersionRequirement);
                    }
                    throw th;
                }
            }
        }

        public saneness polloi(int i) {
            this.f31013arytenoidectomy |= 8;
            this.f31015graveside = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$VersionRequirement build() {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirementApical = apical();
            if (protoBuf$VersionRequirementApical.isInitialized()) {
                return protoBuf$VersionRequirementApical;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$VersionRequirementApical);
        }

        private void triweekly() {
        }
    }
}
