package androidx.media3.extractor.text.ttml;

import com.google.common.collect.ImmutableSet;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class TextEmphasis {
    public static final Pattern d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableSet f7352e = ImmutableSet.t(2, "auto", "none");
    public static final ImmutableSet f = ImmutableSet.A("dot", "sesame", "circle");
    public static final ImmutableSet g = ImmutableSet.t(2, "filled", MRAIDPresenter.OPEN);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ImmutableSet f7353h = ImmutableSet.A("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7356c;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public TextEmphasis(int i2, int i3, int i4) {
        this.f7354a = i2;
        this.f7355b = i3;
        this.f7356c = i4;
    }
}
