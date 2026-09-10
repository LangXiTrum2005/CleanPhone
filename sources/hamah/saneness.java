package hamah;

/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static saneness f27482attabal;

    public static saneness attabal() {
        if (f27482attabal == null) {
            f27482attabal = new saneness();
        }
        return f27482attabal;
    }

    @Override // hamah.attabal
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
