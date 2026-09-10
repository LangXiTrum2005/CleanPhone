package p002kotlin.reflect.jvm.internal;

import byname.dern;
import byname.marial;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import healthily.apical;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kurbash.arytenoidectomy;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.cord;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference;
import p002kotlin.jvm.internal.graveside;
import p002kotlin.reflect.KVisibility;
import p002kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly;
import p002kotlin.reflect.jvm.internal.impl.resolve.beachfront;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.kowloon;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.monoploid;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.taiyuan;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.cutely;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.impromptu;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import patroclinal.formularize;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0019*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010#\u001a\u0004\u0018\u00010\"*\u0006\u0012\u0002\b\u00030!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010&\u001a\u0004\u0018\u00010\"*\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010)\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010.*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001ai\u0010D\u001a\u00028\u0001\"\b\b\u0000\u00106*\u000205\"\b\b\u0001\u00108*\u0002072\n\u00109\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010:\u001a\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010AH\u0000¢\u0006\u0004\bD\u0010E\u001a'\u0010I\u001a\u00028\u0000\"\u0004\b\u0000\u0010F2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000GH\u0080\bø\u0001\u0000¢\u0006\u0004\bI\u0010J\"\u001a\u0010O\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010L\u001a\u0004\bM\u0010N\"\u0018\u0010T\u001a\u00020Q*\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S\"\u0018\u0010V\u001a\u00020Q*\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010S\"\u001a\u0010Z\u001a\u0004\u0018\u00010W*\u0002078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006["}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;", "Ljava/lang/Class;", "monoploid", "(Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "classLoader", "Lbyname/saneness;", "kotlinClassId", "", "arrayDimensions", "impassible", "(Ljava/lang/ClassLoader;Lbyname/saneness;I)Ljava/lang/Class;", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "className", "triweekly", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "beachfront", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/molybdenite;", "Lkotlin/reflect/KVisibility;", "polloi", "(Lkotlin/reflect/jvm/internal/impl/descriptors/molybdenite;)Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/attabal;", "", "", "marial", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/attabal;)Ljava/util/List;", "graveside", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/dern;", "arytenoidectomy", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/dern;)Ljava/lang/annotation/Annotation;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/competently;", "", "molybdenite", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/competently;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/saneness;", "attabal", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/saneness;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "dern", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "wireman", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "saneness", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Ljava/lang/reflect/Type;", "type", "competently", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/protobuf/triweekly;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/attabal;", "D", "moduleAnchor", "proto", "Lgenesis/dern;", "nameResolver", "Lgenesis/competently;", "typeTable", "Lgenesis/attabal;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lbyname/dern;", "Lbyname/dern;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lkurbash/arytenoidectomy;", "", "formularize", "(Lkurbash/arytenoidectomy;)Z", "isInlineClassType", "apical", "needsMultiFieldValueClassFlattening", "Lkotlin/reflect/jvm/internal/impl/descriptors/starveling;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f31930attabal = new dern("kotlin.jvm.JvmStatic");

    /* JADX INFO: compiled from: util.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31931attabal;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f31931attabal = iArr;
        }
    }

    public static final boolean apical(arytenoidectomy arytenoidectomyVar) {
        oilcan oilcanVarApical;
        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<this>");
        KTypeImpl kTypeImpl = arytenoidectomyVar instanceof KTypeImpl ? (KTypeImpl) arytenoidectomyVar : null;
        return (kTypeImpl == null || (oilcanVarApical = kTypeImpl.getType()) == null || !beachfront.taiyuan(oilcanVarApical)) ? false : true;
    }

    public static final Annotation arytenoidectomy(p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern dernVar) {
        wireman wiremanVarTaiyuan = DescriptorUtilsKt.taiyuan(dernVar);
        Class<?> clsMonoploid = wiremanVarTaiyuan != null ? monoploid(wiremanVarTaiyuan) : null;
        if (clsMonoploid == null) {
            clsMonoploid = null;
        }
        if (clsMonoploid == null) {
            return null;
        }
        Set<Map.Entry<marial, competently<?>>> setEntrySet = dernVar.attabal().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            marial marialVar = (marial) entry.getKey();
            competently competentlyVar = (competently) entry.getValue();
            ClassLoader classLoader = clsMonoploid.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            Object objMolybdenite = molybdenite(competentlyVar, classLoader);
            Pair pairAttabal = objMolybdenite != null ? formularize.attabal(marialVar.dern(), objMolybdenite) : null;
            if (pairAttabal != null) {
                arrayList.add(pairAttabal);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.marial(clsMonoploid, seminary.dovishness(arrayList), null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object attabal(saneness sanenessVar, ClassLoader classLoader) {
        oilcan oilcanVarDern;
        Class clsKowloon;
        TypedArrayValue typedArrayValue = sanenessVar instanceof TypedArrayValue ? (TypedArrayValue) sanenessVar : null;
        if (typedArrayValue == null || (oilcanVarDern = typedArrayValue.dern()) == null) {
            return null;
        }
        List<? extends competently<?>> listSaneness = sanenessVar.saneness();
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listSaneness, 10));
        Iterator<T> it = listSaneness.iterator();
        while (it.hasNext()) {
            arrayList.add(molybdenite((competently) it.next(), classLoader));
        }
        PrimitiveType primitiveTypeSaran = p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.saran(oilcanVarDern);
        int i = 0;
        switch (primitiveTypeSaran == null ? -1 : attabal.f31931attabal[primitiveTypeSaran.ordinal()]) {
            case -1:
                if (!p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.timberyard(oilcanVarDern)) {
                    throw new IllegalStateException(("Not an array type: " + oilcanVarDern).toString());
                }
                oilcan type = ((timberyard) CollectionsKt.herdbook(oilcanVarDern.dhss())).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = type.setterwort().wireman();
                wireman wiremanVar = beachfrontVarWireman instanceof wireman ? (wireman) beachfrontVarWireman : null;
                if (wiremanVar == null) {
                    throw new IllegalStateException(("Not a class type: " + type).toString());
                }
                if (p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.palmyra(type)) {
                    int size = sanenessVar.saneness().size();
                    String[] strArr = new String[size];
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i] = obj;
                        i++;
                    }
                    return strArr;
                }
                if (p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.empress(wiremanVar)) {
                    int size2 = sanenessVar.saneness().size();
                    Class[] clsArr = new Class[size2];
                    while (i < size2) {
                        Object obj2 = arrayList.get(i);
                        Intrinsics.competently(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i] = obj2;
                        i++;
                    }
                    return clsArr;
                }
                byname.saneness sanenessVarApical = DescriptorUtilsKt.apical(wiremanVar);
                if (sanenessVarApical == null || (clsKowloon = kowloon(classLoader, sanenessVarApical, 0, 4, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsKowloon, sanenessVar.saneness().size());
                Intrinsics.competently(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList.size();
                while (i < size3) {
                    objArr[i] = arrayList.get(i);
                    i++;
                }
                return objArr;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                int size4 = sanenessVar.saneness().size();
                boolean[] zArr = new boolean[size4];
                while (i < size4) {
                    Object obj3 = arrayList.get(i);
                    Intrinsics.competently(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i] = ((Boolean) obj3).booleanValue();
                    i++;
                }
                return zArr;
            case 2:
                int size5 = sanenessVar.saneness().size();
                char[] cArr = new char[size5];
                while (i < size5) {
                    Object obj4 = arrayList.get(i);
                    Intrinsics.competently(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i] = ((Character) obj4).charValue();
                    i++;
                }
                return cArr;
            case 3:
                int size6 = sanenessVar.saneness().size();
                byte[] bArr = new byte[size6];
                while (i < size6) {
                    Object obj5 = arrayList.get(i);
                    Intrinsics.competently(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i] = ((Byte) obj5).byteValue();
                    i++;
                }
                return bArr;
            case 4:
                int size7 = sanenessVar.saneness().size();
                short[] sArr = new short[size7];
                while (i < size7) {
                    Object obj6 = arrayList.get(i);
                    Intrinsics.competently(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i] = ((Short) obj6).shortValue();
                    i++;
                }
                return sArr;
            case 5:
                int size8 = sanenessVar.saneness().size();
                int[] iArr = new int[size8];
                while (i < size8) {
                    Object obj7 = arrayList.get(i);
                    Intrinsics.competently(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i] = ((Integer) obj7).intValue();
                    i++;
                }
                return iArr;
            case 6:
                int size9 = sanenessVar.saneness().size();
                float[] fArr = new float[size9];
                while (i < size9) {
                    Object obj8 = arrayList.get(i);
                    Intrinsics.competently(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i] = ((Float) obj8).floatValue();
                    i++;
                }
                return fArr;
            case 7:
                int size10 = sanenessVar.saneness().size();
                long[] jArr = new long[size10];
                while (i < size10) {
                    Object obj9 = arrayList.get(i);
                    Intrinsics.competently(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i] = ((Long) obj9).longValue();
                    i++;
                }
                return jArr;
            case 8:
                int size11 = sanenessVar.saneness().size();
                double[] dArr = new double[size11];
                while (i < size11) {
                    Object obj10 = arrayList.get(i);
                    Intrinsics.competently(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i] = ((Double) obj10).doubleValue();
                    i++;
                }
                return dArr;
        }
    }

    public static final Class<?> beachfront(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object competently(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (Intrinsics.wireman(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.wireman(type, Character.TYPE)) {
            return (char) 0;
        }
        if (Intrinsics.wireman(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (Intrinsics.wireman(type, Short.TYPE)) {
            return (short) 0;
        }
        if (Intrinsics.wireman(type, Integer.TYPE)) {
            return 0;
        }
        if (Intrinsics.wireman(type, Float.TYPE)) {
            return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (Intrinsics.wireman(type, Long.TYPE)) {
            return 0L;
        }
        if (Intrinsics.wireman(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (Intrinsics.wireman(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final dern cutely() {
        return f31930attabal;
    }

    public static final KFunctionImpl dern(Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        kurbash.dern dernVarCompute = functionReference != null ? functionReference.compute() : null;
        if (dernVarCompute instanceof KFunctionImpl) {
            return (KFunctionImpl) dernVarCompute;
        }
        return null;
    }

    public static final boolean formularize(arytenoidectomy arytenoidectomyVar) {
        oilcan oilcanVarApical;
        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<this>");
        KTypeImpl kTypeImpl = arytenoidectomyVar instanceof KTypeImpl ? (KTypeImpl) arytenoidectomyVar : null;
        return (kTypeImpl == null || (oilcanVarApical = kTypeImpl.getType()) == null || !beachfront.dern(oilcanVarApical)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<? extends java.lang.annotation.Annotation>, java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.Collection] */
    public static final List<Annotation> graveside(List<? extends Annotation> list) throws IllegalAccessException, InvocationTargetException {
        List listMarial;
        Iterable<Annotation> iterable = (Iterable) list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return list;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (Intrinsics.wireman(gibeonite.attabal.saneness(gibeonite.attabal.attabal((Annotation) it.next())).getSimpleName(), "Container")) {
                list = new ArrayList<>();
                for (Annotation annotation : iterable) {
                    Class clsSaneness = gibeonite.attabal.saneness(gibeonite.attabal.attabal(annotation));
                    if (!Intrinsics.wireman(clsSaneness.getSimpleName(), "Container") || clsSaneness.getAnnotation(graveside.class) == null) {
                        listMarial = p002kotlin.collections.graveside.marial(annotation);
                    } else {
                        Object objInvoke = clsSaneness.getDeclaredMethod("value", null).invoke(annotation, null);
                        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listMarial = p002kotlin.collections.arytenoidectomy.wireman((Annotation[]) objInvoke);
                    }
                    cord.stratoscope(list, listMarial);
                }
                break;
            }
        }
        return list;
    }

    public static final Class<?> impassible(ClassLoader classLoader, byname.saneness sanenessVar, int i) {
        p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern dernVar = p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern.f29852attabal;
        byname.wireman wiremanVarCutely = sanenessVar.saneness().cutely();
        Intrinsics.checkNotNullExpressionValue(wiremanVarCutely, "toUnsafe(...)");
        byname.saneness sanenessVarTriweekly = dernVar.triweekly(wiremanVarCutely);
        if (sanenessVarTriweekly != null) {
            sanenessVar = sanenessVarTriweekly;
        }
        String strSaneness = sanenessVar.impromptu().saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        String strSaneness2 = sanenessVar.taiyuan().saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness2, "asString(...)");
        return triweekly(classLoader, strSaneness, strSaneness2, i);
    }

    public static final <M extends triweekly, D extends p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> D impromptu(Class<?> moduleAnchor, M proto, genesis.dern nameResolver, genesis.competently typeTable, genesis.attabal metadataVersion, Function2<? super MemberDeserializer, ? super M, ? extends D> createDescriptor) {
        List<ProtoBuf$TypeParameter> typeParameterList;
        Intrinsics.checkNotNullParameter(moduleAnchor, "moduleAnchor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(createDescriptor, "createDescriptor");
        apical apicalVarAttabal = impassible.attabal(moduleAnchor);
        if (proto instanceof ProtoBuf$Function) {
            typeParameterList = ((ProtoBuf$Function) proto).getTypeParameterList();
        } else {
            if (!(proto instanceof ProtoBuf$Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            typeParameterList = ((ProtoBuf$Property) proto).getTypeParameterList();
        }
        List<ProtoBuf$TypeParameter> list = typeParameterList;
        impromptu impromptuVarAttabal = apicalVarAttabal.attabal();
        trm trmVarSaneness = apicalVarAttabal.saneness();
        genesis.impromptu impromptuVarSaneness = genesis.impromptu.f26670saneness.saneness();
        Intrinsics.beachfront(list);
        return createDescriptor.invoke(new MemberDeserializer(new cutely(impromptuVarAttabal, nameResolver, trmVarSaneness, typeTable, impromptuVarSaneness, metadataVersion, null, null, list)), proto);
    }

    public static /* synthetic */ Class kowloon(ClassLoader classLoader, byname.saneness sanenessVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return impassible(classLoader, sanenessVar, i);
    }

    public static final List<Annotation> marial(p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal attabalVar) {
        Annotation annotationArytenoidectomy;
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial annotations = attabalVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern dernVar : annotations) {
            walach walachVarCompetently = dernVar.competently();
            if (walachVarCompetently instanceof healthily.saneness) {
                annotationArytenoidectomy = ((healthily.saneness) walachVarCompetently).wireman();
            } else if (walachVarCompetently instanceof healthily.formularize.attabal) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.triweekly triweeklyVarDern = ((healthily.formularize.attabal) walachVarCompetently).dern();
                p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.wireman wiremanVar = triweeklyVarDern instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.wireman ? (p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.wireman) triweeklyVarDern : null;
                annotationArytenoidectomy = wiremanVar != null ? wiremanVar.saran() : null;
            } else {
                annotationArytenoidectomy = arytenoidectomy(dernVar);
            }
            if (annotationArytenoidectomy != null) {
                arrayList.add(annotationArytenoidectomy);
            }
        }
        return graveside(arrayList);
    }

    public static final Object molybdenite(competently<?> competentlyVar, ClassLoader classLoader) {
        if (competentlyVar instanceof p002kotlin.reflect.jvm.internal.impl.resolve.constants.attabal) {
            return arytenoidectomy(((p002kotlin.reflect.jvm.internal.impl.resolve.constants.attabal) competentlyVar).saneness());
        }
        if (competentlyVar instanceof saneness) {
            return attabal((saneness) competentlyVar, classLoader);
        }
        if (competentlyVar instanceof taiyuan) {
            Pair<? extends byname.saneness, ? extends marial> pairSaneness = ((taiyuan) competentlyVar).saneness();
            byname.saneness sanenessVarComponent1 = pairSaneness.component1();
            marial marialVarComponent2 = pairSaneness.component2();
            Class clsKowloon = kowloon(classLoader, sanenessVarComponent1, 0, 4, null);
            if (clsKowloon != null) {
                return polloi.attabal(clsKowloon, marialVarComponent2.dern());
            }
            return null;
        }
        if (!(competentlyVar instanceof kowloon)) {
            if (competentlyVar instanceof p002kotlin.reflect.jvm.internal.impl.resolve.constants.cutely ? true : competentlyVar instanceof monoploid) {
                return null;
            }
            return competentlyVar.saneness();
        }
        kowloon.saneness sanenessVarSaneness = ((kowloon) competentlyVar).saneness();
        if (sanenessVarSaneness instanceof kowloon.saneness.C0700saneness) {
            kowloon.saneness.C0700saneness c0700saneness = (kowloon.saneness.C0700saneness) sanenessVarSaneness;
            return impassible(classLoader, c0700saneness.saneness(), c0700saneness.attabal());
        }
        if (!(sanenessVarSaneness instanceof kowloon.saneness.attabal)) {
            throw new NoWhenBranchMatchedException();
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((kowloon.saneness.attabal) sanenessVarSaneness).attabal().setterwort().wireman();
        wireman wiremanVar = beachfrontVarWireman instanceof wireman ? (wireman) beachfrontVarWireman : null;
        if (wiremanVar != null) {
            return monoploid(wiremanVar);
        }
        return null;
    }

    public static final Class<?> monoploid(wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        walach walachVarCompetently = wiremanVar.competently();
        Intrinsics.checkNotNullExpressionValue(walachVarCompetently, "getSource(...)");
        if (walachVarCompetently instanceof p002kotlin.reflect.jvm.internal.impl.load.kotlin.molybdenite) {
            p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid monoploidVarWireman = ((p002kotlin.reflect.jvm.internal.impl.load.kotlin.molybdenite) walachVarCompetently).wireman();
            Intrinsics.competently(monoploidVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((healthily.beachfront) monoploidVarWireman).wireman();
        }
        if (walachVarCompetently instanceof healthily.formularize.attabal) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.triweekly triweeklyVarDern = ((healthily.formularize.attabal) walachVarCompetently).dern();
            Intrinsics.competently(triweeklyVarDern, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) triweeklyVarDern).getElement();
        }
        byname.saneness sanenessVarApical = DescriptorUtilsKt.apical(wiremanVar);
        if (sanenessVarApical == null) {
            return null;
        }
        return impassible(ReflectClassUtilKt.beachfront(wiremanVar.getClass()), sanenessVarApical, 0);
    }

    public static final KVisibility polloi(p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite molybdeniteVar) {
        Intrinsics.checkNotNullParameter(molybdeniteVar, "<this>");
        if (Intrinsics.wireman(molybdeniteVar, polloi.f30212marial)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.wireman(molybdeniteVar, polloi.f30207dern)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.wireman(molybdeniteVar, polloi.f30217wireman)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.wireman(molybdeniteVar, polloi.f30203attabal) ? true : Intrinsics.wireman(molybdeniteVar, polloi.f30214saneness)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    public static final KCallableImpl<?> saneness(Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl kFunctionImplDern = dern(obj);
        return kFunctionImplDern != null ? kFunctionImplDern : wireman(obj);
    }

    public static final starveling taiyuan(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        if (attabalVar.kattegat() == null) {
            return null;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarSaneness = attabalVar.saneness();
        Intrinsics.competently(apicalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((wireman) apicalVarSaneness).technofreak();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class<?> triweekly(ClassLoader classLoader, String str, String str2, int i) {
        if (Intrinsics.wireman(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(X3.j.d);
            }
            sb.append("L");
        }
        if (str.length() > 0) {
            sb.append(str + '.');
        }
        sb.append(p002kotlin.text.dovishness.merc(str2, '.', '$', false, 4, null));
        if (i > 0) {
            sb.append(";");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return healthily.marial.attabal(classLoader, string);
    }

    public static final KPropertyImpl<?> wireman(Object obj) {
        KPropertyImpl<?> kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
        kurbash.dern dernVarCompute = propertyReference != null ? propertyReference.compute() : null;
        if (dernVarCompute instanceof KPropertyImpl) {
            return (KPropertyImpl) dernVarCompute;
        }
        return null;
    }
}
