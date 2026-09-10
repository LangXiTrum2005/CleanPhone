package hobby;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: EnumTypeProtoConverter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impromptu<E extends Enum<E>, O> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<E, O> f27779attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<O, E> f27780saneness;

    /* JADX INFO: compiled from: EnumTypeProtoConverter.java */
    public static final class saneness<E extends Enum<E>, O> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Map<E, O> f27781attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Map<O, E> f27782saneness;

        public saneness<E, O> attabal(E e, O o) {
            this.f27781attabal.put(e, o);
            this.f27782saneness.put(o, e);
            return this;
        }

        public impromptu<E, O> saneness() {
            return new impromptu<>(Collections.unmodifiableMap(this.f27781attabal), Collections.unmodifiableMap(this.f27782saneness));
        }

        public saneness() {
            this.f27781attabal = new HashMap();
            this.f27782saneness = new HashMap();
        }
    }

    public static <E extends Enum<E>, O> saneness<E, O> attabal() {
        return new saneness<>();
    }

    public E dern(O o) throws GeneralSecurityException {
        E e = this.f27780saneness.get(o);
        if (e != null) {
            return e;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + o);
    }

    public O saneness(E e) throws GeneralSecurityException {
        O o = this.f27779attabal.get(e);
        if (o != null) {
            return o;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + e);
    }

    public impromptu(Map<E, O> map, Map<O, E> map2) {
        this.f27779attabal = map;
        this.f27780saneness = map2;
    }
}
