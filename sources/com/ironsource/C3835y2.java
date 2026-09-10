package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3835y2 {
    public static C3835y2 a;

    /* JADX INFO: renamed from: com.ironsource.y2$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C3653n8.a.values().length];
            a = iArr;
            try {
                iArr[C3653n8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C3653n8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C3653n8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static C3835y2 a() {
        C3835y2 c3835y2 = a;
        return c3835y2 == null ? new C3835y2() : c3835y2;
    }

    public boolean a(Activity activity) {
        if (a.a[C3422aa.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) M9.b((Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.l("back");
            return true;
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
