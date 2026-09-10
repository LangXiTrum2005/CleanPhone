package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.core.util.Consumer;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5160z4 implements InterfaceC5016xU {
    public static final C4896w4 Companion = new C4896w4(null);
    private static final String TAG = "AndroidPlatform";
    private L3 advertisingInfo;
    private String appSetId;
    private Integer appSetIdScope;
    private final AudioManager audioManager;
    private final Context context;
    private final boolean isSideLoaded;
    private final PowerManager powerManager;
    private final C4689tj0 uaExecutor;
    private String userAgent;

    public C5160z4(Context context, C4689tj0 c4689tj0) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(c4689tj0, "uaExecutor");
        this.context = context;
        this.uaExecutor = c4689tj0;
        updateAppSetID();
        Object systemService = context.getSystemService("power");
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.powerManager = (PowerManager) systemService;
        Object systemService2 = context.getSystemService("audio");
        AbstractC2995aW.o(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService2;
    }

    private final L3 getAmazonAdvertisingInfo() {
        L3 l3 = new L3();
        try {
            ContentResolver contentResolver = this.context.getContentResolver();
            boolean z = true;
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                z = false;
            }
            l3.setLimitAdTracking(z);
            l3.setAdvertisingId(Settings.Secure.getString(contentResolver, "advertising_id"));
        } catch (Settings.SettingNotFoundException e) {
            C4917wJ.Companion.w(TAG, "Error getting Amazon advertising info: Setting not found.", e);
        } catch (Exception e2) {
            C4917wJ.Companion.w(TAG, "Error getting Amazon advertising info", e2);
        }
        return l3;
    }

    private final L3 getGoogleAdvertisingInfo() {
        L3 l3 = new L3();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            AbstractC2995aW.p(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            l3.setAdvertisingId(advertisingIdInfo.getId());
            l3.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (GooglePlayServicesNotAvailableException e) {
            C4917wJ.Companion.e(TAG, "Play services Not available: " + e.getLocalizedMessage());
        } catch (Exception e2) {
            C4917wJ.Companion.e(TAG, "Error getting Google advertising info: " + e2.getLocalizedMessage());
        } catch (NoClassDefFoundError e3) {
            C4917wJ.Companion.e(TAG, "Play services Not available: " + e3.getLocalizedMessage());
            l3.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
        }
        return l3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getUserAgentLazy$lambda-0, reason: not valid java name */
    public static final void m288getUserAgentLazy$lambda0(C5160z4 c5160z4, Consumer consumer) {
        AbstractC2995aW.q(c5160z4, "this$0");
        AbstractC2995aW.q(consumer, "$consumer");
        new Gl0(c5160z4.context).getUserAgent(consumer);
    }

    private final void updateAppSetID() {
        String str = this.appSetId;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.context);
                AbstractC2995aW.p(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                AbstractC2995aW.p(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new C4808v4(this));
            } catch (Exception e) {
                C4917wJ.Companion.e(TAG, "Error getting AppSetID: " + e.getLocalizedMessage());
            } catch (NoClassDefFoundError e2) {
                C4917wJ.Companion.e(TAG, "Required libs to get AppSetID Not available: " + e2.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateAppSetID$lambda-2, reason: not valid java name */
    public static final void m289updateAppSetID$lambda2(C5160z4 c5160z4, AppSetIdInfo appSetIdInfo) {
        AbstractC2995aW.q(c5160z4, "this$0");
        if (appSetIdInfo != null) {
            c5160z4.appSetId = appSetIdInfo.getId();
            c5160z4.appSetIdScope = Integer.valueOf(appSetIdInfo.getScope());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public L3 getAdvertisingInfo() {
        String advertisingId;
        L3 l3 = this.advertisingInfo;
        if (l3 != null && (advertisingId = l3.getAdvertisingId()) != null && advertisingId.length() != 0) {
            return l3;
        }
        L3 amazonAdvertisingInfo = AbstractC3089ba0.o0(Build.MANUFACTURER, "Amazon") ? getAmazonAdvertisingInfo() : getGoogleAdvertisingInfo();
        this.advertisingInfo = amazonAdvertisingInfo;
        return amazonAdvertisingInfo;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public Integer getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public String getCarrierName() {
        String carrierName$vungle_ads_release = Companion.getCarrierName$vungle_ads_release(this.context);
        AbstractC2995aW.p(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public String getUserAgent() {
        String str = this.userAgent;
        return str == null ? System.getProperty("http.agent") : str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public void getUserAgentLazy(Consumer<String> consumer) {
        AbstractC2995aW.q(consumer, "consumer");
        this.uaExecutor.execute(new Ff0(16, this, consumer));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public float getVolumeLevel() {
        try {
            return this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public boolean isSdCardPresent() {
        try {
            return AbstractC2995aW.i(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Acquiring external storage state failed", e);
            return false;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public boolean isSideLoaded() {
        return this.isSideLoaded;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public boolean isSilentModeEnabled() {
        try {
            return this.audioManager.getRingerMode() == 0 || this.audioManager.getRingerMode() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU
    public boolean isSoundEnabled() {
        try {
            return this.audioManager.getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }
}
