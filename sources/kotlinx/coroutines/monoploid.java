package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/impassible;", "Lkotlinx/coroutines/formularize;", "handler", "", "dern", "(Lkotlinx/coroutines/impassible;Lkotlinx/coroutines/formularize;)V", "Lwretchedly/dern;", "delegate", "Lkotlinx/coroutines/kowloon;", "saneness", "(Lwretchedly/dern;)Lkotlinx/coroutines/kowloon;", "Lkotlinx/coroutines/milliradian;", "handle", "attabal", "(Lkotlinx/coroutines/impassible;Lkotlinx/coroutines/milliradian;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class monoploid {
    public static final void attabal(impassible<?> impassibleVar, milliradian milliradianVar) {
        dern(impassibleVar, new treadless(milliradianVar));
    }

    public static final <T> void dern(impassible<? super T> impassibleVar, formularize formularizeVar) {
        if (!(impassibleVar instanceof kowloon)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((kowloon) impassibleVar).merc(formularizeVar);
    }

    public static final <T> kowloon<T> saneness(wretchedly.dern<? super T> dernVar) {
        if (!(dernVar instanceof pigboat.competently)) {
            return new kowloon<>(dernVar, 1);
        }
        kowloon<T> kowloonVarKowloon = ((pigboat.competently) dernVar).kowloon();
        if (kowloonVarKowloon != null) {
            if (!kowloonVarKowloon.creditor()) {
                kowloonVarKowloon = null;
            }
            if (kowloonVarKowloon != null) {
                return kowloonVarKowloon;
            }
        }
        return new kowloon<>(dernVar, 2);
    }
}
