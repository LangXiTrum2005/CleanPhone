package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lerp<T, B> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static volatile int f22240attabal = 100;

    public abstract T apical(T t, T t2);

    public abstract void arytenoidectomy(Object obj, T t);

    public abstract void attabal(B b, int i, int i2);

    public abstract B beachfront(Object obj);

    public abstract T competently(Object obj);

    public abstract void cutely(Object obj);

    public abstract void dern(B b, int i, T t);

    public final void formularize(B b, cultivated cultivatedVar, int i) throws IOException {
        while (cultivatedVar.getFieldNumber() != Integer.MAX_VALUE && impassible(b, cultivatedVar, i)) {
        }
    }

    public abstract void graveside(T t, Writer writer) throws IOException;

    public final boolean impassible(B b, cultivated cultivatedVar, int i) throws IOException {
        int tag = cultivatedVar.getTag();
        int iAttabal = WireFormat.attabal(tag);
        int iSaneness = WireFormat.saneness(tag);
        if (iSaneness == 0) {
            marial(b, iAttabal, cultivatedVar.readInt64());
            return true;
        }
        if (iSaneness == 1) {
            saneness(b, iAttabal, cultivatedVar.readFixed64());
            return true;
        }
        if (iSaneness == 2) {
            wireman(b, iAttabal, cultivatedVar.readBytes());
            return true;
        }
        if (iSaneness != 3) {
            if (iSaneness == 4) {
                if (i != 0) {
                    return false;
                }
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            attabal(b, iAttabal, cultivatedVar.readFixed32());
            return true;
        }
        B bTriweekly = triweekly();
        int iDern = WireFormat.dern(iAttabal, 4);
        int i2 = i + 1;
        if (i2 >= f22240attabal) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        formularize(bTriweekly, cultivatedVar, i2);
        if (iDern != cultivatedVar.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        dern(b, iAttabal, polloi(bTriweekly));
        return true;
    }

    public abstract int impromptu(T t);

    public abstract void kowloon(Object obj, B b);

    public abstract void marial(B b, int i, long j);

    public abstract void molybdenite(T t, Writer writer) throws IOException;

    public abstract boolean monoploid(cultivated cultivatedVar);

    public abstract T polloi(B b);

    public abstract void saneness(B b, int i, long j);

    public abstract int taiyuan(T t);

    public abstract B triweekly();

    public abstract void wireman(B b, int i, ByteString byteString);
}
