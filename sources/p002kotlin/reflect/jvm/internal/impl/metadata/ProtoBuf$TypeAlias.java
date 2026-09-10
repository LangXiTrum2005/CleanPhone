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
public final class ProtoBuf$TypeAlias extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeAlias> implements kowloon {
    public static arytenoidectomy<ProtoBuf$TypeAlias> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$TypeAlias f30974kowloon;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private int expandedTypeId_;
    private ProtoBuf$Type expandedType_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private List<ProtoBuf$TypeParameter> typeParameter_;
    private int underlyingTypeId_;
    private ProtoBuf$Type underlyingType_;
    private final wireman unknownFields;
    private List<Integer> versionRequirement_;

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$TypeAlias> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$TypeAlias dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeAlias(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(true);
        f30974kowloon = protoBuf$TypeAlias;
        protoBuf$TypeAlias.dern();
    }

    private void dern() {
        this.flags_ = 6;
        this.name_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.underlyingType_ = ProtoBuf$Type.getDefaultInstance();
        this.underlyingTypeId_ = 0;
        this.expandedType_ = ProtoBuf$Type.getDefaultInstance();
        this.expandedTypeId_ = 0;
        this.annotation_ = list;
        this.versionRequirement_ = list;
    }

    public static ProtoBuf$TypeAlias getDefaultInstance() {
        return f30974kowloon;
    }

    public static saneness newBuilder() {
        return saneness.polloi();
    }

    public static ProtoBuf$TypeAlias parseDelimitedFrom(InputStream inputStream, beachfront beachfrontVar) throws IOException {
        return PARSER.wireman(inputStream, beachfrontVar);
    }

    public ProtoBuf$Annotation getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public List<ProtoBuf$Annotation> getAnnotationList() {
        return this.annotation_;
    }

    public ProtoBuf$Type getExpandedType() {
        return this.expandedType_;
    }

