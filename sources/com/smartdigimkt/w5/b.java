package com.smartdigimkt.w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.smartdigimkt.sdk.basead.ui.improveclick.ambience.BaseAmbienceView;
import com.smartdigimkt.sdk.basead.ui.improveclick.ambience.BubbleDropAnimView;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f39407p = 1;
    public static final int q = 2;
    public static final int r = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BaseAmbienceView f39408i;
    private com.smartdigimkt.x5.a j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39409l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f39410n;
    private boolean o;

    private boolean b() {
        int iF = this.f39413c.t.f();
        if (iF != 2) {
            if (iF != 3 || this.f39414e != 2) {
                return false;
            }
            com.smartdigimkt.x5.a aVar = new com.smartdigimkt.x5.a();
            this.j = aVar;
            aVar.a(this.d, this.f39409l);
            return true;
        }
        if (this.f39408i == null) {
            BubbleDropAnimView bubbleDropAnimView = new BubbleDropAnimView(this.f39411a);
            this.f39408i = bubbleDropAnimView;
            bubbleDropAnimView.initSetting(this.f39413c, this.f39415h);
            if (this.f39413c.t.f() == 2) {
                if (this.f39414e != 2) {
                    this.d.addView(this.f39408i, -1, -1);
                } else if (this.d.getParent() != null && (this.d.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.d.getParent()).addView(this.f39408i, -1, -1);
                }
            }
        }
        return true;
    }

    @Override // com.smartdigimkt.w5.c
    public void a(Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i2, c.a aVar2) {
        super.a(context, fVar, aVar, viewGroup, relativeLayout, view, i2, aVar2);
        this.k = false;
        this.f39409l = 1;
        if (this.f39414e == 3) {
            this.f39409l = this.f39413c.t.D1();
        } else {
            this.f39409l = com.smartdigimkt.n8.c.K(this.f39411a);
        }
        this.m = 1;
        this.f39410n = false;
        this.o = false;
    }

    @Override // com.smartdigimkt.w5.c
    public void a(int i2, Map<String, Object> map) {
        switch (i2) {
            case 110:
                BaseAmbienceView baseAmbienceView = this.f39408i;
                if (baseAmbienceView != null) {
                    baseAmbienceView.onResume();
                }
                break;
            case 111:
                BaseAmbienceView baseAmbienceView2 = this.f39408i;
                if (baseAmbienceView2 != null) {
                    baseAmbienceView2.onPause();
                }
                break;
            case 112:
            case 115:
                a();
                break;
            case 113:
                Object obj = map.get("click_type");
                Object obj2 = map.get(g.a.g);
                if (obj != null && (obj instanceof Integer) && obj2 != null && (obj2 instanceof Integer)) {
                    int iIntValue = ((Integer) obj).intValue();
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (iIntValue != 5 && iIntValue != 6 && iIntValue != 7) {
                        int iB = com.smartdigimkt.a6.c.b(iIntValue, iIntValue2);
                        if (iB == 0 || iB == 1) {
                            this.o = true;
                            break;
                        } else if (iB == 2) {
                            this.f39410n = true;
                            break;
                        }
                    }
                }
                break;
            case 114:
                Object obj3 = map.get(g.a.f39429e);
                if (obj3 != null && (obj3 instanceof Integer)) {
                    this.m = ((Integer) obj3).intValue();
                }
                this.k = b();
                break;
        }
    }

    @Override // com.smartdigimkt.w5.c
    public void a() {
        if (this.k) {
            com.smartdigimkt.v6.a aVar = this.f39413c;
            com.smartdigimkt.i7.d.a(aVar, this.f39412b, com.smartdigimkt.m3.i.a(aVar), this.f39409l, this.m, this.f39413c.t.f() == 2 ? 3 : 4, this.f39410n, this.o);
        }
        BaseAmbienceView baseAmbienceView = this.f39408i;
        if (baseAmbienceView != null) {
            baseAmbienceView.release();
            com.smartdigimkt.j7.c.a(this.f39408i);
        }
    }
}
