package ads_mobile_sdk;

import com.google.common.base.competently;
import com.google.common.base.formularize;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import saneness.bochum;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class c03 extends ys2 {
    public final Map f;
    public final yu2 g;

    public c03(bochum bochumVar, counters countersVar, yu2 yu2Var, Map map, u13 u13Var) {
        super("pMWNCkeij7iz+/YfKsvhY1q2QcOkaRS5dfnC+MzZgop3gWfIC1u6462NGBaiglBr", "FcCzUCVA4CvABDMuoWifuSmSon6DJ3iYUdKMaiW6akQ=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_TIME_SIGNALS_TASK));
        this.f = map;
        this.g = yu2Var;
    }

    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        lArr[0] = (Long) competently.attabal((Long) this.f.get("tcq"), -1L);
        lArr[1] = (Long) competently.attabal((Long) this.f.get("tpq"), -1L);
        lArr[2] = (Long) competently.attabal((Long) this.f.get("tcv"), -1L);
        lArr[3] = (Long) competently.attabal((Long) this.f.get("tpv"), -1L);
        lArr[4] = (Long) competently.attabal((Long) this.f.get("tchv"), -1L);
        lArr[5] = (Long) competently.attabal((Long) this.f.get("tphv"), -1L);
        lArr[6] = (Long) competently.attabal((Long) this.f.get("tcc"), -1L);
        lArr[7] = (Long) competently.attabal((Long) this.f.get("tpc"), -1L);
        lArr[8] = (Long) competently.attabal((Long) this.f.get("tst"), -1L);
        for (int i = 0; i < 9; i++) {
            if (lArr[i] == null) {
                lArr[i] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) formularize.triweekly((Long[]) method.invoke("", lArr, Integer.valueOf(this.g.ordinal())));
        synchronized (bochumVar) {
            bochumVar.mathsort(lArr2[0].longValue());
            bochumVar.formularize(lArr2[1].longValue());
            bochumVar.apical(lArr2[2].longValue());
            bochumVar.taiyuan(lArr2[3].longValue());
            bochumVar.clubfoot(lArr2[4].longValue());
            bochumVar.overspeculate(lArr2[5].longValue());
            bochumVar.walach(lArr2[6].longValue());
            bochumVar.peridotite(lArr2[7].longValue());
        }
    }
}
