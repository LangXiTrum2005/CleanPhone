package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenGraphMessageDialogFeature implements DialogFeature {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ OpenGraphMessageDialogFeature[] f16588Y;
    public int X;

    /* JADX INFO: Fake field, exist only in values array */
    OpenGraphMessageDialogFeature EF0;

    static {
        OpenGraphMessageDialogFeature openGraphMessageDialogFeature = new OpenGraphMessageDialogFeature("OG_MESSAGE_DIALOG", 0);
        openGraphMessageDialogFeature.X = 20140204;
        f16588Y = new OpenGraphMessageDialogFeature[]{openGraphMessageDialogFeature};
    }

    public static OpenGraphMessageDialogFeature valueOf(String str) {
        return (OpenGraphMessageDialogFeature) Enum.valueOf(OpenGraphMessageDialogFeature.class, str);
    }

    public static OpenGraphMessageDialogFeature[] values() {
        return (OpenGraphMessageDialogFeature[]) f16588Y.clone();
    }

    @Override // com.facebook.internal.DialogFeature
    public final int d() {
        return this.X;
    }

    @Override // com.facebook.internal.DialogFeature
    public final String g() {
        return "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
    }
}
