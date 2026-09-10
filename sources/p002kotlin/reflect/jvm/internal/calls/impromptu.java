package p002kotlin.reflect.jvm.internal.calls;

import byname.marial;
import byname.saneness;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.signature.SignatureVisitor;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.cord;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.beachfront;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.coffeecake;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.molybdenite;

/* JADX INFO: compiled from: ValueClassAwareCaller.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010\u001d*\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\"2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\"2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010$\u001a\u0019\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"*\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"*\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010,\u001a\u0004\u0018\u00010+*\u0004\u0018\u00010+2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b,\u0010-\"\u001a\u00100\u001a\u0004\u0018\u00010\u0019*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/beachfront;", "", "graveside", "(Lkotlin/reflect/jvm/internal/impl/descriptors/beachfront;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/merc;", "type", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "", "Ljava/lang/reflect/Method;", "kowloon", "(Lkotlin/reflect/jvm/internal/impl/types/merc;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/util/List;", "impassible", "(Lkotlin/reflect/jvm/internal/impl/types/merc;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/calls/dern;", "", "expectedArgsSize", "", "isDefault", "", "beachfront", "(Lkotlin/reflect/jvm/internal/calls/dern;ILkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)V", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;", "isSpecificClass", "Lkotlin/reflect/jvm/internal/impl/types/oilcan;", "monoploid", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Ljava/lang/reflect/Member;", "M", "impromptu", "(Lkotlin/reflect/jvm/internal/calls/dern;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)Lkotlin/reflect/jvm/internal/calls/dern;", "arytenoidectomy", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Z", "Ljava/lang/Class;", "formularize", "(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/reflect/Method;", "cutely", "molybdenite", "(Lkotlin/reflect/jvm/internal/impl/types/oilcan;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/apical;", "polloi", "(Lkotlin/reflect/jvm/internal/impl/descriptors/apical;)Ljava/lang/Class;", "", "competently", "(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class impromptu {
    public static final oilcan apical(CallableMemberDescriptor callableMemberDescriptor) {
        starveling starvelingVarPolder = callableMemberDescriptor.polder();
        starveling starvelingVarKattegat = callableMemberDescriptor.kattegat();
        if (starvelingVarPolder != null) {
            return starvelingVarPolder.getType();
        }
        if (starvelingVarKattegat == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof cutely) {
            return starvelingVarKattegat.getType();
        }
        apical apicalVarSaneness = callableMemberDescriptor.saneness();
        wireman wiremanVar = apicalVarSaneness instanceof wireman ? (wireman) apicalVarSaneness : null;
        if (wiremanVar != null) {
            return wiremanVar.impassible();
        }
        return null;
    }

    public static final boolean arytenoidectomy(CallableMemberDescriptor callableMemberDescriptor) {
        oilcan oilcanVarApical = apical(callableMemberDescriptor);
        return oilcanVarApical != null && beachfront.impromptu(oilcanVarApical);
    }

    public static final void beachfront(dern<?> dernVar, int i, CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        if (marial.attabal(dernVar) == i) {
            return;
        }
        throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + marial.attabal(dernVar) + " != " + i + "\nCalling: " + callableMemberDescriptor + "\nParameter types: " + dernVar.attabal() + ")\nDefault: " + z);
    }

    public static final Object competently(Object obj, CallableMemberDescriptor descriptor) {
        oilcan oilcanVarApical;
        Class<?> clsMolybdenite;
        Method methodFormularize;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (((descriptor instanceof saran) && beachfront.marial((premeiotic) descriptor)) || (oilcanVarApical = apical(descriptor)) == null || (clsMolybdenite = molybdenite(oilcanVarApical)) == null || (methodFormularize = formularize(clsMolybdenite, descriptor)) == null) ? obj : methodFormularize.invoke(obj, null);
    }

    public static final Method cutely(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", formularize(cls, callableMemberDescriptor).getReturnType());
            Intrinsics.beachfront(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    public static final Method formularize(Class<?> cls, CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            Intrinsics.beachfront(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final String graveside(p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVar) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        saneness sanenessVarApical = DescriptorUtilsKt.apical(beachfrontVar);
        Intrinsics.beachfront(sanenessVarApical);
        String strDern = sanenessVarApical.dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        return foreshot.saneness.saneness(strDern);
    }

    public static final List<Method> impassible(merc type) {
        Intrinsics.checkNotNullParameter(type, "type");
        List<String> listTriweekly = triweekly(coffeecake.attabal(type));
        if (listTriweekly == null) {
            return null;
        }
        List<String> list = listTriweekly;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = type.setterwort().wireman();
        Intrinsics.competently(beachfrontVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> clsMonoploid = molybdenite.monoploid((wireman) beachfrontVarWireman);
        Intrinsics.beachfront(clsMonoploid);
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsMonoploid.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:21:0x0066->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends Member> dern<M> impromptu(dern<? extends M> dernVar, CallableMemberDescriptor descriptor, boolean z) {
        List<cultivated> list;
        Iterator<T> it;
        oilcan type;
        oilcan returnType;
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!beachfront.attabal(descriptor)) {
            List<starveling> listGusty = descriptor.gusty();
            Intrinsics.checkNotNullExpressionValue(listGusty, "getContextReceiverParameters(...)");
            List<starveling> list2 = listGusty;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                List<cultivated> listBeachfront = descriptor.beachfront();
                Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
                list = listBeachfront;
                if (!(list instanceof Collection)) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        type = ((cultivated) it.next()).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        if (beachfront.impromptu(type)) {
                        }
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType != null) {
                    }
                }
                it = list.iterator();
                while (it.hasNext()) {
                    type = ((cultivated) it.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (beachfront.impromptu(type)) {
                    }
                }
                returnType = descriptor.getReturnType();
                if (returnType != null) {
                }
            }
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                oilcan type2 = ((starveling) it2.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                if (beachfront.impromptu(type2)) {
                }
            }
            List<cultivated> listBeachfront2 = descriptor.beachfront();
            Intrinsics.checkNotNullExpressionValue(listBeachfront2, "getValueParameters(...)");
            list = listBeachfront2;
            if (!(list instanceof Collection) && list.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? dernVar : dernVar;
            }
            it = list.iterator();
            while (it.hasNext()) {
                type = ((cultivated) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                if (beachfront.impromptu(type)) {
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !beachfront.dern(returnType)) && !arytenoidectomy(descriptor)) {
            }
        }
        return new ValueClassAwareCaller(descriptor, dernVar, z);
    }

    public static final List<Method> kowloon(merc mercVar, CallableMemberDescriptor callableMemberDescriptor) {
        Method methodFormularize;
        List<Method> listImpassible = impassible(mercVar);
        if (listImpassible != null) {
            return listImpassible;
        }
        Class<?> clsMolybdenite = molybdenite(mercVar);
        if (clsMolybdenite == null || (methodFormularize = formularize(clsMolybdenite, callableMemberDescriptor)) == null) {
            return null;
        }
        return graveside.marial(methodFormularize);
    }

    public static final Class<?> molybdenite(oilcan oilcanVar) {
        oilcan oilcanVarApical;
        Class<?> clsPolloi = polloi(oilcanVar.setterwort().wireman());
        if (clsPolloi == null) {
            return null;
        }
        if (nosophobia.formularize(oilcanVar) && ((oilcanVarApical = beachfront.apical(oilcanVar)) == null || nosophobia.formularize(oilcanVarApical) || p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.igbo(oilcanVarApical))) {
            return null;
        }
        return clsPolloi;
    }

    public static final List<oilcan> monoploid(CallableMemberDescriptor callableMemberDescriptor, Function1<? super wireman, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        starveling starvelingVarPolder = callableMemberDescriptor.polder();
        oilcan type = starvelingVarPolder != null ? starvelingVarPolder.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof cutely) {
            wireman wiremanVarDent = ((cutely) callableMemberDescriptor).dent();
            Intrinsics.checkNotNullExpressionValue(wiremanVarDent, "getConstructedClass(...)");
            if (wiremanVarDent.gintrap()) {
                apical apicalVarSaneness = wiremanVarDent.saneness();
                Intrinsics.competently(apicalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((wireman) apicalVarSaneness).impassible());
            }
        } else {
            apical apicalVarSaneness2 = callableMemberDescriptor.saneness();
            Intrinsics.checkNotNullExpressionValue(apicalVarSaneness2, "getContainingDeclaration(...)");
            if ((apicalVarSaneness2 instanceof wireman) && function1.invoke(apicalVarSaneness2).booleanValue()) {
                arrayList.add(((wireman) apicalVarSaneness2).impassible());
            }
        }
        List<cultivated> listBeachfront = callableMemberDescriptor.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        Iterator<T> it = listBeachfront.iterator();
        while (it.hasNext()) {
            arrayList.add(((cultivated) it.next()).getType());
        }
        return arrayList;
    }

    public static final Class<?> polloi(apical apicalVar) {
        if (!(apicalVar instanceof wireman) || !beachfront.saneness(apicalVar)) {
            return null;
        }
        wireman wiremanVar = (wireman) apicalVar;
        Class<?> clsMonoploid = molybdenite.monoploid(wiremanVar);
        if (clsMonoploid != null) {
            return clsMonoploid;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + wiremanVar.getName() + " cannot be found (classId=" + DescriptorUtilsKt.apical((p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront) apicalVar) + ')');
    }

    public static /* synthetic */ dern taiyuan(dern dernVar, CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return impromptu(dernVar, callableMemberDescriptor, z);
    }

    public static final List<String> triweekly(merc mercVar) {
        Collection collectionMarial;
        if (!beachfront.taiyuan(mercVar)) {
            return null;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = mercVar.setterwort().wireman();
        Intrinsics.competently(beachfrontVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        p002kotlin.reflect.jvm.internal.impl.descriptors.oilcan<merc> oilcanVarMonoploid = DescriptorUtilsKt.monoploid((wireman) beachfrontVarWireman);
        Intrinsics.beachfront(oilcanVarMonoploid);
        Iterable<Pair> iterableSaneness = oilcanVarMonoploid.saneness();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : iterableSaneness) {
            marial marialVar = (marial) pair.component1();
            List<String> listTriweekly = triweekly((merc) pair.component2());
            if (listTriweekly != null) {
                List<String> list = listTriweekly;
                collectionMarial = new ArrayList(dovishness.gintrap(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    collectionMarial.add(marialVar.marial() + SignatureVisitor.SUPER + ((String) it.next()));
                }
            } else {
                collectionMarial = graveside.marial(marialVar.marial());
            }
            cord.stratoscope(arrayList, collectionMarial);
        }
        return arrayList;
    }
}
