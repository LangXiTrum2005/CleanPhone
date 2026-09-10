package yod;

import java.util.Stack;

/* JADX INFO: compiled from: TrimmedThrowableData.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f39740attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final StackTraceElement[] f39741dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f39742saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final marial f39743wireman;

    public marial(String str, String str2, StackTraceElement[] stackTraceElementArr, marial marialVar) {
        this.f39740attabal = str;
        this.f39742saneness = str2;
        this.f39741dern = stackTraceElementArr;
        this.f39743wireman = marialVar;
    }

    public static marial attabal(Throwable th, wireman wiremanVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        marial marialVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            marialVar = new marial(th2.getLocalizedMessage(), th2.getClass().getName(), wiremanVar.attabal(th2.getStackTrace()), marialVar);
        }
        return marialVar;
    }
}
