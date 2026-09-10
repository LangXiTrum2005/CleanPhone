package com.codejoy.boom.clap.module.faq.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import claque.dern;
import com.codejoy.boom.clap.arytenoidectomy;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.formularize;
import com.codejoy.boom.clap.module.faq.fragment.FaqFragment;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.yoadx.ad.lib.admob.format.natived.attabal;
import couple.beachfront;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import sonnetize.preprohormone;

/* JADX INFO: compiled from: FaqFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/codejoy/boom/clap/module/faq/fragment/FaqFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "taiyuan", "impromptu", "apical", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", X3.i.u0, "Lcom/codejoy/boom/clap/data/FunctionMode;", "kowloon", "Lpatroclinal/taiyuan;", "competently", "()Lcom/codejoy/boom/clap/data/FunctionMode;", "functionMode", "Lsonnetize/preprohormone;", "arytenoidectomy", "Lsonnetize/preprohormone;", "binding", "", "monoploid", "Z", "hasLoadNativeAd", "polloi", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaqFragment extends Fragment {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public preprohormone binding;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final taiyuan functionMode = p002kotlin.saneness.saneness(new Function0() { // from class: portwide.saneness
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaqFragment.beachfront(this.f35615kowloon);
        }
    });

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean hasLoadNativeAd;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final int f18336molybdenite = 8;

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.faq.fragment.FaqFragment$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FaqFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/codejoy/boom/clap/module/faq/fragment/FaqFragment$attabal;", "", "<init>", "()V", "Lcom/codejoy/boom/clap/data/FunctionMode;", "functionMode", "Lcom/codejoy/boom/clap/module/faq/fragment/FaqFragment;", "attabal", "(Lcom/codejoy/boom/clap/data/FunctionMode;)Lcom/codejoy/boom/clap/module/faq/fragment/FaqFragment;", "", "KEY_FUNCTION_MODE", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FaqFragment attabal(FunctionMode functionMode) {
            Intrinsics.checkNotNullParameter(functionMode, "functionMode");
            FaqFragment faqFragment = new FaqFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_function_mode", functionMode);
            faqFragment.setArguments(bundle);
            return faqFragment;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: FaqFragment.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f18341attabal;

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
            f18341attabal = iArr;
        }
    }

    private final void apical() {
        if (this.hasLoadNativeAd) {
            return;
        }
        this.hasLoadNativeAd = true;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            final orometer.saneness sanenessVarAttabal = new orometer.saneness.attabal().attabal();
            attabal attabalVarMarial = beachfront.f24107attabal.marial();
            preprohormone preprohormoneVar = this.binding;
            if (preprohormoneVar == null) {
                Intrinsics.preprohormone("binding");
                preprohormoneVar = null;
            }
            attabalVarMarial.sealless(activity, "ad_scenes_help_page", this, preprohormoneVar.f37936impassible, new Function1() { // from class: portwide.dern
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FaqFragment.formularize(this.f35614kowloon, sanenessVarAttabal, (NativeAd) obj);
                }
            });
        }
    }

    public static final FunctionMode beachfront(FaqFragment faqFragment) {
        FunctionMode functionMode;
        Bundle arguments = faqFragment.getArguments();
        return (arguments == null || (functionMode = (FunctionMode) dern.saneness(arguments, "key_function_mode", FunctionMode.class)) == null) ? FunctionMode.MODE_CLAP_FIND_PHONE : functionMode;
    }

    private final FunctionMode competently() {
        return (FunctionMode) this.functionMode.getValue();
    }

    public static final void cutely(FaqFragment faqFragment, NestedScrollView p0, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        preprohormone preprohormoneVar = faqFragment.binding;
        preprohormone preprohormoneVar2 = null;
        if (preprohormoneVar == null) {
            Intrinsics.preprohormone("binding");
            preprohormoneVar = null;
        }
        View shadowView = preprohormoneVar.f37935formularize;
        Intrinsics.checkNotNullExpressionValue(shadowView, "shadowView");
        preprohormone preprohormoneVar3 = faqFragment.binding;
        if (preprohormoneVar3 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            preprohormoneVar2 = preprohormoneVar3;
        }
        shadowView.setVisibility(preprohormoneVar2.f37928apical.canScrollVertically(1) ? 0 : 8);
    }

    public static final Unit formularize(FaqFragment faqFragment, orometer.saneness sanenessVar, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        preprohormone preprohormoneVar = faqFragment.binding;
        preprohormone preprohormoneVar2 = null;
        if (preprohormoneVar == null) {
            Intrinsics.preprohormone("binding");
            preprohormoneVar = null;
        }
        preprohormoneVar.f37936impassible.setStyles(sanenessVar);
        preprohormone preprohormoneVar3 = faqFragment.binding;
        if (preprohormoneVar3 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            preprohormoneVar2 = preprohormoneVar3;
        }
        preprohormoneVar2.f37936impassible.setNativeAd(it);
        return Unit.f29295attabal;
    }

    private final void impromptu() {
        int i = saneness.f18341attabal[competently().ordinal()];
        if (i != 1) {
            preprohormone preprohormoneVar = null;
            if (i == 2) {
                preprohormone preprohormoneVar2 = this.binding;
                if (preprohormoneVar2 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar2 = null;
                }
                preprohormoneVar2.f37931beachfront.setImageResource(formularize.alert_img_clap_1);
                preprohormone preprohormoneVar3 = this.binding;
                if (preprohormoneVar3 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar3 = null;
                }
                preprohormoneVar3.f37932competently.setImageResource(formularize.alert_img_clap_2);
                preprohormone preprohormoneVar4 = this.binding;
                if (preprohormoneVar4 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar4 = null;
                }
                preprohormoneVar4.f37937impromptu.setImageResource(formularize.alert_img_clap_3);
                preprohormone preprohormoneVar5 = this.binding;
                if (preprohormoneVar5 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar5 = null;
                }
                preprohormoneVar5.f37942taiyuan.setImageResource(formularize.alert_img_clap_4);
                preprohormone preprohormoneVar6 = this.binding;
                if (preprohormoneVar6 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar6 = null;
                }
                preprohormoneVar6.f37943triweekly.setText(getString(arytenoidectomy.faq_tip1));
                preprohormone preprohormoneVar7 = this.binding;
                if (preprohormoneVar7 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar7 = null;
                }
                preprohormoneVar7.f37938kowloon.setText(getString(arytenoidectomy.faq_tip2));
                preprohormone preprohormoneVar8 = this.binding;
                if (preprohormoneVar8 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar8 = null;
                }
                preprohormoneVar8.f37929arytenoidectomy.setText(getString(arytenoidectomy.faq_tip3));
                preprohormone preprohormoneVar9 = this.binding;
                if (preprohormoneVar9 == null) {
                    Intrinsics.preprohormone("binding");
                } else {
                    preprohormoneVar = preprohormoneVar9;
                }
                preprohormoneVar.f37940monoploid.setText(getString(arytenoidectomy.faq_tip4));
                return;
            }
            if (i == 3) {
                preprohormone preprohormoneVar10 = this.binding;
                if (preprohormoneVar10 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar10 = null;
                }
                preprohormoneVar10.f37931beachfront.setImageResource(formularize.alert_img_pocket_1);
                preprohormone preprohormoneVar11 = this.binding;
                if (preprohormoneVar11 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar11 = null;
                }
                preprohormoneVar11.f37932competently.setImageResource(formularize.alert_img_pocket_2);
                preprohormone preprohormoneVar12 = this.binding;
                if (preprohormoneVar12 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar12 = null;
                }
                preprohormoneVar12.f37937impromptu.setImageResource(formularize.alert_img_pocket_3);
                preprohormone preprohormoneVar13 = this.binding;
                if (preprohormoneVar13 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar13 = null;
                }
                preprohormoneVar13.f37942taiyuan.setImageResource(formularize.alert_img_clap_4);
                preprohormone preprohormoneVar14 = this.binding;
                if (preprohormoneVar14 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar14 = null;
                }
                preprohormoneVar14.f37943triweekly.setText(getString(arytenoidectomy.pocket_faq1_title));
                preprohormone preprohormoneVar15 = this.binding;
                if (preprohormoneVar15 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar15 = null;
                }
                preprohormoneVar15.f37938kowloon.setText(getString(arytenoidectomy.pocket_faq2_title));
                preprohormone preprohormoneVar16 = this.binding;
                if (preprohormoneVar16 == null) {
                    Intrinsics.preprohormone("binding");
                    preprohormoneVar16 = null;
                }
                preprohormoneVar16.f37929arytenoidectomy.setText(getString(arytenoidectomy.pocket_faq3_title));
                preprohormone preprohormoneVar17 = this.binding;
                if (preprohormoneVar17 == null) {
                    Intrinsics.preprohormone("binding");
                } else {
                    preprohormoneVar = preprohormoneVar17;
                }
                preprohormoneVar.f37940monoploid.setText(getString(arytenoidectomy.pocket_faq4_title));
                return;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            preprohormone preprohormoneVar18 = this.binding;
            if (preprohormoneVar18 == null) {
                Intrinsics.preprohormone("binding");
                preprohormoneVar18 = null;
            }
            preprohormoneVar18.f37931beachfront.setImageResource(formularize.alert_img_touch_1);
            preprohormone preprohormoneVar19 = this.binding;
            if (preprohormoneVar19 == null) {
                Intrinsics.preprohormone("binding");
                preprohormoneVar19 = null;
            }
            preprohormoneVar19.f37932competently.setImageResource(formularize.alert_img_touch_2);
            preprohormone preprohormoneVar20 = this.binding;
            if (preprohormoneVar20 == null) {
                Intrinsics.preprohormone("binding");
                preprohormoneVar20 = null;
            }
            preprohormoneVar20.f37937impromptu.setImageResource(formularize.alert_img_touch_3);
            preprohormone preprohormoneVar21 = this.binding;
            if (preprohormoneVar21 == null) {
                Intrinsics.preprohormone("binding");
                preprohormoneVar21 = null;
            }
            preprohormoneVar21.f37942taiyuan.setImageResource(formularize.alert_img_clap_4);
            preprohormone preprohormoneVar22 = this.binding;
            if (preprohormoneVar22 == null) {
                Intrinsics.preprohormone("binding");
                preprohormoneVar22 = null;
            }
            preprohormoneVar22.f37943triweekly.setText(getString(arytenoidectomy.touch_faq1_title));
            preprohormone preprohormoneVar23 = this.binding;
            if (preprohormoneVar23 == null) {
                Intrinsics.preprohormone("binding");
                preprohormoneVar23 = null;
            }
            preprohormoneVar23.f37938kowloon.setText(getString(arytenoidectomy.touch_faq2_title));
            preprohormone preprohormoneVar24 = this.binding;
            if (preprohormoneVar24 == null) {
                Intrinsics.preprohormone("binding");
                preprohormoneVar24 = null;
            }
            preprohormoneVar24.f37929arytenoidectomy.setText(getString(arytenoidectomy.touch_faq3_title));
            preprohormone preprohormoneVar25 = this.binding;
            if (preprohormoneVar25 == null) {
                Intrinsics.preprohormone("binding");
            } else {
                preprohormoneVar = preprohormoneVar25;
            }
            preprohormoneVar.f37940monoploid.setText(getString(arytenoidectomy.touch_faq4_title));
        }
    }

    private final void taiyuan() {
        preprohormone preprohormoneVar = this.binding;
        if (preprohormoneVar == null) {
            Intrinsics.preprohormone("binding");
            preprohormoneVar = null;
        }
        preprohormoneVar.f37928apical.setOnScrollChangeListener(new NestedScrollView.marial() { // from class: portwide.attabal
            @Override // androidx.core.widget.NestedScrollView.marial
            public final void attabal(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                FaqFragment.cutely(this.f35612attabal, nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        preprohormone preprohormoneVarDern = preprohormone.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(preprohormoneVarDern, "inflate(...)");
        this.binding = preprohormoneVarDern;
        if (preprohormoneVarDern == null) {
            Intrinsics.preprohormone("binding");
            preprohormoneVarDern = null;
        }
        return preprohormoneVarDern.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        apical();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        taiyuan();
        impromptu();
    }
}
