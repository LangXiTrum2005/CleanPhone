package p002kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: SourceElement.java */
/* JADX INFO: loaded from: classes5.dex */
public interface walach {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final walach f30274attabal = new attabal();

    /* JADX INFO: compiled from: SourceElement.java */
    public static class attabal implements walach {
        public static /* synthetic */ void wireman(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.walach
        public peridotite saneness() {
            peridotite peridotiteVar = peridotite.f30200attabal;
            if (peridotiteVar == null) {
                wireman(0);
            }
            return peridotiteVar;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    peridotite saneness();
}
