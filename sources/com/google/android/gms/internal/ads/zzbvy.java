package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbvy implements DialogInterface.OnClickListener {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbwa zzc;

    public zzbvy(zzbwa zzbwaVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzbwaVar);
        this.zzc = zzbwaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        DownloadManager downloadManager = (DownloadManager) this.zzc.zzb().getSystemService(NativeAdPresenter.DOWNLOAD);
        try {
            String str = this.zza;
            String str2 = this.zzb;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzt.zzc();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzc.zzg("Could not store picture.");
        }
    }
}
