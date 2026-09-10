package irredeemable;

/* JADX INFO: compiled from: QLog.java */
/* JADX INFO: loaded from: classes4.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static int f29003attabal = 5;

    public static void attabal(Exception exc) {
        if (wireman()) {
            exc.printStackTrace();
        }
    }

    public static void beachfront(Object obj) {
        if (marial()) {
            dern();
            String.valueOf(obj);
        }
    }

    public static String dern() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    public static boolean marial() {
        return f29003attabal > 4;
    }

    public static void saneness(Object obj) {
        if (wireman()) {
            dern();
            String.valueOf(obj);
            dern();
            String.valueOf(obj);
        }
    }

    public static boolean wireman() {
        return f29003attabal > 0;
    }
}
