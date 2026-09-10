package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.ironsource.kd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0429kd implements M7, M7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f29053a = "CappingManager.IS_DELIVERY_ENABLED";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29054b = "CappingManager.IS_CAPPING_ENABLED";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f29055c = "CappingManager.IS_PACING_ENABLED";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f29056d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f29057e = "CappingManager.CAPPING_TYPE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f29058f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f29059g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f29060h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f29061i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* JADX INFO: renamed from: com.ironsource.kd$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29062a;

        static {
            int[] iArr = new int[EnumC0447ld.values().length];
            f29062a = iArr;
            try {
                iArr[EnumC0447ld.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29062a[EnumC0447ld.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.kd$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    @Override // com.ironsource.M7
    public synchronized b a(Context context, AbstractC0473n3 abstractC0473n3, IronSource.a aVar) {
        try {
            if (context == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC0473n3 == null) {
                return b.NOT_CAPPED;
            }
            String strA = a(aVar);
            if (abstractC0473n3.c() == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC0473n3.a() == null) {
                return b.NOT_CAPPED;
            }
            return b(context, strA, abstractC0473n3.c());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.ironsource.M7.a
    public synchronized void b(Context context, AbstractC0473n3 abstractC0473n3, IronSource.a aVar) {
        if (context == null || abstractC0473n3 == null) {
            return;
        }
        C0376hd c0376hdA = abstractC0473n3.a();
        if (c0376hdA == null) {
            return;
        }
        a(context, a(aVar), abstractC0473n3.c(), c0376hdA);
    }

    @Override // com.ironsource.M7
    public synchronized boolean c(Context context, AbstractC0473n3 abstractC0473n3, IronSource.a aVar) {
        return a(context, abstractC0473n3, aVar) != b.NOT_CAPPED;
    }

    private b b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, a(str, f29053a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.a(context, a(str, f29055c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.a(context, a(str, f29061i, str2), 0L) < IronSourceUtils.a(context, a(str, f29058f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.a(context, a(str, f29054b, str2), false)) {
            int iA = IronSourceUtils.a(context, a(str, f29056d, str2), 0);
            String strA = a(str, f29059g, str2);
            int iA2 = IronSourceUtils.a(context, strA, 0);
            String strA2 = a(str, f29060h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.a(context, strA2, 0L)) {
                IronSourceUtils.b(context, strA, 0);
                IronSourceUtils.b(context, strA2, 0L);
            } else if (iA2 >= iA) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.M7.a
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
        EnumC0447ld enumC0447ld;
        int i10 = 0;
        if (IronSourceUtils.a(context, a(str, f29055c, str2), false)) {
            IronSourceUtils.b(context, a(str, f29061i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, a(str, f29054b, str2), false)) {
            String strA = a(str, f29059g, str2);
            int iA = IronSourceUtils.a(context, strA, 0);
            if (iA == 0) {
                String strC = IronSourceUtils.c(context, a(str, f29057e, str2), EnumC0447ld.PER_DAY.toString());
                EnumC0447ld[] enumC0447ldArrValues = EnumC0447ld.values();
                int length = enumC0447ldArrValues.length;
                while (true) {
                    if (i10 >= length) {
                        enumC0447ld = null;
                        break;
                    }
                    enumC0447ld = enumC0447ldArrValues[i10];
                    if (enumC0447ld.f29184a.equals(strC)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                IronSourceUtils.b(context, a(str, f29060h, str2), a(enumC0447ld));
            }
            IronSourceUtils.b(context, strA, iA + 1);
        }
    }

    private long a(EnumC0447ld enumC0447ld) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i10 = a.f29062a[enumC0447ld.ordinal()];
        if (i10 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i10 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private void a(Context context, String str, String str2, C0376hd c0376hd) {
        boolean zE = c0376hd.e();
        IronSourceUtils.b(context, a(str, f29053a, str2), zE);
        if (zE) {
            boolean zD = c0376hd.d();
            IronSourceUtils.b(context, a(str, f29054b, str2), zD);
            if (zD) {
                IronSourceUtils.b(context, a(str, f29056d, str2), c0376hd.b());
                IronSourceUtils.f(context, a(str, f29057e, str2), c0376hd.a().toString());
            }
            boolean zF = c0376hd.f();
            IronSourceUtils.b(context, a(str, f29055c, str2), zF);
            if (zF) {
                IronSourceUtils.b(context, a(str, f29058f, str2), c0376hd.c());
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
