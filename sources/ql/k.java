package ql;

import java.util.LinkedHashMap;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f49154a = new d(g.f49144b, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f49155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f49156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f49157d;

    static {
        g gVar = g.f49145c;
        f49155b = new d(gVar, false);
        f49156c = new d(gVar, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        od.c cVar = new od.c(29);
        new s1(cVar, "java/util/".concat("Iterator")).i("forEachRemaining", new i(strConcat4, 0));
        new s1(cVar, "java/lang/".concat("Iterable")).i("spliterator", new m(1, 4));
        s1 s1Var = new s1(cVar, "java/util/".concat("Collection"));
        s1Var.i("removeIf", new i(strConcat2, 6));
        s1Var.i("stream", new i(strConcat8, 7));
        s1Var.i("parallelStream", new i(strConcat8, 8));
        new s1(cVar, "java/util/".concat("List")).i("replaceAll", new i(strConcat7, 9));
        s1 s1Var2 = new s1(cVar, "java/util/".concat("Map"));
        s1Var2.i("forEach", new i(strConcat6, 10));
        s1Var2.i("putIfAbsent", new i(strConcat, 11));
        s1Var2.i("replace", new i(strConcat, 12));
        s1Var2.i("replace", new i(strConcat, 13));
        s1Var2.i("replaceAll", new i(strConcat5, 14));
        s1Var2.i("compute", new j(strConcat, strConcat5, 0));
        s1Var2.i("computeIfAbsent", new j(strConcat, strConcat3, 1));
        s1Var2.i("computeIfPresent", new j(strConcat, strConcat5, 2));
        s1Var2.i("merge", new j(strConcat, strConcat5, 3));
        s1 s1Var3 = new s1(cVar, strConcat9);
        s1Var3.i("empty", new i(strConcat9, 15));
        s1Var3.i("of", new j(strConcat, strConcat9, 4));
        s1Var3.i("ofNullable", new j(strConcat, strConcat9, 5));
        s1Var3.i("get", new i(strConcat, 16));
        s1Var3.i("ifPresent", new i(strConcat4, 17));
        new s1(cVar, "java/lang/".concat("ref/Reference")).i("get", new i(strConcat, 18));
        new s1(cVar, strConcat2).i("test", new i(strConcat, 19));
        new s1(cVar, "java/util/function/".concat("BiPredicate")).i("test", new i(strConcat, 20));
        new s1(cVar, strConcat4).i("accept", new i(strConcat, 1));
        new s1(cVar, strConcat6).i("accept", new i(strConcat, 2));
        new s1(cVar, strConcat3).i("apply", new i(strConcat, 3));
        new s1(cVar, strConcat5).i("apply", new i(strConcat, 4));
        new s1(cVar, "java/util/function/".concat("Supplier")).i("get", new i(strConcat, 5));
        f49157d = (LinkedHashMap) cVar.f47386b;
    }
}
