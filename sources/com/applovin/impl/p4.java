package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f8963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8967e;

    public p4(Activity activity) {
        this.f8963a = activity;
        int iD = q7.d(activity);
        this.f8965c = iD;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(activity);
        this.f8966d = zIsTablet;
        this.f8964b = a(iD, zIsTablet);
        this.f8967e = zIsTablet && 2 == a(activity);
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        int i10;
        if (!bVar.v0() || (i10 = this.f8964b) == -1) {
            a(bVar.W());
        } else {
            a(i10);
        }
    }

    private int a(int i10, boolean z10) {
        if (z10 && this.f8967e) {
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 1) {
                return 9;
            }
            if (i10 == 2) {
                return 8;
            }
            return i10 == 3 ? 1 : -1;
        }
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 9;
        }
        return i10 == 3 ? 8 : -1;
    }

    private void a(com.applovin.impl.sdk.ad.b.c cVar) {
        if (cVar == com.applovin.impl.sdk.ad.b.c.ACTIVITY_PORTRAIT) {
            if (this.f8966d && this.f8967e) {
                int i10 = this.f8965c;
                if (i10 != 1 && i10 != 3) {
                    a(1);
                    return;
                } else if (i10 == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i11 = this.f8965c;
            if (i11 != 0 && i11 != 2) {
                a(1);
                return;
            } else {
                a(i11 != 0 ? 9 : 1);
                return;
            }
        }
        if (cVar == com.applovin.impl.sdk.ad.b.c.ACTIVITY_LANDSCAPE) {
            if (this.f8966d && this.f8967e) {
                int i12 = this.f8965c;
                if (i12 != 0 && i12 != 2) {
                    a(0);
                    return;
                } else {
                    a(i12 != 2 ? 0 : 8);
                    return;
                }
            }
            int i13 = this.f8965c;
            if (i13 != 1 && i13 != 3) {
                a(0);
            } else {
                a(i13 == 1 ? 0 : 8);
            }
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = q7.f(context).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i10) {
        try {
            this.f8963a.setRequestedOrientation(i10);
        } catch (Throwable unused) {
        }
    }
}
