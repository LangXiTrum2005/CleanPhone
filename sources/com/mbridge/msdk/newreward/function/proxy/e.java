package com.mbridge.msdk.newreward.function.proxy;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class e implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f1722a;
    b b;

    public e(Object obj, com.mbridge.msdk.newreward.adapter.e eVar, com.mbridge.msdk.newreward.function.command.c cVar) {
        this.f1722a = obj;
        try {
            this.b = new b(obj, eVar, cVar);
        } catch (Exception unused) {
            if (eVar.P() != null) {
                eVar.P().quitSafely();
            }
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object objInvoke;
        try {
            objInvoke = method.invoke(this.f1722a, objArr);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            objInvoke = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        b bVar = this.b;
        if (bVar == null) {
            return objInvoke;
        }
        bVar.c(objInvoke, method, objArr);
        o0.b("ReportHandler", "方法名：" + method.getName() + " 耗时为：" + String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return objInvoke;
    }
}
