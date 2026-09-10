package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzav implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11053a;

    public zzav(zzaw zzawVar, Context context) {
        this.f11053a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzZ(this.f11053a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
