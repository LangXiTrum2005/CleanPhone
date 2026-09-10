package androidx.work;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static apical f14017attabal = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f14018saneness = 20;

    /* JADX INFO: compiled from: Logger.java */
    public static class attabal extends apical {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f14019dern;

        public attabal(int i) {
            super(i);
            this.f14019dern = i;
        }

        @Override // androidx.work.apical
        public void attabal(String str, String str2, Throwable... thArr) {
            if (this.f14019dern > 3 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // androidx.work.apical
        public void competently(String str, String str2, Throwable... thArr) {
            if (this.f14019dern > 2 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // androidx.work.apical
        public void impromptu(String str, String str2, Throwable... thArr) {
            if (this.f14019dern > 5 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // androidx.work.apical
        public void saneness(String str, String str2, Throwable... thArr) {
            if (this.f14019dern > 6 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // androidx.work.apical
        public void wireman(String str, String str2, Throwable... thArr) {
            if (this.f14019dern > 4 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }
    }

    public apical(int i) {
    }

    public static String beachfront(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f14018saneness;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static synchronized apical dern() {
        try {
            if (f14017attabal == null) {
                f14017attabal = new attabal(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14017attabal;
    }

    public static synchronized void marial(apical apicalVar) {
        f14017attabal = apicalVar;
    }

    public abstract void attabal(String str, String str2, Throwable... thArr);

    public abstract void competently(String str, String str2, Throwable... thArr);

    public abstract void impromptu(String str, String str2, Throwable... thArr);

    public abstract void saneness(String str, String str2, Throwable... thArr);

    public abstract void wireman(String str, String str2, Throwable... thArr);
}
