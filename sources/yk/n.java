package yk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xj.g0;
import xj.o;
import xj.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f54493a = g0.w0(rl.e.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f54494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f54495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f54496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f54497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f54498f;

    static {
        List<gm.c> listQ = o.Q(gm.c.BOOLEAN, gm.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (gm.c cVar : listQ) {
            String strB = cVar.h().f().b();
            kotlin.jvm.internal.n.e(strB, "it.wrapperFqName.shortName().asString()");
            t.a0(rl.e.f(strB, cVar.f41974b + "Value()" + cVar.d()), linkedHashSet);
        }
        f54494b = g0.v0(rl.e.f("CharSequence", "isEmpty()Z"), g0.v0(rl.e.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"), g0.v0(rl.e.f("Float", "isInfinite()Z", "isNaN()Z"), g0.v0(rl.e.f("Double", "isInfinite()Z", "isNaN()Z"), g0.v0(rl.e.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"), g0.v0(rl.e.g("List", "sort(Ljava/util/Comparator;)V"), linkedHashSet))))));
        f54495c = g0.v0(rl.e.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"), g0.v0(rl.e.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V"), g0.v0(rl.e.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z"), g0.v0(rl.e.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"), g0.v0(rl.e.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;"), g0.v0(rl.e.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V"), rl.e.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;")))))));
        f54496d = g0.v0(rl.e.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"), g0.v0(rl.e.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V"), rl.e.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z")));
        gm.c cVar2 = gm.c.BOOLEAN;
        gm.c cVar3 = gm.c.BYTE;
        List listQ2 = o.Q(cVar2, cVar3, gm.c.DOUBLE, gm.c.FLOAT, cVar3, gm.c.INT, gm.c.LONG, gm.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listQ2.iterator();
        while (it.hasNext()) {
            String strB2 = ((gm.c) it.next()).h().f().b();
            kotlin.jvm.internal.n.e(strB2, "it.wrapperFqName.shortName().asString()");
            String[] strArrA = rl.e.a("Ljava/lang/String;");
            t.a0(rl.e.f(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)), linkedHashSet2);
        }
        String[] strArrA2 = rl.e.a("D");
        LinkedHashSet linkedHashSetV0 = g0.v0(rl.e.f("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)), linkedHashSet2);
        String[] strArrA3 = rl.e.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f54497e = g0.v0(rl.e.f("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)), linkedHashSetV0);
        String[] strArrA4 = rl.e.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f54498f = rl.e.f("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }
}
