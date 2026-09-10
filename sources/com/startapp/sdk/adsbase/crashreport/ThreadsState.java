package com.startapp.sdk.adsbase.crashreport;

import android.os.Looper;
import com.startapp.sdk.internal.ci;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class ThreadsState implements Serializable {
    private static final long serialVersionUID = -4777916407910409315L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f40644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient boolean f40645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient boolean f40646c;
    public final transient HashSet d;
    private final long delay;
    private final String handlerDescription;
    private Map<String, ShrunkStackTraceElement[]> threadsStackTraces;

    public static class ShrunkStackTraceElement implements Serializable {
        private static final long serialVersionUID = -7615438011343681512L;
        private final long skipBeforeAmount;
        private final StackTraceElement stackTraceElement;

        public ShrunkStackTraceElement(long j, StackTraceElement stackTraceElement) {
            this.skipBeforeAmount = j;
            this.stackTraceElement = stackTraceElement;
        }

        public final long a() {
            return this.skipBeforeAmount;
        }

        public final StackTraceElement b() {
            return this.stackTraceElement;
        }
    }

    public ThreadsState(ci ciVar) {
        this.f40644a = ciVar.f40882a;
        this.f40645b = ciVar.f40885e;
        this.f40646c = ciVar.f;
        this.delay = ciVar.d;
        this.handlerDescription = ciVar.f40883b;
        this.d = ciVar.f40884c;
        Thread thread = Looper.getMainLooper().getThread();
        String str = thread.getName() + " (state = " + thread.getState() + ")";
        int i2 = 0;
        TreeMap treeMap = new TreeMap(new MainThreadComparator(i2));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (value != null && value.length > 0) {
                ShrunkStackTraceElement[] shrunkStackTraceElementArrB = b(value);
                if (shrunkStackTraceElementArrB != null && shrunkStackTraceElementArrB.length > 0) {
                    Thread.State state = key.getState();
                    if (key == thread) {
                        if (a(value)) {
                            return;
                        }
                        treeMap.put(str, shrunkStackTraceElementArrB);
                        i2 = 1;
                    } else if (!this.f40646c || state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                        treeMap.put(key.getName() + " (state = " + key.getState() + ")", shrunkStackTraceElementArrB);
                    }
                } else if (key == thread) {
                    return;
                }
            } else if (key == thread) {
                return;
            }
        }
        if (i2 == 0) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            ShrunkStackTraceElement[] shrunkStackTraceElementArrB2 = b(stackTrace);
            if (shrunkStackTraceElementArrB2 == null || shrunkStackTraceElementArrB2.length <= 0 || a(stackTrace)) {
                return;
            } else {
                treeMap.put(str, shrunkStackTraceElementArrB2);
            }
        }
        this.threadsStackTraces = treeMap;
    }

    public final long a() {
        return this.delay;
    }

    public final String b() {
        return this.handlerDescription;
    }

    public final Map c() {
        return this.threadsStackTraces;
    }

    public static class MainThreadComparator implements Comparator<String>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient String f40647a;

        private MainThreadComparator() {
            this.f40647a = Looper.getMainLooper().getThread().getName();
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3.startsWith(this.f40647a)) {
                return -1;
            }
            if (str4.startsWith(this.f40647a)) {
                return 1;
            }
            return str3.compareTo(str4);
        }

        public /* synthetic */ MainThreadComparator(int i2) {
            this();
        }
    }

    public final boolean a(StackTraceElement[] stackTraceElementArr) {
        if (this.d == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (className != null && methodName != null) {
                if (this.d.contains(className + '.' + methodName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ShrunkStackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        String className;
        ArrayList arrayList = new ArrayList();
        long j = 0;
        StackTraceElement stackTraceElement = null;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i2];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                boolean z4 = i2 < 3;
                String str = this.f40644a;
                boolean z5 = str == null || className.startsWith(str);
                if (z5) {
                    z2 = true;
                }
                if (!this.f40645b || z5 || z4 || z3) {
                    if (stackTraceElement != null) {
                        arrayList.add(new ShrunkStackTraceElement(j, stackTraceElement));
                        j = 0;
                        stackTraceElement = null;
                    }
                    arrayList.add(new ShrunkStackTraceElement(0L, stackTraceElement2));
                } else {
                    if (stackTraceElement != null) {
                        j++;
                    }
                    stackTraceElement = stackTraceElement2;
                }
                z3 = z5;
            }
            i2++;
        }
        if (stackTraceElement != null) {
            arrayList.add(new ShrunkStackTraceElement(j + 1, null));
        }
        if (z2) {
            return (ShrunkStackTraceElement[]) arrayList.toArray(new ShrunkStackTraceElement[0]);
        }
        return null;
    }
}
