package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.ironsource.gb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0356gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28747b;

    public C0356gb(String str, int i10) {
        this.f28746a = str;
        this.f28747b = i10;
    }

    private final String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        kotlin.jvm.internal.n.e(stackTrace, "stackTrace");
        return String.format("%s %s", Arrays.copyOf(new Object[]{a(stackTrace, 4), b(stackTrace, 4)}, 2));
    }

    public final int a() {
        return this.f28747b;
    }

    public final String c() {
        String str = this.f28746a;
        return (str == null || str.length() == 0) ? b() : wi.d.i(b(), " - ", this.f28746a);
    }

    private final String a(StackTraceElement[] stackTraceElementArr, int i10) {
        List listC;
        List listK0;
        List listC2;
        if (stackTraceElementArr.length <= i10) {
            return "";
        }
        String className = stackTraceElementArr[i10].getClassName();
        kotlin.jvm.internal.n.e(className, "stackTrace[depth]\n              .className");
        Pattern patternCompile = Pattern.compile("\\.");
        kotlin.jvm.internal.n.e(patternCompile, "compile(...)");
        an.h.G0(0);
        Matcher matcher = patternCompile.matcher(className);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(className.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(className.subSequence(iEnd, className.length()).toString());
            listC = arrayList;
        } else {
            listC = j1.f.C(className.toString());
        }
        boolean zIsEmpty = listC.isEmpty();
        List listK1 = xj.v.f53866a;
        if (!zIsEmpty) {
            ListIterator listIterator = listC.listIterator(listC.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listK0 = listK1;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    listK0 = xj.n.K0(listC, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listK0 = listK1;
            break;
        }
        String[] strArr = (String[]) listK0.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (!an.h.q0(str, "$", false)) {
            return str;
        }
        Pattern patternCompile2 = Pattern.compile("\\$");
        kotlin.jvm.internal.n.e(patternCompile2, "compile(...)");
        an.h.G0(0);
        Matcher matcher2 = patternCompile2.matcher(str);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd2 = 0;
            do {
                arrayList2.add(str.subSequence(iEnd2, matcher2.start()).toString());
                iEnd2 = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str.subSequence(iEnd2, str.length()).toString());
            listC2 = arrayList2;
        } else {
            listC2 = j1.f.C(str.toString());
        }
        if (!listC2.isEmpty()) {
            ListIterator listIterator2 = listC2.listIterator(listC2.size());
            while (listIterator2.hasPrevious()) {
                if (((String) listIterator2.previous()).length() != 0) {
                    listK1 = xj.n.K0(listC2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        return ((String[]) listK1.toArray(new String[0]))[0];
    }

    private final String b(StackTraceElement[] stackTraceElementArr, int i10) {
        List listC;
        List listK0;
        int i11;
        List listC2;
        List listC3;
        if (stackTraceElementArr.length > i10) {
            String className = stackTraceElementArr[i10].getClassName();
            kotlin.jvm.internal.n.e(className, "stackTrace[depth]\n              .className");
            Pattern patternCompile = Pattern.compile("\\.");
            kotlin.jvm.internal.n.e(patternCompile, "compile(...)");
            an.h.G0(0);
            Matcher matcher = patternCompile.matcher(className);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(className.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(className.subSequence(iEnd, className.length()).toString());
                listC = arrayList;
            } else {
                listC = j1.f.C(className.toString());
            }
            boolean zIsEmpty = listC.isEmpty();
            List listK1 = xj.v.f53866a;
            if (!zIsEmpty) {
                ListIterator listIterator = listC.listIterator(listC.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listK0 = listK1;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        listK0 = xj.n.K0(listC, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listK0 = listK1;
                break;
            }
            String[] strArr = (String[]) listK0.toArray(new String[0]);
            String str = strArr[strArr.length - 1];
            if (an.h.q0(str, "$", false)) {
                Pattern patternCompile2 = Pattern.compile("\\$");
                kotlin.jvm.internal.n.e(patternCompile2, "compile(...)");
                an.h.G0(0);
                Matcher matcher2 = patternCompile2.matcher(str);
                if (matcher2.find()) {
                    ArrayList arrayList2 = new ArrayList(10);
                    int iEnd2 = 0;
                    do {
                        arrayList2.add(str.subSequence(iEnd2, matcher2.start()).toString());
                        iEnd2 = matcher2.end();
                    } while (matcher2.find());
                    arrayList2.add(str.subSequence(iEnd2, str.length()).toString());
                    listC3 = arrayList2;
                } else {
                    listC3 = j1.f.C(str.toString());
                }
                if (!listC3.isEmpty()) {
                    ListIterator listIterator2 = listC3.listIterator(listC3.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            listK1 = xj.n.K0(listC3, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                return wi.d.i(((String[]) listK1.toArray(new String[0]))[1], ".", stackTraceElementArr[i10].getMethodName());
            }
            String methodName = stackTraceElementArr[i10].getMethodName();
            kotlin.jvm.internal.n.e(methodName, "stackTrace[depth].methodName");
            if (an.h.q0(methodName, "$", false) && stackTraceElementArr.length > (i11 = i10 + 1)) {
                String className2 = stackTraceElementArr[i11].getClassName();
                kotlin.jvm.internal.n.e(className2, "stackTrace[depth + 1]\n                .className");
                Pattern patternCompile3 = Pattern.compile("\\$");
                kotlin.jvm.internal.n.e(patternCompile3, "compile(...)");
                an.h.G0(0);
                Matcher matcher3 = patternCompile3.matcher(className2);
                if (matcher3.find()) {
                    ArrayList arrayList3 = new ArrayList(10);
                    int iEnd3 = 0;
                    do {
                        arrayList3.add(className2.subSequence(iEnd3, matcher3.start()).toString());
                        iEnd3 = matcher3.end();
                    } while (matcher3.find());
                    arrayList3.add(className2.subSequence(iEnd3, className2.length()).toString());
                    listC2 = arrayList3;
                } else {
                    listC2 = j1.f.C(className2.toString());
                }
                if (!listC2.isEmpty()) {
                    ListIterator listIterator3 = listC2.listIterator(listC2.size());
                    while (listIterator3.hasPrevious()) {
                        if (((String) listIterator3.previous()).length() != 0) {
                            listK1 = xj.n.K0(listC2, listIterator3.nextIndex() + 1);
                            break;
                        }
                    }
                }
                String[] strArr2 = (String[]) listK1.toArray(new String[0]);
                if (strArr2.length > 1) {
                    return wi.d.i(strArr2[1], ".", stackTraceElementArr[i11].getMethodName());
                }
                String methodName2 = stackTraceElementArr[i11].getMethodName();
                kotlin.jvm.internal.n.e(methodName2, "{\n              stackTra….methodName\n            }");
                return methodName2;
            }
            String methodName3 = stackTraceElementArr[i10].getMethodName();
            kotlin.jvm.internal.n.e(methodName3, "stackTrace[depth].methodName");
            return methodName3;
        }
        return "";
    }
}
