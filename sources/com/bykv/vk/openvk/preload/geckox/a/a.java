package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.ne;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f12893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12894b = 1;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    public static class C0052a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f12897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f12898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12899c;
        long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        File f12900e;

        public C0052a(String str, String str2, int i2, long j, File file) {
            this.f12897a = str;
            this.f12898b = str2;
            this.f12899c = i2;
            this.d = j;
            this.f12900e = file;
        }
    }

    public a(List<String> list) {
        this.f12893a = list;
    }

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, com.bykv.vk.openvk.preload.geckox.d.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        List<Long> listB;
        List<Long> listB2;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ComponentModel.b> entry : map.entrySet()) {
                String key = entry.getKey();
                File file2 = new File(file, key);
                if (file2.isDirectory() && (value = entry.getValue()) != null && (list = value.f12989a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list2 = value.f12989a;
                    HashSet hashSet = new HashSet();
                    for (ComponentModel.a aVar2 : list2) {
                        String str = aVar2.f12986a;
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            int i2 = aVar2.f12987b;
                            List<Long> list3 = aVar2.f12988c;
                            File file3 = new File(file2, str);
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        File file4 = new File(file2, str);
                                        File file5 = new File(file2, str + "--pending-delete");
                                        file4.renameTo(file5);
                                        arrayList.add(new C0052a(key, str, i2, 0L, file5));
                                    }
                                } else if (list3 != null && (listB = g.b(file3)) != null && !listB.isEmpty()) {
                                    for (Long l2 : listB) {
                                        if (list3.get(0).longValue() > l2.longValue()) {
                                            File file6 = new File(file3, l2 + "--pending-delete");
                                            new File(file3, String.valueOf(l2)).renameTo(file6);
                                            arrayList.add(new C0052a(key, str, i2, l2.longValue(), file6));
                                        }
                                    }
                                }
                            } else if (list3 != null && (listB2 = g.b(file3)) != null && !listB2.isEmpty()) {
                                for (Long l3 : listB2) {
                                    if (list3.contains(l3)) {
                                        File file7 = new File(file3, l3 + "--pending-delete");
                                        new File(file3, String.valueOf(l3)).renameTo(file7);
                                        arrayList.add(new C0052a(key, str, i2, l3.longValue(), file7));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0052a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0052a c0052a : list4) {
                            File file8 = c0052a.f12900e;
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            boolean zA = com.bykv.vk.openvk.preload.geckox.utils.b.a(file8);
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            if (zA) {
                                b.a(context2).a(c0052a.f12897a, c0052a.f12898b, c0052a.f12899c, 200, c0052a.d, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                b.a(context2).a(c0052a.f12897a, c0052a.f12898b, c0052a.f12899c, 201, c0052a.d, IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (Exception e3) {
                    GeckoLogger.w("clean-channel", "", e3);
                }
            }
        });
    }

    public static List<StatisticModel.PackageStatisticModel> a(Context context) {
        return b.a(context).a();
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), e.a(bVar.a()), bVar.l(), bVar.m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = "https://" + bVar.j() + "/gecko/server/packages/stats";
            try {
                Response responseDoPost = bVar.i().doPost(str, statisticModel.toJson());
                if (responseDoPost.code == 200) {
                    if (new JSONObject(responseDoPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f12893a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < this.f12893a.size(); i2++) {
                    jSONArray.put(this.f12893a.get(i2));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put(ne.f26256E, 0);
            jSONObject.put("msg_type", this.f12894b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
