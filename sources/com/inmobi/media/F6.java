package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.F6[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.F6[]) from 0x006f: INVOKE (r0v1 com.inmobi.media.F6[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:112)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class F6 {
    LPClickStart("clickStartCalled", "sdk_click_detected", 0),
    LPStartFailed("landingsStartFailed", "valid_click_failed", 1),
    LPStartSuccess("landingsStartSuccess", "browser_open_success", 2),
    LPBrowserOpenFailed("browserOpenFailed", "browser_open_failed", 2),
    LPPageStart("landingsPageStarted", "on_page_started", 3),
    LPCompleteSuccess("landingsCompleteSuccess", "landing_success", 4),
    LPCompleteFailed("landingsCompleteFailed", "landing_failed", 4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22816c;

    static {
        EnumEntriesKt.a(f6Arr);
    }

    public F6(String str, String str2, int i2) {
        super(str, i);
        this.f22814a = str;
        this.f22815b = str2;
        this.f22816c = i2;
    }

    public static F6 valueOf(String str) {
        return (F6) Enum.valueOf(F6.class, str);
    }

    public static F6[] values() {
        return (F6[]) k.clone();
    }
}
