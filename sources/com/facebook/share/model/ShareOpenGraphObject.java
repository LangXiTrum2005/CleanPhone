package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, Builder> {
    public static final Parcelable.Creator<ShareOpenGraphObject> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: com.facebook.share.model.ShareOpenGraphObject$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareOpenGraphObject> {
        @Override // android.os.Parcelable.Creator
        public final ShareOpenGraphObject createFromParcel(Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareOpenGraphObject[] newArray(int i2) {
            return new ShareOpenGraphObject[i2];
        }
    }

    public static final class Builder extends ShareOpenGraphValueContainer.Builder<ShareOpenGraphObject, Builder> {
    }
}
