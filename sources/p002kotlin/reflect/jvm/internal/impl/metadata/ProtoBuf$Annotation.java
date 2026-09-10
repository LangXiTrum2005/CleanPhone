package p002kotlin.reflect.jvm.internal.impl.metadata;

import com.unity3d.services.UnityAdsConstants;
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
public final class ProtoBuf$Annotation extends GeneratedMessageLite implements kowloon {
    public static arytenoidectomy<ProtoBuf$Annotation> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$Annotation f30806kowloon;
    private List<Argument> argument_;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final wireman unknownFields;

    public static final class Argument extends GeneratedMessageLite implements kowloon {
        public static arytenoidectomy<Argument> PARSER = new attabal();

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final Argument f30807kowloon;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int nameId_;
        private final wireman unknownFields;
        private Value value_;

        public static final class Value extends GeneratedMessageLite implements kowloon {
            public static arytenoidectomy<Value> PARSER = new attabal();

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public static final Value f30808kowloon;
            private ProtoBuf$Annotation annotation_;
            private int arrayDimensionCount_;
            private List<Value> arrayElement_;
            private int bitField0_;
            private int classId_;
            private double doubleValue_;
            private int enumValueId_;
            private int flags_;
            private float floatValue_;
            private long intValue_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int stringValue_;
            private Type type_;
            private final wireman unknownFields;

            public enum Type implements impromptu.attabal {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public static impromptu.saneness<Type> f30810kowloon = new attabal();
                private final int value;

                public static class attabal implements impromptu.saneness<Type> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
                    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
                    public Type findValueByNumber(int i) {
                        return Type.valueOf(i);
                    }
                }

                Type(int i, int i2) {
                    this.value = i2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
                public final int getNumber() {
                    return this.value;
                }

                public static Type valueOf(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }
            }

            public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<Value> {
                @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
                /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
                public Value dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
                    return new Value(marialVar, beachfrontVar);
                }
            }

            static {
                Value value = new Value(true);
                f30808kowloon = value;
                value.saneness();
            }

            public static Value getDefaultInstance() {
                return f30808kowloon;
            }

            public static saneness newBuilder() {
                return saneness.impassible();
            }

            public ProtoBuf$Annotation getAnnotation() {
                return this.annotation_;
            }

            public int getArrayDimensionCount() {
                return this.arrayDimensionCount_;
            }

            public Value getArrayElement(int i) {
                return this.arrayElement_.get(i);
            }

            public int getArrayElementCount() {
                return this.arrayElement_.size();
            }

            public List<Value> getArrayElementList() {
                return this.arrayElement_;
            }

            public int getClassId() {
                return this.classId_;
            }

            public double getDoubleValue() {
                return this.doubleValue_;
            }

            public int getEnumValueId() {
                return this.enumValueId_;
            }

            public int getFlags() {
                return this.flags_;
            }

            public float getFloatValue() {
                return this.floatValue_;
            }

