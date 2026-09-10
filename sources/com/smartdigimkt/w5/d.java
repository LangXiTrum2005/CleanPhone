package com.smartdigimkt.w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class d extends c {
    public static final int k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f39416l = 3;
    public static final int m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f39417n = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.smartdigimkt.t5.a f39418i;
    boolean j = false;

    public interface a {
        View a();

        void a(int i2);

        void a(boolean z2);

        void b();

        View c();
    }

    @Override // com.smartdigimkt.w5.c
    public void a(Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i2, c.a aVar2) {
        super.a(context, fVar, aVar, viewGroup, relativeLayout, view, i2, aVar2);
        int iV = aVar.t.V();
        if (iV == 2) {
            this.f39418i = new com.smartdigimkt.t5.b(context, fVar, aVar, aVar2, i2, viewGroup);
            return;
        }
        if (iV == 3) {
            this.f39418i = new com.smartdigimkt.t5.c(context, fVar, aVar, aVar2, i2, viewGroup);
        } else if (iV == 4) {
            this.f39418i = new com.smartdigimkt.t5.e(context, fVar, aVar, aVar2, i2, viewGroup);
        } else {
            if (iV != 5) {
                return;
            }
            this.f39418i = new com.smartdigimkt.t5.d(context, fVar, aVar, aVar2, i2, viewGroup);
        }
    }

    @Override // com.smartdigimkt.w5.c
    public void a(int i2, Map<String, Object> map) {
        com.smartdigimkt.t5.a aVar;
        Object obj;
        if (i2 == 102) {
            if (this.j || (aVar = this.f39418i) == null) {
                return;
            }
            aVar.f();
            return;
        }
        if (i2 == 103) {
            if (!this.j) {
                com.smartdigimkt.t5.a aVar2 = this.f39418i;
                if (aVar2 != null) {
                    aVar2.a(this.f);
                    return;
                }
                return;
            }
            if (com.smartdigimkt.m3.i.b(this.f39412b, this.f39413c)) {
                return;
            }
            com.smartdigimkt.i7.d.a(this.f39412b, this.f39413c, com.smartdigimkt.m3.i.a(this.f39413c, this.d.getContext()));
            return;
        }
        if (i2 == 112) {
            a();
            return;
        }
        if (i2 != 113) {
            if (i2 == 125 && map != null && (obj = map.get(g.a.j)) != null && (obj instanceof Integer) && ((Integer) obj).intValue() == 1) {
                a();
                return;
            }
            return;
        }
        this.j = true;
        com.smartdigimkt.t5.a aVar3 = this.f39418i;
        if (aVar3 != null) {
            aVar3.b();
        }
    }

    @Override // com.smartdigimkt.w5.c
    public void a() {
        com.smartdigimkt.t5.a aVar = this.f39418i;
        if (aVar != null) {
            aVar.g();
            this.f39418i = null;
        }
    }

    public void a(a aVar) {
        com.smartdigimkt.t5.a aVar2 = this.f39418i;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }
}
