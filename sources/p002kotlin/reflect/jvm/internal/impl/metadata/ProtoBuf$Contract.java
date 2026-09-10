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
public final class ProtoBuf$Contract extends GeneratedMessageLite implements kowloon {
    public static arytenoidectomy<ProtoBuf$Contract> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$Contract f30862kowloon;
    private List<ProtoBuf$Effect> effect_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final wireman unknownFields;

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$Contract> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Contract dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Contract(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract(true);
        f30862kowloon = protoBuf$Contract;
        protoBuf$Contract.saneness();
    }

    public static ProtoBuf$Contract getDefaultInstance() {
        return f30862kowloon;
    }

    public static saneness newBuilder() {
        return saneness.impassible();
    }

    private void saneness() {
        this.effect_ = Collections.EMPTY_LIST;
    }

    public ProtoBuf$Effect getEffect(int i) {
        return this.effect_.get(i);
    }

    public int getEffectCount() {
        return this.effect_.size();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$Contract> getParserForType() {
        return PARSER;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iMolybdenite = 0;
        for (int i2 = 0; i2 < this.effect_.size(); i2++) {
            iMolybdenite += CodedOutputStream.molybdenite(1, this.effect_.get(i2));
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
        for (int i = 0; i < getEffectCount(); i++) {
            if (!getEffect(i).isInitialized()) {
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
        for (int i = 0; i < this.effect_.size(); i++) {
            codedOutputStream.milliradian(1, this.effect_.get(i));
        }
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$Contract protoBuf$Contract) {
        return newBuilder().beachfront(protoBuf$Contract);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Contract getDefaultInstanceForType() {
        return f30862kowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Contract(GeneratedMessageLite.saneness sanenessVar) {
        super(sanenessVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = sanenessVar.marial();
    }

    public ProtoBuf$Contract(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$Contract(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                                    this.effect_ = new ArrayList();
                                    z2 = true;
                                }
                                this.effect_.add((ProtoBuf$Effect) marialVar.adultoid(ProtoBuf$Effect.PARSER, beachfrontVar));
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
                    this.effect_ = Collections.unmodifiableList(this.effect_);
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
            this.effect_ = Collections.unmodifiableList(this.effect_);
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.saneness<ProtoBuf$Contract, saneness> implements kowloon {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f30863arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public List<ProtoBuf$Effect> f30864monoploid = Collections.EMPTY_LIST;

        public saneness() {
            kowloon();
        }

        public static saneness impassible() {
            return new saneness();
        }

        public ProtoBuf$Contract apical() {
            ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract(this);
            if ((this.f30863arytenoidectomy & 1) == 1) {
                this.f30864monoploid = Collections.unmodifiableList(this.f30864monoploid);
                this.f30863arytenoidectomy &= -2;
            }
            protoBuf$Contract.effect_ = this.f30864monoploid;
            return protoBuf$Contract;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return impassible().beachfront(apical());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$Contract protoBuf$Contract) {
            if (protoBuf$Contract == ProtoBuf$Contract.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$Contract.effect_.isEmpty()) {
                if (this.f30864monoploid.isEmpty()) {
                    this.f30864monoploid = protoBuf$Contract.effect_;
                    this.f30863arytenoidectomy &= -2;
                } else {
                    triweekly();
                    this.f30864monoploid.addAll(protoBuf$Contract.effect_);
                }
            }
            competently(marial().dern(protoBuf$Contract.unknownFields));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$Contract protoBuf$Contract = null;
            try {
                try {
                    ProtoBuf$Contract protoBuf$ContractDern = ProtoBuf$Contract.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$ContractDern != null) {
                        beachfront(protoBuf$ContractDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$Contract != null) {
                        beachfront(protoBuf$Contract);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Contract protoBuf$Contract2 = (ProtoBuf$Contract) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Contract = protoBuf$Contract2;
                    if (protoBuf$Contract != null) {
                        beachfront(protoBuf$Contract);
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Contract build() {
            ProtoBuf$Contract protoBuf$ContractApical = apical();
            if (protoBuf$ContractApical.isInitialized()) {
                return protoBuf$ContractApical;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$ContractApical);
        }

        public final void triweekly() {
            if ((this.f30863arytenoidectomy & 1) != 1) {
                this.f30864monoploid = new ArrayList(this.f30864monoploid);
                this.f30863arytenoidectomy |= 1;
            }
        }

        private void kowloon() {
        }
    }
}
