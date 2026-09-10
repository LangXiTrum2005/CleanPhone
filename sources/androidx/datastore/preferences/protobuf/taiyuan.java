package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan implements cultivated {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impromptu f9870attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f9871dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f9872saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f9873wireman = 0;

    /* JADX INFO: compiled from: CodedInputStreamReader.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f9874attabal;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9874attabal = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9874attabal[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9874attabal[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9874attabal[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9874attabal[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9874attabal[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9874attabal[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9874attabal[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9874attabal[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9874attabal[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9874attabal[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9874attabal[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9874attabal[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9874attabal[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9874attabal[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9874attabal[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9874attabal[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public taiyuan(impromptu impromptuVar) {
        impromptu impromptuVar2 = (impromptu) gintrap.saneness(impromptuVar, "input");
        this.f9870attabal = impromptuVar2;
        impromptuVar2.f9730wireman = this;
    }

    public static taiyuan impromptu(impromptu impromptuVar) {
        taiyuan taiyuanVar = impromptuVar.f9730wireman;
        return taiyuanVar != null ? taiyuanVar : new taiyuan(impromptuVar);
    }

    public final Object apical(WireFormat.FieldType fieldType, Class<?> cls, triweekly triweeklyVar) throws IOException {
        switch (attabal.f9874attabal[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return dern(cls, triweeklyVar);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void arytenoidectomy(int i) throws IOException {
        if (WireFormat.saneness(this.f9872saneness) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public <T> void attabal(T t, premeiotic<T> premeioticVar, triweekly triweeklyVar) throws IOException {
        arytenoidectomy(2);
        cutely(t, premeioticVar, triweeklyVar);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public <T> void beachfront(T t, premeiotic<T> premeioticVar, triweekly triweeklyVar) throws IOException {
        arytenoidectomy(3);
        taiyuan(t, premeioticVar, triweeklyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.cultivated
    @Deprecated
    public <T> void competently(List<T> list, premeiotic<T> premeioticVar, triweekly triweeklyVar) throws IOException {
        int iYemenite;
        if (WireFormat.saneness(this.f9872saneness) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f9872saneness;
        do {
            list.add(formularize(premeioticVar, triweeklyVar));
            if (this.f9870attabal.beachfront() || this.f9873wireman != 0) {
                return;
            } else {
                iYemenite = this.f9870attabal.yemenite();
            }
        } while (iYemenite == i);
        this.f9873wireman = iYemenite;
    }

    public final <T> void cutely(T t, premeiotic<T> premeioticVar, triweekly triweeklyVar) throws IOException {
        int iSealless = this.f9870attabal.sealless();
        impromptu impromptuVar = this.f9870attabal;
        if (impromptuVar.f9726attabal >= impromptuVar.f9729saneness) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iKowloon = impromptuVar.kowloon(iSealless);
        this.f9870attabal.f9726attabal++;
        premeioticVar.attabal(t, this, triweeklyVar);
        this.f9870attabal.attabal(0);
        impromptu impromptuVar2 = this.f9870attabal;
        impromptuVar2.f9726attabal--;
        impromptuVar2.triweekly(iKowloon);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public <T> T dern(Class<T> cls, triweekly triweeklyVar) throws IOException {
        arytenoidectomy(2);
        return (T) impassible(clubfoot.attabal().dern(cls), triweeklyVar);
    }

    public final <T> T formularize(premeiotic<T> premeioticVar, triweekly triweeklyVar) throws IOException {
        T tNewInstance = premeioticVar.newInstance();
        taiyuan(tNewInstance, premeioticVar, triweeklyVar);
        premeioticVar.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public int getFieldNumber() throws IOException {
        int i = this.f9873wireman;
        if (i != 0) {
            this.f9872saneness = i;
            this.f9873wireman = 0;
        } else {
            this.f9872saneness = this.f9870attabal.yemenite();
        }
        int i2 = this.f9872saneness;
        if (i2 == 0 || i2 == this.f9871dern) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.attabal(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public int getTag() {
        return this.f9872saneness;
    }

    public final <T> T impassible(premeiotic<T> premeioticVar, triweekly triweeklyVar) throws IOException {
        T tNewInstance = premeioticVar.newInstance();
        cutely(tNewInstance, premeioticVar, triweeklyVar);
        premeioticVar.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    public final void kowloon(int i) throws IOException {
        if (this.f9870attabal.marial() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.cultivated
    public <K, V> void marial(Map<K, V> map, supplicat.attabal<K, V> attabalVar, triweekly triweeklyVar) throws IOException {
        arytenoidectomy(2);
        int iKowloon = this.f9870attabal.kowloon(this.f9870attabal.sealless());
        Object objApical = attabalVar.f9868saneness;
        Object objApical2 = attabalVar.f9869wireman;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.f9870attabal.beachfront()) {
                    break;
                }
                if (fieldNumber == 1) {
                    objApical = apical(attabalVar.f9866attabal, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objApical2 = apical(attabalVar.f9867dern, attabalVar.f9869wireman.getClass(), triweeklyVar);
                }
            } catch (Throwable th) {
                this.f9870attabal.triweekly(iKowloon);
                throw th;
            }
        }
        map.put(objApical, objApical2);
        this.f9870attabal.triweekly(iKowloon);
    }

    public final void monoploid(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final void polloi(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public boolean readBool() throws IOException {
        arytenoidectomy(0);
        return this.f9870attabal.arytenoidectomy();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readBoolList(List<Boolean> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof marial)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Boolean.valueOf(this.f9870attabal.arytenoidectomy()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMarial = this.f9870attabal.marial() + this.f9870attabal.sealless();
            do {
                list.add(Boolean.valueOf(this.f9870attabal.arytenoidectomy()));
            } while (this.f9870attabal.marial() < iMarial);
            kowloon(iMarial);
            return;
        }
        marial marialVar = (marial) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 0) {
            do {
                marialVar.addBoolean(this.f9870attabal.arytenoidectomy());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMarial2 = this.f9870attabal.marial() + this.f9870attabal.sealless();
        do {
            marialVar.addBoolean(this.f9870attabal.arytenoidectomy());
        } while (this.f9870attabal.marial() < iMarial2);
        kowloon(iMarial2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public ByteString readBytes() throws IOException {
        arytenoidectomy(2);
        return this.f9870attabal.monoploid();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readBytesList(List<ByteString> list) throws IOException {
        int iYemenite;
        if (WireFormat.saneness(this.f9872saneness) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.f9870attabal.beachfront()) {
                return;
            } else {
                iYemenite = this.f9870attabal.yemenite();
            }
        } while (iYemenite == this.f9872saneness);
        this.f9873wireman = iYemenite;
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public double readDouble() throws IOException {
        arytenoidectomy(1);
        return this.f9870attabal.polloi();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readDoubleList(List<Double> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof apical)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 1) {
                do {
                    list.add(Double.valueOf(this.f9870attabal.polloi()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iSealless = this.f9870attabal.sealless();
            polloi(iSealless);
            int iMarial = this.f9870attabal.marial() + iSealless;
            do {
                list.add(Double.valueOf(this.f9870attabal.polloi()));
            } while (this.f9870attabal.marial() < iMarial);
            return;
        }
        apical apicalVar = (apical) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 1) {
            do {
                apicalVar.addDouble(this.f9870attabal.polloi());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iSealless2 = this.f9870attabal.sealless();
        polloi(iSealless2);
        int iMarial2 = this.f9870attabal.marial() + iSealless2;
        do {
            apicalVar.addDouble(this.f9870attabal.polloi());
        } while (this.f9870attabal.marial() < iMarial2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public int readEnum() throws IOException {
        arytenoidectomy(0);
        return this.f9870attabal.molybdenite();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readEnumList(List<Integer> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof dovishness)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Integer.valueOf(this.f9870attabal.molybdenite()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMarial = this.f9870attabal.marial() + this.f9870attabal.sealless();
            do {
                list.add(Integer.valueOf(this.f9870attabal.molybdenite()));
            } while (this.f9870attabal.marial() < iMarial);
            kowloon(iMarial);
            return;
        }
        dovishness dovishnessVar = (dovishness) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 0) {
            do {
                dovishnessVar.addInt(this.f9870attabal.molybdenite());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMarial2 = this.f9870attabal.marial() + this.f9870attabal.sealless();
        do {
            dovishnessVar.addInt(this.f9870attabal.molybdenite());
        } while (this.f9870attabal.marial() < iMarial2);
        kowloon(iMarial2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public int readFixed32() throws IOException {
        arytenoidectomy(5);
        return this.f9870attabal.graveside();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readFixed32List(List<Integer> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof dovishness)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 2) {
                int iSealless = this.f9870attabal.sealless();
                monoploid(iSealless);
                int iMarial = this.f9870attabal.marial() + iSealless;
                do {
                    list.add(Integer.valueOf(this.f9870attabal.graveside()));
                } while (this.f9870attabal.marial() < iMarial);
                return;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f9870attabal.graveside()));
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite = this.f9870attabal.yemenite();
                }
            } while (iYemenite == this.f9872saneness);
            this.f9873wireman = iYemenite;
            return;
        }
        dovishness dovishnessVar = (dovishness) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 2) {
            int iSealless2 = this.f9870attabal.sealless();
            monoploid(iSealless2);
            int iMarial2 = this.f9870attabal.marial() + iSealless2;
            do {
                dovishnessVar.addInt(this.f9870attabal.graveside());
            } while (this.f9870attabal.marial() < iMarial2);
            return;
        }
        if (iSaneness2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            dovishnessVar.addInt(this.f9870attabal.graveside());
            if (this.f9870attabal.beachfront()) {
                return;
            } else {
                iYemenite2 = this.f9870attabal.yemenite();
            }
        } while (iYemenite2 == this.f9872saneness);
        this.f9873wireman = iYemenite2;
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public long readFixed64() throws IOException {
        arytenoidectomy(1);
        return this.f9870attabal.adultoid();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readFixed64List(List<Long> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof sealless)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 1) {
                do {
                    list.add(Long.valueOf(this.f9870attabal.adultoid()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iSealless = this.f9870attabal.sealless();
            polloi(iSealless);
            int iMarial = this.f9870attabal.marial() + iSealless;
            do {
                list.add(Long.valueOf(this.f9870attabal.adultoid()));
            } while (this.f9870attabal.marial() < iMarial);
            return;
        }
        sealless seallessVar = (sealless) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 1) {
            do {
                seallessVar.addLong(this.f9870attabal.adultoid());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iSealless2 = this.f9870attabal.sealless();
        polloi(iSealless2);
        int iMarial2 = this.f9870attabal.marial() + iSealless2;
        do {
            seallessVar.addLong(this.f9870attabal.adultoid());
        } while (this.f9870attabal.marial() < iMarial2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public float readFloat() throws IOException {
        arytenoidectomy(5);
        return this.f9870attabal.dovishness();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readFloatList(List<Float> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof graveside)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 2) {
                int iSealless = this.f9870attabal.sealless();
                monoploid(iSealless);
                int iMarial = this.f9870attabal.marial() + iSealless;
                do {
                    list.add(Float.valueOf(this.f9870attabal.dovishness()));
                } while (this.f9870attabal.marial() < iMarial);
                return;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.f9870attabal.dovishness()));
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite = this.f9870attabal.yemenite();
                }
            } while (iYemenite == this.f9872saneness);
            this.f9873wireman = iYemenite;
            return;
        }
        graveside gravesideVar = (graveside) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 2) {
            int iSealless2 = this.f9870attabal.sealless();
            monoploid(iSealless2);
            int iMarial2 = this.f9870attabal.marial() + iSealless2;
            do {
                gravesideVar.addFloat(this.f9870attabal.dovishness());
            } while (this.f9870attabal.marial() < iMarial2);
            return;
        }
        if (iSaneness2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            gravesideVar.addFloat(this.f9870attabal.dovishness());
            if (this.f9870attabal.beachfront()) {
                return;
            } else {
                iYemenite2 = this.f9870attabal.yemenite();
            }
        } while (iYemenite2 == this.f9872saneness);
        this.f9873wireman = iYemenite2;
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public int readInt32() throws IOException {
        arytenoidectomy(0);
        return this.f9870attabal.gintrap();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readInt32List(List<Integer> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof dovishness)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Integer.valueOf(this.f9870attabal.gintrap()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMarial = this.f9870attabal.marial() + this.f9870attabal.sealless();
            do {
                list.add(Integer.valueOf(this.f9870attabal.gintrap()));
            } while (this.f9870attabal.marial() < iMarial);
            kowloon(iMarial);
            return;
        }
        dovishness dovishnessVar = (dovishness) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 0) {
            do {
                dovishnessVar.addInt(this.f9870attabal.gintrap());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMarial2 = this.f9870attabal.marial() + this.f9870attabal.sealless();
        do {
            dovishnessVar.addInt(this.f9870attabal.gintrap());
        } while (this.f9870attabal.marial() < iMarial2);
        kowloon(iMarial2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public long readInt64() throws IOException {
        arytenoidectomy(0);
        return this.f9870attabal.rotuma();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readInt64List(List<Long> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof sealless)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Long.valueOf(this.f9870attabal.rotuma()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMarial = this.f9870attabal.marial() + this.f9870attabal.sealless();
            do {
                list.add(Long.valueOf(this.f9870attabal.rotuma()));
            } while (this.f9870attabal.marial() < iMarial);
            kowloon(iMarial);
            return;
        }
        sealless seallessVar = (sealless) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 0) {
            do {
                seallessVar.addLong(this.f9870attabal.rotuma());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMarial2 = this.f9870attabal.marial() + this.f9870attabal.sealless();
        do {
            seallessVar.addLong(this.f9870attabal.rotuma());
        } while (this.f9870attabal.marial() < iMarial2);
        kowloon(iMarial2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public int readSFixed32() throws IOException {
        arytenoidectomy(5);
        return this.f9870attabal.preprohormone();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readSFixed32List(List<Integer> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof dovishness)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 2) {
                int iSealless = this.f9870attabal.sealless();
                monoploid(iSealless);
                int iMarial = this.f9870attabal.marial() + iSealless;
                do {
                    list.add(Integer.valueOf(this.f9870attabal.preprohormone()));
                } while (this.f9870attabal.marial() < iMarial);
                return;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f9870attabal.preprohormone()));
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite = this.f9870attabal.yemenite();
                }
            } while (iYemenite == this.f9872saneness);
            this.f9873wireman = iYemenite;
            return;
        }
        dovishness dovishnessVar = (dovishness) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 2) {
            int iSealless2 = this.f9870attabal.sealless();
            monoploid(iSealless2);
            int iMarial2 = this.f9870attabal.marial() + iSealless2;
            do {
                dovishnessVar.addInt(this.f9870attabal.preprohormone());
            } while (this.f9870attabal.marial() < iMarial2);
            return;
        }
        if (iSaneness2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            dovishnessVar.addInt(this.f9870attabal.preprohormone());
            if (this.f9870attabal.beachfront()) {
                return;
            } else {
                iYemenite2 = this.f9870attabal.yemenite();
            }
        } while (iYemenite2 == this.f9872saneness);
        this.f9873wireman = iYemenite2;
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public long readSFixed64() throws IOException {
        arytenoidectomy(1);
        return this.f9870attabal.cord();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readSFixed64List(List<Long> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof sealless)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 1) {
                do {
                    list.add(Long.valueOf(this.f9870attabal.cord()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iSealless = this.f9870attabal.sealless();
            polloi(iSealless);
            int iMarial = this.f9870attabal.marial() + iSealless;
            do {
                list.add(Long.valueOf(this.f9870attabal.cord()));
            } while (this.f9870attabal.marial() < iMarial);
            return;
        }
        sealless seallessVar = (sealless) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 1) {
            do {
                seallessVar.addLong(this.f9870attabal.cord());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iSealless2 = this.f9870attabal.sealless();
        polloi(iSealless2);
        int iMarial2 = this.f9870attabal.marial() + iSealless2;
        do {
            seallessVar.addLong(this.f9870attabal.cord());
        } while (this.f9870attabal.marial() < iMarial2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public int readSInt32() throws IOException {
        arytenoidectomy(0);
        return this.f9870attabal.cuirassed();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readSInt32List(List<Integer> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof dovishness)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Integer.valueOf(this.f9870attabal.cuirassed()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMarial = this.f9870attabal.marial() + this.f9870attabal.sealless();
            do {
                list.add(Integer.valueOf(this.f9870attabal.cuirassed()));
            } while (this.f9870attabal.marial() < iMarial);
            kowloon(iMarial);
            return;
        }
        dovishness dovishnessVar = (dovishness) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 0) {
            do {
                dovishnessVar.addInt(this.f9870attabal.cuirassed());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMarial2 = this.f9870attabal.marial() + this.f9870attabal.sealless();
        do {
            dovishnessVar.addInt(this.f9870attabal.cuirassed());
        } while (this.f9870attabal.marial() < iMarial2);
        kowloon(iMarial2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public long readSInt64() throws IOException {
        arytenoidectomy(0);
        return this.f9870attabal.stratoscope();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readSInt64List(List<Long> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof sealless)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Long.valueOf(this.f9870attabal.stratoscope()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMarial = this.f9870attabal.marial() + this.f9870attabal.sealless();
            do {
                list.add(Long.valueOf(this.f9870attabal.stratoscope()));
            } while (this.f9870attabal.marial() < iMarial);
            kowloon(iMarial);
            return;
        }
        sealless seallessVar = (sealless) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 0) {
            do {
                seallessVar.addLong(this.f9870attabal.stratoscope());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMarial2 = this.f9870attabal.marial() + this.f9870attabal.sealless();
        do {
            seallessVar.addLong(this.f9870attabal.stratoscope());
        } while (this.f9870attabal.marial() < iMarial2);
        kowloon(iMarial2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public String readString() throws IOException {
        arytenoidectomy(2);
        return this.f9870attabal.trm();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readStringList(List<String> list) throws IOException {
        triweekly(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        triweekly(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public String readStringRequireUtf8() throws IOException {
        arytenoidectomy(2);
        return this.f9870attabal.oilcan();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public int readUInt32() throws IOException {
        arytenoidectomy(0);
        return this.f9870attabal.sealless();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readUInt32List(List<Integer> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof dovishness)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Integer.valueOf(this.f9870attabal.sealless()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMarial = this.f9870attabal.marial() + this.f9870attabal.sealless();
            do {
                list.add(Integer.valueOf(this.f9870attabal.sealless()));
            } while (this.f9870attabal.marial() < iMarial);
            kowloon(iMarial);
            return;
        }
        dovishness dovishnessVar = (dovishness) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 0) {
            do {
                dovishnessVar.addInt(this.f9870attabal.sealless());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMarial2 = this.f9870attabal.marial() + this.f9870attabal.sealless();
        do {
            dovishnessVar.addInt(this.f9870attabal.sealless());
        } while (this.f9870attabal.marial() < iMarial2);
        kowloon(iMarial2);
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public long readUInt64() throws IOException {
        arytenoidectomy(0);
        return this.f9870attabal.kattegat();
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public void readUInt64List(List<Long> list) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (!(list instanceof sealless)) {
            int iSaneness = WireFormat.saneness(this.f9872saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Long.valueOf(this.f9870attabal.kattegat()));
                    if (this.f9870attabal.beachfront()) {
                        return;
                    } else {
                        iYemenite = this.f9870attabal.yemenite();
                    }
                } while (iYemenite == this.f9872saneness);
                this.f9873wireman = iYemenite;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMarial = this.f9870attabal.marial() + this.f9870attabal.sealless();
            do {
                list.add(Long.valueOf(this.f9870attabal.kattegat()));
            } while (this.f9870attabal.marial() < iMarial);
            kowloon(iMarial);
            return;
        }
        sealless seallessVar = (sealless) list;
        int iSaneness2 = WireFormat.saneness(this.f9872saneness);
        if (iSaneness2 == 0) {
            do {
                seallessVar.addLong(this.f9870attabal.kattegat());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite2 = this.f9870attabal.yemenite();
                }
            } while (iYemenite2 == this.f9872saneness);
            this.f9873wireman = iYemenite2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMarial2 = this.f9870attabal.marial() + this.f9870attabal.sealless();
        do {
            seallessVar.addLong(this.f9870attabal.kattegat());
        } while (this.f9870attabal.marial() < iMarial2);
        kowloon(iMarial2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.cultivated
    public <T> void saneness(List<T> list, premeiotic<T> premeioticVar, triweekly triweeklyVar) throws IOException {
        int iYemenite;
        if (WireFormat.saneness(this.f9872saneness) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f9872saneness;
        do {
            list.add(impassible(premeioticVar, triweeklyVar));
            if (this.f9870attabal.beachfront() || this.f9873wireman != 0) {
                return;
            } else {
                iYemenite = this.f9870attabal.yemenite();
            }
        } while (iYemenite == i);
        this.f9873wireman = iYemenite;
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    public boolean skipField() throws IOException {
        int i;
        if (this.f9870attabal.beachfront() || (i = this.f9872saneness) == this.f9871dern) {
            return false;
        }
        return this.f9870attabal.supplicat(i);
    }

    public final <T> void taiyuan(T t, premeiotic<T> premeioticVar, triweekly triweeklyVar) throws IOException {
        int i = this.f9871dern;
        this.f9871dern = WireFormat.dern(WireFormat.attabal(this.f9872saneness), 4);
        try {
            premeioticVar.attabal(t, this, triweeklyVar);
            if (this.f9872saneness != this.f9871dern) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f9871dern = i;
        } catch (Throwable th) {
            this.f9871dern = i;
            throw th;
        }
    }

    public void triweekly(List<String> list, boolean z) throws IOException {
        int iYemenite;
        int iYemenite2;
        if (WireFormat.saneness(this.f9872saneness) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof stratoscope) || z) {
            do {
                list.add(z ? readStringRequireUtf8() : readString());
                if (this.f9870attabal.beachfront()) {
                    return;
                } else {
                    iYemenite = this.f9870attabal.yemenite();
                }
            } while (iYemenite == this.f9872saneness);
            this.f9873wireman = iYemenite;
            return;
        }
        stratoscope stratoscopeVar = (stratoscope) list;
        do {
            stratoscopeVar.starveling(readBytes());
            if (this.f9870attabal.beachfront()) {
                return;
            } else {
                iYemenite2 = this.f9870attabal.yemenite();
            }
        } while (iYemenite2 == this.f9872saneness);
        this.f9873wireman = iYemenite2;
    }

    @Override // androidx.datastore.preferences.protobuf.cultivated
    @Deprecated
    public <T> T wireman(Class<T> cls, triweekly triweeklyVar) throws IOException {
        arytenoidectomy(3);
        return (T) formularize(clubfoot.attabal().dern(cls), triweeklyVar);
    }
}
