package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.storage.androidcleaner.R;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f46267f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f46269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f46270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f46271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f46272e;

    public c(Context context, int i10) {
        super(context);
        this.f46268a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f46272e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f46271d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f46271d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f46269b == null) {
            this.f46269b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f46269b.setTo(theme);
            }
        }
        this.f46269b.applyStyle(this.f46268a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f46272e == null) {
            Configuration configuration = this.f46271d;
            if (configuration == null) {
                this.f46272e = super.getResources();
            } else {
                if (f46267f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    f46267f = configuration2;
                }
                if (configuration.equals(f46267f)) {
                    this.f46272e = super.getResources();
                } else {
                    this.f46272e = createConfigurationContext(this.f46271d).getResources();
                }
            }
        }
        return this.f46272e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f46270c == null) {
            this.f46270c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f46270c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f46269b;
        if (theme != null) {
            return theme;
        }
        if (this.f46268a == 0) {
            this.f46268a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f46269b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f46268a != i10) {
            this.f46268a = i10;
            b();
        }
    }
}
