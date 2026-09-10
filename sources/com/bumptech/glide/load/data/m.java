package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.dm0;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm0 f10538a;

    public m(dm0 dm0Var) {
        this.f10538a = dm0Var;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        return new i((InputStream) obj, this.f10538a);
    }
}
