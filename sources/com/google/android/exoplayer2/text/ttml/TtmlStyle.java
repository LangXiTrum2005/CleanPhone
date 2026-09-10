package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
final class TtmlStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18618c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18619e;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f18622l;
    public Layout.Alignment o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f18624p;
    public TextEmphasis r;
    public int f = -1;
    public int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18620h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18621i = -1;
    public int j = -1;
    public int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18623n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public final void a(TtmlStyle ttmlStyle) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.f18618c && ttmlStyle.f18618c) {
                this.f18617b = ttmlStyle.f18617b;
                this.f18618c = true;
            }
            if (this.f18620h == -1) {
                this.f18620h = ttmlStyle.f18620h;
            }
            if (this.f18621i == -1) {
                this.f18621i = ttmlStyle.f18621i;
            }
            if (this.f18616a == null && (str = ttmlStyle.f18616a) != null) {
                this.f18616a = str;
            }
            if (this.f == -1) {
                this.f = ttmlStyle.f;
            }
            if (this.g == -1) {
                this.g = ttmlStyle.g;
            }
            if (this.f18623n == -1) {
                this.f18623n = ttmlStyle.f18623n;
            }
            if (this.o == null && (alignment2 = ttmlStyle.o) != null) {
                this.o = alignment2;
            }
            if (this.f18624p == null && (alignment = ttmlStyle.f18624p) != null) {
                this.f18624p = alignment;
            }
            if (this.q == -1) {
                this.q = ttmlStyle.q;
            }
            if (this.j == -1) {
                this.j = ttmlStyle.j;
                this.k = ttmlStyle.k;
            }
            if (this.r == null) {
                this.r = ttmlStyle.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = ttmlStyle.s;
            }
            if (!this.f18619e && ttmlStyle.f18619e) {
                this.d = ttmlStyle.d;
                this.f18619e = true;
            }
            if (this.m != -1 || (i2 = ttmlStyle.m) == -1) {
                return;
            }
            this.m = i2;
        }
    }
}
