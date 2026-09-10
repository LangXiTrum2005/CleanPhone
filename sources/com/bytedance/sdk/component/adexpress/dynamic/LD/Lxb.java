package com.bytedance.sdk.component.adexpress.dynamic.LD;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static int Lxb(ebl eblVar) {
        if (eblVar == null) {
            return 0;
        }
        String strBcA = eblVar.BcA();
        String strAH = eblVar.aH();
        if (TextUtils.isEmpty(strAH) || TextUtils.isEmpty(strBcA) || !strAH.equals("creative")) {
            return 0;
        }
        if (strBcA.equals("shake")) {
            return 2;
        }
        if (strBcA.equals("twist")) {
            return 3;
        }
        return strBcA.equals("slide") ? 1 : 0;
    }
}
