package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import byname.dern;
import byname.marial;
import byname.saneness;
import genesis.attabal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.wireman;
import yeast.formularize;

/* JADX INFO: compiled from: DeserializedPackageFragmentImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DeserializedPackageFragmentImpl extends formularize {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final attabal f31427adultoid;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public MemberScope f31428cord;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final wireman f31429dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final genesis.wireman f31430gintrap;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public ProtoBuf$PackageFragment f31431preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final adultoid f31432rotuma;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(dern fqName, formularize storageManager, trm module, ProtoBuf$PackageFragment proto, attabal metadataVersion, wireman wiremanVar) {
        super(fqName, storageManager, module);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f31427adultoid = metadataVersion;
        this.f31429dovishness = wiremanVar;
        ProtoBuf$StringTable strings = proto.getStrings();
        Intrinsics.checkNotNullExpressionValue(strings, "getStrings(...)");
        ProtoBuf$QualifiedNameTable qualifiedNames = proto.getQualifiedNames();
        Intrinsics.checkNotNullExpressionValue(qualifiedNames, "getQualifiedNames(...)");
        genesis.wireman wiremanVar2 = new genesis.wireman(strings, qualifiedNames);
        this.f31430gintrap = wiremanVar2;
        this.f31432rotuma = new adultoid(proto, wiremanVar2, metadataVersion, new Function1<saneness, walach>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$classDataFinder$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final walach invoke(saneness it) {
                Intrinsics.checkNotNullParameter(it, "it");
                wireman wiremanVar3 = this.this$0.f31429dovishness;
                if (wiremanVar3 != null) {
                    return wiremanVar3;
                }
                walach NO_SOURCE = walach.f30274attabal;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                return NO_SOURCE;
            }
        });
        this.f31431preprohormone = proto;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.sealless
    public MemberScope formularize() {
        MemberScope memberScope = this.f31428cord;
        if (memberScope != null) {
            return memberScope;
        }
        Intrinsics.preprohormone("_memberScope");
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.formularize
    /* JADX INFO: renamed from: mastfed, reason: merged with bridge method [inline-methods] */
    public adultoid outmarry() {
        return this.f31432rotuma;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.formularize
    public void vesuvio(impromptu components) {
        Intrinsics.checkNotNullParameter(components, "components");
        ProtoBuf$PackageFragment protoBuf$PackageFragment = this.f31431preprohormone;
        if (protoBuf$PackageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f31431preprohormone = null;
        ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.getPackage();
        Intrinsics.checkNotNullExpressionValue(protoBuf$Package, "getPackage(...)");
        this.f31428cord = new beachfront(this, protoBuf$Package, this.f31430gintrap, this.f31427adultoid, this.f31429dovishness, components, "scope of " + this, new Function0<Collection<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$initialize$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Collection<? extends marial> invoke() {
                Collection<saneness> collectionSaneness = this.this$0.outmarry().saneness();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionSaneness) {
                    saneness sanenessVar = (saneness) obj;
                    if (!sanenessVar.formularize() && !ClassDeserializer.f31421dern.attabal().contains(sanenessVar)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(dovishness.gintrap(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((saneness) it.next()).cutely());
                }
                return arrayList2;
            }
        });
    }
}
