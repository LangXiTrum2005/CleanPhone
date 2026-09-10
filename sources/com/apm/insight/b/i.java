package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10046a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f10047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10048c;
    private static Printer d;

    public interface a {
    }

    public static class b implements Printer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<Printer> f10049a = new ArrayList();
        private List<Printer> d = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<Printer> f10050b = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10052e = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f10051c = false;

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f10051c) {
                for (Printer printer : this.f10050b) {
                    if (!this.f10049a.contains(printer)) {
                        this.f10049a.add(printer);
                    }
                }
                this.f10050b.clear();
                this.f10051c = false;
            }
            if (this.f10049a.size() > i.f10046a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f10049a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() {
        if (f10048c) {
            return;
        }
        f10048c = true;
        f10047b = new b();
        Printer printerD = d();
        d = printerD;
        if (printerD != null) {
            f10047b.f10049a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f10047b);
        }
    }

    public static /* synthetic */ a b() {
        return null;
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f10047b.f10050b.contains(printer)) {
            return;
        }
        f10047b.f10050b.add(printer);
        f10047b.f10051c = true;
    }
}
