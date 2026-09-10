package com.smartdigimkt.x3;

import android.net.NetworkInfo;
import android.view.Surface;
import com.smartdigimkt.j4.f0;
import com.smartdigimkt.j4.s;
import com.smartdigimkt.j4.t;
import com.smartdigimkt.m4.g;
import com.smartdigimkt.w3.e0;
import com.smartdigimkt.w3.m;
import com.smartdigimkt.w3.v;
import com.smartdigimkt.z3.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f39907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f39908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39909c;
        public final s.a d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f39910e;
        public final long f;
        public final long g;

        public a(long j, e0 e0Var, int i2, s.a aVar, long j2, long j3, long j4) {
            this.f39907a = j;
            this.f39908b = e0Var;
            this.f39909c = i2;
            this.d = aVar;
            this.f39910e = j2;
            this.f = j3;
            this.g = j4;
        }
    }

    void a(a aVar);

    void a(a aVar, int i2);

    void a(a aVar, int i2, int i3);

    void a(a aVar, int i2, int i3, int i4, float f);

    void a(a aVar, int i2, long j);

    void a(a aVar, int i2, long j, long j2);

    void a(a aVar, int i2, m mVar);

    void a(a aVar, int i2, d dVar);

    void a(a aVar, int i2, String str, long j);

    void a(a aVar, NetworkInfo networkInfo);

    void a(a aVar, Surface surface);

    void a(a aVar, com.smartdigimkt.e4.a aVar2);

    void a(a aVar, f0 f0Var, g gVar);

    void a(a aVar, t.b bVar, t.c cVar);

    void a(a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z2);

    void a(a aVar, t.c cVar);

    void a(a aVar, com.smartdigimkt.w3.g gVar);

    void a(a aVar, v vVar);

    void a(a aVar, Exception exc);

    void a(a aVar, boolean z2);

    void a(a aVar, boolean z2, int i2);

    void b(a aVar);

    void b(a aVar, int i2);

    void b(a aVar, int i2, long j, long j2);

    void b(a aVar, int i2, d dVar);

    void b(a aVar, t.b bVar, t.c cVar);

    void b(a aVar, t.c cVar);

    void b(a aVar, boolean z2);

    void c(a aVar);

    void c(a aVar, int i2);

    void c(a aVar, t.b bVar, t.c cVar);

    void d(a aVar);

    void d(a aVar, int i2);

    void e(a aVar);

    void f(a aVar);

    void g(a aVar);

    void h(a aVar);
}
