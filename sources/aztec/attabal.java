package aztec;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: GlobalTinkFlags.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f14815attabal = new C0126attabal(false);

    /* JADX INFO: renamed from: aztec.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GlobalTinkFlags.java */
    public static class C0126attabal implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final AtomicBoolean f14816attabal;

        public C0126attabal(boolean z) {
            this.f14816attabal = new AtomicBoolean(z);
        }

        @Override // aztec.dern
        public boolean getValue() {
            return this.f14816attabal.get();
        }
    }
}
