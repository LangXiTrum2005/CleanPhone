package com.bytedance.sdk.component.di.ri.lr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.di.ri.ri.fi;
import com.bytedance.sdk.component.di.ri.xha;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static boolean di() {
        fi fiVarIk = xha.di().ik();
        return (fiVarIk == null || TextUtils.isEmpty(fiVarIk.di())) ? false : true;
    }

    public static boolean fi() {
        fi fiVarIk = xha.di().ik();
        return (fiVarIk == null || TextUtils.isEmpty(fiVarIk.ik())) ? false : true;
    }

    public static boolean ik() {
        fi fiVarIk = xha.di().ik();
        return (fiVarIk == null || TextUtils.isEmpty(fiVarIk.ka())) ? false : true;
    }

    public static boolean ka() {
        fi fiVarIk = xha.di().ik();
        return (fiVarIk == null || TextUtils.isEmpty(fiVarIk.fi())) ? false : true;
    }

    private static long lr(int i, Context context) {
        if (context == null) {
            return i;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i, 10) : Math.min((jFreeMemory / 2) * 10, i);
        }
        long j = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        return j <= 10 ? Math.min(i, 10) : Math.min(j * 10, i);
    }

    public static long ri(int i, Context context) {
        return lr(i, context);
    }

    public static boolean ri() {
        fi fiVarIk = xha.di().ik();
        return (fiVarIk == null || TextUtils.isEmpty(fiVarIk.ri())) ? false : true;
    }

    public static boolean lr() {
        fi fiVarIk = xha.di().ik();
        return (fiVarIk == null || TextUtils.isEmpty(fiVarIk.lr())) ? false : true;
    }
}
