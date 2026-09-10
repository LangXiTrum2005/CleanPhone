package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static volatile ik ri;

    private ik() {
    }

    public static ik ri() {
        if (ri == null) {
            synchronized (ik.class) {
                try {
                    if (ri == null) {
                        ri = new ik();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public ka ri(View view, com.bytedance.sdk.component.adexpress.dynamic.ka.ri riVar) {
        if (riVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(riVar.jbs())) {
            return new sf(view, riVar);
        }
        if ("translate".equals(riVar.jbs())) {
            return new vr(view, riVar);
        }
        if ("ripple".equals(riVar.jbs())) {
            return new mj(view, riVar);
        }
        if ("marquee".equals(riVar.jbs())) {
            return new xha(view, riVar);
        }
        if ("waggle".equals(riVar.jbs())) {
            return new slm(view, riVar);
        }
        if ("shine".equals(riVar.jbs())) {
            return new co(view, riVar);
        }
        if ("swing".equals(riVar.jbs())) {
            return new bgr(view, riVar);
        }
        if ("fade".equals(riVar.jbs())) {
            return new ri(view, riVar);
        }
        if ("rubIn".equals(riVar.jbs())) {
            return new qt(view, riVar);
        }
        if ("rotate".equals(riVar.jbs())) {
            return new jbs(view, riVar);
        }
        if ("cutIn".equals(riVar.jbs())) {
            return new di(view, riVar);
        }
        if ("stretch".equals(riVar.jbs())) {
            return new aw(view, riVar);
        }
        if ("bounce".equals(riVar.jbs())) {
            return new fi(view, riVar);
        }
        return null;
    }
}
