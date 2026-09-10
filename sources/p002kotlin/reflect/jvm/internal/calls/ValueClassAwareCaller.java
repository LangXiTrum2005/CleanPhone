package p002kotlin.reflect.jvm.internal.calls;

import androidx.core.app.NotificationCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.collections.graveside;
import p002kotlin.collections.kattegat;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polder;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.coffeecake;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.molybdenite;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: ValueClassAwareCaller.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0015\u0017B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020&0*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010+¨\u0006-"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/dern;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/dern;Z)V", "", "index", "Lkotlin/ranges/IntRange;", "wireman", "(I)Lkotlin/ranges/IntRange;", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "attabal", "Z", "saneness", "Lkotlin/reflect/jvm/internal/calls/dern;", "caller", "dern", "Ljava/lang/reflect/Member;", "()Ljava/lang/reflect/Member;", "member", "Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$attabal;", "Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$attabal;", "data", "marial", "[Lkotlin/ranges/IntRange;", "slices", "beachfront", "hasMfvcParameters", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ValueClassAwareCaller<M extends Member> implements dern<M> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final boolean isDefault;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final boolean hasMfvcParameters;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final M member;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final IntRange[] slices;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final dern<M> caller;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final attabal data;

    /* JADX INFO: compiled from: ValueClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$attabal;", "", "Lkotlin/ranges/IntRange;", "argumentRange", "", "", "Ljava/lang/reflect/Method;", "unboxParameters", "box", "<init>", "(Lkotlin/ranges/IntRange;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "attabal", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "saneness", "[Ljava/util/List;", "dern", "()[Ljava/util/List;", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final IntRange argumentRange;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final Method box;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final List<Method>[] unboxParameters;

        public attabal(IntRange argumentRange, List<Method>[] unboxParameters, Method method) {
            Intrinsics.checkNotNullParameter(argumentRange, "argumentRange");
            Intrinsics.checkNotNullParameter(unboxParameters, "unboxParameters");
            this.argumentRange = argumentRange;
            this.unboxParameters = unboxParameters;
            this.box = method;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final IntRange getArgumentRange() {
            return this.argumentRange;
        }

        public final List<Method>[] dern() {
            return this.unboxParameters;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final Method getBox() {
            return this.box;
        }
    }

    /* JADX INFO: compiled from: ValueClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR'\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\t0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u0014\u0010\u001eR\u0016\u0010$\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010#R\u0014\u0010'\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$saneness;", "Lkotlin/reflect/jvm/internal/calls/dern;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;", "descriptor", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "constructorDesc", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/polder;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/util/List;)V", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "attabal", "Ljava/lang/reflect/Method;", "constructorImpl", "saneness", "boxMethod", "dern", "Ljava/util/List;", "parameterUnboxMethods", "Ljava/lang/Class;", "wireman", "()Ljava/util/List;", "originalParametersGroups", "Ljava/lang/reflect/Type;", "marial", "parameterTypes", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class saneness implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Method constructorImpl;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final List<List<Method>> parameterUnboxMethods;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public final List<Type> parameterTypes;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final Method boxMethod;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final List<List<Class<?>>> originalParametersGroups;

        public saneness(dovishness descriptor, KDeclarationContainerImpl container, String constructorDesc, List<? extends polder> originalParameters) {
            Collection collectionMarial;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(constructorDesc, "constructorDesc");
            Intrinsics.checkNotNullParameter(originalParameters, "originalParameters");
            Method methodMolybdenite = container.molybdenite("constructor-impl", constructorDesc);
            Intrinsics.beachfront(methodMolybdenite);
            this.constructorImpl = methodMolybdenite;
            Method methodMolybdenite2 = container.molybdenite("box-impl", StringsKt.herdbook(constructorDesc, "V") + ReflectClassUtilKt.saneness(container.competently()));
            Intrinsics.beachfront(methodMolybdenite2);
            this.boxMethod = methodMolybdenite2;
            List<? extends polder> list = originalParameters;
            ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                oilcan type = ((polder) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                arrayList.add(impromptu.kowloon(coffeecake.attabal(type), descriptor));
            }
            this.parameterUnboxMethods = arrayList;
            ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    adultoid.dovishness();
                }
                beachfront beachfrontVarWireman = ((polder) obj).getType().setterwort().wireman();
                Intrinsics.competently(beachfrontVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                wireman wiremanVar = (wireman) beachfrontVarWireman;
                List<Method> list2 = this.parameterUnboxMethods.get(i);
                if (list2 != null) {
                    List<Method> list3 = list2;
                    collectionMarial = new ArrayList(p002kotlin.collections.dovishness.gintrap(list3, 10));
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        collectionMarial.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> clsMonoploid = molybdenite.monoploid(wiremanVar);
                    Intrinsics.beachfront(clsMonoploid);
                    collectionMarial = graveside.marial(clsMonoploid);
                }
                arrayList2.add(collectionMarial);
                i = i2;
            }
            this.originalParametersGroups = arrayList2;
            this.parameterTypes = p002kotlin.collections.dovishness.preprohormone(arrayList2);
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.dern
        public List<Type> attabal() {
            return this.parameterTypes;
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.dern
        public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
            Collection collectionMarial;
            Intrinsics.checkNotNullParameter(args, "args");
            List<Pair> listMolet = polloi.molet(args, this.parameterUnboxMethods);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listMolet) {
                Object objComponent1 = pair.component1();
                List list = (List) pair.component2();
                if (list != null) {
                    List list2 = list;
                    collectionMarial = new ArrayList(p002kotlin.collections.dovishness.gintrap(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectionMarial.add(((Method) it.next()).invoke(objComponent1, null));
                    }
                } else {
                    collectionMarial = graveside.marial(objComponent1);
                }
                cord.stratoscope(arrayList, collectionMarial);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.constructorImpl.invoke(null, Arrays.copyOf(array, array.length));
            return this.boxMethod.invoke(null, Arrays.copyOf(array, array.length));
        }

        public Void dern() {
            return null;
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.dern
        public Type getReturnType() {
            Class<?> returnType = this.boxMethod.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }

        @Override // p002kotlin.reflect.jvm.internal.calls.dern
        public /* bridge */ /* synthetic */ Member saneness() {
            return (Member) dern();
        }

        public final List<List<Class<?>>> wireman() {
            return this.originalParametersGroups;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    public ValueClassAwareCaller(CallableMemberDescriptor descriptor, dern<? extends M> oldCaller, boolean z) {
        Class clsMolybdenite;
        int i;
        attabal attabalVar;
        oilcan oilcanVarCutely;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(oldCaller, "oldCaller");
        this.isDefault = z;
        boolean z2 = false;
        if (oldCaller instanceof wireman.impromptu.dern) {
            starveling starvelingVarPolder = descriptor.polder();
            starvelingVarPolder = starvelingVarPolder == null ? descriptor.kattegat() : starvelingVarPolder;
            oilcan type = starvelingVarPolder != null ? starvelingVarPolder.getType() : null;
            if (type != null && p002kotlin.reflect.jvm.internal.impl.resolve.beachfront.taiyuan(type)) {
                List<Method> listImpassible = impromptu.impassible(coffeecake.attabal(type));
                Intrinsics.beachfront(listImpassible);
                List<Method> list = listImpassible;
                ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Method) it.next()).invoke(((wireman.impromptu.dern) oldCaller).getBoundReceiver(), null));
                }
                oldCaller = new wireman.impromptu.C0667wireman(((wireman.impromptu.dern) oldCaller).saneness(), arrayList.toArray(new Object[0]));
            }
        }
        this.caller = (dern<M>) oldCaller;
        this.member = (M) oldCaller.saneness();
        oilcan returnType = descriptor.getReturnType();
        Intrinsics.beachfront(returnType);
        boolean z3 = descriptor instanceof dovishness;
        Method methodCutely = ((z3 && ((dovishness) descriptor).isSuspend() && (oilcanVarCutely = p002kotlin.reflect.jvm.internal.impl.resolve.beachfront.cutely(returnType)) != null && p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.igbo(oilcanVarCutely)) || (clsMolybdenite = impromptu.molybdenite(returnType)) == null) ? null : impromptu.cutely(clsMolybdenite, descriptor);
        if (p002kotlin.reflect.jvm.internal.impl.resolve.beachfront.attabal(descriptor)) {
            attabalVar = new attabal(IntRange.INSTANCE.attabal(), new List[0], methodCutely);
        } else {
            int i2 = -1;
            if (!(oldCaller instanceof wireman.impromptu.dern) && !(oldCaller instanceof wireman.impromptu.C0667wireman)) {
                if (descriptor instanceof cutely) {
                    if (!(oldCaller instanceof p002kotlin.reflect.jvm.internal.calls.saneness)) {
                        i2 = 0;
                    }
                } else if (descriptor.kattegat() == null || (oldCaller instanceof p002kotlin.reflect.jvm.internal.calls.saneness)) {
                    i2 = 0;
                } else {
                    apical apicalVarSaneness = descriptor.saneness();
                    Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
                    if (p002kotlin.reflect.jvm.internal.impl.resolve.beachfront.competently(apicalVarSaneness)) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                }
            }
            int i3 = oldCaller instanceof wireman.impromptu.C0667wireman ? -((wireman.impromptu.C0667wireman) oldCaller).impromptu() : i2;
            List listMonoploid = impromptu.monoploid(descriptor, new Function1<wireman, Boolean>() { // from class: kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller$data$1$kotlinParameterTypes$1
                @Override // p002kotlin.jvm.functions.Function1
                public final Boolean invoke(wireman makeKotlinParameterTypes) {
                    Intrinsics.checkNotNullParameter(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
                    return Boolean.valueOf(p002kotlin.reflect.jvm.internal.impl.resolve.beachfront.competently(makeKotlinParameterTypes));
                }
            });
            if (this.isDefault) {
                Iterator it2 = listMonoploid.iterator();
                int iDern = 0;
                while (it2.hasNext()) {
                    iDern += dern((oilcan) it2.next());
                }
                i = ((iDern + 31) / 32) + 1;
            } else {
                i = 0;
            }
            int i4 = i + ((z3 && ((dovishness) descriptor).isSuspend()) ? 1 : 0);
            Iterator it3 = listMonoploid.iterator();
            int iDern2 = 0;
            while (it3.hasNext()) {
                iDern2 += dern((oilcan) it3.next());
            }
            int i5 = iDern2 + i3 + i4;
            impromptu.beachfront(this, i5, descriptor, this.isDefault);
            IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(Math.max(i2, 0), listMonoploid.size() + i2);
            List[] listArr = new List[i5];
            int i6 = 0;
            while (i6 < i5) {
                listArr[i6] = (i6 > intRangeMonoploid.getLast() || intRangeMonoploid.getFirst() > i6) ? null : impromptu.kowloon(coffeecake.attabal((oilcan) listMonoploid.get(i6 - i2)), descriptor);
                i6++;
            }
            attabalVar = new attabal(intRangeMonoploid, listArr, methodCutely);
        }
        this.data = attabalVar;
        List listDern = graveside.dern();
        dern<M> dernVar = this.caller;
        int length = dernVar instanceof wireman.impromptu.C0667wireman ? ((wireman.impromptu.C0667wireman) dernVar).getBoundReceiverComponents().length : dernVar instanceof wireman.impromptu.dern ? 1 : 0;
        if (length > 0) {
            listDern.add(p002kotlin.ranges.wireman.monoploid(0, length));
        }
        List<Method>[] listArrDern = attabalVar.dern();
        int length2 = listArrDern.length;
        int i7 = 0;
        while (i7 < length2) {
            List<Method> list2 = listArrDern[i7];
            int size = (list2 != null ? list2.size() : 1) + length;
            listDern.add(p002kotlin.ranges.wireman.monoploid(length, size));
            i7++;
            length = size;
        }
        this.slices = (IntRange[]) graveside.attabal(listDern).toArray(new IntRange[0]);
        Iterable argumentRange = this.data.getArgumentRange();
        if (!(argumentRange instanceof Collection) || !((Collection) argumentRange).isEmpty()) {
            Iterator it4 = argumentRange.iterator();
            while (it4.hasNext()) {
                List<Method> list3 = this.data.dern()[((kattegat) it4).nextInt()];
                if (list3 != null && list3.size() > 1) {
                    z2 = true;
                    break;
                }
            }
        }
        this.hasMfvcParameters = z2;
    }

    public static final int dern(oilcan oilcanVar) {
        List<Method> listImpassible = impromptu.impassible(coffeecake.attabal(oilcanVar));
        if (listImpassible != null) {
            return listImpassible.size();
        }
        return 1;
    }

    @Override // p002kotlin.reflect.jvm.internal.calls.dern
    public List<Type> attabal() {
        return this.caller.attabal();
    }

    @Override // p002kotlin.reflect.jvm.internal.calls.dern
    public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objCompetently;
        Object objCompetently2;
        Intrinsics.checkNotNullParameter(args, "args");
        IntRange argumentRange = this.data.getArgumentRange();
        List<Method>[] listArrDern = this.data.dern();
        Method box = this.data.getBox();
        if (!argumentRange.isEmpty()) {
            if (this.hasMfvcParameters) {
                List listWireman = graveside.wireman(args.length);
                int first = argumentRange.getFirst();
                for (int i = 0; i < first; i++) {
                    listWireman.add(args[i]);
                }
                int first2 = argumentRange.getFirst();
                int last = argumentRange.getLast();
                if (first2 <= last) {
                    while (true) {
                        List<Method> list = listArrDern[first2];
                        Object obj = args[first2];
                        if (list != null) {
                            for (Method method : list) {
                                List list2 = listWireman;
                                if (obj != null) {
                                    objCompetently2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                                    objCompetently2 = molybdenite.competently(returnType);
                                }
                                list2.add(objCompetently2);
                            }
                        } else {
                            listWireman.add(obj);
                        }
                        if (first2 == last) {
                            break;
                        }
                        first2++;
                    }
                }
                int last2 = argumentRange.getLast() + 1;
                int iWalach = polloi.walach(args);
                if (last2 <= iWalach) {
                    while (true) {
                        listWireman.add(args[last2]);
                        if (last2 == iWalach) {
                            break;
                        }
                        last2++;
                    }
                }
                args = graveside.attabal(listWireman).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int first3 = argumentRange.getFirst();
                    if (i2 > argumentRange.getLast() || first3 > i2) {
                        objCompetently = args[i2];
                    } else {
                        List<Method> list3 = listArrDern[i2];
                        Method method2 = list3 != null ? (Method) CollectionsKt.herdbook(list3) : null;
                        objCompetently = args[i2];
                        if (method2 != null) {
                            if (objCompetently != null) {
                                objCompetently = method2.invoke(objCompetently, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                                objCompetently = molybdenite.competently(returnType2);
                            }
                        }
                    }
                    objArr[i2] = objCompetently;
                }
                args = objArr;
            }
        }
        Object objCall = this.caller.call(args);
        return (objCall == p002kotlin.coroutines.intrinsics.attabal.beachfront() || box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // p002kotlin.reflect.jvm.internal.calls.dern
    public Type getReturnType() {
        return this.caller.getReturnType();
    }

    @Override // p002kotlin.reflect.jvm.internal.calls.dern
    public M saneness() {
        return this.member;
    }

    public final IntRange wireman(int index) {
        if (index >= 0) {
            IntRange[] intRangeArr = this.slices;
            if (index < intRangeArr.length) {
                return intRangeArr[index];
            }
        }
        IntRange[] intRangeArr2 = this.slices;
        if (intRangeArr2.length == 0) {
            return new IntRange(index, index);
        }
        int length = (index - intRangeArr2.length) + ((IntRange) polloi.nosophobia(intRangeArr2)).getLast() + 1;
        return new IntRange(length, length);
    }
}
