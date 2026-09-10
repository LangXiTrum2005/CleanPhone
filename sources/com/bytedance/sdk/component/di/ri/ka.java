package com.bytedance.sdk.component.di.ri;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public static final ka ri = new ka();

    private void lr(ri riVar, Context context) {
        ik.ri(context, "context == null");
        ik.ri(riVar, "AdLogConfig == null");
        ik.ri(riVar.ka(), "AdLogDepend ==null");
    }

    public void ri(ri riVar, Context context) {
        lr(riVar, context);
        xha.di().ri(context);
        xha.di().ri(riVar.qt());
        xha.di().lr(riVar.xha());
        xha.di().ik(riVar.mj());
        xha.di().ri(riVar.lr());
        xha.di().ka(riVar.jbs());
        xha.di().fi(riVar.di());
        xha.di().ri(riVar.ri() == null ? com.bytedance.sdk.component.di.ri.ri.ri.fi.ri : riVar.ri());
        xha.di().ri(riVar.ka());
        xha.di().ri(riVar.ik());
        xha.di().ri(riVar.fi());
        com.bytedance.sdk.component.di.ri.lr.lr.ik.ri(riVar.co());
        com.bytedance.sdk.component.di.ri.lr.lr.ik.lr(riVar.sf());
        ri(riVar);
    }

    public void lr() {
        fi fiVarVr = xha.di().vr();
        if (fiVarVr == null || xha.di().fi() == null || fiVarVr.ka() == null) {
            return;
        }
        xha.di().qt();
    }

    private void lr(com.bytedance.sdk.component.di.ri.ka.ri riVar) {
        fi fiVarVr = xha.di().vr();
        if (riVar == null || fiVarVr == null || xha.di().fi() == null || fiVarVr.ka() == null) {
            return;
        }
        xha.di().ri(riVar);
    }

    private void ri(ri riVar) {
        Executor executorFi;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.di.ri.ik.ri.lr()) {
            com.bytedance.sdk.component.di.ri.ik.ri.ri();
            return;
        }
        fi fiVarKa = riVar.ka();
        if (fiVarKa == null || !com.bytedance.sdk.component.di.ri.ik.ri.lr() || (executorFi = fiVarKa.fi()) == null) {
            return;
        }
        executorFi.execute(new Runnable() { // from class: com.bytedance.sdk.component.di.ri.ka.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.di.ri.ik.ri.ri();
            }
        });
    }

    public void ri(boolean z) {
        xha.di().ri(z);
    }

    public void ri() {
        fi fiVarVr = xha.di().vr();
        if (fiVarVr == null || xha.di().fi() == null || fiVarVr.ka() == null) {
            return;
        }
        xha.di().mj();
    }

    public void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar) {
        lr(riVar);
    }

    public void ri(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        fi fiVarVr = xha.di().vr();
        if (fiVarVr == null || xha.di().fi() == null || fiVarVr.ka() == null || !fiVarVr.mj()) {
            return;
        }
        if (fiVarVr.di() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (fiVarVr.di() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        xha.di().ri(str, list, z, map, i, str2);
    }

    public void ri(String str, boolean z) {
        fi fiVarVr = xha.di().vr();
        if (fiVarVr == null || xha.di().fi() == null || fiVarVr.ka() == null || !fiVarVr.mj()) {
            return;
        }
        if (fiVarVr.di() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        xha.di().ri(str, z);
    }
}
