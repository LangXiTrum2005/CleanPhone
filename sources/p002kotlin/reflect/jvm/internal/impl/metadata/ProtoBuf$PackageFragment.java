package p002kotlin.reflect.jvm.internal.impl.metadata;

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
public final class ProtoBuf$PackageFragment extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$PackageFragment> implements kowloon {
    public static arytenoidectomy<ProtoBuf$PackageFragment> PARSER = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ProtoBuf$PackageFragment f30916kowloon;
    private int bitField0_;
    private List<ProtoBuf$Class> class__;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ProtoBuf$Package package_;
    private ProtoBuf$QualifiedNameTable qualifiedNames_;
    private ProtoBuf$StringTable strings_;
    private final wireman unknownFields;

    public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<ProtoBuf$PackageFragment> {
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$PackageFragment dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$PackageFragment(marialVar, beachfrontVar);
        }
    }

    static {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(true);
        f30916kowloon = protoBuf$PackageFragment;
        protoBuf$PackageFragment.dern();
    }

    private void dern() {
        this.strings_ = ProtoBuf$StringTable.getDefaultInstance();
        this.qualifiedNames_ = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        this.package_ = ProtoBuf$Package.getDefaultInstance();
        this.class__ = Collections.EMPTY_LIST;
    }

    public static ProtoBuf$PackageFragment getDefaultInstance() {
        return f30916kowloon;
    }

    public static saneness newBuilder() {
        return saneness.polloi();
    }

    public static ProtoBuf$PackageFragment parseFrom(InputStream inputStream, beachfront beachfrontVar) throws IOException {
        return PARSER.attabal(inputStream, beachfrontVar);
    }

    public ProtoBuf$Class getClass_(int i) {
        return this.class__.get(i);
    }

    public int getClass_Count() {
        return this.class__.size();
    }

    public List<ProtoBuf$Class> getClass_List() {
        return this.class__;
    }

    public ProtoBuf$Package getPackage() {
        return this.package_;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<ProtoBuf$PackageFragment> getParserForType() {
        return PARSER;
    }

    public ProtoBuf$QualifiedNameTable getQualifiedNames() {
        return this.qualifiedNames_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iMolybdenite = (this.bitField0_ & 1) == 1 ? CodedOutputStream.molybdenite(1, this.strings_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iMolybdenite += CodedOutputStream.molybdenite(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iMolybdenite += CodedOutputStream.molybdenite(3, this.package_);
        }
        for (int i2 = 0; i2 < this.class__.size(); i2++) {
            iMolybdenite += CodedOutputStream.molybdenite(4, this.class__.get(i2));
        }
        int iExtensionsSerializedSize = iMolybdenite + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ProtoBuf$StringTable getStrings() {
        return this.strings_;
    }

    public boolean hasPackage() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasQualifiedNames() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasStrings() {
        return (this.bitField0_ & 1) == 1;
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
        if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasPackage() && !getPackage().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getClass_Count(); i++) {
            if (!getClass_(i).isInitialized()) {
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
            codedOutputStream.milliradian(1, this.strings_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.milliradian(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.milliradian(3, this.package_);
        }
        for (int i = 0; i < this.class__.size(); i++) {
            codedOutputStream.milliradian(4, this.class__.get(i));
        }
        attabalVarNewExtensionWriter.attabal(200, codedOutputStream);
        codedOutputStream.nosophobia(this.unknownFields);
    }

    public static saneness newBuilder(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
        return newBuilder().beachfront(protoBuf$PackageFragment);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$PackageFragment getDefaultInstanceForType() {
        return f30916kowloon;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public saneness toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$PackageFragment(GeneratedMessageLite.dern<ProtoBuf$PackageFragment, ?> dernVar) {
        super(dernVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = dernVar.marial();
    }

    public ProtoBuf$PackageFragment(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wireman.f31186kowloon;
    }

    public ProtoBuf$PackageFragment(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        dern();
        wireman.saneness sanenessVarArytenoidectomy = wireman.arytenoidectomy();
        CodedOutputStream codedOutputStreamMerc = CodedOutputStream.merc(sanenessVarArytenoidectomy, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iPolder = marialVar.polder();
                    if (iPolder != 0) {
                        if (iPolder == 10) {
                            ProtoBuf$StringTable.saneness builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                            ProtoBuf$StringTable protoBuf$StringTable = (ProtoBuf$StringTable) marialVar.adultoid(ProtoBuf$StringTable.PARSER, beachfrontVar);
                            this.strings_ = protoBuf$StringTable;
                            if (builder != null) {
                                builder.beachfront(protoBuf$StringTable);
                                this.strings_ = builder.apical();
                            }
                            this.bitField0_ |= 1;
                        } else if (iPolder == 18) {
                            ProtoBuf$QualifiedNameTable.saneness builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = (ProtoBuf$QualifiedNameTable) marialVar.adultoid(ProtoBuf$QualifiedNameTable.PARSER, beachfrontVar);
                            this.qualifiedNames_ = protoBuf$QualifiedNameTable;
                            if (builder2 != null) {
                                builder2.beachfront(protoBuf$QualifiedNameTable);
                                this.qualifiedNames_ = builder2.apical();
                            }
                            this.bitField0_ |= 2;
                        } else if (iPolder == 26) {
                            ProtoBuf$Package.saneness builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                            ProtoBuf$Package protoBuf$Package = (ProtoBuf$Package) marialVar.adultoid(ProtoBuf$Package.PARSER, beachfrontVar);
                            this.package_ = protoBuf$Package;
                            if (builder3 != null) {
                                builder3.beachfront(protoBuf$Package);
                                this.package_ = builder3.kowloon();
                            }
                            this.bitField0_ |= 4;
                        } else if (iPolder != 34) {
                            if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                            }
                        } else {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.class__ = new ArrayList();
                                c = '\b';
                            }
                            this.class__.add((ProtoBuf$Class) marialVar.adultoid(ProtoBuf$Class.PARSER, beachfrontVar));
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((c == true ? 1 : 0) & '\b') == 8) {
                    this.class__ = Collections.unmodifiableList(this.class__);
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
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.class__ = Collections.unmodifiableList(this.class__);
        }
        try {
            codedOutputStreamMerc.restrictive();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = sanenessVarArytenoidectomy.cutely();
        }
        makeExtensionsImmutable();
    }

    public static final class saneness extends GeneratedMessageLite.dern<ProtoBuf$PackageFragment, saneness> implements kowloon {

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f30921polloi;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public ProtoBuf$StringTable f30920molybdenite = ProtoBuf$StringTable.getDefaultInstance();

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public ProtoBuf$QualifiedNameTable f30919graveside = ProtoBuf$QualifiedNameTable.getDefaultInstance();

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public ProtoBuf$Package f30917adultoid = ProtoBuf$Package.getDefaultInstance();

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public List<ProtoBuf$Class> f30918dovishness = Collections.EMPTY_LIST;

        public saneness() {
            graveside();
        }

        public static saneness polloi() {
            return new saneness();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
        public saneness beachfront(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
            if (protoBuf$PackageFragment == ProtoBuf$PackageFragment.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$PackageFragment.hasStrings()) {
                preprohormone(protoBuf$PackageFragment.getStrings());
            }
            if (protoBuf$PackageFragment.hasQualifiedNames()) {
                rotuma(protoBuf$PackageFragment.getQualifiedNames());
            }
            if (protoBuf$PackageFragment.hasPackage()) {
                gintrap(protoBuf$PackageFragment.getPackage());
            }
            if (!protoBuf$PackageFragment.class__.isEmpty()) {
                if (this.f30918dovishness.isEmpty()) {
                    this.f30918dovishness = protoBuf$PackageFragment.class__;
                    this.f30921polloi &= -9;
                } else {
                    molybdenite();
                    this.f30918dovishness.addAll(protoBuf$PackageFragment.class__);
                }
            }
            formularize(protoBuf$PackageFragment);
            competently(marial().dern(protoBuf$PackageFragment.unknownFields));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
        public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
            ProtoBuf$PackageFragment protoBuf$PackageFragment = null;
            try {
                try {
                    ProtoBuf$PackageFragment protoBuf$PackageFragmentDern = ProtoBuf$PackageFragment.PARSER.dern(marialVar, beachfrontVar);
                    if (protoBuf$PackageFragmentDern != null) {
                        beachfront(protoBuf$PackageFragmentDern);
                    }
                    return this;
                } catch (Throwable th) {
                    th = th;
                    if (protoBuf$PackageFragment != null) {
                        beachfront(protoBuf$PackageFragment);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$PackageFragment protoBuf$PackageFragment2 = (ProtoBuf$PackageFragment) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$PackageFragment = protoBuf$PackageFragment2;
                    if (protoBuf$PackageFragment != null) {
                        beachfront(protoBuf$PackageFragment);
                    }
                    throw th;
                }
            }
        }

        public saneness gintrap(ProtoBuf$Package protoBuf$Package) {
            if ((this.f30921polloi & 4) != 4 || this.f30917adultoid == ProtoBuf$Package.getDefaultInstance()) {
                this.f30917adultoid = protoBuf$Package;
            } else {
                this.f30917adultoid = ProtoBuf$Package.newBuilder(this.f30917adultoid).beachfront(protoBuf$Package).kowloon();
            }
            this.f30921polloi |= 4;
            return this;
        }

        public ProtoBuf$PackageFragment kowloon() {
            ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(this);
            int i = this.f30921polloi;
            int i2 = (i & 1) != 1 ? 0 : 1;
            protoBuf$PackageFragment.strings_ = this.f30920molybdenite;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$PackageFragment.qualifiedNames_ = this.f30919graveside;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$PackageFragment.package_ = this.f30917adultoid;
            if ((this.f30921polloi & 8) == 8) {
                this.f30918dovishness = Collections.unmodifiableList(this.f30918dovishness);
                this.f30921polloi &= -9;
            }
            protoBuf$PackageFragment.class__ = this.f30918dovishness;
            protoBuf$PackageFragment.bitField0_ = i2;
            return protoBuf$PackageFragment;
        }

        public final void molybdenite() {
            if ((this.f30921polloi & 8) != 8) {
                this.f30918dovishness = new ArrayList(this.f30918dovishness);
                this.f30921polloi |= 8;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
        /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
        public saneness wireman() {
            return polloi().beachfront(kowloon());
        }

        public saneness preprohormone(ProtoBuf$StringTable protoBuf$StringTable) {
            if ((this.f30921polloi & 1) != 1 || this.f30920molybdenite == ProtoBuf$StringTable.getDefaultInstance()) {
                this.f30920molybdenite = protoBuf$StringTable;
            } else {
                this.f30920molybdenite = ProtoBuf$StringTable.newBuilder(this.f30920molybdenite).beachfront(protoBuf$StringTable).apical();
            }
            this.f30921polloi |= 1;
            return this;
        }

        public saneness rotuma(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
            if ((this.f30921polloi & 2) != 2 || this.f30919graveside == ProtoBuf$QualifiedNameTable.getDefaultInstance()) {
                this.f30919graveside = protoBuf$QualifiedNameTable;
            } else {
                this.f30919graveside = ProtoBuf$QualifiedNameTable.newBuilder(this.f30919graveside).beachfront(protoBuf$QualifiedNameTable).apical();
            }
            this.f30921polloi |= 2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$PackageFragment build() {
            ProtoBuf$PackageFragment protoBuf$PackageFragmentKowloon = kowloon();
            if (protoBuf$PackageFragmentKowloon.isInitialized()) {
                return protoBuf$PackageFragmentKowloon;
            }
            throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(protoBuf$PackageFragmentKowloon);
        }

        private void graveside() {
        }
    }
}
