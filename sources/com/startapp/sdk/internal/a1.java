package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.model.AdDetails;

/* JADX INFO: loaded from: classes6.dex */
public final class a1 extends View.BaseSavedState {
    public static final Parcelable.Creator<a1> CREATOR = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdDetails[] f40776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f40777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40778c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40779e;
    public boolean f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdInformationOverrides f40781i;
    public BannerOptions j;
    public final AdRulesResult k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40782l;
    public d1[] m;

    public a1(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        if (!this.f40782l) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(this.f40779e);
        parcel.writeFloat(this.f40777b);
        parcel.writeInt(this.f40778c);
        parcel.writeInt(this.d);
        parcel.writeParcelableArray(this.f40776a, i2);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.f40780h ? 1 : 0);
        d1[] d1VarArr = this.m;
        if (d1VarArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(d1VarArr.length);
            for (d1 d1Var : this.m) {
                parcel.writeParcelable(d1Var, i2);
            }
        }
        parcel.writeSerializable(this.f40781i);
        parcel.writeSerializable(this.j);
        parcel.writeSerializable(this.k);
    }

    public a1(Parcel parcel) {
        super(parcel);
        if (parcel.readInt() != 1) {
            this.f40782l = false;
            return;
        }
        this.f40782l = true;
        this.f40779e = parcel.readInt();
        this.f40777b = parcel.readFloat();
        this.f40778c = parcel.readInt();
        this.d = parcel.readInt();
        Parcelable[] parcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
        if (parcelableArray != null) {
            AdDetails[] adDetailsArr = new AdDetails[parcelableArray.length];
            this.f40776a = adDetailsArr;
            System.arraycopy(parcelableArray, 0, adDetailsArr, 0, parcelableArray.length);
        }
        int i2 = parcel.readInt();
        this.f = false;
        if (i2 == 1) {
            this.f = true;
        }
        int i3 = parcel.readInt();
        this.g = false;
        if (i3 == 1) {
            this.g = true;
        }
        int i4 = parcel.readInt();
        this.f40780h = false;
        if (i4 == 1) {
            this.f40780h = true;
        }
        int i5 = parcel.readInt();
        if (i5 > 0) {
            this.m = new d1[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                this.m[i6] = (d1) parcel.readParcelable(d1.class.getClassLoader());
            }
        }
        this.f40781i = (AdInformationOverrides) parcel.readSerializable();
        this.j = (BannerOptions) parcel.readSerializable();
        this.k = (AdRulesResult) parcel.readSerializable();
    }
}
