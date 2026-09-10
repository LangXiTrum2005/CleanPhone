package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.network.VungleApiClient;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3624hd0 {
    public static final C3448fd0 Companion = new C3448fd0(null);
    private static final String FAILED_GENERIC_TPATS = "FAILED_GENERIC_TPATS";
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final int MAX_RETRIES = 5;
    private static final String TAG = "TpatSender";
    private final C2919Yt genericTpatFilePreferences;
    private final C4126nJ logEntry;
    private final L60 signalManager;
    private final C2919Yt tpatFilePreferences;
    private final VungleApiClient vungleApiClient;

    public C3624hd0(VungleApiClient vungleApiClient, C4126nJ c4126nJ, Executor executor, ZT zt, L60 l60) {
        AbstractC2995aW.q(vungleApiClient, "vungleApiClient");
        AbstractC2995aW.q(executor, "ioExecutor");
        AbstractC2995aW.q(zt, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.logEntry = c4126nJ;
        this.signalManager = l60;
        C2893Xt c2893Xt = C2919Yt.Companion;
        this.tpatFilePreferences = c2893Xt.get(executor, zt, C2919Yt.TPAT_FAILED_FILENAME);
        this.genericTpatFilePreferences = c2893Xt.get(executor, zt, C2919Yt.GENERIC_TPAT_FAILED_FILENAME);
    }

    private final Map<String, C2352Cx> getStoredGenericTpats() {
        Object objV;
        String string = this.genericTpatFilePreferences.getString(FAILED_GENERIC_TPATS);
        if (string == null) {
            return new LinkedHashMap();
        }
        try {
            UE ue = VE.d;
            M40 m40 = ue.b;
            int i = C4387qG.c;
            objV = (Map) ue.a(AbstractC3375el.V(m40, AbstractC3263dY.b(AbstractC3263dY.c(C2443Gk.e(AbstractC3263dY.d(String.class)), C2443Gk.e(AbstractC3263dY.d(C2352Cx.class))))), string);
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        Throwable thA = IZ.a(objV);
        if (thA != null) {
            C4917wJ.Companion.e(TAG, "Failed to decode stored generic tpats: " + thA);
        }
        if (objV instanceof HZ) {
            objV = null;
        }
        Map<String, C2352Cx> map = (Map) objV;
        return map == null ? new LinkedHashMap() : map;
    }

    private final Map<String, Integer> getStoredTpats() {
        Object objV;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        if (string == null) {
            return new LinkedHashMap();
        }
        try {
            UE ue = VE.d;
            M40 m40 = ue.b;
            int i = C4387qG.c;
            objV = (Map) ue.a(AbstractC3375el.V(m40, AbstractC3263dY.b(AbstractC3263dY.c(C2443Gk.e(AbstractC3263dY.d(String.class)), C2443Gk.e(AbstractC3263dY.d(Integer.TYPE))))), string);
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        Throwable thA = IZ.a(objV);
        if (thA != null) {
            C4917wJ.Companion.e(TAG, "Failed to decode stored tpats: " + thA);
        }
        if (objV instanceof HZ) {
            objV = null;
        }
        Map<String, Integer> map = (Map) objV;
        return map == null ? new LinkedHashMap() : map;
    }

    private final void logTpatError(C2528Jr c2528Jr, String str) {
        C4917wJ.Companion.e(TAG, "Failed with " + c2528Jr.getDescription() + ", url:" + str);
        EnumC4719u30 reason = c2528Jr.getReason();
        StringBuilder sbU = AbstractC3950lJ.u("Fail to send ", str, ", error: ");
        sbU.append(c2528Jr.getDescription());
        new C3272dd0(reason, sbU.toString()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
    }

    private final void saveStoredGenericTpats(Map<String, C2352Cx> map) {
        Object objV;
        try {
            C2919Yt c2919Yt = this.genericTpatFilePreferences;
            UE ue = VE.d;
            M40 m40 = ue.b;
            int i = C4387qG.c;
            c2919Yt.put(FAILED_GENERIC_TPATS, ue.b(AbstractC3375el.V(m40, AbstractC3263dY.b(AbstractC3263dY.c(C2443Gk.e(AbstractC3263dY.d(String.class)), C2443Gk.e(AbstractC3263dY.d(C2352Cx.class))))), map)).apply();
            objV = C5033xf0.f5238a;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        if (IZ.a(objV) != null) {
            C4917wJ.Companion.e(TAG, "Failed to encode the about to storing generic tpats: " + map);
        }
    }

    private final void saveStoredTpats(Map<String, Integer> map) {
        Object objV;
        try {
            C2919Yt c2919Yt = this.tpatFilePreferences;
            UE ue = VE.d;
            M40 m40 = ue.b;
            int i = C4387qG.c;
            c2919Yt.put(FAILED_TPATS, ue.b(AbstractC3375el.V(m40, AbstractC3263dY.b(AbstractC3263dY.c(C2443Gk.e(AbstractC3263dY.d(String.class)), C2443Gk.e(AbstractC3263dY.d(Integer.TYPE))))), map)).apply();
            objV = C5033xf0.f5238a;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        if (IZ.a(objV) != null) {
            C4917wJ.Companion.e(TAG, "Failed to encode the about to storing tpats: " + map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGenericTpat$lambda-3, reason: not valid java name */
    public static final void m246sendGenericTpat$lambda3(C3624hd0 c3624hd0, String str, C2352Cx c2352Cx, String str2, boolean z) {
        C2528Jr c2528JrPingTPAT$default;
        AbstractC2995aW.q(c3624hd0, "this$0");
        AbstractC2995aW.q(str, "$url");
        AbstractC2995aW.q(c2352Cx, "$request");
        AbstractC2995aW.q(str2, "$urlWithSessionId");
        Map<String, C2352Cx> storedGenericTpats = c3624hd0.getStoredGenericTpats();
        C2352Cx c2352Cx2 = storedGenericTpats.get(str);
        int attempt = c2352Cx2 != null ? c2352Cx2.getAttempt() : 0;
        int i = AbstractC3536gd0.$EnumSwitchMapping$0[c2352Cx.getMethod().ordinal()];
        if (i == 1) {
            c2528JrPingTPAT$default = VungleApiClient.pingTPAT$default(c3624hd0.vungleApiClient, str2, c2352Cx.getHeaders(), null, null, c3624hd0.logEntry, 12, null);
        } else {
            if (i != 2) {
                throw new C3770jF(7, 0);
            }
            c2528JrPingTPAT$default = c3624hd0.vungleApiClient.pingTPAT(str2, c2352Cx.getHeaders(), c2352Cx.getBody(), XA.POST, c3624hd0.logEntry);
        }
        if (c2528JrPingTPAT$default == null) {
            if (attempt != 0) {
                storedGenericTpats.remove(str);
                c3624hd0.saveStoredGenericTpats(storedGenericTpats);
                return;
            }
            return;
        }
        if (!c2528JrPingTPAT$default.getErrorIsTerminal() && z) {
            if (attempt >= 5) {
                storedGenericTpats.remove(str);
                c3624hd0.saveStoredGenericTpats(storedGenericTpats);
                new C3272dd0(EnumC4719u30.TPAT_RETRY_FAILED, str2).setLogEntry$vungle_ads_release(c3624hd0.logEntry).logErrorNoReturnValue$vungle_ads_release();
            } else {
                C2352Cx c2352Cx3 = storedGenericTpats.get(str);
                C2352Cx c2352CxCopy$default = c2352Cx3 != null ? C2352Cx.copy$default(c2352Cx3, null, null, null, attempt + 1, 7, null) : null;
                if (c2352CxCopy$default == null) {
                    c2352CxCopy$default = new C2352Cx(c2352Cx.getMethod(), c2352Cx.getHeaders(), c2352Cx.getBody(), attempt + 1);
                }
                storedGenericTpats.put(str, c2352CxCopy$default);
                c3624hd0.saveStoredGenericTpats(storedGenericTpats);
            }
        }
        c3624hd0.logTpatError(c2528JrPingTPAT$default, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendTpat$lambda-2, reason: not valid java name */
    public static final void m247sendTpat$lambda2(C3624hd0 c3624hd0, String str, String str2) {
        AbstractC2995aW.q(c3624hd0, "this$0");
        AbstractC2995aW.q(str, "$url");
        AbstractC2995aW.q(str2, "$urlWithSessionId");
        Map<String, Integer> storedTpats = c3624hd0.getStoredTpats();
        Integer num = storedTpats.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        C2528Jr c2528JrPingTPAT$default = VungleApiClient.pingTPAT$default(c3624hd0.vungleApiClient, str2, null, null, null, c3624hd0.logEntry, 14, null);
        if (c2528JrPingTPAT$default == null) {
            if (iIntValue != 0) {
                storedTpats.remove(str);
                c3624hd0.saveStoredTpats(storedTpats);
                return;
            }
            return;
        }
        if (!c2528JrPingTPAT$default.getErrorIsTerminal()) {
            if (iIntValue >= 5) {
                storedTpats.remove(str);
                c3624hd0.saveStoredTpats(storedTpats);
                new C3272dd0(EnumC4719u30.TPAT_RETRY_FAILED, str2).setLogEntry$vungle_ads_release(c3624hd0.logEntry).logErrorNoReturnValue$vungle_ads_release();
            } else {
                storedTpats.put(str, Integer.valueOf(iIntValue + 1));
                c3624hd0.saveStoredTpats(storedTpats);
            }
        }
        c3624hd0.logTpatError(c2528JrPingTPAT$default, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendWinNotification$lambda-0, reason: not valid java name */
    public static final void m248sendWinNotification$lambda0(C3624hd0 c3624hd0, String str) {
        AbstractC2995aW.q(c3624hd0, "this$0");
        AbstractC2995aW.q(str, "$url");
        C2528Jr c2528JrPingTPAT$default = VungleApiClient.pingTPAT$default(c3624hd0.vungleApiClient, str, null, null, null, c3624hd0.logEntry, 14, null);
        if (c2528JrPingTPAT$default != null) {
            EnumC4719u30 enumC4719u30 = EnumC4719u30.AD_WIN_NOTIFICATION_ERROR;
            StringBuilder sbU = AbstractC3950lJ.u("Fail to send ", str, ", error: ");
            sbU.append(c2528JrPingTPAT$default.getDescription());
            new C3272dd0(enumC4719u30, sbU.toString()).setLogEntry$vungle_ads_release(c3624hd0.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public final C4126nJ getLogEntry() {
        return this.logEntry;
    }

    public final L60 getSignalManager() {
        return this.signalManager;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    @VisibleForTesting
    public final String injectSessionIdToUrl(String str) {
        String uuid;
        AbstractC2995aW.q(str, "url");
        L60 l60 = this.signalManager;
        if (l60 == null || (uuid = l60.getUuid()) == null) {
            uuid = "";
        }
        if (uuid.length() <= 0) {
            return str;
        }
        String strQuote = Pattern.quote(C2390Ej.SESSION_ID);
        AbstractC2995aW.p(strQuote, "quote(Constants.SESSION_ID)");
        Pattern patternCompile = Pattern.compile(strQuote);
        AbstractC2995aW.p(patternCompile, "compile(pattern)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll(uuid);
        AbstractC2995aW.p(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    public final void resendStoredTpats$vungle_ads_release(Executor executor) {
        AbstractC2995aW.q(executor, "executor");
        Iterator<Map.Entry<String, Integer>> it = getStoredTpats().entrySet().iterator();
        while (it.hasNext()) {
            sendTpat(it.next().getKey(), executor);
        }
        for (Map.Entry<String, C2352Cx> entry : getStoredGenericTpats().entrySet()) {
            String key = entry.getKey();
            C2352Cx value = entry.getValue();
            sendGenericTpat(key, new C2352Cx(value.getMethod(), value.getHeaders(), value.getBody(), 0, 8, (AbstractC2471Hm) null), true, executor);
        }
    }

    public final void sendGenericTpat(final String str, final C2352Cx c2352Cx, final boolean z, Executor executor) {
        AbstractC2995aW.q(str, "url");
        AbstractC2995aW.q(c2352Cx, J0.REQUEST_KEY_EXTRA);
        AbstractC2995aW.q(executor, "executor");
        final String strInjectSessionIdToUrl = injectSessionIdToUrl(str);
        executor.execute(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ed0
            @Override // java.lang.Runnable
            public final void run() {
                C3624hd0.m246sendGenericTpat$lambda3(this.f4325a, str, c2352Cx, strInjectSessionIdToUrl, z);
            }
        });
    }

    public final void sendTpat(String str, Executor executor) {
        AbstractC2995aW.q(str, "url");
        AbstractC2995aW.q(executor, "executor");
        executor.execute(new RunnableC4746uO(this, str, injectSessionIdToUrl(str), 18));
    }

    public final void sendTpats(Iterable<String> iterable, Executor executor) {
        AbstractC2995aW.q(iterable, "urls");
        AbstractC2995aW.q(executor, "executor");
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            sendTpat(it.next(), executor);
        }
    }

    public final void sendWinNotification(String str, Executor executor) {
        AbstractC2995aW.q(str, "urlString");
        AbstractC2995aW.q(executor, "executor");
        executor.execute(new Ff0(14, this, injectSessionIdToUrl(str)));
    }

    public /* synthetic */ C3624hd0(VungleApiClient vungleApiClient, C4126nJ c4126nJ, Executor executor, ZT zt, L60 l60, int i, AbstractC2471Hm abstractC2471Hm) {
        this(vungleApiClient, (i & 2) != 0 ? null : c4126nJ, executor, zt, (i & 16) != 0 ? null : l60);
    }
}
