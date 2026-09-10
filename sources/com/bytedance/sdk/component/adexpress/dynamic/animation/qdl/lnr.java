package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    private static volatile lnr qdl;

    private lnr() {
    }

    public static lnr qdl() {
        if (qdl == null) {
            synchronized (lnr.class) {
                try {
                    if (qdl == null) {
                        qdl = new lnr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public mml qdl(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        if (qdlVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(qdlVar.tvp())) {
            return new rq(view, qdlVar);
        }
        if ("translate".equals(qdlVar.tvp())) {
            return new bjy(view, qdlVar);
        }
        if ("ripple".equals(qdlVar.tvp())) {
            return new jpc(view, qdlVar);
        }
        if ("marquee".equals(qdlVar.tvp())) {
            return new wd(view, qdlVar);
        }
        if ("waggle".equals(qdlVar.tvp())) {
            return new jtx(view, qdlVar);
        }
        if ("shine".equals(qdlVar.tvp())) {
            return new fs(view, qdlVar);
        }
        if ("swing".equals(qdlVar.tvp())) {
            return new rdp(view, qdlVar);
        }
        if ("fade".equals(qdlVar.tvp())) {
            return new qdl(view, qdlVar);
        }
        if ("rubIn".equals(qdlVar.tvp())) {
            return new to(view, qdlVar);
        }
        if ("rotate".equals(qdlVar.tvp())) {
            return new tvp(view, qdlVar);
        }
        if ("cutIn".equals(qdlVar.tvp())) {
            return new mo(view, qdlVar);
        }
        if ("stretch".equals(qdlVar.tvp())) {
            return new exu(view, qdlVar);
        }
        if ("bounce".equals(qdlVar.tvp())) {
            return new mzz(view, qdlVar);
        }
        return null;
    }
}
