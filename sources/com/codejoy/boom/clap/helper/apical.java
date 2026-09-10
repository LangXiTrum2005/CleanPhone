package com.codejoy.boom.clap.helper;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/codejoy/boom/clap/widget/ParkinsansFontText;", "text", "", "dern", "(Lcom/codejoy/boom/clap/widget/ParkinsansFontText;)V", "marial", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class apical {
    public static final void beachfront(ParkinsansFontText parkinsansFontText) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (parkinsansFontText.isAttachedToWindow() && parkinsansFontText.getHeight() > 0) {
                float lineHeight = parkinsansFontText.getLineHeight();
                int color = Color.parseColor("#FFFFFFFF");
                parkinsansFontText.getPaint().setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineHeight, new int[]{color, color, Color.parseColor("#FFFFDB88")}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f}, Shader.TileMode.REPEAT));
                parkinsansFontText.invalidate();
                Result.m3351constructorimpl(Unit.f29295attabal);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public static final void dern(final ParkinsansFontText text) {
        Intrinsics.checkNotNullParameter(text, "text");
        text.post(new Runnable() { // from class: com.codejoy.boom.clap.helper.taiyuan
            @Override // java.lang.Runnable
            public final void run() {
                apical.wireman(text);
            }
        });
    }

    public static final void marial(final ParkinsansFontText text) {
        Intrinsics.checkNotNullParameter(text, "text");
        text.post(new Runnable() { // from class: com.codejoy.boom.clap.helper.cutely
            @Override // java.lang.Runnable
            public final void run() {
                apical.beachfront(text);
            }
        });
    }

    public static final void wireman(ParkinsansFontText parkinsansFontText) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (parkinsansFontText.isAttachedToWindow() && parkinsansFontText.getHeight() > 0) {
                float lineHeight = parkinsansFontText.getLineHeight();
                int color = Color.parseColor("#FFFFFFFF");
                parkinsansFontText.getPaint().setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineHeight, new int[]{color, color, Color.parseColor("#FFB0A5F4")}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f}, Shader.TileMode.REPEAT));
                parkinsansFontText.invalidate();
                Result.m3351constructorimpl(Unit.f29295attabal);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }
}
