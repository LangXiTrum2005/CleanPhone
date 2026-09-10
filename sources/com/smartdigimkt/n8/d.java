package com.smartdigimkt.n8;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f37176a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f37177b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f37178c = false;
    private static boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f37179e = false;
    public static boolean f = false;
    public static boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f37180h = false;

    private d() {
    }

    public static void a(com.smartdigimkt.y4.c cVar, String str) {
    }

    public static void b(String str, String str2) {
        if (f37179e) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f37178c) {
            Log.i(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f37176a) {
            Log.v(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (f37176a) {
            Log.v(str, str2);
        }
    }

    public static void f(String str, String str2) {
        if (d) {
            Log.w(str, str2);
        }
    }

    public static void a(String str, String str2) {
        if (f37177b) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (f37179e) {
            Log.e(str, str2, th);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (f37178c) {
            Log.i(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        if (f37178c) {
            int length = 2001 - str.length();
            while (str2.length() > length) {
                Log.d(str, str2.substring(0, length));
                str2 = str2.substring(length);
            }
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (d) {
            Log.w(str, str2, th);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (f37177b) {
            Log.d(str, str2, th);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (f37179e) {
            try {
                Log.e(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (f37177b) {
            try {
                Log.i(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str, Throwable th) {
        if (d) {
            Log.w(str, th);
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        if (f37177b) {
            try {
                Log.d(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (f37177b) {
            try {
                Log.w(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