            public long getIntValue() {
                return this.intValue_;
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
            public arytenoidectomy<Value> getParserForType() {
                return PARSER;
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iImpromptu = (this.bitField0_ & 1) == 1 ? CodedOutputStream.impromptu(1, this.type_.getNumber()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iImpromptu += CodedOutputStream.cuirassed(2, this.intValue_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iImpromptu += CodedOutputStream.formularize(3, this.floatValue_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    iImpromptu += CodedOutputStream.beachfront(4, this.doubleValue_);
                }
                if ((this.bitField0_ & 16) == 16) {
                    iImpromptu += CodedOutputStream.kowloon(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    iImpromptu += CodedOutputStream.kowloon(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    iImpromptu += CodedOutputStream.kowloon(7, this.enumValueId_);
                }
                if ((this.bitField0_ & 128) == 128) {
                    iImpromptu += CodedOutputStream.molybdenite(8, this.annotation_);
                }
                for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
                    iImpromptu += CodedOutputStream.molybdenite(9, this.arrayElement_.get(i2));
                }
                if ((this.bitField0_ & 512) == 512) {
                    iImpromptu += CodedOutputStream.kowloon(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    iImpromptu += CodedOutputStream.kowloon(11, this.arrayDimensionCount_);
                }
                int size = iImpromptu + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public int getStringValue() {
                return this.stringValue_;
            }

            public Type getType() {
                return this.type_;
            }

            public boolean hasAnnotation() {
                return (this.bitField0_ & 128) == 128;
            }

            public boolean hasArrayDimensionCount() {
                return (this.bitField0_ & 256) == 256;
            }

            public boolean hasClassId() {
                return (this.bitField0_ & 32) == 32;
            }

            public boolean hasDoubleValue() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasEnumValueId() {
                return (this.bitField0_ & 64) == 64;
            }

            public boolean hasFlags() {
                return (this.bitField0_ & 512) == 512;
            }

            public boolean hasFloatValue() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasIntValue() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasStringValue() {
                return (this.bitField0_ & 16) == 16;
            }

            public boolean hasType() {
                return (this.bitField0_ & 1) == 1;
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
                if (hasAnnotation() && !getAnnotation().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                for (int i = 0; i < getArrayElementCount(); i++) {
                    if (!getArrayElement(i).isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            public final void saneness() {
                this.type_ = Type.BYTE;
                this.intValue_ = 0L;
                this.floatValue_ = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.doubleValue_ = 0.0d;
                this.stringValue_ = 0;
                this.classId_ = 0;
                this.enumValueId_ = 0;
                this.annotation_ = ProtoBuf$Annotation.getDefaultInstance();
                this.arrayElement_ = Collections.EMPTY_LIST;
                this.arrayDimensionCount_ = 0;
                this.flags_ = 0;
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.walach(1, this.type_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.gusty(2, this.intValue_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.overspeculate(3, this.floatValue_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.starveling(4, this.doubleValue_);
                }
                if ((this.bitField0_ & 16) == 16) {
                    codedOutputStream.cultivated(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    codedOutputStream.cultivated(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    codedOutputStream.cultivated(7, this.enumValueId_);
                }
                if ((this.bitField0_ & 128) == 128) {
                    codedOutputStream.milliradian(8, this.annotation_);
                }
                for (int i = 0; i < this.arrayElement_.size(); i++) {
                    codedOutputStream.milliradian(9, this.arrayElement_.get(i));
                }
                if ((this.bitField0_ & 512) == 512) {
                    codedOutputStream.cultivated(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    codedOutputStream.cultivated(11, this.arrayDimensionCount_);
                }
                codedOutputStream.nosophobia(this.unknownFields);
            }

            public static saneness newBuilder(Value value) {
                return newBuilder().beachfront(value);
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Value getDefaultInstanceForType() {
                return f30808kowloon;
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
            public saneness newBuilderForType() {
                return newBuilder();
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
            public saneness toBuilder() {
                return newBuilder(this);
            }

            public Value(GeneratedMessageLite.saneness sanenessVar) {
                super(sanenessVar);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = sanenessVar.marial();
            }

            public Value(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = wireman.f31186kowloon;
            }

            public Value(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                            switch (iPolder) {
                                case 0:
                                    break;
                                case 8:
                                    int iTriweekly = marialVar.triweekly();
                                    Type typeValueOf = Type.valueOf(iTriweekly);
                                    if (typeValueOf == null) {
                                        codedOutputStreamMerc.sensatory(iPolder);
                                        codedOutputStreamMerc.sensatory(iTriweekly);
                                    } else {
                                        this.bitField0_ |= 1;
                                        this.type_ = typeValueOf;
                                        continue;
                                    }
                                    break;
                                case 16:
                                    this.bitField0_ |= 2;
                                    this.intValue_ = marialVar.supplicat();
                                    continue;
                                case 29:
                                    this.bitField0_ |= 4;
                                    this.floatValue_ = marialVar.monoploid();
                                    continue;
                                case 33:
                                    this.bitField0_ |= 8;
                                    this.doubleValue_ = marialVar.impassible();
                                    continue;
                                case 40:
                                    this.bitField0_ |= 16;
                                    this.stringValue_ = marialVar.molybdenite();
                                    continue;
                                case 48:
                                    this.bitField0_ |= 32;
                                    this.classId_ = marialVar.molybdenite();
                                    continue;
                                case 56:
                                    this.bitField0_ |= 64;
                                    this.enumValueId_ = marialVar.molybdenite();
                                    continue;
                                case 66:
                                    saneness builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                    ProtoBuf$Annotation protoBuf$Annotation = (ProtoBuf$Annotation) marialVar.adultoid(ProtoBuf$Annotation.PARSER, beachfrontVar);
                                    this.annotation_ = protoBuf$Annotation;
                                    if (builder != null) {
                                        builder.beachfront(protoBuf$Annotation);
                                        this.annotation_ = builder.apical();
                                    }
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    if ((c & 256) != 256) {
                                        this.arrayElement_ = new ArrayList();
                                        c = 256;
                                    }
                                    this.arrayElement_.add((Value) marialVar.adultoid(PARSER, beachfrontVar));
                                    continue;
                                case 80:
                                    this.bitField0_ |= 512;
                                    this.flags_ = marialVar.molybdenite();
                                    continue;
                                case 88:
                                    this.bitField0_ |= 256;
                                    this.arrayDimensionCount_ = marialVar.molybdenite();
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
                        if ((c & 256) == 256) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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
                if ((c & 256) == 256) {
                    this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                }
                try {
                    codedOutputStreamMerc.restrictive();
                } catch (IOException unused2) {
                } finally {
                    this.unknownFields = sanenessVarArytenoidectomy.cutely();
                }
                makeExtensionsImmutable();
            }

            public static final class saneness extends GeneratedMessageLite.saneness<Value, saneness> implements kowloon {

                /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
                public int f30811adultoid;

                /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
                public int f30812arytenoidectomy;

                /* JADX INFO: renamed from: cord, reason: collision with root package name */
                public int f30813cord;

                /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
                public int f30814cuirassed;

                /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
                public int f30815dovishness;

                /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
                public int f30816gintrap;

                /* JADX INFO: renamed from: graveside, reason: collision with root package name */
                public double f30817graveside;

                /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
                public float f30818molybdenite;

                /* JADX INFO: renamed from: polloi, reason: collision with root package name */
                public long f30820polloi;

                /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
                public Type f30819monoploid = Type.BYTE;

                /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
                public ProtoBuf$Annotation f30822rotuma = ProtoBuf$Annotation.getDefaultInstance();

                /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
                public List<Value> f30821preprohormone = Collections.EMPTY_LIST;

                public saneness() {
                    kowloon();
                }

                public static saneness impassible() {
                    return new saneness();
                }

                public saneness adultoid(int i) {
                    this.f30812arytenoidectomy |= 32;
                    this.f30815dovishness = i;
                    return this;
                }

                public Value apical() {
                    Value value = new Value(this);
                    int i = this.f30812arytenoidectomy;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    value.type_ = this.f30819monoploid;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    value.intValue_ = this.f30820polloi;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    value.floatValue_ = this.f30818molybdenite;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    value.doubleValue_ = this.f30817graveside;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    value.stringValue_ = this.f30811adultoid;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    value.classId_ = this.f30815dovishness;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    value.enumValueId_ = this.f30816gintrap;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    value.annotation_ = this.f30822rotuma;
                    if ((this.f30812arytenoidectomy & 256) == 256) {
                        this.f30821preprohormone = Collections.unmodifiableList(this.f30821preprohormone);
                        this.f30812arytenoidectomy &= -257;
                    }
                    value.arrayElement_ = this.f30821preprohormone;
                    if ((i & 512) == 512) {
                        i2 |= 256;
                    }
                    value.arrayDimensionCount_ = this.f30813cord;
                    if ((i & 1024) == 1024) {
                        i2 |= 512;
                    }
                    value.flags_ = this.f30814cuirassed;
                    value.bitField0_ = i2;
                    return value;
                }

                public saneness cord(long j) {
                    this.f30812arytenoidectomy |= 2;
                    this.f30820polloi = j;
                    return this;
                }

                public saneness cuirassed(int i) {
                    this.f30812arytenoidectomy |= 16;
                    this.f30811adultoid = i;
                    return this;
                }

                public saneness dovishness(double d) {
                    this.f30812arytenoidectomy |= 8;
                    this.f30817graveside = d;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
                /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
                public saneness wireman() {
                    return impassible().beachfront(apical());
                }

                public saneness gintrap(int i) {
                    this.f30812arytenoidectomy |= 64;
                    this.f30816gintrap = i;
                    return this;
                }

                public saneness graveside(int i) {
                    this.f30812arytenoidectomy |= 512;
                    this.f30813cord = i;
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
                /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
                public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
                    Value value = null;
                    try {
                        try {
                            Value valueDern = Value.PARSER.dern(marialVar, beachfrontVar);
                            if (valueDern != null) {
                                beachfront(valueDern);
                            }
                            return this;
                        } catch (Throwable th) {
                            th = th;
                            if (value != null) {
                                beachfront(value);
                            }
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        Value value2 = (Value) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            value = value2;
                            if (value != null) {
                                beachfront(value);
                            }
                            throw th;
                        }
                    }
                }

                public saneness monoploid(ProtoBuf$Annotation protoBuf$Annotation) {
                    if ((this.f30812arytenoidectomy & 128) != 128 || this.f30822rotuma == ProtoBuf$Annotation.getDefaultInstance()) {
                        this.f30822rotuma = protoBuf$Annotation;
                    } else {
                        this.f30822rotuma = ProtoBuf$Annotation.newBuilder(this.f30822rotuma).beachfront(protoBuf$Annotation).apical();
                    }
                    this.f30812arytenoidectomy |= 128;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
                /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
                public saneness beachfront(Value value) {
                    if (value == Value.getDefaultInstance()) {
                        return this;
                    }
                    if (value.hasType()) {
                        stratoscope(value.getType());
                    }
                    if (value.hasIntValue()) {
                        cord(value.getIntValue());
                    }
                    if (value.hasFloatValue()) {
                        preprohormone(value.getFloatValue());
                    }
                    if (value.hasDoubleValue()) {
                        dovishness(value.getDoubleValue());
                    }
                    if (value.hasStringValue()) {
                        cuirassed(value.getStringValue());
                    }
                    if (value.hasClassId()) {
                        adultoid(value.getClassId());
                    }
                    if (value.hasEnumValueId()) {
                        gintrap(value.getEnumValueId());
                    }
                    if (value.hasAnnotation()) {
                        monoploid(value.getAnnotation());
                    }
                    if (!value.arrayElement_.isEmpty()) {
                        if (this.f30821preprohormone.isEmpty()) {
                            this.f30821preprohormone = value.arrayElement_;
                            this.f30812arytenoidectomy &= -257;
                        } else {
                            triweekly();
                            this.f30821preprohormone.addAll(value.arrayElement_);
                        }
                    }
                    if (value.hasArrayDimensionCount()) {
                        graveside(value.getArrayDimensionCount());
                    }
                    if (value.hasFlags()) {
                        rotuma(value.getFlags());
                    }
                    competently(marial().dern(value.unknownFields));
                    return this;
                }

                public saneness preprohormone(float f) {
                    this.f30812arytenoidectomy |= 4;
                    this.f30818molybdenite = f;
                    return this;
                }

                public saneness rotuma(int i) {
                    this.f30812arytenoidectomy |= 1024;
                    this.f30814cuirassed = i;
                    return this;
                }

                public saneness stratoscope(Type type) {
                    type.getClass();
                    this.f30812arytenoidectomy |= 1;
                    this.f30819monoploid = type;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
                /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
                public Value build() {
                    Value valueApical = apical();
                    if (valueApical.isInitialized()) {
                        return valueApical;
                    }
                    throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(valueApical);
                }

                public final void triweekly() {
                    if ((this.f30812arytenoidectomy & 256) != 256) {
                        this.f30821preprohormone = new ArrayList(this.f30821preprohormone);
                        this.f30812arytenoidectomy |= 256;
                    }
                }

                private void kowloon() {
                }
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
            f30807kowloon = argument;
            argument.saneness();
        }

        public static Argument getDefaultInstance() {
            return f30807kowloon;
        }

        public static saneness newBuilder() {
            return saneness.impassible();
        }

        private void saneness() {
            this.nameId_ = 0;
            this.value_ = Value.getDefaultInstance();
        }

        public int getNameId() {
            return this.nameId_;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public arytenoidectomy<Argument> getParserForType() {
            return PARSER;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.nameId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iKowloon += CodedOutputStream.molybdenite(2, this.value_);
            }
            int size = iKowloon + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public Value getValue() {
            return this.value_;
        }

        public boolean hasNameId() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasValue() {
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
            if (!hasNameId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasValue()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getValue().isInitialized()) {
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
                codedOutputStream.cultivated(1, this.nameId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.milliradian(2, this.value_);
            }
            codedOutputStream.nosophobia(this.unknownFields);
        }

        public static saneness newBuilder(Argument argument) {
            return newBuilder().beachfront(argument);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Argument getDefaultInstanceForType() {
            return f30807kowloon;
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
                        int iPolder = marialVar.polder();
                        if (iPolder != 0) {
                            if (iPolder == 8) {
                                this.bitField0_ |= 1;
                                this.nameId_ = marialVar.molybdenite();
                            } else if (iPolder != 18) {
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                }
                            } else {
                                Value.saneness builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                Value value = (Value) marialVar.adultoid(Value.PARSER, beachfrontVar);
                                this.value_ = value;
                                if (builder != null) {
                                    builder.beachfront(value);
                                    this.value_ = builder.apical();
                                }
                                this.bitField0_ |= 2;
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

        public static final class saneness extends GeneratedMessageLite.saneness<Argument, saneness> implements kowloon {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public int f30823arytenoidectomy;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public int f30824monoploid;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public Value f30825polloi = Value.getDefaultInstance();

            public saneness() {
                triweekly();
            }

            public static saneness impassible() {
                return new saneness();
            }

            public Argument apical() {
                Argument argument = new Argument(this);
                int i = this.f30823arytenoidectomy;
                int i2 = (i & 1) != 1 ? 0 : 1;
                argument.nameId_ = this.f30824monoploid;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                argument.value_ = this.f30825polloi;
                argument.bitField0_ = i2;
                return argument;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
            public saneness wireman() {
                return impassible().beachfront(apical());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
            public saneness beachfront(Argument argument) {
                if (argument == Argument.getDefaultInstance()) {
                    return this;
                }
                if (argument.hasNameId()) {
                    molybdenite(argument.getNameId());
                }
                if (argument.hasValue()) {
                    polloi(argument.getValue());
                }
                competently(marial().dern(argument.unknownFields));
                return this;
            }

            public saneness molybdenite(int i) {
                this.f30823arytenoidectomy |= 1;
                this.f30824monoploid = i;
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

            public saneness polloi(Value value) {
                if ((this.f30823arytenoidectomy & 2) != 2 || this.f30825polloi == Value.getDefaultInstance()) {
                    this.f30825polloi = value;
                } else {
                    this.f30825polloi = Value.newBuilder(this.f30825polloi).beachfront(value).apical();
                }
                this.f30823arytenoidectomy |= 2;
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

            public final void triweekly() {
            }
        }
    }

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$Annotation> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Annotation dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Annotation(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation(true);
        f30806kowloon = protoBuf$Annotation;
        protoBuf$Annotation.saneness();
    }

    public static ProtoBuf$Annotation getDefaultInstance() {
        return f30806kowloon;
    }

    public static saneness newBuilder() {
        return saneness.impassible();
    }

    private void saneness() {
        this.id_ = 0;
        this.argument_ = Collections.EMPTY_LIST;
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

    public int getId() {
        return this.id_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$Annotation> getParserForType() {
        return PARSER;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.id_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iKowloon += CodedOutputStream.molybdenite(2, this.argument_.get(i2));
        }
        int size = iKowloon + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) == 1;
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
        if (!hasId()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getArgumentCount(); i++) {
            if (!getArgument(i).isInitialized()) {
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
            codedOutputStream.cultivated(1, this.id_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            codedOutputStream.milliradian(2, this.argument_.get(i));
        }
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$Annotation protoBuf$Annotation) {
        return newBuilder().beachfront(protoBuf$Annotation);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Annotation getDefaultInstanceForType() {
        return f30806kowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Annotation(GeneratedMessageLite.saneness sanenessVar) {
        super(sanenessVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = sanenessVar.marial();
    }

    public ProtoBuf$Annotation(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$Annotation(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                            this.bitField0_ |= 1;
                            this.id_ = marialVar.molybdenite();
                        } else if (iPolder != 18) {
                            if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                            }
                        } else {
                            if ((c & 2) != 2) {
                                this.argument_ = new ArrayList();
                                c = 2;
                            }
                            this.argument_.add((Argument) marialVar.adultoid(Argument.PARSER, beachfrontVar));
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
        if ((c & 2) == 2) {
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

    public static final class saneness extends GeneratedMessageLite.saneness<ProtoBuf$Annotation, saneness> implements kowloon {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f30826arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f30827monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public List<Argument> f30828polloi = Collections.EMPTY_LIST;

        public saneness() {
            kowloon();
        }

        public static saneness impassible() {
            return new saneness();
        }

        public ProtoBuf$Annotation apical() {
            ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation(this);
            int i = (this.f30826arytenoidectomy & 1) != 1 ? 0 : 1;
            protoBuf$Annotation.id_ = this.f30827monoploid;
            if ((this.f30826arytenoidectomy & 2) == 2) {
                this.f30828polloi = Collections.unmodifiableList(this.f30828polloi);
                this.f30826arytenoidectomy &= -3;
            }
            protoBuf$Annotation.argument_ = this.f30828polloi;
            protoBuf$Annotation.bitField0_ = i;
            return protoBuf$Annotation;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return impassible().beachfront(apical());
        }

        public saneness molybdenite(int i) {
            this.f30826arytenoidectomy |= 1;
            this.f30827monoploid = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$Annotation protoBuf$Annotation) {
            if (protoBuf$Annotation == ProtoBuf$Annotation.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Annotation.hasId()) {
                molybdenite(protoBuf$Annotation.getId());
            }
            if (!protoBuf$Annotation.argument_.isEmpty()) {
                if (this.f30828polloi.isEmpty()) {
                    this.f30828polloi = protoBuf$Annotation.argument_;
                    this.f30826arytenoidectomy &= -3;
                } else {
                    triweekly();
                    this.f30828polloi.addAll(protoBuf$Annotation.argument_);
                }
            }
            competently(marial().dern(protoBuf$Annotation.unknownFields));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$Annotation protoBuf$Annotation = null;
            try {
                try {
                    ProtoBuf$Annotation protoBuf$AnnotationDern = ProtoBuf$Annotation.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$AnnotationDern != null) {
                        beachfront(protoBuf$AnnotationDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$Annotation != null) {
                        beachfront(protoBuf$Annotation);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Annotation protoBuf$Annotation2 = (ProtoBuf$Annotation) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Annotation = protoBuf$Annotation2;
                    if (protoBuf$Annotation != null) {
                        beachfront(protoBuf$Annotation);
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Annotation build() {
            ProtoBuf$Annotation protoBuf$AnnotationApical = apical();
            if (protoBuf$AnnotationApical.isInitialized()) {
                return protoBuf$AnnotationApical;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$AnnotationApical);
        }

        public final void triweekly() {
            if ((this.f30826arytenoidectomy & 2) != 2) {
                this.f30828polloi = new ArrayList(this.f30828polloi);
                this.f30826arytenoidectomy |= 2;
            }
        }

        private void kowloon() {
        }
    }
}
