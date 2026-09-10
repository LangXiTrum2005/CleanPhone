package com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new Parcelable.Creator<EventMessage>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg.EventMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    };
    public final long durationMs;
    private int hashCode;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final long f35134id;
    public final byte[] messageData;
    public final long presentationTimeUs;
    public final String schemeIdUri;
    public final String value;

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr, long j12) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j10;
        this.f35134id = j11;
        this.messageData = bArr;
        this.presentationTimeUs = j12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.presentationTimeUs == eventMessage.presentationTimeUs && this.durationMs == eventMessage.durationMs && this.f35134id == eventMessage.f35134id && Util.areEqual(this.schemeIdUri, eventMessage.schemeIdUri) && Util.areEqual(this.value, eventMessage.value) && Arrays.equals(this.messageData, eventMessage.messageData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.schemeIdUri;
            int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.value;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.presentationTimeUs;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.durationMs;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f35134id;
            this.hashCode = Arrays.hashCode(this.messageData) + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31);
        }
        return this.hashCode;
    }

    public String toString() {
        return "EMSG: scheme=" + this.schemeIdUri + ", id=" + this.f35134id + ", value=" + this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.schemeIdUri);
        parcel.writeString(this.value);
        parcel.writeLong(this.presentationTimeUs);
        parcel.writeLong(this.durationMs);
        parcel.writeLong(this.f35134id);
        parcel.writeByteArray(this.messageData);
    }

    public EventMessage(Parcel parcel) {
        this.schemeIdUri = parcel.readString();
        this.value = parcel.readString();
        this.presentationTimeUs = parcel.readLong();
        this.durationMs = parcel.readLong();
        this.f35134id = parcel.readLong();
        this.messageData = parcel.createByteArray();
    }
}
