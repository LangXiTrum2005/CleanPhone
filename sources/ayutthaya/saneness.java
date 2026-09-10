package ayutthaya;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkInfo;
import androidx.work.apical;
import diakinesis.dern;
import diakinesis.wireman;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ocellation.arytenoidectomy;
import overassessment.marial;
import overassessment.taiyuan;
import talweg.competently;

/* JADX INFO: compiled from: GreedyScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness implements marial, dern, overassessment.saneness {

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final String f14806gintrap = apical.beachfront("GreedyScheduler");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final taiyuan f14808arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public Boolean f14809dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f14810graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Context f14811kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public attabal f14812molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final wireman f14813monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final Set<arytenoidectomy> f14814polloi = new HashSet();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final Object f14807adultoid = new Object();

    public saneness(Context context, androidx.work.attabal attabalVar, arugula.attabal attabalVar2, taiyuan taiyuanVar) {
        this.f14811kowloon = context;
        this.f14808arytenoidectomy = taiyuanVar;
        this.f14813monoploid = new wireman(context, attabalVar2, this);
        this.f14812molybdenite = new attabal(this, attabalVar.apical());
    }

    @Override // overassessment.marial
    public void attabal(String str) {
        if (this.f14809dovishness == null) {
            competently();
        }
        if (!this.f14809dovishness.booleanValue()) {
            apical.dern().wireman(f14806gintrap, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        impromptu();
        apical.dern().attabal(f14806gintrap, String.format("Cancelling work ID %s", str), new Throwable[0]);
        attabal attabalVar = this.f14812molybdenite;
        if (attabalVar != null) {
            attabalVar.saneness(str);
        }
        this.f14808arytenoidectomy.rotuma(str);
    }

    @Override // overassessment.marial
    public void beachfront(arytenoidectomy... arytenoidectomyVarArr) {
        if (this.f14809dovishness == null) {
            competently();
        }
        if (!this.f14809dovishness.booleanValue()) {
            apical.dern().wireman(f14806gintrap, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        impromptu();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (arytenoidectomy arytenoidectomyVar : arytenoidectomyVarArr) {
            long jAttabal = arytenoidectomyVar.attabal();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (arytenoidectomyVar.f34011saneness == WorkInfo.State.ENQUEUED) {
                if (jCurrentTimeMillis < jAttabal) {
                    attabal attabalVar = this.f14812molybdenite;
                    if (attabalVar != null) {
                        attabalVar.attabal(arytenoidectomyVar);
                    }
                } else if (!arytenoidectomyVar.saneness()) {
                    apical.dern().attabal(f14806gintrap, String.format("Starting work for %s", arytenoidectomyVar.f33999attabal), new Throwable[0]);
                    this.f14808arytenoidectomy.adultoid(arytenoidectomyVar.f33999attabal);
                } else if (arytenoidectomyVar.f34002cutely.impromptu()) {
                    apical.dern().attabal(f14806gintrap, String.format("Ignoring WorkSpec %s, Requires device idle.", arytenoidectomyVar), new Throwable[0]);
                } else if (arytenoidectomyVar.f34002cutely.marial()) {
                    apical.dern().attabal(f14806gintrap, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", arytenoidectomyVar), new Throwable[0]);
                } else {
                    hashSet.add(arytenoidectomyVar);
                    hashSet2.add(arytenoidectomyVar.f33999attabal);
                }
            }
        }
        synchronized (this.f14807adultoid) {
            try {
                if (!hashSet.isEmpty()) {
                    apical.dern().attabal(f14806gintrap, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f14814polloi.addAll(hashSet);
                    this.f14813monoploid.wireman(this.f14814polloi);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void competently() {
        this.f14809dovishness = Boolean.valueOf(competently.saneness(this.f14811kowloon, this.f14808arytenoidectomy.taiyuan()));
    }

    @Override // overassessment.marial
    public boolean dern() {
        return false;
    }

    public final void impromptu() {
        if (this.f14810graveside) {
            return;
        }
        this.f14808arytenoidectomy.impassible().dern(this);
        this.f14810graveside = true;
    }

    @Override // diakinesis.dern
    public void marial(List<String> list) {
        for (String str : list) {
            apical.dern().attabal(f14806gintrap, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f14808arytenoidectomy.adultoid(str);
        }
    }

    @Override // diakinesis.dern
    public void saneness(List<String> list) {
        for (String str : list) {
            apical.dern().attabal(f14806gintrap, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f14808arytenoidectomy.rotuma(str);
        }
    }

    public final void taiyuan(String str) {
        synchronized (this.f14807adultoid) {
            try {
                for (arytenoidectomy arytenoidectomyVar : this.f14814polloi) {
                    if (arytenoidectomyVar.f33999attabal.equals(str)) {
                        apical.dern().attabal(f14806gintrap, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f14814polloi.remove(arytenoidectomyVar);
                        this.f14813monoploid.wireman(this.f14814polloi);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // overassessment.saneness
    public void wireman(String str, boolean z) {
        taiyuan(str);
    }
}
