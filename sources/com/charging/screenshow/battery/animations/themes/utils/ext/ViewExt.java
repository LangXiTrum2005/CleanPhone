package com.charging.screenshow.battery.animations.themes.utils.ext;

import android.view.View;
import com.jakewharton.rxbinding4.view.RxView;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/utils/ext/ViewExt;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewExt {
    public static void a(View view) {
        Intrinsics.f(view, "<this>");
        view.setVisibility(8);
    }

    public static void b(View view) {
        Intrinsics.f(view, "<this>");
        view.setVisibility(0);
    }

    public static void c(final View view, final Function1 function1) {
        Intrinsics.f(view, "<this>");
        RxView.a(view).throttleFirst(1000L, TimeUnit.MILLISECONDS).subscribe(new Consumer() { // from class: com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt$throttleClicks$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(Object obj) {
                Unit it = (Unit) obj;
                Intrinsics.f(it, "it");
                function1.invoke(view);
            }
        });
    }
}
