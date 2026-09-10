package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.BannerSize;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.li;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes6.dex */
public class Banner3DSize {

    public enum Size {
        XXSMALL(new BannerSize(280, 50)),
        XSMALL(new BannerSize(300, 50)),
        SMALL(new BannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50)),
        MEDIUM(new BannerSize(468, 60)),
        LARGE(new BannerSize(728, 90)),
        XLARGE(new BannerSize(1024, 90));

        private final BannerSize size;

        Size(BannerSize bannerSize) {
            this.size = bannerSize;
        }

        public BannerSize getSize() {
            return this.size;
        }
    }

    private static void determineSizeByScreen(Context context, Point point, View view) {
        point.x = li.b(context, view.getMeasuredWidth());
        point.y = Math.round(view.getMeasuredHeight() / context.getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static BannerSize getApplicationSize(Context context, ViewParent viewParent, BannerOptions bannerOptions, Banner3D banner3D) {
        Point point = new Point();
        point.x = bannerOptions.o();
        point.y = bannerOptions.d();
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().width > 0) {
            point.x = li.b(context, banner3D.getLayoutParams().width + 1);
        }
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().height > 0) {
            point.y = li.b(context, banner3D.getLayoutParams().height + 1);
        }
        if (banner3D.getLayoutParams() == null || banner3D.getLayoutParams().width <= 0 || banner3D.getLayoutParams().height <= 0) {
            if (context instanceof Activity) {
                View decorView = ((Activity) context).getWindow().getDecorView();
                try {
                    View view = (View) viewParent;
                    if (view instanceof Banner) {
                        view = (View) view.getParent();
                    }
                    boolean z2 = false;
                    boolean z3 = false;
                    while (view != null && (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0)) {
                        if (view.getMeasuredWidth() > 0 && !z2) {
                            setWidthFromViewParent(context, point, view);
                            z2 = true;
                        }
                        if (view.getMeasuredHeight() > 0 && !z3) {
                            setHeightFromViewParent(context, point, view);
                            z3 = true;
                        }
                        view = (View) view.getParent();
                    }
                    if (view == null) {
                        determineSizeByScreen(context, point, decorView);
                    } else {
                        if (!z2) {
                            setWidthFromViewParent(context, point, view);
                        }
                        if (!z3) {
                            setHeightFromViewParent(context, point, view);
                        }
                    }
                } catch (Throwable th) {
                    determineSizeByScreen(context, point, decorView);
                    g9.a(th);
                }
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        li.a(context, windowManager, point);
                    }
                } catch (Throwable th2) {
                    g9.a(th2);
                }
            }
        }
        return new BannerSize(point.x, point.y);
    }

    private static void setHeightFromViewParent(Context context, Point point, View view) {
        point.y = li.b(context, (view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop());
    }

    public static boolean setOptimiseSize(Context context, ViewParent viewParent, BannerOptions bannerOptions, Banner3D banner3D, BannerSize[] bannerSizeArr) {
        BannerSize applicationSize = getApplicationSize(context, viewParent, bannerOptions, banner3D);
        bannerSizeArr[0] = applicationSize;
        boolean z2 = false;
        for (Size size : Size.values()) {
            if (size.getSize().getWidth() <= applicationSize.getWidth() && size.getSize().getHeight() <= applicationSize.getHeight()) {
                bannerOptions.a(size.getSize().getWidth(), size.getSize().getHeight());
                z2 = true;
            }
        }
        if (!z2) {
            bannerOptions.a(0, 0);
        }
        return z2;
    }

    private static void setWidthFromViewParent(Context context, Point point, View view) {
        point.x = li.b(context, (view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight());
    }
}
