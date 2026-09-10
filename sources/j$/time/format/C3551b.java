package j$.time.format;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: j$.time.format.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3551b extends C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ B f43089e;

    C3551b(B b2) {
        this.f43089e = b2;
    }

    @Override // j$.time.format.C
    public final String e(j$.time.chrono.m mVar, j$.time.temporal.r rVar, long j, H h2, Locale locale) {
        return this.f43089e.a(j, h2);
    }

    @Override // j$.time.format.C
    public final String f(j$.time.temporal.r rVar, long j, H h2, Locale locale) {
        return this.f43089e.a(j, h2);
    }

    @Override // j$.time.format.C
    public final Iterator g(j$.time.chrono.m mVar, j$.time.temporal.r rVar, H h2, Locale locale) {
        return this.f43089e.b(h2);
    }

    @Override // j$.time.format.C
    public final Iterator h(j$.time.temporal.r rVar, H h2, Locale locale) {
        return this.f43089e.b(h2);
    }
}
