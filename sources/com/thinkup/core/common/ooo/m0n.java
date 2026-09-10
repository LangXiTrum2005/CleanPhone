package com.thinkup.core.common.ooo;

import android.text.TextUtils;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mn;
import com.thinkup.core.common.on.o0nm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class m0n {
    public static boolean m(o0mm o0mmVar) {
        return o0mmVar.nm() == 66;
    }

    public static long n(o0mm o0mmVar) {
        if (o0mmVar == null) {
            return 0L;
        }
        return (o0mmVar.nm() == 39 && o0mmVar.on0o()) ? o0mmVar.on0n() : o0mmVar.ono();
    }

    public static boolean o(List<o0mm> list) {
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                o0mm o0mmVar = list.get(i2);
                if (o0mmVar != null && o0mmVar.o0m0()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(o0mm o0mmVar) {
        return o0mmVar.nm() == 15 && !o0mmVar.oom();
    }

    public static List<o0nm.o> o(String str, o0mm o0mmVar) {
        o0mn o0mnVarO;
        if (o0mmVar == null || (o0mnVarO = com.thinkup.core.common.o.o().o(str, o0mmVar)) == null) {
            return null;
        }
        List<o0nm.o> listOm = o0mnVarO.o((com.thinkup.core.common.on.on0) null).om();
        com.thinkup.core.common.on.on0 on0VarO = com.thinkup.core.n.n.o().o(str, o0mmVar);
        if (on0VarO != null && !on0VarO.o()) {
            if (listOm == null) {
                listOm = new ArrayList<>();
            }
            listOm.add(new o0nm.o(o0mmVar, on0VarO));
        }
        return listOm;
    }

    public static String o(o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter) {
        String internalNetworkPlacementId;
        String strNmm;
        if (tUBaseAdAdapter != null) {
            try {
                internalNetworkPlacementId = tUBaseAdAdapter.getInternalNetworkPlacementId();
            } catch (Throwable unused) {
            }
        } else {
            internalNetworkPlacementId = "";
        }
        if (!TextUtils.isEmpty(internalNetworkPlacementId)) {
            return internalNetworkPlacementId;
        }
        if (o0mmVar == null) {
            strNmm = "";
        } else {
            strNmm = o0mmVar.nmm();
        }
        return !TextUtils.isEmpty(strNmm) ? strNmm : "";
    }
}
