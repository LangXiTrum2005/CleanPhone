package burglary;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.apical;
import com.unity3d.scar.adapter.common.beachfront;
import com.unity3d.scar.adapter.common.cutely;
import com.unity3d.scar.adapter.common.taiyuan;
import com.unity3d.scar.adapter.common.wireman;
import inceptive.competently;
import inceptive.marial;

/* JADX INFO: compiled from: ScarAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public class attabal extends taiyuan implements wireman {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public twas.attabal f15190marial;

    /* JADX INFO: renamed from: burglary.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ScarAdapter.java */
    public class RunnableC0131attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ astigmatic.dern f15191arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ marial f15192kowloon;

        /* JADX INFO: renamed from: burglary.attabal$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0132attabal implements astigmatic.saneness {
            public C0132attabal() {
            }
        }

        public RunnableC0131attabal(marial marialVar, astigmatic.dern dernVar) {
            this.f15192kowloon = marialVar;
            this.f15191arytenoidectomy = dernVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15192kowloon.attabal(new C0132attabal());
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class dern implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ inceptive.dern f15196kowloon;

        public dern(inceptive.dern dernVar) {
            this.f15196kowloon = dernVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15196kowloon.attabal(null);
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ astigmatic.dern f15197arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ competently f15198kowloon;

        /* JADX INFO: renamed from: burglary.attabal$saneness$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0133attabal implements astigmatic.saneness {
            public C0133attabal() {
            }
        }

        public saneness(competently competentlyVar, astigmatic.dern dernVar) {
            this.f15198kowloon = competentlyVar;
            this.f15197arytenoidectomy = dernVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15198kowloon.attabal(new C0133attabal());
        }
    }

    public attabal(com.unity3d.scar.adapter.common.dern<apical> dernVar, String str) {
        super(dernVar);
        twas.attabal attabalVar = new twas.attabal(new shiite.attabal(str));
        this.f15190marial = attabalVar;
        this.f23678attabal = new diu.saneness(attabalVar);
    }

    @Override // com.unity3d.scar.adapter.common.wireman
    public void beachfront(Context context, RelativeLayout relativeLayout, astigmatic.dern dernVar, int i, int i2, com.unity3d.scar.adapter.common.marial marialVar) {
        cutely.attabal(new dern(new inceptive.dern(context, relativeLayout, this.f15190marial, dernVar, i, i2, this.f23681wireman, marialVar)));
    }

    @Override // com.unity3d.scar.adapter.common.wireman
    public void marial(Context context, astigmatic.dern dernVar, com.unity3d.scar.adapter.common.competently competentlyVar) {
        cutely.attabal(new saneness(new competently(context, this.f15190marial, dernVar, this.f23681wireman, competentlyVar), dernVar));
    }

    @Override // com.unity3d.scar.adapter.common.wireman
    public void wireman(Context context, astigmatic.dern dernVar, beachfront beachfrontVar) {
        cutely.attabal(new RunnableC0131attabal(new marial(context, this.f15190marial, dernVar, this.f23681wireman, beachfrontVar), dernVar));
    }
}
