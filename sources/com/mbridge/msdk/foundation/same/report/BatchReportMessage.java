package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33901c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Parcelable.Creator<BatchReportMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i10) {
            return new BatchReportMessage[i10];
        }
    }

    public BatchReportMessage(String str, String str2, long j10) {
        this.f33901c = str;
        this.f33899a = str2;
        this.f33900b = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f33899a;
    }

    public long getTimestamp() {
        return this.f33900b;
    }

    public String getUuid() {
        return this.f33901c;
    }

    public void setReportMessage(String str) {
        this.f33899a = str;
    }

    public void setTimestamp(long j10) {
        this.f33900b = j10;
    }

    public void setUuid(String str) {
        this.f33901c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f33901c);
        parcel.writeString(this.f33899a);
        parcel.writeLong(this.f33900b);
    }

    public BatchReportMessage(Parcel parcel) {
        this.f33901c = parcel.readString();
        this.f33899a = parcel.readString();
        this.f33900b = parcel.readLong();
    }
}
