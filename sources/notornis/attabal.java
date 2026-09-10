package notornis;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: VersionedParcelParcel.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends VersionedParcel {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f33956apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f33957beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f33958competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f33959cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f33960impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Parcel f33961marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f33962taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final SparseIntArray f33963wireman;

    public attabal(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.attabal(), new androidx.collection.attabal(), new androidx.collection.attabal());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence apical() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f33961marial);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void attabal() {
        int i = this.f33962taiyuan;
        if (i >= 0) {
            int i2 = this.f33963wireman.get(i);
            int iDataPosition = this.f33961marial.dataPosition();
            this.f33961marial.setDataPosition(i2);
            this.f33961marial.writeInt(iDataPosition - i2);
            this.f33961marial.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean competently() {
        return this.f33961marial.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void cuirassed(byte[] bArr) {
        if (bArr == null) {
            this.f33961marial.writeInt(-1);
        } else {
            this.f33961marial.writeInt(bArr.length);
            this.f33961marial.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void gintrap(int i) {
        attabal();
        this.f33962taiyuan = i;
        this.f33963wireman.put(i, this.f33961marial.dataPosition());
        yemenite(0);
        yemenite(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean impassible(int i) {
        while (this.f33959cutely < this.f33958competently) {
            int i2 = this.f33956apical;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f33961marial.setDataPosition(this.f33959cutely);
            int i3 = this.f33961marial.readInt();
            this.f33956apical = this.f33961marial.readInt();
            this.f33959cutely += i3;
        }
        return this.f33956apical == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void kattegat(Parcelable parcelable) {
        this.f33961marial.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int kowloon() {
        return this.f33961marial.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String molybdenite() {
        return this.f33961marial.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T monoploid() {
        return (T) this.f33961marial.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void preprohormone(boolean z) {
        this.f33961marial.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void restrictive(String str) {
        this.f33961marial.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel saneness() {
        Parcel parcel = this.f33961marial;
        int iDataPosition = parcel.dataPosition();
        int i = this.f33959cutely;
        if (i == this.f33957beachfront) {
            i = this.f33958competently;
        }
        return new attabal(parcel, iDataPosition, i, this.f33960impromptu + "  ", this.f13858attabal, this.f13860saneness, this.f13859dern);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] taiyuan() {
        int i = this.f33961marial.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f33961marial.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void trm(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f33961marial, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void yemenite(int i) {
        this.f33961marial.writeInt(i);
    }

    public attabal(Parcel parcel, int i, int i2, String str, androidx.collection.attabal<String, Method> attabalVar, androidx.collection.attabal<String, Method> attabalVar2, androidx.collection.attabal<String, Class> attabalVar3) {
        super(attabalVar, attabalVar2, attabalVar3);
        this.f33963wireman = new SparseIntArray();
        this.f33962taiyuan = -1;
        this.f33956apical = -1;
        this.f33961marial = parcel;
        this.f33957beachfront = i;
        this.f33958competently = i2;
        this.f33959cutely = i;
        this.f33960impromptu = str;
    }
}
