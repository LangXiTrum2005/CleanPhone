package com.mbridge.msdk.config.component.load.downloader;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32101c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Parcelable.Creator<DownloadProgress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress[] newArray(int i10) {
            return new DownloadProgress[i10];
        }
    }

    public DownloadProgress(long j10, long j11, int i10) {
        this.f32099a = j10;
        this.f32101c = j11;
        this.f32100b = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.f32099a;
    }

    public int getCurrentDownloadRate() {
        return this.f32100b;
    }

    public long getTotal() {
        return this.f32101c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f32099a);
        parcel.writeLong(this.f32101c);
        parcel.writeInt(this.f32100b);
    }

    public DownloadProgress(Parcel parcel) {
        this.f32099a = parcel.readLong();
        this.f32101c = parcel.readLong();
        this.f32100b = parcel.readInt();
    }
}
