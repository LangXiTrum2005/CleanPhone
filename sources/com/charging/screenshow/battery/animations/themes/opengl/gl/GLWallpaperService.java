package com.charging.screenshow.battery.animations.themes.opengl.gl;

import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GLWallpaperService extends WallpaperService {

    public class GLEngine extends WallpaperService.Engine {
        @Override // android.service.wallpaper.WallpaperService.Engine
        public final void onSurfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            super.onSurfaceRedrawNeeded(surfaceHolder);
            isVisible();
        }
    }

    public @interface RenderMode {
    }
}
