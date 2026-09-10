package sg.bigo.ads.common.x;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f47741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0857a f47742b = new C0857a();

        /* JADX INFO: renamed from: sg.bigo.ads.common.x.c$a$a, reason: collision with other inner class name */
        public static class C0857a {
            public static void a(SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        public static a a() {
            if (f47741a == null) {
                f47741a = new a();
            }
            return f47741a;
        }
    }
}
