package androidx.work;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LogcatLogger f8630a;

    public static class LogcatLogger extends Logger {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8631b;

        public LogcatLogger(int i2) {
            this.f8631b = i2;
        }

        @Override // androidx.work.Logger
        public final void a(String str, String str2, Throwable... thArr) {
            if (this.f8631b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // androidx.work.Logger
        public final void b(String str, String str2, Throwable... thArr) {
            if (this.f8631b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // androidx.work.Logger
        public final void d(String str, String str2, Throwable... thArr) {
            if (this.f8631b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // androidx.work.Logger
        public final void f(String str, String str2, Throwable... thArr) {
            if (this.f8631b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized Logger c() {
        try {
            if (f8630a == null) {
                f8630a = new LogcatLogger(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8630a;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}
