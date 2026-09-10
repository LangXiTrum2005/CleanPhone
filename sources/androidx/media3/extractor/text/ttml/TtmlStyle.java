package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
final class TtmlStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7383c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7384e;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f7387l;
    public Layout.Alignment o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f7389p;
    public TextEmphasis r;
    public int f = -1;
    public int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7385h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7386i = -1;
    public int j = -1;
    public int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7388n = -1;
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
            if (!this.f7383c && ttmlStyle.f7383c) {
                this.f7382b = ttmlStyle.f7382b;
                this.f7383c = true;
            }
            if (this.f7385h == -1) {
                this.f7385h = ttmlStyle.f7385h;
            }
            if (this.f7386i == -1) {
                this.f7386i = ttmlStyle.f7386i;
            }
            if (this.f7381a == null && (str = ttmlStyle.f7381a) != null) {
                this.f7381a = str;
            }
            if (this.f == -1) {
                this.f = ttmlStyle.f;
            }
            if (this.g == -1) {
                this.g = ttmlStyle.g;
            }
            if (this.f7388n == -1) {
                this.f7388n = ttmlStyle.f7388n;
            }
            if (this.o == null && (alignment2 = ttmlStyle.o) != null) {
                this.o = alignment2;
            }
            if (this.f7389p == null && (alignment = ttmlStyle.f7389p) != null) {
                this.f7389p = alignment;
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
            if (!this.f7384e && ttmlStyle.f7384e) {
                this.d = ttmlStyle.d;
                this.f7384e = true;
            }
            if (this.m != -1 || (i2 = ttmlStyle.m) == -1) {
                return;
            }
            this.m = i2;
        }
    }
}
