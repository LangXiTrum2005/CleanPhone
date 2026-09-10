package androidx.media3.common.text;

import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class RubySpan implements LanguageFeatureSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5619c;
    public static final String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5621b;

    static {
        int i2 = Util.f5683a;
        f5619c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public RubySpan(String str, int i2) {
        this.f5620a = str;
        this.f5621b = i2;
    }
}
