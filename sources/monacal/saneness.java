package monacal;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: AdvertisingInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmonacal/saneness;", "", "<init>", "()V", "", "advertisingId", "Ljava/lang/String;", "getAdvertisingId", "()Ljava/lang/String;", "setAdvertisingId", "(Ljava/lang/String;)V", "", "limitAdTracking", "Z", "getLimitAdTracking", "()Z", "setLimitAdTracking", "(Z)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class saneness {
    private String advertisingId;
    private boolean limitAdTracking;

    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    public final boolean getLimitAdTracking() {
        return this.limitAdTracking;
    }

    public final void setAdvertisingId(String str) {
        this.advertisingId = str;
    }

    public final void setLimitAdTracking(boolean z) {
        this.limitAdTracking = z;
    }
}
