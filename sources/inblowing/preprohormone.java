package inblowing;

/* JADX INFO: compiled from: OptionalProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public class preprohormone<T> implements friedmanite.saneness<T>, friedmanite.attabal<T> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final friedmanite.attabal.InterfaceC0614attabal<Object> f28560dern = new friedmanite.attabal.InterfaceC0614attabal() { // from class: inblowing.dovishness
        @Override // friedmanite.attabal.InterfaceC0614attabal
        public final void attabal(friedmanite.saneness sanenessVar) {
            preprohormone.wireman(sanenessVar);
        }
    };

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final friedmanite.saneness<Object> f28561wireman = new friedmanite.saneness() { // from class: inblowing.gintrap
        @Override // friedmanite.saneness
        public final Object get() {
            return preprohormone.saneness();
        }
    };

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public friedmanite.attabal.InterfaceC0614attabal<T> f28562attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public volatile friedmanite.saneness<T> f28563saneness;

    public preprohormone(friedmanite.attabal.InterfaceC0614attabal<T> interfaceC0614attabal, friedmanite.saneness<T> sanenessVar) {
        this.f28562attabal = interfaceC0614attabal;
        this.f28563saneness = sanenessVar;
    }

    public static <T> preprohormone<T> beachfront(friedmanite.saneness<T> sanenessVar) {
        return new preprohormone<>(null, sanenessVar);
    }

    public static /* synthetic */ void dern(friedmanite.attabal.InterfaceC0614attabal interfaceC0614attabal, friedmanite.attabal.InterfaceC0614attabal interfaceC0614attabal2, friedmanite.saneness sanenessVar) {
        interfaceC0614attabal.attabal(sanenessVar);
        interfaceC0614attabal2.attabal(sanenessVar);
    }

    public static <T> preprohormone<T> marial() {
        return new preprohormone<>(f28560dern, f28561wireman);
    }

    public static /* synthetic */ Object saneness() {
        return null;
    }

    @Override // friedmanite.attabal
    public void attabal(final friedmanite.attabal.InterfaceC0614attabal<T> interfaceC0614attabal) {
        friedmanite.saneness<T> sanenessVar;
        friedmanite.saneness<T> sanenessVar2;
        friedmanite.saneness<T> sanenessVar3 = this.f28563saneness;
        friedmanite.saneness<Object> sanenessVar4 = f28561wireman;
        if (sanenessVar3 != sanenessVar4) {
            interfaceC0614attabal.attabal(sanenessVar3);
            return;
        }
        synchronized (this) {
            sanenessVar = this.f28563saneness;
            if (sanenessVar != sanenessVar4) {
                sanenessVar2 = sanenessVar;
            } else {
                final friedmanite.attabal.InterfaceC0614attabal<T> interfaceC0614attabal2 = this.f28562attabal;
                this.f28562attabal = new friedmanite.attabal.InterfaceC0614attabal() { // from class: inblowing.rotuma
                    @Override // friedmanite.attabal.InterfaceC0614attabal
                    public final void attabal(friedmanite.saneness sanenessVar5) {
                        preprohormone.dern(interfaceC0614attabal2, interfaceC0614attabal, sanenessVar5);
                    }
                };
                sanenessVar2 = null;
            }
        }
        if (sanenessVar2 != null) {
            interfaceC0614attabal.attabal(sanenessVar);
        }
    }

    public void competently(friedmanite.saneness<T> sanenessVar) {
        friedmanite.attabal.InterfaceC0614attabal<T> interfaceC0614attabal;
        if (this.f28563saneness != f28561wireman) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0614attabal = this.f28562attabal;
            this.f28562attabal = null;
            this.f28563saneness = sanenessVar;
        }
        interfaceC0614attabal.attabal(sanenessVar);
    }

    @Override // friedmanite.saneness
    public T get() {
        return this.f28563saneness.get();
    }

    public static /* synthetic */ void wireman(friedmanite.saneness sanenessVar) {
    }
}
