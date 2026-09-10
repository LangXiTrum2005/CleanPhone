package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0669y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C0669y2 f31093a;

    /* JADX INFO: renamed from: com.ironsource.y2$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31094a;

        static {
            int[] iArr = new int[C0514p8.a.values().length];
            f31094a = iArr;
            try {
                iArr[C0514p8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31094a[C0514p8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31094a[C0514p8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static C0669y2 a() {
        C0669y2 c0669y2 = f31093a;
        return c0669y2 == null ? new C0669y2() : c0669y2;
    }

    public boolean a(Activity activity) {
        if (a.f31094a[C0301da.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) P9.b((Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.l("back");
            return true;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }
}
