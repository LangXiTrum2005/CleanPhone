package com.ironsource;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3696pf implements InterfaceC3434b4 {
    private Activity a;
    private Context b;

    @Override // com.ironsource.InterfaceC3434b4
    public Activity a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC3434b4
    public Context b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3434b4
    public void a(Activity activity) {
        this.a = activity;
    }

    @Override // com.ironsource.InterfaceC3434b4
    public void a(Context context) {
        this.b = context;
    }
}
