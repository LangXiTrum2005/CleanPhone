package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.dern;
import byname.marial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import outage.attabal;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polloi;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat;
import p002kotlin.reflect.jvm.internal.impl.descriptors.merc;
import p002kotlin.reflect.jvm.internal.impl.descriptors.rotuma;
import p002kotlin.reflect.jvm.internal.impl.descriptors.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.saneness;
import patroclinal.taiyuan;
import yeast.formularize;

/* JADX INFO: compiled from: ModuleDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ModuleDescriptorImpl extends taiyuan implements trm {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public graveside f29974adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final formularize f29975arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public kattegat f29976dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f29977gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final rotuma f29978graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final Map<stratoscope<?>, Object> f29979molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final beachfront f29980monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final marial f29981polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final taiyuan f29982preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final yeast.beachfront<dern, merc> f29983rotuma;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(marial moduleName, formularize storageManager, beachfront builtIns, attabal attabalVar) {
        this(moduleName, storageManager, builtIns, attabalVar, null, null, 48, null);
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean molet() {
        return this.f29976dovishness != null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public beachfront apical() {
        return this.f29980monoploid;
    }

    public void attendance() {
        if (sakeen()) {
            return;
        }
        rotuma.attabal(this);
    }

    public final void basify(List<ModuleDescriptorImpl> descriptors, Set<ModuleDescriptorImpl> friends) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        Intrinsics.checkNotNullParameter(friends, "friends");
        tectonization(new adultoid(descriptors, friends, adultoid.formularize(), creditor.marial()));
    }

    public final void deadwork(kattegat providerForModuleContent) {
        Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
        molet();
        this.f29976dovishness = providerForModuleContent;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> impassibleVar, D d) {
        return (R) trm.attabal.attabal(this, impassibleVar, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public <T> T hardpan(stratoscope<T> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        T t = (T) this.f29979molybdenite.get(capability);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final String homozygous() {
        String string = getName().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public merc hydrovane(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        attendance();
        return this.f29983rotuma.invoke(fqName);
    }

    public final void immediately(List<ModuleDescriptorImpl> descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        basify(descriptors, creditor.marial());
    }

    public final kattegat lampshade() {
        attendance();
        return libyan();
    }

    public final impromptu libyan() {
        return (impromptu) this.f29982preprohormone.getValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public List<trm> palmyra() {
        graveside gravesideVar = this.f29974adultoid;
        if (gravesideVar != null) {
            return gravesideVar.saneness();
        }
        throw new AssertionError("Dependencies of module " + homozygous() + " were not set");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public Collection<dern> polloi(dern fqName, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        attendance();
        return lampshade().polloi(fqName, nameFilter);
    }

    public final void prefect(ModuleDescriptorImpl... descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        immediately(polloi.unconsolidated(descriptors));
    }

    public boolean sakeen() {
        return this.f29977gintrap;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public apical saneness() {
        return trm.attabal.saneness(this);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public boolean sealless(trm targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        if (Intrinsics.wireman(this, targetModule)) {
            return true;
        }
        graveside gravesideVar = this.f29974adultoid;
        Intrinsics.beachfront(gravesideVar);
        return CollectionsKt.permissivist(gravesideVar.dern(), targetModule) || palmyra().contains(targetModule) || targetModule.palmyra().contains(this);
    }

    public final void tectonization(graveside dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.f29974adultoid = dependencies;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.taiyuan
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (!sakeen()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        kattegat kattegatVar = this.f29976dovishness;
        sb.append(kattegatVar != null ? kattegatVar.getClass().getSimpleName() : null);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ ModuleDescriptorImpl(marial marialVar, formularize formularizeVar, beachfront beachfrontVar, attabal attabalVar, Map map, marial marialVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(marialVar, formularizeVar, beachfrontVar, (i & 8) != 0 ? null : attabalVar, (i & 16) != 0 ? seminary.taiyuan() : map, (i & 32) != 0 ? null : marialVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(marial moduleName, formularize storageManager, beachfront builtIns, attabal attabalVar, Map<stratoscope<?>, ? extends Object> capabilities, marial marialVar) {
        super(p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness(), moduleName);
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.f29975arytenoidectomy = storageManager;
        this.f29980monoploid = builtIns;
        this.f29981polloi = marialVar;
        if (moduleName.apical()) {
            this.f29979molybdenite = capabilities;
            rotuma rotumaVar = (rotuma) hardpan(rotuma.f30160attabal.attabal());
            this.f29978graveside = rotumaVar == null ? rotuma.saneness.f30163saneness : rotumaVar;
            this.f29977gintrap = true;
            this.f29983rotuma = storageManager.taiyuan(new Function1<dern, merc>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packages$1
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public final merc invoke(dern fqName) {
                    Intrinsics.checkNotNullParameter(fqName, "fqName");
                    rotuma rotumaVar2 = this.this$0.f29978graveside;
                    ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
                    return rotumaVar2.attabal(moduleDescriptorImpl, fqName, moduleDescriptorImpl.f29975arytenoidectomy);
                }
            });
            this.f29982preprohormone = saneness.saneness(new Function0<impromptu>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final impromptu invoke() {
                    graveside gravesideVar = this.this$0.f29974adultoid;
                    ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
                    if (gravesideVar == null) {
                        throw new AssertionError("Dependencies of module " + moduleDescriptorImpl.homozygous() + " were not set before querying module content");
                    }
                    List<ModuleDescriptorImpl> listAttabal = gravesideVar.attabal();
                    this.this$0.attendance();
                    listAttabal.contains(this.this$0);
                    List<ModuleDescriptorImpl> list = listAttabal;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((ModuleDescriptorImpl) it.next()).molet();
                    }
                    ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        kattegat kattegatVar = ((ModuleDescriptorImpl) it2.next()).f29976dovishness;
                        Intrinsics.beachfront(kattegatVar);
                        arrayList.add(kattegatVar);
                    }
                    return new impromptu(arrayList, "CompositeProvider@ModuleDescriptor for " + this.this$0.getName());
                }
            });
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}
