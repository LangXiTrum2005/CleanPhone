package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public static final Format h0;
    public static final Format i0;
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f18200Y;
    public final long Z;
    public final long e0;
    public final byte[] f0;
    public int g0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.emsg.EventMessage$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        public final EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EventMessage[] newArray(int i2) {
            return new EventMessage[i2];
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.k = "application/id3";
        h0 = new Format(builder);
        Format.Builder builder2 = new Format.Builder();
        builder2.k = "application/x-scte35";
        i0 = new Format(builder2);
        CREATOR = new AnonymousClass1();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.X = str;
        this.f18200Y = str2;
        this.Z = j;
        this.e0 = j2;
        this.f0 = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final Format G() {
        String str = this.X;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return i0;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return h0;
            default:
                return null;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] H() {
        if (G() != null) {
            return this.f0;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.Z == eventMessage.Z && this.e0 == eventMessage.e0 && Util.a(this.X, eventMessage.X) && Util.a(this.f18200Y, eventMessage.f18200Y) && Arrays.equals(this.f0, eventMessage.f0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.g0 == 0) {
            String str = this.X;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f18200Y;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.Z;
            int i2 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e0;
            this.g0 = Arrays.hashCode(this.f0) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.g0;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.X + ", id=" + this.e0 + ", durationMs=" + this.Z + ", value=" + this.f18200Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f18200Y);
        parcel.writeLong(this.Z);
        parcel.writeLong(this.e0);
        parcel.writeByteArray(this.f0);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i2 = Util.f18979a;
        this.X = string;
        this.f18200Y = parcel.readString();
        this.Z = parcel.readLong();
        this.e0 = parcel.readLong();
        this.f0 = parcel.createByteArray();
    }
}
