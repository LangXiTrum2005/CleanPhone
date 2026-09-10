package endosteum;

/* JADX INFO: compiled from: LockedResource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class taiyuan<Z> implements cutely<Z>, naming.attabal.beachfront {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final technofreak.competently<taiyuan<?>> f25735molybdenite = naming.attabal.wireman(20, new attabal());

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public cutely<Z> f25736arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final naming.dern f25737kowloon = naming.dern.attabal();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f25738monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f25739polloi;

    /* JADX INFO: compiled from: LockedResource.java */
    public class attabal implements naming.attabal.wireman<taiyuan<?>> {
        @Override // naming.attabal.wireman
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public taiyuan<?> attabal() {
            return new taiyuan<>();
        }
    }

    private void beachfront() {
        this.f25736arytenoidectomy = null;
        f25735molybdenite.attabal(this);
    }

    public static <Z> taiyuan<Z> marial(cutely<Z> cutelyVar) {
        taiyuan<Z> taiyuanVar = (taiyuan) com.bumptech.glide.util.apical.wireman(f25735molybdenite.saneness());
        taiyuanVar.dern(cutelyVar);
        return taiyuanVar;
    }

    @Override // endosteum.cutely
    public synchronized void attabal() {
        this.f25737kowloon.dern();
        this.f25739polloi = true;
        if (!this.f25738monoploid) {
            this.f25736arytenoidectomy.attabal();
            beachfront();
        }
    }

    public synchronized void competently() {
        this.f25737kowloon.dern();
        if (!this.f25738monoploid) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f25738monoploid = false;
        if (this.f25739polloi) {
            attabal();
        }
    }

    public final void dern(cutely<Z> cutelyVar) {
        this.f25739polloi = false;
        this.f25738monoploid = true;
        this.f25736arytenoidectomy = cutelyVar;
    }

    @Override // endosteum.cutely
    public Z get() {
        return this.f25736arytenoidectomy.get();
    }

    @Override // endosteum.cutely
    public int getSize() {
        return this.f25736arytenoidectomy.getSize();
    }

    @Override // endosteum.cutely
    public Class<Z> saneness() {
        return this.f25736arytenoidectomy.saneness();
    }

    @Override // naming.attabal.beachfront
    public naming.dern wireman() {
        return this.f25737kowloon;
    }
}
