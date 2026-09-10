package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclw implements zzijg {
    private zzclw(zzcli zzcliVar) {
    }

    public static zzclw zza(zzcli zzcliVar) {
        return new zzclw(zzcliVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
