package com.thinkup.core.common.ooo;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class no {
    public static boolean m = false;
    private static boolean m0 = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f42335n = false;
    public static boolean o = false;
    private static boolean o0 = false;
    private static boolean om = false;
    private static boolean on = false;
    private static boolean oo = false;

    private no() {
    }

    private static void m(String str, String str2) {
        if (o0) {
            Log.d(str, str2);
        }
    }

    private static void n(String str, String str2) {
        if (oo) {
            Log.i(str, str2);
        }
    }

    private static void o(String str, String str2) {
        if (f42335n) {
            Log.v(str, str2);
        }
    }

    private static void o0(String str, String str2) {
        if (om) {
            Log.w(str, str2);
        }
    }

    private static void om(String str, String str2) {
        if (oo) {
            int length = 2001 - str.length();
            while (str2.length() > length) {
                Log.d(str, str2.substring(0, length));
                str2 = str2.substring(length);
            }
            Log.d(str, str2);
        }
    }

    private static void oo(String str, String str2) {
        if (on) {
            Log.e(str, str2);
        }
    }

    private static void m(String str, String str2, Throwable th) {
        if (o0) {
            Log.d(str, str2, th);
        }
    }

    private static void n(String str, String str2, Throwable th) {
        if (oo) {
            Log.i(str, str2, th);
        }
    }

    private static void o(String str, String str2, Throwable th) {
        if (f42335n) {
            Log.v(str, str2, th);
        }
    }

    private static void o0(String str, String str2, Throwable th) {
        if (om) {
            Log.w(str, str2, th);
        }
    }

    private static void oo(String str, String str2, Throwable th) {
        if (on) {
            Log.e(str, str2, th);
        }
    }

    private static void m(String str, String str2, Object... objArr) {
        if (o0) {
            try {
                Log.i(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void n(String str, String str2, Object... objArr) {
        if (o0) {
            try {
                Log.w(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void o(String str, Throwable th) {
        if (om) {
            Log.w(str, th);
        }
    }

    private static void o0(String str, String str2, Object... objArr) {
        if (on) {
            try {
                Log.e(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void o(String str, String str2, Object... objArr) {
        if (o0) {
            try {
                Log.d(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
