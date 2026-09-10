package xn;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f54081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f54082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f54085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f54086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f54087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f54088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f54089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f54090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f54091k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bo.e f54092m;

    public w(s request, r protocol, String message, int i10, k kVar, l lVar, y yVar, w wVar, w wVar2, w wVar3, long j10, long j11, bo.e eVar) {
        kotlin.jvm.internal.n.f(request, "request");
        kotlin.jvm.internal.n.f(protocol, "protocol");
        kotlin.jvm.internal.n.f(message, "message");
        this.f54081a = request;
        this.f54082b = protocol;
        this.f54083c = message;
        this.f54084d = i10;
        this.f54085e = kVar;
        this.f54086f = lVar;
        this.f54087g = yVar;
        this.f54088h = wVar;
        this.f54089i = wVar2;
        this.f54090j = wVar3;
        this.f54091k = j10;
        this.l = j11;
        this.f54092m = eVar;
    }

    public static String a(String str, w wVar) {
        wVar.getClass();
        String strB = wVar.f54086f.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y yVar = this.f54087g;
        if (yVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        yVar.close();
    }

    public final v d() {
        v vVar = new v();
        vVar.f54069a = this.f54081a;
        vVar.f54070b = this.f54082b;
        vVar.f54071c = this.f54084d;
        vVar.f54072d = this.f54083c;
        vVar.f54073e = this.f54085e;
        vVar.f54074f = this.f54086f.m();
        vVar.f54075g = this.f54087g;
        vVar.f54076h = this.f54088h;
        vVar.f54077i = this.f54089i;
        vVar.f54078j = this.f54090j;
        vVar.f54079k = this.f54091k;
        vVar.l = this.l;
        vVar.f54080m = this.f54092m;
        return vVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f54082b + ", code=" + this.f54084d + ", message=" + this.f54083c + ", url=" + this.f54081a.f54060a + '}';
    }
}
