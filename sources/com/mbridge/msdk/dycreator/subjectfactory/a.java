package com.mbridge.msdk.dycreator.subjectfactory;

import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f33281a;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.subjectfactory.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class C0114a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33282a;

        static {
            int[] iArr = new int[b.values().length];
            f33282a = iArr;
            try {
                iArr[b.VIEW_OBSERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33282a[b.CLICK_OBSERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33282a[b.EFFECT_OBSERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33282a[b.REPORT_OBSERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private a() {
    }

    public static a a() {
        if (f33281a == null) {
            synchronized (a.class) {
                try {
                    if (f33281a == null) {
                        f33281a = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33281a;
    }

    public <T extends com.mbridge.msdk.dycreator.viewobserver.a> T a(b bVar) {
        int i10 = C0114a.f33282a[bVar.ordinal()];
        if (i10 == 1) {
            return new d();
        }
        if (i10 == 2) {
            return new c();
        }
        if (i10 == 3) {
            return new f();
        }
        if (i10 != 4) {
            return null;
        }
        return new h();
    }
}
