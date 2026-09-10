package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void d(String str) {
        copyOnWrite();
        c.h((c) this.instance, str);
    }

    public final void i() {
        copyOnWrite();
        c.i((c) this.instance);
    }

    public final void j(String str) {
        copyOnWrite();
        c.j((c) this.instance, str);
    }
}
