package com.codejoy.boom.clap.module.setting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Process;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.splash.SplashActivity;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import dabble.LanguageBean;
import java.util.List;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LanguageSettingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/codejoy/boom/clap/module/setting/LanguageSettingActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/impromptu;", "<init>", "()V", "", "permissivist", "coffeecake", "Ldabble/attabal;", "language", "lerp", "(Ldabble/attabal;)V", "milliradian", "itchy", "()Lsonnetize/impromptu;", "privatdozent", "saran", "Lnonexistence/saneness;", "cord", "Lpatroclinal/taiyuan;", "dent", "()Lnonexistence/saneness;", L6.G1, "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LanguageSettingActivity extends BaseActivity<sonnetize.impromptu> {

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan adapter = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.setting.attabal
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LanguageSettingActivity.clubfoot();
        }
    });

    /* JADX INFO: compiled from: LanguageSettingActivity.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"com/codejoy/boom/clap/module/setting/LanguageSettingActivity$attabal", "Landroidx/recyclerview/widget/RecyclerView$triweekly;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$rotuma;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$rotuma;)V", "", "attabal", "I", "getSpace5", "()I", "space5", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends RecyclerView.triweekly {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final int space5 = com.blankj.utilcode.util.molybdenite.attabal(5.0f);

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

    /* JADX INFO: Access modifiers changed from: private */
    public static final nonexistence.saneness clubfoot() {
        return new nonexistence.saneness();
    }

    private final void coffeecake() {
        LanguageBean languageBeanWireman = dent().wireman();
        if (languageBeanWireman != null) {
            tau.attabal attabalVar = tau.attabal.f38663attabal;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            attabalVar.saneness(applicationContext, languageBeanWireman.getLanguageCode());
        }
        Intent intent = new Intent(this, (Class<?>) SplashActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static final void cultivated(LanguageSettingActivity languageSettingActivity, View view) {
        languageSettingActivity.coffeecake();
        languageSettingActivity.getOnBackPressedDispatcher().formularize();
    }

    private final nonexistence.saneness dent() {
        return (nonexistence.saneness) this.adapter.getValue();
    }

    private final void lerp(LanguageBean language) {
        grimness().f37857cutely.setText(language.getLanguageName());
        Resources resourcesAttabal = com.codejoy.boom.clap.helper.beachfront.attabal(getPackageManager(), getPackageName(), Locale.forLanguageTag(language.getLanguageCode()));
        grimness().f37853apical.setText(resourcesAttabal.getString(com.codejoy.boom.clap.arytenoidectomy.language));
        grimness().f37859formularize.setText(resourcesAttabal.getString(com.codejoy.boom.clap.arytenoidectomy.your_choice));
        grimness().f37863taiyuan.setText(resourcesAttabal.getString(com.codejoy.boom.clap.arytenoidectomy.save_button));
        grimness().f37860impromptu.setText(getString(com.codejoy.boom.clap.arytenoidectomy.back));
    }

    private final void milliradian() {
        couple.beachfront.f24107attabal.marial().sealless(this, "ad_scenes_select_language_page", this, grimness().f37856competently, new Function1() { // from class: com.codejoy.boom.clap.module.setting.dern
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LanguageSettingActivity.treadless(this.f18464kowloon, (NativeAd) obj);
            }
        });
    }

    private final void permissivist() {
        LinearLayout saveButton = grimness().f37855beachfront;
        Intrinsics.checkNotNullExpressionValue(saveButton, "saveButton");
        vintage.taiyuan.competently(saveButton);
        grimness().f37855beachfront.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.wireman
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageSettingActivity.cultivated(this.f18489kowloon, view);
            }
        });
        LinearLayout backButton = grimness().f37862saneness;
        Intrinsics.checkNotNullExpressionValue(backButton, "backButton");
        vintage.taiyuan.competently(backButton);
        grimness().f37862saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.marial
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageSettingActivity.premeiotic(this.f18473kowloon, view);
            }
        });
    }

    public static final void premeiotic(LanguageSettingActivity languageSettingActivity, View view) {
        languageSettingActivity.getOnBackPressedDispatcher().formularize();
    }

    public static final Unit timberyard(LanguageSettingActivity languageSettingActivity, LanguageBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        languageSettingActivity.lerp(it);
        return Unit.f29295attabal;
    }

    public static final Unit treadless(LanguageSettingActivity languageSettingActivity, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        languageSettingActivity.grimness().f37856competently.setStyles(new orometer.saneness.attabal().attabal());
        languageSettingActivity.grimness().f37856competently.destroyNativeAdIfNeed();
        languageSettingActivity.grimness().f37856competently.setNativeAd(it);
        return Unit.f29295attabal;
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: itchy, reason: merged with bridge method [inline-methods] */
    public sonnetize.impromptu starveling() {
        sonnetize.impromptu impromptuVarDern = sonnetize.impromptu.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(impromptuVarDern, "inflate(...)");
        return impromptuVarDern;
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.apical(root);
        milliradian();
        dent().impromptu(new Function1() { // from class: com.codejoy.boom.clap.module.setting.saneness
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LanguageSettingActivity.timberyard(this.f18482kowloon, (LanguageBean) obj);
            }
        });
        grimness().f37861marial.setItemAnimator(null);
        grimness().f37861marial.addItemDecoration(new attabal());
        grimness().f37861marial.setAdapter(dent());
        permissivist();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        tau.saneness.f38666attabal.peridotite(false);
        nonexistence.saneness sanenessVarDent = dent();
        jugal.attabal attabalVar = jugal.attabal.f29013attabal;
        List<LanguageBean> listWireman = attabalVar.wireman();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        sanenessVarDent.taiyuan(listWireman, attabalVar.dern(applicationContext));
        LanguageBean languageBeanWireman = dent().wireman();
        if (languageBeanWireman != null) {
            grimness().f37857cutely.setText(languageBeanWireman.getLanguageName());
        }
    }
}
