package truantry;

import java.util.Locale;
import java.util.TimeZone;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SystemLocaleInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Ltruantry/saneness;", "Ltruantry/attabal;", "<init>", "()V", "", "getTimeZoneId", "()Ljava/lang/String;", "timeZoneId", "getLanguage", "language", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class saneness implements attabal {
    @Override // truantry.attabal
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        return language;
    }

    @Override // truantry.attabal
    public String getTimeZoneId() {
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "getDefault().id");
        return id;
    }
}
