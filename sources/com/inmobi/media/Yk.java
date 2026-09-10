package com.inmobi.media;

import android.content.Context;
import arytenoidectomy.wireman;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.iab.omid.library.inmobi.Omid;
import duvetyn.beachfront;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.saran;
import okhttp3.rotuma;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import patroclinal.taiyuan;
import picketboat.saneness;
import pussyfooter.attabal;

/* JADX INFO: loaded from: classes3.dex */
public final class Yk {
    public static boolean b;
    public static final Yk a = new Yk();
    public static final Sk c = new Sk();

    public static boolean a() {
        int i;
        try {
            polloi.saneness(rotuma.class).taiyuan();
            i = 0;
        } catch (NoClassDefFoundError unused) {
            i = 1;
        }
        try {
            polloi.saneness(beachfront.class).taiyuan();
        } catch (NoClassDefFoundError unused2) {
            i++;
        }
        try {
            polloi.saneness(saran.class).taiyuan();
        } catch (NoClassDefFoundError unused3) {
            i++;
        }
        try {
            polloi.saneness(premeiotic.class).taiyuan();
        } catch (NoClassDefFoundError unused4) {
            i++;
        }
        try {
            polloi.saneness(AdvertisingIdClient.class).taiyuan();
        } catch (NoClassDefFoundError unused5) {
            i++;
        }
        try {
            polloi.saneness(saneness.class).taiyuan();
        } catch (NoClassDefFoundError unused6) {
            i++;
        }
        try {
            polloi.saneness(attabal.class).taiyuan();
        } catch (NoClassDefFoundError unused7) {
            i++;
        }
        try {
            polloi.saneness(wireman.class).taiyuan();
        } catch (NoClassDefFoundError unused8) {
            i++;
        }
        try {
            polloi.saneness(Omid.class).taiyuan();
        } catch (NoClassDefFoundError unused9) {
            i++;
        }
        return i > 0;
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = Ea.b;
        Ea eaA = Da.a(context, "sdk_version_store");
        Intrinsics.checkNotNullParameter("sdk_version", com.ironsource.X3.i.W);
        if (eaA.a.getString("sdk_version", null) == null) {
            return true;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Ea eaA2 = Da.a(context, "sdk_version_store");
        Intrinsics.checkNotNullParameter("sdk_version", com.ironsource.X3.i.W);
        return !Intrinsics.wireman(eaA2.a.getString("sdk_version", null), "11.1.0");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r8.a(r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p002kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yk.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (b(context)) {
                T6.a(context);
                Intrinsics.checkNotNullParameter(context, "context");
                ConcurrentHashMap concurrentHashMap = Ea.b;
                Ea.a(Da.a(context, "sdk_version_store"), "db_deletion_failed", true);
                Context context2 = Ji.a;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                Ji.a(applicationContext);
            }
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r7.b(r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(p002kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yk.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
