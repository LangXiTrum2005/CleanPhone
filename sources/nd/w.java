package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void d(List list) {
        copyOnWrite();
        c0.r((c0) this.instance, list);
    }

    public final String getUrl() {
        return ((c0) this.instance).getUrl();
    }

    public final void i() {
        copyOnWrite();
        c0.q((c0) this.instance).clear();
    }

    public final void j() {
        copyOnWrite();
        c0.l((c0) this.instance);
    }

    public final long k() {
        return ((c0) this.instance).E();
    }

    public final boolean l() {
        return ((c0) this.instance).F();
    }

    public final boolean m() {
        return ((c0) this.instance).H();
    }

    public final boolean n() {
        return ((c0) this.instance).L();
    }

    public final void o(ConcurrentHashMap concurrentHashMap) {
        copyOnWrite();
        c0.q((c0) this.instance).putAll(concurrentHashMap);
    }

    public final void p(long j10) {
        copyOnWrite();
        c0.m((c0) this.instance, j10);
    }

    public final void q(z zVar) {
        copyOnWrite();
        c0.s((c0) this.instance, zVar);
    }

    public final void r(int i10) {
        copyOnWrite();
        c0.j((c0) this.instance, i10);
    }

    public final void s() {
        copyOnWrite();
        c0.i((c0) this.instance);
    }

    public final void t(long j10) {
        copyOnWrite();
        c0.t((c0) this.instance, j10);
    }

    public final void u(String str) {
        copyOnWrite();
        c0.k((c0) this.instance, str);
    }

    public final void v(long j10) {
        copyOnWrite();
        c0.u((c0) this.instance, j10);
    }

    public final void w(long j10) {
        copyOnWrite();
        c0.n((c0) this.instance, j10);
    }

    public final void x(long j10) {
        copyOnWrite();
        c0.p((c0) this.instance, j10);
    }

    public final void y(long j10) {
        copyOnWrite();
        c0.o((c0) this.instance, j10);
    }

    public final void z(String str) {
        copyOnWrite();
        c0.h((c0) this.instance, str);
    }
}
