package eo;

import bo.k;
import java.io.IOException;
import kotlin.jvm.internal.n;
import lo.i;
import lo.t;
import lo.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f40179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f40181c;

    public a(g gVar) {
        this.f40181c = gVar;
        this.f40179a = new i(((lo.g) gVar.f40199e).timeout());
    }

    public final void d() {
        g gVar = this.f40181c;
        int i10 = gVar.f40196b;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException("state: " + gVar.f40196b);
        }
        i iVar = this.f40179a;
        v vVar = iVar.f45642e;
        iVar.f45642e = v.f45672d;
        vVar.a();
        vVar.b();
        gVar.f40196b = 6;
    }

    @Override // lo.t
    public long l(long j10, lo.e sink) throws IOException {
        g gVar = this.f40181c;
        n.f(sink, "sink");
        try {
            return ((lo.g) gVar.f40199e).l(j10, sink);
        } catch (IOException e10) {
            ((k) gVar.f40198d).k();
            d();
            throw e10;
        }
    }

    @Override // lo.t
    public final v timeout() {
        return this.f40179a;
    }
}
