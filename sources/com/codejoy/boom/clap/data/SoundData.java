package com.codejoy.boom.clap.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SoundsConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u001eR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/codejoy/boom/clap/data/SoundData;", "Landroid/os/Parcelable;", "", "icon", "", "audioFile", "nameResId", "", "isVip", "<init>", "(ILjava/lang/String;IZ)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "kowloon", "I", "saneness", "setIcon", "(I)V", "arytenoidectomy", "Ljava/lang/String;", "attabal", "setAudioFile", "(Ljava/lang/String;)V", "monoploid", "dern", "setNameResId", "polloi", "Z", "wireman", "()Z", "setVip", "(Z)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SoundData implements Parcelable {
    public static final Parcelable.Creator<SoundData> CREATOR = new attabal();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata and from toString */
    public String audioFile;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata and from toString */
    public int icon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata and from toString */
    public int nameResId;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isVip;

    /* JADX INFO: compiled from: SoundsConfig.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Parcelable.Creator<SoundData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public final SoundData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SoundData(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public final SoundData[] newArray(int i) {
            return new SoundData[i];
        }
    }

    public SoundData() {
        this(0, null, 0, false, 15, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getAudioFile() {
        return this.audioFile;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final int getNameResId() {
        return this.nameResId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoundData)) {
            return false;
        }
        SoundData soundData = (SoundData) other;
        return this.icon == soundData.icon && Intrinsics.wireman(this.audioFile, soundData.audioFile) && this.nameResId == soundData.nameResId && this.isVip == soundData.isVip;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.icon) * 31) + this.audioFile.hashCode()) * 31) + Integer.hashCode(this.nameResId)) * 31) + Boolean.hashCode(this.isVip);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    public String toString() {
        return "SoundData(icon=" + this.icon + ", audioFile=" + this.audioFile + ", nameResId=" + this.nameResId + ", isVip=" + this.isVip + ")";
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final boolean getIsVip() {
        return this.isVip;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.icon);
        dest.writeString(this.audioFile);
        dest.writeInt(this.nameResId);
        dest.writeInt(this.isVip ? 1 : 0);
    }

    public SoundData(int i, String audioFile, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(audioFile, "audioFile");
        this.icon = i;
        this.audioFile = audioFile;
        this.nameResId = i2;
        this.isVip = z;
    }

    public /* synthetic */ SoundData(int i, String str, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z);
    }
}
