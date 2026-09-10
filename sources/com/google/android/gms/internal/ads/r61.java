package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r61 implements p61, b31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a71 f19437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fe1 f19438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h21 f19439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f19440e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ListenableFuture f19441f = be1.f12743b;

    public r61(Context context, h21 h21Var, a71 a71Var, fe1 fe1Var) {
        this.f19436a = context;
        this.f19437b = a71Var;
        this.f19438c = fe1Var;
        this.f19439d = h21Var;
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void a(HashMap map, Context context, View view) {
        map.put("gs", this.f19441f);
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void b(HashMap map) {
        map.put("gs", this.f19441f);
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void c(HashMap map) {
        map.put("gs", this.f19441f);
    }

    @Override // com.google.android.gms.internal.ads.b31
    public final ListenableFuture zza() {
        if (this.f19440e.getAndSet(true) || !this.f19439d.R()) {
            return be1.f12743b;
        }
        return ((k00) this.f19438c).a(new ry0(this, 7));
    }
}
