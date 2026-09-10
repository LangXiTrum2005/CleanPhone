package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.ads.z40;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pf implements ta.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z40 f23862b;

    public /* synthetic */ pf(z40 z40Var, int i10) {
        this.f23861a = i10;
        this.f23862b = z40Var;
    }

    @Override // ta.z
    public final ListenableFuture apply(Object obj) throws IOException {
        ListenableFuture listenableFuture;
        int i10 = this.f23861a;
        z40 z40Var = this.f23862b;
        switch (i10) {
            case 0:
                synchronized (z40Var.f22498h) {
                    listenableFuture = (ListenableFuture) z40Var.f22500j;
                    break;
                }
                return listenableFuture;
            case 1:
                return ta.k0.d(z40Var.d((Uri) ta.k0.b((ListenableFuture) z40Var.f22492b)));
            case 2:
                z40Var.e((Uri) ta.k0.b((ListenableFuture) z40Var.f22492b), obj);
                return ta.n0.f50627b;
            default:
                Uri uri = (Uri) obj;
                Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    te teVar = (te) z40Var.f22495e;
                    re reVarB = teVar.b(uriBuild);
                    if (reVarB.f23935a.b(reVarB.f23938d)) {
                        re reVarB2 = teVar.b(uriBuild);
                        re reVarB3 = teVar.b(uri);
                        jf jfVar = reVarB2.f23935a;
                        if (jfVar != reVarB3.f23935a) {
                            throw new b2.z("Cannot rename file across backends");
                        }
                        jfVar.f(reVarB2.f23938d, reVarB3.f23938d);
                    }
                    return ta.n0.f50627b;
                } catch (IOException e10) {
                    return ta.k0.c(e10);
                }
        }
    }
}
