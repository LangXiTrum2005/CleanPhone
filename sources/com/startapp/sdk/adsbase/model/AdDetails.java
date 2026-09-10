package com.startapp.sdk.adsbase.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.r;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AdDetails implements Serializable, Parcelable {
    public static final Parcelable.Creator<AdDetails> CREATOR = new r();
    private static final long serialVersionUID = 2746160166339963360L;
    private String adId;

    @TypeInfo(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private boolean app;
    private String appPresencePackage;
    private boolean belowMinCPM;
    private String bidToken;
    private String callToAction;
    private String category;
    private String clickUrl;
    private String closeUrl;
    private Long delayImpressionInSeconds;
    private String description;
    private String erid;
    private String eridUrl;

    @TypeInfo(type = ArrayList.class)
    private List<String> externalClickUrls;

    @TypeInfo(type = ArrayList.class)
    private List<String> externalImpressionUrls;
    private String imageUrl;
    private String installs;
    private String intentDetails;
    private String intentPackageName;
    private int minAppVersion;
    private String packageName;
    private float rating;
    private String secondaryImageUrl;
    private Boolean sendRedirectHops;
    private boolean smartRedirect;
    private boolean startappBrowserEnabled;
    private String template;
    private String title;
    private String trackingClickUrl;
    private String trackingUrl;
    private Long ttl;

    public AdDetails() {
        this.rating = 5.0f;
        this.belowMinCPM = false;
    }

    public final Long A() {
        return this.ttl;
    }

    public final boolean B() {
        return this.app;
    }

    public final boolean C() {
        return this.intentPackageName != null;
    }

    public final boolean D() {
        return this.smartRedirect;
    }

    public final boolean E() {
        return this.startappBrowserEnabled;
    }

    public final Boolean F() {
        return this.sendRedirectHops;
    }

    public final String a() {
        return this.adId;
    }

    public final List b() {
        return this.adVerifications;
    }

    public final String[] c() {
        List<String> list = this.externalImpressionUrls;
        return list == null ? new String[0] : (String[]) list.toArray(new String[0]);
    }

    public final String d() {
        return this.appPresencePackage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.bidToken;
    }

    public final String f() {
        return this.callToAction;
    }

    public final String g() {
        return this.category;
    }

    public final String h() {
        return this.clickUrl;
    }

    public final Long i() {
        return this.delayImpressionInSeconds;
    }

    public final String j() {
        return this.description;
    }

    public final String k() {
        return this.erid;
    }

    public final String l() {
        return this.eridUrl;
    }

    public final String m() {
        return this.imageUrl;
    }

    public final String n() {
        return this.installs;
    }

    public final String o() {
        return this.intentDetails;
    }

    public final String p() {
        return this.intentPackageName;
    }

    public final boolean q() {
        return this.belowMinCPM;
    }

    public final int r() {
        return this.minAppVersion;
    }

    public final String s() {
        return this.packageName;
    }

    public final String[] t() {
        String str = this.trackingUrl;
        return str == null ? new String[0] : new String[]{str};
    }

    public final float u() {
        return this.rating;
    }

    public final String v() {
        return this.secondaryImageUrl;
    }

    public final String w() {
        return this.template;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.bidToken);
        parcel.writeString(this.adId);
        parcel.writeString(this.clickUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.trackingClickUrl);
        parcel.writeString(this.closeUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.secondaryImageUrl);
        parcel.writeFloat(this.rating);
        boolean z2 = this.smartRedirect;
        boolean z3 = this.startappBrowserEnabled;
        parcel.writeInt(z2 ? 1 : 0);
        parcel.writeInt(z3 ? 1 : 0);
        parcel.writeString(this.template);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appPresencePackage);
        parcel.writeString(this.intentPackageName);
        parcel.writeString(this.intentDetails);
        parcel.writeInt(this.minAppVersion);
        parcel.writeString(this.installs);
        parcel.writeString(this.category);
        parcel.writeInt(this.app ? 1 : 0);
        parcel.writeInt(this.belowMinCPM ? 1 : 0);
        parcel.writeString(this.erid);
        parcel.writeString(this.eridUrl);
        Long l2 = this.ttl;
        if (l2 != null) {
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeLong(-1L);
        }
        Long l3 = this.delayImpressionInSeconds;
        if (l3 != null) {
            parcel.writeLong(l3.longValue());
        } else {
            parcel.writeLong(-1L);
        }
        Boolean bool = this.sendRedirectHops;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bool.booleanValue() ? 1 : -1);
        }
        parcel.writeList(this.externalImpressionUrls);
        parcel.writeList(this.externalClickUrls);
        parcel.writeString(this.callToAction);
    }

    public final String x() {
        return this.title;
    }

    public final String[] y() {
        if (this.externalClickUrls == null) {
            return new String[]{this.trackingClickUrl};
        }
        ArrayList arrayList = new ArrayList(this.externalClickUrls);
        arrayList.add(this.trackingClickUrl);
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String z() {
        return this.closeUrl;
    }

    public AdDetails(Parcel parcel) {
        this.rating = 5.0f;
        this.belowMinCPM = false;
        this.bidToken = parcel.readString();
        this.adId = parcel.readString();
        this.clickUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.trackingClickUrl = parcel.readString();
        this.closeUrl = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.imageUrl = parcel.readString();
        this.secondaryImageUrl = parcel.readString();
        this.rating = parcel.readFloat();
        int i2 = parcel.readInt();
        int i3 = parcel.readInt();
        this.smartRedirect = i2 == 1;
        this.startappBrowserEnabled = i3 != 0;
        this.template = parcel.readString();
        this.packageName = parcel.readString();
        this.appPresencePackage = parcel.readString();
        this.intentPackageName = parcel.readString();
        this.intentDetails = parcel.readString();
        this.minAppVersion = parcel.readInt();
        this.installs = parcel.readString();
        this.category = parcel.readString();
        this.app = parcel.readInt() == 1;
        this.belowMinCPM = parcel.readInt() == 1;
        this.erid = parcel.readString();
        this.eridUrl = parcel.readString();
        long j = parcel.readLong();
        this.ttl = Long.valueOf(j);
        if (j == -1) {
            this.ttl = null;
        }
        long j2 = parcel.readLong();
        this.delayImpressionInSeconds = Long.valueOf(j2);
        if (j2 == -1) {
            this.delayImpressionInSeconds = null;
        }
        int i4 = parcel.readInt();
        if (i4 == 0) {
            this.sendRedirectHops = null;
        } else {
            this.sendRedirectHops = Boolean.valueOf(i4 == 1);
        }
        this.externalImpressionUrls = parcel.readArrayList(String.class.getClassLoader());
        this.externalClickUrls = parcel.readArrayList(String.class.getClassLoader());
        this.callToAction = parcel.readString();
    }
}
