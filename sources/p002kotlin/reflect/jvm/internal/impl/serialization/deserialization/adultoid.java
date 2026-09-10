package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import byname.saneness;
import genesis.attabal;
import genesis.dern;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.wireman;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;

/* JADX INFO: compiled from: ProtoBasedClassDataFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class adultoid implements beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f31442attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Function1<saneness, walach> f31443dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f31444saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<saneness, ProtoBuf$Class> f31445wireman;

    /* JADX WARN: Multi-variable type inference failed */
    public adultoid(ProtoBuf$PackageFragment proto, dern nameResolver, attabal metadataVersion, Function1<? super saneness, ? extends walach> classSource) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(classSource, "classSource");
        this.f31442attabal = nameResolver;
        this.f31444saneness = metadataVersion;
        this.f31443dern = classSource;
        List<ProtoBuf$Class> class_List = proto.getClass_List();
        Intrinsics.checkNotNullExpressionValue(class_List, "getClass_List(...)");
        List<ProtoBuf$Class> list = class_List;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wireman.wireman(polder.marial(dovishness.gintrap(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(graveside.attabal(this.f31442attabal, ((ProtoBuf$Class) obj).getFqName()), obj);
        }
        this.f31445wireman = linkedHashMap;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.beachfront
    public marial attabal(saneness classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        ProtoBuf$Class protoBuf$Class = this.f31445wireman.get(classId);
        if (protoBuf$Class == null) {
            return null;
        }
        return new marial(this.f31442attabal, protoBuf$Class, this.f31444saneness, this.f31443dern.invoke(classId));
    }

    public final Collection<saneness> saneness() {
        return this.f31445wireman.keySet();
    }
}
