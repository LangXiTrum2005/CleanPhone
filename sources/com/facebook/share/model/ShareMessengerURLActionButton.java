package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Uri f16621Y;
    public final Uri Z;
    public final boolean e0;
    public final boolean f0;
    public final WebviewHeightRatio g0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareMessengerURLActionButton$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareMessengerURLActionButton> {
        @Override // android.os.Parcelable.Creator
        public final ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareMessengerURLActionButton[] newArray(int i2) {
            return new ShareMessengerURLActionButton[i2];
        }
    }

    public static final class Builder extends ShareMessengerActionButton.Builder<ShareMessengerURLActionButton, Builder> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WebviewHeightRatio {
        public static final /* synthetic */ WebviewHeightRatio[] X = {new WebviewHeightRatio("WebviewHeightRatioFull", 0), new WebviewHeightRatio("WebviewHeightRatioTall", 1), new WebviewHeightRatio("WebviewHeightRatioCompact", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        WebviewHeightRatio EF5;

        public static WebviewHeightRatio valueOf(String str) {
            return (WebviewHeightRatio) Enum.valueOf(WebviewHeightRatio.class, str);
        }

        public static WebviewHeightRatio[] values() {
            return (WebviewHeightRatio[]) X.clone();
        }
    }

    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        this.f16621Y = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.e0 = parcel.readByte() != 0;
        this.Z = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.g0 = (WebviewHeightRatio) parcel.readSerializable();
        this.f0 = parcel.readByte() != 0;
    }
}
