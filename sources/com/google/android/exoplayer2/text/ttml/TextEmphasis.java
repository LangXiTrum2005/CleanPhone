package com.google.android.exoplayer2.text.ttml;

import com.google.common.collect.ImmutableSet;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class TextEmphasis {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f18590b = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImmutableSet f18591c = ImmutableSet.t(2, "auto", "none");
    public static final ImmutableSet d = ImmutableSet.A("dot", "sesame", "circle");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableSet f18592e = ImmutableSet.t(2, "filled", MRAIDPresenter.OPEN);
    public static final ImmutableSet f = ImmutableSet.A("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18593a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public TextEmphasis(int i2, int i3, int i4) {
        this.f18593a = i2;
    }
}
