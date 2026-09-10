package com.badlogic.gdx.utils;

import com.badlogic.gdx.files.FileHandle;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class I18NBundle {
    private static final String DEFAULT_ENCODING = "UTF-8";
    private TextFormatter formatter;
    private Locale locale;
    private I18NBundle parent;
    private ObjectMap<String, String> properties;
    private static final Locale ROOT_LOCALE = new Locale("", "", "");
    private static boolean simpleFormatter = false;
    private static boolean exceptionOnMissingKey = true;

    private static boolean checkFileExistence(FileHandle fileHandle) {
        try {
            fileHandle.read().close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static I18NBundle createBundle(FileHandle fileHandle) {
        return createBundleImpl(fileHandle, Locale.getDefault(), "UTF-8");
    }

    private static I18NBundle createBundleImpl(FileHandle fileHandle, Locale locale, String str) {
        I18NBundle i18NBundleLoadBundleChain;
        I18NBundle i18NBundle = null;
        if (fileHandle == null || locale == null || str == null) {
            throw null;
        }
        Locale fallbackLocale = locale;
        do {
            List<Locale> candidateLocales = getCandidateLocales(fallbackLocale);
            i18NBundleLoadBundleChain = loadBundleChain(fileHandle, str, candidateLocales, 0, i18NBundle);
            if (i18NBundleLoadBundleChain == null) {
                fallbackLocale = getFallbackLocale(fallbackLocale);
            } else {
                Locale locale2 = i18NBundleLoadBundleChain.getLocale();
                boolean zEquals = locale2.equals(ROOT_LOCALE);
                if (!zEquals || locale2.equals(locale) || (candidateLocales.size() == 1 && locale2.equals(candidateLocales.get(0)))) {
                    break;
                }
                if (zEquals && i18NBundle == null) {
                    i18NBundle = i18NBundleLoadBundleChain;
                }
                fallbackLocale = getFallbackLocale(fallbackLocale);
            }
        } while (fallbackLocale != null);
        if (i18NBundleLoadBundleChain != null) {
            return i18NBundleLoadBundleChain;
        }
        if (i18NBundle != null) {
            return i18NBundle;
        }
        throw new MissingResourceException("Can't find bundle for base file handle " + fileHandle.path() + ", locale " + locale, fileHandle + "_" + locale, "");
    }

    private static List<Locale> getCandidateLocales(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        ArrayList arrayList = new ArrayList(4);
        if (variant.length() > 0) {
            arrayList.add(locale);
        }
        if (country.length() > 0) {
            arrayList.add(arrayList.isEmpty() ? locale : new Locale(language, country));
        }
        if (language.length() > 0) {
            if (!arrayList.isEmpty()) {
                locale = new Locale(language);
            }
            arrayList.add(locale);
        }
        arrayList.add(ROOT_LOCALE);
        return arrayList;
    }

    public static boolean getExceptionOnMissingKey() {
        return exceptionOnMissingKey;
    }

    private static Locale getFallbackLocale(Locale locale) {
        Locale locale2 = Locale.getDefault();
        if (locale.equals(locale2)) {
            return null;
        }
        return locale2;
    }

    public static boolean getSimpleFormatter() {
        return simpleFormatter;
    }

    private static I18NBundle loadBundle(FileHandle fileHandle, String str, Locale locale) {
        I18NBundle i18NBundle;
        Reader erVar = null;
        try {
            try {
                FileHandle fileHandle2 = toFileHandle(fileHandle, locale);
                if (checkFileExistence(fileHandle2)) {
                    i18NBundle = new I18NBundle();
                    erVar = fileHandle2.reader(str);
                    i18NBundle.load(erVar);
                } else {
                    i18NBundle = null;
                }
                StreamUtils.closeQuietly(erVar);
                if (i18NBundle != null) {
                    i18NBundle.setLocale(locale);
                }
                return i18NBundle;
            } catch (IOException e) {
                throw new GdxRuntimeException(e);
            }
        } catch (Throwable th) {
            StreamUtils.closeQuietly(erVar);
            throw th;
        }
    }

    private static I18NBundle loadBundleChain(FileHandle fileHandle, String str, List<Locale> list, int i, I18NBundle i18NBundle) {
        I18NBundle i18NBundleLoadBundleChain;
        Locale locale = list.get(i);
        if (i != list.size() - 1) {
            i18NBundleLoadBundleChain = loadBundleChain(fileHandle, str, list, i + 1, i18NBundle);
        } else {
            if (i18NBundle != null && locale.equals(ROOT_LOCALE)) {
                return i18NBundle;
            }
            i18NBundleLoadBundleChain = null;
        }
        I18NBundle i18NBundleLoadBundle = loadBundle(fileHandle, str, locale);
        if (i18NBundleLoadBundle == null) {
            return i18NBundleLoadBundleChain;
        }
        i18NBundleLoadBundle.parent = i18NBundleLoadBundleChain;
        return i18NBundleLoadBundle;
    }

    public static void setExceptionOnMissingKey(boolean z) {
        exceptionOnMissingKey = z;
    }

    private void setLocale(Locale locale) {
        this.locale = locale;
        this.formatter = new TextFormatter(locale, !simpleFormatter);
    }

    public static void setSimpleFormatter(boolean z) {
        simpleFormatter = z;
    }

    private static FileHandle toFileHandle(FileHandle fileHandle, Locale locale) {
        StringBuilder stringBuilder = new StringBuilder(fileHandle.name());
        if (!locale.equals(ROOT_LOCALE)) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            String variant = locale.getVariant();
            boolean zEquals = "".equals(language);
            boolean zEquals2 = "".equals(country);
            boolean zEquals3 = "".equals(variant);
            if (!zEquals || !zEquals2 || !zEquals3) {
                stringBuilder.append('_');
                if (!zEquals3) {
                    stringBuilder.append(language).append('_').append(country).append('_').append(variant);
                } else if (zEquals2) {
                    stringBuilder.append(language);
                } else {
                    stringBuilder.append(language).append('_').append(country);
                }
            }
        }
        return fileHandle.sibling(stringBuilder.append(".properties").toString());
    }

    public void debug(String str) {
        ObjectMap.Keys<String> keys = this.properties.keys();
        if (keys == null) {
            return;
        }
        ObjectMap.Keys<String> it = keys.iterator();
        while (it.hasNext()) {
            this.properties.put(it.next(), str);
        }
    }

    public String format(String str, Object... objArr) {
        return this.formatter.format(get(str), objArr);
    }

    public String get(String str) {
        String str2 = this.properties.get(str);
        if (str2 == null) {
            I18NBundle i18NBundle = this.parent;
            if (i18NBundle != null) {
                str2 = i18NBundle.get(str);
            }
            if (str2 == null) {
                if (exceptionOnMissingKey) {
                    throw new MissingResourceException(AbstractC3888ke0.i("Can't find bundle key ", str), getClass().getName(), str);
                }
                return DM.B("???", str, "???");
            }
        }
        return str2;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public Set<String> keys() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ObjectMap.Keys<String> keys = this.properties.keys();
        if (keys != null) {
            ObjectMap.Keys<String> it = keys.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(it.next());
            }
        }
        return linkedHashSet;
    }

    public void load(Reader reader) throws IOException {
        ObjectMap<String, String> objectMap = new ObjectMap<>();
        this.properties = objectMap;
        PropertiesUtils.load(objectMap, reader);
    }

    public static I18NBundle createBundle(FileHandle fileHandle, Locale locale) {
        return createBundleImpl(fileHandle, locale, "UTF-8");
    }

    public static I18NBundle createBundle(FileHandle fileHandle, String str) {
        return createBundleImpl(fileHandle, Locale.getDefault(), str);
    }

    public static I18NBundle createBundle(FileHandle fileHandle, Locale locale, String str) {
        return createBundleImpl(fileHandle, locale, str);
    }
}
