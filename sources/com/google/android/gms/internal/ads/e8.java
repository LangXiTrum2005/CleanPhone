package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f13871a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f13872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f13874d;

    static {
        String str = uu0.f20901a;
        Locale locale = Locale.US;
        f13872b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f13873c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f13874d = Pattern.compile("\\\\an(\\d+)");
    }
}
