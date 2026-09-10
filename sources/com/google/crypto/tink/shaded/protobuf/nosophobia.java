package com.google.crypto.tink.shaded.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: UnknownFieldSetLite.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nosophobia {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final nosophobia f22252beachfront = new nosophobia(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f22253attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Object[] f22254dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f22255marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int[] f22256saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f22257wireman;

    public nosophobia() {
        this(0, new int[8], new Object[8], true);
    }

    public static nosophobia apical() {
        return new nosophobia();
    }

    public static int beachfront(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public static int competently(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public static nosophobia cutely(nosophobia nosophobiaVar, nosophobia nosophobiaVar2) {
        int i = nosophobiaVar.f22253attabal + nosophobiaVar2.f22253attabal;
        int[] iArrCopyOf = Arrays.copyOf(nosophobiaVar.f22256saneness, i);
        System.arraycopy(nosophobiaVar2.f22256saneness, 0, iArrCopyOf, nosophobiaVar.f22253attabal, nosophobiaVar2.f22253attabal);
        Object[] objArrCopyOf = Arrays.copyOf(nosophobiaVar.f22254dern, i);
        System.arraycopy(nosophobiaVar2.f22254dern, 0, objArrCopyOf, nosophobiaVar.f22253attabal, nosophobiaVar2.f22253attabal);
        return new nosophobia(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static nosophobia dern() {
        return f22252beachfront;
    }

    public static boolean formularize(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static boolean kowloon(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static void monoploid(int i, Object obj, Writer writer) throws IOException {
        int iAttabal = WireFormat.attabal(i);
        int iSaneness = WireFormat.saneness(i);
        if (iSaneness == 0) {
            writer.writeInt64(iAttabal, ((Long) obj).longValue());
            return;
        }
        if (iSaneness == 1) {
            writer.writeFixed64(iAttabal, ((Long) obj).longValue());
            return;
        }
        if (iSaneness == 2) {
            writer.wireman(iAttabal, (ByteString) obj);
            return;
        }
        if (iSaneness != 3) {
            if (iSaneness != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            writer.writeFixed32(iAttabal, ((Integer) obj).intValue());
        } else if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(iAttabal);
            ((nosophobia) obj).polloi(writer);
            writer.writeEndGroup(iAttabal);
        } else {
            writer.writeEndGroup(iAttabal);
            ((nosophobia) obj).polloi(writer);
            writer.writeStartGroup(iAttabal);
        }
    }

    public void arytenoidectomy(Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f22253attabal - 1; i >= 0; i--) {
                writer.writeMessageSetItem(WireFormat.attabal(this.f22256saneness[i]), this.f22254dern[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f22253attabal; i2++) {
            writer.writeMessageSetItem(WireFormat.attabal(this.f22256saneness[i2]), this.f22254dern[i2]);
        }
    }

    public void attabal() {
        if (!this.f22255marial) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nosophobia)) {
            return false;
        }
        nosophobia nosophobiaVar = (nosophobia) obj;
        int i = this.f22253attabal;
        return i == nosophobiaVar.f22253attabal && kowloon(this.f22256saneness, nosophobiaVar.f22256saneness, i) && formularize(this.f22254dern, nosophobiaVar.f22254dern, this.f22253attabal);
    }

    public int hashCode() {
        int i = this.f22253attabal;
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i) * 31) + beachfront(this.f22256saneness, i)) * 31) + competently(this.f22254dern, this.f22253attabal);
    }

    public final void impassible(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f22253attabal; i2++) {
            starveling.wireman(sb, i, String.valueOf(WireFormat.attabal(this.f22256saneness[i2])), this.f22254dern[i2]);
        }
    }

    public void impromptu() {
        if (this.f22255marial) {
            this.f22255marial = false;
        }
    }

    public int marial() {
        int i = this.f22257wireman;
        if (i != -1) {
            return i;
        }
        int iSupplicat = 0;
        for (int i2 = 0; i2 < this.f22253attabal; i2++) {
            iSupplicat += CodedOutputStream.supplicat(WireFormat.attabal(this.f22256saneness[i2]), (ByteString) this.f22254dern[i2]);
        }
        this.f22257wireman = iSupplicat;
        return iSupplicat;
    }

    public void polloi(Writer writer) throws IOException {
        if (this.f22253attabal == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.f22253attabal; i++) {
                monoploid(this.f22256saneness[i], this.f22254dern[i], writer);
            }
            return;
        }
        for (int i2 = this.f22253attabal - 1; i2 >= 0; i2--) {
            monoploid(this.f22256saneness[i2], this.f22254dern[i2], writer);
        }
    }

    public final void saneness(int i) {
        int[] iArr = this.f22256saneness;
        if (i > iArr.length) {
            int i2 = this.f22253attabal;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f22256saneness = Arrays.copyOf(iArr, i);
            this.f22254dern = Arrays.copyOf(this.f22254dern, i);
        }
    }

    public nosophobia taiyuan(nosophobia nosophobiaVar) {
        if (nosophobiaVar.equals(dern())) {
            return this;
        }
        attabal();
        int i = this.f22253attabal + nosophobiaVar.f22253attabal;
        saneness(i);
        System.arraycopy(nosophobiaVar.f22256saneness, 0, this.f22256saneness, this.f22253attabal, nosophobiaVar.f22253attabal);
        System.arraycopy(nosophobiaVar.f22254dern, 0, this.f22254dern, this.f22253attabal, nosophobiaVar.f22253attabal);
        this.f22253attabal = i;
        return this;
    }

    public void triweekly(int i, Object obj) {
        attabal();
        saneness(this.f22253attabal + 1);
        int[] iArr = this.f22256saneness;
        int i2 = this.f22253attabal;
        iArr[i2] = i;
        this.f22254dern[i2] = obj;
        this.f22253attabal = i2 + 1;
    }

    public int wireman() {
        int iSplinterproof;
        int i = this.f22257wireman;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f22253attabal; i3++) {
            int i4 = this.f22256saneness[i3];
            int iAttabal = WireFormat.attabal(i4);
            int iSaneness = WireFormat.saneness(i4);
            if (iSaneness == 0) {
                iSplinterproof = CodedOutputStream.splinterproof(iAttabal, ((Long) this.f22254dern[i3]).longValue());
            } else if (iSaneness == 1) {
                iSplinterproof = CodedOutputStream.arytenoidectomy(iAttabal, ((Long) this.f22254dern[i3]).longValue());
            } else if (iSaneness == 2) {
                iSplinterproof = CodedOutputStream.impromptu(iAttabal, (ByteString) this.f22254dern[i3]);
            } else if (iSaneness == 3) {
                iSplinterproof = (CodedOutputStream.walach(iAttabal) * 2) + ((nosophobia) this.f22254dern[i3]).wireman();
            } else {
                if (iSaneness != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iSplinterproof = CodedOutputStream.triweekly(iAttabal, ((Integer) this.f22254dern[i3]).intValue());
            }
            i2 += iSplinterproof;
        }
        this.f22257wireman = i2;
        return i2;
    }

    public nosophobia(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f22257wireman = -1;
        this.f22253attabal = i;
        this.f22256saneness = iArr;
        this.f22254dern = objArr;
        this.f22255marial = z;
    }
}
