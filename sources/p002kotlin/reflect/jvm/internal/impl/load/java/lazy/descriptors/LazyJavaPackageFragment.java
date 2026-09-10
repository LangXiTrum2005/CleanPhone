package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.dern;
import byname.saneness;
import genesic.adultoid;
import genesic.competently;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kurbash.formularize;
import p002kotlin.Pair;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.gintrap;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid;
import yeast.apical;
import yeast.impromptu;

/* JADX INFO: compiled from: LazyJavaPackageFragment.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaPackageFragment extends gintrap {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f30527stratoscope = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final wireman f30528adultoid;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final marial f30529cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final impromptu f30530cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final foreshot.marial f30531dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final impromptu f30532gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final adultoid f30533graveside;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final impromptu<List<dern>> f30534preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final JvmPackageScope f30535rotuma;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(wireman outerContext, adultoid jPackage) {
        super(outerContext.wireman(), jPackage.marial());
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        this.f30533graveside = jPackage;
        wireman wiremanVarWireman = ContextKt.wireman(outerContext, this, null, 0, 6, null);
        this.f30528adultoid = wiremanVarWireman;
        this.f30531dovishness = lyreflower.dern.attabal(outerContext.attabal().saneness().wireman().competently());
        this.f30532gintrap = wiremanVarWireman.marial().dern(new Function0<Map<String, ? extends monoploid>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$binaryClasses$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Map<String, ? extends monoploid> invoke() {
                p002kotlin.reflect.jvm.internal.impl.load.kotlin.gintrap gintrapVarKowloon = this.this$0.f30528adultoid.attabal().kowloon();
                String strSaneness = this.this$0.marial().saneness();
                Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
                List<String> listAttabal = gintrapVarKowloon.attabal(strSaneness);
                LazyJavaPackageFragment lazyJavaPackageFragment = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (String str : listAttabal) {
                    saneness sanenessVarImpassible = saneness.impassible(iaido.wireman.wireman(str).marial());
                    Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
                    monoploid monoploidVarAttabal = arytenoidectomy.attabal(lazyJavaPackageFragment.f30528adultoid.attabal().cutely(), sanenessVarImpassible, lazyJavaPackageFragment.f30531dovishness);
                    Pair pairAttabal = monoploidVarAttabal != null ? patroclinal.formularize.attabal(str, monoploidVarAttabal) : null;
                    if (pairAttabal != null) {
                        arrayList.add(pairAttabal);
                    }
                }
                return seminary.dovishness(arrayList);
            }
        });
        this.f30535rotuma = new JvmPackageScope(wiremanVarWireman, jPackage, this);
        this.f30534preprohormone = wiremanVarWireman.marial().saneness(new Function0<List<? extends dern>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$subPackages$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends dern> invoke() {
                Collection<adultoid> collectionAdultoid = this.this$0.f30533graveside.adultoid();
                ArrayList arrayList = new ArrayList(dovishness.gintrap(collectionAdultoid, 10));
                Iterator<T> it = collectionAdultoid.iterator();
                while (it.hasNext()) {
                    arrayList.add(((adultoid) it.next()).marial());
                }
                return arrayList;
            }
        }, p002kotlin.collections.adultoid.formularize());
        this.f30529cord = wiremanVarWireman.attabal().taiyuan().saneness() ? marial.f29950impromptu.saneness() : p002kotlin.reflect.jvm.internal.impl.load.java.lazy.dern.attabal(wiremanVarWireman, jPackage);
        this.f30530cuirassed = wiremanVarWireman.marial().dern(new Function0<HashMap<iaido.wireman, iaido.wireman>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2

            /* JADX INFO: compiled from: LazyJavaPackageFragment.kt */
            public /* synthetic */ class attabal {

                /* JADX INFO: renamed from: attabal, reason: collision with root package name */
                public static final /* synthetic */ int[] f30536attabal;

                static {
                    int[] iArr = new int[KotlinClassHeader.Kind.values().length];
                    try {
                        iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f30536attabal = iArr;
                }
            }

            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final HashMap<iaido.wireman, iaido.wireman> invoke() {
                HashMap<iaido.wireman, iaido.wireman> map = new HashMap<>();
                for (Map.Entry<String, monoploid> entry : this.this$0.mastfed().entrySet()) {
                    String key = entry.getKey();
                    monoploid value = entry.getValue();
                    iaido.wireman wiremanVarWireman2 = iaido.wireman.wireman(key);
                    Intrinsics.checkNotNullExpressionValue(wiremanVarWireman2, "byInternalName(...)");
                    KotlinClassHeader kotlinClassHeaderSaneness = value.saneness();
                    int i = attabal.f30536attabal[kotlinClassHeaderSaneness.dern().ordinal()];
                    if (i == 1) {
                        String strMarial = kotlinClassHeaderSaneness.marial();
                        if (strMarial != null) {
                            iaido.wireman wiremanVarWireman3 = iaido.wireman.wireman(strMarial);
                            Intrinsics.checkNotNullExpressionValue(wiremanVarWireman3, "byInternalName(...)");
                            map.put(wiremanVarWireman2, wiremanVarWireman3);
                        }
                    } else if (i == 2) {
                        map.put(wiremanVarWireman2, wiremanVarWireman2);
                    }
                }
                return map;
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.sealless
    /* JADX INFO: renamed from: attendance, reason: merged with bridge method [inline-methods] */
    public JvmPackageScope formularize() {
        return this.f30535rotuma;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.gintrap, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely, p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly
    public walach competently() {
        return new p002kotlin.reflect.jvm.internal.impl.load.kotlin.polloi(this);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.saneness, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public marial getAnnotations() {
        return this.f30529cord;
    }

    public final List<dern> homozygous() {
        return this.f30534preprohormone.invoke();
    }

    public final Map<String, monoploid> mastfed() {
        return (Map) apical.attabal(this.f30532gintrap, this, f30527stratoscope[0]);
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman setterwort(competently jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return this.f30535rotuma.cutely().creditor(jClass);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.gintrap, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.taiyuan
    public String toString() {
        return "Lazy Java package fragment: " + marial() + " of module " + this.f30528adultoid.attabal().impassible();
    }
}
