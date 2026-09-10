package hoiden;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p001lifecycle.Lifecycle;
import com.ironsource.X3;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewPagerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lhoiden/competently;", "Lcrosspiece/attabal;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", "Landroidx/fragment/app/Fragment;", "fragments", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Ljava/util/List;)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V", "", "getItemCount", "()I", X3.i.L, "marial", "(I)Landroidx/fragment/app/Fragment;", "cutely", "Ljava/util/List;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class competently extends crosspiece.attabal {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final List<Fragment> fragments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public competently(FragmentManager fragmentManager, Lifecycle lifecycle, List<? extends Fragment> fragments) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        this.fragments = fragments;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.fragments.size();
    }

    @Override // crosspiece.attabal
    public Fragment marial(int position) {
        return this.fragments.get(position);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public competently(FragmentActivity activity, List<? extends Fragment> fragments) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        FragmentManager fragmentManagerPolloi = activity.polloi();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerPolloi, "getSupportFragmentManager(...)");
        this(fragmentManagerPolloi, activity.getLifecycle(), fragments);
    }
}
