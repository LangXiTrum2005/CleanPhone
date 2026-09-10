package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class AppSettingsDialog implements Parcelable {
    public static final Parcelable.Creator<AppSettingsDialog> CREATOR = new AnonymousClass1();
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f45294Y;
    public final String Z;
    public final String e0;
    public final String f0;
    public final int g0;
    public final int h0;
    public Context i0;

    /* JADX INFO: renamed from: pub.devrel.easypermissions.AppSettingsDialog$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<AppSettingsDialog> {
        @Override // android.os.Parcelable.Creator
        public final AppSettingsDialog createFromParcel(Parcel parcel) {
            return new AppSettingsDialog(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AppSettingsDialog[] newArray(int i2) {
            return new AppSettingsDialog[i2];
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f45295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Activity f45296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f45297c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f45298e;
        public String f;
        public int g = -1;

        public Builder(AppSettingsDialogHolderActivity appSettingsDialogHolderActivity) {
            this.f45295a = appSettingsDialogHolderActivity;
            this.f45296b = appSettingsDialogHolderActivity;
        }
    }

    public AppSettingsDialog(Parcel parcel) {
        this.X = parcel.readInt();
        this.f45294Y = parcel.readString();
        this.Z = parcel.readString();
        this.e0 = parcel.readString();
        this.f0 = parcel.readString();
        this.g0 = parcel.readInt();
        this.h0 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.X);
        parcel.writeString(this.f45294Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.e0);
        parcel.writeString(this.f0);
        parcel.writeInt(this.g0);
        parcel.writeInt(this.h0);
    }

    public AppSettingsDialog(AppSettingsDialogHolderActivity appSettingsDialogHolderActivity, String str, String str2, String str3, String str4, int i2) {
        this.i0 = appSettingsDialogHolderActivity;
        this.X = -1;
        this.f45294Y = str;
        this.Z = str2;
        this.e0 = str3;
        this.f0 = str4;
        this.g0 = i2;
        this.h0 = 0;
    }
}
