package p002kotlin.reflect.jvm.internal.impl.types.checker;

import byname.saneness;
import java.util.Collection;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.competently;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;

/* JADX INFO: compiled from: KotlinTypeRefiner.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class beachfront extends competently {

    /* JADX INFO: compiled from: KotlinTypeRefiner.kt */
    public static final class attabal extends beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f31721attabal = new attabal();

        @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront
        public Collection<oilcan> competently(wireman classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Collection<oilcan> collectionCutely = classDescriptor.impromptu().cutely();
            Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
            return collectionCutely;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront
        public <S extends MemberScope> S dern(wireman classDescriptor, Function0<? extends S> compute) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(compute, "compute");
            return compute.invoke();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.competently
        /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
        public oilcan attabal(presbytery.competently type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return (oilcan) type;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront
        public boolean marial(permissivist typeConstructor) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront
        public wireman saneness(saneness classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            return null;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public wireman beachfront(apical descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return null;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront
        public boolean wireman(trm moduleDescriptor) {
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            return false;
        }
    }

    public abstract p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfront(apical apicalVar);

    public abstract Collection<oilcan> competently(wireman wiremanVar);

    public abstract <S extends MemberScope> S dern(wireman wiremanVar, Function0<? extends S> function0);

    /* JADX INFO: renamed from: impromptu */
    public abstract oilcan attabal(presbytery.competently competentlyVar);

    public abstract boolean marial(permissivist permissivistVar);

    public abstract wireman saneness(saneness sanenessVar);

    public abstract boolean wireman(trm trmVar);
}
