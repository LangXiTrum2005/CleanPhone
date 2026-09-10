package p002kotlin.reflect.jvm.internal;

import byname.saneness;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import healthily.apical;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kurbash.formularize;
import kurbash.impromptu;
import kurbash.wireman;
import lyreflower.attabal;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.jvm.internal.rotuma;
import p002kotlin.reflect.jvm.internal.impl.builtins.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.text.StringsKt;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: KClassImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001HB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R'\u00104\u001a\u0012\u0012\u000e\u0012\f0/R\b\u0012\u0004\u0012\u00028\u00000\u00000.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002050\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010:\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0016\u0010<\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010)R\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020B8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010D¨\u0006I"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkurbash/wireman;", "Lkotlin/reflect/jvm/internal/impromptu;", "Lkotlin/reflect/jvm/internal/formularize;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lbyname/saneness;", "classId", "Lhealthily/apical;", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;", "polder", "(Lbyname/saneness;Lhealthily/apical;)Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;", "merc", "Lbyname/marial;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "cuirassed", "(Lbyname/marial;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;", "gintrap", "", "index", "rotuma", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "value", "", "beachfront", "(Ljava/lang/Object;)Z", C3414a2.d, "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "polloi", "Ljava/lang/Class;", "competently", "()Ljava/lang/Class;", "Lpatroclinal/taiyuan;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "molybdenite", "Lpatroclinal/taiyuan;", "grimness", "()Lpatroclinal/taiyuan;", "data", "Lkotlin/reflect/jvm/internal/impl/descriptors/cutely;", "dovishness", "()Ljava/util/Collection;", "constructorDescriptors", "taiyuan", "simpleName", "impromptu", "qualifiedName", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "Data", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KClassImpl<T> extends KDeclarationContainerImpl implements wireman<T>, impromptu, formularize {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<KClassImpl<T>.Data> data;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final Class<T> jClass;

    /* JADX INFO: compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u0017R-\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001c8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R%\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030$0\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010 R#\u0010-\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\"\u001a\u0004\b*\u0010+R!\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b0\u0010\u0014R!\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\f\u001a\u0004\b4\u0010\u0014R)\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000$0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\f\u001a\u0004\b7\u0010\u0014R%\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b%\u0010 R%\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b(\u0010 R%\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b3\u0010 R%\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b6\u0010 R%\u0010A\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\f\u001a\u0004\b\u0019\u0010 R%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\f\u001a\u0004\b\u001e\u0010 R%\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\f\u001a\u0004\bE\u0010 R%\u0010I\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\f\u001a\u0004\bH\u0010 ¨\u0006J"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "Ljava/lang/Class;", "jClass", "", "beachfront", "(Ljava/lang/Class;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;", "wireman", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "marial", "getAnnotations", "()Ljava/util/List;", "annotations", "kowloon", "()Ljava/lang/String;", "simpleName", "competently", "triweekly", "qualifiedName", "", "Lkurbash/impromptu;", "impromptu", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkurbash/wireman;", "taiyuan", "getNestedClasses", "nestedClasses", "cutely", "Lpatroclinal/taiyuan;", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lkurbash/monoploid;", "apical", "getTypeParameters", "typeParameters", "Lkurbash/arytenoidectomy;", "formularize", "getSupertypes", "supertypes", "impassible", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "declaredNonStaticMembers", "declaredStaticMembers", "arytenoidectomy", "inheritedNonStaticMembers", "monoploid", "inheritedStaticMembers", "polloi", "allNonStaticMembers", "molybdenite", "allStaticMembers", "graveside", "getDeclaredMembers", "declaredMembers", "adultoid", "getAllMembers", "allMembers", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Data extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public static final /* synthetic */ formularize<Object>[] f29458gintrap = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "annotations", "getAnnotations()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal allMembers;

        /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal typeParameters;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal inheritedNonStaticMembers;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal simpleName;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal qualifiedName;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
        public final taiyuan objectInstance;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal supertypes;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal declaredMembers;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal sealedSubclasses;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal constructors;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal declaredStaticMembers;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal annotations;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal allStaticMembers;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal inheritedStaticMembers;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal allNonStaticMembers;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal nestedClasses;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal declaredNonStaticMembers;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal descriptor;

        public Data() {
            super();
            this.descriptor = triweekly.dern(new Function0<p002kotlin.reflect.jvm.internal.impl.descriptors.wireman>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$descriptor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman invoke() {
                    saneness sanenessVarSeminary = kClassImpl.seminary();
                    apical apicalVarAttabal = ((KClassImpl.Data) kClassImpl.grimness().getValue()).attabal();
                    p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarSaneness = (sanenessVarSeminary.apical() && kClassImpl.competently().isAnnotationPresent(Metadata.class)) ? apicalVarAttabal.attabal().saneness(sanenessVarSeminary) : FindClassInModuleKt.attabal(apicalVarAttabal.saneness(), sanenessVarSeminary);
                    return wiremanVarSaneness == null ? kClassImpl.polder(sanenessVarSeminary, apicalVarAttabal) : wiremanVarSaneness;
                }
            });
            this.annotations = triweekly.dern(new Function0<List<? extends Annotation>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$annotations$2
                final /* synthetic */ KClassImpl<T>.Data this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends Annotation> invoke() {
                    return molybdenite.marial(this.this$0.apical());
                }
            });
            this.simpleName = triweekly.dern(new Function0<String>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$simpleName$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final String invoke() {
                    if (kClassImpl.competently().isAnonymousClass()) {
                        return null;
                    }
                    saneness sanenessVarSeminary = kClassImpl.seminary();
                    if (sanenessVarSeminary.apical()) {
                        return this.beachfront(kClassImpl.competently());
                    }
                    String strDern = sanenessVarSeminary.cutely().dern();
                    Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
                    return strDern;
                }
            });
            this.qualifiedName = triweekly.dern(new Function0<String>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$qualifiedName$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final String invoke() {
                    if (kClassImpl.competently().isAnonymousClass()) {
                        return null;
                    }
                    saneness sanenessVarSeminary = kClassImpl.seminary();
                    if (sanenessVarSeminary.apical()) {
                        return null;
                    }
                    return sanenessVarSeminary.saneness().saneness();
                }
            });
            this.constructors = triweekly.dern(new Function0<List<? extends impromptu<? extends T>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$constructors$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<impromptu<T>> invoke() {
                    Collection<cutely> collectionDovishness = kClassImpl.dovishness();
                    KClassImpl<T> kClassImpl = kClassImpl;
                    ArrayList arrayList = new ArrayList(dovishness.gintrap(collectionDovishness, 10));
                    Iterator<T> it = collectionDovishness.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new KFunctionImpl(kClassImpl, (cutely) it.next()));
                    }
                    return arrayList;
                }
            });
            this.nestedClasses = triweekly.dern(new Function0<List<? extends KClassImpl<? extends Object>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$nestedClasses$2
                final /* synthetic */ KClassImpl<T>.Data this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends KClassImpl<? extends Object>> invoke() {
                    MemberScope memberScopePrivatdozent = this.this$0.apical().privatdozent();
                    Intrinsics.checkNotNullExpressionValue(memberScopePrivatdozent, "getUnsubstitutedInnerClassesScope(...)");
                    Collection collectionAttabal = kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu.attabal.attabal(memberScopePrivatdozent, null, null, 3, null);
                    ArrayList<p002kotlin.reflect.jvm.internal.impl.descriptors.apical> arrayList = new ArrayList();
                    for (Object obj : collectionAttabal) {
                        if (!marial.stratoscope((p002kotlin.reflect.jvm.internal.impl.descriptors.apical) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar : arrayList) {
                        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar = apicalVar instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman ? (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) apicalVar : null;
                        Class<?> clsMonoploid = wiremanVar != null ? molybdenite.monoploid(wiremanVar) : null;
                        KClassImpl kClassImpl = clsMonoploid != null ? new KClassImpl(clsMonoploid) : null;
                        if (kClassImpl != null) {
                            arrayList2.add(kClassImpl);
                        }
                    }
                    return arrayList2;
                }
            });
            this.objectInstance = p002kotlin.saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<T>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$objectInstance$2
                final /* synthetic */ KClassImpl<T>.Data this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final T invoke() {
                    p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarApical = this.this$0.apical();
                    if (wiremanVarApical.getKind() != ClassKind.OBJECT) {
                        return null;
                    }
                    T t = (T) ((!wiremanVarApical.overspeculate() || dern.attabal(p002kotlin.reflect.jvm.internal.impl.builtins.saneness.f29883attabal, wiremanVarApical)) ? kClassImpl.competently().getDeclaredField("INSTANCE") : kClassImpl.competently().getEnclosingClass().getDeclaredField(wiremanVarApical.getName().dern())).get(null);
                    Intrinsics.competently(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                    return t;
                }
            });
            this.typeParameters = triweekly.dern(new Function0<List<? extends KTypeParameterImpl>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$typeParameters$2
                final /* synthetic */ KClassImpl<T>.Data this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends KTypeParameterImpl> invoke() {
                    List<clubfoot> listTriweekly = this.this$0.apical().triweekly();
                    Intrinsics.checkNotNullExpressionValue(listTriweekly, "getDeclaredTypeParameters(...)");
                    List<clubfoot> list = listTriweekly;
                    formularize formularizeVar = kClassImpl;
                    ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
                    for (clubfoot clubfootVar : list) {
                        Intrinsics.beachfront(clubfootVar);
                        arrayList.add(new KTypeParameterImpl(formularizeVar, clubfootVar));
                    }
                    return arrayList;
                }
            });
            this.supertypes = triweekly.dern(new Function0<List<? extends KTypeImpl>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2
                final /* synthetic */ KClassImpl<T>.Data this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends KTypeImpl> invoke() {
                    Collection<oilcan> collectionCutely = this.this$0.apical().impromptu().cutely();
                    Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
                    ArrayList arrayList = new ArrayList(collectionCutely.size());
                    final KClassImpl<T>.Data data = this.this$0;
                    final KClassImpl<T> kClassImpl = kClassImpl;
                    for (final oilcan oilcanVar : collectionCutely) {
                        Intrinsics.beachfront(oilcanVar);
                        arrayList.add(new KTypeImpl(oilcanVar, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p002kotlin.jvm.functions.Function0
                            public final Type invoke() {
                                beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
                                if (!(beachfrontVarWireman instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman)) {
                                    throw new KotlinReflectionInternalError("Supertype not a class: " + beachfrontVarWireman);
                                }
                                Class<?> clsMonoploid = molybdenite.monoploid((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarWireman);
                                if (clsMonoploid == null) {
                                    throw new KotlinReflectionInternalError("Unsupported superclass of " + data + ": " + beachfrontVarWireman);
                                }
                                if (Intrinsics.wireman(kClassImpl.competently().getSuperclass(), clsMonoploid)) {
                                    Type genericSuperclass = kClassImpl.competently().getGenericSuperclass();
                                    Intrinsics.beachfront(genericSuperclass);
                                    return genericSuperclass;
                                }
                                Class<?>[] interfaces = kClassImpl.competently().getInterfaces();
                                Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                                int iPermissivist = p002kotlin.collections.polloi.permissivist(interfaces, clsMonoploid);
                                if (iPermissivist >= 0) {
                                    Type type = kClassImpl.competently().getGenericInterfaces()[iPermissivist];
                                    Intrinsics.beachfront(type);
                                    return type;
                                }
                                throw new KotlinReflectionInternalError("No superclass of " + data + " in Java reflection for " + beachfrontVarWireman);
                            }
                        }));
                    }
                    if (!p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.picketboat(this.this$0.apical())) {
                        if (arrayList.isEmpty()) {
                            merc mercVarTaiyuan = DescriptorUtilsKt.cutely(this.this$0.apical()).taiyuan();
                            Intrinsics.checkNotNullExpressionValue(mercVarTaiyuan, "getAnyType(...)");
                            arrayList.add(new KTypeImpl(mercVarTaiyuan, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2.3
                                @Override // p002kotlin.jvm.functions.Function0
                                public final Type invoke() {
                                    return Object.class;
                                }
                            }));
                        } else {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ClassKind kind = marial.marial(((KTypeImpl) it.next()).getType()).getKind();
                                Intrinsics.checkNotNullExpressionValue(kind, "getKind(...)");
                                if (kind == ClassKind.INTERFACE || kind == ClassKind.ANNOTATION_CLASS) {
                                }
                            }
                            merc mercVarTaiyuan2 = DescriptorUtilsKt.cutely(this.this$0.apical()).taiyuan();
                            Intrinsics.checkNotNullExpressionValue(mercVarTaiyuan2, "getAnyType(...)");
                            arrayList.add(new KTypeImpl(mercVarTaiyuan2, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2.3
                                @Override // p002kotlin.jvm.functions.Function0
                                public final Type invoke() {
                                    return Object.class;
                                }
                            }));
                        }
                    }
                    return attabal.dern(arrayList);
                }
            });
            this.sealedSubclasses = triweekly.dern(new Function0<List<? extends KClassImpl<? extends T>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$sealedSubclasses$2
                final /* synthetic */ KClassImpl<T>.Data this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<KClassImpl<? extends T>> invoke() {
                    Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.wireman> collectionAdultoid = this.this$0.apical().adultoid();
                    Intrinsics.checkNotNullExpressionValue(collectionAdultoid, "getSealedSubclasses(...)");
                    ArrayList arrayList = new ArrayList();
                    for (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar : collectionAdultoid) {
                        Intrinsics.competently(wiremanVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        Class<?> clsMonoploid = molybdenite.monoploid(wiremanVar);
                        KClassImpl kClassImpl = clsMonoploid != null ? new KClassImpl(clsMonoploid) : null;
                        if (kClassImpl != null) {
                            arrayList.add(kClassImpl);
                        }
                    }
                    return arrayList;
                }
            });
            this.declaredNonStaticMembers = triweekly.dern(new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredNonStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Collection<? extends KCallableImpl<?>> invoke() {
                    KClassImpl<T> kClassImpl = kClassImpl;
                    return kClassImpl.preprohormone(kClassImpl.privatdozent(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
            this.declaredStaticMembers = triweekly.dern(new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Collection<? extends KCallableImpl<?>> invoke() {
                    KClassImpl<T> kClassImpl = kClassImpl;
                    return kClassImpl.preprohormone(kClassImpl.creditor(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
            this.inheritedNonStaticMembers = triweekly.dern(new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedNonStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Collection<? extends KCallableImpl<?>> invoke() {
                    KClassImpl<T> kClassImpl = kClassImpl;
                    return kClassImpl.preprohormone(kClassImpl.privatdozent(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                }
            });
            this.inheritedStaticMembers = triweekly.dern(new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Collection<? extends KCallableImpl<?>> invoke() {
                    KClassImpl<T> kClassImpl = kClassImpl;
                    return kClassImpl.preprohormone(kClassImpl.creditor(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                }
            });
            this.allNonStaticMembers = triweekly.dern(new Function0<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allNonStaticMembers$2
                final /* synthetic */ KClassImpl<T>.Data this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends KCallableImpl<?>> invoke() {
                    return CollectionsKt.unconsolidated(this.this$0.taiyuan(), this.this$0.formularize());
                }
            });
            this.allStaticMembers = triweekly.dern(new Function0<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allStaticMembers$2
                final /* synthetic */ KClassImpl<T>.Data this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends KCallableImpl<?>> invoke() {
                    return CollectionsKt.unconsolidated(this.this$0.cutely(), this.this$0.impassible());
                }
            });
            this.declaredMembers = triweekly.dern(new Function0<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredMembers$2
                final /* synthetic */ KClassImpl<T>.Data this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends KCallableImpl<?>> invoke() {
                    return CollectionsKt.unconsolidated(this.this$0.taiyuan(), this.this$0.cutely());
                }
            });
            this.allMembers = triweekly.dern(new Function0<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allMembers$2
                final /* synthetic */ KClassImpl<T>.Data this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends KCallableImpl<?>> invoke() {
                    return CollectionsKt.unconsolidated(this.this$0.competently(), this.this$0.impromptu());
                }
            });
        }

        public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman apical() {
            T tSaneness = this.descriptor.saneness(this, f29458gintrap[0]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) tSaneness;
        }

        public final String beachfront(Class<?> jClass) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.beachfront(simpleName);
                return StringsKt.prefect(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                Intrinsics.beachfront(simpleName);
                return StringsKt.tectonization(simpleName, '$', null, 2, null);
            }
            Intrinsics.beachfront(simpleName);
            return StringsKt.prefect(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final Collection<KCallableImpl<?>> competently() {
            T tSaneness = this.allNonStaticMembers.saneness(this, f29458gintrap[13]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (Collection) tSaneness;
        }

        public final Collection<KCallableImpl<?>> cutely() {
            T tSaneness = this.declaredStaticMembers.saneness(this, f29458gintrap[10]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (Collection) tSaneness;
        }

        public final Collection<KCallableImpl<?>> formularize() {
            T tSaneness = this.inheritedNonStaticMembers.saneness(this, f29458gintrap[11]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (Collection) tSaneness;
        }

        public final Collection<KCallableImpl<?>> impassible() {
            T tSaneness = this.inheritedStaticMembers.saneness(this, f29458gintrap[12]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (Collection) tSaneness;
        }

        public final Collection<KCallableImpl<?>> impromptu() {
            T tSaneness = this.allStaticMembers.saneness(this, f29458gintrap[14]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (Collection) tSaneness;
        }

        public final String kowloon() {
            return (String) this.simpleName.saneness(this, f29458gintrap[2]);
        }

        public final Collection<KCallableImpl<?>> taiyuan() {
            T tSaneness = this.declaredNonStaticMembers.saneness(this, f29458gintrap[9]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (Collection) tSaneness;
        }

        public final String triweekly() {
            return (String) this.qualifiedName.saneness(this, f29458gintrap[3]);
        }
    }

    /* JADX INFO: compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f29478attabal;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f29478attabal = iArr;
        }
    }

    /* JADX INFO: compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlin/reflect/jvm/internal/KClassImpl$saneness", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/GivenFunctionsMemberScope;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;", "taiyuan", "()Ljava/util/List;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class saneness extends GivenFunctionsMemberScope {
        public saneness(competently competentlyVar, yeast.formularize formularizeVar) {
            super(formularizeVar, competentlyVar);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
        public List<p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness> taiyuan() {
            return adultoid.formularize();
        }
    }

    public KClassImpl(Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.jClass = jClass;
        this.data = p002kotlin.saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<KClassImpl<T>.Data>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$data$1
            final /* synthetic */ KClassImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KClassImpl<T>.Data invoke() {
                return this.this$0.new Data();
            }
        });
    }

    @Override // kurbash.wireman
    public boolean beachfront(Object value) {
        Integer numDern = ReflectClassUtilKt.dern(competently());
        if (numDern != null) {
            return rotuma.impassible(value, numDern.intValue());
        }
        Class clsCompetently = ReflectClassUtilKt.competently(competently());
        if (clsCompetently == null) {
            clsCompetently = competently();
        }
        return clsCompetently.isInstance(value);
    }

    @Override // p002kotlin.jvm.internal.beachfront
    public Class<T> competently() {
        return this.jClass;
    }

    public final MemberScope creditor() {
        MemberScope memberScopeLerp = getDescriptor().lerp();
        Intrinsics.checkNotNullExpressionValue(memberScopeLerp, "getStaticScope(...)");
        return memberScopeLerp;
    }

    @Override // p002kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<saran> cuirassed(byname.marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MemberScope memberScopePrivatdozent = privatdozent();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt.unconsolidated(memberScopePrivatdozent.dern(name, noLookupLocation), creditor().dern(name, noLookupLocation));
    }

    @Override // p002kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<cutely> dovishness() {
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman descriptor = getDescriptor();
        if (descriptor.getKind() == ClassKind.INTERFACE || descriptor.getKind() == ClassKind.OBJECT) {
            return adultoid.formularize();
        }
        Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.dern> collectionTaiyuan = descriptor.taiyuan();
        Intrinsics.checkNotNullExpressionValue(collectionTaiyuan, "getConstructors(...)");
        return collectionTaiyuan;
    }

    public boolean equals(Object other) {
        return (other instanceof KClassImpl) && Intrinsics.wireman(gibeonite.attabal.dern(this), gibeonite.attabal.dern((wireman) other));
    }

    @Override // p002kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness> gintrap(byname.marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MemberScope memberScopePrivatdozent = privatdozent();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt.unconsolidated(memberScopePrivatdozent.saneness(name, noLookupLocation), creditor().saneness(name, noLookupLocation));
    }

    public final taiyuan<KClassImpl<T>.Data> grimness() {
        return this.data;
    }

    @Override // kurbash.wireman
    public int hashCode() {
        return gibeonite.attabal.dern(this).hashCode();
    }

    @Override // kurbash.wireman
    public String impromptu() {
        return this.data.getValue().triweekly();
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman merc(byname.saneness classId, apical moduleData) {
        trm trmVarSaneness = moduleData.saneness();
        byname.dern dernVarImpromptu = classId.impromptu();
        Intrinsics.checkNotNullExpressionValue(dernVarImpromptu, "getPackageFqName(...)");
        competently competentlyVar = new competently(new p002kotlin.reflect.jvm.internal.impl.descriptors.impl.formularize(trmVarSaneness, dernVarImpromptu), classId.cutely(), Modality.FINAL, ClassKind.CLASS, graveside.marial(moduleData.saneness().apical().impromptu().impassible()), walach.f30274attabal, false, moduleData.attabal().adultoid());
        competentlyVar.dhss(new saneness(competentlyVar, moduleData.attabal().adultoid()), creditor.marial(), null);
        return competentlyVar;
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman polder(byname.saneness classId, apical moduleData) throws InvocationTargetException {
        KotlinClassHeader kotlinClassHeaderSaneness;
        if (competently().isSynthetic()) {
            return merc(classId, moduleData);
        }
        healthily.beachfront beachfrontVarAttabal = healthily.beachfront.f27603dern.attabal(competently());
        KotlinClassHeader.Kind kindDern = (beachfrontVarAttabal == null || (kotlinClassHeaderSaneness = beachfrontVarAttabal.saneness()) == null) ? null : kotlinClassHeaderSaneness.dern();
        switch (kindDern == null ? -1 : attabal.f29478attabal[kindDern.ordinal()]) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + competently() + " (kind = " + kindDern + ')');
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return merc(classId, moduleData);
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + competently() + " (kind = " + kindDern + ')');
        }
    }

    public final MemberScope privatdozent() {
        return getDescriptor().impassible().formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public saran rotuma(int index) {
        Class<?> declaringClass;
        if (Intrinsics.wireman(competently().getSimpleName(), "DefaultImpls") && (declaringClass = competently().getDeclaringClass()) != null && declaringClass.isInterface()) {
            wireman wiremanVarMarial = gibeonite.attabal.marial(declaringClass);
            Intrinsics.competently(wiremanVarMarial, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) wiremanVarMarial).rotuma(index);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman descriptor = getDescriptor();
        DeserializedClassDescriptor deserializedClassDescriptor = descriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) descriptor : null;
        if (deserializedClassDescriptor != null) {
            ProtoBuf$Class protoBuf$ClassLicking = deserializedClassDescriptor.licking();
            GeneratedMessageLite.marial<ProtoBuf$Class, List<ProtoBuf$Property>> classLocalVariable = JvmProtoBuf.f31028cutely;
            Intrinsics.checkNotNullExpressionValue(classLocalVariable, "classLocalVariable");
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) genesis.marial.saneness(protoBuf$ClassLicking, classLocalVariable, index);
            if (protoBuf$Property != null) {
                return (saran) molybdenite.impromptu(competently(), protoBuf$Property, deserializedClassDescriptor.osteal().competently(), deserializedClassDescriptor.osteal().cutely(), deserializedClassDescriptor.fastrack(), KClassImpl$getLocalProperty$2$1$1.INSTANCE);
            }
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impromptu
    /* JADX INFO: renamed from: saran, reason: merged with bridge method [inline-methods] */
    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman getDescriptor() {
        return this.data.getValue().apical();
    }

    public final byname.saneness seminary() {
        return arytenoidectomy.f29551attabal.dern(competently());
    }

    @Override // kurbash.wireman
    public String taiyuan() {
        return this.data.getValue().kowloon();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        byname.saneness sanenessVarSeminary = seminary();
        byname.dern dernVarImpromptu = sanenessVarSeminary.impromptu();
        Intrinsics.checkNotNullExpressionValue(dernVarImpromptu, "getPackageFqName(...)");
        if (dernVarImpromptu.wireman()) {
            str = "";
        } else {
            str = dernVarImpromptu.saneness() + '.';
        }
        String strSaneness = sanenessVarSeminary.taiyuan().saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        sb.append(str + p002kotlin.text.dovishness.merc(strSaneness, '.', '$', false, 4, null));
        return sb.toString();
    }
}
