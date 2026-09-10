package decarock;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes.dex */
public final class triweekly {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static boolean f25144dern = true;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static int f25145saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Object f25143attabal = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static attabal f25146wireman = attabal.f25147attabal;

    /* JADX INFO: compiled from: Log.java */
    public interface attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f25147attabal = new C0585attabal();

        /* JADX INFO: renamed from: decarock.triweekly$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Log.java */
        public class C0585attabal implements attabal {
            @Override // decarock.triweekly.attabal
            public void attabal(String str, String str2, Throwable th) {
                triweekly.attabal(str2, th);
            }

            @Override // decarock.triweekly.attabal
            public void e(String str, String str2, Throwable th) {
                triweekly.attabal(str2, th);
            }

            @Override // decarock.triweekly.attabal
            public void saneness(String str, String str2, Throwable th) {
                triweekly.attabal(str2, th);
            }

            @Override // decarock.triweekly.attabal
            public void w(String str, String str2, Throwable th) {
                triweekly.attabal(str2, th);
            }
        }

        void attabal(String str, String str2, Throwable th);

        void e(String str, String str2, Throwable th);

        void saneness(String str, String str2, Throwable th);

        void w(String str, String str2, Throwable th);
    }

    @Pure
    public static String attabal(String str, Throwable th) {
        String strMarial = marial(th);
        if (TextUtils.isEmpty(strMarial)) {
            return str;
        }
        return str + "\n  " + strMarial.replace("\n", "\n  ") + '\n';
    }

    @Pure
    public static void beachfront(String str, String str2) {
        synchronized (f25143attabal) {
            try {
                if (f25145saneness <= 1) {
                    f25146wireman.saneness(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    public static boolean competently(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    @Pure
    public static void dern(String str, String str2) {
        synchronized (f25143attabal) {
            try {
                if (f25145saneness <= 3) {
                    f25146wireman.e(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    public static void impromptu(String str, String str2) {
        synchronized (f25143attabal) {
            try {
                if (f25145saneness <= 2) {
                    f25146wireman.w(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    public static String marial(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (f25143attabal) {
            try {
                if (competently(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f25144dern) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void saneness(String str, String str2) {
        synchronized (f25143attabal) {
            try {
                if (f25145saneness == 0) {
                    f25146wireman.attabal(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    public static void taiyuan(String str, String str2, Throwable th) {
        synchronized (f25143attabal) {
            try {
                if (f25145saneness <= 2) {
                    f25146wireman.w(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void wireman(String str, String str2, Throwable th) {
        synchronized (f25143attabal) {
            try {
                if (f25145saneness <= 3) {
                    f25146wireman.e(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
