package com.thinkup.core.common.m;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.thinkup.core.common.ooo.n0;

/* JADX INFO: loaded from: classes6.dex */
public final class om extends o0 {
    o m0;

    public interface o {
        void o(PackageInfo packageInfo);
    }

    public om(Context context, String str, o oVar) {
        super(context, str, "", 0L);
        this.m0 = oVar;
    }

    @Override // com.thinkup.core.common.m.oo
    public final n m() {
        PackageInfo packageInfoO = !TextUtils.isEmpty(this.o0) ? n0.o(this.oo, this.o0) : null;
        o oVar = this.m0;
        if (oVar != null) {
            oVar.o(packageInfoO);
        }
        return null;
    }

    @Override // com.thinkup.core.common.m.oo
    public final int n() {
        return 3;
    }

    private om(Context context, String str, String str2, long j) {
        super(context, str, str2, j);
    }
}
