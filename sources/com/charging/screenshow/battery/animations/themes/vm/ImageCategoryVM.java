package com.charging.screenshow.battery.animations.themes.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.room.b;
import b0.c;
import com.charging.screenshow.battery.animations.themes.entity.ImageCategoryBean;
import com.charging.screenshow.battery.animations.themes.network.base.resource.ResourceExtKt;
import com.charging.screenshow.battery.animations.themes.network.service.ServiceWallpaper;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/vm/ImageCategoryVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCategoryVM extends ViewModel {
    public final ServiceWallpaper d = new ServiceWallpaper();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableLiveData f13354e = new MutableLiveData();
    public final ArrayList f = new ArrayList();
    public final AtomicBoolean g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f13355h = new AtomicInteger(0);

    public ImageCategoryVM() {
        e();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void b() {
    }

    public final void d() {
        AtomicInteger atomicInteger = this.f13355h;
        atomicInteger.set(0);
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ImageCategoryBean) arrayList.get(i2)).get_list().isEmpty()) {
                this.d.b(0, 0, String.valueOf(((ImageCategoryBean) arrayList.get(i2)).get_id()), "").subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new c(6, new a(this, i2, 1)));
            } else {
                atomicInteger.incrementAndGet();
                if (atomicInteger.get() == arrayList.size()) {
                    this.g.set(false);
                    this.f13354e.k(arrayList);
                }
            }
        }
    }

    public final void e() {
        AtomicBoolean atomicBoolean = this.g;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        if (!this.f.isEmpty()) {
            d();
        } else {
            ServiceWallpaper serviceWallpaper = this.d;
            ResourceExtKt.b(serviceWallpaper.a().getAllCategories(), serviceWallpaper.f13293a).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new c(5, new b(this, 8)));
        }
    }
}
