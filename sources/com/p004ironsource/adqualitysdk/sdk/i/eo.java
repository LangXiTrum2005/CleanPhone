package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eo extends ek {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1916 = -3355755856841908672L;

    public eo(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2106(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1916);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﻛ */
    public final boolean mo2100(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m2106("布뼄鱤﵁\udabb㮍ᢾ瘠圇둠镂\uf2b6펎ツ\u0e66", 57637 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
        sb.append(obj);
        sb.append(m2106("幠મ\uf730ꎉ\u0c5c", 21646 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2101(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m2106("布뼄鱤﵁\udabb㮍ᢾ瘠圇둠镂\uf2b6펎ツ\u0e66", 57636 - TextUtils.lastIndexOf("", '0')).intern());
        sb.append(str);
        throw new RuntimeException(a.n(sb, m2106("幠મ\uf730ꎉ\u0c5c", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21646), str2));
    }
}
