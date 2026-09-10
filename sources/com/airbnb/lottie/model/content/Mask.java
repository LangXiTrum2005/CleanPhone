package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;

/* JADX INFO: loaded from: classes.dex */
public class Mask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaskMode f9770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableShapeValue f9771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableIntegerValue f9772c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MaskMode {
        public static final MaskMode X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final MaskMode f9773Y;
        public static final MaskMode Z;
        public static final MaskMode e0;
        public static final /* synthetic */ MaskMode[] f0;

        static {
            MaskMode maskMode = new MaskMode("MASK_MODE_ADD", 0);
            X = maskMode;
            MaskMode maskMode2 = new MaskMode("MASK_MODE_SUBTRACT", 1);
            f9773Y = maskMode2;
            MaskMode maskMode3 = new MaskMode("MASK_MODE_INTERSECT", 2);
            Z = maskMode3;
            MaskMode maskMode4 = new MaskMode("MASK_MODE_NONE", 3);
            e0 = maskMode4;
            f0 = new MaskMode[]{maskMode, maskMode2, maskMode3, maskMode4};
        }

        public static MaskMode valueOf(String str) {
            return (MaskMode) Enum.valueOf(MaskMode.class, str);
        }

        public static MaskMode[] values() {
            return (MaskMode[]) f0.clone();
        }
    }

    public Mask(MaskMode maskMode, AnimatableShapeValue animatableShapeValue, AnimatableIntegerValue animatableIntegerValue, boolean z2) {
        this.f9770a = maskMode;
        this.f9771b = animatableShapeValue;
        this.f9772c = animatableIntegerValue;
        this.d = z2;
    }
}
