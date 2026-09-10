package hydrofracturing;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.seminary;
import java.io.IOException;
import java.util.Map;
import utwa.arytenoidectomy;
import utwa.beachfront;

/* JADX INFO: compiled from: ImageAssetManager.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Object f28125wireman = new Object();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f28126attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<String, seminary> f28127dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f28128saneness;

    public saneness(Drawable.Callback callback, String str, com.airbnb.lottie.saneness sanenessVar, Map<String, seminary> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f28128saneness = str;
        } else {
            this.f28128saneness = str + '/';
        }
        this.f28127dern = map;
        wireman(sanenessVar);
        if (callback instanceof View) {
            this.f28126attabal = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f28126attabal = null;
        }
    }

    public Bitmap attabal(String str) {
        seminary seminaryVar = this.f28127dern.get(str);
        if (seminaryVar == null) {
            return null;
        }
        Bitmap bitmapSaneness = seminaryVar.saneness();
        if (bitmapSaneness != null) {
            return bitmapSaneness;
        }
        Context context = this.f28126attabal;
        if (context == null) {
            return null;
        }
        String strDern = seminaryVar.dern();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strDern.startsWith("data:") && strDern.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strDern.substring(strDern.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return dern(str, arytenoidectomy.impassible(bitmapDecodeByteArray, seminaryVar.beachfront(), seminaryVar.wireman()));
                    }
                    beachfront.dern("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e) {
                    beachfront.wireman("Unable to decode image `" + str + "`.", e);
                    return null;
                }
            } catch (IllegalArgumentException e2) {
                beachfront.wireman("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f28128saneness)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f28128saneness + strDern), null, options);
                if (bitmapDecodeStream != null) {
                    return dern(str, arytenoidectomy.impassible(bitmapDecodeStream, seminaryVar.beachfront(), seminaryVar.wireman()));
                }
                beachfront.dern("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e3) {
                beachfront.wireman("Unable to decode image `" + str + "`.", e3);
                return null;
            }
        } catch (IOException e4) {
            beachfront.wireman("Unable to open asset.", e4);
            return null;
        }
    }

    public final Bitmap dern(String str, Bitmap bitmap) {
        synchronized (f28125wireman) {
            this.f28127dern.get(str).competently(bitmap);
        }
        return bitmap;
    }

    public Bitmap marial(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapSaneness = this.f28127dern.get(str).saneness();
            dern(str, bitmap);
            return bitmapSaneness;
        }
        seminary seminaryVar = this.f28127dern.get(str);
        Bitmap bitmapSaneness2 = seminaryVar.saneness();
        seminaryVar.competently(null);
        return bitmapSaneness2;
    }

    public boolean saneness(Context context) {
        if (context == null) {
            return this.f28126attabal == null;
        }
        if (this.f28126attabal instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f28126attabal;
    }

    public void wireman(com.airbnb.lottie.saneness sanenessVar) {
    }
}
