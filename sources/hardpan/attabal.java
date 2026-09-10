package hardpan;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: CallbackWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final competently.dern f27483attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Executor f27484saneness;

    /* JADX INFO: renamed from: hardpan.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallbackWrapper.java */
    public class RunnableC0629attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Typeface f27485arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ competently.dern f27486kowloon;

        public RunnableC0629attabal(competently.dern dernVar, Typeface typeface) {
            this.f27486kowloon = dernVar;
            this.f27485arytenoidectomy = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27486kowloon.saneness(this.f27485arytenoidectomy);
        }
    }

    /* JADX INFO: compiled from: CallbackWrapper.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ int f27488arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ competently.dern f27489kowloon;

        public saneness(competently.dern dernVar, int i) {
            this.f27489kowloon = dernVar;
            this.f27488arytenoidectomy = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27489kowloon.attabal(this.f27488arytenoidectomy);
        }
    }

    public attabal(competently.dern dernVar, Executor executor) {
        this.f27483attabal = dernVar;
        this.f27484saneness = executor;
    }

    public final void attabal(int i) {
        this.f27484saneness.execute(new saneness(this.f27483attabal, i));
    }

    public final void dern(Typeface typeface) {
        this.f27484saneness.execute(new RunnableC0629attabal(this.f27483attabal, typeface));
    }

    public void saneness(beachfront.marial marialVar) {
        if (marialVar.attabal()) {
            dern(marialVar.f27503attabal);
        } else {
            attabal(marialVar.f27504saneness);
        }
    }
}
