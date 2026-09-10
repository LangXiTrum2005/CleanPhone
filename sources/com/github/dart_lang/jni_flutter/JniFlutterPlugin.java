package com.github.dart_lang.jni_flutter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fc.f;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import ti.b;
import ui.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class JniFlutterPlugin implements b, a {

    @SuppressLint({"StaticFieldLeak"})
    private static Context context;
    private static final ConcurrentHashMap<Long, JniFlutterPlugin> pluginMap = new ConcurrentHashMap<>();
    private volatile Activity activity;
    private long engineId;

    @Nullable
    public static Activity getActivity(long j10) {
        JniFlutterPlugin jniFlutterPlugin = pluginMap.get(Long.valueOf(j10));
        Objects.requireNonNull(jniFlutterPlugin);
        return jniFlutterPlugin.activity;
    }

    @NonNull
    public static Context getApplicationContext() {
        return context;
    }

    private void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // ui.a
    public void onAttachedToActivity(@NonNull ui.b bVar) {
        setActivity((Activity) ((f) bVar).f40780b);
    }

    @Override // ti.b
    public void onAttachedToEngine(@NonNull ti.a aVar) {
        long j10 = aVar.f50788b.f46758w;
        this.engineId = j10;
        context = aVar.f50787a;
        pluginMap.put(Long.valueOf(j10), this);
    }

    @Override // ui.a
    public void onDetachedFromActivity() {
        setActivity(null);
    }

    @Override // ui.a
    public void onDetachedFromActivityForConfigChanges() {
        setActivity(null);
    }

    @Override // ti.b
    public void onDetachedFromEngine(@NonNull ti.a aVar) {
        this.activity = null;
        pluginMap.remove(Long.valueOf(this.engineId));
    }

    @Override // ui.a
    public void onReattachedToActivityForConfigChanges(@NonNull ui.b bVar) {
        setActivity((Activity) ((f) bVar).f40780b);
    }
}
