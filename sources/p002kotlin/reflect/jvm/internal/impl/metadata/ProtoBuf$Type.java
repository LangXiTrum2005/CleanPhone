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
public final class ProtoBuf$Type extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Type> implements kowloon {
    public static arytenoidectomy<ProtoBuf$Type> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$Type f30951kowloon;
    private int abbreviatedTypeId_;
    private ProtoBuf$Type abbreviatedType_;
    private List<Argument> argument_;
    private int bitField0_;
    private int className_;
    private int flags_;
    private int flexibleTypeCapabilitiesId_;
    private int flexibleUpperBoundId_;
    private ProtoBuf$Type flexibleUpperBound_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private boolean nullable_;
    private int outerTypeId_;
    private ProtoBuf$Type outerType_;
    private int typeAliasName_;
    private int typeParameterName_;
    private int typeParameter_;
    private final wireman unknownFields;

    public static final class Argument extends GeneratedMessageLite implements kowloon {
        public static arytenoidectomy<Argument> PARSER = new attabal();

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final Argument f30952kowloon;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Projection projection_;
        private int typeId_;
        private ProtoBuf$Type type_;
        private final wireman unknownFields;

        public enum Projection implements impromptu.attabal {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public static impromptu.saneness<Projection> f30954kowloon = new attabal();
            private final int value;

            public static class attabal implements impromptu.saneness<Projection> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
                /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
                public Projection findValueByNumber(int i) {
                    return Projection.valueOf(i);
                }
            }

            Projection(int i, int i2) {
                this.value = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
            public final int getNumber() {
                return this.value;
            }

            public static Projection valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }
        }

