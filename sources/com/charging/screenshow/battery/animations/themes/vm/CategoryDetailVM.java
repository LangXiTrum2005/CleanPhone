package com.charging.screenshow.battery.animations.themes.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.room.b;
import b0.c;
import com.charging.screenshow.battery.animations.themes.network.service.ServiceWallpaper;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/vm/CategoryDetailVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CategoryDetailVM extends ViewModel {
    public int g;
    public final ServiceWallpaper d = new ServiceWallpaper();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableLiveData f13342e = new MutableLiveData();
    public final ArrayList f = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13343h = 36;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f13344i = new AtomicBoolean(false);

    public static void d(CategoryDetailVM categoryDetailVM, int i2, String sortBy) {
        categoryDetailVM.getClass();
        Intrinsics.f(sortBy, "sortBy");
        AtomicBoolean atomicBoolean = categoryDetailVM.f13344i;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        int i3 = categoryDetailVM.g + 1;
        int i4 = categoryDetailVM.f13343h;
        int i5 = i3 * i4;
        try {
            atomicBoolean.set(true);
            categoryDetailVM.d.b(i4, i5, String.valueOf(i2), sortBy).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new c(4, new a(categoryDetailVM, i3, 0)));
        } catch (Exception unused) {
            atomicBoolean.set(false);
        }
    }

    public static void e(CategoryDetailVM categoryDetailVM, int i2, String sortBy) {
        categoryDetailVM.getClass();
        Intrinsics.f(sortBy, "sortBy");
        AtomicBoolean atomicBoolean = categoryDetailVM.f13344i;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        categoryDetailVM.g = 0;
        try {
            categoryDetailVM.d.b(categoryDetailVM.f13343h, 0, String.valueOf(i2), sortBy).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new c(3, new b(categoryDetailVM, 7)));
        } catch (Exception unused) {
            atomicBoolean.set(false);
        }
    }
}
