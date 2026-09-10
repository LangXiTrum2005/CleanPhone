package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: svd.beachfront, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lsvd/beachfront;", "", "", "attabal", "Ljava/lang/Boolean;", "isDefaultBrowserCustomTabsCapable", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class BrowserSignals {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_browser_custom_tabs_capable")
    public Boolean isDefaultBrowserCustomTabsCapable;

    public BrowserSignals() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrowserSignals) && Intrinsics.wireman(this.isDefaultBrowserCustomTabsCapable, ((BrowserSignals) obj).isDefaultBrowserCustomTabsCapable);
    }

    public final int hashCode() {
        Boolean bool = this.isDefaultBrowserCustomTabsCapable;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "BrowserSignals(isDefaultBrowserCustomTabsCapable=" + this.isDefaultBrowserCustomTabsCapable + ")";
    }

    public BrowserSignals(Boolean bool) {
        this.isDefaultBrowserCustomTabsCapable = bool;
    }

    public /* synthetic */ BrowserSignals(int i) {
        this((Boolean) null);
    }
}
