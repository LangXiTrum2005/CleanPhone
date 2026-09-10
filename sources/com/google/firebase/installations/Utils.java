package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class Utils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f20853b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f20854c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static Utils d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemClock f20855a;

    public Utils(SystemClock systemClock) {
        this.f20855a = systemClock;
    }

    public final boolean a(PersistedInstallationEntry persistedInstallationEntry) {
        if (TextUtils.isEmpty(persistedInstallationEntry.a())) {
            return true;
        }
        long jB = persistedInstallationEntry.b() + persistedInstallationEntry.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f20855a.getClass();
        return jB < timeUnit.toSeconds(System.currentTimeMillis()) + f20853b;
    }
}
