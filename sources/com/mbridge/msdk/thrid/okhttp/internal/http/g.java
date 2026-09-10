package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<t> f36345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.g f36346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f36347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.c f36348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f36349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f36350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f36351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f36352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f36353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f36354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f36355k;
    private int l;

    public g(List<t> list, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2, int i10, y yVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, int i11, int i12, int i13) {
        this.f36345a = list;
        this.f36348d = cVar2;
        this.f36346b = gVar;
        this.f36347c = cVar;
        this.f36349e = i10;
        this.f36350f = yVar;
        this.f36351g = dVar;
        this.f36352h = oVar;
        this.f36353i = i11;
        this.f36354j = i12;
        this.f36355k = i13;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int a() {
        return this.f36353i;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int b() {
        return this.f36354j;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int c() {
        return this.f36355k;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public y d() {
        return this.f36350f;
    }

    public com.mbridge.msdk.thrid.okhttp.d e() {
        return this.f36351g;
    }

    public com.mbridge.msdk.thrid.okhttp.h f() {
        return this.f36348d;
    }

    public o g() {
        return this.f36352h;
    }

    public c h() {
        return this.f36347c;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.g i() {
        return this.f36346b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public a0 a(y yVar) throws IOException {
        return a(yVar, this.f36346b, this.f36347c, this.f36348d);
    }

    public a0 a(y yVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2) throws IOException {
        if (this.f36349e < this.f36345a.size()) {
            this.l++;
            if (this.f36347c != null && !this.f36348d.a(yVar.g())) {
                throw new IllegalStateException("network interceptor " + this.f36345a.get(this.f36349e - 1) + " must retain the same host and port");
            }
            if (this.f36347c != null && this.l > 1) {
                throw new IllegalStateException("network interceptor " + this.f36345a.get(this.f36349e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.f36345a, gVar, cVar, cVar2, this.f36349e + 1, yVar, this.f36351g, this.f36352h, this.f36353i, this.f36354j, this.f36355k);
            t tVar = this.f36345a.get(this.f36349e);
            a0 a0VarA = tVar.a(gVar2);
            if (cVar != null && this.f36349e + 1 < this.f36345a.size() && gVar2.l != 1) {
                throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
            }
            if (a0VarA != null) {
                if (a0VarA.d() != null) {
                    return a0VarA;
                }
                throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        throw new AssertionError();
    }
}
