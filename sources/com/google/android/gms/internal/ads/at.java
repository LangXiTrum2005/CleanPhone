package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12505a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12506b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dt f12507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dt f12508d;

    public static final boolean c(Context context) {
        if (((Boolean) mn.f17487c.o()).booleanValue()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return zzs.zzk(context).zza().toLowerCase(Locale.ROOT).equals("ru");
    }

    public final dt a(Context context, VersionInfoParcel versionInfoParcel, kw0 kw0Var) {
        dt dtVar;
        String str;
        synchronized (this.f12506b) {
            try {
                if (this.f12508d == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (c(context)) {
                        str = (String) zzba.zzc().a(am.f12092c);
                    } else {
                        str = (String) ps1.f18797e.o();
                    }
                    this.f12508d = new dt(applicationContext, versionInfoParcel, str, kw0Var);
                }
                dtVar = this.f12508d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dtVar;
    }

    public final dt b(Context context, VersionInfoParcel versionInfoParcel, kw0 kw0Var) {
        dt dtVar;
        String str;
        synchronized (this.f12505a) {
            try {
                if (this.f12507c == null) {
                    if (c(context)) {
                        str = (String) zzba.zzc().a(am.f12092c);
                    } else if (((Boolean) mn.f17492h.o()).booleanValue()) {
                        str = (String) zzba.zzc().a(am.f12058a);
                    } else {
                        str = (String) zzba.zzc().a(am.f12075b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f12507c = new dt(context, versionInfoParcel, str, kw0Var);
                }
                dtVar = this.f12507c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dtVar;
    }
}
