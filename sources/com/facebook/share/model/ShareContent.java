package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShareContent<P extends ShareContent, E extends Builder> implements ShareModel {
    public final Uri X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final List f16612Y;
    public final String Z;
    public final String e0;
    public final String f0;
    public final ShareHashtag g0;

    public static abstract class Builder<P extends ShareContent, E extends Builder> implements ShareModelBuilder<P, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f16613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f16614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16615c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16616e;
        public ShareHashtag f;
    }

    public ShareContent(SharePhotoContent.Builder builder) {
        this.X = builder.f16613a;
        this.f16612Y = builder.f16614b;
        this.Z = builder.f16615c;
        this.e0 = builder.d;
        this.f0 = builder.f16616e;
        this.g0 = builder.f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.X, 0);
        parcel.writeStringList(this.f16612Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.e0);
        parcel.writeString(this.f0);
        parcel.writeParcelable(this.g0, 0);
    }

    public ShareContent(Parcel parcel) {
        this.X = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f16612Y = arrayList.size() == 0 ? null : Collections.unmodifiableList(arrayList);
        this.Z = parcel.readString();
        this.e0 = parcel.readString();
        this.f0 = parcel.readString();
        ShareHashtag.Builder builder = new ShareHashtag.Builder();
        ShareHashtag shareHashtag = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag != null) {
            builder.f16617a = shareHashtag.X;
        }
        this.g0 = new ShareHashtag(builder);
    }
}
