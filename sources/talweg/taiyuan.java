package talweg;

import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: StartWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan implements Runnable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public String f38652arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public overassessment.taiyuan f38653kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public WorkerParameters.attabal f38654monoploid;

    public taiyuan(overassessment.taiyuan taiyuanVar, String str, WorkerParameters.attabal attabalVar) {
        this.f38653kowloon = taiyuanVar;
        this.f38652arytenoidectomy = str;
        this.f38654monoploid = attabalVar;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.f38653kowloon.impassible().apical(this.f38652arytenoidectomy, this.f38654monoploid);
    }
}
