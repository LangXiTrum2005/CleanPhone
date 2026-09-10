package com.lzh.easythread;

/* JADX INFO: compiled from: Tools.java */
/* JADX INFO: loaded from: classes4.dex */
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f23538attabal;

    /* JADX INFO: compiled from: Tools.java */
    public static class attabal implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ dern f23539attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f23540saneness;

        public attabal(dern dernVar, String str) {
            this.f23539attabal = dernVar;
            this.f23540saneness = str;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            dern dernVar = this.f23539attabal;
            if (dernVar != null) {
                dernVar.saneness(this.f23540saneness, th);
            }
        }
    }

    static {
        try {
            Class.forName("android.os.Build");
            f23538attabal = true;
        } catch (Exception unused) {
            f23538attabal = false;
        }
    }

    public static boolean attabal(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static void saneness(Thread thread, String str, dern dernVar) {
        thread.setUncaughtExceptionHandler(new attabal(dernVar, str));
        thread.setName(str);
    }
}
