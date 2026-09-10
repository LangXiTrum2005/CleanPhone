package retrofit2;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: SkipCallbackExecutorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public final class stratoscope implements cuirassed {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final cuirassed f36574attabal = new stratoscope();

    public static Annotation[] attabal(Annotation[] annotationArr) {
        if (trm.formularize(annotationArr, cuirassed.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f36574attabal;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return cuirassed.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof cuirassed;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + cuirassed.class.getName() + "()";
    }
}
