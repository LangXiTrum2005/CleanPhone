package com.smartdigimkt.r2;

import android.content.Context;
import android.view.View;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38025a = "ViewOptionWrapper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38026b = "template_";

    public com.smartdigimkt.c2.c a(Context context, List<d> list) {
        int iA;
        int iL1;
        if (list == null) {
            return null;
        }
        try {
            float fG = v.g(com.smartdigimkt.m6.b.p().k());
            float f = v.f(com.smartdigimkt.m6.b.p().k());
            ArrayList arrayList = new ArrayList();
            int iT0 = 0;
            if (list.size() <= 0 || list.get(0) == null) {
                iA = 1;
                iL1 = 0;
            } else {
                iA = com.smartdigimkt.m2.c.a(list.get(0));
                iL1 = list.get(0).l1();
                list.get(0).k1();
                iT0 = list.get(0).t0();
            }
            String str = com.smartdigimkt.d2.a.j;
            if (iA != 1) {
                if (iA == 2) {
                    str = com.smartdigimkt.d2.a.f34412i;
                } else if (com.smartdigimkt.m2.c.a(context)) {
                    str = com.smartdigimkt.d2.a.f34412i;
                    iA = 2;
                } else {
                    iA = 1;
                }
            }
            return com.smartdigimkt.c2.c.a().a(context).c(str).c(1).b(f).a(fG).a(list).a(iA).b(arrayList).e(iT0).b(iL1).a();
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    public com.smartdigimkt.c2.c b(View view, d dVar) {
        String strF;
        int iG;
        String str;
        if (dVar == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String strI0 = dVar.i0();
            if (dVar.U1() != null) {
                iG = dVar.U1().g();
                strF = dVar.U1().f();
            } else {
                strF = "";
                iG = 0;
            }
            int iA = v.a(strF, "ia_tp", -5);
            String str2 = "sdm_reward_layer_floor";
            if (iG == 0 || iG == 102 || iG == 202) {
                str = "sdm_reward_layer_floor";
            } else {
                str = "sdm_reward_layer_floor_" + iG;
            }
            if (k.a(view.getContext(), str, "layout") > 0) {
                str2 = str;
            }
            boolean zA = com.smartdigimkt.m2.c.a(strF);
            String strA = com.smartdigimkt.m2.c.a(strF, com.smartdigimkt.d2.a.o0);
            com.smartdigimkt.f3.d dVarA = com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), strI0, false);
            int iX = dVarA != null ? dVarA.X() : 0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(dVar);
            return com.smartdigimkt.c2.c.a().c(str2).c(2).a(arrayList2).a(view.getContext()).a(view).d(iX).g(iA).a(n.p(view.getContext())).b(iG).a(zA).b(strA).b(arrayList).e(dVar.t0()).a();
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    public com.smartdigimkt.c2.c a(View view, d dVar) {
        if (dVar == null) {
            return null;
        }
        try {
            com.smartdigimkt.f3.d dVarA = com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), dVar.i0(), false);
            int iX = dVarA != null ? dVarA.X() : 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVar);
            return com.smartdigimkt.c2.c.a().c(com.smartdigimkt.d2.a.f34411h).c(3).a(arrayList).a(view.getContext()).a(view).d(iX).a(n.p(view.getContext())).a();
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    public com.smartdigimkt.c2.c b(Context context, List<d> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    float fG = v.g(com.smartdigimkt.m6.b.p().k());
                    float f = v.f(com.smartdigimkt.m6.b.p().k());
                    ArrayList arrayList = new ArrayList();
                    int iT0 = list.get(0).t0();
                    int iL1 = list.get(0).l1();
                    list.get(0).k1();
                    int iP = n.p(context);
                    return com.smartdigimkt.c2.c.a().c(iP == 1 ? com.smartdigimkt.d2.a.k : com.smartdigimkt.d2.a.f34413l).c(5).a(context).b(f).a(fG).a(list).a(iP).b(arrayList).e(iT0).b(iL1).a();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return null;
    }

    public com.smartdigimkt.c2.c a(Context context, d dVar, int i2, String str) {
        String string;
        StringBuilder sb;
        if (dVar == null) {
            return null;
        }
        try {
            long jV0 = dVar.v0();
            int iP = n.p(context);
            int iA = v.a(dVar.B2(), "n_logo", 1);
            if (jV0 == 1302) {
                if (iP == 1) {
                    sb = new StringBuilder();
                    sb.append("sdm_reward_end_card_layout_portrait_");
                } else {
                    sb = new StringBuilder();
                    sb.append("sdm_reward_end_card_layout_landscape_");
                }
                sb.append(jV0);
                string = sb.toString();
            } else {
                string = iP == 1 ? com.smartdigimkt.d2.a.f34405b : com.smartdigimkt.d2.a.f34404a;
            }
            return com.smartdigimkt.c2.c.a().c(string).c(4).a(context).a(n.p(context)).b(new ArrayList()).e(dVar.t0()).b(i2).a(str).f(iA).a();
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }
}
