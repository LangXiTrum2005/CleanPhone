package com.smartdigimkt.n4;

import android.net.Uri;
import com.smartdigimkt.p4.f0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class v<T> implements t.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f37067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f37069c;
    private final a<? extends T> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile T f37070e;
    private volatile long f;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public v(h hVar, Uri uri, int i2, a<? extends T> aVar) {
        this(hVar, new k(uri, 3), i2, aVar);
    }

    public static <T> T a(h hVar, a<? extends T> aVar, Uri uri) throws IOException {
        v vVar = new v(hVar, uri, 0, aVar);
        vVar.a();
        return (T) vVar.d();
    }

    @Override // com.smartdigimkt.n4.t.c
    public final void b() {
    }

    public long c() {
        return this.f;
    }

    public final T d() {
        return this.f37070e;
    }

    public v(h hVar, k kVar, int i2, a<? extends T> aVar) {
        this.f37069c = hVar;
        this.f37067a = kVar;
        this.f37068b = i2;
        this.d = aVar;
    }

    @Override // com.smartdigimkt.n4.t.c
    public final void a() throws IOException {
        j jVar = new j(this.f37069c, this.f37067a);
        try {
            jVar.c();
            this.f37070e = this.d.a(this.f37069c.c(), jVar);
        } finally {
            this.f = jVar.a();
            f0.a((Closeable) jVar);
        }
    }
}
