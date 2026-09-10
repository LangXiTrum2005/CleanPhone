package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f10316a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f10317b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f10318c = new CopyOnWriteArrayList();
    private final List<ICrashCallback> d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f10319e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10320a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f10320a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10320a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10320a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10320a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10320a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i2 = AnonymousClass1.f10320a[crashType.ordinal()];
        if (i2 == 1) {
            this.f10316a.add(iCrashCallback);
            this.f10317b.add(iCrashCallback);
            this.f10318c.add(iCrashCallback);
            this.d.add(iCrashCallback);
            return;
        }
        if (i2 == 2) {
            this.d.add(iCrashCallback);
            return;
        }
        if (i2 == 3) {
            this.f10317b.add(iCrashCallback);
        } else if (i2 == 4) {
            this.f10316a.add(iCrashCallback);
        } else {
            if (i2 != 5) {
                return;
            }
            this.f10318c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i2 = AnonymousClass1.f10320a[crashType.ordinal()];
        if (i2 == 1) {
            this.f10316a.remove(iCrashCallback);
            this.f10317b.remove(iCrashCallback);
            this.f10318c.remove(iCrashCallback);
            this.d.remove(iCrashCallback);
            return;
        }
        if (i2 == 2) {
            this.d.remove(iCrashCallback);
            return;
        }
        if (i2 == 3) {
            this.f10317b.remove(iCrashCallback);
        } else if (i2 == 4) {
            this.f10316a.remove(iCrashCallback);
        } else {
            if (i2 != 5) {
                return;
            }
            this.f10318c.remove(iCrashCallback);
        }
    }

    public final List<ICrashCallback> c() {
        return this.f10317b;
    }

    public final List<ICrashCallback> d() {
        return this.f10318c;
    }

    public final List<ICrashCallback> e() {
        return this.d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.f10319e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.f10319e.remove(iOOMCallback);
    }

    public final List<IOOMCallback> a() {
        return this.f10319e;
    }

    public final List<ICrashCallback> b() {
        return this.f10316a;
    }
}