        public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<Argument> {
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
            /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
            public Argument dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
                return new Argument(marialVar, beachfrontVar);
            }
        }

        static {
            Argument argument = new Argument(true);
            f30952kowloon = argument;
            argument.saneness();
        }

        public static Argument getDefaultInstance() {
            return f30952kowloon;
        }

        public static saneness newBuilder() {
            return saneness.impassible();
        }

        private void saneness() {
            this.projection_ = Projection.INV;
            this.type_ = ProtoBuf$Type.getDefaultInstance();
            this.typeId_ = 0;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public arytenoidectomy<Argument> getParserForType() {
            return PARSER;
        }

        public Projection getProjection() {
            return this.projection_;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iImpromptu = (this.bitField0_ & 1) == 1 ? CodedOutputStream.impromptu(1, this.projection_.getNumber()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iImpromptu += CodedOutputStream.molybdenite(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iImpromptu += CodedOutputStream.kowloon(3, this.typeId_);
            }
            int size = iImpromptu + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public ProtoBuf$Type getType() {
            return this.type_;
        }

        public int getTypeId() {
            return this.typeId_;
        }

        public boolean hasProjection() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasType() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasTypeId() {
            return (this.bitField0_ & 4) == 4;
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
            if (!hasType() || getType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.walach(1, this.projection_.getNumber());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.milliradian(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.cultivated(3, this.typeId_);
            }
            codedOutputStream.nosophobia(this.unknownFields);
        }

        public static saneness newBuilder(Argument argument) {
            return newBuilder().beachfront(argument);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Argument getDefaultInstanceForType() {
            return f30952kowloon;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness newBuilderForType() {
            return newBuilder();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness toBuilder() {
            return newBuilder(this);
        }

        public Argument(GeneratedMessageLite.saneness sanenessVar) {
            super(sanenessVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = sanenessVar.marial();
        }

        public Argument(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = wireman.f31186kowloon;
        }

        public Argument(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            saneness();
            wireman.saneness sanenessVarArytenoidectomy = wireman.arytenoidectomy();
            CodedOutputStream codedOutputStreamMerc = CodedOutputStream.merc(sanenessVarArytenoidectomy, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iPolder = marialVar.polder();
                            if (iPolder != 0) {
                                if (iPolder == 8) {
                                    int iTriweekly = marialVar.triweekly();
                                    Projection projectionValueOf = Projection.valueOf(iTriweekly);
                                    if (projectionValueOf == null) {
                                        codedOutputStreamMerc.sensatory(iPolder);
                                        codedOutputStreamMerc.sensatory(iTriweekly);
                                    } else {
                                        this.bitField0_ |= 1;
                                        this.projection_ = projectionValueOf;
                                    }
                                } else if (iPolder == 18) {
                                    saneness builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                    ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar);
                                    this.type_ = protoBuf$Type;
                                    if (builder != null) {
                                        builder.beachfront(protoBuf$Type);
                                        this.type_ = builder.kowloon();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (iPolder != 24) {
                                    if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                    }
                                } else {
                                    this.bitField0_ |= 4;
                                    this.typeId_ = marialVar.molybdenite();
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

        public static final class saneness extends GeneratedMessageLite.saneness<Argument, saneness> implements kowloon {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public int f30955arytenoidectomy;

            /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
            public int f30956molybdenite;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public Projection f30957monoploid = Projection.INV;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public ProtoBuf$Type f30958polloi = ProtoBuf$Type.getDefaultInstance();

            public saneness() {
                triweekly();
            }

            public static saneness impassible() {
                return new saneness();
            }

            public Argument apical() {
                Argument argument = new Argument(this);
                int i = this.f30955arytenoidectomy;
                int i2 = (i & 1) != 1 ? 0 : 1;
                argument.projection_ = this.f30957monoploid;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                argument.type_ = this.f30958polloi;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                argument.typeId_ = this.f30956molybdenite;
                argument.bitField0_ = i2;
                return argument;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
            public saneness wireman() {
                return impassible().beachfront(apical());
            }

            public saneness graveside(int i) {
                this.f30955arytenoidectomy |= 4;
                this.f30956molybdenite = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
            public saneness beachfront(Argument argument) {
                if (argument == Argument.getDefaultInstance()) {
                    return this;
                }
                if (argument.hasProjection()) {
                    molybdenite(argument.getProjection());
                }
                if (argument.hasType()) {
                    polloi(argument.getType());
                }
                if (argument.hasTypeId()) {
                    graveside(argument.getTypeId());
                }
                competently(marial().dern(argument.unknownFields));
                return this;
            }

            public saneness molybdenite(Projection projection) {
                projection.getClass();
                this.f30955arytenoidectomy |= 1;
                this.f30957monoploid = projection;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
            public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
                Argument argument = null;
                try {
                    try {
                        Argument argumentDern = Argument.PARSER.dern(marialVar, beachfrontVar);
                        if (argumentDern != null) {
                            beachfront(argumentDern);
                        }
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (argument != null) {
                            beachfront(argument);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    Argument argument2 = (Argument) e.getUnfinishedMessage();
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        argument = argument2;
                        if (argument != null) {
                            beachfront(argument);
                        }
                        throw th;
                    }
                }
            }

            public saneness polloi(ProtoBuf$Type protoBuf$Type) {
                if ((this.f30955arytenoidectomy & 2) != 2 || this.f30958polloi == ProtoBuf$Type.getDefaultInstance()) {
                    this.f30958polloi = protoBuf$Type;
                } else {
                    this.f30958polloi = ProtoBuf$Type.newBuilder(this.f30958polloi).beachfront(protoBuf$Type).kowloon();
                }
                this.f30955arytenoidectomy |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
            public Argument build() {
                Argument argumentApical = apical();
                if (argumentApical.isInitialized()) {
                    return argumentApical;
                }
                throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(argumentApical);
            }

            private void triweekly() {
            }
        }
    }

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$Type> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Type dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Type(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(true);
        f30951kowloon = protoBuf$Type;
        protoBuf$Type.dern();
    }

    private void dern() {
        this.argument_ = Collections.EMPTY_LIST;
        this.nullable_ = false;
        this.flexibleTypeCapabilitiesId_ = 0;
        this.flexibleUpperBound_ = getDefaultInstance();
        this.flexibleUpperBoundId_ = 0;
        this.className_ = 0;
        this.typeParameter_ = 0;
        this.typeParameterName_ = 0;
        this.typeAliasName_ = 0;
        this.outerType_ = getDefaultInstance();
        this.outerTypeId_ = 0;
        this.abbreviatedType_ = getDefaultInstance();
        this.abbreviatedTypeId_ = 0;
        this.flags_ = 0;
    }

    public static ProtoBuf$Type getDefaultInstance() {
        return f30951kowloon;
    }

    public static saneness newBuilder() {
        return saneness.polloi();
    }

    public ProtoBuf$Type getAbbreviatedType() {
        return this.abbreviatedType_;
    }

    public int getAbbreviatedTypeId() {
        return this.abbreviatedTypeId_;
    }

    public Argument getArgument(int i) {
        return this.argument_.get(i);
    }

    public int getArgumentCount() {
        return this.argument_.size();
    }

    public List<Argument> getArgumentList() {
        return this.argument_;
    }

    public int getClassName() {
        return this.className_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getFlexibleTypeCapabilitiesId() {
        return this.flexibleTypeCapabilitiesId_;
    }

    public ProtoBuf$Type getFlexibleUpperBound() {
        return this.flexibleUpperBound_;
    }

    public int getFlexibleUpperBoundId() {
        return this.flexibleUpperBoundId_;
    }

    public boolean getNullable() {
        return this.nullable_;
    }

    public ProtoBuf$Type getOuterType() {
        return this.outerType_;
    }

    public int getOuterTypeId() {
        return this.outerTypeId_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$Type> getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iKowloon = (this.bitField0_ & 4096) == 4096 ? CodedOutputStream.kowloon(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iKowloon += CodedOutputStream.molybdenite(2, this.argument_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            iKowloon += CodedOutputStream.attabal(3, this.nullable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            iKowloon += CodedOutputStream.kowloon(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iKowloon += CodedOutputStream.molybdenite(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iKowloon += CodedOutputStream.kowloon(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iKowloon += CodedOutputStream.kowloon(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iKowloon += CodedOutputStream.kowloon(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iKowloon += CodedOutputStream.kowloon(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            iKowloon += CodedOutputStream.molybdenite(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            iKowloon += CodedOutputStream.kowloon(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            iKowloon += CodedOutputStream.kowloon(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            iKowloon += CodedOutputStream.molybdenite(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            iKowloon += CodedOutputStream.kowloon(14, this.abbreviatedTypeId_);
        }
        int iExtensionsSerializedSize = iKowloon + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public int getTypeAliasName() {
        return this.typeAliasName_;
    }

    public int getTypeParameter() {
        return this.typeParameter_;
    }

    public int getTypeParameterName() {
        return this.typeParameterName_;
    }

    public boolean hasAbbreviatedType() {
        return (this.bitField0_ & 1024) == 1024;
    }

    public boolean hasAbbreviatedTypeId() {
        return (this.bitField0_ & 2048) == 2048;
    }

    public boolean hasClassName() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 4096) == 4096;
    }

    public boolean hasFlexibleTypeCapabilitiesId() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasFlexibleUpperBound() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasFlexibleUpperBoundId() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasNullable() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasOuterType() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasOuterTypeId() {
        return (this.bitField0_ & 512) == 512;
    }

    public boolean hasTypeAliasName() {
        return (this.bitField0_ & 128) == 128;
    }

    public boolean hasTypeParameter() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasTypeParameterName() {
        return (this.bitField0_ & 64) == 64;
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
        for (int i = 0; i < getArgumentCount(); i++) {
            if (!getArgument(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasOuterType() && !getOuterType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
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
        if ((this.bitField0_ & 4096) == 4096) {
            codedOutputStream.cultivated(1, this.flags_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            codedOutputStream.milliradian(2, this.argument_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.seminary(3, this.nullable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.cultivated(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.milliradian(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.cultivated(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.cultivated(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.cultivated(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.cultivated(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.milliradian(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            codedOutputStream.cultivated(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.cultivated(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            codedOutputStream.milliradian(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            codedOutputStream.cultivated(14, this.abbreviatedTypeId_);
        }
        attabalVarNewExtensionWriter.attabal(200, codedOutputStream);
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$Type protoBuf$Type) {
        return newBuilder().beachfront(protoBuf$Type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Type getDefaultInstanceForType() {
        return f30951kowloon;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Type(GeneratedMessageLite.dern<ProtoBuf$Type, ?> dernVar) {
        super(dernVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = dernVar.marial();
    }

    public ProtoBuf$Type(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$Type(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        saneness builder;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        dern();
        wireman.saneness sanenessVarArytenoidectomy = wireman.arytenoidectomy();
        CodedOutputStream codedOutputStreamMerc = CodedOutputStream.merc(sanenessVarArytenoidectomy, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iPolder = marialVar.polder();
                        switch (iPolder) {
                            case 0:
                                break;
                            case 8:
                                this.bitField0_ |= 4096;
                                this.flags_ = marialVar.molybdenite();
                                continue;
                            case 18:
                                if (!z2) {
                                    this.argument_ = new ArrayList();
                                    z2 = true;
                                }
                                this.argument_.add((Argument) marialVar.adultoid(Argument.PARSER, beachfrontVar));
                                continue;
                            case 24:
                                this.bitField0_ |= 1;
                                this.nullable_ = marialVar.apical();
                                continue;
                            case 32:
                                this.bitField0_ |= 2;
                                this.flexibleTypeCapabilitiesId_ = marialVar.molybdenite();
                                continue;
                            case 42:
                                builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) marialVar.adultoid(PARSER, beachfrontVar);
                                this.flexibleUpperBound_ = protoBuf$Type;
                                if (builder != null) {
                                    builder.beachfront(protoBuf$Type);
                                    this.flexibleUpperBound_ = builder.kowloon();
                                }
                                this.bitField0_ |= 4;
                                continue;
                            case 48:
                                this.bitField0_ |= 16;
                                this.className_ = marialVar.molybdenite();
                                continue;
                            case 56:
                                this.bitField0_ |= 32;
                                this.typeParameter_ = marialVar.molybdenite();
                                continue;
                            case 64:
                                this.bitField0_ |= 8;
                                this.flexibleUpperBoundId_ = marialVar.molybdenite();
                                continue;
                            case 72:
                                this.bitField0_ |= 64;
                                this.typeParameterName_ = marialVar.molybdenite();
                                continue;
                            case 82:
                                builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) marialVar.adultoid(PARSER, beachfrontVar);
                                this.outerType_ = protoBuf$Type2;
                                if (builder != null) {
                                    builder.beachfront(protoBuf$Type2);
                                    this.outerType_ = builder.kowloon();
                                }
                                this.bitField0_ |= 256;
                                continue;
                            case 88:
                                this.bitField0_ |= 512;
                                this.outerTypeId_ = marialVar.molybdenite();
                                continue;
                            case 96:
                                this.bitField0_ |= 128;
                                this.typeAliasName_ = marialVar.molybdenite();
                                continue;
                            case 106:
                                builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : null;
                                ProtoBuf$Type protoBuf$Type3 = (ProtoBuf$Type) marialVar.adultoid(PARSER, beachfrontVar);
                                this.abbreviatedType_ = protoBuf$Type3;
                                if (builder != null) {
                                    builder.beachfront(protoBuf$Type3);
                                    this.abbreviatedType_ = builder.kowloon();
                                }
                                this.bitField0_ |= 1024;
                                continue;
                            case 112:
                                this.bitField0_ |= 2048;
                                this.abbreviatedTypeId_ = marialVar.molybdenite();
                                continue;
                            default:
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (z2) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
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
        if (z2) {
            this.argument_ = Collections.unmodifiableList(this.argument_);
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.dern<ProtoBuf$Type, saneness> implements kowloon {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public int f30959adultoid;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public int f30960cord;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public int f30961cuirassed;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public int f30963gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public boolean f30964graveside;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f30967polloi;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public int f30968preprohormone;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public int f30969rotuma;

        /* JADX INFO: renamed from: sealless, reason: collision with root package name */
        public int f30970sealless;

        /* JADX INFO: renamed from: trm, reason: collision with root package name */
        public int f30972trm;

        /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
        public int f30973yemenite;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public List<Argument> f30965molybdenite = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public ProtoBuf$Type f30962dovishness = ProtoBuf$Type.getDefaultInstance();

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
        public ProtoBuf$Type f30971stratoscope = ProtoBuf$Type.getDefaultInstance();

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
        public ProtoBuf$Type f30966oilcan = ProtoBuf$Type.getDefaultInstance();

        public saneness() {
            graveside();
        }

        private void molybdenite() {
            if ((this.f30967polloi & 1) != 1) {
                this.f30965molybdenite = new ArrayList(this.f30965molybdenite);
                this.f30967polloi |= 1;
            }
        }

        public static saneness polloi() {
            return new saneness();
        }

        public saneness adultoid(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30967polloi & 2048) != 2048 || this.f30966oilcan == ProtoBuf$Type.getDefaultInstance()) {
                this.f30966oilcan = protoBuf$Type;
            } else {
                this.f30966oilcan = ProtoBuf$Type.newBuilder(this.f30966oilcan).beachfront(protoBuf$Type).kowloon();
            }
            this.f30967polloi |= 2048;
            return this;
        }

        public saneness cord(int i) {
            this.f30967polloi |= 4096;
            this.f30973yemenite = i;
            return this;
        }

        public saneness cuirassed(int i) {
            this.f30967polloi |= 32;
            this.f30969rotuma = i;
            return this;
        }

        public saneness dovishness(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30967polloi & 8) != 8 || this.f30962dovishness == ProtoBuf$Type.getDefaultInstance()) {
                this.f30962dovishness = protoBuf$Type;
            } else {
                this.f30962dovishness = ProtoBuf$Type.newBuilder(this.f30962dovishness).beachfront(protoBuf$Type).kowloon();
            }
            this.f30967polloi |= 8;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$Type protoBuf$Type) {
            if (protoBuf$Type == ProtoBuf$Type.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$Type.argument_.isEmpty()) {
                if (this.f30965molybdenite.isEmpty()) {
                    this.f30965molybdenite = protoBuf$Type.argument_;
                    this.f30967polloi &= -2;
                } else {
                    molybdenite();
                    this.f30965molybdenite.addAll(protoBuf$Type.argument_);
                }
            }
            if (protoBuf$Type.hasNullable()) {
                yemenite(protoBuf$Type.getNullable());
            }
            if (protoBuf$Type.hasFlexibleTypeCapabilitiesId()) {
                trm(protoBuf$Type.getFlexibleTypeCapabilitiesId());
            }
            if (protoBuf$Type.hasFlexibleUpperBound()) {
                dovishness(protoBuf$Type.getFlexibleUpperBound());
            }
            if (protoBuf$Type.hasFlexibleUpperBoundId()) {
                oilcan(protoBuf$Type.getFlexibleUpperBoundId());
            }
            if (protoBuf$Type.hasClassName()) {
                cuirassed(protoBuf$Type.getClassName());
            }
            if (protoBuf$Type.hasTypeParameter()) {
                restrictive(protoBuf$Type.getTypeParameter());
            }
            if (protoBuf$Type.hasTypeParameterName()) {
                merc(protoBuf$Type.getTypeParameterName());
            }
            if (protoBuf$Type.hasTypeAliasName()) {
                supplicat(protoBuf$Type.getTypeAliasName());
            }
            if (protoBuf$Type.hasOuterType()) {
                preprohormone(protoBuf$Type.getOuterType());
            }
            if (protoBuf$Type.hasOuterTypeId()) {
                sealless(protoBuf$Type.getOuterTypeId());
            }
            if (protoBuf$Type.hasAbbreviatedType()) {
                adultoid(protoBuf$Type.getAbbreviatedType());
            }
            if (protoBuf$Type.hasAbbreviatedTypeId()) {
                cord(protoBuf$Type.getAbbreviatedTypeId());
            }
            if (protoBuf$Type.hasFlags()) {
                stratoscope(protoBuf$Type.getFlags());
            }
            formularize(protoBuf$Type);
            competently(marial().dern(protoBuf$Type.unknownFields));
            return this;
        }

        public ProtoBuf$Type kowloon() {
            ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(this);
            int i = this.f30967polloi;
            if ((i & 1) == 1) {
                this.f30965molybdenite = Collections.unmodifiableList(this.f30965molybdenite);
                this.f30967polloi &= -2;
            }
            protoBuf$Type.argument_ = this.f30965molybdenite;
            int i2 = (i & 2) != 2 ? 0 : 1;
            protoBuf$Type.nullable_ = this.f30964graveside;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            protoBuf$Type.flexibleTypeCapabilitiesId_ = this.f30959adultoid;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            protoBuf$Type.flexibleUpperBound_ = this.f30962dovishness;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            protoBuf$Type.flexibleUpperBoundId_ = this.f30963gintrap;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            protoBuf$Type.className_ = this.f30969rotuma;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            protoBuf$Type.typeParameter_ = this.f30968preprohormone;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            protoBuf$Type.typeParameterName_ = this.f30960cord;
            if ((i & 256) == 256) {
                i2 |= 128;
            }
            protoBuf$Type.typeAliasName_ = this.f30961cuirassed;
            if ((i & 512) == 512) {
                i2 |= 256;
            }
            protoBuf$Type.outerType_ = this.f30971stratoscope;
            if ((i & 1024) == 1024) {
                i2 |= 512;
            }
            protoBuf$Type.outerTypeId_ = this.f30972trm;
            if ((i & 2048) == 2048) {
                i2 |= 1024;
            }
            protoBuf$Type.abbreviatedType_ = this.f30966oilcan;
            if ((i & 4096) == 4096) {
                i2 |= 2048;
            }
            protoBuf$Type.abbreviatedTypeId_ = this.f30973yemenite;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            protoBuf$Type.flags_ = this.f30970sealless;
            protoBuf$Type.bitField0_ = i2;
            return protoBuf$Type;
        }

        public saneness merc(int i) {
            this.f30967polloi |= 128;
            this.f30960cord = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return polloi().beachfront(kowloon());
        }

        public saneness oilcan(int i) {
            this.f30967polloi |= 16;
            this.f30963gintrap = i;
            return this;
        }

        public saneness preprohormone(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30967polloi & 512) != 512 || this.f30971stratoscope == ProtoBuf$Type.getDefaultInstance()) {
                this.f30971stratoscope = protoBuf$Type;
            } else {
                this.f30971stratoscope = ProtoBuf$Type.newBuilder(this.f30971stratoscope).beachfront(protoBuf$Type).kowloon();
            }
            this.f30967polloi |= 512;
            return this;
        }

        public saneness restrictive(int i) {
            this.f30967polloi |= 64;
            this.f30968preprohormone = i;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$Type protoBuf$Type = null;
            try {
                try {
                    ProtoBuf$Type protoBuf$TypeDern = ProtoBuf$Type.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$TypeDern != null) {
                        beachfront(protoBuf$TypeDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$Type != null) {
                        beachfront(protoBuf$Type);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Type = protoBuf$Type2;
                    if (protoBuf$Type != null) {
                        beachfront(protoBuf$Type);
                    }
                    throw th;
                }
            }
        }

        public saneness sealless(int i) {
            this.f30967polloi |= 1024;
            this.f30972trm = i;
            return this;
        }

        public saneness stratoscope(int i) {
            this.f30967polloi |= 8192;
            this.f30970sealless = i;
            return this;
        }

        public saneness supplicat(int i) {
            this.f30967polloi |= 256;
            this.f30961cuirassed = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Type build() {
            ProtoBuf$Type protoBuf$TypeKowloon = kowloon();
            if (protoBuf$TypeKowloon.isInitialized()) {
                return protoBuf$TypeKowloon;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$TypeKowloon);
        }

        public saneness trm(int i) {
            this.f30967polloi |= 4;
            this.f30959adultoid = i;
            return this;
        }

        public saneness yemenite(boolean z) {
            this.f30967polloi |= 2;
            this.f30964graveside = z;
            return this;
        }

        private void graveside() {
        }
    }
}
