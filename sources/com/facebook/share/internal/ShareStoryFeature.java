package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ShareStoryFeature implements DialogFeature {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ShareStoryFeature f16603Y;
    public static final /* synthetic */ ShareStoryFeature[] Z;
    public int X;

    /* JADX INFO: Fake field, exist only in values array */
    ShareStoryFeature EF0;

    static {
        ShareStoryFeature shareStoryFeature = new ShareStoryFeature("SHARE_STORY_ASSET", 0);
        shareStoryFeature.X = 20170417;
        f16603Y = shareStoryFeature;
        Z = new ShareStoryFeature[]{shareStoryFeature};
    }

    public static ShareStoryFeature valueOf(String str) {
        return (ShareStoryFeature) Enum.valueOf(ShareStoryFeature.class, str);
    }

    public static ShareStoryFeature[] values() {
        return (ShareStoryFeature[]) Z.clone();
    }

    @Override // com.facebook.internal.DialogFeature
    public final int d() {
        return this.X;
    }

    @Override // com.facebook.internal.DialogFeature
    public final String g() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }
}
