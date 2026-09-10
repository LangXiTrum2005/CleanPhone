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
public final class ProtoBuf$Expression extends GeneratedMessageLite implements kowloon {
    public static arytenoidectomy<ProtoBuf$Expression> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$Expression f30878kowloon;
    private List<ProtoBuf$Expression> andArgument_;
    private int bitField0_;
    private ConstantValue constantValue_;
    private int flags_;
    private int isInstanceTypeId_;
    private ProtoBuf$Type isInstanceType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ProtoBuf$Expression> orArgument_;
    private final wireman unknownFields;
    private int valueParameterReference_;

    public enum ConstantValue implements impromptu.attabal {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static impromptu.saneness<ConstantValue> f30880kowloon = new attabal();
        private final int value;

        public static class attabal implements impromptu.saneness<ConstantValue> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public ConstantValue findValueByNumber(int i) {
                return ConstantValue.valueOf(i);
            }
        }

        ConstantValue(int i, int i2) {
            this.value = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
        public final int getNumber() {
            return this.value;
        }

        public static ConstantValue valueOf(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }
    }

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$Expression> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Expression dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Expression(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(true);
        f30878kowloon = protoBuf$Expression;
        protoBuf$Expression.saneness();
    }

    public static ProtoBuf$Expression getDefaultInstance() {
        return f30878kowloon;
    }

    public static saneness newBuilder() {
        return saneness.impassible();
    }

    private void saneness() {
        this.flags_ = 0;
        this.valueParameterReference_ = 0;
        this.constantValue_ = ConstantValue.TRUE;
        this.isInstanceType_ = ProtoBuf$Type.getDefaultInstance();
        this.isInstanceTypeId_ = 0;
        List<ProtoBuf$Expression> list = Collections.EMPTY_LIST;
        this.andArgument_ = list;
        this.orArgument_ = list;
    }

    public ProtoBuf$Expression getAndArgument(int i) {
        return this.andArgument_.get(i);
    }

    public int getAndArgumentCount() {
        return this.andArgument_.size();
    }

