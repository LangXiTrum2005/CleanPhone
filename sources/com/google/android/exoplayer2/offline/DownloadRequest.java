package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Uri f18282Y;
    public final String Z;
    public final List e0;
    public final byte[] f0;
    public final String g0;
    public final byte[] h0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadRequest$1, reason: invalid class name */
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f18284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18285c;
        public ArrayList d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f18286e;
        public String f;
        public byte[] g;

        public Builder(String str, Uri uri) {
            this.f18283a = str;
            this.f18284b = uri;
        }

        public final DownloadRequest a() {
            String str = this.f18285c;
            List listX = this.d;
            if (listX == null) {
                listX = ImmutableList.x();
            }
            return new DownloadRequest(this.f18283a, this.f18284b, str, listX, this.f18286e, this.f, this.g);
        }
    }

    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int iX = Util.x(uri, str2);
        if (iX == 0 || iX == 2 || iX == 1) {
            Assertions.a("customCacheKey must be null for type: " + iX, str3 == null);
        }
        this.X = str;
        this.f18282Y = uri;
        this.Z = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.e0 = Collections.unmodifiableList(arrayList);
        this.f0 = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.g0 = str3;
        this.h0 = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : Util.f;
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
        return this.X.equals(downloadRequest.X) && this.f18282Y.equals(downloadRequest.f18282Y) && Util.a(this.Z, downloadRequest.Z) && this.e0.equals(downloadRequest.e0) && Arrays.equals(this.f0, downloadRequest.f0) && Util.a(this.g0, downloadRequest.g0) && Arrays.equals(this.h0, downloadRequest.h0);
    }

    public final int hashCode() {
        int iHashCode = (this.f18282Y.hashCode() + (this.X.hashCode() * 961)) * 31;
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
        parcel.writeString(this.f18282Y.toString());
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

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        int i2 = Util.f18979a;
        this.X = string;
        this.f18282Y = Uri.parse(parcel.readString());
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
}
