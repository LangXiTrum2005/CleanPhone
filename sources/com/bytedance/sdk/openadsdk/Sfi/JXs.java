package com.bytedance.sdk.openadsdk.Sfi;

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
public class JXs implements ZU {
    private ZU LD;
    Handler Lxb = null;

    public JXs(ZU zu) {
        this.LD = zu;
    }

    private Context OY() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            return (Application) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
    public String JXs() {
        ZU zu = this.LD;
        if (zu != null) {
            return zu.JXs();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
    public Context LD() {
        ZU zu = this.LD;
        return (zu == null || zu.LD() == null) ? OY() : this.LD.LD();
    }

    @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
    public ExecutorService Lxb() {
        ZU zu = this.LD;
        return (zu == null || zu.Lxb() == null) ? Executors.newCachedThreadPool() : this.LD.Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
    public Handler ZU() {
        ZU zu = this.LD;
        if (zu != null && zu.ebl() != null) {
            return this.LD.ZU();
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.Lxb = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
    public Map<String, String> ebl() {
        ZU zu = this.LD;
        return (zu == null || zu.ebl() == null) ? new HashMap() : this.LD.ebl();
    }

    @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
    public JSONObject lc() {
        ZU zu = this.LD;
        if (zu != null) {
            return zu.lc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
    public String lk() {
        ZU zu = this.LD;
        return (zu == null || TextUtils.isEmpty(zu.lk())) ? "null" : this.LD.lk();
    }

    @Override // com.bytedance.sdk.openadsdk.Sfi.ZU
    public JSONObject Lxb(JSONObject jSONObject) {
        ZU zu = this.LD;
        return zu != null ? zu.Lxb(jSONObject) : jSONObject;
    }
}
