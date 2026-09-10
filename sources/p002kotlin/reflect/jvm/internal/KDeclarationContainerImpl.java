package p002kotlin.reflect.jvm.internal;

import byname.marial;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import healthily.apical;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kurbash.formularize;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.polder;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.beachfront;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.calls.impromptu;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.text.MatchResult;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;
import pussyfooter.attabal;

/* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 &2\u00020\u0001:\u0003JKLB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b(\u0010'JG\u0010.\u001a\u0004\u0018\u00010\u001e*\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u0005\u001a\u00020\u00172\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0*2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J?\u00100\u001a\u0004\u0018\u00010\u001e*\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u0005\u001a\u00020\u00172\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0*2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030)H\u0002¢\u0006\u0004\b0\u00101J/\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u0006\u0012\u0002\b\u00030)2\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)02H\u0002¢\u0006\u0004\b3\u00104J1\u00109\u001a\u0002082\u0010\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)052\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u00107\u001a\u00020!H\u0002¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)022\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b;\u0010<J+\u0010?\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\bA\u0010BR\u0018\u0010E\u001a\u0006\u0012\u0002\b\u00030)8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020F0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/beachfront;", "<init>", "()V", "Lbyname/marial;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "cuirassed", "(Lbyname/marial;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;", "gintrap", "", "index", "rotuma", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "scope", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "belonginess", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "preprohormone", "(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;)Ljava/util/Collection;", "", InAppPurchaseMetaData.KEY_SIGNATURE, "graveside", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "polloi", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;", CampaignEx.JSON_KEY_DESC, "Ljava/lang/reflect/Method;", "molybdenite", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "", "isMember", "monoploid", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Constructor;", "kowloon", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "arytenoidectomy", "Ljava/lang/Class;", "", "parameterTypes", "returnType", "isStaticDefault", "oilcan", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "kattegat", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "sealless", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", "result", "isConstructor", "", "triweekly", "(Ljava/util/List;Ljava/lang/String;Z)V", "stratoscope", "(Ljava/lang/String;)Ljava/util/List;", "begin", TtmlNode.END, "yemenite", "(Ljava/lang/String;II)Ljava/lang/Class;", "trm", "(Ljava/lang/String;)Ljava/lang/Class;", "cord", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/cutely;", "dovishness", "()Ljava/util/Collection;", "constructorDescriptors", "attabal", "Data", "MemberBelonginess", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class KDeclarationContainerImpl implements beachfront {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final Class<?> f29479arytenoidectomy = DefaultConstructorMarker.class;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final Regex f29481monoploid = new Regex("<v#(\\d+)>");

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "Lhealthily/apical;", "attabal", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public abstract class Data {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final /* synthetic */ formularize<Object>[] f29482dern = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal moduleData;

        public Data() {
            this.moduleData = triweekly.dern(new Function0<apical>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$moduleData$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p002kotlin.jvm.functions.Function0
                public final apical invoke() {
                    return impassible.attabal(kDeclarationContainerImpl.competently());
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final apical attabal() {
            T tSaneness = this.moduleData.saneness(this, f29482dern[0]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (apical) tSaneness;
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum MemberBelonginess {
        DECLARED,
        INHERITED;


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ attabal f29485arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());

        public final boolean accept(CallableMemberDescriptor member) {
            Intrinsics.checkNotNullParameter(member, "member");
            return member.getKind().isReal() == (this == DECLARED);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$attabal;", "", "<init>", "()V", "Lkotlin/text/Regex;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "attabal", "()Lkotlin/text/Regex;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Regex attabal() {
            return KDeclarationContainerImpl.f29481monoploid;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlin/reflect/jvm/internal/KDeclarationContainerImpl$saneness", "Lkotlin/reflect/jvm/internal/wireman;", "Lkotlin/reflect/jvm/internal/impl/descriptors/cutely;", "descriptor", "", "data", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class saneness extends wireman {
        public saneness(KDeclarationContainerImpl kDeclarationContainerImpl) {
            super(kDeclarationContainerImpl);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.apical, p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
        public KCallableImpl<?> cutely(cutely descriptor, Unit data) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    public static final int adultoid(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public final Constructor<?> arytenoidectomy(String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> clsCompetently = competently();
        ArrayList arrayList = new ArrayList();
        triweekly(arrayList, desc, true);
        Unit unit = Unit.f29295attabal;
        return sealless(clsCompetently, arrayList);
    }

    public Class<?> cord() {
        Class<?> clsCompetently = ReflectClassUtilKt.competently(competently());
        return clsCompetently == null ? competently() : clsCompetently;
    }

    public abstract Collection<saran> cuirassed(marial name);

    public abstract Collection<cutely> dovishness();

    public abstract Collection<dovishness> gintrap(marial name);

    public final saran graveside(String name, String signature) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        MatchResult matchResultMatchEntire = f29481monoploid.matchEntire(signature);
        if (matchResultMatchEntire != null) {
            String str = matchResultMatchEntire.attabal().getMatch().saneness().get(1);
            saran saranVarRotuma = rotuma(Integer.parseInt(str));
            if (saranVarRotuma != null) {
                return saranVarRotuma;
            }
            throw new KotlinReflectionInternalError("Local property #" + str + " not found in " + competently());
        }
        marial marialVarCutely = marial.cutely(name);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        Collection<saran> collectionCuirassed = cuirassed(marialVarCutely);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionCuirassed) {
            if (Intrinsics.wireman(arytenoidectomy.f29551attabal.beachfront((saran) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new KotlinReflectionInternalError("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (saran) CollectionsKt.herdbook(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            molybdenite visibility = ((saran) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = polder.impromptu(linkedHashMap, new taiyuan(new Function2<molybdenite, molybdenite, Integer>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2
            @Override // p002kotlin.jvm.functions.Function2
            public final Integer invoke(molybdenite molybdeniteVar, molybdenite molybdeniteVar2) {
                Integer numWireman = p002kotlin.reflect.jvm.internal.impl.descriptors.polloi.wireman(molybdeniteVar, molybdeniteVar2);
                return Integer.valueOf(numWireman == null ? 0 : numWireman.intValue());
            }
        })).values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        List list = (List) CollectionsKt.wostteth(collectionValues);
        if (list.size() == 1) {
            Intrinsics.beachfront(list);
            return (saran) CollectionsKt.lerp(list);
        }
        marial marialVarCutely2 = marial.cutely(name);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely2, "identifier(...)");
        String strPreterite = CollectionsKt.preterite(cuirassed(marialVarCutely2), "\n", null, null, 0, null, new Function1<saran, CharSequence>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1
            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(saran descriptor) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return DescriptorRenderer.f31199cutely.kowloon(descriptor) + " | " + arytenoidectomy.f29551attabal.beachfront(descriptor).getString();
            }
        }, 30, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Property '");
        sb.append(name);
        sb.append("' (JVM signature: ");
        sb.append(signature);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strPreterite.length() == 0 ? " no members found" : '\n' + strPreterite);
        throw new KotlinReflectionInternalError(sb.toString());
    }

    public final Method kattegat(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.wireman(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.wireman(method.getName(), str) && Intrinsics.wireman(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    public final Constructor<?> kowloon(String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return sealless(competently(), stratoscope(desc));
    }

    public final Method molybdenite(String name, String desc) {
        Method methodOilcan;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.wireman(name, "<init>")) {
            return null;
        }
        Class<?>[] clsArr = (Class[]) stratoscope(desc).toArray(new Class[0]);
        Class<?> clsTrm = trm(desc);
        Method methodOilcan2 = oilcan(cord(), name, clsArr, clsTrm, false);
        if (methodOilcan2 != null) {
            return methodOilcan2;
        }
        if (!cord().isInterface() || (methodOilcan = oilcan(Object.class, name, clsArr, clsTrm, false)) == null) {
            return null;
        }
        return methodOilcan;
    }

    public final Method monoploid(String name, String desc, boolean isMember) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.wireman(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(competently());
        }
        triweekly(arrayList, desc, false);
        return oilcan(cord(), name + "$default", (Class[]) arrayList.toArray(new Class[0]), trm(desc), isMember);
    }

    public final Method oilcan(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z2;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodKattegat = kattegat(cls, str, clsArr, cls2);
        if (methodKattegat != null) {
            return methodKattegat;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodOilcan = oilcan(superclass, str, clsArr, cls2, z);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
            if (methodOilcan != null) {
                return methodOilcan;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls4 : interfaces) {
            Intrinsics.beachfront(cls4);
            Method methodOilcan2 = oilcan(cls4, str2, clsArr2, cls3, z2);
            if (methodOilcan2 != null) {
                return methodOilcan2;
            }
            if (z2) {
                Class<?> clsAttabal = healthily.marial.attabal(ReflectClassUtilKt.beachfront(cls4), cls4.getName() + "$DefaultImpls");
                if (clsAttabal != null) {
                    clsArr2[0] = cls4;
                    Method methodKattegat2 = kattegat(clsAttabal, str2, clsArr2, cls3);
                    if (methodKattegat2 != null) {
                        return methodKattegat2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ad  */
    public final dovishness polloi(String name, String signature) {
        List listGintrap;
        ArrayList arrayList;
        String string;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        if (Intrinsics.wireman(name, "<init>")) {
            listGintrap = CollectionsKt.molet(dovishness());
            arrayList = new ArrayList();
            for (Object obj : listGintrap) {
                cutely cutelyVar = (cutely) obj;
                if (cutelyVar.clubfoot()) {
                    competently competentlyVarSaneness = cutelyVar.saneness();
                    Intrinsics.checkNotNullExpressionValue(competentlyVarSaneness, "getContainingDeclaration(...)");
                    if (p002kotlin.reflect.jvm.internal.impl.resolve.beachfront.wireman(competentlyVarSaneness)) {
                        String str = arytenoidectomy.f29551attabal.competently(cutelyVar).get_signature();
                        if (!p002kotlin.text.dovishness.starveling(str, "constructor-impl", false, 2, null) || !p002kotlin.text.dovishness.cuirassed(str, ")V", false, 2, null)) {
                            throw new IllegalArgumentException(("Invalid signature of " + cutelyVar + ": " + str).toString());
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(StringsKt.herdbook(str, "V"));
                        competently competentlyVarSaneness2 = cutelyVar.saneness();
                        Intrinsics.checkNotNullExpressionValue(competentlyVarSaneness2, "getContainingDeclaration(...)");
                        sb.append(impromptu.graveside(competentlyVarSaneness2));
                        string = sb.toString();
                    } else {
                        string = arytenoidectomy.f29551attabal.competently(cutelyVar).get_signature();
                    }
                } else {
                    string = arytenoidectomy.f29551attabal.competently(cutelyVar).get_signature();
                }
                if (Intrinsics.wireman(string, signature)) {
                    arrayList.add(obj);
                }
            }
        } else {
            marial marialVarCutely = marial.cutely(name);
            Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
            listGintrap = gintrap(marialVarCutely);
            arrayList = new ArrayList();
            for (Object obj2 : listGintrap) {
                if (Intrinsics.wireman(arytenoidectomy.f29551attabal.competently((dovishness) obj2).get_signature(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (dovishness) CollectionsKt.herdbook(arrayList);
        }
        String strPreterite = CollectionsKt.preterite(listGintrap, "\n", null, null, 0, null, new Function1<dovishness, CharSequence>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1
            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(dovishness descriptor) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return DescriptorRenderer.f31199cutely.kowloon(descriptor) + " | " + arytenoidectomy.f29551attabal.competently(descriptor).get_signature();
            }
        }, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Function '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strPreterite.length() == 0 ? " no members found" : '\n' + strPreterite);
        throw new KotlinReflectionInternalError(sb2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    public final Collection<KCallableImpl<?>> preprohormone(MemberScope scope, MemberBelonginess belonginess) {
        KCallableImpl kCallableImpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(belonginess, "belonginess");
        saneness sanenessVar = new saneness(this);
        Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.apical> collectionAttabal = kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu.attabal.attabal(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar : collectionAttabal) {
            if (apicalVar instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) apicalVar;
                if (Intrinsics.wireman(callableMemberDescriptor.getVisibility(), p002kotlin.reflect.jvm.internal.impl.descriptors.polloi.f30210impromptu) || !belonginess.accept(callableMemberDescriptor)) {
                    kCallableImpl = null;
                } else {
                    kCallableImpl = (KCallableImpl) apicalVar.dovishness(sanenessVar, Unit.f29295attabal);
                }
            } else {
                kCallableImpl = null;
            }
            if (kCallableImpl != null) {
                arrayList.add(kCallableImpl);
            }
        }
        return CollectionsKt.molet(arrayList);
    }

    public abstract saran rotuma(int index);

    public final Constructor<?> sealless(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final List<Class<?>> stratoscope(String desc) {
        String str;
        int iNosophobia;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (desc.charAt(i) != ')') {
            int i2 = i;
            while (desc.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = desc.charAt(i2);
            if (StringsKt.splinterproof("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i3 = i2 + 1;
                str = desc;
                iNosophobia = i3;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + desc);
                }
                str = desc;
                iNosophobia = StringsKt.nosophobia(str, ';', i, false, 4, null) + 1;
            }
            arrayList.add(yemenite(str, i, iNosophobia));
            i = iNosophobia;
            desc = str;
        }
        return arrayList;
    }

    public final void triweekly(List<Class<?>> result, String desc, boolean isConstructor) {
        List<Class<?>> listStratoscope = stratoscope(desc);
        result.addAll(listStratoscope);
        int size = (listStratoscope.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class<?> TYPE = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            result.add(TYPE);
        }
        if (!isConstructor) {
            result.add(Object.class);
            return;
        }
        Class<?> DEFAULT_CONSTRUCTOR_MARKER = f29479arytenoidectomy;
        result.remove(DEFAULT_CONSTRUCTOR_MARKER);
        Intrinsics.checkNotNullExpressionValue(DEFAULT_CONSTRUCTOR_MARKER, "DEFAULT_CONSTRUCTOR_MARKER");
        result.add(DEFAULT_CONSTRUCTOR_MARKER);
    }

    public final Class<?> trm(String desc) {
        return yemenite(desc, StringsKt.nosophobia(desc, ')', 0, false, 6, null) + 1, desc.length());
    }

    public final Class<?> yemenite(String desc, int begin, int end) throws ClassNotFoundException {
        char cCharAt = desc.charAt(begin);
        if (cCharAt == 'L') {
            ClassLoader classLoaderBeachfront = ReflectClassUtilKt.beachfront(competently());
            String strSubstring = desc.substring(begin + 1, end - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderBeachfront.loadClass(p002kotlin.text.dovishness.merc(strSubstring, '/', '.', false, 4, null));
            Intrinsics.checkNotNullExpressionValue(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            return molybdenite.beachfront(yemenite(desc, begin + 1, end));
        }
        if (cCharAt == 'V') {
            Class<?> TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + desc);
    }
}
