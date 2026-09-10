package com.codejoy.boom.clap.module.setting;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytejourney.clap.bing.module.dialog.SetTimeDialog;
import com.codejoy.boom.clap.data.bean.SoundSensitivityLevel;
import com.codejoy.boom.clap.module.WebViewActivity;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.dialog.ScheduleFeatureTipsDialog;
import com.codejoy.boom.clap.service.ClapCounterService;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.codejoy.boom.clap.widget.Switch;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import dabble.LanguageBean;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SettingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0005J\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cR\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/codejoy/boom/clap/module/setting/SettingActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/cutely;", "Lholophone/attabal;", "<init>", "()V", "", "coffeecake", "picketboat", "lightstruck", "()Lsonnetize/cutely;", "privatdozent", "saran", X3.i.u0, "", "Landroid/view/View;", "saneness", "()Ljava/util/List;", "gusty", "", "time", "", "isStart", "julian", "(Ljava/lang/String;Z)V", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "unconsolidated", "(I)V", "monroe", "cord", "Ljava/lang/String;", "deactivateStarTime", "cuirassed", "deactivateEndTime", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SettingActivity extends BaseActivity<sonnetize.cutely> implements holophone.attabal {

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public String deactivateStarTime = "";

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public String deactivateEndTime = "";

    /* JADX INFO: compiled from: SettingActivity.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/codejoy/boom/clap/module/setting/SettingActivity$attabal", "Lleh/taiyuan;", "Lcom/codejoy/boom/clap/widget/Switch;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "isChecked", "", "attabal", "(Lcom/codejoy/boom/clap/widget/Switch;Z)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements leh.taiyuan {
        public attabal() {
        }

        @Override // leh.taiyuan
        public void attabal(Switch view, boolean isChecked) {
            Intrinsics.checkNotNullParameter(view, "view");
            tau.saneness.f38666attabal.trm(isChecked);
            if (isChecked) {
                ScheduleFeatureTipsDialog scheduleFeatureTipsDialog = new ScheduleFeatureTipsDialog();
                FragmentManager fragmentManagerPolloi = SettingActivity.this.polloi();
                Intrinsics.checkNotNullExpressionValue(fragmentManagerPolloi, "getSupportFragmentManager(...)");
                vintage.saneness.attabal(scheduleFeatureTipsDialog, fragmentManagerPolloi);
            }
        }
    }

    public static final Unit achondroplasia(boolean z, SettingActivity settingActivity, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z) {
            settingActivity.deactivateStarTime = it;
            settingActivity.grimness().f37789rotuma.setText(it);
            tau.saneness.f38666attabal.oilcan(it);
        } else {
            settingActivity.deactivateEndTime = it;
            settingActivity.grimness().f37779gintrap.setText(it);
            tau.saneness.f38666attabal.stratoscope(it);
        }
        return Unit.f29295attabal;
    }

    private final void coffeecake() {
        LinearLayout backButton = grimness().f37776dern;
        Intrinsics.checkNotNullExpressionValue(backButton, "backButton");
        vintage.taiyuan.competently(backButton);
        grimness().f37776dern.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.formularize
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.lerp(this.f18466kowloon, view);
            }
        });
        grimness().f37769arytenoidectomy.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.impassible
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.nosophobia(this.f18469kowloon, view);
            }
        });
        grimness().f37780graveside.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.triweekly
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.lotta(this.f18487kowloon, view);
            }
        });
        grimness().f37785molybdenite.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.kowloon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.sayid(this.f18472kowloon, view);
            }
        });
        grimness().f37791stratoscope.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.arytenoidectomy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.empress(this.f18456kowloon, view);
            }
        });
        grimness().f37789rotuma.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.monoploid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.coi(this.f18476kowloon, view);
            }
        });
        grimness().f37779gintrap.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.polloi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.czestochowa(this.f18478kowloon, view);
            }
        });
        grimness().f37795wireman.setOnCheckedChangeListener(new attabal());
        grimness().f37794trm.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.molybdenite
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.sensatory(this.f18475kowloon, view);
            }
        });
        grimness().f37772competently.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.competently
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.underbelly(this.f18458kowloon, view);
            }
        });
        grimness().f37790saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.impromptu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.preterite(this.f18470kowloon, view);
            }
        });
    }

    public static final void coi(SettingActivity settingActivity, View view) {
        settingActivity.julian(settingActivity.deactivateStarTime, true);
    }

    public static final void czestochowa(SettingActivity settingActivity, View view) {
        settingActivity.julian(settingActivity.deactivateEndTime, false);
    }

    public static final void empress(SettingActivity settingActivity, View view) {
        settingActivity.gusty();
    }

    public static final void igbo(SettingActivity settingActivity) {
        settingActivity.grimness().f37773cord.getPaint().setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, settingActivity.grimness().f37773cord.getHeight(), Color.parseColor("#FFFFFFFF"), Color.parseColor("#FFB0A5F4"), Shader.TileMode.CLAMP));
        settingActivity.grimness().f37773cord.invalidate();
    }

    public static final void lerp(SettingActivity settingActivity, View view) {
        settingActivity.getOnBackPressedDispatcher().formularize();
    }

    public static final void lotta(SettingActivity settingActivity, View view) {
        settingActivity.gusty();
    }

    public static final void nosophobia(SettingActivity settingActivity, View view) {
        settingActivity.startActivity(new Intent(settingActivity, (Class<?>) LanguageSettingActivity.class));
    }

    public static final Unit palmyra(SettingActivity settingActivity, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingActivity.grimness().f37786monoploid.setStyles(new orometer.saneness.attabal().attabal());
        settingActivity.grimness().f37786monoploid.destroyNativeAdIfNeed();
        settingActivity.grimness().f37786monoploid.setNativeAd(it);
        return Unit.f29295attabal;
    }

    private final void picketboat() {
        couple.beachfront.f24107attabal.marial().sealless(this, "ad_scenes_sound_set_list_page", this, grimness().f37786monoploid, new Function1() { // from class: com.codejoy.boom.clap.module.setting.taiyuan
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingActivity.palmyra(this.f18486kowloon, (NativeAd) obj);
            }
        });
    }

    public static final void preterite(SettingActivity settingActivity, View view) {
        settingActivity.unconsolidated(2);
        tau.saneness.f38666attabal.saran(2);
        settingActivity.monroe(SoundSensitivityLevel.AVERAGE.getLevel());
    }

    public static final void sayid(SettingActivity settingActivity, View view) {
        WebViewActivity.Companion attabalVar = WebViewActivity.INSTANCE;
        String string = settingActivity.getString(com.codejoy.boom.clap.arytenoidectomy.privacy_policy);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        attabalVar.attabal(settingActivity, string, "https://boomclap.codejoys.net/privacy_policy.html");
    }

    public static final void sensatory(SettingActivity settingActivity, View view) {
        settingActivity.unconsolidated(0);
        tau.saneness sanenessVar = tau.saneness.f38666attabal;
        SoundSensitivityLevel soundSensitivityLevel = SoundSensitivityLevel.VERY_HIGH;
        sanenessVar.saran(soundSensitivityLevel.getLevel());
        settingActivity.monroe(soundSensitivityLevel.getLevel());
    }

    public static final void underbelly(SettingActivity settingActivity, View view) {
        settingActivity.unconsolidated(1);
        tau.saneness.f38666attabal.saran(1);
        settingActivity.monroe(SoundSensitivityLevel.HIGH.getLevel());
    }

    public static final Unit wostteth(SettingActivity settingActivity, androidx.p000activity.sealless addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        couple.wireman.f24115attabal.saneness().gintrap(settingActivity, "ad_scenes_exit_setting_page", new transpositive.attabal(null, null, null, null, 15, null));
        settingActivity.finish();
        return Unit.f29295attabal;
    }

    public final void gusty() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m3351constructorimpl(Boolean.valueOf(ongoing.saneness.saneness(getApplicationContext(), "com.codejoy.boomclap.aos")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public final void julian(String time, final boolean isStart) {
        SetTimeDialog setTimeDialogAttabal = SetTimeDialog.INSTANCE.attabal(time, isStart);
        setTimeDialogAttabal.arytenoidectomy(new Function1() { // from class: com.codejoy.boom.clap.module.setting.cutely
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingActivity.achondroplasia(isStart, this, (String) obj);
            }
        });
        FragmentManager fragmentManagerPolloi = polloi();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerPolloi, "getSupportFragmentManager(...)");
        vintage.saneness.attabal(setTimeDialogAttabal, fragmentManagerPolloi);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: lightstruck, reason: merged with bridge method [inline-methods] */
    public sonnetize.cutely starveling() {
        sonnetize.cutely cutelyVarDern = sonnetize.cutely.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cutelyVarDern, "inflate(...)");
        return cutelyVarDern;
    }

    public final void monroe(int level) {
        ClapCounterService.Companion companion = ClapCounterService.INSTANCE;
        if (companion.attabal().getValue().booleanValue()) {
            companion.wireman(this, level);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object next;
        String languageName;
        super.onResume();
        jugal.attabal attabalVar = jugal.attabal.f29013attabal;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        String strDern = attabalVar.dern(applicationContext);
        ParkinsansFontText parkinsansFontText = grimness().f37788preprohormone;
        Iterator<T> it = attabalVar.wireman().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.wireman(((LanguageBean) next).getLanguageCode(), strDern));
        LanguageBean languageBean = (LanguageBean) next;
        if (languageBean == null || (languageName = languageBean.getLanguageName()) == null) {
            languageName = "";
        }
        parkinsansFontText.setText(languageName);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        androidx.p000activity.supplicat.saneness(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.codejoy.boom.clap.module.setting.beachfront
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingActivity.wostteth(this.f18457kowloon, (androidx.p000activity.sealless) obj);
            }
        }, 2, null);
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.apical(root);
        grimness().f37773cord.post(new Runnable() { // from class: com.codejoy.boom.clap.module.setting.apical
            @Override // java.lang.Runnable
            public final void run() {
                SettingActivity.igbo(this.f18455kowloon);
            }
        });
        try {
            Result.Companion companion = Result.INSTANCE;
            grimness().f37787polloi.setNestedScrollingEnabled(true);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        if (isoparametric.dern.f29008attabal.attabal()) {
            couple.wireman wiremanVar = couple.wireman.f24115attabal;
            wiremanVar.saneness().gintrap(this, "ad_scenes_enter_setting_page", new transpositive.attabal(null, null, null, null, 15, null));
            wiremanVar.saneness().triweekly("ad_scenes_enter_setting_page", null);
        }
        picketboat();
        grimness().f37795wireman.setChecked(tau.saneness.f38666attabal.gintrap());
        coffeecake();
    }

    @Override // holophone.attabal
    public List<View> saneness() {
        return p002kotlin.collections.graveside.marial(grimness().f37786monoploid);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        tau.saneness sanenessVar = tau.saneness.f38666attabal;
        this.deactivateStarTime = sanenessVar.saneness();
        this.deactivateEndTime = sanenessVar.attabal();
        ParkinsansFontText parkinsansFontText = grimness().f37789rotuma;
        String str = this.deactivateStarTime;
        if (str.length() == 0) {
            str = "00:00";
        }
        parkinsansFontText.setText(str);
        ParkinsansFontText parkinsansFontText2 = grimness().f37779gintrap;
        String str2 = this.deactivateEndTime;
        parkinsansFontText2.setText(str2.length() != 0 ? str2 : "00:00");
        unconsolidated(sanenessVar.arytenoidectomy());
        grimness().f37774cuirassed.setText("v1.1.50");
    }

    public final void unconsolidated(int level) {
        int childCount = grimness().f37767adultoid.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = grimness().f37767adultoid.getChildAt(i);
            Intrinsics.competently(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
            boolean z = true;
            View childAt2 = ((LinearLayout) childAt).getChildAt(1);
            if (level != i) {
                z = false;
            }
            childAt2.setSelected(z);
        }
    }
}
