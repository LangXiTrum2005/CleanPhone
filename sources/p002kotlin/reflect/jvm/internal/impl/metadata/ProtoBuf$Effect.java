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
public final class ProtoBuf$Effect extends GeneratedMessageLite implements kowloon {
    public static arytenoidectomy<ProtoBuf$Effect> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$Effect f30865kowloon;
    private int bitField0_;
    private ProtoBuf$Expression conclusionOfConditionalEffect_;
    private List<ProtoBuf$Expression> effectConstructorArgument_;
    private EffectType effectType_;
    private InvocationKind kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final wireman unknownFields;

    public enum EffectType implements impromptu.attabal {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static impromptu.saneness<EffectType> f30867kowloon = new attabal();
        private final int value;

        public static class attabal implements impromptu.saneness<EffectType> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public EffectType findValueByNumber(int i) {
                return EffectType.valueOf(i);
            }
        }

        EffectType(int i, int i2) {
            this.value = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
        public final int getNumber() {
            return this.value;
        }

        public static EffectType valueOf(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }
    }

    public enum InvocationKind implements impromptu.attabal {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static impromptu.saneness<InvocationKind> f30869kowloon = new attabal();
        private final int value;

        public static class attabal implements impromptu.saneness<InvocationKind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public InvocationKind findValueByNumber(int i) {
                return InvocationKind.valueOf(i);
            }
        }

        InvocationKind(int i, int i2) {
            this.value = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
        public final int getNumber() {
            return this.value;
        }

        public static InvocationKind valueOf(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }
    }

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$Effect> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Effect dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Effect(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(true);
        f30865kowloon = protoBuf$Effect;
        protoBuf$Effect.saneness();
    }

    public static ProtoBuf$Effect getDefaultInstance() {
        return f30865kowloon;
    }

    public static saneness newBuilder() {
        return saneness.impassible();
    }

    private void saneness() {
        this.effectType_ = EffectType.RETURNS_CONSTANT;
        this.effectConstructorArgument_ = Collections.EMPTY_LIST;
        this.conclusionOfConditionalEffect_ = ProtoBuf$Expression.getDefaultInstance();
        this.kind_ = InvocationKind.AT_MOST_ONCE;
    }

    public ProtoBuf$Expression getConclusionOfConditionalEffect() {
        return this.conclusionOfConditionalEffect_;
    }

    public ProtoBuf$Expression getEffectConstructorArgument(int i) {
        return this.effectConstructorArgument_.get(i);
    }

    public int getEffectConstructorArgumentCount() {
        return this.effectConstructorArgument_.size();
    }

    public EffectType getEffectType() {
        return this.effectType_;
    }

