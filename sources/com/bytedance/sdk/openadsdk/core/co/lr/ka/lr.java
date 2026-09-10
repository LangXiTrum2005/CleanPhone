package com.bytedance.sdk.openadsdk.core.co.lr.ka;

import android.content.Context;
import com.bytedance.adsdk.ugeno.ka.sf;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends com.bytedance.adsdk.ugeno.ka.ka.ik {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18112co;
    private float sf;

    public lr(Context context) {
        super(context);
        this.sf = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.xha.ik.ri(String.valueOf(objArr[1]), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                sf sfVar = this.ri;
                if (sfVar != null && !this.f18112co) {
                    this.f18112co = true;
                    sfVar.ri(this.lr, this.di, this.ik.lr());
                }
                return true;
            }
            this.sf = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("rate"), 100);
            if (com.bytedance.adsdk.ugeno.xha.ik.ri(String.valueOf(objArr[0]), 100.0f) >= this.sf) {
                sf sfVar2 = this.ri;
                if (sfVar2 != null && !this.f18112co) {
                    this.f18112co = true;
                    sfVar2.ri(this.lr, this.di, this.ik.lr());
                }
                return true;
            }
        }
        return false;
    }
}
