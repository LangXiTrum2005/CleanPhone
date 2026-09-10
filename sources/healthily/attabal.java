package healthily;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: PackagePartScopeCache.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final DeserializedDescriptorResolver f27600attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ConcurrentHashMap<byname.saneness, MemberScope> f27601dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently f27602saneness;

    public attabal(DeserializedDescriptorResolver resolver, competently kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f27600attabal = resolver;
        this.f27602saneness = kotlinClassFinder;
        this.f27601dern = new ConcurrentHashMap<>();
    }

    public final MemberScope attabal(beachfront fileClass) {
        Collection collectionMarial;
        Intrinsics.checkNotNullParameter(fileClass, "fileClass");
        ConcurrentHashMap<byname.saneness, MemberScope> concurrentHashMap = this.f27601dern;
        byname.saneness sanenessVarCompetently = fileClass.competently();
        MemberScope memberScope = concurrentHashMap.get(sanenessVarCompetently);
        if (memberScope == null) {
            byname.dern dernVarImpromptu = fileClass.competently().impromptu();
            Intrinsics.checkNotNullExpressionValue(dernVarImpromptu, "getPackageFqName(...)");
            if (fileClass.saneness().dern() == KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                List<String> listBeachfront = fileClass.saneness().beachfront();
                collectionMarial = new ArrayList();
                Iterator<T> it = listBeachfront.iterator();
                while (it.hasNext()) {
                    byname.saneness sanenessVarImpassible = byname.saneness.impassible(iaido.wireman.wireman((String) it.next()).marial());
                    Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
                    monoploid monoploidVarAttabal = arytenoidectomy.attabal(this.f27602saneness, sanenessVarImpassible, lyreflower.dern.attabal(this.f27600attabal.wireman().competently()));
                    if (monoploidVarAttabal != null) {
                        collectionMarial.add(monoploidVarAttabal);
                    }
                }
            } else {
                collectionMarial = graveside.marial(fileClass);
            }
            p002kotlin.reflect.jvm.internal.impl.descriptors.impl.formularize formularizeVar = new p002kotlin.reflect.jvm.internal.impl.descriptors.impl.formularize(this.f27600attabal.wireman().monoploid(), dernVarImpromptu);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = collectionMarial.iterator();
            while (it2.hasNext()) {
                MemberScope memberScopeSaneness = this.f27600attabal.saneness(formularizeVar, (monoploid) it2.next());
                if (memberScopeSaneness != null) {
                    arrayList.add(memberScopeSaneness);
                }
            }
            List listMolet = CollectionsKt.molet(arrayList);
            MemberScope memberScopeAttabal = p002kotlin.reflect.jvm.internal.impl.resolve.scopes.saneness.f31385wireman.attabal("package " + dernVarImpromptu + " (" + fileClass + ')', listMolet);
            MemberScope memberScopePutIfAbsent = concurrentHashMap.putIfAbsent(sanenessVarCompetently, memberScopeAttabal);
            memberScope = memberScopePutIfAbsent == null ? memberScopeAttabal : memberScopePutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(memberScope, "getOrPut(...)");
        return memberScope;
    }
}
