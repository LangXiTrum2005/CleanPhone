package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import byname.marial;
import discontentedly.saneness;
import java.util.Collection;
import java.util.List;
import kurbash.formularize;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import yeast.apical;
import yeast.impromptu;

/* JADX INFO: compiled from: StaticScopeForKotlinEnum.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class StaticScopeForKotlinEnum extends beachfront {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f31368beachfront = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(StaticScopeForKotlinEnum.class), "properties", "getProperties()Ljava/util/List;"))};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f31369dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final impromptu f31370marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f31371saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final impromptu f31372wireman;

    public StaticScopeForKotlinEnum(yeast.formularize storageManager, wireman containingClass, boolean z) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f31371saneness = containingClass;
        this.f31369dern = z;
        containingClass.getKind();
        ClassKind classKind = ClassKind.CLASS;
        this.f31372wireman = storageManager.dern(new Function0<List<? extends hydrovane>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$functions$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends hydrovane> invoke() {
                return adultoid.kowloon(p002kotlin.reflect.jvm.internal.impl.resolve.wireman.competently(this.this$0.f31371saneness), p002kotlin.reflect.jvm.internal.impl.resolve.wireman.impromptu(this.this$0.f31371saneness));
            }
        });
        this.f31370marial = storageManager.dern(new Function0<List<? extends saran>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$properties$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends saran> invoke() {
                return this.this$0.f31369dern ? adultoid.arytenoidectomy(p002kotlin.reflect.jvm.internal.impl.resolve.wireman.beachfront(this.this$0.f31371saneness)) : adultoid.formularize();
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public List<CallableMemberDescriptor> competently(wireman kindFilter, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.unconsolidated(impassible(), triweekly());
    }

    public Void cutely(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<saran> dern(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List<saran> listTriweekly = triweekly();
        lyreflower.marial marialVar = new lyreflower.marial();
        for (Object obj : listTriweekly) {
            if (Intrinsics.wireman(((saran) obj).getName(), name)) {
                marialVar.add(obj);
            }
        }
        return marialVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
    public lyreflower.marial<hydrovane> saneness(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List<hydrovane> listImpassible = impassible();
        lyreflower.marial<hydrovane> marialVar = new lyreflower.marial<>();
        for (Object obj : listImpassible) {
            if (Intrinsics.wireman(((hydrovane) obj).getName(), name)) {
                marialVar.add(obj);
            }
        }
        return marialVar;
    }

    public final List<hydrovane> impassible() {
        return (List) apical.attabal(this.f31372wireman, this, f31368beachfront[0]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public /* bridge */ /* synthetic */ beachfront marial(marial marialVar, saneness sanenessVar) {
        return (beachfront) cutely(marialVar, sanenessVar);
    }

    public final List<saran> triweekly() {
        return (List) apical.attabal(this.f31370marial, this, f31368beachfront[1]);
    }
}
