package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0209a> f38182a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0209a> f38183b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0209a> f38184c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0209a> f38185d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0209a> f38186e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0209a> f38187f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0209a> f38188g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0209a> f38189h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0209a> f38190i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0209a> f38191j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0209a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WindVaneWebView f38192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f38193b;

        public void a(WindVaneWebView windVaneWebView) {
            this.f38192a = windVaneWebView;
        }

        public WindVaneWebView b() {
            return this.f38192a;
        }

        public boolean c() {
            return this.f38193b;
        }

        public void a(String str) {
            WindVaneWebView windVaneWebView = this.f38192a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public String a() {
            WindVaneWebView windVaneWebView = this.f38192a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public void a(boolean z10) {
            this.f38193b = z10;
        }
    }

    public static void a(String str, C0209a c0209a, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                f38189h.put(str, c0209a);
                return;
            } else {
                f38188g.put(str, c0209a);
                return;
            }
        }
        if (z11) {
            f38191j.put(str, c0209a);
        } else {
            f38190i.put(str, c0209a);
        }
    }

    public static C0209a b(String str) {
        if (f38188g.containsKey(str)) {
            return f38188g.get(str);
        }
        if (f38189h.containsKey(str)) {
            return f38189h.get(str);
        }
        if (f38190i.containsKey(str)) {
            return f38190i.get(str);
        }
        if (f38191j.containsKey(str)) {
            return f38191j.get(str);
        }
        return null;
    }

    public static void c(String str) {
        for (Map.Entry<String, C0209a> entry : f38188g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f38188g.remove(entry.getKey());
            }
        }
    }

    public static void d(String str) {
        for (Map.Entry<String, C0209a> entry : f38189h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f38189h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        if (f38188g.containsKey(str)) {
            f38188g.remove(str);
        }
        if (f38190i.containsKey(str)) {
            f38190i.remove(str);
        }
        if (f38189h.containsKey(str)) {
            f38189h.remove(str);
        }
        if (f38191j.containsKey(str)) {
            f38191j.remove(str);
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f38188g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f38188g.remove(str2);
                }
            }
        } else {
            f38188g.clear();
        }
        f38189h.clear();
    }

    public static void b(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0209a> concurrentHashMap = f38183b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0209a> concurrentHashMap2 = f38186e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i10 != 287) {
                if (i10 != 288) {
                    ConcurrentHashMap<String, C0209a> concurrentHashMap3 = f38182a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0209a> concurrentHashMap4 = f38185d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0209a> concurrentHashMap5 = f38184c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0209a> concurrentHashMap6 = f38187f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        f38190i.clear();
        f38191j.clear();
    }

    public static C0209a a(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 != 94) {
                if (i10 != 287) {
                    if (i10 != 288) {
                        ConcurrentHashMap<String, C0209a> concurrentHashMap = f38182a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f38182a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0209a> concurrentHashMap2 = f38185d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f38185d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0209a> concurrentHashMap3 = f38184c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f38184c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0209a> concurrentHashMap4 = f38187f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f38187f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0209a> concurrentHashMap5 = f38183b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f38183b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0209a> concurrentHashMap6 = f38186e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f38186e.get(requestIdNotice);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i10, String str, C0209a c0209a) {
        try {
            if (i10 == 94) {
                if (f38186e == null) {
                    f38186e = new ConcurrentHashMap<>();
                }
                f38186e.put(str, c0209a);
            } else if (i10 == 287) {
                if (f38187f == null) {
                    f38187f = new ConcurrentHashMap<>();
                }
                f38187f.put(str, c0209a);
            } else if (i10 != 288) {
                if (f38182a == null) {
                    f38182a = new ConcurrentHashMap<>();
                }
                f38182a.put(str, c0209a);
            } else {
                if (f38185d == null) {
                    f38185d = new ConcurrentHashMap<>();
                }
                f38185d.put(str, c0209a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(int i10, String str, C0209a c0209a) {
        try {
            if (i10 == 94) {
                if (f38183b == null) {
                    f38183b = new ConcurrentHashMap<>();
                }
                f38183b.put(str, c0209a);
            } else {
                if (i10 != 287) {
                    return;
                }
                if (f38184c == null) {
                    f38184c = new ConcurrentHashMap<>();
                }
                f38184c.put(str, c0209a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
