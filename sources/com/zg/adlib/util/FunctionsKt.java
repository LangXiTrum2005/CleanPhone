package com.zg.adlib.util;

import com.applovin.impl.Z;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p004ironsource.ne;
import com.smartdigimkt.d2.a;
import com.thinkup.core.oo.mo;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\u001a\u0006\u0010\b\u001a\u00020\u0002\u001a\u0013\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00020\u0002¢\u0006\u0002\u0010\u000b\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002\u001a!\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010\"\u0004\b\u0000\u0010\u0012*\u0002H\u0012¢\u0006\u0002\u0010\u0013\u001a!\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010\"\u0004\b\u0000\u0010\u0012*\u0002H\u0012¢\u0006\u0002\u0010\u0013\u001a&\u0010\u0015\u001a\u0002H\u0012\"\u0006\b\u0000\u0010\u0012\u0018\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010H\u0086\b¢\u0006\u0002\u0010\u0016\u001a \u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0019\"\u0006\b\u0001\u0010\u0018\u0018\u0001*\u0002H\u0019H\u0086\b¢\u0006\u0002\u0010\u001a\"\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0007\u0010\u0004¨\u0006\u001b"}, d2 = {"ZH_HANT", "", "", "getZH_HANT", "()[Ljava/lang/String;", "[Ljava/lang/String;", "ZH_HANS", "getZH_HANS", "languageTAG", "rawlanguageTAG", "kotlin.jvm.PlatformType", "()Ljava/lang/String;", "isNumeric", "", "toCheck", "serializeToMap", "", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Ljava/lang/Object;)Ljava/util/Map;", "serializeToMapString", "toDataClass", "(Ljava/util/Map;)Ljava/lang/Object;", "convert", "O", "I", "(Ljava/lang/Object;)Ljava/lang/Object;", "app_debug"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FunctionsKt {
    private static final String[] ZH_HANT = {"tw", "hk", mo.o, "hant", "cht"};
    private static final String[] ZH_HANS = {"cn", "hans", "chs", ne.h1};

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* JADX INFO: renamed from: com.zg.adlib.util.FunctionsKt$convert$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/zg/adlib/util/FunctionsKt$convert$1", "Lcom/google/gson/reflect/TypeToken;", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass1<O> extends TypeToken<O> {
    }

    public static final <I, O> O convert(I i2) {
        new Gson().g(i2);
        Intrinsics.l();
        throw null;
    }

    public static final String[] getZH_HANS() {
        return ZH_HANS;
    }

    public static final String[] getZH_HANT() {
        return ZH_HANT;
    }

    public static final boolean isNumeric(String toCheck) {
        Intrinsics.f(toCheck, "toCheck");
        for (int i2 = 0; i2 < toCheck.length(); i2++) {
            if (!Character.isDigit(toCheck.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static final String languageTAG() {
        String languageTag = Locale.getDefault().toLanguageTag();
        Intrinsics.e(languageTag, "toLanguageTag(...)");
        Locale locale = Locale.ENGLISH;
        String strP = Z.p(locale, "ENGLISH", languageTag, locale, "toLowerCase(...)");
        if (StringsKt.M(strP, "zh-", false)) {
            for (String str : ZH_HANT) {
                if (StringsKt.l(strP, str, false)) {
                    return "zh-TW";
                }
            }
        }
        if (StringsKt.M(strP, "zh-", false)) {
            for (String str2 : ZH_HANS) {
                if (StringsKt.l(strP, str2, false)) {
                    return a.S;
                }
            }
        }
        if (strP.equals("zh_TW")) {
            return "zh-TW";
        }
        if (strP.equals("en_US")) {
            return a.Z;
        }
        strP.equals("en-US");
        return a.Z;
    }

    public static final String rawlanguageTAG() {
        return Locale.getDefault().toLanguageTag();
    }

    public static final <T> Map<String, Object> serializeToMap(T t) {
        Gson gson = new Gson();
        return (Map) gson.b(gson.g(t), TypeToken.get(new TypeToken<Map<String, ? extends Object>>() { // from class: com.zg.adlib.util.FunctionsKt$serializeToMap$$inlined$convert$1
        }.getType()));
    }

    public static final <T> Map<String, String> serializeToMapString(T t) {
        Gson gson = new Gson();
        return (Map) gson.b(gson.g(t), TypeToken.get(new TypeToken<Map<String, ? extends String>>() { // from class: com.zg.adlib.util.FunctionsKt$serializeToMapString$$inlined$convert$1
        }.getType()));
    }

    public static final <T> T toDataClass(Map<String, ? extends Object> map) {
        Intrinsics.f(map, "<this>");
        new Gson().g(map);
        Intrinsics.l();
        throw null;
    }
}
