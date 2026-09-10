package inrooted;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateWriter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "attabal", "(Ljava/util/Collection;)Ljava/util/ArrayList;", "savedstate"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateWriterKt")
public final /* synthetic */ class formularize {
    public static final <T> ArrayList<T> attabal(Collection<?> collection2) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        return collection2 instanceof ArrayList ? (ArrayList) collection2 : new ArrayList<>(collection2);
    }
}
