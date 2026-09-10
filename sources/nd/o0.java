package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void d(List list) {
        copyOnWrite();
        r0.n((r0) this.instance, list);
    }

    public final void h(ArrayList arrayList) {
        copyOnWrite();
        r0.k((r0) this.instance, arrayList);
    }

    public final void i(k0 k0Var) {
        copyOnWrite();
        r0.m((r0) this.instance, k0Var);
    }

    public final void j(r0 r0Var) {
        copyOnWrite();
        r0.j((r0) this.instance, r0Var);
    }

    public final void k(HashMap map) {
        copyOnWrite();
        r0.i((r0) this.instance).putAll(map);
    }

    public final void l(Map map) {
        copyOnWrite();
        r0.l((r0) this.instance).putAll(map);
    }

    public final void m(long j10, String str) {
        str.getClass();
        copyOnWrite();
        r0.i((r0) this.instance).put(str, Long.valueOf(j10));
    }

    public final void n(String str) {
        copyOnWrite();
        r0.l((r0) this.instance).put("systemDeterminedForeground", str);
    }

    public final void o(long j10) {
        copyOnWrite();
        r0.o((r0) this.instance, j10);
    }

    public final void p(long j10) {
        copyOnWrite();
        r0.p((r0) this.instance, j10);
    }

    public final void q(String str) {
        copyOnWrite();
        r0.h((r0) this.instance, str);
    }
}
