package com.codejoy.boom.clap.module.faq;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.faq.FaqActivity;
import com.codejoy.boom.clap.module.faq.fragment.FaqFragment;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.ironsource.X3;
import couple.wireman;
import hoiden.competently;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import transpositive.attabal;

/* JADX INFO: compiled from: FaqActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007*\u0001\u001b\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/codejoy/boom/clap/module/faq/FaqActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/dern;", "<init>", "()V", "lerp", "()Lsonnetize/dern;", "", "privatdozent", "saran", "onDestroy", "", "pos", "nosophobia", "(I)V", "Lcom/codejoy/boom/clap/data/FunctionMode;", "cord", "Lpatroclinal/taiyuan;", "timberyard", "()Lcom/codejoy/boom/clap/data/FunctionMode;", "functionMode", "", "Landroidx/fragment/app/Fragment;", "cuirassed", "premeiotic", "()Ljava/util/List;", "fragmentList", "com/codejoy/boom/clap/module/faq/FaqActivity$dern", "stratoscope", "Lcom/codejoy/boom/clap/module/faq/FaqActivity$dern;", "onPageChangeListener", "trm", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaqActivity extends BaseActivity<sonnetize.dern> {

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final taiyuan functionMode = p002kotlin.saneness.saneness(new Function0() { // from class: midian.attabal
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaqActivity.cultivated(this.f33415kowloon);
        }
    });

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final taiyuan fragmentList = p002kotlin.saneness.saneness(new Function0() { // from class: midian.saneness
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaqActivity.permissivist();
        }
    });

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final dern onPageChangeListener = new dern();

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static final int f18329oilcan = 8;

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.faq.FaqActivity$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FaqActivity.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/codejoy/boom/clap/module/faq/FaqActivity$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/codejoy/boom/clap/data/FunctionMode;", "functionMode", "", "attabal", "(Landroid/content/Context;Lcom/codejoy/boom/clap/data/FunctionMode;)V", "", "KEY_FUNCTION_MODE", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void attabal(Context context, FunctionMode functionMode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) FaqActivity.class);
            if (functionMode != null) {
                intent.putExtra("key_function_mode", functionMode);
            }
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: FaqActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/codejoy/boom/clap/module/faq/FaqActivity$dern", "Landroidx/viewpager2/widget/ViewPager2$taiyuan;", "", X3.i.L, "", "dern", "(I)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class dern extends ViewPager2.taiyuan {
        public dern() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.taiyuan
        public void dern(int position) {
            super.dern(position);
            FaqActivity.this.nosophobia(position);
        }
    }

    /* JADX INFO: compiled from: FaqActivity.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f18335attabal;

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
                iArr[FunctionMode.MODE_NOT_TOUCH_PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FunctionMode.MODE_ANTI_PICKPOCKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18335attabal = iArr;
        }
    }

    public static final void coffeecake(FaqActivity faqActivity, View view) {
        faqActivity.grimness().f37800impromptu.setCurrentItem(2);
    }

    public static final FunctionMode cultivated(FaqActivity faqActivity) {
        FunctionMode functionMode = (FunctionMode) picketboat.dern.saneness(faqActivity.getIntent(), "key_function_mode", FunctionMode.class);
        return functionMode == null ? FunctionMode.MODE_CLAP_FIND_PHONE : functionMode;
    }

    public static final void itchy(FaqActivity faqActivity, View view) {
        faqActivity.grimness().f37800impromptu.setCurrentItem(1);
    }

    public static final void milliradian(FaqActivity faqActivity, View view) {
        faqActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList permissivist() {
        FaqFragment.Companion attabalVar = FaqFragment.INSTANCE;
        return adultoid.competently(attabalVar.attabal(FunctionMode.MODE_CLAP_FIND_PHONE), attabalVar.attabal(FunctionMode.MODE_NOT_TOUCH_PHONE), attabalVar.attabal(FunctionMode.MODE_ANTI_PICKPOCKET));
    }

    private final List<Fragment> premeiotic() {
        return (List) this.fragmentList.getValue();
    }

    private final FunctionMode timberyard() {
        return (FunctionMode) this.functionMode.getValue();
    }

    public static final void treadless(FaqActivity faqActivity, View view) {
        faqActivity.grimness().f37800impromptu.setCurrentItem(0);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: lerp, reason: merged with bridge method [inline-methods] */
    public sonnetize.dern starveling() {
        sonnetize.dern dernVarDern = sonnetize.dern.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(dernVarDern, "inflate(...)");
        return dernVarDern;
    }

    public final void nosophobia(int pos) {
        int childCount = grimness().f37797beachfront.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = grimness().f37797beachfront.getChildAt(i);
            Intrinsics.competently(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) childAt;
            boolean z = pos == i;
            viewGroup.getChildAt(0).setSelected(pos == i);
            View childAt2 = viewGroup.getChildAt(1);
            if (childAt2 instanceof ParkinsansFontText) {
                if (z) {
                    ((ParkinsansFontText) childAt2).setBoldFont();
                } else {
                    ((ParkinsansFontText) childAt2).setMediumFont();
                }
            }
            i++;
        }
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        grimness().f37800impromptu.impassible(this.onPageChangeListener);
        super.onDestroy();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.apical(root);
        grimness().f37802saneness.setOnClickListener(new View.OnClickListener() { // from class: midian.dern
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaqActivity.milliradian(this.f33417kowloon, view);
            }
        });
        grimness().f37800impromptu.competently(this.onPageChangeListener);
        grimness().f37800impromptu.setOffscreenPageLimit(2);
        grimness().f37800impromptu.setAdapter(new competently(this, premeiotic()));
        FrameLayout frameLayout = grimness().f37803wireman;
        Intrinsics.beachfront(frameLayout);
        vintage.taiyuan.marial(frameLayout);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: midian.wireman
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaqActivity.treadless(this.f33419kowloon, view);
            }
        });
        FrameLayout frameLayout2 = grimness().f37798competently;
        Intrinsics.beachfront(frameLayout2);
        vintage.taiyuan.marial(frameLayout2);
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: midian.marial
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaqActivity.itchy(this.f33418kowloon, view);
            }
        });
        FrameLayout frameLayout3 = grimness().f37801marial;
        Intrinsics.beachfront(frameLayout3);
        vintage.taiyuan.marial(frameLayout3);
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: midian.beachfront
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaqActivity.coffeecake(this.f33416kowloon, view);
            }
        });
        int i = saneness.f18335attabal[timberyard().ordinal()];
        if (i != 1) {
            if (i == 2) {
                grimness().f37800impromptu.setCurrentItem(0);
            } else if (i == 3) {
                grimness().f37800impromptu.setCurrentItem(1);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                grimness().f37800impromptu.setCurrentItem(2);
            }
        }
        nosophobia(0);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        if (isoparametric.dern.f29008attabal.attabal()) {
            wireman.f24115attabal.saneness().gintrap(this, "ad_scenes_enter_help_page", new attabal(null, null, null, null, 15, null));
        }
    }
}
