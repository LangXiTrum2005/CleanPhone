package com.smartdigimkt.f1;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Map<String, Object> f34970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f34971b;

    public a() {
    }

    public abstract boolean a();

    public abstract void b();

    public a(Map<String, Object> map, Context context) {
        this.f34970a = map;
        this.f34971b = context;
    }
}
