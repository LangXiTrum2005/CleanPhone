package com.thinkup.core.common.on;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class onm {
    HashMap<String, List<on0>> o = new HashMap<>(2);

    public final synchronized void o(String str, on0 on0Var) {
        try {
            List<on0> arrayList = this.o.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.o.put(str, arrayList);
            }
            arrayList.add(on0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized on0 o(String str) {
        try {
            HashMap<String, List<on0>> map = this.o;
            on0 on0Var = null;
            if (map == null) {
                return null;
            }
            List<on0> list = map.get(str);
            if (list != null && list.size() != 0) {
                for (on0 on0Var2 : list) {
                    double d = on0Var2.price;
                    if (on0Var == null || d > on0Var.price) {
                        on0Var = on0Var2;
                    }
                }
                if (on0Var != null) {
                    list.remove(on0Var);
                }
                return on0Var;
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
