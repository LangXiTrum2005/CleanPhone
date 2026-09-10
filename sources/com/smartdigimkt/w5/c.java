package com.smartdigimkt.w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f39411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.smartdigimkt.w6.f f39412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.smartdigimkt.v6.a f39413c;
    protected ViewGroup d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f39414e;
    RelativeLayout f;
    View g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected a f39415h;

    public interface a {
        void a(int i2, int i3);
    }

    public interface b extends a {
        void a();

        void a(long j);

        void b();
    }

    public abstract void a();

    public abstract void a(int i2, Map<String, Object> map);

    public void a(Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i2, a aVar2) {
        this.f39411a = context;
        this.f39412b = fVar;
        this.f39413c = aVar;
        this.d = viewGroup;
        this.f39414e = i2;
        this.f39415h = aVar2;
        this.f = relativeLayout;
        this.g = view;
    }

    public boolean a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get("key_has_endcard_improve")) == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