    public int getExpandedTypeId() {
        return this.expandedTypeId_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$TypeAlias> getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iKowloon += CodedOutputStream.kowloon(2, this.name_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iKowloon += CodedOutputStream.molybdenite(3, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 4) == 4) {
            iKowloon += CodedOutputStream.molybdenite(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iKowloon += CodedOutputStream.kowloon(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iKowloon += CodedOutputStream.molybdenite(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iKowloon += CodedOutputStream.kowloon(7, this.expandedTypeId_);
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iKowloon += CodedOutputStream.molybdenite(8, this.annotation_.get(i3));
        }
        int iArytenoidectomy = 0;
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            iArytenoidectomy += CodedOutputStream.arytenoidectomy(this.versionRequirement_.get(i4).intValue());
        }
        int size = iKowloon + iArytenoidectomy + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
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

    public ProtoBuf$Type getUnderlyingType() {
        return this.underlyingType_;
    }

    public int getUnderlyingTypeId() {
        return this.underlyingTypeId_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasExpandedType() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasExpandedTypeId() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasUnderlyingType() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasUnderlyingTypeId() {
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
        if (!hasName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasExpandedType() && !getExpandedType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
            if (!getAnnotation(i2).isInitialized()) {
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
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.cultivated(2, this.name_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            codedOutputStream.milliradian(3, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.milliradian(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.cultivated(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.milliradian(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.cultivated(7, this.expandedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            codedOutputStream.milliradian(8, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            codedOutputStream.cultivated(31, this.versionRequirement_.get(i3).intValue());
        }
        attabalVarNewExtensionWriter.attabal(200, codedOutputStream);
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        return newBuilder().beachfront(protoBuf$TypeAlias);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$TypeAlias getDefaultInstanceForType() {
        return f30974kowloon;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$TypeAlias(GeneratedMessageLite.dern<ProtoBuf$TypeAlias, ?> dernVar) {
        super(dernVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = dernVar.marial();
    }

    public ProtoBuf$TypeAlias(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$TypeAlias(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        ProtoBuf$Type.saneness builder;
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
                            this.bitField0_ |= 1;
                            this.flags_ = marialVar.molybdenite();
                            continue;
                        case 16:
                            this.bitField0_ |= 2;
                            this.name_ = marialVar.molybdenite();
                            continue;
                        case 26:
                            if ((i & 4) != 4) {
                                this.typeParameter_ = new ArrayList();
                                i |= 4;
                            }
                            this.typeParameter_.add((ProtoBuf$TypeParameter) marialVar.adultoid(ProtoBuf$TypeParameter.PARSER, beachfrontVar));
                            continue;
                        case 34:
                            builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar);
                            this.underlyingType_ = protoBuf$Type;
                            if (builder != null) {
                                builder.beachfront(protoBuf$Type);
                                this.underlyingType_ = builder.kowloon();
                            }
                            this.bitField0_ |= 4;
                            continue;
                        case 40:
                            this.bitField0_ |= 8;
                            this.underlyingTypeId_ = marialVar.molybdenite();
                            continue;
                        case 50:
                            builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) marialVar.adultoid(ProtoBuf$Type.PARSER, beachfrontVar);
                            this.expandedType_ = protoBuf$Type2;
                            if (builder != null) {
                                builder.beachfront(protoBuf$Type2);
                                this.expandedType_ = builder.kowloon();
                            }
                            this.bitField0_ |= 16;
                            continue;
                        case 56:
                            this.bitField0_ |= 32;
                            this.expandedTypeId_ = marialVar.molybdenite();
                            continue;
                        case 66:
                            if ((i & 128) != 128) {
                                this.annotation_ = new ArrayList();
                                i |= 128;
                            }
                            this.annotation_.add((ProtoBuf$Annotation) marialVar.adultoid(ProtoBuf$Annotation.PARSER, beachfrontVar));
                            continue;
                        case 248:
                            if ((i & 256) != 256) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 256;
                            }
                            this.versionRequirement_.add(Integer.valueOf(marialVar.molybdenite()));
                            continue;
                        case AdSize.MEDIUM_RECTANGLE_HEIGHT /* 250 */:
                            int iCutely = marialVar.cutely(marialVar.cuirassed());
                            if ((i & 256) != 256 && marialVar.marial() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 256;
                            }
                            while (marialVar.marial() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(marialVar.molybdenite()));
                            }
                            marialVar.taiyuan(iCutely);
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
                if ((i & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i & 128) == 128) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i & 256) == 256) {
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
        if ((i & 4) == 4) {
            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
        }
        if ((i & 128) == 128) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
        }
        if ((i & 256) == 256) {
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

    public static final class saneness extends GeneratedMessageLite.dern<ProtoBuf$TypeAlias, saneness> implements kowloon {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public List<ProtoBuf$TypeParameter> f30975adultoid;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public List<ProtoBuf$Annotation> f30976cord;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public List<Integer> f30977cuirassed;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public ProtoBuf$Type f30978dovishness;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public int f30979gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f30980graveside;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f30981molybdenite = 6;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f30982polloi;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public int f30983preprohormone;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public ProtoBuf$Type f30984rotuma;

        public saneness() {
            List list = Collections.EMPTY_LIST;
            this.f30975adultoid = list;
            this.f30978dovishness = ProtoBuf$Type.getDefaultInstance();
            this.f30984rotuma = ProtoBuf$Type.getDefaultInstance();
            this.f30976cord = list;
            this.f30977cuirassed = list;
            dovishness();
        }

        private void adultoid() {
            if ((this.f30982polloi & 256) != 256) {
                this.f30977cuirassed = new ArrayList(this.f30977cuirassed);
                this.f30982polloi |= 256;
            }
        }

        private void graveside() {
            if ((this.f30982polloi & 4) != 4) {
                this.f30975adultoid = new ArrayList(this.f30975adultoid);
                this.f30982polloi |= 4;
            }
        }

        public static saneness polloi() {
            return new saneness();
        }

        public saneness cord(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30982polloi & 8) != 8 || this.f30978dovishness == ProtoBuf$Type.getDefaultInstance()) {
                this.f30978dovishness = protoBuf$Type;
            } else {
                this.f30978dovishness = ProtoBuf$Type.newBuilder(this.f30978dovishness).beachfront(protoBuf$Type).kowloon();
            }
            this.f30982polloi |= 8;
            return this;
        }

        public saneness cuirassed(int i) {
            this.f30982polloi |= 64;
            this.f30983preprohormone = i;
            return this;
        }

        public saneness gintrap(ProtoBuf$Type protoBuf$Type) {
            if ((this.f30982polloi & 32) != 32 || this.f30984rotuma == ProtoBuf$Type.getDefaultInstance()) {
                this.f30984rotuma = protoBuf$Type;
            } else {
                this.f30984rotuma = ProtoBuf$Type.newBuilder(this.f30984rotuma).beachfront(protoBuf$Type).kowloon();
            }
            this.f30982polloi |= 32;
            return this;
        }

        public ProtoBuf$TypeAlias kowloon() {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(this);
            int i = this.f30982polloi;
            int i2 = (i & 1) != 1 ? 0 : 1;
            protoBuf$TypeAlias.flags_ = this.f30981molybdenite;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$TypeAlias.name_ = this.f30980graveside;
            if ((this.f30982polloi & 4) == 4) {
                this.f30975adultoid = Collections.unmodifiableList(this.f30975adultoid);
                this.f30982polloi &= -5;
            }
            protoBuf$TypeAlias.typeParameter_ = this.f30975adultoid;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            protoBuf$TypeAlias.underlyingType_ = this.f30978dovishness;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            protoBuf$TypeAlias.underlyingTypeId_ = this.f30979gintrap;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            protoBuf$TypeAlias.expandedType_ = this.f30984rotuma;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            protoBuf$TypeAlias.expandedTypeId_ = this.f30983preprohormone;
            if ((this.f30982polloi & 128) == 128) {
                this.f30976cord = Collections.unmodifiableList(this.f30976cord);
                this.f30982polloi &= -129;
            }
            protoBuf$TypeAlias.annotation_ = this.f30976cord;
            if ((this.f30982polloi & 256) == 256) {
                this.f30977cuirassed = Collections.unmodifiableList(this.f30977cuirassed);
                this.f30982polloi &= -257;
            }
            protoBuf$TypeAlias.versionRequirement_ = this.f30977cuirassed;
            protoBuf$TypeAlias.bitField0_ = i2;
            return protoBuf$TypeAlias;
        }

        public final void molybdenite() {
            if ((this.f30982polloi & 128) != 128) {
                this.f30976cord = new ArrayList(this.f30976cord);
                this.f30982polloi |= 128;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return polloi().beachfront(kowloon());
        }

        public saneness oilcan(int i) {
            this.f30982polloi |= 16;
            this.f30979gintrap = i;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: preprohormone, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = null;
            try {
                try {
                    ProtoBuf$TypeAlias protoBuf$TypeAliasDern = ProtoBuf$TypeAlias.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$TypeAliasDern != null) {
                        beachfront(protoBuf$TypeAliasDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$TypeAlias != null) {
                        beachfront(protoBuf$TypeAlias);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$TypeAlias protoBuf$TypeAlias2 = (ProtoBuf$TypeAlias) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$TypeAlias = protoBuf$TypeAlias2;
                    if (protoBuf$TypeAlias != null) {
                        beachfront(protoBuf$TypeAlias);
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
            if (protoBuf$TypeAlias == ProtoBuf$TypeAlias.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$TypeAlias.hasFlags()) {
                stratoscope(protoBuf$TypeAlias.getFlags());
            }
            if (protoBuf$TypeAlias.hasName()) {
                trm(protoBuf$TypeAlias.getName());
            }
            if (!protoBuf$TypeAlias.typeParameter_.isEmpty()) {
                if (this.f30975adultoid.isEmpty()) {
                    this.f30975adultoid = protoBuf$TypeAlias.typeParameter_;
                    this.f30982polloi &= -5;
                } else {
                    graveside();
                    this.f30975adultoid.addAll(protoBuf$TypeAlias.typeParameter_);
                }
            }
            if (protoBuf$TypeAlias.hasUnderlyingType()) {
                cord(protoBuf$TypeAlias.getUnderlyingType());
            }
            if (protoBuf$TypeAlias.hasUnderlyingTypeId()) {
                oilcan(protoBuf$TypeAlias.getUnderlyingTypeId());
            }
            if (protoBuf$TypeAlias.hasExpandedType()) {
                gintrap(protoBuf$TypeAlias.getExpandedType());
            }
            if (protoBuf$TypeAlias.hasExpandedTypeId()) {
                cuirassed(protoBuf$TypeAlias.getExpandedTypeId());
            }
            if (!protoBuf$TypeAlias.annotation_.isEmpty()) {
                if (this.f30976cord.isEmpty()) {
                    this.f30976cord = protoBuf$TypeAlias.annotation_;
                    this.f30982polloi &= -129;
                } else {
                    molybdenite();
                    this.f30976cord.addAll(protoBuf$TypeAlias.annotation_);
                }
            }
            if (!protoBuf$TypeAlias.versionRequirement_.isEmpty()) {
                if (this.f30977cuirassed.isEmpty()) {
                    this.f30977cuirassed = protoBuf$TypeAlias.versionRequirement_;
                    this.f30982polloi &= -257;
                } else {
                    adultoid();
                    this.f30977cuirassed.addAll(protoBuf$TypeAlias.versionRequirement_);
                }
            }
            formularize(protoBuf$TypeAlias);
            competently(marial().dern(protoBuf$TypeAlias.unknownFields));
            return this;
        }

        public saneness stratoscope(int i) {
            this.f30982polloi |= 1;
            this.f30981molybdenite = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$TypeAlias build() {
            ProtoBuf$TypeAlias protoBuf$TypeAliasKowloon = kowloon();
            if (protoBuf$TypeAliasKowloon.isInitialized()) {
                return protoBuf$TypeAliasKowloon;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$TypeAliasKowloon);
        }

        public saneness trm(int i) {
            this.f30982polloi |= 2;
            this.f30980graveside = i;
            return this;
        }

        private void dovishness() {
        }
    }
}
