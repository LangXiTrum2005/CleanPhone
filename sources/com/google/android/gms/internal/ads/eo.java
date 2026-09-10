package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.nativead.NativeAdOptions;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eo extends l9.a {
    public static final Parcelable.Creator<eo> CREATOR = new gj(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzfw f14035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14040k;

    public eo(int i10, boolean z10, int i11, boolean z11, int i12, zzfw zzfwVar, boolean z12, int i13, int i14, boolean z13, int i15) {
        this.f14030a = i10;
        this.f14031b = z10;
        this.f14032c = i11;
        this.f14033d = z11;
        this.f14034e = i12;
        this.f14035f = zzfwVar;
        this.f14036g = z12;
        this.f14037h = i13;
        this.f14039j = z13;
        this.f14038i = i14;
        this.f14040k = i15;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public static NativeAdOptions b(eo eoVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (eoVar == null) {
            return builder.build();
        }
        int i10 = eoVar.f14030a;
        int i11 = 2;
        if (i10 == 2) {
            builder.setAdChoicesPlacement(eoVar.f14034e);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    builder.setRequestCustomMuteThisAd(eoVar.f14036g);
                    builder.setMediaAspectRatio(eoVar.f14037h);
                    builder.enableCustomClickGestureDirection(eoVar.f14038i, eoVar.f14039j);
                    int i12 = eoVar.f14040k;
                    if (i12 == 0) {
                        i11 = 1;
                    } else if (i12 == 2) {
                        i11 = 3;
                    } else if (i12 != 1) {
                        i11 = 1;
                    }
                    builder.zzi(i11);
                }
            }
            zzfw zzfwVar = eoVar.f14035f;
            if (zzfwVar != null) {
                builder.setVideoOptions(new VideoOptions(zzfwVar));
            }
            builder.setAdChoicesPlacement(eoVar.f14034e);
        }
        builder.setReturnUrlsForImageAssets(eoVar.f14031b);
        builder.setRequestMultipleImages(eoVar.f14033d);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f14030a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f14031b ? 1 : 0);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f14032c);
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(this.f14033d ? 1 : 0);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f14034e);
        r9.b.I(parcel, 6, this.f14035f, i10);
        r9.b.Q(parcel, 7, 4);
        parcel.writeInt(this.f14036g ? 1 : 0);
        r9.b.Q(parcel, 8, 4);
        parcel.writeInt(this.f14037h);
        r9.b.Q(parcel, 9, 4);
        parcel.writeInt(this.f14038i);
        r9.b.Q(parcel, 10, 4);
        parcel.writeInt(this.f14039j ? 1 : 0);
        r9.b.Q(parcel, 11, 4);
        parcel.writeInt(this.f14040k);
        r9.b.S(parcel, iR);
    }

    public eo(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfw(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }
}
