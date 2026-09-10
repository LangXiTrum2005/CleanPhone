package com.charging.screenshow.battery.animations.themes.activity;

import android.app.WallpaperManager;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.utils.async.Async;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ImagePreviewAct f13057Y;
    public final /* synthetic */ WallpaperManager Z;
    public final /* synthetic */ File e0;

    public /* synthetic */ r(int i2, WallpaperManager wallpaperManager, ImagePreviewAct imagePreviewAct, File file) {
        this.X = i2;
        this.f13057Y = imagePreviewAct;
        this.Z = wallpaperManager;
        this.e0 = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        final WallpaperManager wallpaperManager = this.Z;
        final File file = this.e0;
        final ImagePreviewAct imagePreviewAct = this.f13057Y;
        switch (this.X) {
            case 0:
                int i2 = ImagePreviewAct.p0;
                imagePreviewAct.r(IntExt.c(R.string.setting_wallpaper));
                final int i3 = 2;
                Async.a().f13315a.execute(new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.s
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        final int i4 = 2;
                        final ImagePreviewAct imagePreviewAct2 = imagePreviewAct;
                        WallpaperManager wallpaperManager2 = wallpaperManager;
                        final int i5 = 1;
                        File file2 = file;
                        switch (i3) {
                            case 0:
                                int i6 = ImagePreviewAct.p0;
                                wallpaperManager2.setStream(new FileInputStream(file2), null, true, 2);
                                Async.b(2000L, new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ImagePreviewAct imagePreviewAct3 = imagePreviewAct2;
                                        switch (i4) {
                                            case 0:
                                                int i7 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 1);
                                                }
                                                break;
                                            case 1:
                                                int i8 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 3);
                                                }
                                                break;
                                            default:
                                                int i9 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 2);
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                int i7 = ImagePreviewAct.p0;
                                wallpaperManager2.setStream(new FileInputStream(file2));
                                Async.b(2000L, new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ImagePreviewAct imagePreviewAct3 = imagePreviewAct2;
                                        switch (i5) {
                                            case 0:
                                                int i8 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 1);
                                                }
                                                break;
                                            case 1:
                                                int i9 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 3);
                                                }
                                                break;
                                            default:
                                                int i10 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 2);
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                int i8 = ImagePreviewAct.p0;
                                wallpaperManager2.setStream(new FileInputStream(file2), null, true, 1);
                                final int i9 = 0;
                                Async.b(2000L, new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ImagePreviewAct imagePreviewAct3 = imagePreviewAct2;
                                        switch (i9) {
                                            case 0:
                                                int i10 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 1);
                                                }
                                                break;
                                            case 1:
                                                int i11 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 3);
                                                }
                                                break;
                                            default:
                                                int i12 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 2);
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                break;
            case 1:
                int i4 = ImagePreviewAct.p0;
                imagePreviewAct.r(IntExt.c(R.string.setting_wallpaper));
                final int i5 = 0;
                Async.a().f13315a.execute(new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.s
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        final int i6 = 2;
                        final ImagePreviewAct imagePreviewAct2 = imagePreviewAct;
                        WallpaperManager wallpaperManager2 = wallpaperManager;
                        final int i7 = 1;
                        File file2 = file;
                        switch (i5) {
                            case 0:
                                int i8 = ImagePreviewAct.p0;
                                wallpaperManager2.setStream(new FileInputStream(file2), null, true, 2);
                                Async.b(2000L, new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ImagePreviewAct imagePreviewAct3 = imagePreviewAct2;
                                        switch (i6) {
                                            case 0:
                                                int i10 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 1);
                                                }
                                                break;
                                            case 1:
                                                int i11 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 3);
                                                }
                                                break;
                                            default:
                                                int i12 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 2);
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                int i9 = ImagePreviewAct.p0;
                                wallpaperManager2.setStream(new FileInputStream(file2));
                                Async.b(2000L, new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ImagePreviewAct imagePreviewAct3 = imagePreviewAct2;
                                        switch (i7) {
                                            case 0:
                                                int i10 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 1);
                                                }
                                                break;
                                            case 1:
                                                int i11 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 3);
                                                }
                                                break;
                                            default:
                                                int i12 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 2);
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                int i10 = ImagePreviewAct.p0;
                                wallpaperManager2.setStream(new FileInputStream(file2), null, true, 1);
                                final int i11 = 0;
                                Async.b(2000L, new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ImagePreviewAct imagePreviewAct3 = imagePreviewAct2;
                                        switch (i11) {
                                            case 0:
                                                int i12 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 1);
                                                }
                                                break;
                                            case 1:
                                                int i13 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 3);
                                                }
                                                break;
                                            default:
                                                int i14 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 2);
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                break;
            default:
                int i6 = ImagePreviewAct.p0;
                imagePreviewAct.r(IntExt.c(R.string.setting_wallpaper));
                final int i7 = 1;
                Async.a().f13315a.execute(new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.s
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        final int i8 = 2;
                        final ImagePreviewAct imagePreviewAct2 = imagePreviewAct;
                        WallpaperManager wallpaperManager2 = wallpaperManager;
                        final int i9 = 1;
                        File file2 = file;
                        switch (i7) {
                            case 0:
                                int i10 = ImagePreviewAct.p0;
                                wallpaperManager2.setStream(new FileInputStream(file2), null, true, 2);
                                Async.b(2000L, new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ImagePreviewAct imagePreviewAct3 = imagePreviewAct2;
                                        switch (i8) {
                                            case 0:
                                                int i12 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 1);
                                                }
                                                break;
                                            case 1:
                                                int i13 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 3);
                                                }
                                                break;
                                            default:
                                                int i14 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 2);
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                int i11 = ImagePreviewAct.p0;
                                wallpaperManager2.setStream(new FileInputStream(file2));
                                Async.b(2000L, new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ImagePreviewAct imagePreviewAct3 = imagePreviewAct2;
                                        switch (i9) {
                                            case 0:
                                                int i12 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 1);
                                                }
                                                break;
                                            case 1:
                                                int i13 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 3);
                                                }
                                                break;
                                            default:
                                                int i14 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 2);
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                int i12 = ImagePreviewAct.p0;
                                wallpaperManager2.setStream(new FileInputStream(file2), null, true, 1);
                                final int i13 = 0;
                                Async.b(2000L, new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.activity.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ImagePreviewAct imagePreviewAct3 = imagePreviewAct2;
                                        switch (i13) {
                                            case 0:
                                                int i14 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 1);
                                                }
                                                break;
                                            case 1:
                                                int i15 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 3);
                                                }
                                                break;
                                            default:
                                                int i16 = ImagePreviewAct.p0;
                                                imagePreviewAct3.k();
                                                if (!imagePreviewAct3.isFinishing()) {
                                                    ResultAct.Companion.a(imagePreviewAct3, 2);
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                break;
        }
        return unit;
    }
}
