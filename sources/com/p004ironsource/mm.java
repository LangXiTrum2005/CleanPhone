package com.p004ironsource;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J%\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0003\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0007R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/mm;", "", "", "b", "", "Ljava/lang/StackTraceElement;", "stackTrace", "", "depth", "a", "([Ljava/lang/StackTraceElement;I)Ljava/lang/String;", "c", "Ljava/lang/String;", PglCryptUtils.KEY_MESSAGE, "I", "logLevel", "<init>", "(Ljava/lang/String;I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class mm {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int logLevel;

    public mm(String str, int i2) {
        this.message = str;
        this.logLevel = i2;
    }

    private final String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.e(stackTrace, "stackTrace");
        return String.format("%s %s", Arrays.copyOf(new Object[]{a(stackTrace, 4), b(stackTrace, 4)}, 2));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLogLevel() {
        return this.logLevel;
    }

    public final String c() {
        String str = this.message;
        if (str == null || str.length() == 0) {
            return b();
        }
        return b() + " - " + this.message;
    }

    private final String a(StackTraceElement[] stackTrace, int depth) {
        List listD0;
        if (stackTrace.length <= depth) {
            return "";
        }
        String className = stackTrace[depth].getClassName();
        Intrinsics.e(className, "stackTrace[depth]\n              .className");
        List listF = new Regex("\\.").f(className, 0);
        boolean zIsEmpty = listF.isEmpty();
        List listD1 = EmptyList.X;
        if (!zIsEmpty) {
            ListIterator listIterator = listF.listIterator(listF.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listD0 = listD1;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    listD0 = CollectionsKt.d0(listF, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listD0 = listD1;
            break;
        }
        String[] strArr = (String[]) listD0.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (!StringsKt.l(str, "$", false)) {
            return str;
        }
        List listF2 = new Regex("\\$").f(str, 0);
        if (!listF2.isEmpty()) {
            ListIterator listIterator2 = listF2.listIterator(listF2.size());
            while (listIterator2.hasPrevious()) {
                if (((String) listIterator2.previous()).length() != 0) {
                    listD1 = CollectionsKt.d0(listF2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        return ((String[]) listD1.toArray(new String[0]))[0];
    }

    private final String b(StackTraceElement[] stackTrace, int depth) {
        List listD0;
        int i2;
        if (stackTrace.length <= depth) {
            return "";
        }
        String className = stackTrace[depth].getClassName();
        Intrinsics.e(className, "stackTrace[depth]\n              .className");
        List listF = new Regex("\\.").f(className, 0);
        boolean zIsEmpty = listF.isEmpty();
        List listD1 = EmptyList.X;
        if (!zIsEmpty) {
            ListIterator listIterator = listF.listIterator(listF.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listD0 = listD1;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    listD0 = CollectionsKt.d0(listF, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listD0 = listD1;
            break;
        }
        String[] strArr = (String[]) listD0.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (StringsKt.l(str, "$", false)) {
            List listF2 = new Regex("\\$").f(str, 0);
            if (!listF2.isEmpty()) {
                ListIterator listIterator2 = listF2.listIterator(listF2.size());
                while (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        listD1 = CollectionsKt.d0(listF2, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
            }
            return ((String[]) listD1.toArray(new String[0]))[1] + '.' + stackTrace[depth].getMethodName();
        }
        String methodName = stackTrace[depth].getMethodName();
        Intrinsics.e(methodName, "stackTrace[depth].methodName");
        if (!StringsKt.l(methodName, "$", false) || stackTrace.length <= (i2 = depth + 1)) {
            String methodName2 = stackTrace[depth].getMethodName();
            Intrinsics.e(methodName2, "stackTrace[depth].methodName");
            return methodName2;
        }
        String className2 = stackTrace[i2].getClassName();
        Intrinsics.e(className2, "stackTrace[depth + 1]\n                .className");
        List listF3 = new Regex("\\$").f(className2, 0);
        if (!listF3.isEmpty()) {
            ListIterator listIterator3 = listF3.listIterator(listF3.size());
            while (listIterator3.hasPrevious()) {
                if (((String) listIterator3.previous()).length() != 0) {
                    listD1 = CollectionsKt.d0(listF3, listIterator3.nextIndex() + 1);
                    break;
                }
            }
        }
        String[] strArr2 = (String[]) listD1.toArray(new String[0]);
        if (strArr2.length <= 1) {
            String methodName3 = stackTrace[i2].getMethodName();
            Intrinsics.e(methodName3, "{\n              stackTra….methodName\n            }");
            return methodName3;
        }
        return strArr2[1] + '.' + stackTrace[i2].getMethodName();
    }
}
