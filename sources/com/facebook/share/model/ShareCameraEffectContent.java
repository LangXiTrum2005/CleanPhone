package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Builder> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new AnonymousClass1();
    public String h0;
    public CameraEffectArguments i0;
    public CameraEffectTextures j0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareCameraEffectContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareCameraEffectContent> {
        @Override // android.os.Parcelable.Creator
        public final ShareCameraEffectContent createFromParcel(Parcel parcel) {
            ShareCameraEffectContent shareCameraEffectContent = new ShareCameraEffectContent(parcel);
            shareCameraEffectContent.h0 = parcel.readString();
            CameraEffectArguments.Builder builder = new CameraEffectArguments.Builder();
            Bundle bundle = new Bundle();
            builder.f16608a = bundle;
            CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
            if (cameraEffectArguments != null) {
                bundle.putAll(cameraEffectArguments.X);
            }
            shareCameraEffectContent.i0 = new CameraEffectArguments(builder);
            CameraEffectTextures.Builder builder2 = new CameraEffectTextures.Builder();
            Bundle bundle2 = new Bundle();
            builder2.f16609a = bundle2;
            CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
            if (cameraEffectTextures != null) {
                bundle2.putAll(cameraEffectTextures.X);
            }
            shareCameraEffectContent.j0 = new CameraEffectTextures(builder2);
            return shareCameraEffectContent;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareCameraEffectContent[] newArray(int i2) {
            return new ShareCameraEffectContent[i2];
        }
    }

    public static final class Builder extends ShareContent.Builder<ShareCameraEffectContent, Builder> {
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.h0);
        parcel.writeParcelable(this.i0, 0);
        parcel.writeParcelable(this.j0, 0);
    }
}
