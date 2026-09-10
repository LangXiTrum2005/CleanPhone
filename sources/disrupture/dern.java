package disrupture;

import java.util.ArrayList;
import java.util.List;
import ocellation.arytenoidectomy;

/* JADX INFO: compiled from: ConstraintController.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class dern<T> implements diakinesis.attabal<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<String> f25355attabal = new ArrayList();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public kabul.wireman<T> f25356dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public T f25357saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public attabal f25358wireman;

    /* JADX INFO: compiled from: ConstraintController.java */
    public interface attabal {
        void attabal(List<String> list);

        void saneness(List<String> list);
    }

    public dern(kabul.wireman<T> wiremanVar) {
        this.f25356dern = wiremanVar;
    }

    @Override // diakinesis.attabal
    public void attabal(T t) {
        this.f25357saneness = t;
        impromptu(this.f25358wireman, t);
    }

    public void beachfront() {
        if (this.f25355attabal.isEmpty()) {
            return;
        }
        this.f25355attabal.clear();
        this.f25356dern.dern(this);
    }

    public void competently(attabal attabalVar) {
        if (this.f25358wireman != attabalVar) {
            this.f25358wireman = attabalVar;
            impromptu(attabalVar, this.f25357saneness);
        }
    }

    public abstract boolean dern(T t);

    public final void impromptu(attabal attabalVar, T t) {
        if (this.f25355attabal.isEmpty() || attabalVar == null) {
            return;
        }
        if (t == null || dern(t)) {
            attabalVar.saneness(this.f25355attabal);
        } else {
            attabalVar.attabal(this.f25355attabal);
        }
    }

    public void marial(Iterable<arytenoidectomy> iterable) {
        this.f25355attabal.clear();
        for (arytenoidectomy arytenoidectomyVar : iterable) {
            if (saneness(arytenoidectomyVar)) {
                this.f25355attabal.add(arytenoidectomyVar.f33999attabal);
            }
        }
        if (this.f25355attabal.isEmpty()) {
            this.f25356dern.dern(this);
        } else {
            this.f25356dern.attabal(this);
        }
        impromptu(this.f25358wireman, this.f25357saneness);
    }

    public abstract boolean saneness(arytenoidectomy arytenoidectomyVar);

    public boolean wireman(String str) {
        T t = this.f25357saneness;
        return t != null && dern(t) && this.f25355attabal.contains(str);
    }
}
