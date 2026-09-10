package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.e;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new android.support.v4.media.a(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f3824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f3826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f3827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f3828k;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f3830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f3832d;

        public CustomAction(Parcel parcel) {
            this.f3829a = parcel.readString();
            this.f3830b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3831c = parcel.readInt();
            this.f3832d = parcel.readBundle(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f3830b) + ", mIcon=" + this.f3831c + ", mExtras=" + this.f3832d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f3829a);
            TextUtils.writeToParcel(this.f3830b, parcel, i10);
            parcel.writeInt(this.f3831c);
            parcel.writeBundle(this.f3832d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f3818a = parcel.readInt();
        this.f3819b = parcel.readLong();
        this.f3821d = parcel.readFloat();
        this.f3825h = parcel.readLong();
        this.f3820c = parcel.readLong();
        this.f3822e = parcel.readLong();
        this.f3824g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3826i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f3827j = parcel.readLong();
        this.f3828k = parcel.readBundle(a.class.getClassLoader());
        this.f3823f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f3818a);
        sb2.append(", position=");
        sb2.append(this.f3819b);
        sb2.append(", buffered position=");
        sb2.append(this.f3820c);
        sb2.append(", speed=");
        sb2.append(this.f3821d);
        sb2.append(", updated=");
        sb2.append(this.f3825h);
        sb2.append(", actions=");
        sb2.append(this.f3822e);
        sb2.append(", error code=");
        sb2.append(this.f3823f);
        sb2.append(", error message=");
        sb2.append(this.f3824g);
        sb2.append(", custom actions=");
        sb2.append(this.f3826i);
        sb2.append(", active item id=");
        return e.r(sb2, this.f3827j, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3818a);
        parcel.writeLong(this.f3819b);
        parcel.writeFloat(this.f3821d);
        parcel.writeLong(this.f3825h);
        parcel.writeLong(this.f3820c);
        parcel.writeLong(this.f3822e);
        TextUtils.writeToParcel(this.f3824g, parcel, i10);
        parcel.writeTypedList(this.f3826i);
        parcel.writeLong(this.f3827j);
        parcel.writeBundle(this.f3828k);
        parcel.writeInt(this.f3823f);
    }
}
