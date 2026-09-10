package com.thinkup.core.common.inner.ui.oo;

import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    public interface o {
        void o();
    }

    private static void o(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = 0;
        view.setLayoutParams(layoutParams);
    }

    private static boolean o(long j, oom oomVar) {
        oon oonVar;
        if (oomVar != null && (oonVar = oomVar.oo0) != null && oonVar.n00() < 0) {
            return true;
        }
        if (j <= 0) {
            return false;
        }
        return oomVar == null || oomVar.oo0 == null || System.currentTimeMillis() - j > oomVar.oo0.n00();
    }
}
