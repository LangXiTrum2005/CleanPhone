package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AdInformationConfig implements Serializable {
    private static final String DEFAULT_DIALOG_URL = "https://funnel-assets.startappservice.com/consent/index.html";
    protected static final boolean DEFAULT_EANBLED = true;
    private static final String DEFAULT_EULA_URL = "https://www.startapp.com/policy/privacy-policy/";
    private static final float DEFAULT_FAT_FINGERS_FACTOR = 200.0f;
    private static final long serialVersionUID = 8911501868319500986L;
    private Integer consentTypeInfo;
    private boolean enabled = true;
    private float fatFingersFactor = DEFAULT_FAT_FINGERS_FACTOR;
    private String dialogUrlSecured = DEFAULT_DIALOG_URL;
    private String eulaUrlSecured = DEFAULT_EULA_URL;

    @TypeInfo(key = AdPreferences.Placement.class, type = HashMap.class, value = AdInformationPositions.Position.class)
    protected HashMap<AdPreferences.Placement, AdInformationPositions.Position> Positions = new HashMap<>();
    private transient EnumMap<ImageResourceType, ImageResourceConfig> imageResources = new EnumMap<>(ImageResourceType.class);

    @TypeInfo(type = ArrayList.class, value = ImageResourceConfig.class)
    private List<ImageResourceConfig> ImageResources = new ArrayList();

    public enum ImageResourceType {
        INFO_S(17, 14),
        INFO_EX_S(88, 14),
        INFO_L(25, 21),
        INFO_EX_L(130, 21);

        private final int height;
        private final int width;

        ImageResourceType(int i2, int i3) {
            this.width = i2;
            this.height = i3;
        }

        public static ImageResourceType getByName(String str) {
            ImageResourceType imageResourceType = INFO_S;
            for (ImageResourceType imageResourceType2 : values()) {
                String strName = imageResourceType2.name();
                Locale locale = Locale.ROOT;
                if (strName.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    imageResourceType = imageResourceType2;
                }
            }
            return imageResourceType;
        }

        public int getDefaultHeight() {
            return this.height;
        }

        public int getDefaultWidth() {
            return this.width;
        }
    }

    private AdInformationConfig() {
    }

    public static AdInformationConfig createAdInformationConfig() {
        AdInformationConfig adInformationConfig = new AdInformationConfig();
        setDefaultValues(adInformationConfig);
        return adInformationConfig;
    }

    public static void setDefaultValues(AdInformationConfig adInformationConfig) {
        adInformationConfig.updateFallbackImageResources();
        adInformationConfig.validateImageResourcesConfig();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdInformationConfig adInformationConfig = (AdInformationConfig) obj;
            if (this.enabled == adInformationConfig.enabled && Float.compare(adInformationConfig.fatFingersFactor, this.fatFingersFactor) == 0 && vi.a((Object) this.consentTypeInfo, (Object) adInformationConfig.consentTypeInfo) && vi.a((Object) this.dialogUrlSecured, (Object) adInformationConfig.dialogUrlSecured) && vi.a((Object) this.eulaUrlSecured, (Object) adInformationConfig.eulaUrlSecured) && vi.a((Object) this.Positions, (Object) adInformationConfig.Positions) && vi.a(this.ImageResources, adInformationConfig.ImageResources)) {
                return true;
            }
        }
        return false;
    }

    public Integer getConsentTypeInfo() {
        return this.consentTypeInfo;
    }

    public String getDialogUrl() {
        String str = this.dialogUrlSecured;
        return str != null ? str : DEFAULT_DIALOG_URL;
    }

    public String getEulaUrl() {
        String str = this.eulaUrlSecured;
        return (str == null || str.equals("")) ? DEFAULT_EULA_URL : this.eulaUrlSecured;
    }

    public float getFatFingerFactor() {
        return this.fatFingersFactor / 100.0f;
    }

    public ImageResourceConfig getImageResourceConfig(ImageResourceType imageResourceType) {
        return getImageResources().get(imageResourceType);
    }

    public EnumMap<ImageResourceType, ImageResourceConfig> getImageResources() {
        return this.imageResources;
    }

    public AdInformationPositions.Position getPosition(AdPreferences.Placement placement) {
        AdInformationPositions.Position position = this.Positions.get(placement);
        if (position != null) {
            return position;
        }
        AdInformationPositions.Position position2 = AdInformationPositions.Position.BOTTOM_LEFT;
        this.Positions.put(placement, position2);
        return position2;
    }

    public String getPrivacyIconImageUrl() {
        EnumMap<ImageResourceType, ImageResourceConfig> enumMap = this.imageResources;
        ImageResourceType imageResourceType = ImageResourceType.INFO_L;
        return (!enumMap.containsKey(imageResourceType) || this.imageResources.get(imageResourceType).b().equals("")) ? "https://info.startappservice.com/InApp/resources/info_l.png" : this.imageResources.get(imageResourceType).b();
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.consentTypeInfo, Float.valueOf(this.fatFingersFactor), this.dialogUrlSecured, this.eulaUrlSecured, this.Positions, this.ImageResources};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public void initImageResourceConfigBitmaps(Context context) {
        for (ImageResourceConfig imageResourceConfig : this.ImageResources) {
            setImageResourceConfig(ImageResourceType.getByName(imageResourceConfig.c()), imageResourceConfig);
            imageResourceConfig.b(context);
        }
    }

    public void initTransientFields() {
        this.imageResources = new EnumMap<>(ImageResourceType.class);
    }

    public boolean isEnabled(Context context) {
        return !((vf) com.startapp.sdk.components.a.a(context).G.a()).getBoolean("userDisabledAdInformation", false) && isMetaDataEnabled();
    }

    public boolean isMetaDataEnabled() {
        return this.enabled;
    }

    public void setImageResourceConfig(ImageResourceType imageResourceType, ImageResourceConfig imageResourceConfig) {
        getImageResources().put(imageResourceType, imageResourceConfig);
    }

    public void setUserEnabled(Context context, boolean z2) {
        uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).G.a()).edit();
        boolean z3 = !z2;
        ufVarEdit.a("userDisabledAdInformation", Boolean.valueOf(z3));
        ufVarEdit.f41545a.putBoolean("userDisabledAdInformation", z3);
        ufVarEdit.apply();
    }

    public void updateFallbackImageResources() {
        boolean z2;
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            ImageResourceConfig imageResourceConfigA = getImageResources().get(imageResourceType);
            if (imageResourceConfigA == null) {
                imageResourceConfigA = ImageResourceConfig.a(imageResourceType.name());
                Iterator<ImageResourceConfig> it = this.ImageResources.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ImageResourceType.getByName(it.next().c()).equals(imageResourceType)) {
                            z2 = false;
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                getImageResources().put(imageResourceType, imageResourceConfigA);
                if (z2) {
                    this.ImageResources.add(imageResourceConfigA);
                }
            }
            imageResourceConfigA.b(imageResourceType.getDefaultWidth());
            imageResourceConfigA.a(imageResourceType.getDefaultHeight());
            imageResourceConfigA.b(imageResourceType.name().toLowerCase(Locale.ROOT) + ".png");
        }
    }

    public void validateImageResourcesConfig() {
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            if (getImageResources().get(imageResourceType) == null) {
                throw new IllegalArgumentException(String.valueOf(imageResourceType));
            }
        }
    }
}
