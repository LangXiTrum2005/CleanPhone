package com.charging.screenshow.battery.animations.themes.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.charging.screenshow.battery.animations.themes.databinding.FragImageCategoryDetailBinding;
import com.charging.screenshow.battery.animations.themes.entity.PreviewBean;
import com.charging.screenshow.battery.animations.themes.network.entity.BaseImage;
import com.charging.screenshow.battery.animations.themes.network.entity.Image;
import com.charging.screenshow.battery.animations.themes.view.CustomItemDecoration;
import com.charging.screenshow.battery.animations.themes.vm.CategoryDetailVM;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/fragment/ImageCategoryDetailFrag;", "Lcom/charging/screenshow/battery/animations/themes/fragment/BaseFrag;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCategoryDetailFrag extends BaseFrag {
    public FragImageCategoryDetailBinding Z;
    public final ViewModelLazy e0;
    public final ArrayList f0;
    public ImageGridAdapter g0;
    public int h0;
    public String i0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/fragment/ImageCategoryDetailFrag$Companion;", "", "", "ARG_TAG_ID", "Ljava/lang/String;", "ARG_TAG_SORT", "SORT_BY_DOWNLOAD", "SORT_BY_POPULAR", "SORT_BY_NEWEST", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ImageCategoryDetailFrag a(int i2, String str) {
            ImageCategoryDetailFrag imageCategoryDetailFrag = new ImageCategoryDetailFrag();
            Bundle bundle = new Bundle();
            bundle.putInt("arg_tag_id", i2);
            bundle.putString("arg_tag_sort", str);
            imageCategoryDetailFrag.setArguments(bundle);
            return imageCategoryDetailFrag;
        }
    }

    public ImageCategoryDetailFrag() {
        final ImageCategoryDetailFrag$special$$inlined$viewModels$default$1 imageCategoryDetailFrag$special$$inlined$viewModels$default$1 = new ImageCategoryDetailFrag$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.Z, new Function0<ViewModelStoreOwner>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.ImageCategoryDetailFrag$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) imageCategoryDetailFrag$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.e0 = FragmentViewModelLazyKt.a(this, Reflection.f43333a.b(CategoryDetailVM.class), new Function0<ViewModelStore>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.ImageCategoryDetailFrag$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getX()).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.ImageCategoryDetailFrag$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.ImageCategoryDetailFrag$special$$inlined$viewModels$default$5
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
        this.i0 = "";
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final View b() {
        View viewInflate = getLayoutInflater().inflate(R.layout.frag_image_category_detail, (ViewGroup) null, false);
        int i2 = R.id.refreshLayout;
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) ViewBindings.a(R.id.refreshLayout, viewInflate);
        if (smartRefreshLayout != null) {
            i2 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.a(R.id.rv, viewInflate);
            if (recyclerView != null) {
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                this.Z = new FragImageCategoryDetailBinding(frameLayout, smartRefreshLayout, recyclerView);
                Intrinsics.e(frameLayout, "getRoot(...)");
                return frameLayout;
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
        if (this.f13257Y) {
            return;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = LifecycleOwnerKt.a(this);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(lifecycleCoroutineScopeImplA, DefaultIoScheduler.f45062Y, null, new ImageCategoryDetailFrag$initDatas$1(this, null), 2);
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final void e() {
        String string;
        String str = "downloads";
        if (getArguments() != null && (string = requireArguments().getString("arg_tag_sort", NativeAdPresenter.DOWNLOAD)) != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1048839194) {
                if (iHashCode != -393940263) {
                    if (iHashCode == 1427818632) {
                        string.equals(NativeAdPresenter.DOWNLOAD);
                    }
                } else if (string.equals("popular")) {
                    str = "favorites";
                }
            } else if (string.equals("newest")) {
                str = "newest";
            }
        }
        this.h0 = getArguments() != null ? requireArguments().getInt("arg_tag_id", 0) : 0;
        this.i0 = str;
        g().f13342e.e(this, new ImageCategoryDetailFrag$sam$androidx_lifecycle_Observer$0(new f(this, 2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final void f() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.e(fragmentActivityRequireActivity, "requireActivity(...)");
        ImageGridAdapter imageGridAdapter = new ImageGridAdapter(fragmentActivityRequireActivity, this.f0);
        this.g0 = imageGridAdapter;
        imageGridAdapter.k = new ImageGridAdapter.OnItemClickListener() { // from class: com.charging.screenshow.battery.animations.themes.fragment.ImageCategoryDetailFrag$initViews$1
            @Override // com.charging.screenshow.battery.animations.themes.adapter.ImageGridAdapter.OnItemClickListener
            public final void a(int i2) {
                ImageCategoryDetailFrag imageCategoryDetailFrag = this.f13261a;
                if (i2 < 0) {
                    imageCategoryDetailFrag.getClass();
                    return;
                }
                ArrayList<BaseImage> arrayList = imageCategoryDetailFrag.f0;
                if (i2 < arrayList.size() && imageCategoryDetailFrag.getActivity() != null) {
                    BaseImage baseImage = (BaseImage) arrayList.get(i2);
                    ArrayList arrayList2 = new ArrayList();
                    for (BaseImage baseImage2 : arrayList) {
                        if (baseImage2 instanceof Image) {
                            arrayList2.add(baseImage2);
                        }
                    }
                    int iIndexOf = (!(baseImage instanceof Image) || arrayList2.indexOf(baseImage) == -1) ? 0 : arrayList2.indexOf(baseImage);
                    PreviewBean previewBean = new PreviewBean();
                    previewBean.e(arrayList2);
                    int i3 = ImagePreviewAct.p0;
                    FragmentActivity fragmentActivityRequireActivity2 = imageCategoryDetailFrag.requireActivity();
                    Intrinsics.e(fragmentActivityRequireActivity2, "requireActivity(...)");
                    ImagePreviewAct.Companion.a(fragmentActivityRequireActivity2, iIndexOf, previewBean, false);
                }
            }
        };
        FragImageCategoryDetailBinding fragImageCategoryDetailBinding = this.Z;
        if (fragImageCategoryDetailBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        requireActivity();
        fragImageCategoryDetailBinding.f13189c.setLayoutManager(new GridLayoutManager(3));
        FragImageCategoryDetailBinding fragImageCategoryDetailBinding2 = this.Z;
        if (fragImageCategoryDetailBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        fragImageCategoryDetailBinding2.f13189c.addItemDecoration(new CustomItemDecoration(1, 2));
        FragImageCategoryDetailBinding fragImageCategoryDetailBinding3 = this.Z;
        if (fragImageCategoryDetailBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ImageGridAdapter imageGridAdapter2 = this.g0;
        Intrinsics.c(imageGridAdapter2);
        fragImageCategoryDetailBinding3.f13189c.setAdapter(imageGridAdapter2);
        FragImageCategoryDetailBinding fragImageCategoryDetailBinding4 = this.Z;
        if (fragImageCategoryDetailBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        c cVar = new c(this, 0);
        SmartRefreshLayout smartRefreshLayout = fragImageCategoryDetailBinding4.f13188b;
        smartRefreshLayout.c1 = cVar;
        smartRefreshLayout.setOnLoadMoreListener(new c(this, 1));
    }

    public final CategoryDetailVM g() {
        return (CategoryDetailVM) this.e0.getX();
    }
}
