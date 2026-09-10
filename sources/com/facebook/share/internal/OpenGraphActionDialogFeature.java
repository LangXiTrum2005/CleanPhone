package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenGraphActionDialogFeature implements DialogFeature {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final OpenGraphActionDialogFeature f16587Y;
    public static final /* synthetic */ OpenGraphActionDialogFeature[] Z;
    public int X;

    /* JADX INFO: Fake field, exist only in values array */
    OpenGraphActionDialogFeature EF0;

    static {
        OpenGraphActionDialogFeature openGraphActionDialogFeature = new OpenGraphActionDialogFeature("OG_ACTION_DIALOG", 0);
        openGraphActionDialogFeature.X = 20130618;
        f16587Y = openGraphActionDialogFeature;
        Z = new OpenGraphActionDialogFeature[]{openGraphActionDialogFeature};
    }

    public static OpenGraphActionDialogFeature valueOf(String str) {
        return (OpenGraphActionDialogFeature) Enum.valueOf(OpenGraphActionDialogFeature.class, str);
    }

    public static OpenGraphActionDialogFeature[] values() {
        return (OpenGraphActionDialogFeature[]) Z.clone();
    }

    @Override // com.facebook.internal.DialogFeature
    public final int d() {
        return this.X;
    }

    @Override // com.facebook.internal.DialogFeature
    public final String g() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }
}
