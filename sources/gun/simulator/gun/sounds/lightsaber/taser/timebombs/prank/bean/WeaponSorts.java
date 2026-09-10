package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean;

import android.os.Parcel;
import android.os.Parcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class WeaponSorts implements Parcelable {
    public static final Parcelable.Creator<WeaponSorts> CREATOR = new Creator();
    private final String analyticsName;
    private final int backgroundSource;
    private final int cardBackground;
    private final int category;
    private final int imageSource;
    private final int sceneBackground;
    private final int secondaryBackground;
    private final int sortId;

    public static final class Creator implements Parcelable.Creator<WeaponSorts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeaponSorts createFromParcel(Parcel parcel) {
            AbstractC2995aW.q(parcel, "parcel");
            return new WeaponSorts(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeaponSorts[] newArray(int i) {
            return new WeaponSorts[i];
        }
    }

    public WeaponSorts(int i, int i2, int i3, int i4, int i5, int i6, int i7, String str) {
        AbstractC2995aW.q(str, "analyticsName");
        this.sortId = i;
        this.imageSource = i2;
        this.backgroundSource = i3;
        this.category = i4;
        this.secondaryBackground = i5;
        this.cardBackground = i6;
        this.sceneBackground = i7;
        this.analyticsName = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final int getBackgroundSource() {
        return this.backgroundSource;
    }

    public final int getCardBackground() {
        return this.cardBackground;
    }

    public final int getCategory() {
        return this.category;
    }

    public final int getImageSource() {
        return this.imageSource;
    }

    public final int getSceneBackground() {
        return this.sceneBackground;
    }

    public final int getSecondaryBackground() {
        return this.secondaryBackground;
    }

    public final int getSortId() {
        return this.sortId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AbstractC2995aW.q(parcel, "out");
        parcel.writeInt(this.sortId);
        parcel.writeInt(this.imageSource);
        parcel.writeInt(this.backgroundSource);
        parcel.writeInt(this.category);
        parcel.writeInt(this.secondaryBackground);
        parcel.writeInt(this.cardBackground);
        parcel.writeInt(this.sceneBackground);
        parcel.writeString(this.analyticsName);
    }
}
