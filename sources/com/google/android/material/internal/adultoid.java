package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TextDrawableHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class adultoid {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public mullein.marial f20378competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float f20379dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float f20382wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final TextPaint f20376attabal = new TextPaint(1);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final mullein.competently f20381saneness = new attabal();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f20380marial = true;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public WeakReference<saneness> f20377beachfront = new WeakReference<>(null);

    /* JADX INFO: compiled from: TextDrawableHelper.java */
    public class attabal extends mullein.competently {
        public attabal() {
        }

        @Override // mullein.competently
        public void attabal(int i) {
            adultoid.this.f20380marial = true;
            saneness sanenessVar = (saneness) adultoid.this.f20377beachfront.get();
            if (sanenessVar != null) {
                sanenessVar.attabal();
            }
        }

        @Override // mullein.competently
        public void saneness(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            adultoid.this.f20380marial = true;
            saneness sanenessVar = (saneness) adultoid.this.f20377beachfront.get();
            if (sanenessVar != null) {
                sanenessVar.attabal();
            }
        }
    }

    /* JADX INFO: compiled from: TextDrawableHelper.java */
    public interface saneness {
        void attabal();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public adultoid(saneness sanenessVar) {
        cutely(sanenessVar);
    }

    public void apical(mullein.marial marialVar, Context context) {
        if (this.f20378competently != marialVar) {
            this.f20378competently = marialVar;
            if (marialVar != null) {
                marialVar.monoploid(context, this.f20376attabal, this.f20381saneness);
                saneness sanenessVar = this.f20377beachfront.get();
                if (sanenessVar != null) {
                    this.f20376attabal.drawableState = sanenessVar.getState();
                }
                marialVar.arytenoidectomy(context, this.f20376attabal, this.f20381saneness);
                this.f20380marial = true;
            }
            saneness sanenessVar2 = this.f20377beachfront.get();
            if (sanenessVar2 != null) {
                sanenessVar2.attabal();
                sanenessVar2.onStateChange(sanenessVar2.getState());
            }
        }
    }

    public float beachfront(String str) {
        if (!this.f20380marial) {
            return this.f20382wireman;
        }
        taiyuan(str);
        return this.f20382wireman;
    }

    public TextPaint competently() {
        return this.f20376attabal;
    }

    public void cutely(saneness sanenessVar) {
        this.f20377beachfront = new WeakReference<>(sanenessVar);
    }

    public final float dern(String str) {
        return str == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Math.abs(this.f20376attabal.getFontMetrics().ascent);
    }

    public void formularize(boolean z) {
        this.f20380marial = z;
    }

    public void impassible(boolean z) {
        this.f20380marial = z;
    }

    public float impromptu(String str) {
        if (!this.f20380marial) {
            return this.f20379dern;
        }
        taiyuan(str);
        return this.f20379dern;
    }

    public mullein.marial marial() {
        return this.f20378competently;
    }

    public final void taiyuan(String str) {
        this.f20379dern = wireman(str);
        this.f20382wireman = dern(str);
        this.f20380marial = false;
    }

    public void triweekly(Context context) {
        this.f20378competently.arytenoidectomy(context, this.f20376attabal, this.f20381saneness);
    }

    public final float wireman(CharSequence charSequence) {
        return charSequence == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f20376attabal.measureText(charSequence, 0, charSequence.length());
    }
}
