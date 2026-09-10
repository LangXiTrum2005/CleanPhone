package apical;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: ContextThemeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman extends ContextWrapper {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static Configuration f14300beachfront;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f14301attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public LayoutInflater f14302dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Resources f14303marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Resources.Theme f14304saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public Configuration f14305wireman;

    public wireman() {
        super(null);
    }

    public static boolean marial(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f14300beachfront == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f14300beachfront = configuration2;
        }
        return configuration.equals(f14300beachfront);
    }

    public void attabal(Configuration configuration) {
        if (this.f14303marial != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f14305wireman != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f14305wireman = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public void beachfront(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public int dern() {
        return this.f14301attabal;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return saneness();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f14302dern == null) {
            this.f14302dern = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f14302dern;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f14304saneness;
        if (theme != null) {
            return theme;
        }
        if (this.f14301attabal == 0) {
            this.f14301attabal = beachfront.taiyuan.Theme_AppCompat_Light;
        }
        wireman();
        return this.f14304saneness;
    }

    public final Resources saneness() {
        if (this.f14303marial == null) {
            Configuration configuration = this.f14305wireman;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && marial(configuration))) {
                this.f14303marial = super.getResources();
            } else {
                this.f14303marial = createConfigurationContext(this.f14305wireman).getResources();
            }
        }
        return this.f14303marial;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f14301attabal != i) {
            this.f14301attabal = i;
            wireman();
        }
    }

    public final void wireman() {
        boolean z = this.f14304saneness == null;
        if (z) {
            this.f14304saneness = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f14304saneness.setTo(theme);
            }
        }
        beachfront(this.f14304saneness, this.f14301attabal, z);
    }

    public wireman(Context context, int i) {
        super(context);
        this.f14301attabal = i;
    }

    public wireman(Context context, Resources.Theme theme) {
        super(context);
        this.f14304saneness = theme;
    }
}
