package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import com.ironsource.D1;
import com.unity3d.ads.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f24149a = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Account f24150b = ue.f24047a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f24151c = Collections.unmodifiableSet(new HashSet(Arrays.asList(BuildConfig.FLAVOR, "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f24152d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", D1.f25920e)));
}
