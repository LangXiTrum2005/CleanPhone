package be;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class h1 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) {
        return new AtomicBoolean(aVar.x());
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        bVar.C(((AtomicBoolean) obj).get());
    }
}
