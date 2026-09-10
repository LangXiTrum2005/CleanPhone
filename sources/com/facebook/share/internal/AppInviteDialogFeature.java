package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AppInviteDialogFeature implements DialogFeature {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final AppInviteDialogFeature f16528Y;
    public static final /* synthetic */ AppInviteDialogFeature[] Z;
    public int X;

    /* JADX INFO: Fake field, exist only in values array */
    AppInviteDialogFeature EF0;

    static {
        AppInviteDialogFeature appInviteDialogFeature = new AppInviteDialogFeature("APP_INVITES_DIALOG", 0);
        appInviteDialogFeature.X = 20140701;
        f16528Y = appInviteDialogFeature;
        Z = new AppInviteDialogFeature[]{appInviteDialogFeature};
    }

    public static AppInviteDialogFeature valueOf(String str) {
        return (AppInviteDialogFeature) Enum.valueOf(AppInviteDialogFeature.class, str);
    }

    public static AppInviteDialogFeature[] values() {
        return (AppInviteDialogFeature[]) Z.clone();
    }

    @Override // com.facebook.internal.DialogFeature
    public final int d() {
        return this.X;
    }

    @Override // com.facebook.internal.DialogFeature
    public final String g() {
        return "com.facebook.platform.action.request.APPINVITES_DIALOG";
    }
}
