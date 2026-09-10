package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f3797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f3798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f3799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f3800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f3801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f3802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f3803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaDescription f3804i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f3796a = str;
        this.f3797b = charSequence;
        this.f3798c = charSequence2;
        this.f3799d = charSequence3;
        this.f3800e = bitmap;
        this.f3801f = uri;
        this.f3802g = bundle;
        this.f3803h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f3797b) + ", " + ((Object) this.f3798c) + ", " + ((Object) this.f3799d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescriptionBuild = this.f3804i;
        if (mediaDescriptionBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f3796a);
            builder.setTitle(this.f3797b);
            builder.setSubtitle(this.f3798c);
            builder.setDescription(this.f3799d);
            builder.setIconBitmap(this.f3800e);
            builder.setIconUri(this.f3801f);
            builder.setExtras(this.f3802g);
            builder.setMediaUri(this.f3803h);
            mediaDescriptionBuild = builder.build();
            this.f3804i = mediaDescriptionBuild;
        }
        mediaDescriptionBuild.writeToParcel(parcel, i10);
    }
}
