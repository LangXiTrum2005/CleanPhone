package com.facebook.gamingservices;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.gamingservices.internal.TournamentScoreType;
import com.facebook.gamingservices.internal.TournamentSortOrder;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import j$.time.Instant;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/facebook/gamingservices/TournamentConfig;", "Lcom/facebook/share/model/ShareModel;", "CREATOR", "Builder", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class TournamentConfig implements ShareModel {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final TournamentSortOrder f16246Y;
    public final TournamentScoreType Z;
    public final Instant e0;
    public final String f0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0003"}, d2 = {"Lcom/facebook/gamingservices/TournamentConfig$Builder;", "Lcom/facebook/share/model/ShareModelBuilder;", "Lcom/facebook/gamingservices/TournamentConfig;", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder implements ShareModelBuilder<TournamentConfig, Builder> {
    }

    /* JADX INFO: renamed from: com.facebook.gamingservices.TournamentConfig$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/facebook/gamingservices/TournamentConfig$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/gamingservices/TournamentConfig;", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements Parcelable.Creator<TournamentConfig> {
        @Override // android.os.Parcelable.Creator
        public final TournamentConfig createFromParcel(Parcel parcel) {
            Intrinsics.f(parcel, "parcel");
            return new TournamentConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TournamentConfig[] newArray(int i2) {
            return new TournamentConfig[i2];
        }
    }

    public TournamentConfig(Parcel parcel) {
        Instant instantFrom;
        TournamentSortOrder tournamentSortOrder;
        TournamentScoreType tournamentScoreType;
        ZonedDateTime zonedDateTime;
        this.X = parcel.readString();
        TournamentSortOrder[] tournamentSortOrderArrValues = TournamentSortOrder.values();
        int length = tournamentSortOrderArrValues.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            instantFrom = null;
            zonedDateTime = null;
            if (i3 >= length) {
                tournamentSortOrder = null;
                break;
            }
            tournamentSortOrder = tournamentSortOrderArrValues[i3];
            if (Intrinsics.a(tournamentSortOrder.name(), parcel.readString())) {
                break;
            } else {
                i3++;
            }
        }
        this.f16246Y = tournamentSortOrder;
        TournamentScoreType[] tournamentScoreTypeArrValues = TournamentScoreType.values();
        int length2 = tournamentScoreTypeArrValues.length;
        while (true) {
            if (i2 >= length2) {
                tournamentScoreType = null;
                break;
            }
            tournamentScoreType = tournamentScoreTypeArrValues[i2];
            if (Intrinsics.a(tournamentScoreType.name(), parcel.readString())) {
                break;
            } else {
                i2++;
            }
        }
        this.Z = tournamentScoreType;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            String string = parcel.readString();
            if (i4 >= 26) {
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
                Intrinsics.e(dateTimeFormatterOfPattern, "DateTimeFormatter.ofPatt…\"yyyy-MM-dd'T'HH:mm:ssZ\")");
                zonedDateTime = ZonedDateTime.parse(string, dateTimeFormatterOfPattern);
            }
            instantFrom = Instant.from(zonedDateTime);
        }
        this.e0 = instantFrom;
        this.f0 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i2) {
        Intrinsics.f(out, "out");
        out.writeString(String.valueOf(this.f16246Y));
        out.writeString(String.valueOf(this.Z));
        out.writeString(String.valueOf(this.e0));
        out.writeString(this.X);
        out.writeString(this.f0);
    }
}
