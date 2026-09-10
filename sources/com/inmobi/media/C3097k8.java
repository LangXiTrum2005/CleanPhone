package com.inmobi.media;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3097k8 extends M8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3097k8(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, int i10, String textColor, ArrayList textStyles, P8 nativeAnimationTimer) {
        super(i2, i3, i4, i5, i6, i7, i8, i9, borderStrokeStyle, borderCornerStyle, borderColor, backgroundColor, 12, (byte) 0, "#ff000000", CollectionsKt.L("none"), nativeAnimationTimer);
        Intrinsics.f(borderStrokeStyle, "borderStrokeStyle");
        Intrinsics.f(borderCornerStyle, "borderCornerStyle");
        Intrinsics.f(borderColor, "borderColor");
        Intrinsics.f(backgroundColor, "backgroundColor");
        Intrinsics.f(textColor, "textColor");
        Intrinsics.f(textStyles, "textStyles");
        Intrinsics.f(nativeAnimationTimer, "nativeAnimationTimer");
        this.f22978l = i10;
        this.f22979n = textColor.length() == 0 ? "#ff000000" : textColor;
        int iMin = Math.min(textStyles.size(), 1);
        this.o = new ArrayList();
        if (iMin < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            this.o.add(textStyles.get(i11));
            if (i11 == iMin) {
                return;
            } else {
                i11++;
            }
        }
    }
}
