package rollout;

import amount.sealless;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: RolloutAssignmentList.java */
/* JADX INFO: loaded from: classes3.dex */
public class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<cutely> f36730attabal = new ArrayList();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f36731saneness;

    public apical(int i) {
        this.f36731saneness = i;
    }

    public List<sealless.marial.wireman.AbstractC0023marial> attabal() {
        List<cutely> listSaneness = saneness();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listSaneness.size(); i++) {
            arrayList.add(listSaneness.get(i).impromptu());
        }
        return arrayList;
    }

    public synchronized boolean dern(List<cutely> list) {
        this.f36730attabal.clear();
        if (list.size() <= this.f36731saneness) {
            return this.f36730attabal.addAll(list);
        }
        gelandelaufer.competently.beachfront().apical("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f36731saneness);
        return this.f36730attabal.addAll(list.subList(0, this.f36731saneness));
    }

    public synchronized List<cutely> saneness() {
        return Collections.unmodifiableList(new ArrayList(this.f36730attabal));
    }
}
