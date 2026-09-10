package com.startapp.sdk.ads.splash;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class SplashConfig implements Serializable {
    private static final int INT_EMPTY_VALUE = -1;
    private static final String STRING_EMPTY_VALUE = "";
    private static final String VALUE_DEFAULT_HTML_BG_COLOR = "#066CAA";
    private static final String VALUE_DEFAULT_HTML_FONT_COLOR = "ffffff";
    private static final String VALUE_DEFAULT_HTML_LOADING_TYPE = "LoadingDots";
    private static final boolean VALUE_DEFAULT_HTML_SPLASH = true;
    private static final long serialVersionUID = -1014176445263003129L;
    private boolean showFromCacheOnly;
    private static final Theme VALUE_DEFAULT_THEME = Theme.OCEAN;
    private static final MinSplashTime VALUE_DEFAULT_MINSPLASHTIME = MinSplashTime.REGULAR;
    private static long DEFAULT_MAX_LOAD = 7500;
    private static final long VALUE_DEFAULT_MAXLOAD = DEFAULT_MAX_LOAD;
    private static final MaxAdDisplayTime VALUE_DEFAULT_MAXADDISPLAY = MaxAdDisplayTime.FOR_EVER;
    private static final Orientation VALUE_DEFAULT_ORIENTATION = Orientation.AUTO;
    private boolean forceNative = false;
    private int customScreen = -1;
    private String appName = "";
    private transient Drawable logo = null;
    private byte[] logoByteArray = null;
    private int logoRes = -1;

    @TypeInfo(type = Theme.class)
    private Theme defaultTheme = VALUE_DEFAULT_THEME;

    @TypeInfo(type = MinSplashTime.class)
    private MinSplashTime defaultMinSplashTime = VALUE_DEFAULT_MINSPLASHTIME;
    private Long defaultMaxLoadTime = Long.valueOf(VALUE_DEFAULT_MAXLOAD);

    @TypeInfo(type = MaxAdDisplayTime.class)
    private MaxAdDisplayTime defaultMaxAdDisplayTime = VALUE_DEFAULT_MAXADDISPLAY;

    @TypeInfo(type = Orientation.class)
    private Orientation defaultOrientation = VALUE_DEFAULT_ORIENTATION;

    @TypeInfo(type = Animation.class)
    private Animation animation = Animation.ALL;
    private boolean htmlSplash = true;
    private String splashBgColor = VALUE_DEFAULT_HTML_BG_COLOR;
    private String splashFontColor = VALUE_DEFAULT_HTML_FONT_COLOR;
    private String splashLoadingType = VALUE_DEFAULT_HTML_LOADING_TYPE;
    private transient String errMsg = "";

    public enum Animation {
        ALL,
        AVAILABLE_AD_ONLY,
        DISABLE
    }

    public enum MaxAdDisplayTime {
        SHORT(5000),
        LONG(10000),
        FOR_EVER(86400000);

        private final long index;

        MaxAdDisplayTime(long j) {
            this.index = j;
        }

        public static MaxAdDisplayTime getByIndex(long j) {
            MaxAdDisplayTime maxAdDisplayTime = SHORT;
            MaxAdDisplayTime[] maxAdDisplayTimeArrValues = values();
            for (int i2 = 0; i2 < maxAdDisplayTimeArrValues.length; i2++) {
                if (maxAdDisplayTimeArrValues[i2].getIndex() == j) {
                    maxAdDisplayTime = maxAdDisplayTimeArrValues[i2];
                }
            }
            return maxAdDisplayTime;
        }

        public static MaxAdDisplayTime getByName(String str) {
            MaxAdDisplayTime maxAdDisplayTime = FOR_EVER;
            MaxAdDisplayTime[] maxAdDisplayTimeArrValues = values();
            for (int i2 = 0; i2 < maxAdDisplayTimeArrValues.length; i2++) {
                String strName = maxAdDisplayTimeArrValues[i2].name();
                Locale locale = Locale.ROOT;
                if (strName.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    maxAdDisplayTime = maxAdDisplayTimeArrValues[i2];
                }
            }
            return maxAdDisplayTime;
        }

        public long getIndex() {
            return this.index;
        }
    }

    public enum MinSplashTime {
        REGULAR(3000),
        SHORT(2000),
        LONG(5000);

        private final long index;

        MinSplashTime(int i2) {
            this.index = i2;
        }

        public static MinSplashTime getByIndex(long j) {
            MinSplashTime minSplashTime = SHORT;
            MinSplashTime[] minSplashTimeArrValues = values();
            for (int i2 = 0; i2 < minSplashTimeArrValues.length; i2++) {
                if (minSplashTimeArrValues[i2].getIndex() == j) {
                    minSplashTime = minSplashTimeArrValues[i2];
                }
            }
            return minSplashTime;
        }

        public static MinSplashTime getByName(String str) {
            MinSplashTime minSplashTime = LONG;
            MinSplashTime[] minSplashTimeArrValues = values();
            for (int i2 = 0; i2 < minSplashTimeArrValues.length; i2++) {
                String strName = minSplashTimeArrValues[i2].name();
                Locale locale = Locale.ROOT;
                if (strName.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    minSplashTime = minSplashTimeArrValues[i2];
                }
            }
            return minSplashTime;
        }

        public long getIndex() {
            return this.index;
        }
    }

    public enum Orientation {
        PORTRAIT(1),
        LANDSCAPE(2),
        AUTO(3);

        private final int index;

        Orientation(int i2) {
            this.index = i2;
        }

        public int getIndex() {
            return this.index;
        }
    }

    public enum Theme {
        DEEP_BLUE(1),
        SKY(2),
        ASHEN_SKY(3),
        BLAZE(4),
        GLOOMY(5),
        OCEAN(6),
        USER_DEFINED(0);

        private final int index;

        Theme(int i2) {
            this.index = i2;
        }

        public static Theme getByIndex(int i2) {
            Theme theme = DEEP_BLUE;
            Theme[] themeArrValues = values();
            for (int i3 = 0; i3 < themeArrValues.length; i3++) {
                if (themeArrValues[i3].getIndex() == i2) {
                    theme = themeArrValues[i3];
                }
            }
            return theme;
        }

        public static Theme getByName(String str) {
            Theme theme = DEEP_BLUE;
            Theme[] themeArrValues = values();
            for (int i2 = 0; i2 < themeArrValues.length; i2++) {
                String strName = themeArrValues[i2].name();
                Locale locale = Locale.ROOT;
                if (strName.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    theme = themeArrValues[i2];
                }
            }
            return theme;
        }

        public int getIndex() {
            return this.index;
        }
    }

    private void setErrorMsg(String str) {
        this.errMsg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SplashConfig splashConfig = (SplashConfig) obj;
            if (this.forceNative == splashConfig.forceNative && this.showFromCacheOnly == splashConfig.showFromCacheOnly && this.animation == splashConfig.animation && this.customScreen == splashConfig.customScreen && this.logoRes == splashConfig.logoRes && this.htmlSplash == splashConfig.htmlSplash && vi.a((Object) this.appName, (Object) splashConfig.appName) && Arrays.equals(this.logoByteArray, splashConfig.logoByteArray) && this.defaultTheme == splashConfig.defaultTheme && this.defaultMinSplashTime == splashConfig.defaultMinSplashTime && vi.a((Object) this.defaultMaxLoadTime, (Object) splashConfig.defaultMaxLoadTime) && this.defaultMaxAdDisplayTime == splashConfig.defaultMaxAdDisplayTime && this.defaultOrientation == splashConfig.defaultOrientation && vi.a((Object) this.splashBgColor, (Object) splashConfig.splashBgColor) && vi.a((Object) this.splashFontColor, (Object) splashConfig.splashFontColor) && vi.a((Object) this.splashLoadingType, (Object) splashConfig.splashLoadingType)) {
                return true;
            }
        }
        return false;
    }

    public Animation getAnimationMode() {
        Animation animation = this.animation;
        return animation == null ? Animation.ALL : animation;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getBgColor() {
        return this.splashBgColor;
    }

    public int getCustomScreen() {
        return this.customScreen;
    }

    public String getErrorMessage() {
        return this.errMsg;
    }

    public String getFontColor() {
        return this.splashFontColor;
    }

    public String getLoadingType() {
        return this.splashLoadingType;
    }

    public Drawable getLogo() {
        return this.logo;
    }

    public byte[] getLogoByteArray() {
        return this.logoByteArray;
    }

    public int getLogoRes() {
        return this.logoRes;
    }

    public MaxAdDisplayTime getMaxAdDisplayTime() {
        return this.defaultMaxAdDisplayTime;
    }

    public Long getMaxLoadAdTimeout() {
        return this.defaultMaxLoadTime;
    }

    public MinSplashTime getMinSplashTime() {
        return this.defaultMinSplashTime;
    }

    public Orientation getOrientation() {
        return this.defaultOrientation;
    }

    public Theme getTheme() {
        return this.defaultTheme;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.forceNative), Integer.valueOf(this.customScreen), this.appName, Integer.valueOf(this.logoRes), this.defaultTheme, this.defaultMinSplashTime, this.defaultMaxLoadTime, this.defaultMaxAdDisplayTime, this.defaultOrientation, Boolean.valueOf(this.htmlSplash), this.splashBgColor, this.splashFontColor, this.splashLoadingType, Boolean.valueOf(this.showFromCacheOnly), this.logoByteArray, this.animation};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public boolean isHtmlSplash() {
        if (this.forceNative) {
            return false;
        }
        return this.htmlSplash;
    }

    public boolean isLogoResAvailable() {
        return this.logoRes != -1;
    }

    public boolean isShowFromCacheOnly() {
        return this.showFromCacheOnly;
    }

    public SplashConfig setAppName(String str) {
        this.appName = str;
        return this;
    }

    public SplashConfig setCustomScreen(int i2) {
        this.customScreen = i2;
        return this;
    }

    public SplashConfig setHtmlSplash(boolean z2) {
        this.htmlSplash = z2;
        return this;
    }

    public SplashConfig setLoadingType(String str) {
        this.splashLoadingType = str;
        return this;
    }

    public SplashConfig setLogo(int i2) {
        this.logoRes = i2;
        return this;
    }

    public SplashConfig setMaxAdDisplayTime(MaxAdDisplayTime maxAdDisplayTime) {
        this.defaultMaxAdDisplayTime = maxAdDisplayTime;
        return this;
    }

    public SplashConfig setMaxLoadAdTimeout(long j) {
        this.defaultMaxLoadTime = Long.valueOf(j);
        return this;
    }

    public SplashConfig setMinSplashTime(MinSplashTime minSplashTime) {
        this.defaultMinSplashTime = minSplashTime;
        return this;
    }

    public SplashConfig setOrientation(Orientation orientation) {
        this.defaultOrientation = orientation;
        return this;
    }

    public SplashConfig setTheme(Theme theme) {
        this.defaultTheme = theme;
        return this;
    }

    public boolean validate(Context context) {
        Drawable drawableLoadIcon;
        if (a.f40519a[getTheme().ordinal()] != 1) {
            if (getAppName().equals("")) {
                setAppName(h0.c(context));
            }
            if (getLogo() == null && getLogoByteArray() == null) {
                try {
                    if (getLogoRes() == -1) {
                        WeakHashMap weakHashMap = vi.f41589a;
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            drawableLoadIcon = packageManager == null ? null : packageManager.getApplicationInfo(context.getPackageName(), 128).loadIcon(packageManager);
                        } catch (Throwable th) {
                            g9.a(th);
                        }
                        setLogo(drawableLoadIcon);
                    } else {
                        setLogo(context.getResources().getDrawable(getLogoRes()));
                    }
                } catch (Throwable th2) {
                    g9.a(th2);
                }
            }
        } else if (getCustomScreen() == -1) {
            setErrorMsg("StartApp: Exception getting custom screen resource id, make sure it is set");
            return false;
        }
        return true;
    }

    public SplashConfig setLogo(byte[] bArr) {
        this.logoByteArray = bArr;
        return this;
    }

    private SplashConfig setLogo(Drawable drawable) {
        this.logo = drawable;
        return this;
    }
}
