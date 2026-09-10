package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CameraEffectFeature implements DialogFeature {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final CameraEffectFeature f16529Y;
    public static final /* synthetic */ CameraEffectFeature[] Z;
    public int X;

    /* JADX INFO: Fake field, exist only in values array */
    CameraEffectFeature EF0;

    static {
        CameraEffectFeature cameraEffectFeature = new CameraEffectFeature("SHARE_CAMERA_EFFECT", 0);
        cameraEffectFeature.X = 20170417;
        f16529Y = cameraEffectFeature;
        Z = new CameraEffectFeature[]{cameraEffectFeature};
    }

    public static CameraEffectFeature valueOf(String str) {
        return (CameraEffectFeature) Enum.valueOf(CameraEffectFeature.class, str);
    }

    public static CameraEffectFeature[] values() {
        return (CameraEffectFeature[]) Z.clone();
    }

    @Override // com.facebook.internal.DialogFeature
    public final int d() {
        return this.X;
    }

    @Override // com.facebook.internal.DialogFeature
    public final String g() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }
}
