package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, Builder> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: com.facebook.share.model.ShareOpenGraphAction$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareOpenGraphAction> {
        @Override // android.os.Parcelable.Creator
        public final ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareOpenGraphAction[] newArray(int i2) {
            return new ShareOpenGraphAction[i2];
        }
    }

    public static final class Builder extends ShareOpenGraphValueContainer.Builder<ShareOpenGraphAction, Builder> {
    }
}
