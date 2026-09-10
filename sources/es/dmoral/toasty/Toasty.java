package es.dmoral.toasty;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes6.dex */
public class Toasty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Typeface f42874a = Typeface.create("sans-serif-condensed", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42875b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f42876c = true;
    public static final boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f42877e = -1;
    public static final int f = -1;
    public static final int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Toast f42878h = null;

    public static class Config {
    }

    public static Toast a(Context context, String str, Drawable drawable, int i2, int i3) {
        Toast toastMakeText = Toast.makeText(context, "", 0);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.charging.screenshow.battery.animations.themes.R.layout.toast_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.toast_icon);
        TextView textView = (TextView) viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.toast_text);
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) AppCompatResources.a(context, 2131231783);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ninePatchDrawable.setColorFilter(i2, mode);
        viewInflate.setBackground(ninePatchDrawable);
        if (drawable == null) {
            throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
        }
        if (f42876c) {
            drawable.setColorFilter(i3, mode);
        }
        imageView.setBackground(drawable);
        textView.setText(str);
        textView.setTextColor(i3);
        textView.setTypeface(f42874a);
        textView.setTextSize(2, f42875b);
        toastMakeText.setView(viewInflate);
        if (!d) {
            Toast toast = f42878h;
            if (toast != null) {
                toast.cancel();
            }
            f42878h = toastMakeText;
        }
        int gravity = f42877e;
        if (gravity == -1) {
            gravity = toastMakeText.getGravity();
        }
        int xOffset = f;
        if (xOffset == -1) {
            xOffset = toastMakeText.getXOffset();
        }
        int yOffset = g;
        if (yOffset == -1) {
            yOffset = toastMakeText.getYOffset();
        }
        toastMakeText.setGravity(gravity, xOffset, yOffset);
        return toastMakeText;
    }

    public static Toast b(Context context, String str) {
        return a(context, str, AppCompatResources.a(context, 2131231228), ContextCompat.getColor(context, com.charging.screenshow.battery.animations.themes.R.color.errorColor), ContextCompat.getColor(context, com.charging.screenshow.battery.animations.themes.R.color.defaultTextColor));
    }
}
