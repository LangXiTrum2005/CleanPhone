package com.bytedance.sdk.openadsdk.wjv;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha implements di {
    private di lr;
    Handler ri = null;

    public xha(di diVar) {
        this.lr = diVar;
    }

    private Context jbs() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.di
    public JSONObject di() {
        di diVar = this.lr;
        if (diVar != null) {
            return diVar.di();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.di
    public String fi() {
        di diVar = this.lr;
        if (diVar != null) {
            return diVar.fi();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.di
    public String ik() {
        di diVar = this.lr;
        return (diVar == null || TextUtils.isEmpty(diVar.ik())) ? "null" : this.lr.ik();
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.di
    public Handler ka() {
        di diVar = this.lr;
        if (diVar != null && diVar.xha() != null) {
            return this.lr.ka();
        }
        Handler handler = new Handler(ri("pag_strategy", -1).getLooper());
        this.ri = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.di
    public Context lr() {
        di diVar = this.lr;
        return (diVar == null || diVar.lr() == null) ? jbs() : this.lr.lr();
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.di
    public boolean mj() {
        di diVar = this.lr;
        if (diVar != null) {
            return diVar.mj();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.di
    public ExecutorService ri() {
        di diVar = this.lr;
        return (diVar == null || diVar.ri() == null) ? Executors.newCachedThreadPool() : this.lr.ri();
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.di
    public Map<String, String> xha() {
        di diVar = this.lr;
        return (diVar == null || diVar.xha() == null) ? new HashMap() : this.lr.xha();
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.di
    public JSONObject ri(JSONObject jSONObject) {
        di diVar = this.lr;
        return diVar != null ? diVar.ri(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.di
    public HandlerThread ri(String str, int i) {
        HandlerThread handlerThreadRi;
        di diVar = this.lr;
        if (diVar != null && (handlerThreadRi = diVar.ri(str, i)) != null) {
            return handlerThreadRi;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
