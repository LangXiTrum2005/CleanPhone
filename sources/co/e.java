package co;

import bo.k;
import lo.r;
import lo.t;
import xn.s;
import xn.v;
import xn.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface e {
    t a(w wVar);

    r b(s sVar, long j10);

    long c(w wVar);

    void cancel();

    void d(s sVar);

    void finishRequest();

    void flushRequest();

    k getConnection();

    v readResponseHeaders(boolean z10);
}
