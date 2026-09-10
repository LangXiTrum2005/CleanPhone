package imposure;

/* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wireman {

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final wireman f28501attabal = new C0650attabal();

        /* JADX INFO: renamed from: imposure.wireman$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
        public class C0650attabal extends wireman {
            public C0650attabal() {
                super(null);
            }

            @Override // imposure.wireman
            public int dern() {
                return 16;
            }

            @Override // imposure.wireman
            public boolean saneness() {
                return true;
            }
        }
    }

    public wireman() {
    }

    public static wireman attabal() {
        return attabal.f28501attabal;
    }

    public abstract int dern();

    public abstract boolean saneness();

    public /* synthetic */ wireman(byte[] bArr) {
        this();
    }
}
