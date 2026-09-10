package overassessment;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.apical;
import androidx.work.impassible;
import androidx.work.molybdenite;
import androidx.work.monoploid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: WorkContinuationImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class competently extends monoploid {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final String f34852cutely = apical.beachfront("WorkContinuationImpl");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final taiyuan f34853attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final List<String> f34854beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final List<competently> f34855competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ExistingWorkPolicy f34856dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f34857impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final List<String> f34858marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f34859saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public impassible f34860taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List<? extends molybdenite> f34861wireman;

    public competently(taiyuan taiyuanVar, List<? extends molybdenite> list) {
        this(taiyuanVar, null, ExistingWorkPolicy.KEEP, list, null);
    }

    public static Set<String> formularize(competently competentlyVar) {
        HashSet hashSet = new HashSet();
        List<competently> listMarial = competentlyVar.marial();
        if (listMarial != null && !listMarial.isEmpty()) {
            Iterator<competently> it = listMarial.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().dern());
            }
        }
        return hashSet;
    }

    public static boolean taiyuan(competently competentlyVar, Set<String> set) {
        set.addAll(competentlyVar.dern());
        Set<String> setFormularize = formularize(competentlyVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setFormularize.contains(it.next())) {
                return true;
            }
        }
        List<competently> listMarial = competentlyVar.marial();
        if (listMarial != null && !listMarial.isEmpty()) {
            Iterator<competently> it2 = listMarial.iterator();
            while (it2.hasNext()) {
                if (taiyuan(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(competentlyVar.dern());
        return false;
    }

    public void apical() {
        this.f34857impromptu = true;
    }

    public impassible attabal() {
        if (this.f34857impromptu) {
            apical.dern().impromptu(f34852cutely, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f34858marial)), new Throwable[0]);
        } else {
            talweg.saneness sanenessVar = new talweg.saneness(this);
            this.f34853attabal.arytenoidectomy().saneness(sanenessVar);
            this.f34860taiyuan = sanenessVar.wireman();
        }
        return this.f34860taiyuan;
    }

    public List<? extends molybdenite> beachfront() {
        return this.f34861wireman;
    }

    public taiyuan competently() {
        return this.f34853attabal;
    }

    public boolean cutely() {
        return this.f34857impromptu;
    }

    public List<String> dern() {
        return this.f34858marial;
    }

    public boolean impromptu() {
        return taiyuan(this, new HashSet());
    }

    public List<competently> marial() {
        return this.f34855competently;
    }

    public ExistingWorkPolicy saneness() {
        return this.f34856dern;
    }

    public String wireman() {
        return this.f34859saneness;
    }

    public competently(taiyuan taiyuanVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends molybdenite> list, List<competently> list2) {
        this.f34853attabal = taiyuanVar;
        this.f34859saneness = str;
        this.f34856dern = existingWorkPolicy;
        this.f34861wireman = list;
        this.f34855competently = list2;
        this.f34858marial = new ArrayList(list.size());
        this.f34854beachfront = new ArrayList();
        if (list2 != null) {
            Iterator<competently> it = list2.iterator();
            while (it.hasNext()) {
                this.f34854beachfront.addAll(it.next().f34854beachfront);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String strAttabal = list.get(i).attabal();
            this.f34858marial.add(strAttabal);
            this.f34854beachfront.add(strAttabal);
        }
    }
}
