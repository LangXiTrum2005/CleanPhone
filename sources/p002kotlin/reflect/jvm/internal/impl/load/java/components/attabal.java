package p002kotlin.reflect.jvm.internal.impl.load.java.components;

import byname.marial;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p002kotlin.reflect.jvm.internal.impl.resolve.impromptu;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly;

/* JADX INFO: compiled from: DescriptorResolverUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DescriptorResolverUtils.java */
    public static class C0678attabal extends impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ triweekly f30377attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ boolean f30378dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Set f30379saneness;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.attabal$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DescriptorResolverUtils.java */
        public class C0679attabal implements Function1<CallableMemberDescriptor, Unit> {
            public C0679attabal() {
            }

            private static /* synthetic */ void attabal(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // p002kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
            public Unit invoke(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    attabal(0);
                }
                C0678attabal.this.f30377attabal.attabal(callableMemberDescriptor);
                return Unit.f29295attabal;
            }
        }

        public C0678attabal(triweekly triweeklyVar, Set set, boolean z) {
            this.f30377attabal = triweeklyVar;
            this.f30379saneness = set;
            this.f30378dern = z;
        }

        private static /* synthetic */ void beachfront(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.taiyuan
        public void attabal(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                beachfront(0);
            }
            OverridingUtil.polder(callableMemberDescriptor, new C0679attabal());
            this.f30379saneness.add(callableMemberDescriptor);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.impromptu
        public void marial(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
            if (callableMemberDescriptor == null) {
                beachfront(1);
            }
            if (callableMemberDescriptor2 == null) {
                beachfront(2);
            }
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.taiyuan
        public void wireman(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection2) {
            if (callableMemberDescriptor == null) {
                beachfront(3);
            }
            if (collection2 == null) {
                beachfront(4);
            }
            if (!this.f30378dern || callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                super.wireman(callableMemberDescriptor, collection2);
            }
        }
    }

    public static /* synthetic */ void attabal(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static <D extends CallableMemberDescriptor> Collection<D> dern(marial marialVar, Collection<D> collection2, Collection<D> collection3, wireman wiremanVar, triweekly triweeklyVar, OverridingUtil overridingUtil, boolean z) {
        if (marialVar == null) {
            attabal(12);
        }
        if (collection2 == null) {
            attabal(13);
        }
        if (collection3 == null) {
            attabal(14);
        }
        if (wiremanVar == null) {
            attabal(15);
        }
        if (triweeklyVar == null) {
            attabal(16);
        }
        if (overridingUtil == null) {
            attabal(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.dovishness(marialVar, collection2, collection3, wiremanVar, new C0678attabal(triweeklyVar, linkedHashSet, z));
        return linkedHashSet;
    }

    public static <D extends CallableMemberDescriptor> Collection<D> marial(marial marialVar, Collection<D> collection2, Collection<D> collection3, wireman wiremanVar, triweekly triweeklyVar, OverridingUtil overridingUtil) {
        if (marialVar == null) {
            attabal(6);
        }
        if (collection2 == null) {
            attabal(7);
        }
        if (collection3 == null) {
            attabal(8);
        }
        if (wiremanVar == null) {
            attabal(9);
        }
        if (triweeklyVar == null) {
            attabal(10);
        }
        if (overridingUtil == null) {
            attabal(11);
        }
        return dern(marialVar, collection2, collection3, wiremanVar, triweeklyVar, overridingUtil, true);
    }

    public static cultivated saneness(marial marialVar, wireman wiremanVar) {
        if (marialVar == null) {
            attabal(19);
        }
        if (wiremanVar == null) {
            attabal(20);
        }
        Collection<dern> collectionTaiyuan = wiremanVar.taiyuan();
        if (collectionTaiyuan.size() != 1) {
            return null;
        }
        for (cultivated cultivatedVar : collectionTaiyuan.iterator().next().beachfront()) {
            if (cultivatedVar.getName().equals(marialVar)) {
                return cultivatedVar;
            }
        }
        return null;
    }

    public static <D extends CallableMemberDescriptor> Collection<D> wireman(marial marialVar, Collection<D> collection2, Collection<D> collection3, wireman wiremanVar, triweekly triweeklyVar, OverridingUtil overridingUtil) {
        if (marialVar == null) {
            attabal(0);
        }
        if (collection2 == null) {
            attabal(1);
        }
        if (collection3 == null) {
            attabal(2);
        }
        if (wiremanVar == null) {
            attabal(3);
        }
        if (triweeklyVar == null) {
            attabal(4);
        }
        if (overridingUtil == null) {
            attabal(5);
        }
        return dern(marialVar, collection2, collection3, wiremanVar, triweeklyVar, overridingUtil, false);
    }
}
