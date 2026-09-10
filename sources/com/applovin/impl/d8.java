package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DateFormat f7760a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Random f7761b = new Random(System.currentTimeMillis());

    public static void a(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, w7 w7Var, int i10, com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        }
        Set setA = a(v7Var, lVar);
        if (CollectionUtils.isEmpty(setA)) {
            return;
        }
        a(setA, w7Var, lVar);
    }

    public static boolean b(r7 r7Var) {
        e8 e8VarL1;
        List listG;
        return (r7Var == null || (e8VarL1 = r7Var.l1()) == null || (listG = e8VarL1.g()) == null || listG.isEmpty()) ? false : true;
    }

    public static w7 c(r7 r7Var) {
        if (b(r7Var) || a(r7Var)) {
            return null;
        }
        return w7.GENERAL_WRAPPER_ERROR;
    }

    private static String b() {
        DateFormat dateFormat = f7760a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean a(r7 r7Var) {
        u7 u7VarC1;
        z7 z7VarE;
        if (r7Var == null || (u7VarC1 = r7Var.c1()) == null || (z7VarE = u7VarC1.e()) == null) {
            return false;
        }
        return z7VarE.c() != null || StringUtils.isValidString(z7VarE.b());
    }

    public static boolean b(q8 q8Var) {
        if (q8Var != null) {
            return q8Var.b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static Uri a(String str, long j10, Uri uri, w7 w7Var, com.applovin.impl.sdk.l lVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String string = Integer.toString(w7Var.b());
                String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
                if (j10 >= 0) {
                    strReplace = strReplace.replace("[CONTENTPLAYHEAD]", a(j10));
                }
                if (uri != null) {
                    strReplace = strReplace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(strReplace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th2) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastUtils", "Unable to replace macros in URL string " + str, th2);
                }
                lVar.E().a("VastUtils", th2);
                return null;
            }
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j10) {
        if (j10 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j10);
            long minutes = timeUnit.toMinutes(j10);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j10 % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    private static String a() {
        return Integer.toString(f7761b.nextInt(89999999) + 10000000);
    }

    public static void a(Set set, com.applovin.impl.sdk.l lVar) {
        a(set, -1L, (Uri) null, w7.UNSPECIFIED, lVar);
    }

    public static void a(Set set, w7 w7Var, com.applovin.impl.sdk.l lVar) {
        a(set, -1L, (Uri) null, w7Var, lVar);
    }

    public static void a(Set set, long j10, Uri uri, w7 w7Var, com.applovin.impl.sdk.l lVar) {
        if (lVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                b8 b8Var = (b8) it.next();
                long j11 = j10;
                Uri uri2 = uri;
                w7 w7Var2 = w7Var;
                com.applovin.impl.sdk.l lVar2 = lVar;
                Uri uriA = a(b8Var.c(), j11, uri2, w7Var2, lVar2);
                if (uriA != null) {
                    lVar2.h0().a(com.applovin.impl.sdk.network.d.b().d(uriA.toString()).a(false).b(b8Var.d()).a(), false);
                }
                j10 = j11;
                uri = uri2;
                w7Var = w7Var2;
                lVar = lVar2;
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(q8 q8Var, Map map, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        List<q8> listA;
        if (lVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (q8Var == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        q8 q8VarC = q8Var.c("TrackingEvents");
        if (q8VarC == null || (listA = q8VarC.a("Tracking")) == null) {
            return;
        }
        for (q8 q8Var2 : listA) {
            String str = (String) q8Var2.a().get(NotificationCompat.CATEGORY_EVENT);
            if (StringUtils.isValidString(str)) {
                b8 b8VarA = b8.a(q8Var2, v7Var, lVar);
                if (b8VarA != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(b8VarA);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(b8VarA);
                        map.put(str, hashSet);
                    }
                }
            } else {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().b("VastUtils", "Could not find event for tracking node = " + q8Var2);
                }
            }
        }
    }

    public static void a(List list, Set set, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b8 b8VarA = b8.a((q8) it.next(), v7Var, lVar);
            if (b8VarA != null) {
                set.add(b8VarA);
            }
        }
    }

    public static boolean a(q8 q8Var) {
        if (q8Var != null) {
            return q8Var.b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static String a(v7 v7Var) {
        q8 q8VarB;
        if (v7Var != null) {
            List listA = v7Var.a();
            int size = v7Var.a().size();
            if (size <= 0 || (q8VarB = ((q8) listA.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return q8VarB.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(q8 q8Var, String str, String str2) {
        q8 q8VarC = q8Var.c(str);
        if (q8VarC != null) {
            String strD = q8VarC.d();
            if (StringUtils.isValidString(strD)) {
                return strD;
            }
        }
        return str2;
    }

    private static Set a(v7 v7Var, com.applovin.impl.sdk.l lVar) {
        List listA;
        if (v7Var == null) {
            return null;
        }
        List<q8> listA2 = v7Var.a();
        HashSet hashSet = new HashSet(listA2.size());
        for (q8 q8Var : listA2) {
            q8 q8VarB = q8Var.b("Wrapper");
            if (q8VarB == null) {
                q8VarB = q8Var.b("InLine");
            }
            if (q8VarB != null) {
                listA = q8VarB.a("Error");
            } else {
                listA = q8Var.a("Error");
            }
            hashSet = a(hashSet, listA, v7Var, lVar);
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static HashSet a(HashSet hashSet, List list, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b8 b8VarA = b8.a((q8) it.next(), v7Var, lVar);
                if (b8VarA != null) {
                    hashSet.add(b8VarA);
                }
            }
        }
        return hashSet;
    }
}
