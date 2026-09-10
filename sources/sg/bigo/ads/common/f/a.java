package sg.bigo.ads.common.f;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f47136e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f47137a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f47138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f47139c;
    public InterfaceC0837a d;

    /* JADX INFO: renamed from: sg.bigo.ads.common.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC0837a {
        void a(long j, long j2);

        void a(boolean z2, long j, long j2, long j3);
    }

    private a() {
        b();
    }

    public static a a() {
        return f47136e;
    }

    public final void b() {
        this.f47138b = SystemClock.elapsedRealtime();
        this.f47139c = System.currentTimeMillis();
    }

    public final boolean c() {
        return this.f47138b > 0;
    }
}
