package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ng extends yg {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17808h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f17809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f17810j;

    public ng(fg fgVar, xd xdVar, int i10, Context context) {
        super(fgVar, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", xdVar, i10, 31);
        this.f17809i = null;
        this.f17810j = context;
    }

    @Override // com.google.android.gms.internal.ads.yg
    public final void a() {
        switch (this.f17808h) {
            case 0:
                View view = (View) this.f17810j;
                if (view == null) {
                    return;
                }
                Boolean bool = (Boolean) zzba.zzc().a(am.D3);
                boolean zBooleanValue = bool.booleanValue();
                Object[] objArr = (Object[]) this.f22235e.invoke(null, view, (Activity) this.f17809i, bool);
                xd xdVar = this.f22234d;
                synchronized (xdVar) {
                    try {
                        long jLongValue = ((Long) objArr[0]).longValue();
                        xdVar.b();
                        ((je) xdVar.f19193b).c0(jLongValue);
                        long jLongValue2 = ((Long) objArr[1]).longValue();
                        xdVar.b();
                        ((je) xdVar.f19193b).d0(jLongValue2);
                        if (zBooleanValue) {
                            String str = (String) objArr[2];
                            xdVar.b();
                            ((je) xdVar.f19193b).e0(str);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                xd xdVar2 = this.f22234d;
                xdVar2.b();
                ((je) xdVar2.f19193b).A(-1L);
                xdVar2.b();
                ((je) xdVar2.f19193b).B(-1L);
                Context context = (Context) this.f17810j;
                if (context == null) {
                    context = this.f22231a.f14387a;
                }
                if (((List) this.f17809i) == null) {
                    this.f17809i = (List) this.f22235e.invoke(null, context);
                }
                List list = (List) this.f17809i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (xdVar2) {
                    long jLongValue3 = ((Long) ((List) this.f17809i).get(0)).longValue();
                    xdVar2.b();
                    ((je) xdVar2.f19193b).A(jLongValue3);
                    long jLongValue4 = ((Long) ((List) this.f17809i).get(1)).longValue();
                    xdVar2.b();
                    ((je) xdVar2.f19193b).B(jLongValue4);
                    break;
                }
                return;
        }
    }

    public ng(fg fgVar, xd xdVar, int i10, View view, Activity activity) {
        super(fgVar, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", xdVar, i10, 62);
        this.f17810j = view;
        this.f17809i = activity;
    }
}
