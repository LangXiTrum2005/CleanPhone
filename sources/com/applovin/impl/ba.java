package com.applovin.impl;

import android.content.DialogInterface;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7607b;

    public /* synthetic */ ba(Object obj, int i10) {
        this.f7606a = i10;
        this.f7607b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f7606a;
        Object obj = this.f7607b;
        switch (i11) {
            case 0:
                ((r3) obj).a(dialogInterface, i10);
                break;
            default:
                v0.b((Uri) obj, dialogInterface, i10);
                break;
        }
    }
}
