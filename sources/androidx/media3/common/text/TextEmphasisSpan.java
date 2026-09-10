package androidx.media3.common.text;

import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class TextEmphasisSpan implements LanguageFeatureSpan {
    public static final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f5622e;
    public static final String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5625c;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MarkFill {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MarkShape {
    }

    static {
        int i2 = Util.f5683a;
        d = Integer.toString(0, 36);
        f5622e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public TextEmphasisSpan(int i2, int i3, int i4) {
        this.f5623a = i2;
        this.f5624b = i3;
        this.f5625c = i4;
    }
}
