package com.google.android.gms.internal.auth;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f22827a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f22828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f22829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f22830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashMap f22831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f22832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f22833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f22834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f22835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Object f22836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f22837k;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f22828b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f22829c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        f22830d = new AtomicBoolean();
        f22832f = new HashMap(16, 1.0f);
        f22833g = new HashMap(16, 1.0f);
        f22834h = new HashMap(16, 1.0f);
        f22835i = new HashMap(16, 1.0f);
        f22837k = new String[0];
    }
}
