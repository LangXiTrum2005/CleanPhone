package p002kotlin.reflect.jvm.internal.impl.load.java.components;

import genesic.polloi;
import java.util.Collections;
import java.util.List;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: SignaturePropagator.java */
/* JADX INFO: loaded from: classes5.dex */
public interface marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final marial f30382attabal = new attabal();

    /* JADX INFO: compiled from: SignaturePropagator.java */
    public static class attabal implements marial {
        public static /* synthetic */ void dern(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.load.java.components.marial
        public void attabal(CallableMemberDescriptor callableMemberDescriptor, List<String> list) {
            if (callableMemberDescriptor == null) {
                dern(5);
            }
            if (list == null) {
                dern(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.load.java.components.marial
        public saneness saneness(polloi polloiVar, wireman wiremanVar, oilcan oilcanVar, oilcan oilcanVar2, List<cultivated> list, List<clubfoot> list2) {
            if (polloiVar == null) {
                dern(0);
            }
            if (wiremanVar == null) {
                dern(1);
            }
            if (oilcanVar == null) {
                dern(2);
            }
            if (list == null) {
                dern(3);
            }
            if (list2 == null) {
                dern(4);
            }
            return new saneness(oilcanVar, oilcanVar2, list, list2, Collections.EMPTY_LIST, false);
        }
    }

    /* JADX INFO: compiled from: SignaturePropagator.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final oilcan f30383attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final boolean f30384beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final List<cultivated> f30385dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final List<String> f30386marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final oilcan f30387saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final List<clubfoot> f30388wireman;

        public saneness(oilcan oilcanVar, oilcan oilcanVar2, List<cultivated> list, List<clubfoot> list2, List<String> list3, boolean z) {
            if (oilcanVar == null) {
                attabal(0);
            }
            if (list == null) {
                attabal(1);
            }
            if (list2 == null) {
                attabal(2);
            }
            if (list3 == null) {
                attabal(3);
            }
            this.f30383attabal = oilcanVar;
            this.f30387saneness = oilcanVar2;
            this.f30385dern = list;
            this.f30388wireman = list2;
            this.f30386marial = list3;
            this.f30384beachfront = z;
        }

        public static /* synthetic */ void attabal(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public List<cultivated> beachfront() {
            List<cultivated> list = this.f30385dern;
            if (list == null) {
                attabal(5);
            }
            return list;
        }

        public boolean competently() {
            return this.f30384beachfront;
        }

        public oilcan dern() {
            return this.f30387saneness;
        }

        public List<clubfoot> marial() {
            List<clubfoot> list = this.f30388wireman;
            if (list == null) {
                attabal(6);
            }
            return list;
        }

        public List<String> saneness() {
            List<String> list = this.f30386marial;
            if (list == null) {
                attabal(7);
            }
            return list;
        }

        public oilcan wireman() {
            oilcan oilcanVar = this.f30383attabal;
            if (oilcanVar == null) {
                attabal(4);
            }
            return oilcanVar;
        }
    }

    void attabal(CallableMemberDescriptor callableMemberDescriptor, List<String> list);

    saneness saneness(polloi polloiVar, wireman wiremanVar, oilcan oilcanVar, oilcan oilcanVar2, List<cultivated> list, List<clubfoot> list2);
}
