package p002kotlin.reflect.jvm.internal.impl.builtins.jvm;

import byname.dern;
import byname.marial;
import byname.wireman;
import discontentedness.saneness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kurbash.formularize;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.creditor;
import p002kotlin.collections.graveside;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import yeast.impromptu;

/* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JvmBuiltInClassDescriptorFactory implements saneness {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final marial f29815competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final byname.saneness f29816impromptu;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trm f29819attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final impromptu f29820dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Function1<trm, apical> f29821saneness;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29817marial = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final attabal f29818wireman = new attabal(null);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final dern f29814beachfront = competently.f29682preprohormone;

    /* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final byname.saneness attabal() {
            return JvmBuiltInClassDescriptorFactory.f29816impromptu;
        }

        public attabal() {
        }
    }

    static {
        wireman wiremanVar = competently.attabal.f29779wireman;
        marial marialVarTaiyuan = wiremanVar.taiyuan();
        Intrinsics.checkNotNullExpressionValue(marialVarTaiyuan, "shortName(...)");
        f29815competently = marialVarTaiyuan;
        byname.saneness sanenessVarImpassible = byname.saneness.impassible(wiremanVar.formularize());
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
        f29816impromptu = sanenessVarImpassible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(final yeast.formularize storageManager, trm moduleDescriptor, Function1<? super trm, ? extends apical> computeContainingDeclaration) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(computeContainingDeclaration, "computeContainingDeclaration");
        this.f29819attabal = moduleDescriptor;
        this.f29821saneness = computeContainingDeclaration;
        this.f29820dern = storageManager.dern(new Function0<p002kotlin.reflect.jvm.internal.impl.descriptors.impl.competently>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$cloneable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final p002kotlin.reflect.jvm.internal.impl.descriptors.impl.competently invoke() {
                p002kotlin.reflect.jvm.internal.impl.descriptors.impl.competently competentlyVar = new p002kotlin.reflect.jvm.internal.impl.descriptors.impl.competently((apical) this.this$0.f29821saneness.invoke(this.this$0.f29819attabal), JvmBuiltInClassDescriptorFactory.f29815competently, Modality.ABSTRACT, ClassKind.INTERFACE, graveside.marial(this.this$0.f29819attabal.apical().taiyuan()), walach.f30274attabal, false, storageManager);
                competentlyVar.dhss(new attabal(storageManager, competentlyVar), creditor.marial(), null);
                return competentlyVar;
            }
        });
    }

    @Override // discontentedness.saneness
    public Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.wireman> attabal(dern packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return Intrinsics.wireman(packageFqName, f29814beachfront) ? privatdozent.wireman(taiyuan()) : creditor.marial();
    }

    @Override // discontentedness.saneness
    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman dern(byname.saneness classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (Intrinsics.wireman(classId, f29816impromptu)) {
            return taiyuan();
        }
        return null;
    }

    @Override // discontentedness.saneness
    public boolean saneness(dern packageFqName, marial name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.wireman(name, f29815competently) && Intrinsics.wireman(packageFqName, f29814beachfront);
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.impl.competently taiyuan() {
        return (p002kotlin.reflect.jvm.internal.impl.descriptors.impl.competently) yeast.apical.attabal(this.f29820dern, this, f29817marial[0]);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(yeast.formularize formularizeVar, trm trmVar, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(formularizeVar, trmVar, (i & 4) != 0 ? new Function1<trm, p002kotlin.reflect.jvm.internal.impl.builtins.attabal>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.1
            @Override // p002kotlin.jvm.functions.Function1
            public final p002kotlin.reflect.jvm.internal.impl.builtins.attabal invoke(trm module) {
                Intrinsics.checkNotNullParameter(module, "module");
                List<sealless> listMilliradian = module.hydrovane(JvmBuiltInClassDescriptorFactory.f29814beachfront).milliradian();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMilliradian) {
                    if (obj instanceof p002kotlin.reflect.jvm.internal.impl.builtins.attabal) {
                        arrayList.add(obj);
                    }
                }
                return (p002kotlin.reflect.jvm.internal.impl.builtins.attabal) CollectionsKt.lerp(arrayList);
            }
        } : function1);
    }
}
