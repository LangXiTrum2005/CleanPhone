package trawler;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: LruArrayPool.java */
/* JADX INFO: loaded from: classes2.dex */
public final class taiyuan implements trawler.saneness {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f38971beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f38973marial;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final competently<attabal, Object> f38970attabal = new competently<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f38974saneness = new saneness();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f38972dern = new HashMap();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<Class<?>, trawler.attabal<?>> f38975wireman = new HashMap();

    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class attabal implements impassible {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final saneness f38976attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Class<?> f38977dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f38978saneness;

        public attabal(saneness sanenessVar) {
            this.f38976attabal = sanenessVar;
        }

        @Override // trawler.impassible
        public void attabal() {
            this.f38976attabal.dern(this);
        }

        public boolean equals(Object obj) {
            if (obj instanceof attabal) {
                attabal attabalVar = (attabal) obj;
                if (this.f38978saneness == attabalVar.f38978saneness && this.f38977dern == attabalVar.f38977dern) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f38978saneness * 31;
            Class<?> cls = this.f38977dern;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public void saneness(int i, Class<?> cls) {
            this.f38978saneness = i;
            this.f38977dern = cls;
        }

        public String toString() {
            return "Key{size=" + this.f38978saneness + "array=" + this.f38977dern + '}';
        }
    }

    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class saneness extends dern<attabal> {
        public attabal marial(int i, Class<?> cls) {
            attabal attabalVarSaneness = saneness();
            attabalVarSaneness.saneness(i, cls);
            return attabalVarSaneness;
        }

        @Override // trawler.dern
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public attabal attabal() {
            return new attabal(this);
        }
    }

    public taiyuan(int i) {
        this.f38973marial = i;
    }

    public final <T> T apical(attabal attabalVar, Class<T> cls) {
        trawler.attabal<T> attabalVarTaiyuan = taiyuan(cls);
        T t = (T) cutely(attabalVar);
        if (t != null) {
            this.f38971beachfront -= attabalVarTaiyuan.saneness(t) * attabalVarTaiyuan.attabal();
            marial(attabalVarTaiyuan.saneness(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(attabalVarTaiyuan.getTag(), 2)) {
            attabalVarTaiyuan.getTag();
            int i = attabalVar.f38978saneness;
        }
        return attabalVarTaiyuan.newArray(attabalVar.f38978saneness);
    }

    @Override // trawler.saneness
    public synchronized void attabal(int i) {
        try {
            if (i >= 40) {
                saneness();
            } else if (i >= 20 || i == 15) {
                competently(this.f38973marial / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void beachfront() {
        competently(this.f38973marial);
    }

    public final void competently(int i) {
        while (this.f38971beachfront > i) {
            Object objBeachfront = this.f38970attabal.beachfront();
            com.bumptech.glide.util.apical.wireman(objBeachfront);
            trawler.attabal attabalVarImpromptu = impromptu(objBeachfront);
            this.f38971beachfront -= attabalVarImpromptu.saneness(objBeachfront) * attabalVarImpromptu.attabal();
            marial(attabalVarImpromptu.saneness(objBeachfront), objBeachfront.getClass());
            if (Log.isLoggable(attabalVarImpromptu.getTag(), 2)) {
                attabalVarImpromptu.getTag();
                attabalVarImpromptu.saneness(objBeachfront);
            }
        }
    }

    public final <T> T cutely(attabal attabalVar) {
        return (T) this.f38970attabal.attabal(attabalVar);
    }

    @Override // trawler.saneness
    public synchronized <T> T dern(int i, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = formularize(cls).ceilingKey(Integer.valueOf(i));
        } catch (Throwable th) {
            throw th;
        }
        return (T) apical(kowloon(i, numCeilingKey) ? this.f38974saneness.marial(numCeilingKey.intValue(), cls) : this.f38974saneness.marial(i, cls), cls);
    }

    public final NavigableMap<Integer, Integer> formularize(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f38972dern.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f38972dern.put(cls, treeMap);
        return treeMap;
    }

    public final boolean impassible() {
        int i = this.f38971beachfront;
        return i == 0 || this.f38973marial / i >= 2;
    }

    public final <T> trawler.attabal<T> impromptu(T t) {
        return taiyuan(t.getClass());
    }

    public final boolean kowloon(int i, Integer num) {
        if (num != null) {
            return impassible() || num.intValue() <= i * 8;
        }
        return false;
    }

    public final void marial(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapFormularize = formularize(cls);
        Integer num = navigableMapFormularize.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapFormularize.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapFormularize.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    @Override // trawler.saneness
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        trawler.attabal<T> attabalVarTaiyuan = taiyuan(cls);
        int iSaneness = attabalVarTaiyuan.saneness(t);
        int iAttabal = attabalVarTaiyuan.attabal() * iSaneness;
        if (triweekly(iAttabal)) {
            attabal attabalVarMarial = this.f38974saneness.marial(iSaneness, cls);
            this.f38970attabal.wireman(attabalVarMarial, t);
            NavigableMap<Integer, Integer> navigableMapFormularize = formularize(cls);
            Integer num = navigableMapFormularize.get(Integer.valueOf(attabalVarMarial.f38978saneness));
            Integer numValueOf = Integer.valueOf(attabalVarMarial.f38978saneness);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapFormularize.put(numValueOf, Integer.valueOf(iIntValue));
            this.f38971beachfront += iAttabal;
            beachfront();
        }
    }

    @Override // trawler.saneness
    public synchronized void saneness() {
        competently(0);
    }

    public final <T> trawler.attabal<T> taiyuan(Class<T> cls) {
        trawler.attabal<T> beachfrontVar;
        trawler.attabal<T> attabalVar = (trawler.attabal) this.f38975wireman.get(cls);
        if (attabalVar != null) {
            return attabalVar;
        }
        if (cls.equals(int[].class)) {
            beachfrontVar = new impromptu();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            beachfrontVar = new beachfront();
        }
        this.f38975wireman.put(cls, beachfrontVar);
        return beachfrontVar;
    }

    public final boolean triweekly(int i) {
        return i <= this.f38973marial / 2;
    }

    @Override // trawler.saneness
    public synchronized <T> T wireman(int i, Class<T> cls) {
        return (T) apical(this.f38974saneness.marial(i, cls), cls);
    }
}
