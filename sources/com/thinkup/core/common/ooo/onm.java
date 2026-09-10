package com.thinkup.core.common.ooo;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class onm {
    public static void m(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        try {
            com.thinkup.core.common.o0m.m.o().o(context, str).o(str2, str3);
        } catch (Throwable unused) {
        }
    }

    public static String n(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return (String) com.thinkup.core.common.o0m.m.o().o(context, str).m(str2, str3);
        } catch (Throwable unused) {
            return str3;
        }
    }

    public static void o(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            com.thinkup.core.common.o0m.m.o().o(context, str).m();
        } catch (Throwable unused) {
        }
    }

    public static long m(Context context, String str, String str2, long j) {
        if (context != null) {
            try {
                Long l2 = (Long) com.thinkup.core.common.o0m.m.o().o(context, str).m(str2, Long.valueOf(j));
                if (l2 != null) {
                    return l2.longValue();
                }
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public static boolean n(Context context, String str, String str2) {
        if (context == null) {
            return true;
        }
        try {
            Boolean bool = (Boolean) com.thinkup.core.common.o0m.m.o().o(context, str).m(str2, Boolean.TRUE);
            if (bool != null) {
                return bool.booleanValue();
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public static void o(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            com.thinkup.core.common.o0m.m.o().o(context, str).m(str2);
        } catch (Throwable unused) {
        }
    }

    public static void o(Context context, String str, String str2, long j) {
        if (context == null) {
            return;
        }
        try {
            com.thinkup.core.common.o0m.m.o().o(context, str).o(str2, Long.valueOf(j));
        } catch (Throwable unused) {
        }
    }

    public static int m(Context context, String str, String str2, int i2) {
        if (context != null) {
            try {
                return ((Integer) com.thinkup.core.common.o0m.m.o().o(context, str).m(str2, Integer.valueOf(i2))).intValue();
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    public static com.thinkup.core.common.o0m.o n(Context context, String str) {
        return com.thinkup.core.common.o0m.m.o().o(context, str);
    }

    public static void o(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        try {
            com.thinkup.core.common.o0m.m.o().o(context, str).o(str2, str3, 2);
        } catch (Throwable unused) {
        }
    }

    public static Map<String, ?> m(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            Map<String, ?> mapO = com.thinkup.core.common.o0m.m.o().o(context, str).o();
            return mapO != null ? mapO : new HashMap();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void o(Context context, String str, String str2, int i2) {
        if (context == null) {
            return;
        }
        try {
            com.thinkup.core.common.o0m.m.o().o(context, str).o(str2, Integer.valueOf(i2));
        } catch (Throwable unused) {
        }
    }

    public static void m(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            com.thinkup.core.common.o0m.m.o().o(context, str).o(str2, Boolean.FALSE);
        } catch (Throwable unused) {
        }
    }
}
