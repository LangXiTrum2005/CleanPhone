package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x20 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsResult f21716b;

    public /* synthetic */ x20(JsResult jsResult, int i10) {
        this.f21715a = i10;
        this.f21716b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f21715a) {
            case 0:
                this.f21716b.cancel();
                break;
            default:
                this.f21716b.confirm();
                break;
        }
    }
}
