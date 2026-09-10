package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes.dex */
public final class hydrovane<T> implements premeiotic<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saran f9720attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f9721dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final lerp<?, ?> f9722saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final kowloon<?> f9723wireman;

    public hydrovane(lerp<?, ?> lerpVar, kowloon<?> kowloonVar, saran saranVar) {
        this.f9722saneness = lerpVar;
        this.f9721dern = kowloonVar.marial(saranVar);
        this.f9723wireman = kowloonVar;
        this.f9720attabal = saranVar;
    }

    private <UT, UB> int dern(lerp<UT, UB> lerpVar, T t) {
        return lerpVar.taiyuan(lerpVar.competently(t));
    }

    public static <T> hydrovane<T> marial(lerp<?, ?> lerpVar, kowloon<?> kowloonVar, saran saranVar) {
        return new hydrovane<>(lerpVar, kowloonVar, saranVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends molybdenite.saneness<ET>> void wireman(lerp<UT, UB> lerpVar, kowloon<ET> kowloonVar, T t, cultivated cultivatedVar, triweekly triweeklyVar) throws Throwable {
        lerp<UT, UB> lerpVar2;
        UB ubBeachfront = lerpVar.beachfront(t);
        Object objWireman = kowloonVar.wireman(t);
        while (cultivatedVar.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                lerpVar2 = lerpVar;
                kowloon<ET> kowloonVar2 = kowloonVar;
                cultivated cultivatedVar2 = cultivatedVar;
                triweekly triweeklyVar2 = triweeklyVar;
                try {
                    if (!beachfront(cultivatedVar2, triweeklyVar2, kowloonVar2, objWireman, lerpVar2, ubBeachfront)) {
                        lerpVar2.kowloon(t, ubBeachfront);
                        return;
                    }
                    cultivatedVar = cultivatedVar2;
                    triweeklyVar = triweeklyVar2;
                    kowloonVar = kowloonVar2;
                    lerpVar = lerpVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    lerpVar2.kowloon(t, ubBeachfront);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                lerpVar2 = lerpVar;
            }
        }
        lerpVar.kowloon(t, ubBeachfront);
    }

    @Override // androidx.datastore.preferences.protobuf.premeiotic
    public void attabal(T t, cultivated cultivatedVar, triweekly triweeklyVar) throws Throwable {
        wireman(this.f9722saneness, this.f9723wireman, t, cultivatedVar, triweeklyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends molybdenite.saneness<ET>> boolean beachfront(cultivated cultivatedVar, triweekly triweeklyVar, kowloon<ET> kowloonVar, molybdenite<ET> molybdeniteVar, lerp<UT, UB> lerpVar, UB ub) throws IOException {
        int tag = cultivatedVar.getTag();
        int uInt32 = 0;
        if (tag != WireFormat.f9681attabal) {
            if (WireFormat.saneness(tag) != 2) {
                return cultivatedVar.skipField();
            }
            Object objSaneness = kowloonVar.saneness(triweeklyVar, this.f9720attabal, WireFormat.attabal(tag));
            if (objSaneness == null) {
                return lerpVar.impassible(ub, cultivatedVar, 0);
            }
            kowloonVar.impromptu(cultivatedVar, objSaneness, triweeklyVar, molybdeniteVar);
            return true;
        }
        Object objSaneness2 = null;
        ByteString bytes = null;
        while (cultivatedVar.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = cultivatedVar.getTag();
            if (tag2 == WireFormat.f9682dern) {
                uInt32 = cultivatedVar.readUInt32();
                objSaneness2 = kowloonVar.saneness(triweeklyVar, this.f9720attabal, uInt32);
            } else if (tag2 == WireFormat.f9684wireman) {
                if (objSaneness2 != null) {
                    kowloonVar.impromptu(cultivatedVar, objSaneness2, triweeklyVar, molybdeniteVar);
                } else {
                    bytes = cultivatedVar.readBytes();
                }
            } else if (!cultivatedVar.skipField()) {
                break;
            }
        }
        if (cultivatedVar.getTag() != WireFormat.f9683saneness) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objSaneness2 != null) {
                kowloonVar.taiyuan(bytes, objSaneness2, triweeklyVar, molybdeniteVar);
            } else {
                lerpVar.wireman(ub, uInt32, bytes);
            }
        }
        return true;
    }

    public final <UT, UB> void competently(lerp<UT, UB> lerpVar, T t, Writer writer) throws IOException {
        lerpVar.molybdenite(lerpVar.competently(t), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.premeiotic
    public boolean equals(T t, T t2) {
        if (!this.f9722saneness.competently(t).equals(this.f9722saneness.competently(t2))) {
            return false;
        }
        if (this.f9721dern) {
            return this.f9723wireman.dern(t).equals(this.f9723wireman.dern(t2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.premeiotic
    public int getSerializedSize(T t) {
        int iDern = dern(this.f9722saneness, t);
        return this.f9721dern ? iDern + this.f9723wireman.dern(t).cutely() : iDern;
    }

    @Override // androidx.datastore.preferences.protobuf.premeiotic
    public int hashCode(T t) {
        int iHashCode = this.f9722saneness.competently(t).hashCode();
        return this.f9721dern ? (iHashCode * 53) + this.f9723wireman.dern(t).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.premeiotic
    public final boolean isInitialized(T t) {
        return this.f9723wireman.dern(t).arytenoidectomy();
    }

    @Override // androidx.datastore.preferences.protobuf.premeiotic
    public void makeImmutable(T t) {
        this.f9722saneness.cutely(t);
        this.f9723wireman.beachfront(t);
    }

    @Override // androidx.datastore.preferences.protobuf.premeiotic
    public void mergeFrom(T t, T t2) {
        milliradian.kattegat(this.f9722saneness, t, t2);
        if (this.f9721dern) {
            milliradian.yemenite(this.f9723wireman, t, t2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.premeiotic
    public T newInstance() {
        saran saranVar = this.f9720attabal;
        return saranVar instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) saranVar).supplicat() : (T) saranVar.newBuilderForType().buildPartial();
    }

    @Override // androidx.datastore.preferences.protobuf.premeiotic
    public void saneness(T t, Writer writer) throws IOException {
        Iterator itGraveside = this.f9723wireman.dern(t).graveside();
        while (itGraveside.hasNext()) {
            Map.Entry entry = (Map.Entry) itGraveside.next();
            molybdenite.saneness sanenessVar = (molybdenite.saneness) entry.getKey();
            if (sanenessVar.getLiteJavaType() != WireFormat.JavaType.MESSAGE || sanenessVar.isRepeated() || sanenessVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof cord.saneness) {
                writer.writeMessageSetItem(sanenessVar.getNumber(), ((cord.saneness) entry).attabal().marial());
            } else {
                writer.writeMessageSetItem(sanenessVar.getNumber(), entry.getValue());
            }
        }
        competently(this.f9722saneness, t, writer);
    }
}
