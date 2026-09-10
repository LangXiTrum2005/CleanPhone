package com.google.android.exoplayer2.text.webvtt;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttCssStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f18634c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18635e;
    public int f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18637i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18638l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18639n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18640p;
    public boolean q;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public static int a(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }
}
