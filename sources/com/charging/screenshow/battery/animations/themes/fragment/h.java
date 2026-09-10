package com.charging.screenshow.battery.animations.themes.fragment;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.FragWallpaperBinding;
import com.charging.screenshow.battery.animations.themes.databinding.LaySortBy2Binding;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.CustomPopWindow;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ NewTrendingFrag f13272Y;

    public /* synthetic */ h(NewTrendingFrag newTrendingFrag, int i2) {
        this.X = i2;
        this.f13272Y = newTrendingFrag;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i2 = 1;
        Unit unit = Unit.f43263a;
        final NewTrendingFrag newTrendingFrag = this.f13272Y;
        switch (this.X) {
            case 0:
                View it = (View) obj;
                Intrinsics.f(it, "it");
                newTrendingFrag.getClass();
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = LifecycleOwnerKt.a(newTrendingFrag);
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(lifecycleCoroutineScopeImplA, DefaultIoScheduler.f45062Y, null, new NewTrendingFrag$reload$1(newTrendingFrag, null), 2);
                FragWallpaperBinding fragWallpaperBinding = newTrendingFrag.Z;
                if (fragWallpaperBinding == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                ViewExt.a(fragWallpaperBinding.f13196c);
                FragWallpaperBinding fragWallpaperBinding2 = newTrendingFrag.Z;
                if (fragWallpaperBinding2 != null) {
                    ViewExt.b(fragWallpaperBinding2.f13195b);
                    return unit;
                }
                Intrinsics.m("binding");
                throw null;
            case 1:
                View it2 = (View) obj;
                Intrinsics.f(it2, "it");
                if (newTrendingFrag.h0 == null) {
                    View viewInflate = newTrendingFrag.getLayoutInflater().inflate(R.layout.lay_sort_by2, (ViewGroup) null, false);
                    int i3 = R.id.item1;
                    TextView textView = (TextView) ViewBindings.a(R.id.item1, viewInflate);
                    if (textView != null) {
                        i3 = R.id.item2;
                        TextView textView2 = (TextView) ViewBindings.a(R.id.item2, viewInflate);
                        if (textView2 != null) {
                            newTrendingFrag.h0 = new LaySortBy2Binding((LinearLayout) viewInflate, textView, textView2);
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                }
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.charging.screenshow.battery.animations.themes.fragment.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String upperCase;
                        NewTrendingFrag newTrendingFrag2 = newTrendingFrag;
                        CustomPopWindow customPopWindow = newTrendingFrag2.i0;
                        if (customPopWindow != null) {
                            customPopWindow.a();
                        }
                        int id = view.getId();
                        if (id == R.id.item1) {
                            newTrendingFrag2.j0 = "newest";
                            upperCase = IntExt.c(R.string.newest).toUpperCase(Locale.ROOT);
                            Intrinsics.e(upperCase, "toUpperCase(...)");
                        } else if (id == R.id.item2) {
                            newTrendingFrag2.j0 = "rating";
                            upperCase = IntExt.c(R.string.most_popular).toUpperCase(Locale.ROOT);
                            Intrinsics.e(upperCase, "toUpperCase(...)");
                        } else {
                            newTrendingFrag2.j0 = "rating";
                            upperCase = IntExt.c(R.string.most_popular).toUpperCase(Locale.ROOT);
                            Intrinsics.e(upperCase, "toUpperCase(...)");
                        }
                        FragWallpaperBinding fragWallpaperBinding3 = newTrendingFrag2.Z;
                        if (fragWallpaperBinding3 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        fragWallpaperBinding3.f13198h.setText("Sort by : ".concat(upperCase));
                        FragWallpaperBinding fragWallpaperBinding4 = newTrendingFrag2.Z;
                        if (fragWallpaperBinding4 != null) {
                            fragWallpaperBinding4.d.autoRefresh();
                        } else {
                            Intrinsics.m("binding");
                            throw null;
                        }
                    }
                };
                LaySortBy2Binding laySortBy2Binding = newTrendingFrag.h0;
                if (laySortBy2Binding != null) {
                    laySortBy2Binding.f13234b.setOnClickListener(onClickListener);
                }
                LaySortBy2Binding laySortBy2Binding2 = newTrendingFrag.h0;
                if (laySortBy2Binding2 != null) {
                    laySortBy2Binding2.f13235c.setOnClickListener(onClickListener);
                }
                CustomPopWindow.PopupWindowBuilder popupWindowBuilder = new CustomPopWindow.PopupWindowBuilder(newTrendingFrag.requireActivity());
                LaySortBy2Binding laySortBy2Binding3 = newTrendingFrag.h0;
                Intrinsics.c(laySortBy2Binding3);
                CustomPopWindow customPopWindow = popupWindowBuilder.f13327a;
                customPopWindow.h0 = laySortBy2Binding3.f13233a;
                customPopWindow.g0 = -1;
                customPopWindow.p0 = true;
                customPopWindow.q0 = 0.7f;
                CustomPopWindow customPopWindowA = popupWindowBuilder.a();
                newTrendingFrag.i0 = customPopWindowA;
                FragWallpaperBinding fragWallpaperBinding3 = newTrendingFrag.Z;
                if (fragWallpaperBinding3 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                RelativeLayout relativeLayout = fragWallpaperBinding3.f13197e;
                PopupWindow popupWindow = customPopWindowA.i0;
                if (popupWindow != null) {
                    popupWindow.showAsDropDown(relativeLayout, 0, 0);
                }
                return unit;
            default:
                List list = (List) obj;
                newTrendingFrag.f0.clear();
                ArrayList arrayList = newTrendingFrag.f0;
                Intrinsics.c(list);
                arrayList.addAll(list);
                new Handler(Looper.getMainLooper()).postDelayed(new c0.a(new d(newTrendingFrag, i2), 14), 800L);
                return unit;
        }
    }
}
