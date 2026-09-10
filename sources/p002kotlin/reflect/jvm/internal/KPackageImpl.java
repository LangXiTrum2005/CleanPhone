package p002kotlin.reflect.jvm.internal;

import com.ironsource.C3414a2;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import foreshot.marial;
import genesis.competently;
import healthily.beachfront;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.KPackageImpl.Data;
import kurbash.formularize;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Triple;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.saneness;
import p002kotlin.text.dovishness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: KPackageImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001/B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010$\u001a\f\u0012\b\u0012\u00060!R\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lbyname/marial;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "cuirassed", "(Lbyname/marial;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;", "gintrap", "", "index", "rotuma", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "polloi", "Ljava/lang/Class;", "competently", "()Ljava/lang/Class;", "Lpatroclinal/taiyuan;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "molybdenite", "Lpatroclinal/taiyuan;", "data", "cord", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/cutely;", "dovishness", "()Ljava/util/Collection;", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Data", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<Data> data;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final Class<?> jClass;

    /* JADX INFO: compiled from: KPackageImpl.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR!\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R/\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0006\u0010\u001aR%\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "Lhealthily/beachfront;", "wireman", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "marial", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "beachfront", "Lpatroclinal/taiyuan;", "()Ljava/lang/Class;", "multifileFacade", "Lkotlin/Triple;", "Lforeshot/beachfront;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lforeshot/marial;", "competently", "()Lkotlin/Triple;", TtmlNode.TAG_METADATA, "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "impromptu", "getMembers", "()Ljava/util/Collection;", "members", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Data extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public static final /* synthetic */ formularize<Object>[] f29500cutely = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final taiyuan multifileFacade;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public final taiyuan metadata;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal members;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal scope;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal kotlinClass;

        public Data() {
            super();
            this.kotlinClass = triweekly.dern(new Function0<beachfront>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$kotlinClass$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p002kotlin.jvm.functions.Function0
                public final beachfront invoke() {
                    return beachfront.f27603dern.attabal(kPackageImpl.competently());
                }
            });
            this.scope = triweekly.dern(new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$scope$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final MemberScope invoke() {
                    beachfront beachfrontVarDern = this.this$0.dern();
                    return beachfrontVarDern != null ? this.this$0.attabal().dern().attabal(beachfrontVarDern) : MemberScope.attabal.f31367saneness;
                }
            });
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            this.multifileFacade = saneness.attabal(lazyThreadSafetyMode, new Function0<Class<?>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$multifileFacade$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p002kotlin.jvm.functions.Function0
                public final Class<?> invoke() {
                    KotlinClassHeader kotlinClassHeaderSaneness;
                    beachfront beachfrontVarDern = this.this$0.dern();
                    String strMarial = (beachfrontVarDern == null || (kotlinClassHeaderSaneness = beachfrontVarDern.saneness()) == null) ? null : kotlinClassHeaderSaneness.marial();
                    if (strMarial == null || strMarial.length() <= 0) {
                        return null;
                    }
                    return kPackageImpl.competently().getClassLoader().loadClass(dovishness.merc(strMarial, '/', '.', false, 4, null));
                }
            });
            this.metadata = saneness.attabal(lazyThreadSafetyMode, new Function0<Triple<? extends foreshot.beachfront, ? extends ProtoBuf$Package, ? extends marial>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$metadata$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Triple<? extends foreshot.beachfront, ? extends ProtoBuf$Package, ? extends marial> invoke() {
                    KotlinClassHeader kotlinClassHeaderSaneness;
                    beachfront beachfrontVarDern = this.this$0.dern();
                    if (beachfrontVarDern != null && (kotlinClassHeaderSaneness = beachfrontVarDern.saneness()) != null) {
                        String[] strArrAttabal = kotlinClassHeaderSaneness.attabal();
                        String[] strArrCompetently = kotlinClassHeaderSaneness.competently();
                        if (strArrAttabal != null && strArrCompetently != null) {
                            Pair<foreshot.beachfront, ProtoBuf$Package> pairImpassible = foreshot.taiyuan.impassible(strArrAttabal, strArrCompetently);
                            return new Triple<>(pairImpassible.component1(), pairImpassible.component2(), kotlinClassHeaderSaneness.wireman());
                        }
                    }
                    return null;
                }
            });
            this.members = triweekly.dern(new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$members$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Collection<? extends KCallableImpl<?>> invoke() {
                    return kPackageImpl.preprohormone(this.beachfront(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
        }

        public final MemberScope beachfront() {
            T tSaneness = this.scope.saneness(this, f29500cutely[1]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (MemberScope) tSaneness;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final beachfront dern() {
            return (beachfront) this.kotlinClass.saneness(this, f29500cutely[0]);
        }

        public final Class<?> marial() {
            return (Class) this.multifileFacade.getValue();
        }

        public final Triple<foreshot.beachfront, ProtoBuf$Package, marial> wireman() {
            return (Triple) this.metadata.getValue();
        }
    }

    public KPackageImpl(Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.jClass = jClass;
        this.data = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<Data>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$data$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KPackageImpl.Data invoke() {
                return this.this$0.new Data();
            }
        });
    }

    @Override // p002kotlin.jvm.internal.beachfront
    public Class<?> competently() {
        return this.jClass;
    }

    @Override // p002kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Class<?> cord() {
        Class<?> clsMarial = this.data.getValue().marial();
        return clsMarial == null ? competently() : clsMarial;
    }

    @Override // p002kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<saran> cuirassed(byname.marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return supplicat().dern(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // p002kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<cutely> dovishness() {
        return adultoid.formularize();
    }

    public boolean equals(Object other) {
        return (other instanceof KPackageImpl) && Intrinsics.wireman(competently(), ((KPackageImpl) other).competently());
    }

    @Override // p002kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness> gintrap(byname.marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return supplicat().saneness(name, NoLookupLocation.FROM_REFLECTION);
    }

    public int hashCode() {
        return competently().hashCode();
    }

    @Override // p002kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public saran rotuma(int index) {
        Triple<foreshot.beachfront, ProtoBuf$Package, marial> tripleWireman = this.data.getValue().wireman();
        if (tripleWireman != null) {
            foreshot.beachfront beachfrontVarComponent1 = tripleWireman.component1();
            ProtoBuf$Package protoBuf$PackageComponent2 = tripleWireman.component2();
            marial marialVarComponent3 = tripleWireman.component3();
            GeneratedMessageLite.marial<ProtoBuf$Package, List<ProtoBuf$Property>> packageLocalVariable = JvmProtoBuf.f31036triweekly;
            Intrinsics.checkNotNullExpressionValue(packageLocalVariable, "packageLocalVariable");
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) genesis.marial.saneness(protoBuf$PackageComponent2, packageLocalVariable, index);
            if (protoBuf$Property != null) {
                Class<?> clsCompetently = competently();
                ProtoBuf$TypeTable typeTable = protoBuf$PackageComponent2.getTypeTable();
                Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
                return (saran) molybdenite.impromptu(clsCompetently, protoBuf$Property, beachfrontVarComponent1, new competently(typeTable), marialVarComponent3, KPackageImpl$getLocalProperty$1$1$1.INSTANCE);
            }
        }
        return null;
    }

    public final MemberScope supplicat() {
        return this.data.getValue().beachfront();
    }

    public String toString() {
        return "file class " + ReflectClassUtilKt.attabal(competently()).saneness();
    }
}
