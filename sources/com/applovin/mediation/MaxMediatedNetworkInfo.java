package com.applovin.mediation;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface MaxMediatedNetworkInfo {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10335a;

        InitializationStatus(int i10) {
            this.f10335a = i10;
        }

        public static InitializationStatus fromCode(int i10) {
            for (InitializationStatus initializationStatus : values()) {
                if (initializationStatus.getCode() == i10) {
                    return initializationStatus;
                }
            }
            return NOT_INITIALIZED;
        }

        public int getCode() {
            return this.f10335a;
        }
    }

    String getAdapterClassName();

    String getAdapterVersion();

    InitializationStatus getInitializationStatus();

    String getName();

    String getSdkVersion();
}
