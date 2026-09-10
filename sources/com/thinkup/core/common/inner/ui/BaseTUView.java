package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.thinkup.core.common.inner.oo.oo;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseTUView extends RelativeLayout {
    protected ooo m00;
    String m0m;
    protected List<View> m0n;
    volatile boolean m0o;
    protected ScanningAnimButton mo0;
    String onm;
    protected oom onn;

    public BaseTUView(Context context, oom oomVar, ooo oooVar, String str) {
        super(context);
        this.onm = "BaseTUView";
        this.m0o = false;
        this.onn = oomVar;
        this.m00 = oooVar;
        this.m0m = str;
        this.m0n = new ArrayList();
        b_();
        o();
    }

    private synchronized void o0() {
        if (this.m0o) {
            return;
        }
        this.m0o = true;
        a_();
    }

    public abstract void a_();

    public void b_() {
    }

    public void destroy() {
    }

    public abstract void o();

    public abstract void o(oo ooVar);

    public abstract void o(boolean z2);

    public BaseTUView(Context context, oom oomVar, ooo oooVar) {
        this(context, oomVar, oooVar, "");
    }

    public BaseTUView(Context context) {
        super(context);
        this.onm = "BaseTUView";
        this.m0o = false;
    }
}
