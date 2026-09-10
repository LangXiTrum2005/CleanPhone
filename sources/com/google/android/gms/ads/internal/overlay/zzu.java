package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.am;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageButton f10956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzah f10957b;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzu(android.content.Context r6, com.google.android.gms.ads.internal.overlay.zzt r7, @androidx.annotation.Nullable com.google.android.gms.ads.internal.overlay.zzah r8) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzu.<init>(android.content.Context, com.google.android.gms.ads.internal.overlay.zzt, com.google.android.gms.ads.internal.overlay.zzah):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzah zzahVar = this.f10957b;
        if (zzahVar != null) {
            zzahVar.zzd();
        }
    }

    public final void zza(boolean z10) {
        ImageButton imageButton = this.f10956a;
        if (!z10) {
            imageButton.setVisibility(0);
            return;
        }
        imageButton.setVisibility(8);
        if (((Long) zzba.zzc().a(am.T1)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }
}
