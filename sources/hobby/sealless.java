package hobby;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PrefixMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sealless<P> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ebullioscopic.attabal f27831saneness = ebullioscopic.attabal.attabal(new byte[0]);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<ebullioscopic.attabal, List<P>> f27832attabal;

    /* JADX INFO: compiled from: PrefixMap.java */
    public class attabal implements Iterable<P> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ List f27833arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ List f27834kowloon;

        public attabal(List list, List list2) {
            this.f27834kowloon = list;
            this.f27833arytenoidectomy = list2;
        }

        @Override // java.lang.Iterable
        public Iterator<P> iterator() {
            return new dern(this.f27834kowloon.iterator(), this.f27833arytenoidectomy.iterator(), null);
        }
    }

    /* JADX INFO: compiled from: PrefixMap.java */
    public static class dern<P> implements Iterator<P> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Iterator<P> f27836arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Iterator<P> f27837kowloon;

        public /* synthetic */ dern(Iterator it, Iterator it2, attabal attabalVar) {
            this(it, it2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27837kowloon.hasNext() || this.f27836arytenoidectomy.hasNext();
        }

        @Override // java.util.Iterator
        public P next() {
            return this.f27837kowloon.hasNext() ? this.f27837kowloon.next() : this.f27836arytenoidectomy.next();
        }

        public dern(Iterator<P> it, Iterator<P> it2) {
            this.f27837kowloon = it;
            this.f27836arytenoidectomy = it2;
        }
    }

    /* JADX INFO: compiled from: PrefixMap.java */
    public static class saneness<P> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Map<ebullioscopic.attabal, List<P>> f27838attabal = new HashMap();

        public sealless<P> attabal() {
            return new sealless<>(this.f27838attabal, null);
        }

        public saneness<P> saneness(ebullioscopic.attabal attabalVar, P p) throws GeneralSecurityException {
            List<P> list;
            if (attabalVar.dern() != 0 && attabalVar.dern() != 5) {
                throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
            }
            if (this.f27838attabal.containsKey(attabalVar)) {
                list = this.f27838attabal.get(attabalVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f27838attabal.put(attabalVar, arrayList);
                list = arrayList;
            }
            list.add(p);
            return this;
        }
    }

    public /* synthetic */ sealless(Map map, attabal attabalVar) {
        this(map);
    }

    public Iterable<P> attabal(byte[] bArr) {
        List<P> list = this.f27832attabal.get(f27831saneness);
        List<P> list2 = bArr.length >= 5 ? this.f27832attabal.get(ebullioscopic.attabal.saneness(bArr, 0, 5)) : null;
        if (list == null && list2 == null) {
            return new ArrayList();
        }
        if (list == null) {
            return list2;
        }
        return list2 == null ? list : new attabal(list2, list);
    }

    public sealless(Map<ebullioscopic.attabal, List<P>> map) {
        this.f27832attabal = map;
    }
}
