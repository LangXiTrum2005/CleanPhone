package com.unity3d.ads.core.data.datasource;

import ak.f;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Lwj/r;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AndroidFIdDataSource$invoke$1$1$1$1 extends o implements b {
    final /* synthetic */ f $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1$1$1(f fVar) {
        super(1);
        this.$cont = fVar;
    }

    @Override // jk.b
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r.f53297a;
    }

    public final void invoke(String str) {
        this.$cont.resumeWith(str);
    }
}
