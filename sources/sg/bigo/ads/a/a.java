package sg.bigo.ads.a;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45341c;
    private final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f45342e;
    private final c f;
    private final b g;

    /* JADX INFO: renamed from: sg.bigo.ads.a.a$a, reason: collision with other inner class name */
    public static class C0778a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f45344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f45345c;
        private int d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f45346e = 0;
        private boolean f = true;
        private Bitmap g;

        public final a a() {
            return new a(this.f45343a, this.d, this.f45346e, this.f, this.g, this.f45344b, this.f45345c);
        }
    }

    public interface b {
        void a(Context context, String str, int i2, String str2);

        void a(String str, String str2, String str3);
    }

    public interface c {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public a(String str, int i2, int i3, boolean z2, Bitmap bitmap, c cVar, b bVar) {
        this.f45339a = str;
        this.f45340b = i2;
        this.f45341c = i3;
        this.d = z2;
        this.f45342e = bitmap;
        this.f = cVar;
        this.g = bVar;
    }

    public final void a(Context context) {
        sg.bigo.ads.a.c.a(context, this.f45339a, this.f45340b, this.f45341c, this.d, this.f45342e, this.f, this.g);
    }
}
