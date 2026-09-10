package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzaw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11057d;

    public zzaw(zzax zzaxVar, Context context, String str, boolean z10, boolean z11) {
        this.f11054a = context;
        this.f11055b = str;
        this.f11056c = z10;
        this.f11057d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.f11054a;
        AlertDialog.Builder builderZzN = zzs.zzN(context);
        builderZzN.setMessage(this.f11055b);
        if (this.f11056c) {
            builderZzN.setTitle("Error");
        } else {
            builderZzN.setTitle("Info");
        }
        if (this.f11057d) {
            builderZzN.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzN.setPositiveButton("Learn More", new zzav(this, context));
            builderZzN.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzN.create().show();
    }
}
