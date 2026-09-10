package diakinesis;

import android.content.Context;
import androidx.work.apical;
import disrupture.beachfront;
import disrupture.competently;
import disrupture.impromptu;
import disrupture.marial;
import java.util.ArrayList;
import java.util.List;
import ocellation.arytenoidectomy;

/* JADX INFO: compiled from: WorkConstraintsTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman implements disrupture.dern.attabal {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f25235wireman = apical.beachfront("WorkConstraintsTracker");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f25236attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Object f25237dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final disrupture.dern<?>[] f25238saneness;

    public wireman(Context context, arugula.attabal attabalVar, dern dernVar) {
        Context applicationContext = context.getApplicationContext();
        this.f25236attabal = dernVar;
        this.f25238saneness = new disrupture.dern[]{new disrupture.attabal(applicationContext, attabalVar), new disrupture.saneness(applicationContext, attabalVar), new impromptu(applicationContext, attabalVar), new disrupture.wireman(applicationContext, attabalVar), new competently(applicationContext, attabalVar), new beachfront(applicationContext, attabalVar), new marial(applicationContext, attabalVar)};
        this.f25237dern = new Object();
    }

    @Override // disrupture.dern.attabal
    public void attabal(List<String> list) {
        synchronized (this.f25237dern) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (dern(str)) {
                        apical.dern().attabal(f25235wireman, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                dern dernVar = this.f25236attabal;
                if (dernVar != null) {
                    dernVar.marial(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean dern(String str) {
        synchronized (this.f25237dern) {
            try {
                for (disrupture.dern<?> dernVar : this.f25238saneness) {
                    if (dernVar.wireman(str)) {
                        apical.dern().attabal(f25235wireman, String.format("Work %s constrained by %s", str, dernVar.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void marial() {
        synchronized (this.f25237dern) {
            try {
                for (disrupture.dern<?> dernVar : this.f25238saneness) {
                    dernVar.beachfront();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // disrupture.dern.attabal
    public void saneness(List<String> list) {
        synchronized (this.f25237dern) {
            try {
                dern dernVar = this.f25236attabal;
                if (dernVar != null) {
                    dernVar.saneness(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void wireman(Iterable<arytenoidectomy> iterable) {
        synchronized (this.f25237dern) {
            try {
                for (disrupture.dern<?> dernVar : this.f25238saneness) {
                    dernVar.competently(null);
                }
                for (disrupture.dern<?> dernVar2 : this.f25238saneness) {
                    dernVar2.marial(iterable);
                }
                for (disrupture.dern<?> dernVar3 : this.f25238saneness) {
                    dernVar3.competently(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
