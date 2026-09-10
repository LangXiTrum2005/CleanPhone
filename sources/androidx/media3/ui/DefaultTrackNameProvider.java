package androidx.media3.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f7690a;

    public DefaultTrackNameProvider(Resources resources) {
        resources.getClass();
        this.f7690a = resources;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    @Override // androidx.media3.ui.TrackNameProvider
    public final String a(Format format) {
        String strB;
        String string;
        String strC;
        int iG = MimeTypes.g(format.m);
        int i2 = format.f5400A;
        int i3 = format.t;
        int i4 = format.s;
        if (iG == -1) {
            String str = null;
            String str2 = format.j;
            if (str2 == null) {
                strC = null;
                break;
            }
            String[] strArrR = Util.R(str2);
            int length = strArrR.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    strC = null;
                    break;
                }
                strC = MimeTypes.c(strArrR[i5]);
                if (strC != null && MimeTypes.k(strC)) {
                    break;
                }
                i5++;
            }
            if (strC == null) {
                if (str2 != null) {
                    for (String str3 : Util.R(str2)) {
                        String strC2 = MimeTypes.c(str3);
                        if (strC2 != null && MimeTypes.h(strC2)) {
                            str = strC2;
                            break;
                        }
                    }
                }
                if (str != null) {
                    iG = 1;
                } else if (i4 != -1 || i3 != -1) {
                    iG = 2;
                } else if (i2 == -1 && format.f5401B == -1) {
                    iG = -1;
                } else {
                    iG = 1;
                }
            } else {
                iG = 2;
            }
        }
        Resources resources = this.f7690a;
        int i6 = format.f5411i;
        if (iG == 2) {
            strB = d(c(format), (i4 == -1 || i3 == -1) ? "" : resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i6 != -1 ? resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_bitrate, Float.valueOf(i6 / 1000000.0f)) : "");
        } else if (iG == 1) {
            String strB2 = b(format);
            if (i2 == -1 || i2 < 1) {
                string = "";
            } else if (i2 == 1) {
                string = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_mono);
            } else if (i2 == 2) {
                string = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_stereo);
            } else if (i2 == 6 || i2 == 7) {
                string = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_surround_5_point_1);
            } else {
                string = i2 != 8 ? resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_surround) : resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_surround_7_point_1);
            }
            strB = d(strB2, string, i6 != -1 ? resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_bitrate, Float.valueOf(i6 / 1000000.0f)) : "");
        } else {
            strB = b(format);
        }
        if (strB.length() != 0) {
            return strB;
        }
        String str4 = format.d;
        return (str4 == null || str4.trim().isEmpty()) ? resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_unknown) : resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_unknown_name, str4);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    public final String b(Format format) {
        String displayName;
        String str = format.d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            int i2 = Util.f5683a;
            Locale localeForLanguageTag = i2 >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
            Locale locale = i2 >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strD = d(displayName, c(format));
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        String str2 = format.f5407b;
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    public final String c(Format format) {
        int i2 = format.f & 2;
        Resources resources = this.f7690a;
        String string = i2 != 0 ? resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_role_alternate) : "";
        int i3 = format.f;
        if ((i3 & 4) != 0) {
            string = d(string, resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_role_supplementary));
        }
        if ((i3 & 8) != 0) {
            string = d(string, resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_role_commentary));
        }
        return (i3 & 1088) != 0 ? d(string, resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_role_closed_captions)) : string;
    }

    public final String d(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f7690a.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_item_list, string, str);
            }
        }
        return string;
    }
}
