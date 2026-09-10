package com.thinkup.core.common.n0.o.o;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.ko;
import com.thinkup.core.common.n0.o.mm;
import com.thinkup.core.common.n0.o.mo;
import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.m0o;
import com.thinkup.core.common.no.m.om0;
import com.thinkup.core.common.no.m.omm;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.onn;
import com.thinkup.core.common.no.m.ooo;
import com.thinkup.core.common.ooo.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class oo extends com.thinkup.core.common.n0.o.o {
    private com.thinkup.core.common.no.m.oo m;

    public oo(com.thinkup.core.common.n0.o.om omVar) {
        super(omVar);
    }

    private static void m() {
    }

    private static /* synthetic */ void n() {
    }

    private static onm m(mo moVar) {
        ooo.o oVar = new ooo.o();
        Map<String, String> map = moVar.oo;
        if (map == null || map.isEmpty()) {
            String strMm = n0.mm();
            if (!TextUtils.isEmpty(strMm)) {
                oVar.o(Command.HTTP_HEADER_USER_AGENT, strMm);
            }
        } else {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                oVar.o(entry.getKey(), entry.getValue());
            }
            if (!map.containsKey(Command.HTTP_HEADER_USER_AGENT)) {
                String strMm2 = n0.mm();
                if (!TextUtils.isEmpty(strMm2)) {
                    oVar.o(Command.HTTP_HEADER_USER_AGENT, strMm2);
                }
            }
        }
        if (Objects.equals(moVar.m, ko.f25534a)) {
            return new onm.o().o(moVar.o).o().o(oVar.o()).m();
        }
        return new onm.o().o(moVar.o).o(moVar.m, onn.o(om0.m(moVar.o0), moVar.f41957n)).o(oVar.o()).m();
    }

    @Override // com.thinkup.core.common.n0.o.m
    public final mm o(mo moVar) {
        try {
            com.thinkup.core.common.no.m.oo ooVarO = o(this.o, moVar).o(m(moVar));
            this.m = ooVarO;
            return m(moVar, ooVarO.m(), null);
        } catch (Throwable th) {
            return m(moVar, null, th);
        }
    }

    @Override // com.thinkup.core.common.n0.o.m
    public final void o(final mo moVar, final com.thinkup.core.common.n0.o.n nVar) {
        try {
            com.thinkup.core.common.no.m.oo ooVarO = o(this.o, moVar).o(m(moVar));
            this.m = ooVarO;
            ooVarO.o(new com.thinkup.core.common.no.m.om() { // from class: com.thinkup.core.common.n0.o.o.oo.1
                @Override // com.thinkup.core.common.no.m.om
                public final void o(IOException iOException) {
                    oo.m(moVar, null, iOException);
                }

                @Override // com.thinkup.core.common.no.m.om
                public final void o(m00 m00Var) {
                    oo.m(moVar, m00Var, null);
                }
            });
        } catch (Throwable th) {
            m(moVar, null, th);
        }
    }

    @Override // com.thinkup.core.common.n0.o.m
    public final void o() {
        try {
            com.thinkup.core.common.no.m.oo ooVar = this.m;
            if (ooVar == null || ooVar.oo()) {
                return;
            }
            this.m.n();
        } catch (Throwable unused) {
        }
    }

    private static omm o(com.thinkup.core.common.n0.o.om omVar, mo moVar) {
        return o0.o().o(omVar, moVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static mm m(mo moVar, m00 m00Var, Throwable th) {
        mm.o oVarO = new mm.o().o(moVar).o(th);
        if (m00Var != null) {
            try {
                oVarO.o(m00Var.n());
                oVarO.o(m00Var.o0());
                HashMap map = new HashMap();
                ooo oooVarOm = m00Var.om();
                for (int i2 = 0; i2 < oooVarOm.o(); i2++) {
                    String strO = oooVarOm.o(i2);
                    String strM = oooVarOm.m(i2);
                    List list = (List) map.get(strO);
                    if (list != null) {
                        if (!list.contains(strM)) {
                            list.add(strM);
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(strM);
                        map.put(strO, arrayList);
                    }
                }
                oVarO.o(map);
                m0o m0oVarOn = m00Var.on();
                if (m0oVarOn != null) {
                    oVarO.o(new om(m0oVarOn));
                }
            } catch (Throwable th2) {
                oVarO.o(th2);
            }
        }
        return oVarO.o();
    }
}