    public InvocationKind getKind() {
        return this.kind_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$Effect> getParserForType() {
        return PARSER;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iImpromptu = (this.bitField0_ & 1) == 1 ? CodedOutputStream.impromptu(1, this.effectType_.getNumber()) : 0;
        for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
            iImpromptu += CodedOutputStream.molybdenite(2, this.effectConstructorArgument_.get(i2));
        }
        if ((this.bitField0_ & 2) == 2) {
            iImpromptu += CodedOutputStream.molybdenite(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iImpromptu += CodedOutputStream.impromptu(4, this.kind_.getNumber());
        }
        int size = iImpromptu + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasConclusionOfConditionalEffect() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasEffectType() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasKind() {
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
        for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
            if (!getEffectConstructorArgument(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
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
            codedOutputStream.walach(1, this.effectType_.getNumber());
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            codedOutputStream.milliradian(2, this.effectConstructorArgument_.get(i));
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.milliradian(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.walach(4, this.kind_.getNumber());
        }
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$Effect protoBuf$Effect) {
        return newBuilder().beachfront(protoBuf$Effect);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Effect getDefaultInstanceForType() {
        return f30865kowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Effect(GeneratedMessageLite.saneness sanenessVar) {
        super(sanenessVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = sanenessVar.marial();
    }

    public ProtoBuf$Effect(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$Effect(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        saneness();
        wireman.saneness sanenessVarArytenoidectomy = wireman.arytenoidectomy();
        CodedOutputStream codedOutputStreamMerc = CodedOutputStream.merc(sanenessVarArytenoidectomy, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iPolder = marialVar.polder();
                    if (iPolder != 0) {
                        if (iPolder == 8) {
                            int iTriweekly = marialVar.triweekly();
                            EffectType effectTypeValueOf = EffectType.valueOf(iTriweekly);
                            if (effectTypeValueOf == null) {
                                codedOutputStreamMerc.sensatory(iPolder);
                                codedOutputStreamMerc.sensatory(iTriweekly);
                            } else {
                                this.bitField0_ |= 1;
                                this.effectType_ = effectTypeValueOf;
                            }
                        } else if (iPolder == 18) {
                            if ((c & 2) != 2) {
                                this.effectConstructorArgument_ = new ArrayList();
                                c = 2;
                            }
                            this.effectConstructorArgument_.add((ProtoBuf$Expression) marialVar.adultoid(ProtoBuf$Expression.PARSER, beachfrontVar));
                        } else if (iPolder == 26) {
                            ProtoBuf$Expression.saneness builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                            ProtoBuf$Expression protoBuf$Expression = (ProtoBuf$Expression) marialVar.adultoid(ProtoBuf$Expression.PARSER, beachfrontVar);
                            this.conclusionOfConditionalEffect_ = protoBuf$Expression;
                            if (builder != null) {
                                builder.beachfront(protoBuf$Expression);
                                this.conclusionOfConditionalEffect_ = builder.apical();
                            }
                            this.bitField0_ |= 2;
                        } else if (iPolder != 32) {
                            if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                            }
                        } else {
                            int iTriweekly2 = marialVar.triweekly();
                            InvocationKind invocationKindValueOf = InvocationKind.valueOf(iTriweekly2);
                            if (invocationKindValueOf == null) {
                                codedOutputStreamMerc.sensatory(iPolder);
                                codedOutputStreamMerc.sensatory(iTriweekly2);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = invocationKindValueOf;
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
                if ((c & 2) == 2) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
        if ((c & 2) == 2) {
            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.saneness<ProtoBuf$Effect, saneness> implements kowloon {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f30870arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public EffectType f30873monoploid = EffectType.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public List<ProtoBuf$Expression> f30874polloi = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public ProtoBuf$Expression f30872molybdenite = ProtoBuf$Expression.getDefaultInstance();

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public InvocationKind f30871graveside = InvocationKind.AT_MOST_ONCE;

        public saneness() {
            kowloon();
        }

        public static saneness impassible() {
            return new saneness();
        }

        public saneness adultoid(InvocationKind invocationKind) {
            invocationKind.getClass();
            this.f30870arytenoidectomy |= 8;
            this.f30871graveside = invocationKind;
            return this;
        }

        public ProtoBuf$Effect apical() {
            ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(this);
            int i = this.f30870arytenoidectomy;
            int i2 = (i & 1) != 1 ? 0 : 1;
            protoBuf$Effect.effectType_ = this.f30873monoploid;
            if ((this.f30870arytenoidectomy & 2) == 2) {
                this.f30874polloi = Collections.unmodifiableList(this.f30874polloi);
                this.f30870arytenoidectomy &= -3;
            }
            protoBuf$Effect.effectConstructorArgument_ = this.f30874polloi;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            protoBuf$Effect.conclusionOfConditionalEffect_ = this.f30872molybdenite;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            protoBuf$Effect.kind_ = this.f30871graveside;
            protoBuf$Effect.bitField0_ = i2;
            return protoBuf$Effect;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return impassible().beachfront(apical());
        }

        public saneness graveside(EffectType effectType) {
            effectType.getClass();
            this.f30870arytenoidectomy |= 1;
            this.f30873monoploid = effectType;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$Effect protoBuf$Effect = null;
            try {
                try {
                    ProtoBuf$Effect protoBuf$EffectDern = ProtoBuf$Effect.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$EffectDern != null) {
                        beachfront(protoBuf$EffectDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$Effect != null) {
                        beachfront(protoBuf$Effect);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Effect protoBuf$Effect2 = (ProtoBuf$Effect) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Effect = protoBuf$Effect2;
                    if (protoBuf$Effect != null) {
                        beachfront(protoBuf$Effect);
                    }
                    throw th;
                }
            }
        }

        public saneness monoploid(ProtoBuf$Expression protoBuf$Expression) {
            if ((this.f30870arytenoidectomy & 4) != 4 || this.f30872molybdenite == ProtoBuf$Expression.getDefaultInstance()) {
                this.f30872molybdenite = protoBuf$Expression;
            } else {
                this.f30872molybdenite = ProtoBuf$Expression.newBuilder(this.f30872molybdenite).beachfront(protoBuf$Expression).apical();
            }
            this.f30870arytenoidectomy |= 4;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$Effect protoBuf$Effect) {
            if (protoBuf$Effect == ProtoBuf$Effect.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Effect.hasEffectType()) {
                graveside(protoBuf$Effect.getEffectType());
            }
            if (!protoBuf$Effect.effectConstructorArgument_.isEmpty()) {
                if (this.f30874polloi.isEmpty()) {
                    this.f30874polloi = protoBuf$Effect.effectConstructorArgument_;
                    this.f30870arytenoidectomy &= -3;
                } else {
                    triweekly();
                    this.f30874polloi.addAll(protoBuf$Effect.effectConstructorArgument_);
                }
            }
            if (protoBuf$Effect.hasConclusionOfConditionalEffect()) {
                monoploid(protoBuf$Effect.getConclusionOfConditionalEffect());
            }
            if (protoBuf$Effect.hasKind()) {
                adultoid(protoBuf$Effect.getKind());
            }
            competently(marial().dern(protoBuf$Effect.unknownFields));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Effect build() {
            ProtoBuf$Effect protoBuf$EffectApical = apical();
            if (protoBuf$EffectApical.isInitialized()) {
                return protoBuf$EffectApical;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$EffectApical);
        }

        public final void triweekly() {
            if ((this.f30870arytenoidectomy & 2) != 2) {
                this.f30874polloi = new ArrayList(this.f30874polloi);
                this.f30870arytenoidectomy |= 2;
            }
        }

        private void kowloon() {
        }
    }
}
