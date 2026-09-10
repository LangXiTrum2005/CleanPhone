package p002kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import yeast.formularize;

/* JADX INFO: compiled from: FunctionClassScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern extends GivenFunctionsMemberScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dern(formularize storageManager, saneness containingClass) {
        super(storageManager, containingClass);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public List<dovishness> taiyuan() {
        wireman wiremanVarFormularize = formularize();
        Intrinsics.competently(wiremanVarFormularize, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        marial marialVarSakeen = ((saneness) wiremanVarFormularize).sakeen();
        if (Intrinsics.wireman(marialVarSakeen, marial.attabal.f29796marial)) {
            return graveside.marial(wireman.f29812hydrovane.attabal((saneness) formularize(), false));
        }
        return Intrinsics.wireman(marialVarSakeen, marial.wireman.f29799marial) ? graveside.marial(wireman.f29812hydrovane.attabal((saneness) formularize(), true)) : adultoid.formularize();
    }
}
