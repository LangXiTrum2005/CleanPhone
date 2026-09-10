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
public final class ProtoBuf$QualifiedNameTable extends GeneratedMessageLite implements kowloon {
    public static arytenoidectomy<ProtoBuf$QualifiedNameTable> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$QualifiedNameTable f30938kowloon;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<QualifiedName> qualifiedName_;
    private final wireman unknownFields;

    public static final class QualifiedName extends GeneratedMessageLite implements kowloon {
        public static arytenoidectomy<QualifiedName> PARSER = new attabal();

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final QualifiedName f30939kowloon;
        private int bitField0_;
        private Kind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int parentQualifiedName_;
        private int shortName_;
        private final wireman unknownFields;

        public enum Kind implements impromptu.attabal {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public static impromptu.saneness<Kind> f30941kowloon = new attabal();
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
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }
        }

        public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<QualifiedName> {
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
            /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
            public QualifiedName dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
                return new QualifiedName(marialVar, beachfrontVar);
            }
        }

        static {
            QualifiedName qualifiedName = new QualifiedName(true);
            f30939kowloon = qualifiedName;
            qualifiedName.saneness();
        }

        public static QualifiedName getDefaultInstance() {
            return f30939kowloon;
        }

        public static saneness newBuilder() {
            return saneness.impassible();
        }

        private void saneness() {
            this.parentQualifiedName_ = -1;
            this.shortName_ = 0;
            this.kind_ = Kind.PACKAGE;
        }

        public Kind getKind() {
            return this.kind_;
        }

        public int getParentQualifiedName() {
            return this.parentQualifiedName_;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public arytenoidectomy<QualifiedName> getParserForType() {
            return PARSER;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.parentQualifiedName_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iKowloon += CodedOutputStream.kowloon(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iKowloon += CodedOutputStream.impromptu(3, this.kind_.getNumber());
            }
            int size = iKowloon + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getShortName() {
            return this.shortName_;
        }

        public boolean hasKind() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasParentQualifiedName() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasShortName() {
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
            if (hasShortName()) {
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
                codedOutputStream.cultivated(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.cultivated(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.walach(3, this.kind_.getNumber());
            }
            codedOutputStream.nosophobia(this.unknownFields);
        }

        public static saneness newBuilder(QualifiedName qualifiedName) {
            return newBuilder().beachfront(qualifiedName);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public QualifiedName getDefaultInstanceForType() {
            return f30939kowloon;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness newBuilderForType() {
            return newBuilder();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness toBuilder() {
            return newBuilder(this);
        }

        public QualifiedName(GeneratedMessageLite.saneness sanenessVar) {
            super(sanenessVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = sanenessVar.marial();
        }

        public QualifiedName(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = wireman.f31186kowloon;
        }

        public QualifiedName(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                                    this.bitField0_ |= 1;
                                    this.parentQualifiedName_ = marialVar.molybdenite();
                                } else if (iPolder == 16) {
                                    this.bitField0_ |= 2;
                                    this.shortName_ = marialVar.molybdenite();
                                } else if (iPolder != 24) {
                                    if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                    }
                                } else {
                                    int iTriweekly = marialVar.triweekly();
                                    Kind kindValueOf = Kind.valueOf(iTriweekly);
                                    if (kindValueOf == null) {
                                        codedOutputStreamMerc.sensatory(iPolder);
                                        codedOutputStreamMerc.sensatory(iTriweekly);
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.kind_ = kindValueOf;
                                    }
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

        public static final class saneness extends GeneratedMessageLite.saneness<QualifiedName, saneness> implements kowloon {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public int f30942arytenoidectomy;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public int f30945polloi;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public int f30944monoploid = -1;

            /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
            public Kind f30943molybdenite = Kind.PACKAGE;

            public saneness() {
                triweekly();
            }

            public static saneness impassible() {
                return new saneness();
            }

            public QualifiedName apical() {
                QualifiedName qualifiedName = new QualifiedName(this);
                int i = this.f30942arytenoidectomy;
                int i2 = (i & 1) != 1 ? 0 : 1;
                qualifiedName.parentQualifiedName_ = this.f30944monoploid;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                qualifiedName.shortName_ = this.f30945polloi;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                qualifiedName.kind_ = this.f30943molybdenite;
                qualifiedName.bitField0_ = i2;
                return qualifiedName;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
            public saneness wireman() {
                return impassible().beachfront(apical());
            }

            public saneness graveside(int i) {
                this.f30942arytenoidectomy |= 2;
                this.f30945polloi = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
            public saneness beachfront(QualifiedName qualifiedName) {
                if (qualifiedName == QualifiedName.getDefaultInstance()) {
                    return this;
                }
                if (qualifiedName.hasParentQualifiedName()) {
                    molybdenite(qualifiedName.getParentQualifiedName());
                }
                if (qualifiedName.hasShortName()) {
                    graveside(qualifiedName.getShortName());
                }
                if (qualifiedName.hasKind()) {
                    polloi(qualifiedName.getKind());
                }
                competently(marial().dern(qualifiedName.unknownFields));
                return this;
            }

            public saneness molybdenite(int i) {
                this.f30942arytenoidectomy |= 1;
                this.f30944monoploid = i;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
            public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
                QualifiedName qualifiedName = null;
                try {
                    try {
                        QualifiedName qualifiedNameDern = QualifiedName.PARSER.dern(marialVar, beachfrontVar);
                        if (qualifiedNameDern != null) {
                            beachfront(qualifiedNameDern);
                        }
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (qualifiedName != null) {
                            beachfront(qualifiedName);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    QualifiedName qualifiedName2 = (QualifiedName) e.getUnfinishedMessage();
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        qualifiedName = qualifiedName2;
                        if (qualifiedName != null) {
                            beachfront(qualifiedName);
                        }
                        throw th;
                    }
                }
            }

            public saneness polloi(Kind kind) {
                kind.getClass();
                this.f30942arytenoidectomy |= 4;
                this.f30943molybdenite = kind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
            public QualifiedName build() {
                QualifiedName qualifiedNameApical = apical();
                if (qualifiedNameApical.isInitialized()) {
                    return qualifiedNameApical;
                }
                throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(qualifiedNameApical);
            }

            private void triweekly() {
            }
        }
    }

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$QualifiedNameTable> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$QualifiedNameTable dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$QualifiedNameTable(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(true);
        f30938kowloon = protoBuf$QualifiedNameTable;
        protoBuf$QualifiedNameTable.saneness();
    }

    public static ProtoBuf$QualifiedNameTable getDefaultInstance() {
        return f30938kowloon;
    }

    public static saneness newBuilder() {
        return saneness.impassible();
    }

    private void saneness() {
        this.qualifiedName_ = Collections.EMPTY_LIST;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$QualifiedNameTable> getParserForType() {
        return PARSER;
    }

    public QualifiedName getQualifiedName(int i) {
        return this.qualifiedName_.get(i);
    }

    public int getQualifiedNameCount() {
        return this.qualifiedName_.size();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iMolybdenite = 0;
        for (int i2 = 0; i2 < this.qualifiedName_.size(); i2++) {
            iMolybdenite += CodedOutputStream.molybdenite(1, this.qualifiedName_.get(i2));
        }
        int size = iMolybdenite + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
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
        for (int i = 0; i < getQualifiedNameCount(); i++) {
            if (!getQualifiedName(i).isInitialized()) {
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
        for (int i = 0; i < this.qualifiedName_.size(); i++) {
            codedOutputStream.milliradian(1, this.qualifiedName_.get(i));
        }
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        return newBuilder().beachfront(protoBuf$QualifiedNameTable);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$QualifiedNameTable getDefaultInstanceForType() {
        return f30938kowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$QualifiedNameTable(GeneratedMessageLite.saneness sanenessVar) {
        super(sanenessVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = sanenessVar.marial();
    }

    public ProtoBuf$QualifiedNameTable(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$QualifiedNameTable(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        saneness();
        wireman.saneness sanenessVarArytenoidectomy = wireman.arytenoidectomy();
        CodedOutputStream codedOutputStreamMerc = CodedOutputStream.merc(sanenessVarArytenoidectomy, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iPolder = marialVar.polder();
                        if (iPolder != 0) {
                            if (iPolder != 10) {
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                }
                            } else {
                                if (!z2) {
                                    this.qualifiedName_ = new ArrayList();
                                    z2 = true;
                                }
                                this.qualifiedName_.add((QualifiedName) marialVar.adultoid(QualifiedName.PARSER, beachfrontVar));
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
                if (z2) {
                    this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
            this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.saneness<ProtoBuf$QualifiedNameTable, saneness> implements kowloon {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f30946arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public List<QualifiedName> f30947monoploid = Collections.EMPTY_LIST;

        public saneness() {
            kowloon();
        }

        public static saneness impassible() {
            return new saneness();
        }

        public ProtoBuf$QualifiedNameTable apical() {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(this);
            if ((this.f30946arytenoidectomy & 1) == 1) {
                this.f30947monoploid = Collections.unmodifiableList(this.f30947monoploid);
                this.f30946arytenoidectomy &= -2;
            }
            protoBuf$QualifiedNameTable.qualifiedName_ = this.f30947monoploid;
            return protoBuf$QualifiedNameTable;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return impassible().beachfront(apical());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
            if (protoBuf$QualifiedNameTable == ProtoBuf$QualifiedNameTable.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$QualifiedNameTable.qualifiedName_.isEmpty()) {
                if (this.f30947monoploid.isEmpty()) {
                    this.f30947monoploid = protoBuf$QualifiedNameTable.qualifiedName_;
                    this.f30946arytenoidectomy &= -2;
                } else {
                    triweekly();
                    this.f30947monoploid.addAll(protoBuf$QualifiedNameTable.qualifiedName_);
                }
            }
            competently(marial().dern(protoBuf$QualifiedNameTable.unknownFields));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = null;
            try {
                try {
                    ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTableDern = ProtoBuf$QualifiedNameTable.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$QualifiedNameTableDern != null) {
                        beachfront(protoBuf$QualifiedNameTableDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$QualifiedNameTable != null) {
                        beachfront(protoBuf$QualifiedNameTable);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable2 = (ProtoBuf$QualifiedNameTable) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$QualifiedNameTable = protoBuf$QualifiedNameTable2;
                    if (protoBuf$QualifiedNameTable != null) {
                        beachfront(protoBuf$QualifiedNameTable);
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$QualifiedNameTable build() {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTableApical = apical();
            if (protoBuf$QualifiedNameTableApical.isInitialized()) {
                return protoBuf$QualifiedNameTableApical;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$QualifiedNameTableApical);
        }

        public final void triweekly() {
            if ((this.f30946arytenoidectomy & 1) != 1) {
                this.f30947monoploid = new ArrayList(this.f30947monoploid);
                this.f30946arytenoidectomy |= 1;
            }
        }

        private void kowloon() {
        }
    }
}
