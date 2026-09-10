package com.codejoy.boom.clap.module.fragment;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.gintrap;
import androidx.p000activity.result.ActivityResult;
import com.codejoy.boom.clap.BoomClapApplication;
import com.codejoy.boom.clap.MainActivity;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.data.SoundData;
import com.codejoy.boom.clap.fcm.NotifySettingHelper;
import com.codejoy.boom.clap.module.dialog.CloseOtherServiceDialog;
import com.codejoy.boom.clap.module.setting.SoundSettingActivity;
import com.codejoy.boom.clap.module.vip.VipActivity;
import com.codejoy.boom.clap.module.vip.VipEntranceSource;
import com.codejoy.boom.clap.service.AntiPickPocketService;
import com.codejoy.boom.clap.service.ClapCounterService;
import com.codejoy.boom.clap.service.NotTouchPhoneService;
import com.codejoy.boom.clap.widget.ClapButton;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import kotlinx.coroutines.monroe;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.trm;

/* JADX INFO: compiled from: PhoneFunctionFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J\u0015\u0010'\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020&H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R%\u00105\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u000100000/8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b3\u00104R\"\u0010<\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010>\u001a\u0004\b?\u0010@R\"\u0010G\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010C\u001a\u0004\b6\u0010D\"\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010HR\u0016\u0010J\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010L¨\u0006N"}, d2 = {"Lcom/codejoy/boom/clap/module/fragment/PhoneFunctionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "dovishness", "kattegat", "adultoid", "graveside", "rotuma", "trm", "formularize", "preprohormone", "Lcom/codejoy/boom/clap/data/FunctionMode;", X3.a.t, "Lkotlin/Function0;", "callback", "sealless", "(Lcom/codejoy/boom/clap/data/FunctionMode;Lkotlin/jvm/functions/Function0;)V", "originMode", "targetMode", "cuirassed", "(Lcom/codejoy/boom/clap/data/FunctionMode;Lcom/codejoy/boom/clap/data/FunctionMode;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", X3.i.u0, X3.i.t0, "onDestroy", "", "impassible", "(Lcom/codejoy/boom/clap/data/FunctionMode;)Z", "triweekly", "()Z", "kowloon", "", "polloi", "()Ljava/lang/String;", "Lwireman/dern;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Lwireman/dern;", "getSoundSettingLauncher", "()Lwireman/dern;", "soundSettingLauncher", "arytenoidectomy", "Lcom/codejoy/boom/clap/data/FunctionMode;", "monoploid", "()Lcom/codejoy/boom/clap/data/FunctionMode;", "yemenite", "(Lcom/codejoy/boom/clap/data/FunctionMode;)V", "functionMode", "Lhoiden/beachfront;", "Lpatroclinal/taiyuan;", "molybdenite", "()Lhoiden/beachfront;", "soundListAdapter", "Lsonnetize/trm;", "Lsonnetize/trm;", "()Lsonnetize/trm;", "oilcan", "(Lsonnetize/trm;)V", "binding", "Z", "recentInDeactivateState", "hasLoadNativeAd", "Lkotlinx/coroutines/monroe;", "Lkotlinx/coroutines/monroe;", "job", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class PhoneFunctionFragment extends Fragment {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public monroe job;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public FunctionMode functionMode;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public boolean hasLoadNativeAd;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final wireman.dern<Intent> soundSettingLauncher;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public boolean recentInDeactivateState;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan soundListAdapter;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public trm binding;

    /* JADX INFO: compiled from: PhoneFunctionFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/codejoy/boom/clap/module/fragment/PhoneFunctionFragment$attabal", "Lleh/competently;", "", "saneness", "()Z", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements leh.competently {
        public attabal() {
        }

        public static final Unit wireman(PhoneFunctionFragment phoneFunctionFragment) {
            phoneFunctionFragment.arytenoidectomy().f38007wireman.performToActivate();
            return Unit.f29295attabal;
        }

        @Override // leh.competently
        public boolean attabal() {
            return PhoneFunctionFragment.this.kowloon();
        }

        @Override // leh.competently
        public boolean saneness() {
            PhoneFunctionFragment phoneFunctionFragment = PhoneFunctionFragment.this;
            if (!phoneFunctionFragment.impassible(phoneFunctionFragment.getFunctionMode())) {
                return PhoneFunctionFragment.this.triweekly();
            }
            PhoneFunctionFragment phoneFunctionFragment2 = PhoneFunctionFragment.this;
            FunctionMode functionMode = phoneFunctionFragment2.getFunctionMode();
            final PhoneFunctionFragment phoneFunctionFragment3 = PhoneFunctionFragment.this;
            phoneFunctionFragment2.sealless(functionMode, new Function0() { // from class: com.codejoy.boom.clap.module.fragment.adultoid
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneFunctionFragment.attabal.wireman(phoneFunctionFragment3);
                }
            });
            return false;
        }
    }

    public PhoneFunctionFragment() {
        wireman.dern<Intent> dernVarRegisterForActivityResult = registerForActivityResult(new marial.wireman(), new wireman.attabal() { // from class: com.codejoy.boom.clap.module.fragment.arytenoidectomy
            @Override // wireman.attabal
            public final void onActivityResult(Object obj) {
                PhoneFunctionFragment.polder(this.f18364attabal, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dernVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.soundSettingLauncher = dernVarRegisterForActivityResult;
        this.functionMode = FunctionMode.NONE;
        this.soundListAdapter = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.fragment.monoploid
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneFunctionFragment.merc();
            }
        });
    }

    public static final Unit cord(PhoneFunctionFragment phoneFunctionFragment, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        phoneFunctionFragment.arytenoidectomy().f38004impromptu.setStyles(new orometer.saneness.attabal().attabal());
        phoneFunctionFragment.arytenoidectomy().f38004impromptu.setNativeAd(it);
        phoneFunctionFragment.trm();
        return Unit.f29295attabal;
    }

    private final void dovishness() {
        ClapButton homeClapView = arytenoidectomy().f38007wireman;
        Intrinsics.checkNotNullExpressionValue(homeClapView, "homeClapView");
        vintage.taiyuan.molybdenite(homeClapView, true);
        arytenoidectomy().f38007wireman.setup(this.functionMode);
        adultoid();
        kattegat();
        final FragmentActivity activity = getActivity();
        arytenoidectomy().f38001beachfront.setOnScrollChangeListener(new NestedScrollView.marial() { // from class: com.codejoy.boom.clap.module.fragment.kowloon
            @Override // androidx.core.widget.NestedScrollView.marial
            public final void attabal(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                PhoneFunctionFragment.gintrap(activity, this, nestedScrollView, i, i2, i3, i4);
            }
        });
        graveside();
    }

    private final void formularize() {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            monroe monroeVar = this.job;
            if (monroeVar != null) {
                monroe.attabal.attabal(monroeVar, null, 1, null);
                unit = Unit.f29295attabal;
            } else {
                unit = null;
            }
            Result.m3351constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        this.job = null;
    }

    public static final void gintrap(FragmentActivity fragmentActivity, PhoneFunctionFragment phoneFunctionFragment, NestedScrollView p0, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        if (fragmentActivity instanceof MainActivity) {
            ((MainActivity) fragmentActivity).lerp(phoneFunctionFragment.arytenoidectomy().f38001beachfront.getScrollY());
        }
    }

    private final void graveside() {
        kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(this), null, null, new PhoneFunctionFragment$initEvent$1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hoiden.beachfront merc() {
        return new hoiden.beachfront();
    }

    private final hoiden.beachfront molybdenite() {
        return (hoiden.beachfront) this.soundListAdapter.getValue();
    }

    public static final void polder(PhoneFunctionFragment phoneFunctionFragment, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getCom.ironsource.X3.f.f java.lang.String() == -1) {
            Intent data = result.getData();
            SoundData soundData = data != null ? (SoundData) picketboat.dern.attabal(data, "sel_sound", SoundData.class) : null;
            if (soundData != null) {
                phoneFunctionFragment.molybdenite().taiyuan(unbalanced.attabal.f39224attabal.saneness(), soundData);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preprohormone() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            couple.beachfront.f24107attabal.marial().sealless(activity, polloi(), this, arytenoidectomy().f38004impromptu, new Function1() { // from class: com.codejoy.boom.clap.module.fragment.triweekly
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhoneFunctionFragment.cord(this.f18378kowloon, (NativeAd) obj);
                }
            });
        }
        trm();
    }

    public static final Unit restrictive(PhoneFunctionFragment phoneFunctionFragment, SoundData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity activity = phoneFunctionFragment.getActivity();
        if (activity != null) {
            SoundSettingActivity.INSTANCE.attabal(phoneFunctionFragment.soundSettingLauncher, activity, it, phoneFunctionFragment.functionMode);
        }
        return Unit.f29295attabal;
    }

    private final void rotuma() {
        if (this.hasLoadNativeAd) {
            trm();
        } else {
            this.hasLoadNativeAd = true;
            preprohormone();
        }
    }

    public static final Unit stratoscope(Function0 function0, String str, Bundle data) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(data, "data");
        function0.invoke();
        return Unit.f29295attabal;
    }

    public static final Unit supplicat(PhoneFunctionFragment phoneFunctionFragment, SoundData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity activity = phoneFunctionFragment.getActivity();
        if (activity != null) {
            VipActivity.INSTANCE.attabal(activity, VipEntranceSource.UNLOCK_VIP_SOUND);
        }
        return Unit.f29295attabal;
    }

    private final void trm() {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            monroe monroeVar = this.job;
            if (monroeVar != null) {
                monroe.attabal.attabal(monroeVar, null, 1, null);
                unit = Unit.f29295attabal;
            } else {
                unit = null;
            }
            Result.m3351constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        this.job = null;
        try {
            this.job = kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(this), null, null, new PhoneFunctionFragment$refreshNativeAd$2$1(this, null), 3, null);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
        }
    }

    public final void adultoid() {
        arytenoidectomy().f38007wireman.setActivateListener(new attabal());
    }

    public final trm arytenoidectomy() {
        trm trmVar = this.binding;
        if (trmVar != null) {
            return trmVar;
        }
        Intrinsics.preprohormone("binding");
        return null;
    }

    public final void cuirassed(FunctionMode originMode, FunctionMode targetMode, final Function0<Unit> callback) {
        CloseOtherServiceDialog closeOtherServiceDialogAttabal = CloseOtherServiceDialog.INSTANCE.attabal(originMode, targetMode);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        vintage.saneness.saneness(closeOtherServiceDialogAttabal, childFragmentManager, "closeOtherServiceDialog");
        gintrap.dern(closeOtherServiceDialogAttabal, "close_other_dialog_request_key", new Function2() { // from class: com.codejoy.boom.clap.module.fragment.graveside
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PhoneFunctionFragment.stratoscope(callback, (String) obj, (Bundle) obj2);
            }
        });
    }

    public final boolean impassible(FunctionMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (mode != FunctionMode.MODE_CLAP_FIND_PHONE && ClapCounterService.INSTANCE.attabal().getValue().booleanValue()) {
            return true;
        }
        if (mode == FunctionMode.MODE_ANTI_PICKPOCKET || !AntiPickPocketService.INSTANCE.attabal().getValue().booleanValue()) {
            return mode != FunctionMode.MODE_NOT_TOUCH_PHONE && NotTouchPhoneService.INSTANCE.attabal().getValue().booleanValue();
        }
        return true;
    }

    public final void kattegat() {
        arytenoidectomy().f38005marial.setItemAnimator(null);
        float f = 8;
        arytenoidectomy().f38005marial.addItemDecoration(new leh.marial(3, (int) ((Resources.getSystem().getDisplayMetrics().density * f) + 0.5f), (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f), false, null, 24, null));
        molybdenite().impromptu(new Function1() { // from class: com.codejoy.boom.clap.module.fragment.polloi
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneFunctionFragment.supplicat(this.f18375kowloon, (SoundData) obj);
            }
        });
        molybdenite().competently(new Function1() { // from class: com.codejoy.boom.clap.module.fragment.molybdenite
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneFunctionFragment.restrictive(this.f18374kowloon, (SoundData) obj);
            }
        });
        hoiden.beachfront beachfrontVarMolybdenite = molybdenite();
        unbalanced.attabal attabalVar = unbalanced.attabal.f39224attabal;
        beachfrontVarMolybdenite.taiyuan(attabalVar.saneness(), attabalVar.attabal(this.functionMode));
        arytenoidectomy().f38005marial.setAdapter(molybdenite());
    }

    public boolean kowloon() {
        return false;
    }

    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public final FunctionMode getFunctionMode() {
        return this.functionMode;
    }

    public final void oilcan(trm trmVar) {
        Intrinsics.checkNotNullParameter(trmVar, "<set-?>");
        this.binding = trmVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        trm trmVarDern = trm.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(trmVarDern, "inflate(...)");
        oilcan(trmVarDern);
        return arytenoidectomy().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        formularize();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        formularize();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rotuma();
        if (!tau.saneness.f38666attabal.gintrap() || !ClapCounterService.INSTANCE.cutely()) {
            if (this.recentInDeactivateState) {
                this.recentInDeactivateState = false;
                arytenoidectomy().f38007wireman.updateActivatedTipText(false);
                return;
            }
            return;
        }
        this.recentInDeactivateState = true;
        arytenoidectomy().f38007wireman.updateActivatedTipText(false);
        BoomClapApplication.Companion companion = BoomClapApplication.INSTANCE;
        if (igbo.polloi.saneness(companion.attabal()).attabal()) {
            try {
                Result.Companion companion2 = Result.INSTANCE;
                Notification notificationApical = NotifySettingHelper.f18231attabal.apical(companion.attabal(), 2);
                Object systemService = companion.attabal().getSystemService("notification");
                Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).notify(2, notificationApical);
                Result.m3351constructorimpl(Unit.f29295attabal);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        dovishness();
    }

    public String polloi() {
        return "";
    }

    public final void sealless(FunctionMode mode, Function0<Unit> callback) {
        FunctionMode functionMode = FunctionMode.MODE_CLAP_FIND_PHONE;
        if (mode != functionMode && ClapCounterService.INSTANCE.attabal().getValue().booleanValue()) {
            cuirassed(functionMode, mode, callback);
            return;
        }
        FunctionMode functionMode2 = FunctionMode.MODE_ANTI_PICKPOCKET;
        if (mode != functionMode2 && AntiPickPocketService.INSTANCE.attabal().getValue().booleanValue()) {
            cuirassed(functionMode2, mode, callback);
            return;
        }
        FunctionMode functionMode3 = FunctionMode.MODE_NOT_TOUCH_PHONE;
        if (mode == functionMode3 || !NotTouchPhoneService.INSTANCE.attabal().getValue().booleanValue()) {
            return;
        }
        cuirassed(functionMode3, mode, callback);
    }

    public boolean triweekly() {
        return false;
    }

    public final void yemenite(FunctionMode functionMode) {
        Intrinsics.checkNotNullParameter(functionMode, "<set-?>");
        this.functionMode = functionMode;
    }
}
