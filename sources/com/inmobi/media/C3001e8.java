package com.inmobi.media;

import android.graphics.Point;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3001e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Point f23552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Point f23553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point f23554c;
    public final Point d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23555e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f23557i;
    public final String j;
    public final P8 k;

    public C3001e8() {
        this.f23552a = new Point(0, 0);
        this.f23554c = new Point(0, 0);
        this.f23553b = new Point(0, 0);
        this.d = new Point(0, 0);
        this.f23555e = "none";
        this.f = "straight";
        this.f23556h = 10.0f;
        this.f23557i = "#ff000000";
        this.j = "#00000000";
        this.g = "fill";
        this.k = null;
    }

    public String a() {
        String str = this.j;
        Locale locale = Locale.US;
        return com.applovin.impl.Z.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    public C3001e8(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String contentMode, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, P8 p8) {
        Intrinsics.f(contentMode, "contentMode");
        Intrinsics.f(borderStrokeStyle, "borderStrokeStyle");
        Intrinsics.f(borderCornerStyle, "borderCornerStyle");
        Intrinsics.f(borderColor, "borderColor");
        Intrinsics.f(backgroundColor, "backgroundColor");
        this.f23552a = new Point(i4, i5);
        this.f23553b = new Point(i8, i9);
        this.f23554c = new Point(i2, i3);
        this.d = new Point(i6, i7);
        this.f23555e = borderStrokeStyle;
        this.f = borderCornerStyle;
        this.f23556h = 10.0f;
        this.g = contentMode;
        this.f23557i = borderColor.length() == 0 ? "#ff000000" : borderColor;
        this.j = backgroundColor.length() == 0 ? "#00000000" : backgroundColor;
        this.k = p8;
    }
}
