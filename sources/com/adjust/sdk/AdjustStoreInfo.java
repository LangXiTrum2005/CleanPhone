package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustStoreInfo {
    private static final ILogger logger = AdjustFactory.getLogger();
    String storeAppId;
    String storeName;

    public AdjustStoreInfo(String str) {
        if (isValidStore(str)) {
            this.storeName = str;
        }
    }

    private boolean isValidStore(String str) {
        if (str == null) {
            logger.error("Missing store name", new Object[0]);
            return false;
        }
        if (!str.isEmpty()) {
            return true;
        }
        logger.error("Store name can't be empty", new Object[0]);
        return false;
    }

    public void setStoreAppId(String str) {
        this.storeAppId = str;
    }
}
