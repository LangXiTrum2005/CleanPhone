package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f32403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f32404b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.mbridge.msdk.config.component.status.a> f32405c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SharedPreferences.OnSharedPreferenceChangeListener f32406d = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (d.this.f32403a == null || !d.this.f32403a.contains(str)) {
                return;
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916006");
            HashMap map = new HashMap();
            try {
                Object obj = d.this.f32403a.getAll().get(str);
                map.put(com.mbridge.msdk.config.component.common.util.c.c(X3.i.W), str);
                map.put(com.mbridge.msdk.config.component.common.util.c.c(X3.i.X), obj);
            } catch (Exception unused) {
                map.put(com.mbridge.msdk.config.component.common.util.c.c(X3.i.W), str);
                map.put(com.mbridge.msdk.config.component.common.util.c.c(X3.i.X), d.this.f32403a.getString(str, ""));
            }
            if (d.this.f32404b.isEmpty()) {
                bVar.a(map);
                d.this.a(bVar);
            } else if (d.this.f32404b.contains(str)) {
                bVar.a(map);
                d.this.a(bVar);
            }
        }
    }

    public d(String str) {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        Context applicationContext = contextD.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = applicationContext.getPackageName() + "_preferences";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.f32403a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f32406d);
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f32405c.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f32405c.add(aVar);
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            this.f32404b.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.f32405c.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th2) {
            q0.b("PreferencePublisher", th2.getMessage());
        }
    }
}
