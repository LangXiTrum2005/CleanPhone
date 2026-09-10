package sg.bigo.ads.controller.landing;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class LandingPageStyleConfig implements Parcelable {
    public static final Parcelable.Creator<LandingPageStyleConfig> CREATOR = new Parcelable.Creator<LandingPageStyleConfig>() { // from class: sg.bigo.ads.controller.landing.LandingPageStyleConfig.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LandingPageStyleConfig createFromParcel(Parcel parcel) {
            return new LandingPageStyleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LandingPageStyleConfig[] newArray(int i2) {
            return new LandingPageStyleConfig[i2];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48170c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48171e;
    public final float f;
    public final Class<? extends c> g;

    public LandingPageStyleConfig(Parcel parcel) {
        this.g = (Class) parcel.readSerializable();
        this.f48170c = parcel.readInt();
        this.f48168a = parcel.readInt();
        this.f48169b = parcel.readInt();
        this.d = parcel.readInt();
        this.f48171e = parcel.readInt();
        this.f = parcel.readFloat();
    }

    public final boolean a() {
        return this.g != null && this.d > 0;
    }

    public final boolean b() {
        int i2 = this.f48168a;
        return i2 == 0 || i2 == 7 || i2 == 8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.g);
        parcel.writeInt(this.f48170c);
        parcel.writeInt(this.f48168a);
        parcel.writeInt(this.f48169b);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f48171e);
        parcel.writeFloat(this.f);
    }

    public LandingPageStyleConfig(Class<? extends c> cls, int i2, int i3, int i4, int i5, int i6, float f) {
        this.g = cls;
        this.f48170c = i2;
        this.f48168a = i3;
        this.f48169b = i4;
        this.d = i5;
        this.f48171e = i6;
        this.f = f;
    }
}
