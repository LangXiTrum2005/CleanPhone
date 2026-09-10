package com.applovin.impl;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c9 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7669b;

    public /* synthetic */ c9(Object obj, int i10) {
        this.f7668a = i10;
        this.f7669b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f7668a;
        Object obj = this.f7669b;
        switch (i10) {
            case 0:
                ((f1) obj).a(view);
                break;
            case 1:
                ((p1) obj).a(view);
                break;
            default:
                ((y1) obj).a(view);
                break;
        }
    }
}
