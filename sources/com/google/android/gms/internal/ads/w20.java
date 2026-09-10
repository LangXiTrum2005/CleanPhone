package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import com.google.android.gms.ads.internal.overlay.zzm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w20 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21391b;

    public /* synthetic */ w20(Object obj, int i10) {
        this.f21390a = i10;
        this.f21391b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f21390a) {
            case 0:
                ((JsResult) this.f21391b).cancel();
                break;
            case 1:
                ((JsPromptResult) this.f21391b).cancel();
                break;
            default:
                zzm zzmVar = (zzm) this.f21391b;
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
        }
    }
}
