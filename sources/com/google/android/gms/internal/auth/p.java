package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile v f22888a = u.f22908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f22889b = new Object();

    public static boolean a(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (f22888a.g()) {
            return ((Boolean) f22888a.d()).booleanValue();
        }
        synchronized (f22889b) {
            try {
                if (f22888a.g()) {
                    return ((Boolean) f22888a.d()).booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0) {
                            z10 = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                f22888a = new w(Boolean.valueOf(z10));
                return ((Boolean) f22888a.d()).booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
