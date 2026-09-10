package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jv implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16197a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16198b;

    public /* synthetic */ jv(dh0 dh0Var) {
        this.f16198b = dh0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16197a) {
            case 0:
                ((kv) this.f16198b).m(true);
                break;
            default:
                ((dh0) this.f16198b).f13532j.zza();
                break;
        }
    }

    public jv(kv kvVar) {
        Objects.requireNonNull(kvVar);
        this.f16198b = kvVar;
    }
}
