package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik {
    protected String fi;
    protected String ik;
    protected final lr ka;
    protected final wjv lr;
    protected final Activity ri;

    public ik(Activity activity, wjv wjvVar, lr lrVar) {
        this.ri = activity;
        this.lr = wjvVar;
        if (wjvVar != null) {
            this.ik = dw.ay(wjvVar);
        }
        if (activity != null) {
            this.fi = String.valueOf(activity.hashCode());
        }
        this.ka = lrVar;
    }

    public mj aw() {
        return null;
    }

    public fi bgr() {
        return null;
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.top.ik co();

    public boolean fi() {
        return true;
    }

    public boolean ka() {
        return false;
    }

    public void lr() {
    }

    public abstract void lr(mj mjVar, int i);

    public abstract int mj();

    public abstract void nr();

    public abstract int qt();

    public void ri() {
    }

    public abstract void ri(int i);

    public abstract boolean ri(mj mjVar, int i);

    public mj sf() {
        return null;
    }

    public abstract void tan();

    public abstract List<wjv> vr();

    public void lr(Activity activity) {
    }

    public void ri(float f) {
    }

    public void ri(int i, int i2) {
    }

    public void ri(Activity activity) {
    }

    public void ri(Bundle bundle) {
    }

    public void ri(View view) {
    }

    public void ri(View view, boolean z) {
    }

    public void ri(mj mjVar) {
    }

    public void ri(mj mjVar, lr.fi fiVar) {
    }

    public void ri(mj mjVar, mj mjVar2, lr.fi fiVar) {
    }

    public void ri(mj mjVar, boolean z) {
    }

    public void ri(mj mjVar, boolean z, boolean z2, boolean z3, int i) {
    }

    public void ri(ri riVar, boolean z) {
    }

    public void ri(Map<String, Object> map, mj mjVar, float f, float f2) {
    }

    public void ri(boolean z) {
    }

    public void bu() {
    }

    public void di() {
    }

    public void ik() {
    }

    public void jbs() {
    }

    public void slm() {
    }

    public void xha() {
    }
}
