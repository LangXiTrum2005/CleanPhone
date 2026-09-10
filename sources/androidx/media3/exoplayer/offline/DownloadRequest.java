package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Uri f6329Y;
    public final String Z;
    public final List e0;
    public final byte[] f0;
    public final String g0;
    public final byte[] h0;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.offline.DownloadRequest$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i2) {
            return new DownloadRequest[i2];
        }
    }

    public static class Builder {
    }

    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        int i2 = Util.f5683a;
        this.X = string;
        this.f6329Y = Uri.parse(parcel.readString());
        this.Z = parcel.readString();
        int i3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.e0 = Collections.unmodifiableList(arrayList);
        this.f0 = parcel.createByteArray();
        this.g0 = parcel.readString();
        this.h0 = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.X.equals(downloadRequest.X) && this.f6329Y.equals(downloadRequest.f6329Y) && Util.a(this.Z, downloadRequest.Z) && this.e0.equals(downloadRequest.e0) && Arrays.equals(this.f0, downloadRequest.f0) && Util.a(this.g0, downloadRequest.g0) && Arrays.equals(this.h0, downloadRequest.h0);
    }

    public final int hashCode() {
        int iHashCode = (this.f6329Y.hashCode() + (this.X.hashCode() * 961)) * 31;
        String str = this.Z;
        int iHashCode2 = (Arrays.hashCode(this.f0) + ((this.e0.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.g0;
        return Arrays.hashCode(this.h0) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.Z + ":" + this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f6329Y.toString());
        parcel.writeString(this.Z);
        List list = this.e0;
        parcel.writeInt(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            parcel.writeParcelable((Parcelable) list.get(i3), 0);
        }
        parcel.writeByteArray(this.f0);
        parcel.writeString(this.g0);
        parcel.writeByteArray(this.h0);
    }
}
