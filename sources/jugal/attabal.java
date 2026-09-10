package jugal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import claque.beachfront;
import com.codejoy.boom.clap.formularize;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import dabble.LanguageBean;
import frenchy.saneness;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LanguageUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0011R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ljugal/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "competently", "(Landroid/content/Context;)Z", "", "dern", "(Landroid/content/Context;)Ljava/lang/String;", "saneness", "newBase", "attabal", "(Landroid/content/Context;)Landroid/content/Context;", "marial", "()Ljava/lang/String;", "beachfront", "", "Ldabble/attabal;", "Ljava/util/List;", "wireman", "()Ljava/util/List;", "LanguageList", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f29013attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final List<LanguageBean> LanguageList = CollectionsKt.setterwort(adultoid.polloi(new LanguageBean("English", "en", formularize.boom_ic_language_us), new LanguageBean("Español", "es", formularize.boom_ic_lang_es_mx), new LanguageBean("Français", "fr", formularize.boom_ic_language_fr), new LanguageBean("Deutsch", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, formularize.boom_ic_language_de), new LanguageBean("日本語", "ja", formularize.boom_ic_language_ja), new LanguageBean("한국어", "ko", formularize.boom_ic_language_ko), new LanguageBean("العربية", "ar", formularize.boom_ic_language_ar), new LanguageBean("हिंदी", "hi", formularize.boom_ic_language_hi), new LanguageBean("Türkçe", "tr", formularize.boom_ic_language_tr), new LanguageBean("Bahasa Indonesia", "id", formularize.boom_ic_language_id), new LanguageBean("繁體中文", "zh-Hant", formularize.boom_ic_language_zh), new LanguageBean("简体中文", "zh-Hans", formularize.boom_ic_language_zh), new LanguageBean("اردو", "ur", formularize.boom_ic_language_ur), new LanguageBean("Filipino", "fil", formularize.boom_ic_lang_fil), new LanguageBean("Português", "pt", formularize.boom_ic_lang_pt_br), new LanguageBean("Italiano", "it", formularize.boom_ic_lang_it), new LanguageBean("Magyar", "hu", formularize.boom_ic_lang_hu), new LanguageBean("Polski", "pl", formularize.boom_ic_lang_pl), new LanguageBean("Nederlands", "nl", formularize.country_nl), new LanguageBean("Melayu", "ms", formularize.country_ms), new LanguageBean("Русский", "ru", formularize.country_ru), new LanguageBean("Svenska", "sv", formularize.country_sv), new LanguageBean("Tiếng Việt", "vi", formularize.country_vi), new LanguageBean("فارسی", "fa", formularize.country_fa), new LanguageBean("แบบไทย", "th", formularize.country_th)), new C0658attabal());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f29014dern = 8;

    /* JADX INFO: renamed from: jugal.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0658attabal<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return saneness.wireman(((LanguageBean) t).getLanguageName(), ((LanguageBean) t2).getLanguageName());
        }
    }

    public final Context attabal(Context newBase) {
        Locale localeForLanguageTag;
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        String strDern = dern(newBase);
        if (Intrinsics.wireman(strDern, "zh-Hant")) {
            localeForLanguageTag = Locale.TAIWAN;
        } else {
            localeForLanguageTag = Intrinsics.wireman(strDern, "zh-Hans") ? Locale.CHINA : Locale.forLanguageTag(strDern);
        }
        Configuration configuration = newBase.getResources().getConfiguration();
        configuration.setLocale(localeForLanguageTag);
        configuration.setLayoutDirection(localeForLanguageTag);
        Locale.setDefault(localeForLanguageTag);
        LocaleList.setDefault(new LocaleList(localeForLanguageTag));
        return newBase.createConfigurationContext(configuration);
    }

    public final String beachfront() {
        Locale localeDern = beachfront.attabal(Resources.getSystem().getConfiguration()).dern(0);
        if (localeDern == null) {
            localeDern = Locale.getDefault();
        }
        String language = localeDern.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale locale = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String script = localeDern.getScript();
        Intrinsics.checkNotNullExpressionValue(script, "getScript(...)");
        String lowerCase2 = script.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        String country = localeDern.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        String lowerCase3 = country.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        if (Intrinsics.wireman(lowerCase, "zh") && (Intrinsics.wireman(lowerCase2, "hant") || creditor.impromptu("tw", "hk", "mo").contains(lowerCase3))) {
            return "zh-Hant";
        }
        if (Intrinsics.wireman(lowerCase, "zh")) {
            return "zh-Hans";
        }
        if (Intrinsics.wireman(lowerCase, ScarConstants.IN_SIGNAL_KEY) || Intrinsics.wireman(lowerCase, "id")) {
            return "id";
        }
        return (Intrinsics.wireman(lowerCase, "fil") || Intrinsics.wireman(lowerCase, "tl")) ? "fil" : lowerCase;
    }

    public final boolean competently(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final String dern(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strAttabal = tau.attabal.f38663attabal.attabal(context);
        return strAttabal.length() == 0 ? saneness(context) : strAttabal;
    }

    public final String marial() {
        Locale localeDern = beachfront.attabal(Resources.getSystem().getConfiguration()).dern(0);
        if (localeDern == null) {
            localeDern = Locale.getDefault();
        }
        String country = localeDern.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        String lowerCase = country.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final String saneness(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            String language = locale.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            Locale locale2 = Locale.ROOT;
            String lowerCase = language.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String country = locale.getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
            String lowerCase2 = country.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (!Intrinsics.wireman(lowerCase, ScarConstants.IN_SIGNAL_KEY) && !Intrinsics.wireman(lowerCase, "id")) {
                if (Intrinsics.wireman(lowerCase, "fr")) {
                    return "fr";
                }
                if (Intrinsics.wireman(lowerCase, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
                    return DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR;
                }
                if (Intrinsics.wireman(lowerCase, "ja")) {
                    return "ja";
                }
                if (Intrinsics.wireman(lowerCase, "ko")) {
                    return "ko";
                }
                if (Intrinsics.wireman(lowerCase, "hi")) {
                    return "hi";
                }
                if (Intrinsics.wireman(lowerCase, "tr")) {
                    return "tr";
                }
                if (Intrinsics.wireman(lowerCase, "ar")) {
                    return "ar";
                }
                if (Intrinsics.wireman(lowerCase, "ur")) {
                    return "ur";
                }
                if (Intrinsics.wireman(lowerCase, "es")) {
                    return "es";
                }
                if (Intrinsics.wireman(lowerCase, "fil")) {
                    return "fil";
                }
                if (Intrinsics.wireman(lowerCase, "pt")) {
                    return "pt";
                }
                if (Intrinsics.wireman(lowerCase, "it")) {
                    return "it";
                }
                if (Intrinsics.wireman(lowerCase, "hu")) {
                    return "hu";
                }
                if (Intrinsics.wireman(lowerCase, "pl")) {
                    return "pl";
                }
                if (Intrinsics.wireman(lowerCase, "nl")) {
                    return "nl";
                }
                if (!Intrinsics.wireman(lowerCase, "zh") || (!Intrinsics.wireman(lowerCase2, "tw") && !Intrinsics.wireman(lowerCase2, "hk"))) {
                    if (Intrinsics.wireman(lowerCase, "zh")) {
                        return "zh-Hans";
                    }
                    if (Intrinsics.wireman(lowerCase, "ms")) {
                        return "ms";
                    }
                    if (Intrinsics.wireman(lowerCase, "ru")) {
                        return "ru";
                    }
                    if (Intrinsics.wireman(lowerCase, "sv")) {
                        return "sv";
                    }
                    if (Intrinsics.wireman(lowerCase, "vi")) {
                        return "vi";
                    }
                    if (Intrinsics.wireman(lowerCase, "fa")) {
                        return "fa";
                    }
                    return Intrinsics.wireman(lowerCase, "th") ? "th" : "en";
                }
                return "zh-Hant";
            }
            return "id";
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(dern.attabal(th));
            return "en";
        }
    }

    public final List<LanguageBean> wireman() {
        return LanguageList;
    }
}