    public ConstantValue getConstantValue() {
        return this.constantValue_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public ProtoBuf$Type getIsInstanceType() {
        return this.isInstanceType_;
    }

    public int getIsInstanceTypeId() {
        return this.isInstanceTypeId_;
    }

    public ProtoBuf$Expression getOrArgument(int i) {
        return this.orArgument_.get(i);
    }

    public int getOrArgumentCount() {
        return this.orArgument_.size();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$Expression> getParserForType() {
        return PARSER;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iKowloon += CodedOutputStream.kowloon(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iKowloon += CodedOutputStream.impromptu(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iKowloon += CodedOutputStream.molybdenite(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iKowloon += CodedOutputStream.kowloon(5, this.isInstanceTypeId_);
        }
        for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
            iKowloon += CodedOutputStream.molybdenite(6, this.andArgument_.get(i2));
        }
        for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
            iKowloon += CodedOutputStream.molybdenite(7, this.orArgument_.get(i3));
        }
        int size = iKowloon + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getValueParameterReference() {
        return this.valueParameterReference_;
    }

    public boolean hasConstantValue() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasIsInstanceType() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasIsInstanceTypeId() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasValueParameterReference() {
        return (this.bitField0_ & 2) == 2;
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
        if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getAndArgumentCount(); i++) {
            if (!getAndArgument(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
            if (!getOrArgument(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.cultivated(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.cultivated(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.walach(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.milliradian(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.cultivated(5, this.isInstanceTypeId_);
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            codedOutputStream.milliradian(6, this.andArgument_.get(i));
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            codedOutputStream.milliradian(7, this.orArgument_.get(i2));
        }
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$Expression protoBuf$Expression) {
        return newBuilder().beachfront(protoBuf$Expression);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Expression getDefaultInstanceForType() {
        return f30878kowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Expression(GeneratedMessageLite.saneness sanenessVar) {
        super(sanenessVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = sanenessVar.marial();
    }

    public ProtoBuf$Expression(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$Expression(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        saneness();
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
                            this.flags_ = marialVar.molybdenite();
                        } else if (iPolder == 16) {
                            this.bitField0_ |= 2;
                            this.valueParameterReference_ = marialVar.molybdenite();
                        } else if (iPolder == 24) {
                            int iTriweekly = marialVar.triweekly();
                            ConstantValue constantValueValueOf = ConstantValue.valueOf(iTriweekly);
                            if (constantValueValueOf == null) {
                                codedOutputStreamMerc.sensatory(iPolder);
                                codedOutputStreamMerc.sensatory(iTriweekly);
                            } else {
                                this.bitField0_ |= 4;
                                this.constantValue_ = constantValueValueOf;
                            }
                        } else if (iPolder == 34) {
                            ProtoBuf$Type.saneness builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar);
                            this.isInstanceType_ = protoBuf$Type;
                            if (builder != null) {
                                builder.beachfront(protoBuf$Type);
                                this.isInstanceType_ = builder.kowloon();
                            }
                            this.bitField0_ |= 8;
                        } else if (iPolder == 40) {
                            this.bitField0_ |= 16;
                            this.isInstanceTypeId_ = marialVar.molybdenite();
                        } else if (iPolder == 50) {
                            if ((i & 32) != 32) {
                                this.andArgument_ = new ArrayList();
                                i |= 32;
                            }
                            this.andArgument_.add((ProtoBuf$Expression) marialVar.adultoid(PARSER, beachfrontVar));
                        } else if (iPolder != 58) {
                            if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                            }
                        } else {
                            if ((i & 64) != 64) {
                                this.orArgument_ = new ArrayList();
                                i |= 64;
                            }
                            this.orArgument_.add((ProtoBuf$Expression) marialVar.adultoid(PARSER, beachfrontVar));
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((i & 32) == 32) {
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                }
                if ((i & 64) == 64) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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
        if ((i & 32) == 32) {
            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
        }
        if ((i & 64) == 64) {
            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.saneness<ProtoBuf$Expression, saneness> implements kowloon {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public int f30881adultoid;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f30882arytenoidectomy;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public List<ProtoBuf$Expression> f30883dovishness;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public List<ProtoBuf$Expression> f30884gintrap;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f30887monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f30888polloi;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public ConstantValue f30886molybdenite = ConstantValue.TRUE;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public ProtoBuf$Type f30885graveside = ProtoBuf$Type.getDefaultInstance();

        public saneness() {
            List<ProtoBuf$Expression> list = Collections.EMPTY_LIST;
            this.f30883dovishness = list;
            this.f30884gintrap = list;
            monoploid();
        }

        public static saneness impassible() {
            return new saneness();
        }

        public saneness adultoid(ConstantValue constantValue) {
            constantValue.getClass();
            this.f30882arytenoidectomy |= 4;
            this.f30886molybdenite = constantValue;
            return this;
        }

        public ProtoBuf$Expression apical() {
            ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(this);
            int i = this.f30882arytenoidectomy;
            int i2 = (i & 1) != 1 ? 0 : 1;
            protoBuf$Expression.flags_ = this.f30887monoploid;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$Expression.valueParameterReference_ = this.f30888polloi;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$Expression.constantValue_ = this.f30886molybdenite;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$Expression.isInstanceType_ = this.f30885graveside;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$Expression.isInstanceTypeId_ = this.f30881adultoid;
            if ((this.f30882arytenoidectomy & 32) == 32) {
                this.f30883dovishness = Collections.unmodifiableList(this.f30883dovishness);
                this.f30882arytenoidectomy &= -33;
            }
            protoBuf$Expression.andArgument_ = this.f30883dovishness;
            if ((this.f30882arytenoidectomy & 64) == 64) {
                this.f30884gintrap = Collections.unmodifiableList(this.f30884gintrap);
                this.f30882arytenoidectomy &= -65;
            }
            protoBuf$Expression.orArgument_ = this.f30884gintrap;
            protoBuf$Expression.bitField0_ = i2;
            return protoBuf$Expression;
        }

        public saneness dovishness(int i) {
            this.f30882arytenoidectomy |= 1;
            this.f30887monoploid = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return impassible().beachfront(apical());
        }

        public saneness gintrap(int i) {
            this.f30882arytenoidectomy |= 16;
            this.f30881adultoid = i;
            return this;
        }

        public saneness graveside(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30882arytenoidectomy & 8) != 8 || this.f30885graveside == ProtoBuf$Type.getDefaultInstance()) {
                this.f30885graveside = protoBuf$Type;
            } else {
                this.f30885graveside = ProtoBuf$Type.newBuilder(this.f30885graveside).beachfront(protoBuf$Type).kowloon();
            }
            this.f30882arytenoidectomy |= 8;
            return this;
        }

        public final void kowloon() {
            if ((this.f30882arytenoidectomy & 64) != 64) {
                this.f30884gintrap = new ArrayList(this.f30884gintrap);
                this.f30882arytenoidectomy |= 64;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$Expression protoBuf$Expression = null;
            try {
                try {
                    ProtoBuf$Expression protoBuf$ExpressionDern = ProtoBuf$Expression.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$ExpressionDern != null) {
                        beachfront(protoBuf$ExpressionDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$Expression != null) {
                        beachfront(protoBuf$Expression);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Expression protoBuf$Expression2 = (ProtoBuf$Expression) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Expression = protoBuf$Expression2;
                    if (protoBuf$Expression != null) {
                        beachfront(protoBuf$Expression);
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$Expression protoBuf$Expression) {
            if (protoBuf$Expression == ProtoBuf$Expression.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Expression.hasFlags()) {
                dovishness(protoBuf$Expression.getFlags());
            }
            if (protoBuf$Expression.hasValueParameterReference()) {
                rotuma(protoBuf$Expression.getValueParameterReference());
            }
            if (protoBuf$Expression.hasConstantValue()) {
                adultoid(protoBuf$Expression.getConstantValue());
            }
            if (protoBuf$Expression.hasIsInstanceType()) {
                graveside(protoBuf$Expression.getIsInstanceType());
            }
            if (protoBuf$Expression.hasIsInstanceTypeId()) {
                gintrap(protoBuf$Expression.getIsInstanceTypeId());
            }
            if (!protoBuf$Expression.andArgument_.isEmpty()) {
                if (this.f30883dovishness.isEmpty()) {
                    this.f30883dovishness = protoBuf$Expression.andArgument_;
                    this.f30882arytenoidectomy &= -33;
                } else {
                    triweekly();
                    this.f30883dovishness.addAll(protoBuf$Expression.andArgument_);
                }
            }
            if (!protoBuf$Expression.orArgument_.isEmpty()) {
                if (this.f30884gintrap.isEmpty()) {
                    this.f30884gintrap = protoBuf$Expression.orArgument_;
                    this.f30882arytenoidectomy &= -65;
                } else {
                    kowloon();
                    this.f30884gintrap.addAll(protoBuf$Expression.orArgument_);
                }
            }
            competently(marial().dern(protoBuf$Expression.unknownFields));
            return this;
        }

        public saneness rotuma(int i) {
            this.f30882arytenoidectomy |= 2;
            this.f30888polloi = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Expression build() {
            ProtoBuf$Expression protoBuf$ExpressionApical = apical();
            if (protoBuf$ExpressionApical.isInitialized()) {
                return protoBuf$ExpressionApical;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$ExpressionApical);
        }

        public final void triweekly() {
            if ((this.f30882arytenoidectomy & 32) != 32) {
                this.f30883dovishness = new ArrayList(this.f30883dovishness);
                this.f30882arytenoidectomy |= 32;
            }
        }

        private void monoploid() {
        }
    }
}
