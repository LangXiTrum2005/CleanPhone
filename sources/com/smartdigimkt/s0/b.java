package com.smartdigimkt.s0;

import android.content.Context;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38158c = "b";
    private static WeakHashMap<Context, c> d = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f38159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38160b;

    public b(Context context) {
        this.f38160b = context;
        if (d.get(context) != null) {
            this.f38159a = d.get(this.f38160b);
            return;
        }
        c cVar = new c(this.f38160b, 5);
        this.f38159a = cVar;
        d.put(this.f38160b, cVar);
    }

    public void a(a aVar) {
        this.f38159a.b(aVar);
    }
}
