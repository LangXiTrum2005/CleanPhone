package androidx.media3.common;

import com.ironsource.mediationsdk.logger.IronSourceError;
import decarock.grimness;

/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f10847attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f10848dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f10849saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f10850wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final formularize f10845marial = new saneness(0).marial();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final String f10842beachfront = grimness.igbo(0);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final String f10843competently = grimness.igbo(1);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final String f10844impromptu = grimness.igbo(2);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final String f10846taiyuan = grimness.igbo(3);

    /* JADX INFO: compiled from: DeviceInfo.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f10851attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f10852dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f10853saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public String f10854wireman;

        public saneness(int i) {
            this.f10851attabal = i;
        }

        public saneness beachfront(int i) {
            this.f10852dern = i;
            return this;
        }

        public saneness competently(int i) {
            this.f10853saneness = i;
            return this;
        }

        public formularize marial() {
            decarock.attabal.attabal(this.f10853saneness <= this.f10852dern);
            return new formularize(this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof formularize)) {
            return false;
        }
        formularize formularizeVar = (formularize) obj;
        return this.f10847attabal == formularizeVar.f10847attabal && this.f10849saneness == formularizeVar.f10849saneness && this.f10848dern == formularizeVar.f10848dern && grimness.dern(this.f10850wireman, formularizeVar.f10850wireman);
    }

    public int hashCode() {
        int i = (((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f10847attabal) * 31) + this.f10849saneness) * 31) + this.f10848dern) * 31;
        String str = this.f10850wireman;
        return i + (str == null ? 0 : str.hashCode());
    }

    public formularize(saneness sanenessVar) {
        this.f10847attabal = sanenessVar.f10851attabal;
        this.f10849saneness = sanenessVar.f10853saneness;
        this.f10848dern = sanenessVar.f10852dern;
        this.f10850wireman = sanenessVar.f10854wireman;
    }
}
