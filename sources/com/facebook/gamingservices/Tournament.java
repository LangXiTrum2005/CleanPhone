package com.facebook.gamingservices;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import com.google.gson.annotations.SerializedName;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/facebook/gamingservices/Tournament;", "Lcom/facebook/share/model/ShareModel;", "", "X", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Y", "getTitle", "title", "Z", "getPayload", "payload", "e0", "getEndTime$facebook_gamingservices_release", "setEndTime$facebook_gamingservices_release", "(Ljava/lang/String;)V", "endTime", "CREATOR", "Builder", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class Tournament implements ShareModel {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("id")
    private final String identifier;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tournament_title")
    private final String title;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("tournament_payload")
    private final String payload;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    @SerializedName("tournament_end_time")
    private String endTime;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0003"}, d2 = {"Lcom/facebook/gamingservices/Tournament$Builder;", "Lcom/facebook/share/model/ShareModelBuilder;", "Lcom/facebook/gamingservices/Tournament;", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Builder implements ShareModelBuilder<Tournament, Builder> {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            ((Builder) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Builder(identifier=null, expiration=null, title=null, payload=null)";
        }
    }

    /* JADX INFO: renamed from: com.facebook.gamingservices.Tournament$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/facebook/gamingservices/Tournament$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/gamingservices/Tournament;", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements Parcelable.Creator<Tournament> {
        @Override // android.os.Parcelable.Creator
        public final Tournament createFromParcel(Parcel parcel) {
            Intrinsics.f(parcel, "parcel");
            return new Tournament(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Tournament[] newArray(int i2) {
            return new Tournament[i2];
        }
    }

    public Tournament(Parcel parcel) {
        ZonedDateTime zonedDateTime;
        String identifier = parcel.toString();
        String string = parcel.toString();
        String string2 = parcel.toString();
        String string3 = parcel.toString();
        Intrinsics.f(identifier, "identifier");
        this.identifier = identifier;
        this.endTime = string;
        this.title = string2;
        this.payload = string3;
        if (Build.VERSION.SDK_INT >= 26) {
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
            Intrinsics.e(dateTimeFormatterOfPattern, "DateTimeFormatter.ofPatt…\"yyyy-MM-dd'T'HH:mm:ssZ\")");
            zonedDateTime = ZonedDateTime.parse(string, dateTimeFormatterOfPattern);
        } else {
            zonedDateTime = null;
        }
        a(zonedDateTime);
    }

    public final void a(ZonedDateTime zonedDateTime) {
        if (Build.VERSION.SDK_INT < 26 || zonedDateTime == null) {
            return;
        }
        this.endTime = zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        a(zonedDateTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i2) {
        Intrinsics.f(out, "out");
        out.writeString(this.identifier);
        out.writeString(this.endTime);
        out.writeString(this.title);
        out.writeString(this.payload);
    }
}
