package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3533gd implements K7, K7.a {
    private static final String a = "CappingManager.IS_DELIVERY_ENABLED";
    private static final String b = "CappingManager.IS_CAPPING_ENABLED";
    private static final String c = "CappingManager.IS_PACING_ENABLED";
    private static final String d = "CappingManager.MAX_NUMBER_OF_SHOWS";
    private static final String e = "CappingManager.CAPPING_TYPE";
    private static final String f = "CappingManager.SECONDS_BETWEEN_SHOWS";
    private static final String g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";
    private static final String h = "CappingManager.CAPPING_TIME_THRESHOLD";
    private static final String i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* JADX INFO: renamed from: com.ironsource.gd$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC3551hd.values().length];
            a = iArr;
            try {
                iArr[EnumC3551hd.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC3551hd.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.gd$b */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    @Override // com.ironsource.K7
    public synchronized b a(Context context, AbstractC3648n3 abstractC3648n3, IronSource.a aVar) {
        try {
            if (context == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC3648n3 == null) {
                return b.NOT_CAPPED;
            }
            String strA = a(aVar);
            if (abstractC3648n3.c() == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC3648n3.a() == null) {
                return b.NOT_CAPPED;
            }
            return b(context, strA, abstractC3648n3.c());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.K7.a
    public synchronized void b(Context context, AbstractC3648n3 abstractC3648n3, IronSource.a aVar) {
        if (context == null || abstractC3648n3 == null) {
            return;
        }
        C3479dd c3479ddA = abstractC3648n3.a();
        if (c3479ddA == null) {
            return;
        }
        a(context, a(aVar), abstractC3648n3.c(), c3479ddA);
    }

    @Override // com.ironsource.K7
    public synchronized boolean c(Context context, AbstractC3648n3 abstractC3648n3, IronSource.a aVar) {
        return a(context, abstractC3648n3, aVar) != b.NOT_CAPPED;
    }

    private b b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, a(str, a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.a(context, a(str, c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.a(context, a(str, i, str2), 0L) < IronSourceUtils.a(context, a(str, f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.a(context, a(str, b, str2), false)) {
            int iA = IronSourceUtils.a(context, a(str, d, str2), 0);
            String strA = a(str, g, str2);
            int iA2 = IronSourceUtils.a(context, strA, 0);
            String strA2 = a(str, h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.a(context, strA2, 0L)) {
                IronSourceUtils.b(context, strA, 0);
                IronSourceUtils.b(context, strA2, 0L);
            } else if (iA2 >= iA) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.K7.a
    public synchronized void a(Context context, String str, IronSource.a aVar) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(aVar), str);
    }

    private String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    private void a(Context context, String str, String str2) {
        EnumC3551hd enumC3551hd;
        int i2 = 0;
        if (IronSourceUtils.a(context, a(str, c, str2), false)) {
            IronSourceUtils.b(context, a(str, i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, a(str, b, str2), false)) {
            String strA = a(str, g, str2);
            int iA = IronSourceUtils.a(context, strA, 0);
            if (iA == 0) {
                String strC = IronSourceUtils.c(context, a(str, e, str2), EnumC3551hd.PER_DAY.toString());
                EnumC3551hd[] enumC3551hdArrValues = EnumC3551hd.values();
                int length = enumC3551hdArrValues.length;
                while (true) {
                    if (i2 >= length) {
                        enumC3551hd = null;
                        break;
                    }
                    enumC3551hd = enumC3551hdArrValues[i2];
                    if (enumC3551hd.a.equals(strC)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                IronSourceUtils.b(context, a(str, h, str2), a(enumC3551hd));
            }
            IronSourceUtils.b(context, strA, iA + 1);
        }
    }

    private long a(EnumC3551hd enumC3551hd) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i2 = a.a[enumC3551hd.ordinal()];
        if (i2 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i2 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private void a(Context context, String str, String str2, C3479dd c3479dd) {
        boolean zE = c3479dd.e();
        IronSourceUtils.b(context, a(str, a, str2), zE);
        if (zE) {
            boolean zD = c3479dd.d();
            IronSourceUtils.b(context, a(str, b, str2), zD);
            if (zD) {
                IronSourceUtils.b(context, a(str, d, str2), c3479dd.b());
                IronSourceUtils.f(context, a(str, e, str2), c3479dd.a().toString());
            }
            boolean zF = c3479dd.f();
            IronSourceUtils.b(context, a(str, c, str2), zF);
            if (zF) {
                IronSourceUtils.b(context, a(str, f, str2), c3479dd.c());
            }
        }
    }

    private String a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return "Interstitial";
        }
        if (aVar == IronSource.a.BANNER) {
            return "Banner";
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceConstants.NATIVE_AD_UNIT;
        }
        return aVar.toString();
    }
}
