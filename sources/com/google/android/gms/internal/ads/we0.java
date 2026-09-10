package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class we0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ng0 f21497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9.a f21498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public up f21499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lq f21500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f21502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f21503g;

    public we0(ng0 ng0Var, p9.a aVar) {
        this.f21497a = ng0Var;
        this.f21498b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f21503g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f21501e != null && this.f21502f != null) {
            HashMap map = new HashMap();
            map.put("id", this.f21501e);
            ((p9.b) this.f21498b).getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f21502f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f21497a.d(map);
        }
        this.f21501e = null;
        this.f21502f = null;
        WeakReference weakReference2 = this.f21503g;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f21503g = null;
    }
}
