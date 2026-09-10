package com.startapp.sdk.internal;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f40823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.adinformation.a f40824b;

    public b0(com.startapp.sdk.adsbase.adinformation.a aVar, q qVar) {
        this.f40824b = aVar;
        this.f40823a = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = this.f40823a;
        com.startapp.sdk.adsbase.adinformation.a aVar = this.f40824b;
        qVar.a(aVar.f40610e, aVar.f);
    }
}
