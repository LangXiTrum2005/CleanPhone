package hawkthorn;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.os.Build;
import android.text.TextUtils;
import babyless.beachfront;
import canephora.UserAttributesConfig;
import com.yolo.networklibrary.common.util.dern;
import eia.impromptu;
import gerenuk.saneness;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: UserAttributesManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u001b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J%\u0010\u0018\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0003R\u001c\u0010\u001e\u001a\n \u001c*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\"\u0010'\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010&\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010)R\"\u0010,\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010)R\"\u0010.\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010&\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010)¨\u00060"}, d2 = {"Lhawkthorn/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcanephora/beachfront;", "userAttributesConfig", "", "attabal", "(Landroid/content/Context;Lcanephora/beachfront;)V", "", "utmSource", "", "dern", "(Ljava/lang/String;)Z", "marial", "saneness", "()Z", "beachfront", "impromptu", "", "limit", "limitType", "wireman", "(Ljava/util/List;Ljava/lang/String;)Z", "competently", "taiyuan", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "Lcanephora/beachfront;", "Z", "isForbiddenRegion", "setForbiddenRegion", "(Z)V", "isLimitRegion", "setLimitRegion", "isNotGpInstall", "setNotGpInstall", "isOldUser", "setOldUser", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static boolean isLimitRegion;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static boolean isNotGpInstall;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static Context mContext;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static boolean isOldUser;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static boolean isForbiddenRegion;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f27589attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = attabal.class.getSimpleName();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static UserAttributesConfig userAttributesConfig = new UserAttributesConfig(null, null, null, null, null, 31, null);

    public final void attabal(Context context, UserAttributesConfig userAttributesConfig2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userAttributesConfig2, "userAttributesConfig");
        mContext = context;
        userAttributesConfig = userAttributesConfig2;
        beachfront();
        impromptu();
        competently();
        taiyuan();
    }

    public final void beachfront() {
        String country;
        if (!userAttributesConfig.dern().contains(Integer.valueOf(userAttributesConfig.getUserLabel().getForbiddenRegion().getCommon().getLabel()))) {
            isForbiddenRegion = false;
            return;
        }
        List<String> listMarial = graveside.marial("CN");
        List<String> listMarial2 = graveside.marial("zh");
        List<String> listFormularize = adultoid.formularize();
        Context context = mContext;
        Intrinsics.beachfront(context);
        Locale localeImpromptu = dern.impromptu(context);
        if (localeImpromptu != null) {
            country = localeImpromptu.getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "locale.country");
        } else {
            country = "";
        }
        Context context2 = mContext;
        Intrinsics.beachfront(context2);
        String strApical = dern.apical(context2);
        Intrinsics.checkNotNullExpressionValue(strApical, "getOSLang(mContext!!)");
        Context context3 = mContext;
        Intrinsics.beachfront(context3);
        String strFormularize = dern.formularize(context3);
        Intrinsics.checkNotNullExpressionValue(strFormularize, "getOSRegionCodeLang(mContext!!)");
        if (wireman(listMarial, country)) {
            isForbiddenRegion = true;
        }
        if (wireman(listMarial2, strApical)) {
            isForbiddenRegion = true;
        }
        if (wireman(listFormularize, strFormularize)) {
            isForbiddenRegion = true;
        }
        if (lord.attabal.INSTANCE.saneness()) {
            if (Intrinsics.wireman(userAttributesConfig.getUserLabel().getForbiddenRegion().getCommon().getDebugState(), Boolean.TRUE)) {
                isForbiddenRegion = true;
            } else if (Intrinsics.wireman(userAttributesConfig.getUserLabel().getForbiddenRegion().getCommon().getDebugState(), Boolean.FALSE)) {
                isForbiddenRegion = false;
            }
        }
    }

    public final void competently() {
        Object objM3351constructorimpl;
        if (!userAttributesConfig.dern().contains(Integer.valueOf(userAttributesConfig.getUserLabel().getNotGpInstall().getCommon().getLabel()))) {
            isNotGpInstall = false;
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = mContext;
            Intrinsics.beachfront(context);
            String packageName = context.getPackageName();
            Context context2 = mContext;
            Intrinsics.beachfront(context2);
            String installerPackageName = context2.getPackageManager().getInstallerPackageName(packageName);
            if (Build.VERSION.SDK_INT >= 30) {
                Context context3 = mContext;
                Intrinsics.beachfront(context3);
                InstallSourceInfo installSourceInfo = context3.getPackageManager().getInstallSourceInfo(packageName);
                Intrinsics.checkNotNullExpressionValue(installSourceInfo, "mContext!!.packageManage…llSourceInfo(packageName)");
                installerPackageName = installSourceInfo.getInstallingPackageName();
            }
            isNotGpInstall = true;
            if (!TextUtils.isEmpty(installerPackageName) && Intrinsics.wireman(installerPackageName, "com.android.vending")) {
                isNotGpInstall = false;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            impromptu.saneness().wireman(thM3354exceptionOrNullimpl);
            isNotGpInstall = true;
        }
        if (lord.attabal.INSTANCE.saneness()) {
            if (Intrinsics.wireman(userAttributesConfig.getUserLabel().getNotGpInstall().getCommon().getDebugState(), Boolean.TRUE)) {
                isNotGpInstall = true;
            } else if (Intrinsics.wireman(userAttributesConfig.getUserLabel().getNotGpInstall().getCommon().getDebugState(), Boolean.FALSE)) {
                isNotGpInstall = false;
            }
        }
    }

    public final boolean dern(String utmSource) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        if (!userAttributesConfig.attabal().isEmpty()) {
            for (String str : userAttributesConfig.attabal()) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String lowerCase = utmSource.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt.overspeculate(lowerCase, str, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
        String lowerCase2 = utmSource.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (!StringsKt.overspeculate(lowerCase2, "organic", false, 2, null)) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "getDefault()");
            String lowerCase3 = utmSource.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            if (!StringsKt.overspeculate(lowerCase3, "google-play", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0058  */
    public final void impromptu() {
        boolean z;
        if (!userAttributesConfig.dern().contains(Integer.valueOf(userAttributesConfig.getUserLabel().getLimitRegion().getCommon().getLabel()))) {
            isLimitRegion = false;
            return;
        }
        List<String> listAttabal = userAttributesConfig.getUserLabel().getLimitRegion().getRule().attabal();
        Context context = mContext;
        Intrinsics.beachfront(context);
        String localMcc = dern.taiyuan(context);
        if (listAttabal.isEmpty()) {
            z = false;
        } else {
            Intrinsics.checkNotNullExpressionValue(localMcc, "localMcc");
            if (wireman(listAttabal, localMcc)) {
                z = true;
            } else {
                z = false;
            }
        }
        isLimitRegion = z;
        if (lord.attabal.INSTANCE.saneness()) {
            if (Intrinsics.wireman(userAttributesConfig.getUserLabel().getLimitRegion().getCommon().getDebugState(), Boolean.TRUE)) {
                isLimitRegion = true;
            } else if (Intrinsics.wireman(userAttributesConfig.getUserLabel().getLimitRegion().getCommon().getDebugState(), Boolean.FALSE)) {
                isLimitRegion = false;
            }
        }
    }

    public final boolean marial(String utmSource) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        if (!userAttributesConfig.saneness().isEmpty()) {
            for (String str : userAttributesConfig.saneness()) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String lowerCase = utmSource.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt.overspeculate(lowerCase, str, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
        String lowerCase2 = utmSource.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (!StringsKt.overspeculate(lowerCase2, "organic", false, 2, null)) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "getDefault()");
            String lowerCase3 = utmSource.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            if (!StringsKt.overspeculate(lowerCase3, "google-play", false, 2, null)) {
                Locale locale4 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale4, "getDefault()");
                String lowerCase4 = utmSource.toLowerCase(locale4);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                if (!StringsKt.overspeculate(lowerCase4, "empty", false, 2, null)) {
                    Locale locale5 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale5, "getDefault()");
                    String lowerCase5 = utmSource.toLowerCase(locale5);
                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                    if (!StringsKt.overspeculate(lowerCase5, "not%20set", false, 2, null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean saneness() {
        return saneness.molybdenite();
    }

    public final void taiyuan() {
        if (!userAttributesConfig.dern().contains(Integer.valueOf(userAttributesConfig.getUserLabel().getOldUser().getCommon().getLabel()))) {
            isOldUser = false;
            return;
        }
        if (beachfront.impromptu(babyless.dern.f14824wireman, 0L) == 0) {
            beachfront.apical(babyless.dern.f14824wireman, Long.valueOf(System.currentTimeMillis()));
            isOldUser = false;
            return;
        }
        int gpSourceLimit = (saneness() ? userAttributesConfig.getUserLabel().getOldUser().getRule().getGpSourceLimit() : userAttributesConfig.getUserLabel().getOldUser().getRule().getNotGpSourceLimit()) * 86400000;
        long jImpromptu = beachfront.impromptu(babyless.dern.f14824wireman, -1L);
        if (((int) jImpromptu) == -1) {
            isOldUser = false;
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jImpromptu);
            Object objClone = calendar.clone();
            Intrinsics.competently(objClone, "null cannot be cast to non-null type java.util.Calendar");
            Calendar calendar2 = (Calendar) objClone;
            calendar2.set(11, 23);
            calendar2.set(12, 59);
            calendar2.set(13, 59);
            calendar2.set(14, 999);
            isOldUser = System.currentTimeMillis() > calendar2.getTimeInMillis() + ((long) gpSourceLimit);
        }
        if (lord.attabal.INSTANCE.saneness()) {
            if (Intrinsics.wireman(userAttributesConfig.getUserLabel().getOldUser().getCommon().getDebugState(), Boolean.TRUE)) {
                isOldUser = true;
            } else if (Intrinsics.wireman(userAttributesConfig.getUserLabel().getOldUser().getCommon().getDebugState(), Boolean.FALSE)) {
                isOldUser = false;
            }
        }
    }

    public final boolean wireman(List<String> limit, String limitType) {
        int size = limit.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(limit.get(i), limitType)) {
                z = true;
            }
        }
        return z;
    }
}
