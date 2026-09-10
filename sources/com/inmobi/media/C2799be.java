package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.MediaView;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2799be {
    public final String a;
    public final String b;
    public final InMobiNativeImage c;
    public final String d;
    public final JSONObject e;
    public final String f;
    public final Float g;
    public final boolean h;
    public final MediaView i;
    public final View j;

    public C2799be(String str, String str2, InMobiNativeImage iconImage, String str3, JSONObject extras, String str4, Float f, boolean z, MediaView mediaView, View view) {
        Intrinsics.checkNotNullParameter(iconImage, "iconImage");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.a = str;
        this.b = str2;
        this.c = iconImage;
        this.d = str3;
        this.e = extras;
        this.f = str4;
        this.g = f;
        this.h = z;
        this.i = mediaView;
        this.j = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2799be)) {
            return false;
        }
        C2799be c2799be = (C2799be) obj;
        return Intrinsics.wireman(this.a, c2799be.a) && Intrinsics.wireman(this.b, c2799be.b) && Intrinsics.wireman(this.c, c2799be.c) && Intrinsics.wireman(this.d, c2799be.d) && Intrinsics.wireman(this.e, c2799be.e) && Intrinsics.wireman(this.f, c2799be.f) && Intrinsics.wireman(this.g, c2799be.g) && this.h == c2799be.h && Intrinsics.wireman(this.i, c2799be.i) && Intrinsics.wireman(this.j, c2799be.j);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.g;
        int iHashCode5 = (Boolean.hashCode(this.h) + ((iHashCode4 + (f == null ? 0 : f.hashCode())) * 31)) * 31;
        MediaView mediaView = this.i;
        int iHashCode6 = (iHashCode5 + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.j;
        return iHashCode6 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "NativePubData(title=" + this.a + ", description=" + this.b + ", iconImage=" + this.c + ", ctaText=" + this.d + ", extras=" + this.e + ", sponsored=" + this.f + ", adRating=" + this.g + ", isVideo=" + this.h + ", mediaView=" + this.i + ", adChoiceIcon=" + this.j + ")";
    }
}
