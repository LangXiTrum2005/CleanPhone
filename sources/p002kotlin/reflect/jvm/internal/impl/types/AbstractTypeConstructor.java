package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.checker.competently;
import p002kotlin.saneness;
import patroclinal.taiyuan;
import yeast.formularize;
import yeast.impromptu;

/* JADX INFO: compiled from: AbstractTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractTypeConstructor extends apical {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f31652dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final impromptu<attabal> f31653saneness;

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    public final class ModuleViewTypeConstructor implements permissivist {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final beachfront f31654attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ AbstractTypeConstructor f31655dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final taiyuan f31656saneness;

        public ModuleViewTypeConstructor(final AbstractTypeConstructor abstractTypeConstructor, beachfront kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f31655dern = abstractTypeConstructor;
            this.f31654attabal = kotlinTypeRefiner;
            this.f31656saneness = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<List<? extends oilcan>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends oilcan> invoke() {
                    return competently.saneness(this.this$0.f31654attabal, abstractTypeConstructor.cutely());
                }
            });
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public p002kotlin.reflect.jvm.internal.impl.builtins.beachfront apical() {
            p002kotlin.reflect.jvm.internal.impl.builtins.beachfront beachfrontVarApical = this.f31655dern.apical();
            Intrinsics.checkNotNullExpressionValue(beachfrontVarApical, "getBuiltIns(...)");
            return beachfrontVarApical;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public permissivist attabal(beachfront kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f31655dern.attabal(kotlinTypeRefiner);
        }

        public final List<oilcan> competently() {
            return (List) this.f31656saneness.getValue();
        }

        public boolean equals(Object obj) {
            return this.f31655dern.equals(obj);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public List<clubfoot> getParameters() {
            List<clubfoot> parameters = this.f31655dern.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f31655dern.hashCode();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
        public List<oilcan> cutely() {
            return competently();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public boolean marial() {
            return this.f31655dern.marial();
        }

        public String toString() {
            return this.f31655dern.toString();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront wireman() {
            return this.f31655dern.wireman();
        }
    }

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Collection<oilcan> f31657attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public List<? extends oilcan> f31658saneness;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(Collection<? extends oilcan> allSupertypes) {
            Intrinsics.checkNotNullParameter(allSupertypes, "allSupertypes");
            this.f31657attabal = allSupertypes;
            this.f31658saneness = graveside.marial(prescient.competently.f35667attabal.formularize());
        }

        public final Collection<oilcan> attabal() {
            return this.f31657attabal;
        }

        public final void dern(List<? extends oilcan> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f31658saneness = list;
        }

        public final List<oilcan> saneness() {
            return this.f31658saneness;
        }
    }

    public AbstractTypeConstructor(formularize storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f31653saneness = storageManager.beachfront(new Function0<attabal>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final AbstractTypeConstructor.attabal invoke() {
                return new AbstractTypeConstructor.attabal(this.this$0.impassible());
            }
        }, new Function1<Boolean, attabal>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$2
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ AbstractTypeConstructor.attabal invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            public final AbstractTypeConstructor.attabal invoke(boolean z) {
                return new AbstractTypeConstructor.attabal(graveside.marial(prescient.competently.f35667attabal.formularize()));
            }
        }, new Function1<attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractTypeConstructor.attabal attabalVar) {
                invoke2(attabalVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AbstractTypeConstructor.attabal supertypes) {
                Intrinsics.checkNotNullParameter(supertypes, "supertypes");
                splinterproof splinterproofVarMonoploid = this.this$0.monoploid();
                AbstractTypeConstructor abstractTypeConstructor = this.this$0;
                Collection<oilcan> collectionAttabal = supertypes.attabal();
                final AbstractTypeConstructor abstractTypeConstructor2 = this.this$0;
                Function1<permissivist, Iterable<? extends oilcan>> function1 = new Function1<permissivist, Iterable<? extends oilcan>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1
                    {
                        super(1);
                    }

                    @Override // p002kotlin.jvm.functions.Function1
                    public final Iterable<oilcan> invoke(permissivist it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return abstractTypeConstructor2.formularize(it, false);
                    }
                };
                final AbstractTypeConstructor abstractTypeConstructor3 = this.this$0;
                List listAttabal = splinterproofVarMonoploid.attabal(abstractTypeConstructor, collectionAttabal, function1, new Function1<oilcan, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2
                    {
                        super(1);
                    }

                    @Override // p002kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(oilcan oilcanVar) {
                        invoke2(oilcanVar);
                        return Unit.f29295attabal;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(oilcan it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        abstractTypeConstructor3.adultoid(it);
                    }
                });
                if (listAttabal.isEmpty()) {
                    oilcan oilcanVarTriweekly = this.this$0.triweekly();
                    List listMarial = oilcanVarTriweekly != null ? graveside.marial(oilcanVarTriweekly) : null;
                    if (listMarial == null) {
                        listMarial = adultoid.formularize();
                    }
                    listAttabal = listMarial;
                }
                if (this.this$0.arytenoidectomy()) {
                    splinterproof splinterproofVarMonoploid2 = this.this$0.monoploid();
                    final AbstractTypeConstructor abstractTypeConstructor4 = this.this$0;
                    Function1<permissivist, Iterable<? extends oilcan>> function2 = new Function1<permissivist, Iterable<? extends oilcan>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.2
                        {
                            super(1);
                        }

                        @Override // p002kotlin.jvm.functions.Function1
                        public final Iterable<oilcan> invoke(permissivist it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return abstractTypeConstructor4.formularize(it, true);
                        }
                    };
                    final AbstractTypeConstructor abstractTypeConstructor5 = this.this$0;
                    splinterproofVarMonoploid2.attabal(abstractTypeConstructor4, listAttabal, function2, new Function1<oilcan, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.3
                        {
                            super(1);
                        }

                        @Override // p002kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(oilcan oilcanVar) {
                            invoke2(oilcanVar);
                            return Unit.f29295attabal;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(oilcan it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            abstractTypeConstructor5.graveside(it);
                        }
                    });
                }
                AbstractTypeConstructor abstractTypeConstructor6 = this.this$0;
                List<oilcan> listMolet = listAttabal instanceof List ? (List) listAttabal : null;
                if (listMolet == null) {
                    listMolet = CollectionsKt.molet(listAttabal);
                }
                supertypes.dern(abstractTypeConstructor6.molybdenite(listMolet));
            }
        });
    }

    public void adultoid(oilcan type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    public boolean arytenoidectomy() {
        return this.f31652dern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public permissivist attabal(beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new ModuleViewTypeConstructor(this, kotlinTypeRefiner);
    }

    public final Collection<oilcan> formularize(permissivist permissivistVar, boolean z) {
        List listUnconsolidated;
        AbstractTypeConstructor abstractTypeConstructor = permissivistVar instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) permissivistVar : null;
        if (abstractTypeConstructor != null && (listUnconsolidated = CollectionsKt.unconsolidated(abstractTypeConstructor.f31653saneness.invoke().attabal(), abstractTypeConstructor.kowloon(z))) != null) {
            return listUnconsolidated;
        }
        Collection<oilcan> collectionCutely = permissivistVar.cutely();
        Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
        return collectionCutely;
    }

    public void graveside(oilcan type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    public abstract Collection<oilcan> impassible();

    public Collection<oilcan> kowloon(boolean z) {
        return adultoid.formularize();
    }

    public List<oilcan> molybdenite(List<oilcan> supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        return supertypes;
    }

    public abstract splinterproof monoploid();

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public List<oilcan> cutely() {
        return this.f31653saneness.invoke().saneness();
    }

    public abstract oilcan triweekly();
}
