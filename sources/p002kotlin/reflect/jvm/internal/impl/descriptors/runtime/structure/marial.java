package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import genesic.saneness;
import java.lang.annotation.Annotation;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class marial implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f30254attabal = new attabal(null);
    private final byname.marial name;

    /* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final marial attabal(Object value, byname.marial marialVar) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (ReflectClassUtilKt.impromptu(value.getClass())) {
                return new kowloon(marialVar, (Enum) value);
            }
            if (value instanceof Annotation) {
                return new beachfront(marialVar, (Annotation) value);
            }
            if (value instanceof Object[]) {
                return new taiyuan(marialVar, (Object[]) value);
            }
            return value instanceof Class ? new apical(marialVar, (Class) value) : new monoploid(marialVar, value);
        }

        public attabal() {
        }
    }

    public /* synthetic */ marial(byname.marial marialVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(marialVar);
    }

    @Override // genesic.saneness
    public byname.marial getName() {
        return this.name;
    }

    public marial(byname.marial marialVar) {
        this.name = marialVar;
    }
}
