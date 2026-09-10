package p002kotlin.reflect.jvm.internal.impl.load.java.lazy;

import genesic.cord;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.load.java.polloi;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ContextKt {
    public static final wireman attabal(wireman wiremanVar, apical apicalVar, cord cordVar, int i, taiyuan<polloi> taiyuanVar) {
        return new wireman(wiremanVar.attabal(), cordVar != null ? new LazyJavaTypeParameterResolver(wiremanVar, apicalVar, cordVar, i) : wiremanVar.beachfront(), taiyuanVar);
    }

    public static /* synthetic */ wireman beachfront(wireman wiremanVar, apical apicalVar, cord cordVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return marial(wiremanVar, apicalVar, cordVar, i);
    }

    public static final polloi competently(wireman wiremanVar, marial additionalAnnotations) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return wiremanVar.attabal().attabal().dern(wiremanVar.saneness(), additionalAnnotations);
    }

    public static final wireman dern(final wireman wiremanVar, final p002kotlin.reflect.jvm.internal.impl.descriptors.marial containingDeclaration, cord cordVar, int i) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        return attabal(wiremanVar, containingDeclaration, cordVar, i, saneness.attabal(LazyThreadSafetyMode.NONE, new Function0<polloi>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$childForClassOrPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final polloi invoke() {
                return ContextKt.competently(wiremanVar, containingDeclaration.getAnnotations());
            }
        }));
    }

    public static final wireman impromptu(final wireman wiremanVar, final marial additionalAnnotations) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? wiremanVar : new wireman(wiremanVar.attabal(), wiremanVar.beachfront(), saneness.attabal(LazyThreadSafetyMode.NONE, new Function0<polloi>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$copyWithNewDefaultTypeQualifiers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final polloi invoke() {
                return ContextKt.competently(wiremanVar, additionalAnnotations);
            }
        }));
    }

    public static final wireman marial(wireman wiremanVar, apical containingDeclaration, cord typeParameterOwner, int i) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        return attabal(wiremanVar, containingDeclaration, typeParameterOwner, i, wiremanVar.dern());
    }

    public static final wireman saneness(wireman wiremanVar, competently typeParameterResolver) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        return new wireman(wiremanVar.attabal(), typeParameterResolver, wiremanVar.dern());
    }

    public static final wireman taiyuan(wireman wiremanVar, attabal components) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return new wireman(components, wiremanVar.beachfront(), wiremanVar.dern());
    }

    public static /* synthetic */ wireman wireman(wireman wiremanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.marial marialVar, cord cordVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            cordVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return dern(wiremanVar, marialVar, cordVar, i);
    }
}
