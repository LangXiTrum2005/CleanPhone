package com.codejoy.boom.clap;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.gintrap;
import androidx.p000activity.sealless;
import androidx.p000activity.supplicat;
import androidx.p001lifecycle.cord;
import androidx.viewpager2.widget.ViewPager2;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.dialog.AppExistDialog;
import com.codejoy.boom.clap.module.fragment.AntiPocketFragment;
import com.codejoy.boom.clap.module.fragment.ClapFindPhoneFragment;
import com.codejoy.boom.clap.module.fragment.NoTouchFragment;
import com.codejoy.boom.clap.module.setting.SettingActivity;
import com.codejoy.boom.clap.module.vip.VipActivity;
import com.codejoy.boom.clap.module.vip.VipEntranceSource;
import com.codejoy.boom.clap.module.vip.VipInfoManager;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.X3;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.unity3d.ads.metadata.MetaData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.premeiotic;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0005J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001c\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u0005J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010*\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010\u0005J\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010\u001bR!\u00101\u001a\b\u0012\u0004\u0012\u00020-0\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0017R\u0014\u00104\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/codejoy/boom/clap/MainActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/taiyuan;", "Lholophone/attabal;", "<init>", "()V", "palmyra", "()Lsonnetize/taiyuan;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "privatdozent", "saran", X3.i.u0, "", "distance", "lerp", "(I)V", "", "Landroid/view/View;", "saneness", "()Ljava/util/List;", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onDestroy", X3.i.L, "achondroplasia", "coi", "empress", "coffeecake", "julian", "", "canRequestAd", "sayid", "(Z)V", "granted", "monroe", "unconsolidated", "claque", "sourceIntent", "lightstruck", "Landroidx/fragment/app/Fragment;", "cord", "Lpatroclinal/taiyuan;", "lotta", "fragmentList", "cuirassed", "I", "scrollDistance", "stratoscope", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainActivity extends BaseActivity<sonnetize.taiyuan> implements holophone.attabal {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static MainActivity f18192oilcan;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static boolean f18193sealless;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final int f18195trm = 8;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static com.google.android.play.core.review.attabal f18196yemenite;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan fragmentList = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.saneness
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.nosophobia();
        }
    });

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final int scrollDistance = (int) ((10 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);

    /* JADX INFO: renamed from: com.codejoy.boom.clap.MainActivity$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010%\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010(\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010 R\u0014\u0010)\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010 R\u0014\u0010+\u001a\u00020*8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020*8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010,¨\u0006/"}, d2 = {"Lcom/codejoy/boom/clap/MainActivity$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "entrance", "", "wireman", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/codejoy/boom/clap/MainActivity;", "attabal", "()Lcom/codejoy/boom/clap/MainActivity;", "activity", "Lcom/google/android/play/core/review/attabal;", "reviewManager", "Lcom/google/android/play/core/review/attabal;", "saneness", "()Lcom/google/android/play/core/review/attabal;", "setReviewManager", "(Lcom/google/android/play/core/review/attabal;)V", "", "isAlive", "Z", "dern", "()Z", "setAlive", "(Z)V", "_activity", "Lcom/codejoy/boom/clap/MainActivity;", "ENTRANCE", "Ljava/lang/String;", "ENTRANCE_GUIDE", "ENTRANCE_LANGUAGE", "ENTRANCE_COLD", "ENTRANCE_HOT", "ENTRANCE_NOTIFICATION", "ENTRANCE_RESULT", "ENTRANCE_BACK_TO_PURCHASE", "SETTING_SILENT_MODE", "EXTRA_HOME_FUNCTION", "", "HOME_FUNCTION_CLAP", "I", "HOME_FUNCTION_PRIVACY", "HOME_FUNCTION_ANTI_THEFT", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MainActivity attabal() {
            return MainActivity.f18192oilcan;
        }

        public final boolean dern() {
            return MainActivity.f18193sealless;
        }

        public final com.google.android.play.core.review.attabal saneness() {
            return MainActivity.f18196yemenite;
        }

        public final void wireman(Context context, String entrance) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("entrance", entrance);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: MainActivity.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class dern implements cord, p002kotlin.jvm.internal.apical {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Function1 f18199kowloon;

        public dern(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f18199kowloon = function;
        }

        @Override // androidx.p001lifecycle.cord
        public final /* synthetic */ void attabal(Object obj) {
            this.f18199kowloon.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof cord) && (obj instanceof p002kotlin.jvm.internal.apical)) {
                return Intrinsics.wireman(getFunctionDelegate(), ((p002kotlin.jvm.internal.apical) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p002kotlin.jvm.internal.apical
        public final patroclinal.beachfront<?> getFunctionDelegate() {
            return this.f18199kowloon;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/codejoy/boom/clap/MainActivity$saneness", "Landroidx/viewpager2/widget/ViewPager2$taiyuan;", "", X3.i.L, "", "dern", "(I)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness extends ViewPager2.taiyuan {
        public saneness() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.taiyuan
        public void dern(int position) {
            super.dern(position);
            MainActivity.this.achondroplasia(position);
        }
    }

    public static final void czestochowa(MainActivity mainActivity, View view) {
        VipActivity.INSTANCE.attabal(mainActivity, VipEntranceSource.HOME);
    }

    public static final void gusty(MainActivity mainActivity, View view) {
        mainActivity.grimness().f37986formularize.setCurrentItem(2);
    }

    public static final void igbo(MainActivity mainActivity, View view) {
        mainActivity.grimness().f37986formularize.setCurrentItem(1);
    }

    public static final ArrayList nosophobia() {
        return adultoid.competently(new ClapFindPhoneFragment(), new NoTouchFragment(), new AntiPocketFragment());
    }

    public static final Unit picketboat(MainActivity mainActivity, Boolean bool) {
        AppCompatImageView vipEntrance = mainActivity.grimness().f37987impassible;
        Intrinsics.checkNotNullExpressionValue(vipEntrance, "vipEntrance");
        vipEntrance.setVisibility(!bool.booleanValue() ? 0 : 8);
        return Unit.f29295attabal;
    }

    public static final Unit preterite(MainActivity mainActivity, String str, Bundle data) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getBoolean("exit")) {
            mainActivity.finish();
        }
        return Unit.f29295attabal;
    }

    public static final void sensatory(MainActivity mainActivity, View view) {
        mainActivity.startActivity(new Intent(view.getContext(), (Class<?>) SettingActivity.class));
    }

    public static final Unit underbelly(final MainActivity mainActivity, sealless addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        AppExistDialog appExistDialog = new AppExistDialog();
        FragmentManager fragmentManagerPolloi = mainActivity.polloi();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerPolloi, "getSupportFragmentManager(...)");
        vintage.saneness.saneness(appExistDialog, fragmentManagerPolloi, null);
        gintrap.dern(appExistDialog, "exit_dialog", new Function2() { // from class: com.codejoy.boom.clap.impromptu
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.preterite(this.f18269kowloon, (String) obj, (Bundle) obj2);
            }
        });
        return Unit.f29295attabal;
    }

    public static final void wostteth(MainActivity mainActivity, View view) {
        mainActivity.grimness().f37986formularize.setCurrentItem(0);
    }

    public final void achondroplasia(int position) {
        int childCount = grimness().f37984cutely.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = grimness().f37984cutely.getChildAt(i);
            childAt.setSelected(i == position);
            if (childAt instanceof ParkinsansFontText) {
                ParkinsansFontText parkinsansFontText = (ParkinsansFontText) childAt;
                if (parkinsansFontText.isSelected()) {
                    parkinsansFontText.setBoldFont();
                } else {
                    parkinsansFontText.setMediumFont();
                }
            }
            i++;
        }
    }

    public final void coffeecake() {
        kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(this), premeiotic.saneness(), null, new MainActivity$checkGDPR$1(this, null), 2, null);
    }

    public final void coi() {
        AppCompatImageView vipEntrance = grimness().f37987impassible;
        Intrinsics.checkNotNullExpressionValue(vipEntrance, "vipEntrance");
        vintage.taiyuan.competently(vipEntrance);
        grimness().f37987impassible.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.taiyuan
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.czestochowa(this.f18654kowloon, view);
            }
        });
        AppCompatImageView settingButton = grimness().f37991taiyuan;
        Intrinsics.checkNotNullExpressionValue(settingButton, "settingButton");
        vintage.taiyuan.competently(settingButton);
        grimness().f37991taiyuan.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.cutely
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.sensatory(this.f18206kowloon, view);
            }
        });
    }

    public final void julian() {
        kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(this), premeiotic.saneness(), null, new MainActivity$setupHeadImage$1(this, null), 2, null);
    }

    public final void lerp(int distance) {
        if (distance > this.scrollDistance) {
            grimness().f37982beachfront.setVisibility(0);
        } else {
            grimness().f37982beachfront.setVisibility(4);
        }
    }

    public final void lightstruck(Intent sourceIntent) {
        int intExtra = sourceIntent.getIntExtra("extra_home_function", -1);
        if (intExtra < 0 || intExtra >= 3) {
            return;
        }
        grimness().f37986formularize.setCurrentItem(intExtra, false);
    }

    public final List<Fragment> lotta() {
        return (List) this.fragmentList.getValue();
    }

    public final void monroe(boolean granted) {
        try {
            Result.Companion companion = Result.INSTANCE;
            FirebaseAnalytics.ConsentStatus consentStatus = granted ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus);
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus);
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus);
            FirebaseAnalytics.getInstance(getApplicationContext()).saneness(linkedHashMap);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.p000activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        f18193sealless = true;
        super.onCreate(savedInstanceState);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f18193sealless = false;
    }

    @Override // androidx.p000activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent.hasExtra("setting_silent_mode")) {
            tau.saneness.f38666attabal.trm(intent.getBooleanExtra("setting_silent_mode", false));
        }
        lightstruck(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.codejoy.boom.clap.fcm.cutely cutelyVar = com.codejoy.boom.clap.fcm.cutely.f18235attabal;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        cutelyVar.impromptu(applicationContext);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: palmyra, reason: merged with bridge method [inline-methods] */
    public sonnetize.taiyuan starveling() {
        sonnetize.taiyuan taiyuanVarDern = sonnetize.taiyuan.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(taiyuanVarDern, "inflate(...)");
        return taiyuanVarDern;
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        supplicat.saneness(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.codejoy.boom.clap.dern
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.underbelly(this.f18215kowloon, (sealless) obj);
            }
        }, 2, null);
        LinearLayout topBar = grimness().f37980apical;
        Intrinsics.checkNotNullExpressionValue(topBar, "topBar");
        vintage.taiyuan.molybdenite(topBar, true);
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.impassible(root);
        tau.saneness sanenessVar = tau.saneness.f38666attabal;
        if (!sanenessVar.marial()) {
            f18196yemenite = com.google.android.play.core.review.saneness.attabal(this);
        }
        ParkinsansFontText parkinsansFontText = grimness().f37992wireman;
        Intrinsics.beachfront(parkinsansFontText);
        vintage.taiyuan.marial(parkinsansFontText);
        parkinsansFontText.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.wireman
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.wostteth(this.f18783kowloon, view);
            }
        });
        ParkinsansFontText parkinsansFontText2 = grimness().f37990saneness;
        Intrinsics.beachfront(parkinsansFontText2);
        vintage.taiyuan.marial(parkinsansFontText2);
        parkinsansFontText2.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.marial
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.igbo(this.f18270kowloon, view);
            }
        });
        ParkinsansFontText parkinsansFontText3 = grimness().f37988impromptu;
        Intrinsics.beachfront(parkinsansFontText3);
        vintage.taiyuan.marial(parkinsansFontText3);
        parkinsansFontText3.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.beachfront
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.gusty(this.f18204kowloon, view);
            }
        });
        grimness().f37986formularize.competently(new saneness());
        grimness().f37986formularize.setUserInputEnabled(false);
        grimness().f37986formularize.setOffscreenPageLimit(2);
        grimness().f37986formularize.setAdapter(new hoiden.competently(this, lotta()));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        lightstruck(intent);
        coi();
        VipInfoManager.INSTANCE.attabal().impromptu().competently(this, new dern(new Function1() { // from class: com.codejoy.boom.clap.competently
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.picketboat(this.f18205kowloon, (Boolean) obj);
            }
        }));
        if (!sanenessVar.graveside()) {
            unconsolidated();
        } else {
            if (sanenessVar.adultoid()) {
                return;
            }
            claque();
        }
    }

    @Override // holophone.attabal
    public List<View> saneness() {
        return graveside.marial(grimness().f37987impassible);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        empress();
        coffeecake();
        julian();
    }

    public final void sayid(boolean canRequestAd) {
        if (canRequestAd) {
            MBridgeSDKFactory.getMBridgeSDK().setDoNotTrackStatus(true);
            AppLovinPrivacySettings.setHasUserConsent(true, this);
            AppLovinPrivacySettings.setDoNotSell(true, this);
            MetaData metaData = new MetaData(this);
            metaData.set("gdpr.consent", Boolean.TRUE);
            metaData.commit();
        }
        monroe(canRequestAd);
    }

    public final void claque() {
    }

    public final void empress() {
    }

    public final void unconsolidated() {
    }
}
