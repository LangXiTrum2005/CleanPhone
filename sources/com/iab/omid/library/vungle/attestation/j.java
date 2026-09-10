package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class j implements k {
    private static volatile j d;
    private volatile Boolean a;
    private volatile Boolean b;
    private final Context c;

    private j(Context context) {
        this.c = context;
        c();
    }

    public static j a(Context context) {
        if (d == null) {
            synchronized (j.class) {
                try {
                    if (d == null) {
                        d = new j(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public boolean b() {
        boolean zHasSystemFeature;
        if (this.b != null) {
            return this.b.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    if (c()) {
                        try {
                            PackageManager packageManager = this.c.getPackageManager();
                            if (packageManager == null) {
                                com.iab.omid.library.vungle.utils.d.b("PackageManager is null when checking attestation capability");
                                this.b = Boolean.FALSE;
                            } else {
                                zHasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                this.b = Boolean.valueOf(zHasSystemFeature);
                            }
                        } catch (SecurityException e) {
                            com.iab.omid.library.vungle.utils.d.a("Security exception when checking attestation capability", e);
                            this.b = Boolean.FALSE;
                            return false;
                        } catch (Exception e2) {
                            com.iab.omid.library.vungle.utils.d.a("Unexpected error when checking attestation capability", e2);
                            this.b = Boolean.FALSE;
                            return false;
                        }
                    } else {
                        this.b = Boolean.FALSE;
                    }
                    return false;
                }
                zHasSystemFeature = this.b.booleanValue();
                return zHasSystemFeature;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c() {
        boolean zBooleanValue;
        int i;
        if (this.a != null) {
            return this.a.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.a != null) {
                    zBooleanValue = this.a.booleanValue();
                } else {
                    zBooleanValue = this.c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i = Build.VERSION.SDK_INT) >= 25 && i <= 30;
                    this.a = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // com.iab.omid.library.vungle.attestation.k
    public boolean a() {
        return c();
    }
}
