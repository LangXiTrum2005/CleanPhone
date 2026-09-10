package cutwater;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0005\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcutwater/oilcan;", "", X3.i.W, "", "value", "Lcutwater/impromptu;", "attabal", "(Lcutwater/oilcan;Ljava/lang/String;Ljava/lang/Boolean;)Lcutwater/impromptu;", "", "saneness", "(Lcutwater/oilcan;Ljava/lang/String;Ljava/lang/Number;)Lcutwater/impromptu;", "dern", "(Lcutwater/oilcan;Ljava/lang/String;Ljava/lang/String;)Lcutwater/impromptu;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class taiyuan {
    public static final impromptu attabal(oilcan oilcanVar, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return oilcanVar.saneness(key, cutely.attabal(bool));
    }

    public static final impromptu dern(oilcan oilcanVar, String key, String str) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return oilcanVar.saneness(key, cutely.dern(str));
    }

    public static final impromptu saneness(oilcan oilcanVar, String key, Number number) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return oilcanVar.saneness(key, cutely.saneness(number));
    }
}
