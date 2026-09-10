package com.thinkup.core.o0;

import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mo;
import com.thinkup.core.o0.m.n;
import com.thinkup.core.o0.o.o0;
import com.thinkup.core.oo.n0;
import com.thinkup.core.oo.om;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    private static volatile m o;
    private final n m = new n();

    private m() {
    }

    public static m o() {
        if (o == null) {
            synchronized (m.class) {
                try {
                    if (o == null) {
                        o = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public final void m(String str) {
        this.m.m(str);
    }

    public final void o(String str, String str2, int i2, mmm mmmVar, o0mm o0mmVar) {
        this.m.o(str, str2, i2, mmmVar != null ? mmmVar.m() : null, o0mmVar);
    }

    public final void o(o0mo o0moVar, o0mm o0mmVar) {
        this.m.o(o0moVar, o0mmVar);
    }

    public final JSONObject o(String str) {
        return this.m.o(str, 0);
    }

    public final JSONObject o(String str, int i2) {
        return this.m.o(str, 4, i2);
    }

    public final o0 o(String str, n0 n0Var, om omVar) {
        return this.m.o(str, n0Var.o0mn(), omVar);
    }
}
