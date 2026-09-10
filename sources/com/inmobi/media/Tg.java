package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.inmobi.media.Tg;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Tg {
    public static int a = Integer.MIN_VALUE;
    public static Boolean b = null;
    public static String c = null;
    public static String d = null;
    public static String e = null;
    public static String f = null;
    public static String g = null;
    public static String h = null;
    public static int i = Integer.MIN_VALUE;
    public static String j;
    public static String k;
    public static String l;
    public static String m;
    public static Location n;

    public static void a(final boolean z) {
        b = Boolean.valueOf(z);
        final Context context = Ji.a;
        if (context != null) {
            Runnable runnable = new Runnable() { // from class: adsuki.brighton
                @Override // java.lang.Runnable
                public final void run() {
                    Tg.a(context, z);
                }
            };
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            Ji.g.submit(runnable);
        }
    }

    public static Location b() {
        Location location = n;
        if (location != null) {
            return location;
        }
        Context context = Ji.a;
        Location location2 = null;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.b;
        Ea eaA = Da.a(context, "user_info_store");
        Intrinsics.checkNotNullParameter("user_location", com.ironsource.X3.i.W);
        String string = eaA.a.getString("user_location", null);
        if (string == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] strArr = (String[]) new Regex(",").split(string, 0).toArray(new String[0]);
            location3.setLatitude(Double.parseDouble(strArr[0]));
            location3.setLongitude(Double.parseDouble(strArr[1]));
            location3.setAccuracy(Float.parseFloat(strArr[2]));
            location3.setTime(Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        n = location2;
        return location2;
    }

    public static final void a(Context context, boolean z) {
        ConcurrentHashMap concurrentHashMap = Ea.b;
        Ea.a(Da.a(context, "user_info_store"), "user_age_restricted", z);
    }

    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        int i2 = a;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            Context context = Ji.a;
            if (context == null) {
                i2 = Integer.MIN_VALUE;
            } else {
                ConcurrentHashMap concurrentHashMap = Ea.b;
                Ea eaA = Da.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age", com.ironsource.X3.i.W);
                i2 = eaA.a.getInt("user_age", Integer.MIN_VALUE);
            }
            a = i2;
        }
        if (i2 > 0) {
            map.put("u-age", String.valueOf(i2));
        }
        int i4 = i;
        if (i4 == Integer.MIN_VALUE) {
            Context context2 = Ji.a;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.b;
                Ea eaA2 = Da.a(context2, "user_info_store");
                Intrinsics.checkNotNullParameter("user_yob", com.ironsource.X3.i.W);
                i3 = eaA2.a.getInt("user_yob", Integer.MIN_VALUE);
            }
            i = i3;
            i4 = i3;
        }
        if (i4 > 0) {
            map.put("u-yearofbirth", String.valueOf(i4));
        }
        String string = f;
        String string2 = null;
        if (string == null) {
            Context context3 = Ji.a;
            if (context3 == null) {
                string = null;
            } else {
                ConcurrentHashMap concurrentHashMap3 = Ea.b;
                Ea eaA3 = Da.a(context3, "user_info_store");
                Intrinsics.checkNotNullParameter("user_city_code", com.ironsource.X3.i.W);
                string = eaA3.a.getString("user_city_code", null);
            }
            f = string;
        }
        String string3 = g;
        if (string3 == null) {
            Context context4 = Ji.a;
            if (context4 == null) {
                string3 = null;
            } else {
                ConcurrentHashMap concurrentHashMap4 = Ea.b;
                Ea eaA4 = Da.a(context4, "user_info_store");
                Intrinsics.checkNotNullParameter("user_state_code", com.ironsource.X3.i.W);
                string3 = eaA4.a.getString("user_state_code", null);
            }
            g = string3;
        }
        String string4 = h;
        if (string4 == null) {
            Context context5 = Ji.a;
            if (context5 == null) {
                string4 = null;
            } else {
                ConcurrentHashMap concurrentHashMap5 = Ea.b;
                Ea eaA5 = Da.a(context5, "user_info_store");
                Intrinsics.checkNotNullParameter("user_country_code", com.ironsource.X3.i.W);
                string4 = eaA5.a.getString("user_country_code", null);
            }
            h = string4;
        }
        String strA = a(string, string3, string4);
        int length = strA.length() - 1;
        boolean zBooleanValue = false;
        int i5 = 0;
        boolean z = false;
        while (i5 <= length) {
            boolean z2 = Intrinsics.taiyuan(strA.charAt(!z ? i5 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i5++;
            } else {
                z = true;
            }
        }
        if (strA.subSequence(i5, length + 1).toString().length() > 0) {
            map.put("u-location", strA);
        }
        String string5 = c;
        if (string5 == null) {
            Context context6 = Ji.a;
            if (context6 == null) {
                string5 = null;
            } else {
                ConcurrentHashMap concurrentHashMap6 = Ea.b;
                Ea eaA6 = Da.a(context6, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_group", com.ironsource.X3.i.W);
                string5 = eaA6.a.getString("user_age_group", null);
            }
            c = string5;
        }
        if (string5 != null) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = string5.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put("u-agegroup", lowerCase);
        }
        String string6 = d;
        if (string6 == null) {
            Context context7 = Ji.a;
            if (context7 == null) {
                string6 = null;
            } else {
                ConcurrentHashMap concurrentHashMap7 = Ea.b;
                Ea eaA7 = Da.a(context7, "user_info_store");
                Intrinsics.checkNotNullParameter("user_area_code", com.ironsource.X3.i.W);
                string6 = eaA7.a.getString("user_area_code", null);
            }
            d = string6;
        }
        if (string6 != null) {
            map.put("u-areacode", string6);
        }
        String string7 = e;
        if (string7 == null) {
            Context context8 = Ji.a;
            if (context8 == null) {
                string7 = null;
            } else {
                ConcurrentHashMap concurrentHashMap8 = Ea.b;
                Ea eaA8 = Da.a(context8, "user_info_store");
                Intrinsics.checkNotNullParameter("user_post_code", com.ironsource.X3.i.W);
                string7 = eaA8.a.getString("user_post_code", null);
            }
            e = string7;
        }
        if (string7 != null) {
            map.put("u-postalcode", string7);
        }
        String string8 = j;
        if (string8 == null) {
            Context context9 = Ji.a;
            if (context9 == null) {
                string8 = null;
            } else {
                ConcurrentHashMap concurrentHashMap9 = Ea.b;
                Ea eaA9 = Da.a(context9, "user_info_store");
                Intrinsics.checkNotNullParameter("user_gender", com.ironsource.X3.i.W);
                string8 = eaA9.a.getString("user_gender", null);
            }
            j = string8;
        }
        if (string8 != null) {
            map.put("u-gender", string8);
        }
        String string9 = k;
        if (string9 == null) {
            Context context10 = Ji.a;
            if (context10 == null) {
                string9 = null;
            } else {
                ConcurrentHashMap concurrentHashMap10 = Ea.b;
                Ea eaA10 = Da.a(context10, "user_info_store");
                Intrinsics.checkNotNullParameter("user_education", com.ironsource.X3.i.W);
                string9 = eaA10.a.getString("user_education", null);
            }
            k = string9;
        }
        if (string9 != null) {
            map.put("u-education", string9);
        }
        String string10 = l;
        if (string10 == null) {
            Context context11 = Ji.a;
            if (context11 == null) {
                string10 = null;
            } else {
                ConcurrentHashMap concurrentHashMap11 = Ea.b;
                Ea eaA11 = Da.a(context11, "user_info_store");
                Intrinsics.checkNotNullParameter("user_language", com.ironsource.X3.i.W);
                string10 = eaA11.a.getString("user_language", null);
            }
            l = string10;
        }
        if (string10 != null) {
            map.put("u-language", string10);
        }
        String str2 = m;
        if (str2 == null) {
            Context context12 = Ji.a;
            if (context12 != null) {
                ConcurrentHashMap concurrentHashMap12 = Ea.b;
                Ea eaA12 = Da.a(context12, "user_info_store");
                Intrinsics.checkNotNullParameter("user_interest", com.ironsource.X3.i.W);
                string2 = eaA12.a.getString("user_interest", null);
            }
            m = string2;
            str2 = string2;
        }
        if (str2 != null) {
            map.put("u-interests", str2);
        }
        Boolean bool = b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context13 = Ji.a;
            if (context13 != null) {
                ConcurrentHashMap concurrentHashMap13 = Ea.b;
                Ea eaA13 = Da.a(context13, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                b = Boolean.valueOf(eaA13.a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            }
        }
        if (zBooleanValue) {
            str = "1";
        } else {
            str = "0";
        }
        map.put("u-age-restricted", str);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    public static String a(String str, String str2, String str3) {
        String string;
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.taiyuan(str.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() > 0) {
                int length2 = str.length() - 1;
                int i3 = 0;
                boolean z3 = false;
                while (i3 <= length2) {
                    boolean z4 = Intrinsics.taiyuan(str.charAt(!z3 ? i3 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i3++;
                    } else {
                        z3 = true;
                    }
                }
                string = str.subSequence(i3, length2 + 1).toString();
            } else {
                string = "";
            }
        } else {
            string = "";
        }
        if (str2 != null) {
            int length3 = str2.length() - 1;
            int i4 = 0;
            boolean z5 = false;
            while (i4 <= length3) {
                boolean z6 = Intrinsics.taiyuan(str2.charAt(!z5 ? i4 : length3), 32) <= 0;
                if (z5) {
                    if (!z6) {
                        break;
                    }
                    length3--;
                } else if (z6) {
                    i4++;
                } else {
                    z5 = true;
                }
            }
            if (str2.subSequence(i4, length3 + 1).toString().length() > 0) {
                int length4 = str2.length() - 1;
                int i5 = 0;
                boolean z7 = false;
                while (i5 <= length4) {
                    boolean z8 = Intrinsics.taiyuan(str2.charAt(!z7 ? i5 : length4), 32) <= 0;
                    if (z7) {
                        if (!z8) {
                            break;
                        }
                        length4--;
                    } else if (z8) {
                        i5++;
                    } else {
                        z7 = true;
                    }
                }
                string = string + "-" + str2.subSequence(i5, length4 + 1).toString();
            }
        }
        if (str3 == null) {
            return string;
        }
        int length5 = str3.length() - 1;
        int i6 = 0;
        boolean z9 = false;
        while (i6 <= length5) {
            boolean z10 = Intrinsics.taiyuan(str3.charAt(!z9 ? i6 : length5), 32) <= 0;
            if (z9) {
                if (!z10) {
                    break;
                }
                length5--;
            } else if (z10) {
                i6++;
            } else {
                z9 = true;
            }
        }
        if (str3.subSequence(i6, length5 + 1).toString().length() <= 0) {
            return string;
        }
        int length6 = str3.length() - 1;
        int i7 = 0;
        boolean z11 = false;
        while (i7 <= length6) {
            boolean z12 = Intrinsics.taiyuan(str3.charAt(!z11 ? i7 : length6), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                }
                length6--;
            } else if (z12) {
                i7++;
            } else {
                z11 = true;
            }
        }
        return string + "-" + str3.subSequence(i7, length6 + 1).toString();
    }

    public static String a(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy()) + "," + location.getTime();
    }
}
