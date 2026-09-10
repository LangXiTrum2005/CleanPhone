package babyless;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: YoloCacheStorage.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static beachfront f14817attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static attabal f14818saneness;

    public beachfront(Context context) {
        if (context == null) {
            throw new IllegalStateException(" context is null");
        }
        try {
            if (f14818saneness == null) {
                f14818saneness = new wireman(new saneness(context));
            }
            dibatag.attabal.wireman(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static <T> boolean apical(String str, T t) {
        return formularize(str, t, false);
    }

    public static <T> void attabal(String str, T t, dialectally.attabal<Boolean> attabalVar) {
        saneness(str, t, false, attabalVar);
    }

    public static <T> T beachfront(String str, T t, Class cls) {
        attabal attabalVar = f14818saneness;
        return attabalVar == null ? t : (T) attabalVar.saneness(str, t, cls);
    }

    public static int competently(String str, int i) {
        Integer num = (Integer) wireman(str, Integer.class);
        return num == null ? i : num.intValue();
    }

    public static beachfront cutely(Context context) {
        if (f14817attabal == null) {
            synchronized (beachfront.class) {
                try {
                    if (f14817attabal == null) {
                        f14817attabal = new beachfront(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14817attabal;
    }

    public static boolean dern(String str) {
        attabal attabalVar = f14818saneness;
        if (attabalVar == null) {
            return false;
        }
        return attabalVar.attabal(str);
    }

    public static <T> boolean formularize(String str, T t, boolean z) {
        attabal attabalVar = f14818saneness;
        if (attabalVar == null) {
            return false;
        }
        return attabalVar.wireman(str, t, z);
    }

    public static long impromptu(String str, long j) {
        Long l = (Long) wireman(str, Long.class);
        return l == null ? j : l.longValue();
    }

    public static boolean marial(String str, boolean z) {
        Boolean bool = (Boolean) wireman(str, Boolean.class);
        return bool == null ? z : bool.booleanValue();
    }

    public static <T> void saneness(String str, T t, boolean z, dialectally.attabal<Boolean> attabalVar) {
        attabal attabalVar2 = f14818saneness;
        if (attabalVar2 != null) {
            attabalVar2.dern(str, t, z, attabalVar);
        } else if (attabalVar != null) {
            attabalVar.attabal(Boolean.FALSE);
        }
    }

    public static String taiyuan(String str, String str2) {
        String str3 = (String) wireman(str, String.class);
        return (TextUtils.isEmpty(str3) || "null".equals(str3)) ? str2 : str3;
    }

    public static <T> T wireman(String str, Class cls) {
        attabal attabalVar = f14818saneness;
        if (attabalVar == null) {
            return null;
        }
        return (T) attabalVar.marial(str, cls);
    }
}
