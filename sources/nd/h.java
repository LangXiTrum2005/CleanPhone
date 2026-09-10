package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final boolean i() {
        return ((j) this.instance).p();
    }

    public final void j(Map map) {
        copyOnWrite();
        j.j((j) this.instance).putAll(map);
    }

    public final void k(b bVar) {
        copyOnWrite();
        j.l((j) this.instance, (c) bVar.build());
    }

    public final void l(String str) {
        copyOnWrite();
        j.k((j) this.instance, str);
    }

    public final void m(l lVar) {
        copyOnWrite();
        j.i((j) this.instance, lVar);
    }

    public final void n(String str) {
        copyOnWrite();
        j.h((j) this.instance, str);
    }
}
