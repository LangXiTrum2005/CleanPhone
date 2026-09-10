package com.p004ironsource;

import android.app.Activity;
import android.content.Context;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.controller.v;

/* JADX INFO: loaded from: classes5.dex */
public class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u5 f27365a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27366a;

        static {
            int[] iArr = new int[mh.a.values().length];
            f27366a = iArr;
            try {
                iArr[mh.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27366a[mh.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27366a[mh.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static u5 a() {
        u5 u5Var = f27365a;
        return u5Var == null ? new u5() : u5Var;
    }

    public boolean a(Activity activity) {
        if (a.f27366a[pk.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            v vVar = (v) dk.b((Context) activity).a().j();
            if (vVar == null) {
                return true;
            }
            vVar.k("back");
            return true;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }
}
