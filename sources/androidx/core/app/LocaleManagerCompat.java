package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.util.Log;
import android.util.Xml;
import androidx.core.os.LocaleListCompat;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleManagerCompat {

    public static class Api21Impl {
        public static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class Api24Impl {
        public static LocaleListCompat a(Configuration configuration) {
            return LocaleListCompat.b(configuration.getLocales().toLanguageTags());
        }
    }

    public static class Api33Impl {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static LocaleList b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0060 A[EXC_TOP_SPLITTER, PHI: r1
  0x0060: PHI (r1v4 java.lang.String) = (r1v1 java.lang.String), (r1v6 java.lang.String) binds: [B:37:0x006d, B:31:0x005e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static LocaleListCompat a(Context context) {
        String attributeValue;
        if (Build.VERSION.SDK_INT >= 33) {
            Object systemService = context.getSystemService("locale");
            return systemService != null ? LocaleListCompat.g(Api33Impl.a(systemService)) : LocaleListCompat.f4353b;
        }
        synchronized (AppLocalesStorageHelper.f4174a) {
            attributeValue = "";
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (IOException | XmlPullParserException unused2) {
                            Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                        }
                        if (attributeValue.isEmpty()) {
                            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        }
                    } catch (Throwable th) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused4) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return LocaleListCompat.b(attributeValue);
    }
}
