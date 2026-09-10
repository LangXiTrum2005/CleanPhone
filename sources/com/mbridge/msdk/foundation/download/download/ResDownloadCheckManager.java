package com.mbridge.msdk.foundation.download.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.o0;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ResDownloadCheckManager {
    private static ConcurrentHashMap<String, Boolean> recordImageMap = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Boolean> campaignStateMap;
    private ConcurrentHashMap<String, Boolean> preLoadSuccessedMap;
    private ConcurrentHashMap<String, Boolean> recordVideoMap;
    private ConcurrentHashMap<String, Boolean> recordZipMap;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Holder {
        public static ResDownloadCheckManager instance = new ResDownloadCheckManager();

        private Holder() {
        }
    }

    private void addImageUrlToMap(List<String> list) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        if (list == null || list.size() == 0) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (concurrentHashMap = recordImageMap) != null && !concurrentHashMap.containsKey(str)) {
                boolean zC = b.a(c.n().d()).c(str);
                if (!TextUtils.isEmpty(str)) {
                    recordImageMap.put(str, Boolean.valueOf(zC));
                }
            }
        }
    }

    private void addUrlToMap(CampaignEx campaignEx) {
        List<CampaignEx.c.a> listD;
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        ConcurrentHashMap<String, Boolean> concurrentHashMap2;
        if (campaignEx != null) {
            String videoUrlEncode = campaignEx.getVideoUrlEncode();
            if (!TextUtils.isEmpty(videoUrlEncode) && (concurrentHashMap2 = this.recordVideoMap) != null && !concurrentHashMap2.containsKey(videoUrlEncode)) {
                this.recordVideoMap.put(videoUrlEncode, Boolean.FALSE);
            }
            String str = campaignEx.getendcard_url();
            if (!TextUtils.isEmpty(str) && (concurrentHashMap = this.recordZipMap) != null && !concurrentHashMap.containsKey(str)) {
                this.recordZipMap.put(str, Boolean.FALSE);
            }
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode == null || (listD = rewardTemplateMode.d()) == null) {
                return;
            }
            for (CampaignEx.c.a aVar : listD) {
                if (aVar != null) {
                    addImageUrlToMap(aVar.f33541a);
                }
            }
        }
    }

    private boolean checkImageUrlState(boolean z10, String str) {
        boolean zCheckState = checkState(recordImageMap, str);
        if (zCheckState || b.a(c.n().d()).c(str)) {
            return true;
        }
        return zCheckState;
    }

    private boolean checkState(ConcurrentHashMap<String, Boolean> concurrentHashMap, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (concurrentHashMap == null) {
            new ConcurrentHashMap().put(str, Boolean.FALSE);
            return false;
        }
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).booleanValue();
        }
        concurrentHashMap.put(str, Boolean.FALSE);
        return false;
    }

    private boolean checkZipState(boolean z10, String str) {
        boolean zCheckState = checkState(this.recordZipMap, str);
        if (zCheckState || !z10 || TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))) {
            return zCheckState;
        }
        this.recordZipMap.put(str, Boolean.TRUE);
        return true;
    }

    public static ResDownloadCheckManager getInstance() {
        return Holder.instance;
    }

    private boolean getIsEffectivePath(String str) {
        String strD = o0.d(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC));
        File file = new File(defpackage.e.q(File.separator, strD, sb2));
        try {
            return file.exists() && file.isFile() && file.canRead();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private void updateCampaignState(String str, boolean z10) {
        if (this.campaignStateMap == null) {
            this.campaignStateMap = new ConcurrentHashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.campaignStateMap.put(str, Boolean.valueOf(z10));
    }

    public boolean checkImageState(boolean z10, CampaignEx.c cVar) {
        List<CampaignEx.c.a> listD;
        List<String> list;
        if (cVar != null && (listD = cVar.d()) != null) {
            for (CampaignEx.c.a aVar : listD) {
                if (aVar != null && (list = aVar.f33541a) != null) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        if (!checkImageUrlState(z10, it.next())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean checkPreLoadState(String str) {
        if (!TextUtils.isEmpty(str) && this.preLoadSuccessedMap.containsKey(str)) {
            return this.preLoadSuccessedMap.get(str).booleanValue();
        }
        return false;
    }

    public boolean containsVideoKey(String str) {
        if (this.recordVideoMap == null || TextUtils.isEmpty(str) || !this.recordVideoMap.containsKey(str)) {
            return false;
        }
        return this.recordVideoMap.get(str).booleanValue();
    }

    public boolean containsZipKey(String str) {
        if (this.recordZipMap == null || TextUtils.isEmpty(str) || !this.recordZipMap.containsKey(str)) {
            return false;
        }
        return this.recordZipMap.get(str).booleanValue();
    }

    public void removePreLoadState(String str) {
        if (this.preLoadSuccessedMap.containsKey(str)) {
            this.preLoadSuccessedMap.remove(str);
        }
    }

    public void setCampaignList(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return;
        }
        for (CampaignEx campaignEx : copyOnWriteArrayList) {
            if (campaignEx != null) {
                addUrlToMap(campaignEx);
                updateCampaignState(campaignEx.getId(), false);
            }
        }
    }

    public void setImageDownloadDone(String str, boolean z10) {
        if (recordImageMap == null) {
            recordImageMap = new ConcurrentHashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        recordImageMap.put(str, Boolean.valueOf(z10));
    }

    public void setTemplatePreLoadDone(String str, boolean z10) {
        if (this.preLoadSuccessedMap == null) {
            this.preLoadSuccessedMap = new ConcurrentHashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.preLoadSuccessedMap.put(str, Boolean.valueOf(z10));
    }

    public void setVideoDownloadDone(String str, boolean z10) {
        if (this.recordVideoMap == null) {
            this.recordVideoMap = new ConcurrentHashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.recordVideoMap.put(str, Boolean.valueOf(z10));
    }

    public void setZipDownloadDone(String str, boolean z10) {
        if (this.recordZipMap == null) {
            this.recordZipMap = new ConcurrentHashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.recordZipMap.put(str, Boolean.valueOf(z10));
    }

    private ResDownloadCheckManager() {
        this.campaignStateMap = new ConcurrentHashMap<>();
        this.preLoadSuccessedMap = new ConcurrentHashMap<>();
        this.recordVideoMap = new ConcurrentHashMap<>();
        this.recordZipMap = new ConcurrentHashMap<>();
    }

    public void setCampaignList(CampaignEx campaignEx) {
        if (campaignEx != null) {
            addUrlToMap(campaignEx);
            updateCampaignState(campaignEx.getId(), false);
        }
    }
}
