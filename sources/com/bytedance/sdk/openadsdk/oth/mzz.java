package com.bytedance.sdk.openadsdk.oth;

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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz implements mml {
    Handler qdl = null;
    private mml ud;

    public mzz(mml mmlVar) {
        this.ud = mmlVar;
    }

    private Context jpc() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            return (Application) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oth.mml
    public String lnr() {
        mml mmlVar = this.ud;
        return (mmlVar == null || TextUtils.isEmpty(mmlVar.lnr())) ? AbstractJsonLexerKt.NULL : this.ud.lnr();
    }

    @Override // com.bytedance.sdk.openadsdk.oth.mml
    public Handler mml() {
        mml mmlVar = this.ud;
        if (mmlVar != null && mmlVar.wd() != null) {
            return this.ud.mml();
        }
        Handler handler = new Handler(qdl("pag_strategy", -1).getLooper());
        this.qdl = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.oth.mml
    public JSONObject mo() {
        mml mmlVar = this.ud;
        if (mmlVar != null) {
            return mmlVar.mo();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.oth.mml
    public String mzz() {
        mml mmlVar = this.ud;
        if (mmlVar != null) {
            return mmlVar.mzz();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.oth.mml
    public ExecutorService qdl() {
        mml mmlVar = this.ud;
        return (mmlVar == null || mmlVar.qdl() == null) ? Executors.newCachedThreadPool() : this.ud.qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.oth.mml
    public Context ud() {
        mml mmlVar = this.ud;
        return (mmlVar == null || mmlVar.ud() == null) ? jpc() : this.ud.ud();
    }

    @Override // com.bytedance.sdk.openadsdk.oth.mml
    public Map<String, String> wd() {
        mml mmlVar = this.ud;
        return (mmlVar == null || mmlVar.wd() == null) ? new HashMap() : this.ud.wd();
    }

    @Override // com.bytedance.sdk.openadsdk.oth.mml
    public JSONObject qdl(JSONObject jSONObject) {
        mml mmlVar = this.ud;
        return mmlVar != null ? mmlVar.qdl(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.oth.mml
    public HandlerThread qdl(String str, int i2) {
        HandlerThread handlerThreadQdl;
        mml mmlVar = this.ud;
        if (mmlVar != null && (handlerThreadQdl = mmlVar.qdl(str, i2)) != null) {
            return handlerThreadQdl;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
