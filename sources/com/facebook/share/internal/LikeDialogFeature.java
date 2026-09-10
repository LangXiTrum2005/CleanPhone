package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class LikeDialogFeature implements DialogFeature {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final LikeDialogFeature f16583Y;
    public static final /* synthetic */ LikeDialogFeature[] Z;
    public int X;

    /* JADX INFO: Fake field, exist only in values array */
    LikeDialogFeature EF0;

    static {
        LikeDialogFeature likeDialogFeature = new LikeDialogFeature("LIKE_DIALOG", 0);
        likeDialogFeature.X = 20140701;
        f16583Y = likeDialogFeature;
        Z = new LikeDialogFeature[]{likeDialogFeature};
    }

    public static LikeDialogFeature valueOf(String str) {
        return (LikeDialogFeature) Enum.valueOf(LikeDialogFeature.class, str);
    }

    public static LikeDialogFeature[] values() {
        return (LikeDialogFeature[]) Z.clone();
    }

    @Override // com.facebook.internal.DialogFeature
    public final int d() {
        return this.X;
    }

    @Override // com.facebook.internal.DialogFeature
    public final String g() {
        return "com.facebook.platform.action.request.LIKE_DIALOG";
    }
}
