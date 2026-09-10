package p002kotlin.reflect.jvm.internal.impl.builtins.jvm;

import byname.saneness;
import byname.wireman;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.collections.starveling;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p002kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: JvmBuiltInsSignatures.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final taiyuan f29874attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Set<String> f29875beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Set<String> f29876competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Set<String> f29877dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Set<String> f29878impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Set<String> f29879marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Set<String> f29880saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Set<String> f29881wireman;

    static {
        taiyuan taiyuanVar = new taiyuan();
        f29874attabal = taiyuanVar;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f30687attabal;
        f29880saneness = starveling.formularize(signatureBuildingComponents.beachfront("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f29877dern = starveling.apical(starveling.apical(starveling.apical(starveling.apical(starveling.apical(starveling.apical(taiyuanVar.saneness(), signatureBuildingComponents.beachfront("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), signatureBuildingComponents.marial("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), signatureBuildingComponents.marial("Double", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.marial("Float", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.marial("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), signatureBuildingComponents.marial("CharSequence", "isEmpty()Z"));
        f29881wireman = signatureBuildingComponents.beachfront("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f29879marial = starveling.apical(starveling.apical(starveling.apical(starveling.apical(starveling.apical(starveling.apical(signatureBuildingComponents.marial("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), signatureBuildingComponents.beachfront("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), signatureBuildingComponents.marial("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), signatureBuildingComponents.marial("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), signatureBuildingComponents.beachfront("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), signatureBuildingComponents.beachfront("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), signatureBuildingComponents.beachfront("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f29875beachfront = starveling.apical(starveling.apical(signatureBuildingComponents.beachfront("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), signatureBuildingComponents.beachfront("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), signatureBuildingComponents.beachfront("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> setAttabal = taiyuanVar.attabal();
        String[] strArrSaneness = signatureBuildingComponents.saneness("D");
        Set setApical = starveling.apical(setAttabal, signatureBuildingComponents.marial("Float", (String[]) Arrays.copyOf(strArrSaneness, strArrSaneness.length)));
        String[] strArrSaneness2 = signatureBuildingComponents.saneness("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f29876competently = starveling.apical(setApical, signatureBuildingComponents.marial("String", (String[]) Arrays.copyOf(strArrSaneness2, strArrSaneness2.length)));
        String[] strArrSaneness3 = signatureBuildingComponents.saneness("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f29878impromptu = signatureBuildingComponents.marial("Throwable", (String[]) Arrays.copyOf(strArrSaneness3, strArrSaneness3.length));
    }

    public final boolean apical(wireman fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (cutely(fqName)) {
            return true;
        }
        saneness sanenessVarTriweekly = dern.f29852attabal.triweekly(fqName);
        if (sanenessVarTriweekly == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(sanenessVarTriweekly.saneness().saneness()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final Set<String> attabal() {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f30687attabal;
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BYTE;
        List listKowloon = adultoid.kowloon(jvmPrimitiveType, jvmPrimitiveType2, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType2, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listKowloon.iterator();
        while (it.hasNext()) {
            String strDern = ((JvmPrimitiveType) it.next()).getWrapperFqName().competently().dern();
            Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
            String[] strArrSaneness = signatureBuildingComponents.saneness("Ljava/lang/String;");
            cord.stratoscope(linkedHashSet, signatureBuildingComponents.marial(strDern, (String[]) Arrays.copyOf(strArrSaneness, strArrSaneness.length)));
        }
        return linkedHashSet;
    }

    public final Set<String> beachfront() {
        return f29877dern;
    }

    public final Set<String> competently() {
        return f29875beachfront;
    }

    public final boolean cutely(wireman fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return Intrinsics.wireman(fqName, competently.attabal.f29769taiyuan) || competently.marial(fqName);
    }

    public final Set<String> dern() {
        return f29881wireman;
    }

    public final Set<String> impromptu() {
        return f29878impromptu;
    }

    public final Set<String> marial() {
        return f29876competently;
    }

    public final Set<String> saneness() {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f30687attabal;
        List<JvmPrimitiveType> listKowloon = adultoid.kowloon(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : listKowloon) {
            String strDern = jvmPrimitiveType.getWrapperFqName().competently().dern();
            Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
            cord.stratoscope(linkedHashSet, signatureBuildingComponents.marial(strDern, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()));
        }
        return linkedHashSet;
    }

    public final Set<String> taiyuan() {
        return f29879marial;
    }

    public final Set<String> wireman() {
        return f29880saneness;
    }
}
