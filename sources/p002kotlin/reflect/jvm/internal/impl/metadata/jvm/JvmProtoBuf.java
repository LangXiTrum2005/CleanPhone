package p002kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p002kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront;
import p002kotlin.reflect.jvm.internal.impl.protobuf.impromptu;
import p002kotlin.reflect.jvm.internal.impl.protobuf.kowloon;
import p002kotlin.reflect.jvm.internal.impl.protobuf.marial;
import p002kotlin.reflect.jvm.internal.impl.protobuf.wireman;

/* JADX INFO: loaded from: classes5.dex */
public final class JvmProtoBuf {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Class, Integer> f31024apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Constructor, JvmMethodSignature> f31025attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Type, List<ProtoBuf$Annotation>> f31026beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Type, Boolean> f31027competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Class, List<ProtoBuf$Property>> f31028cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Function, Integer> f31029dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Class, Integer> f31030formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Package, Integer> f31031impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$TypeParameter, List<ProtoBuf$Annotation>> f31032impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Property, Integer> f31033marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Function, JvmMethodSignature> f31034saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Class, Integer> f31035taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Package, List<ProtoBuf$Property>> f31036triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final GeneratedMessageLite.marial<ProtoBuf$Property, JvmPropertySignature> f31037wireman;

    public static final class JvmFieldSignature extends GeneratedMessageLite implements kowloon {
        public static arytenoidectomy<JvmFieldSignature> PARSER = new attabal();

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final JvmFieldSignature f31038kowloon;
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final wireman unknownFields;

        public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<JvmFieldSignature> {
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
            /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(marialVar, beachfrontVar);
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(true);
            f31038kowloon = jvmFieldSignature;
            jvmFieldSignature.saneness();
        }

        public static JvmFieldSignature getDefaultInstance() {
            return f31038kowloon;
        }

        public static saneness newBuilder() {
            return saneness.impassible();
        }

