package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.dern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kurbash.formularize;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.merc;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.supplicat;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.saneness;
import yeast.apical;
import yeast.impromptu;

/* JADX INFO: compiled from: LazyPackageViewDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public class LazyPackageViewDescriptorImpl extends taiyuan implements merc {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29968adultoid = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(LazyPackageViewDescriptorImpl.class), "empty", "getEmpty()Z"))};

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final ModuleDescriptorImpl f29969arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final MemberScope f29970graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final impromptu f29971molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final dern f29972monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final impromptu f29973polloi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(ModuleDescriptorImpl module, dern fqName, yeast.formularize storageManager) {
        super(marial.f29950impromptu.saneness(), fqName.impromptu());
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f29969arytenoidectomy = module;
        this.f29972monoploid = fqName;
        this.f29973polloi = storageManager.dern(new Function0<List<? extends sealless>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$fragments$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends sealless> invoke() {
                return supplicat.dern(this.this$0.monroe().lampshade(), this.this$0.marial());
            }
        });
        this.f29971molybdenite = storageManager.dern(new Function0<Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$empty$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(supplicat.saneness(this.this$0.monroe().lampshade(), this.this$0.marial()));
            }
        });
        this.f29970graveside = new LazyScopeAdapter(storageManager, new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$memberScope$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final MemberScope invoke() {
                if (this.this$0.isEmpty()) {
                    return MemberScope.attabal.f31367saneness;
                }
                List<sealless> listMilliradian = this.this$0.milliradian();
                ArrayList arrayList = new ArrayList(dovishness.gintrap(listMilliradian, 10));
                Iterator<T> it = listMilliradian.iterator();
                while (it.hasNext()) {
                    arrayList.add(((sealless) it.next()).formularize());
                }
                List listClaque = CollectionsKt.claque(arrayList, new yemenite(this.this$0.monroe(), this.this$0.marial()));
                return saneness.f31385wireman.attabal("package view scope for " + this.this$0.marial() + " in " + this.this$0.monroe().getName(), listClaque);
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.merc
    /* JADX INFO: renamed from: dhss, reason: merged with bridge method [inline-methods] */
    public ModuleDescriptorImpl monroe() {
        return this.f29969arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> visitor, D d) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.saneness(this, d);
    }

    public boolean equals(Object obj) {
        merc mercVar = obj instanceof merc ? (merc) obj : null;
        return mercVar != null && Intrinsics.wireman(marial(), mercVar.marial()) && Intrinsics.wireman(monroe(), mercVar.monroe());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.merc
    public MemberScope formularize() {
        return this.f29970graveside;
    }

    public int hashCode() {
        return (monroe().hashCode() * 31) + marial().hashCode();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.merc
    public boolean isEmpty() {
        return outmarry();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.merc
    public dern marial() {
        return this.f29972monoploid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.merc
    public List<sealless> milliradian() {
        return (List) apical.attabal(this.f29973polloi, this, f29968adultoid[0]);
    }

    public final boolean outmarry() {
        return ((Boolean) apical.attabal(this.f29971molybdenite, this, f29968adultoid[1])).booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    /* JADX INFO: renamed from: unconsolidated, reason: merged with bridge method [inline-methods] */
    public merc saneness() {
        if (marial().wireman()) {
            return null;
        }
        ModuleDescriptorImpl moduleDescriptorImplMonroe = monroe();
        dern dernVarMarial = marial().marial();
        Intrinsics.checkNotNullExpressionValue(dernVarMarial, "parent(...)");
        return moduleDescriptorImplMonroe.hydrovane(dernVarMarial);
    }
}
