package com.inmobi.media;

import A.C0880a0;
import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* JADX INFO: renamed from: com.inmobi.media.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3026g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AppSetIdInfo f23620a;

    static {
        b();
    }

    public static final void a(Function1 tmp0, Object obj) {
        Intrinsics.f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static void b() {
        Context contextD = Uc.d();
        if (contextD != null && a()) {
            AppSetIdClient client = AppSet.getClient(contextD);
            Intrinsics.e(client, "getClient(...)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            Intrinsics.e(appSetIdInfo, "getAppSetIdInfo(...)");
            appSetIdInfo.addOnSuccessListener(new C0880a0(C3010f1.f23598a, 0));
        }
    }

    public static boolean a() {
        try {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            reflectionFactory.b(AppSetIdInfo.class).l();
            reflectionFactory.b(Task.class).l();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }
}