        private void saneness() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public int getDesc() {
            return this.desc_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public arytenoidectomy<JvmFieldSignature> getParserForType() {
            return PARSER;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iKowloon += CodedOutputStream.kowloon(2, this.desc_);
            }
            int size = iKowloon + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasName() {
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.cultivated(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.cultivated(2, this.desc_);
            }
            codedOutputStream.nosophobia(this.unknownFields);
        }

        public static saneness newBuilder(JvmFieldSignature jvmFieldSignature) {
            return newBuilder().beachfront(jvmFieldSignature);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public JvmFieldSignature getDefaultInstanceForType() {
            return f31038kowloon;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness newBuilderForType() {
            return newBuilder();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness toBuilder() {
            return newBuilder(this);
        }

        public JvmFieldSignature(GeneratedMessageLite.saneness sanenessVar) {
            super(sanenessVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = sanenessVar.marial();
        }

        public JvmFieldSignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = wireman.f31186kowloon;
        }

        public JvmFieldSignature(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                                this.name_ = marialVar.molybdenite();
                            } else if (iPolder != 16) {
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.desc_ = marialVar.molybdenite();
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

        public static final class saneness extends GeneratedMessageLite.saneness<JvmFieldSignature, saneness> implements kowloon {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public int f31039arytenoidectomy;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public int f31040monoploid;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public int f31041polloi;

            public saneness() {
                triweekly();
            }

            public static saneness impassible() {
                return new saneness();
            }

            public JvmFieldSignature apical() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i = this.f31039arytenoidectomy;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmFieldSignature.name_ = this.f31040monoploid;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.desc_ = this.f31041polloi;
                jvmFieldSignature.bitField0_ = i2;
                return jvmFieldSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
            public saneness wireman() {
                return impassible().beachfront(apical());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
            public saneness beachfront(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    molybdenite(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    polloi(jvmFieldSignature.getDesc());
                }
                competently(marial().dern(jvmFieldSignature.unknownFields));
                return this;
            }

            public saneness molybdenite(int i) {
                this.f31039arytenoidectomy |= 1;
                this.f31040monoploid = i;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
            public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
                JvmFieldSignature jvmFieldSignature = null;
                try {
                    try {
                        JvmFieldSignature jvmFieldSignatureDern = JvmFieldSignature.PARSER.dern(marialVar, beachfrontVar);
                        if (jvmFieldSignatureDern != null) {
                            beachfront(jvmFieldSignatureDern);
                        }
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (jvmFieldSignature != null) {
                            beachfront(jvmFieldSignature);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) e.getUnfinishedMessage();
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        jvmFieldSignature = jvmFieldSignature2;
                        if (jvmFieldSignature != null) {
                            beachfront(jvmFieldSignature);
                        }
                        throw th;
                    }
                }
            }

            public saneness polloi(int i) {
                this.f31039arytenoidectomy |= 2;
                this.f31041polloi = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature build() {
                JvmFieldSignature jvmFieldSignatureApical = apical();
                if (jvmFieldSignatureApical.isInitialized()) {
                    return jvmFieldSignatureApical;
                }
                throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(jvmFieldSignatureApical);
            }

            private void triweekly() {
            }
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements kowloon {
        public static arytenoidectomy<JvmMethodSignature> PARSER = new attabal();

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final JvmMethodSignature f31042kowloon;
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final wireman unknownFields;

        public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<JvmMethodSignature> {
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
            /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(marialVar, beachfrontVar);
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(true);
            f31042kowloon = jvmMethodSignature;
            jvmMethodSignature.saneness();
        }

        public static JvmMethodSignature getDefaultInstance() {
            return f31042kowloon;
        }

        public static saneness newBuilder() {
            return saneness.impassible();
        }

        private void saneness() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public int getDesc() {
            return this.desc_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public arytenoidectomy<JvmMethodSignature> getParserForType() {
            return PARSER;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iKowloon += CodedOutputStream.kowloon(2, this.desc_);
            }
            int size = iKowloon + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasName() {
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.cultivated(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.cultivated(2, this.desc_);
            }
            codedOutputStream.nosophobia(this.unknownFields);
        }

        public static saneness newBuilder(JvmMethodSignature jvmMethodSignature) {
            return newBuilder().beachfront(jvmMethodSignature);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public JvmMethodSignature getDefaultInstanceForType() {
            return f31042kowloon;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness newBuilderForType() {
            return newBuilder();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness toBuilder() {
            return newBuilder(this);
        }

        public JvmMethodSignature(GeneratedMessageLite.saneness sanenessVar) {
            super(sanenessVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = sanenessVar.marial();
        }

        public JvmMethodSignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = wireman.f31186kowloon;
        }

        public JvmMethodSignature(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                                this.name_ = marialVar.molybdenite();
                            } else if (iPolder != 16) {
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.desc_ = marialVar.molybdenite();
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

        public static final class saneness extends GeneratedMessageLite.saneness<JvmMethodSignature, saneness> implements kowloon {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public int f31043arytenoidectomy;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public int f31044monoploid;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public int f31045polloi;

            public saneness() {
                triweekly();
            }

            public static saneness impassible() {
                return new saneness();
            }

            public JvmMethodSignature apical() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i = this.f31043arytenoidectomy;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmMethodSignature.name_ = this.f31044monoploid;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.desc_ = this.f31045polloi;
                jvmMethodSignature.bitField0_ = i2;
                return jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
            public saneness wireman() {
                return impassible().beachfront(apical());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
            public saneness beachfront(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    molybdenite(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    polloi(jvmMethodSignature.getDesc());
                }
                competently(marial().dern(jvmMethodSignature.unknownFields));
                return this;
            }

            public saneness molybdenite(int i) {
                this.f31043arytenoidectomy |= 1;
                this.f31044monoploid = i;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
            public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
                JvmMethodSignature jvmMethodSignature = null;
                try {
                    try {
                        JvmMethodSignature jvmMethodSignatureDern = JvmMethodSignature.PARSER.dern(marialVar, beachfrontVar);
                        if (jvmMethodSignatureDern != null) {
                            beachfront(jvmMethodSignatureDern);
                        }
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (jvmMethodSignature != null) {
                            beachfront(jvmMethodSignature);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) e.getUnfinishedMessage();
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        jvmMethodSignature = jvmMethodSignature2;
                        if (jvmMethodSignature != null) {
                            beachfront(jvmMethodSignature);
                        }
                        throw th;
                    }
                }
            }

            public saneness polloi(int i) {
                this.f31043arytenoidectomy |= 2;
                this.f31045polloi = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature build() {
                JvmMethodSignature jvmMethodSignatureApical = apical();
                if (jvmMethodSignatureApical.isInitialized()) {
                    return jvmMethodSignatureApical;
                }
                throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(jvmMethodSignatureApical);
            }

            private void triweekly() {
            }
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements kowloon {
        public static arytenoidectomy<JvmPropertySignature> PARSER = new attabal();

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final JvmPropertySignature f31046kowloon;
        private int bitField0_;
        private JvmMethodSignature delegateMethod_;
        private JvmFieldSignature field_;
        private JvmMethodSignature getter_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private JvmMethodSignature setter_;
        private JvmMethodSignature syntheticMethod_;
        private final wireman unknownFields;

        public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<JvmPropertySignature> {
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
            /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(marialVar, beachfrontVar);
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(true);
            f31046kowloon = jvmPropertySignature;
            jvmPropertySignature.saneness();
        }

        public static JvmPropertySignature getDefaultInstance() {
            return f31046kowloon;
        }

        public static saneness newBuilder() {
            return saneness.impassible();
        }

        private void saneness() {
            this.field_ = JvmFieldSignature.getDefaultInstance();
            this.syntheticMethod_ = JvmMethodSignature.getDefaultInstance();
            this.getter_ = JvmMethodSignature.getDefaultInstance();
            this.setter_ = JvmMethodSignature.getDefaultInstance();
            this.delegateMethod_ = JvmMethodSignature.getDefaultInstance();
        }

        public JvmMethodSignature getDelegateMethod() {
            return this.delegateMethod_;
        }

        public JvmFieldSignature getField() {
            return this.field_;
        }

        public JvmMethodSignature getGetter() {
            return this.getter_;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public arytenoidectomy<JvmPropertySignature> getParserForType() {
            return PARSER;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iMolybdenite = (this.bitField0_ & 1) == 1 ? CodedOutputStream.molybdenite(1, this.field_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iMolybdenite += CodedOutputStream.molybdenite(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iMolybdenite += CodedOutputStream.molybdenite(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iMolybdenite += CodedOutputStream.molybdenite(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iMolybdenite += CodedOutputStream.molybdenite(5, this.delegateMethod_);
            }
            int size = iMolybdenite + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public JvmMethodSignature getSetter() {
            return this.setter_;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.syntheticMethod_;
        }

        public boolean hasDelegateMethod() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasField() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasGetter() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasSetter() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasSyntheticMethod() {
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.milliradian(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.milliradian(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.milliradian(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.milliradian(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.milliradian(5, this.delegateMethod_);
            }
            codedOutputStream.nosophobia(this.unknownFields);
        }

        public static saneness newBuilder(JvmPropertySignature jvmPropertySignature) {
            return newBuilder().beachfront(jvmPropertySignature);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public JvmPropertySignature getDefaultInstanceForType() {
            return f31046kowloon;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness newBuilderForType() {
            return newBuilder();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness toBuilder() {
            return newBuilder(this);
        }

        public JvmPropertySignature(GeneratedMessageLite.saneness sanenessVar) {
            super(sanenessVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = sanenessVar.marial();
        }

        public JvmPropertySignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = wireman.f31186kowloon;
        }

        public JvmPropertySignature(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
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
                            if (iPolder == 10) {
                                JvmFieldSignature.saneness builder = (this.bitField0_ & 1) == 1 ? this.field_.toBuilder() : null;
                                JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) marialVar.adultoid(JvmFieldSignature.PARSER, beachfrontVar);
                                this.field_ = jvmFieldSignature;
                                if (builder != null) {
                                    builder.beachfront(jvmFieldSignature);
                                    this.field_ = builder.apical();
                                }
                                this.bitField0_ |= 1;
                            } else if (iPolder == 18) {
                                JvmMethodSignature.saneness builder2 = (this.bitField0_ & 2) == 2 ? this.syntheticMethod_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) marialVar.adultoid(JvmMethodSignature.PARSER, beachfrontVar);
                                this.syntheticMethod_ = jvmMethodSignature;
                                if (builder2 != null) {
                                    builder2.beachfront(jvmMethodSignature);
                                    this.syntheticMethod_ = builder2.apical();
                                }
                                this.bitField0_ |= 2;
                            } else if (iPolder == 26) {
                                JvmMethodSignature.saneness builder3 = (this.bitField0_ & 4) == 4 ? this.getter_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) marialVar.adultoid(JvmMethodSignature.PARSER, beachfrontVar);
                                this.getter_ = jvmMethodSignature2;
                                if (builder3 != null) {
                                    builder3.beachfront(jvmMethodSignature2);
                                    this.getter_ = builder3.apical();
                                }
                                this.bitField0_ |= 4;
                            } else if (iPolder == 34) {
                                JvmMethodSignature.saneness builder4 = (this.bitField0_ & 8) == 8 ? this.setter_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) marialVar.adultoid(JvmMethodSignature.PARSER, beachfrontVar);
                                this.setter_ = jvmMethodSignature3;
                                if (builder4 != null) {
                                    builder4.beachfront(jvmMethodSignature3);
                                    this.setter_ = builder4.apical();
                                }
                                this.bitField0_ |= 8;
                            } else if (iPolder != 42) {
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                }
                            } else {
                                JvmMethodSignature.saneness builder5 = (this.bitField0_ & 16) == 16 ? this.delegateMethod_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) marialVar.adultoid(JvmMethodSignature.PARSER, beachfrontVar);
                                this.delegateMethod_ = jvmMethodSignature4;
                                if (builder5 != null) {
                                    builder5.beachfront(jvmMethodSignature4);
                                    this.delegateMethod_ = builder5.apical();
                                }
                                this.bitField0_ |= 16;
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

        public static final class saneness extends GeneratedMessageLite.saneness<JvmPropertySignature, saneness> implements kowloon {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public int f31048arytenoidectomy;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public JvmFieldSignature f31051monoploid = JvmFieldSignature.getDefaultInstance();

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public JvmMethodSignature f31052polloi = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
            public JvmMethodSignature f31050molybdenite = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: graveside, reason: collision with root package name */
            public JvmMethodSignature f31049graveside = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
            public JvmMethodSignature f31047adultoid = JvmMethodSignature.getDefaultInstance();

            public saneness() {
                triweekly();
            }

            public static saneness impassible() {
                return new saneness();
            }

            public saneness adultoid(JvmMethodSignature jvmMethodSignature) {
                if ((this.f31048arytenoidectomy & 8) != 8 || this.f31049graveside == JvmMethodSignature.getDefaultInstance()) {
                    this.f31049graveside = jvmMethodSignature;
                } else {
                    this.f31049graveside = JvmMethodSignature.newBuilder(this.f31049graveside).beachfront(jvmMethodSignature).apical();
                }
                this.f31048arytenoidectomy |= 8;
                return this;
            }

            public JvmPropertySignature apical() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i = this.f31048arytenoidectomy;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmPropertySignature.field_ = this.f31051monoploid;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.syntheticMethod_ = this.f31052polloi;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.getter_ = this.f31050molybdenite;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.setter_ = this.f31049graveside;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                jvmPropertySignature.delegateMethod_ = this.f31047adultoid;
                jvmPropertySignature.bitField0_ = i2;
                return jvmPropertySignature;
            }

            public saneness dovishness(JvmMethodSignature jvmMethodSignature) {
                if ((this.f31048arytenoidectomy & 2) != 2 || this.f31052polloi == JvmMethodSignature.getDefaultInstance()) {
                    this.f31052polloi = jvmMethodSignature;
                } else {
                    this.f31052polloi = JvmMethodSignature.newBuilder(this.f31052polloi).beachfront(jvmMethodSignature).apical();
                }
                this.f31048arytenoidectomy |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
            public saneness wireman() {
                return impassible().beachfront(apical());
            }

            public saneness graveside(JvmMethodSignature jvmMethodSignature) {
                if ((this.f31048arytenoidectomy & 4) != 4 || this.f31050molybdenite == JvmMethodSignature.getDefaultInstance()) {
                    this.f31050molybdenite = jvmMethodSignature;
                } else {
                    this.f31050molybdenite = JvmMethodSignature.newBuilder(this.f31050molybdenite).beachfront(jvmMethodSignature).apical();
                }
                this.f31048arytenoidectomy |= 4;
                return this;
            }

            public saneness kowloon(JvmMethodSignature jvmMethodSignature) {
                if ((this.f31048arytenoidectomy & 16) != 16 || this.f31047adultoid == JvmMethodSignature.getDefaultInstance()) {
                    this.f31047adultoid = jvmMethodSignature;
                } else {
                    this.f31047adultoid = JvmMethodSignature.newBuilder(this.f31047adultoid).beachfront(jvmMethodSignature).apical();
                }
                this.f31048arytenoidectomy |= 16;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
            public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
                JvmPropertySignature jvmPropertySignature = null;
                try {
                    try {
                        JvmPropertySignature jvmPropertySignatureDern = JvmPropertySignature.PARSER.dern(marialVar, beachfrontVar);
                        if (jvmPropertySignatureDern != null) {
                            beachfront(jvmPropertySignatureDern);
                        }
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (jvmPropertySignature != null) {
                            beachfront(jvmPropertySignature);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    JvmPropertySignature jvmPropertySignature2 = (JvmPropertySignature) e.getUnfinishedMessage();
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        jvmPropertySignature = jvmPropertySignature2;
                        if (jvmPropertySignature != null) {
                            beachfront(jvmPropertySignature);
                        }
                        throw th;
                    }
                }
            }

            public saneness monoploid(JvmFieldSignature jvmFieldSignature) {
                if ((this.f31048arytenoidectomy & 1) != 1 || this.f31051monoploid == JvmFieldSignature.getDefaultInstance()) {
                    this.f31051monoploid = jvmFieldSignature;
                } else {
                    this.f31051monoploid = JvmFieldSignature.newBuilder(this.f31051monoploid).beachfront(jvmFieldSignature).apical();
                }
                this.f31048arytenoidectomy |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
            public saneness beachfront(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    monoploid(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    dovishness(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    graveside(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    adultoid(jvmPropertySignature.getSetter());
                }
                if (jvmPropertySignature.hasDelegateMethod()) {
                    kowloon(jvmPropertySignature.getDelegateMethod());
                }
                competently(marial().dern(jvmPropertySignature.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature build() {
                JvmPropertySignature jvmPropertySignatureApical = apical();
                if (jvmPropertySignatureApical.isInitialized()) {
                    return jvmPropertySignatureApical;
                }
                throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(jvmPropertySignatureApical);
            }

            private void triweekly() {
            }
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements kowloon {
        public static arytenoidectomy<StringTableTypes> PARSER = new attabal();

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final StringTableTypes f31053kowloon;
        private int localNameMemoizedSerializedSize;
        private List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Record> record_;
        private final wireman unknownFields;

        public static final class Record extends GeneratedMessageLite implements kowloon {
            public static arytenoidectomy<Record> PARSER = new attabal();

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public static final Record f31054kowloon;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private Operation operation_;
            private int predefinedIndex_;
            private int range_;
            private int replaceCharMemoizedSerializedSize;
            private List<Integer> replaceChar_;
            private Object string_;
            private int substringIndexMemoizedSerializedSize;
            private List<Integer> substringIndex_;
            private final wireman unknownFields;

            public enum Operation implements impromptu.attabal {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public static impromptu.saneness<Operation> f31056kowloon = new attabal();
                private final int value;

                public static class attabal implements impromptu.saneness<Operation> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
                    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
                    public Operation findValueByNumber(int i) {
                        return Operation.valueOf(i);
                    }
                }

                Operation(int i, int i2) {
                    this.value = i2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<Record> {
                @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
                /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
                public Record dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
                    return new Record(marialVar, beachfrontVar);
                }
            }

            static {
                Record record = new Record(true);
                f31054kowloon = record;
                record.saneness();
            }

            public static Record getDefaultInstance() {
                return f31054kowloon;
            }

            public static saneness newBuilder() {
                return saneness.impassible();
            }

            private void saneness() {
                this.range_ = 1;
                this.predefinedIndex_ = 0;
                this.string_ = "";
                this.operation_ = Operation.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                this.substringIndex_ = list;
                this.replaceChar_ = list;
            }

            public Operation getOperation() {
                return this.operation_;
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
            public arytenoidectomy<Record> getParserForType() {
                return PARSER;
            }

            public int getPredefinedIndex() {
                return this.predefinedIndex_;
            }

            public int getRange() {
                return this.range_;
            }

            public int getReplaceCharCount() {
                return this.replaceChar_.size();
            }

            public List<Integer> getReplaceCharList() {
                return this.replaceChar_;
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iKowloon = (this.bitField0_ & 1) == 1 ? CodedOutputStream.kowloon(1, this.range_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iKowloon += CodedOutputStream.kowloon(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    iKowloon += CodedOutputStream.impromptu(3, this.operation_.getNumber());
                }
                int iArytenoidectomy = 0;
                for (int i2 = 0; i2 < this.substringIndex_.size(); i2++) {
                    iArytenoidectomy += CodedOutputStream.arytenoidectomy(this.substringIndex_.get(i2).intValue());
                }
                int iArytenoidectomy2 = iKowloon + iArytenoidectomy;
                if (!getSubstringIndexList().isEmpty()) {
                    iArytenoidectomy2 = iArytenoidectomy2 + 1 + CodedOutputStream.arytenoidectomy(iArytenoidectomy);
                }
                this.substringIndexMemoizedSerializedSize = iArytenoidectomy;
                int iArytenoidectomy3 = 0;
                for (int i3 = 0; i3 < this.replaceChar_.size(); i3++) {
                    iArytenoidectomy3 += CodedOutputStream.arytenoidectomy(this.replaceChar_.get(i3).intValue());
                }
                int iWireman = iArytenoidectomy2 + iArytenoidectomy3;
                if (!getReplaceCharList().isEmpty()) {
                    iWireman = iWireman + 1 + CodedOutputStream.arytenoidectomy(iArytenoidectomy3);
                }
                this.replaceCharMemoizedSerializedSize = iArytenoidectomy3;
                if ((this.bitField0_ & 4) == 4) {
                    iWireman += CodedOutputStream.wireman(6, getStringBytes());
                }
                int size = iWireman + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public String getString() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                wireman wiremanVar = (wireman) obj;
                String strDovishness = wiremanVar.dovishness();
                if (wiremanVar.impassible()) {
                    this.string_ = strDovishness;
                }
                return strDovishness;
            }

            public wireman getStringBytes() {
                Object obj = this.string_;
                if (!(obj instanceof String)) {
                    return (wireman) obj;
                }
                wireman wiremanVarCompetently = wireman.competently((String) obj);
                this.string_ = wiremanVarCompetently;
                return wiremanVarCompetently;
            }

            public int getSubstringIndexCount() {
                return this.substringIndex_.size();
            }

            public List<Integer> getSubstringIndexList() {
                return this.substringIndex_;
            }

            public boolean hasOperation() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasPredefinedIndex() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasRange() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasString() {
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
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.cultivated(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.cultivated(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.walach(3, this.operation_.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.sensatory(34);
                    codedOutputStream.sensatory(this.substringIndexMemoizedSerializedSize);
                }
                for (int i = 0; i < this.substringIndex_.size(); i++) {
                    codedOutputStream.premeiotic(this.substringIndex_.get(i).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.sensatory(42);
                    codedOutputStream.sensatory(this.replaceCharMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                    codedOutputStream.premeiotic(this.replaceChar_.get(i2).intValue());
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.privatdozent(6, getStringBytes());
                }
                codedOutputStream.nosophobia(this.unknownFields);
            }

            public static saneness newBuilder(Record record) {
                return newBuilder().beachfront(record);
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Record getDefaultInstanceForType() {
                return f31054kowloon;
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
            public saneness newBuilderForType() {
                return newBuilder();
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
            public saneness toBuilder() {
                return newBuilder(this);
            }

            public Record(GeneratedMessageLite.saneness sanenessVar) {
                super(sanenessVar);
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = sanenessVar.marial();
            }

            public Record(boolean z) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = wireman.f31186kowloon;
            }

            public Record(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
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
                                    this.range_ = marialVar.molybdenite();
                                } else if (iPolder == 16) {
                                    this.bitField0_ |= 2;
                                    this.predefinedIndex_ = marialVar.molybdenite();
                                } else if (iPolder == 24) {
                                    int iTriweekly = marialVar.triweekly();
                                    Operation operationValueOf = Operation.valueOf(iTriweekly);
                                    if (operationValueOf == null) {
                                        codedOutputStreamMerc.sensatory(iPolder);
                                        codedOutputStreamMerc.sensatory(iTriweekly);
                                    } else {
                                        this.bitField0_ |= 8;
                                        this.operation_ = operationValueOf;
                                    }
                                } else if (iPolder == 32) {
                                    if ((i & 16) != 16) {
                                        this.substringIndex_ = new ArrayList();
                                        i |= 16;
                                    }
                                    this.substringIndex_.add(Integer.valueOf(marialVar.molybdenite()));
                                } else if (iPolder == 34) {
                                    int iCutely = marialVar.cutely(marialVar.cuirassed());
                                    if ((i & 16) != 16 && marialVar.marial() > 0) {
                                        this.substringIndex_ = new ArrayList();
                                        i |= 16;
                                    }
                                    while (marialVar.marial() > 0) {
                                        this.substringIndex_.add(Integer.valueOf(marialVar.molybdenite()));
                                    }
                                    marialVar.taiyuan(iCutely);
                                } else if (iPolder == 40) {
                                    if ((i & 32) != 32) {
                                        this.replaceChar_ = new ArrayList();
                                        i |= 32;
                                    }
                                    this.replaceChar_.add(Integer.valueOf(marialVar.molybdenite()));
                                } else if (iPolder == 42) {
                                    int iCutely2 = marialVar.cutely(marialVar.cuirassed());
                                    if ((i & 32) != 32 && marialVar.marial() > 0) {
                                        this.replaceChar_ = new ArrayList();
                                        i |= 32;
                                    }
                                    while (marialVar.marial() > 0) {
                                        this.replaceChar_.add(Integer.valueOf(marialVar.molybdenite()));
                                    }
                                    marialVar.taiyuan(iCutely2);
                                } else if (iPolder != 50) {
                                    if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                    }
                                } else {
                                    wireman wiremanVarFormularize = marialVar.formularize();
                                    this.bitField0_ |= 4;
                                    this.string_ = wiremanVarFormularize;
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if ((i & 16) == 16) {
                            this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                        }
                        if ((i & 32) == 32) {
                            this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
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
                if ((i & 16) == 16) {
                    this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                }
                if ((i & 32) == 32) {
                    this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                }
                try {
                    codedOutputStreamMerc.restrictive();
                } catch (IOException unused2) {
                } finally {
                    this.unknownFields = sanenessVarArytenoidectomy.cutely();
                }
                makeExtensionsImmutable();
            }

            public static final class saneness extends GeneratedMessageLite.saneness<Record, saneness> implements kowloon {

                /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
                public List<Integer> f31057adultoid;

                /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
                public int f31058arytenoidectomy;

                /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
                public List<Integer> f31059dovishness;

                /* JADX INFO: renamed from: polloi, reason: collision with root package name */
                public int f31063polloi;

                /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
                public int f31062monoploid = 1;

                /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
                public Object f31061molybdenite = "";

                /* JADX INFO: renamed from: graveside, reason: collision with root package name */
                public Operation f31060graveside = Operation.NONE;

                public saneness() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f31057adultoid = list;
                    this.f31059dovishness = list;
                    monoploid();
                }

                public static saneness impassible() {
                    return new saneness();
                }

                public saneness adultoid(int i) {
                    this.f31058arytenoidectomy |= 2;
                    this.f31063polloi = i;
                    return this;
                }

                public Record apical() {
                    Record record = new Record(this);
                    int i = this.f31058arytenoidectomy;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    record.range_ = this.f31062monoploid;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.predefinedIndex_ = this.f31063polloi;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.string_ = this.f31061molybdenite;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.operation_ = this.f31060graveside;
                    if ((this.f31058arytenoidectomy & 16) == 16) {
                        this.f31057adultoid = Collections.unmodifiableList(this.f31057adultoid);
                        this.f31058arytenoidectomy &= -17;
                    }
                    record.substringIndex_ = this.f31057adultoid;
                    if ((this.f31058arytenoidectomy & 32) == 32) {
                        this.f31059dovishness = Collections.unmodifiableList(this.f31059dovishness);
                        this.f31058arytenoidectomy &= -33;
                    }
                    record.replaceChar_ = this.f31059dovishness;
                    record.bitField0_ = i2;
                    return record;
                }

                public saneness dovishness(int i) {
                    this.f31058arytenoidectomy |= 1;
                    this.f31062monoploid = i;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
                /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
                public saneness wireman() {
                    return impassible().beachfront(apical());
                }

                public saneness graveside(Operation operation) {
                    operation.getClass();
                    this.f31058arytenoidectomy |= 8;
                    this.f31060graveside = operation;
                    return this;
                }

                public final void kowloon() {
                    if ((this.f31058arytenoidectomy & 16) != 16) {
                        this.f31057adultoid = new ArrayList(this.f31057adultoid);
                        this.f31058arytenoidectomy |= 16;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
                /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
                public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
                    Record record = null;
                    try {
                        try {
                            Record recordDern = Record.PARSER.dern(marialVar, beachfrontVar);
                            if (recordDern != null) {
                                beachfront(recordDern);
                            }
                            return this;
                        } catch (Throwable th) {
                            th = th;
                            if (record != null) {
                                beachfront(record);
                            }
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        Record record2 = (Record) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            record = record2;
                            if (record != null) {
                                beachfront(record);
                            }
                            throw th;
                        }
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
                /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
                public saneness beachfront(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        dovishness(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        adultoid(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.f31058arytenoidectomy |= 4;
                        this.f31061molybdenite = record.string_;
                    }
                    if (record.hasOperation()) {
                        graveside(record.getOperation());
                    }
                    if (!record.substringIndex_.isEmpty()) {
                        if (this.f31057adultoid.isEmpty()) {
                            this.f31057adultoid = record.substringIndex_;
                            this.f31058arytenoidectomy &= -17;
                        } else {
                            kowloon();
                            this.f31057adultoid.addAll(record.substringIndex_);
                        }
                    }
                    if (!record.replaceChar_.isEmpty()) {
                        if (this.f31059dovishness.isEmpty()) {
                            this.f31059dovishness = record.replaceChar_;
                            this.f31058arytenoidectomy &= -33;
                        } else {
                            triweekly();
                            this.f31059dovishness.addAll(record.replaceChar_);
                        }
                    }
                    competently(marial().dern(record.unknownFields));
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
                /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
                public Record build() {
                    Record recordApical = apical();
                    if (recordApical.isInitialized()) {
                        return recordApical;
                    }
                    throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(recordApical);
                }

                public final void triweekly() {
                    if ((this.f31058arytenoidectomy & 32) != 32) {
                        this.f31059dovishness = new ArrayList(this.f31059dovishness);
                        this.f31058arytenoidectomy |= 32;
                    }
                }

                private void monoploid() {
                }
            }
        }

        public static class attabal extends p002kotlin.reflect.jvm.internal.impl.protobuf.saneness<StringTableTypes> {
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
            /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
            public StringTableTypes dern(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
                return new StringTableTypes(marialVar, beachfrontVar);
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes(true);
            f31053kowloon = stringTableTypes;
            stringTableTypes.saneness();
        }

        public static StringTableTypes getDefaultInstance() {
            return f31053kowloon;
        }

        public static saneness newBuilder() {
            return saneness.impassible();
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, beachfront beachfrontVar) throws IOException {
            return PARSER.wireman(inputStream, beachfrontVar);
        }

        private void saneness() {
            List list = Collections.EMPTY_LIST;
            this.record_ = list;
            this.localName_ = list;
        }

        public List<Integer> getLocalNameList() {
            return this.localName_;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public arytenoidectomy<StringTableTypes> getParserForType() {
            return PARSER;
        }

        public List<Record> getRecordList() {
            return this.record_;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iMolybdenite = 0;
            for (int i2 = 0; i2 < this.record_.size(); i2++) {
                iMolybdenite += CodedOutputStream.molybdenite(1, this.record_.get(i2));
            }
            int iArytenoidectomy = 0;
            for (int i3 = 0; i3 < this.localName_.size(); i3++) {
                iArytenoidectomy += CodedOutputStream.arytenoidectomy(this.localName_.get(i3).intValue());
            }
            int iArytenoidectomy2 = iMolybdenite + iArytenoidectomy;
            if (!getLocalNameList().isEmpty()) {
                iArytenoidectomy2 = iArytenoidectomy2 + 1 + CodedOutputStream.arytenoidectomy(iArytenoidectomy);
            }
            this.localNameMemoizedSerializedSize = iArytenoidectomy;
            int size = iArytenoidectomy2 + this.unknownFields.size();
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
            for (int i = 0; i < this.record_.size(); i++) {
                codedOutputStream.milliradian(1, this.record_.get(i));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.sensatory(42);
                codedOutputStream.sensatory(this.localNameMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.localName_.size(); i2++) {
                codedOutputStream.premeiotic(this.localName_.get(i2).intValue());
            }
            codedOutputStream.nosophobia(this.unknownFields);
        }

        public static saneness newBuilder(StringTableTypes stringTableTypes) {
            return newBuilder().beachfront(stringTableTypes);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public StringTableTypes getDefaultInstanceForType() {
            return f31053kowloon;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness newBuilderForType() {
            return newBuilder();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public saneness toBuilder() {
            return newBuilder(this);
        }

        public StringTableTypes(GeneratedMessageLite.saneness sanenessVar) {
            super(sanenessVar);
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = sanenessVar.marial();
        }

        public StringTableTypes(boolean z) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = wireman.f31186kowloon;
        }

        public StringTableTypes(marial marialVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
            this.localNameMemoizedSerializedSize = -1;
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
                            if (iPolder == 10) {
                                if ((i & 1) != 1) {
                                    this.record_ = new ArrayList();
                                    i |= 1;
                                }
                                this.record_.add((Record) marialVar.adultoid(Record.PARSER, beachfrontVar));
                            } else if (iPolder == 40) {
                                if ((i & 2) != 2) {
                                    this.localName_ = new ArrayList();
                                    i |= 2;
                                }
                                this.localName_.add(Integer.valueOf(marialVar.molybdenite()));
                            } else if (iPolder != 42) {
                                if (!parseUnknownField(marialVar, codedOutputStreamMerc, beachfrontVar, iPolder)) {
                                }
                            } else {
                                int iCutely = marialVar.cutely(marialVar.cuirassed());
                                if ((i & 2) != 2 && marialVar.marial() > 0) {
                                    this.localName_ = new ArrayList();
                                    i |= 2;
                                }
                                while (marialVar.marial() > 0) {
                                    this.localName_.add(Integer.valueOf(marialVar.molybdenite()));
                                }
                                marialVar.taiyuan(iCutely);
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.record_ = Collections.unmodifiableList(this.record_);
                    }
                    if ((i & 2) == 2) {
                        this.localName_ = Collections.unmodifiableList(this.localName_);
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
            if ((i & 1) == 1) {
                this.record_ = Collections.unmodifiableList(this.record_);
            }
            if ((i & 2) == 2) {
                this.localName_ = Collections.unmodifiableList(this.localName_);
            }
            try {
                codedOutputStreamMerc.restrictive();
            } catch (IOException unused2) {
            } finally {
                this.unknownFields = sanenessVarArytenoidectomy.cutely();
            }
            makeExtensionsImmutable();
        }

        public static final class saneness extends GeneratedMessageLite.saneness<StringTableTypes, saneness> implements kowloon {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public int f31064arytenoidectomy;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public List<Record> f31065monoploid;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public List<Integer> f31066polloi;

            public saneness() {
                List list = Collections.EMPTY_LIST;
                this.f31065monoploid = list;
                this.f31066polloi = list;
                monoploid();
            }

            public static saneness impassible() {
                return new saneness();
            }

            public StringTableTypes apical() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f31064arytenoidectomy & 1) == 1) {
                    this.f31065monoploid = Collections.unmodifiableList(this.f31065monoploid);
                    this.f31064arytenoidectomy &= -2;
                }
                stringTableTypes.record_ = this.f31065monoploid;
                if ((this.f31064arytenoidectomy & 2) == 2) {
                    this.f31066polloi = Collections.unmodifiableList(this.f31066polloi);
                    this.f31064arytenoidectomy &= -3;
                }
                stringTableTypes.localName_ = this.f31066polloi;
                return stringTableTypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
            public saneness wireman() {
                return impassible().beachfront(apical());
            }

            public final void kowloon() {
                if ((this.f31064arytenoidectomy & 1) != 1) {
                    this.f31065monoploid = new ArrayList(this.f31065monoploid);
                    this.f31064arytenoidectomy |= 1;
                }
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal, kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
            public saneness cutely(marial marialVar, beachfront beachfrontVar) throws Throwable {
                StringTableTypes stringTableTypes = null;
                try {
                    try {
                        StringTableTypes stringTableTypesDern = StringTableTypes.PARSER.dern(marialVar, beachfrontVar);
                        if (stringTableTypesDern != null) {
                            beachfront(stringTableTypesDern);
                        }
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (stringTableTypes != null) {
                            beachfront(stringTableTypes);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    StringTableTypes stringTableTypes2 = (StringTableTypes) e.getUnfinishedMessage();
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        stringTableTypes = stringTableTypes2;
                        if (stringTableTypes != null) {
                            beachfront(stringTableTypes);
                        }
                        throw th;
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.saneness
            /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
            public saneness beachfront(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.record_.isEmpty()) {
                    if (this.f31065monoploid.isEmpty()) {
                        this.f31065monoploid = stringTableTypes.record_;
                        this.f31064arytenoidectomy &= -2;
                    } else {
                        kowloon();
                        this.f31065monoploid.addAll(stringTableTypes.record_);
                    }
                }
                if (!stringTableTypes.localName_.isEmpty()) {
                    if (this.f31066polloi.isEmpty()) {
                        this.f31066polloi = stringTableTypes.localName_;
                        this.f31064arytenoidectomy &= -3;
                    } else {
                        triweekly();
                        this.f31066polloi.addAll(stringTableTypes.localName_);
                    }
                }
                competently(marial().dern(stringTableTypes.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
            /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
            public StringTableTypes build() {
                StringTableTypes stringTableTypesApical = apical();
                if (stringTableTypesApical.isInitialized()) {
                    return stringTableTypesApical;
                }
                throw p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal.dern(stringTableTypesApical);
            }

            public final void triweekly() {
                if ((this.f31064arytenoidectomy & 2) != 2) {
                    this.f31066polloi = new ArrayList(this.f31066polloi);
                    this.f31064arytenoidectomy |= 2;
                }
            }

            private void monoploid() {
            }
        }
    }

    static {
        ProtoBuf$Constructor defaultInstance = ProtoBuf$Constructor.getDefaultInstance();
        JvmMethodSignature defaultInstance2 = JvmMethodSignature.getDefaultInstance();
        JvmMethodSignature defaultInstance3 = JvmMethodSignature.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        f31025attabal = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, null, 100, fieldType, JvmMethodSignature.class);
        f31034saneness = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf$Function defaultInstance4 = ProtoBuf$Function.getDefaultInstance();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.INT32;
        f31029dern = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance4, 0, null, null, 101, fieldType2, Integer.class);
        f31037wireman = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, fieldType, JvmPropertySignature.class);
        f31033marial = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Property.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f31026beachfront = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf$Type.getDefaultInstance(), ProtoBuf$Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf$Annotation.class);
        f31027competently = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Type.getDefaultInstance(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.BOOL, Boolean.class);
        f31032impromptu = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf$TypeParameter.getDefaultInstance(), ProtoBuf$Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf$Annotation.class);
        f31035taiyuan = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Class.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f31028cutely = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf$Class.getDefaultInstance(), ProtoBuf$Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf$Property.class);
        f31024apical = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Class.getDefaultInstance(), 0, null, null, 103, fieldType2, Integer.class);
        f31030formularize = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Class.getDefaultInstance(), 0, null, null, 104, fieldType2, Integer.class);
        f31031impassible = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Package.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f31036triweekly = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf$Package.getDefaultInstance(), ProtoBuf$Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf$Property.class);
    }

    public static void attabal(beachfront beachfrontVar) {
        beachfrontVar.attabal(f31025attabal);
        beachfrontVar.attabal(f31034saneness);
        beachfrontVar.attabal(f31029dern);
        beachfrontVar.attabal(f31037wireman);
        beachfrontVar.attabal(f31033marial);
        beachfrontVar.attabal(f31026beachfront);
        beachfrontVar.attabal(f31027competently);
        beachfrontVar.attabal(f31032impromptu);
        beachfrontVar.attabal(f31035taiyuan);
        beachfrontVar.attabal(f31028cutely);
        beachfrontVar.attabal(f31024apical);
        beachfrontVar.attabal(f31030formularize);
        beachfrontVar.attabal(f31031impassible);
        beachfrontVar.attabal(f31036triweekly);
    }
}
