package p002kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import p002kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p002kotlin.reflect.jvm.internal.impl.protobuf.apical;
import p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront;
import p002kotlin.reflect.jvm.internal.impl.protobuf.formularize;
import p002kotlin.reflect.jvm.internal.impl.protobuf.kowloon;
import p002kotlin.reflect.jvm.internal.impl.protobuf.marial;
import p002kotlin.reflect.jvm.internal.impl.protobuf.monoploid;
import p002kotlin.reflect.jvm.internal.impl.protobuf.wireman;

/* JADX INFO: loaded from: classes5.dex */
public final class ProtoBuf$StringTable extends GeneratedMessageLite implements kowloon {
    public static arytenoidectomy<ProtoBuf$StringTable> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$StringTable f30948kowloon;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private formularize string_;
    private final wireman unknownFields;

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$StringTable> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$StringTable dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$StringTable(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable(true);
        f30948kowloon = protoBuf$StringTable;
        protoBuf$StringTable.saneness();
    }

    public static ProtoBuf$StringTable getDefaultInstance() {
        return f30948kowloon;
    }

    public static saneness newBuilder() {
        return saneness.impassible();
    }

    private void saneness() {
        this.string_ = apical.f31100arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$StringTable> getParserForType() {
        return PARSER;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iMarial = 0;
        for (int i2 = 0; i2 < this.string_.size(); i2++) {
            iMarial += CodedOutputStream.marial(this.string_.getByteString(i2));
        }
        int size = iMarial + getStringList().size() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getString(int i) {
        return this.string_.get(i);
    }

    public monoploid getStringList() {
        return this.string_;
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
        for (int i = 0; i < this.string_.size(); i++) {
            codedOutputStream.privatdozent(1, this.string_.getByteString(i));
        }
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$StringTable protoBuf$StringTable) {
        return newBuilder().beachfront(protoBuf$StringTable);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$StringTable getDefaultInstanceForType() {
        return f30948kowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$StringTable(GeneratedMessageLite.saneness sanenessVar) {
        super(sanenessVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = sanenessVar.marial();
    }

    public ProtoBuf$StringTable(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$StringTable(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                                wireman wiremanVarFormularize = marialVar.formularize();
                                if (!z2) {
                                    this.string_ = new apical();
                                    z2 = true;
                                }
                                this.string_.polder(wiremanVarFormularize);
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
                    this.string_ = this.string_.getUnmodifiableView();
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
            this.string_ = this.string_.getUnmodifiableView();
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.saneness<ProtoBuf$StringTable, saneness> implements kowloon {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f30949arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public formularize f30950monoploid = apical.f31100arytenoidectomy;

        public saneness() {
            kowloon();
        }

        public static saneness impassible() {
            return new saneness();
        }

        public ProtoBuf$StringTable apical() {
            ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable(this);
            if ((this.f30949arytenoidectomy & 1) == 1) {
                this.f30950monoploid = this.f30950monoploid.getUnmodifiableView();
                this.f30949arytenoidectomy &= -2;
            }
            protoBuf$StringTable.string_ = this.f30950monoploid;
            return protoBuf$StringTable;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return impassible().beachfront(apical());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$StringTable protoBuf$StringTable) {
            if (protoBuf$StringTable == ProtoBuf$StringTable.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$StringTable.string_.isEmpty()) {
                if (this.f30950monoploid.isEmpty()) {
                    this.f30950monoploid = protoBuf$StringTable.string_;
                    this.f30949arytenoidectomy &= -2;
                } else {
                    triweekly();
                    this.f30950monoploid.addAll(protoBuf$StringTable.string_);
                }
            }
            competently(marial().dern(protoBuf$StringTable.unknownFields));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$StringTable protoBuf$StringTable = null;
            try {
                try {
                    ProtoBuf$StringTable protoBuf$StringTableDern = ProtoBuf$StringTable.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$StringTableDern != null) {
                        beachfront(protoBuf$StringTableDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$StringTable != null) {
                        beachfront(protoBuf$StringTable);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$StringTable protoBuf$StringTable2 = (ProtoBuf$StringTable) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$StringTable = protoBuf$StringTable2;
                    if (protoBuf$StringTable != null) {
                        beachfront(protoBuf$StringTable);
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$StringTable build() {
            ProtoBuf$StringTable protoBuf$StringTableApical = apical();
            if (protoBuf$StringTableApical.isInitialized()) {
                return protoBuf$StringTableApical;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$StringTableApical);
        }

        public final void triweekly() {
            if ((this.f30949arytenoidectomy & 1) != 1) {
                this.f30950monoploid = new apical(this.f30950monoploid);
                this.f30949arytenoidectomy |= 1;
            }
        }

        private void kowloon() {
        }
    }
}
