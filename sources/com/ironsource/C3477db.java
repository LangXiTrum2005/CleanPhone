package com.ironsource;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3477db {
    private final String a;
    private final int b;

    public C3477db(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private final String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        String strA = a(stackTrace, 4);
        String strB = b(stackTrace, 4);
        p002kotlin.jvm.internal.gintrap gintrapVar = p002kotlin.jvm.internal.gintrap.f29390attabal;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strA, strB}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public final int a() {
        return this.b;
    }

    public final String c() {
        String str = this.a;
        if (str == null || str.length() == 0) {
            return b();
        }
        return b() + " - " + this.a;
    }

    private final String a(StackTraceElement[] stackTraceElementArr, int i) {
        List listFormularize;
        List listFormularize2;
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        String className = stackTraceElementArr[i].getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
        List<String> listSplit = new Regex("\\.").split(className, 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listFormularize = p002kotlin.collections.adultoid.formularize();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listFormularize = CollectionsKt.mastfed(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listFormularize = p002kotlin.collections.adultoid.formularize();
            break;
        }
        String[] strArr = (String[]) listFormularize.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (!StringsKt.overspeculate(str, "$", false, 2, null)) {
            return str;
        }
        List<String> listSplit2 = new Regex("\\$").split(str, 0);
        if (listSplit2.isEmpty()) {
            listFormularize2 = p002kotlin.collections.adultoid.formularize();
        } else {
            ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
            while (listIterator2.hasPrevious()) {
                if (listIterator2.previous().length() != 0) {
                    listFormularize2 = CollectionsKt.mastfed(listSplit2, listIterator2.nextIndex() + 1);
                }
            }
            listFormularize2 = p002kotlin.collections.adultoid.formularize();
        }
        return ((String[]) listFormularize2.toArray(new String[0]))[0];
    }

    private final String b(StackTraceElement[] stackTraceElementArr, int i) {
        List listFormularize;
        int i2;
        List listFormularize2;
        List listFormularize3;
        if (stackTraceElementArr.length > i) {
            String className = stackTraceElementArr[i].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
            List<String> listSplit = new Regex("\\.").split(className, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listFormularize = CollectionsKt.mastfed(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        listFormularize = p002kotlin.collections.adultoid.formularize();
                        break;
                    }
                }
            } else {
                listFormularize = p002kotlin.collections.adultoid.formularize();
                break;
            }
            String[] strArr = (String[]) listFormularize.toArray(new String[0]);
            String str = strArr[strArr.length - 1];
            if (StringsKt.overspeculate(str, "$", false, 2, null)) {
                List<String> listSplit2 = new Regex("\\$").split(str, 0);
                if (!listSplit2.isEmpty()) {
                    ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() != 0) {
                            listFormularize3 = CollectionsKt.mastfed(listSplit2, listIterator2.nextIndex() + 1);
                        }
                    }
                    listFormularize3 = p002kotlin.collections.adultoid.formularize();
                } else {
                    listFormularize3 = p002kotlin.collections.adultoid.formularize();
                }
                return ((String[]) listFormularize3.toArray(new String[0]))[1] + "." + stackTraceElementArr[i].getMethodName();
            }
            String methodName = stackTraceElementArr[i].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "stackTrace[depth].methodName");
            if (StringsKt.overspeculate(methodName, "$", false, 2, null) && stackTraceElementArr.length > (i2 = i + 1)) {
                String className2 = stackTraceElementArr[i2].getClassName();
                Intrinsics.checkNotNullExpressionValue(className2, "stackTrace[depth + 1]\n                .className");
                List<String> listSplit3 = new Regex("\\$").split(className2, 0);
                if (!listSplit3.isEmpty()) {
                    ListIterator<String> listIterator3 = listSplit3.listIterator(listSplit3.size());
                    while (true) {
                        if (listIterator3.hasPrevious()) {
                            if (listIterator3.previous().length() != 0) {
                                listFormularize2 = CollectionsKt.mastfed(listSplit3, listIterator3.nextIndex() + 1);
                                break;
                            }
                        } else {
                            listFormularize2 = p002kotlin.collections.adultoid.formularize();
                            break;
                        }
                    }
                } else {
                    listFormularize2 = p002kotlin.collections.adultoid.formularize();
                    break;
                }
                String[] strArr2 = (String[]) listFormularize2.toArray(new String[0]);
                if (strArr2.length > 1) {
                    return strArr2[1] + "." + stackTraceElementArr[i2].getMethodName();
                }
                String methodName2 = stackTraceElementArr[i2].getMethodName();
                Intrinsics.checkNotNullExpressionValue(methodName2, "{\n              stackTra….methodName\n            }");
                return methodName2;
            }
            String methodName3 = stackTraceElementArr[i].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName3, "stackTrace[depth].methodName");
            return methodName3;
        }
        return "";
    }
}
