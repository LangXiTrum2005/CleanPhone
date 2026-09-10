package com.codejoy.boom.clap.module.setting;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.data.SoundData;
import com.codejoy.boom.clap.helper.VersionHelper;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.dialog.PickSoundDialog;
import com.codejoy.boom.clap.module.vip.VipActivity;
import com.codejoy.boom.clap.module.vip.VipEntranceSource;
import com.codejoy.boom.clap.service.AntiPickPocketService;
import com.codejoy.boom.clap.service.ClapCounterService;
import com.codejoy.boom.clap.service.NotTouchPhoneService;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlinx.coroutines.monroe;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SoundSettingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001f\u0010\u0004R\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u00103R\u001d\u00108\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b6\u00107R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010=R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006O"}, d2 = {"Lcom/codejoy/boom/clap/module/setting/SoundSettingActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/apical;", "<init>", "()V", "", "unconsolidated", "libyan", "Lcom/codejoy/boom/clap/data/SoundData;", "selSound", "herdbook", "(Lcom/codejoy/boom/clap/data/SoundData;)V", "gusty", "prefect", "pruinose", "microchemistry", "tarboosh", "sakeen", "molet", "preterite", "igbo", "homozygous", "cosy", "wostteth", "osteal", "deadwork", "()Lsonnetize/apical;", "privatdozent", "saran", X3.i.u0, X3.i.t0, "onDestroy", "Landroid/media/MediaPlayer;", "cord", "Lpatroclinal/taiyuan;", "lightstruck", "()Landroid/media/MediaPlayer;", "mediaPlayer", "Lhoiden/wireman;", "cuirassed", "julian", "()Lhoiden/wireman;", "soundDurationAdapter", "Lhoiden/saneness;", "stratoscope", "achondroplasia", "()Lhoiden/saneness;", "soundListAdapter", "Lcom/codejoy/boom/clap/data/FunctionMode;", "trm", "palmyra", "()Lcom/codejoy/boom/clap/data/FunctionMode;", "functionMode", "oilcan", "monroe", "()Lcom/codejoy/boom/clap/data/SoundData;", "soundData", "yemenite", "Lcom/codejoy/boom/clap/data/SoundData;", "", "sealless", "Z", "isPlaying", "", "kattegat", "Ljava/lang/String;", "lastAudioFile", "Landroid/animation/ObjectAnimator;", "supplicat", "Landroid/animation/ObjectAnimator;", "animator", "restrictive", "hasLoadNativeAd", "Lkotlinx/coroutines/monroe;", "merc", "Lkotlinx/coroutines/monroe;", "job", "polder", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SoundSettingActivity extends BaseActivity<sonnetize.apical> {

    /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public static final int f18437seminary = 8;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public monroe job;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public boolean hasLoadNativeAd;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public boolean isPlaying;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public ObjectAnimator animator;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public SoundData selSound;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan mediaPlayer = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.setting.graveside
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SoundSettingActivity.lampshade();
        }
    });

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan soundDurationAdapter = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.setting.yemenite
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SoundSettingActivity.sultanate();
        }
    });

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan soundListAdapter = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.setting.sealless
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SoundSettingActivity.linendraper();
        }
    });

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan functionMode = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.setting.kattegat
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SoundSettingActivity.picketboat(this.f18471kowloon);
        }
    });

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan soundData = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.setting.supplicat
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SoundSettingActivity.demilitarize(this.f18485kowloon);
        }
    });

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public String lastAudioFile = "";

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.setting.SoundSettingActivity$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SoundSettingActivity.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/codejoy/boom/clap/module/setting/SoundSettingActivity$attabal;", "", "<init>", "()V", "Lwireman/dern;", "Landroid/content/Intent;", "launcher", "Landroid/content/Context;", "context", "Lcom/codejoy/boom/clap/data/SoundData;", "soundData", "Lcom/codejoy/boom/clap/data/FunctionMode;", X3.a.t, "", "attabal", "(Lwireman/dern;Landroid/content/Context;Lcom/codejoy/boom/clap/data/SoundData;Lcom/codejoy/boom/clap/data/FunctionMode;)V", "", "KEY_SEL_SOUND", "Ljava/lang/String;", "KEY_FUNCTION_MODE", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void attabal(wireman.dern<Intent> launcher, Context context, SoundData soundData, FunctionMode mode) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(soundData, "soundData");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intent intent = new Intent(context, (Class<?>) SoundSettingActivity.class);
            intent.putExtra("sel_sound", soundData);
            intent.putExtra("key_function_mode", mode);
            launcher.attabal(intent);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: SoundSettingActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/codejoy/boom/clap/module/setting/SoundSettingActivity$beachfront", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class beachfront implements ViewTreeObserver.OnGlobalLayoutListener {
        public beachfront() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (SoundSettingActivity.this.grimness().f37717dovishness.getWidth() <= 0 || SoundSettingActivity.this.grimness().f37717dovishness.getHeight() <= 0) {
                return;
            }
            SoundSettingActivity.this.grimness().f37717dovishness.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            SoundSettingActivity.this.microchemistry();
        }
    }

    /* JADX INFO: compiled from: SoundSettingActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/codejoy/boom/clap/module/setting/SoundSettingActivity$dern", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class dern implements ViewTreeObserver.OnGlobalLayoutListener {
        public dern() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (SoundSettingActivity.this.grimness().f37731stratoscope.getWidth() <= 0 || SoundSettingActivity.this.grimness().f37731stratoscope.getHeight() <= 0) {
                return;
            }
            SoundSettingActivity.this.grimness().f37731stratoscope.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            SoundSettingActivity.this.prefect();
        }
    }

    /* JADX INFO: compiled from: SoundSettingActivity.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"com/codejoy/boom/clap/module/setting/SoundSettingActivity$marial", "Landroidx/recyclerview/widget/RecyclerView$triweekly;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$rotuma;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$rotuma;)V", "", "attabal", "I", "getSpace", "()I", "space", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class marial extends RecyclerView.triweekly {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final int space = com.blankj.utilcode.util.molybdenite.attabal(6.0f);

        @Override // androidx.recyclerview.widget.RecyclerView.triweekly
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.rotuma state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            if (parent.getChildAdapterPosition(view) > 0) {
                outRect.left = this.space;
            }
        }
    }

    /* JADX INFO: compiled from: SoundSettingActivity.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f18452attabal;

        static {
            int[] iArr = new int[FunctionMode.values().length];
            try {
                iArr[FunctionMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FunctionMode.MODE_CLAP_FIND_PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FunctionMode.MODE_ANTI_PICKPOCKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FunctionMode.MODE_NOT_TOUCH_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18452attabal = iArr;
        }
    }

    /* JADX INFO: compiled from: SoundSettingActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/codejoy/boom/clap/module/setting/SoundSettingActivity$wireman", "Ltranspositive/attabal;", "", "dern", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class wireman extends transpositive.attabal {
        public wireman() {
            super(null, null, null, null, 15, null);
        }

        @Override // transpositive.attabal, artsy.saneness
        public void dern() {
            super.dern();
            SoundSettingActivity.this.libyan();
        }
    }

    public static final Unit attendance(SoundSettingActivity soundSettingActivity) {
        soundSettingActivity.igbo();
        return Unit.f29295attabal;
    }

    public static final boolean basify(SoundSettingActivity soundSettingActivity, MediaPlayer mediaPlayer, int i, int i2) {
        soundSettingActivity.isPlaying = false;
        soundSettingActivity.grimness().f37720graveside.setSelected(false);
        soundSettingActivity.grimness().f37708apical.setSelected(false);
        return false;
    }

    public static final Unit cig(SoundSettingActivity soundSettingActivity, SoundData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        soundSettingActivity.herdbook(it);
        soundSettingActivity.sakeen();
        soundSettingActivity.achondroplasia().cutely(it);
        soundSettingActivity.pruinose();
        return Unit.f29295attabal;
    }

    public static final void claque(SoundSettingActivity soundSettingActivity, View view) {
        soundSettingActivity.getOnBackPressedDispatcher().formularize();
    }

    private final void cosy() {
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
            this.job = kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(this), null, null, new SoundSettingActivity$refreshNativeAd$2$1(this, null), 3, null);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
        }
    }

    public static final SoundData demilitarize(SoundSettingActivity soundSettingActivity) {
        return (SoundData) picketboat.dern.attabal(soundSettingActivity.getIntent(), "sel_sound", SoundData.class);
    }

    public static final Unit dhss(SoundSettingActivity soundSettingActivity, int i, SoundData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        soundSettingActivity.grimness().f37717dovishness.scrollToPosition(i);
        soundSettingActivity.herdbook(data);
        soundSettingActivity.sakeen();
        return Unit.f29295attabal;
    }

    public static final void fastrack(SoundSettingActivity soundSettingActivity, int i) {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            RecyclerView.kowloon layoutManager = soundSettingActivity.grimness().f37717dovishness.getLayoutManager();
            Unit unit = null;
            View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i) : null;
            if (viewFindViewByPosition != null) {
                soundSettingActivity.grimness().f37717dovishness.smoothScrollBy(0, (viewFindViewByPosition.getTop() + (viewFindViewByPosition.getHeight() / 2)) - (soundSettingActivity.grimness().f37717dovishness.getHeight() / 2));
                unit = Unit.f29295attabal;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            eia.impromptu.saneness().wireman(thM3354exceptionOrNullimpl);
        }
    }

    public static final void hardpan(SoundSettingActivity soundSettingActivity, View view) {
        tau.saneness sanenessVar = tau.saneness.f38666attabal;
        sanenessVar.starveling(soundSettingActivity.grimness().f37714cuirassed.getIsOn());
        sanenessVar.yemenite(soundSettingActivity.grimness().f37732taiyuan.getIsOn());
        sanenessVar.seminary(soundSettingActivity.julian().getSelDuration());
        sanenessVar.grimness(soundSettingActivity.grimness().f37731stratoscope.getProgress());
        unbalanced.attabal.f39224attabal.dern(FunctionMode.MODE_CLAP_FIND_PHONE, soundSettingActivity.selSound);
        int i = saneness.f18452attabal[soundSettingActivity.palmyra().ordinal()];
        if (i != 1) {
            if (i == 2) {
                sanenessVar.polder(soundSettingActivity.selSound);
                ClapCounterService.Companion companion = ClapCounterService.INSTANCE;
                if (companion.attabal().getValue().booleanValue()) {
                    ClapCounterService.Companion.marial(companion, soundSettingActivity, 0, 2, null);
                }
            } else if (i == 3) {
                sanenessVar.privatdozent(soundSettingActivity.selSound);
                AntiPickPocketService.Companion attabalVar = AntiPickPocketService.INSTANCE;
                if (attabalVar.attabal().getValue().booleanValue()) {
                    attabalVar.saneness(soundSettingActivity);
                }
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                sanenessVar.merc(soundSettingActivity.selSound);
                NotTouchPhoneService.Companion attabalVar2 = NotTouchPhoneService.INSTANCE;
                if (attabalVar2.attabal().getValue().booleanValue()) {
                    attabalVar2.saneness(soundSettingActivity);
                }
            }
        }
        couple.wireman.f24115attabal.saneness().gintrap(soundSettingActivity, "ad_scenes_apply_sound", new transpositive.attabal(null, null, null, null, 15, null));
        ClapCounterService.Companion companion2 = ClapCounterService.INSTANCE;
        Context applicationContext = soundSettingActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion2.beachfront(applicationContext);
        Intent intentPutExtra = new Intent().putExtra("sel_sound", soundSettingActivity.selSound);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        soundSettingActivity.setResult(-1, intentPutExtra);
        soundSettingActivity.finish();
    }

    private final void homozygous() {
        if (this.hasLoadNativeAd) {
            cosy();
        } else {
            this.hasLoadNativeAd = true;
            osteal();
        }
    }

    public static final void immediately(SoundSettingActivity soundSettingActivity, MediaPlayer mediaPlayer) {
        soundSettingActivity.lastAudioFile = "";
        soundSettingActivity.isPlaying = false;
        soundSettingActivity.grimness().f37720graveside.setSelected(false);
        soundSettingActivity.grimness().f37708apical.setSelected(false);
    }

    public static final MediaPlayer lampshade() {
        return new MediaPlayer();
    }

    public static final Unit licking(SoundSettingActivity soundSettingActivity, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        soundSettingActivity.grimness().f37728preprohormone.setStyles(new orometer.saneness.attabal().attabal());
        soundSettingActivity.grimness().f37728preprohormone.destroyNativeAdIfNeed();
        soundSettingActivity.grimness().f37728preprohormone.setNativeAd(it);
        soundSettingActivity.cosy();
        return Unit.f29295attabal;
    }

    public static final hoiden.saneness linendraper() {
        return new hoiden.saneness();
    }

    public static final void mastfed(SoundSettingActivity soundSettingActivity, View view) {
        Intrinsics.beachfront(view);
        if (vintage.taiyuan.taiyuan(view)) {
            return;
        }
        soundSettingActivity.sakeen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void osteal() {
        couple.beachfront.f24107attabal.marial().sealless(this, "ad_scenes_sound_set_page", this, grimness().f37728preprohormone, new Function1() { // from class: com.codejoy.boom.clap.module.setting.restrictive
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SoundSettingActivity.licking(this.f18480kowloon, (NativeAd) obj);
            }
        });
        cosy();
    }

    public static final Unit outmarry(SoundSettingActivity soundSettingActivity, SoundData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VipActivity.INSTANCE.attabal(soundSettingActivity, VipEntranceSource.UNLOCK_VIP_SOUND);
        return Unit.f29295attabal;
    }

    private final FunctionMode palmyra() {
        return (FunctionMode) this.functionMode.getValue();
    }

    public static final FunctionMode picketboat(SoundSettingActivity soundSettingActivity) {
        FunctionMode functionMode = (FunctionMode) picketboat.dern.saneness(soundSettingActivity.getIntent(), "key_function_mode", FunctionMode.class);
        return functionMode == null ? FunctionMode.MODE_CLAP_FIND_PHONE : functionMode;
    }

    public static final void setterwort(SoundSettingActivity soundSettingActivity, View view) {
        soundSettingActivity.tarboosh();
    }

    public static final hoiden.wireman sultanate() {
        return new hoiden.wireman();
    }

    public static final Unit technofreak(SoundSettingActivity soundSettingActivity, androidx.p000activity.sealless addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        couple.wireman.f24115attabal.saneness().gintrap(soundSettingActivity, "ad_scenes_exit_sound_set", new transpositive.attabal(null, null, null, null, 15, null));
        ClapCounterService.Companion companion = ClapCounterService.INSTANCE;
        Context applicationContext = soundSettingActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.beachfront(applicationContext);
        soundSettingActivity.finish();
        return Unit.f29295attabal;
    }

    public static final void tectonization(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }

    private final void unconsolidated() {
        LinearLayout backButton = grimness().f37730saneness;
        Intrinsics.checkNotNullExpressionValue(backButton, "backButton");
        vintage.taiyuan.competently(backButton);
        grimness().f37730saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.rotuma
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundSettingActivity.claque(this.f18481kowloon, view);
            }
        });
        ParkinsansFontText saveButton = grimness().f37719gintrap;
        Intrinsics.checkNotNullExpressionValue(saveButton, "saveButton");
        vintage.taiyuan.competently(saveButton);
        grimness().f37719gintrap.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.preprohormone
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundSettingActivity.hardpan(this.f18479kowloon, view);
            }
        });
    }

    public static final void vesuvio(SoundSettingActivity soundSettingActivity, View view) {
        soundSettingActivity.startActivity(new Intent(view.getContext(), (Class<?>) SettingActivity.class));
    }

    private final void wostteth() {
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

    public final hoiden.saneness achondroplasia() {
        return (hoiden.saneness) this.soundListAdapter.getValue();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: deadwork, reason: merged with bridge method [inline-methods] */
    public sonnetize.apical starveling() {
        sonnetize.apical apicalVarDern = sonnetize.apical.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(apicalVarDern, "inflate(...)");
        return apicalVarDern;
    }

    public final void gusty() {
        if (grimness().f37731stratoscope.getWidth() <= 0 || grimness().f37731stratoscope.getHeight() <= 0) {
            grimness().f37731stratoscope.getViewTreeObserver().addOnGlobalLayoutListener(new dern());
        } else {
            prefect();
        }
    }

    public final void herdbook(SoundData selSound) {
        Unit unit;
        this.selSound = selSound;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (selSound != null) {
                grimness().f37718formularize.setImageResource(selSound.getIcon());
                grimness().f37713cord.setText(getString(selSound.getNameResId()));
                unit = Unit.f29295attabal;
            } else {
                unit = null;
            }
            Result.m3351constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public final void igbo() {
        AppCompatImageView ivVolumeArrow = grimness().f37721impassible;
        Intrinsics.checkNotNullExpressionValue(ivVolumeArrow, "ivVolumeArrow");
        if (ivVolumeArrow.getVisibility() == 0) {
            AppCompatImageView ivVolumeArrow2 = grimness().f37721impassible;
            Intrinsics.checkNotNullExpressionValue(ivVolumeArrow2, "ivVolumeArrow");
            ivVolumeArrow2.setVisibility(8);
            ObjectAnimator objectAnimator = this.animator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.animator = null;
        }
    }

    public final hoiden.wireman julian() {
        return (hoiden.wireman) this.soundDurationAdapter.getValue();
    }

    public final void libyan() {
        sakeen();
    }

    public final MediaPlayer lightstruck() {
        return (MediaPlayer) this.mediaPlayer.getValue();
    }

    public final void microchemistry() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator<SoundData> it = unbalanced.attabal.f39224attabal.saneness().iterator();
            final int i = 0;
            while (it.hasNext()) {
                String audioFile = it.next().getAudioFile();
                SoundData soundData = this.selSound;
                if (Intrinsics.wireman(audioFile, soundData != null ? soundData.getAudioFile() : null)) {
                    grimness().f37717dovishness.scrollToPosition(i);
                    Result.m3351constructorimpl(Boolean.valueOf(grimness().f37717dovishness.post(new Runnable() { // from class: com.codejoy.boom.clap.module.setting.cord
                        @Override // java.lang.Runnable
                        public final void run() {
                            SoundSettingActivity.fastrack(this.f18460kowloon, i);
                        }
                    })));
                }
                i++;
            }
            i = -1;
            grimness().f37717dovishness.scrollToPosition(i);
            Result.m3351constructorimpl(Boolean.valueOf(grimness().f37717dovishness.post(new Runnable() { // from class: com.codejoy.boom.clap.module.setting.cord
                @Override // java.lang.Runnable
                public final void run() {
                    SoundSettingActivity.fastrack(this.f18460kowloon, i);
                }
            })));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public final void molet() {
        try {
            Result.Companion companion = Result.INSTANCE;
            lightstruck().pause();
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        grimness().f37720graveside.setSelected(false);
        grimness().f37708apical.setSelected(false);
        this.isPlaying = false;
    }

    public final SoundData monroe() {
        return (SoundData) this.soundData.getValue();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        wostteth();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        wostteth();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        homozygous();
    }

    public final void prefect() {
        int iMin = Math.min(grimness().f37731stratoscope.getProgressWidth() + com.blankj.utilcode.util.molybdenite.attabal(10.0f), (grimness().f37731stratoscope.getWidth() - grimness().f37721impassible.getWidth()) - com.blankj.utilcode.util.molybdenite.attabal(5.0f));
        ViewGroup.LayoutParams layoutParams = grimness().f37721impassible.getLayoutParams();
        Intrinsics.competently(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = iMin;
        grimness().f37721impassible.setLayoutParams(layoutParams2);
    }

    public final void preterite() {
        if (this.animator != null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(grimness().f37721impassible, "translationX", -10.0f, 10.0f, -8.0f, 8.0f, -5.0f, 5.0f, -3.0f, 3.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
        this.animator = objectAnimatorOfFloat;
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        androidx.p000activity.supplicat.saneness(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.codejoy.boom.clap.module.setting.merc
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SoundSettingActivity.technofreak(this.f18474kowloon, (androidx.p000activity.sealless) obj);
            }
        }, 2, null);
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.apical(root);
        int i = saneness.f18452attabal[palmyra().ordinal()];
        if (i != 1) {
            if (i == 2) {
                ClapCounterService.Companion companion = ClapCounterService.INSTANCE;
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                companion.dern(applicationContext);
            } else if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        SoundData soundDataMonroe = monroe();
        this.selSound = soundDataMonroe;
        herdbook(soundDataMonroe);
        if (VersionHelper.f18244attabal.wireman()) {
            libyan();
        } else {
            couple.wireman wiremanVar = couple.wireman.f24115attabal;
            boolean z = wiremanVar.saneness().apical() && wiremanVar.saneness().supplicat();
            wiremanVar.saneness().gintrap(this, "ad_scenes_enter_sound_set", new wireman());
            if (!z) {
                libyan();
            }
            wiremanVar.saneness().triweekly("ad_scenes_enter_sound_set", null);
        }
        unconsolidated();
        achondroplasia().impromptu(new Function1() { // from class: com.codejoy.boom.clap.module.setting.polder
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SoundSettingActivity.outmarry(this.f18477kowloon, (SoundData) obj);
            }
        });
        achondroplasia().competently(new Function2() { // from class: com.codejoy.boom.clap.module.setting.seminary
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SoundSettingActivity.dhss(this.f18483kowloon, ((Integer) obj).intValue(), (SoundData) obj2);
            }
        });
        grimness().f37717dovishness.setItemAnimator(null);
        grimness().f37717dovishness.addItemDecoration(new marial());
        grimness().f37717dovishness.setAdapter(achondroplasia());
        pruinose();
        grimness().f37707adultoid.addItemDecoration(new leh.marial(4, 0, (int) ((8 * Resources.getSystem().getDisplayMetrics().density) + 0.5f), false, null, 24, null));
        hoiden.wireman wiremanVarJulian = julian();
        tau.saneness sanenessVar = tau.saneness.f38666attabal;
        wiremanVarJulian.impromptu(sanenessVar.triweekly());
        grimness().f37707adultoid.setAdapter(julian());
        grimness().f37714cuirassed.setChecked(sanenessVar.cuirassed());
        grimness().f37732taiyuan.setChecked(sanenessVar.cord());
        LinearLayout moreSettingButton = grimness().f37727polloi;
        Intrinsics.checkNotNullExpressionValue(moreSettingButton, "moreSettingButton");
        vintage.taiyuan.competently(moreSettingButton);
        grimness().f37727polloi.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.grimness
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundSettingActivity.vesuvio(this.f18468kowloon, view);
            }
        });
        FrameLayout flMore = grimness().f37712competently;
        Intrinsics.checkNotNullExpressionValue(flMore, "flMore");
        vintage.taiyuan.competently(flMore);
        grimness().f37712competently.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.adultoid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundSettingActivity.setterwort(this.f18454kowloon, view);
            }
        });
        LinearLayout playButton = grimness().f37720graveside;
        Intrinsics.checkNotNullExpressionValue(playButton, "playButton");
        vintage.taiyuan.competently(playButton);
        grimness().f37720graveside.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.setting.dovishness
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundSettingActivity.mastfed(this.f18465kowloon, view);
            }
        });
        grimness().f37731stratoscope.setStartTouchListener(new Function0() { // from class: com.codejoy.boom.clap.module.setting.gintrap
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SoundSettingActivity.attendance(this.f18467kowloon);
            }
        });
        preterite();
    }

    public final void pruinose() {
        if (grimness().f37717dovishness.getWidth() <= 0 || grimness().f37717dovishness.getHeight() <= 0) {
            grimness().f37717dovishness.getViewTreeObserver().addOnGlobalLayoutListener(new beachfront());
        } else {
            microchemistry();
        }
    }

    public final void sakeen() {
        Object objM3351constructorimpl;
        Object objM3351constructorimpl2;
        SoundData soundData = this.selSound;
        if (soundData == null) {
            return;
        }
        if (Intrinsics.wireman(this.lastAudioFile, soundData.getAudioFile())) {
            if (this.isPlaying) {
                molet();
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                lightstruck().start();
                grimness().f37720graveside.setSelected(true);
                grimness().f37708apical.setSelected(true);
                this.isPlaying = true;
                objM3351constructorimpl2 = Result.m3351constructorimpl(Unit.f29295attabal);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl2 = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            Result.m3350boximpl(objM3351constructorimpl2);
            return;
        }
        if (this.isPlaying) {
            molet();
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            lightstruck().reset();
            AssetFileDescriptor assetFileDescriptorOpenFd = getAssets().openFd("audio/" + soundData.getAudioFile());
            Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
            lightstruck().setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
            lightstruck().prepareAsync();
            lightstruck().setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.codejoy.boom.clap.module.setting.stratoscope
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    SoundSettingActivity.immediately(this.f18484kowloon, mediaPlayer);
                }
            });
            lightstruck().setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.codejoy.boom.clap.module.setting.trm
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    return SoundSettingActivity.basify(this.f18488kowloon, mediaPlayer, i, i2);
                }
            });
            lightstruck().setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.codejoy.boom.clap.module.setting.oilcan
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    SoundSettingActivity.tectonization(mediaPlayer);
                }
            });
            grimness().f37720graveside.setSelected(true);
            grimness().f37708apical.setSelected(true);
            this.isPlaying = true;
            this.lastAudioFile = soundData.getAudioFile();
            objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
        }
        Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        grimness().f37731stratoscope.beachfront(tau.saneness.f38666attabal.kowloon());
        gusty();
        achondroplasia().taiyuan(unbalanced.attabal.f39224attabal.saneness(), this.selSound);
    }

    public final void tarboosh() {
        PickSoundDialog pickSoundDialog = new PickSoundDialog();
        pickSoundDialog.monoploid(new Function1() { // from class: com.codejoy.boom.clap.module.setting.cuirassed
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SoundSettingActivity.cig(this.f18461kowloon, (SoundData) obj);
            }
        });
        FragmentManager fragmentManagerPolloi = polloi();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerPolloi, "getSupportFragmentManager(...)");
        vintage.saneness.attabal(pickSoundDialog, fragmentManagerPolloi);
    }
}
