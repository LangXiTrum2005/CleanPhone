package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;

/* JADX INFO: compiled from: TypeAliasExpansion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class walach {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final attabal f31822marial = new attabal(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final walach f31823attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<timberyard> f31824dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final overspeculate f31825saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<clubfoot, timberyard> f31826wireman;

    /* JADX INFO: compiled from: TypeAliasExpansion.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final walach attabal(walach walachVar, overspeculate typeAliasDescriptor, List<? extends timberyard> arguments) {
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            List<clubfoot> parameters = typeAliasDescriptor.impromptu().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List<clubfoot> list = parameters;
            ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((clubfoot) it.next()).attabal());
            }
            return new walach(walachVar, typeAliasDescriptor, arguments, seminary.dovishness(CollectionsKt.fastrack(arrayList, arguments)), null);
        }

        public attabal() {
        }
    }

    public /* synthetic */ walach(walach walachVar, overspeculate overspeculateVar, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(walachVar, overspeculateVar, list, map);
    }

    public final List<timberyard> attabal() {
        return this.f31824dern;
    }

    public final timberyard dern(permissivist constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        beachfront beachfrontVarWireman = constructor.wireman();
        if (beachfrontVarWireman instanceof clubfoot) {
            return this.f31826wireman.get(beachfrontVarWireman);
        }
        return null;
    }

    public final overspeculate saneness() {
        return this.f31825saneness;
    }

    public final boolean wireman(overspeculate descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.wireman(this.f31825saneness, descriptor)) {
            return true;
        }
        walach walachVar = this.f31823attabal;
        return walachVar != null ? walachVar.wireman(descriptor) : false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public walach(walach walachVar, overspeculate overspeculateVar, List<? extends timberyard> list, Map<clubfoot, ? extends timberyard> map) {
        this.f31823attabal = walachVar;
        this.f31825saneness = overspeculateVar;
        this.f31824dern = list;
        this.f31826wireman = map;
    }
}
