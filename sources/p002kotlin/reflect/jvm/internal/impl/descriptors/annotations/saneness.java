package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: compiled from: AnnotatedImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class saneness implements attabal {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final marial f29953kowloon;

    public saneness(marial marialVar) {
        if (marialVar == null) {
            timberyard(0);
        }
        this.f29953kowloon = marialVar;
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public marial getAnnotations() {
        marial marialVar = this.f29953kowloon;
        if (marialVar == null) {
            timberyard(1);
        }
        return marialVar;
    }
}
