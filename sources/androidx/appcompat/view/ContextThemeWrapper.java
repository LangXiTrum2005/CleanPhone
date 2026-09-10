package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes.dex */
public class ContextThemeWrapper extends ContextWrapper {
    public static Configuration f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f3422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f3423c;
    public Configuration d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f3424e;

    public static class Api17Impl {
        public static Context a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            return contextThemeWrapper.createConfigurationContext(configuration);
        }
    }

    public ContextThemeWrapper(Context context, int i2) {
        super(context);
        this.f3421a = i2;
    }

    public final void a(Configuration configuration) {
        if (this.f3424e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f3422b == null) {
            this.f3422b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3422b.setTo(theme);
            }
        }
        this.f3422b.applyStyle(this.f3421a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f3424e == null) {
            Configuration configuration = this.d;
            if (configuration == null) {
                this.f3424e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f = configuration2;
                    }
                    if (configuration.equals(f)) {
                        this.f3424e = super.getResources();
                    }
                }
                this.f3424e = Api17Impl.a(this, this.d).getResources();
            }
        }
        return this.f3424e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3423c == null) {
            this.f3423c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3423c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3422b;
        if (theme != null) {
            return theme;
        }
        if (this.f3421a == 0) {
            this.f3421a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f3422b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f3421a != i2) {
            this.f3421a = i2;
            b();
        }
    }
}
