package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonStreams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcutwater/attabal;", "json", "Lkotlinx/serialization/json/internal/gintrap;", "writer", "Lasosan/impassible;", "serializer", "value", "", "attabal", "(Lcutwater/attabal;Lkotlinx/serialization/json/internal/gintrap;Lasosan/impassible;Ljava/lang/Object;)V", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class yemenite {
    public static final <T> void attabal(cutwater.attabal json, gintrap writer, asosan.impassible<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new creditor(writer, json, WriteMode.OBJ, new cutwater.molybdenite[WriteMode.getEntries().size()]).preprohormone(serializer, t);
    }
}
