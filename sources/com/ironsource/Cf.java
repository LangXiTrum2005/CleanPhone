package com.ironsource;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Cf implements InterfaceC0259b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f25906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25907b;

    @Override // com.ironsource.InterfaceC0259b4
    public Activity a() {
        return this.f25906a;
    }

    @Override // com.ironsource.InterfaceC0259b4
    public Context b() {
        return this.f25907b;
    }

    @Override // com.ironsource.InterfaceC0259b4
    public void a(Activity activity) {
        this.f25906a = activity;
    }

    @Override // com.ironsource.InterfaceC0259b4
    public void a(Context context) {
        this.f25907b = context;
    }
}
