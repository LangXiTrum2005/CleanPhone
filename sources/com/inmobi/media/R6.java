package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class R6 implements Parcelable {
    public static final P6 CREATOR = new P6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S6 f23120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23122c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f23123e;
    public int f;
    public String g;

    public R6(S6 landingPageTelemetryMetaData, String urlType, int i2, long j) {
        Intrinsics.f(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        Intrinsics.f(urlType, "urlType");
        this.f23120a = landingPageTelemetryMetaData;
        this.f23121b = urlType;
        this.f23122c = i2;
        this.d = j;
        this.f23123e = LazyKt.b(Q6.f23107a);
        this.f = -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R6)) {
            return false;
        }
        R6 r6 = (R6) obj;
        return Intrinsics.a(this.f23120a, r6.f23120a) && Intrinsics.a(this.f23121b, r6.f23121b) && this.f23122c == r6.f23122c && this.d == r6.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + androidx.media3.extractor.text.ttml.a.a(this.f23122c, androidx.datastore.preferences.protobuf.a.b(this.f23121b, this.f23120a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=");
        sb.append(this.f23120a);
        sb.append(", urlType=");
        sb.append(this.f23121b);
        sb.append(", counter=");
        sb.append(this.f23122c);
        sb.append(", startTime=");
        return androidx.media3.extractor.text.ttml.a.o(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.f(parcel, "parcel");
        parcel.writeLong(this.f23120a.f23170a);
        parcel.writeString(this.f23120a.f23171b);
        parcel.writeString(this.f23120a.f23172c);
        parcel.writeString(this.f23120a.d);
        parcel.writeString(this.f23120a.f23173e);
        parcel.writeString(this.f23120a.f);
        parcel.writeString(this.f23120a.g);
        parcel.writeByte(this.f23120a.f23174h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f23120a.f23175i);
        parcel.writeString(this.f23121b);
        parcel.writeInt(this.f23122c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
    }

    public /* synthetic */ R6(S6 s6, String str, int i2, int i3) {
        this(s6, str, (i3 & 4) != 0 ? 0 : i2, SystemClock.elapsedRealtime());
    }
}
