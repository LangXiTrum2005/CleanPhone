package com.thinkup.core.common.oo0;

import android.content.Context;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.no;
import com.thinkup.core.common.on.o0n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class om extends no<o0n> {
    private static volatile om on;

    private om(Context context) {
        super(context);
    }

    public static om o(Context context) {
        if (on == null) {
            synchronized (om.class) {
                try {
                    if (on == null) {
                        on = new om(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return on;
    }

    @Override // com.thinkup.core.common.no
    public final void o(List<o0n> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<o0n> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().o().toString());
        }
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        if (mVarH != null) {
            if (mVarH.omm() != 1) {
                com.thinkup.core.common.n0.o0 o0Var = new com.thinkup.core.common.n0.o0(this.o0, mVarH.omm(), arrayList);
                o0Var.oo0();
                o0Var.o(0, (o0o) null);
                return;
            } else {
                com.thinkup.core.common.n0.o0.o oVar = new com.thinkup.core.common.n0.o0.o(arrayList);
                oVar.o(1, mVarH.omo());
                oVar.o();
                oVar.o((com.thinkup.core.common.n0.o0.o0.o) null);
                return;
            }
        }
        com.thinkup.core.common.n0.o0 o0Var2 = new com.thinkup.core.common.n0.o0(this.o0, 0, arrayList);
        o0Var2.oo0();
        o0Var2.o(0, (o0o) null);
    }
}
