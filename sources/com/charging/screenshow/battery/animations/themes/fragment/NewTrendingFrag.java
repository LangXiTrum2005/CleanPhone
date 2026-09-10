package com.charging.screenshow.battery.animations.themes.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct;
import com.charging.screenshow.battery.animations.themes.adapter.ImageGridAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.FragWallpaperBinding;
import com.charging.screenshow.battery.animations.themes.databinding.LaySortBy2Binding;
import com.charging.screenshow.battery.animations.themes.entity.PreviewBean;
import com.charging.screenshow.battery.animations.themes.network.entity.BaseImage;
import com.charging.screenshow.battery.animations.themes.network.entity.Image;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.CustomItemDecoration;
import com.charging.screenshow.battery.animations.themes.view.CustomPopWindow;
import com.charging.screenshow.battery.animations.themes.vm.CategoryDetailVM;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/fragment/NewTrendingFrag;", "Lcom/charging/screenshow/battery/animations/themes/fragment/BaseFrag;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewTrendingFrag extends BaseFrag {
    public FragWallpaperBinding Z;
    public final ViewModelLazy e0;
    public final ArrayList f0;
    public ImageGridAdapter g0;
    public LaySortBy2Binding h0;
    public CustomPopWindow i0;
    public String j0;

    public NewTrendingFrag() {
        final NewTrendingFrag$special$$inlined$viewModels$default$1 newTrendingFrag$special$$inlined$viewModels$default$1 = new NewTrendingFrag$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.Z, new Function0<ViewModelStoreOwner>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.NewTrendingFrag$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) newTrendingFrag$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.e0 = FragmentViewModelLazyKt.a(this, Reflection.f43333a.b(CategoryDetailVM.class), new Function0<ViewModelStore>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.NewTrendingFrag$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getX()).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.NewTrendingFrag$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getX();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f5295b;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.NewTrendingFrag$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getX();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.X.getDefaultViewModelProviderFactory();
                Intrinsics.e(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f0 = new ArrayList();
        this.j0 = "rating";
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final View b() {
        View viewInflate = getLayoutInflater().inflate(R.layout.frag_wallpaper, (ViewGroup) null, false);
        int i2 = R.id.flLoading;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.a(R.id.flLoading, viewInflate);
        if (frameLayout != null) {
            i2 = R.id.llEmpty;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llEmpty, viewInflate);
            if (linearLayout != null) {
                i2 = R.id.pbb;
                if (((ProgressBar) ViewBindings.a(R.id.pbb, viewInflate)) != null) {
                    i2 = R.id.refreshLayout;
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) ViewBindings.a(R.id.refreshLayout, viewInflate);
                    if (smartRefreshLayout != null) {
                        i2 = R.id.rlSortBy;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.a(R.id.rlSortBy, viewInflate);
                        if (relativeLayout != null) {
                            i2 = R.id.rv;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.a(R.id.rv, viewInflate);
                            if (recyclerView != null) {
                                i2 = R.id.tvReload;
                                TextView textView = (TextView) ViewBindings.a(R.id.tvReload, viewInflate);
                                if (textView != null) {
                                    i2 = R.id.tvSortBy;
                                    TextView textView2 = (TextView) ViewBindings.a(R.id.tvSortBy, viewInflate);
                                    if (textView2 != null) {
                                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                        this.Z = new FragWallpaperBinding(frameLayout2, frameLayout, linearLayout, smartRefreshLayout, relativeLayout, recyclerView, textView, textView2);
                                        Intrinsics.e(frameLayout2, "getRoot(...)");
                                        return frameLayout2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final TextView c() {
        return null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final void d() {
        FragWallpaperBinding fragWallpaperBinding = this.Z;
        if (fragWallpaperBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(fragWallpaperBinding.g, new h(this, 0));
        FragWallpaperBinding fragWallpaperBinding2 = this.Z;
        if (fragWallpaperBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(fragWallpaperBinding2.f13197e, new h(this, 1));
        g().f13342e.e(this, new NewTrendingFrag$sam$androidx_lifecycle_Observer$0(new h(this, 2)));
        if (this.f13257Y) {
            return;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = LifecycleOwnerKt.a(this);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(lifecycleCoroutineScopeImplA, DefaultIoScheduler.f45062Y, null, new NewTrendingFrag$initDatas$4(this, null), 2);
        FragWallpaperBinding fragWallpaperBinding3 = this.Z;
        if (fragWallpaperBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.a(fragWallpaperBinding3.f13196c);
        FragWallpaperBinding fragWallpaperBinding4 = this.Z;
        if (fragWallpaperBinding4 != null) {
            ViewExt.b(fragWallpaperBinding4.f13195b);
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final void f() {
        FragWallpaperBinding fragWallpaperBinding = this.Z;
        if (fragWallpaperBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        String upperCase = IntExt.c(R.string.most_popular).toUpperCase(Locale.ROOT);
        Intrinsics.e(upperCase, "toUpperCase(...)");
        fragWallpaperBinding.f13198h.setText("Sort by : ".concat(upperCase));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.e(fragmentActivityRequireActivity, "requireActivity(...)");
        ImageGridAdapter imageGridAdapter = new ImageGridAdapter(fragmentActivityRequireActivity, this.f0);
        this.g0 = imageGridAdapter;
        imageGridAdapter.k = new ImageGridAdapter.OnItemClickListener() { // from class: com.charging.screenshow.battery.animations.themes.fragment.NewTrendingFrag$initViews$1
            @Override // com.charging.screenshow.battery.animations.themes.adapter.ImageGridAdapter.OnItemClickListener
            public final void a(int i2) {
                NewTrendingFrag newTrendingFrag = this.f13264a;
                if (i2 < 0) {
                    newTrendingFrag.getClass();
                    return;
                }
                ArrayList<BaseImage> arrayList = newTrendingFrag.f0;
                if (i2 < arrayList.size() && newTrendingFrag.getActivity() != null) {
                    BaseImage baseImage = (BaseImage) arrayList.get(i2);
                    ArrayList arrayList2 = new ArrayList();
                    for (BaseImage baseImage2 : arrayList) {
                        if (baseImage2 instanceof Image) {
                            arrayList2.add(baseImage2);
                        }
                    }
                    int iIndexOf = 0;
                    if ((baseImage instanceof Image) && arrayList2.indexOf(baseImage) != -1) {
                        iIndexOf = arrayList2.indexOf(baseImage);
                    }
                    PreviewBean previewBean = new PreviewBean();
                    previewBean.e(arrayList2);
                    int i3 = ImagePreviewAct.p0;
                    FragmentActivity fragmentActivityRequireActivity2 = newTrendingFrag.requireActivity();
                    Intrinsics.e(fragmentActivityRequireActivity2, "requireActivity(...)");
                    ImagePreviewAct.Companion.a(fragmentActivityRequireActivity2, iIndexOf, previewBean, true);
                }
            }
        };
        FragWallpaperBinding fragWallpaperBinding2 = this.Z;
        if (fragWallpaperBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        requireActivity();
        fragWallpaperBinding2.f.setLayoutManager(new GridLayoutManager(3));
        FragWallpaperBinding fragWallpaperBinding3 = this.Z;
        if (fragWallpaperBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        fragWallpaperBinding3.f.addItemDecoration(new CustomItemDecoration(1, 2));
        FragWallpaperBinding fragWallpaperBinding4 = this.Z;
        if (fragWallpaperBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ImageGridAdapter imageGridAdapter2 = this.g0;
        Intrinsics.c(imageGridAdapter2);
        fragWallpaperBinding4.f.setAdapter(imageGridAdapter2);
        FragWallpaperBinding fragWallpaperBinding5 = this.Z;
        if (fragWallpaperBinding5 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        g gVar = new g(this);
        SmartRefreshLayout smartRefreshLayout = fragWallpaperBinding5.d;
        smartRefreshLayout.c1 = gVar;
        smartRefreshLayout.setOnLoadMoreListener(new g(this));
    }

    public final CategoryDetailVM g() {
        return (CategoryDetailVM) this.e0.getX();
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        CustomPopWindow customPopWindow = this.i0;
        if (customPopWindow != null) {
            customPopWindow.a();
        }
    }
}
