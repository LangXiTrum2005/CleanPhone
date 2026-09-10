package com.bykv.vk.openvk.preload.b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Throwable> f305a;

    public a(List<Throwable> list) {
        this.f305a = list;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Throwable> it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
    }

    private static void a(Throwable th, List<StackTraceElement> list) {
        while (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (i == 0) {
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder("\b\b\b\nCaused by:");
                    if (message == null) {
                        message = "";
                    }
                    sb.append(message);
                    sb.append("\n\t");
                    sb.append(stackTraceElement.getClassName());
                    list.add(new StackTraceElement(sb.toString(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber()));
                } else {
                    list.add(stackTraceElement);
                }
            }
            th = th.getCause();
        }
    }
}
