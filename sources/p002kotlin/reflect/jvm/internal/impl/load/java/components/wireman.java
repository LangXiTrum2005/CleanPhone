package p002kotlin.reflect.jvm.internal.impl.load.java.components;

import byname.dern;
import genesic.competently;
import genesic.formularize;
import genesic.monoploid;
import genesic.triweekly;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;

/* JADX INFO: compiled from: JavaResolverCache.java */
/* JADX INFO: loaded from: classes5.dex */
public interface wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f30394attabal = new attabal();

    /* JADX INFO: compiled from: JavaResolverCache.java */
    public static class attabal implements wireman {
        public static /* synthetic */ void beachfront(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman
        public void attabal(monoploid monoploidVar, hydrovane hydrovaneVar) {
            if (monoploidVar == null) {
                beachfront(1);
            }
            if (hydrovaneVar == null) {
                beachfront(2);
            }
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman
        public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman dern(dern dernVar) {
            if (dernVar != null) {
                return null;
            }
            beachfront(0);
            return null;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman
        public void marial(competently competentlyVar, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
            if (competentlyVar == null) {
                beachfront(7);
            }
            if (wiremanVar == null) {
                beachfront(8);
            }
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman
        public void saneness(formularize formularizeVar, cutely cutelyVar) {
            if (formularizeVar == null) {
                beachfront(3);
            }
            if (cutelyVar == null) {
                beachfront(4);
            }
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman
        public void wireman(triweekly triweeklyVar, saran saranVar) {
            if (triweeklyVar == null) {
                beachfront(5);
            }
            if (saranVar == null) {
                beachfront(6);
            }
        }
    }

    void attabal(monoploid monoploidVar, hydrovane hydrovaneVar);

    p002kotlin.reflect.jvm.internal.impl.descriptors.wireman dern(dern dernVar);

    void marial(competently competentlyVar, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar);

    void saneness(formularize formularizeVar, cutely cutelyVar);

    void wireman(triweekly triweeklyVar, saran saranVar);
}
