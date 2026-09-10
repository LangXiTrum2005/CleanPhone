package com.codejoy.boom.clap.module.guide;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p000activity.sealless;
import androidx.p000activity.supplicat;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.molybdenite;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.arytenoidectomy;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.guide.LanguageGuideActivity;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import couple.beachfront;
import dabble.LanguageBean;
import java.util.List;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;
import sonnetize.competently;
import stonecrop.wireman;
import wireman.dern;

/* JADX INFO: compiled from: LanguageGuideActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/codejoy/boom/clap/module/guide/LanguageGuideActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/competently;", "<init>", "()V", "", "cultivated", "coffeecake", "()Lsonnetize/competently;", "privatdozent", "saran", "lotta", "Ldabble/attabal;", "language", "sayid", "(Ldabble/attabal;)V", "treadless", "lerp", "Lnonexistence/saneness;", "cord", "Lpatroclinal/taiyuan;", "permissivist", "()Lnonexistence/saneness;", L6.G1, "Lwireman/dern;", "", "cuirassed", "Lwireman/dern;", "requestPermissionLauncher", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LanguageGuideActivity extends BaseActivity<competently> {

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final taiyuan adapter = saneness.saneness(new Function0() { // from class: industrialist.wireman
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LanguageGuideActivity.dent();
        }
    });

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final dern<String> requestPermissionLauncher = registerForActivityResult(new marial.dern(), new wireman.attabal() { // from class: industrialist.marial
        @Override // wireman.attabal
        public final void onActivityResult(Object obj) {
            LanguageGuideActivity.nosophobia(((Boolean) obj).booleanValue());
        }
    });

    /* JADX INFO: compiled from: LanguageGuideActivity.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"com/codejoy/boom/clap/module/guide/LanguageGuideActivity$attabal", "Landroidx/recyclerview/widget/RecyclerView$triweekly;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$rotuma;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$rotuma;)V", "", "attabal", "I", "getSpace5", "()I", "space5", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends RecyclerView.triweekly {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final int space5 = molybdenite.attabal(5.0f);

        @Override // androidx.recyclerview.widget.RecyclerView.triweekly
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.rotuma state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int i = this.space5;
            outRect.top = i;
            outRect.left = i;
            outRect.right = i;
            outRect.bottom = i;
        }
    }

    private final void cultivated() {
        grimness().f37757marial.setOnClickListener(new View.OnClickListener() { // from class: industrialist.impromptu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageGuideActivity.premeiotic(this.f28843kowloon, view);
            }
        });
    }

    public static final nonexistence.saneness dent() {
        return new nonexistence.saneness();
    }

    public static final Unit itchy(LanguageGuideActivity languageGuideActivity, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        beachfront.wireman(beachfront.f24107attabal, it, "ad_scenes_select_language_page", null, 4, null);
        languageGuideActivity.grimness().f37752beachfront.setStyles(new orometer.saneness.attabal().attabal());
        languageGuideActivity.grimness().f37752beachfront.destroyNativeAdIfNeed();
        languageGuideActivity.grimness().f37752beachfront.setNativeAd(it);
        return Unit.f29295attabal;
    }

    public static final Unit milliradian(LanguageGuideActivity languageGuideActivity, LanguageBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        languageGuideActivity.sayid(it);
        return Unit.f29295attabal;
    }

    public static final void nosophobia(boolean z) {
        if (z) {
            stonecrop.attabal.f38160attabal.attabal();
        } else {
            stonecrop.attabal.f38160attabal.saneness();
        }
    }

    public static final void premeiotic(LanguageGuideActivity languageGuideActivity, View view) {
        languageGuideActivity.lotta();
        languageGuideActivity.getOnBackPressedDispatcher().formularize();
    }

    public static final Unit timberyard(LanguageGuideActivity languageGuideActivity, sealless addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        languageGuideActivity.startActivity(new Intent(languageGuideActivity, (Class<?>) GuideActivity.class));
        languageGuideActivity.finish();
        return Unit.f29295attabal;
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: coffeecake, reason: merged with bridge method [inline-methods] */
    public competently starveling() {
        competently competentlyVarDern = competently.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(competentlyVarDern, "inflate(...)");
        return competentlyVarDern;
    }

    public final void lerp() {
        if (Build.VERSION.SDK_INT < 33 || picketboat.saneness.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        stonecrop.attabal.f38160attabal.dern();
        this.requestPermissionLauncher.attabal("android.permission.POST_NOTIFICATIONS");
    }

    public final void lotta() {
        LanguageBean languageBeanWireman = permissivist().wireman();
        if (languageBeanWireman != null) {
            tau.attabal attabalVar = tau.attabal.f38663attabal;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            attabalVar.saneness(applicationContext, languageBeanWireman.getLanguageCode());
        }
    }

    public final nonexistence.saneness permissivist() {
        return (nonexistence.saneness) this.adapter.getValue();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        supplicat.saneness(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: industrialist.beachfront
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LanguageGuideActivity.timberyard(this.f28840kowloon, (sealless) obj);
            }
        }, 2, null);
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.apical(root);
        wireman.saneness(wireman.f38163attabal, "1b_language_page_show", null, null, null, null, 30, null);
        treadless();
        permissivist().impromptu(new Function1() { // from class: industrialist.competently
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LanguageGuideActivity.milliradian(this.f28841kowloon, (LanguageBean) obj);
            }
        });
        grimness().f37760wireman.setItemAnimator(null);
        grimness().f37760wireman.addItemDecoration(new attabal());
        grimness().f37760wireman.setAdapter(permissivist());
        lerp();
        cultivated();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        tau.saneness.f38666attabal.peridotite(false);
        nonexistence.saneness sanenessVarPermissivist = permissivist();
        jugal.attabal attabalVar = jugal.attabal.f29013attabal;
        List<LanguageBean> listWireman = attabalVar.wireman();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        sanenessVarPermissivist.taiyuan(listWireman, attabalVar.dern(applicationContext));
        LanguageBean languageBeanWireman = permissivist().wireman();
        if (languageBeanWireman != null) {
            grimness().f37756impromptu.setText(languageBeanWireman.getLanguageName());
        }
    }

    public final void sayid(LanguageBean language) {
        grimness().f37756impromptu.setText(language.getLanguageName());
        Resources resourcesAttabal = com.codejoy.boom.clap.helper.beachfront.attabal(getPackageManager(), getPackageName(), Locale.forLanguageTag(language.getLanguageCode()));
        grimness().f37759taiyuan.setText(resourcesAttabal.getString(arytenoidectomy.language));
        grimness().f37754cutely.setText(resourcesAttabal.getString(arytenoidectomy.your_choice));
        grimness().f37753competently.setText(resourcesAttabal.getString(arytenoidectomy.save_button));
    }

    public final void treadless() {
        TemplateView templateView = grimness().f37752beachfront;
        Intrinsics.checkNotNullExpressionValue(templateView, "templateView");
        templateView.setVisibility(0);
        beachfront.f24107attabal.marial().sealless(this, "ad_scenes_select_language_page", this, grimness().f37752beachfront, new Function1() { // from class: industrialist.taiyuan
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LanguageGuideActivity.itchy(this.f28845kowloon, (NativeAd) obj);
            }
        });
    }
}
