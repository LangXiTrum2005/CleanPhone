package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yl0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22303d;

    public /* synthetic */ yl0(zl0 zl0Var, Activity activity, zzm zzmVar, int i10) {
        this.f22300a = i10;
        this.f22301b = zl0Var;
        this.f22302c = activity;
        this.f22303d = zzmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f22300a) {
            case 0:
                zl0 zl0Var = (zl0) this.f22301b;
                Activity activity = (Activity) this.f22302c;
                zzm zzmVar = (zzm) this.f22303d;
                zl0Var.D1(zl0Var.f22657g, "rtsdc", com.applovin.impl.ca.n("dialog_action", "confirm"));
                activity.startActivity(zzt.zzf().zzg(activity));
                zl0Var.B1();
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
            case 1:
                zl0 zl0Var2 = (zl0) this.f22301b;
                Activity activity2 = (Activity) this.f22302c;
                zzm zzmVar2 = (zzm) this.f22303d;
                zl0Var2.getClass();
                HashMap map = new HashMap();
                map.put("dialog_action", "confirm");
                zl0Var2.D1(zl0Var2.f22657g, "dialog_click", map);
                zl0Var2.A1(activity2, zzmVar2);
                break;
            default:
                mv mvVar = (mv) this.f22303d;
                DownloadManager downloadManager = (DownloadManager) mvVar.f17551d.getSystemService("download");
                try {
                    String str = (String) this.f22301b;
                    String str2 = (String) this.f22302c;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    zzt.zzc();
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                } catch (IllegalStateException unused) {
                    mvVar.i("Could not store picture.");
                }
                break;
        }
    }

    public yl0(mv mvVar, String str, String str2) {
        this.f22300a = 2;
        this.f22301b = str;
        this.f22302c = str2;
        this.f22303d = mvVar;
    }
}
