package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class M8 extends C3001e8 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22978l;
    public final byte m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f22979n;
    public ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, int i10, byte b2, String textColor, List textStyles, P8 p8) {
        super(i2, i3, i4, i5, i6, i7, i8, i9, "fill", borderStrokeStyle, borderCornerStyle, borderColor, backgroundColor, p8);
        Intrinsics.f(borderStrokeStyle, "borderStrokeStyle");
        Intrinsics.f(borderCornerStyle, "borderCornerStyle");
        Intrinsics.f(borderColor, "borderColor");
        Intrinsics.f(backgroundColor, "backgroundColor");
        Intrinsics.f(textColor, "textColor");
        Intrinsics.f(textStyles, "textStyles");
        this.f22978l = i10;
        this.m = b2;
        this.f22979n = textColor.length() == 0 ? "#ff000000" : textColor;
        int iMin = Math.min(textStyles.size(), 4);
        this.o = new ArrayList();
        for (int i11 = 0; i11 < iMin; i11++) {
            this.o.add(textStyles.get(i11));
        }
    }

    @Override // com.inmobi.media.C3001e8
    public final String a() {
        String str = this.j;
        Locale locale = Locale.US;
        return com.applovin.impl.Z.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
    }
}
