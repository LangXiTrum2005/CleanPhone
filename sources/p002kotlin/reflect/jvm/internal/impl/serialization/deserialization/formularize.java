package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import byname.dern;
import byname.marial;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.gintrap;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* JADX INFO: compiled from: DeserializedPackageFragment.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class formularize extends gintrap {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final yeast.formularize f31576graveside;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public formularize(dern fqName, yeast.formularize storageManager, trm module) {
        super(module, fqName);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f31576graveside = storageManager;
    }

    public boolean dhss(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MemberScope memberScopeFormularize = formularize();
        return (memberScopeFormularize instanceof DeserializedMemberScope) && ((DeserializedMemberScope) memberScopeFormularize).monoploid().contains(name);
    }

    public abstract beachfront outmarry();

    public abstract void vesuvio(impromptu impromptuVar);
}
