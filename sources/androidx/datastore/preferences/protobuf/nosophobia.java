package androidx.datastore.preferences.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: UnknownFieldSetLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class nosophobia {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final nosophobia f9796beachfront = new nosophobia(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f9797attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Object[] f9798dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f9799marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int[] f9800saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f9801wireman;

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
        int i = nosophobiaVar.f9797attabal + nosophobiaVar2.f9797attabal;
        int[] iArrCopyOf = Arrays.copyOf(nosophobiaVar.f9800saneness, i);
        System.arraycopy(nosophobiaVar2.f9800saneness, 0, iArrCopyOf, nosophobiaVar.f9797attabal, nosophobiaVar2.f9797attabal);
        Object[] objArrCopyOf = Arrays.copyOf(nosophobiaVar.f9798dern, i);
        System.arraycopy(nosophobiaVar2.f9798dern, 0, objArrCopyOf, nosophobiaVar.f9797attabal, nosophobiaVar2.f9797attabal);
        return new nosophobia(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static nosophobia dern() {
        return f9796beachfront;
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
            writer.saneness(iAttabal, (ByteString) obj);
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
            for (int i = this.f9797attabal - 1; i >= 0; i--) {
                writer.writeMessageSetItem(WireFormat.attabal(this.f9800saneness[i]), this.f9798dern[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f9797attabal; i2++) {
            writer.writeMessageSetItem(WireFormat.attabal(this.f9800saneness[i2]), this.f9798dern[i2]);
        }
    }

    public void attabal() {
        if (!this.f9799marial) {
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
        int i = this.f9797attabal;
        return i == nosophobiaVar.f9797attabal && kowloon(this.f9800saneness, nosophobiaVar.f9800saneness, i) && formularize(this.f9798dern, nosophobiaVar.f9798dern, this.f9797attabal);
    }

    public int hashCode() {
        int i = this.f9797attabal;
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i) * 31) + beachfront(this.f9800saneness, i)) * 31) + competently(this.f9798dern, this.f9797attabal);
    }

    public final void impassible(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f9797attabal; i2++) {
            creditor.wireman(sb, i, String.valueOf(WireFormat.attabal(this.f9800saneness[i2])), this.f9798dern[i2]);
        }
    }

    public void impromptu() {
        if (this.f9799marial) {
            this.f9799marial = false;
        }
    }

    public int marial() {
        int i = this.f9801wireman;
        if (i != -1) {
            return i;
        }
        int iPolder = 0;
        for (int i2 = 0; i2 < this.f9797attabal; i2++) {
            iPolder += CodedOutputStream.polder(WireFormat.attabal(this.f9800saneness[i2]), (ByteString) this.f9798dern[i2]);
        }
        this.f9801wireman = iPolder;
        return iPolder;
    }

    public void polloi(Writer writer) throws IOException {
        if (this.f9797attabal == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.f9797attabal; i++) {
                monoploid(this.f9800saneness[i], this.f9798dern[i], writer);
            }
            return;
        }
        for (int i2 = this.f9797attabal - 1; i2 >= 0; i2--) {
            monoploid(this.f9800saneness[i2], this.f9798dern[i2], writer);
        }
    }

    public final void saneness(int i) {
        int[] iArr = this.f9800saneness;
        if (i > iArr.length) {
            int i2 = this.f9797attabal;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f9800saneness = Arrays.copyOf(iArr, i);
            this.f9798dern = Arrays.copyOf(this.f9798dern, i);
        }
    }

    public nosophobia taiyuan(nosophobia nosophobiaVar) {
        if (nosophobiaVar.equals(dern())) {
            return this;
        }
        attabal();
        int i = this.f9797attabal + nosophobiaVar.f9797attabal;
        saneness(i);
        System.arraycopy(nosophobiaVar.f9800saneness, 0, this.f9800saneness, this.f9797attabal, nosophobiaVar.f9797attabal);
        System.arraycopy(nosophobiaVar.f9798dern, 0, this.f9798dern, this.f9797attabal, nosophobiaVar.f9797attabal);
        this.f9797attabal = i;
        return this;
    }

    public void triweekly(int i, Object obj) {
        attabal();
        saneness(this.f9797attabal + 1);
        int[] iArr = this.f9800saneness;
        int i2 = this.f9797attabal;
        iArr[i2] = i;
        this.f9798dern[i2] = obj;
        this.f9797attabal = i2 + 1;
    }

    public int wireman() {
        int iDent;
        int i = this.f9801wireman;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9797attabal; i3++) {
            int i4 = this.f9800saneness[i3];
            int iAttabal = WireFormat.attabal(i4);
            int iSaneness = WireFormat.saneness(i4);
            if (iSaneness == 0) {
                iDent = CodedOutputStream.dent(iAttabal, ((Long) this.f9798dern[i3]).longValue());
            } else if (iSaneness == 1) {
                iDent = CodedOutputStream.arytenoidectomy(iAttabal, ((Long) this.f9798dern[i3]).longValue());
            } else if (iSaneness == 2) {
                iDent = CodedOutputStream.impromptu(iAttabal, (ByteString) this.f9798dern[i3]);
            } else if (iSaneness == 3) {
                iDent = (CodedOutputStream.splinterproof(iAttabal) * 2) + ((nosophobia) this.f9798dern[i3]).wireman();
            } else {
                if (iSaneness != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iDent = CodedOutputStream.triweekly(iAttabal, ((Integer) this.f9798dern[i3]).intValue());
            }
            i2 += iDent;
        }
        this.f9801wireman = i2;
        return i2;
    }

    public nosophobia(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f9801wireman = -1;
        this.f9797attabal = i;
        this.f9800saneness = iArr;
        this.f9798dern = objArr;
        this.f9799marial = z;
    }
}
