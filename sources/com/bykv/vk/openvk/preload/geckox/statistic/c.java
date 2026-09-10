package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.fl;
import com.p004ironsource.ne;
import com.zg.adlib.storage.AppPreferencesKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar) {
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params_for_special", "gecko");
                jSONObject.put(AppPreferencesKeys.DEVICE_ID, bVar.r());
                jSONObject.put(ne.f26256E, 0);
                jSONObject.put("app_version", bVar.o());
                jSONObject.put("api_version", com.smartdigimkt.b0.a.k);
                jSONObject.put(fl.SESSION_HISTORY_KEY_AD_ID, bVar.k());
                jSONObject.put("x_tt_logid", aVar.f12935e);
                jSONObject.put("http_status", aVar.g);
                jSONObject.put("err_msg", aVar.d);
                if (TextUtils.isEmpty(aVar.f12935e)) {
                    jSONObject.put("deployments_info", aVar.f12933b);
                    jSONObject.put("local_info", aVar.f12932a);
                    jSONObject.put("custom_info", aVar.f12934c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Build.VERSION.SDK_INT);
                jSONObject.put(com.smartdigimkt.b0.a.h1, sb.toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put("ac", aVar.f);
                iStatisticMonitorQ.upload("geckosdk_query_pkgs", jSONObject);
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (aVar.f13012z && aVar.f12999A) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f13001a;
            packageStatisticModel.groupName = aVar.f13002b;
            packageStatisticModel.channel = aVar.f13003c;
            packageStatisticModel.ac = aVar.f13008n;
            packageStatisticModel.id = aVar.f13009p;
            packageStatisticModel.downloadRetryTimes = a(aVar.f13010u);
            packageStatisticModel.downloadUrl = aVar.t;
            packageStatisticModel.downloadFailRecords = b(aVar.f13010u);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f13011w - aVar.v);
            if (aVar.f13000B) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f13001a;
                packageStatisticModel2.groupName = aVar.f13002b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.id = aVar.f13009p;
                packageStatisticModel2.channel = aVar.f13003c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.x - aVar.f13011w);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.y - aVar.x);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f13001a;
            packageStatisticModel3.groupName = aVar.f13002b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.id = aVar.f13009p;
            packageStatisticModel3.channel = aVar.f13003c;
            packageStatisticModel3.errMsg = aVar.D;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f13001a;
        packageStatisticModel4.groupName = aVar.f13002b;
        packageStatisticModel4.channel = aVar.f13003c;
        packageStatisticModel4.ac = aVar.f13008n;
        packageStatisticModel4.id = aVar.f13009p;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f13010u);
        packageStatisticModel4.downloadUrl = aVar.t;
        packageStatisticModel4.downloadFailRecords = b(aVar.f13010u);
        if (!aVar.f13012z) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f13010u;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f13010u.get(0).reason;
            return;
        }
        if (aVar.f12999A) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.C;
    }

    public static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        StatisticModel statisticModel;
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.d != null || aVar2.f != 0) {
                if (aVar2.f13005h && aVar2.f13006i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f13002b;
                    packageStatisticModel.accessKey = aVar2.f13001a;
                    packageStatisticModel.channel = aVar2.f13003c;
                    packageStatisticModel.ac = aVar2.f13008n;
                    packageStatisticModel.id = aVar2.f13009p;
                    packageStatisticModel.patchId = aVar2.o;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f13004e);
                    packageStatisticModel.downloadUrl = aVar2.d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f13004e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.g - aVar2.f);
                    if (!aVar2.j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f13003c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.r;
                        packageStatisticModel2.ac = aVar2.f13008n;
                        packageStatisticModel2.patchId = aVar2.o;
                        packageStatisticModel2.id = aVar2.f13009p;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f13004e);
                        packageStatisticModel2.downloadUrl = aVar2.d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f13004e);
                    } else if (aVar2.k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f13001a;
                        packageStatisticModel3.groupName = aVar2.f13002b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.o;
                        packageStatisticModel3.id = aVar2.f13009p;
                        packageStatisticModel3.channel = aVar2.f13003c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f13007l - aVar2.g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.m - aVar2.f13007l);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f13001a;
                        packageStatisticModel4.groupName = aVar2.f13002b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f13003c;
                        packageStatisticModel4.patchId = aVar2.o;
                        packageStatisticModel4.id = aVar2.f13009p;
                        packageStatisticModel4.errMsg = aVar2.s;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f13001a;
                    packageStatisticModel5.groupName = aVar2.f13002b;
                    packageStatisticModel5.channel = aVar2.f13003c;
                    packageStatisticModel5.ac = aVar2.f13008n;
                    packageStatisticModel5.patchId = aVar2.o;
                    packageStatisticModel5.id = aVar2.f13009p;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f13004e);
                    packageStatisticModel5.downloadUrl = aVar2.d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f13004e);
                    if (!aVar2.f13005h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f13004e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f13004e.get(0).reason;
                        }
                    } else if (!aVar2.f13006i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.q;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context contextA = bVar.a();
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.a.a(contextA));
        if (arrayList.isEmpty()) {
            statisticModel = null;
        } else {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), e.a(contextA), bVar.l(), bVar.m());
            statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages = arrayList;
            String string = UUID.randomUUID().toString();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((StatisticModel.PackageStatisticModel) it.next()).logId = string;
            }
        }
        if (statisticModel == null || statisticModel.packages == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                for (StatisticModel.PackageStatisticModel packageStatisticModel6 : statisticModel.packages) {
                    Common common2 = statisticModel.common;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("params_for_special", "gecko");
                    jSONObject.put(TtmlNode.TAG_REGION, common2.region);
                    jSONObject.put("err_code", packageStatisticModel6.errCode);
                    jSONObject.put("err_msg", packageStatisticModel6.errMsg);
                    jSONObject.put(com.smartdigimkt.b0.a.s1, common2.sdkVersion);
                    jSONObject.put("access_key", packageStatisticModel6.accessKey);
                    jSONObject.put("stats_type", packageStatisticModel6.statsType);
                    jSONObject.put(AppPreferencesKeys.DEVICE_ID, common2.deviceId);
                    Long l2 = packageStatisticModel6.patchId;
                    jSONObject.put("patch_id", l2 == null ? 0L : l2.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put(ne.f26256E, common2.os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put("channel", packageStatisticModel6.channel);
                    Long l3 = packageStatisticModel6.id;
                    jSONObject.put("id", l3 == null ? 0L : l3.longValue());
                    jSONObject.put("ac", common2.ac);
                    Integer num = packageStatisticModel6.downloadRetryTimes;
                    jSONObject.put("download_retry_times", num == null ? 0 : num.intValue());
                    String str = packageStatisticModel6.downloadUrl;
                    Object obj = "";
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(DownloadModel.DOWNLOAD_URL, str);
                    jSONObject.put("download_duration", packageStatisticModel6.downloadDuration);
                    List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = packageStatisticModel6.downloadFailRecords;
                    if (list2 != null) {
                        obj = list2;
                    }
                    jSONObject.put("download_fail_records", obj);
                    jSONObject.put("log_id", packageStatisticModel6.logId);
                    Long l4 = packageStatisticModel6.activeCheckDuration;
                    jSONObject.put("active_check_duration", l4 == null ? 0L : l4.longValue());
                    Long l5 = packageStatisticModel6.applyDuration;
                    jSONObject.put("apply_duration", l5 == null ? 0L : l5.longValue());
                    iStatisticMonitorQ.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
        if (bVar.c()) {
            try {
                final String json = statisticModel.toJson();
                if (TextUtils.isEmpty(json)) {
                    return;
                }
                final String str2 = "https://" + bVar.j() + "/gecko/server/packages/stats";
                com.bykv.vk.openvk.preload.geckox.b.g().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (int i2 = 0; i2 < 3; i2++) {
                            try {
                                Response responseDoPost = bVar.i().doPost(str2, json);
                                if (responseDoPost.code != 200) {
                                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str2);
                                }
                                if (new JSONObject(responseDoPost.body).getInt("status") == 0) {
                                    return;
                                }
                            } catch (Exception e2) {
                                GeckoLogger.w("gecko-debug-tag", "upload statistic:", e2);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
