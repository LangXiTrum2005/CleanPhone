package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.Result;

/* JADX INFO: compiled from: DebugStrings.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lwretchedly/dern;", "", "dern", "(Lwretchedly/dern;)Ljava/lang/String;", "", "saneness", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "attabal", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class creditor {
    public static final String attabal(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String dern(wretchedly.dern<?> dernVar) {
        Object objM3351constructorimpl;
        if (dernVar instanceof pigboat.competently) {
            return ((pigboat.competently) dernVar).toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(dernVar + '@' + saneness(dernVar));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        if (Result.m3354exceptionOrNullimpl(objM3351constructorimpl) != null) {
            objM3351constructorimpl = dernVar.getClass().getName() + '@' + saneness(dernVar);
        }
        return (String) objM3351constructorimpl;
    }

    public static final String saneness(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }
}
