package androidx.fragment.app;

import androidx.p001lifecycle.mathsort;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: FragmentManagerViewModel.java */
/* JADX INFO: loaded from: classes.dex */
public final class kattegat extends androidx.p001lifecycle.starveling {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final androidx.lifecycle.peridotite.dern f10329taiyuan = new attabal();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f10334marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final HashMap<String, Fragment> f10335saneness = new HashMap<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final HashMap<String, kattegat> f10332dern = new HashMap<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final HashMap<String, mathsort> f10336wireman = new HashMap<>();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f10330beachfront = false;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f10331competently = false;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f10333impromptu = false;

    /* JADX INFO: compiled from: FragmentManagerViewModel.java */
    public class attabal implements androidx.lifecycle.peridotite.dern {
        @Override // androidx.lifecycle.peridotite.dern
        public <T extends androidx.p001lifecycle.starveling> T saneness(Class<T> cls) {
            return new kattegat(true);
        }
    }

    public kattegat(boolean z) {
        this.f10334marial = z;
    }

    public static kattegat apical(mathsort mathsortVar) {
        return (kattegat) new androidx.p001lifecycle.peridotite(mathsortVar, f10329taiyuan).attabal(kattegat.class);
    }

    public void arytenoidectomy(boolean z) {
        this.f10333impromptu = z;
    }

    public void beachfront(Fragment fragment, boolean z) {
        if (FragmentManager.deadwork(3)) {
            Objects.toString(fragment);
        }
        impromptu(fragment.mWho, z);
    }

    public void competently(String str, boolean z) {
        FragmentManager.deadwork(3);
        impromptu(str, z);
    }

    public kattegat cutely(Fragment fragment) {
        kattegat kattegatVar = this.f10332dern.get(fragment.mWho);
        if (kattegatVar != null) {
            return kattegatVar;
        }
        kattegat kattegatVar2 = new kattegat(this.f10334marial);
        this.f10332dern.put(fragment.mWho, kattegatVar2);
        return kattegatVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kattegat.class == obj.getClass()) {
            kattegat kattegatVar = (kattegat) obj;
            if (this.f10335saneness.equals(kattegatVar.f10335saneness) && this.f10332dern.equals(kattegatVar.f10332dern) && this.f10336wireman.equals(kattegatVar.f10336wireman)) {
                return true;
            }
        }
        return false;
    }

    public Collection<Fragment> formularize() {
        return new ArrayList(this.f10335saneness.values());
    }

    public int hashCode() {
        return (((this.f10335saneness.hashCode() * 31) + this.f10332dern.hashCode()) * 31) + this.f10336wireman.hashCode();
    }

    public mathsort impassible(Fragment fragment) {
        mathsort mathsortVar = this.f10336wireman.get(fragment.mWho);
        if (mathsortVar != null) {
            return mathsortVar;
        }
        mathsort mathsortVar2 = new mathsort();
        this.f10336wireman.put(fragment.mWho, mathsortVar2);
        return mathsortVar2;
    }

    public final void impromptu(String str, boolean z) {
        kattegat kattegatVar = this.f10332dern.get(str);
        if (kattegatVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(kattegatVar.f10332dern.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    kattegatVar.competently((String) it.next(), true);
                }
            }
            kattegatVar.wireman();
            this.f10332dern.remove(str);
        }
        mathsort mathsortVar = this.f10336wireman.get(str);
        if (mathsortVar != null) {
            mathsortVar.attabal();
            this.f10336wireman.remove(str);
        }
    }

    public void kowloon(Fragment fragment) {
        if (this.f10333impromptu) {
            FragmentManager.deadwork(2);
        } else {
            if (this.f10335saneness.remove(fragment.mWho) == null || !FragmentManager.deadwork(2)) {
                return;
            }
            fragment.toString();
        }
    }

    public void marial(Fragment fragment) {
        if (this.f10333impromptu) {
            FragmentManager.deadwork(2);
        } else {
            if (this.f10335saneness.containsKey(fragment.mWho)) {
                return;
            }
            this.f10335saneness.put(fragment.mWho, fragment);
            if (FragmentManager.deadwork(2)) {
                fragment.toString();
            }
        }
    }

    public boolean monoploid(Fragment fragment) {
        if (this.f10335saneness.containsKey(fragment.mWho)) {
            return this.f10334marial ? this.f10330beachfront : !this.f10331competently;
        }
        return true;
    }

    public Fragment taiyuan(String str) {
        return this.f10335saneness.get(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f10335saneness.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f10332dern.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f10336wireman.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public boolean triweekly() {
        return this.f10330beachfront;
    }

    @Override // androidx.p001lifecycle.starveling
    public void wireman() {
        if (FragmentManager.deadwork(3)) {
            toString();
        }
        this.f10330beachfront = true;
    }
}
