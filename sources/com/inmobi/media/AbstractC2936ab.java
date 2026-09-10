package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: com.inmobi.media.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2936ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23443a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f23444b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f23445c = null;
    public static String d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f23446e = null;
    public static String f = null;
    public static String g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f23447h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f23448i = Integer.MIN_VALUE;
    public static String j;
    public static String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f23449l;
    public static String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Location f23450n;

    public static void a(boolean z2) {
        f23444b = Boolean.valueOf(z2);
        Context contextD = Uc.d();
        if (contextD != null) {
            Uc.a(new A.K(1, contextD, z2));
        }
    }

    public static Location b() {
        Location location = f23450n;
        if (location != null) {
            return location;
        }
        Context contextD = Uc.d();
        Location location2 = null;
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            String string = B6.a(contextD, "user_info_store").f22735a.getString("user_location", null);
            if (string != null) {
                Location location3 = new Location("");
                try {
                    String[] strArr = (String[]) new Regex(",").f(string, 0).toArray(new String[0]);
                    location3.setLatitude(Double.parseDouble(strArr[0]));
                    location3.setLongitude(Double.parseDouble(strArr[1]));
                    location3.setAccuracy(Float.parseFloat(strArr[2]));
                    location3.setTime(Long.parseLong(strArr[3]));
                    location2 = location3;
                } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
                }
                f23450n = location2;
                return location2;
            }
        }
        return null;
    }

    public static boolean c() {
        Boolean bool = f23444b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context contextD = Uc.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            f23444b = Boolean.valueOf(B6.a(contextD, "user_info_store").f22735a.getBoolean("user_age_restricted", false));
        }
        Boolean bool2 = f23444b;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public static final void a(Context it, boolean z2) {
        Intrinsics.f(it, "$it");
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        C6.a(B6.a(it, "user_info_store"), "user_age_restricted", z2, false, 4, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    public static HashMap a() {
        String string;
        String str;
        HashMap map = new HashMap();
        int i2 = f23443a;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            Context contextD = Uc.d();
            if (contextD == null) {
                i2 = Integer.MIN_VALUE;
            } else {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                i2 = B6.a(contextD, "user_info_store").f22735a.getInt("user_age", Integer.MIN_VALUE);
            }
            f23443a = i2;
        }
        if (i2 > 0) {
            map.put("u-age", String.valueOf(i2));
        }
        int i4 = f23448i;
        if (i4 == Integer.MIN_VALUE) {
            Context contextD2 = Uc.d();
            if (contextD2 != null) {
                ConcurrentHashMap concurrentHashMap2 = C6.f22734b;
                i3 = B6.a(contextD2, "user_info_store").f22735a.getInt("user_yob", Integer.MIN_VALUE);
            }
            f23448i = i3;
            i4 = i3;
        }
        if (i4 > 0) {
            map.put("u-yearofbirth", String.valueOf(i4));
        }
        String string2 = f;
        String string3 = null;
        if (string2 == null) {
            Context contextD3 = Uc.d();
            if (contextD3 == null) {
                string2 = null;
            } else {
                ConcurrentHashMap concurrentHashMap3 = C6.f22734b;
                string2 = B6.a(contextD3, "user_info_store").f22735a.getString("user_city_code", null);
            }
            f = string2;
        }
        String string4 = g;
        if (string4 == null) {
            Context contextD4 = Uc.d();
            if (contextD4 == null) {
                string4 = null;
            } else {
                ConcurrentHashMap concurrentHashMap4 = C6.f22734b;
                string4 = B6.a(contextD4, "user_info_store").f22735a.getString("user_state_code", null);
            }
            g = string4;
        }
        String string5 = f23447h;
        if (string5 == null) {
            Context contextD5 = Uc.d();
            if (contextD5 == null) {
                string5 = null;
            } else {
                ConcurrentHashMap concurrentHashMap5 = C6.f22734b;
                string5 = B6.a(contextD5, "user_info_store").f22735a.getString("user_country_code", null);
            }
            f23447h = string5;
        }
        if (string2 != null) {
            int length = string2.length() - 1;
            int i5 = 0;
            boolean z2 = false;
            while (i5 <= length) {
                boolean z3 = Intrinsics.h(string2.charAt(!z2 ? i5 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i5++;
                } else {
                    z2 = true;
                }
            }
            if (string2.subSequence(i5, length + 1).toString().length() > 0) {
                int length2 = string2.length() - 1;
                int i6 = 0;
                boolean z4 = false;
                while (i6 <= length2) {
                    boolean z5 = Intrinsics.h(string2.charAt(!z4 ? i6 : length2), 32) <= 0;
                    if (z4) {
                        if (!z5) {
                            break;
                        }
                        length2--;
                    } else if (z5) {
                        i6++;
                    } else {
                        z4 = true;
                    }
                }
                string = I7.a(length2, 1, string2, i6);
            } else {
                string = "";
            }
        } else {
            string = "";
        }
        if (string4 != null) {
            int length3 = string4.length() - 1;
            int i7 = 0;
            boolean z6 = false;
            while (i7 <= length3) {
                boolean z7 = Intrinsics.h(string4.charAt(!z6 ? i7 : length3), 32) <= 0;
                if (z6) {
                    if (!z7) {
                        break;
                    }
                    length3--;
                } else if (z7) {
                    i7++;
                } else {
                    z6 = true;
                }
            }
            if (string4.subSequence(i7, length3 + 1).toString().length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append('-');
                int length4 = string4.length() - 1;
                int i8 = 0;
                boolean z8 = false;
                while (i8 <= length4) {
                    boolean z9 = Intrinsics.h(string4.charAt(!z8 ? i8 : length4), 32) <= 0;
                    if (z8) {
                        if (!z9) {
                            break;
                        }
                        length4--;
                    } else if (z9) {
                        i8++;
                    } else {
                        z8 = true;
                    }
                }
                sb.append(string4.subSequence(i8, length4 + 1).toString());
                string = sb.toString();
            }
        }
        if (string5 != null) {
            int length5 = string5.length() - 1;
            int i9 = 0;
            boolean z10 = false;
            while (i9 <= length5) {
                boolean z11 = Intrinsics.h(string5.charAt(!z10 ? i9 : length5), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length5--;
                } else if (z11) {
                    i9++;
                } else {
                    z10 = true;
                }
            }
            if (string5.subSequence(i9, length5 + 1).toString().length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append('-');
                int length6 = string5.length() - 1;
                int i10 = 0;
                boolean z12 = false;
                while (i10 <= length6) {
                    boolean z13 = Intrinsics.h(string5.charAt(!z12 ? i10 : length6), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length6--;
                    } else if (z13) {
                        i10++;
                    } else {
                        z12 = true;
                    }
                }
                sb2.append(string5.subSequence(i10, length6 + 1).toString());
                string = sb2.toString();
            }
        }
        int length7 = string.length() - 1;
        int i11 = 0;
        boolean z14 = false;
        while (i11 <= length7) {
            boolean z15 = Intrinsics.h(string.charAt(!z14 ? i11 : length7), 32) <= 0;
            if (z14) {
                if (!z15) {
                    break;
                }
                length7--;
            } else if (z15) {
                i11++;
            } else {
                z14 = true;
            }
        }
        if (string.subSequence(i11, length7 + 1).toString().length() > 0) {
            map.put("u-location", string);
        }
        String string6 = f23445c;
        if (string6 == null) {
            Context contextD6 = Uc.d();
            if (contextD6 == null) {
                string6 = null;
            } else {
                ConcurrentHashMap concurrentHashMap6 = C6.f22734b;
                string6 = B6.a(contextD6, "user_info_store").f22735a.getString("user_age_group", null);
            }
            f23445c = string6;
        }
        if (string6 != null) {
            Locale locale = Locale.ENGLISH;
            map.put("u-agegroup", com.applovin.impl.Z.p(locale, "ENGLISH", string6, locale, "this as java.lang.String).toLowerCase(locale)"));
        }
        String string7 = d;
        if (string7 == null) {
            Context contextD7 = Uc.d();
            if (contextD7 == null) {
                string7 = null;
            } else {
                ConcurrentHashMap concurrentHashMap7 = C6.f22734b;
                string7 = B6.a(contextD7, "user_info_store").f22735a.getString("user_area_code", null);
            }
            d = string7;
        }
        if (string7 != null) {
            map.put("u-areacode", string7);
        }
        String string8 = f23446e;
        if (string8 == null) {
            Context contextD8 = Uc.d();
            if (contextD8 == null) {
                string8 = null;
            } else {
                ConcurrentHashMap concurrentHashMap8 = C6.f22734b;
                string8 = B6.a(contextD8, "user_info_store").f22735a.getString("user_post_code", null);
            }
            f23446e = string8;
        }
        if (string8 != null) {
            map.put("u-postalcode", string8);
        }
        String string9 = j;
        if (string9 == null) {
            Context contextD9 = Uc.d();
            if (contextD9 == null) {
                string9 = null;
            } else {
                ConcurrentHashMap concurrentHashMap9 = C6.f22734b;
                string9 = B6.a(contextD9, "user_info_store").f22735a.getString("user_gender", null);
            }
            j = string9;
        }
        if (string9 != null) {
            map.put("u-gender", string9);
        }
        String string10 = k;
        if (string10 == null) {
            Context contextD10 = Uc.d();
            if (contextD10 == null) {
                string10 = null;
            } else {
                ConcurrentHashMap concurrentHashMap10 = C6.f22734b;
                string10 = B6.a(contextD10, "user_info_store").f22735a.getString("user_education", null);
            }
            k = string10;
        }
        if (string10 != null) {
            map.put("u-education", string10);
        }
        String string11 = f23449l;
        if (string11 == null) {
            Context contextD11 = Uc.d();
            if (contextD11 == null) {
                string11 = null;
            } else {
                ConcurrentHashMap concurrentHashMap11 = C6.f22734b;
                string11 = B6.a(contextD11, "user_info_store").f22735a.getString("user_language", null);
            }
            f23449l = string11;
        }
        if (string11 != null) {
            map.put("u-language", string11);
        }
        String str2 = m;
        if (str2 == null) {
            Context contextD12 = Uc.d();
            if (contextD12 != null) {
                ConcurrentHashMap concurrentHashMap12 = C6.f22734b;
                string3 = B6.a(contextD12, "user_info_store").f22735a.getString("user_interest", null);
            }
            m = string3;
            str2 = string3;
        }
        if (str2 != null) {
            map.put("u-interests", str2);
        }
        if (c()) {
            str = "1";
        } else {
            str = "0";
        }
        map.put("u-age-restricted", str);
        return map;
    }
}
