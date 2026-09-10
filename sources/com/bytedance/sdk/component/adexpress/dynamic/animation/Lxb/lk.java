package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static volatile lk Lxb;

    private lk() {
    }

    public static lk Lxb() {
        if (Lxb == null) {
            synchronized (lk.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new lk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public ZU Lxb(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        if (lxb == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(lxb.QAg())) {
            return new JVA(view, lxb);
        }
        if ("translate".equals(lxb.QAg())) {
            return new IeN(view, lxb);
        }
        if ("ripple".equals(lxb.QAg())) {
            return new OY(view, lxb);
        }
        if ("marquee".equals(lxb.QAg())) {
            return new ebl(view, lxb);
        }
        if ("waggle".equals(lxb.QAg())) {
            return new VVE(view, lxb);
        }
        if ("shine".equals(lxb.QAg())) {
            return new sLN(view, lxb);
        }
        if ("swing".equals(lxb.QAg())) {
            return new STP(view, lxb);
        }
        if ("fade".equals(lxb.QAg())) {
            return new Lxb(view, lxb);
        }
        if ("rubIn".equals(lxb.QAg())) {
            return new nBu(view, lxb);
        }
        if ("rotate".equals(lxb.QAg())) {
            return new QAg(view, lxb);
        }
        if ("cutIn".equals(lxb.QAg())) {
            return new lc(view, lxb);
        }
        if ("stretch".equals(lxb.QAg())) {
            return new NXR(view, lxb);
        }
        if ("bounce".equals(lxb.QAg())) {
            return new JXs(view, lxb);
        }
        return null;
    }
}
