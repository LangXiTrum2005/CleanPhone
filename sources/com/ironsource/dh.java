package com.ironsource;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dh implements InterfaceC0259b4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ qk.w[] f28482c = {kotlin.jvm.internal.d0.f44761a.e(new kotlin.jvm.internal.r(dh.class, "activity", "getActivity()Landroid/app/Activity;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mk.b f28484b;

    public dh(Activity activity, Context context) {
        this.f28483a = context;
        this.f28484b = C0298d7.a(activity);
    }

    @Override // com.ironsource.InterfaceC0259b4
    public void a(Context context) {
        this.f28483a = context;
    }

    @Override // com.ironsource.InterfaceC0259b4
    public Context b() {
        return this.f28483a;
    }

    @Override // com.ironsource.InterfaceC0259b4
    public Activity a() {
        return (Activity) this.f28484b.getValue(this, f28482c[0]);
    }

    @Override // com.ironsource.InterfaceC0259b4
    public void a(Activity activity) {
        this.f28484b.setValue(this, f28482c[0], activity);
    }
}
