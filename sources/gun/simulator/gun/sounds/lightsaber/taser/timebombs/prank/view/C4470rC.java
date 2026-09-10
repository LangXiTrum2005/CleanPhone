package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4470rC {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;
    public static final C4383qC Companion = new C4383qC(null);
    private static final String TAG = C4470rC.class.getSimpleName();
    private static final C4470rC instance = new C4470rC();

    private C4470rC() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: displayImage$lambda-0, reason: not valid java name */
    public static final void m272displayImage$lambda0(String str, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "$onImageLoaded");
        if (AbstractC3089ba0.N0(str, "file://", false)) {
            String strSubstring = str.substring(7);
            AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strSubstring);
            if (bitmapDecodeFile != null) {
                interfaceC2766Sw.invoke(bitmapDecodeFile);
                return;
            }
            C4829vJ c4829vJ = C4917wJ.Companion;
            String str2 = TAG;
            AbstractC2995aW.p(str2, "TAG");
            c4829vJ.w(str2, "decode bitmap failed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getImageSize$lambda-1, reason: not valid java name */
    public static final void m273getImageSize$lambda1(String str, InterfaceC3567gx interfaceC3567gx) {
        AbstractC2995aW.q(interfaceC3567gx, "$onImageSizeLoaded");
        if (AbstractC3089ba0.N0(str, "file://", false)) {
            String strSubstring = str.substring(7);
            AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(strSubstring, options);
            interfaceC3567gx.invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        }
    }

    public final void displayImage(String str, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "onImageLoaded");
        if (this.ioExecutor == null) {
            C4829vJ c4829vJ = C4917wJ.Companion;
            String str2 = TAG;
            AbstractC2995aW.p(str2, "TAG");
            c4829vJ.w(str2, "ImageLoader not initialized.");
            return;
        }
        if (str == null || str.length() == 0) {
            C4829vJ c4829vJ2 = C4917wJ.Companion;
            String str3 = TAG;
            AbstractC2995aW.p(str3, "TAG");
            c4829vJ2.w(str3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new Ff0(str, interfaceC2766Sw, 21));
        }
    }

    public final void getImageSize(String str, InterfaceC3567gx interfaceC3567gx) {
        AbstractC2995aW.q(interfaceC3567gx, "onImageSizeLoaded");
        if (this.ioExecutor == null) {
            C4829vJ c4829vJ = C4917wJ.Companion;
            String str2 = TAG;
            AbstractC2995aW.p(str2, "TAG");
            c4829vJ.w(str2, "ImageLoader not initialized.");
            return;
        }
        if (str == null || str.length() == 0) {
            C4829vJ c4829vJ2 = C4917wJ.Companion;
            String str3 = TAG;
            AbstractC2995aW.p(str3, "TAG");
            c4829vJ2.w(str3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new Ff0(str, interfaceC3567gx, 20));
        }
    }

    public final void init(Executor executor) {
        AbstractC2995aW.q(executor, "ioExecutor");
        this.ioExecutor = executor;
    }
}
