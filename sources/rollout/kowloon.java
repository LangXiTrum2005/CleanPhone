package rollout;

import amount.sealless;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import saneness.retroflection;

/* JADX INFO: compiled from: UserMetadata.java */
/* JADX INFO: loaded from: classes3.dex */
public class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final competently f36771attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f36774dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final CrashlyticsWorkers f36776saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final attabal f36777wireman = new attabal(false);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final attabal f36775marial = new attabal(true);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final apical f36772beachfront = new apical(128);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final AtomicMarkableReference<String> f36773competently = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: compiled from: UserMetadata.java */
    public class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final AtomicMarkableReference<marial> f36778attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final boolean f36779dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final AtomicReference<Runnable> f36780saneness = new AtomicReference<>(null);

        public attabal(boolean z) {
            this.f36779dern = z;
            this.f36778attabal = new AtomicMarkableReference<>(new marial(64, z ? 8192 : 1024), false);
        }

        public static /* synthetic */ void attabal(attabal attabalVar) throws Throwable {
            attabalVar.f36780saneness.set(null);
            attabalVar.wireman();
        }

        public final void dern() {
            Runnable runnable = new Runnable() { // from class: rollout.triweekly
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    kowloon.attabal.attabal(this.f36799kowloon);
                }
            };
            if (retroflection.attabal(this.f36780saneness, null, runnable)) {
                kowloon.this.f36776saneness.diskWrite.wireman(runnable);
            }
        }

        public boolean marial(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f36778attabal.getReference().wireman(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<marial> atomicMarkableReference = this.f36778attabal;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    dern();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public Map<String, String> saneness() {
            return this.f36778attabal.getReference().attabal();
        }

        public final void wireman() throws Throwable {
            Map<String, String> mapAttabal;
            synchronized (this) {
                try {
                    if (this.f36778attabal.isMarked()) {
                        mapAttabal = this.f36778attabal.getReference().attabal();
                        AtomicMarkableReference<marial> atomicMarkableReference = this.f36778attabal;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        mapAttabal = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mapAttabal != null) {
                kowloon.this.f36771attabal.polloi(kowloon.this.f36774dern, mapAttabal, this.f36779dern);
            }
        }
    }

    public kowloon(String str, spissatus.competently competentlyVar, CrashlyticsWorkers crashlyticsWorkers) {
        this.f36774dern = str;
        this.f36771attabal = new competently(competentlyVar);
        this.f36776saneness = crashlyticsWorkers;
    }

    public static String apical(String str, spissatus.competently competentlyVar) {
        return new competently(competentlyVar).apical(str);
    }

    public static kowloon cutely(String str, spissatus.competently competentlyVar, CrashlyticsWorkers crashlyticsWorkers) {
        competently competentlyVar2 = new competently(competentlyVar);
        kowloon kowloonVar = new kowloon(str, competentlyVar, crashlyticsWorkers);
        kowloonVar.f36777wireman.f36778attabal.getReference().marial(competentlyVar2.taiyuan(str, false));
        kowloonVar.f36775marial.f36778attabal.getReference().marial(competentlyVar2.taiyuan(str, true));
        kowloonVar.f36773competently.set(competentlyVar2.apical(str), false);
        kowloonVar.f36772beachfront.dern(competentlyVar2.cutely(str));
        return kowloonVar;
    }

    public static /* synthetic */ void saneness(kowloon kowloonVar, String str, Map map, List list) throws Throwable {
        if (kowloonVar.taiyuan() != null) {
            kowloonVar.f36771attabal.graveside(str, kowloonVar.taiyuan());
        }
        if (!map.isEmpty()) {
            kowloonVar.f36771attabal.monoploid(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        kowloonVar.f36771attabal.molybdenite(str, list);
    }

    public Map<String, String> beachfront(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f36777wireman.saneness();
        }
        HashMap map2 = new HashMap(this.f36777wireman.saneness());
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strDern = marial.dern(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strDern)) {
                map2.put(strDern, marial.dern(entry.getValue(), 1024));
            } else {
                i++;
            }
        }
        if (i > 0) {
            gelandelaufer.competently.beachfront().apical("Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map<String, String> competently() {
        return this.f36775marial.saneness();
    }

    public boolean formularize(String str, String str2) {
        return this.f36775marial.marial(str, str2);
    }

    public void impassible(final String str) {
        synchronized (this.f36774dern) {
            this.f36774dern = str;
            final Map<String, String> mapSaneness = this.f36777wireman.saneness();
            final List<cutely> listSaneness = this.f36772beachfront.saneness();
            this.f36776saneness.diskWrite.wireman(new Runnable() { // from class: rollout.formularize
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    kowloon.saneness(this.f36750kowloon, str, mapSaneness, listSaneness);
                }
            });
        }
    }

    public List<sealless.marial.wireman.AbstractC0023marial> impromptu() {
        return this.f36772beachfront.attabal();
    }

    public String taiyuan() {
        return this.f36773competently.getReference();
    }

    public boolean triweekly(List<cutely> list) {
        synchronized (this.f36772beachfront) {
            try {
                if (!this.f36772beachfront.dern(list)) {
                    return false;
                }
                final List<cutely> listSaneness = this.f36772beachfront.saneness();
                this.f36776saneness.diskWrite.wireman(new Runnable() { // from class: rollout.impassible
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        kowloon kowloonVar = this.f36754kowloon;
                        kowloonVar.f36771attabal.molybdenite(kowloonVar.f36774dern, listSaneness);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
