package hobby;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: MutablePrimitiveRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cord {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static cord f27761saneness = new cord();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AtomicReference<restrictive> f27762attabal = new AtomicReference<>(restrictive.wireman().wireman());

    public static cord saneness() {
        return f27761saneness;
    }

    public <KeyT extends discernable.impromptu, PrimitiveT> PrimitiveT attabal(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (PrimitiveT) this.f27762attabal.get().beachfront(keyt, cls);
    }

    public synchronized <KeyT extends discernable.impromptu, PrimitiveT> void dern(kattegat<KeyT, PrimitiveT> kattegatVar) throws GeneralSecurityException {
        this.f27762attabal.set(restrictive.marial(this.f27762attabal.get()).marial(kattegatVar).wireman());
    }

    public <WrapperPrimitiveT> WrapperPrimitiveT marial(triweekly triweeklyVar, polloi polloiVar, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return (WrapperPrimitiveT) this.f27762attabal.get().impromptu(triweeklyVar, polloiVar, cls);
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void wireman(merc<InputPrimitiveT, WrapperPrimitiveT> mercVar) throws GeneralSecurityException {
        this.f27762attabal.set(restrictive.marial(this.f27762attabal.get()).beachfront(mercVar).wireman());
    }
}
