package com.bykv.vk.openvk.preload.geckox.c;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.impl.Z;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.bykv.vk.openvk.preload.a.d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Map<String, Object>> f12954e;
    private Map<String, List<CheckRequestBodyModel.TargetChannel>> f;
    private com.bykv.vk.openvk.preload.geckox.d.a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f12955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a.a f12956i = new com.bykv.vk.openvk.preload.geckox.buffer.a.a();

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static class b extends RuntimeException {
        public b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.c$c, reason: collision with other inner class name */
    public static class C0054c extends RuntimeException {
        public C0054c(String str, Throwable th) {
            super(str, th);
        }
    }

    private static void b(List<Pair<String, com.bykv.vk.openvk.preload.geckox.f.a>> list) {
        if (list == null) {
            return;
        }
        Iterator<Pair<String, com.bykv.vk.openvk.preload.geckox.f.a>> it = list.iterator();
        while (it.hasNext()) {
            try {
                ((com.bykv.vk.openvk.preload.geckox.f.a) it.next().second).a();
            } catch (Exception e2) {
                GeckoLogger.e("gecko-debug-tag", "releaseLock:", e2);
            }
        }
    }

    private List<Pair<String, com.bykv.vk.openvk.preload.geckox.f.a>> c(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UpdatePackage updatePackage : list) {
            try {
                File file = new File(new File(this.d.n(), updatePackage.getAccessKey()), updatePackage.getChannel());
                if (file.isFile()) {
                    com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
                }
                if (!file.mkdirs() && !file.isDirectory()) {
                    GeckoLogger.d("gecko-debug-tag", "can not create channel dir：", file.getAbsolutePath());
                    throw new RuntimeException("can not create channel dir:" + file.getAbsolutePath());
                }
                com.bykv.vk.openvk.preload.geckox.f.a aVarA = com.bykv.vk.openvk.preload.geckox.f.a.a(file.getAbsolutePath() + File.separator + "update.lock");
                if (aVarA != null) {
                    arrayList.add(new Pair(updatePackage.getChannel(), aVarA));
                    arrayList2.add(updatePackage);
                } else {
                    com.bykv.vk.openvk.preload.geckox.d.a aVar = this.g;
                    updatePackage.getChannel();
                }
            } catch (Exception e2) {
                GeckoLogger.e("gecko-debug-tag", "filterChannel:", e2);
                updatePackage.getChannel();
                com.bykv.vk.openvk.preload.geckox.d.a aVar2 = this.g;
            }
        }
        list.clear();
        list.addAll(arrayList2);
        return arrayList;
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f12954e = (Map) objArr[1];
        this.f = (Map) objArr[2];
        this.g = (com.bykv.vk.openvk.preload.geckox.d.a) objArr[3];
        this.f12955h = (String) objArr[4];
    }

    private String b(Map<String, List<Pair<String, Long>>> map) {
        List<CheckRequestBodyModel.TargetChannel> list;
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        Context contextA = this.d.a();
        checkRequestBodyModel.setCommon(new Common(this.d.k(), this.d.o(), this.d.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), com.bykv.vk.openvk.preload.geckox.utils.e.a(contextA), this.d.l(), this.d.m()));
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                map3.put(pair.first, localChannel);
            }
            map2.put(entry.getKey(), map3);
        }
        try {
            if (!map2.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str = (String) entry2.getKey();
                    Map map4 = (Map) entry2.getValue();
                    if (map4 != null && !map4.isEmpty()) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry entry3 : map4.entrySet()) {
                            jSONObject2.put((String) entry3.getKey(), ((CheckRequestBodyModel.LocalChannel) entry3.getValue()).toJson());
                        }
                        jSONObject.put(str, jSONObject2);
                    }
                }
                this.f12956i.f12932a = jSONObject.toString();
            }
            checkRequestBodyModel.setLocal(map2);
            HashMap map5 = new HashMap();
            for (String str2 : this.d.e()) {
                CheckRequestBodyModel.Group group = new CheckRequestBodyModel.Group();
                group.groupName = this.f12955h;
                Map<String, List<CheckRequestBodyModel.TargetChannel>> map6 = this.f;
                if (map6 != null && !map6.isEmpty() && (list = this.f.get(str2)) != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    group.targetChannels = arrayList;
                    arrayList.addAll(list);
                }
                map5.put(str2, group);
            }
            if (!map5.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry entry4 : map5.entrySet()) {
                    Object value = entry4.getValue();
                    if (value != null && (value instanceof CheckRequestBodyModel.Group)) {
                        jSONObject3.put((String) entry4.getKey(), ((CheckRequestBodyModel.Group) value).toJson());
                    }
                }
                this.f12956i.f12933b = jSONObject3.toString();
            }
            checkRequestBodyModel.setDeployments(map5);
            Map<String, Map<String, Object>> map7 = this.f12954e;
            if (map7 != null) {
                if (!map7.isEmpty()) {
                    JSONObject jSONObject4 = new JSONObject();
                    for (Map.Entry<String, Map<String, Object>> entry5 : this.f12954e.entrySet()) {
                        String key = entry5.getKey();
                        Map<String, Object> value2 = entry5.getValue();
                        if (value2 != null && !value2.isEmpty()) {
                            JSONObject jSONObject5 = new JSONObject();
                            for (Map.Entry<String, Object> entry6 : value2.entrySet()) {
                                Object value3 = entry6.getValue();
                                if (value3 instanceof String) {
                                    jSONObject5.put(entry6.getKey(), value3);
                                }
                            }
                            jSONObject4.put(key, jSONObject5);
                        }
                    }
                    this.f12956i.f12934c = jSONObject4.toString();
                }
                checkRequestBodyModel.setCustom(this.f12954e);
            }
            return checkRequestBodyModel.toJson();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.d
    public Object a(com.bykv.vk.openvk.preload.a.b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) throws Exception {
        List<Pair<String, com.bykv.vk.openvk.preload.geckox.f.a>> listC;
        GeckoLogger.d("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        Map<String, List<UpdatePackage>> mapA = a(map);
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.f12956i);
        Iterator<Map.Entry<String, List<UpdatePackage>>> it = mapA.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<UpdatePackage> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                UpdatePackage next = it2.next();
                long localVersion = next.getLocalVersion();
                long version = next.getVersion();
                if (version < localVersion) {
                    GeckoLogger.d("gecko-debug-tag", next.getChannel(), "rollback：", Long.valueOf(localVersion), "->", Long.valueOf(version));
                    File[] fileArrListFiles = new File(this.d.n(), next.getAccessKey() + File.separator + next.getChannel()).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.c.c.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        for (File file : fileArrListFiles) {
                            try {
                                long j = Long.parseLong(file.getName());
                                if (j > version) {
                                    final File file2 = new File(file.getParent(), file.getName() + "--pending-delete");
                                    file.renameTo(file2);
                                    com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.c.c.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.bykv.vk.openvk.preload.geckox.utils.b.a(file2);
                                        }
                                    });
                                } else if (j == version) {
                                    it2.remove();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<UpdatePackage>>> it3 = mapA.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(it3.next().getValue());
        }
        Object objA = null;
        try {
            listC = c(arrayList);
            try {
                objA = bVar.a(arrayList);
                b(listC);
                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
            } catch (Throwable th) {
                th = th;
                try {
                    GeckoLogger.e("gecko-debug-tag", "filterChannel:", th);
                    b(listC);
                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                } catch (Throwable th2) {
                    b(listC);
                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            listC = null;
        }
        a(arrayList);
        return objA;
    }

    private void a(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return;
        }
        for (UpdatePackage updatePackage : list) {
            com.bykv.vk.openvk.preload.geckox.a.c.a(new File(new File(this.d.n(), updatePackage.getAccessKey()), updatePackage.getChannel()).getAbsolutePath());
        }
    }

    private Map<String, List<UpdatePackage>> a(Map<String, List<Pair<String, Long>>> map) throws Exception {
        String strB = b(map);
        String str = "https://" + this.d.j() + "/gecko/server/v3/package";
        try {
            this.f12956i.f = com.bykv.vk.openvk.preload.geckox.utils.e.a(this.d.a());
            Response responseDoPost = this.d.i().doPost(str, strB);
            com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar = this.f12956i;
            aVar.g = responseDoPost.code;
            aVar.d = responseDoPost.msg;
            Map<String, String> map2 = responseDoPost.headers;
            String str2 = "";
            if (map2 != null && !map2.isEmpty()) {
                String str3 = map2.get("x-tt-logid");
                if (TextUtils.isEmpty(str3)) {
                    str3 = map2.get("X-Tt-Logid");
                    if (TextUtils.isEmpty(str3)) {
                        String str4 = map2.get("X-TT-LOGID");
                        if (!TextUtils.isEmpty(str4)) {
                            str2 = str4;
                        }
                    } else {
                        str2 = str3;
                    }
                } else {
                    str2 = str3;
                }
            }
            aVar.f12935e = str2;
            if (responseDoPost.code == 200) {
                String str5 = responseDoPost.body;
                GeckoLogger.d("gecko-debug-tag", "response:", str5);
                try {
                    com.bykv.vk.openvk.preload.geckox.model.Response response = new com.bykv.vk.openvk.preload.geckox.model.Response();
                    response.fromJson(str5);
                    int i2 = response.status;
                    if (i2 != 0) {
                        if (i2 == 2000) {
                            com.bykv.vk.openvk.preload.geckox.a.a.a(this.d);
                            return new HashMap();
                        }
                        String str6 = "check update error，unknow status code，response.status：" + response.status;
                        com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar2 = this.f12956i;
                        aVar2.d = str6;
                        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, aVar2);
                        throw new a(str6);
                    }
                    if (response.data != null) {
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.d.a(), response.data.getUniversalStrategies(), this.d.n(), this.g);
                        Map<String, List<UpdatePackage>> packages = response.data.getPackages();
                        if (packages != null && !packages.isEmpty()) {
                            for (String str7 : this.d.e()) {
                                List<UpdatePackage> list = packages.get(str7);
                                if (list != null && !list.isEmpty()) {
                                    for (UpdatePackage updatePackage : list) {
                                        updatePackage.setAccessKey(str7);
                                        updatePackage.setLocalVersion(a(map.get(str7), updatePackage.getChannel()));
                                    }
                                }
                            }
                            return packages;
                        }
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.d);
                        return new HashMap();
                    }
                    com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar3 = this.f12956i;
                    aVar3.d = "check update error：response.data==null";
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, aVar3);
                    throw new a("check update error：response.data==null");
                } catch (Throwable th) {
                    this.f12956i.d = androidx.datastore.preferences.protobuf.a.o(th, new StringBuilder("json parse failed："));
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.f12956i);
                    throw new b(androidx.datastore.preferences.protobuf.a.o(th, android.support.v4.media.a.y("json parse failed：", str5, " caused by:")), th);
                }
            }
            throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
        } catch (Exception e2) {
            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.f12956i);
            throw new C0054c(Z.m(e2, android.support.v4.media.a.y("request failed：url:", str, ", caused by:")), e2);
        }
    }

    private static long a(List<Pair<String, Long>> list, String str) {
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0L;
    }
}
