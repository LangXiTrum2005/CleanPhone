package com.unity3d.services.core.network.core;

import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.chromium.net.UrlRequest;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lwj/r;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CronetClient$execute$2$2 extends o implements b {
    final /* synthetic */ UrlRequest $req;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$execute$2$2(UrlRequest urlRequest) {
        super(1);
        this.$req = urlRequest;
    }

    @Override // jk.b
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r.f53297a;
    }

    public final void invoke(Throwable th2) {
        this.$req.cancel();
    }
}
