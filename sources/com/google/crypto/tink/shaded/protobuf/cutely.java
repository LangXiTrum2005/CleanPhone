package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cutely implements cultivated {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final taiyuan f22184attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f22185dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f22186saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f22187wireman = 0;

    public cutely(taiyuan taiyuanVar) {
        taiyuan taiyuanVar2 = (taiyuan) rotuma.saneness(taiyuanVar, "input");
        this.f22184attabal = taiyuanVar2;
        taiyuanVar2.f22323marial = this;
    }

    public static cutely impromptu(taiyuan taiyuanVar) {
        cutely cutelyVar = taiyuanVar.f22323marial;
        return cutelyVar != null ? cutelyVar : new cutely(taiyuanVar);
    }

    public final <T> T apical(premeiotic<T> premeioticVar, kowloon kowloonVar) throws IOException {
        T tNewInstance = premeioticVar.newInstance();
        taiyuan(tNewInstance, premeioticVar, kowloonVar);
        premeioticVar.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    public final void arytenoidectomy(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public <T> void attabal(T t, premeiotic<T> premeioticVar, kowloon kowloonVar) throws IOException {
        kowloon(3);
        taiyuan(t, premeioticVar, kowloonVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public <T> T beachfront(Class<T> cls, kowloon kowloonVar) throws IOException {
        kowloon(2);
        return (T) formularize(clubfoot.attabal().dern(cls), kowloonVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    @Deprecated
    public <T> void competently(List<T> list, premeiotic<T> premeioticVar, kowloon kowloonVar) throws IOException {
        int iSealless;
        if (WireFormat.saneness(this.f22186saneness) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f22186saneness;
        do {
            list.add(apical(premeioticVar, kowloonVar));
            if (this.f22184attabal.competently() || this.f22187wireman != 0) {
                return;
            } else {
                iSealless = this.f22184attabal.sealless();
            }
        } while (iSealless == i);
        this.f22187wireman = iSealless;
    }

    public final <T> void cutely(T t, premeiotic<T> premeioticVar, kowloon kowloonVar) throws IOException {
        int iKattegat = this.f22184attabal.kattegat();
        this.f22184attabal.saneness();
        int iArytenoidectomy = this.f22184attabal.arytenoidectomy(iKattegat);
        this.f22184attabal.f22320attabal++;
        premeioticVar.saneness(t, this, kowloonVar);
        this.f22184attabal.attabal(0);
        taiyuan taiyuanVar = this.f22184attabal;
        taiyuanVar.f22320attabal--;
        taiyuanVar.kowloon(iArytenoidectomy);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public <K, V> void dern(Map<K, V> map, restrictive.attabal<K, V> attabalVar, kowloon kowloonVar) throws IOException {
        kowloon(2);
        this.f22184attabal.arytenoidectomy(this.f22184attabal.kattegat());
        throw null;
    }

    public final <T> T formularize(premeiotic<T> premeioticVar, kowloon kowloonVar) throws IOException {
        T tNewInstance = premeioticVar.newInstance();
        cutely(tNewInstance, premeioticVar, kowloonVar);
        premeioticVar.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public int getFieldNumber() throws IOException {
        int i = this.f22187wireman;
        if (i != 0) {
            this.f22186saneness = i;
            this.f22187wireman = 0;
        } else {
            this.f22186saneness = this.f22184attabal.sealless();
        }
        int i2 = this.f22186saneness;
        if (i2 == 0 || i2 == this.f22185dern) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.attabal(i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public int getTag() {
        return this.f22186saneness;
    }

    public void impassible(List<String> list, boolean z) throws IOException {
        int iSealless;
        int iSealless2;
        if (WireFormat.saneness(this.f22186saneness) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof trm) || z) {
            do {
                list.add(z ? readStringRequireUtf8() : readString());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless = this.f22184attabal.sealless();
                }
            } while (iSealless == this.f22186saneness);
            this.f22187wireman = iSealless;
            return;
        }
        trm trmVar = (trm) list;
        do {
            trmVar.coi(readBytes());
            if (this.f22184attabal.competently()) {
                return;
            } else {
                iSealless2 = this.f22184attabal.sealless();
            }
        } while (iSealless2 == this.f22186saneness);
        this.f22187wireman = iSealless2;
    }

    public final void kowloon(int i) throws IOException {
        if (WireFormat.saneness(this.f22186saneness) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public <T> void marial(List<T> list, premeiotic<T> premeioticVar, kowloon kowloonVar) throws IOException {
        int iSealless;
        if (WireFormat.saneness(this.f22186saneness) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f22186saneness;
        do {
            list.add(formularize(premeioticVar, kowloonVar));
            if (this.f22184attabal.competently() || this.f22187wireman != 0) {
                return;
            } else {
                iSealless = this.f22184attabal.sealless();
            }
        } while (iSealless == i);
        this.f22187wireman = iSealless;
    }

    public final void monoploid(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public boolean readBool() throws IOException {
        kowloon(0);
        return this.f22184attabal.monoploid();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readBoolList(List<Boolean> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof beachfront)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Boolean.valueOf(this.f22184attabal.monoploid()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iBeachfront = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
            do {
                list.add(Boolean.valueOf(this.f22184attabal.monoploid()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            triweekly(iBeachfront);
            return;
        }
        beachfront beachfrontVar = (beachfront) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 0) {
            do {
                beachfrontVar.addBoolean(this.f22184attabal.monoploid());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iBeachfront2 = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
        do {
            beachfrontVar.addBoolean(this.f22184attabal.monoploid());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
        triweekly(iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public ByteString readBytes() throws IOException {
        kowloon(2);
        return this.f22184attabal.polloi();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readBytesList(List<ByteString> list) throws IOException {
        int iSealless;
        if (WireFormat.saneness(this.f22186saneness) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.f22184attabal.competently()) {
                return;
            } else {
                iSealless = this.f22184attabal.sealless();
            }
        } while (iSealless == this.f22186saneness);
        this.f22187wireman = iSealless;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public double readDouble() throws IOException {
        kowloon(1);
        return this.f22184attabal.molybdenite();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readDoubleList(List<Double> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof formularize)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 1) {
                do {
                    list.add(Double.valueOf(this.f22184attabal.molybdenite()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iKattegat = this.f22184attabal.kattegat();
            monoploid(iKattegat);
            int iBeachfront = this.f22184attabal.beachfront() + iKattegat;
            do {
                list.add(Double.valueOf(this.f22184attabal.molybdenite()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            return;
        }
        formularize formularizeVar = (formularize) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 1) {
            do {
                formularizeVar.addDouble(this.f22184attabal.molybdenite());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iKattegat2 = this.f22184attabal.kattegat();
        monoploid(iKattegat2);
        int iBeachfront2 = this.f22184attabal.beachfront() + iKattegat2;
        do {
            formularizeVar.addDouble(this.f22184attabal.molybdenite());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public int readEnum() throws IOException {
        kowloon(0);
        return this.f22184attabal.graveside();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readEnumList(List<Integer> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof gintrap)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Integer.valueOf(this.f22184attabal.graveside()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iBeachfront = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
            do {
                list.add(Integer.valueOf(this.f22184attabal.graveside()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            triweekly(iBeachfront);
            return;
        }
        gintrap gintrapVar = (gintrap) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 0) {
            do {
                gintrapVar.addInt(this.f22184attabal.graveside());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iBeachfront2 = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
        do {
            gintrapVar.addInt(this.f22184attabal.graveside());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
        triweekly(iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public int readFixed32() throws IOException {
        kowloon(5);
        return this.f22184attabal.adultoid();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readFixed32List(List<Integer> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof gintrap)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 2) {
                int iKattegat = this.f22184attabal.kattegat();
                arytenoidectomy(iKattegat);
                int iBeachfront = this.f22184attabal.beachfront() + iKattegat;
                do {
                    list.add(Integer.valueOf(this.f22184attabal.adultoid()));
                } while (this.f22184attabal.beachfront() < iBeachfront);
                return;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f22184attabal.adultoid()));
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless = this.f22184attabal.sealless();
                }
            } while (iSealless == this.f22186saneness);
            this.f22187wireman = iSealless;
            return;
        }
        gintrap gintrapVar = (gintrap) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 2) {
            int iKattegat2 = this.f22184attabal.kattegat();
            arytenoidectomy(iKattegat2);
            int iBeachfront2 = this.f22184attabal.beachfront() + iKattegat2;
            do {
                gintrapVar.addInt(this.f22184attabal.adultoid());
            } while (this.f22184attabal.beachfront() < iBeachfront2);
            return;
        }
        if (iSaneness2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            gintrapVar.addInt(this.f22184attabal.adultoid());
            if (this.f22184attabal.competently()) {
                return;
            } else {
                iSealless2 = this.f22184attabal.sealless();
            }
        } while (iSealless2 == this.f22186saneness);
        this.f22187wireman = iSealless2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public long readFixed64() throws IOException {
        kowloon(1);
        return this.f22184attabal.dovishness();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readFixed64List(List<Long> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof kattegat)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 1) {
                do {
                    list.add(Long.valueOf(this.f22184attabal.dovishness()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iKattegat = this.f22184attabal.kattegat();
            monoploid(iKattegat);
            int iBeachfront = this.f22184attabal.beachfront() + iKattegat;
            do {
                list.add(Long.valueOf(this.f22184attabal.dovishness()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            return;
        }
        kattegat kattegatVar = (kattegat) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 1) {
            do {
                kattegatVar.addLong(this.f22184attabal.dovishness());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iKattegat2 = this.f22184attabal.kattegat();
        monoploid(iKattegat2);
        int iBeachfront2 = this.f22184attabal.beachfront() + iKattegat2;
        do {
            kattegatVar.addLong(this.f22184attabal.dovishness());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public float readFloat() throws IOException {
        kowloon(5);
        return this.f22184attabal.gintrap();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readFloatList(List<Float> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof adultoid)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 2) {
                int iKattegat = this.f22184attabal.kattegat();
                arytenoidectomy(iKattegat);
                int iBeachfront = this.f22184attabal.beachfront() + iKattegat;
                do {
                    list.add(Float.valueOf(this.f22184attabal.gintrap()));
                } while (this.f22184attabal.beachfront() < iBeachfront);
                return;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.f22184attabal.gintrap()));
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless = this.f22184attabal.sealless();
                }
            } while (iSealless == this.f22186saneness);
            this.f22187wireman = iSealless;
            return;
        }
        adultoid adultoidVar = (adultoid) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 2) {
            int iKattegat2 = this.f22184attabal.kattegat();
            arytenoidectomy(iKattegat2);
            int iBeachfront2 = this.f22184attabal.beachfront() + iKattegat2;
            do {
                adultoidVar.addFloat(this.f22184attabal.gintrap());
            } while (this.f22184attabal.beachfront() < iBeachfront2);
            return;
        }
        if (iSaneness2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            adultoidVar.addFloat(this.f22184attabal.gintrap());
            if (this.f22184attabal.competently()) {
                return;
            } else {
                iSealless2 = this.f22184attabal.sealless();
            }
        } while (iSealless2 == this.f22186saneness);
        this.f22187wireman = iSealless2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public int readInt32() throws IOException {
        kowloon(0);
        return this.f22184attabal.rotuma();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readInt32List(List<Integer> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof gintrap)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Integer.valueOf(this.f22184attabal.rotuma()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iBeachfront = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
            do {
                list.add(Integer.valueOf(this.f22184attabal.rotuma()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            triweekly(iBeachfront);
            return;
        }
        gintrap gintrapVar = (gintrap) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 0) {
            do {
                gintrapVar.addInt(this.f22184attabal.rotuma());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iBeachfront2 = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
        do {
            gintrapVar.addInt(this.f22184attabal.rotuma());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
        triweekly(iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public long readInt64() throws IOException {
        kowloon(0);
        return this.f22184attabal.preprohormone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readInt64List(List<Long> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof kattegat)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Long.valueOf(this.f22184attabal.preprohormone()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iBeachfront = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
            do {
                list.add(Long.valueOf(this.f22184attabal.preprohormone()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            triweekly(iBeachfront);
            return;
        }
        kattegat kattegatVar = (kattegat) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 0) {
            do {
                kattegatVar.addLong(this.f22184attabal.preprohormone());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iBeachfront2 = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
        do {
            kattegatVar.addLong(this.f22184attabal.preprohormone());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
        triweekly(iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public int readSFixed32() throws IOException {
        kowloon(5);
        return this.f22184attabal.cord();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readSFixed32List(List<Integer> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof gintrap)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 2) {
                int iKattegat = this.f22184attabal.kattegat();
                arytenoidectomy(iKattegat);
                int iBeachfront = this.f22184attabal.beachfront() + iKattegat;
                do {
                    list.add(Integer.valueOf(this.f22184attabal.cord()));
                } while (this.f22184attabal.beachfront() < iBeachfront);
                return;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f22184attabal.cord()));
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless = this.f22184attabal.sealless();
                }
            } while (iSealless == this.f22186saneness);
            this.f22187wireman = iSealless;
            return;
        }
        gintrap gintrapVar = (gintrap) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 2) {
            int iKattegat2 = this.f22184attabal.kattegat();
            arytenoidectomy(iKattegat2);
            int iBeachfront2 = this.f22184attabal.beachfront() + iKattegat2;
            do {
                gintrapVar.addInt(this.f22184attabal.cord());
            } while (this.f22184attabal.beachfront() < iBeachfront2);
            return;
        }
        if (iSaneness2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            gintrapVar.addInt(this.f22184attabal.cord());
            if (this.f22184attabal.competently()) {
                return;
            } else {
                iSealless2 = this.f22184attabal.sealless();
            }
        } while (iSealless2 == this.f22186saneness);
        this.f22187wireman = iSealless2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public long readSFixed64() throws IOException {
        kowloon(1);
        return this.f22184attabal.cuirassed();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readSFixed64List(List<Long> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof kattegat)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 1) {
                do {
                    list.add(Long.valueOf(this.f22184attabal.cuirassed()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iKattegat = this.f22184attabal.kattegat();
            monoploid(iKattegat);
            int iBeachfront = this.f22184attabal.beachfront() + iKattegat;
            do {
                list.add(Long.valueOf(this.f22184attabal.cuirassed()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            return;
        }
        kattegat kattegatVar = (kattegat) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 1) {
            do {
                kattegatVar.addLong(this.f22184attabal.cuirassed());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iKattegat2 = this.f22184attabal.kattegat();
        monoploid(iKattegat2);
        int iBeachfront2 = this.f22184attabal.beachfront() + iKattegat2;
        do {
            kattegatVar.addLong(this.f22184attabal.cuirassed());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public int readSInt32() throws IOException {
        kowloon(0);
        return this.f22184attabal.stratoscope();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readSInt32List(List<Integer> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof gintrap)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Integer.valueOf(this.f22184attabal.stratoscope()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iBeachfront = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
            do {
                list.add(Integer.valueOf(this.f22184attabal.stratoscope()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            triweekly(iBeachfront);
            return;
        }
        gintrap gintrapVar = (gintrap) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 0) {
            do {
                gintrapVar.addInt(this.f22184attabal.stratoscope());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iBeachfront2 = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
        do {
            gintrapVar.addInt(this.f22184attabal.stratoscope());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
        triweekly(iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public long readSInt64() throws IOException {
        kowloon(0);
        return this.f22184attabal.trm();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readSInt64List(List<Long> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof kattegat)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Long.valueOf(this.f22184attabal.trm()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iBeachfront = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
            do {
                list.add(Long.valueOf(this.f22184attabal.trm()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            triweekly(iBeachfront);
            return;
        }
        kattegat kattegatVar = (kattegat) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 0) {
            do {
                kattegatVar.addLong(this.f22184attabal.trm());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iBeachfront2 = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
        do {
            kattegatVar.addLong(this.f22184attabal.trm());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
        triweekly(iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public String readString() throws IOException {
        kowloon(2);
        return this.f22184attabal.oilcan();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readStringList(List<String> list) throws IOException {
        impassible(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        impassible(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public String readStringRequireUtf8() throws IOException {
        kowloon(2);
        return this.f22184attabal.yemenite();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public int readUInt32() throws IOException {
        kowloon(0);
        return this.f22184attabal.kattegat();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readUInt32List(List<Integer> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof gintrap)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Integer.valueOf(this.f22184attabal.kattegat()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iBeachfront = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
            do {
                list.add(Integer.valueOf(this.f22184attabal.kattegat()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            triweekly(iBeachfront);
            return;
        }
        gintrap gintrapVar = (gintrap) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 0) {
            do {
                gintrapVar.addInt(this.f22184attabal.kattegat());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iBeachfront2 = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
        do {
            gintrapVar.addInt(this.f22184attabal.kattegat());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
        triweekly(iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public long readUInt64() throws IOException {
        kowloon(0);
        return this.f22184attabal.supplicat();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public void readUInt64List(List<Long> list) throws IOException {
        int iSealless;
        int iSealless2;
        if (!(list instanceof kattegat)) {
            int iSaneness = WireFormat.saneness(this.f22186saneness);
            if (iSaneness == 0) {
                do {
                    list.add(Long.valueOf(this.f22184attabal.supplicat()));
                    if (this.f22184attabal.competently()) {
                        return;
                    } else {
                        iSealless = this.f22184attabal.sealless();
                    }
                } while (iSealless == this.f22186saneness);
                this.f22187wireman = iSealless;
                return;
            }
            if (iSaneness != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iBeachfront = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
            do {
                list.add(Long.valueOf(this.f22184attabal.supplicat()));
            } while (this.f22184attabal.beachfront() < iBeachfront);
            triweekly(iBeachfront);
            return;
        }
        kattegat kattegatVar = (kattegat) list;
        int iSaneness2 = WireFormat.saneness(this.f22186saneness);
        if (iSaneness2 == 0) {
            do {
                kattegatVar.addLong(this.f22184attabal.supplicat());
                if (this.f22184attabal.competently()) {
                    return;
                } else {
                    iSealless2 = this.f22184attabal.sealless();
                }
            } while (iSealless2 == this.f22186saneness);
            this.f22187wireman = iSealless2;
            return;
        }
        if (iSaneness2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iBeachfront2 = this.f22184attabal.beachfront() + this.f22184attabal.kattegat();
        do {
            kattegatVar.addLong(this.f22184attabal.supplicat());
        } while (this.f22184attabal.beachfront() < iBeachfront2);
        triweekly(iBeachfront2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    @Deprecated
    public <T> T saneness(Class<T> cls, kowloon kowloonVar) throws IOException {
        kowloon(3);
        return (T) apical(clubfoot.attabal().dern(cls), kowloonVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public boolean skipField() throws IOException {
        int i;
        if (this.f22184attabal.competently() || (i = this.f22186saneness) == this.f22185dern) {
            return false;
        }
        return this.f22184attabal.restrictive(i);
    }

    public final <T> void taiyuan(T t, premeiotic<T> premeioticVar, kowloon kowloonVar) throws IOException {
        int i = this.f22185dern;
        this.f22185dern = WireFormat.dern(WireFormat.attabal(this.f22186saneness), 4);
        try {
            premeioticVar.saneness(t, this, kowloonVar);
            if (this.f22186saneness != this.f22185dern) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f22185dern = i;
        } catch (Throwable th) {
            this.f22185dern = i;
            throw th;
        }
    }

    public final void triweekly(int i) throws IOException {
        if (this.f22184attabal.beachfront() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.cultivated
    public <T> void wireman(T t, premeiotic<T> premeioticVar, kowloon kowloonVar) throws IOException {
        kowloon(2);
        cutely(t, premeioticVar, kowloonVar);
    }
}
