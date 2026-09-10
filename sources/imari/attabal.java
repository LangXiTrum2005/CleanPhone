package imari;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.apical;
import com.unity3d.scar.adapter.common.beachfront;
import com.unity3d.scar.adapter.common.cutely;
import com.unity3d.scar.adapter.common.taiyuan;
import com.unity3d.scar.adapter.common.wireman;
import kaleidoscopic.competently;
import kaleidoscopic.marial;

/* JADX INFO: compiled from: ScarAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public class attabal extends taiyuan implements wireman {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public frailly.attabal f28440marial;

    /* JADX INFO: renamed from: imari.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ScarAdapter.java */
    public class RunnableC0644attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ astigmatic.dern f28441arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ marial f28442kowloon;

        /* JADX INFO: renamed from: imari.attabal$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0645attabal implements astigmatic.saneness {
            public C0645attabal() {
            }
        }

        public RunnableC0644attabal(marial marialVar, astigmatic.dern dernVar) {
            this.f28442kowloon = marialVar;
            this.f28441arytenoidectomy = dernVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28442kowloon.attabal(new C0645attabal());
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class dern implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ kaleidoscopic.dern f28446kowloon;

        public dern(kaleidoscopic.dern dernVar) {
            this.f28446kowloon = dernVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28446kowloon.attabal(null);
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ astigmatic.dern f28447arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ competently f28448kowloon;

        /* JADX INFO: renamed from: imari.attabal$saneness$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0646attabal implements astigmatic.saneness {
            public C0646attabal() {
            }
        }

        public saneness(competently competentlyVar, astigmatic.dern dernVar) {
            this.f28448kowloon = competentlyVar;
            this.f28447arytenoidectomy = dernVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28448kowloon.attabal(new C0646attabal());
        }
    }

    public attabal(com.unity3d.scar.adapter.common.dern<apical> dernVar, String str) {
        super(dernVar);
        frailly.attabal attabalVar = new frailly.attabal(new shiite.attabal(str));
        this.f28440marial = attabalVar;
        this.f23678attabal = new nonpolluting.saneness(attabalVar);
    }

    @Override // com.unity3d.scar.adapter.common.wireman
    public void beachfront(Context context, RelativeLayout relativeLayout, astigmatic.dern dernVar, int i, int i2, com.unity3d.scar.adapter.common.marial marialVar) {
        cutely.attabal(new dern(new kaleidoscopic.dern(context, relativeLayout, this.f28440marial, dernVar, i, i2, this.f23681wireman, marialVar)));
    }

    @Override // com.unity3d.scar.adapter.common.wireman
    public void marial(Context context, astigmatic.dern dernVar, com.unity3d.scar.adapter.common.competently competentlyVar) {
        cutely.attabal(new saneness(new competently(context, this.f28440marial, dernVar, this.f23681wireman, competentlyVar), dernVar));
    }

    @Override // com.unity3d.scar.adapter.common.wireman
    public void wireman(Context context, astigmatic.dern dernVar, beachfront beachfrontVar) {
        cutely.attabal(new RunnableC0644attabal(new marial(context, this.f28440marial, dernVar, this.f23681wireman, beachfrontVar), dernVar));
    }
}
