package com.codejoy.boom.clap.module.guide;

import android.content.Intent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p000activity.sealless;
import androidx.p000activity.supplicat;
import androidx.p001lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.codejoy.boom.clap.MainActivity;
import com.codejoy.boom.clap.arytenoidectomy;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.guide.GuideActivity;
import com.codejoy.boom.clap.module.guide.fragment.Guide1Fragment;
import com.codejoy.boom.clap.module.guide.fragment.Guide2Fragment;
import com.codejoy.boom.clap.module.guide.fragment.Guide3Fragment;
import com.ironsource.X3;
import couple.wireman;
import isoparametric.dern;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import sonnetize.marial;

/* JADX INFO: compiled from: GuideActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/codejoy/boom/clap/module/guide/GuideActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/marial;", "<init>", "()V", "", X3.i.L, "", "timberyard", "(I)V", "premeiotic", "()Lsonnetize/marial;", "privatdozent", "saran", "cultivated", "", "Landroidx/fragment/app/Fragment;", "cord", "Lpatroclinal/taiyuan;", "clubfoot", "()Ljava/util/List;", "fragmentList", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GuideActivity extends BaseActivity<marial> {

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final taiyuan fragmentList = p002kotlin.saneness.saneness(new Function0() { // from class: industrialist.attabal
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GuideActivity.overspeculate();
        }
    });

    /* JADX INFO: compiled from: GuideActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/codejoy/boom/clap/module/guide/GuideActivity$saneness", "Landroidx/viewpager2/widget/ViewPager2$taiyuan;", "", X3.i.L, "", "dern", "(I)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness extends ViewPager2.taiyuan {
        public saneness() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.taiyuan
        public void dern(int position) {
            super.dern(position);
            GuideActivity.this.timberyard(position);
            if (position == 0) {
                GuideActivity.this.grimness().f37878beachfront.setText(GuideActivity.this.getString(arytenoidectomy.guide_title1));
            } else if (position == 1) {
                GuideActivity.this.grimness().f37878beachfront.setText(GuideActivity.this.getString(arytenoidectomy.guide_title2));
            } else {
                if (position != 2) {
                    return;
                }
                GuideActivity.this.grimness().f37878beachfront.setText(GuideActivity.this.getString(arytenoidectomy.guide_title3));
            }
        }
    }

    private final List<Fragment> clubfoot() {
        return (List) this.fragmentList.getValue();
    }

    public static final Unit dent(GuideActivity guideActivity, sealless addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        guideActivity.cultivated();
        guideActivity.finish();
        return Unit.f29295attabal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList overspeculate() {
        return adultoid.competently(new Guide1Fragment(), new Guide2Fragment(), new Guide3Fragment());
    }

    public static final void permissivist(GuideActivity guideActivity, View view) {
        if (guideActivity.grimness().f37879competently.getCurrentItem() >= 2) {
            guideActivity.getOnBackPressedDispatcher().formularize();
        } else {
            ViewPager2 viewPager2 = guideActivity.grimness().f37879competently;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void timberyard(int position) {
        int childCount = grimness().f37880dern.getChildCount();
        int i = 0;
        while (i < childCount) {
            grimness().f37880dern.getChildAt(i).setSelected(i == position);
            i++;
        }
    }

    public final void cultivated() {
        startActivity(new Intent(getApplicationContext(), (Class<?>) MainActivity.class));
        if (dern.f29008attabal.attabal()) {
            wireman.f24115attabal.saneness().dovishness(this, "ad_scenes_close_guide_page");
        }
        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "1d_home_page_show", null, null, null, null, 30, null);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: premeiotic, reason: merged with bridge method [inline-methods] */
    public marial starveling() {
        marial marialVarDern = marial.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(marialVarDern, "inflate(...)");
        return marialVarDern;
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        supplicat.saneness(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: industrialist.saneness
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GuideActivity.dent(this.f28844kowloon, (sealless) obj);
            }
        }, 2, null);
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.apical(root);
        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "1c_guide_page_show", null, null, null, null, 30, null);
        grimness().f37879competently.competently(new saneness());
        grimness().f37879competently.setUserInputEnabled(false);
        grimness().f37879competently.setOffscreenPageLimit(3);
        grimness().f37879competently.setAdapter(new attabal(this, clubfoot()));
        grimness().f37883wireman.setOnClickListener(new View.OnClickListener() { // from class: industrialist.dern
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity.permissivist(this.f28842kowloon, view);
            }
        });
    }

    /* JADX INFO: compiled from: GuideActivity.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/codejoy/boom/clap/module/guide/GuideActivity$attabal;", "Lcrosspiece/attabal;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", "Landroidx/fragment/app/Fragment;", "fragments", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Ljava/util/List;)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V", "", "getItemCount", "()I", X3.i.L, "marial", "(I)Landroidx/fragment/app/Fragment;", "cutely", "Ljava/util/List;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends crosspiece.attabal {

        /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
        public final List<Fragment> fragments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public attabal(FragmentManager fragmentManager, Lifecycle lifecycle, List<? extends Fragment> fragments) {
            super(fragmentManager, lifecycle);
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(fragments, "fragments");
            this.fragments = fragments;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 3;
        }

        @Override // crosspiece.attabal
        public Fragment marial(int position) {
            return this.fragments.get(position);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public attabal(FragmentActivity activity, List<? extends Fragment> fragments) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(fragments, "fragments");
            FragmentManager fragmentManagerPolloi = activity.polloi();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerPolloi, "getSupportFragmentManager(...)");
            this(fragmentManagerPolloi, activity.getLifecycle(), fragments);
        }
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
    }
}
