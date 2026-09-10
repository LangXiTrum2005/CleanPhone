package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lnr {
    protected String lnr;
    protected final ud mml;
    protected String mzz;
    protected final Activity qdl;
    protected final ljh ud;

    public lnr(Activity activity, ljh ljhVar, ud udVar) {
        this.qdl = activity;
        this.ud = ljhVar;
        if (ljhVar != null) {
            this.lnr = vu.bch(ljhVar);
        }
        if (activity != null) {
            this.mzz = String.valueOf(activity.hashCode());
        }
        this.mml = udVar;
    }

    public abstract List<ljh> bjy();

    public abstract void exc();

    public jpc exu() {
        return null;
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.top.lnr fs();

    public abstract void jl();

    public abstract int jpc();

    public void jtx() {
    }

    public void lnr() {
    }

    public boolean mml() {
        return false;
    }

    public void mo() {
    }

    public boolean mzz() {
        return true;
    }

    public void qdl() {
    }

    public abstract void qdl(int i2);

    public abstract boolean qdl(jpc jpcVar, int i2);

    public mzz rdp() {
        return null;
    }

    public jpc rq() {
        return null;
    }

    public abstract int to();

    public void tvp() {
    }

    public void ud() {
    }

    public abstract void ud(jpc jpcVar, int i2);

    public void wd() {
    }

    public void yt() {
    }

    public void qdl(float f) {
    }

    public void ud(Activity activity) {
    }

    public void qdl(int i2, int i3) {
    }

    public void qdl(Activity activity) {
    }

    public void qdl(Bundle bundle) {
    }

    public void qdl(View view) {
    }

    public void qdl(View view, boolean z2) {
    }

    public void qdl(jpc jpcVar) {
    }

    public void qdl(jpc jpcVar, jpc jpcVar2, ud.mzz mzzVar) {
    }

    public void qdl(jpc jpcVar, ud.mzz mzzVar) {
    }

    public void qdl(jpc jpcVar, boolean z2) {
    }

    public void qdl(jpc jpcVar, boolean z2, boolean z3, boolean z4, int i2) {
    }

    public void qdl(qdl qdlVar, boolean z2) {
    }

    public void qdl(Map<String, Object> map, jpc jpcVar, float f, float f2) {
    }

    public void qdl(boolean z2) {
    }
}
