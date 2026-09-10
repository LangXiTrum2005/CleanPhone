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
public final class ProtoBuf$VersionRequirementTable extends GeneratedMessageLite implements kowloon {
    public static arytenoidectomy<ProtoBuf$VersionRequirementTable> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$VersionRequirementTable f31019kowloon;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ProtoBuf$VersionRequirement> requirement_;
    private final wireman unknownFields;

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$VersionRequirementTable> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$VersionRequirementTable dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$VersionRequirementTable(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable(true);
        f31019kowloon = protoBuf$VersionRequirementTable;
        protoBuf$VersionRequirementTable.saneness();
    }

    public static ProtoBuf$VersionRequirementTable getDefaultInstance() {
        return f31019kowloon;
    }

    public static saneness newBuilder() {
        return saneness.impassible();
    }

    private void saneness() {
        this.requirement_ = Collections.EMPTY_LIST;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$VersionRequirementTable> getParserForType() {
        return PARSER;
    }

    public int getRequirementCount() {
        return this.requirement_.size();
    }

    public List<ProtoBuf$VersionRequirement> getRequirementList() {
        return this.requirement_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iMolybdenite = 0;
        for (int i2 = 0; i2 < this.requirement_.size(); i2++) {
            iMolybdenite += CodedOutputStream.molybdenite(1, this.requirement_.get(i2));
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.requirement_.size(); i++) {
            codedOutputStream.milliradian(1, this.requirement_.get(i));
        }
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
        return newBuilder().beachfront(protoBuf$VersionRequirementTable);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$VersionRequirementTable getDefaultInstanceForType() {
        return f31019kowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$VersionRequirementTable(GeneratedMessageLite.saneness sanenessVar) {
        super(sanenessVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = sanenessVar.marial();
    }

    public ProtoBuf$VersionRequirementTable(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$VersionRequirementTable(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                                    this.requirement_ = new ArrayList();
                                    z2 = true;
                                }
                                this.requirement_.add((ProtoBuf$VersionRequirement) marialVar.adultoid(ProtoBuf$VersionRequirement.PARSER, beachfrontVar));
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
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
            this.requirement_ = Collections.unmodifiableList(this.requirement_);
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.saneness<ProtoBuf$VersionRequirementTable, saneness> implements kowloon {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f31020arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public List<ProtoBuf$VersionRequirement> f31021monoploid = Collections.EMPTY_LIST;

        public saneness() {
            kowloon();
        }

        public static saneness impassible() {
            return new saneness();
        }

        public ProtoBuf$VersionRequirementTable apical() {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable(this);
            if ((this.f31020arytenoidectomy & 1) == 1) {
                this.f31021monoploid = Collections.unmodifiableList(this.f31021monoploid);
                this.f31020arytenoidectomy &= -2;
            }
            protoBuf$VersionRequirementTable.requirement_ = this.f31021monoploid;
            return protoBuf$VersionRequirementTable;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return impassible().beachfront(apical());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if (protoBuf$VersionRequirementTable == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$VersionRequirementTable.requirement_.isEmpty()) {
                if (this.f31021monoploid.isEmpty()) {
                    this.f31021monoploid = protoBuf$VersionRequirementTable.requirement_;
                    this.f31020arytenoidectomy &= -2;
                } else {
                    triweekly();
                    this.f31021monoploid.addAll(protoBuf$VersionRequirementTable.requirement_);
                }
            }
            competently(marial().dern(protoBuf$VersionRequirementTable.unknownFields));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = null;
            try {
                try {
                    ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTableDern = ProtoBuf$VersionRequirementTable.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$VersionRequirementTableDern != null) {
                        beachfront(protoBuf$VersionRequirementTableDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$VersionRequirementTable != null) {
                        beachfront(protoBuf$VersionRequirementTable);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = (ProtoBuf$VersionRequirementTable) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$VersionRequirementTable = protoBuf$VersionRequirementTable2;
                    if (protoBuf$VersionRequirementTable != null) {
                        beachfront(protoBuf$VersionRequirementTable);
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$VersionRequirementTable build() {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTableApical = apical();
            if (protoBuf$VersionRequirementTableApical.isInitialized()) {
                return protoBuf$VersionRequirementTableApical;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$VersionRequirementTableApical);
        }

        public final void triweekly() {
            if ((this.f31020arytenoidectomy & 1) != 1) {
                this.f31021monoploid = new ArrayList(this.f31021monoploid);
                this.f31020arytenoidectomy |= 1;
            }
        }

        private void kowloon() {
        }
    }
}
