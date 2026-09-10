package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d implements b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f32710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicBoolean f32712e = new AtomicBoolean(false);

    public d(String str, String str2, View view, int i10) {
        this.f32710c = view;
        this.f32708a = str;
        this.f32709b = str2;
        this.f32711d = i10;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("mbridge_")) {
            return false;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.c.valueOf(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public View a() {
        return this.f32710c;
    }

    @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
    public void a(String str, Object obj) {
        if (b(this.f32708a)) {
            a(String.valueOf(obj));
        } else {
            b(str, obj);
        }
    }

    private void b(String str, Object obj) {
        KeyEvent.Callback callback = this.f32710c;
        if (callback instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
            ((com.mbridge.msdk.config.dynamic.baseview.inter.a) callback).updateBindData(str, obj);
        }
    }

    private void a(String str) {
        View view;
        if (this.f32712e.get() || (view = this.f32710c) == null) {
            return;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.a.a(view, this.f32708a, this.f32709b, str);
        } catch (Exception e10) {
            q0.b("ViewObserverImpl", e10.getMessage());
        }
    }
}
