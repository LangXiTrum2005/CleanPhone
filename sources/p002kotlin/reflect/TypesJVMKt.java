package p002kotlin.reflect;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kurbash.arytenoidectomy;
import kurbash.beachfront;
import kurbash.monoploid;
import kurbash.polloi;
import kurbash.wireman;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.kowloon;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\t8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkurbash/arytenoidectomy;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "dern", "(Lkurbash/arytenoidectomy;Z)Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "jClass", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "marial", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "type", "", "impromptu", "(Ljava/lang/reflect/Type;)Ljava/lang/String;", "competently", "(Lkurbash/arytenoidectomy;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkurbash/arytenoidectomy;)V", "javaType", "beachfront", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "(Lkotlin/reflect/KTypeProjection;)V", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TypesJVMKt {

    /* JADX INFO: compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f29432attabal;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29432attabal = iArr;
        }
    }

    public static final Type beachfront(KTypeProjection kTypeProjection) {
        KVariance kVarianceWireman = kTypeProjection.wireman();
        if (kVarianceWireman == null) {
            return p002kotlin.reflect.attabal.f29433monoploid.attabal();
        }
        arytenoidectomy type = kTypeProjection.getType();
        Intrinsics.beachfront(type);
        int i = attabal.f29432attabal[kVarianceWireman.ordinal()];
        if (i == 1) {
            return new p002kotlin.reflect.attabal(null, dern(type, true));
        }
        if (i == 2) {
            return dern(type, true);
        }
        if (i == 3) {
            return new p002kotlin.reflect.attabal(dern(type, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Type competently(arytenoidectomy arytenoidectomyVar) {
        Type typeMarial;
        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<this>");
        return (!(arytenoidectomyVar instanceof kowloon) || (typeMarial = ((kowloon) arytenoidectomyVar).marial()) == null) ? wireman(arytenoidectomyVar, false, 1, null) : typeMarial;
    }

    public static final Type dern(arytenoidectomy arytenoidectomyVar, boolean z) {
        beachfront beachfrontVarDern = arytenoidectomyVar.dern();
        if (beachfrontVarDern instanceof monoploid) {
            return new polloi((monoploid) beachfrontVarDern);
        }
        if (!(beachfrontVarDern instanceof wireman)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + arytenoidectomyVar);
        }
        wireman wiremanVar = (wireman) beachfrontVarDern;
        Class clsDern = z ? gibeonite.attabal.dern(wiremanVar) : gibeonite.attabal.saneness(wiremanVar);
        List<KTypeProjection> listWireman = arytenoidectomyVar.wireman();
        if (listWireman.isEmpty()) {
            return clsDern;
        }
        if (!clsDern.isArray()) {
            return marial(clsDern, listWireman);
        }
        if (clsDern.getComponentType().isPrimitive()) {
            return clsDern;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.outmarry(listWireman);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + arytenoidectomyVar);
        }
        KVariance variance = kTypeProjection.getVariance();
        arytenoidectomy arytenoidectomyVarSaneness = kTypeProjection.saneness();
        int i = variance == null ? -1 : attabal.f29432attabal[variance.ordinal()];
        if (i == -1 || i == 1) {
            return clsDern;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.beachfront(arytenoidectomyVarSaneness);
        Type typeWireman = wireman(arytenoidectomyVarSaneness, false, 1, null);
        return typeWireman instanceof Class ? clsDern : new kurbash.attabal(typeWireman);
    }

    public static final String impromptu(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
        Sequence sequenceTriweekly = p002kotlin.sequences.arytenoidectomy.triweekly(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        return ((Class) SequencesKt___SequencesKt.supplicat(sequenceTriweekly)).getName() + dovishness.kattegat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, SequencesKt___SequencesKt.gintrap(sequenceTriweekly));
    }

    public static final Type marial(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<KTypeProjection> list2 = list;
            ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(beachfront((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<KTypeProjection> list3 = list;
            ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(beachfront((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeMarial = marial(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(p002kotlin.collections.dovishness.gintrap(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(beachfront((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeMarial, arrayList3);
    }

    public static /* synthetic */ Type wireman(arytenoidectomy arytenoidectomyVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return dern(arytenoidectomyVar, z);
    }
}
