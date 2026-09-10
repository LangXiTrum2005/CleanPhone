package com.smartdigimkt.n8;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class p {
    public static void a(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            com.smartdigimkt.g8.c.a().a(context, str).clear();
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context, String str, String str2, long j) {
        if (context == null) {
            return;
        }
        try {
            com.smartdigimkt.g8.c.a().a(context, str).a(str2, Long.valueOf(j));
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        try {
            com.smartdigimkt.g8.c.a().a(context, str).a(str2, str3, 2);
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            com.smartdigimkt.g8.c.a().a(context, str).remove(str2);
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        try {
            com.smartdigimkt.g8.c.a().a(context, str).a(str2, str3);
        } catch (Throwable unused) {
        }
    }

    public static com.smartdigimkt.g8.a c(Context context, String str) {
        return com.smartdigimkt.g8.c.a().a(context, str);
    }

    public static long a(Context context, String str, String str2, long j) {
        if (context != null) {
            try {
                Long l2 = (Long) com.smartdigimkt.g8.c.a().a(context, str).b(str2, Long.valueOf(j));
                if (l2 != null) {
                    return l2.longValue();
                }
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public static void b(Context context, String str, String str2, int i2) {
        if (context == null) {
            return;
        }
        try {
            com.smartdigimkt.g8.c.a().a(context, str).a(str2, Integer.valueOf(i2));
        } catch (Throwable unused) {
        }
    }

    public static Map<String, ?> b(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            Map<String, ?> all = com.smartdigimkt.g8.c.a().a(context, str).getAll();
            return all != null ? all : new HashMap();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int a(Context context, String str, String str2, int i2) {
        if (context != null) {
            try {
                return ((Integer) com.smartdigimkt.g8.c.a().a(context, str).b(str2, Integer.valueOf(i2))).intValue();
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    public static String a(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return (String) com.smartdigimkt.g8.c.a().a(context, str).b(str2, str3);
        } catch (Throwable unused) {
            return str3;
        }
    }

    public static void b(Context context, String str, String str2, boolean z2) {
        if (context == null) {
            return;
        }
        try {
            com.smartdigimkt.g8.c.a().a(context, str).a(str2, Boolean.valueOf(z2));
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context, String str, String str2, boolean z2) {
        if (context != null) {
            try {
                Boolean bool = (Boolean) com.smartdigimkt.g8.c.a().a(context, str).b(str2, Boolean.valueOf(z2));
                if (bool != null) {
                    return bool.booleanValue();
                }
            } catch (Throwable unused) {
            }
        }
        return z2;
    }
}
