package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, Builder> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new AnonymousClass1();
    public final List h0;

    /* JADX INFO: renamed from: com.facebook.share.model.SharePhotoContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<SharePhotoContent> {
        @Override // android.os.Parcelable.Creator
        public final SharePhotoContent createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SharePhotoContent[] newArray(int i2) {
            return new SharePhotoContent[i2];
        }
    }

    public static class Builder extends ShareContent.Builder<SharePhotoContent, Builder> {
        public final ArrayList g = new ArrayList();

        public final void a(List list) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    SharePhoto sharePhoto = (SharePhoto) it.next();
                    if (sharePhoto != null) {
                        ArrayList arrayList = this.g;
                        SharePhoto.Builder builder = new SharePhoto.Builder();
                        builder.a(sharePhoto);
                        arrayList.add(new SharePhoto(builder));
                    }
                }
            }
        }
    }

    public SharePhotoContent(Builder builder) {
        super(builder);
        this.h0 = Collections.unmodifiableList(builder.g);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        List list = this.h0;
        ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            shareMediaArr[i3] = (ShareMedia) list.get(i3);
        }
        parcel.writeParcelableArray(shareMediaArr, i2);
    }

    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        ArrayList<ShareMedia> arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((ShareMedia) parcelable);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : arrayList) {
            if (shareMedia instanceof SharePhoto) {
                arrayList2.add((SharePhoto) shareMedia);
            }
        }
        this.h0 = Collections.unmodifiableList(arrayList2);
    }
}
