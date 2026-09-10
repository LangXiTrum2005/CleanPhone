package com.unity3d.ads.core.data.datasource;

import an.p;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "line", "Lwj/r;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AndroidUnityBootConfigDataSource$getValue$1$1$1 extends o implements b {
    final /* synthetic */ String $prefix;
    final /* synthetic */ c0 $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUnityBootConfigDataSource$getValue$1$1$1(String str, c0 c0Var) {
        super(1);
        this.$prefix = str;
        this.$value = c0Var;
    }

    @Override // jk.b
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r.f53297a;
    }

    public final void invoke(String line) {
        n.f(line, "line");
        if (p.p0(line, this.$prefix, false)) {
            c0 c0Var = this.$value;
            String strSubstring = line.substring(this.$prefix.length());
            n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            c0Var.f44760a = strSubstring;
        }
    }
}
