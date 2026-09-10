package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import phrasemonger.taiyuan;
import technofreak.cutely;

/* JADX INFO: compiled from: BaseMotionStrategy.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class saneness implements beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f20314attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public taiyuan f20315beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ArrayList<Animator.AnimatorListener> f20316dern = new ArrayList<>();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public taiyuan f20317marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ExtendedFloatingActionButton f20318saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final com.google.android.material.floatingactionbutton.attabal f20319wireman;

    /* JADX INFO: compiled from: BaseMotionStrategy.java */
    public class attabal extends Property<ExtendedFloatingActionButton, Float> {
        public attabal(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(phrasemonger.saneness.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), saneness.this.f20318saneness.originalTextCsl.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), saneness.this.f20318saneness.originalTextCsl.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (phrasemonger.saneness.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
            } else {
                extendedFloatingActionButton.silentlyUpdateTextColor(colorStateListValueOf);
            }
        }
    }

    public saneness(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.attabal attabalVar) {
        this.f20318saneness = extendedFloatingActionButton;
        this.f20314attabal = extendedFloatingActionButton.getContext();
        this.f20319wireman = attabalVar;
    }

    @Override // com.google.android.material.floatingactionbutton.beachfront
    public final List<Animator.AnimatorListener> apical() {
        return this.f20316dern;
    }

    @Override // com.google.android.material.floatingactionbutton.beachfront
    public void attabal() {
        this.f20319wireman.saneness();
    }

    @Override // com.google.android.material.floatingactionbutton.beachfront
    public final void beachfront(taiyuan taiyuanVar) {
        this.f20315beachfront = taiyuanVar;
    }

    @Override // com.google.android.material.floatingactionbutton.beachfront
    public void competently() {
        this.f20319wireman.saneness();
    }

    @Override // com.google.android.material.floatingactionbutton.beachfront
    public AnimatorSet cutely() {
        return triweekly(kowloon());
    }

    @Override // com.google.android.material.floatingactionbutton.beachfront
    public taiyuan dern() {
        return this.f20315beachfront;
    }

    public final taiyuan kowloon() {
        taiyuan taiyuanVar = this.f20315beachfront;
        if (taiyuanVar != null) {
            return taiyuanVar;
        }
        if (this.f20317marial == null) {
            this.f20317marial = taiyuan.wireman(this.f20314attabal, impromptu());
        }
        return (taiyuan) cutely.competently(this.f20317marial);
    }

    @Override // com.google.android.material.floatingactionbutton.beachfront
    public final void marial(Animator.AnimatorListener animatorListener) {
        this.f20316dern.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.beachfront
    public void onAnimationStart(Animator animator) {
        this.f20319wireman.dern(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.beachfront
    public final void taiyuan(Animator.AnimatorListener animatorListener) {
        this.f20316dern.add(animatorListener);
    }

    public AnimatorSet triweekly(taiyuan taiyuanVar) {
        ArrayList arrayList = new ArrayList();
        if (taiyuanVar.cutely("opacity")) {
            arrayList.add(taiyuanVar.beachfront("opacity", this.f20318saneness, View.ALPHA));
        }
        if (taiyuanVar.cutely("scale")) {
            arrayList.add(taiyuanVar.beachfront("scale", this.f20318saneness, View.SCALE_Y));
            arrayList.add(taiyuanVar.beachfront("scale", this.f20318saneness, View.SCALE_X));
        }
        if (taiyuanVar.cutely("width")) {
            arrayList.add(taiyuanVar.beachfront("width", this.f20318saneness, ExtendedFloatingActionButton.WIDTH));
        }
        if (taiyuanVar.cutely("height")) {
            arrayList.add(taiyuanVar.beachfront("height", this.f20318saneness, ExtendedFloatingActionButton.HEIGHT));
        }
        if (taiyuanVar.cutely("paddingStart")) {
            arrayList.add(taiyuanVar.beachfront("paddingStart", this.f20318saneness, ExtendedFloatingActionButton.PADDING_START));
        }
        if (taiyuanVar.cutely("paddingEnd")) {
            arrayList.add(taiyuanVar.beachfront("paddingEnd", this.f20318saneness, ExtendedFloatingActionButton.PADDING_END));
        }
        if (taiyuanVar.cutely("labelOpacity")) {
            arrayList.add(taiyuanVar.beachfront("labelOpacity", this.f20318saneness, new attabal(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        phrasemonger.dern.attabal(animatorSet, arrayList);
        return animatorSet;
    }
}
