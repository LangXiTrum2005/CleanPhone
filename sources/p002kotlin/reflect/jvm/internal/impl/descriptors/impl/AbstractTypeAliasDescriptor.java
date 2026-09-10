package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kurbash.formularize;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;
import yeast.impromptu;

/* JADX INFO: compiled from: AbstractTypeAliasDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractTypeAliasDescriptor extends cutely implements overspeculate {

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29961gintrap = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(AbstractTypeAliasDescriptor.class), "constructors", "getConstructors()Ljava/util/Collection;"))};

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public List<? extends clubfoot> f29962adultoid;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final attabal f29963dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final impromptu f29964graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final molybdenite f29965molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final yeast.formularize f29966polloi;

    /* JADX INFO: compiled from: AbstractTypeAliasDescriptor.kt */
    public static final class attabal implements permissivist {
        public attabal() {
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public beachfront apical() {
            return DescriptorUtilsKt.cutely(wireman());
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public permissivist attabal(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
        public overspeculate wireman() {
            return AbstractTypeAliasDescriptor.this;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public Collection<oilcan> cutely() {
            Collection<oilcan> collectionCutely = wireman().underbelly().setterwort().cutely();
            Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
            return collectionCutely;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public List<clubfoot> getParameters() {
            return AbstractTypeAliasDescriptor.this.setterwort();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public boolean marial() {
            return true;
        }

        public String toString() {
            return "[typealias " + wireman().getName().dern() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor(yeast.formularize storageManager, apical containingDeclaration, marial annotations, byname.marial name, walach sourceElement, molybdenite visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        Intrinsics.checkNotNullParameter(visibilityImpl, "visibilityImpl");
        this.f29966polloi = storageManager;
        this.f29965molybdenite = visibilityImpl;
        this.f29964graveside = storageManager.dern(new Function0<Collection<? extends sealless>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$constructors$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Collection<? extends sealless> invoke() {
                return this.this$0.vesuvio();
            }
        });
        this.f29963dovishness = new attabal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean coffeecake() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely
    /* JADX INFO: renamed from: dhss, reason: merged with bridge method [inline-methods] */
    public overspeculate attabal() {
        triweekly triweeklyVarAttabal = super.attabal();
        Intrinsics.competently(triweeklyVarAttabal, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (overspeculate) triweeklyVarAttabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> visitor, D d) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.wireman(this, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public molybdenite getVisibility() {
        return this.f29965molybdenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public boolean gintrap() {
        return nosophobia.dern(underbelly(), new Function1<empress, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$isInner$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0025  */
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(empress empressVar) {
                boolean z;
                Intrinsics.beachfront(empressVar);
                if (yemenite.attabal(empressVar)) {
                    z = false;
                } else {
                    AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = this.this$0;
                    p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = empressVar.setterwort().wireman();
                    if (!(beachfrontVarWireman instanceof clubfoot) || Intrinsics.wireman(((clubfoot) beachfrontVarWireman).saneness(), abstractTypeAliasDescriptor)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public permissivist impromptu() {
        return this.f29963dovishness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean isExternal() {
        return false;
    }

    public final void mastfed(List<? extends clubfoot> declaredTypeParameters) {
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        this.f29962adultoid = declaredTypeParameters;
    }

    public final merc outmarry() {
        MemberScope memberScopeWalach;
        wireman wiremanVarArytenoidectomy = arytenoidectomy();
        if (wiremanVarArytenoidectomy == null || (memberScopeWalach = wiremanVarArytenoidectomy.walach()) == null) {
            memberScopeWalach = MemberScope.attabal.f31367saneness;
        }
        merc mercVarAdultoid = nosophobia.adultoid(this, memberScopeWalach, new Function1<p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront, merc>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$computeDefaultType$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final merc invoke(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront beachfrontVar) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarBeachfront = beachfrontVar.beachfront(this.this$0);
                if (beachfrontVarBeachfront != null) {
                    return beachfrontVarBeachfront.impassible();
                }
                return null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(mercVarAdultoid, "makeUnsubstitutedType(...)");
        return mercVarAdultoid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean peridotite() {
        return false;
    }

    public abstract List<clubfoot> setterwort();

    public final yeast.formularize supplicat() {
        return this.f29966polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.taiyuan
    public String toString() {
        return "typealias " + getName().dern();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public List<clubfoot> triweekly() {
        List list = this.f29962adultoid;
        if (list != null) {
            return list;
        }
        Intrinsics.preprohormone("declaredTypeParametersImpl");
        return null;
    }

    public final Collection<sealless> vesuvio() {
        wireman wiremanVarArytenoidectomy = arytenoidectomy();
        if (wiremanVarArytenoidectomy == null) {
            return adultoid.formularize();
        }
        Collection<dern> collectionTaiyuan = wiremanVarArytenoidectomy.taiyuan();
        Intrinsics.checkNotNullExpressionValue(collectionTaiyuan, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (dern dernVar : collectionTaiyuan) {
            TypeAliasConstructorDescriptorImpl.attabal attabalVar = TypeAliasConstructorDescriptorImpl.f29985splinterproof;
            yeast.formularize formularizeVar = this.f29966polloi;
            Intrinsics.beachfront(dernVar);
            sealless seallessVarSaneness = attabalVar.saneness(formularizeVar, this, dernVar);
            if (seallessVarSaneness != null) {
                arrayList.add(seallessVarSaneness);
            }
        }
        return arrayList;
    }
}
