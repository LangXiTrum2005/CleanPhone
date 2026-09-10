package androidx.p001lifecycle;

/* JADX INFO: compiled from: LiveData.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class gintrap<T> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Object f10475apical = new Object();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f10476attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public volatile Object f10477beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f10478competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final Runnable f10479cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f10480dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f10481impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public volatile Object f10482marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public impassible.saneness<cord<? super T>, gintrap<T>.wireman> f10483saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f10484taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f10485wireman;

    /* JADX INFO: compiled from: LiveData.java */
    public class attabal implements Runnable {
        public attabal() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (gintrap.this.f10476attabal) {
                obj = gintrap.this.f10477beachfront;
                gintrap.this.f10477beachfront = gintrap.f10475apical;
            }
            gintrap.this.impassible(obj);
        }
    }

    /* JADX INFO: compiled from: LiveData.java */
    public class dern extends gintrap<T>.wireman implements impassible {

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final arytenoidectomy f10488molybdenite;

        public dern(arytenoidectomy arytenoidectomyVar, cord<? super T> cordVar) {
            super(cordVar);
            this.f10488molybdenite = arytenoidectomyVar;
        }

        @Override // androidx.lifecycle.gintrap.wireman
        public boolean marial() {
            return this.f10488molybdenite.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.p001lifecycle.impassible
        public void onStateChanged(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
            Lifecycle.State stateSaneness = this.f10488molybdenite.getLifecycle().getState();
            if (stateSaneness == Lifecycle.State.DESTROYED) {
                gintrap.this.formularize(this.f10491kowloon);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateSaneness) {
                attabal(marial());
                state = stateSaneness;
                stateSaneness = this.f10488molybdenite.getLifecycle().getState();
            }
        }

        @Override // androidx.lifecycle.gintrap.wireman
        public void saneness() {
            this.f10488molybdenite.getLifecycle().wireman(this);
        }

        @Override // androidx.lifecycle.gintrap.wireman
        public boolean wireman(arytenoidectomy arytenoidectomyVar) {
            return this.f10488molybdenite == arytenoidectomyVar;
        }
    }

    /* JADX INFO: compiled from: LiveData.java */
    public class saneness extends gintrap<T>.wireman {
        public saneness(cord<? super T> cordVar) {
            super(cordVar);
        }

        @Override // androidx.lifecycle.gintrap.wireman
        public boolean marial() {
            return true;
        }
    }

    public gintrap(T t) {
        this.f10476attabal = new Object();
        this.f10483saneness = new impassible.saneness<>();
        this.f10480dern = 0;
        this.f10477beachfront = f10475apical;
        this.f10479cutely = new attabal();
        this.f10482marial = t;
        this.f10478competently = 0;
    }

    public static void attabal(String str) {
        if (formularize.dern.competently().saneness()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void apical(T t) {
        boolean z;
        synchronized (this.f10476attabal) {
            z = this.f10477beachfront == f10475apical;
            this.f10477beachfront = t;
        }
        if (z) {
            formularize.dern.competently().dern(this.f10479cutely);
        }
    }

    public boolean beachfront() {
        return this.f10480dern > 0;
    }

    public void competently(arytenoidectomy arytenoidectomyVar, cord<? super T> cordVar) {
        attabal("observe");
        if (arytenoidectomyVar.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        dern dernVar = new dern(arytenoidectomyVar, cordVar);
        gintrap<T>.wireman wiremanVarCompetently = this.f10483saneness.competently(cordVar, dernVar);
        if (wiremanVarCompetently != null && !wiremanVarCompetently.wireman(arytenoidectomyVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (wiremanVarCompetently != null) {
            return;
        }
        arytenoidectomyVar.getLifecycle().attabal(dernVar);
    }

    public final void dern(gintrap<T>.wireman wiremanVar) {
        if (wiremanVar.f10490arytenoidectomy) {
            if (!wiremanVar.marial()) {
                wiremanVar.attabal(false);
                return;
            }
            int i = wiremanVar.f10492monoploid;
            int i2 = this.f10478competently;
            if (i >= i2) {
                return;
            }
            wiremanVar.f10492monoploid = i2;
            wiremanVar.f10491kowloon.attabal((Object) this.f10482marial);
        }
    }

    public void formularize(cord<? super T> cordVar) {
        attabal("removeObserver");
        gintrap<T>.wireman wiremanVarImpromptu = this.f10483saneness.impromptu(cordVar);
        if (wiremanVarImpromptu == null) {
            return;
        }
        wiremanVarImpromptu.saneness();
        wiremanVarImpromptu.attabal(false);
    }

    public void impassible(T t) {
        attabal("setValue");
        this.f10478competently++;
        this.f10482marial = t;
        wireman(null);
    }

    public void impromptu(cord<? super T> cordVar) {
        attabal("observeForever");
        saneness sanenessVar = new saneness(cordVar);
        gintrap<T>.wireman wiremanVarCompetently = this.f10483saneness.competently(cordVar, sanenessVar);
        if (wiremanVarCompetently instanceof dern) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (wiremanVarCompetently != null) {
            return;
        }
        sanenessVar.attabal(true);
    }

    public T marial() {
        T t = (T) this.f10482marial;
        if (t != f10475apical) {
            return t;
        }
        return null;
    }

    public void saneness(int i) {
        int i2 = this.f10480dern;
        this.f10480dern = i + i2;
        if (this.f10485wireman) {
            return;
        }
        this.f10485wireman = true;
        while (true) {
            try {
                int i3 = this.f10480dern;
                if (i2 == i3) {
                    this.f10485wireman = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    taiyuan();
                } else if (z2) {
                    cutely();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.f10485wireman = false;
                throw th;
            }
        }
    }

    public void wireman(gintrap<T>.wireman wiremanVar) {
        if (this.f10481impromptu) {
            this.f10484taiyuan = true;
            return;
        }
        this.f10481impromptu = true;
        do {
            this.f10484taiyuan = false;
            if (wiremanVar != null) {
                dern(wiremanVar);
                wiremanVar = null;
            } else {
                impassible.saneness<cord<? super T>, gintrap<T>.wireman>.wireman wiremanVarWireman = this.f10483saneness.wireman();
                while (wiremanVarWireman.hasNext()) {
                    dern((wireman) wiremanVarWireman.next().getValue());
                    if (this.f10484taiyuan) {
                        break;
                    }
                }
            }
        } while (this.f10484taiyuan);
        this.f10481impromptu = false;
    }

    public gintrap() {
        this.f10476attabal = new Object();
        this.f10483saneness = new impassible.saneness<>();
        this.f10480dern = 0;
        Object obj = f10475apical;
        this.f10477beachfront = obj;
        this.f10479cutely = new attabal();
        this.f10482marial = obj;
        this.f10478competently = -1;
    }

    /* JADX INFO: compiled from: LiveData.java */
    public abstract class wireman {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f10490arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final cord<? super T> f10491kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f10492monoploid = -1;

        public wireman(cord<? super T> cordVar) {
            this.f10491kowloon = cordVar;
        }

        public void attabal(boolean z) {
            if (z == this.f10490arytenoidectomy) {
                return;
            }
            this.f10490arytenoidectomy = z;
            gintrap.this.saneness(z ? 1 : -1);
            if (this.f10490arytenoidectomy) {
                gintrap.this.wireman(this);
            }
        }

        public abstract boolean marial();

        public boolean wireman(arytenoidectomy arytenoidectomyVar) {
            return false;
        }

        public void saneness() {
        }
    }

    public void cutely() {
    }

    public void taiyuan() {
    }
}
