package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: loaded from: classes7.dex */
public class AnnotatedImpl implements Annotated {
    public final Annotations X;

    public AnnotatedImpl(Annotations annotations) {
        if (annotations != null) {
            this.X = annotations;
        } else {
            Z(0);
            throw null;
        }
    }

    public static /* synthetic */ void Z(int i2) {
        String str = i2 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 1 ? 3 : 2];
        if (i2 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i2 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i2 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.X;
        if (annotations != null) {
            return annotations;
        }
        Z(1);
        throw null;
    }
}
